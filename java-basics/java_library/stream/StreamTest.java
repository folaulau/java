package stream;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

/**
 * Stream can be operated on only once
 * 
 * @author folaukaveinga
 *
 */
public class StreamTest {

	@Test
	public void testStream() {
		List<String> names = Arrays.asList("Folau", "Kinga", "Fusi");

		Stream<String> streamNames = names.stream();

		Optional<String> firstName = streamNames.findFirst();

		if (firstName.isPresent()) {
			System.out.println(firstName.get());
		}

		// error here because we are operating on streamNames twice
		// streamNames.filter((name) -> name.length() ==
		// 5).collect(Collectors.toList()).forEach((n) -> System.out.println(n));

		List<Integer> myList = Arrays.asList(20, 3, 34, 12, 22, 35, 67, 87, 54, 29);

		Stream<Integer> myStream = myList.stream().sorted();
		System.out.println("forEach");
		myStream.collect(Collectors.toList()).forEach(System.out::print);
		System.out.println("");
		// not error here because we created a new stream from myList
		Optional<Integer> minVal = myList.parallelStream().min(Integer::compareTo);
		if (minVal.isPresent())
			System.out.println("min: " + minVal.get());

	}

	@Test
	public void testReduce() throws Exception {
		List<Integer> myList = Arrays.asList(20, 3, 34, 12);
		Optional<Integer> addObj = myList.parallelStream().reduce((a, b) -> a + b);
		if (addObj.isPresent())
			System.out.println("Add as Optional: " + addObj.get());

		int evenProduct = myList.stream().reduce(1, (a, b) -> {
			if (b % 2 == 0)
				return a * b;
			else
				return a;
		});

		System.out.println("reduce product: " + evenProduct);
	}

	@Test
	public void testBinaryOperator() throws Exception {
		BinaryOperator<Integer> add = (a, b) -> a + b;
		System.out.println("sum: " + add.apply(2, 3));
	}

	// mapping is apply some transformation to the elements in a stream.
	@Test
	public void testMapping() throws Exception {
		List<String> alpha = Arrays.asList("a", "b", "c", "d");

		// here we are transforming all items in alpha into Upper Case
		List<String> collect = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(collect); // [A, B, C, D]

		// here we are transforming all items in num to * 2
		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> collect1 = num.stream().map((n) -> n * 2).collect(Collectors.toList());
		System.out.println(collect1); // [2, 4, 6, 8, 10]

		List<FlightAttendant> attendants = Arrays.asList(new FlightAttendant(1, "Folau"),
				new FlightAttendant(2, "Kinga"));

		List<Pilot> pilots = attendants.stream().map((attendant) -> new Pilot("12", attendant.age, attendant.name))
				.collect(Collectors.toList());

		pilots.forEach((pilot) -> {
			System.out.println(pilot);
		});

	}

	@Test
	public void testMapToInt() throws Exception {
		List<FlightAttendant> attendants = Arrays.asList(new FlightAttendant(1, "Folau"),
				new FlightAttendant(2, "Kinga"));

		int sum = attendants.stream().mapToInt(e -> e.age).sum();
		System.out.println("Sum of ages: " + sum);
	}

	// flatten a map that has multiple collections in it
	@Test
	public void testFlatMap() throws Exception {
		List<List<Integer>> integerLists = Arrays.asList(
				Arrays.asList(1, 2, 3, 4), 
				Arrays.asList(5, 6, 7), 
				Arrays.asList(8, 9, 10));

		List<Integer> intList = integerLists.stream().flatMap(Collection::stream).collect(Collectors.toList());
		System.out.println(intList);
	}
	
	@Test
	public void testCollecting() throws Exception {
		
	}
}
