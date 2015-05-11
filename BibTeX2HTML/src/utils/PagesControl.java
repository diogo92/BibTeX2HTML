package utils;

// Controls the "PAGES_V" token to be at correct values
public class PagesControl {

	// Control function for values separated by commas
	static boolean commaControl(String value) {
		String[] divided = value.split(",");

		int current = 0;
		
		// In case of singleton comma (',')
		if (divided.length == 0) {
			System.err.println("Invalid Pages Attribute: \',\' is singleton.");
			return false;
		}
		for (int i = 0; i < divided.length; i++) {
			int checker = 0;

			// Check if and only the last value has '+'
			if (divided[i].contains("+")) {
				if (i == divided.length - 1) {
					String[] plus = divided[i].trim().split("\\+");
					// Standard Format
					if (plus.length == 1) {
						checker = hyphenControl(plus[0]);
					} 
					// To accept "+%%" format
					else if (plus.length == 2) {
						if (plus[0].equals("")) {
							checker = hyphenControl(plus[1]);
							System.out.println(checker);
						} else {
							System.err
									.println("Invalid Pages Attribute: \'+\' must be with a single page.");
							return false;
						}
					} 
					// All others are discarded
					else {
						System.err
								.println("Invalid Pages Attribute: \'+\' must be with a single page.");
						return false;
					}
				} else {
					System.err
							.println("Invalid Pages Attribute: \'+\' is not the last value.");
					return false;
				}
			} else {
				// Check if every value separated by commas have an hyphen
				checker = hyphenControl(divided[i]);
			}

			// In case of invalid value
			if (checker == -1) {
				return false;
			}
			// Check if values are valid
			else {
				if (checker > current) {
					current = checker;
				}
				// In case the value is inferior or equal between commas
				else {
					System.err.println("Invalid Pages Attribute: " + current
							+ " >= " + checker + ".");
					return false;
				}
			}
		}

		return true;
	}

	// Control function for values separated by hyphen
	static int hyphenControl(String value) {
		String[] divided;

		// Check if it has single or double hyphen
		if (value.contains("--")) {
			divided = value.trim().split("--");
		} else {
			divided = value.trim().split("-");
		}

		int current = 0;

		// Returns directly if it has no hyphen
		if (divided.length == 1) {
			// Case of empty values
			if (divided[0].equals("") || divided[0].equals(null)) {
				System.err
						.println("Invalid Pages Attribute: value is null or empty.");
				return -1;
			} 
			// Reads the Integer
			else {
				return Integer.parseInt(divided[0]);
			}
		}
		// Standard Hyphen
		else if (divided.length == 2) {
			for (int i = 0; i < divided.length; i++) {
				// Case of singleton '-' or '--' with or without values
				if (divided[i].equals("")) {
					System.err
							.println("Invalid Pages Attribute: \'-\' or \'--\' is singleton.");
					return -1;
				}
				int checker = Integer.parseInt(divided[i]);
				// Check if values are valid
				if (checker > current) {
					current = checker;
				} 
				// In case the value is inferior or equal between hyphens
				else {
					System.err.println("Invalid Pages Attribute: " + current
							+ " >= " + checker + ".");
					return -1;
				}
			}
		}
		// Invalid Hyphen values size
		else {
			System.err
					.println("Invalid Pages Attribute: Hyphen seperations must have only two values!");
			return -1;
		}

		// Returns the highest value
		return current;
	}

	// Function used to run checker
	static boolean verifyPages(String value) {
		if (commaControl(value)) {
			return true;
		}

		return false;
	}

	// --- TESTS ---
	public static void main(String args[]) {
		System.out.println("----"); // true
		System.out.println(verifyPages("43"));
		System.out.println(verifyPages("43, 45"));
		System.out.println(verifyPages("43, 45+"));
		System.out.println(verifyPages("43-45"));
		System.out.println(verifyPages("43, 45, 47"));
		System.out.println(verifyPages("43, 45, 47+"));
		System.out.println(verifyPages("43, 45-47"));
		System.out.println(verifyPages("43, 45--47"));
		System.out.println(verifyPages("43, 45-47, 49--87"));
		System.out.println(verifyPages("43, 45-47, 49"));
		System.out.println(verifyPages("43, 45-47, 49+"));
		System.out.println(verifyPages("+33"));
		System.out.println("----"); // false
		System.out.println(verifyPages(""));
		System.out.println(verifyPages(","));
		System.out.println(verifyPages(", ,"));
		System.out.println(verifyPages("-43"));
		System.out.println(verifyPages(" , 33"));
		System.out.println(verifyPages("43, "));
		System.out.println(verifyPages("-"));
		System.out.println(verifyPages("-43"));
		System.out.println(verifyPages("--43"));
		System.out.println(verifyPages("-43, 32"));
		System.out.println(verifyPages("43, 32"));
		System.out.println(verifyPages("43+, 32"));
		System.out.println(verifyPages("43, 32+23"));
		System.out.println(verifyPages("43+, 32+"));
		System.out.println(verifyPages("43, 32+"));
		System.out.println(verifyPages("43-34"));
		System.out.println(verifyPages("43-34, -35"));
		System.out.println(verifyPages("43--34"));
		System.out.println(verifyPages("43--55--66"));
		System.out.println(verifyPages("43--22--66"));
		System.out.println(verifyPages("43, 45-34"));
		System.out.println(verifyPages("43-34, 45"));
		System.out.println(verifyPages("43-55, 75-73"));
		System.out.println(verifyPages("43-34"));
		System.out.println(verifyPages("43-44, 45+, 79"));
	}
}
