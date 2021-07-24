package com.example.entity;

import com.example.request.CreateStudentRequest;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany(mappedBy = "student" )
    private List<Subject> learningSubjects;

    public Student(CreateStudentRequest createStudentRequest){
        this.email = createStudentRequest.getEmail();
        this.firstName = createStudentRequest.getFirstName();
        this.lastName = createStudentRequest.getLastName();
    }
}
