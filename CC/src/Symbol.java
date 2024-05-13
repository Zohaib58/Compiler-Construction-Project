import java.util.*;

public class Symbol {
    public static String name;
    public static String type;
    public static int scopeLevel;
    public static int lineNumber;
    public static boolean isDeclare;

    public Symbol(String name, String type, int scopeLevel, int lineNumber, boolean isDeclare) {
        Symbol.name = name;
        Symbol.type = type;
        Symbol.scopeLevel = scopeLevel;
        Symbol.lineNumber = lineNumber;
        Symbol.isDeclare = isDeclare;
    }

    public String getType() {
        return this.type;
    }
}
