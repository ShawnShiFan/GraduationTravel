package com.kenny.travel.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "hotel")
public class Hotel implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    //酒店名
    @Column
    private String hotelName;

    //酒店类型 独立房间/整套房子/公寓
    @Column
    private String hotelType;

    //住客数
    @Column
    private String lodgerNum;

    //房间数
    @Column
    private String roomNum;

    //床数
    @Column
    private String bedNum;

    //地址
    @Column
    private String address;

    //酒店介绍
    @Column
    private String introduce;


    @Column(name = "create_time")
    @CreatedDate
    private Date createTime;

    @Column(name = "update_time")
    @LastModifiedDate
    private Date updateTime;
}
