### 1. 
```Java
Runnable r = () -> {
    int[][] products = new int[s][t];
    for (int i = 0; i < s; i++) {
        for(int j = i + 1; j < t; j++) {
            products[i][j] = i * j;
        }
    }
};
```
**Answer:**

Parameter: `None`

Free variables: `products`, `i`, `j`

ii. 

````java
Comparator<String> comp = (s, t) -> {
    if (ignoreCase == true) {
        return s.compareToIgnoreCase(t);
    } else {
        return s.compareTo(t);
    }
};
```
ii. Parameter: `s`, `t`
Free variables: `ignoreCase`
