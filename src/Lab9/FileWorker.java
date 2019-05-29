package Lab9;

import Lab6.Leggings;
import Lab6.ChainMail;
import Lab6.Cuirass;
import Lab7.MySet;
import Lab6.Knight;
import java.io.*;
import java.util.ArrayList;

public class FileWorker {

    public static void saveCollectionToFile(String fileName, MySet mySet) {
        File file = new File(fileName);
        try {
            OutputStream outputStream = new FileOutputStream(file);

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(mySet);
            objectOutputStream.close();
            System.out.println(": )");
        } catch (FileNotFoundException e) {
            System.out.println("Sorry. File was not found.");
        } catch (IOException e) {
            System.out.println("Sorry. Problems with writing in the file.");
        }
    }

    public static MySet loadCollectionFromFile(String fileName) {
        File file = new File(fileName);
        try {
            InputStream inputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            return (MySet) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void saveObjectsToFile(String fileName, MySet knights) {
        File file = new File(fileName);
        try {
            OutputStream outputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            for (Knight knight : knights  ) {
                objectOutputStream.writeObject(knight);
            }
            objectOutputStream.close();
            System.out.println(":2)");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Knight[] loadObjectsFromFile(String fileName) {
        File file = new File(fileName);
        ArrayList<Knight> knights = new ArrayList<>();
        try {
            InputStream inputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            Knight knight = (Knight) objectInputStream.readObject();
            while (true) {
                knights.add(knight);
                knight = (Knight) objectInputStream.readObject();


            }

        } catch (IOException | ClassNotFoundException e) {
        }
        return knights.toArray(new Knight[0]);
    }

    public static void saveSymbolToTextFile
            (String fileName, char symbol) throws IOException {
        OutputStream outputStream = new FileOutputStream(fileName);
        outputStream.write(symbol);
        //todo check closing file
    }

    public static void saveStringToTextFile
            (String fileName, String string) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        fileWriter.write(string);
        fileWriter.close();
    }

    public static void saveObjectsToTextFileChainMail(String fileName,ChainMail[] ChainMails) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        for (ChainMail chainMail1 : ChainMails) {
            fileWriter.write(chainMail1.toString() + "\n");
        }
        fileWriter.close();
    }
    public static void saveObjectsToTextFileLeggings(String fileName, Leggings[] Leggings) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        for (Leggings leggings1 : Leggings) {
            fileWriter.write(leggings1.toString() + "\n");
        }
        fileWriter.close();
    }
    public static void saveObjectsToTextFileSubary(String fileName, Cuirass[] Cuirass) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        for (Cuirass cuirass1 : Cuirass) {
            fileWriter.write(cuirass1.toString() + "\n");
        }
        fileWriter.close();
    }
}