package Lab6;

public class Knight {
    public int damage;
    private int weight;
    private int cost;

    public Knight(int damage, int weight,int cost) {
        this.damage = damage;  // конструктор
        this.weight = weight;
        this.cost=cost;
    }
    @Override
    public String toString() {
        return getClass().getName() + " " + "Damage:"+damage+","+ "Weight:"+weight+","+
                "Cost:"+cost; // getClass().getName() возвращает имя класа
    }
    public int getDamage() {// С помощью геттеров и сеттеров Вы защищаете содержимое программы - когда ей пользуется
        // кто-то другой. Способ вводить данные ("set") или получать данные ("get").
        return damage;
    }
    public int getCost() {

        return cost;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
