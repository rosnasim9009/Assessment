package fact;

import java.io.*;

public class Factorial {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number alphabets in your name");
		int n=Integer.parseInt(br.readLine());
		int f=1;
		for(int i=1;i<=n;i++)
			f=f*i;
		System.out.println("The number of combination is "+f);
		
	}

}
