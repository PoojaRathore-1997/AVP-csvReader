package JUnitepackage;

public class Objectdemo {
	int num1;
	int num2;
	int result;
	//method//
	public void perform() 
	{
		result = num1*num2;
	}

	public static void main(String[] args)
	{
		Objectdemo obj= new Objectdemo();//constructor bcz same name using class name
		obj.num1= 10;
		obj.num2=20;
		obj.perform();
		System.out.println(obj.result);
		
	}

}
