package week1.day1;

public class Mobile {
	String mobileBrandName="vivo";
	char mobileLogo='a';
	short noOfMobilePiece=2;
	int modelNumber=3;
	long mobileImeiNumber=123456345l;
	float mobilePrice=45000.17f;
	boolean isDamaged=false;
	
	public static void main(String[] args) {
		 
		Mobile as=new Mobile();
		System.out.println(as.mobileBrandName);
		System.out.println(as.mobileLogo);
		System.out.println(as.noOfMobilePiece);
		System.out.println(as.modelNumber);
		System.out.println(as.mobileImeiNumber);
		System.out.println(as.mobilePrice);
		System.out.println(as.isDamaged);
		
	}

}
