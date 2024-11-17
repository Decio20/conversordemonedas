import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);
        ConversorMoneda consulta = new ConversorMoneda();

        String dolar         = "USD";
        String pesoArgentino = "ARS";
        String realBrasilero = "BRL";
        String solPeruano    = "PEN";

        try {
            System.out.println("**************************************");
            System.out.println();
            System.out.println("Bienvenido al conversor de moneda :)");
            System.out.println();
            System.out.println("Escoja una opción para su conversión: ");
            System.out.println(" 1) Dólar =>> Peso argentino");
            System.out.println(" 2) Peso argentino =>> Dólar");
            System.out.println(" 3) Dólar =>> Real Brasileño");
            System.out.println(" 4) Real Brasileño =>> Dólar");
            System.out.println(" 5) Dólar =>> Sol Peruano");
            System.out.println(" 6) Sol Peruano =>> Dólar");
            System.out.println(" 7) Salir");
            System.out.println();
            System.out.println("Elija una opción válida");
            System.out.println();

            System.out.println("**************************************");
            var opcion = Integer.valueOf(entrada.nextLine());


            var moneda1 = "";
            var moneda2 = "";


            while (opcion != 7) {

                if (opcion == 1) {
                    System.out.println("Ingrese el monto que deseas convertir: ");
                    var valorMoneda = Double.valueOf(entrada.nextLine());

                    moneda1 = dolar;
                    moneda2 = pesoArgentino;
                    MonedasApi moneda = consulta.buscaMoneda(moneda1, moneda2, valorMoneda);
                    System.out.println("El valor: " + valorMoneda + " [" + moneda.base_code() + "]" + " corresponde al valor final de: " + moneda.conversion_result()
                            + " [" + moneda.target_code() + "]");

                    GeneradorDeArchivo generador = new GeneradorDeArchivo();
                    generador.guardarJson(moneda);

                    System.out.println();
                    System.out.println("Escoja una opción para su conversión: ");
                    System.out.println(" 1) Dólar =>> Peso argentino");
                    System.out.println(" 2) Peso argentino =>> Dólar");
                    System.out.println(" 3) Dólar =>> Real Brasileño");
                    System.out.println(" 4) Real Brasileño =>> Dólar");
                    System.out.println(" 5) Dólar =>> Sol Peruano");
                    System.out.println(" 6) Sol Peruano =>> Dólar");
                    System.out.println(" 7) Salir");
                    System.out.println();
                    System.out.println("Elija una opción válida");
                    opcion = Integer.valueOf(entrada.nextLine());
                } else if (opcion == 2) {
                    System.out.println("Ingrese el monto que deseas convertir: ");
                    var valorMoneda = Integer.valueOf(entrada.nextLine());

                    moneda1 = pesoArgentino;
                    moneda2 = dolar;
                    MonedasApi moneda = consulta.buscaMoneda(moneda1, moneda2, valorMoneda);
                    System.out.println("El valor: " + valorMoneda + " [" + moneda.base_code() + "]" + " corresponde al valor final de: " + moneda.conversion_result()
                            + " [" + moneda.target_code() + "]");

                    GeneradorDeArchivo generador = new GeneradorDeArchivo();
                    generador.guardarJson(moneda);

                    System.out.println();
                    System.out.println("Escoja una opción para su conversión: ");
                    System.out.println(" 1) Dólar =>> Peso argentino");
                    System.out.println(" 2) Peso argentino =>> Dólar");
                    System.out.println(" 3) Dólar =>> Real Brasileño");
                    System.out.println(" 4) Real Brasileño =>> Dólar");
                    System.out.println(" 5) Dólar =>> Sol Peruano");
                    System.out.println(" 6) Sol Peruano =>> Dólar");
                    System.out.println(" 7) Salir");
                    System.out.println();
                    System.out.println("Elija una opción válida");
                    opcion = Integer.valueOf(entrada.nextLine());
                } else if (opcion == 3) {
                    System.out.println("Ingrese el monto que deseas convertir: ");
                    var valorMoneda = Integer.valueOf(entrada.nextLine());

                    moneda1 = dolar;
                    moneda2 = realBrasilero;
                    MonedasApi moneda = consulta.buscaMoneda(moneda1, moneda2, valorMoneda);
                    System.out.println("El valor: " + valorMoneda + " [" + moneda.base_code() + "]" + " corresponde al valor final de: " + moneda.conversion_result()
                            + " [" + moneda.target_code() + "]");

                    GeneradorDeArchivo generador = new GeneradorDeArchivo();
                    generador.guardarJson(moneda);

                    System.out.println();
                    System.out.println("Escoja una opción para su conversión: ");
                    System.out.println(" 1) Dólar =>> Peso argentino");
                    System.out.println(" 2) Peso argentino =>> Dólar");
                    System.out.println(" 3) Dólar =>> Real Brasileño");
                    System.out.println(" 4) Real Brasileño =>> Dólar");
                    System.out.println(" 5) Dólar =>> Sol Peruano");
                    System.out.println(" 6) Sol Peruano =>> Dólar");
                    System.out.println(" 7) Salir");
                    System.out.println();
                    System.out.println("Elija una opción válida");
                    opcion = Integer.valueOf(entrada.nextLine());
                } else if (opcion == 4) {
                    System.out.println("Ingrese el monto que deseas convertir: ");
                    var valorMoneda = Integer.valueOf(entrada.nextLine());

                    moneda1 = realBrasilero;
                    moneda2 = dolar;
                    MonedasApi moneda = consulta.buscaMoneda(moneda1, moneda2, valorMoneda);
                    System.out.println("El valor: " + valorMoneda + " [" + moneda.base_code() + "]" + " corresponde al valor final de: " + moneda.conversion_result()
                            + " [" + moneda.target_code() + "]");

                    GeneradorDeArchivo generador = new GeneradorDeArchivo();
                    generador.guardarJson(moneda);

                    System.out.println();
                    System.out.println("Escoja una opción para su conversión: ");
                    System.out.println(" 1) Dólar =>> Peso argentino");
                    System.out.println(" 2) Peso argentino =>> Dólar");
                    System.out.println(" 3) Dólar =>> Real Brasileño");
                    System.out.println(" 4) Real Brasileño =>> Dólar");
                    System.out.println(" 5) Dólar =>> Sol Peruano");
                    System.out.println(" 6) Sol Peruano =>> Dólar");
                    System.out.println(" 7) Salir");
                    System.out.println();
                    System.out.println("Elija una opción válida");
                    opcion = Integer.valueOf(entrada.nextLine());
                } else if (opcion == 5) {
                    System.out.println("Ingrese el monto que deseas convertir: ");
                    var valorMoneda = Integer.valueOf(entrada.nextLine());

                    moneda1 = dolar;
                    moneda2 = solPeruano;
                    MonedasApi moneda = consulta.buscaMoneda(moneda1, moneda2, valorMoneda);
                    System.out.println("El valor: " + valorMoneda + " [" + moneda.base_code() + "]" + " corresponde al valor final de: " + moneda.conversion_result()
                            + " [" + moneda.target_code() + "]");

                    GeneradorDeArchivo generador = new GeneradorDeArchivo();
                    generador.guardarJson(moneda);

                    System.out.println();
                    System.out.println("Escoja una opción para su conversión: ");
                    System.out.println(" 1) Dólar =>> Peso argentino");
                    System.out.println(" 2) Peso argentino =>> Dólar");
                    System.out.println(" 3) Dólar =>> Real Brasileño");
                    System.out.println(" 4) Real Brasileño =>> Dólar");
                    System.out.println(" 5) Dólar =>> Sol Peruano");
                    System.out.println(" 6) Sol Peruano =>> Dólar");
                    System.out.println(" 7) Salir");
                    System.out.println();
                    System.out.println("Elija una opción válida");
                    opcion = Integer.valueOf(entrada.nextLine());
                } else if (opcion == 6) {
                    System.out.println("Ingrese el monto que deseas convertir: ");
                    var valorMoneda = Integer.valueOf(entrada.nextLine());

                    moneda1 = solPeruano;
                    moneda2 = dolar;
                    MonedasApi moneda = consulta.buscaMoneda(moneda1, moneda2, valorMoneda);
                    System.out.println("El valor: " + valorMoneda + " [" + moneda.base_code() + "]" + " corresponde al valor final de: " + moneda.conversion_result()
                            + " [" + moneda.target_code() + "]");

                    GeneradorDeArchivo generador = new GeneradorDeArchivo();
                    generador.guardarJson(moneda);

                    System.out.println();
                    System.out.println("Escoja una opción para su conversión: ");
                    System.out.println(" 1) Dólar =>> Peso argentino");
                    System.out.println(" 2) Peso argentino =>> Dólar");
                    System.out.println(" 3) Dólar =>> Real Brasileño");
                    System.out.println(" 4) Real Brasileño =>> Dólar");
                    System.out.println(" 5) Dólar =>> Sol Peruano");
                    System.out.println(" 6) Sol Peruano =>> Dólar");
                    System.out.println(" 7) Salir");
                    System.out.println();
                    System.out.println("Elija una opción válida");
                    opcion = Integer.valueOf(entrada.nextLine());
                }

            }

        }catch (Exception e){
            System.out.println("hubo un error: "+e.getMessage());
        }

    }
}
