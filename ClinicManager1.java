import java.util.Scanner;

public class ClinicManager1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String patientName;
        String doctorName;
        String appointmentDate;
        int patientAge;
        double consultationFee;
        double medicineFee;
        double totalFee;

        System.out.print("Enter patient name: ");
        patientName = sc.nextLine();

        System.out.print("Enter patient age: ");
        patientAge = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter doctor name: ");
        doctorName = sc.nextLine();

        System.out.print("Enter appointment date: ");
        appointmentDate = sc.nextLine();

        System.out.print("Enter consultation fee: ");
        consultationFee = sc.nextDouble();

        System.out.print("Enter medicine fee: ");
        medicineFee = sc.nextDouble();

        // Arithmetic operator
        totalFee = consultationFee + medicineFee;

        // Relational operator
        boolean adult = patientAge >= 18;

        System.out.println("\n--- Clinic Appointment Details ---");
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Age: " + patientAge);
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Appointment Date: " + appointmentDate);
        System.out.println("Consultation Fee: " + consultationFee);
        System.out.println("Medicine Fee: " + medicineFee);
        System.out.println("Total Fee: " + totalFee);
        System.out.println("Adult Patient: " + adult);

        sc.close();
    }
}