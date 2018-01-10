package kIIT_coding_weekend;

import java.util.Scanner;

public class Reverse {
public static void main(String args[])
{
	int i;
	Scanner scan=new Scanner(System.in);
	String str=scan.nextLine();
	String out="";
	for( i=0;i<str.length();i++)
	{//System.out.println(i);
		if(Character.isUpperCase(str.charAt(i)))
				{
			out+=Character.toLowerCase(str.charAt(i));
				}
		else
			out+=Character.toUpperCase(str.charAt(i));
	}
	System.out.println(out);
}
}
