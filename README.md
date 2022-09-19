# tinyCache Example

This is an example of the tinyCache library in combination with CacheBuilder ByteCode manipulator.

## Components

Description          | Project
:------------------- | :------
dependency           | [tinyCache](https://github.com/tinycodecrank/tinyCache)
bytecode manipulator | [CacheBuilder](https://github.com/tinycodecrank/CacheBuilder)

## Example

```java
static int invocations = 0;

@Cache(cache = FIFOCache.class, capacity = 2)
public static int fibonacci(int n)
{
  invocations++;
  if (n == 0 || n == 1)
    return n;
  else
    return fibonacci(n - 2) + fibonacci(n - 1);
}

public void main(String[] args)
{
  int n = 10;
  System.out.println("fibonacci(" + n + ") => " + fibonacci(n));
  System.out.println("invocations " + invocations);
}
```

##### Output
```shell
fibonacci(10) => 55
invocations 11
```

In this example the @Cache annotation causes the function ```int fibonacci(int n)``` to be wrapped in a FIFO cache with capacity 2, avoiding recomputation of already computed values.
This reduces the invocation count for a given n ∊ ℕ from ≈2<sup>n</sup> to ≈n
