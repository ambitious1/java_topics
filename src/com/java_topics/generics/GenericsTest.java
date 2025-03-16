package com.java_topics.generics;

public class GenericsTest {

	public static void main(String[] args) {
		// Create a repository for User objects
        UserRepository<User> userRepository = new UserRepository<>();

        // Add users to the repository
        userRepository.add(new User("1", "Alice"));
        userRepository.add(new User("2", "Bob"));
        userRepository.add(new User("3", "Charlie"));

        // Display all users
        System.out.println("All Users:");
        for (User user : userRepository.getAll()) {
            System.out.println(user);
        }

        // Find a user by name
        User foundUser = userRepository.findBy(user -> user.getName().equals("Bob"));
        System.out.println("\nFound User: " + foundUser);

        // Remove a user by index
        userRepository.remove(1);

        // Display all users after removal
        System.out.println("\nUsers after removal:");
        for (User user : userRepository.getAll()) {
            System.out.println(user);
        }
	}

}
