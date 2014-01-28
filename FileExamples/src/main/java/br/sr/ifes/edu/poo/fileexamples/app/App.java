package br.sr.ifes.edu.poo.fileexamples.app;

import java.io.IOException;

import br.sr.ifes.edu.poo.fileexamples.cgd.ExampleBufferedReader;
import br.sr.ifes.edu.poo.fileexamples.cgd.ExampleBufferedWrite;
import br.sr.ifes.edu.poo.fileexamples.cgd.ExampleDataInputStream;

public class App {

	public static void main(String[] args) {
		
		ExampleDataInputStream exampleDataInputStream  = new ExampleDataInputStream();
		ExampleBufferedReader exampleBufferedReader = new ExampleBufferedReader();
		ExampleBufferedWrite exampleBufferedWrite = new ExampleBufferedWrite();
		
		try {
			
			System.out.println("InputStream");
			exampleDataInputStream.printSimpleFile("/teste.txt");
			
			System.out.println("Buffered Reader");
			exampleBufferedReader.printSimpleFile("/teste.txt");
			
			System.out.println("Buffered Writer");
			exampleBufferedWrite.writeFile("xyz", "/Users/Paulo/Desktop/teste2.txt");
			
			System.out.println("Buffered Reader");
			exampleBufferedReader.printSimpleFile("teste2.txt","/Users/Paulo/Desktop");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
