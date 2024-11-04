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
            char vocal = (char) (i + 'a');
            System.out.print(vocal + " ");
        }
    }

    public void ShowCaracteres6dosFor(int numCaracteres) {
        for (int i = 0; i < (numCaracteres / 2); i++) {
            char vocal = (char) ('a' + (i * 2));
            System.out.print(vocal + " ");
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
            char vocal=(char) ('a' + (i-1));
            String mLetra = Character.toString(vocal);
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

    public void cadenaCaracter2(String nombre){
        int contador=0;
        String nombreMinuscula=nombre.toLowerCase();
        for (int i = 0; i < nombre.length(); i++) {
            if ((nombreMinuscula.charAt(i)=='a')||(nombreMinuscula.charAt(i)=='e')
            ||(nombreMinuscula.charAt(i)=='i')||(nombreMinuscula.charAt(i)=='o')||(nombreMinuscula.charAt(i)=='u')) {
                contador=contador+1;
            }
        }
        System.out.println("Frase= "+nombre);
        System.out.println("Salida: tiene "+(nombre.length()-contador)+" letras");
    }

    public void showCadenaCaracteres1(String frase) {
        int vocales = 0;
        char[] arregloVocales = {'a','e','i','o','u'};
		for (int i = 0; i < frase.length(); i++) {     
            for (int j = 0; j < arregloVocales.length; j++) {
                if (frase.charAt(i) == arregloVocales[j]) {
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
            for (int i = palabraOriginal.length() - 1; i >= 0; i--) {
                char c = palabraOriginal.charAt(i);
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
            for (int i = fraseCaracteres.length - 1; i >= 0; i--) {
                if (fraseCaracteres[i] == 'a' || fraseCaracteres[i] == 'e' || fraseCaracteres[i] == 'i' || fraseCaracteres[i] == 'o' || fraseCaracteres[i] == 'u'){
                    fraseCaracteres[i] = Character.toUpperCase(fraseCaracteres[i]);
                    System.out.print(fraseCaracteres[i]);
                }
                else
                    System.out.print(fraseCaracteres[i]);
            }
        }

        public void cadenaCaracter5(String frase){
            char fraseNueva []=frase.toCharArray();
            for (int i = fraseNueva.length-1; 0<=i; i--) {
                if (fraseNueva[i]=='a'||fraseNueva[i]=='e'||fraseNueva[i]=='i'||fraseNueva[i]=='o'||fraseNueva[i]=='u') {
                    fraseNueva[i]=Character.toUpperCase(fraseNueva[i]);
                    System.out.print(fraseNueva[i]);
                } else {
                    System.out.print(fraseNueva[i]);
                }
                
            }
        }

        public void cadenaCaracter6(String frase){
            char fraseNueva []=frase.toCharArray();
            for (int i =fraseNueva.length-1 ; 0<=i; i--) {
                if ((fraseNueva[i]!='a')||(fraseNueva[i]!='e')||(fraseNueva[i]!='i')||(fraseNueva[i]!='o')||(fraseNueva[i]!='u')) {
                    fraseNueva[i]=Character.toUpperCase(fraseNueva[i]);
                    System.out.print(fraseNueva[i]);
                } else {
                    System.out.print(fraseNueva[i]);
                }
            }
        }

    }