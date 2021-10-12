package se.lexicon;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void arrayToStringReturnExpectedResult(){
        //Arrange - setting up the test
        String[] testData = {"Erik Svensson", "Fabrice Badia"};
        String expected = "[Erik Svensson, Fabrice Badia]";

        //Act - performing the test
        String actual = App.arrayToString(testData);

        //Assert - evaluating result
        assertEquals(actual, expected);
    }

    @Test
    public void testAddToStringArray() {
        String[] testArrayData = {};
        String string = "Say hello to the cute baby";
        String[] expected = {"Say hello to the cute baby"};

        String[] actual = App.addToStringArray(testArrayData, string);

        assertArrayEquals(actual, expected);
    }

    @Test
    public void findTask(){
        String[] data = {"Basel", "Karmand", "Erik", "Fabrice"};
        String task = "Fabrice";
        String expected = "Fabrice";

        String actual = App.findTask(task, data);
        System.out.println(Arrays.toString(data));

        assertEquals(expected, actual);
    }
}
