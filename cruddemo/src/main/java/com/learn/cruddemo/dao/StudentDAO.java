package com.learn.cruddemo.dao;

import com.learn.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save (Student theStudent) ;

    Student findById(int id);

    List<Student> findAll() ;

    List<Student> findByLastName(String theLastName);

    void update (Student theStudent);
}
