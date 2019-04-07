package Lab7;
import Lab6.Knight;
import Lab6.Helmet;
import Lab6.Cuirass;
import Lab6.TestArmor;
import Lab8.WrongDamageException;
import Lab8.WrongWeightException;
import Lab8.WrongCostExeption;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

public class TestMySet extends Assert {
    MySet mySet;

    @Before
    public void before() {
        mySet = new MySet();
    }

    @Test
    public void testMySet() {
        assertEquals(0, mySet.size());
    }

   /* @Test(expected = WrongDamageException.class)
    public void testAddWithException()
            throws WrongCostExeption, WrongWeightException, WrongDamageException {
        Knight knight = new Helmet(7,7,-5540);
       *//* try {
            mySet.add(new  Helmet (-17, 5, 3540));
        } catch (WrongDamageException e) {
            System.out.println(e.getMessage());
        }*//*
    }*/

    @Test
    public void testAdd()
            throws  WrongCostExeption, WrongWeightException, WrongDamageException {
        mySet.add(new Cuirass(53, 20, 6061));
        assertEquals(1, mySet.size());
    }

    @Test
    public void testContains() throws WrongDamageException {
        Knight knight;
        knight = new Helmet (17, 5, 3540);
        mySet.add(knight);

        knight = new Cuirass(53, 20, 6061);
        mySet.add(knight);
        assertTrue(mySet.contains(knight));
    }

    @Test
    public void testContainsClassException() {
        boolean b = mySet.contains(1);
        System.out.println("Class  " + b);
    }
}

