/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package testpiggybank;

import testpiggybank.Coin;
import testpiggybank.PiggyBank;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author josborne
 */
public class PiggyBankTest {

    public PiggyBankTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of addCoin method, of class PiggyBank.
     */
    @Test
    public void testAddCoin() {
        System.out.println("addCoin");
        Coin aCoin = new Coin(25);
        PiggyBank instance = new PiggyBank();
        boolean expResult = true;
        boolean result = instance.addCoin(aCoin);
        assertEquals(expResult, result);
    }

    /**
     * Test of removeCoin method, of class PiggyBank.
     */
    @Test
    public void testRemoveCoin_0args() {
        System.out.println("removeCoin");
        PiggyBank instance = new PiggyBank();
        instance.addCoin(new Coin(5));
        instance.addCoin(new Coin(10));
        Coin aCoin = new Coin(25);
        boolean result = instance.addCoin(aCoin);
        Coin removeResult = instance.removeCoin();
        System.out.println(aCoin + " " + removeResult);
        assertEquals(aCoin, removeResult);
    }

    /**
     * Test of removeCoin method, of class PiggyBank.
     */
    @Test
    public void testRemoveCoin_int() {
        System.out.println("removeCoin");
        int amount = 10;
        PiggyBank instance = new PiggyBank();
        instance.addCoin(new Coin(5));
        instance.addCoin(new Coin(10));
        instance.addCoin(new Coin(25));
        boolean result = instance.removeCoin(amount);
        assertEquals(true, result);

    }

    /**
     * Test of getBalance method, of class PiggyBank.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        PiggyBank instance = new PiggyBank();
        double expResult = 0.40;
                instance.addCoin(new Coin(5));
        instance.addCoin(new Coin(10));
        instance.addCoin(new Coin(25));
        double result = instance.getBalance();
        assertEquals(expResult, result, 0);

    }

    /**
     * Test of isEmpty method, of class PiggyBank.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        PiggyBank instance = new PiggyBank();
        boolean expResult = true;
        boolean result1 = instance.isEmpty();
        Coin aCoin = new Coin(25);
        instance.addCoin(aCoin);
        boolean result2 = instance.isEmpty();
        boolean result = (result1 && !result2);
        assertEquals(expResult, result);
    }
}
