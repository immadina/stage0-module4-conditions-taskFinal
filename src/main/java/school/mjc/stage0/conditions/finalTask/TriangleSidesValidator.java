package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
//"this is a valid triangle", otherwise : "it's not a triangle"
        if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0) {
            System.out.println("it's not a triangle");
        } else if ((firstSide + secondSide > thirdSide) && (thirdSide + secondSide > firstSide) && (firstSide + thirdSide > secondSide)){
            System.out.println("this is a valid triangle");
        } else {
            System.out.println("it's not a triangle");
        }
    }
}
