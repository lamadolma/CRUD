package com.example.CRUD.Service;

import com.example.CRUD.DAO.StudentDAO;
import com.example.CRUD.Model.StudentModel;
import com.sun.xml.internal.ws.client.Stub;
import jdk.internal.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentDAO studentDAO;

    @Autowired
    public StudentService(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    //Adding Student
    public void addStudent(StudentModel studentModel){
        this.studentDAO.save(studentModel);
    }

    //List all Students
    public List<StudentModel> getStudent(){
        return (List<StudentModel>) this.studentDAO.findAll();
    }

    //Deleting Students
    public StudentModel findbyId(Integer id){
        return this.studentDAO.findById(id).get();
    }

    public void deleteStudent(Integer id){
        this.studentDAO.deleteById(id);
    }

    //Update Student
    public List<StudentModel> updateStudent(StudentModel studentModel){
        return (List<StudentModel>) this.studentDAO.save(studentModel);
    }
}
