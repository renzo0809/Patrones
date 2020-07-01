package pointfood;

public class commandpattern {
public static void main(String[] args) {
stock aStock=new stock();

comprar comprarstock=new comprar(aStock);
vender venderstock=new vender(aStock);

Broker broker=new Broker();
broker.tomarorden(comprarstock);
broker.tomarorden(venderstock);

broker.placeorden();
}
}
