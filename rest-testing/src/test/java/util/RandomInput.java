package util;

import org.apache.commons.math3.random.RandomDataGenerator;

public class RandomInput {

	/**
	 * @param args
	 */
	public static long generateLong() {
		long leftLimit = 10L;
	    long rightLimit = 100L;
	    long generatedLong = new RandomDataGenerator().nextLong(leftLimit, rightLimit);
		return generatedLong;

	}

}
