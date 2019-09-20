package addFact;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddFact {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number : ");
		int n=Integer.parseInt(br.readLine());
		int sum=0;
		if(n>0) {
			for(int i=1;i<=n;i++) {
				sum+=i;
			}
		}
		else {
			for(int i=1;i>=n;i--) {
				sum+=i;
			}
		}
		System.out.println("The sum is "+sum);
	}

}
