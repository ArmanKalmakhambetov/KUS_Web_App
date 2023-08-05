package com.armanK.pet.project.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "факультеты")
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameOfFaculty;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "faculty")
    private List<Specialisation> specialisationList;
}
