package cooperation;

public class TakeTrans {
    public static void main(String[] args) {
        Student james = new Student("James", 5000);
        Student tomas = new Student("tomas", 10000);

        Bus bus100 = new Bus(100);
        james.takeBus(bus100);
        Subway subway12 = new Subway(12);
        tomas.takeSubway(subway12);

        james.showInfo();
        bus100.showInfo();

        tomas.showInfo();
        subway12.showInfo();
    }
}