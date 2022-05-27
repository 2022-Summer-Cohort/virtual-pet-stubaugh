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
        hunger = -10;
    }

    public void giveDrink() {
        thirst = -10;
    }

    public void playWith() {
        boredom = -10;
        hunger += 10;
        thirst += 10;
    }

    //TICK METHOD
    public void tick() {
        hunger += 10;
        thirst += 10;
        boredom += 10;
        System.out.print("Hunger: " + getHunger() + " ");
        System.out.print("Thirst: " + getThirst() + " ");
        System.out.println("Boredom: " + getBoredom());
    }
    public boolean isAlive() {
        if (hunger >= 100 || thirst >= 100) {
            return false;
        }
        return true;
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