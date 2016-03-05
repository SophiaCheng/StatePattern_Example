package statepattern.exception;

public class MachineWarning extends Throwable{
	private String message;
	
	public MachineWarning(String message){
		this.message = message;
	}
	public String getMessage(){
		return message;
	}
	
	
}
