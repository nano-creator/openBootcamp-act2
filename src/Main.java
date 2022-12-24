public class Main {
    public static void main(String[] args) {
        String en = "al finalizar la ejecución el valor de la variable es: ";
        //if
        System.out.println("*****if*****");
        int numeroIf = 3;
        if (numeroIf <= 0){
            if (numeroIf < 0){
                System.out.println("el valor de la variable es negativo\n");
            }else{
                System.out.println("el valor de la variable es 0\n");
            }
        }else {
            System.out.println("el valor de la variable es positivo\n");
        }
        //while
        System.out.println("*****while*****");
        int numeroWhile = 0;
        while (numeroWhile <= 3) {
            numeroWhile = numeroWhile +1;
            System.out.println(numeroWhile);
        }
        System.out.println(en + numeroWhile + "\n");

        //do while
        System.out.println("*****do while*****");
        int numeroDoWhile = 3;
        do {
            numeroDoWhile = numeroDoWhile +1;
            System.out.println(numeroDoWhile);
        } while (numeroDoWhile <= 3);
        System.out.println(en + numeroWhile + "\n");

        //for
        System.out.println("*****for*****");
        int numeroFor;
        for(numeroFor = 0; numeroFor <= 3;numeroFor = numeroFor +1){
            System.out.println(numeroFor);
        }
        System.out.println(en + numeroFor +"\n" );
        
        System.out.println("*****switch*****");

        //Switch case
        var estacion = "verano";
        switch (estacion) {
            case "verano":
                System.out.println("estamos en verano");
                break;
            case "otoño":
                System.out.println("estamos en otoño");
                break;
            case "invierno":
                System.out.println("estamos en invierno");
                break;
            case "primavera":
                System.out.println("estamos en primavera");
                break;
        }
    }
}

/*
        int list[] = new int[]{3,1,8,9,2};
        int temp;
        for(int i = 1; i<list.length;i++){
            for (int j = 0; j<list.length-1; j++){
                if (list[j] > list[j+1]){
                    temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(list));
 * for (int i = 0; i < list.length; i++) {
            System.out.println("enter car in " + i);
            list[i] = get.nextLine();

        }
        System.out.println(Arrays.deepToString(list));
                int lon = list.length-1;
        
        for(int i=0; i<=lon;i++){
            System.out.printf("ingresa un numero en el indice %d: ", i);
            list[i] = get.nextInt();
        }
        System.out.println(Arrays.toString(list));
*/
//System.out.println(Arrays.toString(list));