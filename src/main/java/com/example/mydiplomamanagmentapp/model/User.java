package com.example.mydiplomamanagmentapp.model;
import com.sun.istack.NotNull;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;

@Setter
@ToString(callSuper = true)
@Entity
@Table(name = "USER")
public class User extends BaseId implements UserDetails {


    //private String userClass;
    @Column(length= 15, nullable = false, unique = true)
    @NotNull
    private String username;
    @Column(length= 15, nullable = false)
    private String password;

    @JoinColumn(name = "role")
    private Role role;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
      SimpleGrantedAuthority authorities = new SimpleGrantedAuthority(role.name());
      return Collections.singletonList(authorities);
    }
    /*public String getUserClass(){
        return userClass;
    }*/


    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    public Role getRole(){
        return role;
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
