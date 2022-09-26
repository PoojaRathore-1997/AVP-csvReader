class Emp{
	int eid;
	int salary;
	String ceo;

public void show()
{
	System.out.println(eid + ":" +salary +":" +ceo);
}
}

public class Staticdemo {

	public static void main(String[] args) 
	{
		Emp Pooja= new Emp();
		Pooja.eid= 8;
		Pooja.salary= 50000;
		Pooja.ceo="Pushkar";
		
		Emp Rahul= new Emp();
		Rahul.eid= 9;
		Rahul.salary= 50000;
		Rahul.ceo="Pushkar"; // we don't need object
		
		Rahul.ceo="Arvind";
		
		Pooja.show();
		Rahul.show();
		
		
		
				

	}

}
