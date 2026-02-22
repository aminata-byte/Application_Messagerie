package com.example.application_messagerie.client.controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class LoginController {

    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML private Label statusLabel;
    @FXML private Button loginButton;
    @FXML private Button registerButton;

    @FXML
    protected void onLogin() {
        // TODO : connexion au serveur
    }

    @FXML
    protected void onRegister() {
        // TODO : inscription au serveur
    }
}