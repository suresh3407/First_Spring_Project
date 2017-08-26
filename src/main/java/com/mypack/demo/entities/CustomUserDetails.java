/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mypack.demo.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 *
 * @author suresh
 */
public class CustomUserDetails implements UserDetails{
    private String username;
    private String password;
    Collection<? extends GrantedAuthority> authorities;
public CustomUserDetails(User user){
    this.username=user.getUsername();
    this.password=user.getPassword();
    List<GrantedAuthority> auths=new ArrayList<>();
        for(Role role: user.getRoles()){
            auths.add(new SimpleGrantedAuthority(role.getName().toUpperCase()));
        }
        this.authorities=auths;
}
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
return password;
    }

    @Override
    public String getUsername() {
        return username;
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
       return true;
    }
    
}
