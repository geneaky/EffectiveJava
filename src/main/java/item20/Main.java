package item20;

import java.util.AbstractList;

public class Main {

    // 기존 클래스를 확장하는 방법은 인터페이스가 유일하기 때문에 추상클래스 보다 인터페이스 선호
    // 클래스를 확잘 할 때마다 추상 클래스를 생성하면 계층 구조가 복잡해진다 큰 단점
    // 추상 클래스에 기능을 추가하는 방법은 상속뿐

    public static void main(String[] args) {
        SingerSongWriter ssw = new Song();
        Song song = new Song();
        song.sing2();
        song.makeSong("coin");
        song.singing("say");
        System.out.println(song.singAndWrite("check"));

        AbsSingerSongWriter abSong = new AbsSingerSongWriter();
        abSong.makeSong("over the rainbow");

    }

}
