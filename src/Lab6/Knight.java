package Lab6;

public class Knight {
    public int damage;
    private int weight;
    private int cost;

    public Knight(int damage, int weight,int cost) {
        this.damage = damage;
        this.weight = weight;
        this.cost=cost;
    }
    @Override
    public String toString() {
        return getClass().getName() + " " + "Damage:"+damage+","+ "Weight:"+weight+","+
                "Cost:"+cost;
    }
    public int getDamage() {
        return damage;
    }
    public int getCost() {
        return cost;
    }
}
