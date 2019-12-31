/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settingsui;

import com.jfoenix.controls.JFXSlider;
import com.jfoenix.controls.JFXToggleButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
//import javafx.event.EventTarget;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author mdhan
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private ImageView btn_settings ,btn_user,btn_off;
    
    @FXML
    private AnchorPane h_settings, h_user;
    
    @FXML
    private JFXToggleButton touch, subscribe;
    
   @FXML
   private Label t_label,s_label;
    
   @FXML
   private JFXSlider brightness;
   
    @FXML
    private void handleButtonAction(MouseEvent event) {
        if(event.getTarget() == btn_settings){
            h_settings.setVisible(true);
            h_user.setVisible(false);
            
             
            
        }
        else if(event.getTarget() == btn_user){
            h_user.setVisible(true);
            h_settings.setVisible(false);
        }
        else if(event.getTarget() == btn_off){
            h_user.setVisible(false);
            h_settings.setVisible(false);
        }
    }
    
    @FXML
    private void tBtnAction(ActionEvent event){
        if(touch.isSelected()==true){
            t_label.setVisible(false);
        }
        else if(touch.isSelected()==false){
            t_label.setVisible(true);
        }
        
    }
    
    @FXML
    private void sBtnAction(ActionEvent event){
        
        if(subscribe.isSelected()==true){
            s_label.setVisible(false);
        }
        else if(subscribe.isSelected()==false){
            s_label.setVisible(true);
        }
    }
    
    @FXML
    private void saveBtnAction(ActionEvent event){
        
    }
    @FXML
    private void cancelBtnAction(ActionEvent event){
        System.exit(0);
    }
    
    
    @FXML
    private void sliderAction(ActionEvent event){
        
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        h_settings.setVisible(false);
        h_user.setVisible(false);
        
    }    
    
}
