package org.springcore;

public class LooseCouplingExample 
{

	public static void main(String[] args) {
		
		
		DellLaptop dl = new DellLaptop();
		
		dl.setRAM("8 GB");
		dl.setStorage("200 GB");
		
		
		//IntelProcessor ip = new IntelProcessor();
		
		ip.setPropertyA(01);
		ip.setPropertyB(02);
		
		dl.setProcessor(ip);
		
		System.out.println(dl);
		
		
		DellLaptop dl2 = new DellLaptop();
		
		dl2.setRAM("8 GB");
		dl2.setStorage("200 GB");
		
		//AMDProcessor ap = new AMDProcessor();
		ap.setPropertyA(01);
		ap.setPropertyB(02);
		
		//dl2.setProcessor(ap);
		
		System.out.println(dl2);
		
		
		
		
		
		
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

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "DellLaptop [RAM=" + RAM + ", storage=" + storage + ", Processor=" + processor + "]";
	}
}

class DellLaptop{
	
	
	private String RAM;
	private String storage;
	
	@Autowired
	private Processor ip;
	
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

	
	Processor ip = new IntelProcessor();
	Processor amdProcessor = new AMDProcessor();

}

@Component("ip")
@Primary
class IntelProcessor implements Processor{
	
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
		return "IntelProcessor [propertyA=" + propertyA + ", propertyB=" + propertyB + "]";
	}
	
	
	
	
}

@Component
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
