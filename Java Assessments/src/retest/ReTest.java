package retest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReTest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of students : ");
		int n=Integer.parseInt(br.readLine());
		int []a = new int[n];
		int i,sum=0;
		System.out.println("Enter the marks of Students : ");
		for(i=0;i<n;i++) {
			a[i]=Integer.parseInt(br.readLine());
		}
		for(i=0;i<n;i++) {
			sum+=a[i];
		}
		int avg=sum/n;
		int count=0;
		for(i=0;i<n;i++) {
			if(a[i]<avg) {
				++count;
			}
		}
		System.out.println("Number of students appearing for retest is "+count);
	}
		
}