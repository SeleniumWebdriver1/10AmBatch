package practies;

public class ArraysTest {
	public static void main(String[] args)
	{
		int [] a=new int[5];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		//intert values
		a[0]=11;
		a[1]=12;
		a[2]=13;
		a[3]=14;
		a[4]=15;
		System.out.println("###########");
		for(int x:a)
		{
			System.out.println(x);
		}
		
		
			
	}

}
