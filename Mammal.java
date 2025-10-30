public class Mammal extends Animal {
	public Mammal(String name, String sound){ 
		super(name, sound);
		this.breeding = " gives live birth";
	}

	@Override
	public String breedingSystem(){
		return name + " gives live birth";
	}
}