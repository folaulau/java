package properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Properties;

public class MyProperties {
	public static void main(final String[] args) {
		final Properties prop = new Properties();
		prop.put("DB_NAME", "solicitation");
		prop.put("DB_USER_ROOT", "sol_root");

		final Enumeration<?> enums = prop.propertyNames();

		while (enums.hasMoreElements()) {
			final String key = enums.nextElement().toString();
			final String value = prop.getProperty(key);
			System.out.println("Key : " + key + ", Value : " + value);
		}

		System.out.println("DB_NAME: " + prop.getProperty("DB_NAME"));

		OutputStream output = null;

		try {

			output = new FileOutputStream("config.properties");

			// set the properties value
			prop.setProperty("database", "localhost");
			prop.setProperty("dbuser", "mkyong");
			prop.setProperty("dbpassword", "password");

			// save properties to project root folder
			prop.store(output, null);

		} catch (final IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (final IOException e) {
					e.printStackTrace();
				}
			}

		}
		InputStream input = null;

		try {

			input = new FileInputStream("config.properties");

			// load a properties file
			prop.load(input);

			// get the property value and print it out
			System.out.println(prop.getProperty("database"));
			System.out.println(prop.getProperty("dbuser"));
			System.out.println(prop.getProperty("dbpassword"));

		} catch (final IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (final IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
