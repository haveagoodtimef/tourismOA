package com.fhz.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.fhz.common.PageObject;
import com.fhz.entity.Project;

/**
 * 此接口对象为一个数据访问对象(关联一个mapper) 所在层:DAL(数据访问层)
 */
@Repository
public interface ProjectDao {
	/**
	 * @param entity
	 *            代表是一个project对象
	 * @return 表示insert记录的行数
	 */
	public int insertObject(Project entity);

	/**
	 * 查询项目信息
	 */
	public List<Project> findObjects();

	/**
	 * 分页查询项目信息
	 */
	public List<Project> findPageObjects(PageObject pageObject);

	/** 获得表中的记录数 */
	public int getRowCount();

}
