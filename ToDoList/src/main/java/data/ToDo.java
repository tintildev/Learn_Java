package data;

/**
 * @author Marti
 *
 */
public class ToDo {
	private int id;
	private String value;
	
	
	public ToDo(int id, String value) {
		super();
		this.id = id;
		this.value = value;
	}
	public int getId() {
		return id;
	}

	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "ToDo [id=" + id + ", value=" + value + "]";
	}
	
	

}
