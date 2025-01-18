package com.wellsfargo.counselor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Advisor {
    @Id
    @GeneratedValue
    private Integer fid;
    private String name;
    private String email;
    private Integer phone;
    private String password;

    @OneToMany(mappedBy = "advisor")
    private List<Client> clients;

    public Advisor(Integer fid, String name, String email, Integer phone, String password) {
        this.fid = fid;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
