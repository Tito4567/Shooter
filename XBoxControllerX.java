import com.exlumina.j360.ButtonListener;
import com.exlumina.j360.Controller;
import com.exlumina.j360.ValueListener;

public class XBoxControllerX implements ButtonListener, ValueListener  
{
	public double X = 0; 
	
	
	
	   
    
    @Override
	public void value(int arg0)
	{
		System.out.println("X coordinates "+arg0);
		//double a = (arg0/8000);
		//int e = (int) Math.floor(a);
		//System.out.println(e);
		//con.x = (double) arg0;
		//System.out.println(arg0);
		X = arg0;
		
		
	}

	@Override
	public void button(boolean arg0) 
	{
		System.out.println(arg0);
	}
    
}

class XBoxControllerY implements ValueListener, ButtonListener
{
	private double Y = 0;

	@Override
	public void value(int arg0)
	{
		System.out.println("Y is working "+ arg0);
		
		Y = arg0; 
	}

	@Override
	public void button(boolean arg0) 
	{
		System.out.println(arg0);
		
	}
	
}


