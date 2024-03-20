# Py2J (Python-to-Java Dictionary Compiler)

A programming language tool designed to seamlessly translate Python dictionary syntax into Java `HashMap` code.

## Example

Our tool focuses on intuitive syntax and seamless integration:

### Python-like syntax:
```python
dict = {'a': 1, 'b': 2, 'c': 3}
for key in dict:
    print(dict[key])
```

### Equivalent Java code after translation:
```java
HashMap<String, Integer> dict = new HashMap<String, Integer>();
dict.put("a", 1);
dict.put("b", 2);
dict.put("c", 3);
for (String key : dict.keySet()) {
    System.out.println(dict.get(key));
}
```

This Python-like code is translated to Java, maintaining readability and performance.

## Features

**Syntactic Ease**: Write dictionary operations using Python's elegant syntax.

**Java Integration**: Seamlessly convert your Python-like code into robust Java code.

**Control Flow**: Translate Python control statements, like `if` and `for`, into their Java equivalents.

**Error Handling**: Informative error messages assist in debugging during the translation process.

## Getting Started

To use the Python-to-Java Dictionary Compiler, follow these steps:

1. Write your code using the Python dictionary syntax.
2. Run the compiler to translate your code into Java.
3. Integrate the generated Java code into your application.

## Future Scope

Support for additional Python features and data structures. Enhanced error handling and optimization for large-scale applications. Expansion to support a full subset of Python's functionality for a comprehensive development experience.

For more information on usage and contributions, refer to the detailed documentation provided with the tool.
