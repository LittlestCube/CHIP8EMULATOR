package com;

import javax.swing.*;
import java.awt.image.*;
import java.awt.*;

public class MainGUI {
	
	static JFrame frame = new JFrame("CHIP-8");
	
	public void init() {
		frame.setSize(64, 32);
		frame.setVisible(true);
		BufferedImage bi = new BufferedImage(64, 32, BufferedImage.TYPE_INT_ARGB);
		bi.setRGB(20, 20, 80);
		frame.add(bi);
	}
	
}