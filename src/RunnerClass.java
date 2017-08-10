
public class RunnerClass {

	public static void main(String[] args) {
		
	}

	public static int[][] getSpiralArray (int input)
	{
		int[][]SpiralArray = new int[input][input];
		
		int j;
		int sideLength = input;
		int currentNo = 0;
		
		int concSqua = (int)Math.ceil((input)/2);
		
		for (int i = 0; i < concSqua; i++)
		{
			//go through top line
			for (j = 0; j < sideLength; j++)
			{
				SpiralArray[i][i+j] = currentNo++;
			}
			
			//go through the right side starting at [1][4] through to [4][4]
			for (j = 1; j < sideLength; j++)
			{
				SpiralArray[j+i][input - 1- i] = currentNo++;
			}
			
			//go through the bottom side starting at [4][3] through [4][0] on first loop.
			for (j = sideLength - 2; j >= 0; j--)
			{
				SpiralArray[input-i -1][j+i] = currentNo++;
			}
			
			//go through the left side starting at [3][0] through [1][0] on the first loop.
			for (j = sideLength - 2; j >= 1; j--)
			{
				SpiralArray[j+i][i] = currentNo++;
			}
			
		}
		return SpiralArray;
		
	}
	
	//Print 
}
