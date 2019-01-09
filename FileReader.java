/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ade;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class FileReader {
  
  public static void main(String... aArgs) throws IOException{
      DbConnect db=new DbConnect();
    FileReader text = new FileReader();
    
    //treat as a small file
    List<String> lines = text.readSmallTextFile(FILE_NAME);
    //  System.out.println(lines);
   // "AT 555 	Royal Air Maroc 	(CMN) Casablanca 	5:21 AM 	En Route    On-time "
    System.out.println((int)('0')); 
    for (int i = 0; i < lines.size(); i++) {
        String data1="";
        Vector<String> info = new Vector<String>();
         String data=lines.get(i).toString();
         if(data.trim().length()<4){
         continue;
         }
         for(int j=0;j<data.length();j++){
                
         if((data.charAt(j)=='\t' && data.charAt(Math.abs(j-1))==' ') || (data.charAt(Math.abs(j-1))=='\t' && data.charAt(j)==' ')){
          info.addElement(data1.trim());
          // System.out.println((int) data.charAt(j));
           //   System.out.println(data1);
         data1="";
         }else{
            data1+=data.charAt(j);
            
          }
         
         if(data.length()-1==(j)){
          info.addElement(data1.trim());
           System.out.println(data1);
           data1="";
            try {
              String sql="insert into flight values(?,?,?,?,?,?,?,?)";
              db.ps=db.con.prepareStatement(sql);
              db.ps.setInt(1, 0);
              db.ps.setString(2, info.elementAt(0));
              db.ps.setString(3, info.elementAt(1));
              db.ps.setString(4,info.elementAt(2));
              db.ps.setString(5, info.elementAt(3));
              db.ps.setString(6,info.elementAt(4));
              if(info.size()>5){
              db.ps.setString(7,info.elementAt(5));
              }else{
              db.ps.setString(7, "");
              }
              
              db.ps.setString(8, "1");
              db.ps.execute();
          } catch (Exception e) {
              e.printStackTrace();
          }
           
         }
         }
          
         
         
 
      }
  //  log(lines);
  //  lines.add("This is a line added in code.");
   // text.writeSmallTextFile(lines, FILE_NAME);
    
    //treat as a large file - use some buffering
//    text.readLargerTextFile(FILE_NAME);
 //   lines = Arrays.asList("Down to the Waterline", "Water of Love");
 //   text.writeLargerTextFile(OUTPUT_FILE_NAME, lines);   
  }

  final static String FILE_NAME = "C:\\Users\\Oginni\\Documents\\NetBeansProjects\\ade\\src\\ade\\depart.txt";
  final static String OUTPUT_FILE_NAME = "C:\\Temp\\output.txt";
  final static Charset ENCODING = StandardCharsets.UTF_8;
  
  //For smaller files

  /**
   Note: the javadoc of Files.readAllLines says it's intended for small
   files. But its implementation uses buffering, so it's likely good 
   even for fairly large files.
  */  
  List<String> readSmallTextFile(String aFileName) throws IOException {
    Path path = Paths.get(aFileName);
    return Files.readAllLines(path, ENCODING);
  }
  
  void writeSmallTextFile(List<String> aLines, String aFileName) throws IOException {
    Path path = Paths.get(aFileName);
    Files.write(path, aLines, ENCODING);
  }

  //For larger files
  
  void readLargerTextFile(String aFileName) throws IOException {
    Path path = Paths.get(aFileName);
    try{
        Scanner scanner =  new Scanner(path, ENCODING.name());
      while (scanner.hasNextLine()){
        //process each line in some way
        log(scanner.nextLine());
      }      
    }catch(Exception e){
  
  }
  }
  
  void readLargerTextFileAlternate(String aFileName) throws IOException {
    Path path = Paths.get(aFileName);
    try {
        BufferedReader reader = Files.newBufferedReader(path, ENCODING);
      String line = null;
      while ((line = reader.readLine()) != null) {
        //process each line in some way
        log(line);
      }      
    }catch(Exception e){

    }
  }
  
  void writeLargerTextFile(String aFileName, List<String> aLines) throws IOException {
    Path path = Paths.get(aFileName);
    try{
        BufferedWriter writer = Files.newBufferedWriter(path, ENCODING);
      for(String line : aLines){
        writer.write(line);
        writer.newLine();
      }
    }catch(Exception e){

    }
  }

  private static void log(Object aMsg){
    System.out.println(String.valueOf(aMsg));
  }
  
} 
