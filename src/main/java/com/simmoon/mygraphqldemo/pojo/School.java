package com.simmoon.mygraphqldemo.pojo;

import com.simmoon.mygraphqldemo.model.Teacher;
import lombok.Data;

import java.util.List;

@Data
public class School {
    private Integer id;

    private String schoolId;

    private String schoolName;

    private String schoolAge;

    private String schoolAddress;

    private String master;

    private List<Teacher> teachers;

}