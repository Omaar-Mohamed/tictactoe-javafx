/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Lenovo
 */
public class Server extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = new ServerMainUI();
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("/styles/style.css").toString());
        stage.setScene(scene);
        stage.show();
                

    }

    /**
     * @param args the command line arguments
     */
    
    @Override
    public void init() throws Exception {
        super.init(); //To change body of generated methods, choose Tools | Templates.
       
       
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
