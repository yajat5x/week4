import java.util.Scanner;

class Patient {
    String name;
    double consultationFee;

    Patient(String name, double consultationFee) {
        this.name = name;
        this.consultationFee = consultationFee;
    }

    double calculateFinalAmount(double fee) {
        double discount = fee >= 2000 ? fee * 0.10 : fee * 0.05;
        return fee - discount;
    }

    void displayDetails() {
        double discount = consultationFee >= 2000
                ? consultationFee * 0.10
                : consultationFee * 0.05;

        double finalAmount = calculateFinalAmount(consultationFee);

        System.out.println("Patient Name: " + name);
        System.out.println("Original Consultation Fee: Rs." + consultationFee);
        System.out.println("Discount: Rs." + discount);
        System.out.println("Final Amount: Rs." + finalAmount);
        System.out.println("-------------------------");
    }
}

public class PatientBillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Patient[] patients = new Patient[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Patient " + (i + 1));

            System.out.print("Patient Name: ");
            String name = sc.nextLine();

            System.out.print("Consultation Fee: ");
            double fee = sc.nextDouble();
            sc.nextLine();

            patients[i] = new Patient(name, fee);
        }

        System.out.println("\n===== PATIENT BILLING DETAILS =====");

        for (int i = 0; i < 5; i++) {
            patients[i].displayDetails();

        }

        sc.close();
    }
}