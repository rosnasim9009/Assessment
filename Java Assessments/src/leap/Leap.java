package leap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leap {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a Year");
		int n=Integer.parseInt(br.readLine());
		if(n%4==0&&n%100!=0||n%400==0)
			System.out.println("It is a leap year");
		else 
			System.out.println("It is not a leap year");
	}
}
