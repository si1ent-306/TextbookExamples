public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public Stock() {
    }

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getChangePercent(double previousClosingPrice, double currentPrice){
        double percentage = (currentPrice / previousClosingPrice) * 100;
        return percentage;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "symbol='" + symbol + '\'' +
                ", name='" + name + '\'' +
                ", previousClosingPrice=" + previousClosingPrice +
                ", currentPrice=" + currentPrice +
                '}';
    }

    public static void main(String[] args){
        Stock stock = new Stock();
        stock.setName("Oracle Corporation");
        stock.setSymbol("ORCL");
        stock.setPreviousClosingPrice(34.5);
        stock.setCurrentPrice(34.35);
        System.out.println(stock.getChangePercent(stock.getPreviousClosingPrice(), stock.getCurrentPrice()));
        System.out.println(stock.toString());
    }
}
