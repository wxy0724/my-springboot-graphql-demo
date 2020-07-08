package com.simmoon.mygraphqldemo.service.impl;

import com.simmoon.mygraphqldemo.mapper.SchoolMapper;
import com.simmoon.mygraphqldemo.model.School;
import com.simmoon.mygraphqldemo.service.ISchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolServiceImpl implements ISchoolService {

    @Autowired
    SchoolMapper schoolMapper;

    private School getSchool(Integer schoolId) {
        return schoolMapper.selectByPrimaryKey(schoolId);
    }

    @Override
    public School getSchoolBySchoolId(String schoolId) {
        return schoolMapper.getSchoolBySchoolId(schoolId);
    }
}
