package Service;

public class StrategyService {
    private StrategyService strategyService;

    public StrategyService getStrategyService() {
        if (this.strategyService == null) {
            this.strategyService = new StrategyService();
        }
        return this.strategyService;
    }

    public float determinePriceStrategy() {
        // the logic
        DefaultPriceStrategy DPS = new DefaultPriceStrategy();
        TrafficPriceSteategy TPS = new TrafficPriceSteategy();
        RatingBasedStrategy RBS = new RatingBasedStrategy();
        return 0;
    }

    public void determineDriverMatchingService() {
        LeastTimeDriverStrategy LTDS = new LeastTimeDriverStrategy();
        NearestDriverMatchingStartegy NDMS = new NearestDriverMatchingStartegy();
    }

}
