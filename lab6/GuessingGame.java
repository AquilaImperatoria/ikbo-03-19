package ru.mirea.lab6;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;

public class GuessingGame extends Application {

    private int rndNum;
    private int attempt;

    public static void main(String[] args) {
        Application.launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Random random = new Random();

        rndNum = random.nextInt(21);
        attempt = 3;

        primaryStage.setTitle("Угадай число");

        TextField textField = new TextField();

        Text text = new Text();
        text.setText("Угадай число от 0 до 20:");

        Button button = new Button("Угадать!");

        button.setOnAction(e -> {
            String numberStr = textField.getText();
            Alert alert = new Alert(Alert.AlertType.ERROR, "Вы должны ввести одно число в диапазоне от 0 до 20!");
            if (isCorrect(numberStr)) {
                int number = Integer.parseInt(numberStr);
                if (number == rndNum) {
                    alert = new Alert(Alert.AlertType.INFORMATION, "Вы угадали, было загадано число " + rndNum);
                    primaryStage.close();
                } else {
                    alert = new Alert(Alert.AlertType.ERROR, "Вы не угадали число :(\nчисло дожно быть " + ((number > rndNum) ? "меньше" : "больше"));
                    attempt--;
                    if (attempt == 0) {
                        alert = new Alert(Alert.AlertType.ERROR, "У вас кончились попытки, было загадано число: " + rndNum);
                        primaryStage.close();
                    }
                }
            }
            alert.showAndWait();
        });

        GridPane root = new GridPane();

        root.setPadding(new Insets(20));
        root.setHgap(25);
        root.setVgap(15);

        root.add(text, 0, 0, 2, 1);
        root.add(textField, 0, 1, 1, 1);
        root.add(button, 1, 2, 2, 1);

        Scene primaryScene = new Scene(root, 300, 200);
        primaryStage.setScene(primaryScene);

        primaryStage.show();
    }

    private boolean isCorrect(String number) {
        for (char c : number.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return (Integer.parseInt(number) <= 20 && Integer.parseInt(number) >= 0);
    }
}
