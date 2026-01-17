package com.springmvc.advancemapping.onetoone.dao;

import com.springmvc.advancemapping.onetoone.entity.Instructor;

public interface AppDAO {
    void saveInstructor(Instructor instructor);
    Instructor findInstructorById(int id);
    void deleteInstructorById(int id);
}
