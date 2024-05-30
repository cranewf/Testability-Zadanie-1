public class BonusMilesService {

    public int calculate(int price) {

        int cashback = 20;

        int miles = price / cashback;

        return miles;

    }
}
