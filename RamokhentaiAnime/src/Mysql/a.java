package Mysql;

import java.util.Scanner;
import java.util.ArrayList;

public class a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 48;
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<String> ep = new ArrayList<String>();
		ArrayList<String> iframe = new ArrayList<String>();
		ArrayList<String> image = new ArrayList<String>();

		for (int i = 0; i < number; i++)
			ep.add("");

		{
			System.out.println("name and image");
			for (int i = 0; i < number; i++) {
				String a = sc.nextLine();
				image.add(a.substring(a.indexOf("src=\"") + 5, a.indexOf(".jpg\" style=\"") + 4));
				if (a.contains("720p.mp4</b>")) {
					String s = a.substring(a.indexOf("r><b>") + 5, a.indexOf(" 720p.mp4</b>"));
					for (int j = 0; j < 10; j++) {
						if (s.substring(s.lastIndexOf(" ") + 1).equals(String.format("%02d", j))) {
							ep.set(i, String.format("%02d", j));
							s = s.substring(0, s.lastIndexOf(" "));
						}
					}
					name.add(s);

				} else if (a.contains(".mp4</b>")) {
					String s = a.substring(a.indexOf("r><b>") + 5, a.indexOf(".mp4</b>"));
					for (int j = 0; j < 10; j++) {
						if (s.substring(s.lastIndexOf(" ") + 1).equals(String.format("%02d", j))) {
							ep.set(i, String.format("%02d", j));
							s = s.substring(0, s.lastIndexOf(" "));
						}
					}
					name.add(s);
				}
			}
		//	System.out.println(name.get(0) + "//" + ep.get(0));
			//System.out.println(name.get(1) + "//" + ep.get(1));
		}
		////////////////////////////////////////////////////////////////
		{
			System.out.println("iframe");
			for (int i = 0; i < number; i++) {
				iframe.add(sc.nextLine());
			}
		}
		////////////////////////////////////////////////////////////////
		for (int i = 0; i < number; i++) {
			System.out.print("INSERT INTO `videoraw`(`name`, `ep`, `genre`, `iframe`, `image`,`view`) VALUES ");
			System.out.println("('" + name.get(i) + "','"+ep.get(i)+"','RAW','"+iframe.get(i)+"','"+image.get(i)+"','0');");
		}
	}
	// INSERT INTO `videoraw`(`name`, `ep`, `genre`, `iframe`, `image`,
	// `date`,`view`) VALUES
	// ([value-1],[value-2],[value-3],[value-4],[value-5],[value-6],[value-7],[value-8],[value-9])
}
