package com.learn.cruddemo.dao;

import com.learn.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl implements StudentDAO{

    // define field for entity manager
    private final EntityManager entityManager ;

    // inject entity manager using constructor injection
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // implement save method
    @Override
    @Transactional //Adding @Transactional since we are performing an update
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }
}
