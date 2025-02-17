package Week4.Day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

public static void main(String[] args) {
		
		Set<String> hashSet = new HashSet<String>();
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		Set<String> treeSet = new TreeSet<String>();
		
		hashSet.add("amala");
		hashSet.add("Jeevitha");
		hashSet.add("Pons");
		hashSet.add("Raja");
		hashSet.add("amala");
		
		linkedHashSet.add("keerthana");
		linkedHashSet.add("Nishanth");
		linkedHashSet.add("Jega");
		linkedHashSet.add("Hari");
		linkedHashSet.add("keerthana");
		
		
		treeSet.add("Venkatesh");
		treeSet.add("Jayapraksh");
		treeSet.add("Ninisha");
		treeSet.add("Senthil");
		treeSet.add("Venkatesh");
		
		System.out.println("<-----Hash Set----->"); // random order
		System.out.println(hashSet);
		System.out.println("<-----Linked Hash Set----->"); // insertion order
		System.out.println(linkedHashSet);
		System.out.println("<-----Tree Set----->"); // ASCII order
		System.out.println(treeSet);
		
		
		//enhanced for loop --> for each --> (to display the values in list form)
			// syntax->  for(DataType/wrapperClass  localVariableName : varibaleOf Array/collection){}
		
		for(String hashSetValue : hashSet ) {
			System.out.println(hashSetValue);
		}
		
		List<String> names = new ArrayList<String>(hashSet);
		names.addAll(treeSet);
		names.addAll(treeSet);
		System.out.println(names.get(4));
		System.out.println(names);
		
		Set<String> uniqueNames = new TreeSet<String>(names);
		System.out.println(uniqueNames);
		
		
	}
}
