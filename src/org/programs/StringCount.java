package org.programs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class StringCount {
	public static void main(String[] args) {
		String s = "HARIHARAN M";
		Map<Character, Integer> mp = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (mp.containsKey(c)) {
				Integer count = mp.get(c);

				mp.put(c, count + 1);
			} else {
				mp.put(c, 1);
			}
		}
		System.out.println(mp);
		Set<Character> p = mp.keySet();
		for (Character u : p) {
			if (mp.get(u) > 1) {
				System.out.println(u);
			}
		}

		String o = "Hi Hello Welcome to Welcome to";
		String e[] = o.split(" ");

		Map<String, Integer> np = new LinkedHashMap<>();
		for (String r : e) {

			if (np.containsKey(r)) {
				Integer countt = np.get(r);
				np.put(r, countt + 1);
			} else {
				np.put(r, 1);
			}
		}
		System.out.println(np);
		Set<String> keySet = np.keySet();
		for (String y : keySet) {
			if (np.get(y) > 1) {
				System.out.println(y);
			}
		}
	}
}
