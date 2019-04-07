package Lab6;
import  Lab8.WrongCostExeption;
import  Lab8.WrongWeightException;
import  Lab8.WrongDamageException;
import org.junit.Test;

public class TestArmor {
    public void Print (){
        System.out.println();
    }
    @Test (expected = WrongDamageException.class)
    public void  testDamage ()
            throws  WrongDamageException{
        Knight knight = new Helmet(7,6,3540);
            throw new WrongDamageException("Wrong Damage");
    }

    @Test (expected = WrongCostExeption.class)
    public void  testCost () throws WrongCostExeption {
        Knight knight = new Helmet(7,7,-5540);
        throw new WrongCostExeption("Wrong cost");

    }

    @Test (expected = WrongWeightException.class)
    public void  testWeight () throws WrongWeightException {
        Knight knight = new Helmet(7,7,-5540);
        throw new WrongWeightException("Wrong cost");

    }



}


