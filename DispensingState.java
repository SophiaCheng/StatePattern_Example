package statepattern;

import statepattern.exception.MachineWarning;

public class DispensingState implements State{
	VendingMachine machine;
	
	public DispensingState(VendingMachine machine){
		this.machine = machine;
	}

	@Override
	public void insertCoin() throws MachineWarning {
		// TODO Auto-generated method stub
		throw new MachineWarning("wait ... previous order is processing");
		
	}

	@Override
	public void pressButton() throws MachineWarning {
		// TODO Auto-generated method stub
		throw new MachineWarning("wait ... previous order is processing");
	}

	@Override
	public void dispense() throws MachineWarning {
		// TODO Auto-generated method stub
		machine.setMachineState(machine.getNoCoinInsertedState());
		
	}
	
}
