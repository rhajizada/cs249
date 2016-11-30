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
/*  ghp9 Nethack
 Written by Rufat Hajizada for CS249
 Language: Java
*/

public class Main extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        try{
            URL url = new URL("http://web.cs.sunyit.edu/~realemj/2016fall/Map01.txt"); //Map URL
            Scanner pageInput = new Scanner(url.openStream()); // Map scanner
            Map currentMap = new Map(); // instance of Map
            currentMap.load(pageInput); // loads pageInput into currentMap
            MapPane mapPane = new MapPane(currentMap); // instance of MapPane
            Pane displayPane = new Pane(); // instance of Pane
            displayPane.getChildren().add(mapPane); // adds mapPane to displayPane
            Player player = new Player(5, 5); // instance of Player
            Scene scene = new Scene(displayPane); // adds displayPane to the scene
            PlayerPane playerPane = new PlayerPane(player); // instance of PlayerPane
            displayPane.getChildren().add(playerPane); // adds playerPane to the cdisplayPane

            scene.setOnKeyPressed(
                // lambda expression handling controls
                    keyEvent ->{
                        boolean childrenStatus = false;
                        try {

                            KeyCode key = keyEvent.getCode();
                            int xCheck = player.getXProperty().intValue();
                            int yCheck = player.getYProperty().intValue();
                            switch (key) {
                                case A:
                                    xCheck--;
                                    break;
                                case W:
                                    yCheck--;
                                    break;
                                case S:
                                    yCheck++;
                                    break;
                                case D:
                                    xCheck++;
                                    break;
                                default:
                                    break;
                            }

                            if(currentMap.canMoveTo(yCheck, xCheck)) {
                                player.setPosition(yCheck, xCheck);
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
