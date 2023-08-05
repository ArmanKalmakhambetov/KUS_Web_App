package com.armanK.pet.project.repository;

import com.armanK.pet.project.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentServiceRepository extends JpaRepository<Student, Long> {
}
