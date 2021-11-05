package counter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFall {


    @Test
    public void testReader() {

        //Arrage
        Reader myReader = new Reader();

        //Act

        int actual = myReader.getLetterCounter();

        //Assert
        int expected = 0;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testHowManyChar() {

        //Arrage
        Reader myReader = new Reader();

        //Act

        myReader.setChar("ivan");
        int actual = myReader.getLetterCounter();

        //Assert
        int expected = 4;

        assertEquals(expected, actual);

    }
    @Test
    public void testHowManyRows() {

        //Arrage
        Reader myReader = new Reader();

        //Act

        myReader.setRows();
        int actual = myReader.getRowCounter();

        //Assert
        int expected = 1;

        assertEquals(expected, actual);

    }
   @Test
    public void testThereIsStopOrNot() {

        //Arrage
        Reader myReader = new Reader();


        //Act
        myReader.checkIfContainsStop("stop");


        boolean actual;
        actual = myReader.containsStop();

        //Assert
        boolean expected = true;

        assertEquals(expected, actual);

    }
    @Test
    public void testThereRandomWordOrNot() {

        //Arrage
        Reader myReader = new Reader();


        //Act
        myReader.checkIfContainsStop("hejsan");


        boolean actual;
        actual = myReader.containshejsan();

        //Assert
        boolean expected = false;

        assertEquals(expected, actual);

    }
    @Test
    public void testWhichIsLargestWord() {

        //Arrage
        Reader myReader = new Reader();

        //Act

        myReader.setLargestWord("Rakannnnn");
        String actual = myReader.getLargestWord();

        //Assert
        String expected = "Rakannnnn";

        assertEquals(expected, actual);

    }
}