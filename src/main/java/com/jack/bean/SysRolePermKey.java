package com.jack.bean;

public class SysRolePermKey {
    private String roleId;

    private String permVal;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getPermVal() {
        return permVal;
    }

    public void setPermVal(String permVal) {
        this.permVal = permVal == null ? null : permVal.trim();
    }
}