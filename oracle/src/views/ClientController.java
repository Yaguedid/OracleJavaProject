package views;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ClientController {
	
	 @FXML
	    private TextField portTextField;

	    @FXML
	    private TextField ipTextField;

	    @FXML
	    private Button connectBtn;

	    @FXML
	    private TextArea TextToWrite;

	    @FXML
	    private TextArea TextToReceive;

	    @FXML
	    void OnConnection(javafx.event.ActionEvent actionEvent) {
            //hadi dir fiha lcode dyal connection dyal client wla server nta t3ref
	    }
	    
	    @FXML
	    void OnSend(javafx.event.ActionEvent actionEvent) {

	    }

}
