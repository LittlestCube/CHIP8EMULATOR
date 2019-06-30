public class CPU {
	
	static int opcode;
	static byte[] CPUMem = new byte[0x1000];
	static byte[] V = new byte[0x10];
	static int I;
	static int pc;
	static byte[] gfx = new byte[64 * 32];
	static byte delayTimer;
	static byte soundTimer;
	static int[] stack = new int[0x10];
	static int sp;
	static byte[] key = new byte[0x10];

}