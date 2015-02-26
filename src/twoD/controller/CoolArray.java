package twoD.controller;

public class CoolArray
{
	private int[][] IntMatrix = null;
	private String[][] StrMatrix = null;
	private static String stuff1 = "hello";
	private static String stuff2 = "I got it to work yay!!";

	public static void main(String[] args)
	{
		TestIntArray();
		TestStrArray();
	}

	public void setIntMatrix(int[][] IntMatrix)
	{
		this.IntMatrix = IntMatrix;
	}

	public void setStrMatrix(String[][] StrMatrix)
	{
		this.StrMatrix = StrMatrix;
	}

	private static void TestIntArray()
	{
		CoolArray worker = new CoolArray();
		int[][] nums = { { 1, 2, 3 }, { 4, 5, 6 } };
		worker.setIntMatrix(nums);
		worker.print();
	}

	private static void TestStrArray()
	{
		CoolArray worker = new CoolArray();
		String[][] stuff = { { stuff1 }, { "Yes they are! " + stuff2 }, { "Yes they are not! I'm joking" } };
		worker.setStrMatrix(stuff);
		worker.printStr();
	}

	public void print()
	{
		for (int row = 0; row < IntMatrix.length; row++)
		{
			for (int col = 0; col < IntMatrix[0].length; col++)
			{
				System.out.print(IntMatrix[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public void printStr()
	{
		for (int row = 0; row < StrMatrix.length; row++)
		{
			for (int col = 0; col < StrMatrix[0].length; col++)
			{
				System.out.print(StrMatrix[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	// public void fillIntArray()
	// {
	// for (int row = 0; row < IntMatrix.length; row++)
	// {
	// for (int col = 0; col < IntMatrix[0].length;
	// col++)
	// {
	// if (row < col)
	// {
	// IntMatrix[row][col] = 1;
	// }
	//
	// else if (row == col)
	// {
	// IntMatrix[row][col] = 2;
	// }
	// else
	// {
	// IntMatrix[row][col] = 3;
	// }
	// }
	// }
	// }

}
