package com.SpringBootAssisment.org.controller;

import java.util.List;

import java.util.Optional;

 

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.SpringBootAssisment.org.entity.Student;
import com.SpringBootAssisment.org.service.StudentService;


 

 

   

@RestController    

public class StudentController   

{    

    @Autowired    

    private StudentService studentService;     

    @RequestMapping("/")    

    public List<Student> getAllStudent()  

    {    

        return studentService.getAllStudent();    

    }       

    @RequestMapping(value="/add", method=RequestMethod.POST)    

    public void addStudent(@RequestBody Student student)  

    {    

        studentService.addStudent(student);    

    }

    

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)    

    public void deleteUser(@PathVariable Double id)  

    {    

        studentService.deleteStudent(id);

    }

    

    @RequestMapping("/{id}")    

    public Optional getAllUser(@PathVariable Double id)  

    {    

        return studentService.getStudentbyid(id) ;   

    }

    

    @RequestMapping(value="/update", method=RequestMethod.PUT)    

    public void updateUser(@RequestBody Student student)  

    {    

        studentService.updateStudent(student);    

    }

}
