package musicOrganizer;

public class RunClass {
    public static void main(String[] args) {
        MusicCollection[] musicCollections = new MusicCollection[4];
        musicCollections[0] = new MusicCollection("pop");
        musicCollections[1] = new MusicCollection("jazz");
        musicCollections[2] = new MusicCollection("rock");
        musicCollections[3] = new MusicCollection("country");
        musicCollections[0].addFile("music 1");

        System.out.println(musicCollections[0].getNumberOfFiles());

    }
}
