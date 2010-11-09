package jia.begins.exercises.basics.bozhidar.batsov;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author <a href="mailto:bozhidar@drow.bg">Bozhidar Batsov</a>
 */
public class Exercise1 {
    public static void main(String[] args) throws IOException {
        // create a file object associated with the target file
    	File employeesFile = new File ("employees.txt");
        // open the file in append mode
        PrintWriter pw = new PrintWriter(new FileWriter(employeesFile, true));
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter employee first name: ");
        String name = in.next();
        
        System.out.print("Enter employee last name: ");
        String lastName = in.next();
        
        System.out.print("Enter employee age: ");
        int age = in.nextInt();
        
        System.out.print("Enter employee position: ");
        String position = in.next();
        
        System.out.print("Enter employee salary: ");
        double salary = in.nextDouble();
        
        pw.println(String.format("%-15s %-15s %4d %-15s %10.2f", name, lastName, age, position, salary));

        pw.close();
        in.close();
    }
}
