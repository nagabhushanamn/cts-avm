package com.app;

import com.app.door.Door;
import com.app.door.listener.AC;
import com.app.door.listener.Light;

public class App {

	public static void main(String[] args) throws InterruptedException {

		Door door = new Door();
		Light light = new Light();
		AC ac = new AC();
		door.addDoorListener(light);
		door.addDoorListener(ac);

		Thread.sleep(5000);
		door.open();
		Thread.sleep(5000);
		door.close();
		Thread.sleep(5000);
		door.removeDoorListener(ac);
		door.open();
		Thread.sleep(5000);
		door.close();

	}

}
