package strings;

public class Question1 {

	public static void main(String[] args) {
		findlength();
	}
	private static void findlength()
	{
		String s="bhagya";
		int count=0;
		for(int k:s.toCharArray())
		{
			count++;
		}
		System.out.println("Length of String is "+count);
	}

}

	


