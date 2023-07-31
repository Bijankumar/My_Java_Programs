package Patterns;

public class Patterns {
	public static void main(String[] args) {
		int n = 7;
		int x = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (x <= 10)
					System.out.print(" " + x + "  ");
				else
					System.out.print(" " + x + " ");
				x++;
			}
			System.out.println();
		}
		System.out.println("  ====00====");
		char Y = 'A';
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(" " + Y + " ");
				Y++;
			}
			System.out.println();
		}
		System.out.println("  ====01====");
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'A'; j <= 'E'; j++) {
				System.out.print(" " + j + " ");
			}
			System.out.println();
		}
		System.out.println("  ====02====");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i % 2 == 0)
					System.out.print(" 0 ");
				else
					System.out.print(" 1 ");
			}
			System.out.println();
		}
		System.out.println("  ====03====");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i % 2 == 1)
					System.out.print(" 0 ");
				else
					System.out.print(" 1 ");
			}
			System.out.println();
		}
		System.out.println("  ====04====");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(" " + j + " ");
			}
			System.out.println();
		}
		System.out.println("  ====05====");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(" " + i + " ");
			}
			System.out.println();
		}
		System.out.println("  ====06====");

		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'A'; j <= 'E'; j++) {
				System.out.print(" " + i + " ");
			}
			System.out.println();
		}
		System.out.println("  ====07====");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j % 2 == 0)
					System.out.print(" 0 ");
				else
					System.out.print(" 1 ");
			}
			System.out.println();
		}
		System.out.println("  ====08====");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j % 2 == 0)
					System.out.print(" @ ");
				else
					System.out.print(" ! ");
			}
			System.out.println();
		}
		System.out.println("  ====08====");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j % 2 == 0)
					System.out.print(" # ");
				else
					System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println("  ====09====");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i % 2 == 1)
					System.out.print(" < ");
				else
					System.out.print(" > ");
			}
			System.out.println();
		}
		System.out.println("  ====10====");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i % 2 == 1)
					System.out.print(" ^ ");
				else
					System.out.print(" - ");
			}
			System.out.println();
		}
		System.out.println("  ====11====");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 && i + j <= n / 2 + 2 || j == n && i + j <= n + n / 2 + 1 || j == 1 && i + j >= n / 2 + 2
						|| i == n && i + j >= n + n / 2 + 1 || i == n / 2 + 1 || j == n / 2 + 1)
					System.out.print(" # ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
		System.out.println("  ====12====");

		for (int i = 1; i <= n; i++) {
			int a = 1;
			for (int j = 1; j <= n; j++) {
				if (j <= i)
					System.out.print(j + "  ");
				else {
					System.out.print(a + "  ");
					a++;
				}
			}
			System.out.println();
		}
		System.out.println("  ====13====");

		String str1 = "Bijan";
		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str1.length(); j++) {
				System.out.print(str1.charAt(j) + " ");
			}
			System.out.println();
		}
		System.out.println("  ====14====");

		String str = "Bijan";
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if (i >= j)
					System.out.print(str.charAt(j) + " ");
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("  ====15====");

		int a = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i % 2 != 0)
					System.out.print(a++ + " ");
				else
					System.out.print(--a + " ");
			}
			a = a + n;
			System.out.println();
		}
		System.out.println("  ====16====");

		String strr = "Bijan Kumar Dey"; // It's Length Should be Odd number
		int space = strr.length() / 2;
		int star = 1;
		for (int i = 1; i <= strr.length(); i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print(strr.charAt(j - 1) + " ");
			}
			if (i < strr.length() / 2 + 1) {
				space--;
				star += 2;
			} else {
				space++;
				star -= 2;
			}
			System.out.println();
		}
		System.out.println("  ====17====");

		int space1 = n / 2;
		int star1 = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space1; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= star1; j++) {
				System.out.print(j + " ");
			}
			if (i < n / 2 + 1) {
				space1--;
				star1 += 2;
			} else {
				space1++;
				star1 -= 2;
			}
			System.out.println();
		}
		System.out.println("  ====18====");

		int space2 = n / 2;
		int star2 = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space2; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= star2; j++) {
				System.out.print(j % 2 + " ");
			}
			if (i < n / 2 + 1) {
				space2--;
				star2 += 2;
			} else {
				space2++;
				star2 -= 2;
			}
			System.out.println();
		}
		System.out.println("  ====19====");

		int space3 = n / 2;
		int star3 = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space3; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= star3; j++) {
				if (j % 2 == 0)
					System.out.print("# ");
				else
					System.out.print("* ");
			}
			if (i < n / 2 + 1) {
				space3--;
				star3 += 2;
			} else {
				space3++;
				star3 -= 2;
			}
			System.out.println();
		}
		System.out.println("  ====20====");

		int space4 = n / 2;
		int star4 = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space4; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= star4; j++) {
				if (i % 2 == 0)
					System.out.print("# ");
				else
					System.out.print("* ");
			}
			if (i < n / 2 + 1) {
				space4--;
				star4 += 2;
			} else {
				space4++;
				star4 -= 2;
			}
			System.out.println();
		}
		System.out.println("  ====21====");

		int space5 = n / 2;
		int star5 = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space5; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= star5; j++) {
				System.out.print((char) (j + 64) + " ");
			}
			if (i < n / 2 + 1) {
				space5--;
				star5 += 2;
			} else {
				space5++;
				star5 -= 2;
			}
			System.out.println();
		}
		System.out.println("  ====22====");

		int space6 = n / 2;
		int star6 = 1, y;
		for (int i = 1; i <= n; i++) {
			y = 1;
			for (int j = 1; j <= space6; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= star6; j++) {
				if (j < star6 / 2 + 1)
					System.out.print(y++ + " ");
				else
					System.out.print(y-- + " ");
			}
			if (i < n / 2 + 1) {
				space6--;
				star6 += 2;
			} else {
				space6++;
				star6 -= 2;
			}
			System.out.println();
		}
		System.out.println("  ====23====");

		int space7 = n / 2;
		int star7 = 1, z;
		for (int i = 1; i <= n; i++) {
			z = 1;
			for (int j = 1; j <= space7; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= star7; j++) {
				if (j < star7 / 2 + 1)
					System.out.print((char) (64 + z++) + " ");
				else
					System.out.print((char) (64 + z--) + " ");
			}
			if (i < n / 2 + 1) {
				space7--;
				star7 += 2;
			} else {
				space7++;
				star7 -= 2;
			}
			System.out.println();
		}
		System.out.println("  ====24====");

		int space8 = n / 2;
		int star8 = 1, l = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space8; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= star8; j++) {

				System.out.print((char) (64 + l++) + " ");
			}
			if (i < n / 2 + 1) {
				space8--;
				star8 += 2;
			} else {
				space8++;
				star8 -= 2;
			}
			System.out.println();
		}
		System.out.println("  ====25====");

		int space9 = n / 2;
		int star9 = 1, k = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space9; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= star9; j++) {
				if (k < 10)
					System.out.print(k++ + " ");
				else
					System.out.print(k++ + " ");
			}
			if (i < n / 2 + 1) {
				space9--;
				star9 += 2;
			} else {
				space9++;
				star9 -= 2;
			}
			System.out.println();
		}
		System.out.println("  ====26====");

		int star11 = n, space11 = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space11; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= star11; j++) {
				System.out.print("* ");
			}
			System.out.println();
			if (i < n / 2 + 1) {
				space11++;
				star11 -= 2;
			} else {
				space11--;
				star11 += 2;
			}
		}
		System.out.println("  ====27====");

		int star12 = n, space12 = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space12; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= star12; j++) {
				if (i % 2 == 0)
					System.out.print("# ");
				else
					System.out.print("* ");
			}
			System.out.println();
			if (i < n / 2 + 1) {
				space12++;
				star12 -= 2;
			} else {
				space12--;
				star12 += 2;
			}
		}
		System.out.println("  ====28====");

		int star13 = n, space13 = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space13; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= star13; j++) {
				System.out.print(i % 2 + " ");
			}
			System.out.println();
			if (i < n / 2 + 1) {
				space13++;
				star13 -= 2;
			} else {
				space13--;
				star13 += 2;
			}
		}
		System.out.println("  ====29====");

		int star14 = n, space14 = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space14; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= star14; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
			if (i < n / 2 + 1) {
				space14++;
				star14 -= 2;
			} else {
				space14--;
				star14 += 2;
			}
		}
		System.out.println("  ====30====");

		int star15 = n, space15 = 0, d;
		for (int i = 1; i <= n; i++) {
			d = 1;
			for (int j = 1; j <= space15; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= star15; j++) {
				if (j < star15 / 2 + 1)
					System.out.print(d++ + " ");
				else
					System.out.print(d-- + " ");
			}
			System.out.println();
			if (i < n / 2 + 1) {
				space15++;
				star15 -= 2;
			} else {
				space15--;
				star15 += 2;
			}
		}
		System.out.println("  ====31====");

		int star16 = n, space16 = 0, e;
		for (int i = 1; i <= n; i++) {
			e = 1;
			for (int j = 1; j <= space16; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= star16; j++) {
				if (j < star16 / 2 + 1)
					System.out.print((char) (64 + e++) + " ");
				else
					System.out.print((char) (64 + e--) + " ");
			}
			System.out.println();
			if (i < n / 2 + 1) {
				space16++;
				star16 -= 2;
			} else {
				space16--;
				star16 += 2;
			}
		}
		System.out.println("  ====32====");

		int star17 = n, space17 = 0;
		for (int i = 1; i <= n; i++) {
			e = 1;
			for (int j = 1; j <= space17; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= star17; j++) {

				System.out.print((char) (64 + j) + " ");
			}
			System.out.println();
			if (i < n / 2 + 1) {
				space17++;
				star17 -= 2;
			} else {
				space17--;
				star17 += 2;
			}
		}
		System.out.println("  ====33====");

		int star18 = n, space18 = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space18; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= star18; j++) {
				System.out.print(j % 2 + " ");
			}
			System.out.println();
			if (i < n / 2 + 1) {
				space18++;
				star18 -= 2;
			} else {
				space18--;
				star18 += 2;
			}
		}
		System.out.println("  ====34====");

		int star19 = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= star19; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
			if (i < n / 2 + 1)
				star19++;
			else
				star19--;
		}
		System.out.println("  ====35====");

		int star21 = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= star21; j++) {
				System.out.print((char) (j + 64) + " ");
			}
			System.out.println();
			if (i < n / 2 + 1)
				star21++;
			else
				star21--;
		}
		System.out.println("  ====36====");

		int star20 = 1, space20 = n / 2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space20; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= star20; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
			if (i < n / 2 + 1) {
				star20++;
				space20--;
			} else {
				star20--;
				space20++;
			}
		}
		System.out.println("  ====37====");

		int star22 = 1, space22 = n / 2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space22; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= star22; j++) {
				System.out.print((char) (j + 64) + " ");
			}
			System.out.println();
			if (i < n / 2 + 1) {
				star22++;
				space22--;
			} else {
				star22--;
				space22++;
			}
		}
		System.out.println("  ====38====");
		int star23 = 1, space23 = n / 2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space23; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= star23; j++) {
				System.out.print(j % 2 + " ");
			}
			System.out.println();
			if (i < n / 2 + 1) {
				star23++;
				space23--;
			} else {
				star23--;
				space23++;
			}
		}
		System.out.println("  ====39====");

		int star24 = 1, space24 = n / 2;
		n = 7;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space24; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= star24; j++) {
				System.out.print(i % 2 + " ");
			}
			System.out.println();
			if (i < n / 2 + 1) {
				star24++;
				space24--;
			} else {
				star24--;
				space24++;
			}
		}
		System.out.println("  ====40====");

		int star25 = 1, space25 = n - 2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= star25; j++) {
				System.out.print("* ");
			}
			for (int j = 1; j <= space25; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= star25; j++) {
				if (j < n / 2 + 1)
					System.out.print("* ");
			}
			System.out.println();
			if (i < n / 2 + 1) {
				star25++;
				space25 -= 2;
			} else {
				star25--;
				space25 += 2;
			}
		}
		System.out.println("  ====41====");

		int star26 = 1, space26 = n - 2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= star26; j++) {
				System.out.print(i + " ");
			}
			for (int j = 1; j <= space26; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= star26; j++) {
				if (j < n / 2 + 1)
					System.out.print(i + " ");
			}
			System.out.println();
			if (i < n / 2 + 1) {
				star26++;
				space26 -= 2;
			} else {
				star26--;
				space26 += 2;
			}
		}
		System.out.println("  ====42====");

		int star27 = 1, space27 = n - 2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= star27; j++) {
				System.out.print(j + " ");
			}
			for (int j = 1; j <= space27; j++) {
				System.out.print("  ");
			}
			for (int j = star27; j >= 1; j--) {
				if (j < n / 2 + 1)
					System.out.print(j + " ");
			}
			System.out.println();
			if (i < n / 2 + 1) {
				star27++;
				space27 -= 2;
			} else {
				star27--;
				space27 += 2;
			}
		}
		System.out.println("  ====43====");

		int star28 = 1, space28 = n - 2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= star28; j++) {
				System.out.print(j % 2 + " ");
			}
			for (int j = 1; j <= space28; j++) {
				System.out.print("  ");
			}
			for (int j = star28; j >= 1; j--) {
				if (j < n / 2 + 1)
					System.out.print(j % 2 + " ");
			}
			System.out.println();
			if (i < n / 2 + 1) {
				star28++;
				space28 -= 2;
			} else {
				star28--;
				space28 += 2;
			}
		}
		System.out.println("  ====44====");
	}
}
