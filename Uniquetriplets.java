// JAVA program to count the number of
// unique triplets whose XOR is 0

public class GFG {
	// function to count the number of
	// unique triplets whose xor is 0
	static int countTriplets(int a[], int n)
	{

		// stores the count of unique triplets
		int count = 0;

		// traverse for all i, j, k pairs such that k>j>i
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {

					int xorr = a[i] ^ a[j] ^ a[k];

					// if xor of a[i], a[j] and a[k] is 0,
					// increase count by 1
					if (xorr == 0)
						count++;
				}
			}
		}

		return count;
	}
	public static void main(String[] args)
	{
		int a[] = { 1, 3, 5, 10, 14, 15 };
		int n = 6;
		System.out.println(countTriplets(a, n));
	}
}
