package com.simmoon.mygraphqldemo.mapper;

import com.simmoon.mygraphqldemo.model.School;
import com.simmoon.mygraphqldemo.model.SchoolExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SchoolMapper {
    long countByExample(SchoolExample example);

    int deleteByExample(SchoolExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(School record);

    int insertSelective(School record);

    List<School> selectByExample(SchoolExample example);

    School selectByPrimaryKey(Integer id);

    School getMasterById(String masterId);

    School getSchoolBySchoolId(String schoolId);

    int updateByExampleSelective(@Param("record") School record, @Param("example") SchoolExample example);

    int updateByExample(@Param("record") School record, @Param("example") SchoolExample example);

    int updateByPrimaryKeySelective(School record);

    int updateByPrimaryKey(School record);
}