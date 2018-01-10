package codeshef;

import java.awt.Point;
import java.util.HashMap;
import java.util.Scanner;
public class TEST_ABC_STRING {
	
	public static boolean debug = false;
	static Scanner scan=new Scanner((System.in));
//	public static Writer out = new Writer();
	
	public static void main(String[] args) {
		String s = scan.nextLine();
		
		HashMap<Point, Long> map = new HashMap<>();
		
		final int n = s.length();
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		long total = 0;
		
		for(int i=0; i<n; i++) {
			char cs = s.charAt(i);
			
			if(cs=='A') {
				a++;
			} else if(cs=='B') {
				b++;
			} else {
				c++;
			}
			
			Point pair = new Point(a-b, a-c);
			
			long prev = map.containsKey(pair) ? map.get(pair) : 0;
			System.out.println(s.charAt(i)+"\t"+(a-b)+"\t"+(a-c));
			if(a==b && b==c) {
				total++;
			}
			total += prev;
			System.out.println(total);
			map.put(pair, prev+1);
		}
		
		System.out.println(total);
	}
}
