package com.example.demo.Service.Impl;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Entity.Student;
import com.example.demo.Repository.Studentrepo;
import com.example.demo.Service.StudentService;

@Service
public class StudentService implements StudentService{
    @Autowired
    Studentrepo str;
    @Override
    public student insertStudent(student st){
        return str.save(st);
    }
    @Override
    public list<student> getAl1Students(){
        return str.findAll(st);
    }
    @Override
    public Optional<student> getOneStudent(Long id){
        

    }
    
    

}