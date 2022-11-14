/**
 *  @author: Yoochel
 * 	@date: 
 * 
 * 
 * */

import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.swing.*;
import javax.imageio.ImageIO;
 
public class HolaMundo {
 
	public static void main(String[] arguments) throws IOException 
  {
 
    JPanel panel = new JPanel();
 
    BufferedImage image = ImageIO.read(new File("./takatsuki_yayoi_hello_world.jpg"));
    JLabel label = new JLabel(new ImageIcon(image));
    panel.add(label);
 
    panel.setPreferredSize(new Dimension(640, 480));
    JFrame frame = new JFrame("Yayoi, Hola mundo");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    
    frame.add(panel); 
 
    frame.pack();
    frame.setVisible(true);
     
  }
}
 
