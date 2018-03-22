package q2;

public class Client {
    public static void main(String[] args) {
        Cricket_info cricinfo=new Cricket_info();
        CurrentScoreDisplay currentScoreDisplay=new CurrentScoreDisplay(cricinfo);
        AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay(cricinfo);

        cricinfo.updateScore(10,20);

    }
}
