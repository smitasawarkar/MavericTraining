package com.SpringBootAssisment.org.service;



import java.util.ArrayList;

import java.util.List;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestParam;

import com.SpringBootAssisment.org.entity.Student;
import com.SpringBootAssisment.org.repo.StudentRepo;


@Service

public class StudentService {

   @Autowired

   private StudentRepo userRepository;



   public List<Student> getAllStudent() {

       List<Student> student = new ArrayList<>();

       userRepository.findAll().forEach(student::add);

       return student;

   }



   public void addStudent(Student student) {

       userRepository.save(student);

   }



   public void deleteStudent(Double id) {

       userRepository.deleteById(id);

   }



//   public String deleteStudent(String id)

//

//   {

//

//       if (userRepository.existsById(id)) {

//

//           userRepository.deleteById(id);

//

//           return "deleted";

//

//       } else {

//

//           return "record not found";

//

//       }

//

//   }



   public Optional<Student> getStudentbyid(Double id) {



       return userRepository.findById(id);



   }



   public void updateStudent(Student student) {

       userRepository.save(student);

   }



}

