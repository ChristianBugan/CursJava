package curs9;

public class MobilePhone extends Product {

	private int buyingPrice;
	private int vat;
	
	public MobilePhone(int buyingPrice, int vat) {
		this.buyingPrice = buyingPrice;
		this.vat = vat;
	}
	
	@Override
	public int calculatePrice() {
		return buyingPrice + vat;
	}

}
