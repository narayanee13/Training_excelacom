package com.crud;

import com.collections.model.*;
import java.util.*;

public interface StudentRepository<T> extends CrudRepository<T> {
	List<Student> getTopThreeByMark();
	double getAverageMark();

}
