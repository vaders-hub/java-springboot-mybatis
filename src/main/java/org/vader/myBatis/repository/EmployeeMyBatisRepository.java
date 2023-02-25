package org.vader.myBatis.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import org.vader.myBatis.model.Employee;

@Mapper
@Repository
public interface EmployeeMyBatisRepository {
    @Select("select * from employees")
    public List < Employee > findAll();

    public ArrayList<HashMap<String, Object>> findAllList();

}
