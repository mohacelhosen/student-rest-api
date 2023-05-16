package com.mohacel.student.controller;

import com.mohacel.student.entity.StudentEntity;
import com.mohacel.student.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentServiceImpl service;

    @GetMapping("/")
    public ResponseEntity<String> welcome(){
        String msg = "Welcome the world of REST API made by @MohacelHosen";
        return new ResponseEntity<>(msg,HttpStatus.OK);
    }

    @PostMapping("/student")
    public ResponseEntity<StudentEntity> saveStudentInfo(@RequestBody StudentEntity student){
        StudentEntity studentEntity = service.save(student);
        return  new ResponseEntity<>(studentEntity, HttpStatus.CREATED);
    }

    @PutMapping("/student")
    public ResponseEntity<StudentEntity> updateStudentInfo(@RequestBody StudentEntity student){
        StudentEntity updatedStudent = service.update(student);
        return  new ResponseEntity<>(updatedStudent, HttpStatus.OK);
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<StudentEntity> singleStudentInfo(@PathVariable("id") Integer id){
        StudentEntity singleStudent = service.getSingleStudent(id);
        return new ResponseEntity<>(singleStudent, HttpStatus.OK);
    }

    @GetMapping("/student")
    public ResponseEntity<List<StudentEntity>> AllStudentInfo(){
        List<StudentEntity> allStudent = service.getAll();
        return  new ResponseEntity<>(allStudent, HttpStatus.OK);
    }

    @DeleteMapping("student/{id}")
    public ResponseEntity<String> deleteStudentInfo(@PathVariable("id") Integer id){
        String msg = service.deleteById(id);
        return  new ResponseEntity<>(msg, HttpStatus.OK);
    }
}
