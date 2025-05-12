package some_complex_media_library;

public class BitrateReader {
    public static VideoFile read (VideoFile file, Codec codec) {
        System.out.println("some_complex_media_library.BitrateReader: reading file...");
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("some_complex_media_library.BitrateReader: writing file...");
        return buffer;
    }
}
