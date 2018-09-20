/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testingprocedurecombinations.classicmodelsdb;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

public class PaymentsId implements Serializable {

    private String checkNumber;
    private Integer customerNumber;

    public String getCheckNumber() {
        return this.checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    public Integer getCustomerNumber() {
        return this.customerNumber;
    }

    public void setCustomerNumber(Integer customerNumber) {
        this.customerNumber = customerNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Payments)) return false;
        final Payments payments = (Payments) o;
        return Objects.equals(getCheckNumber(), payments.getCheckNumber()) &&
                Objects.equals(getCustomerNumber(), payments.getCustomerNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCheckNumber(),
                getCustomerNumber());
    }
}
