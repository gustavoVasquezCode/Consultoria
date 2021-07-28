public class ProgramadorHora extends Empleado{

private String nombre;
private String puesto;
private int horasTrabajadas;
private float sueldoHora;
private float salarioTotalQuincenal;

@Override
public void calcularSalarioQuincenal( ){
if(horasTrabajadas >= 0 && horasTrabajadas <= 70)
   salarioTotalQuincenal = horasTrabajadas * sueldoHora;
else
   salarioTotalQuincenal = (70 * sueldoHora) + calcularHoraExtra( );
}

private float calcularHoraExtra( ){
int horasExtras = 0;
if(horasTrabajadas > 70)
   horasExtras = horasTrabajadas - 70;
return (horasExtras * sueldoHora) * 2;
}

public void setNombre(String nombre){
this.nombre = nombre;
}

public void setPuesto(String puesto){
this.puesto = puesto;
}

public void setHorasTrabajadas(int horasTrabajadas){
this.horasTrabajadas = horasTrabajadas;
}

public void setSueldoHora(float sueldoHora){
this.sueldoHora = sueldoHora;
}

public void setSalarioTotalQuincenal(float salarioTotalQuincenal){
this.salarioTotalQuincenal = salarioTotalQuincenal;
}

public String getNombre( ){ return nombre; }

public String getPuesto( ){ return puesto; }

public int getHorasTrabajadas( ){ return horasTrabajadas; }

public float getSueldoHora( ){ return sueldoHora; }

public float getSalarioTotalQuincenal( ){ return salarioTotalQuincenal; }

}