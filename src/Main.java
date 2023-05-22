import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      Album album=new Album("gloriya","smith");
      album.addSong(new Song("tere name","arjiit singh",2));
        album.addSong(new Song("sajan","Kailash dubey",3));
        album.addSong(new Song("Dil thod","Udit Narayan",4));
        album.addSong(new Song("Dil Divana","Sonu kumar",5));


        Album album1=new Album("HindiSong","Alka singh");
        album1.addSong(new Song("Goa Becch","Yo Yo singh",2));
        album1.addSong(new Song("Makhana","MIkka singh",3));
        album1.addSong(new Song("Sasural genda","Badshah",4));
        album1.addSong(new Song("Dil ","King",5));


        PlayList playList=new PlayList("Myplaylist");
        playList.addSongFromAlbum(album,"gloriya");
        playList.addSongFromAlbum(album,"sajan");
        playList.addSongFromAlbum(album1,"Makhana");
        playList.addSongFromAlbum(album1,"dil");

        System.out.println(playList.currentSong());
        System.out.println(playList.playPrevious());
        System.out.println(playList.playCurrentSong());
        System.out.println(playList.currentSong());
        System.out.println(playList.playPrevious());
        System.out.println(playList.playCurrentSong());

    }
}
