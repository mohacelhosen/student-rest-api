package com.mohacel.student.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "STUDENT_TABLE")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_COL")
    private Integer id;
    @Column(name = "STD_ID_COL")
    private Integer stdId;
    @Column(name = "STD_Name_COL")
    private String name;
    @Column(name = "STD_GENDER_COL")
    private String gender;
    @Column(name = "STD_GMAIL_COL")
    private String email;
    @Column(name = "STD_DEPARTMENT_COL")
    private String department;
}
