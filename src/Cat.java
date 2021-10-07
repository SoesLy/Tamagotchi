public class Cat extends Tamagotchi {

    public boolean kittenOrNot;

    public Cat(String name, int age, String mood, int energy, String color, String sound, boolean kittenOrNot) {
        super(name, age, mood, energy, color, sound);
        this.kittenOrNot = kittenOrNot;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "puppyOrNot=" + kittenOrNot +
                ", Sound='" + sound + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", mood='" + mood + '\'' +
                ", energy=" + energy +
                ", color='" + color + '\'' +
                '}';
    }

    public void hunt() {
        System.out.println("Rawwrr! I'm a dangerous hunter!");

        return;
    }

    @Override
    public void bath() {
        super.bath();
        System.out.println("Oh God NO!!! No, no, NOOOO, NOOOOOOOOOO!");
    }

    public void printCatDetails(){

        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Puppy? " + this.kittenOrNot);
        System.out.println("Color: " + this.color);
        System.out.println("Sound: " + this.sound);
        System.out.println("Energy: " + this.energy);
        System.out.println("mood: " + this.mood);
    }


}

