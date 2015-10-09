package kr.ac.kookmin.exception.intro;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Trade {

	public void readFile() {

		String path = AAA.class.getResource("").getPath();

		// System.out.println(path);

		try {

			BufferedReader read = new BufferedReader(new FileReader(path + "a.txt"));
			String line;

			while ((line = read.readLine()) != null) {
				System.out.println(line);
			}
			
			read.close();

		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
