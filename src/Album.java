import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Album {
    private String title;
    private String artist;
    private List<Song> song;

    public Album(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.song=new ArrayList<>();
    }

    public Album(String title, String artist, List<Song> song) {
        this.title = title;
        this.artist = artist;
        this.song = song;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<Song> getSong() {
        return song;
    }

    private boolean findSong(Song findToSong1){
        for(Song song2:song){
            if(song2.getTitle().equals(findToSong1.getTitle()) && song2.getArtist().equals(findToSong1.getArtist())){
                return true;
            }
        }
        return false;

    }
    public boolean findSong(String songName){
        for(Song song2:song){
            if(song2.getTitle().equals(songName)){
                return true;
            }
        }
        return false;

    }
    public String addSong(Song songs){
        if(this.findSong(songs)){
            return "song already exits";
        }
    song.add(songs);
    return "song added";

    }

    public Optional<Song> searchSong(String songName) {
        for(Song song1:song){
            if(song1.getTitle().equals(songName)){
                return Optional.of(song1);
            }
        }
        return Optional.empty();
    }
}
