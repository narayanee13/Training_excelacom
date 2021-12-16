package com.collections;

import java.util.List;
import java.util.logging.Logger;
import java.util.Collections;
import java.util.Iterator;
import com.collections.model.Student;
import com.crud.CrudRepository;
import com.crud.StudentRepository;
import com.services.MarksComparator;
import com.services.StudentNameComparator;
import com.services.StudentService;

public class CrudApplicaton  {

	public static void main(String[] args) {
		Logger logger= LoggingUtility.getLogger(Application.class);

		  Student anand = new Student(101,"anand", 78);
	      Student dravid = new Student(102,"dravid", 87);
	      Student zahir = new Student(103,"zahir", 23);
	      Student chandru = new Student(104,"chandru", 79);
	      Student ramesh = new Student(105,"ramesh", 67);
	      
	   //CrudRepository crud = new StudentService();
	   StudentRepository crud = new StudentService();
       crud.add(anand);
	   crud.add(dravid);
	   crud.add(zahir);
	   crud.add(chandru);
	   crud.add(ramesh);  
	   List<Student> list = crud.findAll();
	   //Collections.sort(list);
	  // Collections.sort(list,new StudentNameComparator());
	   Collections.sort(list,new MarksComparator());

	   Iterator<Student> itr = list.iterator();
	   
	   while(itr.hasNext()) {
			logger.info(itr.next().toString());	  
            }
	   //Student updated = crud.update(chandru, 95);
	   System.out.println(crud.update(chandru, 95));
	   boolean result = crud.remove(ramesh);
	   if(result) {
		   logger.info("one student removed");
	   }else {
		   throw new RuntimeException("Student does'nt exist");
	   }
	   List<Student> top3List = crud.getTopThreeByMark();
	   for(Student eachStud:top3List) {
		   System.out.println(eachStud);

	   }
	   System.out.println(crud.getAverageMark());
	}

}
