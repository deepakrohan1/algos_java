package org.example.dp;

public class ProblemsDp {

    static int getTotalMethods(int targetSteps, int currentSteps) {
        /*
            if currentsteps == target steps you havr reached top
            so you return 1
         */
        if (currentSteps == targetSteps) return 1;
        /**
         * if currentStep > targetStep its crossed so approach
         * wont work
         */
        if (currentSteps > targetSteps) return 0;

        /**
         * At each step count number of ways + 1 and ways + 2
         */
        int totWithOneStep = getTotalMethods(targetSteps, currentSteps + 1);
        int totWithTwoStep = getTotalMethods(targetSteps, currentSteps + 2);

        return totWithOneStep + totWithTwoStep;


    }

    public static void main(String[] args) {
        System.out.println(getTotalMethods(4, 0));
    }
}
