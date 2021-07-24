package com.example.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.entity.Student;
import com.example.response.StudentResponse;
import com.example.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


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

    public StudentResponse student(long id) {
        return new StudentResponse(studentService.getStudentById(id));
    }

    public List<StudentResponse> studentList(){
        List<StudentResponse> studentResponseList = new ArrayList<>();

        List<Student> studentList = studentService.getAllStudents();

        for(Student student : studentList){
            studentResponseList.add(new StudentResponse(student));
        }
        return studentResponseList;
    }
}
