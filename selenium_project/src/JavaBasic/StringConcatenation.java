package JavaBasic;

import java.util.Iterator;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arr();
		String[] arr= {"rahi","axedw","rdexe"};
	
		for(int i=0; i< arr.length;i++) {
			System.out.println(arr[i]);
			
		}
		
		int[] num=new int[3];
		num[0]=1;
		num[1]=2;
		
		
	//two major disadvantage of array 
	//1->array size is fixed-- TO OverCome on this problem we used collections eg arraylist, hashtable
	//2-> array store same data value --To OverCome this problem we used object Array
		
		
		//object is super classes of all class
		//object is class
		
		Object obj[]=new Object[6];
		
		obj[0]="pawan";
		obj[1]=23;
		obj[2]=5.5;
		obj[3]="QA";
		obj[4]="New York";
		obj[5]="12lac";
		
		for(int i=0; i< obj.length;i++) {
			System.out.println(obj[i]);
		}
		
	}
	
	public static void arr() {
		
		for(int i=0; i<3;i++) {
			for(int j=0; j<5;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
	}

};


