
public class StockOffer {
	private int stockShares = 0;
	private String stockSymbol = "";
	private int collegeCode = 0;
	
	public StockOffer(int numOfShares, String stock, int collCode) {
		stockShares = numOfShares;
		stockSymbol = stock;
		collegeCode = collCode;
	}
	
	public int getStockShares() { return stockShares; }
	public String getStockSymbol() { return stockSymbol; }
	public int getCollCode() { return collegeCode; }
}
