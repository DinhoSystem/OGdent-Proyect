import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the OGDent dental Center!");
        System.out.println("Store Treatment Information");

        // Declare and initialize variables
        int idTreatment = 1;
        double priceTreatment = 39.90;
        boolean stateTreatment = true;
        String nameTreatment = "Endodontics";
        String descriptionTreatment = "Root canal treatment";
        double satisfaction = 0;

        // Print the treatment information
        System.out.println("ID: " + idTreatment);
        System.out.println("Treatment : " + nameTreatment);
        System.out.println("Description: " + descriptionTreatment);
        System.out.println("Price: " + priceTreatment);
        System.out.println("State: " + stateTreatment);

        double averageSatisfaction = (4.5 + 4.8 + 5.0) / 3;
        System.out.println(" Satisfaction: " + averageSatisfaction);

        if (priceTreatment > 50) {
            System.out.println("You can pay treatment by credit card");
        } else {
            System.out.println("You can pay treatment by cash");
        }
        for (int i = 0; i < 5 ; i++) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Please enter your rating of the customer service: ");
            double rating = keyboard.nextDouble();
            satisfaction += rating;
        }

        System.out.println("The average satisfaction is: " + satisfaction / 5);
    }
}