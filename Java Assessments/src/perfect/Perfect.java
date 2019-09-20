package perfect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Perfect {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number : ");
		int n=Integer.parseInt(br.readLine());
		System.out.print("The divisors of the number are ");
		int i,sum=0;
		for(i=1;i<n;i++) {
			if(n%i==0) {
				System.out.print(" "+i+" ");
				sum+=i;
			}
		}
		
		System.out.println("\nThe sum of the divisors are "+sum);
		if(n==sum) System.out.println("Perfect Number");
		else System.out.println("Not a Perfect Number");
	}

}
