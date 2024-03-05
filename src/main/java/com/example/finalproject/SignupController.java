package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignupController {
    @FXML
    private Button signupbutton;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Label message;
    Main m = new Main();
    public void LogIn(ActionEvent e){
        System.out.println("Login");
        if(username.getText().toString().equals("admin") && password.getText().toString().equals("password")){
            message.setText("Success");
        }
        else if(username.getText().isEmpty() && password.getText().isEmpty()) {
            message.setText("Please enter your data.");
        }


        else {
            message.setText("Wrong username or password!");
        }
    }
    public void SignUp(ActionEvent e){

        System.out.println("Signup");

    }
}