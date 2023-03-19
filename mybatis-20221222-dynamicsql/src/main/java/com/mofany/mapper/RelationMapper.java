package com.mofany.mapper;

import com.mofany.entity.Relation;

import java.util.List;

/**
 * @author MoFany-J
 * @date 2022/12/22
 * @description RelationMapper
 */
public interface RelationMapper {
    /**
     * 联合查询全部
     * */
    List<Relation> queryAll();
}
