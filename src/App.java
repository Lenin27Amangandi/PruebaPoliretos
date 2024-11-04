public class App {
    public static void main(String[] args) throws Exception {
        pruebasTesteos proof = new pruebasTesteos();
        matrizPrueba ma = new matrizPrueba();
        lenin ln = new lenin();
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
            // ln.g1_crearFigura5(10,'*');
            ln.g1_crearFigura12(10,'*');
            ln.g1_crearFigura122(10);
            ln.g1_crearFigura13(10);
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
