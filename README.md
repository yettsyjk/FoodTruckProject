# Food Truck
### Java Food Trucks Rating
 - Food Truck application created by Software Developer Yettsy Jo Knapp. Denver, CO.
### Overview
- Users will input and rate a list of five food trucks, then view the average rating and the highest-rated truck.

### Structure:
1. Define a FoodTruck class with fields for a unique numeric id, a name, food type, and a numeric rating.
1. Create a separate class with a main method that starts the program. It will have an array to store up to five FoodTruck objects.
1. The main method of this class is the only static method in the entire project.
1. There are no static methods other than the one main method.

### User Stories:
#### User Story #1
- The user is prompted to input the name, food type, and rating for up to five food trucks. For each set of input, a FoodTruck object is created, its fields set to the user's input, and it is added to the array. The truck id is not input by the user, but instead assigned automatically in the FoodTruck constructor from a static field that is incremented as each truck is created.
#### User Story #2
- If the user inputs quit for the food truck name, input ends immediately and the program continues.
#### User Story #3
- After input is complete, the user sees a menu from which they can choose to:

  - List all existing food trucks.
  - See the average rating of food trucks.
  - Display the highest-rated food truck.
  - Quit the program.

#### User Story #4
- After choosing a menu item, the user sees the menu again and can choose another item until the choose to quit.

### Lesson's Learned:
1. During our remote training, I struggled when understanding classes and the way classes work with arrays.  
1. I created an array within the FoodTruck Class, to iterate through each food truck the user was prompt to enter.
1. Creating a truck id through a method to increment each truck id (for each object created.) The object nextFoodTruckId was set to static int and was incrementing one at a time.
```private static int nextFoodTruckId = 1;
```
```public FoodTruck(String truckName, String foodType, int rating, int truckId) {
		super();
		this.truckName = truckName;
		this.foodType = foodType;
		this.rating = rating;
		this.truckId = nextFoodTruckId++;
	}
```
1. As we all experienced a shelter in place order by the State of Colorado during COVD19, I hope that we get to one day enjoy Denver food truck events similar to the events listed in https://roaminghunger.com/food-trucks/co/denver/1/
1. The FoodTruck App was quite a bit of fun to create and work through. I find myself re-writing code that fits the requirements of Java syntax. As a beginner in Java, dealing with syntax issues is really high at the moment.

### Technologies Used:
1. Git
1. GitHub version control
1. Java
1. Eclipse IDE
1. Terminal CLI

### Minimal Viable Product(MVP)
#### MVP:
  - There are no static methods other than the one main method.
  - When a FoodTruck is created, its constructor assigns its id field the current value of a static field (such as (nextTruckId) and then increments the static field.
  - The user can input up to five food trucks.
  - The user can stop inputing trucks before entering five by entering quit as the truck name, after which all input stops and the program continues.
  - When a menu item is chosen the list of all trucks entered is displayed. If less than five were input, only those trucks that were created are displayed.
  - When another menu item is chosen the average rating based on the number of trucks entered is displayed.
  - (STILL WORKING ON ) When another menu item is chosen the winning truck - the one that was input with the highest rating - is displayed with all its properties.
  - Food trucks are displayed by printing its toString, which includes all FoodTruck fields.
  - When the quit menu item is chosen, the program ends with a message.
#### MVP+
  - User may inadvertently select the wrong input or select enter key twice, fix the error message received in console by prompting user to try again


## Copyright (c)2020 Yettsy Knapp
- Let's Connect on [LinkedIn](https://www.linkedin.com/in/yettsy-jo-knapp)
