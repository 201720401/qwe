package cbsc.cha2;
import java.util.Random;
public class BinaryOperation_0 {
	public static void main(String[] args) {
		short m=0,n=0,ov=0,q=0;
		char o='+';
		Random random=new Random();
		for(int i=0;i<200;i++)
		{
			ov=(short)random.nextInt(2);
			m=(short)random.nextInt(101);
			n=(short)random.nextInt(101);
			if(ov==1)
			{
				o='+';
				if(m+n>100)
					continue;
			}
			else
			{
				o='-';
				if(m-n<0)
					continue;
			}
			q++;
			if(q>50)
				continue;
			if((q-1)%5==0)
				System.out.println();
			System.out.print(""+q+":\t"+m+o+n+"=");
			Aery(m,n,ov);
		}
	}
	public static void Aery(short m,short n,short ov) 
	{
		int p;
		if(ov==1){
			p=m+n;
		}
		else{
			p=m-n;
		}
		System.out.print(p);
		System.out.print("  ");
	}

}
