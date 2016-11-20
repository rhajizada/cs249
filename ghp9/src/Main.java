import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Scanner;

import static javafx.scene.input.KeyCode.*;

public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        try{
            URL url = new URL("http://web.cs.sunyit.edu/~realemj/2016fall/Map01.txt");
            Scanner pageInput = new Scanner(url.openStream());
            Map currentMap = new Map();
            currentMap.load(pageInput);
            MapPane mapPane = new MapPane(currentMap);
            Pane displayPane = new Pane();
            displayPane.getChildren().add(mapPane);
            Player player = new Player(5, 5);
            Scene scene = new Scene(displayPane);
            System.out.println(currentMap.mapCols + " " + currentMap.mapRows);
            PlayerPane playerPane = new PlayerPane(player);
            displayPane.getChildren().add(playerPane);

            scene.setOnKeyPressed(
                    keyEvent ->{
                        boolean childrenStatus = false;
                        try {

                            KeyCode key = keyEvent.getCode();
                            int xCheck = player.getXProperty().intValue();
                            int yCheck = player.getYProperty().intValue();
                            switch (key) {
                                case A:
                                    xCheck--;
                                    System.out.println("You pressed A");
                                    break;
                                case W:
                                    yCheck--;
                                    System.out.println("You pressed W");
                                    break;
                                case S:
                                    yCheck++;
                                    System.out.println("You pressed S");
                                    break;
                                case D:
                                    xCheck++;
                                    System.out.println("You pressed D");
                                    break;
                                default:
                                    System.out.println("You pressed something else");
                                    break;
                            }

                            if(currentMap.canMoveTo(yCheck, xCheck)) {
                                player.setPosition(yCheck, xCheck);
                                System.out.println(yCheck + " " + xCheck);
                                displayPane.getChildren().remove(1);
                                playerPane.playerSetter(yCheck, xCheck);
                                displayPane.getChildren().add(playerPane);
                                childrenStatus = true;
                            }

                        }
                        catch(Exception ex){
                            ex.printStackTrace();
                        }

                    });
            primaryStage.setTitle("Nethack");
            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
            primaryStage.show();
        }
        catch(Exception ex){
            ex.printStackTrace();
            Platform.exit();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}
