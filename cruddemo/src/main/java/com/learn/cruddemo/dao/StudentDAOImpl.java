package com.learn.cruddemo.dao;

import com.learn.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    @Override
    public Student findById (int id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {

        // create query
        //TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student", Student.class); // list of all student
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student ORDER BY lastName", Student.class); // order by last name of the students (ASC)
        // All JPQL syntax is based on entity name and entity fields

        // return query results
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findByLastName(String theLastName) {
        // create query
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student WHERE lastName=:data", Student.class);

        // set query parameter
        theQuery.setParameter("data", theLastName);

        // return query results
        return theQuery.getResultList();
    }

    @Override
    @Transactional // again here we are updating the database
    public void update(Student theStudent) {
        entityManager.merge(theStudent);
    }
}
