package Resume;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;

	public class Resume {
		String name;
		int age;
		String degree;
		String branch;
		String contactNo;
		
		public Resume(String name,int age,String degree,String branch,String contactNo) {
			this.name=name;
			this.age=age;
			this.degree=degree;
			this.branch=branch;
			this.contactNo=contactNo;
		}
		public void display(String name,int age,String degree,String branch,String contactNo) {
			System.out.println("\nName	: "+name);
			System.out.println("Age	: "+age);
			System.out.println("Degree  : "+degree);
			System.out.println("Branch  : "+branch);
			System.out.println("Contact : "+contactNo);
		}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name : ");
		String name=br.readLine();
		System.out.println("Enter your Age  : ");
		int age=Integer.parseInt(br.readLine());
		System.out.println("Enter your Degree : ");
		String degree=br.readLine();
		System.out.println("Enter your Branch : ");
		String brn=br.readLine();
		System.out.println("Enter your Contact Number : ");
		String no=br.readLine();
		
		Resume r=new Resume(name,age,degree,brn,no);
		r.display(name,age,degree,brn,no);		
	}

}
