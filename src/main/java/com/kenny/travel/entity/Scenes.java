package com.kenny.travel.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "scenes")
public class Scenes implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    //景点名
    @Column
    private String scenesName;

    //图片路径
    @Column
    private String imgUrl;

    //介绍
    @Column
    private String introduce;

    //用时参考
    @Column
    private String timeGuideline;

    //交通
    @Column
    private String traffic;

    @Column
    private String openTime;

    @Column(name = "create_time")
    @CreatedDate
    private Date createTime;

    @Column(name = "update_time")
    @LastModifiedDate
    private Date updateTime;
}
