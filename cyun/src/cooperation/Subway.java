package cooperation;

public class Subway {
    int lineNumber;
    int passanerCount;
    int money;

    public Subway(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void take(int money) {
        passanerCount++;
        this.money += money;
    }

    public void showInfo() {
        System.out.println("지하철" + lineNumber + "번의 승객은" + passanerCount + "명이고, 수입은" + money + "입니다.");
    }
}
