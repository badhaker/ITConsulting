package com.consulting.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "recruiter_txn")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RecruiterEntity extends BaseEntity{
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String companyName;
    private String mobileNumber;
    private String designation;
}
