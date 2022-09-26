package JUnitepackage;

public class Arraydemo {

	public static void main(String[] args) {
		//1dimensinal array
//		int num[] = {8,12,15,30,145,1234,467};
//		num[0] = 8;
//		num[1] = 9;
//		num[2] = 12;
//		num[3] = 1234;
//		num[5] = 467;
//		for (int i =0; i < 6; i++) {
//			System.out.println(num[i]);
		//2d array
		
		int d[][]= {
//				{1,2,3,4},
//				{7,8,9,10},
//				{12,15,13,16},
////				{3,4,67,80}
				
				{1},
				{1,2},
				{1,2,3},
				{1,2,3,4},       //jagged array//multi d array
				{1,2,3,4,5},
				{1,2,3,4,5,6},
				{1,2,3,4,5,6,7},

				
				
		};
		
		for(int i=0;i<7;i++)
		{//row
			for(int j=0;j<=i;j++)//col
		{
			System.out.print(" " + d[i][j]);
		}
			System.out.println();
		}

		}
}

	


