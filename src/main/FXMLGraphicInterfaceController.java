/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author sjwor
 */
public class FXMLGraphicInterfaceController implements Initializable {

    @FXML
    private Button btnPut;
    @FXML
    private Button btnReplace;
    @FXML
    private Button btnRemove;
    @FXML
    private Button btnSize;
    @FXML
    private Button btnContainsKey;
    @FXML
    private Button btnContainsValue;
    @FXML
    private Button btnValues;
    @FXML
    private Button btnExit;
    @FXML
    private Button btnSetKey;
    @FXML
    private ComboBox<?> cmbStudents;
    @FXML
    private Text txtInfo;
    @FXML
    private Text txtTitle;
    @FXML
    private Text txtSubHeader1;
    @FXML
    private Button btnActionPut;
    @FXML
    private Button btnActionReplace;
    @FXML
    private Button btnActionRemove;
    @FXML
    private Text txtShowValues;
    @FXML
    private Button btnActionContainsKey;
    @FXML
    private Button btnActionContainsValue;
    @FXML
    private Button btnActionSetKey;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnPut(ActionEvent event) {
    }

    @FXML
    private void btnReplace(ActionEvent event) {
    }

    @FXML
    private void btnRemove(ActionEvent event) {
    }

    @FXML
    private void btnSize(ActionEvent event) {
    }

    @FXML
    private void btnContainsKey(ActionEvent event) {
    }

    @FXML
    private void btnContainsValue(ActionEvent event) {
    }

    @FXML
    private void btnValues(ActionEvent event) {
    }


    @FXML
    private void btnExit(ActionEvent event) {
        Stage stage = (Stage) this.btnExit.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void btnSetKey(ActionEvent event) {
    }

    @FXML
    private void btnActionPut(ActionEvent event) {
    }

    @FXML
    private void btnActionReplace(ActionEvent event) {
    }

    @FXML
    private void btnActionRemove(ActionEvent event) {
    }

    @FXML
    private void btnActionContainsValue(ActionEvent event) {
    }

    @FXML
    private void btnActionSetKey(ActionEvent event) {
    }
    
}
