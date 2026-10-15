package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // Question 1:
        double garySalary=2.00;
        double bobSalary=6.00;
        double highestSalary=Math.max(bobSalary,garySalary);

        System.out.println("The highest salary "+highestSalary);

        double carPrice=20.00;
        double truckPrice=15.00;
        double lowestPrice=Math.min(carPrice,truckPrice);

        System.out.println("The lowest price "+lowestPrice);

        double circleRadius = 7.25;
        double circleArea = Math.PI*(circleRadius*2);

        System.out.println("circle area "+circleArea);

        double square=5.0;
        double sqRoot=Math.sqrt(square);

        System.out.println("square root "+sqRoot);

        int[] disBwn={5, 10, 85, 50};
        int dis1=disBwn[0]-disBwn[1];
        int dis2=disBwn[2]-disBwn[3];

        System.out.println("distance between the points (5, 10) and (85, 50) is "+dis1*-1+" and "+dis2+" respectively.");
        System.out.println("the absolute (positive) value of -3.8 is "+-3.8*-1);

        System.out.println("A random number between 0 and 1 is "+Math.random());

        int hrToMinkey=60;

        int dayTomin=hrToMinkey*24;

        System.out.println("The number of minutes that are in 24 days is "+dayTomin);



        // declare variables here
        // then code solution
        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        // REPEAT FOR NEXT EXERCISE
    }
}