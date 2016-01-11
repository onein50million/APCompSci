package chapter7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Chapter7_5 {

	
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();

		names.addAll(Arrays.asList(new String[]{"Alice", "Bob", "Connie", "David", "Edward","Fran", "Gomez", "Harry"}));
		System.out.println(names);
		System.out.println(names.get(0) + ", " + names.get(names.size()-1));
		System.out.println(names.size());
		System.out.println(names.get(names.size()-1));
		names.set(0, "Alice B. Toklas");
		System.out.println(names);
		names.add(4,"Doug");
		System.out.println(names);
		for(String name:names){
			System.out.print(name + " ");
		}
		List<String> names2 = new ArrayList<>(names);
		System.out.println(names2);
		names.remove(0);
		System.out.println(names);
		System.out.println(names2);
	}

}
