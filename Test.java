import java.util.Scanner;

/**
 * 测试类（菜单控制）
 */
public class Test {

    public static void main(String[] args) {

        Storage s = new Storage(4, 4);
        Scanner sc = new Scanner(System.in);

        int op;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Añadir objeto (primer libre)");
            System.out.println("2. Añadir objeto (posición)");
            System.out.println("3. Sacar objeto");
            System.out.println("4. Ver libres");
            System.out.println("5. Ver ocupados");
            System.out.println("6. Ver contenido locker");
            System.out.println("7. Ver todos");
            System.out.println("8. Total objetos");
            System.out.println("0. Salir");

            op = sc.nextInt();

            switch (op) {

                case 1:
                    s.addToFirstFree("Persona Ana");
                    break;

                case 2:
                    System.out.print("Fila: ");
                    int f = sc.nextInt() - 1;
                    System.out.print("Columna: ");
                    int c = sc.nextInt() - 1;

                    s.addToLocker(f, c, "Televisor");
                    break;

                case 3:
                    System.out.print("Fila: ");
                    f = sc.nextInt() - 1;
                    System.out.print("Columna: ");
                    c = sc.nextInt() - 1;

                    System.out.println(s.removeFromLocker(f, c));
                    break;

                case 4:
                    System.out.println(s.freeLockersList());
                    break;

                case 5:
                    System.out.println(s.occupiedLockersList());
                    break;

                case 6:
                    System.out.print("Fila: ");
                    f = sc.nextInt() - 1;
                    System.out.print("Columna: ");
                    c = sc.nextInt() - 1;

                    System.out.println(s.showLocker(f, c));
                    break;

                case 7:
                    System.out.println(s.showAll());
                    break;

                case 8:
                    System.out.println("Total: " + s.totalItems());
                    break;
            }

        } while (op != 0);
    }
}