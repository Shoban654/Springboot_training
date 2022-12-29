package com.example.demo.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.StudentsModel;

@Repository
public interface Studentsrepository extends MongoRepository<StudentsModel,String>{
    void deleteByFirstName(String firstName);
}
