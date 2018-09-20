/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testingprocedurecombinations.classicmodelsdb.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wavemaker.runtime.data.dao.WMGenericDao;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.file.model.Downloadable;

import com.testingprocedurecombinations.classicmodelsdb.ArticleTags;
import com.testingprocedurecombinations.classicmodelsdb.ArticleTagsId;


/**
 * ServiceImpl object for domain model class ArticleTags.
 *
 * @see ArticleTags
 */
@Service("ClassicModelsDB.ArticleTagsService")
public class ArticleTagsServiceImpl implements ArticleTagsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ArticleTagsServiceImpl.class);


    @Autowired
    @Qualifier("ClassicModelsDB.ArticleTagsDao")
    private WMGenericDao<ArticleTags, ArticleTagsId> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<ArticleTags, ArticleTagsId> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "ClassicModelsDBTransactionManager")
    @Override
	public ArticleTags create(ArticleTags articleTags) {
        LOGGER.debug("Creating a new ArticleTags with information: {}", articleTags);
        ArticleTags articleTagsCreated = this.wmGenericDao.create(articleTags);
        return articleTagsCreated;
    }

	@Transactional(readOnly = true, value = "ClassicModelsDBTransactionManager")
	@Override
	public ArticleTags getById(ArticleTagsId articletagsId) throws EntityNotFoundException {
        LOGGER.debug("Finding ArticleTags by id: {}", articletagsId);
        ArticleTags articleTags = this.wmGenericDao.findById(articletagsId);
        if (articleTags == null){
            LOGGER.debug("No ArticleTags found with id: {}", articletagsId);
            throw new EntityNotFoundException(String.valueOf(articletagsId));
        }
        return articleTags;
    }

    @Transactional(readOnly = true, value = "ClassicModelsDBTransactionManager")
	@Override
	public ArticleTags findById(ArticleTagsId articletagsId) {
        LOGGER.debug("Finding ArticleTags by id: {}", articletagsId);
        return this.wmGenericDao.findById(articletagsId);
    }


	@Transactional(rollbackFor = EntityNotFoundException.class, value = "ClassicModelsDBTransactionManager")
	@Override
	public ArticleTags update(ArticleTags articleTags) throws EntityNotFoundException {
        LOGGER.debug("Updating ArticleTags with information: {}", articleTags);
        this.wmGenericDao.update(articleTags);

        ArticleTagsId articletagsId = new ArticleTagsId();
        articletagsId.setArticleId(articleTags.getArticleId());
        articletagsId.setTagId(articleTags.getTagId());

        return this.wmGenericDao.findById(articletagsId);
    }

    @Transactional(value = "ClassicModelsDBTransactionManager")
	@Override
	public ArticleTags delete(ArticleTagsId articletagsId) throws EntityNotFoundException {
        LOGGER.debug("Deleting ArticleTags with id: {}", articletagsId);
        ArticleTags deleted = this.wmGenericDao.findById(articletagsId);
        if (deleted == null) {
            LOGGER.debug("No ArticleTags found with id: {}", articletagsId);
            throw new EntityNotFoundException(String.valueOf(articletagsId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

	@Transactional(readOnly = true, value = "ClassicModelsDBTransactionManager")
	@Override
	public Page<ArticleTags> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all ArticleTags");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "ClassicModelsDBTransactionManager")
    @Override
    public Page<ArticleTags> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all ArticleTags");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "ClassicModelsDBTransactionManager")
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service ClassicModelsDB for table ArticleTags to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

	@Transactional(readOnly = true, value = "ClassicModelsDBTransactionManager")
	@Override
	public long count(String query) {
        return this.wmGenericDao.count(query);
    }



}

