
public class Principal {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.setnportas(4);
		c1.setMarca(" GM ");
		c1.setModelo("Onix");
		c1.setnCavalos(220);
		System.out.printf("Marca: %s. \nModelo: %s.\n"
				+ " Número de portas %d. \nQuantidade de cavalos: %d.\n",
				c1.getMarca(), c1.getModelo(), c1.getnportas(), c1.getnCavalos());
		
		

	}

}
