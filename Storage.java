import java.util.Stack;

/**
 * 储物柜系统（包含 Locker 内部类）
 * 实现：二维柜子 + 每个柜子是栈（LIFO）
 */
public class Storage {

    /**
     * 内部类：Locker（单个柜子）
     */
    private class Locker {
        private Stack<Object> items = new Stack<>();

        public void addItem(Object obj) {
            items.push(obj); // 放入（后进先出）
        }

        public Object removeItem() {
            if (!items.isEmpty()) {
                return items.pop(); // 取出最后一个
            }
            return null;
        }

        public boolean isEmpty() {
            return items.isEmpty();
        }

        public int size() {
            return items.size();
        }

        public String showItems() {
            String result = "";

            // 按 LIFO 顺序显示
            for (int i = items.size() - 1; i >= 0; i--) {
                result += items.get(i) + ", ";
            }

            return result;
        }
    }

    // 二维柜子
    private Locker[][] lockers;

    /**
     * 构造方法
     */
    public Storage(int filas, int columnas) {
        lockers = new Locker[filas][columnas];

        // 初始化
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                lockers[i][j] = new Locker();
            }
        }
    }

    // ===============================
    // 1️⃣ 已占用柜子数量
    // ===============================
    public int occupiedLockers() {
        int count = 0;

        for (Locker[] row : lockers) {
            for (Locker l : row) {
                if (!l.isEmpty()) count++;
            }
        }

        return count;
    }

    // ===============================
    // 2️⃣ 空柜数量
    // ===============================
    public int freeLockers() {
        int count = 0;

        for (Locker[] row : lockers) {
            for (Locker l : row) {
                if (l.isEmpty()) count++;
            }
        }

        return count;
    }

    // ===============================
    // 3️⃣ 是否有空间
    // ===============================
    public boolean hasSpace() {
        return freeLockers() > 0;
    }

    // ===============================
    // 4️⃣ 空柜列表
    // ===============================
    public String freeLockersList() {
        String result = "";

        for (int i = 0; i < lockers.length; i++) {
            for (int j = 0; j < lockers[i].length; j++) {

                if (lockers[i][j].isEmpty()) {
                    result += (i + 1) + "-" + (j + 1) + ", ";
                }
            }
        }

        return result;
    }

    // ===============================
    // 5️⃣ 已占用柜子列表
    // ===============================
    public String occupiedLockersList() {
        String result = "";

        for (int i = 0; i < lockers.length; i++) {
            for (int j = 0; j < lockers[i].length; j++) {

                if (!lockers[i][j].isEmpty()) {
                    result += (i + 1) + "-" + (j + 1) + ", ";
                }
            }
        }

        return result;
    }

    // ===============================
    // 6️⃣ 放入第一个空柜
    // ===============================
    public boolean addToFirstFree(Object obj) {

        for (int i = 0; i < lockers.length; i++) {
            for (int j = 0; j < lockers[i].length; j++) {

                if (lockers[i][j].isEmpty()) {
                    lockers[i][j].addItem(obj);
                    return true;
                }
            }
        }

        return false;
    }

    // ===============================
    // 7️⃣ 放入指定柜子
    // ===============================
    public boolean addToLocker(int fila, int col, Object obj) {

        if (fila >= 0 && fila < lockers.length &&
            col >= 0 && col < lockers[0].length) {

            lockers[fila][col].addItem(obj);
            return true;
        }

        return false;
    }

    // ===============================
    // 8️⃣ 从柜子取出
    // ===============================
    public Object removeFromLocker(int fila, int col) {

        if (fila >= 0 && fila < lockers.length &&
            col >= 0 && col < lockers[0].length) {

            return lockers[fila][col].removeItem();
        }

        return null;
    }

    // ===============================
    // 9️⃣ 柜子物品数量
    // ===============================
    public int itemsInLocker(int fila, int col) {
        return lockers[fila][col].size();
    }

    // ===============================
    // 🔟 总物品数量
    // ===============================
    public int totalItems() {

        int total = 0;

        for (Locker[] row : lockers) {
            for (Locker l : row) {
                total += l.size();
            }
        }

        return total;
    }

    // ===============================
    // 11️⃣ 显示某柜
    // ===============================
    public String showLocker(int fila, int col) {

        if (lockers[fila][col].isEmpty()) {
            return "空柜";
        }

        return (fila + 1) + "-" + (col + 1) + "号柜: " +
                lockers[fila][col].showItems();
    }

    // ===============================
    // 12️⃣ 显示全部
    // ===============================
    public String showAll() {

        String result = "";

        for (int i = 0; i < lockers.length; i++) {
            for (int j = 0; j < lockers[i].length; j++) {

                if (!lockers[i][j].isEmpty()) {
                    result += showLocker(i, j) + "\n";
                }
            }
        }

        return result;
    }
}