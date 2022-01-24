package selenium_project;

import java.util.ArrayList;

public class javaBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//array 
		
		int [] arr=new int[3];
		arr[0]=12;
		arr[1]=13;
		arr[2]=14;
		
		int arr2[]= {};
		//another ways create array
		
		int[] arr1={12,12,33};
		//System.out.println(arr1[1]);
		String arr3[]= {"rocky","john","rock"};
		
		for(int i=0; i< arr3.length;i++) {
				String num=arr3[i];
				
			for(int j=0; j<num.length();j++) {
			//	System.out.println(j);
				System.out.println(num.charAt(j));
				}
			//System.out.println(arr3[i]);
		}
		
		
		//for each loop
		String names[]= {"rahul","rohan","rck"};
		for(String name:names) {
			
			//System.out.println(name);
				}
		
		int[] num= {12,1,13,14,15,0,4,5,56,55};
		//check num multiple of 2
		
		for(int i=0;i<num.length;i++) {
			if(num[i] % 2==0) {
				System.out.println(num[i]);
			}
		}
		
		//arraylist and array difference 
		//if you want to used method of class you need to create object of class  then you used method eg(obj.method)
		ArrayList< String>s=new ArrayList<String>();
			
		
		//String is a object its represent character
		//how many way to declare string 
		//1 using literal 2) using new memory allocate operator
		
		String ss="roaffs";//string literal
		String ss3="roaffs";  //both string have data then in back side java store it in one place
		String ss2=new String("hsfsda");	//using new operator
		
		
		
		
		
	}

}
