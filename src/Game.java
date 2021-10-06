import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, and welcome to your very own Tamagotchi 🐶 \n");
        System.out.println("Which Tamagotchi would you like? \n 1. dog \n 2. cat");

        int chooseAnimal = scanner.nextInt();
        scanner.nextLine();

        //Dog//
        if (chooseAnimal == 1) {  //Inspiration fra Laura og Elisa
            System.out.println("Here is your dog 🐶");
            System.out.println("What would you like to name it?");
            String dogName = scanner.next();
            scanner.nextLine();

            System.out.println("I love that name ❤!");
            System.out.println("How old is " + dogName + "?");
            int dogAge = scanner.nextInt();

            if (dogAge <= 10) {
                boolean puppyOrNot = true;
                System.out.println("Omg, " + dogName + " is a puppy, how cute!");
            } else {
                boolean puppyOrNot = false;
                System.out.println(dogName + " is an adult dog, pawesome");

            }

            System.out.println("And what color is " + dogName + "?");
            String dogColor = scanner.next();

            System.out.println("Wow! That's my favorite color!");
            System.out.println("And the last but not least....");
            System.out.println("What does " + dogName + " say?");
            String dogSound = scanner.next();
            System.out.println("\n");

            Dog dog = new Dog(dogName, dogAge, "content", 50, dogColor, dogSound, puppyOrNot);
            System.out.println("Alrighty here is " + dogName + "'s details");
            dog.printDogsDetail();
            System.out.println("Now, lets play " + dogSound);
            System.out.println("\n");

            //Actions
            for (int i = 3; i < 7; i++) {

                System.out.println("What would you like to do with " + dogName);
                System.out.println(" 3. feed\n 4. play\n 5. sleep\n 6. bath\n 7. stand");
                int playChoice = scanner.nextInt();

                if (playChoice == 3) {
                    dog.feed();
                } else if (playChoice == 4) {
                    dog.play();
                } else if (playChoice == 5) {
                    dog.sleep();
                } else if (playChoice == 6) {
                    dog.bath();
                } else if (playChoice == 7){
                    dog.stand();
                }
                System.out.println("\n");
            }

            //Cat//
        } else if (chooseAnimal == 2) {
            System.out.println("Here is your cat 🐱");
            System.out.println("What would you like to name it?");
            String catName = scanner.next();
            scanner.nextLine();

            System.out.println("I love that name ❤!");
            System.out.println("How old is " + catName + "?");
            int catAge = scanner.nextInt();

            if (catAge >= 0 && catAge <= 10) {
                boolean kittyOrNot = true;
                System.out.println("Omg, " + catName + " is a kitten, how cute!");
            } else {
                boolean kittyOrNot = false;
                System.out.println(catName + " is an adult cat, purr-fect");
            }

            System.out.println("And what color is " + catName + "?");
            String catColor = scanner.next();

            System.out.println("Wow! That's my favorite color!");
            System.out.println("And the last but not least....");
            System.out.println("What does " + catName + " say?");
            String catSound = scanner.next();

            Cat cat = new Cat(catName, catAge, "content", 50, catColor, catSound, kittyOrNot);
            System.out.println("Here you have every details of " + catName);
            cat.printCatDetails();
            System.out.println("Now, let's play " + catSound);
            System.out.println("\n");

            //Actions
            for (int i = 3; i < 7; i++) {

                System.out.println("What would you like to do with " + catName);
                System.out.println(" 3. feed\n 4. play\n 5. sleep\n 6. bath\n 7. stand");
                int playChoice = scanner.nextInt();

                if (playChoice == 3) {
                    cat.feed();
                } else if (playChoice == 4) {
                    cat.play();
                } else if (playChoice == 5) {
                    cat.sleep();
                } else if (playChoice == 6) {
                    cat.bath();
                } else if (playChoice == 7){
                    cat.hunt();
                }
                System.out.println("\n");
            }

        } else {
            System.out.println("Please input a number!");
        }


    }

}
