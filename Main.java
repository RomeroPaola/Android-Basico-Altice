class Main {
  public static void main(String[] args) {
   
      Estudiante[] estudiantes = {
      new Estudiante("Juan",24),
      new Estudiante("Erika",20),
      new Estudiante("Emilio",23),
      new Estudiante("Karina",21),
      new Estudiante("Eduardo",24),
      new Estudiante("Tomas",25),
    };

     //Desarrollo
  System.out.println("Practica 1- Estudiantes");

  System.out.println("1-Total de estudiantes: " + String.valueOf(estudiantes.length));

  System.out.println("2-Edad mínima: "+ String.valueOf(getEdadMinima(estudiantes)));

  System.out.println("3-Edad máxima: "+String.valueOf(getEdadMaxima(estudiantes)));

  System.out.println("4-Edad promedio: "+String.valueOf(getEdadPromedio(estudiantes)));

  }
 
public static int getEdadMinima(Estudiante[] estudiantes){
  
  int edadMinima=estudiantes[0].getEdad();  
  for (int i=0; i<estudiantes.length; i++)
  {
    if(estudiantes[i].getEdad()<edadMinima)
    {
      edadMinima=estudiantes[i].getEdad();
    }
   }
  return edadMinima;
}
public static int getEdadMaxima(Estudiante[] estudiantes){
  int edadMaxima=-1;

  for(int i=0; i<estudiantes.length; i++)
  {
    if(estudiantes[i].getEdad()>edadMaxima)
    {
        edadMaxima=estudiantes[i].getEdad();

    }
  }
    return edadMaxima;
}

public static int getEdadPromedio(Estudiante[] estudiantes)
{
  int promedio=1;
  for (int i=0; i<estudiantes.length; i++)
  {
      promedio+=estudiantes[i].getEdad();
      }
    promedio= promedio/(estudiantes.length);
    return promedio;
}

}