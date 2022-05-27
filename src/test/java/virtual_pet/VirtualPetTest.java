package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Create at least a test for each of your three methods and your tick method.
//Name, Hunger Level, Thirst Level, Boredom Level, or something you want
public class VirtualPetTest {
    @Test
    public void decreasingHungerWhenFed() {
        //Assignment
        VirtualPet underTest = new VirtualPet("Sasuke", 0, 0, 0);
        //Action
        underTest.feed();
        //Assertion
        assertEquals(-10, underTest.getHunger());
    }
    @Test
    public void decreasingThirstWhenDrinking() {
        VirtualPet underTest = new VirtualPet("Sasuke", 0, 0, 0);
        underTest.giveDrink();
        assertEquals(-10, underTest.getThirst());
    }
    @Test
    public void decreasingBoredomWhenPlaying() {
        VirtualPet underTest = new VirtualPet("Sasuke", 0, 0, 0);
        underTest.playWith();
        assertEquals(-10,underTest.getBoredom());
    }

    @Test
    public void returnNameSasuke() {
        VirtualPet underTest = new VirtualPet("Sasuke", 0, 0, 0);
        underTest.getName();
        assertEquals("Sasuke", underTest.getName());
    }


}
