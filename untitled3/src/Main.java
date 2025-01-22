import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inicijalizacija modela i view-a
        StudentModel model = new StudentModel();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Odaberite opciju:");
            System.out.println("1. Dodaj studenta");
            System.out.println("2. Prikaži sve studente");
            System.out.println("3. Prikaži studenta po ID-u");
            System.out.println("4. Izlaz");

            int izbor = scanner.nextInt();

            switch (izbor) {

                    case 1:

                        System.out.print("Unesite ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine(); // Čišćenje newline karaktera
                        System.out.print("Unesite ime: ");
                        String ime = scanner.nextLine();
                        System.out.print("Unesite broj bodova: ");
                        int bodovi = scanner.nextInt();
                        controller.DodajStudenta(id, ime, bodovi);


                    break;
                case 2:
                    controller.showAllStudents();
                    break;
                case 3:
                    System.out.print("Unesite ID studenta: ");
                    int studentId = scanner.nextInt();
                    controller.showStudentById(studentId);
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Pogrešan unos, pokušajte ponovo.");
            }
        }

        scanner.close();
    }
}
