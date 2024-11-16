package application.controller;

import application.models.User;
import application.models.UserDAO;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
public class SignUpController {

    @FXML
    private TextField userNameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private PasswordField confirmPasswordField;

    @FXML
    private Button signUpButton;

    @FXML
    private void handleSingUp(){
        String username = userNameField.getText();
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();

        //checks if the text-fields are empty or not
        if(username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()){
            String missingField = getMissingField(username, password, confirmPassword);
            showAlert(AlertType.ERROR, "Form Error!", "Please fill in the following field(s): " + missingField);
        }

        //Shows an error alert if the passwords don't match
        else if(!password.equals(confirmPassword)){
            //Registration Logic here
            showAlert(Alert.AlertType.ERROR, "Password Mismatch", "Passwords do not match.");

            System.out.println("Password Matched");
        }else{
            User user = new User(username, password); // to-do in future: hash the password
            if(UserDAO.saveUser(user)){
                showAlert(Alert.AlertType.INFORMATION, "Success", "Registration successful!");

            }else{
                showAlert(Alert.AlertType.ERROR, "Database Error", "Could not register user.");
            }
        }
    }

    private static String getMissingField(String username, String password, String confirmPassword) {
        String missingField = "";

        if(username.isEmpty()){
            missingField += "Username";
        }
        if(password.isEmpty()){
            if (!missingField.isEmpty()) {
                missingField += ", ";
            }
            missingField += "Password";
        }
        if(confirmPassword.isEmpty()){
            if (!missingField.isEmpty()) {
                missingField += ", ";
            }
            missingField += "Confirm Password";
        }
        return missingField;
    }

    private void showAlert(AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

}
