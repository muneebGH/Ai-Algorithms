import java.util.ArrayList;
import java.util.function.Consumer;

public class Driver {

    public static void main(String[] args) {

        Data data = new Data();
        Algorithm avenger = new Algorithm(data.state, data.noOfTestCases, data.stateDescriptions, data.mat, data.testCases, data.rules,data.actions);

        ArrayList<String> solution = avenger.solve();
        solution.stream().map(s->s!=null?s:"no solution");
        solution.forEach((s)-> System.out.println(s));
    }

}
