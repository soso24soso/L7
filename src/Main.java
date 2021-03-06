import hanoi.Hanoi;
import hanoi.gui.JHanoi;

/**
 * Programme principal
 * permet de résoudre un problème de tour de hanoi de manière visuelle en utilisant soit
 * - une interface graphique avec JHanoi et JHanoiDisplay
 * - la console
 */
public class Main {
    public static void main(String[] args) {
        if (args.length > 0) {
            if (args[0].equals("gui")) {
                new JHanoi();
            } else if (args[0].equals("cmd")) {
                if (args.length > 1) {
                    new Hanoi(Integer.parseInt(args[1])).solve();
                }else {
                    System.out.println("[ERROR] Vous devez indiquer le nombre de disque en argument.");
                }
            }
        }else {
            System.out.println("[ERROR] Argument doit être 'gui' ou 'cmd'");
        }
    }
}
