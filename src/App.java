import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        pruebasTesteos proof = new pruebasTesteos();
        matrizPrueba ma = new matrizPrueba();
        lenin ln = new lenin();

        loadingsRepaso repaso = new loadingsRepaso();

        Scanner sc = new Scanner(System.in);
        // proof.ShowArray4("lenin", "amangandi");
        // proof.serie12(10);
        // proof.serie1(10);
        // proof.showFigura7For(10);

        try {

            // proof.imprimirEscalera(10);
            // proof.imprimirFiguraAdaptada(10);
            // proof.imprimirEscaleraInvertida(10);
            // proof.desplazarFigura();
            // ma.ShowArray5For("Lenin,Liam");
            // proof.Array5();
            // proof.serie3(10);
            System.out.println();
            // ln.ShowCaracteres6For(4);

            // ln.ShowCaracteres6dosFor(8);
            // System.out.println();
            // ln.showCaracter7(5);

            // ln.serNum6(7);

            // ln.serNum7(9);
            // ln.serie4(8);
            // ln.cadenaCaracter1("MurcielagoRapido");
            // ln.cadenaCaracter2("JinxNeverGiveUp");
            // ln.cadenaCaracter3("Amangandi", "a");
            // ln.cadenaCaracter4("GlassinSkyTheLine", "s");
            // ln.cadenaCaracter5("Aristotedrose");
            // ln.showCadenaCaracteres5("Aristotedrose");
            // ln.cadenaCaracter6("DarkInTheSoul");
            // ln.g1_crearFigura4(10,'*' );
            // ln.g1_crearFiguraCuatros(10,'*');
            // ln.g1_crearFigura5(10, '*');
            // ln.g1_crearFigura12(10,'*');
            // ln.g1_crearFigura122(10);
            // ln.g1_crearFigura13(10);
            // ln.showFigura15For(10);
            // ln.g1_crearFigura16(10);
            // System.out.println("Diguite la frase1: ");
            // String frase = sc.nextLine();
            // ln.g1_crearCadena1(frase);
            // ln.showLoading2('*');
            // ln.g1_crearCadena6("ballena");
            // ln.showCadenaCaracteres7("mañanamojamostodaslasjarjos");
            // ln.g1_crearFigura114(8);
            // ln.g1_crearFigura15(8);
            // ln.g1_crearFigura16Ac(8);
            // ln.g1_crearFigura17(8);
            // ln.g1_crearSerie5(10);
            // ln.g1_crearSerieCaracter8(10);

            // String[] stringArray = { "Valor1", "Valor2", "Valor3", "Valor4" };
            // int[] intArray = { 100, 50, 75, 40 };
            // ln.showArrays1(stringArray, intArray);
            // ln.showArrays11(stringArray, intArray);

            // repaso.loading2();
            // repaso.loadingPrueba();
            // repaso.showLoading7();
            // repaso.SimulacionMovimiento();
            // repaso.SimulacionMovimiento('+');
            // repaso.BarraCarga2();
            // repaso.loading1();
            // repaso.loading2('*');
            // repaso.loading3('=');
            // repaso.loading4();
            // repaso.loading5();
            // repaso.loading5Dinamico();
            // repaso.loading8("LiamAckermanReiss");
            // repaso.loading10("ArchivoAprobarLosPoliretos.pdf");
            ultimoRepaso last=new ultimoRepaso();
            // last.moverFigura();
            // last.moverFigura2();
            // last.moverFiguraHorizontal();
            // last.moverFiguraConMarco();
            last.mostrarNombreConProgreso();
            last.mostrarNombreConProgreso2();
            last.mostrarNombreConProgreso3();
            last.mostrarNombreConProgreso4();


        } catch (Exception e) {
            System.out.println("No se pudo");
        }
        // proof.serie2(10);

        // String nombre = "Liam", apellido = "Ackerman";
        // int tamñanoMatriz = Math.max(nombre.length(), apellido.length()+1);
        // char[][] matriz = new char[tamñanoMatriz][tamñanoMatriz];
        // for (int i = 0; i < tamñanoMatriz; i++) {
        // for (int j = 0; j < matriz.length; j++) {
        // matriz[i][j] = '.';
        // }
        // }
        // for (int fila = 0; fila < tamñanoMatriz; fila++) {
        // if (fila < nombre.length()) {
        // matriz[fila][fila] = nombre.charAt(fila);
        // }
        // if (fila < apellido.length()) {
        // matriz[fila][tamñanoMatriz - fila - 1] = apellido.charAt(fila);
        // }
        // }
        // for (int i = 0; i < matriz.length; i++) {
        // for (int j = 0; j < matriz.length; j++) {
        // System.out.print(matriz[i][j] + " ");
        // }
        // System.out.println();
        // }
    }

}
