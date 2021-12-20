package com.leftRotate;

public class LeftRotation {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5};
		int d =2;
		
		System.out.println("original array is : ");	
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
        for(int i=0; i<d ; i++) {
        	
        	int j=0;
        	int firstValue =arr[0];
        	for( j=0; j<arr.length-1; j++) {      		
        		arr[j] = arr[j+1];
        	}
        	arr[j]= firstValue;
        }
        System.out.println("Array after left rotation: ");  
        for(int i = 0; i< arr.length; i++){  
            System.out.print(arr[i]);  
        }  
	}

}
