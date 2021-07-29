package codeReview;

import java.util.ArrayList;
import java.util.List;

public class notMisUnderstood {

	public static void main(String[] args) {

		System.out.println("getLists");
		for (String output : getList()) {
			System.out.println(output);
		}

		System.out.println("targetLists");
		for (String output : targetList()) {
			System.out.println(output);
		}
	}

	// BAD
	private static String[] lists = { "a", "b", "c" };

	public static List<String> getList() {
		List<String> list = new ArrayList<String>();
		for (String str : lists) {
			if (!str.isEmpty()) {
				list.add(str);
			}
		}
		return list;
	}

	// GOOD
	private static String[] targetLists = { "Aa", "Bb", "Cc" };

	public static List<String> targetList() {
		List<String> targetList = new ArrayList<String>();
		for (String str : targetLists) {
			if (!str.isEmpty()) {
				targetList.add(str);
			}
		}
		return targetList;
	}

}
