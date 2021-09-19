package com.test.assignment45.assignment4.model;

import java.util.List;

public class CandidateDetails {

    private String firstName;
    private String lastName;
    private String dob;
    private String gender;
    private String interviewDate;
    private String candidateDetails;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(String interviewDate) {
        this.interviewDate = interviewDate;
    }

    public String getCandidateDetails() {
        return candidateDetails;
    }

    public void setCandidateDetails(String candidateDetails) {
        this.candidateDetails = candidateDetails;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

