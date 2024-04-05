import java.util.*;

class Symbol {
    String name;
    String type;
    // Other properties like scope level

    public Symbol(String name, String type) {
        this.name = name;
        this.type = type;
    }
}

class SymbolTable {
    Map<String, Symbol> symbols = new HashMap<>();

    public void define(String name, String type) {
        Symbol sym = new Symbol(name, type);
        symbols.put(name, sym);
    }

    public Symbol lookup(String name) {
        return symbols.get(name);
    }
}