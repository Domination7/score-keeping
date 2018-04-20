import java.io.*;

class Test{
   public static void main(String args[]) throws IOException{
      Leaderboard.setFile("file.dat");
      //Leaderboard.displayRawFile();
      Leaderboard.displayFormattedFile();
   } 
}