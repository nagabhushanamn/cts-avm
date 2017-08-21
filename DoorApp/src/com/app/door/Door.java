package com.app.door;

import java.util.ArrayList;
import java.util.List;

public class Door {

	private List<DoorListener> doorListeners = new ArrayList<>();

	public void addDoorListener(DoorListener listener) {
		doorListeners.add(listener);
	}

	public void removeDoorListener(DoorListener listener) {
		doorListeners.remove(listener);
	}

	public void open() {
		System.out.println("Door Open");
		for (DoorListener listener : doorListeners) {
			listener.on();
		}
	}

	public void close() {
		System.out.println("Door Close");
		for (DoorListener listener : doorListeners) {
			listener.off();
		}
	}

}
