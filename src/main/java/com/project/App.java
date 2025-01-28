package com.project;

import java.util.ResourceBundle;
import javafx.application.Application;

public class App extends Application{

    @Override     
   public void start(Stage primaryStage) throws Exception { 
      /* 
      Code for JavaFX application. 
      (Stage, scene, scene graph) 
      */       
   }         
   public static void main(String args[]){           
      launch(args);      
   } 

    public int userLogin(String in_user, String in_pwd) {
        ResourceBundle rb = ResourceBundle.getBundle("config");
        String username = rb.getString("username");
        String password = rb.getString("password");

        if (in_user.equals(username) && in_pwd.equals(password)) {
            return 1;
        } else {
            return 0;
        }
    }
}
