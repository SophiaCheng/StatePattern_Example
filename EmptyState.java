package statepattern;

import statepattern.exception.MachineWarning;

public class EmptyState implements State{
	
	VendingMachine machine;
	public EmptyState(VendingMachine machine){
		this.machine = machine;
	}
	@Override
	public void insertCoin() throws MachineWarning {
		// TODO Auto-generated method stub
		throw new MachineWarning("Can not process the request");
	}
	@Override
	public void pressButton() throws MachineWarning {
		// TODO Auto-generated method stub
		throw new MachineWarning("Invalid Action");
	}
	@Override
	public void dispense() throws MachineWarning {
		// TODO Auto-generated method stub
		throw new MachineWarning("Invalid Action");
	}
	
}
