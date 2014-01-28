package br.sr.ifes.edu.poo.fileexamples.cgd;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;

public class ExampleDataInputStream {

	public void printSimpleFile(String fileName) throws IOException{
		
		URL filePath = getClass().getResource(fileName);
		
		FileInputStream fileInputStream = null;
		
		DataInputStream in = null;
		
		int linha = 0;
		
		StringBuffer stringBuffer = new StringBuffer();
		
		try{
			System.out.println("File Path: "+filePath.getPath());
			
			fileInputStream = new FileInputStream(filePath.getPath());
			
			BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
			
			in = new DataInputStream(bufferedInputStream);
			
			linha = in.read();
			while (linha!=-1)
			{
				stringBuffer.append((char)linha);
				linha = in.read();
			}
			
			System.out.println(stringBuffer.toString());
		}
		finally{
			//Fechando o arquivo
			in.close();
		}
		
		

	}

}
