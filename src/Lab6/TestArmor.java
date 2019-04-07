package Lab6;
import  Lab8.WrongCostExeption;
import  Lab8.WrongWeightException;
import  Lab8.WrongDamageException;
import org.junit.Test;

public class TestArmor {
    @Test (expected = WrongDamageException.class)
    public void  testDamage () throws WrongCostExeption, WrongWeightException, WrongDamageException{
        Knight knight = new Helmet(1,6,3540);
    }

    @Test (expected = WrongCostExeption.class)
    public void  testCost () throws WrongCostExeption, WrongWeightException, WrongDamageException{
        Knight knight = new Helmet(7,7,-5540);
    }

}
