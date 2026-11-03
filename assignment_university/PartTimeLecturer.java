package assignment_university;

    public class PartTimeLecturer extends Lecturer {
        private double teachingHours;
        private double hourlyRate;

        public PartTimeLecturer(String id, String name, double teachingHours, double hourlyRate) {
            super(id, name);
            this.teachingHours = teachingHours;
            this.hourlyRate = hourlyRate;
        }

        public double getTeachingHours() {
            return this.teachingHours;
        }

        public void setTeachingHours(double teachingHours) {
            this.teachingHours = teachingHours;
        }

        public double getHourlyRate() {
            return this.hourlyRate;
        }

        public void setHourlyRate(double hourlyRate) {
            this.hourlyRate = hourlyRate;
        }

        public double calculateSalary() {
            return this.teachingHours * this.hourlyRate;
        }

        public void displayInformation() {
            System.out.println("Employment Type: Part-time");
            System.out.println("Lecturer ID: " + this.getLecturerId());
            System.out.println("Name: " + this.getName());
            System.out.println("Teaching Hours: " + this.teachingHours);
            System.out.printf("Hourly Rate: $%,.2f%n", this.hourlyRate);
            System.out.printf("Total Salary: $%,.2f%n", this.calculateSalary());
        }
    }


