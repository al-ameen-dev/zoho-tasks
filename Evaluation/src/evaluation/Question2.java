package evaluation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Question2 {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] array = { 4, 1, 2, 3, 3, 3, 3, 1, 2, 5, 2 };
		int[] result = new int[array.length];
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (!map.containsKey(array[i])) {
				map.put(array[i], 1);
			} else {
				int val = map.get(array[i]);
				val += 1;
				map.put(array[i], val);
			}
		}

		List<String> listMaps = new ArrayList<>();
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			String str = "";
			for (int i = 0; i < entry.getValue(); i++) {
				str += entry.getKey();
			}
			listMaps.add(str);
		}
		for (int i = 0; i < listMaps.size(); i++) {
			for (int j = 0; j < listMaps.size(); j++) {
				if (listMaps.get(i).length() > listMaps.get(j).length()) {
					Collections.swap(listMaps, i, j);
				}
			}
		}
		for (String str : listMaps) {
			for (int i = 0; i < str.length(); i++) {
				result[index++] = str.charAt(i) - '0';
			}
		}
		System.out.println(Arrays.toString(result));
	}
}
