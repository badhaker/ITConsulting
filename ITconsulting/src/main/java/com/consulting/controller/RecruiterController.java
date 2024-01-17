package com.consulting.controller;

import com.consulting.request.CreateRecruiterRequest;
import com.consulting.response.BaseApiResponse;
import com.consulting.response.ResponseBuilder;
import com.consulting.service.RecruiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/recruiter")
public class RecruiterController {
    @Autowired
    RecruiterService recruiterService;
    @PostMapping("/create-recruiter")
    public ResponseEntity<BaseApiResponse> createRecruiter(@RequestBody CreateRecruiterRequest createRecruiterRequest) {
        String response =  recruiterService.createRecruiter(createRecruiterRequest);
        BaseApiResponse baseApiResponse = ResponseBuilder.getSuccessResponse(response);
        return new ResponseEntity<BaseApiResponse>(baseApiResponse, HttpStatus.OK);
    }
}
