package dk.easv.gui.songs;

import dk.easv.gui.FxmlViewController;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class DeleteSongController {
    public Button BTNCancleNewSong;


    private FxmlViewController f;


    public void ClickCancle(ActionEvent actionEvent) {
        // get a handle to the stage
        Stage stage = (Stage) BTNCancleNewSong.getScene().getWindow();
        // do what you have to do
        stage.close();
    }
    public void setFxmlViewController( FxmlViewController fxmlViewController){

        this.f=fxmlViewController;
    }



}
