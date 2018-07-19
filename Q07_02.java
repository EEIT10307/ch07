package ch07;

import java.util.Calendar;

class StaticCodeBlock {
	static String season;

	static Calendar d = Calendar.getInstance();

	static int month = d.get(Calendar.MONTH);

	static {

		if (month >= 2 & month <= 4) {
			season = "春天";

		} else if (month >= 5 & month <= 7) {
			season = "夏天";
		} else if (month >= 8 & month <= 10) {
			season = "秋天";
		} else if (month == 11 | month <= 1) {
			season = "冬天";
		}

	}

}

public class Q07_02 {

	public static void main(String[] args) {

		System.out.println(StaticCodeBlock.season);

	}

}
