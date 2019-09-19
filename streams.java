package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		
//		memberNames.stream().filter((s) -> s.startsWith("A"))
//        .forEach(System.out::println);
		
//		memberNames.stream().filter((s) -> s.startsWith("A"))
//        .map(String::toUpperCase)
//        .forEach(System.out::println);
		
//		memberNames.stream().sorted()
//        .map(String::toUpperCase)
//        .forEach(System.out::println);
		
//		List<String> memNamesInUppercase = memberNames.stream().sorted()
//                .map(String::toUpperCase)
//                .collect(Collectors.toList());
//		System.out.print(memNamesInUppercase);
		
//		boolean matchedResult = memberNames.stream()
//                .anyMatch((s) -> s.startsWith("A"));
//
//System.out.println(matchedResult);
//
//matchedResult = memberNames.stream()
//                .allMatch((s) -> s.startsWith("A"));
//
//System.out.println(matchedResult);
//
//matchedResult = memberNames.stream()
//                .noneMatch((s) -> s.startsWith("A"));
//
//System.out.println(matchedResult);
		
//		long totalMatched = memberNames.stream()
//                .filter((s) -> s.startsWith("A"))
//                .count();
//
//System.out.println(totalMatched);
		
//		Optional<String> reduced = memberNames.stream()
//                .reduce((s1,s2) -> s1 + "#" + s2);
//
//reduced.ifPresent(System.out::println);

List<Integer> list1 = Arrays.asList(1,2,3);
List<Integer> list2 = Arrays.asList(4,5,6);
List<Integer> list3 = Arrays.asList(7,8,9);
  
List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);
 
List<Integer> listOfAllIntegers = listOfLists.stream()
                            .flatMap(x -> x.stream())
                            .collect(Collectors.toList());

System.out.println(listOfAllIntegers);



	}
}
