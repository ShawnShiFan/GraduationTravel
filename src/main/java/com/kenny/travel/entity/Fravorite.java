package com.kenny.travel.entity;


import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "fravorite")
public class Fravorite implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    //用户id
    @Column
    private String userId;

    //被收藏的id
    @Column
    private String fravoriteId;

    //收藏类型 1:景点 2:线路 3:游记 4:酒店
    @Column
    private String type;


    @Column(name = "create_time")
    @CreatedDate
    private Date createTime;

    @Column(name = "update_time")
    @LastModifiedDate
    private Date updateTime;
}
