package com.simmoon.mygraphqldemo.resolver;

import com.simmoon.mygraphqldemo.model.School;
import com.simmoon.mygraphqldemo.service.ISchoolService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author bryan0724
 */
@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    private ISchoolService schoolService;

    public School getSchool(String schoolId) {
        return schoolService.getSchoolBySchoolId(schoolId);
    }

}
