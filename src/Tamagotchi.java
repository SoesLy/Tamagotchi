public class Tamagotchi {

    public String name;
    public int age;
    public String mood = "content";
    public int energy = 50;
    public String color;

    public Tamagotchi(String name, int age, String mood, int energy, String color) {

        this.name = name;
        this.age = age;
        this.mood = mood;
        this.energy = energy;
        this.color = color;
    }

    public void feed() {

        System.out.println(this.name + "feels more full" );

    }

    public void play() {

        System.out.println(this.name + "feels happy, but exhausted");


    }

    public void sleep() {


    }

    public void bath(){


    }

    public void tamagotchiSound(){
        System.out.println("...");
    }

}
