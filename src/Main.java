//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] dizi = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double bolumToplam = 0.0;
        double harmonikOrtalama = 0.0;
        for (int i = 0; i < dizi.length; i++) {
            bolumToplam += (double) 1 / dizi[i];
        }

        harmonikOrtalama = dizi.length / bolumToplam;

        System.out.println("Harmonik Ortalama : " + harmonikOrtalama);

    }
}