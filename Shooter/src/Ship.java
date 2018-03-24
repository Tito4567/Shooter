import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class Ship extends JPanel 
{
	private double x;
	private double y;
	private double x1;
	private double y1;
	public double rotate = 0;
	BufferedImage image, image1;
		
	private static final long serialVersionUID = 1L;

	public Ship() 
	{
	  	 try
         {       
          image = ImageIO.read(new File("C:/Users/Tito/Documents/ship2.png"));
          image1 = ImageIO.read(new File("C:/Users/Tito/Pictures/2014-08-13/016.jpg"));
          // "C:/Users/Tito/Documents/ship1.jpg"
                    
         } catch(IOException r)
         {
            System.out.println(r);
         }
	 }
    
   protected void paintComponent(Graphics g) 
   {
	   AffineTransform at = AffineTransform.getTranslateInstance(x1, y1);
	   AffineTransform at1 = AffineTransform.getTranslateInstance(x, y);
	   if (x > 981) { x = 0; }
	   else if (y > 981) { y = 0; }
	   else if (x < 0) { x = 981; }
	   else if (y < 0) { y = 981; }
	   at.scale(.25, .25);
	   at1.scale(.70, .70);
	   at.rotate(Math.toRadians(180), image.getWidth()/2, image.getHeight()/2);
	   at1.rotate(Math.toRadians(360.00 - rotate), image1.getWidth()/2, image1.getHeight()/2);
	   Graphics2D g2d = (Graphics2D) g;
	   g2d.drawImage(image, at, null);
	   g2d.drawImage(image1, at1, null);
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
	   this.x1 = d;
   }
   
   public void Ycoor(double e)
   {
	   this.y1 = e;
   }
   
}



