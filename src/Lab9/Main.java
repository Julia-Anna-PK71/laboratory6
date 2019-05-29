package Lab9;
import Lab6.Knight;
import Lab6.Leggings;
import Lab6.ChainMail;
import Lab6.Cuirass;
import Lab7.MySet;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MySet Knight = new MySet();
        Leggings leggings1 = new Leggings(5, 4, 3000000);
        Knight.add(leggings1);
        Leggings leggings2 = new Leggings(4, 8, 2300000);
        Knight.add(leggings2);
        Leggings[] Leggings = {leggings1, leggings2};
        FileWorker.saveObjectsToTextFileLeggings("1.obj", Leggings);
        Cuirass cuirass1 = new Cuirass(5, 4, 2100000);
        Knight.add(cuirass1);
        Cuirass cuirass2 = new Cuirass(4, 8, 3000000);
        Knight.add(cuirass2);
        Cuirass[] Cuirass = {cuirass1, cuirass2};
        FileWorker.saveObjectsToTextFileSubary("2.obj", Cuirass);
        ChainMail chainMail1 = new ChainMail(15, 20, 300000);
        Knight.add(chainMail1);
        ChainMail chainMail2 = new ChainMail(4, 8, 230000);
        Knight.add(chainMail2);
        ChainMail[] ChainMail = {chainMail1, chainMail2};
        FileWorker.saveObjectsToTextFileChainMail("3.txt",ChainMail );
        System.out.println("File was recorded");

    }
}