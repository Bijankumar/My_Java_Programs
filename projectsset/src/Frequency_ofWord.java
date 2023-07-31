class Frequency_ofWord {
	public static void main(String[] args) {
		String str = "Hare Krishna Hare Krishna Krishna Krishna Hare Hare Hare Rama Hare Rama Rama Rama Hare Hare";
		String[] strr = str.split(" ");
		int count;
		for (int i = 0; i < strr.length; i++) {
			count = 1;
			for (int j = i + 1; j < strr.length; j++) {
				if (strr[i].equalsIgnoreCase(strr[j])) {
					count++;
					strr[j] = " ";
				}
			}
			if (count > 1 && strr[i] != " ")
				System.out.println(strr[i] + " = " + count);
		}
	}
}