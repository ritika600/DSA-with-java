import java.util.Scanner;
import java.util.ArrayList;

public class Polynomial {

	int coefficient[]=new int[100];

	public void setCoefficient(int degree, int coeff)
    {
		coefficient[degree]+=coeff;	
	}
	 
	public void print()
    {
		for(int i =0 ;i<coefficient.length;i++)
        {
			if(coefficient[i]!=0)
            {
				System.out.print(coefficient[i]+"x"+i+" ");
			}
		}
	}

	public Polynomial add(Polynomial p)
    {
		for(int i=0;i<this.coefficient.length;i++)
        {
			for(int j=0;j<p.coefficient.length;j++)
            {
				if(i==j && (this.coefficient[i]!=0 || p.coefficient[j]!=0))
                {
					this.coefficient[i]+=p.coefficient[j];
				}
			}
		}
		return this;		
	}

	public Polynomial subtract(Polynomial p)
    {
        for(int i=0;i<this.coefficient.length;i++)
        {
            for(int j=0;j<p.coefficient.length;j++)
            {
                if(i==j && (this.coefficient[i]!=0 || p.coefficient[j]!=0))
                {
                    this.coefficient[i]-=p.coefficient[j];
            	}
        	}
		}
		return this;
	}

	public Polynomial multiply(Polynomial p)
    {
		Polynomial a =new Polynomial();
		for(int i=0;i<this.coefficient.length/2;i++)
        {
			for(int j=0;j<p.coefficient.length/2;j++)
            {
				a.coefficient[(i+j)]+=this.coefficient[i]*p.coefficient[j];
			}		
		}
		return a;
	}
}
