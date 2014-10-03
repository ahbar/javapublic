package helloWorld;

public class Animal {
	
	String animalType;
	String sound;
	String movement;
	
	void makeSound(int howMany)
	{
		for (int i=0; i<howMany; i++)
		{
			System.out.println(sound);
		}
	}

}
