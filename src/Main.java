import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage1) throws Exception {
        try {
            Parent Root = FXMLLoader.load(getClass().getResource("Fxml/LoginPage.fxml"));
            Scene scene1 = new Scene(Root);
            stage1.setScene(scene1);
            stage1.show();
        }
        catch (Exception e) {
            e.printStackTrace();

        }
    }
}
