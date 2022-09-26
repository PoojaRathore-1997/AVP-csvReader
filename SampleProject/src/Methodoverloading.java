

 class  casio{
	 public void add(int i, int j)
	 {
		 System.out.println(i+j);
	 }
	 public void add(int i,int j, int k)
	 {
		 System.out.println(i+j+k);
	 }
	 public void add(double i, double j)
	 {
		 System.out.println(i+j);
	 }
 }
	
	
	
 public class Methodoverloading 
 {
	public static void main(String[] args) {
		casio obj  = new casio();
		obj.add(10, 20);
		obj.add(5, 15, 30);
		obj.add(4.5, 5.5);
		
				

	}

}
