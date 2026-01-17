package com.springmvc.advancemapping.onetoone.dao;


import com.springmvc.advancemapping.onetoone.entity.Instructor;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class AppDAOImpl implements AppDAO {

    private EntityManager theEntityManager;

    @Autowired
    public AppDAOImpl(EntityManager theEntityManager) {
        this.theEntityManager = theEntityManager;
    }

    @Override
    @Transactional
    public void saveInstructor(Instructor instructor) {
        theEntityManager.persist(instructor);
    }

    @Override
    public Instructor findInstructorById(int id) {
        Instructor theInstructor = theEntityManager.find(Instructor.class, id);
        if (theInstructor == null) {
            System.out.println("Instructor not found with id: " + id);
            return null;
        } else {
            return theInstructor;
        }
    }

    @Override
    @Transactional
    public void deleteInstructorById(int id) {
        Instructor instructor = findInstructorById(id);
        if (instructor != null) {
            theEntityManager.remove(instructor);
        }
    }
}
