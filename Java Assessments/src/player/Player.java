package player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Player {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of Players : ");
		int n=Integer.parseInt(br.readLine());
		int []foul = new int[n];
		int i;
		System.out.println("Enter the number of fouls made by each player");
		for(i=0;i<n;i++) {
			foul[i]=Integer.parseInt(br.readLine());
		}
		int min=foul[0];
		int ind=0;
		for(i=1;i<n;i++) {
			if(min>foul[i]) {
				min=foul[i];
				ind=i;
			}
		}
		System.out.println("The eligible player is player no:"+ ++ind+"("+min+" fouls)");

	}

}
