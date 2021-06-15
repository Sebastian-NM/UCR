/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Callback;

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
    @FXML
    private TableView<List<String>> tblHashMap;
    @FXML
    private TableColumn<List<String>, String> colKey;
    @FXML
    private TableColumn<List<String>, String> colValue;
    @FXML
    private ComboBox<?> cmbKeys;
    @FXML
    private TextField txf1;
    @FXML
    private TextField txf2;
    @FXML
    private Text txtSubHeader11;
    
    HashMap<String, String> map;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        map = new HashMap();
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
    
    public void loadTable(){

        colKey.setCellValueFactory(new Callback<CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyStringWrapper(data.getValue().get(0));
            }
        });

        colValue.setCellValueFactory(new Callback<CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyStringWrapper(data.getValue().get(1));
            }
        });

        tblHashMap.setItems(getData());
    }

    ;
    
    public ObservableList<List<String>> getData(){

        

        final ObservableList<List<String>> data = FXCollections.observableArrayList();
        if (!map.isEmpty()) {
        
        
//            for (int i = ; i < map.size(); i++) {
//                
//                List<String> arrayList = new ArrayList<>();
//                arrayList.add(e.getCourseID());
//
//                arrayList.add(Util.Utility.getCourseByID(e.getCourseID()).getName());
//                arrayList.add(e.getSchedule());
//                data.add(arrayList);
//
//            }

        }

        return data;
    }
    
}
