package com.app.door.listener;

import com.app.door.DoorListener;

public class Light implements DoorListener {

	@Override
	public void on() {
		System.out.println("Light ON");
	}

	@Override
	public void off() {
		System.out.println("Light OFF");
	}

}
