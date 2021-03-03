package com.weng.seckill.controller;



import com.weng.seckill.common.response.Result;
import com.weng.seckill.model.UmsAdmin;
import com.weng.seckill.service.UmsAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Api(tags = "AdminController", description = "登陆管理")
@RequestMapping("/admin")
@RestController
public class AdminController {
    private  final static Logger logger = LoggerFactory.getLogger(AdminController.class);

    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;


    @Autowired
    private UmsAdminService adminservice;

    @ApiOperation("登录以后返回token")
    @PostMapping("/login")
    public Result login(@Validated @RequestBody UmsAdmin admin){
        logger.info("!!!!!!!!!!!!!!!!!!!!!admin{}",admin);
        String token = adminservice.login(admin.getUsername(), admin.getPassword());
        if(token==null){
            return Result.error("用户名或密码错误!");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        logger.info("tokenMap::{}",tokenMap);
        return Result.ok(tokenMap);
    }

    @ApiOperation("获取验证码")
    @RequestMapping(value = "/getAuthCode", method = RequestMethod.GET)
    @ResponseBody
    public Result getAuthCode(@RequestParam String telephone) {
        return adminservice.generateAuthCode(telephone);
    }

    @ApiOperation("判断验证码是否正确")
    @RequestMapping(value = "/verifyAuthCode", method = RequestMethod.POST)
    @ResponseBody
    public Result updatePassword(@RequestParam String telephone,
                                       @RequestParam String authCode) {
        return adminservice.verifyAuthCode(telephone,authCode);
    }
}
