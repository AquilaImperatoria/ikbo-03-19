package ru.mirea.pr7;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Queue;
import java.util.LinkedList;

public class QueueDrunkard extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Пьяница");
        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
        Text text1 = new Text();
        text1.setText("Введите 5 карт разного номинала для игрока 1:");
        Text text2 = new Text();
        text2.setText("Введите 5 карт разного номинала для игрока 2:");
        Button button = new Button("Поехали!");
        button.setOnAction(e -> {
            String scanStr1 = textField1.getText();
            String scanStr2 = textField2.getText();
            String[] inFirst = scanStr1.split(" ");
            String[] inSecond = scanStr2.split(" ");
            Queue<Integer> handFirst = scanToQueue(inFirst);
            Queue<Integer> handSecond = scanToQueue(inSecond);
            String txt = play(handFirst, handSecond);
            Alert alert = new Alert(Alert.AlertType.INFORMATION, txt);
            alert.showAndWait();
            primaryStage.close();
        });
        GridPane root = new GridPane();
        root.setPadding(new Insets(4));
        root.setHgap(25);
        root.setVgap(15);
        root.add(text1, 0, 0, 1, 1);
        root.add(textField1, 1, 0, 1, 1);
        root.add(text2, 0, 1, 1, 1);
        root.add(textField2, 1, 1, 1, 1);
        root.add(button, 0, 2, 1, 1);
        Scene primaryScene = new Scene(root, 600, 150);
        primaryStage.setScene(primaryScene);
        primaryStage.show();
    }
    public static void main(String[] args)
    {
        Application.launch();
    }
    public static String play(Queue<Integer> handFirst, Queue<Integer> handSecond)
    {
        int counter = 0;
        int winner = 0;
        int curFirst, curSecond;
        if (handFirst.equals(handSecond)) counter = 107;
        while ((counter < 107)&&(winner == 0))
        {
            curFirst = handFirst.poll();
            curSecond = handSecond.poll();
            if ((curFirst == 0)&&(curSecond == 9))
            {
                handFirst.offer(curFirst);
                handFirst.offer(curSecond);
            }
            else if ((curFirst == 9)&&(curSecond == 0))
            {
                handSecond.offer(curSecond);
                handSecond.offer(curFirst);
            }
            else if (curFirst < curSecond)
            {
                handSecond.offer(curSecond);
                handSecond.offer(curFirst);
            }
            else if (curFirst > curSecond)
            {
                handFirst.offer(curFirst);
                handFirst.offer(curSecond);
            }
            counter++;
            if (handFirst.isEmpty()) winner = 2;
            else if (handSecond.isEmpty()) winner = 1;
        }
        if (counter == 107) return ("botva");
        else if (winner == 1) return ("first " + counter);
        else if (winner == 2) return ("second " + counter);
        return null;
    }
    public static Queue<Integer> scanToQueue(String[] scan) {
        Queue<Integer> handR = new LinkedList();
        for (String s : scan)
            handR.add(Integer.parseInt(s));
        return handR;
    }
}
