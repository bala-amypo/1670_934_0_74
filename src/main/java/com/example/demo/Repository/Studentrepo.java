package com.example.demo.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.Repository.JpaRepository;
import com.example.demo.Entity.Student;

@Repository
public class Studentrepo extends JpaRepository<Student,Long> {
  
}
