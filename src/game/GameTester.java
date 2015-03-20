package game;

public class GameTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	Character character = new Paladin(new Sword());
		    character.display();
		    character.fight();

		    // Change the Paladin's weapon at run-time.
		    character.setWeapon(new Crossbow());
		    character.fight();
		    // Another Character
		    character = new Goblin(new Knife());
		    character.display();
		    character.fight();

		    // Change the Goblin's weapon at run-time.
		    character.setWeapon(new Sword());
		    character.fight();

	}

}
