public class Dog extends Tamagotchi{

    public boolean puppyOrNot;
    public String dogSound;

    public Dog(String name, int age, String mood, int energy, String color, String dogSound, boolean puppyOrNot) {
        super(name, age, mood, energy, color);
        this.puppyOrNot = puppyOrNot;
        this.dogSound = dogSound;

    }

    @Override
    public String toString() {
        return "Dog{" +
                "puppyOrNot=" + puppyOrNot +
                ", dogSound='" + dogSound + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", mood='" + mood + '\'' +
                ", energy=" + energy +
                ", color='" + color + '\'' +
                '}';
    }

    public void stand() {
        System.out.println("Look what I can do!! " + dogSound);

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
        System.out.println("Sound: " + this.dogSound);
        System.out.println("Energy: " + this.energy);
        System.out.println("mood: " + this.mood);
    }

}

