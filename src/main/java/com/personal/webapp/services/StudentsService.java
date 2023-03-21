package com.personal.webapp.services;

import com.personal.webapp.model.Student;
import com.personal.webapp.repositories.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsService {
    private StudentsRepository studentsRepository;

    @Autowired
    public StudentsService(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }

    public List<Student> findAll() {
        return studentsRepository.findAll();
    }

    public Student findById(Long id) {
        return studentsRepository.findById(id);
    }

    public void save(Student student) {
        studentsRepository.save(student);
    }
}
