package com.example.demo.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.Studentrepo;
import com.example.demo.Service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private Studentrepo str;

    @Override
    public Student insertStudent(Student st) {
        return str.save(st);
    }

    @Override
    public List<Student> getAllStudents() {
        return str.findAll();
    }

    @Override
    public Optional<Student> getOneStudent(Long id) {
        return str.findById(id);
    }

    @Override
    public void deleteStudent(Long id) {
        str.deleteById(id);
    }
}
