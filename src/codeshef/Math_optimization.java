
import java.math.BigDecimal;
import java.math.RoundingMode;
public class Math_optimization {
	private static double bd,ba;
	public static double z_value(double x)
	{
		double z=x*Math.log10(x)-1.2;
		return z;
	}
public static void main(String[] args)
{ double x,y=0,z=0,l,m,o=0,d;

    l=m=z;
    l=-100.0;
    m=100;
	
     for(x=0.1;x<20.0;x+=0.1)
	{  
		z=z_value(x);
		if(z<0.0)
		{ if(z>l)
		{
			l=z;	
			y=x;
		}
		}
		if(z>0.0&&z<m)
		{
			m=z;
			o=x;
		}
	}
     y=(double)Math.round(y*10.0)/10.0;
     o=(double)Math.round(o*10.0)/10.0;
     while(true)
     {
	double k=(y+o)/2.0;
	z=z_value(k);
	if(z<0.0)
	{
	    y=k;
	   // System.out.print("y="+y+"   ");
	    bd=(int)(y*1000000);
	}
	if(z>0.0)
	{
		o=k;
		//System.out.println(o);
	    ba=(int)(o*1000000);
	}
	System.out.println(y+"  "+o);
	//System.out.println(bd+" "+ba);
	if(bd==ba)
	{
	break;
	}
	}
}
}
