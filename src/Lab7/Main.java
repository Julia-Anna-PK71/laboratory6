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
        Cuirass cuirass = new Cuirass(53, 20, 6061);
        OurKnight.add(cuirass);
        Helmet helmet = new Helmet(17, 5, 3540);
        OurKnight.add(helmet);
        OurKnight.add(new ChainMail(10, 10, 4470));
        OurKnight.add(new Leggings(40, 12, 6594));
        OurKnight.add(new Cuirass(53, 20, 6061));
        OurKnight.add(new Helmet (17, 5, 3540));



        Iterator<Knight> iterator = OurKnight.iterator();
        System.out.println("Empty? " + OurKnight.isEmpty());
        // isEmpty (): возвращает true, если коллекция пуста, иначе возвращает false
        System.out.println("Size =" + OurKnight.size());
        System.out.println("Contain element :" + OurKnight.contains(helmet));
        //contains (Object item): возвращает true, если объект item содержится в коллекции, иначе возвращает false
        OurKnight.remove(new Cuirass(53, 20, 6061));
        System.out.println("Remove element : " + OurKnight.remove(cuirass));
        //remove (Object item): возвращает true, если объект item удачно удален из коллекции, иначе возвращается false


        int x = 0;
        for (Knight Knight : OurKnight) {
            System.out.println("element #" + x + " " + iterator.next());
            x++;
        }

        System.out.println("New Size +" + x);
        System.out.println(" Contains all elements  :" + OurKnight.containsAll(OurKnight));
    }
}

