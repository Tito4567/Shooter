import java.awt.event.ActionListener;

import com.exlumina.j360.ButtonListener;
import com.exlumina.j360.Controller;
import com.exlumina.j360.ValueListener;

public abstract class XBoxController implements ActionListener, ButtonListener  
{
	public double x = 0; 
	private double y = 0;
	private double x1 = 0;
	private double y1 = 0;		
	public double angle = 0;
	public double angle1 = 0;
	
	Controller c1 = Controller.C1;
    Controller c2 = Controller.C2;
    Controller c3 = Controller.C3;
    Controller c4 = Controller.C4;
    
    
    XBoxController()
    {
    	Controller.C1.leftThumbX.setLogMinMax(-5, 5);
		Controller.C2.leftThumbX.setLogMinMax(-5, 5);
		Controller.C3.leftThumbX.setLogMinMax(-5, 5);
		Controller.C4.leftThumbX.setLogMinMax(-5, 5);
		
		Controller.C1.leftThumbY.setLogMinMax(-5, 5);
		Controller.C2.leftThumbY.setLogMinMax(-5, 5);
		Controller.C3.leftThumbY.setLogMinMax(-5, 5);
		Controller.C4.leftThumbY.setLogMinMax(-5, 5);
	
    
    
    }
    
    
    

}