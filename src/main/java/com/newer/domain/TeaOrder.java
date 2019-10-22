package com.newer.domain;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

public class TeaOrder implements Serializable {
    private Integer tid;
    private String detail;
    private Integer num;
    private Integer price;
    private Timestamp ordertime;

    public Timestamp getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Timestamp ordertime) {
        this.ordertime = ordertime;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "TeaOrder{" +
                "tid=" + tid +
                ", detail='" + detail + '\'' +
                ", num=" + num +
                ", price=" + price +
                ", ordertime=" + ordertime +
                '}';
    }
}
