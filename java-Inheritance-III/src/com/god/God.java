package com.god;

import com.live.Animal;
import com.live.Human;
import com.live.LivingThing;

// " closed for modification , open for extension "

public class God {

	// public void manageHuman(Human human) {
	// human.eat();
	// human.sleep();
	// human.study();
	// human.work();
	// }
	//
	// public void manageAnimal(Animal animal) {
	// animal.eat();
	// animal.sleep();
	// animal.work();
	// }

	public void manageLT(LivingThing liveT) {
		liveT.eat();
		liveT.sleep();
		if (liveT instanceof Human) {
			Human human = (Human) liveT;
			human.study();
		}
		liveT.work();
	}

}
