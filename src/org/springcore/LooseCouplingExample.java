package org.springcore;

public class LooseCouplingExample 
{

	public static void main(String[] args) {
		
		
		//DellLaptop dl = new DellLaptop();
		
		
		Processor intProc = new IntelProcessor(8,9);
		
		
		DellLaptop dl = new DellLaptop("8GB", "200GB", intProc);
		
		
		
		
		
		System.out.println(dl);
		
		
		DellLaptop dl2 = new DellLaptop();
		
		dl2.setRAM("8 GB");
		dl2.setStorage("200 GB");
		
		//AMDProcessor ap = new AMDProcessor();
		ap.setPropertyA(01);
		ap.setPropertyB(02);
		
		dl2.setProcessor(ap);
		
		System.out.println(dl2);
		
	//IOC contaomer
		
		Processor intProc = new IntelProcessor(0, 0);
		Processor amdProc = new AMDProcessor();
		
		
		
	//
		
		
		
		
	}
}

interface Laptop{
	
}

interface Processor {
	
}

class HPLaptop implements Laptop{
	
	private String RAM;
	private String storage;
	
	@Autowired
	private Processor processor;
	
	public String getRAM() {
		return RAM;
	}

	public void setRAM(String rAM) {
		RAM = rAM;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	

	public Processor getProcessor() {
		return processor;
	}
	
	@Autowired
	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "DellLaptop [RAM=" + RAM + ", storage=" + storage + ", Processor=" + processor + "]";
	}
}

class DellLaptop{
	
	
	
	
	public DellLaptop(String rAM, String storage, Processor processor) {
		super();
		RAM = rAM;
		this.storage = storage;
		this.processor = processor;
	}
	
	public DellLaptop() {}

	private String RAM;
	private String storage;
	
	//@Autowired
	private Processor processor;
	
	public String getRAM() {
		return RAM;
	}

	public void setRAM(String rAM) {
		RAM = rAM;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	

	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "DellLaptop [RAM=" + RAM + ", storage=" + storage + ", Processor=" + processor + "]";
	}

	

}

//@Component("ip")
//@Primary
class IntelProcessor implements Processor{
	
	
	
	private int propertyA;
	
	private int propertyB;
	
	

	public IntelProcessor(int propertyA, int propertyB) {
		super();
		this.propertyA = propertyA;
		this.propertyB = propertyB;
	}

	public int getPropertyA() {
		return propertyA;
	}

	public void setPropertyA(int propertyA) {
		this.propertyA = propertyA;
	}

	public int getPropertyB() {
		return propertyB;
	}

	public void setPropertyB(int propertyB) {
		this.propertyB = propertyB;
	}

	@Override
	public String toString() {
		return "IntelProcessor [propertyA=" + propertyA + ", propertyB=" + propertyB + "]";
	}
	
	
	
	
}

//@Component
class AMDProcessor implements Processor{
	
	private int propertyA;
	
	private int propertyB;

	public int getPropertyA() {
		return propertyA;
	}

	public void setPropertyA(int propertyA) {
		this.propertyA = propertyA;
	}

	public int getPropertyB() {
		return propertyB;
	}

	public void setPropertyB(int propertyB) {
		this.propertyB = propertyB;
	}

	@Override
	public String toString() {
		return "AMDProcessor [propertyA=" + propertyA + ", propertyB=" + propertyB + "]";
	}
	
	
	
	
}
