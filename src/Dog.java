public class Dog extends Tamagotchi{

    //public boolean puppyOrNot;
    //public boolean barkOrNot;
    public String dogSound;

    public Dog(String name, int age, String mood, int energy, String color, String dogSound) {
        super(name, age, mood, energy, color);
        //this.puppyOrNot = puppyOrNot;
        //this.barkOrNot = barkOrNot;
        this.dogSound = dogSound;

    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogSound='" + dogSound + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", mood='" + mood + '\'' +
                ", energy=" + energy +
                ", color='" + color + '\'' +
                '}';
    }

    public void stand() {

        return;
    }

    public void printDogsDetail(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Color: " + this.color);
        System.out.println("Sound: " + this.dogSound);
        System.out.println("Energy: " + this.energy);
        System.out.println("mood: " + this.mood);
    }


}

