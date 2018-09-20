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

import com.testingprocedurecombinations.classicmodelsdb.Mytable;
import com.testingprocedurecombinations.classicmodelsdb.MytableId;


/**
 * ServiceImpl object for domain model class Mytable.
 *
 * @see Mytable
 */
@Service("ClassicModelsDB.MytableService")
public class MytableServiceImpl implements MytableService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MytableServiceImpl.class);


    @Autowired
    @Qualifier("ClassicModelsDB.MytableDao")
    private WMGenericDao<Mytable, MytableId> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<Mytable, MytableId> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "ClassicModelsDBTransactionManager")
    @Override
	public Mytable create(Mytable mytable) {
        LOGGER.debug("Creating a new Mytable with information: {}", mytable);
        Mytable mytableCreated = this.wmGenericDao.create(mytable);
        return mytableCreated;
    }

	@Transactional(readOnly = true, value = "ClassicModelsDBTransactionManager")
	@Override
	public Mytable getById(MytableId mytableId) throws EntityNotFoundException {
        LOGGER.debug("Finding Mytable by id: {}", mytableId);
        Mytable mytable = this.wmGenericDao.findById(mytableId);
        if (mytable == null){
            LOGGER.debug("No Mytable found with id: {}", mytableId);
            throw new EntityNotFoundException(String.valueOf(mytableId));
        }
        return mytable;
    }

    @Transactional(readOnly = true, value = "ClassicModelsDBTransactionManager")
	@Override
	public Mytable findById(MytableId mytableId) {
        LOGGER.debug("Finding Mytable by id: {}", mytableId);
        return this.wmGenericDao.findById(mytableId);
    }


	@Transactional(rollbackFor = EntityNotFoundException.class, value = "ClassicModelsDBTransactionManager")
	@Override
	public Mytable update(Mytable mytable) throws EntityNotFoundException {
        LOGGER.debug("Updating Mytable with information: {}", mytable);
        this.wmGenericDao.update(mytable);

        MytableId mytableId = new MytableId();
        mytableId.setColumnA(mytable.getColumnA());
        mytableId.setColumnB(mytable.getColumnB());

        return this.wmGenericDao.findById(mytableId);
    }

    @Transactional(value = "ClassicModelsDBTransactionManager")
	@Override
	public Mytable delete(MytableId mytableId) throws EntityNotFoundException {
        LOGGER.debug("Deleting Mytable with id: {}", mytableId);
        Mytable deleted = this.wmGenericDao.findById(mytableId);
        if (deleted == null) {
            LOGGER.debug("No Mytable found with id: {}", mytableId);
            throw new EntityNotFoundException(String.valueOf(mytableId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

	@Transactional(readOnly = true, value = "ClassicModelsDBTransactionManager")
	@Override
	public Page<Mytable> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all Mytables");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "ClassicModelsDBTransactionManager")
    @Override
    public Page<Mytable> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all Mytables");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "ClassicModelsDBTransactionManager")
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service ClassicModelsDB for table Mytable to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

	@Transactional(readOnly = true, value = "ClassicModelsDBTransactionManager")
	@Override
	public long count(String query) {
        return this.wmGenericDao.count(query);
    }



}

