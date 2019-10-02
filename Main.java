import java.io.*;

public class Main {
	
	static MainGUI gui = new MainGUI();
	static CPU chip8 = new CPU();
	
	public static void main(String args[]) {
		gui.init();
		// Set up render system and register input callbacks
		gui.setupGraphics();
		chip8.setupInput();
		
		// Initialize the Chip8 system and load the game into the memory  
		chip8.init();
		chip8.loadGame(new File("file"));
		
		// Emulation loop
		while(true)
		{
			// Emulate one cycle
			chip8.emulateCycle();
			
			// If the draw flag is set, update the screen
			if(chip8.drawFlag) {
				gui.drawGraphics();
			}
			
			// Store key press state (Press and Release)
			chip8.setKeys();	
		}
	}
}