import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

public class PlayList {
    private String title;
    private List<Song> songs;
private boolean wasNext=false;
private ListIterator<Song> itr;
    public PlayList(String title) {
        this.title = title;
        this.songs=new ArrayList<>();
        itr=songs.listIterator();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
    public String addSongFromAlbum(Album album, String songName){
//        boolean songExit=album.findSong(songName);
//        Song song;
//        if(songExit){
//            album.searchSong(songName);
//        }

        //another way and better way
        Optional<Song> songOptional=album.searchSong(songName);
        if(songOptional.isEmpty()){
            return "song not found in album";
        }

        Song songInAlbum=songOptional.get();
        this.songs.add(songInAlbum);
        itr=songs.listIterator();
        return "song add successfully";

    }

    public String playCurrentSong(){
        if(wasNext){

        }
        if(!wasNext){
            wasNext=true;
            itr.next();
        }
        if(itr.hasNext()){
            wasNext=true;
            Song song= itr.next();
            return "next song is:"+song;
        }
        return "reach end of playlist";

    }
    public String playPrevious(){
        if(!wasNext){

        }
        if(wasNext){
            wasNext=false;
            itr.previous();
        }
        if(itr.hasPrevious()){
            wasNext=false;
            Song song= itr.previous();
            return "previous song is:"+song;
        }
        return "You does not have any song in the playlist";
    }

    public String currentSong(){
        if(wasNext){
            wasNext=false;
            return "current song is:"+itr.previous();
        }

            wasNext=true;
            return "current song is:"+itr.next();

    }


}
