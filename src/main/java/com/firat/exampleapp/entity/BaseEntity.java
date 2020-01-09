package com.firat.exampleapp.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@MappedSuperclass
public abstract class BaseEntity implements Serializable { //buradaki propertyleri tüm entitylerimde görmek istiyorsam baseEntity oluştururum

    @Temporal(TemporalType.TIMESTAMP)
    @Column
    private Date createdAt;

    @Column
    private String createdBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column
    private Date updateAt;

    @Column
    private Boolean status;

}
