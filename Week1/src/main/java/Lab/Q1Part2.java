/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab;
import java.util.*;
import java.io.*;
/**
 *
 * @author user
 */
public class Q1Part2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String filepath = "C:\\Users\\user\\Documents\\WIA1002\\VanessaJingTaing_22004847.txt";
        Scanner sc = new Scanner(new FileInputStream(filepath));
        
        while (sc.hasNext()){
            System.out.println(sc.nextLine());
        }
        sc.close();
        System.out.println("add on...");
        Scanner in = new Scanner(System.in);
        String line;
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(filepath,true)));
        while(!"close".equals(line=in.nextLine())){
            
            pw.println(line);
        }
        pw.close();
        
    }
    
}
