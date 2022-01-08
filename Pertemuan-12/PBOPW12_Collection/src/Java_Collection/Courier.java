package Java_Collection;

public class Courier {
	private Status status;
	private ServicePackage servicePackage;
	private City city;
	private int weight;
	private int quantity;
	private int priceItem;
	private int productName;
	
	public Courier(Status c_status, ServicePackage c_servicePackage, City c_city,
			int c_weight, int c_quantity, int c_priceItem, int c_productName){
		this.status = c_status;
		this.servicePackage = c_servicePackage;
		this.city = c_city;
		this.weight = c_weight;
		this.quantity = c_quantity;
		this.priceItem = c_priceItem;
		this.productName = c_productName;
		
	}

	public Status getStatus() {
		return status;
	}

	public ServicePackage getServicePackage() {
		return servicePackage;
	}

	public City getCity() {
		return city;
	}

	public int getWeight() {
		return weight;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getPriceItem() {
		return priceItem;
	}

	public int getProductName() {
		return productName;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public void setServicePackage(ServicePackage servicePackage) {
		this.servicePackage = servicePackage;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setPriceItem(int priceItem) {
		this.priceItem = priceItem;
	}

	public void setProductName(int productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "Courier [status=" + status + ", servicePackage=" + servicePackage + ", city=" + city + ", weight="
				+ weight + ", quantity=" + quantity + ", priceItem=" + priceItem + ", productName=" + productName
				+ ", getStatus()=" + getStatus() + ", getServicePackage()=" + getServicePackage() + ", getCity()="
				+ getCity() + ", getWeight()=" + getWeight() + ", getQuantity()=" + getQuantity() + ", getPriceItem()="
				+ getPriceItem() + ", getProductName()=" + getProductName() + "]";
	}
	
	
}
