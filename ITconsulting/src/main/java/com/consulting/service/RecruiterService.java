package com.consulting.service;

import com.consulting.request.CreateRecruiterRequest;
import org.springframework.stereotype.Service;

@Service
public interface RecruiterService {
    String createRecruiter(CreateRecruiterRequest createRecruiterRequest);
}
