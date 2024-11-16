package application.controller;

import java.util.Optional;
import application.models.User;
import application.models.UserDAO;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class WelcomePageController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private ImageView imageView;

    @FXML
    private Button signInButton;

    @FXML
    private Button signUpButton;

    @FXML
    private void initialize() {
        try {
            String imagePath = getClass().getResource("/To-DoNova.png").toExternalForm();
            System.out.println("Image Path: " + imagePath); // Print the absolute path
            Image image = new Image(imagePath);
            imageView.setImage(image);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleSignIn(ActionEvent e) {
        String username = usernameField.getText();
        String password = passwordField.getText();
        
        // Implement sign-in logic (e.g., validate user credentials)
        if (validateCredentials(username, password)) {
            // Load the main application screen (e.g., To-Do list screen)
            loadMainApp(e);
        } else {
            // Show error message
            System.out.println("Invalid credentials");
        }
    }

    @FXML
    private void handleSignUp(ActionEvent e) {
        // Implement sign-up logic
        showSignUpForm(e);
    }

    private boolean validateCredentials(String username, String password) {
        Optional<User> userOptional = UserDAO.getUserByUsername(username);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            return user.getPassword().equals(password); // Add password hashing verification here
        }
        return false;
    }

    private void loadMainApp(ActionEvent e) {
        // Logic to load the main application screen
        System.out.println("Loading main application...");
        try {
            Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Welcome.fxml")); // Update this path
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("To-DoNova - Main App");
            stage.show();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void showSignUpForm(ActionEvent e) {
        // Logic to show sign-up form or navigate to sign-up screen
        try{
            System.out.println("Showing sign-up form...");
            Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
            FXMLLoader load = new FXMLLoader(getClass().getResource("/view/Signup.fxml"));
            Parent root = load.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Sign Up for To-DoNova");
            stage.show();

        }catch(Exception exception){
            exception.printStackTrace(); //Prints the stack trace if exception happen
        }


    }
}
