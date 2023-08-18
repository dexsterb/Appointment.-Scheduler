package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.net.URL;
import java.time.ZoneId;
import java.util.ResourceBundle;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public
class LoginController implements Initializable {
    @FXML
    private Button exitButton;
    @FXML
    private Label timeZoneLabel;

    @Override
    public
    void initialize ( URL url , ResourceBundle resourceBundle ) {
        timeZoneLabel.setText(ZoneId.systemDefault().toString());
    }

    //Exit the application
    public void exitButton (ActionEvent event){
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }
    public
    void loginControl(ActionEvent event ) {
    }
}
