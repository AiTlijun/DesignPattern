import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @ClassName: HeapSizeDifferences
 * @Description: HeapSizeDifferences
 * @Author: lijun
 * @Date: 2019/4/19 0019下午 1:54
 * @Version: 1.0.0$
 **/
public class HeapSizeDifferences {
    static Collection objects = new ArrayList();
    static long lastMaxMemory = 0;

    public static void main(String[] args) {
        try {
            List inputArguments = ManagementFactory.getRuntimeMXBean().getInputArguments();
            System.out.println("Running with: " + inputArguments);
            while (true) {
                printMaxMemory();
                consumeSpace();
            }
        } catch (OutOfMemoryError e) {
            freeSpace();
            printMaxMemory();
        }
    }

    static void printMaxMemory() {
        long currentMaxMemory = Runtime.getRuntime().maxMemory();
        if (currentMaxMemory != lastMaxMemory) {
            lastMaxMemory = currentMaxMemory;
            System.out.format("Runtime.getRuntime().maxMemory(): %,dK.%n", currentMaxMemory / 1024);
        }
    }
//1362 2048 1,966,080K 918,016K
    static void consumeSpace() {
        objects.add(new int[100]);
    }

    static void freeSpace() {
        objects.clear();
    }
}
