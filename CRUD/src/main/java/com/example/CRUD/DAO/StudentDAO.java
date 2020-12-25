package com.example.CRUD.DAO;

import com.example.CRUD.Model.StudentModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDAO extends CrudRepository<StudentModel, Integer> {
}
