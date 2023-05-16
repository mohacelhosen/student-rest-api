package com.mohacel.student.service.impl;

import com.mohacel.student.CustomException.IdNotFoundException;
import com.mohacel.student.entity.StudentEntity;
import com.mohacel.student.repository.StudentRepository;
import com.mohacel.student.service.IStudentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements IStudentService {

    private StudentRepository repository;


    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
        repository.save(new StudentEntity(1,1002,"Mohacel", "Male", "mohacel.hosen06@gmail.com","CSE"));
    }

    @Override
    public StudentEntity save(StudentEntity student) {
        return repository.save(student);
    }

    @Override
    public StudentEntity update(StudentEntity student) {
        return repository.save(student);
    }

    @Override
    public List<StudentEntity> getAll() {
        return repository.findAll();
    }

    @Override
    public StudentEntity getSingleStudent(Integer id) {
        return repository.findById(id).orElseThrow(()-> new IdNotFoundException("Id Not Found 😵"));
    }

    @Override
    public String deleteById(Integer id) {
        StudentEntity student = repository.findById(id).orElseThrow(() -> new IdNotFoundException("Id Not Found 😵"));
        repository.delete(student);
        return "Deleted Successfully...";
    }
}
