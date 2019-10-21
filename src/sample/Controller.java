package sample;


import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Controller {
    @FXML
    private Slider redSlider;

    @FXML
    private Slider greenSlider;

    @FXML
    private Slider blueSlider;

    @FXML
    private TextField redText;

    @FXML
    private TextField greenText;

    @FXML
    private TextField blueText;


    @FXML
    private Rectangle colorRectangle;
    private int red = 0;
    private int green = 0;
    private int blue = 0;

    public void initialize() {
        // bind TextField values to corresponding Slider values
        redText.textProperty().bind(
                redSlider.valueProperty().asString("%.0f"));
        greenText.textProperty().bind(
                greenSlider.valueProperty().asString("%.0f"));
        blueText.textProperty().bind(
                blueSlider.valueProperty().asString("%.0f"));
        redSlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                red=t1.intValue();
                colorRectangle.setFill(Color.rgb(red,green,blue));
            }
        });
        greenSlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                green=t1.intValue();
                colorRectangle.setFill(Color.rgb(red,green,blue));
            }
        });
        blueSlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                blue = t1.intValue();
                colorRectangle.setFill(Color.rgb(red, green, blue));
            }
        });



            }
    }
