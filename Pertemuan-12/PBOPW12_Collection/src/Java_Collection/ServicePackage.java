package Java_Collection;

public class ServicePackage {
	private String service;
	private int value;
	
	
	public ServicePackage(String Service, int Value) {
		this.service = Service;
		this.value = Value;
	}

	public String getService() {
		return service;
	}

	public int getValue() {
		return value;
	}

	public void setService(String service) {
		this.service = service;
	}

	public void setValue(int value) {
		this.value = value;
	}

	
	
}
