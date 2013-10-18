import java.util.HashSet;

class Sum0 {
	public static void main(String args[]) {
		HashSet<Integer> myset = new HashSet();
		int[] input = { -1, -3, 4, 5, -2, -4, 6 };

		for (int i = 0; i < input.length; i++)
			myset.add(input[i]);

		for (int i = 0; i < input.length; i++) {
			int n = input[i];
			int sum = n;
			String seq = sum + " ";
			int flag = 0;
			for (int j = i + 1; j < input.length; j++) {
				sum += input[j];

				seq += input[j] + " ";

				if (sum == 0) {
					flag = 1;
					break;
				}

			}
			if (flag == 1)
				System.out.println(seq);
			seq = "";
		}
	}
}
