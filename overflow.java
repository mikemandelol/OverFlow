import java.util.concurrent.ThreadLocalRandom;
public class overflow
{
	public static void main(String[] args)
	{
		System.out.println("Integer Overflow Practice");
		System.out.println("Given that we are working in a language where the following is true, perform each calculation:");
		System.out.println("Integer.MAX_VALUE = 15");
		System.out.println("Integer.MIN_VALUE = -16 \n");

		System.out.println("1.	" + (14 + ThreadLocalRandom.current().nextInt(0,3)) + " + " + (6 + ThreadLocalRandom.current().nextInt(0,3)) + " =");
		System.out.println("2.	" + (14 + ThreadLocalRandom.current().nextInt(0,3)) + " + " + (9 + ThreadLocalRandom.current().nextInt(0,3)) + " =");
		System.out.println("3.	" + (12 + ThreadLocalRandom.current().nextInt(0,3)) + " + " + (10 + ThreadLocalRandom.current().nextInt(0,3)) + " =");
		System.out.println("4.	" + (-14 + ThreadLocalRandom.current().nextInt(0,3)) + " - " + (2 + ThreadLocalRandom.current().nextInt(0,3)) + " =");
		System.out.println("5.	" + (-14 + ThreadLocalRandom.current().nextInt(0,3)) + " - " + (5 + ThreadLocalRandom.current().nextInt(0,3)) + " =");
		System.out.println("6.	" + (-4+ ThreadLocalRandom.current().nextInt(0,3)) + " - " + (16 + ThreadLocalRandom.current().nextInt(0,3)) + " =");
		System.out.println("7.	" + (4 + ThreadLocalRandom.current().nextInt(0,3)) + " - " + (24 + ThreadLocalRandom.current().nextInt(0,3)) + " =");
	}

}