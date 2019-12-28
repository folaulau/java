package list;

import java.util.Comparator;

public interface MemberSorting {

	public static Comparator<Member> getSortingByName() {
		return new Comparator<Member>() {
			@Override
			public int compare(Member a, Member b) {
				return a.getName().compareTo(b.getName());
			}
		};
	}

	public static Comparator<Member> getSortingByAge() {
		return new Comparator<Member>() {
			@Override
			public int compare(Member a, Member b) {

				// age
				int order = a.getAge() - b.getAge();

				// name
				if (order == 0) {

					// if they have the same age, sort by name.
					// name is sorting in desc order
					order = b.getName().compareTo(a.getName());
				}

				// gender
				if (order == 0) {
					order = a.getGender().compareTo(b.getGender());
				}

				return order;
			}
		};
	}

	public static Comparator<Member> getSortingByGender() {
		return new Comparator<Member>() {
			@Override
			public int compare(Member a, Member b) {
				return a.getGender().compareTo(b.getGender());
			}
		};
	}
}
