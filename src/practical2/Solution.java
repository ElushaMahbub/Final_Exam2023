package practical2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
	public static void main(String[] args) {
		String filePath = "data/words.txt";

		if (doesFileExist(filePath)) {
			try {
				readAndPrintDictionary(filePath);
			} catch (IOException e) {
				System.out.println("Error reading the file: " + e.getMessage());
			}
		} else {
			System.out.println("File does not exist at the specified path.");
		}
	}

	private static boolean doesFileExist(String path) {
		try {
			FileReader fileReader = new FileReader(path);
			fileReader.close();
			return true;
		} catch (IOException e) {
			return false;
		}
	}

	private static void readAndPrintDictionary(String path) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(path));
		String line;

		while ((line = reader.readLine()) != null) {
			String[] parts = line.split("-");
			if (parts.length >= 2) {
				String word = parts[0].trim();
				String[] meanings = parts[1].split(",");
				System.out.println(word);
				for (String meaning : meanings) {
					System.out.println(meaning.trim());
				}
			}
		}

		reader.close();
	}

}
