package com.jzp.model;

import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Hongyi Zheng
 * @date 2018/12/20
 */
@Table(name = "steam_api")
public class SteamApi implements Serializable {

    private static final long serialVersionUID = 9185993724297079062L;
    private int oid;
    private String name;
    private Date iTime;
    private Date uTime;
    private String isDel;
    private String methods;

    @Override
    public String toString() {
        return "SteamApi{" +
                "oid=" + oid +
                ", name='" + name + '\'' +
                ", iTime=" + iTime +
                ", uTime=" + uTime +
                ", isDel='" + isDel + '\'' +
                ", methods='" + methods + '\'' +
                '}';
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getiTime() {
        return iTime;
    }

    public void setiTime(Date iTime) {
        this.iTime = iTime;
    }

    public Date getuTime() {
        return uTime;
    }

    public void setuTime(Date uTime) {
        this.uTime = uTime;
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel;
    }

    public String getMethods() {
        return methods;
    }

    public void setMethods(String methods) {
        this.methods = methods;
    }
}
