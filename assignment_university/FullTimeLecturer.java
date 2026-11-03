package assignment_university;

    public class FullTimeLecturer extends Lecturer {
        private double basicSalary;
        private double researchAllowance;
        private double administrativeAllowance;

        public FullTimeLecturer(String id, String name, double basicSalary, double researchAllowance, double administrativeAllowance) {
            super(id, name);
            this.basicSalary = basicSalary;
            this.researchAllowance = researchAllowance;
            this.administrativeAllowance = administrativeAllowance;
        }

        public double getBasicSalary() {
            return this.basicSalary;
        }

        public void setBasicSalary(double basicSalary) {
            this.basicSalary = basicSalary;
        }

        public double getResearchAllowance() {
            return this.researchAllowance;
        }

        public void setResearchAllowance(double researchAllowance) {
            this.researchAllowance = researchAllowance;
        }

        public double getAdministrativeAllowance() {
            return this.administrativeAllowance;
        }

        public void setAdministrativeAllowance(double administrativeAllowance) {
            this.administrativeAllowance = administrativeAllowance;
        }

        public double calculateSalary() {
            return this.basicSalary + this.researchAllowance + this.administrativeAllowance;
        }

        public void displayInformation() {
            System.out.println("Employment Type: Full-time");
            System.out.println("Lecturer ID: " + this.getLecturerId());
            System.out.println("Name: " + this.getName());
            System.out.printf("Basic Salary: $%,.2f%n", this.basicSalary);
            System.out.printf("Research Allowance: $%,.2f%n", this.researchAllowance);
            System.out.printf("Administrative Allowance: $%,.2f%n", this.administrativeAllowance);
            System.out.printf("Total Salary: $%,.2f%n", this.calculateSalary());
        }
    }


