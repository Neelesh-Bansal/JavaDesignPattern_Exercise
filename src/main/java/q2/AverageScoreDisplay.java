package q2;

public class AverageScoreDisplay implements Observer {


    private int bowls;
    private int runs;

    AverageScoreDisplay(Subject subject){
        subject.addObserver(this);
    }


    @Override
    public void updateObserver(int run,int bowl) {
        runs=run;
        bowls=bowl;
        print();
    }

    public void print(){
        System.out.println("average score :"+runs/bowls);
    }
}
