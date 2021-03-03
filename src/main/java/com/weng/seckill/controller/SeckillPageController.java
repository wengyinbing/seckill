package com.weng.seckill.controller;

import com.weng.seckill.common.exception.RrException;
import com.weng.seckill.common.response.Result;
import com.weng.seckill.generator.model.Seckill;
import com.weng.seckill.mapper.SeckillMapper;
import com.weng.seckill.service.ISeckillService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/seckillPage")
public class SeckillPageController {

    private final static Logger logger = LoggerFactory.getLogger(SeckillPageController.class);

    @Autowired
    private ISeckillService seckillService;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        //logger.info("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!initBinder");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }


    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String hello(){
        logger.info("helloController.hello");
        return "hello,wengyinbing!";
    }
    
    /*@PostMapping(value="/index")
    public String redirect(){
        logger.info("redirect!!!!!!");
        return "redirect:/index.html";
    }*/

    @PostMapping("/list")
    public Result list(){
        //http://localhost:8080/seckill/seckillPage/list
        //logger.info("list!!!!!!!!!!!!!!!");
        List<Seckill> List = seckillService.getSeckillList();

        return Result.ok(List);
    }

    @ApiOperation("查找")
    @GetMapping("/listbyname")
    public Result listByName(String name){
        //http://localhost:8080/seckill/seckillPage/list

        List<Seckill> List = seckillService.getSecKillByName("%"+name+"%");
        logger.info("listByName!!!!!!!!!!!!!!!{}",List.get(0).getEndTime());
        return Result.ok(List);
    }

    @ApiOperation("delete")
    @PostMapping("/deletebyid")
    public Result deleteById(Long id){
        int result = seckillService.deleteSeckillById(id);
        if(result == -1){return Result.error("error");}
        return Result.ok();
    }


    @ApiOperation("查找")
    @PostMapping("/findbyid")
    public Result seckillById(Long id){
        return Result.ok(seckillService.getSeckkillById(id));
    }

    @ApiOperation("添加")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Result createSeckill(@RequestBody Seckill s){
        logger.info("createseckill!!!!!!!!!!!{}",s.getSeckillId());
        s.setCreateTime(new Date());
        s.setVersion(0);
        if(s.getSeckillId()==null){
        seckillService.createSecKill(s);}///????
        else{
        //seckillService.deleteSeckillById(s.getSeckillId());
        seckillService.update(s);
        }
        return Result.ok();
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Result updateSeckill(@PathVariable Long id, @RequestBody Seckill s){
        s.setSeckillId(id);
        seckillService.update(s);
        return Result.ok();
    }
    @RequestMapping(value={"/error","/error1"},method = RequestMethod.GET)
    public void test(){
        logger.info("test!!!!!!!!");
        throw new RrException("test error!",505);
    }
}
