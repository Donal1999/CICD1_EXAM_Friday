package com.example.cicd1_exam_friday.service;

import com.example.cicd1_exam_friday.model.Registration;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RegistrationService {
    private final List<Registration> store = new ArrayList<>();

    public Optional<Registration> getRegistrationByEmail(String email) {
        for (Registration registration : store) {
            if (registration.getEmail().equals(email)) {
                return Optional.of(registration);
            }
        }
        return Optional.empty();
    }

}
