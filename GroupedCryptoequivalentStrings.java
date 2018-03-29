package com.resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * Return list of lists of strings given a set of strings 
 * where each of the lists are grouped by cryptoequivalent strings.  
 * so if you have set of "abc", "dog" "ball" "call" "room". 
 * you'd return [["abc", "dog"] ["ball", "call] ["room"]]
 */
public class GroupedCryptoequivalentStrings {

	public static void main(String[] args) {
		List<String> input = new ArrayList<>();
		input.add("abc");
		input.add("dog");
		input.add("ball");
		input.add("call");
		input.add("room");
		groupCryptoequivalentStrings(input);
	}

	public static List<List<String>> groupCryptoequivalentStrings(List<String> input) {
		List<List<String>> result = new ArrayList<>();

		for (int i = 0; i < input.size(); i++) {
			List<String> currResult = new ArrayList<>();
			currResult.add(input.get(i));
			for (int j = i + 1; j < input.size(); j++) {
				if (areCryptoequivalent(input.get(i), input.get(j))
						&& areCryptoequivalent(input.get(j), input.get(i))) {
					currResult.add(input.get(j));
					input.remove(j);
				}
			}
			result.add(currResult);
		}

		return result;
	}

	public static boolean areCryptoequivalent(String a, String b) {
		if(a.length() == b.length())
			return areCryptoequivalentHelper(a, b) && areCryptoequivalentHelper(b, a);
		else
			return false;
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
