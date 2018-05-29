package org.ip.sesion06;

public class ObjGeometrico {
	protected double x;
	protected double y;
	private String color;
	private boolean relleno;
	private java.util.Date fechaCreacion;
	
	public ObjGeometrico(){
		x = 0.0;
		y = 0.0;
		fechaCreacion = new java.util.Date();
		color = "blanco";
		relleno = false;
	}
	public ObjGeometrico(double x,double y,String color,boolean relleno){
		super();
		this.x = x;
		this.y = y;
		this.color = color;
		this.relleno = relleno;
	}
	public ObjGeometrico(double x, double y){
		super();
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isRelleno() {
		return relleno;
	}
	public void setRelleno(boolean relleno) {
		this.relleno = relleno;
	}
	public java.util.Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(java.util.Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public void desplazar(double dx, double dy){
		this.x += dx;
		this.y += dy;
	}
	@Override
	public String toString() {
		return "ObjGeometrico [x=" + x + ", y=" + y + ", color=" + color + ", relleno=" + relleno + ", fechaCreacion="
				+ fechaCreacion + "]";
	}
	
	
}
