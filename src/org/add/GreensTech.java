package org.add;

public class GreensTech {
private void greensOmr(String name,int id)
{
	System.out.println("Name: "+name );
System.out.println("Id: "+id);
System.out.println("");
}
private void greensOmr(int id, String name, double salary) {
	
	System.out.println("Id: "+id );
	System.out.println("Name: "+name);
	System.out.println("Salary: "+salary);
	System.out.println("");
}
private void greensOmr(double salary,String name,int id,long phn) {
	
	System.out.println("Salary: "+salary );
	System.out.println("Name: "+name);
	System.out.println("Id: "+id);
	System.out.println("Phone no: "+phn);
	System.out.println("");
}

public static void main(String[] args) {
	GreensTech gt=new GreensTech();
	gt.greensOmr("Greens", 1234);
	gt.greensOmr(9876, "John", 18000.60);
	gt.greensOmr(20000.89,"Rachel", 5674,9876543212l);
}





}
