/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testingprocedurecombinations.classicmodels.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.wavemaker.runtime.data.dao.WMGenericDao;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.testingprocedurecombinations.classicmodels.Productlines;
import com.testingprocedurecombinations.classicmodels.Products;


/**
 * ServiceImpl object for domain model class Productlines.
 *
 * @see Productlines
 */
@Service("classicmodels.ProductlinesService")
@Validated
public class ProductlinesServiceImpl implements ProductlinesService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductlinesServiceImpl.class);

    @Lazy
    @Autowired
	@Qualifier("classicmodels.ProductsService")
	private ProductsService productsService;

    @Autowired
    @Qualifier("classicmodels.ProductlinesDao")
    private WMGenericDao<Productlines, String> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<Productlines, String> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
	public Productlines create(Productlines productlines) {
        LOGGER.debug("Creating a new Productlines with information: {}", productlines);
        Productlines productlinesCreated = this.wmGenericDao.create(productlines);
        if(productlinesCreated.getProductses() != null) {
            for(Products productse : productlinesCreated.getProductses()) {
                productse.setProductlines(productlinesCreated);
                LOGGER.debug("Creating a new child Products with information: {}", productse);
                productsService.create(productse);
            }
        }
        return productlinesCreated;
    }

	@Transactional(readOnly = true, value = "classicmodelsTransactionManager")
	@Override
	public Productlines getById(String productlinesId) throws EntityNotFoundException {
        LOGGER.debug("Finding Productlines by id: {}", productlinesId);
        Productlines productlines = this.wmGenericDao.findById(productlinesId);
        if (productlines == null){
            LOGGER.debug("No Productlines found with id: {}", productlinesId);
            throw new EntityNotFoundException(String.valueOf(productlinesId));
        }
        return productlines;
    }

    @Transactional(readOnly = true, value = "classicmodelsTransactionManager")
	@Override
	public Productlines findById(String productlinesId) {
        LOGGER.debug("Finding Productlines by id: {}", productlinesId);
        return this.wmGenericDao.findById(productlinesId);
    }


	@Transactional(rollbackFor = EntityNotFoundException.class, value = "classicmodelsTransactionManager")
	@Override
	public Productlines update(Productlines productlines) throws EntityNotFoundException {
        LOGGER.debug("Updating Productlines with information: {}", productlines);
        this.wmGenericDao.update(productlines);

        String productlinesId = productlines.getProductLine();

        return this.wmGenericDao.findById(productlinesId);
    }

    @Transactional(value = "classicmodelsTransactionManager")
	@Override
	public Productlines delete(String productlinesId) throws EntityNotFoundException {
        LOGGER.debug("Deleting Productlines with id: {}", productlinesId);
        Productlines deleted = this.wmGenericDao.findById(productlinesId);
        if (deleted == null) {
            LOGGER.debug("No Productlines found with id: {}", productlinesId);
            throw new EntityNotFoundException(String.valueOf(productlinesId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

	@Transactional(readOnly = true, value = "classicmodelsTransactionManager")
	@Override
	public Page<Productlines> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all Productlines");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "classicmodelsTransactionManager")
    @Override
    public Page<Productlines> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all Productlines");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "classicmodelsTransactionManager")
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service classicmodels for table Productlines to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

	@Transactional(readOnly = true, value = "classicmodelsTransactionManager")
	@Override
	public long count(String query) {
        return this.wmGenericDao.count(query);
    }

    @Transactional(readOnly = true, value = "classicmodelsTransactionManager")
	@Override
    public Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable) {
        return this.wmGenericDao.getAggregatedValues(aggregationInfo, pageable);
    }

    @Transactional(readOnly = true, value = "classicmodelsTransactionManager")
    @Override
    public Page<Products> findAssociatedProductses(String productLine, Pageable pageable) {
        LOGGER.debug("Fetching all associated productses");

        StringBuilder queryBuilder = new StringBuilder();
        queryBuilder.append("productlines.productLine = '" + productLine + "'");

        return productsService.findAll(queryBuilder.toString(), pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service ProductsService instance
	 */
	protected void setProductsService(ProductsService service) {
        this.productsService = service;
    }

}

