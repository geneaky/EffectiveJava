package item20;

public class AbsSingerSongWriter extends AbsSinger{
    @Override
    public void singing(String s) {
        System.out.println("singsing"+s);
    }

    @Override
    public String singAndWrite(String s) {
        return "singAndWrite";
    }

    @Override
    public void makeSong(String s) {
        System.out.println("makeSong"+s);
    }

}
