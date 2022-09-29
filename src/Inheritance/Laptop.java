package Inheritance;

public class Laptop {
	
	int noOfUSBPort, processorSpeed ;
	
	public int getNoOfUSBPort() {
		return noOfUSBPort;
	}

	public void setNoOfUSBPort(int noOfUSBPort) {
		this.noOfUSBPort = noOfUSBPort;
	}

	public int getProcessorSpeed() {
		return processorSpeed;
	}

	public void setProcessorSpeed(int processorSpeed) {
		this.processorSpeed = processorSpeed;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Laptop l = new Laptop();
		l.setNoOfUSBPort(4);
		l.setProcessorSpeed(2);
		System.out.println("No Of USB Port "+l.getNoOfUSBPort());
		System.out.println("Processor Speed "+l.getProcessorSpeed());

	}

}
