public class BonusMilesService {
    public int calculate(int price) {
        int mileCost = 20;
        int bonus = price / mileCost;
        return bonus;
    }
}
