package com.prd.warehouse.dao;

import com.prd.warehouse.entity.InvLocation;

public interface InvLocationDAO {

    /**
     *  根据 id 查询 InvLocation
     * @param id
     * @return
     */
    InvLocation selectInvLocationByID(String id);


    int deleteByPrimaryKey(String id);

    int insert(InvLocation record);

    int insertSelective(InvLocation record);


    int updateByPrimaryKeySelective(InvLocation record);

    int updateByPrimaryKey(InvLocation record);
}