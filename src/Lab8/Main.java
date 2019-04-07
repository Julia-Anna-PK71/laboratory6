package Lab8;
import Lab7.*;
import Lab6.*;

public class Main {
    public static void main(String[] args) throws WrongCostExeption, WrongWeightException, WrongDamageException {
        try {
            new MySet().add(new Helmet (17, 5, 35));
            System.out.println(" **** ");
        } catch (WrongCostExeption e) {

            System.out.println(e.getMessage());
        } catch (WrongWeightException e) {

            System.out.println(e.getMessage());
        }

    }
}