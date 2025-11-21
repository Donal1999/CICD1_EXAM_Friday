package com.example.cicd1_exam_friday.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Registration {
    @NotBlank
    private String attendeName;
    @NotBlank @Email
    private String email;
    @Pattern(regexp = "TK-[0-9]{4}")
    private String ticketCode;
    @Positive
    private int quantity;
}
