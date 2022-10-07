package singleton;

public class Company {
    
     // 외부에서 Company를 생성 못하게 함
    private static Company instance = new Company();
    
    private Company() {}

    public static Company getInstance() {
        if (instance == null)
            instance = new Company();
        return instance; // 외부에서 가져다 쓸 수 있게 해줌
    }

}
