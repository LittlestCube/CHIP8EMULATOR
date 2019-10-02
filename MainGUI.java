import javax.swing.*;
import java.awt.image.*;
import java.awt.*;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.embed.swing.JFXPanel;

public class MainGUI extends Main {
	
	static JFrame frame = new JFrame("CHIP-8");
	static GraphicsContext gc;
	
	public void init() {
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(320, 160);
		frame.setVisible(true);
		BufferedImage bi = new BufferedImage(64, 32, BufferedImage.TYPE_INT_ARGB);
		bi.setRGB(20, 20, 80);
		Image is = bi.getScaledInstance(320, 160, Image.SCALE_DEFAULT);
		frame.getContentPane().add(new JLabel(new ImageIcon(is)));
	}
	
	public void setupGraphics() {
		// todo
	}
	
	public void drawGraphics() {
		// todo
	}
}