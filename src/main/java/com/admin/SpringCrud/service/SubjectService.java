package com.admin.SpringCrud.service;

import com.admin.SpringCrud.bean.Subject;
import com.admin.SpringCrud.repo.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectService {
    @Autowired
    public SubjectRepo subRepo;

    public List<Subject> getAllSubjects()
    {
        List<Subject> subjects = new ArrayList<>();
        subRepo.findAll().forEach(subjects::add);
        return subjects;
    }
    public void addSubject(Subject subject){
        subRepo.save(subject);
    }
    public void updateSubject(String id,Subject subject){
        subRepo.save(subject);
    }

    public void deleteSubject(String id){
        subRepo.deleteById(id);
    }
}
