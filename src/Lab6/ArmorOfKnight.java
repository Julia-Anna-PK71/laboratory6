package Lab6;

import java.util.Arrays;
import java.util.Comparator;

public class ArmorOfKnight {
    private int count;
    private Knight[] knight;
    private int sum;

    public ArmorOfKnight(int size) {
        knight = new Knight[size];

    }

    public void SortedDamage() {

        Arrays.sort(knight, Comparator.comparing(Knight::getDamage));

    }

    @Override
    public String toString() {
        return Arrays.toString(knight);
    }

    public Knight findProposition(int damage) {
        Knight result = null;

        for (Knight knight : knight) {
            if (knight.getDamage() == damage) {
                result = knight;
                break;
            }
        }

        return result;
    }

    public void add(Knight knight) {
        if (count< this.knight.length) {
            this.knight[count++] = knight;
        }

    }
    public void SumCost() {
        for (int i = 0; i < knight.length; i++) {
            sum+=knight[i].getCost();
        }
        System.out.println("****Sum of cost of Armor : " + sum);
    }
}
