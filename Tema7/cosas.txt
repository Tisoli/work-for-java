// 1. ¿Cuál es el nombre en Java de la clase que representa las excepciones que se producen al invocar un método de un objeto cuyo valor es “null”?
// 1. 表示调用值为“null”的对象的方法时发生的异常的 Java 类的名称是什么？
1. Excepción: NullPointerException
// 2. ¿Cuál es el nombre en Java de la clase que representa las excepciones que se producen al obtener un comportamiento anómalo en la entrada / salida de información?
// 2. 表示在输入/输出中遇到异常行为时发生的异常的 Java 类的名称是什么？
2. Excepción: IOException
// 3. Observa el siguiente fragmento de código
// 3. 观察以下代码片段：
// String[] array_string = new String[25];
// System.out.println(array_string[3].length());
// 会发生什么异常？
// (la posición 3 contiene null)
3. Excepción: NullPointerException
// 4. Observa el siguiente fragmento de código:
// 4. 观察以下代码片段：
// String aux = *hola";
// // intaux2 = Integer.parselnt (aux);
// // ¿Qué sucedería al ejecutar el mismo”
// 执行此代码会发生什么？
4. Excepción: NumberFormatException
// 5.printStackTrace() muestra:
// Tipo de excepción    
// Mensaje de error
// Secuencia de llamadas (stack) donde se produjo el error
// 异常类型
// 错误信息
// 发生错误的调用顺序（堆栈）
//6. Define una clase “NumeroNegativoExcepcion” que herede de “Exception” y que contenga un constructor sin parámetros y un constructor que reciba como parámetro un “String”, de tal modo que ambos invoquen a los constructores de la clase “Exception” correspondientes.
// 6. 定义一个继承自“Exception”的“NegativeNumberException”类，该类包含一个无参数构造函数和一个接收“String”作为参数的构造函数，使得这两个构造函数都能调用“Exception”类的相应构造函数。
// 6.public class NumeroNegativoExcepcion extends Exception {

//     public NumeroNegativoExcepcion() {
//         super();
//     }

//     public NumeroNegativoExcepcion(String mensaje) {
//         super(mensaje);
//     }
// }