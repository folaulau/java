package com.lovemesomecoding.collectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.lovemesomecoding.utils.GeneratorUtils;

public class CollectorsDemo {

	static List<String> alphabet = Arrays.asList("a", "b", "c", "d", "e");

	static List<User> users = new ArrayList<User>();

	static {

		for (int i = 0; i < 6; i++) {
			User user = new User();
			user.setName(GeneratorUtils.getFirstName() + " " + GeneratorUtils.getLastName());
			user.setAge(GeneratorUtils.getInteger(5, 30));
			user.setGender(GeneratorUtils.getGender());
			user.setHeight(GeneratorUtils.getDouble(5.5, 7.0));

			users.add(user);
			System.out.println(user.toString());
		}
	}

	public static void main(String[] args) {
		// demoToMap();
		//demoSummarizing();
		//demoGroupBy();
		demoPartioningBy();
	}

	public static void demoToMap() {
		Map<String, Integer> alphabetMap = alphabet.stream()
				.collect(Collectors.toMap(letter -> letter, letter -> letter.length()));

		System.out.println(alphabetMap);
	}

	public static void demoSummarizing() {
		DoubleSummaryStatistics alphabetStats = alphabet.stream()
				.collect(Collectors.summarizingDouble(letter -> letter.length()));

		System.out.println("average: " + alphabetStats.getAverage());
		System.out.println("count: " + alphabetStats.getCount());
		System.out.println("max: " + alphabetStats.getMax());
		System.out.println("sum: " + alphabetStats.getSum());
		System.out.println("min: " + alphabetStats.getMin());
	}

	public static void demoGroupBy() {
		
		System.out.println("\ndemo group by\n");
		
		Map<String, Set<User>> userMap = users.stream()
				.collect(Collectors.groupingBy(user -> user.getGender(), Collectors.toSet()));

		Set<User> males = userMap.get("MALE");

		System.out.println("male size: "+males.size()+" . "+males);
		
		Set<User> females = userMap.get("FEMALE");
		
		System.out.println("female size: "+females.size()+" . "+females);
	}
	
	public static void demoPartioningBy() {
		
		System.out.println("\ndemo partioning by\n");
		
		Map<Boolean, List<User>> people = users.stream()
				.collect(Collectors.partitioningBy(user -> user.getAge()>21));

		List<User> adult = people.get(true);

		System.out.println("adult size: "+adult.size()+" . "+adult);
		
		List<User> youngens = people.get(false);
		
		System.out.println("youngens size: "+youngens.size()+" . "+youngens);
	}

}
