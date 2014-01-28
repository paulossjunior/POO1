package br.sr.ifes.edu.poo.fileexamples.cgd;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

public class ExampleBufferedWrite {
	
	public void writeFile (String information, String fileName) throws IOException
	{
		BufferedWriter bufferedWriter = null;
		
		try{
			FileWriter fileWriter = new FileWriter(fileName);
			
			bufferedWriter = new BufferedWriter(fileWriter);
			
			bufferedWriter.write(information);
			
		}finally {
			bufferedWriter.close();
		}
	}

}
