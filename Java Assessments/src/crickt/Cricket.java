package crickt;

import java.io.*;

public class Cricket {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of Bowlers : ");
		int n=Integer.parseInt(br.readLine());
		float []runs=new float[n];
		float []balls=new float[n];
		float []eco=new float[n];
		int i,j;
		System.out.println("Enter the runs conceded by the bowlers");
		for(i=0;i<n;i++)
			runs[i]=Integer.parseInt(br.readLine());
		System.out.println("\nEnter the number of balls for each bowler");
		for(i=0;i<n;i++)
		{
			balls[i]=Integer.parseInt(br.readLine());
			balls[i]/=6;
		}
		System.out.println("\nEconomy of the bowlers is");
		float sum=0;
		for(i=0;i<n;i++) {
			eco[i]=runs[i]/balls[i];
			sum+=eco[i];
			System.out.println(eco[i]);
		}
		float avg=sum/n;
		System.out.println("\nThe overall economy of the team is "+avg);
		int count=0;
		for(i=0;i<n;i++) {
			if(eco[i]>=avg)
				count++;
		}
		System.out.println("The number of bowlers eligible are "+count);
	}
		
}
