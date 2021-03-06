package com.zwxu.lc.um.mapper;

import com.zwxu.lc.um.model.Student;
import com.zwxu.lc.um.model.StudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_student
	 * @mbggenerated  Tue Jan 10 13:18:06 CST 2017
	 */
	int countByExample(StudentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_student
	 * @mbggenerated  Tue Jan 10 13:18:06 CST 2017
	 */
	int deleteByExample(StudentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_student
	 * @mbggenerated  Tue Jan 10 13:18:06 CST 2017
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_student
	 * @mbggenerated  Tue Jan 10 13:18:06 CST 2017
	 */
	int insert(Student record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_student
	 * @mbggenerated  Tue Jan 10 13:18:06 CST 2017
	 */
	int insertSelective(Student record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_student
	 * @mbggenerated  Tue Jan 10 13:18:06 CST 2017
	 */
	List<Student> selectByExample(StudentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_student
	 * @mbggenerated  Tue Jan 10 13:18:06 CST 2017
	 */
	Student selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_student
	 * @mbggenerated  Tue Jan 10 13:18:06 CST 2017
	 */
	int updateByExampleSelective(@Param("record") Student record,
			@Param("example") StudentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_student
	 * @mbggenerated  Tue Jan 10 13:18:06 CST 2017
	 */
	int updateByExample(@Param("record") Student record,
			@Param("example") StudentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_student
	 * @mbggenerated  Tue Jan 10 13:18:06 CST 2017
	 */
	int updateByPrimaryKeySelective(Student record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_student
	 * @mbggenerated  Tue Jan 10 13:18:06 CST 2017
	 */
	int updateByPrimaryKey(Student record);
}