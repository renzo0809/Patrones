package pointfood;

public class comprar implements orden {
private stock aStock;

public comprar(stock aStock) {
	this.aStock=aStock;
}
@Override
public void ejecutar() {
	aStock.comprar();
}
}
