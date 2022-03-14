package utils.entity;

public enum Department {
	TECHNICAL(1, "tech"), 
	ADMIN(2, "adm"), 
	HUMAN_RESOURCE(3, "hr"), 
	LEGAL(4, "lgl"), 
	UNKNOWN(5, "na"); 

	public final String label;
	public final Integer id;

	private Department(int id, String label) {
		this.label = label;
		this.id = id;
	}
}
