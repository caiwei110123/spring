package com.lc.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by liuch on 2018/7/31.
 */
@Entity
@Table(name = "sys_user")
public class SysUser implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;
    @Column
    private String password;
    @ManyToMany
    @JoinTable(name = "sys_role_user", joinColumns = {@JoinColumn(name = "sys_user_id")}, inverseJoinColumns = {@JoinColumn(name = "sys_role_id")})
    private List<SysRole> roles;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<SysRole> getRoles() {
        return roles;
    }

    public void setRoles(List<SysRole> roles) {
        this.roles = roles;
    }
}
