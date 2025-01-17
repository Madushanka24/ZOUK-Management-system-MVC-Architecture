package lk.ijse.zouk;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.application.Application.launch;

public class AppLauncher extends Application {
    public static void main(String[] args) {launch(args);}
    @Override
    public void start(Stage stage) throws IOException {
        stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/View/Login_form.fxml"))));
        stage.centerOnScreen();
        stage.setTitle("login");
        stage.show();
    }

}