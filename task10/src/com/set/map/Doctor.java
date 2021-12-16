package com.set.map;

import java.util.*;

public class Doctor {
	private int id;
	private String name;
	private String specialization;
	private String location;
	
	private HashSet<Patient> patientList;
	private HashMap<String, Staff> staffDetails;
	
	public Doctor() {
		super();
	}

	public Doctor(int id, String name, String specialization, String location, HashSet<Patient> patientList,
			HashMap<String, Staff> staffDetails) {
		super();
		this.id = id;
		this.name = name;
		this.specialization = specialization;
		this.location = location;
		this.patientList = patientList;
		this.staffDetails = staffDetails;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Set<Patient> getPatientList() {
		return patientList;
	}

	public void setPatientList(HashSet<Patient> patientList) {
		this.patientList = patientList;
	}

	public Map<String, Staff> getStaffDetails() {
		return staffDetails;
	}

	public void setStaffDetails(HashMap<String, Staff> staffDetails) {
		this.staffDetails = staffDetails;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", specialization=" + specialization + ", location=" + location
				+ ", patientList=" + patientList + ", staffDetails=" + staffDetails + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((patientList == null) ? 0 : patientList.hashCode());
		result = prime * result + ((specialization == null) ? 0 : specialization.hashCode());
		result = prime * result + ((staffDetails == null) ? 0 : staffDetails.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctor other = (Doctor) obj;
		if (id != other.id)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (patientList == null) {
			if (other.patientList != null)
				return false;
		} else if (!patientList.equals(other.patientList))
			return false;
		if (specialization == null) {
			if (other.specialization != null)
				return false;
		} else if (!specialization.equals(other.specialization))
			return false;
		if (staffDetails == null) {
			if (other.staffDetails != null)
				return false;
		} else if (!staffDetails.equals(other.staffDetails))
			return false;
		return true;
	}
	

}
