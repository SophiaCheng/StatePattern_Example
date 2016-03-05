package statepattern;

import statepattern.exception.MachineWarning;

public class VendingMachine {
	
	State coinInsertedState = new CoinInsertedState(this);
	State emptyState = new EmptyState(this);
	State noCoinInsertedState = new NoCoinInsertedState(this);
	State dispensingState = new DispensingState(this);
	
	State machineState = null;
	
	int capacity = 0;
	public VendingMachine(){
		machineState = noCoinInsertedState;
	}
	
	public void reFill(int count){
		capacity += count;
		machineState = noCoinInsertedState;
	}
	
	/* Two Actions performed by Machine*/
	public void insertCoin() throws MachineWarning{
		machineState.insertCoin();
	}
	
	public void pressButton() throws MachineWarning{
		machineState.pressButton();
		machineState.dispense();
		capacity --;
	}
	
	public boolean isEmpty(){
		if(capacity <= 0){
			return true;
		}  else{
			return false;
		} 
	}
	
	public void setMachineState(State machineState){
		this.machineState = machineState;
	}
	
	public State getMachineState(){
		return machineState;
	}
	
	public void setCoinInsertedState(State coinInsertedState){
		this.coinInsertedState = coinInsertedState;
	}
	public State getCoinInsertedState(){
		return coinInsertedState;
	}
	
	public void setEmptyState(State emptyState){
		this.emptyState = emptyState;
	}
	public State getEmptyState(){
		return emptyState;
	}
	
	public void setNoCoinInsertedState(State noCoinInsertedState){
		this.noCoinInsertedState = noCoinInsertedState;
	}
	public State getNoCoinInsertedState(){
		return noCoinInsertedState;
	}
	
	public void setDispensingState(State dispensingState){
		this.dispensingState = dispensingState;
	}
	public State getDispensingState(){
		return dispensingState;
	}
	
	public void setCapacity(int capacity){
		this.capacity = capacity;
	}
	public int getCapacity(){
		return capacity;
	}
}





























