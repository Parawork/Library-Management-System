package Fxml;

import Fxml.LoginPage;

import Source.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


import java.util.HashMap;

import static Source.Serialization.loadUser;

public class UserLogin {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private TextField TF1;
    @FXML
    private TextField TF2;
    @FXML
    private Label label;
    private String text1,Text2;

    public void close(ActionEvent event) throws Exception {
        System.out.println("Closing");
        try {
            text1 = TF1.getText();
            Text2 = TF2.getText();
            HashMap<Integer, User> users = loadUser();
            for (User user : users.values()) {
                if (user.getUsername().equals(text1) && user.getPassword().equals(Text2)) {
                    label.setText("Login Successful");
                    //close the current window
                    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    stage.close();

                    //open the new window
                    root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
                    stage = new Stage();
                    scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();

                    break;
                } else {
                    label.setText("Invalid Username or Password");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }




    }
}
