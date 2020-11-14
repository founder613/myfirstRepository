package com.powernode.sh2004.bean;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

/**
 * @ProjectName: TicketSystem
 * @Package: com.powernode.sh2004.bean
 * @Description: java类作用描述
 * @Author: 吴洋
 * @CreateDate: 2020/11/13 20:01
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */

public class Train {
    private String tid;
    private String tnumber;
    private String taddress;
    private String ttime;
    private String ttype;
    @Autowired
    private User[] users;

    @Override
    public String toString() {
        return "Train{" +
                "tid='" + tid + '\'' +
                ", tnumber='" + tnumber + '\'' +
                ", taddress='" + taddress + '\'' +
                ", ttime='" + ttime + '\'' +
                ", ttype='" + ttype + '\'' +
                ", users=" + Arrays.toString(users) +
                '}';
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTnumber() {
        return tnumber;
    }

    public void setTnumber(String tnumber) {
        this.tnumber = tnumber;
    }

    public String getTaddress() {
        return taddress;
    }

    public void setTaddress(String taddress) {
        this.taddress = taddress;
    }

    public String getTtime() {
        return ttime;
    }

    public void setTtime(String ttime) {
        this.ttime = ttime;
    }

    public String getTtype() {
        return ttype;
    }

    public void setTtype(String ttype) {
        this.ttype = ttype;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }
}
