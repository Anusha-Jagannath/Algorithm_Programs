package com.algorithm;

public class Anagram {
	
	/*
	 * method to check if two strings are anagram or not
	 */
	public void checkAnagram() {
		String s1 = "silent";
		String s2 = "listen";
		boolean isAnagram = false;
		boolean isVisited[] = new boolean[s2.length()];
		if(s1.length() == s2.length()) {
			for(int i=0;i<s1.length();i++) {
				char c = s1.charAt(i);
				for(int j=0;j<s2.length();j++) {
					if(c == s2.charAt(j) && !isVisited[j]) {
						isAnagram = true;
						isVisited[j] = true;
						break;
					}
				}
				
				if(!isAnagram) {
					break;
				}
			}
			
		}
		if(isAnagram) {
			System.out.println("Anagram");
		}
		else
			System.out.println("not Anagram");
	}

}
