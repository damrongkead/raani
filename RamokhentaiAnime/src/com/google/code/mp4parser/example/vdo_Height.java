package com.google.code.mp4parser.example;
import java.io.File;

public class vdo_Height {
	public static void main(String[] args) {
		String a = "G:\\New folder\\SubEng\\Uploading\\15 Bishoujo Hyouryuuki 01 - [Sub Eng]";
		String s = "G:\\New folder\\SubEng\\Uploading\\15 Bishoujo Hyouryuuki 01 - [Sub Eng] -(#1 848x480)-.mp4";

		File file1 = new File(a);
		File file2 = new File(s);
		System.out.println(file1.renameTo(file2));
	}

}
