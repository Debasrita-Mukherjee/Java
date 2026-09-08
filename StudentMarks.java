import java.io.*;
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
           
            System.out.print("Enter number of students: ");
            int n = sc.nextInt();
            sc.nextLine(); 

            FileWriter fw = new FileWriter("student_results.txt");

            Writer writer = fw;

            for (int i = 1; i <= n; i++) {

                System.out.print("Enter name of student " + i + ": ");
                String name = sc.nextLine();

                System.out.print("Enter marks in 3 subjects: ");
                double mark1 = sc.nextDouble();
                double mark2 = sc.nextDouble();
                double mark3 = sc.nextDouble();
                sc.nextLine();

    
                double average = (mark1 + mark2 + mark3) / 3;

                writer.write("Student Name: " + name + "\n");
                writer.write("Marks: " + mark1 + ", " + mark2 + ", " + mark3 + "\n");
                writer.write("Average Marks: " + average + "\n");
                writer.write("-------------------------\n");
            }


            writer.close();

            System.out.println("\nStudent results stored successfully.");

            BufferedReader br =
                    new BufferedReader(new FileReader("student_results.txt"));

            System.out.println("\n--- Student Results ---");

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        sc.close();
    }
}


