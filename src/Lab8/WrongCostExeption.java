package Lab8;

public class WrongCostExeption extends RuntimeException {
    public WrongCostExeption (){

    }
    public WrongCostExeption(String message) {
        super(message);
    }
}
