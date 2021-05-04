package item20;

public interface SingerSongWriter extends  Singer,SongWriter{
    String singAndWrite(String s);

    default void sing2(){
        System.out.println("true = " + true);
    }
}
