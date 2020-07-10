import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;



public class FinanceCalculator extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        //creating the main menu
        Button fixed_Deposit=new Button("Fixed Deposit");
        fixed_Deposit.setLayoutY(50);
        fixed_Deposit.setLayoutX(50);

        Button savings=new Button("Savings");
        savings.setLayoutX(50);
        savings.setLayoutY(100);

        Button loan=new Button("Loan");
        loan.setLayoutX(50);
        loan.setLayoutY(150);

        Button mortgage=new Button("Mortgage");
        mortgage.setLayoutX(50);
        mortgage.setLayoutY(200);


        Pane roots = new Pane();
        roots.setPrefSize(600,700);
        roots.getChildren().add(fixed_Deposit);
        roots.getChildren().add(savings);
        roots.getChildren().add(loan);
        roots.getChildren().add(mortgage);


        //creating the main menu scene
        Scene scene_main_menu = new Scene(roots,400,400);
        primaryStage.setScene(scene_main_menu);
        primaryStage.show();


        //Creating and calling the loan window
        loan.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Button backButton = new Button("Back");
                backButton.setLayoutY(50);
                backButton.setLayoutX(350);

                TextField capital = new TextField();
                capital.setLayoutY(50);
                capital.setLayoutX(50);

                TextField rate = new TextField();
                rate.setLayoutX(50);
                rate.setLayoutY(70);

                TextField period = new TextField();
                period.setLayoutX(50);
                period.setLayoutY(90);

                TextField future_Value = new TextField();
                future_Value.setLayoutX(50);
                future_Value.setLayoutY(110);

                Button confirm = new Button("Calculate");
                confirm.setLayoutX(50);
                confirm.setLayoutY(130);

                Label cap = new Label("Capital");
                cap.setLayoutX(50);
                cap.setLayoutY(50);

                Label rated = new Label("Rate");
                cap.setLayoutX(50);
                cap.setLayoutY(70);

                Label Period = new Label("Period");
                cap.setLayoutX(50);
                cap.setLayoutY(90);

                Label fv = new Label("Future value");
                cap.setLayoutX(50);
                cap.setLayoutY(118);


                //custom keyboard
                TextField textField = new TextField();
                textField.setLayoutX(250);
                textField.setLayoutY(200);

                Button kFirst = new Button("1");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(50);
                Button kSecond = new Button("2");
                kSecond.setLayoutX(250);
                kSecond.setLayoutY(100);
                Button kThird = new Button("3");
                kThird.setLayoutX(250);
                kThird.setLayoutY(150);
                Button kFourth = new Button("4");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(80);
                Button kFifth = new Button("5");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(90);
                Button kSixth = new Button("6");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(100);
                Button kSeven = new Button("7");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(110);
                Button kEight = new Button("8");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(120);
                Button kNine = new Button("9");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(130);
                Button kZero = new Button("0");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(140);
                Button kDecimal = new Button(".");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(160);
                Button kErase = new Button("E");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(170);


                //Creating a pane for the loan
                Pane pane_loan = new Pane();
                pane_loan.getChildren().addAll(backButton, confirm, textField, kFirst, kSecond, kThird, kFourth, kFifth, kSeven, kEight, kEight, kNine, kZero, kDecimal, kErase);

                //Creating a new scene for the loan calculator
                Scene scene_loan = new Scene(pane_loan, 800, 600);

                //setting the primary stage scene to the loan scene
                primaryStage.setScene(scene_loan);

                Button[] buttonArray = {kFirst, kSecond, kThird, kFourth, kFifth, kSeven, kEight, kEight, kNine, kZero, kDecimal, kErase};

                kFirst.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kFirst.getText());
                    }
                });

                kSecond.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kSecond.getText());
                    }
                });

                kThird.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kThird.getText());
                    }
                });

                //adding the back button to get previous menu scene
                backButton.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        primaryStage.setScene(scene_main_menu);
                    }
                });

                kFourth.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kFourth.getText());
                    }
                });

                kFifth.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kFifth.getText());
                    }
                });

                kSixth.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kSixth.getText());
                    }
                });

                kSeven.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kSeven.getText());
                    }
                });

                kEight.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kEight.getText());
                    }
                });

                kNine.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kNine.getText());
                    }
                });

                kZero.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kNine.getText());
                    }
                });

                kErase.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kErase.getText());
                    }
                });


                //====================creating and calling the saving window============================================

                //creating and calling the fixed deposit window

                //creating and calling the mortgage window


                Pane roots = new Pane();
                roots.setPrefSize(600, 900);
                roots.getChildren().add(fv);
                roots.getChildren().add(rated);
                roots.getChildren().add(Period);
                roots.getChildren().add(confirm);
                roots.getChildren().add(kFirst);
                roots.getChildren().add(kSecond);
                roots.getChildren().add(kThird);
                roots.getChildren().add(kFourth);
                roots.getChildren().add(kFifth);
                roots.getChildren().add(kSixth);
                roots.getChildren().add(kSeven);
                roots.getChildren().add(kEight);
                roots.getChildren().add(kNine);
                roots.getChildren().add(kDecimal);
                roots.getChildren().add(kErase);
                roots.getChildren().add(textField);
                roots.getChildren().add(backButton);


                Stage loanStage = new Stage();

                loanStage.setScene(new Scene(roots, 300, 275));
                backButton.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        loanStage.close();
                    }
                });
                loanStage.showAndWait();
            }



                Button backButton = new Button("Back");
                backButton.setLayoutY(50);
                backButton.setLayoutX(350);

                TextField first = new TextField();
                first.setLayoutY(50);
                first.setLayoutX(50);

                TextField second = new TextField();
                second.setLayoutX(50);
                second.setLayoutY(100);

                Button confirm = new Button("confirm");
                confirm.setLayoutX(50);
                confirm.setLayoutY(150);

                TextField ans = new TextField();
                ans.setLayoutX(50);
                ans.setLayoutY(400);

                //custom keyboard
                TextField textField = new TextField();
                textField.setLayoutX(200);
                textField.setLayoutY(200);

                Button kFirst = new Button("1");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(50);
                Button kSecond = new Button("2");
                kSecond.setLayoutX(250);
                kSecond.setLayoutY(60);
                Button kThird = new Button("3");
                kThird.setLayoutX(250);
                kThird.setLayoutY(70);
                Button kFourth = new Button("4");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(80);
                Button kFifth = new Button("5");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(90);
                Button kSixth = new Button("6");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(100);
                Button kSeven = new Button("7");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(110);
                Button kEight = new Button("8");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(120);
                Button kNine = new Button("9");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(130);
                Button kZero = new Button("0");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(140);
                Button kDecimal = new Button(".");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(200);
                Button kErase = new Button("E");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(170);


                Button[] buttonArray = {kFirst, kSecond, kThird, kFourth, kFifth, kSeven, kEight, kEight, kNine, kZero, kDecimal, kErase};


                kFirst.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kFirst.getText());
                    }
                });

                kSecond.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kSecond.getText());
                    }
                });

                kThird.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kThird.getText());
                    }
                });

                kFourth.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kFourth.getText());
                    }
                });

                kFifth.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kFifth.getText());
                    }
                });

                kSixth.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kSixth.getText());
                    }
                });

                kSeven.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kSeven.getText());
                    }
                });

                kEight.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kEight.getText());
                    }
                });

                kNine.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kNine.getText());
                    }
                });

                kZero.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kNine.getText());
                    }
                });

                kErase.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kErase.getText());
                    }
                });




                Pane roots = new Pane();
                roots.setPrefSize(600, 900);
                roots.getChildren().add(first);
                roots.getChildren().add(second);
                roots.getChildren().add(confirm);
                roots.getChildren().add(ans);
                roots.getChildren().add(kFirst);
                roots.getChildren().add(kSecond);
                roots.getChildren().add(kThird);
                roots.getChildren().add(kFourth);
                roots.getChildren().add(kFifth);
                roots.getChildren().add(kSixth);
                roots.getChildren().add(kSeven);
                roots.getChildren().add(kEight);
                roots.getChildren().add(kNine);
                roots.getChildren().add(kDecimal);
                roots.getChildren().add(kErase);
                roots.getChildren().add(textField);
                roots.getChildren().add(backButton);


                Stage mortgageStage = new Stage();

                mortgageStage.setScene(new Scene(roots, 300, 275));
                backButton.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        mortgageStage.close();
                    }
                });
                mortgageStage.showAndWait();
            }


                Button backButton = new Button("Back");
                backButton.setLayoutY(50);
                backButton.setLayoutX(350);

                TextField capital = new TextField();
                capital.setLayoutY(50);
                capital.setLayoutX(50);

                TextField rate = new TextField();
                rate.setLayoutX(50);
                rate.setLayoutY(70);

                TextField period = new TextField();
                period.setLayoutX(50);
                period.setLayoutY(90);

                TextField future_Value = new TextField();
                future_Value.setLayoutX(50);
                future_Value.setLayoutY(110);

                Button confirm = new Button("Calculate");
                confirm.setLayoutX(50);
                confirm.setLayoutY(130);

                Label cap = new Label("Capital");
                cap.setLayoutX(50);
                cap.setLayoutY(50);

                Label rated = new Label("Rate");
                cap.setLayoutX(50);
                cap.setLayoutY(70);

                Label Period = new Label("Period");
                cap.setLayoutX(50);
                cap.setLayoutY(90);

                Label fv = new Label("Future value");
                cap.setLayoutX(50);
                cap.setLayoutY(118);


                //custom keyboard
                TextField textField = new TextField();
                textField.setLayoutX(200);
                textField.setLayoutY(200);

                Button kFirst = new Button("1");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(50);
                Button kSecond = new Button("2");
                kSecond.setLayoutX(250);
                kSecond.setLayoutY(60);
                Button kThird = new Button("3");
                kThird.setLayoutX(250);
                kThird.setLayoutY(70);
                Button kFourth = new Button("4");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(80);
                Button kFifth = new Button("5");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(90);
                Button kSixth = new Button("6");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(100);
                Button kSeven = new Button("7");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(110);
                Button kEight = new Button("8");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(120);
                Button kNine = new Button("9");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(130);
                Button kZero = new Button("0");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(140);
                Button kDecimal = new Button(".");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(160);
                Button kErase = new Button("E");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(170);


                Button[] buttonArray = {kFirst, kSecond, kThird, kFourth, kFifth, kSeven, kEight, kEight, kNine, kZero, kDecimal, kErase};


                kFirst.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kFirst.getText());
                    }
                });

                kSecond.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kSecond.getText());
                    }
                });

                kThird.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kThird.getText());
                    }
                });

                kFourth.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kFourth.getText());
                    }
                });

                kFifth.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kFifth.getText());
                    }
                });

                kSixth.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kSixth.getText());
                    }
                });

                kSeven.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kSeven.getText());
                    }
                });

                kEight.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kEight.getText());
                    }
                });

                kNine.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kNine.getText());
                    }
                });

                kZero.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kNine.getText());
                    }
                });

                kErase.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kErase.getText());
                    }
                });

                Pane roots = new Pane();
                roots.setPrefSize(600, 900);
                roots.getChildren().add(cap);
                roots.getChildren().add(rated);
                roots.getChildren().add(Period);
                roots.getChildren().add(fv);
                roots.getChildren().add(confirm);

                roots.getChildren().add(kFirst);
                roots.getChildren().add(kSecond);
                roots.getChildren().add(kThird);
                roots.getChildren().add(kFourth);
                roots.getChildren().add(kFifth);
                roots.getChildren().add(kSixth);
                roots.getChildren().add(kSeven);
                roots.getChildren().add(kEight);
                roots.getChildren().add(kNine);
                roots.getChildren().add(kDecimal);
                roots.getChildren().add(kErase);
                roots.getChildren().add(textField);
                roots.getChildren().add(backButton);


                Stage fDepositStage = new Stage();

                fDepositStage.setScene(new Scene(roots, 300, 275));
                backButton.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        fDepositStage.close();
                    }
                });
                fDepositStage.showAndWait();
            }



                Button backButton = new Button("Back");
                backButton.setLayoutY(50);
                backButton.setLayoutX(350);

                TextField first = new TextField();
                first.setLayoutY(50);
                first.setLayoutX(50);

                TextField second = new TextField();
                second.setLayoutX(50);
                second.setLayoutY(100);

                Button confirm = new Button("confirm");
                confirm.setLayoutX(50);
                confirm.setLayoutY(150);

                TextField ans = new TextField();
                ans.setLayoutX(50);
                ans.setLayoutY(400);

                //custom keyboard
                TextField textField = new TextField();
                textField.setLayoutX(200);
                textField.setLayoutY(200);

                Button kFirst = new Button("1");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(50);
                Button kSecond = new Button("2");
                kSecond.setLayoutX(250);
                kSecond.setLayoutY(60);
                Button kThird = new Button("3");
                kThird.setLayoutX(250);
                kThird.setLayoutY(70);
                Button kFourth = new Button("4");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(80);
                Button kFifth = new Button("5");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(90);
                Button kSixth = new Button("6");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(100);
                Button kSeven = new Button("7");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(110);
                Button kEight = new Button("8");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(120);
                Button kNine = new Button("9");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(130);
                Button kZero = new Button("0");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(140);
                Button kDecimal = new Button(".");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(160);
                Button kErase = new Button("E");
                kFirst.setLayoutX(250);
                kFirst.setLayoutY(170);


                Button[] buttonArray = {kFirst, kSecond, kThird, kFourth, kFifth, kSeven, kEight, kEight, kNine, kZero, kDecimal, kErase};


                kFirst.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kFirst.getText());
                    }
                });

                kSecond.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kSecond.getText());
                    }
                });

                kThird.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kThird.getText());
                    }
                });

                kFourth.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kFourth.getText());
                    }
                });

                kFifth.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kFifth.getText());
                    }
                });

                kSixth.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kSixth.getText());
                    }
                });

                kSeven.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kSeven.getText());
                    }
                });

                kEight.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kEight.getText());
                    }
                });

                kNine.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kNine.getText());
                    }
                });

                kZero.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kNine.getText());
                    }
                });

                kErase.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        textField.appendText(kErase.getText());
                    }
                });


                Pane roots = new Pane();
                roots.setPrefSize(600, 900);
                roots.getChildren().add(first);
                roots.getChildren().add(second);
                roots.getChildren().add(confirm);
                roots.getChildren().add(ans);
                roots.getChildren().add(kFirst);
                roots.getChildren().add(kSecond);
                roots.getChildren().add(kThird);
                roots.getChildren().add(kFourth);
                roots.getChildren().add(kFifth);
                roots.getChildren().add(kSixth);
                roots.getChildren().add(kSeven);
                roots.getChildren().add(kEight);
                roots.getChildren().add(kNine);
                roots.getChildren().add(kDecimal);
                roots.getChildren().add(kErase);
                roots.getChildren().add(textField);
                roots.getChildren().add(backButton);


                Stage savingsStage = new Stage();

                savingsStage.setScene(new Scene(roots, 300, 275));
                backButton.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        savingsStage.close();
                    }
                });
                savingsStage.showAndWait();
            }


            public void main(String[] args) {
                launch(args);
            }
        }*/