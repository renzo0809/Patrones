package pointfood;

public class stock {
private String nombre="Pollo";
private int cantidad=15;

public stock() {
	this.nombre=nombre;
	this.cantidad=cantidad;
}

public void comprar() {
	System.out.println("Stock [ Nombre: "+nombre+" Cantidad: "+cantidad+" ] comprado");
}

public void vender() {
	System.out.println("Stock [ Nombre: "+nombre+" Cantidad: "+cantidad+" ] vendido");
}
}
