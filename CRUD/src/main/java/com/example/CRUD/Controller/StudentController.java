package com.example.CRUD.Controller;
import com.example.CRUD.Model.StudentModel;
import com.example.CRUD.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.JsonPath;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/listStudents")
    public List<StudentModel> getStudent(){
        return this.studentService.getStudent();
    }

    @PostMapping("/addStudent")
    public HttpStatus addStudent(@RequestBody StudentModel studentModel){
       this.studentService.addStudent(studentModel);
       return HttpStatus.OK;
    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteStudent(@PathVariable("id") Integer id){
        this.studentService.deleteStudent(id);
        return HttpStatus.OK;
    }

    @PostMapping ("/updateStudent")
    public HttpStatus updateStudent(@RequestBody StudentModel studentModel){
        this.studentService.addStudent(studentModel);
        return HttpStatus.OK;
    }

}
