package org.system;

public class Desktop extends Computer {

	public void desktopSize() {

		System.out.println("Desktop size is 14 inches");
	}

	public static void main(String[] args) {

		Desktop comp = new Desktop();
		comp.computerModel();
		comp.desktopSize();

	}

}
