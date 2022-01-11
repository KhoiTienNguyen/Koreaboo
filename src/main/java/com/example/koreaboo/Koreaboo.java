package com.example.asdf;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.Normalizer;
import java.util.HashMap;

public class Koreaboo {
	private static final HashMap<Integer, String> hm = new HashMap<Integer, String>();
	private static final HashMap<Integer, String> hm2 = new HashMap<Integer, String>();
	static {
		// start 00
		hm.put(12593, "g");
		hm.put(4352, "g");
		hm.put(4520, "g");
		hm.put(65441, "g");

		hm.put(12623, "a");
		hm.put(4449, "a");
		hm.put(65474, "a");

		// start 01
		hm.put(12594, "g");
		hm.put(4353, "g");
		hm.put(4521, "g");
		hm.put(65442, "g");
		// start 02
		hm.put(12596, "n");
		hm.put(4354, "n");
		hm.put(4523, "n");
		hm.put(65444, "n");
		// start 03
		hm.put(12599, "t");
		hm.put(4355, "t");
		hm.put(4526, "t");
		hm.put(65447, "t");
		// start 04
		hm.put(12600, "t");
		hm.put(4356, "t");
		hm.put(65448, "t");
		// start 05
		hm.put(12601, "l");
		hm.put(4357, "l");
		hm.put(4527, "l");
		hm.put(65449, "l");
		// start 06
		hm.put(12609, "m");
		hm.put(4358, "m");
		hm.put(4535, "m");
		hm.put(65457, "m");
		// start 07
		hm.put(12610, "b");
		hm.put(4359, "b");
		hm.put(4536, "b");
		hm.put(65458, "b");
		// start 08
		hm.put(12611, "p");
		hm.put(4360, "p");
		hm.put(65459, "p");
		// start 09
		hm.put(12610, "b");
		hm.put(4359, "b");
		hm.put(4536, "b");
		hm.put(65458, "b");
		// start 10
		hm.put(12613, "s");
		hm.put(4361, "s");
		hm.put(4538, "s");
		hm.put(65461, "s");
		// start 11
		hm.put(12614, "s");
		hm.put(4362, "s");
		hm.put(4539, "s");
		// start 12
		hm.put(12615, "");
		hm.put(4363, "");
		hm.put(4540, "");
		hm.put(65463, "");
		// start 13
		hm.put(12616, "j");
		hm.put(4364, "j");
		hm.put(4541, "j");
		hm.put(65464, "j");
		// start 14
		hm.put(12617, "j");
		hm.put(4365, "j");
		hm.put(65465, "j");
		// start 15
		hm.put(12618, "ch");
		hm.put(4366, "ch");
		hm.put(4542, "ch");
		hm.put(65466, "ch");
		// start 16
		hm.put(12619, "k");
		hm.put(4367, "k");
		hm.put(4543, "k");
		hm.put(65467, "k");
		// // start 17
		// hm.put(12615, "");
		// hm.put(4363, "");
		// hm.put(4540, "");
		// hm.put(65463, "");
		// start 18
		hm.put(12616, "j");
		hm.put(4364, "j");
		hm.put(4541, "j");
		hm.put(65464, "j");
		// start 19
		hm.put(12617, "J");
		hm.put(4365, "J");
		hm.put(65465, "J");
		// start 20
		hm.put(12620, "th");
		hm.put(4368, "th");
		hm.put(4544, "th");
		hm.put(65468, "th");
		// start 21
		hm.put(12621, "p");
		hm.put(4369, "p");
		hm.put(4545, "p");
		hm.put(65469, "p");
		// start 22
		hm.put(12622, "h");
		hm.put(4370, "h");
		hm.put(4546, "h");
		hm.put(65470, "h");

		// mid 00
		hm.put(12623, "a");
		hm.put(4449, "a");
		hm.put(65474, "a");
		// mid 01
		hm.put(12617, "j");
		hm.put(4365, "j");
		hm.put(65465, "j");
		// mid 02
		hm.put(12624, "ê");
		hm.put(4450, "ê");
		hm.put(65475, "ê");
		// mid 03
		hm.put(12625, "ya");
		hm.put(4451, "ya");
		hm.put(65476, "ya");
		// mid 04
		hm.put(12626, "yê");
		hm.put(4452, "yê");
		hm.put(65477, "yê");
		// mid 05
		hm.put(12627, "ô");
		hm.put(4453, "ô");
		hm.put(65478, "ô");
		// mid 06
		hm.put(12628, "ê");
		hm.put(4454, "ê");
		hm.put(65479, "ê");
		// mid 07
		hm.put(12629, "yơ");
		hm.put(4455, "yơ");
		hm.put(65482, "yơ");
		// mid 08
		hm.put(12630, "yê");
		hm.put(4456, "yê");
		hm.put(65483, "yê");
		// mid 09
		hm.put(12631, "ô");
		hm.put(4457, "ô");
		hm.put(65484, "ô");
		// mid 10
		hm.put(12632, "wa");
		hm.put(4458, "wa");
		hm.put(65485, "wa");
		// mid 11
		hm.put(12633, "wê");
		hm.put(4459, "wê");
		hm.put(65486, "wê");
		// mid 12
		hm.put(12624, "wê");
		hm.put(4460, "wê");
		hm.put(65487, "wê");
		// mid 13
		hm.put(12635, "yô");
		hm.put(4461, "yô");
		hm.put(65490, "yô");
		// mid 14
		hm.put(12636, "u");
		hm.put(4462, "u");
		hm.put(65491, "u");
		// mid 15
		hm.put(12637, "wơ");
		hm.put(4463, "wơ");
		hm.put(65492, "wơ");
		// mid 16
		hm.put(12638, "wê");
		hm.put(4464, "wê");
		hm.put(65493, "wê");
		// mid 17
		hm.put(12639, "wiu");
		hm.put(4465, "wiu");
		hm.put(65494, "wiu");
		// mid 18
		hm.put(12640, "yu");
		hm.put(4466, "yu");
		hm.put(65495, "yu");
		// mid 19
		hm.put(12641, "ư");
		hm.put(4467, "ư");
		hm.put(65498, "ư");
		// mid 20
		hm.put(12642, "ê");
		hm.put(4468, "ê");
		hm.put(65499, "ê");
		// mid 21
		hm.put(12643, "i");
		hm.put(4469, "i");
		hm.put(65500, "i");

		// ã„³
		hm2.put(12595, "gs");
		hm2.put(4522, "gs");
		hm2.put(65443, "gs");
		// ã„µ
		hm2.put(12597, "nj");
		hm2.put(4444, "nj");
		hm2.put(4524, "nj");
		hm2.put(65445, "nj");
		// ã„¶
		hm2.put(12598, "nh");
		hm2.put(4445, "nh");
		hm2.put(65446, "nh");
		hm2.put(4525, "nh");
		// ã„º
		hm2.put(12602, "lg");
		hm2.put(4528, "lg");
		hm2.put(65450, "lg");
		// ã„»
		hm2.put(12603, "lm");
		hm2.put(4529, "lm");
		hm2.put(65451, "lm");
		// ã„¼
		hm2.put(12604, "ls");
		hm2.put(4530, "ls");
		hm2.put(65452, "ls");
		// ã„½
		hm2.put(12605, "lth");
		hm2.put(4531, "lth");
		hm2.put(65453, "lth");
		// ã„¾
		hm2.put(12606, "lp");
		hm2.put(4532, "lp");
		hm2.put(65454, "lp");
		// ã„¿
		hm2.put(12607, "lb");
		hm2.put(4533, "lb");
		hm2.put(65455, "lb");
		// ã…€
		hm2.put(12608, "lh");
		hm2.put(4378, "lh");
		hm2.put(4534, "lh");
		hm2.put(65456, "lh");
		// ã…„
		hm2.put(12612, "bs");
		hm2.put(4385, "bs");
		hm2.put(4537, "bs");
		hm2.put(65460, "bs");
	}

