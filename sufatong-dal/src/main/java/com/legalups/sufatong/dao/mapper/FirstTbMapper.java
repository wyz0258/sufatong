/**
 * 
 * **
 * 
 * FirstTbMapper.java
 * 
 */
package com.legalups.sufatong.dao.mapper;

import com.legalups.sufatong.model.FirstTb;

/**
 * <p>
 * 表 : first_tb的 Mapper 类
 * 
 * @author 	wangyz
 * @date 	2017年06月18日
 */
public interface FirstTbMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FirstTb record);

    int insertSelective(FirstTb record);

    FirstTb selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FirstTb record);

    int updateByPrimaryKey(FirstTb record);
}