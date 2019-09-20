package combination;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Combination {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value of n : ");
		int n=Integer.parseInt(br.readLine());
		System.out.println("Enter the value of r : ");
		int r=Integer.parseInt(br.readLine());
		long nf=1,rf=1,nrf=1,i;
		
		for(i=1;i<=n;i++)
			nf*=i;
		for(i=1;i<=r;i++)
			rf*=i;
		for(i=1;i<=(n-r);i++)
			nrf*=i;

		System.out.println("The NCR factor for given values is "+(nf/(nrf*rf)));
		
	}

}
