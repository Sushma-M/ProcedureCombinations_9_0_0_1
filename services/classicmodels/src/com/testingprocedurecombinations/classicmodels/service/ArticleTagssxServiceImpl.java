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

import com.testingprocedurecombinations.classicmodels.ArticleTagssx;
import com.testingprocedurecombinations.classicmodels.ArticleTagssxId;


/**
 * ServiceImpl object for domain model class ArticleTagssx.
 *
 * @see ArticleTagssx
 */
@Service("classicmodels.ArticleTagssxService")
@Validated
public class ArticleTagssxServiceImpl implements ArticleTagssxService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ArticleTagssxServiceImpl.class);


    @Autowired
    @Qualifier("classicmodels.ArticleTagssxDao")
    private WMGenericDao<ArticleTagssx, ArticleTagssxId> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<ArticleTagssx, ArticleTagssxId> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
	public ArticleTagssx create(ArticleTagssx articleTagssx) {
        LOGGER.debug("Creating a new ArticleTagssx with information: {}", articleTagssx);
        ArticleTagssx articleTagssxCreated = this.wmGenericDao.create(articleTagssx);
        return articleTagssxCreated;
    }

	@Transactional(readOnly = true, value = "classicmodelsTransactionManager")
	@Override
	public ArticleTagssx getById(ArticleTagssxId articletagssxId) throws EntityNotFoundException {
        LOGGER.debug("Finding ArticleTagssx by id: {}", articletagssxId);
        ArticleTagssx articleTagssx = this.wmGenericDao.findById(articletagssxId);
        if (articleTagssx == null){
            LOGGER.debug("No ArticleTagssx found with id: {}", articletagssxId);
            throw new EntityNotFoundException(String.valueOf(articletagssxId));
        }
        return articleTagssx;
    }

    @Transactional(readOnly = true, value = "classicmodelsTransactionManager")
	@Override
	public ArticleTagssx findById(ArticleTagssxId articletagssxId) {
        LOGGER.debug("Finding ArticleTagssx by id: {}", articletagssxId);
        return this.wmGenericDao.findById(articletagssxId);
    }


	@Transactional(rollbackFor = EntityNotFoundException.class, value = "classicmodelsTransactionManager")
	@Override
	public ArticleTagssx update(ArticleTagssx articleTagssx) throws EntityNotFoundException {
        LOGGER.debug("Updating ArticleTagssx with information: {}", articleTagssx);
        this.wmGenericDao.update(articleTagssx);

        ArticleTagssxId articletagssxId = new ArticleTagssxId();
        articletagssxId.setArticleId(articleTagssx.getArticleId());
        articletagssxId.setTagId(articleTagssx.getTagId());
        articletagssxId.setBlank(articleTagssx.getBlank());

        return this.wmGenericDao.findById(articletagssxId);
    }

    @Transactional(value = "classicmodelsTransactionManager")
	@Override
	public ArticleTagssx delete(ArticleTagssxId articletagssxId) throws EntityNotFoundException {
        LOGGER.debug("Deleting ArticleTagssx with id: {}", articletagssxId);
        ArticleTagssx deleted = this.wmGenericDao.findById(articletagssxId);
        if (deleted == null) {
            LOGGER.debug("No ArticleTagssx found with id: {}", articletagssxId);
            throw new EntityNotFoundException(String.valueOf(articletagssxId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

	@Transactional(readOnly = true, value = "classicmodelsTransactionManager")
	@Override
	public Page<ArticleTagssx> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all ArticleTagssxes");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "classicmodelsTransactionManager")
    @Override
    public Page<ArticleTagssx> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all ArticleTagssxes");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "classicmodelsTransactionManager")
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service classicmodels for table ArticleTagssx to {} format", exportType);
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



}

