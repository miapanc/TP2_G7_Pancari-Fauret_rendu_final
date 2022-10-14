//-----------TP2------------
//Auteur : Pancari-Fauret Giulietta
//Date : 7 octobre 2022

//ATTENTION : Pensez aux accolades

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //discriminant();
        //parite();
        //max();
        //min();
        //egaliteStr();
        //factorielle();
        //countdown();
        //carres();
        //tableMultiplication();
        //division();
        //regle();
        nombrePremier();

    }

    public static void discriminant() {
        Scanner scanner = null;
        scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();
        float delta = (float) (Math.pow(b, 2) - 4 * a * c);
        if (delta < 0) {
            System.out.println("Le discriminant est négatif, on a donc : ");
            System.out.println("x1 = (-" + b + "+ i racine de -" + delta + ")/2*" + a + " et x2 = (-" + b + "- i racine de -" + delta + ")/2*" + a);
        }
        if (delta==0) {
            float racine = (float) ((-b)/(2*a));
            System.out.println("Ce polynome a pour racine double x = " + racine);
        }
        if (delta > 0) {
            float racine1 = (float) (((-b)+Math.sqrt(delta))/(2*a));
            float racine2 = (float) (((-b)-Math.sqrt(delta))/(2*a));
            System.out.println("Ce polynome a deux racines : x1 = " + racine1 + " et x2 = " + racine2);
        }
    }

    public static void parite() {
        Scanner scanner = new Scanner(System.in); //toujours mettre ça pour dire que l'objet existe
        System.out.println("Veuillez rentrer un entier :");
        int unNombre = scanner.nextInt();
        if (unNombre % 2 == 0)
            System.out.println("L'entier " + unNombre + " est pair.");
        else
            System.out.println("L'entier " + unNombre + " est impair.");
        }

    public static void max() {
        Scanner scanner = new Scanner(System.in); //toujours mettre ça pour dire que l'objet existe
        System.out.println("Veuillez rentrer un premier entier :");
        int nombre1 = scanner.nextInt();
        System.out.println("Veuillez rentrer un second entier :");
        int nombre2 = scanner.nextInt();
        if (nombre1 > nombre2)
            System.out.println("Le maximum des deux entiers est : " + nombre1);
        else if (nombre2 > nombre1)
            System.out.println("Le maximum des deux entiers est : " + nombre2);
        else
            System.out.println("Les deux entiers sont égaux");
    }

    public static void min() {
        Scanner scanner = new Scanner(System.in); //toujours mettre ça pour dire que l'objet existe
        System.out.println("Veuillez rentrer un premier entier :");
        int nombre1 = scanner.nextInt();
        System.out.println("Veuillez rentrer un second entier :");
        int nombre2 = scanner.nextInt();
        if (nombre1 < nombre2)
            System.out.println("Le minimum des deux entiers est : " + nombre1);
        else if (nombre2 < nombre1)
            System.out.println("Le minimum des deux entiers est : " + nombre2);
        else
            System.out.println("Les deux entiers sont égaux");
    }

    public static void egaliteStr() {
        Scanner scanner = new Scanner(System.in); //toujours mettre ça pour dire que l'objet existe
        System.out.println("Veuillez rentrer une chaine de caractères : ");
        String chaine1 = scanner.nextLine();
        System.out.println("Veuillez rentrer une autre chaine de caractères : ");
        String chaine2 = scanner.nextLine();
        boolean test = chaine1.equals(chaine2);
        if (test) //test == true fonctionne aussi
            System.out.println("Les chaines de caractères sont égales");
        else
            System.out.println("Les chaines de caractères ne sont pas égales");
    }

    public static void factorielle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif ou nul");
        int n = scanner.nextInt();
        int factorielle = 1;
        for (int i = 1; i <= n; i++) { //ici ne pas mettre int i = 0
            factorielle *= i;
            System.out.println(n + "! = " + factorielle);
        }
    }

    public static void countdown() {
        int n = 11;
        while (n>0) {
            n = n - 1;
            System.out.println(+n);
        }
        System.out.println("BOOM !");
    }

    public static void carres() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre à multiplier au carré : ");
        int x = scanner.nextInt();
        int xCarre = x*x;
        System.out.println("x = " + x + " et x^2 = " + xCarre);
    }

    public static void tableMultiplication(){
        int i;
        for (i=1; i<11; i++) { //colonnes
            for (int j=1; j<11; j++){ //lignes
                System.out.print(i*j + " "); //à chaque ligne --> je multiplie la ligne par la colonne
            }
            System.out.print("\n");
        }
    }

    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisir un entier positif ou nul : ");
        int b,a = scanner.nextInt();
        do
        {
            System.out.print("Veuillez saisir un deuxieme entier positif : ");
            b = scanner.nextInt();
        } while (b <= 0);

        System.out.println("Resultat de " + a + "/" + b + " = " + (float) a / b);
    }

    public static void regle() {
        Scanner scanner = new Scanner(System.in);
        int val;
        do {
            System.out.println("Rentrez une valeur entière : ");
            val =  scanner.nextInt();
        } while(val<=0);

        System.out.print("|");
        for(int i=1;i<=val;i++)
        {
            if(i%10 == 0)
                System.out.print("|");
            else
                System.out.print("-");

        }
        System.out.print("\n");
    }

    public static void nombrePremier() {
        Scanner scanner = new Scanner(System.in);
        int nombre;
        do {
            System.out.println("Rentrez une valeur entière : ");
            nombre =  scanner.nextInt();
        } while(nombre<=0);

        int c = 0;
        for(int i=1;i<=nombre;i++)
        {
            if (nombre%i == 0)
            {
                c++;
            }
        }

        if (c==2)
            System.out.println(nombre + " est un nombre premier");
        else
            System.out.println(nombre + " n'est pas un nombre premier");
    }

}

