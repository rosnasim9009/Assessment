package vehicle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vehicle {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of Vehicles : ");
		int n=Integer.parseInt(br.readLine());
		int []foul = new int[n];
		int i;
		System.out.println("Enter the fare collected for each vehicles");
		for(i=0;i<n;i++) {
			foul[i]=Integer.parseInt(br.readLine());
		}
		int c1=0,c2=0;
		for(i=0;i<n;i++) {
			if(foul[i]>50)
				c1++;
			if(foul[i]<50&&foul[i]!=0)
				c2++;
		}
		
		System.out.println("Number of heavy vehicles "+c1+" and the number of light weight vehicles is "+c2);
	}

}
