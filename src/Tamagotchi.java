public class Tamagotchi {

    public String name;
    public int age;
    public String mood = "content";
    public int energy = 50;
    public String color;
    public String sound;

    public Tamagotchi(String name, int age, String mood, int energy, String color, String sound) {

        this.name = name;
        this.age = age;
        this.mood = mood;
        this.energy = energy;
        this.color = color;
        this.sound = sound;
    }

    public void Mood(){
        String mood = "";

        if(this.energy >= 75 && this.energy <= 100){
            mood = "Happy";
        } else if (this.energy >= 50 && this.energy <= 75){
            mood = "Content";
        } else if(this.energy >= 25 && this.energy <= 50){
            mood = "tired";
        } else if(this.energy == 0 && this.energy <=25){
            mood = "exhausted";
        }
    }

    public void feed() {

        boolean feed = true;
        if (feed) {

            System.out.println(this.name + " feel more full");
            System.out.println(this.name + "'s energy has increased " + energy + 5);
        }

    }

    public void play() {
        boolean play = true;
        if (play){
            int loseEnergy = energy - 5;

            System.out.println(this.name + "feels happy, but feels a little more tired"); //lose energy points
            System.out.println(this.name + "'s mood has increased " + energy + 5);
            System.out.println("Mood is now: " + mood);
            System.out.println(this.name + "'s energy has decreased " + loseEnergy);
        }

    }

    public void sleep() {
        boolean sleep = true;
        if(sleep){
            int addEnergyTimes5 = energy * 5;

            System.out.println(this. name + "'s energy has increased" + addEnergyTimes5);
        }

    }

    public void bath(){
        System.out.println("");
        System.out.println(this.name + " feels more clean");

    }
}
