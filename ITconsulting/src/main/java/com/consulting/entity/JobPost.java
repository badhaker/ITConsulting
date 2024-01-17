package com.consulting.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "job_txn")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobPost extends BaseEntity{
    private String companyName;
    private String designation;
    private Long experience;
    private List<String> primarySkills;
    private List<String> secondarySkill;
    private String salary;
    private Long appliedByCandidate;
    private String jobLocation;
}
