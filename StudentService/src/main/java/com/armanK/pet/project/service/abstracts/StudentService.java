package com.armanK.pet.project.service.abstracts;

import com.armanK.pet.project.model.Student;

import java.util.List;

public interface StudentService {

    Student getStudent(Long id);

    void addStudent(Student student);

    void removeStudent(Student student);

    void removeStudentWithID(Long studentId);

    void updateStudent(Student student);


    List<Student> getAllStudents();
}
