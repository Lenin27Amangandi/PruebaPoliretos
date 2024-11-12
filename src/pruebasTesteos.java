public class pruebasTesteos {

    public void ShowArray4(String nombre, String apellido) {
        // int tamañoMatriz = Math.max(nombre.length(), apellido.length());
        int tamañoMatriz = Math.max(nombre.length(), apellido.length()) + 1;
        char[][] matriz = new char[tamañoMatriz][tamañoMatriz];
        for (int fila = 0; fila < tamañoMatriz; fila++) {
            for (int columna = 0; columna < tamañoMatriz; columna++) {
                matriz[fila][columna] = ' ';
            }
        }
        for (int fila = 0; fila < nombre.length(); fila++) {
            matriz[fila][fila] = nombre.charAt(fila);
        }
        for (int fila = 0; fila < apellido.length(); fila++) {
            matriz[fila][tamañoMatriz - fila - 1] = apellido.charAt(fila);
        }
        for (int fila = 0; fila < tamañoMatriz; fila++) {
            for (int columna = 0; columna < tamañoMatriz; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println();

        }
    }

    public void serie12(Integer nivel) {
        System.out.println("Serie numerica 12");
        Integer num1 = 0, num2 = 1, num3;
        for (int i = 0; i < nivel; i++) {
            System.out.print(num1 + " ");
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        System.out.println();
    }

    public void serie1(Integer nivel) {
        System.out.println("Serie numerica 1");
        Integer num1 = 0, num2 = 1, num3;
        for (int i = 0; i < nivel; i++) {
            if (i == 0) {
                System.out.print(num1 + " ");
            } else if (i == 1) {
                System.out.print(num2 + " ");
            } else {
                num3 = num1 + num2;
                System.out.print(num3 + " ");
                num1 = num2;
                num2 = num3;
            }
        }
        System.out.println();
    }

    public void serie2(Integer nivel) {
        System.out.println("Serie numerica 2");
        for (int i = 1; i <= nivel; i++)
            System.out.print((i % 2 == 0) ? "0" + " " : i + " ");
        System.out.println();
    }

    public void serie3(int nivel) {
        System.out.println("Serie numerica 3");
        int num1 = 0, num2 = 1, impar = 1, num3;
        for (int i = 1; i <= nivel; i++) {
            if (i == 1) {
                System.out.print(num1 + "/" + impar + " ");
            } else if (i == 2) {
                System.out.print(num2 + "/" + (impar + 2) + " ");
                impar = impar + 2;
            } else {
                impar = impar + 2;
                num3 = num1 + num2;
                System.out.print(num3 + "/" + impar + " ");
                num1 = num2;
                num2 = num3;
            }
        }
        System.out.println();
    }

    public void imprimirEscalera(Integer nivel) {
        for (int i = 1; i <= nivel; i++) {
            if (i % 2 == 0) {
                System.out.print(" ".repeat((i)) + "|");
            } else {
                System.out.print(" ".repeat(i - 1) + "_");
            }
            System.out.println();
        }
    }

    public void imprimirFiguraAdaptada(int nroNiveles) {
        for (int i = 1; i <= nroNiveles; i++) {
            int espacios = i - 1;
            System.out.print("  ".repeat(espacios));
            if (i % 2 != 0) {
                System.out.print("-".repeat(3)); // Tres guiones
            } else {
                System.out.print(" |");
            }
            System.out.println();
        }
    }

    public void imprimirFigura10(int nroNiveles) {
        for (int i = 1; i <= nroNiveles; i++) {
            int espacios = i - 1;
            System.out.print("  ".repeat(espacios));
            if (i % 2 != 0) {
                if (i % 4 == 1) {
                    System.out.print("_+_");
                } else {
                    System.out.print("_-_");
                }
            } else {
                System.out.print(" |");
            }
            System.out.println();
        }
    }

    public void imprimirEscaleraInvertida(int nroNiveles) {
        for (int i = nroNiveles, j = 1; i >= 1 && j <= nroNiveles; i--, j++) {
            int espacios = i - 1;
            System.out.print("  ".repeat(espacios));
            if (j % 2 != 0) {
                System.out.print("-".repeat(3));
            } else {
                System.out.print(" |");
            }
            System.out.println();
        }
    }


    

    // desde aqui va el loading

    public void desplazarFigura() {
        // Número de espacios para desplazar la figura
        int desplazamiento = 0;
        String[] figura = {
                "   \\|||/",
                "  ( > < )",
                "ooO-(_)-Ooo"
        };

        int longitudPantalla = 30; // Ajusta según la longitud de la pantalla o espacio disponible

        // Moverse de izquierda a derecha
        while (desplazamiento <= longitudPantalla) {
            // Limpiar la consola
            System.out.print("\033[H\033[2J");
            System.out.flush();

            // Imprimir espacios para el desplazamiento horizontal
            for (int i = 0; i < desplazamiento; i++) {
                System.out.print(" ");
            }

            // Imprimir la figura
            for (int i = 0; i < figura.length; i++) {
                // Imprimir espacios para el desplazamiento vertical
                if (i > 0) {
                    for (int j = 0; j < desplazamiento; j++) {
                        System.out.print(" ");
                    }
                }
                System.out.println(figura[i]);
            }

            // Pausa para simular animación
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Retroceder al punto de partida (usando retorno de carro)
            for (int i = 0; i <= desplazamiento; i++) {
                System.out.print("\033[H\033[1A");
            }

            // Incrementar el desplazamiento
            desplazamiento++;
        }

        // Regresar de derecha a izquierda
        while (desplazamiento > 0) {
            // Limpiar la consola
            System.out.print("\033[H\033[2J");
            System.out.flush();

            // Imprimir espacios para el desplazamiento horizontal
            for (int i = 0; i < desplazamiento; i++) {
                System.out.print(" ");
            }

            // Imprimir la figura
            for (int i = 0; i < figura.length; i++) {
                // Imprimir espacios para el desplazamiento vertical
                if (i > 0) {
                    for (int j = 0; j < desplazamiento; j++) {
                        System.out.print(" ");
                    }
                }
                System.out.println(figura[i]);
            }

            // Pausa para simular animación
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Retroceder al punto de partida (usando retorno de carro)
            for (int i = 0; i <= desplazamiento; i++) {
                System.out.print("\033[H\033[1A");
            }
            // Decrementar el desplazamiento
            desplazamiento--;
        }
    }

}
