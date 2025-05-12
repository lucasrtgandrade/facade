import facade.VideoConversionFacade;
import some_complex_media_library.*;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtube.ogg", "mp4");
        System.out.println(mp4Video);
    }
}
