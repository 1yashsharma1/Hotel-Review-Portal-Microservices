package com.hotel.user.service.payloads;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@Builder
public class ApiResponse {
    private String message;
    private boolean success;
    private HttpStatus httpStatus;

}
