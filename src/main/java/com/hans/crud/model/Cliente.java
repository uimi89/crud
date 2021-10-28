package com.hans.crud.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class Cliente {
	@Id
	private Integer Cliente_ID;

	private String Nombre_Usuario;
	private String Contraseña;
	private String Nombre;
	private String Apellidos;
	private String Correo_Electronico;
	private Integer Edad;
	private double Estatura;
	private double Peso;
	private double IMC;
	private double GEB;
	private double ETA;
	private Date Fecha_Creacion;
	private Date Fecha_Actualizacion;
	
	

	public Cliente() {
		
	}
	
	public Cliente(Integer cliente_ID, String nombre_Usuario, String contraseña, String nombre, String apellidos,
			String correo_Electronico, Integer edad, double estatura, double peso, double iMC, double gEB, double eTA,
			Date fecha_Creacion, Date fecha_Actualizacion) {
		super();
		Cliente_ID = cliente_ID;
		Nombre_Usuario = nombre_Usuario;
		Contraseña = contraseña;
		Nombre = nombre;
		Apellidos = apellidos;
		Correo_Electronico = correo_Electronico;
		Edad = edad;
		Estatura = estatura;
		Peso = peso;
		IMC = iMC;
		GEB = gEB;
		ETA = eTA;
		Fecha_Creacion = fecha_Creacion;
		Fecha_Actualizacion = fecha_Actualizacion;
	}

	public Integer getCliente_ID() {
		return Cliente_ID;
	}

	public void setCliente_ID(Integer cliente_ID) {
		Cliente_ID = cliente_ID;
	}

	public String getNombre_Usuario() {
		return Nombre_Usuario;
	}

	public void setNombre_Usuario(String nombre_Usuario) {
		Nombre_Usuario = nombre_Usuario;
	}

	public String getContraseña() {
		return Contraseña;
	}

	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getCorreo_Electronico() {
		return Correo_Electronico;
	}

	public void setCorreo_Electronico(String correo_Electronico) {
		Correo_Electronico = correo_Electronico;
	}

	public Integer getEdad() {
		return Edad;
	}

	public void setEdad(Integer edad) {
		Edad = edad;
	}

	public double getEstatura() {
		return Estatura;
	}

	public void setEstatura(double estatura) {
		Estatura = estatura;
	}

	public double getPeso() {
		return Peso;
	}

	public void setPeso(double peso) {
		Peso = peso;
	}

	public double getIMC() {
		return IMC;
	}

	public void setIMC(double iMC) {
		IMC = iMC;
	}

	public double getGEB() {
		return GEB;
	}

	public void setGEB(double gEB) {
		GEB = gEB;
	}

	public double getETA() {
		return ETA;
	}

	public void setETA(double eTA) {
		ETA = eTA;
	}

	public Date getFecha_Creacion() {
		return Fecha_Creacion;
	}

	public void setFecha_Creacion(Date fecha_Creacion) {
		Fecha_Creacion = fecha_Creacion;
	}

	public Date getFecha_Actualizacion() {
		return Fecha_Actualizacion;
	}

	public void setFecha_Actualizacion(Date fecha_Actualizacion) {
		Fecha_Actualizacion = fecha_Actualizacion;
	}

}
