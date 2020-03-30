package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Denver Food Truck Event!");
		FoodTruckApplication fta = new FoodTruckApplication();
		fta.Run();

	}

	FoodTruck[] foodTrucks = new FoodTruck[5];
	int highestRate = 0;

	// Run() run method
	public void Run() {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < foodTrucks.length; i++) {

			System.out.println("Enter Name of Food Truck You Visited Today: \n Enter Quit to go to Menu ");
			String truckName = sc.next();
			
			if (truckName.equalsIgnoreCase("q") || (truckName.equalsIgnoreCase("Quit"))) {
				break;
			}
			System.out.println("Enter Food Type:\n (Enter one word: American, Mexican, Sushi, Italian, Vietnamese, Candy, Sweets, Delicious) ");
			String foodType = sc.next();

			System.out.println(
					"Food truck " + (i + 1) + ": How Would You Rate Your Experience (1 for worse to 5 for Best) ");
			int rating = sc.nextInt();

			FoodTruck truck = new FoodTruck(truckName, foodType, rating, rating);
			foodTrucks[i] = truck;

		}
		int userInput;
		do {
			menu();
			userInput = sc.nextInt();
			switch (userInput) {
			case 1:
				listAvailableFoodTrucks();
				break;
			case 2:
				listAverageRating();
				break;
			case 3:
				listHighestRating();
				break;
			case 4:
				System.out.println("Check us out on www.roaminghunger.com for our next event in Denver, CO. ");
				break;
			default:
				System.out.println("Invalid Menu Choice");
				break;
			}

		} while (userInput != 4);
		sc.close();
	}

	public void menu() {
		System.out.println("|////////////////// Mile High City ///////////////////|");
		System.out.println("|///////////////// Food Truck Event //////////////////|");
		System.out.println("|////////////////////// MENU /////////////////////////|");
		System.out.println("|                                                     |");
		System.out.println("| 1:        Press 1 for List of Food Truck at Event   |");
		System.out.println("|                                                     |");
		System.out.println("| 2:        Press 2 for Food Truck Rating Average     |");
		System.out.println("|                                                     |");
		System.out.println("| 3:        Press 3 for Highest Rated Food Truck      |");
		System.out.println("|                                                     |");
		System.out.println("| 4:        Press 4 to Quit Program                   |");
		System.out.println("|                                                     |");
		System.out.println("|///////////Mile High City Food Truck Event///////////|");
	}

	public void listAvailableFoodTrucks() {
		for (FoodTruck foodTruck : foodTrucks) {
			if (foodTruck != null) {
				System.out.println(foodTruck + ": FOOD TRUCK CURRENTLY VISITED");
			}
			System.out.println("|------------------------------------------------| ");
		}
	}

	public void listAverageRating() {
		double sum = 0.0;
		double average = 0.0;
		int avarageRating = 0;
		for (avarageRating = 0; avarageRating < foodTrucks.length; avarageRating++) {
			if (foodTrucks[avarageRating] == null) {
				break;
			}
			int currentTruckRating = foodTrucks[avarageRating].getRating();
			sum = sum + currentTruckRating;
		}
		average = sum / avarageRating;
		System.out.println("\tAverage rating of food truck line-up: ");
		System.out.printf("%.2f", average);
		System.out.println();
	}

	public void listHighestRating() {
		for (int bestRating = 0; bestRating < foodTrucks.length; bestRating++) {
			if (foodTrucks[bestRating] == null) {
				break;
			}
			if (foodTrucks[bestRating].getRating() > highestRate) {
				highestRate = foodTrucks[bestRating].getRating();
			}
			if (highestRate == foodTrucks[bestRating].getRating()) {
				System.out.println("The Highest Rated Food Truck: " + foodTrucks[bestRating].toString());
			}
		}
	}

}
