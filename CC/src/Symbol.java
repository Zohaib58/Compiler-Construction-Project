import java.util.*;

public class Symbol {
    public String name;
    public String type;
    public int scopeLevel;
    public int lineNumber;
    public boolean isDeclare;

    public Symbol(String name, String type, int scopeLevel, int lineNumber, boolean isDeclare) {
        this.name = name;
        this.type = type;
        this.scopeLevel = scopeLevel;
        this.lineNumber = lineNumber;
        this.isDeclare = isDeclare;
    }

    public String getType() {
        return this.type;
    }

    public void setIsDeclare(boolean isDeclare) {
        this.isDeclare = isDeclare;
    }

    public boolean getIsDeclare() {
        return this.isDeclare;
    }
}
