/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ehtiwaa;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author huawei
 */
public class V_profile1Controller implements Initializable {
   private Stage stage;
   private Scene scene;
   private Parent root;
    @FXML
    private Button login11;
    @FXML
    private TextField usarName;
    @FXML
    private TextField usarName1;
    @FXML
    private TextField usarName11;
    @FXML
    private Button homepageEsingupbtn;
    @FXML
    private Button login1;
    @FXML
    private TextField usarName12;
    @FXML
    private TextField usarName2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
        //E_homeButton
    public void BackToHome_E(ActionEvent event) throws IOException{       
        Parent root = FXMLLoader.load(getClass().getResource("E_CreateRequest_4.fxml"));
        scene  = new Scene(root); 
        stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    } 

    //request Button
    public void GoToRequest_E(ActionEvent event) throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("E_AllRequest_7.fxml"));
        scene  = new Scene(root); 
        stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    } 

    //more Button
    public void GoToMore_E(ActionEvent event) throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("E_More_00.fxml"));
        scene  = new Scene(root); 
        stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    } 
    
    //mext Button
    public void GoToProfile2_E(ActionEvent event) throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("E_profile2.fxml"));
        scene  = new Scene(root); 
        stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void changeScene(MouseEvent event) {
    }

    @FXML
    private void singin(ActionEvent event) {
    }

    @FXML
    private void gotohomepageEsignup(ActionEvent event) {
    }


    
}
