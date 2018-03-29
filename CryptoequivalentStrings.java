package com.resources;

import java.util.HashMap;

/*
 * Write a function that returns true/false if 2 
 * strings are cryptoequivalent [1->1 mapping between characters] . 
 * so dog -> cat = true, but ball -> base = false since L can't map to both S and E.
 */
public class CryptoequivalentStrings {

	public static void main(String[] args) {
		System.out.println(areCryptoequivalent("paper", "title"));

	}

	public static boolean areCryptoequivalent(String a, String b) {
		return areCryptoequivalentHelper(a, b) && areCryptoequivalentHelper(b, a);
	}

	public static boolean areCryptoequivalentHelper(String a, String b) {

		HashMap<Character, Character> map = new HashMap<>();

		for (int i = 0; i < a.length(); i++) {
			char aCh = a.charAt(i);
			char bCh = b.charAt(i);
			if (map.containsKey(aCh)) {
				if (map.get(aCh) != bCh)
					return false;
			} else {
				map.put(aCh, bCh);
			}
		}

		return true;
	}

}
