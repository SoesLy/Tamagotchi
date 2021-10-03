public class Cat extends Tamagotchi {

    public boolean kittenOrNot;


    public Cat(String name, int age, String mood, int energy, String color, boolean kittenOrNot) {
        super(name, age, mood, energy, color);
        this.kittenOrNot = kittenOrNot;
    }
}

