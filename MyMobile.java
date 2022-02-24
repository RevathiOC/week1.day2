package week1.day2;
//Assignment 1


public class MyMobile {
	long TollFreeNumber=123123;
	float Balance=0.00f;
	static String Name="Rev";
	
	public void makeCall()
	{
		System.out.println("To know your balance please call "+TollFreeNumber);
	}
	public void sendMsg()
	{
		System.out.println("Your Mobile balance is "+Balance);
		
	}
	private void payBill()
	{
		System.out.println("Check your balance and Pay your bill now!");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMobile obj=new MyMobile();
		obj.makeCall();
		System.out.println("Hi"+Name);
		obj.sendMsg();
		obj.payBill();
		
			

	}

}
