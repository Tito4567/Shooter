import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class KBController implements KeyListener
{
	public double x = 0; 
	private double y = 0;
	private double x1 = 0;
	private double y1 = 0;		
	public double angle = 0;
	public double angle1 = 0;
	
		
		
	
	@Override
	public void keyPressed(KeyEvent arg0)
	{
		//System.out.println(arg0.getKeyCode());
		//switch(switcher)
		//{
			//case 0: 
				
				if (38 == arg0.getKeyCode())
				{
					this.y--;
					//if (y < -6) {y = -5;}
					angle( arg0.getKeyCode());
				} else if (40 == arg0.getKeyCode())
					
				{
					this.y++;
					//if (y > 6) {y = 5;}
					angle(arg0.getKeyCode());
					
				} else if(39 == arg0.getKeyCode())
		
				{
					this.x++;
					//if (x > 6) {x = 5;}
					angle(arg0.getKeyCode());
				
				} else if (37 == arg0.getKeyCode())
		
				{
					this.x--;
					//if (x < -6) {x = -5;}
					angle(arg0.getKeyCode());
				}
				//	break;
				
			//case 1: 
				
				if (87 == arg0.getKeyCode())
				{
					this.y1--;
					//if (y1 < -6) {y1 = -5;}
					angleTwo( arg0.getKeyCode());
					
								
				} else if (83 == arg0.getKeyCode())
		
				{
					this.y1++;
					//if (y1 > 6) {y1 = 5;}
					angleTwo(arg0.getKeyCode());
					
				} else if(90 == arg0.getKeyCode())
		
				{
					this.x1++;
					//if (x1 > 6) {x1 = 5;}
					angleTwo(arg0.getKeyCode());
			
				} else if (65 == arg0.getKeyCode())
		
				{
					this.x1--;
					//if (x1 < -6) {x1 = -5;}
					angleTwo(arg0.getKeyCode());
				}
				
				
				// 	break;
	    //}
	}
	
	@Override
	public void keyReleased(KeyEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public double xCoor()
	{
		//System.out.println("xCoor "+this.getName());
		return this.x;
	}
	
	public double yCoor()
	{
		//System.out.println("yCoor "+this.getName());
		return this.y;
	}
	
	public double x1Coor()
	{
		//System.out.println("x1Coor "+this.getName());
		return this.x1;
	}
	
	public double y1Coor()
	{
		//System.out.println("y1Coor "+this.getName());
		return this.y1;
	}
	
	
	public void angle (int shift)
	{
		if (shift == 37 ) { angle = 180; }
		else if (shift == 39 ){ angle = 0; }
		else if (shift == 38 ){ angle = 90; }
		else if (shift == 40 ){ angle = 270; }
	}
	
	public void angleTwo (int shift)
	{
		if (shift == 87 ) { angle1 = 180; }
		else if (shift == 83 ){ angle1 = 0; }
		else if (shift == 90 ){ angle1 = 90; }
		else if (shift == 65 ){ angle1 = 270; }
	}
	
}