package demo;

public class Main {
    /**
     * transforma un array de int in string
     * @param array - de int
     * @return string
     */
    public static String array_to_string(int[] array){
        //transformam array-ul de int intr-un array cu aceleasi valori, dar de tip string
        String[] new_array = new String[array.length];
        for (int i = 0; i < array.length; i++){
            new_array[i] = String.valueOf(array[i]);
        }

        //returnam string-ul obtinut din array-ul de string-uri
        return String.join("", new_array);
    }

    /**
     * transforma un string intr-un array de int
     * @param string
     * @return array de int
     */
    public static int[] string_to_array(String string){
        //obtinem un array dintr-un string dat
        int[] result = new int[string.length()];
        for (int i = 0; i < string.length(); i++){
            //pe fiecare pozitie din array, va fi o cifra din numar
            result[i] = Character.getNumericValue(string.charAt(i));
        }

        return result;
    }

    /**
     *
     * @param a - array de int
     * @param b - array de int
     * @return suma - array de int
     */
    public static int[] summe(int[] a, int[] b){
        //transformam numerele sub forma de array in long si facem suma
        long a1 = Long.parseLong(array_to_string(a));
        long a2 = Long.parseLong(array_to_string(b));
        long sum = a1 + a2;

        String res = String.valueOf(sum);

        //la final returnam rezultatul tot sub forma de array
        return string_to_array(res);
    }

    /**
     *
     * @param a - array de int
     * @param b - array de int
     * @return diferenta - array de int
     */
    public static int[] dif(int[] a, int[] b){
        //transformam numerele sub forma de array in long si facem diferenta
        long a1 = Long.parseLong(array_to_string(a));
        long a2 = Long.parseLong(array_to_string(b));
        long dif = a1 - a2;

        String res = String.valueOf(dif);

        //la final returnam rezultatul tot sub forma de array
        return string_to_array(res);
    }

    /**
     *
     * @param a - array de int
     * @param b - int
     * @return rezultatul inmultirii - array de int
     */
    public static int[] mul(int[] a, int b){
        long a1 = Long.parseLong(array_to_string(a));
        long mul = a1 * b;

        String res = String.valueOf(mul);

        return string_to_array(res);
    }

    /**
     *
     * @param a - array de int
     * @param b - int
     * @return rezultatul impartirii - array de int
     */
    public static int[] div(int[] a, int b){
        long a1 = Long.parseLong(array_to_string(a));
        long div = a1 / b;

        String res = String.valueOf(div);

        return string_to_array(res);
    }

    public static void main(String[] args) {
        int[] n1 = new int[]{1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] n2 = new int[]{8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] sum = summe(n1, n2);

        System.out.println("\nSumme: ");
        for (int j : sum) {
            System.out.print(j);
        }

        int[] n3 = new int[]{8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] n4 = new int[]{5, 4, 0, 0, 0, 0, 0, 0, 0};
        int[] dif = dif(n3, n4);

        System.out.println("\nDifferenz: ");
        for (int j : dif) {
            System.out.print(j);
        }

        int[] n5 = new int[]{2, 3, 6, 0, 0, 0, 0, 0, 0};
        int n6 = 2;
        int[] mul = mul(n5, n6);

        System.out.println("\nMultiplikation: ");
        for (int j : mul) {
            System.out.print(j);
        }

        int[] div = div(n5, n6);

        System.out.println("\nDivision: ");
        for (int j : div) {
            System.out.print(j);
        }

        System.out.println("\n");
    }
}
