package Lab6;

public class Main {
    public static void main(String[] args) {
        ArmorOfKnight ArmorOfKnight = new ArmorOfKnight(4);
        ArmorOfKnight.add(new Cuirass(53, 20,6061));
        ArmorOfKnight.add(new Helmet(17, 5,3540));
        ArmorOfKnight.add(new Leggings(40, 12,6594));
        ArmorOfKnight.add(new ChainMail(10, 10,4470));
        System.out.println("****Armor of Knight (Characteristic) : " + ArmorOfKnight);
        ArmorOfKnight.SumCost();
        ArmorOfKnight.SortedDamage();
        System.out.println("****Sorted of Damage : "  + ArmorOfKnight);
        System.out.println("****" + ArmorOfKnight.findProposition(10));

    }
}
