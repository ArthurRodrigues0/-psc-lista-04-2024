public class Atv6 {
    public static void main(String[] args) {
        int contador = 1;
        int quebra = 0;
        
        while(contador <= 20) {

            System.out.print(contador + " ");

            ++contador;
            quebra++;
            if (quebra == 20) {
                System.out.println("");

                quebra = 0;
    }
}
    }
}