import java.util.*;

public class Program4 {
	
	public static void countNumbers(int[] arr)
	{
		LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
		
		for(int i=1;i<=9;i++)
		{
			map.put(i,0);
		}
		for(int num:arr)
		{
			for(int i=1;i<=9;i++)
			{
				if(num%i==0)
				{
					map.put(i,map.get(i)+1);
				}
			}
		}
		System.out.print("{");
		for(int i=1;i<=9;i++)
		{
			System.out.print(i+":"+map.get(i)+" ");
		}
		System.out.print("}");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		countNumbers(arr);

	}

}
