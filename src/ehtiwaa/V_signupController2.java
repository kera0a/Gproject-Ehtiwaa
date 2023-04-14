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
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author huawei
 */
public class V_signupController2 implements Initializable {

    @FXML
    private Button UploadDegBT;
    @FXML
    private TextField DegreeBT;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
   private Stage stage;
   private Scene scene;
   private Parent root;  
   
   
   @FXML
    private Label AskForAudioCall;
    
   @FXML
   private RadioButton YesAnswer, NoAnswer;
    
   @FXML
    private void UploadDegree_V(ActionEvent event) {
        //needs code
    }

    @FXML
    private void BackSignUp1_V(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("V_signup.fxml"));
        scene  = new Scene(root); 
        stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();  
    }

    @FXML
    private void SignUp_V(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("V_AcceptRequest_4.fxml"));
        scene  = new Scene(root); 
        stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();   
        
    }
    

    
}
