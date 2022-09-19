package com.data_structures_and_algorithms_CSC301.Assignments.Assignment_1;

public class Covid19 extends Virus{

    @Override
    boolean isDeadly() {
        return false;
    }

    @Override
    String getShape() {
        return "Circular";
    }
}
