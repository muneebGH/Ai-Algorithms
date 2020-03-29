package solvingBySearching.uninformedSearchStrategies.breathFirstSearch;

import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {

        Data data = new Data("/Users/muneeburrehman/IdeaProjects/Ai_Asi1_T1/src/solvingBySearching/uninformedSearchStrategies/breathFirstSearch/input.txt");
        Algorithm avenger = new Algorithm(data.state, data.noOfTestCases, data.stateDescriptions, data.mat, data.testCases, data.rules,data.actions);

        ArrayList<String> solution = avenger.solve();
        solution.stream().map(s->s!=null?s:"no solution");
        solution.forEach((s)-> System.out.println(s));
    }

}
