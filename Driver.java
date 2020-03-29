import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {

        Data data = new Data();
        Algorithm avanger = new Algorithm(data.state, data.noOfTestCases, data.stateDescriptions, data.mat, data.testCases, data.rules);
        ArrayList<String> solution = avanger.solve();
        solution.forEach((s)-> System.out.println(s));
    }

}
