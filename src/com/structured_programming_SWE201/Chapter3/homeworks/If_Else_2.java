package com.structured_programming_SWE201.Chapter3.homeworks;

public class If_Else_2 {
        public static void main(String[] args) {
            float speed=46;

            int reverseDrivers=0,parkedDrivers=0,slowDrivers=0,safeDrivers=0,speeders=0;
            if (speed < 0)
                reverseDrivers++;
            else if (speed < 1)
                parkedDrivers++;
            else if (speed < 40)
                slowDrivers++;
            else if (speed <= 65)
                safeDrivers++;
            else
                speeders++;
            System.out.println("reverseDrivers = "+reverseDrivers+
                    "\t parkedDrivers = "+parkedDrivers+"\t slowDrivers = "+slowDrivers+
                    "\t safeDrivers = "+safeDrivers+"\t speeders = "+speeders);
        }
    }

