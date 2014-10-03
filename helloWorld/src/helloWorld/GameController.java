package helloWorld;

import java.util.ArrayList;
import java.util.Random;

public class GameController 
{
	
	ArrayList<Animal> team1 = new ArrayList<Animal>();
	ArrayList<Animal> team2 = new ArrayList<>();
	int teamSize = 5;
	
	void game()
	{
		// create 2 teams
		makeTeam(team1);
		makeTeam(team2);
		// display animals in teams
		System.out.println("------- team1 -------");
		for (Animal j : team1) {
			System.out.println(j.animalType);
		}
		System.out.println("------- team2 -------");
		for (Animal j : team2) {
			System.out.println(j.animalType);
		}
	}
	
	void makeTeam(ArrayList<Animal> team)
	{
		for (int i=0; i<teamSize; i++)
		{
			int rand = randInt(0, 444) % 3;
			if (rand==0)
			{
				team.add(new Shark());
			}
			else if (rand==1)
			{
				team.add(new Eagle());
			}
			else if (rand==2)
			{
				team.add(new Wolf());
			}
		}
	}
	
	public static int randInt(int min, int max) 
	{

	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}
}
