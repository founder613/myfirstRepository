package com.powernode.sh2004.bean;

import org.springframework.beans.factory.annotation.Autowired;

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

public class Order {
    private String oid;
    private String otime;
    @Autowired
    private  User user;
    @Autowired
    private Train train;

    @Override
    public String toString() {
        return "Order{" +
                "oid='" + oid + '\'' +
                ", otime='" + otime + '\'' +
                ", user=" + user +
                ", train=" + train +
                '}';
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getOtime() {
        return otime;
    }

    public void setOtime(String otime) {
        this.otime = otime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
