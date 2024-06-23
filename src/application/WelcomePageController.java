package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class WelcomePageController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label signInLabel;

    @FXML
    private Label signUpLabel;

    @FXML
    private void handleSignIn() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        
        // Implement sign-in logic (e.g., validate user credentials)
        if (validateCredentials(username, password)) {
            // Load the main application screen (e.g., To-Do list screen)
            loadMainApp();
        } else {
            // Show error message
            System.out.println("Invalid credentials");
        }
    }

    @FXML
    private void handleSignUp() {
        // Implement sign-up logic (e.g., navigate to sign-up screen or show sign-up form)
        showSignUpForm();
    }

    private boolean validateCredentials(String username, String password) {
        // Dummy validation logic, replace with actual validation
        return "user".equals(username) && "password".equals(password);
    }

    private void loadMainApp() {
        // Logic to load the main application screen
        System.out.println("Loading main application...");
    }

    private void showSignUpForm() {
        // Logic to show sign-up form or navigate to sign-up screen
        System.out.println("Showing sign-up form...");
    }
}
