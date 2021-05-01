package fr.buildthewheel.ls;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez une commande\nls\na\nl\nla\nmonRep\nR\n");
        String command = input.nextLine();
        input.close();

        String[] pathnames;
        File f = new File(".");
        pathnames = f.list();

        String[] monRepPath;
        File monRep = new File("/Users/one.b/MyRepo/buildthewheel-ls/src/main/java/fr/monRepertoire");
        monRepPath = monRep.list();

        switch (command) {
            case "ls":
                for (String pathname : pathnames) {
                    System.out.println(pathname);
                }
                break;
            case "a":
                System.out.println("commande a");
                break;
            case "l":
                System.out.println("commande ");
                break;
            case "la":
                System.out.println("commande la");
                break;
            case "monRep":
                for (String file : monRepPath) {
                    System.out.println(file);
                }
                break;
            case "R":
                System.out.println("R");
                break;
            default:
                System.out.println("mauvaise commande");
        }

    }
}
