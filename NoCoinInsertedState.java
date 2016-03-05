package statepattern;

import statepattern.exception.MachineWarning;

public class NoCoinInsertedState implements State {
	VendingMachine machine;
	
	public NoCoinInsertedState(VendingMachine machine){
		this.machine = machine;
	}

	@Override
	public void insertCoin() throws MachineWarning {
		// TODO Auto-generated method stub
		if(!machine.isEmpty()){
			machine.setMachineState(machine.getCoinInsertedState());
		} else{
			throw new MachineWarning("Can not process request...Machine is out of stock");
		}
	}

	@Override
	public void pressButton() throws MachineWarning {
		// TODO Auto-generated method stub
		throw new MachineWarning("No coin inserted...");
	}

	@Override
	public void dispense() throws MachineWarning {
		// TODO Auto-generated method stub
		throw new MachineWarning("Invalid Operation");
	}
}
