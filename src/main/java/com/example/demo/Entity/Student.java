  package com.example.demo.Entity;

  import jakarta.persistence.Entity;
  import jakarta.persistence.GeneratedValue;
  import jakarta.persistence.GenerationType;
  import jakarta.persistence.Id;

  import java.time.LocalDate;
  @Entity
  public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private float cgp;
    public Long getId() {
      return id;
    }
    public void setId(Long id) {
      this.id = id;
    }
    public String getName() {
      return name;
    }
    public void setName(String name) {
      this.name = name;
    }
    public String getEmail() {
      return email;
    }
    public void setEmail(String email) {
      this.email = email;
    }
    public LocalDate getDob() {
      return dob;
    }
    public void setDob(LocalDate dob) {
      this.dob = dob;
    }
    public float getCgp() {
      return cgp;
    }
    public void setCgp(float cgp) {
      this.cgp = cgp;
    }
    public Student(Long id, String name, String email, LocalDate dob, float cgp) {
      this.id = id;
      this.name = name;
      this.email = email;
      this.dob = dob;
      this.cgp = cgp;
    }
    
  }
