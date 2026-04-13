import java.util.*; 
// 导入工具包，这里主要用到 Stack（栈）

public class Consigna { 
// 定义一个类：Consigna（储物柜系统）

    private Stack<Object>[][] cuadricula; 
    // 二维数组：每个位置是一个“栈”
    // 相当于：很多柜子，每个柜子里面可以放很多东西（用栈）
    // 有一面墙，假设有3×3九个柜子，那么可以理解成对应9个用户，这9个用户可以在他们的柜子里放东西，这个东西是可以按照顺序放入么？就好比把东西推进去，拿出来得从头开始拿
    private int filas; 
    // 行数（比如第几排）

    private int columnas; 
    // 列数（比如第几个柜子）

    // ===============================
    // 构造方法（创建储物柜）
    // ===============================
    public Consigna(int f, int c){

        this.filas = f; 
        // 把参数 f 保存为行数

        this.columnas = c; 
        // 把参数 c 保存为列数

        cuadricula = new Stack[f][c]; 
        // 创建一个 f 行 c 列的二维数组
        // 注意：这里只创建“格子”，里面还没有 Stack（是 null）
    }

    // ===============================
    // 放入物品（指定位置）
    // ===============================
    public boolean meter (Object o, int f, int c){

        // 判断是否越界（防止数组错误）
        if(f < 0 || f >= filas || c < 0 || c >= columnas){
            return false; // 不合法
        }

        // 如果这个位置还没有栈（第一次使用）
        if(cuadricula[f][c] == null){
            cuadricula[f][c] = new Stack<Object>(); 
            // 创建一个新的栈
        }

        cuadricula[f][c].push(o); 
        // 把物品放进去（栈 → 后进先出）

        return true; 
        // 放成功
    }

    // ===============================
    // 放入第一个空柜
    // ===============================
    public boolean meterPrimeroLibre(Object o){

        // 遍历所有位置
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){

                // 如果是空（没创建 或 空栈）
                if(cuadricula[i][j] == null || cuadricula[i][j].isEmpty()){

                    // 如果还没创建栈 → 先创建
                    if(cuadricula[i][j] == null){
                        cuadricula[i][j] = new Stack<>();
                    }

                    cuadricula[i][j].push(o); 
                    // 放入物品

                    return true; 
                    // 成功后立即结束
                }
            }
        }

        return false; 
        // 没有空位
    }

    // ===============================
    // 计算占用柜子数量
    // ===============================
    public int espaciosOcupados(){

        int conta = 0; 
        // 计数器

        for(int i=0; i< filas; i++){
            for(int j=0; j<columnas; j++){

                // 如果这个位置有栈 且 不为空
                if(cuadricula[i][j] != null && !cuadricula[i][j].isEmpty()){
                    conta++; // 占用+1
                }
            }
        }

        return conta; 
        // 返回结果
    }

    // ===============================
    // 计算空柜数量（重点！）
    // ===============================
    public int espaciosLibres(){

        int conta = 0;

        for(int i=0; i< filas; i++){
            for(int j=0; j<columnas; j++){

                // 空的两种情况：
                // 1. 没有栈（null）
                // 2. 栈存在但为空
                if(cuadricula[i][j] == null || cuadricula[i][j].isEmpty()){
                    conta++;
                }
            }
        }

        return conta;
    }

    // ===============================
    // 是否有空位
    // ===============================
    public boolean hayPlaza(){

        return espaciosLibres() > 0; 
        // 如果空位 > 0 → true
    }

    // ===============================
    // 返回空位列表（字符串）
    // ===============================
    public String plazasLibres(){

        String total ="";

        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){

                if(cuadricula[i][j] == null || cuadricula[i][j].isEmpty()){

                    total += (i+1) + "-" + (j+1) + ", ";
                    // +1 是因为用户习惯从1开始
                }
            }
        }

        return total;
    }

    // ===============================
    // 返回占用位置
    // ===============================
    public String plazasOcupadas(){

        String total ="";

        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){

                if(cuadricula[i][j] != null && !cuadricula[i][j].isEmpty()){

                    total += (i+1) + "-" + (j+1) + ", ";
                }
            }
        }

        return total;
    }

    // ===============================
    // 取出物品（栈 → LIFO）
    // ===============================
    public Object sacar(int f, int c){

        // 越界判断
        if(f < 0 || f >= filas || c < 0 || c >= columnas){
            return null;
        }

        // 如果有东西
        if(cuadricula[f][c] != null && !cuadricula[f][c].isEmpty()){

            return cuadricula[f][c].pop(); 
            // 取出“最后放进去的”
        }

        return null;
    }

    // ===============================
    // 某柜子物品数量
    // ===============================
    public int objetosEn(int f, int c){

        if(cuadricula[f][c] != null){
            return cuadricula[f][c].size(); 
            // 返回栈大小
        }

        return 0;
    }

    // ===============================
    // 总物品数量
    // ===============================
    public int totalObjetos(){

        int total = 0;

        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){

                if(cuadricula[i][j] != null){
                    total += cuadricula[i][j].size();
                }
            }
        }

        return total;
    }

    // ===============================
    // 显示某个柜子内容
    // ===============================
    public String mostrar(int f, int c){

        if(cuadricula[f][c] == null || cuadricula[f][c].isEmpty()){
            return "Vacío";
        }

        String res = (f+1) + "-" + (c+1) + ": ";

        // 从栈顶开始显示（LIFO）
        for(int i = cuadricula[f][c].size()-1; i>=0; i--){
            res += cuadricula[f][c].get(i) + ", ";
        }

        return res;
    }

    // ===============================
    // 显示全部柜子
    // ===============================
    public String mostrarTodo(){

        String res = "";

        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){

                if(cuadricula[i][j] != null && !cuadricula[i][j].isEmpty()){
                    res += mostrar(i,j) + "\n";
                }
            }
        }

        return res;
    }
}