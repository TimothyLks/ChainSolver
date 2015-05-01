import java.util.*;

public class WordChainSolver {

	public WordChainSolver()
	{
		
	}
	
	public static void solution(String w1, String w2)
	{
		char[] c1 = w1.toCharArray();
		char[] c2 = w2.toCharArray();
		System.out.println(w1);
		while(!(c1==c2))
		{
			for(int i=0;i<c1.length;i++)
			{
					if(c1[i]==c2[i])
					{
						continue;
					}
		  		    else
					{
						c1[i]=c2[i];
						System.out.println(c1);
					}
			}
		}
		System.out.println(c1);
		System.out.println(c2);
	}
	
	public static void main(String [ ] args)
	{
		solution("LEAD", "GOLD");
	}
}
