package Fxml;
import Source.User;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.util.HashMap;

public class Register {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private TextField TF1;
    @FXML
    private TextField TF2;
    @FXML
    private TextField TF3;
    @FXML
    private TextField TF4;
    @FXML
    private TextField TF5;
    @FXML
    private TextField TF6;
    @FXML
    private TextField TF7;

    public void switch2(ActionEvent event) throws Exception{
        root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switch3(ActionEvent event) throws Exception{
        root = FXMLLoader.load(getClass().getResource("DashBoard.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void register(ActionEvent event) throws Exception{
        String firstname = TF1.getText();
        String lastname = TF2.getText();
        String username = TF3.getText();
        String age = TF4.getText();
        String email = TF5.getText();
        int phone = Integer.parseInt(TF6.getText());
        String password = TF7.getText();
        //create a new user
        User user = new User(11,firstname, lastname, username, age, email, password, "User",phone);


    }
}
