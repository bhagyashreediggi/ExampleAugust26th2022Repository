package com.sgtesting.ConstructorChaining;
class PlayerDetailes
{
	PlayerDetailes(String pname)
	{
		System.out.println("PlayerName:"+pname);
	}
	PlayerDetailes(int age)
	{
		this("Virat Kohili");
		System.out.println("PlayerAge:"+age);
	}
	PlayerDetailes(String pnation,int score)
	{
		System.out.println("PlayerNation:"+pnation+"Score:"+score);
	}
}

public class Player {

	public static void main(String[] args) {
		PlayerDetailes o1 = new PlayerDetailes(55);
		

	}

}
