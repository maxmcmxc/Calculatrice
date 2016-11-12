package defaultPackage;

public enum Operation {

	DIVIDE("/"),
	MULTIPLICATE("*"),
	SUB("-"),
	ADD("+"),
	EQUAL("=");
	
	private String operation;
	
	private Operation(String operation){
		
		this.operation = operation;
		
	}
	
	public String getValue(){
		
		return this.operation;
		
	}
}
