package WK2.D1.filecopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;

class filecopy {
  public static void main(String[] args) {

    byte[] array = new byte[50];
    try {
      FileInputStream sourceFile = new FileInputStream("C:/Users/lucky/Documents/GitHub/srmb2corejava/WK2/D1/filecopy/input.txt");
      FileOutputStream destFile = new FileOutputStream("C:/Users/lucky/Documents/GitHub/srmb2corejava/WK2/D1/filecopy/output.txt");

      // reads all data from input.txt
      sourceFile.read(array);

      // writes all data to newFile
      destFile.write(array);
      System.out.println("The input.txt file is copied to output.txt");

      // closes the stream
      sourceFile.close();
      destFile.close();
    }
    catch (Exception e) {
      e.getStackTrace();
    }
  }
}