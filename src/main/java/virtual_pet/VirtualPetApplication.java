package virtual_pet;

import java.util.Scanner;
public class VirtualPetApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select = -1;

        System.out.println("Virtual Pet! Please enter your name.");
        String name = input.nextLine();

        VirtualPet pet = new VirtualPet(name, 0, 0, 100);

        while (select != 0) {

            System.out.println(" ");
            System.out.println("Pick a number:");
            System.out.println("[1] Play with " + pet.getName());
            System.out.println("[2] Feed " + pet.getName());
            System.out.println("[3] Give " + pet.getName() + " a drink.");
            System.out.println("[0] Quit. ");

            select = input.nextInt();
            input.nextLine();

            if (select == 1) {
                pet.playWith();
                System.out.println("That was fun!");
            } else if (select == 2) {
                pet.feed();
                System.out.println("Yum! If only I had something to wash it all down with.");
            } else if (select == 3) {
                pet.giveDrink();
                System.out.println("Mmm! My favorite!");
            } else {
                System.out.println("Your pet ran away! Game over.");
            }
            pet.tick();
        }
    }
}