package selenium_project;

public class MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String arr3[]= {"rocky","john","rock"};
		
		for(int i=0; i< arr3.length;i++) {
				String num=arr3[i];
				
			for(int j=0; j<num.length();j++) {
			//	System.out.println(j);
				//if print charater of word used charAt[index] method
				System.out.println(num.charAt(j));
				}
			//System.out.println(arr3[i]);
			System.out.println();
		}
		
	}

}
