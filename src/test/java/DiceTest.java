import org.example.objects.Dice;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class DiceTest {

    @Test
    public void testDice()
    {
        Dice dice = new Dice(6, "blue");
        assertEquals(6,dice.getSides());

    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5,6})
    public void testValidNumber(int number)
    {
       Dice dice = new Dice(6, "blue");

       int roll = dice.roll();
        assertTrue(roll >= 1 && roll <= 6);

    }



    @Test
    public void testColors(){
        Dice dice = new Dice(6, "green");
        assertEquals("green", dice.getColor());
    }

    @Test
    public void testRollFrequency()
    {
        Dice dice = new Dice(6, "red");
        int frequency = 5;
        int[] totalFrequencyOfRoll = new int[frequency];
        for (int i = 0; i < frequency ; i++) {
            totalFrequencyOfRoll[i] = dice.roll();
            assertTrue(totalFrequencyOfRoll[i] >= 1 && totalFrequencyOfRoll[i] <=6);
        }
//testing


    }

}
