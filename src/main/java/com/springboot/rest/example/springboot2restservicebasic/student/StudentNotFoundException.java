package com.springboot.rest.example.springboot2restservicebasic.student;

public class StudentNotFoundException extends RuntimeException {

    public StudentNotFoundException(String exception) {
        super(exception);
    }
}
