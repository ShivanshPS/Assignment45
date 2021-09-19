package com.test.assignment45.assignment4.controller;

import com.test.assignment45.assignment4.model.CandidateDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;

@Controller
public class CandidateRegistrationController {

    @GetMapping("/candidate-registration")
    public String candidateDetailsForm(Model model) {
        model.addAttribute("candidateDetails", new CandidateDetails());
        model.addAttribute("searchTypes", Arrays.asList("Male", "Female"));
        return "candidate-registration";
    }

    @PostMapping("/candidate-registration")
    public String candidateDetailsSubmit(@ModelAttribute CandidateDetails candidateDetails, Model model) {
        model.addAttribute("candidateDetails", candidateDetails);
        return "registration-result";
    }

}