package cooperation;

public class Bus {
    int busNumber;
    int passanerCount;
    int money;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public void take(int money) {
        passanerCount++;
        this.money += money;
    }

    public void showInfo() {
        System.out.println("버스" + busNumber + "번의 승객은" + passanerCount + "명이고, 수입은" + money + "입니다.");
    }
}