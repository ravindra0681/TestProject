
public class ArrayVarArg {
	
	public int add(int...n)
	{
		int sum=0;
		for(int i:n)
		{
			sum=sum+i;
			//System.out.println(sum);
		}
		return sum;
		
	}
	

}

