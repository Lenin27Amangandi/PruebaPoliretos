package leninPoliretos;

import java.util.Scanner;

public class grafos {
    final String alfabetoGrafo6 = "a-c-e-f-h-i-l-o-r-s-(-)- -";
    final int   er = -1,
                esp = 100,
                     //  a   c   e,  f,   h,  i,  l,   o,  r,  s,  (,  ), esp.
            mtG6[][] =  {
                    {   er, er, 13,  1,  er, 11, er,  er, er, er, er, er, er}// q0
                    , { er, er, er, er,  er, er, er,   2, er, er, er, er, er}// q1
                    , { er, er, er, er,  er, er, er,  er,  3, er, er, er, er}// q2
                    , { er, er,  7, er,  er, er, er,  er, er, er,  4, er,  6}// q3
                    , { er, er, er, er,  er, er, er,  er, er, er, er,  5, er}// q4
                    , { er, er, er, er,  er, er, er,  er, er, er, er, er, esp}// q5
                    , { er, er, er, er,  er, er, er,  er, er, er,  4, er, er}// q6
                    , {  8, er, er, er,  er, er, er,  er, er, er, er, er, er}// q7
                    , { er, 9,  er, er,  er, er, er,  er, er, er, er, er, er}// q8
                    , { er, er, er, er,  10, er, er,  er, er, er, er, er, er}// q9
                    , { er, er, er, er,  er, er, er,  er, er, er,  4, er,  6}// q10
                    , { er, er, er, 12,  er, er, er,  er, er, er, er, er, er}// q11
                    , { er, er, 13, er,  er, er, er,  er, er, er,  4, er,  6}// q12
                    , { er, er, er, er,  er, er, 14,  er, er, er, er, er, er}// q13
                    , { er, er, er, er,  er, er, er,  er, er, 15, er, er, er}// q14
                    , { er, er, 16, er,  er, er, er,  er, er, er, er, er, er}// q15
                    , { er, er, er, er,  er, er, er,  er, er, er, 17, er, 19}// q16
                    , { er, er, er, er,  er, er, er,  er, er, er, er, 18, er}// q17
                    , { er, er, er, er,  er, er, er,  er, er, er, er, er, esp}// q18
                    , { er, er, er, er,  er, er, er,  er, er, er, er, 17, er}// q19
            };


    @SuppressWarnings("resource")
    private int getIndexAlfabetoG6(String moneda) {
        Scanner scAlfa = new Scanner(moneda).useDelimiter("-");
        for (int indexAlfa = 0; scAlfa.hasNext(); indexAlfa++)
            if (moneda.equals(scAlfa.next()))
                return indexAlfa;
        return -1;
    }

    @SuppressWarnings("resource")
        public void g1_crearAutomata6() {
            System.out.print("\n- Automata 06\n");
            System.out.println("Ingrese un bucle con sus separando sus letras por un guion y un -espacio al final:");
            System.out.println("ejm1: f-o-r-(-)- ");
            System.out.println("ejm2: i-f- -(-)- ");
            System.out.println("ejm3: i-f-e-l-s-e-(-)- ");
            System.out.println("ejm4: e-l-s-e-(-)- ");
            System.out.println("ejm4: f-o-r-e-a-c-h-(-)- ");
            Scanner sc = new Scanner(System.in);
            String lectura = sc.nextLine();
            int q = 0;
            Scanner w = new Scanner(alfabetoGrafo6).useDelimiter("-");
            for(int indexAlfa = 0; w.hasNext(); ){
                indexAlfa = getIndexAlfabetoG6(w.next());
                if(indexAlfa < 0 || mtG6[q][indexAlfa] == er)
                    break;
                q = mtG6[q][indexAlfa];
            }
            switch(q){
                case esp: System.out.println("Cadena Valida"); break;
                default: System.out.println("No válido"); break;
            }
            System.out.println();
        }
}
