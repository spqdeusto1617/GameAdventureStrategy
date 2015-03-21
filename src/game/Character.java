package game;

public abstract class Character {

		private WeaponBehaviour weapon;
		
		public Character(WeaponBehaviour w){
			weapon = w;
		}
		public WeaponBehaviour getWeapon(){
			return weapon;
		}
		public void setWeapon(WeaponBehaviour w){
			System.out.println("Let´s change our weapons ...");
System.out.println("Cambios en A");System.out.println("Cambios en B");			weapon = w;
		}
		public void fight(){ 
	        weapon.useWeapon();
	    }
		public abstract void display();
}
