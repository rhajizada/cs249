import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.ImageViewBuilder;
import javafx.scene.layout.Pane;

import java.net.MalformedURLException;

/**
 * Created by rufathajizada on 11/16/16.
 */
public class PlayerPane extends Pane {
    Player playerState = new Player();
    PlayerPane(Player player) throws Exception {
        playerState = player;
        String imageURL = "http://web.cs.sunyit.edu/~realemj/2016fall/char.png";
        ImageView imageView = ImageViewBuilder.create()
                .image(new Image(imageURL))
                .build();
        imageView.setFitHeight(MapPane.TILE_HEIGHT);
        imageView.setFitWidth(MapPane.TILE_HEIGHT);
        getChildren().add(imageView);
        this.translateXProperty().bind(playerState.getXProperty().multiply(MapPane.TILE_WIDTH));
        this.translateYProperty().bind(playerState.getYProperty().multiply(MapPane.TILE_HEIGHT));
    }
}
