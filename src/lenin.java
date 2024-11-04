public class lenin {
    public void serie3(int nivel) {
        System.out.println("Serie numerica 3");
        int num1 = 0, num2 = 1, par = 1, num3;
        for (int i = 1; i <= nivel; i++) {
            if (i == 1) {
                System.out.print(num1 + "/" + par + " ");
            } else if (i == 2) {
                System.out.print(num2 + "/" + (par + 2) + " ");
                par = par + 2;
            } else {
                par = par + 2;
                num3 = num1 + num2;
                System.out.print(num3 + "/" + par + " ");
                num1 = num2;
                num2 = num3;
            }
        }
        System.out.println();
    }

    public void ShowCaracteres6For(int numCaracteres) {
        for (int i = 0; i < numCaracteres; i++) {
            char caracter = (char) (i + 'a');
            System.out.print(caracter + " ");
        }
    }

    public void ShowCaracteres6dosFor(int numCaracteres) {
        for (int i = 0; i < (numCaracteres / 2); i++) {
            char caracter = (char) ('a' + (i * 2));
            System.out.print(caracter + " ");
            System.out.print((i % 2 == 0)?"+ ":"- ");
            // if (i % 2 == 0) {
            //     System.out.print("+ ");
            // } else {
            //     System.out.print("- ");
            // }
        }
    }

    public void showCaracter7(int numCaracteres) {
        for (int i = 1; i <= numCaracteres; i++) {
            char caracter=(char) ('a' + (i-1));
            String mLetra = Character.toString(caracter);
            // System.out.print(2*i+" ");
            System.out.print(mLetra.repeat(i*2)+" ");
        }
    }

    public void serNum6(int nivel){
        for (int i = 1; i <= nivel; i++) {
            System.out.print(i*i+" ");
        }
    }

    public void serNum7(int nivel){
        int contador=4,contador2=1;
        for (int i = 1; i <= nivel; i++) {
            if (i%2==0) {
                System.out.print(contador+" ");
                contador=contador+6;
            } else {
                System.out.print(contador2+" ");
                contador2=contador2+6;
            }
        }
    }


    public void serie4(int nivel) {
        System.out.println("Serie numerica 4");
        int num1 = 0, num2 = 1, par = 2, num3;
        for (int i = 1; i <= nivel; i++) {
            if (i == 1) {
                System.out.print(num1 + "/" + par + " ");
            } else if (i == 2) {
                System.out.print(num2 + "/" + (par + 2) + " ");
                par = par + 2;
            } else {
                par = par + 2;
                num3 = num1 + num2;
                System.out.print(num3 + "/" + par + " ");
                num1 = num2;
                num2 = num3;
            }
        }
        System.out.println();
    }

    public void cadenaCaracter1(String nombre){
        int contador=0;
        String nombreMinuscula=nombre.toLowerCase();
        for (int i = 0; i < nombre.length(); i++) {
            if ((nombreMinuscula.charAt(i)=='a')||(nombreMinuscula.charAt(i)=='e')
            ||(nombreMinuscula.charAt(i)=='i')||(nombreMinuscula.charAt(i)=='o')||(nombreMinuscula.charAt(i)=='u')) {
                contador=contador+1;
            }
        }
        System.out.println("Frase= "+nombre);
        System.out.println("Salida: tiene "+contador+" vocales");
    }


}
