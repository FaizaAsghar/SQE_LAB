public class Animal{
	protected String name;
	protected String sound;
	protected String breeding;

	public Animal(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}

	public void display(){
		System.out.println("Name: "+name);
		System.out.println("Sound: "+sound);
		System.out.println("Breeding: "+breeding);
	}

	public String breedingSystem(){
		return name + " has a breeding system";
	}
}