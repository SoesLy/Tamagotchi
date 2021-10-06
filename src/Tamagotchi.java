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

    public int addEnergy(){
      int addEnergy = energy + 5;

      return addEnergy;
    }

    public void feed() {

        boolean feed = true;
        if (feed) {

            System.out.println(this.name + " feel more full"); //add energy points
            System.out.println(this.name + "'s energy has increased " + addEnergy());
        }

    }

    public void play() {
        boolean play = true;
        if (play){
            String addMood = mood + 5;
            int loseEnergy = energy - 5;

            System.out.println(this.name + "feels happy, but is exhausted"); //lose energy points
            System.out.println(this.name + "'s mood has increased " + addEnergy());
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
        System.out.println("No no, please don't...");
        System.out.println(this.name + "feels more clean");

    }

}
