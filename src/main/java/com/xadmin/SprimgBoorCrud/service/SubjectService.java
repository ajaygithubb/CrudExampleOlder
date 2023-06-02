package com.xadmin.SprimgBoorCrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.xadmin.SprimgBoorCrud.bean.Subject;
import com.xadmin.SprimgBoorCrud.repository.SubjectRepository;

@Service
public class SubjectService {
	@Autowired
	public SubjectRepository subjectRepo;

	public List<Subject> getAllSunjects() {
		List<Subject> subjects = new ArrayList<>();
		subjectRepo.findAll().forEach(subjects::add);
		return subjects;
	}

	public void addSubject(Subject subject) {
		subjectRepo.save(subject);

	}

	public void updateSubject(String id, Subject subject) {
		subjectRepo.save(subject);
	}
	public void DeleteSubject(String id) {
		subjectRepo.deleteById(id);
	}
}
