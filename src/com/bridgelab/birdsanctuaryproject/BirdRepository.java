package com.bridgelab.birdsanctuaryproject;

import java.util.ArrayList;
import java.util.List;

public class BirdRepository {

	private List birdList = new ArrayList();

	List getBirdList() {
		return birdList;
	}

	void addBird(Duck duck) {
		birdList.add(duck);
	}

	void addBird(Pigeon pigeon) {
		birdList.add(pigeon);
	}

	void addBird(Penguin penguin) {
		birdList.add(penguin);
	}

	void addBird(Parrot parrot) {
		birdList.add(parrot);
	}

	void addBird(Owl owl) {
		birdList.add(owl);
	}

	void removeBirds(Owl owl) {
		birdList.remove(owl);
	}

}
