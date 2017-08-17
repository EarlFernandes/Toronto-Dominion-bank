package com.td.mainframe;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CsvWriter {

	public static void CsvWrite(String[] data, String strFilePath) {

		PrintWriter csvWriter;

		try {

			StringBuffer oneLiner = new StringBuffer();

			File file = new File(strFilePath);
			if (!file.exists()) {
				file = new File(strFilePath);
			}

			csvWriter = new PrintWriter(new FileWriter(file, true));

			oneLiner.append(data[0] + "," + data[1] + "," + data[2] + "," + data[3] + "," + data[4]);
			oneLiner.append("\n");

			csvWriter.print(oneLiner);
			csvWriter.close();

		} catch (Exception e) {
			System.err.println("ATTENTION: Failed to write in csv");
			e.printStackTrace();
			System.exit(1);
		}
	}

}
