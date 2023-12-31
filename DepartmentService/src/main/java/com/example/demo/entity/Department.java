package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "department")
public class Department {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
