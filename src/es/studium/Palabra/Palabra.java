package es.studium.Palabra;

public class Palabra implements Runnable
{
	String palabra;
	Thread hilo;

	public Palabra(String pal)
	{

		palabra = pal;
		hilo = new Thread (this);

	}

	public void start()
	{

		hilo.start();
	}
	
	public void join()
	{
		try {
			hilo.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void run()
	{
		boolean palindromo = true;
		int i = 0;
		int j = palabra.length() - 1;
		while(palindromo && i < j)
		{
			if(palabra.charAt(i) == palabra.charAt(j))
			{
				++i;
				--j;
			}
			else
			{
				palindromo = false;
			}
		}
		if(palindromo)
			System.out.println("La palabra " + palabra + " sí es un palíndromo.");
		else
			System.out.println("La palabra " + palabra + " no es un palíndromo.");


	}

}
