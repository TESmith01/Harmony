import java.util.Scanner;

public class UserInteraction {
    SongLibrary library;

    private void menu() {

        System.out.println("Welcome to Harmony, ");
        System.out.println("What would you like to do? ");
        System.out.println("Please chose an option for the list below: ");
        menu2();

    }

    private void menu2() {
        System.out.println("What would you like to do now? ");
        System.out.println("1 View all songs");
        System.out.println("2 View all artists");
        System.out.println("3 See all songs over 50,000 plays");
        System.out.println("4 Add a new song");
        System.out.println("5 Remove a song");
        Scanner scanner = new Scanner(System.in);

        switch (scanner.next()) {
            case "1":
                printSongs();
            case "2":
                printSongs2();
            case "3":
                over50k();
            case "4":
                addsong();
            case "5":
                removesong();
        }
    }

    public UserInteraction() {

        library = new SongLibrary();

        menu();

    }

    private void printSongs() {

        for (SongInfo song : library.getSongs()) {
            System.out.println(song.getSongname());

        }
        menu2();

    }

    private void printSongs2() {

        for (SongInfo song : library.getSongs()) {
            System.out.println(song.getArtistname());
        }
        System.out.println("What would you like to do next");
        menu2();
    }

    // why isn't this printing out the first 5 songs?
    private void over50k() {
        for (SongInfo songInfo : library.getSongs().subList(0, 5)) {
            System.out.println("Here are the songs with over 50K plays: "
                    + (songInfo.getSongname() + " by " + songInfo.getArtistname() + " with " + songInfo.getPlaycount()
                            + " plays"));
        }
        menu2();
    }

    // figure out how to add and remove a song
    private void addsong() {
        System.out.println("Please enter the song name, artist name, playcount");
        String usersong;
        Scanner addScanner = new Scanner(System.in);
        usersong = addScanner.nextLine();
        String[] str = usersong.split(",", 3);
        SongInfo addedSong = new SongInfo(str[0], str[1], Integer.parseInt(str[2]));
        System.out.println(
                "You have added " + addedSong.getSongname() + " " + addedSong.getArtistname() + " "
                        + addedSong.getPlaycount());
        library.addedSong(addedSong);
        menu2();
    }

    // how to remove a song
    private void removesong() {
        System.out.println("Please enter the song you wish to remove");
        Scanner removeScanner = new Scanner(System.in);
        String removesong = removeScanner.nextLine();
        SongInfo userremovesong = null;
                    for (SongInfo removeSongInfo : library.getSongs()) {
                if (removeSongInfo.getSongname().equals(removesong)) {
                    //temp sotring song after response
                    userremovesong = removeSongInfo;
                }
            }
        System.out.println("Do you wish to remove song " + removesong + " " + "Enter Yes or No");
        String resoponse = removeScanner.nextLine();

        if (resoponse.equals("Yes")) {
                    if (userremovesong != null) {
                        library.songremove(userremovesong);
                    }
                }
            else {
                String noremove = "No";
                System.out.println("You will be taken back to the menu.");
                menu2();
            }
        }
    }

