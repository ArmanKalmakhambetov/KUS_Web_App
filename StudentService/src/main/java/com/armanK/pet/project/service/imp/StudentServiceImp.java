package com.armanK.pet.project.service.imp;

import com.armanK.pet.project.model.Student;
import com.armanK.pet.project.repository.StudentServiceRepository;
import com.armanK.pet.project.service.abstracts.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService {

    private final StudentServiceRepository repository;

    public StudentServiceImp(StudentServiceRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional(readOnly = true)
    public Student getStudent(Long id) {
        return repository.getById(id);
    }

    @Override
    @Transactional
    public void addStudent(Student student) {
        repository.save(student);
    }

    @Override
    @Transactional
    public void removeStudent(Student student) {
        repository.delete(student);
    }

    @Override
    @Transactional
    public void removeStudentWithID(Long studentId) {
        repository.deleteById(studentId);
    }

    @Override
    @Transactional
    public void updateStudent(Student student) {
        repository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return repository.findAll();
    }
}
