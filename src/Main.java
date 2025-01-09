import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<LocalDate> days = new ArrayList<>();
        days.add(LocalDate.of(2024, 1, 15));
        days.add(LocalDate.of(2024, 2, 23));
        days.add(LocalDate.of(2024, 3, 8));
        days.add(LocalDate.of(2024, 3, 23));
        days.add(LocalDate.of(2024, 6, 14));
        days.add(LocalDate.of(2024, 12, 31));

        ArrayList<Celebration> celebrations = new ArrayList<>();
        celebrations.add(new Celebration("Новый год", 12, 31, null));
        celebrations.add(new Celebration("23 февраля", 2, 23, Genders.Male));
        celebrations.add(new Celebration("8 марта", 3, 8, Genders.Female));

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Boris", LocalDate.of(2000,5,6), Genders.Male));
        employees.add(new Employee("Katrin", LocalDate.of(1999,6,17), Genders.Female));
        employees.add(new Employee("Vladimir", LocalDate.of(1990,8,23), Genders.Male));
        employees.add(new Employee("Lisa", LocalDate.of(2001,12,1), Genders.Female));
        employees.add(new Employee("German", LocalDate.of(2002,5,4), Genders.Male));

        congratulationToEmpoyee(employees,celebrations,days);
    }

    public static void congratulationToEmpoyee(ArrayList<Employee> employees, ArrayList<Celebration> celebrations, ArrayList<LocalDate> days) {

        for(LocalDate today: days) {
            System.out.println(today.toString());
            Celebration todayCelebration = null;

            for(Celebration celebration: celebrations) {
                if(today.getMonthValue() == celebration.getMonth() && today.getDayOfMonth() == celebration.getDay()) {
                    todayCelebration = celebration;
                }
            }

            if(todayCelebration != null) {
                if(todayCelebration.getGender() == null) {
                    for(Employee employee: employees) {
                        System.out.println(employee.getName() + ", поздравляем с празником - " + todayCelebration.getNameOfCelebration());
                    }
                }
                else {
                    for(Employee employee: employees) {
                        if(employee.getGender() == todayCelebration.getGender()) {
                            System.out.println(employee.getName() + ", поздравляем с празником - " + todayCelebration.getNameOfCelebration());
                        }
                    }
                }
            }
        }
    }
}