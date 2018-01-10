
public class team_selection {
	 
  public static void main(String args[])
  {
	  team_selection hell = new team_selection();
	  int d=hell.hello(6);
	  System.out.println(d);
  }
 
  public int hello(int x)
  {
	  if(x==0)
		  return 0;
	  if(x==1)
		  return 1;
	  int c=hello(x-1)+hello(x-2);
	 
	  return c;
  }
}
