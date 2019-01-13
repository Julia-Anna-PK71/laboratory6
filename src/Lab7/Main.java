package Lab7;
import Lab6.*;
import Lab6.Knight;
import Lab6.Leggings;
import Lab6.Cuirass;
import Lab6.ChainMail;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MySet OurKnight = new MySet();
        OurKnight.add(new Cuirass(53, 20, 6061));
        OurKnight.add(new Helmet (17, 5, 3540));
        OurKnight.add(new ChainMail(10, 10, 4470));
        OurKnight.add(new Leggings(40, 12, 6594));
        OurKnight.add(new Cuirass(53, 20, 6061));
        OurKnight.add(new Helmet (17, 5, 3540));
        OurKnight.add(new ChainMail(10, 10, 6594));
        OurKnight.add(new Leggings(40, 12, 6594));
        OurKnight.add(new Cuirass(53, 20, 6061));
        OurKnight.add(new Helmet (17, 5, 3540));
        OurKnight.add(new ChainMail(10, 10, 4470));
        OurKnight.add(new Leggings(40, 12, 6594));
        OurKnight.add(new Cuirass(53, 20, 6061));
        OurKnight.add(new Helmet (17, 5, 3540));
        OurKnight.add(new ChainMail(10, 10, 4470));
        OurKnight.add(new Leggings(40, 12, 6594));
        OurKnight.add(new Cuirass(53, 20, 6061));
        OurKnight.add(new Helmet (17, 5, 3540));
        OurKnight.add(new ChainMail(10, 10, 4470));
        OurKnight.add(new Leggings(40, 12, 6594));
        OurKnight.add(new Cuirass(53, 20, 6061));

        Iterator<Knight> iterator = OurKnight.iterator();
        System.out.println("*" + OurKnight.isEmpty());
        System.out.println("**" + OurKnight.size());
        System.out.println("***" + OurKnight.contains(new Leggings(40, 12, 6594)));
        OurKnight.remove(new Cuirass(53, 20, 6061));
        System.out.println("****" + OurKnight.remove((new Cuirass(53, 20, 6061))));


        int x = 0;
        for (Knight Knight : OurKnight) {
            System.out.println("*****" + iterator.next());
            x++;
        }

        System.out.println("+++++++" + x);
        System.out.println("*********" + OurKnight.containsAll(OurKnight));
    }
}

