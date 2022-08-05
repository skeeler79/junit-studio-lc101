package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void threeBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[only need two]"));
    }

    @Test
    public void backwardsBracketsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]backwards!["));
    }

    @Test
    public void threeBracketsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("this]isnt[right["));
    }

    @Test
    public void multipleStringsWithBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[hello], [world]"));
    }

    @Test
    public void bracketsWithinWordsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(("he[ll]o")));
    }

    @Test
    public void noBrackets(){
     assertFalse(BalancedBrackets.hasBalancedBrackets(" "));

    }

    @Test
    public void justLetters(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("hello"));
    }


}
