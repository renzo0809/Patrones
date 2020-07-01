package pointfood;
import java.util.List;
import java.util.ArrayList;

public class Broker {
private List<orden>ordenlist=new ArrayList<orden>();

public void tomarorden(orden ord) {
	ordenlist.add(ord);
}

public void placeorden() {
	for (orden od:ordenlist) {
	ordenlist.forEach(x->x.ejecutar());
	}
	ordenlist.clear();
	}
}
