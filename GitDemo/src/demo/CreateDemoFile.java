package demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CreateDemoFile {

	public static void main(String[] args) throws IOException {
		
		//Create file
		File f = new File (System.getProperty("user.dir")+"//src//demo//DemoFile1.txt");
			if(f.exists()){
				f.delete();
				f.createNewFile();
			}
		
		//Write into file
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Line1 - DemoFile1.txt");
		bw.newLine();
		bw.write("Line2");
		bw.newLine();
		bw.write("Line3");
		bw.newLine();
		bw.write("Line4");
		bw.newLine();
		bw.write("Line5");
		bw.newLine();
		bw.write("***Last line - Have a nice day!***");
		bw.close();
		
		//Read file
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		//copy file contents into an ArrayList 
		String s = "";
		ArrayList list = new ArrayList();
			while((s=br.readLine())!=null){
				list.add(s);
			}
		//Print ArrayList
			System.out.println("No. of lines - "+list.size());
			for (int i = 0; i<list.size(); i++){
				System.out.println(list.get(i));
			}
			br.close();

	}

}
