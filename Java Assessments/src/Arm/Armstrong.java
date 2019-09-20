package Arm;

import java.io.*;

public class Armstrong {
	int num;
	
	public Armstrong(int num) {
		this.num=num;
	}
	
	public void check(int num)
	{
		int rem,no,sum=0;
		no=num;
		while(num!=0) {
			rem=num%10;
			sum=(int) (sum+Math.pow(rem, 3));
			num/=10;
		}
		if(no==sum)
			System.out.println("The given number is Armstrong");
		else
			System.out.println("The given number is not Armstrong");
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a Number : ");
		int num=Integer.parseInt(br.readLine());
		Armstrong arm=new Armstrong(num);
		arm.check(num);
	}

}
