package com.set.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Service implements CrudOperation<Doctor> {
	
    HashSet<Doctor> DoctorList;	
	public Service() {
		super();
		DoctorList=new HashSet<Doctor>();
	}

	@Override
	public boolean add(Doctor object) {
		return DoctorList.add(object);
	}

	@Override
	public HashSet<Doctor> findAll() {
		return this.DoctorList;
	}

	@Override
	public boolean remove(Doctor object) {
		return DoctorList.remove(object);
	}

	@Override
	public Doctor update(Doctor object, String newDesignation) {
	    DoctorList.remove(object);
		object.setSpecialization(newDesignation);	
		DoctorList.add(object);
		return object;
	}

}
