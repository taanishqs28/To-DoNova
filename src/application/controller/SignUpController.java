package application.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
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

        //Checks is password and confirm password are equal
        if(password.equals(confirmPassword)){
            //Registration Logic here
            System.out.println("Password Matched");
        }else{
            //Show Error Message
            System.out.println("Passwords do not match");
        }
    }

}
