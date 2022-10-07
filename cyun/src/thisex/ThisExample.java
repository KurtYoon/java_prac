package thisex;

class Birthday {
    int day;
    int month;
    int year;

    public void setYear(int year) {
        this.year = year;
    }

    public void printThis() {
        System.out.println(this);
    }
}

public class ThisExample {
    public static void main(String[] args) {
        Birthday b1 = new Birthday();
        Birthday b2 = new Birthday();

        b1.printThis();
        b2.printThis();
    }
}
