public class JefeProyecto extends Empleado{

private String nombre;
private String puesto;
private float precioProyecto;
private float comisionProyecto;
private float salarioTotalQuincenal;

@Override
public void calcularSalarioQuincenal( ){
comisionProyecto( );
salarioTotalQuincenal = 12000 + comisionProyecto;
}

private void comisionProyecto( ){
comisionProyecto = precioProyecto * 0.10f;
}

public void setNombre(String nombre){
this.nombre = nombre;
}

public void setPuesto(String puesto){
this.puesto = puesto;
}

public void setPrecioProyecto(float precioProyecto){
this.precioProyecto = precioProyecto;
}

public void setComisionProyecto(float comisionProyecto){
this.comisionProyecto = comisionProyecto;
}

public void setSalarioTotalQuincenal(float salarioTotalQuincenal){
this.salarioTotalQuincenal = salarioTotalQuincenal;
}

public String getNombre( ){ return nombre; }

public String getPuesto( ){ return puesto; }

public float getPrecioProyecto( ){ return precioProyecto; }

public float getComisionProyecto( ){ return comisionProyecto; }

public float getSalarioTotalQuincenal( ){ return salarioTotalQuincenal; }

}