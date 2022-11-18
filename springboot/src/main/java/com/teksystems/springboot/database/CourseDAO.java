package com.teksystems.springboot.database;

import com.teksystems.springboot.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseDAO extends JpaRepository<Course, Long> {

    @Query("SELECT c FROM Course c where c.name = :name")
    public List<Course> findByCourseName(String name);

    // select * from course where lower(name) like lower('%name%') order by name desc
    public List<Course> findByNameContainingIgnoreCaseOrderByNameDesc(String name);

    //public Course findByNameAndId(String name, Integer id);
}