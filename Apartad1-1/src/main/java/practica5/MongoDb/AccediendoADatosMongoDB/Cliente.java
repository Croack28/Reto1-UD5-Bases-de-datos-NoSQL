package practica5.MongoDb.AccediendoADatosMongoDB;

import org.springframework.data.annotation.Id;


public class Cliente {

  @Id
  public String id;

  public String nombre;
  public String apellido;

  public Cliente() {}

  public Cliente(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
  }

  @Override
  public String toString() {
    return String.format(
        "Customer[id=%s, nombre='%s', apellido='%s']",
        id, nombre, apellido);
  }
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
  
  

}
