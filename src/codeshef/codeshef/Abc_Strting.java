package codeshef;

import java.util.HashMap;
import java.util.Scanner;

public class Abc_Strting {


	public static void main(String args[])
	{
		long count=0;
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		long a=0,b=0,c=0;
		HashMap<String,Integer>map=new HashMap<String,Integer>();
		map.put("00", 1);
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='A')
			a++;
			else if(str.charAt(i)=='B')
				b++;
			else if(str.charAt(i)=='C')
				c++;
			else 
				continue;
			long ab=a-b;
			long ac=c-b;
			System.out.println(""+ab+""+ac);
			if(!(map.containsKey(""+ab+""+ac)))
			{
				//System.out.println(str.charAt(i)+"\t"+ab+"\t"+ac);
				map.put(""+ab+""+ac,1);
			}
			else
			{
				//System.out.println(map.get(""+ab+""+ac));
				count+=map.get(""+ab+""+ac);
				map.put(""+ab+""+ac,map.get(""+ab+""+ac)+1 );
			}
		}
		System.out.println(count);
	}
}
