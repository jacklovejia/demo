package com.jack.bean;

public class Admin {
    private Integer id;

    private String adminname;

    private String password;

    private String relaname;

    private String email;

    private String addtime;

    private String lastlogintime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname == null ? null : adminname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getRelaname() {
        return relaname;
    }

    public void setRelaname(String relaname) {
        this.relaname = relaname == null ? null : relaname.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime == null ? null : addtime.trim();
    }

    public String getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(String lastlogintime) {
        this.lastlogintime = lastlogintime == null ? null : lastlogintime.trim();
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", adminname='" + adminname + '\'' +
                ", password='" + password + '\'' +
                ", relaname='" + relaname + '\'' +
                ", email='" + email + '\'' +
                ", addtime='" + addtime + '\'' +
                ", lastlogintime='" + lastlogintime + '\'' +
                '}';
    }
}