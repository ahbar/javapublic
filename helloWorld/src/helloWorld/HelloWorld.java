package helloWorld;

public class HelloWorld 
{
	public static void main(String[] args) 
	{
		System.out.println("program started");
		GameController game = new GameController();
		game.game();
	}
}
