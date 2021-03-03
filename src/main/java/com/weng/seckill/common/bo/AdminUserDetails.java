package com.weng.seckill.common.bo;

import com.weng.seckill.model.UmsAdmin;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

public class AdminUserDetails implements UserDetails {
    private UmsAdmin umsAdmin;
    public AdminUserDetails(UmsAdmin umsAdmin){//, List<UmsResource> resourceList) {
        this.umsAdmin = umsAdmin;
        //this.resourceList = resourceList;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return umsAdmin.getPassword();
    }

    @Override
    public String getUsername() {
        return umsAdmin.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return umsAdmin.getStatus().equals(1);
    }
}
