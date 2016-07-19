package javaquick.programs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class javaInput {
	public static void main(String args[]) throws IOException {
		System.out.println("testing");
		String content = readTextFile("testfile");
		System.out.println(content);

	}

	public static String readTextFile(String fileName) throws IOException {
		String content = new String(Files.readAllBytes(Paths.get(fileName)));
		return content;
	}
}
