package com.consulting.service.ServiceImpl;

import com.consulting.entity.RecruiterEntity;
import com.consulting.repository.RecruiterRepository;
import com.consulting.request.CreateRecruiterRequest;
import com.consulting.service.RecruiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecruiterServiceImpl implements RecruiterService {
    @Autowired
    RecruiterRepository recruiterRepository;

//    @Autowired
//    private PasswordEncoder passwordEncoder;
    @Override
    public String createRecruiter(CreateRecruiterRequest createRecruiterRequest) {
        RecruiterEntity recruiterEntity = RecruiterEntity.builder()
                .firstName(createRecruiterRequest.getFirstName())
                .lastName(createRecruiterRequest.getLastName())
                .email(createRecruiterRequest.getEmail())
                .mobileNumber(createRecruiterRequest.getPassword())
                .password(createRecruiterRequest.getPassword())
                .companyName(createRecruiterRequest.getCompanyName())
                .designation(createRecruiterRequest.getDesignation())
                .build();
        recruiterRepository.save(recruiterEntity);
        return "recruiter created successfully";
    }
}
