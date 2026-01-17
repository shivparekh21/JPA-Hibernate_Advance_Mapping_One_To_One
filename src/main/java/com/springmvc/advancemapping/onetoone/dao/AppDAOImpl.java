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
}
