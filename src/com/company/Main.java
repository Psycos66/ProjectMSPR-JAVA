package com.company;
import java.io.*;
import java.util.Random;

public class Main {



    public static void main(String[] args) {
        String file = "C:\\Users\\Matbe\\Desktop\\fichier.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //Document doc = new Document("Input.txt");
        //doc.save("Output.html");
    }
}
