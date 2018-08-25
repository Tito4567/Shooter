import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class Ship extends JPanel 
{
	private double x = 0;
	private double y = 0;
	
	// Below is the numerical setup for location of the energy weapon's fire
	private double imx = x + 190;
	private double imy = y + 18;
	
	// Above is the numerical setup for location of the energy weapon's fire
	private double x1 = 670;
	private double y1 = 0;
	public double rotate = 0;
	public double rotate1 = 0;
	BufferedImage image[] = new BufferedImage[4]; 
	Image icon;
		
	private static final long serialVersionUID = 1L;

	
	public Ship() 
	{
		
		setBackground(Color.BLUE);
		
	  	 try
         {
	  		 
          image[0] = ImageIO.read(new File("C:/Users/Kaylard/Desktop/Shooter-master/Shooter/images/Archangel-Michael.jpg"));
          image[1] = ImageIO.read(new File("C:/Users/Kaylard/Desktop/Shooter-master/Shooter/images/Ship.png"));
          image[2] = ImageIO.read(new File("C:/Users/Kaylard/Desktop/Shooter-master/Shooter/images/space.jpg"));
          image[3] = ImageIO.read(new File("C:/Users/Kaylard/Desktop/Shooter-master/Shooter/images/Fire.jpg"));
          // "C:/Users/Tito/Documents/ship1.jpg"
                    
         } catch(IOException r)
         {
            System.out.println(r.getMessage());
         }
	 }
	

    
   protected void paintComponent(Graphics g) 
   {
	   AffineTransform at = AffineTransform.getTranslateInstance(x1, y1);
	   AffineTransform at1 = AffineTransform.getTranslateInstance(x, y);
	   AffineTransform bg = AffineTransform.getTranslateInstance(0, 0);
	   AffineTransform attempt = AffineTransform.getTranslateInstance(imx, imy);
	   if (x > 981) { x = 0; }
	   else if (y > 981) { y = 0; }
	   else if (x < 0) { x = 981; }
	   else if (y < 0) { y = 981; }
	   else if (x1 > 981) { x1 = 0;}
	   else if (y1 > 981) { y1 = 0; }
	   else if (x1 < 0) { x1 = 981; }
	   else if (y1 < 0) { y1 = 981; }
	   at.scale(.70, .70);
	   at1.scale(.25, .25);
	   bg.scale(.70,.70);
	   attempt.scale(.15, .15);
	   //at.rotate(Math.toRadians(180), image.getWidth()/2, image.getHeight()/2);
	   //at1.rotate(Math.toRadians(360.00 - rotate), image1.getWidth()/2, image1.getHeight()/2);
	   at1.rotate(Math.toRadians(360.00 - rotate), image[1].getWidth()/2, image[1].getHeight()/2);
	   at.rotate(Math.toRadians(360.00 - rotate1), image[0].getWidth()/2, image[0].getHeight()/2);
	   
	   // just added: 
	   Graphics2D gd = (Graphics2D) g;
	   Graphics2D gd1 = (Graphics2D) g;
	   Graphics2D g2d = (Graphics2D) g;
	   Graphics2D trying = (Graphics2D) g;
	   //g.drawImage(image2, 0,0, null );
	   //super.paintComponent(g);
	   gd1.drawImage(image[2], bg, null);
	   g2d.drawImage(image[0], at, null);
	   trying.drawImage(image[3], attempt, null);
	   gd.drawImage(image[1], at1, null);
   }
   
   
   public void Xcoor1(double d)
   {
	   this.x += d;	   
   }
   
   public void Ycoor1(double e)
   {
	   this.y += e;
   }
   
   public void Xcoor(double d)
   {
	   this.x1 += d;
   }
   
   public void Ycoor(double e)
   {
	   this.y1 += e;
   }
}



