package pointfood;

public class vender implements orden {
private stock aStock;

public vender(stock aStock) {
	this.aStock=aStock;
}
@Override
public void ejecutar() {
	aStock.vender();
}
}
