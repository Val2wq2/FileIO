
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String file_name = "src/input.txt";
        File f = new File(file_name);

        try {

            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String str;
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
            System.out.println("IO Exception happened: " );
        }
    }
}

