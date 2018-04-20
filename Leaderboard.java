import java.util.*;
import java.io.*;


//The first line of the file should be reserved to the number of lines of information
class Leaderboard{
   
   static Scanner file;
      
   public static void setFile(String s) throws IOException{
      file = new Scanner(new File(s));;
   }   
   
   public static void displayRawFile(){
      int lines = file.nextInt();
      file.nextLine();
      for(int temp = 0; temp < lines; temp++){
         System.out.println(file.nextLine());
      }
   }
   public static void displayFormattedFile(){
      int lines = file.nextInt();
      file.nextLine();
      System.out.println("Rank\t\tName\t\t\t\t\tScore");
      System.out.println("--------------------------------------");
      for(int temp = 0; temp < lines; temp++){
         String[] list = file.nextLine().split("\\s+");
         System.out.println(list[0] + "\t\t\t" + list[1] + ", " + list[2] + "\t\t\t" + list[3]);
      }
   }
}