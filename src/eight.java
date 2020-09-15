import java.io.*;
import java.util.Scanner;

public class eight {
    public static void main(String[] args) throws Exception {

        File file   =new File("temp.txt");
        if(!file.exists()){
            file.createNewFile();//Проверям на существующий файл
        }
        FileWriter fileWriter=new FileWriter(file);
        fileWriter.flush();
        FileReader fileReader=new FileReader(file);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        bufferedWriter.write(s);
        bufferedWriter.newLine();
        bufferedWriter.flush();
        bufferedWriter.close();
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        while(bufferedReader.ready()){
            System.out.println(bufferedReader.readLine());
        }
    }
}
