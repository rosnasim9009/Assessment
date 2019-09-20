package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gold {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the kgs of gold");
		int n=Integer.parseInt(br.readLine());
		int idol=n;
		while(n>=5) {
			
			n/=5;
			idol+=n;
		}
		System.out.println("Number of Sculptors can be made is "+idol);
	}
}
