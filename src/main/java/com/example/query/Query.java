package com.example.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.request.NameRequest;
import com.example.response.StudentResponse;
import com.example.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Query implements GraphQLQueryResolver {

    private final StudentService studentService;

    public String firstQuery(){
        return "First Query";
    }

    public String secondQuery(){
        return "Second Query";
    }

    public String fullName(NameRequest nameRequest){
        return String.format("Full Name: %s %s", nameRequest.getFirstName(), nameRequest.getLastName());
    }

    public StudentResponse student(long id) {
        return new StudentResponse(studentService.getStudentById(id));
    }
}
