import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import java.awt.Font;

class Bootstrapper extends JPanel
{
	KBController cn = null;
	Shooter1 shoot = null;
	Bootstrapper booter = null;
	Ship shp = null; 
	int[] input = {0};
	
	private static final long serialVersionUID = 1L;
	
	Button b = new Button("Xbox controller");
	Button c = new Button("Keyboard");
	
	public Bootstrapper() 
	{
		b.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				shoot.remove(booter);
				shoot.add(shp);
				shoot.addKeyListener(cn);
			}
			
		});
		
		c.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				input[0] = 2;			
			}
			
		});
		add(b);
		add(c);
	}
	
	protected void paintComponent(Graphics g) 
	{		
		g.setFont(new Font("TimesRoman", Font.PLAIN, 100));
		g.drawString("Enter keyboard or gamepad", 450, 100);
	}
	
	
	public void removePanel(Shooter1 a, Bootstrapper b, Ship c, KBController d)
	{
		this.shoot = a;
		this.booter = b;
		this.shp = c;
		this.cn = d;
	}
	
	
}	