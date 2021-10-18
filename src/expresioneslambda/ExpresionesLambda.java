/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresioneslambda;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author 34616
 */
public class ExpresionesLambda extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        GridPane panel = new GridPane();
        Scene scene = new Scene(panel, 400, 350);
        
        panel.setAlignment(Pos.CENTER);
        
        panel.setVgap(20);
        panel.setHgap(20);
        
        Label tx1 = new Label("Annual Interest Rate: ");
        TextField tf1 = new TextField();
        panel.add(tx1, 1, 0);
        panel.add(tf1, 2, 0);
        
        Label tx2 = new Label("Number of Years: ");
        TextField tf2 = new TextField();
        panel.add(tx2, 1, 1);
        panel.add(tf2, 2, 1);
        
        Label tx3 = new Label("Loan Amount: ");
        TextField tf3 = new TextField();
        panel.add(tx3, 1, 2);
        panel.add(tf3, 2, 2);
        
        Label tx4 = new Label("Monthly Payment: ");
        TextField tf4 = new TextField();
        panel.add(tx4, 1, 3);
        panel.add(tf4, 2, 3);
        
        Label tx5 = new Label("Total Payment: ");
        TextField tf5 = new TextField();
        panel.add(tx5, 1, 4);
        panel.add(tf5, 2, 4);
        
        
        Button btnCalculate = new Button("Calculate");
        btnCalculate.setOnAction(e -> {
            Double i = Double.parseDouble(tf1.getText());
            Double n = Double.parseDouble(tf2.getText());
            Double h = Double.parseDouble(tf3.getText());
            Double m;
            double r;
          
            r = i/(100*12);
            double m2 = Math.pow((1+r),(-12*n));
            m =(h*r)/(1-m2);
            m = Math.round(m*100.0)/100.0;
            tf4.setText(m.toString());
            
            Double a = m * 12 * n;
            a = Math.round(a*100.0)/100.0;
            tf5.setText(a.toString());
        });
   
        panel.add(btnCalculate, 2, 7);
          
        primaryStage.setTitle("Lambda1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
