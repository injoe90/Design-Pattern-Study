package HomeTheater;

public class StreamingPlayer {
    String streamingMovie;
    public void on() { System.out.println("스트리밍 플레이어가 켜졌습니다.");}
    public void off() { System.out.println("스트리밍 플레이어가 꺼졌습니다."); }
    public void pause() {}
    public void play(String movie) {
        streamingMovie = movie;
        System.out.println("스트리밍 플레이어에서 " + '"' + streamingMovie + '"' + "를(을) 재생합니다.");
    }
    public void setSurroundAudio() {}
    public void setTwoChannelAudio() {}
    public void stop() { System.out.println("스트리밍 플레이어에서 " + '"' + streamingMovie + '"' + "재생을 종료합니다."); }
    public String toString() { return null; }
}
