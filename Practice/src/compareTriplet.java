import java.util.ArrayList;
import java.util.List;

public class compareTriplet {

	// Complete the compareTriplets function below.
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> score = new ArrayList<>();
		Integer a_point = 0, b_point = 0;


		for (int i = 0; i < a.size(); i++) {

			if (a.get(i) > b.get(i)) {
				a_point++;
			}
			if (a.get(i) < b.get(i)) {
				b_point++;
			}
			if (a.get(i) == b.get(i)) {
//				a_point = a_point;
//				b_point = b_point;
			}

		}
		score.add(a_point);
		score.add(b_point);
		return score;
	}

	public static void main(String[] args)  {

		List<Integer> Alice = new ArrayList<>();
		List<Integer> Bob = new ArrayList<>();
		Alice.add(5);
		Alice.add(6);
		Alice.add(7);
		Bob.add(3);
		Bob.add(6);
		Bob.add(10);
		System.out.println(compareTriplets(Alice, Bob));

	}
}
