package com.bb.ilp.service;

import java.util.ArrayList;

import com.bb.ilp.beans.Teacher;

public interface TeacherCRUDService {
	
	// create/save an object of class Teacher
	public void save(Teacher teacherObj);
	
	// update an object of class teacher return 1 if successfully  updated
	public int update(Teacher teacherObj);
	
	//read or get all the teachers
	public ArrayList<Teacher> findAll();
	
	//read or get a specific teacher data its ID
	public Teacher findById(long id);
	
	// delete an object of teacher by its id return boolean true if successfully deleted
	public boolean delete(long id);

}
