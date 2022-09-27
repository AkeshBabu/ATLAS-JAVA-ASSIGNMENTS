package com.amazon.atlas22.railwaycrossingapp;

import java.util.*;

import com.amazon.atlas22.railwaycrossingapp.controller.RailwayCrossingController;
import com.amazon.atlas22.railwaycrossingapp.controller.UserController;
import com.amazon.atlas22.railwaycrossingapp.model.RailwayCrossing;
import com.amazon.atlas22.railwaycrossingapp.model.User;

public class PublicApp {

	UserController controller;
	RailwayCrossingController railController;
	Scanner scanner;

	private static PublicApp app;

	public static PublicApp getInstance() {
		if(app == null) {
			app = new PublicApp();
		}
		return app;
	}

	private PublicApp(){
		controller = UserController.getInstance();
		railController = RailwayCrossingController.getInstance();
		scanner = new Scanner(System.in);
	}

	void register() {
		User user = new User();

		// Empty Next Line for Scanner Issue
		scanner.nextLine();

		System.out.println("Enter Name: ");
		user.setName(scanner.nextLine());

		System.out.println("Enter Email: ");
		user.setEmail(scanner.nextLine());

		System.out.println("Enter Password: ");
		user.setPassword(scanner.nextLine());

		user.setUserType(1);

		if(controller.registerUser(user)) {
			System.out.println(user.getName()+", You have Registered Successfully..");
			System.out.println("Navigating to the Railway Crossing Application");

			// Navigate to Home
			home();

		}else {
			System.err.println("Something Went Wrong. Please Try Again");
		}
	}

	void login() {
		User user = new User();

		// Empty Next Line for Scanner Issue
		scanner.nextLine();

		System.out.println("Enter Email: ");
		user.setEmail(scanner.nextLine());

		System.out.println("Enter Password: ");
		user.setPassword(scanner.nextLine());

		user.setUserType(1);

		if(controller.loginUser(user)) {
			System.out.println(user.getName()+", You have Logged In Successfully..");
			System.out.println("Navigating to the Railway Crossing Application");

			// Navigate to Home
			home();
		}else {
			System.err.println("Something Went Wrong. Please Try Again");
		}
	}

	void listCrossings() {
		Map<String, RailwayCrossing> crossings = (Map<String, RailwayCrossing>) railController.fetchCrossings();
		for(String key : crossings.keySet()) {
			System.out.println(crossings.get(key));
			System.out.println("-------------------------------");
		}
	}

	void searchCrossing(){
		//
		System.out.println("enter crossing name:");
		//String name=
		Map<String, RailwayCrossing> crossings = (Map<String, RailwayCrossing>) railController.fetchCrossings();
		Scanner scr=new Scanner(System.in);
		String name=scr.nextLine();
		for(String key : crossings.keySet()) {

			if (crossings.get(key).getName().equalsIgnoreCase(name)){
				System.out.println(key + "\nCrossing name:\n"+crossings.get(key).getName()+ "\nStatus:\n"+crossings.get(key).getStatus()+"\nSchedule:\n"+crossings.get(key).getSchedules());

			}

		}
	}

	void sort(){
		Map<String, RailwayCrossing> crossings = (Map<String, RailwayCrossing>) railController.fetchCrossings();

		System.out.println("Before Sorting by Values -"
				+ " as per insertion-order : \n");

		// iterate original LinkedHashMap
		for(Map.Entry<String, RailwayCrossing> lhmap :
				crossings.entrySet()){
			System.out.println("Key : "  + lhmap.getKey()
					+ "\t\t" + "Value : "  + lhmap.getValue());
		}

		//  get entrySet from LinkedHashMap object
		Set<Map.Entry<String, RailwayCrossing>> crossingsScheduleSet =
				crossings.entrySet();


		// convert LinkedHashMap to List of Map.Entry
		List<Map.Entry<String, RailwayCrossing>> crossingScheduleListEntry =
				new ArrayList<Map.Entry<String, RailwayCrossing>>(
						crossingsScheduleSet);

		//  sort list of entries using Collections class'
		// utility method sort(ls, cmptr)
		Collections.sort(crossingScheduleListEntry, Comparator.comparing(es -> es.getValue().getSchedules().values().toString()));

		//  clear original LinkedHashMap
		crossings.clear();

		// iterating list and storing in LinkedHahsMap
		for(Map.Entry<String, RailwayCrossing> map : crossingScheduleListEntry){
			crossings.put(map.getKey(), map.getValue());
		}

		System.out.println("\n\nSorted Railway Crossing by its Schedule"
				+ " in ascending-order\n");


		//  iterate LinkedHashMap to retrieved stored values
		for(Map.Entry<String, RailwayCrossing> lhmap : crossings.entrySet()){
			System.out.println("Key : "  + lhmap.getKey()
					+ "\t\t" + "Value : "  + lhmap.getValue());
		}
	}

	void home() {

		while(true) {

			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Welcome to Railway Crossing Home");
			System.out.println("1: List Railway Crossings");
			System.out.println("2: Search Railway Crossings");
			System.out.println("3: Sort Railway Crossings by Schedule");
			System.out.println("4: Close Public Application");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

			int choice = scanner.nextInt();
			switch (choice) {

				case 1:
					listCrossings();
					break;

				case 2:

					searchCrossing();
					break;

				case 3:
					sort();
					break;

				case 4:
					System.out.println("Thank You for using Railway Crossing App");
					break;

				default:
					System.err.println("Invalid Choice");
			}

			if(choice == 4) {
				break;
			}
		}
	}

	void startPublicApp() {

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Welcome User");
		System.out.println("We have "+controller.getUserCount()+" Users in the DataBase");
		System.out.println("1: Register");
		System.out.println("2: Login");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


		int choice = scanner.nextInt();
		switch (choice) {

			case 1:
				register();
				break;

			case 2:
				login();
				break;

			default:
				System.err.println("Invalid Choice");
		}
	}

}
