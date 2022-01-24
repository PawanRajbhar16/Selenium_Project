package JavaBasic;

public class Two_DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x[][]=new String[3][4];
		x[0][0]="A";
		x[0][1]="B";
		x[0][2]="C";
		x[0][3]="D";
		x[1][0]="A1";
		x[1][1]="B1";
		x[1][2]="C1";
		x[1][3]="D1";
		
		System.out.println(x.length);
		System.out.println(x[0].length);
		for(int i=0; i< x.length;i++) {
			
			
			for(int j=0; j < x[0].length;j++) {
				System.out.print(x[i][j]);
			}
			System.out.println();
		}
		
	}

}
