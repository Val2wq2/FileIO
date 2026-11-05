//https://github.com/Val2wq2/FileIO/blob/master/src/Main.java
import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Path: directory of the file location
        // 2 types of path: relative path, absolute path

        // Absolute path: C:\Users\tosin\IdeaProjects\FileIO\src\Main.java

        // Practical Scenario
        // Verify if a file exists in a directory? If not create the file.
        // Open a file if it exists and write contents
        // Open a file if it exists and read line by line

//       String path = "C:\\Users\\tosin\\IdeaProjects\\FileIO\\src\\input.txt";
        // Absolute path: location of input.txt
        String file_name = "C:\\Users\\tosin\\IdeaProjects\\FileIO\\src\\input.txt";

        File f = new File(file_name);


        try {
//            if(f.createNewFile() ){
//                System.out.println("File is successfully created");
//
//            } else {
//                System.out.println("File already exists!");
//            }

            // Write to input.txt
//            FileWriter fw = new FileWriter(f);
//           FileWriter fw = new FileWriter(f, true);
            FileWriter fw = new FileWriter(file_name, true);


//             fw.write("We are Zen-Z!\n");
//            fw.write("\nThis is second appended content\n");
//              fw,write("We are on 11th Week!\n");
//            fw.close();

            FileReader fr = new FileReader(f);
//             val = fr.read();
//            System.out.println((char) val);
//
//            val = fr.read();
//            System.out.println((char) val);
//            fr.close();
//
//            val = fr.read();
//            System.out.println((char) val);
//

//            int val;
//            while ((val = fr.read()) != -1){
//                System.out.print((char) val);
//            }
//
//            char [] cbuf = new char [255];
//            val = fr.read(cbuf);
//
//            for(int i =0; i< cbuf.length; i++)
//                System.out.print(cbuf [i]);

            BufferedReader br = new BufferedReader(fr);

            String str;
//            str = br.readLine();
//            System.out.println(str);
//
//            str = br.readLine();
//            System.out.println(str);
//
//            str = br.readLine();
//            System.out.println(str);


            double cgp;
            double maxCGPA = 0;
            String maxStudent = "";

            // Find the maximum CGPA
            while ((str = br.readLine()) != null) {

                String[] info = str.split(" ");

                cgp = Double.parseDouble(info[1]);

                if (cgp > maxCGPA) {
                    maxCGPA = cgp;
                    maxStudent = info[0];
                }
            }


            System.out.println("Maximum CGPA: " + maxCGPA);
            System.out.println("Student: " + maxStudent);


            fr.close();
            br.close();

        } catch (IOException e) {
            System.out.println("IO Exception happened");
        }

    }
// Try-Catch Block
//        try {
//            // Attempt to execute the code
//        } catch(){
//            // Catch the issue: What went wrong in trying to execute the code
//        }

}