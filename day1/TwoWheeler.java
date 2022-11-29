package week1.day1;

public class TwoWheeler
{
	int noOfWheels=2;
	short noOfMirrors=2;
	long chassisNumber=13255378389l;
	boolean isPunctured=false;
	String bikeName="herohonda";
	double runningKM=345.2;


	public static void main(String[] args) 
	{
		TwoWheeler wheeler=new TwoWheeler();
		System.out.println(wheeler.noOfWheels);
		System.out.println(wheeler.noOfMirrors);
		System.out.println(wheeler.chassisNumber);
		System.out.println(wheeler.isPunctured);
		System.out.println(wheeler.bikeName);
		System.out.println(wheeler.runningKM);


		
		


	}

}
