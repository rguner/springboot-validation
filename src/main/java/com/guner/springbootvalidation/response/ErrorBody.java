package com.guner.springbootvalidation.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ErrorBody {
    private int errorCode;
    private String errorDetail;
}
