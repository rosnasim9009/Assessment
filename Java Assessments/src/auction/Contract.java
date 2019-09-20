package auction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Contract {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of Applications : ");
		int n=Integer.parseInt(br.readLine());
		int []bid = new int[n];
		int i;
		System.out.println("Enter the amount(in crores)");
		for(i=0;i<n;i++) {
			bid[i]=Integer.parseInt(br.readLine());
		}
		int max=bid[0];
		for(i=1;i<n;i++) {
			if(max<bid[i]) 
				max=bid[i];
		}
		System.out.println("The winning bid is "+max+" crores");
	}

}
