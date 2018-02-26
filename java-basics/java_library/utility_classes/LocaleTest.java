package utility_classes;

import static org.junit.Assert.*;

import java.util.Locale;

import org.junit.Test;

public class LocaleTest {

	@Test
	public void testLocale() {

		// create a new locale
		Locale locale = new Locale.Builder().setRegion("US").build();//new Locale("ENGLISH", "US");

		// print this locale
		System.out.println("Locale: " + locale);
		System.out.println("Country: " + locale.getCountry());
		System.out.println("Language: " + locale.getLanguage());
		System.out.println("Display Country: " + locale.getDisplayCountry());
		System.out.println("Display Language: " + locale.getDisplayLanguage());
		System.out.println("DisplayName: " + locale.getDisplayName());
		System.out.println("Display Variant: " + locale.getDisplayVariant());
		System.out.println("Display Variant: " + locale.getDisplayScript());
		System.out.println("ISO3 Language: " + locale.getISO3Language());

	}

}
