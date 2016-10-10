
// Copyright Wintriss Technical Schools 2014
import org.teachingextensions.logo.Tortoise;

/*** Teacher's note ***/
/*
 * Start by reviewing the 3 pieces of a for loop (initialization, condition,
 * increment). Do not give the students the answer to the challenge.
 */

public class Starz {

	public static void main(String[] args) {
		Tortoise.setX(25);
		Tortoise.setSpeed(10);
		Tortoise.turn(20);
		for (int q = 0; q < 9; q++) {
			for (int i = 0; i < 4; i++) {
				Tortoise.move(30);
				Tortoise.turn(140);
				Tortoise.move(30);
				Tortoise.turn(-50);
			}
			Tortoise.setX(Tortoise.getX() + 70);
		}
	}
}
