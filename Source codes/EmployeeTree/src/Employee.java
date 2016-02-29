
public class Employee 
{ private  String name;
   private  int tenure;
   private  int salary;
   private int id;
    
   public Employee(String[] info)
   {
	   this.name=info[0];
	    this.tenure=Integer.parseInt(info[1]);
	    this.salary=Integer.parseInt(info[2]);
	    this.id=Integer.parseInt(info[3]);
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

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}
   //Employeee defined.
}
