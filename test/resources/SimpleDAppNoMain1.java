package resources;

public class SimpleDAppNoMain1 {

    @org.aion.avm.core.abicompiler.Callable(first = "Zhike1", last = "Zhang2")
    public static boolean test1(boolean b) {
        return true;
    }

    @org.aion.avm.core.abicompiler.Callable(first = "Zhike2", last = "Zhang2")
    public boolean test2(int i, String s, long[] l) {
        return true;
    }

    @Deprecated
    public static boolean test3(int i, String s, long[] l) {
        return true;
    }
}