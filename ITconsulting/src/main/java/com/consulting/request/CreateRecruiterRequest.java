package com.consulting.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateRecruiterRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String companyName;
    private String mobileNumber;
    private String designation;
}
