package com.epam.patterns.prototype;

import com.epam.patterns.builder.Droid;

import java.awt.event.KeyEvent;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data data = new Data();
		data.setName("qwerty");
		data.setYear(1999);
		System.out.println("Data : " + data);
		try {
			Data dataClone = (Data) data.clone();
			System.out.println("Clone Data : " + dataClone);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
