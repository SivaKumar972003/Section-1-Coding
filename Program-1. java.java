

import java.util.Scanner;

class Calculator{
	double a,b;
	String oparation;
	
	public Calculator(double a,double b,String oparation)
	{
		this.a=a;
		this.b=b;
		this.oparation=oparation;
	}
	
	public void calcuate() {
		switch(oparation.toLowerCase())
		{
		case "add":
			{
			 System.out.println("Result:"+(a+b));
			 break;
			}
		case "subtract":
		{
			System.out.println("Result:"+(a-b));
			break;
		}
		case "multiply":
		{
			System.out.println("Result:"+(a*b));
			break;
		}
		case "divide":
		{
			if(b!=0)
			{
			System.out.println("Result:"+(a/b));
			}else {
				System.out.println("division for zero");
			}
			break;
		}
		default:
			{
				System.out.println("Invalid oparations");
			}
		}
	}
}
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		double a=scan.nextDouble();
		double b=scan.nextDouble();
		scan.nextLine();
		String oparation=scan.nextLine();
		
		Calculator cal=new Calculator(a,b,oparation);
		
		cal.calcuate();
		
	}

}