	public static String translate(String input) {
		String temp = "";
		StringBuilder writer = new StringBuilder();
		for (int n = 0; n < input.length(); n++) {
			String data = Normalizer.normalize(Character.toString(input.charAt(n)), Normalizer.Form.NFD);
			for (int i = 0; i < data.length(); i++) {
				if (hm.containsKey((int) data.charAt(i))) {
					if ((((int) data.charAt(i)) == 12613 || ((int) data.charAt(i)) == 4361
							|| ((int) data.charAt(i)) == 4538 || ((int) data.charAt(i)) == 65461) && i == 2) {
						// out.print("t");
						writer.append("t");
						System.out.print("t");
					} else if ((((int) data.charAt(i)) == 12614 || ((int) data.charAt(i)) == 4362
							|| ((int) data.charAt(i)) == 4539)
							&& i == 2
							&& ((((int) (Normalizer.normalize(Character.toString(input.charAt(n + 1)),
									Normalizer.Form.NFD)).charAt(0)) == 12615)
									|| (((int) (Normalizer.normalize(Character.toString(input.charAt(n + 1)),
											Normalizer.Form.NFD)).charAt(0)) == 4363)
									|| (((int) (Normalizer.normalize(Character.toString(input.charAt(n + 1)),
											Normalizer.Form.NFD)).charAt(0)) == 4540)
									|| (((int) (Normalizer.normalize(Character.toString(input.charAt(n + 1)),
											Normalizer.Form.NFD)).charAt(0)) == 65463))) {
						// out.print("s");
						writer.append("s");
						System.out.print("s");
						temp = "s";
					} else if ((((int) data.charAt(i)) == 12614 || ((int) data.charAt(i)) == 4362
							|| ((int) data.charAt(i)) == 4539) && i == 2) {
						// out.print("t");
						writer.append("t");
						System.out.print("t");
					} else if ((((int) data.charAt(i)) == 12615 || ((int) data.charAt(i)) == 4363
							|| ((int) data.charAt(i)) == 4540 || ((int) data.charAt(i)) == 65463) && i == 2) {
						System.out.print("");
						// out.print(temp);
						writer.append(temp);
						System.out.print(temp);
						temp = "ng";
					} else if ((((int) data.charAt(i)) == 12615 || ((int) data.charAt(i)) == 4363
							|| ((int) data.charAt(i)) == 4540 || ((int) data.charAt(i)) == 65463) && i == 0) {
						// out.print(temp);
						writer.append(temp);
						System.out.print(temp);
						temp = "";
					} else {
						// out.print(hm.get((int) data.charAt(i)));
						writer.append(hm.get((int) data.charAt(i)));
						System.out.print(hm.get((int) data.charAt(i)));
					}
					if (i == data.length() - 1) {
						// out.print(" ");
						if (n != input.length() - 1) {
							if (input.charAt(n + 1) != ' ' && input.charAt(n + 1) != ','
									&& input.charAt(n + 1) != '?' && input.charAt(n + 1) != '"'
									&& input.charAt(n + 1) != '.' && input.charAt(n + 1) != '!'
									&& input.charAt(n + 1) != '(' && input.charAt(n + 1) != ')'
									&& !((((int) (Normalizer.normalize(Character.toString(input.charAt(n + 1)),
											Normalizer.Form.NFD)).charAt(0)) == 12615)
											|| (((int) (Normalizer.normalize(Character.toString(input.charAt(n + 1)),
													Normalizer.Form.NFD)).charAt(0)) == 4363)
											|| (((int) (Normalizer.normalize(Character.toString(input.charAt(n + 1)),
													Normalizer.Form.NFD)).charAt(0)) == 4540)
											|| (((int) (Normalizer.normalize(Character.toString(input.charAt(n + 1)),
													Normalizer.Form.NFD)).charAt(0)) == 65463))) {
								writer.append(" ");
								System.out.print(" ");
							}
							if (input.charAt(n + 1) != ' ' || input.charAt(n + 1) != ','
									|| input.charAt(n + 1) != '?' || input.charAt(n + 1) != '"'
									|| input.charAt(n + 1) != '.' || input.charAt(n + 1) != '!'
									|| input.charAt(n + 1) != '(' || input.charAt(n + 1) != ')'
									|| !((((int) (Normalizer.normalize(Character.toString(input.charAt(n + 1)),
											Normalizer.Form.NFD)).charAt(0)) == 12615)
											|| (((int) (Normalizer.normalize(Character.toString(input.charAt(n + 1)),
													Normalizer.Form.NFD)).charAt(0)) == 4363)
											|| (((int) (Normalizer.normalize(Character.toString(input.charAt(n + 1)),
													Normalizer.Form.NFD)).charAt(0)) == 4540)
											|| (((int) (Normalizer.normalize(Character.toString(input.charAt(n + 1)),
													Normalizer.Form.NFD)).charAt(0)) == 65463))) {
								temp = "";

							}
						}

					}
				} else if (hm2.containsKey((int) data.charAt(i))) {
					temp = (hm2.get((int) data.charAt(i))).substring(1);
					// out.print((hm2.get((int) data.charAt(i))).substring(0, 1));
					// out.print(" ");
					writer.append((hm2.get((int) data.charAt(i))).substring(0, 1));
					writer.append(" ");
					System.out.print((hm2.get((int) data.charAt(i))).substring(0, 1));
					System.out.print(" ");
					break;
				} else {
					// out.print(data.charAt(i));
					writer.append(data.charAt(i));
					System.out.print(data.charAt(i));
				}
			}

		}
		// out.println();
		writer.append("\n");
		// out.close();
		return writer.toString();
	}

}
