import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Weapon implements KeyListener 
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
	

}
