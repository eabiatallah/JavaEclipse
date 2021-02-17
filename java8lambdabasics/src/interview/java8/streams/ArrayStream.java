package interview.java8.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayStream {

	public static void main(String[] args) throws IOException {
		 String[] names = {"Elias", "Elie", "Tony", "Jean","Alan","Dimi"};
		 //Consumer = void accept(T t);
		 //Predicate =  boolean test(T t);
		 
		 Arrays.stream(names).forEach(n -> System.out.println(n));
		 System.out.println("-------\n");
		 
	 
		 Arrays.stream(names).sorted().findFirst().ifPresent(n -> System.out.println(n));
		 System.out.println("-------\n");
		 
		 Arrays.stream(names).filter(n -> n.startsWith("E")).sorted().forEach(n -> System.out.println(n));
		 System.out.println("-------\n");
//		
		 Arrays.stream(names).map(n -> n.toUpperCase()).sorted().filter(n -> n.startsWith("E")).forEach(n -> System.out.println(n));
		 System.out.println("-------\n");

		 int[] numbers = {2,4,6,8,10};
		 Arrays.stream(numbers)
		       .average().ifPresent(n -> System.out.println(n));
		 System.out.println("-------\n");
//		
		 Arrays.stream(numbers).map(x -> x * x).forEach(n -> System.out.println(n));
		 System.out.println("-------\n");
		 
		 Arrays.stream(numbers).map(x -> x * x).average().ifPresent(n -> System.out.println(n));
		 System.out.println("-------\n");
//		 
//		 List<String> people = Arrays.asList("Elias", "Elie", "Tony", "Jean","Alan","Dimi");
//		 
//		 people.stream().map(n -> n.toLowerCase()).filter(n -> n.startsWith("e")).forEach(n -> System.out.println(n));
//		 
//		 System.out.println("-------\n");
//		 // read a file
//		 Stream<String> bands = Files.lines(Paths.get("C:\\Users\\Elias\\Desktop\\brands.txt"));
//		 bands
//		     .sorted()
//		     .filter(x -> x.length() > 13)
//		     .forEach(x -> System.out.println(x));
//		 bands.close();
//		 
//		 System.out.println("-------\n");
//		 // read a file
//		 Stream<String> rows2 = Files.lines(Paths.get("C:\\Users\\Elias\\Desktop\\data.txt"));
//		 rows2
//		     .map(x -> x.split(","))
//		     .filter(x -> x.length == 3)
//		     .filter(x -> Integer.parseInt(x[1])>16 )
//		     .forEach(x -> System.out.println(x[0]+" "+x[1]+" "+x[2]));
//		 rows2.close();
//		 
//		 System.out.println("-------\n");
//		 // HashMap 
//		 Stream<String> rows3 = Files.lines(Paths.get("C:\\Users\\Elias\\Desktop\\data.txt"));
//		 Map<String, Integer> map = new HashMap<>();
//		 map = 		 
//		 rows3
//		     .map(x -> x.split(","))
//		     .filter(x -> x.length == 3)
//		     .filter(x -> Integer.parseInt(x[1])>16 )
//		     .collect(Collectors.toMap(x -> x[0], x -> Integer.parseInt(x[1])));
//		 rows3.close();
//		 
//		 for(String s:map.keySet())
//		 {
//			 System.out.println(s + " "+map.get(s));
//		 }
//		 System.out.println("-------\n");
//		 
//		 double total = Stream.of(7.3, 1.5, 4.8)
//				       .reduce(0.0, (Double a, Double b) -> a + b);
//		 
//		 System.out.println(total);
//		 
//		 System.out.println("-------\n");
		 IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10)
				 .summaryStatistics();
		 
		 System.out.println(summary);
		 

	}

}
