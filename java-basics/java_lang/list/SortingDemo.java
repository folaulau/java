package list;
import java.util.Collections;
import java.util.List;

import utils.ConstantUtils;
import utils.ObjectUtils;

public class SortingDemo {

	public static void main(String[] args) {
		sortUsingComparable();

		sortUsingComparator();
	}

	private static void sortUsingComparator() {
		System.out.println("sortUsingComparator()");
		List<Member> members = ConstantUtils.generateMembers(10);

		Collections.sort(members, MemberSorting.getSortingByAge());

		System.out.println("members sorted by age=" + ObjectUtils.toJson(members));

		Collections.sort(members, MemberSorting.getSortingByName());

		System.out.println("members sorted by name=" + ObjectUtils.toJson(members));

		Collections.sort(members, MemberSorting.getSortingByGender());

		System.out.println("members sorted by gender=" + ObjectUtils.toJson(members));
	}

	private static void sortUsingComparable() {
		System.out.println("sortUsingComparable()");
		List<User> users = ConstantUtils.generateUsers(10);
		Collections.sort(users);

		System.out.println("users=" + ObjectUtils.toJson(users));
	}
}
