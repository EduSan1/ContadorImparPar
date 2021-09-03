
public class LacoRepeticao {

	public static void main(String[] args) {

		int x = 101;
		double cont = 0, conti = 0;

		while (cont < x) {

			conti = cont;
			conti = cont % 2;

			if (conti == 0) {

				System.out.println(cont + " - par");

			} else {

				System.out.println(cont + " - ímpar");

			}
			cont = cont + 1;

		}

	}

}
