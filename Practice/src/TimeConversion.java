public class TimeConversion {

	/*
	 * Complete the timeConversion function below.
	 */
	static String timeConversion(String s) {
		/*
		 * Write your code here.
		 */
		// System.out.println(s.substring(5, 6));
		if (s.startsWith("12") && s.endsWith("PM")) {
			return s.substring(0, 8);
		}
		if(s.startsWith("12") && s.endsWith("AM")) {
			return "00".concat(s.substring(2,8));
		}
		
		if (s.endsWith("PM")) {
			Integer hr = Integer.valueOf(s.substring(0, 2));

			String time = null;
			switch (hr) {
			
			case 1:
				time = Integer.toString(13).concat(s.substring(2, 8));
				return time;

			case 2:
				time = Integer.toString(14).concat(s.substring(2, 8));
				return time;
			case 3:
				time = Integer.toString(15).concat(s.substring(2, 8));
				return time;

			case 4:
				time = Integer.toString(16).concat(s.substring(2, 8));
				return time;

			case 5:
				time = Integer.toString(17).concat(s.substring(2, 8));
				return time;

			case 6:
				time = Integer.toString(18).concat(s.substring(2, 8));
				return time;
			case 7:
				time = Integer.toString(19).concat(s.substring(2, 8));
				return time;
			
			case 8:
				time = Integer.toString(20).concat(s.substring(2, 8));
				return time;

			case 9:
				time = Integer.toString(21).concat(s.substring(2, 8));
				return time;
			case 10:
				time = Integer.toString(22).concat(s.substring(2, 8));
				return time;

			case 11:
				time = Integer.toString(23).concat(s.substring(2, 8));
				return time;
			}
		}
		return s;

	}

	public static void main(String[] args) {

		System.out.println(timeConversion("12:00:00AM"));
	}
}
