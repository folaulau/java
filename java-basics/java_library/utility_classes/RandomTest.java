package utility_classes;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class RandomTest {

	@Test
	public void testRandom() {
		Random r = new Random();
		System.out.println("nextGaussian: "+r.nextGaussian());
		System.out.println("nextInt: "+r.nextInt());
		System.out.println("nextDouble: "+r.nextDouble());
		System.out.println("nextFloat: "+r.nextFloat());
		System.out.println("nextLong: "+r.nextLong());
		System.out.println("nextBoolean: "+r.nextBoolean());
		
		System.out.println();
		
		r = new Random(5);
		System.out.println("nextGaussian: "+r.nextGaussian());
		System.out.println("nextInt: "+r.nextInt());
		System.out.println("nextDouble: "+r.nextDouble());
		System.out.println("nextFloat: "+r.nextFloat());
		System.out.println("nextLong: "+r.nextLong());
		System.out.println("nextBoolean: "+r.nextBoolean());
	}

}
