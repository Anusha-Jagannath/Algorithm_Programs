package com.algorithm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

	/*
	 * method to search word in list
	 */
	public void search()  {
		String string;
		String sentence[] = new String[10];
		int i = 0;
		int len = 0;
		File file = new File("/Users/anushajs/eclipse-workspace/Yml-training/Algorithm_Programs/src/data/input.csv");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			while ((string = br.readLine()) != null) {
				System.out.println(string);
				sentence[i++] = string;
				len++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
