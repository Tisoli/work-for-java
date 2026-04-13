// 用 Java 编写一个“main”程序，执行以下操作：
// 创建一个“Scanner”类的对象，并将其与标准输入关联；
// 将同一个“String”类型对象读取到“lect_teclado”对象中；
// 调用上一个练习中定义的“characterIn”方法，从标准输入读取“String”和整数“7”，并将其显示在屏幕上；
// 捕获可能出现的异常情况，并在屏幕上显示消息：
// “您尝试检索字符串中不存在的位置；”
import java.util.Scanner;

public class MainPrograma {

    public char caracterEn(String texto, int posicion) throws IndexOutOfBoundsException {
        if (texto == null) {
            throw new NullPointerException("La cadena es null");
        }
        if (posicion < 0 || posicion >= texto.length()) {
            throw new IndexOutOfBoundsException("Posición fuera de rango");
        }
        return texto.charAt(posicion);
    }

    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String lect_teclado = sc.nextLine();

        try {
            char c = caracterEn(lect_teclado, 7);
            System.out.println("Carácter en posición 7: " + c);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Has intentado recuperar una posición de la cadena de caracteres que no existe;");
        } finally {
            sc.close();
        }
    }
}