//Creating a New File

/*import java.io.File;
import java.io.IOException;

public class Examples {
   public static void main(String[] args) {
      try {
         File file = new File("C:/myfile.txt");
         
         if(file.createNewFile())System.out.println("Success");
         else System.out.println ("Error, file already exists.");
      }
      catch(IOException ioe) {
         ioe.printStackTrace();
      }
   }
}*/

//comparing paths

/*import java.io.File;

public class Examples {
   public static void main(String[] args) {
      File file1 = new File("C:/File/demo1.txt");
      File file2 = new File("C:/java/demo1.txt");
      
      if(file1.compareTo(file2) == 0) {
         System.out.println("Same!");
      } else {
         System.out.println(" Not Same!");
      }
   }
}*/

//Modifying Date

/*import java.io.File;
import java.text.SimpleDateFormat;

public class Examples {
   public static void main(String[] args) {
      File file = new File("Main.java");
      System.out.println("Before Format : " + file.lastModified());
      SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyyy hh:mm:ss");
      System.out.println("After Format : " + sdf.format(file.lastModified()));
   }
}*/

// read 

/*import java.io.*;

public class Examples {
   public static void main(String[] args)  {
      try {
         BufferedReader in = new BufferedReader(new FileReader("c:\\filename"));
         String str;
      
         while ((str = in.readLine()) != null) {
            System.out.println(str);
         }
         System.out.println(str);
      } catch (IOException e) {
      }
   }
}*/

//Delete File

/*import java.io.*;

public class Examples {
   public static void main(String[] args) { 
      try {
         BufferedWriter out = new BufferedWriter (new FileWriter("filename"));
         out.write("aString1\n");
         out.close();
         boolean success = (new File("filename")).delete();
         
         if (success) {
            System.out.println("The file has been successfully deleted"); 
         }
         BufferedReader in = new BufferedReader(new FileReader("filename"));
         String str;
         
         while ((str = in.readLine()) != null) {
            System.out.println(str);
         }
         in.close();
      }catch (IOException e) {
         System.out.println("exception occoured"+ e);
         System.out.println("File does not exist or you are trying to read a file that has been deleted");
      }
   }
}*/

// another approach

/*import java.io.File;

public class Examples { 
   public static void main(String[] args) { 
      try { 
         File file = new File("C:\\Users\\Snigdha\\Desktop\\file.txt");
         if(file.delete()) { 
            System.out.println(file.getName() + " is deleted!");
         } else {
            System.out.println("Delete operation is failed.");
    		}
      } catch(Exception e) {
         e.printStackTrace();
      }
   }
}*/

//write

/*import java.io.*;

public class Examples {
   public static void main(String[] args) {
      try {
         BufferedWriter out = new BufferedWriter(new FileWriter("outfilename"));
         out.write("aString");
         out.close();
         System.out.println("File created successfully");
      }
      catch (IOException e) {
      }
   }
}*/

//another

/*import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Examples {
   public static void main(String[] args) {
      try {
         String content = "TutorialsPoint is one the best site in the world";
         File file = new File("C:\\Users\\Snigdha\\Desktop\\abc.txt");
         if (!file.exists()) {
            file.createNewFile();
         } 
         FileWriter fw = new FileWriter(file.getAbsoluteFile());
         BufferedWriter bw = new BufferedWriter(fw);
         bw.write(content);
         bw.close();
         
         System.out.println("Done");
      } catch (IOException e) {
         e.printStackTrace();
      } 
   } 
}*/

//Temp File

/*import java.io.*;

public class Examples {
   public static void main(String[] args) throws Exception {
      File temp = File.createTempFile ("pattern", ".suffix");
      temp.deleteOnExit(); 
      BufferedWriter out = new BufferedWriter (new FileWriter(temp));
      out.write("aString");
      System.out.println("temporary file created:");
      out.close();
   }
}*/

//another way

/*import java.io.File;
import java.io.IOException;

public class Examples { 
   public static void main(String[] args) { 
      try { 
         File f1 = File.createTempFile("temp-file-name", ".tmp");
    	   System.out.println("Temp file : " + f1.getAbsolutePath());
      } catch(IOException e) { 
         e.printStackTrace();
      } 
   }
}
*/

//renaming

/*import java.io.File;

public class Examples {
   public static void main(String[] args) {
      File oldName = new File("C:/program.txt");
      File newName = new File("C:/java.txt");
      
      if(oldName.renameTo(newName)) {
         System.out.println("renamed");
      } else {
         System.out.println("Error");
      }
   }
}*/


//copying

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class Examples {
   public static void main(String[] args) {
      FileInputStream ins = null;
      FileOutputStream outs = null;
      try {
         File infile =new File("C:\\Users\\Snigdha\\Desktop\\abc.txt");
         File outfile =new File("C:\\Users\\Snigdha\\Desktop\\bbc.txt");
         ins = new FileInputStream(infile);
         outs = new FileOutputStream(outfile);
         byte[] buffer = new byte[1024];
         int length;
         
         while ((length = ins.read(buffer)) > 0) {
            outs.write(buffer, 0, length);
         } 
         ins.close();
         outs.close();
         System.out.println("File copied successfully!!");
      } catch(IOException ioe) {
         ioe.printStackTrace();
      } 
   }
}
