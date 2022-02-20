package lesson6_singer;

public class Album {
    public String title;
    public Singer singer;
    public int releaseYear;

    public Album(String title, Singer singer, int releaseYear) {
        this.title = title;
        this.singer = singer;
        this.releaseYear = releaseYear;
    }

    public String toString() {
        return  "[" + title + "] " + singer + " (" + releaseYear + " )";
    }

}