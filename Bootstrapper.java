import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
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
		System.out.println(Toolkit.getDefaultToolkit().getScreenSize()+" Testing screen size");
		
				
		b.setSize(30, 50);
		
		b.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				
				shoot.remove(booter);
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				shoot.add(shp);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				//shoot.addKeyListener(cn);
				
			}
			
		});
		
		c.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("Button pushed, not action setup");			
			}
			
		});
		
		/*add(b);
		add(c);*/
		
		setLayout(new BorderLayout());
		add(new Buttons(b, c), BorderLayout.NORTH);
		//add(new TextField("Hello world"), BorderLayout.CENTER);
		add(new SpaceBack());
		
	}
	
	/*protected void paintComponent(Graphics g) 
	{
		g.setColor(Color.blue);
		int one = (int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth()*0.1);
		//System.out.println (Toolkit.getDefaultToolkit().getScreenSize().getWidth());
		int two = (int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight()*0.5);
		g.setFont(new Font("TimesRoman", Font.PLAIN, 100));
		g.drawString("Enter keyboard or gamepad", one, two);
	}*/
	
	
		
		
	
	
	
	public void removePanel(Shooter1 a, Bootstrapper b, Ship c, KBController d)
	{
		this.shoot = a;
		this.booter = b;
		this.shp = c;
		this.cn = d;
	}
}

// Below class used to for buttons selection. I will integrate it to the class above later
class Buttons extends JPanel
{

	private static final long serialVersionUID = 1L;
	
	public Buttons(Button a, Button b)
	{
		setLayout(new GridLayout(1,6));
		add(new JLabel(" "));
		add(new JLabel(" "));
		add(a);
		add(b);
		add(new JLabel(" "));
		add(new JLabel(" "));
	}
	
}

class SpaceBack extends JPanel
{
	protected void paintComponent(Graphics g) 
	{
		BufferedImage image = null;
		
		try {
			image = ImageIO.read(new File("C:/Users/Tito/Desktop/spacebackground.png"));
			//setSize(new Dimension(image.getWidth(),image.getHeight()));
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		g.drawImage(image, 0, 0, this);
	}
}