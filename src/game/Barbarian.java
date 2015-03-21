package game;

public class Barbarian extends Character {

	public Barbarian(WeaponBehaviour w) {
		super(w);
	}
	
	@Override
	public void display() {
	// TODO Auto-generated method stub

		System.out.println("You are a strong, hulky barbarian.");
		System.out.println("User A añade una linea sin conflicto.");
	}
}
