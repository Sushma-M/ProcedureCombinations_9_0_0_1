/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testingprocedurecombinations.classicmodels;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

public class MytableId implements Serializable {

    private Integer columnA;
    private Integer columnB;

    public Integer getColumnA() {
        return this.columnA;
    }

    public void setColumnA(Integer columnA) {
        this.columnA = columnA;
    }

    public Integer getColumnB() {
        return this.columnB;
    }

    public void setColumnB(Integer columnB) {
        this.columnB = columnB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mytable)) return false;
        final Mytable mytable = (Mytable) o;
        return Objects.equals(getColumnA(), mytable.getColumnA()) &&
                Objects.equals(getColumnB(), mytable.getColumnB());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColumnA(),
                getColumnB());
    }
}
