package com.simmoon.mygraphqldemo.service;

import com.simmoon.mygraphqldemo.model.School;


public interface ISchoolService {

    School getSchoolBySchoolId(String schoolId);

}
