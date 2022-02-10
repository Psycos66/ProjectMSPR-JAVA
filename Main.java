import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String>ListText = new ArrayList<>();
        File repertoire = new File("sauvegarde/Cagent");
        String liste[] = repertoire.list();

        if (liste != null) {
            for (int i = 0; i < liste.length; i++) {
                ListText.add(liste[i]);
            }
        } else {
            System.err.println("Nom de repertoire invalide");
        }

        for(String FileName : ListText)
        {
            System.out.println(FileName);
        }

        String file = "sauvegarde/Agent/agent.txt";
        String file2 = "sauvegarde/Equipement/equipement.txt";

        List<String>ListEquipement = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String line;
            FileOutputStream fs = new FileOutputStream("html/Agent/listeAgents.html");
            OutputStreamWriter out = new OutputStreamWriter(fs);

            out.write("<html>");
            out.write("<body>");
            int i = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                if(ListText.size() <= i) {
                    int y = i+1;
                    FileOutputStream fsAgent = new FileOutputStream("sauvegarde/Cagent/Cagent" + y + ".txt");
                    OutputStreamWriter outAgent = new OutputStreamWriter(fsAgent);
                    ListText.add("Cagent" + y + ".txt");
                    outAgent.close();
                }
                out.write("<li><a href='html/Cagent/" + ListText.get(i) + ".html'>" + line + "</a></li>");
                i++;
            }
            out.write("</body>");
            out.write("</html>");
            out.close();

            try(BufferedReader br2 = new BufferedReader(new FileReader(file2)))
            {
                String line2;

                while ((line2 = br2.readLine()) != null) {
                    ListEquipement.add(line2);
                }
                System.out.println(ListEquipement);
            }

            try
            {
                for(String FileName : ListText)
                {
                    String file3 = "sauvegarde/Cagent/" + FileName;
                    BufferedReader br3 = new BufferedReader(new FileReader(file3));
                    String line3;

                    FileOutputStream fs2 = new FileOutputStream("html/Cagent/" + FileName + ".php");
                    OutputStreamWriter out2 = new OutputStreamWriter(fs2);
                    boolean check = false;
                    out2.write("<?php include 'html/Agent/listeAgents.html';?>");
                    while ((line3 = br3.readLine()) != null) {
                        for(String equip : ListEquipement)
                        {
                            if(line3.equals(equip))
                            {
                                out2.write("<li>" + equip + "<input type='checkbox' id='scales' checked><br></li> ");
                            }
                            else
                            {
                                out2.write("<li>" + equip + "<input type='checkbox' id='scales'><br></li> ");
                            }
                            check = true;
                        }
                    }
                    if(!check)
                    {
                        for(String equip : ListEquipement)
                        {
                            out2.write("<li>" + equip + "<input type='checkbox' id='scales'><br></li> ");
                        }
                    }
                    System.out.println(out2);
                    out2.close();

                }
                    
            }
            catch (IOException e)
            {
                System.out.println("An error occurred :" + e);
            }
        }

        catch (IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }
}
