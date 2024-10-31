import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     //1. Pedir al usuario que ingrese la temperatura para cada día.
       Scanner temperatura = new Scanner(System.in);

        System.out.println("Ingrese temperatura del día Lunes");
        int monday = temperatura.nextInt();
        System.out.println("Ingrese temperatura del día Martes");
        int tuesday = temperatura.nextInt();
        System.out.println("Ingrese temperatura del día Miercoles");
        int wesd = temperatura.nextInt();
        System.out.println("Ingrese temperatura del día Jueves");
        int thurs = temperatura.nextInt();
        System.out.println("Ingrese temperatura del día Viernes");
        int friday = temperatura.nextInt();
        System.out.println("Ingrese temperatura del día Sabádo");
        int satur = temperatura.nextInt();
        System.out.println("Ingrese temperatura del día Domingo");
        int sun = temperatura.nextInt();


        ArrayList <Integer> listado = new ArrayList<>();
        listado.add(monday);
        listado.add(tuesday);
        listado.add(wesd);
        listado.add(thurs);
        listado.add(friday);
        listado.add(satur);
        listado.add(sun);


        System.out.println("***  Muestra la temperatura diaria *** " +listado);

        //2. Calcular y mostrar en consola el promedio de temperatura de la semana.
        double suma =0;
        double prome;
     for (double clima:listado) {
      suma = suma + clima;
      //System.out.println("***  Muestra la temperatura acumulada por día *** " +suma);
     }
     prome=suma / listado.size();
     System.out.println("***  Promedio del clima es *** " +prome);

     //3. Identificar y mostrar el día (índice) con la temperatura más alta.

     /*ArrayList <Integer> numMayor = new ArrayList<>();
    double maxi = numMayor.get(0);
     for (double mayor:listado) {
      if (mayor > maxi) {
       maxi = mayor;
      }
      System.out.println("El número mayor es " + maxi);
     }*/
    }
}

/*
*

*/