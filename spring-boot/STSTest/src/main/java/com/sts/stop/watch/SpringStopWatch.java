package com.sts.stop.watch;

import org.springframework.util.StopWatch;

/**
 * @author xcaliber
 * @see Simple Java Program to measure elapsed execution time in Java This Java
 * Program shows two ways for measuring time in Java, by using System.nanoTime()
 * which was added in Java 5 and StopWatch which is a utility class from Spring
 * Framework.
 */
public class SpringStopWatch {

	protected SpringStopWatch() { }

    @SuppressWarnings("unused")
	public static void main(final String[] args) {

        //measuring elapsed time using System.nanoTime
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {

            Object obj = new Object();
        }
        long elapsedTime = System.nanoTime() - startTime;

        System.out.println("Total execution time to create 1000K objects in millis: "
                + elapsedTime / 1000000);

        //measuring elapsed time using Spring StopWatch
        StopWatch watch = new StopWatch();
        watch.start();
        for (int i = 0; i < 1000000; i++) {
            Object obj = new Object();
        }
        watch.stop();
        System.out.println("Total time to create 1000K objects using S.W. in millis: "
                + watch.getTotalTimeMillis());
}

}

/*Output:
Total execution time to create 1000K objects in Java in millis: 18
Total execution time to create 1000K objects in Java using StopWatch in millis: 15*/
