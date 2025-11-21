package com.example.cicd1_exam_friday.controller.execptionhandler;

import lombok.Data;

@Data
public class RegistrationNotFoundExeception extends RuntimeException {
    public RegistrationNotFoundExeception(String fieldName, String fieldValue) {

    }

}
