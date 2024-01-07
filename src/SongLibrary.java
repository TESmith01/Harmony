import java.util.*;

public class SongLibrary {

    private ArrayList<SongInfo> songs = new ArrayList<>();

    public ArrayList<SongInfo> getSongs() {
        return songs;
    }
    public void addedSong(SongInfo usersong){
        songs.add(usersong);
    }
    public void songremove(SongInfo yesremove ){
        songs.remove(yesremove);
    }

    public SongLibrary() {

        SongInfo dummysong1 = new SongInfo("Umbrella", "Rhianna", 55000);
        SongInfo dummysong2 = new SongInfo("Jump around", "Idk", 65000);
        SongInfo dummysong3 = new SongInfo("Hello", "Adele", 87000);
        SongInfo dummysong4 = new SongInfo("Photograph", "Ed Sheeran", 93000);
        SongInfo dummysong5 = new SongInfo("Paris", "The Chainsmokers", 110000);
        SongInfo dummysong6 = new SongInfo("Dont Go", "Josh Kumra", 34000);
        SongInfo dummysong7 = new SongInfo("All of Me", "John Legen", 42000);
        SongInfo dummysong8 = new SongInfo("Skyscraper", "Demi Lavato", 28000);
        SongInfo dummysong9 = new SongInfo("Home", "MGK", 15000);
        SongInfo dummysong10 = new SongInfo("Outnumbered", "Dermot Kennedy", 24000);

        songs.add(dummysong1);
        songs.add(dummysong2);
        songs.add(dummysong3);
        songs.add(dummysong4);
        songs.add(dummysong5);
        songs.add(dummysong6);
        songs.add(dummysong7);
        songs.add(dummysong8);
        songs.add(dummysong9);
        songs.add(dummysong10);

        List<SongInfo> songInfo = songs.subList(0, 5);

        
    }

}