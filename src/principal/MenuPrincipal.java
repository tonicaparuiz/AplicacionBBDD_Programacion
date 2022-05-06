package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

import controlador.ConsultaDeter;
import controlador.ConsultaGeneral;

public class MenuPrincipal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int ejer = 1;
		int num1 = 0, num2 = 0, num3 = 0;
		while (ejer != 0) {

			try {
				System.out.println("Bienvenido a la base de datos, por favor indique la accion que desea realizar\r\n");
				System.out.print("(1). Ingresar datos  \r\n" 
								+ "(2). Consulta general  \r\n"
								+ "(3). Consultar dato determinado  \r\n" 
								+ "(4). Actualizacion de registro  \r\n"
								+ "(5). Eliminacion de registro \r\n" 
								+ "(0). Salir de la aplicacion ");
				ejer = scanner.nextInt();

				switch (ejer) {
				case 1:

					break;
				case 2:
					ConsultaGeneral cons = new ConsultaGeneral();
					cons.consultaGeneral();
					break;
				case 3:
					int x;
					System.out.println("Por favor añada el id de la ciudad a revisar");
					x=scanner.nextInt();
					ConsultaDeter consdeter = new ConsultaDeter();
					consdeter.selectorCiudad(x);
					break;
				case 4:

					break;
				case 5:

					break;

				default:
					if (ejer != 0) {
						System.out.println("Error, indique numero del 1 al 5 (0 para salir)");
					}
					break;
				}

			} catch (InputMismatchException e) {
				System.out.println("Fatal Error, deleting all files on your computer...");
				break;
			}
		}

	}

}
