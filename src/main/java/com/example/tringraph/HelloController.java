package com.example.tringraph;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.sqrt;

public class HelloController {
    @FXML
    TextField sideA;
    @FXML
    TextField sideB;

    @FXML
    TextField sideC;


    @FXML
    Label resArea;

    @FXML
    protected void onClickTrinArea() {
        int a = Integer.parseInt(sideA.getText());
        int b = Integer.parseInt(sideB.getText());
        int c = Integer.parseInt(sideC.getText());
        double p = (double) (a + b + c) / 2;

        double s = sqrt(p * (p - a) * (p - b) * (p - c));
        resArea.setText(String.valueOf(s));
    }
}