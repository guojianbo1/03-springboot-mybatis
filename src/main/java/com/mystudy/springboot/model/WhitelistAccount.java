package com.mystudy.springboot.model;

public class WhitelistAccount {
    private Integer id;

    private Integer userid;

    private Integer appuserid;

    private Integer pfgameid;

    private Integer platformid;

    private String account;

    private Integer createTime;

    private Integer updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getAppuserid() {
        return appuserid;
    }

    public void setAppuserid(Integer appuserid) {
        this.appuserid = appuserid;
    }

    public Integer getPfgameid() {
        return pfgameid;
    }

    public void setPfgameid(Integer pfgameid) {
        this.pfgameid = pfgameid;
    }

    public Integer getPlatformid() {
        return platformid;
    }

    public void setPlatformid(Integer platformid) {
        this.platformid = platformid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }
}