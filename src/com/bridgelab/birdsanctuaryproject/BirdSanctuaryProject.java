package com.bridgelab.birdsanctuaryproject;

public class BirdSanctuaryProject {
	public static void main(String[] args) {
		System.out.println("Welcome to Bird Sanctuary :");
		Duck duck = new Duck();
		Penguin penguin = new Penguin();
		Parrot parrot = new Parrot();
		Pigeon pigeon = new Pigeon();
		Owl owl = new Owl();
		
		BirdRepository birdRepo = new BirdRepository();
		
		UserInterface useInterface = new UserInterface();
		
		
		
		birdRepo.addBird(duck);
		birdRepo.addBird(pigeon);
		birdRepo.addBird(penguin);
		birdRepo.addBird(parrot);
		birdRepo.addBird(owl);
		System.out.println("Printing  birds after removing");
		birdRepo.removeBirds(owl);
		
		
		useInterface.print(birdRepo.getBirdList());
		useInterface.printFlyBirds(birdRepo.getBirdList());
	}

}
