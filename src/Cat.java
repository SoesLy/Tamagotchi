public class Cat extends Tamagotchi {

    public String catSound;

    public Cat(String name, int age, String mood, int energy, String color, String catSound) {
        super(name, age, mood, energy, color);
        this.catSound = catSound;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catSound='" + catSound + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", mood='" + mood + '\'' +
                ", energy=" + energy +
                ", color='" + color + '\'' +
                '}';
    }

    public void hunt() {

        return;
    }

    public void printCatDetails(){

        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Color: " + this.color);
        System.out.println("Sound: " + this.catSound);
        System.out.println("Energy: " + this.energy);
        System.out.println("mood: " + this.mood);
    }


}

