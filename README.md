# Maven
  - Show pom.xml

# Functions and syntax
- Let's reimplement binary search
  - Standalone function in a package
  - Method header
    `tailrec fun <T : Comparable<T>> binarySearch(a: Array<T>, fromIndex: Int, toIndex: Int, key: T): Int {`
    - Talk about Arrays
    - Talk about Int (non-nullable Integer)
   - How to call this from Java?
   - How to call this from Kotlin
     - print(binarySearch(a, 0, 3, "b"))
     - named arguments
        - change order
     - default arguments (toIndex = a.size)
        - `@JvmOverloads`

# Lambdas
  - Let's call a Java function with lambda
     ```
     Arrays.binarySearch(
       arrayOf("a","b","d"),
       "C",
       {x, y -> x.compareTo(y, ignoreCase = true)}
     )
     ```
     Groovy-like syntax, but no surprises here.
     
  - Last argument can be moved outside paranthesis
    - Usefull for example in logging:
    ```
    log.debug({ -> "Hello " + "world" })
    ```
  
  - But the following doesn't compile. Why?

     ```  
     fun myMax(a: Array<String>, comparator: Comparator<String>): String {
         TODO()
     }

     arrayOf("a", "b", "c").maxWith({ x, y -> x.compareTo(y, ignoreCase = true) })
     ```

     SAM - Single Abstract Method (aka FunctionalInterface) works only for Java inter-op.
     Kotlin to Kotlin does not.
     
  - Functional interfaces are passe. Use proper functions literals
      ```
      fun myMax2(a: Array<String>, comparator: (String, String) -> Int1) {
          TODO()
      }
      // Proper function types 
      myMax2(arrayOf("a", "b", "c"), { x, y -> x.compareTo(y, ignoreCase = true) })
      ```
  - Type aliases

# Extensions

Discuss Extensions.kt

How it is called from Java.

# Inline lambdas

Discuss InlineLambda.kt

What will be printed?
- Tricky return
- How could this possibly work? Inline functions.

# Classes

- Discuss `LocationBean`.
   - Call it with Java.

- Discuss `ImmutableLocation`
  - named arguments
  - explicit constructor
  - data classes

- Classes are final on default
- Member functions and properties are public on default 

# Nulls

Discuss `Nulls.kt`

- `!!` operator
- '?:'

Java interoperability

Discuss `javaInterop`.
  - Non denotable type with `!`.

Standard annotations like nullable.

Optional is not supported. 

# Standard operator overloading

https://kotlinlang.org/docs/reference/operator-overloading.html#equals

# Collections

https://kotlinlang.org/docs/reference/collections-overview.html

# Transformations

Discuss `Transformations`.

- Not like java's stream() - explicit copies.
- Add asSequence()
  - Compare source code for `Sequence` and `Iterable`

## Coroutines

Advertise coroutines.
- `WrappedSequenceExample`
- `SwitchOddEvenExample`

# Gotchas

- Android

   Only JVM 7 is available. 

- Spring framework

   Classes and member functions are final on default. You need to open. Use maven plugin.
