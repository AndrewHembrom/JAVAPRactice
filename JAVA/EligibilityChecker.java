public class EligibilityChecker {

    public static void checkEligibilityForDriving(int age) throws Exception {
        int legalDrivingAge = 18; // Minimum legal driving age in India for motor vehicles

        if (age < legalDrivingAge) {
            throw new Exception("You are not eligible to drive in India. Minimum age required is " + legalDrivingAge + " years.");
        } else {
            System.out.println("You are eligible to drive in India.");
        }
    }

    public static void main(String[] args) {
        try {
            int personAge = 20; // Replace this with the person's actual age
            checkEligibilityForDriving(personAge);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
