package employeeshift;

public class Employee 
{  private int id;
    private String name;
    private int tenure;
    private int salary;
    
   
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void introduce()
    {System.out.println(id+name+tenure+salary);//check
    }
    public void gettoknowyourself(String[] info)
    {id=Integer.parseInt(info[0]);
      name=info[1];   
      tenure=Integer.parseInt(info[2]);
       salary=Integer.parseInt(info[3]);
    }
    
    public void register(Emprecord r)
    {  r.fillheadlist(this);
    } //the beginning info has been filled
}
