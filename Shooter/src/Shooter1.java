import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.Timer;
import javax.swing.JFrame;

public class Shooter1 extends JFrame implements ActionListener
{

	private static final long serialVersionUID = 1L;
	
	ExecutorService executor = Executors.newCachedThreadPool();
	Ship ship = new Ship();
	Controller con = new Controller();
	Controller con2 = new Controller();
		

	public static void main(String[] arg)
	{
		new Shooter1();
	}
	
	Shooter1()
	{
		Timer time = new Timer (1, this);
		time.start();
		setVisible(true);
		setSize(1000, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//con.start();
		//con2.start();
		addKeyListener(con);
		addKeyListener(con2);
		add(ship);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		repaint();
		ship.Xcoor1(con.xCoor()); 
		ship.Ycoor1(con.yCoor());
		ship.Xcoor(con2.x1Coor());
		ship.Ycoor(con2.y1Coor());
		ship.rotate = con.angle;
	}

}
