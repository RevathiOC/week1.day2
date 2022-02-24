package week1.day2;
//Assignment 2

public class Calculator {
static int Sum;
static int Sub;
static double Mul;
static float Div;
public int add(int N1,int N2,int N3) {
Sum=N1+N2+N3;
	
	System.out.println("sum="+Sum);
	return(N1+N2+N3);
}
public int sub(int N1,int N2) {
	Sub=N1-N2;
	
	System.out.println("sub="+Sub);
	return(N1-N2);
	
}
public double mul(double N1,double N2) {
	Mul=N1*N2;
	System.out.println("Multiplication="+Mul);
	return(N1*N2);
	
}
public float divide(float N1,float N2) {
	Div=N1/N2;
	System.out.println("division="+Div);
	return(N1/N2);
	
}
	

}


