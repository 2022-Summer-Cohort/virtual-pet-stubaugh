package virtual_pet;

public class VirtualPet {

    private String petName;
    private int hunger;
    private int thirst;
    private int boredom;
    //CONSTRUCTOR
    public VirtualPet(String name, int hunger, int thirst, int boredom) {
        this.petName = name;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
    }
    //METHODS
    public void feed() {
        hunger -= 20;
    }

    public void giveDrink() {
        thirst -= 20;
    }

    public void playWith() {
        boredom -= 20;
        hunger += 20;
        thirst += 20;
    }

    //TICK METHOD
    public void tick() {
        hunger += 20;
        thirst += 20;
        boredom += 20;
        System.out.print("Hunger: " + getHunger() + " ");
        System.out.print("Thirst: " + getThirst() + " ");
        System.out.print("Boredom: " + getBoredom());
    }


    //GETTERS
    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public String getName() {
        return petName;
    }

}