package utility_classes;

import static org.junit.Assert.*;

import java.util.Currency;
import java.util.Locale;

import org.junit.Test;

public class CurrencyTest {

	@Test
	public void testCurrency() {
		Currency currency = Currency.getInstance(Locale.US);
		
		System.out.println("Display Name: "+currency.getDisplayName());
		System.out.println("Currency Code: "+currency.getCurrencyCode());
		System.out.println("Default Fraction Digits: "+currency.getDefaultFractionDigits());
		System.out.println("Numeric Code: "+currency.getNumericCode());
		System.out.println("Symbol: "+currency.getSymbol());
	}

}
