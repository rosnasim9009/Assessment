package height;

import java.io.*;

public class Height {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of students : ");
		int n=Integer.parseInt(br.readLine());
		float []a = new float[n];
		int i,j;
		System.out.println("Enter the heights of Students : ");
		for(i=0;i<n;i++) {
			a[i]=Float.parseFloat(br.readLine());
		}
		for(i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					float temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("\nThe heights in order are");
		for(i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}		

}
