package marks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mark {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of students : ");
		int n=Integer.parseInt(br.readLine());
		int []a = new int[n];
		int i,j;
		System.out.println("Enter the marks of Students : ");
		for(i=0;i<n;i++) {
			a[i]=Integer.parseInt(br.readLine());
		}
		for(i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("\nThe priority of marks is");
		for(i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}		
}
