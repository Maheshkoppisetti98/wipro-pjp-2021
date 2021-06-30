class Person
{
	private String name;
	private int birthYear;

	public Person(String n, int byear)
	{
	  name = n;
	  birthYear = byear;
	}

	public String toString()
	{
	  return "Person[name=" + name + ",birthYear=" + birthYear + "]";
	}
}
class Teacher extends Person
{
	private double salary;
	private String subject;

	public Teacher(String n, int byear, double s,String ss)
    {
      super(n, byear);
      salary = s;
	subject=ss;
    }

    public String toString()
    {
      return "Employee[super=" + super.toString() + ",salary=" + salary +","+subject+ "]";
    }
}
class Student extends Person
{
  private String major;

  public Student(String n, int byear, String m)
  {
     super(n, byear);
     major = m;
  }

  public String toString()
  {
    return "Student[super=" + super.toString() + ",major=" + major + "]";
  }
}
class collegestudent extends Student{
	private String collegeName;
	private int year;
	public collegestudent(String s,int y,String ss,String m){
	super(s,y,ss);
	collegeName=m;
	
	year=y;
	//super(n,byear,m);
}
public String toString()
{
return "CollegeStudent-"+collegeName+","+year;
}
}
class program3
{
  public static void main(String[] args)
  {
    Person a = new Person("Anil",2000);
    Student b = new Student("Jimmy", 2001, "Information Technology");
    Teacher c = new Teacher("Mike", 1998, 12000,"java");
    collegestudent d=new collegestudent("jimmy",2001,"it","giet");
    
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
  }
}