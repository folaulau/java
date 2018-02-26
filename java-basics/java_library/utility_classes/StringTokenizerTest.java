package utility_classes;

import static org.junit.Assert.*;

import java.util.StringTokenizer;

import org.junit.Test;

public class StringTokenizerTest {

	@Test
	public void testStringTokenizer() {
		String var = "title=The Complete Reference;" + "author=Schildt;" + "publisher=McGraw-Hill;"
				+ "copyright=2014";
		System.out.println("var: "+var);
		StringTokenizer st = new StringTokenizer(var, ";=");

		while (st.hasMoreTokens()) {
			String key = st.nextToken();
			String val = st.nextToken();
			System.out.println("key: " + key + "\t val: " + val);
		}
		System.out.println("\nOne delimeter parse");
		
		var = "Java,C++,C,C#,Swift";
		System.out.println("var: "+var);
		st = new StringTokenizer(var, ",");
		
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println("token: " + token);
		}
	}

}
