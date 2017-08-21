package com.app.door.listener;

import com.app.door.DoorListener;

public class AC implements DoorListener {

	@Override
	public void on() {
		System.out.println("AC ON");
	}

	@Override
	public void off() {
		System.out.println("AC OFF");
	}

}
