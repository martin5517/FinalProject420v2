package sample;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

class WalletApp extends Application {

    public void start(Stage stage) {
        stage.setTitle("Wallet Application");
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setPadding(new Insets(25, 25, 25, 25));
        Scene scene = new Scene(pane, 600, 540);

        Text sceneTitle = new Text("Wallet Application  \n\n\n\n Financial Questionaire \n (please fill the form below to save income/expenses)");
        sceneTitle.setFont(Font.font("Arial", FontWeight.NORMAL,20));
        pane.add(sceneTitle, 0, 0, 2, 1);

        Label q1 = new Label("Q1. What is the total annual income? ");
        pane.add(q1, 0, 1);
        final TextField q1Field = new TextField();
        pane.add(q1Field, 1, 1);

        Label q2 = new Label("Q2.How much are you planning to save for a month?  ?");
        pane.add(q2,0,2);
        final TextField q2Field = new TextField();
        pane.add(q2Field, 1, 2);

        Label q3 = new Label("Q3. On an average how much do you spent in a day? ");
        pane.add(q3,0,3);
        final TextField q3Field = new TextField();
        pane.add(q3Field, 1, 3);

        Label q4 = new Label("Q4. Do you make any monthly payment?, if yes what is the total amount? (Credit cards, Car loans, Home loans) ?" );
        pane.add(q4,0,4);
        final TextField q4Field = new TextField();
        pane.add(q4Field, 1, 4);

        Label q5 = new Label("Q5. How long will you maintain your savings account?");
        pane.add(q5,0,5);
        final TextField q5Field = new TextField();
        pane.add(q5Field, 1, 5);

        Button submitButton = new Button("Submit");
        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.BOTTOM_RIGHT);
        hbox.getChildren().add(submitButton);
        pane.add(hbox, 1, 6);

        final Text replyMessage = new Text();
        pane.add(replyMessage, 1, 7);

        submitButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                replyMessage.setText("Your input has been saved!");
            }
        });

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}