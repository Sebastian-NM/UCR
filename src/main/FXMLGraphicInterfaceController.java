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
import java.util.Map.Entry;
import java.util.ResourceBundle;
import java.util.Set;
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
import javafx.scene.control.Tooltip;
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
    private TableView<List<String>> tblHashMap;
    @FXML
    private TableColumn<List<String>, String> colKey;
    @FXML
    private TableColumn<List<String>, String> colValue;
    @FXML
    private ComboBox<String> cmbKeys;
    @FXML
    private TextField txf1;
    @FXML
    private TextField txf2;
    
    HashMap<String, String> map;
    @FXML
    private Text txtSubHeader2;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        map = new HashMap();
        clean();
        
        Tooltip t1 = new Tooltip("This button uses the method .put() to add new elements to the hashMap");
        this.btnPut.setTooltip(t1);
        
        Tooltip t2 = new Tooltip("This button takes the value of the key selected \n and replaces the default value for the new one");
        this.btnReplace.setTooltip(t2);
        
        Tooltip t3 = new Tooltip("This button uses the method .remove(Key) to remove elements from the hashMap");
        this.btnRemove.setTooltip(t3);
        
        Tooltip t4 = new Tooltip("This button uses the method .size() to show the size of the hashMap");
        this.btnSize.setTooltip(t4);
        
        Tooltip t5 = new Tooltip("This button uses the method .containsKey() to check if the ingresed key is in the hashMap");
        this.btnContainsKey.setTooltip(t5);
        
        Tooltip t6 = new Tooltip("This button uses the method .containsValue() to check if the ingresed value is in the hashMap");
        this.btnContainsValue.setTooltip(t6);
        
        Tooltip t7 = new Tooltip("This button uses the method .values() to show the content of the hashmap");
        this.btnValues.setTooltip(t7);
        
        Tooltip t8 = new Tooltip("This button uses the method .keyset() which returnd \n a Set<> with the content of the hashmap");
        this.btnSetKey.setTooltip(t8);
      
    }    

    @FXML
    private void btnPut(ActionEvent event) {
        clean();
        txtTitle.setText("Put");
        txtSubHeader1.setText("Insert new key");
        txtSubHeader2.setText("Insert new value");
        txtTitle.setText("Put");
        btnActionPut.setVisible(true);
        txtSubHeader1.setVisible(true);
        txtSubHeader2.setVisible(true);
        txf1.setVisible(true);
        txf2.setVisible(true);
    }

    @FXML
    private void btnReplace(ActionEvent event) {
        clean();
        if(!map.isEmpty()){
        txtTitle.setText("Replace");
        txtShowValues.setText("Select a Key");
        btnActionReplace.setVisible(true);
        cmbKeys.setVisible(true);
        loadComboBox();
        txtSubHeader1.setText("New value");
        txf1.setVisible(true);
        }else{txtInfo.setText("Map is Empty");}
    }

    @FXML
    private void btnRemove(ActionEvent event) {
        clean();
        if(!map.isEmpty()){
       
        this.txtTitle.setText("Remove");
        this.cmbKeys.setVisible(true);
        this.txtShowValues.setText("Choose a key to delete");
        this.btnActionRemove.setVisible(true);
        loadComboBox();
        }else{txtInfo.setText("Map is Empty");}
        
    }

    @FXML
    private void btnSize(ActionEvent event) {
       clean();
       if(!map.isEmpty()){
       
       txtInfo.setText("SIZE: "+map.size());
       }else{txtInfo.setText("Map is Empty");}
    }

    @FXML
    private void btnContainsKey(ActionEvent event) {
        clean();
        if(!map.isEmpty()){
        
        this.txtTitle.setText("Contains Key");
        txf1.setVisible(true);
        btnActionContainsKey.setVisible(true);
        txtSubHeader1.setText("key");
        }else{txtInfo.setText("Map is Empty");}
        
    }

    @FXML
    private void btnContainsValue(ActionEvent event) {
        clean();
        if(!map.isEmpty()){
        
        this.txtTitle.setText("Contains Value");
        txf1.setVisible(true);
        btnActionContainsValue.setVisible(true);
        txtSubHeader1.setText("Value");
        }else{txtInfo.setText("Map is Empty");}
    }

    @FXML
    private void btnValues(ActionEvent event) {
        clean();
        if(!map.isEmpty()){
        
        this.txtTitle.setText("Values");
        
        String s = "";
        for (Entry<String, String> o : map.entrySet()) {
                s+=o.getValue()+"\n";
        }
       
        txtShowValues.setText(s);
        }else{txtInfo.setText("Map is Empty");}
    }


    @FXML
    private void btnExit(ActionEvent event) {
        Stage stage = (Stage) this.btnExit.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void btnSetKey(ActionEvent event) {
        clean();
        if(!map.isEmpty()){
        
        txtTitle.setText("KeySet");
        
        String s = "";
        for (Entry<String, String> o : map.entrySet()) {
                s+=o.getKey()+"\n";
        }
       
        txtShowValues.setText(s);
        }else{txtInfo.setText("Map is Empty");}
    }

    @FXML
    private void btnActionPut(ActionEvent event) {
        if(!txf1.getText().isEmpty()&&!txf2.getText().isEmpty()){
        map.put(txf1.getText(), txf2.getText());
        txf1.setText("");
        txf2.setText("");
        loadTable();
        }else{
        
            txtInfo.setText("Debe llenar todos los campos.");
        
        }
    }

    @FXML
    private void btnActionReplace(ActionEvent event) {
        
        map.replace(String.valueOf(cmbKeys.getValue()), txf1.getText());
        loadTable();
        
    }

    @FXML
    private void btnActionRemove(ActionEvent event) {
        map.remove(String.valueOf(cmbKeys.getValue()));
        loadTable();
        btnRemove(event);
        
    }

    @FXML
    private void btnActionContainsValue(ActionEvent event) {
        if(map.containsValue(txf1.getText())){
        txtInfo.setText("Table contains the value \n"+txf1.getText());
        }else{
        txtInfo.setText("Table doesn't contain the value \n"+txf1.getText());
        }
        loadTable();
    }
    
    @FXML
    private void btnActionContainsKey(ActionEvent event) {
        
        if(map.containsKey(txf1.getText())){
        txtInfo.setText("Table contains the key \n"+txf1.getText());
        }else{
        txtInfo.setText("Table doesn't contain the key \n"+txf1.getText());
        }
        loadTable();
        
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
            for (Entry<String, String> o : map.entrySet()) {
                List<String> arrayList = new ArrayList<>();
                arrayList.add(o.getKey());
                arrayList.add(o.getValue());
                data.add(arrayList);
            }
        }

        return data;
    }
    
    public void clean(){
        this.txtInfo.setText("");
        this.txtSubHeader1.setText("");
        this.txtSubHeader2.setText("");
        this.txtShowValues.setText("");
        this.txtTitle.setText("");
        this.btnActionContainsKey.setVisible(false);
        this.btnActionContainsValue.setVisible(false);
        this.btnActionPut.setVisible(false);
        this.btnActionRemove.setVisible(false);
        this.btnActionReplace.setVisible(false);
        this.txf1.setVisible(false);
        this.txf2.setVisible(false);
        this.txf1.setText("");
        this.txf2.setText("");
        this.cmbKeys.setVisible(false);
    }
    
    public void loadComboBox(){
          
        cmbKeys.getItems().clear();
        for (Entry<String, String> entry : map.entrySet()) {
            this.cmbKeys.getItems().add(entry.getKey());
        }
  
        cmbKeys.getSelectionModel().select("Keys");
    }

    
    
}
