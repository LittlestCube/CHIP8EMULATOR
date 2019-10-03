import javax.swing.*;
import java.awt.image.*;
import java.awt.*;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.embed.swing.JFXPanel;

public class MainGUI extends JPanel {
	
	static JFrame frame = new JFrame("CHIP-8");
	static BufferedImage bi;
	static GraphicsContext gc;
	static final int width = 64;
	static final int height = 32;
	
	public void init() {
		frame.add(this);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(320, 160);
	}
	
	public void setupGraphics() {
		bi = new BufferedImage(64, 32, BufferedImage.TYPE_INT_ARGB);
		bi.setRGB(20, 20, 80);
		Image is = bi.getScaledInstance(320, 160, Image.SCALE_DEFAULT);
		int[] pixels = new int[width * height];
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				pixels[x + y * width] = 0xff00ff;
			}
		}	
		final int[] a = ( (DataBufferInt) bi.getRaster().getDataBuffer() ).getData();
		System.arraycopy(pixels, 0, a, 0, pixels.length);
		frame.setVisible(true);
	}
	
	public void drawGraphics() {
		// todo
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(bi, 0, 0, this);
	}
}