import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String>ListText = new ArrayList<>();
        File repertoire = new File("html/Cagent/FichierTXT");
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
            int y = 1;
            FileOutputStream fs = new FileOutputStream("html/Agent/listeAgents.html");
            OutputStreamWriter out = new OutputStreamWriter(fs);


            out.write("<html>");
            out.write("<body>");
            int i = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                out.write("<li><a href='file:///html/Cagent/Cagent" + y + ".html'>" + line + "</a></li>");
                y++;
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
                    String file3 = "html/Cagent/Cagent" + FileName;
                    BufferedReader br3 = new BufferedReader(new FileReader(file3));
                    String line3;

                    FileOutputStream fs2 = new FileOutputStream("html/Cagent/Cagent/" + FileName + ".html");
                    OutputStreamWriter out2 = new OutputStreamWriter(fs2);
                    boolean check = false;

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
                    out2.close();

                }
                    
            }
            catch (IOException e)
            {

            }
        }

        catch (IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }
}
