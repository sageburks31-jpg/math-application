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

        double circle_radius = 7.25;
        double circle_area = Math.PI*(circle_radius*2);

        System.out.println("circle area "+circle_area);

        double square=5.0;
        double sq_root=Math.sqrt(square);

        System.out.println("square root "+sq_root);

        int[] dis_bwn={5, 10, 85, 50};
        int dis1=dis_bwn[0]-dis_bwn[1];
        int dis2=dis_bwn[2]-dis_bwn[3];

        System.out.println("distance between the points (5, 10) and (85, 50) is "+dis1*-1+" and "+dis2+" respectively.");
        System.out.println("the absolute (positive) value of -3.8 is "+-3.8*-1);



        // declare variables here
        // then code solution
        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        // REPEAT FOR NEXT EXERCISE
    }
}