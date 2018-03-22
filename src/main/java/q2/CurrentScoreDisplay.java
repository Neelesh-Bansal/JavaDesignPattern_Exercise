package q2;


public class CurrentScoreDisplay implements Observer {

    private int bowls;
    private int runs;

CurrentScoreDisplay(Subject subject){
    subject.addObserver(this);
}
    @Override
    public void updateObserver(int run,int bowl) {
        runs=run;
        bowls=bowl;
        print();
    }

    public void print(){
        System.out.println("runs : "+runs+" bowls : "+bowls);
    }
}
