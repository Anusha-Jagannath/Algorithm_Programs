package com.algorithm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Read in the following message: Hello <<name>>, We have your full
name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx.
Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.
Using Regex to replace name, full name, Mobile#, and Date with proper value.
 */
public class ReplaceRegex {

	private final String REGEX_NAME = "<<name>>";
	private final String REGEX_FULLNAME = "<<full name>> ";
	private final String REGEX_MOBILE_NO = "xxxxxxxxxx";
	private final String REGEX_DATE = "12/06/2016";

	public void replaceContents() throws IOException {
		try {
			UserDetails user = new UserDetails();
			File file = new File("/Users/anushajs/eclipse-workspace/Yml-training/Algorithm_Programs/src/data/user.txt");
			FileWriter writer = new FileWriter(
					"/Users/anushajs/eclipse-workspace/Yml-training/Algorithm_Programs/src/data/user.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = " ", oldtext = "";
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
				oldtext += line + "\r\n";
				String newtext = oldtext.replaceAll(REGEX_NAME, user.getFirstName());
				writer.write(newtext);

				String newtext2 = oldtext.replaceAll(REGEX_FULLNAME, user.getFirstName() + " " + user.getLastName());
				writer.write(newtext2);

				String newtext3 = oldtext.replaceAll(REGEX_MOBILE_NO, user.getMobileNo());
				writer.write(newtext3);

				String newtext4 = oldtext.replaceAll(REGEX_DATE, user.getDate());
				writer.write(newtext4);
			}
			reader.close();
			writer.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
