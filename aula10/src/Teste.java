import java.io.*;

public class Teste {
    public static void main(String[] args) throws IOException {
        // Propriedades
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("file.separator"));

        File dir = new File("C:\\Java");

        if(!dir.isDirectory()){
            System.out.println("Criando diretório " + dir.getName());
            var result = dir.mkdir();
        }

        File file = new File(dir, "dados.txt");

        if(!file.exists()){
            System.out.println("Criando arquivo " + file.getName());
            var result = file.createNewFile();
        }

        FileWriter fileWriter = new FileWriter(file, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        System.out.println("Iniciando a escrita dos dados");

        for (int i = 1; i < 11; i++){
            printWriter.println(String.format("Linha %d", i));
        }
        printWriter.close();

        System.out.println("Escrita finalizada");

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String linha = "";

        while((linha = bufferedReader.readLine()) != null){
            System.out.println(linha);
        }



        //File file2 = new File(dir, "Banana.txt");
        //var r = file.renameTo(file2);

        //System.out.println(r);

        /*
        System.out.println(file2.delete());
        System.out.println(file.delete());
        System.out.println(dir.delete());
        */

        /*File all = new File("C:\\");

        for(File f : all.listFiles()){
            if(f.isDirectory()){
                System.out.println(f.getName() + " é um DIR");
                continue;
            }
            System.out.println(f.getName() + " é um FILE");
        }*/
    }
}
