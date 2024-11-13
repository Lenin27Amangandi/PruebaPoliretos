import java.util.Scanner;

import leninPoliretos.arraysL;
import leninPoliretos.figurasL;
import leninPoliretos.grafos;
import leninPoliretos.myGraf;
import leninPoliretos.recursionL;
import leninPoliretos.sCaracterL;
import leninPoliretos.sNumericasL;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        pruebasTesteos proof = new pruebasTesteos();
        lenin ln = new lenin();
        loadingsRepaso repaso = new loadingsRepaso();
        ultimoRepaso last = new ultimoRepaso();
        theLatDance lDance = new theLatDance();

        sNumericasL sNum = new sNumericasL();
        sCaracterL sCar = new sCaracterL();
        figurasL figL = new figurasL();
        loadingL loading = new loadingL();
        sCadenasCaracter sCadena = new sCadenasCaracter();
        arraysL arrayss = new arraysL();
        recursionL recursion = new recursionL();
        oneOportunit one = new oneOportunit();
        grafos grafosAtonomas = new grafos();
        myGraf myGraf = new myGraf();

        try {

            // grafosAtonomas.g1_crearAutomata6();
            myGraf.g1_crearAutomata6();
            // sNum.serie1(7);
            // sNum.serie1M(7);
            // sNum.serie3(7);
            // sNum.serie4(7);
            // sNum.serie5(5);
            // sNum.serNum6(7);
            // sNum.serNum7(9);

            // sCar.serieCaracter4(5);
            // sCar.serieCaracter5(5);
            // sCar.sCaracter6(5);
            // sCar.sCaracter6dos(5);
            // sCar.sCaracter7(5);
            // sCar.serieCaracter8(5);

            // figL.figura2(5);
            // figL.figura3Lenin(5);
            // figL.figura4Lenin(5);
            // figL.figura5(5, '*');
            // figL.figura6Lenin(5);
            // figL.imprimirFigura7(5);
            // figL.figura8(5);
            // figL.g1_crearFigura9(5);
            // figL.figura12Lenin(5);
            // figL.figura13Lenin(5);
            // figL.figura16(5);
            // figL.figura17(5);

            // sCadena.cadenaCaracter1("MurcielagoRapido");
            // sCadena.cadenaCaracter2("JinxNeverGiveUp");
            // sCadena.cadenaCaracter3("Aristotedrose", "o");
            // sCadena.cadenaCaracter4("GlassinSkyTheLine", "s");
            // sCadena.cadenaCaracter5("aristotedrose");
            // sCadena.cadenaCaracter6("darkintheSoul");

            // arrayss.array2(7, "*");
            // arrayss.array3("Xander Half");
            // arrayss.ShowArray4("Lenin", "Amangandi");
            // arrayss.array5Lenin();

            // loading.loading1();
            // loading.loading2('*');
            // loading.loading3('=');
            // loading.loading4();
            // loading.loading5();
            // loading.loading7();
            // loading.loading8("LeninAmangandi");
            // loading.loading10("Programacion II POO");
            // loading.loading11(50);
            // loading.loading11D();

            // // loading.generarBarrasDeSonido(15, 7);

            // System.out.println("El factorial correspontiente es: " +
            // recursion.factorial(5));
            // System.out.println("La multiplicacion correspontiente es: " +
            // recursion.multiplicacion(15, 4));
            // System.out.println("La suma correspontiente es: " + recursion.suma(15, 4));

            // lDance.mostrarBarraProgreso();
            // lDance.mostrarBarraProgreso2222();
            // lDance.mostrarBarraDesplazamiento();
            // proof.imprimirEscaleraInvertida(15);
            // proof.ShowArray4("lenin", "amangandi");

            // lDance.mostrarBarraDesplazamiento14();
            // lDance.mostrarBarraProgreso142();
            System.out.println();
            // ln.ShowCaracteres6For(4);
            // ln.ShowCaracteres6dosFor(8);
            // System.out.println();
            // ln.showCaracter7(5);

            // ln.g1_crearFigura4(15,'*' );
            // ln.g1_crearFiguraCuatros(15,'*');
            // ln.g1_crearFigura12(15,'*');
            // ln.showFigura15For(15);
            // ln.g1_crearFigura16(15);
            // System.out.println("Diguite la frase1: ");
            // String frase = sc.nextLine();
            // ln.g1_crearCadena1(frase);
            // ln.showLoading2('*');
            // ln.g1_crearCadena6("ballena");
            // ln.showCadenaCaracteres7("mañanamojamostodaslasjarjos");
            // ln.g1_crearFigura114(8);
            // ln.g1_crearFigura15(8);
            // ln.g1_crearSerie5(15);
            // ln.g1_crearSerieCaracter8(15);

            // String[] stringArray = { "Valor1", "Valor2", "Valor3", "Valor4" };
            // int[] intArray = { 15, 55, 75, 45 };
            // ln.showArrays1(stringArray, intArray);
            // ln.showArrays11(stringArray, intArray);

            // repaso.loadingPrueba();
            // repaso.showLoading7();
            // repaso.SimulacionMovimiento();
            // repaso.SimulacionMovimiento('+');
            // repaso.loading5();
            // last.moverFigura();
            // last.moverFigura2();
            // last.moverFiguraHorizontal();
            // last.moverFiguraConMarco();
            // last.mostrarNombreConProgreso();
            // last.mostrarNombreConProgreso2();
            // last.mostrarNombreConProgreso3();
            // last.mostrarNombreConProgreso4();
            // proof.imprimirFigura15(16);

            String nombre[] = { "lenin", "amangandi", "llumiguano", "alexander" };
            int porcentajes[] = { 15, 75, 55, 25 };
            // repaso.loadingMultiple(nombre, porcentajes);
            // repaso.loadingMultiple3(nombre, porcentajes);
            // repaso.generarMatrizAleatoria(nombre);
            // repaso.mostrarBarra("Liam", "Levy", "Reiss", "Ackerman", 55, 25, 65, 95);

            // proof.desplazarFigura();

        } catch (Exception e) {
            System.out.println("No se pudo");
        }
    }
}
