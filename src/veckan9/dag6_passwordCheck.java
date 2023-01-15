package veckan9;

import java.util.Scanner;

public class dag6_passwordCheck {
    public static void main(String[] args) {
        String userName;
        String password;

        userName = "EuroTech";
        password = "Study";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Username : ");
        String inputUsername = sc.nextLine();

        System.out.print("Enter Password : ");
        String inputPassword = sc.nextLine();

        //Method call to check if login is granted
        login(userName, password, inputUsername, inputPassword);

    }

    private static void login(String userName, String password, String inputUsername, String inputPassword) {
        if (userName.equals(inputUsername) && password.equals(inputPassword)) {
            System.out.println("User Logged in successfully.");

        } else if (inputUsername.isEmpty() && inputPassword.isEmpty()) {
            System.out.println("UserName and Password Fields cannot be empty”");

        } else if (inputUsername.isEmpty() & !inputPassword.isEmpty()) {
            System.out.println("UserName cannot be empty");

        } else if (!inputUsername.isEmpty() & inputPassword.isEmpty()) {
            System.out.println("Password cannot be empty");

        } else //if (!userName.equals(inputUsername) || !(password.equals(inputPassword))) {
            System.out.println("UserName or password is not valid. Please verify");
    }
}
