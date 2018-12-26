import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*import javax.imageio.ImageIO;
import javax.swing.ImageIcon;*/
import javax.swing.JFrame;
import javax.swing.Timer;
import com.exlumina.j360.ButtonListener;
import com.exlumina.j360.Controller;
import com.exlumina.j360.ValueListener;

public class Shooter1 extends JFrame implements ActionListener, ButtonListener
{

	private static final long serialVersionUID = 1L;
	
	ExecutorService executor = Executors.newCachedThreadPool();
	Ship ship = new Ship();
	KBController con = new KBController();
	KBController con1 = new KBController();	
	Weapon weap = new Weapon();
	Controller c1 = Controller.C1;
    Controller c2 = Controller.C2;
    Controller c3 = Controller.C3;
    Controller c4 = Controller.C4; 
	
		

	public static void main(String[] arg) throws InterruptedException
	{
		new Shooter1();
		
	}
	
	Shooter1()
	{
		
		//setIconImage(new ImageIcon("Images/Archangel-Michael.jpg").getImage());
		
		
		/* PLEASE COME BACK TO BELOW
		 * FOR SOME REASON THE IMAGE 
		 * ICON IS NOT WORKING!!!!!!!
		 *
		 *
		 *
		 *
		 */
		
		
		//setIconImage(new ImageIcon(getClass().getClassLoader().getResource("Archangel-Michael")));
		Timer time = new Timer (1, this);
		time.start();
		setVisible(true);
		setSize((int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(), (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addKeyListener(con);
		addKeyListener(con1);
		//addKeyListener(weap);
		
		
				
		
		c1.buttonX.addButtonPressedListener(new ButtonListener() 
		{

			@Override
			public void button(boolean arg0)
			{
				System.out.println("X pressed");
				
			}});
		c1.buttonY.addButtonPressedListener(new ButtonListener()
		{

			@Override
			public void button(boolean arg0) 
			{
				System.out.println("Y Button pressed");
				
			}});
		
		c1.buttonB.addButtonPressedListener(new ButtonListener()
		{

			@Override
			public void button(boolean arg0) 
			{
				System.out.println("B Button pressed");				
			}
			
		});
		
		c1.buttonA.addButtonPressedListener(new ButtonListener()
		{

			@Override
			public void button(boolean arg0) 
			{
				System.out.println("A Button pressed");				
			}
			
		});
		
		Controller.C1.leftThumbY.addValueChangedListener(new ValueListener() 
		{

			@Override
			public void value(int arg0)
			{
				System.out.println("Y coordinates");
				System.out.println(arg0);
				
			}
			
		});
		
		Controller.C1.leftThumbX.addValueChangedListener(new ValueListener() 
		{

			@Override
			public void value(int arg0)
			{
				System.out.println("X coordinates");
				//double a = (arg0/8000);
				//int e = (int) Math.floor(a);
				//System.out.println(e);
				//con.x = (double) arg0;
				System.out.println(arg0);
			}
			
		});
		
		c2.buttonX.addButtonPressedListener(new ButtonListener() 
		{

			@Override
			public void button(boolean arg0)
			{
				System.out.println("X pressed");
				
			}});
	c2.buttonY.addButtonPressedListener(new ButtonListener()
		{

			@Override
			public void button(boolean arg0) 
			{
				System.out.println("Y Button pressed");
				
			}});
		
		c2.buttonB.addButtonPressedListener(new ButtonListener()
		{

			@Override
			public void button(boolean arg0) 
			{
				System.out.println("B Button pressed");				
			}
			
		});
		
		c2.buttonA.addButtonPressedListener(new ButtonListener()
		{

			@Override
			public void button(boolean arg0) 
			{
				System.out.println("A Button pressed");				
			}
			
		});
		
		Controller.C2.leftThumbY.addValueChangedListener(new ValueListener() 
		{

			@Override
			public void value(int arg0)
			{
				//System.out.println("Y coordinates");
				//System.out.println(arg0);
				
			}
			
		});
		
		Controller.C2.leftThumbX.addValueChangedListener(new ValueListener() 
		{

			@Override
			public void value(int arg0)
			{
				
				//System.out.println("X coordinates");
				double a = (arg0/8000);
				//double e = Math.floor(a);
				System.out.println(a);
				ship.Xcoor1(a);
			}
			
		});
       
		
		// c2.buttonX.addButtonPressedListener(this);
        // c3.buttonX.addButtonPressedListener(this);
        // c4.buttonX.addButtonPressedListener(this);
		//add(ship);
		//remove(ship);
		Bootstrapper boot = new Bootstrapper();
		add(boot);
		//add(ship);
		boot.removePanel(this, boot, ship, con1);
		
		
		// Tito remove below
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		repaint();
		
		ship.Xcoor1(con.xCoor()); 
		ship.Ycoor1(con.yCoor());
		ship.Xcoor(con1.x1Coor());
		ship.Ycoor(con1.y1Coor());
		ship.rotate = con.angle;

		// just added below
		ship.rotate1 = con1.angle1;
	}
	

	@Override
	public void button(boolean arg0)
	{
		System.out.println("It works!!!");	
		
	}

}
