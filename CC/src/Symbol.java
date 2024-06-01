import java.util.*;

public class Symbol {
    public String name;
    public String type;
    public int scopeLevel;
    public int lineNumber;
    public boolean isDeclare;
    public boolean isUsed;

    public Symbol(String name, String type, int scopeLevel, int lineNumber, boolean isDeclare, boolean isUsed) {
        this.name = name;
        this.type = type;
        this.scopeLevel = scopeLevel;
        this.lineNumber = lineNumber;
        this.isDeclare = isDeclare;
        this.isUsed = isUsed;
    }

    public String getType() {
        return this.type;
    }

    public boolean getIsUsed() {
        return this.isUsed;
    }

    public String getName (){
        return this.name;
    }
    public void setIsUSed() {
         this.isUsed = true;
    }

    public void setIsDeclare(boolean isDeclare) {
        this.isDeclare = isDeclare;
    }

    public boolean getIsDeclare() {
        return this.isDeclare;
    }
}
