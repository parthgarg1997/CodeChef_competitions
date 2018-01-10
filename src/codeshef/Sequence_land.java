import java.util.ArrayList;
import java.util.Scanner;
public class Sequence_land {
public static void main(String[] args)
{
	ArrayList<ArrayList<Integer>> people= new ArrayList<ArrayList<Integer>>(0);
	int No_relatives=0;
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int k=scan.nextInt();
	for(int i=0;i<n;i++)
	{  people.add(new ArrayList<Integer>());
		int no=scan.nextInt();
		for(int j=0;j<no;j++)
		{ 
			people.get(i).add(scan.nextInt());
		}
	}
	ArrayList<ArrayList<Integer>> relatives =new ArrayList<ArrayList<Integer>>();
	relatives.add(people.get(0));
	No_relatives++;
	people.remove(0);
	while(!relatives.isEmpty()&&!people.isEmpty())
	{
		for(int j=0;j<people.size();j++)
		{  int q=0;
	
			for(int i=0;i<relatives.get(0).size();i++)
			{  int b=(Integer)(relatives.get(0).get(i));
				 if(people.get(j).contains((Integer)(relatives.get(0).get(i))))
				 {
					 ++q;
				 if(q>=k)
				 {
					 relatives.add(people.get(j));
						No_relatives++;
						people.remove(j);
						j--;
						break;
				 }
				 }
					
			}
		}
		relatives.remove(0);
	}
	System.out.println(No_relatives);
	scan.close();
}
}
