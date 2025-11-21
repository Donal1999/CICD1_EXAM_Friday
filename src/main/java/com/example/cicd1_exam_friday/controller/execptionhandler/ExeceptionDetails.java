package com.example.cicd1_exam_friday.controller.execptionhandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExeceptionDetails {
    private String fieldName;
    private String fieldValue;

}
