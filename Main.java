public class Main{
	public static void main(String[] args) {
		Mammal lion = new Mammal("Lion","Roar");
		Bird parrot = new Bird("Parrot","Squawk");

		lion.display();
		parrot.display();

		Animal[] animals = {
			lion,
			parrot,
			new Mammal("Dolphin","Click"),
			new Bird("a","b"),	
		};

		for (Animal animal: animals) {
			System.out.println(animal.breedingSystem());
		}
	}
}