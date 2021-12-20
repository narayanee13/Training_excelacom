package com.OccurrenceAndPosition;

import java.util.*;

public class OccurancesandPosition {
	
	public static void Occurances(List<Integer> nameList)
    {
         Map<Integer, Integer> map = new HashMap<Integer, Integer>();
  
        for (Integer i : nameList) {
            Integer j = map.get(i);
            map.put(i, (j == null) ? 1 : j + 1);
        }
  
         for (Map.Entry<Integer, Integer> val : map.entrySet()) {
            System.out.println("Element " + val.getKey() + " "
                               + "occurs"
                               + ": " + val.getValue() + " times");
        }
    }
        public static void main(String[] args) {
     	List<Integer> nameList= Arrays.asList(1,5,2,1,2,6,7,1);
        Occurances(nameList);

}
}
