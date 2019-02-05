import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
//import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
//import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Bootstrapper extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	KBController cn = null;
	Shooter1 shoot = null;
	Bootstrapper booter = null;
	Ship shp = null; 
	//int[] input = {0};
	
	
	Button b = new Button("Xbox controller");
	Button c = new Button("Keyboard");
	
	
	public Bootstrapper() 
	{
		//System.out.println(Toolkit.getDefaultToolkit().getScreenSize()+" Testing screen size");
		
				
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
					Thread.sleep(2000);
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
		try {Thread.sleep(2000);}catch(Exception e) {e.printStackTrace();}
		add(new Buttons(b, c), BorderLayout.NORTH);
		try {Thread.sleep(2000);}catch(Exception e) {e.printStackTrace();}
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
		try {Thread.sleep(2000);}catch(Exception e) {e.printStackTrace();}
		add(new JLabel(" "));
		add(new JLabel(" "));
		add(a);
		add(b);
		add(new JLabel(" "));
		add(new JLabel(" "));
	}
	
}

// Space Background class Bootstrapper
class SpaceBack extends JPanel
{
	
	
	// Below is a failed attempt to resize the background image to the JPanel. A better way was found
	/*private Image scaledImage(Image img, int width, int height ) 
	{
		BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2 = resizedImage.createGraphics();
		g2.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR );
		
		return resizedImage;
		
	}*/
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int swit = 0;

	protected void paintComponent(Graphics g) 
	{
		
		//super.paintComponent(g);
		//Graphics g2D = (Graphics2D) g; 
		
		BufferedImage image = null;
		Image resizedImage = null;
		
		try {
			//image = ImageIO.read(new File("Images/space.jpg"));
			image = ImageIO.read(getClass().getClassLoader().getResource("unnamed.jpg"));
			//setSize(new Dimension(image.getWidth(),image.getHeight()));
			
			//image2 = (BufferedImage) scaledImage(image, getWidth(), getHeight());
			resizedImage = image.getScaledInstance(getWidth(), getHeight(), BufferedImage.SCALE_SMOOTH);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		g.drawImage(resizedImage, 0, 0, this);
		g.setColor(Color.ORANGE);
		g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
		
		swit++;
		if(swit == 1) {g.drawString("This is a demonstration", (100), (getHeight()/2 - 50));}
		try {Thread.sleep(5000);}catch(Exception e) {e.printStackTrace();}
		
		
		String text = "This program is used to demonstrate";
		String text2 = "programming abilities of the";
		String text3 = "developer, Gilberto Rose";
		String text4 = "This program uses aspects of Java Standard Edition ";
		String text5 = "and Java Enterprise Edition. Please select";
		String text6 = "keyboard or Xbox360 controller above.";
		String text7 = "Enjoy the demo. Choose Keyboard or Controller.";
		
		switch(swit) 
		{
			/*case 4:
				//g.drawString("This is a demonstration", (100), (getHeight()/2 - 50));
				// Below attempt to pause thread doesn't seem to work
				//try {Thread.sleep(5000);}catch(Exception e) {e.printStackTrace();}
			break;*/
			
			case 2:
				g.drawString(text, (100), (getHeight()/2 - 100));
				g.drawString(text2, (100), (getHeight()/2) - 50);
				g.drawString(text3, (100), (getHeight()/2) - 0);
				// Below attempt to pause thread doesn't seem to work
				//try {Thread.sleep(5000);}catch(Exception e) {e.printStackTrace();}
			break;
			
			/*case 8:
				g.drawString(text, (100), (getHeight()/2 - 100));
				g.drawString(text2, (100), (getHeight()/2) - 50);
				g.drawString(text3, (100), (getHeight()/2) - 0);
			break;*/
			
			/*case 10:
				g.drawString(text, (100), (getHeight()/2 - 100));
				g.drawString(text2, (100), (getHeight()/2) - 50);
				g.drawString(text3, (100), (getHeight()/2) - 0);
			break;*/
			
			case 3:
				g.drawString(text4, (100), (getHeight()/2 - 100));
				g.drawString(text5, (100), (getHeight()/2) - 50);
				g.drawString(text6, (100), (getHeight()/2) - 0);
				// Below attempt to pause thread doesn't seem to work
				//try {Thread.sleep(5000);}catch(Exception e) {e.printStackTrace();}
			break;
			
			/*case 14:
				g.drawString(text4, (100), (getHeight()/2 - 100));
				g.drawString(text5, (100), (getHeight()/2) - 50);
				g.drawString(text6, (100), (getHeight()/2) - 0);
			break;
			
			case 16:
				g.drawString(text4, (100), (getHeight()/2 - 100));
				g.drawString(text5, (100), (getHeight()/2) - 50);
				g.drawString(text6, (100), (getHeight()/2) - 0);
			break;
			
			case 18:
				g.drawString(text4, (100), (getHeight()/2 - 100));
				g.drawString(text5, (100), (getHeight()/2) - 50);
				g.drawString(text6, (100), (getHeight()/2) - 0);
			break;*/
			
			case 4:
				g.drawString(text7, 100, 100);
				// Below attempt to pause thread doesn't seem to work
				//try {Thread.sleep(5000);}catch(Exception e) {e.printStackTrace();}
				break;
				
		}
		
	}
}