package baseball.Model;

import java.util.ArrayList;
import java.util.List;

public class BaseballMember {

    public List<Integer> getComputer() {
        return computer;
    }

    public void setComputer(List<Integer> computer) {
        this.computer = computer;
    }

    List<Integer> computer = new ArrayList<>();

    public List<Integer> getMyinputlist() {
        return myinputlist;
    }

    public void setMyinputlist(List<Integer> myinputlist) {

        this.myinputlist = myinputlist;
    }

    List<Integer> myinputlist = new ArrayList<Integer>(); //myinputlist이라는 List 생성


    public String getGAME_RESTART() {
        return GAME_RESTART;
    }

    private final String GAME_RESTART = "1";

    public String getGAME_END() {
        return GAME_END;
    }

    private final String GAME_END = "2";

}