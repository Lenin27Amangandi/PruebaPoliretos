public class lenin {
    public void serie3(int nivel) {
        System.out.println("Serie numerica 3");
        int num1 = 0, num2 = 1, par = 1, num3;
        for (int fila = 1; fila <= nivel; fila++) {
            if (fila == 1) {
                System.out.print(num1 + "/" + par + " ");
            } else if (fila == 2) {
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
        for (int fila = 0; fila < numCaracteres; fila++) {
            char caracter = (char) (fila + 'a');
            System.out.print(caracter + " ");
        }
    }

    public void ShowCaracteres6dosFor(int numCaracteres) {
        for (int fila = 0; fila < (numCaracteres / 2); fila++) {
            char vocal = (char) ('a' + (fila * 2));
            System.out.print(vocal + " ");
            System.out.print((fila % 2 == 0)?"+ ":"- ");
            // if (fila % 2 == 0) {
            //     System.out.print("+ ");
            // } else {
            //     System.out.print("- ");
            // }
        }
    }

    public void showCaracter7(int numCaracteres) {
        for (int fila = 1; fila <= numCaracteres; fila++) {
            char vocal=(char) ('a' + (fila-1));
            String mLetra = Character.toString(vocal);
            // System.out.print(2*fila+" ");
            System.out.print(mLetra.repeat(fila*2)+" ");
        }
    }

    public void serNum6(int nivel){
        for (int fila = 1; fila <= nivel; fila++) {
            System.out.print(fila*fila+" ");
        }
    }

    public void serNum7(int nivel){
        int contador=4,contador2=1;
        for (int fila = 1; fila <= nivel; fila++) {
            if (fila%2==0) {
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
        for (int fila = 1; fila <= nivel; fila++) {
            if (fila == 1) {
                System.out.print(num1 + "/" + par + " ");
            } else if (fila == 2) {
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
        for (int fila = 0; fila < nombre.length(); fila++) {
            if ((nombreMinuscula.charAt(fila)=='a')||(nombreMinuscula.charAt(fila)=='e')
            ||(nombreMinuscula.charAt(fila)=='i')||(nombreMinuscula.charAt(fila)=='o')||(nombreMinuscula.charAt(fila)=='u')) {
                contador=contador+1;
            }
        }
        System.out.println("Frase= "+nombre);
        System.out.println("Salida: tiene "+contador+" vocales");
    }

    public void cadenaCaracter2(String nombre){
        int contador=0;
        String nombreMinuscula=nombre.toLowerCase();
        for (int fila = 0; fila < nombre.length(); fila++) {
            if ((nombreMinuscula.charAt(fila)=='a')||(nombreMinuscula.charAt(fila)=='e')
            ||(nombreMinuscula.charAt(fila)=='i')||(nombreMinuscula.charAt(fila)=='o')||(nombreMinuscula.charAt(fila)=='u')) {
                contador=contador+1;
            }
        }
        System.out.println("Frase= "+nombre);
        System.out.println("Salida: tiene "+(nombre.length()-contador)+" letras");
    }

    public void showCadenaCaracteres1(String frase) {
        int vocales = 0;
        char[] arregloVocales = {'a','e','i','o','u'};
		for (int fila = 0; fila < frase.length(); fila++) {     
            for (int j = 0; j < arregloVocales.length; j++) {
                if (frase.charAt(fila) == arregloVocales[j]) {
                    vocales++;  
                }
            }
		}
	    System.out.println("Hay: " + vocales + " vocales");
        System.out.println(" ");
    }

    public void cadenaCaracter3(String nombre,String vocal){
        String nombreMinuscula=nombre.toLowerCase();
        String palabraSinVocal=nombreMinuscula.replaceAll(vocal, " ");
        System.out.println("Palabra inicial: "+nombre);
        System.out.println("vocal: "+vocal);
        System.out.println("salida: "+palabraSinVocal);
    }

    public void cadenaCaracter4(String frase,String letra ){
        String nombreMinuscula=frase.toLowerCase();
        String palabraSinVocal=nombreMinuscula.replaceAll(letra, " ");
        System.out.println("Palabra inicial: "+frase);
        System.out.println("vocal: "+letra);
        System.out.println("salida: "+palabraSinVocal);
    }


        public void showCadenaCaracteres5(String palabraOriginal) {
            StringBuilder palabraInvertida = new StringBuilder();
            for (int fila = palabraOriginal.length() - 1; fila >= 0; fila--) {
                char c = palabraOriginal.charAt(fila);
                if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')) {
                    palabraInvertida.append(Character.toUpperCase(c));
                } else {
                    palabraInvertida.append(c);
                }
            }
            System.out.println("Palabra invertida: " + palabraInvertida);
        }


        public void showFrase5For (String frase){
            char [] fraseCaracteres;
            fraseCaracteres = frase.toCharArray();
            System.out.println();
            for (int fila = fraseCaracteres.length - 1; fila >= 0; fila--) {
                if (fraseCaracteres[fila] == 'a' || fraseCaracteres[fila] == 'e' || fraseCaracteres[fila] == 'i' || fraseCaracteres[fila] == 'o' || fraseCaracteres[fila] == 'u'){
                    fraseCaracteres[fila] = Character.toUpperCase(fraseCaracteres[fila]);
                    System.out.print(fraseCaracteres[fila]);
                }
                else
                    System.out.print(fraseCaracteres[fila]);
            }
        }

        public void cadenaCaracter5(String frase){
            char fraseNueva []=frase.toCharArray();
            for (int fila = fraseNueva.length-1; 0<=fila; fila--) {
                if (fraseNueva[fila]=='a'||fraseNueva[fila]=='e'||fraseNueva[fila]=='i'||fraseNueva[fila]=='o'||fraseNueva[fila]=='u') {
                    fraseNueva[fila]=Character.toUpperCase(fraseNueva[fila]);
                    System.out.print(fraseNueva[fila]);
                } else {
                    System.out.print(fraseNueva[fila]);
                }
                
            }
        }

        public void cadenaCaracter6(String frase){
            char fraseNueva []=frase.toCharArray();
            for (int fila =fraseNueva.length-1 ; 0<=fila; fila--) {
                if ((fraseNueva[fila]!='a')||(fraseNueva[fila]!='e')||(fraseNueva[fila]!='i')||(fraseNueva[fila]!='o')||(fraseNueva[fila]!='u')) {
                    fraseNueva[fila]=Character.toUpperCase(fraseNueva[fila]);
                    System.out.print(fraseNueva[fila]);
                } else {
                    System.out.print(fraseNueva[fila]);
                }
            }
        }


        public void showFigura5For(int nroNiveles){
            System.out.println();
            for (int filas = nroNiveles; filas > 0; filas--) {
                for (int espacio = nroNiveles; espacio > filas; espacio--) {
                    System.out.print(" ");
                }
                for (int numCaracter = 0; numCaracter < filas; numCaracter++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

//Sirve para otras cosas que puden se rinteresantes
        public void g1_crearFigura4(int nivel,char caracter){
            for (int fila = 0; fila < nivel; fila++) {
                for (int espacios = nivel; fila <espacios; espacios--) {
                    System.out.print(".");
                }
                for (int numCaracter = 0; numCaracter < fila; numCaracter++) {
                    System.out.print(caracter+" ");
                }
                System.out.println();
            }
        }

    }