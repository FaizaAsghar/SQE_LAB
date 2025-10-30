public class Bird extends Animal {
	public Bird(String name, String sound){ 
		super(name, sound);
		this.breeding = " lays eggs";
	}

	@Override
	public String breedingSystem(){
		return name + " lays eggs";
	}
}