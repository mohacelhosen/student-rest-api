package com.mohacel.student.service;

import com.mohacel.student.entity.StudentEntity;

import java.util.List;

public interface IStudentService {
    public StudentEntity save(StudentEntity student);
    public StudentEntity update(StudentEntity student);
    public List<StudentEntity> getAll();
    public StudentEntity getSingleStudent(Integer id);
    public String deleteById(Integer id);
}
