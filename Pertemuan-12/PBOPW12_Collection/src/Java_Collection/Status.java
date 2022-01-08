package Java_Collection;

public class Status {
	private int code;
	private String description;
	
	public Status(int Code, String Description) {
		this.code = Code;
		this.description = Description;
	}

	public int getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
