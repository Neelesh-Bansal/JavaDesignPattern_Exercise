package q2;

import java.util.ArrayList;
import java.util.List;

public class Cricket_info implements Subject {
    private int runs;
    private int bowls;

    List<Observer>list = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        list.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {

        list.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer:list){
            observer.updateObserver(runs,bowls);
        }

    }

    public void updateScore(int bowl, int run){
            bowls=bowl;
            runs=run;
            notifyObserver();
    }
}
