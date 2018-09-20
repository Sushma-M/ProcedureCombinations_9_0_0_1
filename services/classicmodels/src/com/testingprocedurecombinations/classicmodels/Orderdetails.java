/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testingprocedurecombinations.classicmodels;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Orderdetails generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`orderdetails`")
@IdClass(OrderdetailsId.class)
public class Orderdetails implements Serializable {

    private Integer orderNumber;
    private String productCode;
    private int quantityOrdered;
    private BigDecimal priceEach;
    private short orderLineNumber;
    private Orders orders;
    private Products products;

    @Id
    @Column(name = "`orderNumber`", nullable = false, scale = 0, precision = 10)
    public Integer getOrderNumber() {
        return this.orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Id
    @Column(name = "`productCode`", nullable = false, length = 15)
    public String getProductCode() {
        return this.productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    @Column(name = "`quantityOrdered`", nullable = false, scale = 0, precision = 10)
    public int getQuantityOrdered() {
        return this.quantityOrdered;
    }

    public void setQuantityOrdered(int quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

    @Column(name = "`priceEach`", nullable = false, scale = 9, precision = 22)
    public BigDecimal getPriceEach() {
        return this.priceEach;
    }

    public void setPriceEach(BigDecimal priceEach) {
        this.priceEach = priceEach;
    }

    @Column(name = "`orderLineNumber`", nullable = false, scale = 0, precision = 5)
    public short getOrderLineNumber() {
        return this.orderLineNumber;
    }

    public void setOrderLineNumber(short orderLineNumber) {
        this.orderLineNumber = orderLineNumber;
    }

    
    
    public Orders getOrders() {
        return this.orders;
    }

    public void setOrders(Orders orders) {
        if(orders != null) {
            this.orderNumber = orders.getOrderNumber();
        }

        this.orders = orders;
    }

    
    
    public Products getProducts() {
        return this.products;
    }

    public void setProducts(Products products) {
        if(products != null) {
            this.productCode = products.getProductCode();
        }

        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Orderdetails)) return false;
        final Orderdetails orderdetails = (Orderdetails) o;
        return Objects.equals(getOrderNumber(), orderdetails.getOrderNumber()) &&
                Objects.equals(getProductCode(), orderdetails.getProductCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrderNumber(),
                getProductCode());
    }
}

