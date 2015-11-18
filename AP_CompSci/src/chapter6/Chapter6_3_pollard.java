//TODO fix 21(stack overflow)

package chapter6;

import java.util.Scanner;

public class Chapter6_3_pollard {

	public static void main(String[] args) {

		// long[] tests =
		// {	22357793,99833839,9727185,53907240,18457270,301710,3254804,31309586,49090184,97077905,16370058,91177255,85788373,82052073,31282918,49264281,82541960,59869650,31171063,11568832,20619450,84391253,32687440,80455020,29561455,49171564,60846375,75576820,96192917,44184065,68920660,9048649,52042319,81787557,83874096,31213287,21206936,7651318,59938559,95926504,33299073,57821113,13843946,38450029,72436212,85181974,81745644,64139516,41122391,25687142,81835632,79119007,46863767,45061058,62973997,50123642,8363202,17441796,56075004,69339318,68367066,84786793,66344697,41936755,48650104,63281386,43797509,80019794,17702245,30809890,80599244,86621118,89404591,27782272,82724461,68834009,65066460,76381855,85423171,16767736,17919865,80714912,28219425,63022109,81555384,43994941,7459931,58179766,649227,82680721,96426369,80756439,78434990,46929372,99214395,46537738,4592544,26188323,42714362,60068759,46920716,83769924,88686093,51059420,83251472,95842669,8404918,72089498,37112424,88203486,36178879,81884855,3814929,39481380,93510467,80359877,76039082,83095459,55962390,73347585,50949890,71448523,63403651,77196706,78353122,74587067,42263719,49716937,55836882,14450588,24101471,45489961,7666690,97671379,26645252,11073476,8427467,91960910,24808467,84014634,15294699,2291030,79899276,6966249,47273682,97745297,99463165,50837775,90113452,40843652,67926913,54913509,12315715,82133275,16729299,44875282,26838962,50181968,5161044,28242202,83083060,89493407,94438920,33974452,13212267,46616421,45689556,37351730,17493530,75512145,36224419,87259516,97779595,8449893,47578025,57480568,11826394,25780608,29339472,48825453,32451220,21179097,50344099,70256624,11953871,47317489,16763420,39126887,91845448,38921913,65917137,56852623,67204484,11050821,40824662,9181402,75661780,53437636,41902121,18519844,90125936,23460229,11259020,35600542,73809852,99825081,9783849,30372415,67657589,65812683,22294345,67551903,88871427,2442892,82238883,56598774,73175510,14701265,7378191,72134494,99285866,53679820,12373515,19056238,58186879,49305758,6949275,98338752,46653491,42989931,32663393,21624099,2447631,90552095,27795009,11690642,69911510,34733158,77811583,59895230,59548053,70838115,90925584,82559984,43014843,6784540,14444878,28954175,30435031,36445775,28101650,58371827,76682680,94862395};
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		long input = scan.nextLong();
		scan.close();
		// long start = System.currentTimeMillis();
		// for (long l : tests) {
		// System.out.print(l + " ");
		// factor(l,2,2);
		// }
		// long end = System.currentTimeMillis();
		// System.out.println("time: "+ (end-start));
		System.out.println("factors:");
		long start = System.currentTimeMillis();
		factor(input, 2, 2);
		long end = System.currentTimeMillis();
		System.out.println("time: " + (end - start));

	}

	public static long f(long x) {

		return x * x + 1;

	}

	public static boolean primeCheck(long number) {
		for (long i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void factor(long input, long a, long b) {

		if (primeCheck(input)) {
			System.out.println("Prime number");
			return;
		}

		long x = a;
		long y = b;

		long factor = 1;
		if (input % 2 == 0) {
			factor = 2;
		} else if (input % 5 == 0) {
			factor = 5;
		}
		else {
			while (factor == 1) {
				x = f(x) % input;
				y = f(f(y)) % input;
				factor = gcd(Math.abs(y - x), input);
			}
		}
		if (primeCheck(factor)) {
			System.out.println(factor);
		} else {
			System.out.println(factor);
			factor(factor, a, b);
		}
		if (primeCheck(input / factor)) {
			System.out.println(input / factor);
		} else {
			System.out.println(input / factor);
			factor(input / factor, a, b);
		}
		// System.out.println(factor);
	}

	public static long gcd(long value1, long value2) {

		while (value1 > 0 && value2 > 0) {
			if (value1 >= value2) {
				value1 %= value2;
			} else {
				value2 %= value1;
			}
		}
		return value1 > value2 ? value1 : value2;
	}
}