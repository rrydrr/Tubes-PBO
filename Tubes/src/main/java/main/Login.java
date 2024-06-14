/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.main;
import java.util.Scanner;
/**
 *
 * @author tegar
 */
public class Login {
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin123";
    private static final String STUDENT_USERNAME = "student";
    private static final String STUDENT_PASSWORD = "student123";

    private static boolean isAdmin;

    public static boolean login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
            System.out.println("Admin login successful.");
            isAdmin = true;
            return true;
        } else if (username.equals(STUDENT_USERNAME) && password.equals(STUDENT_PASSWORD)) {
            System.out.println("Student login successful.");
            isAdmin = false;
            return true;
        } else {
            System.out.println("Invalid username or password. Please try again.");
            return false;
        }
    }

    public static void logout() {
        // Perform logout actions, if any
        System.out.println("Logged out successfully.");
    }

    public static boolean isAdmin() {
        return isAdmin;
    }
}
