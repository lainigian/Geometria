

public class Punto 
{
	//attributi
	private double x;
	private double y;
	
	
	//Costruttori
	public Punto (double x, double y)
	{
		this.x=x;
		this.y=y;
	}
	
	public Punto()
	{
		x=0;
		y=0;
	}
	
	public Punto (Punto punto)
	{
		x=punto.getX();
		y=punto.getY();
	}
	
	//metodi setter e getter
	public void setX(double x)
	{
		this.x=x;
	}
	public double getX()
	{
		return x;
	}
	public void setY(double y)
	{
		this.y=y;
	}
	public double getY()
	{
		return y;
	}
	
	//altri metodi
	
	public double distanza(Punto p)
	{
		double distanza;
		distanza=Math.sqrt(Math.pow(x-p.x,2)+Math.pow(y-p.y,2));
		return distanza;
	}
	
	public boolean equals(Punto p)
	{
		if (p.getX()==x && p.getY()==y)
			return true;
		else
			return false;	
	}
	public String toString()
	{
		return ("("+x+";"+y+")");
	}

	
}
