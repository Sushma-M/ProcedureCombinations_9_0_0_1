/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testingprocedurecombinations.classicmodels;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * Mytable2 generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`mytable2`")
@IdClass(Mytable2Id.class)
public class Mytable2 implements Serializable {

    private Integer col1;
    private Integer id;
    private String col2;

    @Id
    @Column(name = "`col1`", nullable = false, scale = 0, precision = 10)
    public Integer getCol1() {
        return this.col1;
    }

    public void setCol1(Integer col1) {
        this.col1 = col1;
    }

    @Id
    @Column(name = "`ID`", nullable = false, scale = 0, precision = 10)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "`col2`", nullable = true, length = 20)
    public String getCol2() {
        return this.col2;
    }

    public void setCol2(String col2) {
        this.col2 = col2;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mytable2)) return false;
        final Mytable2 mytable2 = (Mytable2) o;
        return Objects.equals(getCol1(), mytable2.getCol1()) &&
                Objects.equals(getId(), mytable2.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCol1(),
                getId());
    }
}

