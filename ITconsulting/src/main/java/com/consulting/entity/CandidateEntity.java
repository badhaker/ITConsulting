package com.consulting.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "candidate_txn")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidateEntity extends BaseEntity{
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private List<String> primarySkill;
    private List<String> secondarySkill;
    private String currentCompany;
    private String designation;
    private String location;
}
