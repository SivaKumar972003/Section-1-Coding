import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int a=scan.nextInt();
		
		for(int i=0;i<a;i++)
		{
			int number=2*i+1;
			System.out.print(number);
			if(i<a-1)
			{
				System.out.print(",");
			}
		}

	}

}