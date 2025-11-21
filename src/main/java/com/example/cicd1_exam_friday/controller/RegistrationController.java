package com.example.cicd1_exam_friday.controller;

import com.example.cicd1_exam_friday.model.Registration;
import com.example.cicd1_exam_friday.service.RegistrationService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/registration")
public class RegistrationController {
    private RegistrationService registrationService;
    public RegistrationController(RegistrationService registrationService) {this.registrationService = registrationService;}

    @GetMapping("/{ticketcode}")
    public ResponseEntity<Registration> getRegistrations(@PathVariable String ticketcode) {
        Optional<Registration> registration = registrationService.getRegistrationByCode(ticketcode);
        if (registration.isPresent()) {
            return ResponseEntity.ok(registration.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping()
    public ResponseEntity<Registration> createRegistration( @Valid @RequestBody Registration registration) {
        Registration created = registrationService.addRegistration(registration);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

}
