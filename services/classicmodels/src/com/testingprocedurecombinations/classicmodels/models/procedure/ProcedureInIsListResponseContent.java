/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testingprocedurecombinations.classicmodels.models.procedure;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class ProcedureInIsListResponseContent implements Serializable {


    @JsonProperty("customerNumber")
    @ColumnAlias("customerNumber")
    private Integer customerNumber;

    @JsonProperty("customerName")
    @ColumnAlias("customerName")
    private String customerName;

    @JsonProperty("contactLastName")
    @ColumnAlias("contactLastName")
    private String contactLastName;

    @JsonProperty("contactFirstName")
    @ColumnAlias("contactFirstName")
    private String contactFirstName;

    @JsonProperty("phone")
    @ColumnAlias("phone")
    private String phone;

    @JsonProperty("addressLine1")
    @ColumnAlias("addressLine1")
    private String addressLine1;

    @JsonProperty("addressLine2")
    @ColumnAlias("addressLine2")
    private String addressLine2;

    @JsonProperty("city")
    @ColumnAlias("city")
    private String city;

    @JsonProperty("state")
    @ColumnAlias("state")
    private String state;

    @JsonProperty("postalCode")
    @ColumnAlias("postalCode")
    private String postalCode;

    @JsonProperty("country")
    @ColumnAlias("country")
    private String country;

    @JsonProperty("salesRepEmployeeNumber")
    @ColumnAlias("salesRepEmployeeNumber")
    private Integer salesRepEmployeeNumber;

    @JsonProperty("creditLimit")
    @ColumnAlias("creditLimit")
    private Double creditLimit;

    public Integer getCustomerNumber() {
        return this.customerNumber;
    }

    public void setCustomerNumber(Integer customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getContactLastName() {
        return this.contactLastName;
    }

    public void setContactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
    }

    public String getContactFirstName() {
        return this.contactFirstName;
    }

    public void setContactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddressLine1() {
        return this.addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return this.addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getSalesRepEmployeeNumber() {
        return this.salesRepEmployeeNumber;
    }

    public void setSalesRepEmployeeNumber(Integer salesRepEmployeeNumber) {
        this.salesRepEmployeeNumber = salesRepEmployeeNumber;
    }

    public Double getCreditLimit() {
        return this.creditLimit;
    }

    public void setCreditLimit(Double creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProcedureInIsListResponseContent)) return false;
        final ProcedureInIsListResponseContent procedureInIsListResponseContent = (ProcedureInIsListResponseContent) o;
        return Objects.equals(getCustomerNumber(), procedureInIsListResponseContent.getCustomerNumber()) &&
                Objects.equals(getCustomerName(), procedureInIsListResponseContent.getCustomerName()) &&
                Objects.equals(getContactLastName(), procedureInIsListResponseContent.getContactLastName()) &&
                Objects.equals(getContactFirstName(), procedureInIsListResponseContent.getContactFirstName()) &&
                Objects.equals(getPhone(), procedureInIsListResponseContent.getPhone()) &&
                Objects.equals(getAddressLine1(), procedureInIsListResponseContent.getAddressLine1()) &&
                Objects.equals(getAddressLine2(), procedureInIsListResponseContent.getAddressLine2()) &&
                Objects.equals(getCity(), procedureInIsListResponseContent.getCity()) &&
                Objects.equals(getState(), procedureInIsListResponseContent.getState()) &&
                Objects.equals(getPostalCode(), procedureInIsListResponseContent.getPostalCode()) &&
                Objects.equals(getCountry(), procedureInIsListResponseContent.getCountry()) &&
                Objects.equals(getSalesRepEmployeeNumber(), procedureInIsListResponseContent.getSalesRepEmployeeNumber()) &&
                Objects.equals(getCreditLimit(), procedureInIsListResponseContent.getCreditLimit());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCustomerNumber(),
                getCustomerName(),
                getContactLastName(),
                getContactFirstName(),
                getPhone(),
                getAddressLine1(),
                getAddressLine2(),
                getCity(),
                getState(),
                getPostalCode(),
                getCountry(),
                getSalesRepEmployeeNumber(),
                getCreditLimit());
    }
}