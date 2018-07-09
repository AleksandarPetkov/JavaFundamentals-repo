package Lecture_Inheritance.p03_Manking;

public class Worker extends Human {
    private double weekSalary;
    private double hoursPerDay;

    public Worker(String firstName, String lastName, double weekSalary, double hoursPerDay) {
        super(firstName, lastName);
        setWeekSalary(weekSalary);
        setHoursPerDay(hoursPerDay);
    }

    public void setWeekSalary(double weekSalary) {
        if (weekSalary < 10) {
            throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        }
        this.weekSalary = weekSalary;
    }

    public void setHoursPerDay(double hoursPerDay) {
        if (hoursPerDay < 1 || hoursPerDay > 12) {
            throw new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");
        }
        this.hoursPerDay = hoursPerDay;
    }

    public double getSalaryPerHour(double weekSalary, double hoursPerDay) {
        double sum = 0;
        sum = (weekSalary / 7) / hoursPerDay;
        return sum;
    }

    //    @Override
//    public void setLastName(String lastName) {
//        if (lastName.length() < 3) {
//            throw new IllegalArgumentException("Expected length more than 3 symbols!Argument: lastName");
//        }
//        this.setLastName(lastName);
//    }

    @Override
    protected void setLastName(String lastName) {
        if (lastName.length() > 3) {
            super.setLastName(lastName);
        } else  {
            throw new IllegalArgumentException("Expected length more than 3 symbols!Argument: lastName");
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("First Name: %s", super.getFirstName())).append(System.lineSeparator())
               .append(String.format("Last Name: %s", super.getLastName())).append(System.lineSeparator())
                .append(String.format("Week Salary: %.2f", this.weekSalary)).append(System.lineSeparator())
                .append(String.format("Hours per day: %.2f", this.hoursPerDay)).append(System.lineSeparator())
                .append(String.format("Salary per hour: %.2f", getSalaryPerHour(this.weekSalary, this.hoursPerDay))).append(System.lineSeparator());

        return sb.toString();
    }
}
