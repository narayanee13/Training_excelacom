package com.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.collections.model.Student;
import com.crud.CrudRepository;
import com.crud.StudentRepository;

public class StudentService implements StudentRepository<Student> {

	private ArrayList<Student> studList;
	
	public StudentService() {
		super();
		studList=new ArrayList();
	}

	@Override
	public boolean add(Student object) {
		
		return this.studList.add(object);
	}

	@Override
	public List<Student> findAll() {
		return this.studList;
	}

	@Override
	public Student update(Student object, double revisedMark) {
		int index= studList.indexOf(object);
		Student found = studList.get(index);
		found.setMarkScored(revisedMark);
		return found;
	}

	@Override
	public boolean remove(Student object) {
		return this.studList.remove(object);
	}

	@Override
	public List<Student> getTopThreeByMark() {
		Collections.sort(studList, new MarksComparator());
		ArrayList<Student> list = new ArrayList();
//		for(int i=0;i<=2;i++) {
//			list.add(studList.get(i));
//		}
		for(int i=3;i>=1;i--) {
			list.add(studList.get(i));
		}
		return list;
	}

	@Override
	public double getAverageMark() {
		double temp=0;
		for(Student eachMark:studList) {
			temp+= eachMark.getMarkScored();
	}
		return temp/studList.size();
}
}
