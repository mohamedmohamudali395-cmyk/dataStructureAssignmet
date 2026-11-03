package assignment_university;


    public class Main {
        public static void main(String[] args) {
            UniversityPayrollSystem payroll = new UniversityPayrollSystem();
            Lecturer lecturer1 = new FullTimeLecturer("FT001", "mohamed Mohamud", (double)1800.0F, (double)300.0F, (double)250.0F);
            Lecturer lecturer2 = new FullTimeLecturer("FT002", "Axmed Hassan", (double)1500.0F, (double)200.0F, (double)150.0F);
            Lecturer lecturer3 = new PartTimeLecturer("PT001", "Mohamed Cabdi", (double)60.0F, (double)40.0F);
            Lecturer lecturer4 = new PartTimeLecturer("PT005", "Amina Yusuf", (double)45.0F, (double)35.0F);
            Lecturer lecturer5 = new PartTimeLecturer("PT004", "Faarax xasan", (double)50.0F, (double)45.0F);
            payroll.addLecturer(lecturer1);
            payroll.addLecturer(lecturer2);
            payroll.addLecturer(lecturer3);
            payroll.addLecturer(lecturer4);
            payroll.addLecturer(lecturer5);
            System.out.println("\n=== ALL LECTURERS ===");
            payroll.displayAllLecturers();
            payroll.displayHighestPaidLecturer();
            System.out.println("\n=== PAYROLL SUMMARY ===");
            System.out.printf("Full-Time Payroll: $%,.2f%n", payroll.calculateFullTimePayroll());
            System.out.printf("Part-Time Payroll: $%,.2f%n", payroll.calculatePartTimePayroll());
            System.out.printf("Total Payroll: $%,.2f%n", payroll.calculateFullTimePayroll() + payroll.calculatePartTimePayroll());
            payroll.displayLecturersEarningMoreThan((double)2000.0F);
        }
    }



