package com.simmoon.mygraphqldemo.resolver;

import com.simmoon.mygraphqldemo.mapper.SchoolMapper;
import com.simmoon.mygraphqldemo.mapper.TeacherMapper;
import com.simmoon.mygraphqldemo.model.School;
import com.simmoon.mygraphqldemo.model.Teacher;
import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SchoolResolver implements GraphQLResolver<School> {

    @Autowired
    private SchoolMapper schoolMapper;

    @Autowired
    private TeacherMapper teacherMapper;

    public School getMaster(School school) {
        return schoolMapper.getMasterById(school.getMaster());
    }

    public List<Teacher> getTeachers(School school) {
        return teacherMapper.getTeacherList(school.getSchoolId());
    }

}
