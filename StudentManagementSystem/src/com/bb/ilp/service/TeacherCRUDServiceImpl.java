package com.bb.ilp.service;

import java.util.ArrayList;

import com.bb.ilp.beans.Teacher;

public class TeacherCRUDServiceImpl implements TeacherCRUDService {

	private static ArrayList<Teacher> teacherList = new ArrayList<Teacher>(10);

	// create/save an object of class Teacher
	@Override
	public void save(Teacher teacherObj) {
		teacherList.add(teacherObj);
	}

	@Override
	public int update(Teacher teacherObj) {
		int statusCode = 0; // for failure
		// iterate the complete list to get the exact teacher object to update
		int size = teacherList.size();
		for (int i = 0; i < size; i++) {
			if (teacherList.get(i).getTeacherId() == teacherObj.getTeacherId()) {
				// will replace the old value
				teacherList.set(i, teacherObj);
				// assign success status code
				statusCode = 1;
				break;
			}

		}
		return statusCode;
	}

	@Override
	public ArrayList<Teacher> findAll() {
		return teacherList;
	}

	@Override
	public Teacher findById(long id) {
		// iterate to find the correct object to return
		int size = teacherList.size();
		Teacher teacherObjToReturn = null;
		for (int i = 0; i < size; i++) {
			if (teacherList.get(i).getTeacherId() == id) {
				teacherObjToReturn = teacherList.get(i);
				break;
			}
		}
		return teacherObjToReturn;
	}

	@Override
	public boolean delete(long id) {
		// false initially if the passed id is not present
		boolean isFound = false;
		// calling findById to check whether the object is present or not
		Teacher existingTeacherObj = findById(id);
		if (null != existingTeacherObj) {
			teacherList.remove(existingTeacherObj);
			isFound = true;
		}
		return isFound;
	}

}
