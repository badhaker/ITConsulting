package com.consulting.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseApiResponse {
    private ResponseStatus responseStatus;
    private Object responseData;
    private String message;
}
