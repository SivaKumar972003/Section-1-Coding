import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
		
		int a=scan.nextInt();
		
		int limit=(a%2==0)?a-1:a;
		
		for(int i=0;i<limit;i++)
		{
			int number=2*i+1;
			System.out.print(number);
			if(i<limit-1)
			{
				System.out.print(",");
			}
		}

	}

}