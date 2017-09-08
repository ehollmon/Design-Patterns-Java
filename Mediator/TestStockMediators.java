
public class TestStockMediators {

	public static void main(String[] args) {
		StockMediator nyse = new StockMediator();
		
		HollmonSacks broker = new HollmonSacks(nyse);
		APMorgan broker2 = new APMorgan(nyse);
		
		broker.saleOffer("MSFT", 100);
		broker.saleOffer("AMZN", 200);

		broker2.buyOffer("MSFT", 100);
		broker2.saleOffer("NRG", 10);
		
		broker.buyOffer("NRG", 10);
		
		nyse.getStockOfferings();
		nyse.getColleagues();

	}

}
