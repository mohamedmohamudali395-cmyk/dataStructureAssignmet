package assignment_university;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class UniversityPayrollSystem {
    private Lecturer[] lecturers = new Lecturer[100];

    public void addLecturer(Lecturer lecturer) {
        if (lecturer == null) {
            System.out.println("Cannot add a null lecturer.");
        } else {
            for(int i = 0; i < this.lecturers.length; ++i) {
                if (this.lecturers[i] == null) {
                    this.lecturers[i] = lecturer;
                    System.out.println("Lecturer added successfully.");
                    return;
                }
            }

            System.out.println("Payroll system is full.");
        }
    }

    public void displayAllLecturers() {
        boolean found = false;

        for(int i = 0; i < this.lecturers.length; ++i) {
            if (this.lecturers[i] != null) {
                this.lecturers[i].displayInformation();
                System.out.println("------------------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No lecturers registered.");
        }

    }

    public void displayHighestPaidLecturer() {
        Lecturer highestPaid = null;

        for(int i = 0; i < this.lecturers.length; ++i) {
            if (this.lecturers[i] != null && (highestPaid == null || this.lecturers[i].calculateSalary() > highestPaid.calculateSalary())) {
                highestPaid = this.lecturers[i];
            }
        }

        if (highestPaid == null) {
            System.out.println("No lecturers registered.");
        } else {
            System.out.println("\nHighest-Paid Lecturer");
            highestPaid.displayInformation();
        }
    }

    public double calculateFullTimePayroll() {
        double total = (double)0.0F;

        for(int i = 0; i < this.lecturers.length; ++i) {
            if (this.lecturers[i] instanceof FullTimeLecturer) {
                total += this.lecturers[i].calculateSalary();
            }
        }

        return total;
    }

    public double calculatePartTimePayroll() {
        double total = (double)0.0F;

        for(int i = 0; i < this.lecturers.length; ++i) {
            if (this.lecturers[i] instanceof PartTimeLecturer) {
                total += this.lecturers[i].calculateSalary();
            }
        }

        return total;
    }

    public void displayLecturersEarningMoreThan(double amount) {
        boolean found = false;
        System.out.printf("%nLecturers earning more than $%,.2f%n", amount);

        for(int i = 0; i < this.lecturers.length; ++i) {
            if (this.lecturers[i] != null && this.lecturers[i].calculateSalary() > amount) {
                this.lecturers[i].displayInformation();
                System.out.println("------------------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No lecturers found.");
        }

    }
}
