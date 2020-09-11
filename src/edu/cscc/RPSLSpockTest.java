package edu.cscc;

        import org.junit.Assert;
        import org.junit.Test;

/**
 * Set of unit tests for RPSLSpock methods
 */
public class RPSLSpockTest {

    /**
     * Test isValidPick() method
     * Test that it returns true if argument is {rock,paper,scissors,lizard, or spock}
     * Test that it returns false if the argument is not a valid input String
     */
    @Test
    public void isValidPick() {
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.LIZARD));
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.SPOCK));
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.SCISSORS));
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.PAPER));
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.ROCK));
        Assert.assertFalse(RPSLSpock.isValidPick("banana"));
        Assert.assertFalse(RPSLSpock.isValidPick("chicken"));
        Assert.assertFalse(RPSLSpock.isValidPick(null));
        Assert.assertTrue(RPSLSpock.isValidPick("lizard"));
        Assert.assertTrue(RPSLSpock.isValidPick("spock"));
        Assert.assertTrue(RPSLSpock.isValidPick("scissors"));
        Assert.assertTrue(RPSLSpock.isValidPick("paper"));
        Assert.assertTrue(RPSLSpock.isValidPick("rock"));

    }

    /**
     * Test generatePick() method
     * Test that it returns a non-null String
     * Test that the String it returns is valid
     * Since the method is based on a RANDOM number - test it ONE MILLION times
     */
    @Test
    public void generatePick() {
        for (int i=0; i<1000000; ++i) {
            String pick = RPSLSpock.generatePick();
            Assert.assertNotNull(pick);
            Assert.assertTrue(RPSLSpock.isValidPick(pick));
        }
    }

    /**
     * Test the isComputerWin method
     * Test it with all ten possible computer win scenarios (it should return true)
     * Test it with at least one computer loses scenario to make sure it returns false
     */
    @Test
    public void isComputerWin() {
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.ROCK,RPSLSpock.SCISSORS));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.ROCK,RPSLSpock.LIZARD));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.PAPER,RPSLSpock.ROCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.PAPER,RPSLSpock.SPOCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS,RPSLSpock.PAPER));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS,RPSLSpock.LIZARD));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.LIZARD,RPSLSpock.PAPER));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.LIZARD,RPSLSpock.SPOCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SPOCK,RPSLSpock.ROCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SPOCK,RPSLSpock.SCISSORS));
        Assert.assertFalse(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS,RPSLSpock.ROCK));
        Assert.assertFalse(RPSLSpock.isComputerWin(RPSLSpock.LIZARD,RPSLSpock.ROCK));
        Assert.assertFalse(RPSLSpock.isComputerWin(RPSLSpock.ROCK,RPSLSpock.PAPER));
        Assert.assertFalse(RPSLSpock.isComputerWin(RPSLSpock.SPOCK,RPSLSpock.PAPER));
        Assert.assertFalse(RPSLSpock.isComputerWin(RPSLSpock.PAPER,RPSLSpock.SCISSORS));
        Assert.assertFalse(RPSLSpock.isComputerWin(RPSLSpock.LIZARD,RPSLSpock.SCISSORS));
        Assert.assertFalse(RPSLSpock.isComputerWin(RPSLSpock.PAPER,RPSLSpock.LIZARD));
        Assert.assertFalse(RPSLSpock.isComputerWin(RPSLSpock.SPOCK,RPSLSpock.LIZARD));
        Assert.assertFalse(RPSLSpock.isComputerWin(RPSLSpock.ROCK,RPSLSpock.SPOCK));
        Assert.assertFalse(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS,RPSLSpock.SPOCK));


    }


}
