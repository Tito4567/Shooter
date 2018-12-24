import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import com.exlumina.j360.ButtonListener;
/*import com.exlumina.j360.Controller;
import com.exlumina.j360.ValueListener;*/

public class Weapon implements KeyListener, ButtonListener 
{

	@Override
	public void keyPressed(KeyEvent arg0) 
	{
		System.out.println(arg0.getKeyCode());
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	// added methods
	public void fire(int pos, double angle) 
	{
		// pos ship location
		// angle ship
		
	}

	@Override
	public void button(boolean arg0) {
		// TODO Auto-generated method stub
		
	}
	

}