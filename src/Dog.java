public class Dog extends Tamagotchi{

    public boolean puppyOrNot;


    public Dog(String name, int age, String mood, int energy, String color, String sound, boolean puppyOrNot) {
        super(name, age, mood, energy, color, sound);
        this.puppyOrNot = puppyOrNot;

    }

    @Override
    public String toString() {
        return "Dog{" +
                "puppyOrNot=" + puppyOrNot +
                ", sound='" + sound + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", mood='" + mood + '\'' +
                ", energy=" + energy +
                ", color='" + color + '\'' +
                '}';
    }

    public void stand() {
        System.out.println("Look what I can do!! " + sound);

        return;
    }

    @Override
    public void bath() {
        super.bath();
        System.out.println("Hey! whats going on... No I don't want to, no, noo... Hey, it's actaully a little nice!");
    }

    public void printDogsDetail(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Puppy: " + this.puppyOrNot);
        System.out.println("Color: " + this.color);
        System.out.println("Sound: " + this.sound);
        System.out.println("Energy: " + this.energy);
        System.out.println("mood: " + this.mood);
    }

}

