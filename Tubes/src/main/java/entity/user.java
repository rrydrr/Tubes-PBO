package main.java.entity;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RyD;
 */
//public class user {
//   public static class User {
//       private int id_pelajar;
//       private boolean isadmin;
//       private String username;
//       private String password;
//       
//       public User(int id_pelajar, boolean isadmin, String username, String password) {
//        this.id_pelajar = id_pelajar;
//        this.isadmin = isadmin;
//        this.username = username;
//        this.password = password;
//       }
//       
//        public void getDetails() {
//            System.out.println(this.id_pelajar);
//            System.out.println(this.isadmin);
//            System.out.println(this.username);
//            System.out.println(this.password);
//        }
//    }
//}

public class user {
    private int id_user; // Can be added for future enhancements
    private boolean isAdmin;
    private String username;
    private String password;

    public user(int id_user, boolean isAdmin, String username, String password) {
        this.id_user = id_user;
        this.isAdmin = isAdmin;
        this.username = username;
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    // Getters and setters for other attributes (optional)
}
