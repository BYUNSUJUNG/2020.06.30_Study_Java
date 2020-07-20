package Ch19;

public class C05Students extends C05People{

	String school;
	
	C05Students(String name,int age,String school)
	{
		super(name,age);
		this.school=school;
	}
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof C05Students)
		{
			C05Students tmp=(C05Students)obj;
			return this.school==tmp.school;
		}
		else
		{
			return false;
		}
	}
}
