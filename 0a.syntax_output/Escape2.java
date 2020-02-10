//(c) A+ Computer Science
// www.apluscompsci.com

//print/println example
//comment example

public class Escape2
{
	public static void main(String args[])
	{
		System.out.println("aplus\\compsci\"/");
		System.out.println("aplus\\'comp\'sci\'/");

		System.out.printf("%s","apluscompsci\n");	
			
		System.out.println("aplusc\tompsci");
		System.out.println("apluscom\tpsci");
		System.out.println("apluscomp\nsci");
	}
}