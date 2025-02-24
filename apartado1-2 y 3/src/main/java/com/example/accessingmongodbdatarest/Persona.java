package com.example.accessingmongodbdatarest;

import org.springframework.data.annotation.Id;

public class Persona {

  @Id private String id;

  private String nombre;
  private String apellidos;

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }
}