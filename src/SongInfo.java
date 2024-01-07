public class SongInfo {
    
    public static final String dummysong = null;
    private String songname;
    public String getSongname() {
        return songname;
    }

    private String artistname;
    public String getArtistname() {
        return artistname;
    }

    private int playcount;
    public int getPlaycount() {
        return playcount;
    }

    public SongInfo(String songname, String artistname, int playcount) {
        this.songname = songname;
        this.artistname = artistname;
        this.playcount = playcount;
    }


    public static SongLibrary[] add() {
        return null;
    }

}
