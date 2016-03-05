package statepattern.test;

import statepattern.VendingMachine;
import statepattern.exception.MachineWarning;

public class Test {
	public Test(){
		
	}
	
	public static void main(String[] args){
		VendingMachine machine = new VendingMachine();
		
		machine.reFill(2);
		
		//first dispense
		try{
			machine.insertCoin();
			machine.pressButton();
		} catch(MachineWarning e){
			System.out.println("Test1 : " + e.getMessage());
		}
		
		//second Test
		try{
			machine.insertCoin();
			machine.insertCoin();
			machine.pressButton();
		} catch (MachineWarning e){
			System.out.println("Test2 :" + e.getMessage());
			try{
				machine.pressButton();
			} catch(MachineWarning f){
				//TODO
			}
		}
		
		//Test three
		 try {
	            machine.pressButton();
         }catch (MachineWarning e) {
	            System.out.println("Test 3:" + e.getMessage());
	     }
		 
		//Test Four 
	        try {
	            machine.insertCoin();
	        } catch (MachineWarning e) {
	            System.out.println("Test 4:" + e.getMessage());
	        }
	}
}

























