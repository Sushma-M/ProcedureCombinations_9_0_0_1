/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testingprocedurecombinations.classicmodels;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

/**
 * Productlines generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`productlines`")
public class Productlines implements Serializable {

    private String productLine;
    private String textDescriptio;
    private String htmlDescription;
    @JsonProperty(access = Access.READ_ONLY)
    private byte[] image;
    private String textDescription;
    private List<Products> productses = new ArrayList<>();

    @Id
    @Column(name = "`productLine`", nullable = false, length = 50)
    public String getProductLine() {
        return this.productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    @Column(name = "`textDescriptio`", nullable = true, length = 4000)
    public String getTextDescriptio() {
        return this.textDescriptio;
    }

    public void setTextDescriptio(String textDescriptio) {
        this.textDescriptio = textDescriptio;
    }

    @Column(name = "`htmlDescription`", nullable = true, length = 16777215)
    public String getHtmlDescription() {
        return this.htmlDescription;
    }

    public void setHtmlDescription(String htmlDescription) {
        this.htmlDescription = htmlDescription;
    }

    @Column(name = "`image`", nullable = true)
    public byte[] getImage() {
        return this.image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Column(name = "`textDescription`", nullable = true, length = 4000)
    public String getTextDescription() {
        return this.textDescription;
    }

    public void setTextDescription(String textDescription) {
        this.textDescription = textDescription;
    }

    
    public List<Products> getProductses() {
        return this.productses;
    }

    public void setProductses(List<Products> productses) {
        this.productses = productses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Productlines)) return false;
        final Productlines productlines = (Productlines) o;
        return Objects.equals(getProductLine(), productlines.getProductLine());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductLine());
    }
}

