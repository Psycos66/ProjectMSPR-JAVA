package com.company;
import java.io.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String file = "C:\\Users\\Matbe\\Desktop\\fichier.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String line;
            FileOutputStream fs = new FileOutputStream("C:\\Users\\Matbe\\Desktop\\Xefi Academy\\Projet\\Projet Js\\ProjetMSPR\\html\\Agent\\listeAgents.html");
            OutputStreamWriter out = new OutputStreamWriter(fs);
            out.write("<html>");
            out.write("<body>");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                out.write("<li>" + line + "</li>");
            }
            out.write("</body>");
            out.write("</html>");
            out.close();

        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    /*public static String textToHTML(String text)
    {
        if(text == null) {
            return null;
        }
        int length = text.length();
        boolean prevSlashR = false;
        StringBuffer out = new StringBuffer();
        for(int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            switch(ch) {
                case '\r':
                    if(prevSlashR) {
                        out.append("<br>");
                    }
                    prevSlashR = true;
                    break;
                case '\n':
                    prevSlashR = false;
                    out.append("<br>");
                    break;
                case '"':
                    if(prevSlashR) {
                        out.append("<br>");
                        prevSlashR = false;
                    }
                    out.append("&quot;");
                    break;
                case '<':
                    if(prevSlashR) {
                        out.append("<br>");
                        prevSlashR = false;
                    }
                    out.append("&lt;");
                    break;
                case '>':
                    if(prevSlashR) {
                        out.append("<br>");
                        prevSlashR = false;
                    }
                    out.append("&gt;");
                    break;
                case '&':
                    if(prevSlashR) {
                        out.append("<br>");
                        prevSlashR = false;
                    }
                    out.append("&amp;");
                    break;
                default:
                    if(prevSlashR) {
                        out.append("<br>");
                        prevSlashR = false;
                    }
                    out.append(ch);
                    break;
            }
        }
        return out.toString();
    }*/
}
