import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MainConsultoria{
public static void main(String[ ] args) throws IOException{

int opc;
boolean valor = true;

InputStreamReader stream = new InputStreamReader(System.in);
BufferedReader reader = new BufferedReader(stream);

JefeProyecto obj1 = new JefeProyecto( );
ProgramadorHora obj2 = new ProgramadorHora( );

while(valor){
System.out.println("\n*************** <Consultoria Software> ***************");
System.out.println("\nSeleccione una opcion del menu: ");
System.out.println("1. Sueldo programador por hora");
System.out.println("2. Sueldo jefe de proyecto");
System.out.println("3. Salir");
System.out.print("\nOpcion: ");
opc = Integer.valueOf(reader.readLine( )).intValue( );
if(opc == 1){
System.out.println("\n*************** <Programador Hora> ***************");
System.out.print("Digite el nombre: ");
obj2.setNombre(reader.readLine( ));
System.out.print("Digite el puesto: ");
obj2.setPuesto(reader.readLine( ));
System.out.print("Digite el numero de horas en la quincena: ");
obj2.setHorasTrabajadas(Integer.valueOf(reader.readLine( )).intValue( ));
System.out.print("Digite el precio por hora: ");
obj2.setSueldoHora(Float.valueOf(reader.readLine( )).floatValue( ));
obj2.calcularSalarioQuincenal( );
System.out.println("Sueldo quincenal: " + obj2.getSalarioTotalQuincenal( ));
}
else if(opc == 2){
System.out.println("\n*************** <Jefe Proyecto> ***************");
System.out.print("Digite el nombre: ");
obj1.setNombre(reader.readLine( ));
System.out.print("Digite el puesto: ");
obj1.setPuesto(reader.readLine( ));
System.out.print("Digite el precio del proyecto: ");
obj1.setPrecioProyecto(Float.valueOf(reader.readLine( )).floatValue( ));
obj1.calcularSalarioQuincenal( );
System.out.println("Sueldo quincenal: " + obj1.getSalarioTotalQuincenal( ));
}
else if(opc == 3)
   valor = false;
else
   System.out.println("ERROR. La opcion no existe, vuelve a intentar.");
}

}
}