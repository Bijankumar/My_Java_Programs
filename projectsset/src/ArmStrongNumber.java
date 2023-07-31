class ArmStrongNumber {
	public static void main(String[] args) {
		int no = 153, copy = no, sum = 0;
		while (no != 0) {
			int base = no % 10;
			sum += power(base, count(copy));
			no /= 10;
		}
		if (sum == copy)
			System.out.println("Armstrong");
		else
			System.out.println("Not a Armstrong");
	}

	public static int count(int no) {
		int count = 0;
		while (no != 0) {
			no /= 10;
			count++;
		}
		return count;
	}

	public static int power(int base, int exp) {
		int ans = 1;
		while (exp != 0) {
			ans *= base;
			exp--;
		}
		return ans;
	}
}