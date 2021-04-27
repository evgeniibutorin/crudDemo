package com.example.crudDemo.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private int id;

    @Column(name = "name")
    @Getter
    @Setter
    private String name;

    @Column(name = "position")
    @Getter
    @Setter
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }
}
