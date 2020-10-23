public class Programa{

	public static void sumatoria()
	{
		float a,b,c;

		System.out.println("::  Sumatoria  ::");
		System.out.println("Ingrese el primer numero");
		a = ConsoleInput.getFloat();
		System.out.println();
		System.out.println("Ingrese el segundo numero");
		b = ConsoleInput.getFloat();

		c = a + b;

		System.out.println();
		System.out.println("El resultado es: "+c);
		System.out.println();
	}

	public static void promedio()
	{
		int n;
        float p,s=0,x;
        System.out.println(":: Promedio ::");
        System.out.println("Ingrese la cantidad de elementos");
        n = ConsoleInput.getInt();
   
        for(int i=1;i<=n;i++)
        { 
         System.out.println("Ingrese el elemento "+i);
         x = ConsoleInput.getFloat();
         s = s + x;                
        }   
        p = s/n;
        
        System.out.println();
        System.out.println("El promedio es: "+p);
        System.out.println();
	}

	public static void factorial(){
        long f=1;
        int num;
        System.out.println(":: Factorial ::");
        System.out.println("Ingrese el numero");
        num = ConsoleInput.getInt();
        for (int i = num; i > 0; i--) {
            f = f * i;
        }
        System.out.println();
        System.out.println("El factorial de "+num+" es: "+f);
        System.out.println();    
    }

	public static void raiznesisma()
	{
        double raiz;
        double i,r;
        System.out.println(":: Raiz n-esima ::");
        System.out.println("Ingrese el valor del indice");
        i = ConsoleInput.getInt();
        System.out.println("Ingrese el valor del radicando");
        r = ConsoleInput.getInt();

        raiz = Math.pow(r,1/i);

        System.out.println();
        System.out.println("La raiz "+i+" de "+r+" es: "+raiz);
        System.out.println();
	}
	public static void main(String[] args) {

		int centinela = 0;

		do{
			System.out.println("Elija una operacion:");
			System.out.println();
			System.out.println("1. Sumatoria");
			System.out.println("2. Promedio");
			System.out.println("3. Factorial");
			System.out.println("4. Raiz n-esima");
			System.out.println("5. Salir");
			centinela = ConsoleInput.getInt();

			switch(centinela)
			{
				case 1: System.out.println();
						sumatoria();
						break;
				case 2: System.out.println();
						promedio();
						break;
				case 3: System.out.println();
						factorial();
						break;
				case 4: System.out.println();
						raiznesisma();
						break;
				case 5: System.out.println("Salio del programa");
						break;
				default: System.out.println("Opcion no disponible");
			}
		}while(centinela!=5);

	}
}