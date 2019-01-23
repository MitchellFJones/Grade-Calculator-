import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class GradeCalculator {
    public static void main(String [] args) {

        
    	 File f = new File("input_2.txt"); 
    	 
    	 String outputFileName = "output.txt";
    
        String line = null;

        List<String> gradeOutput = new ArrayList<>();

        try {
            
        	FileWriter fw = new FileWriter(outputFileName);
        	
        	


            
        	BufferedReader br = new BufferedReader(new FileReader(f)); 
        	
        	BufferedWriter bw = new BufferedWriter(fw);
        	  

            while((line = br.readLine()) != null) {
                System.out.println(line);
                
                String[] words = line.split(",");
                
                double avgGrade = 0;
                
                for(int i = 1; i < words.length;i++)
                {
                	int result = Integer.parseInt(words[i]);
                	
                	avgGrade += result;
                	
                }
                double finalGrade = avgGrade/10;
    
                String finalLetterGrade = "";
                
                if(finalGrade >= 97.5)
                {
                	finalLetterGrade = "A+";
                }
                else if (finalGrade < 97.5 && finalGrade >= 92.5)
                {
                	finalLetterGrade = "A";
                }
                else if (finalGrade < 92.5 && finalGrade >= 90.0)
                {
                	finalLetterGrade = "A-";
                }
                else if (finalGrade < 90.0 && finalGrade >= 87.5)
                {
                	finalLetterGrade = "B+";
                }
                else if (finalGrade < 87.5 && finalGrade >= 82.5)
                {
                	finalLetterGrade = "B";
                }
                else if (finalGrade < 82.5 && finalGrade >= 80.0)
                {
                	finalLetterGrade = "B-";
                }
                else if (finalGrade < 80.0 && finalGrade >= 77.5)
                {
                	finalLetterGrade = "C+";
                }
                else if (finalGrade < 77.5 && finalGrade >= 72.5)
                {
                	finalLetterGrade = "C";
                }
                else if (finalGrade < 72.5 && finalGrade >= 70.0)
                {
                	finalLetterGrade = "C-";
                }
                else if (finalGrade < 70.0 && finalGrade >= 67.5)
                {
                	finalLetterGrade = "D+";
                }
                else if (finalGrade < 67.5 && finalGrade >= 62.5)
                {
                	finalLetterGrade = "D";
                }
                else if (finalGrade < 62.5 && finalGrade >= 60.0)
                {
                	finalLetterGrade = "D-";
                }
                else if (finalGrade < 60.0 && finalGrade >= 0.0)
                {
                	finalLetterGrade = "F";
                }
                String result = String.format("%.1f", finalGrade);                
               
               
             
                gradeOutput.add(words[0]);
                
                gradeOutput.add(result);
                
                gradeOutput.add(finalLetterGrade);
                
                System.out.println(words[0] + ", " + result + ", " + finalLetterGrade);
                
                bw.write(words[0] + ", " + result + ", " + finalLetterGrade);
                
                bw.newLine();
            }   

            
            br.close();  
            
            bw.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                f + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + f+ "'");                  
            
        }
    }
}
