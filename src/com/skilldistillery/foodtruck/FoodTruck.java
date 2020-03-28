package com.skilldistillery.foodtruck;

public class FoodTruck {
	// private fields that require get and set methods
	private int truckId = 0;
	private int rating;
	private static int nextFoodTruckId = 1;
	private String truckName;
	private String foodType;

	// truckId getter and setter
	public int getTruckId() {
		return truckId;
	}

	public void setTruckId() {

	}

	// nextFoodTruckId getter and setters
	public static int getNextFoodTruckId() {
		return nextFoodTruckId;
	}

	public static void setNextFoodTruckId(int nextFoodTruckId) {
		FoodTruck.nextFoodTruckId = nextFoodTruckId;
	}

	// getTruckName getter and setters
	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

////////constructors are last in precedence//////////////
	public FoodTruck() {

	}

	public FoodTruck(String truckName, String foodType, int rating, int truckId) {
		super();
		this.truckName = truckName;
		this.foodType = foodType;
		this.rating = rating;
		this.truckId = nextFoodTruckId++;
	}

	@Override
	public String toString() {
		return "[Truck Name: " + truckName + ", Truck Id: " + truckId + ", Food Type: " + foodType + ", Current Rating: " + rating
				+ " ]";
	}

	////////////// methods/////////////
	public int id() {
		truckId++;
		return truckId;
	}

	public int getId() {
		return truckId;
	}

	public void setId(int id) {
		this.truckId = id;
	}
}
