package com.set.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
		
       HashSet<Patient> patientList = new HashSet<Patient>();
       Patient ram = new Patient(1,"ram","chennai","ram@gmail.com");
       Patient shyam = new Patient(2,"shyam", "chennai","shaym@gmail.com");
       patientList.add(ram);
       patientList.add(shyam);
  		   
      HashMap<String, Staff> staffList = new HashMap<String, Staff>();
      Staff sita = new Staff("sita");
      Staff gita = new Staff("gita");
  
      staffList.put("xRay",sita );
      staffList.put("ecg", gita);
      
      Doctor keerthana = new Doctor(13,"keerthana","child specialist","coimbatore", patientList, staffList);
      Doctor selva = new Doctor(14,"selva dharshini","neurologist","chennai", patientList, staffList);
      Doctor narayanee = new Doctor(15,"narayanee","cardiologist","banglore", patientList, staffList);
      Service service = new Service();
      System.out.println(service.add(keerthana));
      System.out.println(service.add(selva));
      System.out.println(service.add(narayanee));
      
      Set<Doctor> result=service.findAll();
      for(Doctor eachDoctor:result) {
    	  System.out.println(eachDoctor);
      }
      
      System.out.println(service.update(selva, "Dermetologist"));
      
      System.out.println(service.remove(narayanee));
      
	}

}
