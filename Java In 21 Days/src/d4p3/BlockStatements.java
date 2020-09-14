package d4p3;

public class BlockStatements {

	void testBlock() {
		int x = 10; // x can be used anywhere within the method.  
		{
			int y = 40; // y can only be used within the block.  
			y = y + x;
			System.out.println(y);
		}
	}
	
	public static void main(String args[]) {
		BlockStatements block = new BlockStatements();
		block.testBlock();
	}
	
}
