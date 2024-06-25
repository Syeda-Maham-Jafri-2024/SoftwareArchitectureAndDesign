abstract class MediaPlayer {
    public abstract void play();
}

class AudioPlayer extends MediaPlayer {
    @Override
    public void play() {
        System.out.println("Playing audio");
    }
}

class VideoPlayer extends MediaPlayer {
    @Override
    public void play() {
        System.out.println("Playing video");
    }
}

class Subtitles {
    public void show() {
        System.out.println("Showing subtitles");
    }
}

public class Main {
    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();
        MediaPlayer videoPlayer = new VideoPlayer();
        Subtitles subtitles = new Subtitles();

        audioPlayer.play();
        videoPlayer.play();
        subtitles.show();
    }
}
