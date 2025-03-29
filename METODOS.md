# GUIA

## 1. Queue(Cola):

1. **Caracteristicas**:
    - **FIFO** (First-In-First-Out): El primer elemento en entrar es el primero en salir.
    - **Implementaciones comunes:**
        - LinkedList (puede actuar como Queue).
        - PriorityQueue (cola con prioridad).
2. **Metodos:**
    ```Java
   //Añade un elemento (LANZA EXCEPCION si no hay espacio o lanza TRUE si se inserto)
    add(e)
   //EJEMPLO 
    cola.add(10)
   
   //Añade un elemento (retorna FALSE si la cola esta llena y TRUE si se logro insertar)
   offter(e)
   //EJEMPLO
   cola.offter("A")
   
   //Elimina y retorna el primer elemento (LANZA EXCEPCION si esta vacia)
    remove(e)
   //EJEMPLO
   int numero = cola.remove()
   
   //Elimina y retorna el primer elemento (retorna NULL si esta vacia)
   poll(e)
   //EJEMPLO
   String s = cola.poll()
   
   //Retorna el primer elemento sin eliminarlo (retorna null si esta vacio)
   peek()
   //EJEMPLO
   Object obj = cola.peek()
   
   //Retorna el primer el elemento sin elimianrlo (lanza excepcion si esta vacia)
   int first = cola.element()
    ```

## **2. HashMap:**

1. **Caracteristicas:**
    - Estructura **clave-valor**: No permite claves duplicadas.
    - **No ordenado**: No garantiza un orden específico (para orden usar TreeMap).

2. **Metodos:**
   ```Java
   //Añade una CLAVE-VALOR (si la clave ya existe, reemplaza el valor)
   put(k,v)
   //EJEMPLO
   map.put("edad",20);
   
   //Retorna el valor asociado a una clave (retorna NULL si no existe)
   get(k)
   //EJEMPLO
   int edad = map.get("edad")
   
   //Verifica si una clave existe
   containsKey(k)
   //EJEMPLO
   if(map.containsKey("nombre"))
   
   //Elimina su clave y su valor
   remove(k)
   //EJEMPLO
   map.remove("edad")
   
   //Retorna un SET con todas las claves
   keySet()
   //EJEMPLO
   for(String key : mao.ketSet())
   
   //Retorna pares MAP.ENTRY (clave-valor)
   entrySet()
   //EJEMPLO
   for(Map.Entry e : map.entrySet())
   ```

## **3. LinkedList:**

1. **Caracteristicas:**
    - Lista doblemente enlazada: Inserción/eliminación rápida en cualquier posición.
    - Puede actuar como:
        - Lista (List).
        - Pila/Cola (Queue).

2. **Metodos:**
   
## **4. List:**

1. **Caracteristicas:**
    - Arreglo dinámico: Acceso rápido por índice (O(1)).
    - Implementaciones comunes:
        - ArrayList (más rápido para acceso aleatorio).
        - LinkedList (más rápido para inserciones/eliminaciones).

2. **Metodos:**
   ```Java
    //Añade un elemento al final
   add(e)
   //EJEMPLO
   lista.add("hola")
   
   //Elimina el elemento en la posicion i
   remove(i)
   //EJEMPLO
   lista.remove(0)
   
   //Remplaza el elementro en la posicion i
   set(i,2)
   //EJEMPLO
   lista.set(1,"hola")
   
   //Retorna el elemento en la posicion i
   get(i)
   //EJEMPLO
   String s = lista.get(0)
   
   //Retorna una sublista desde i hasta j-1
    subList(i,j)
   //EJEMPLO
   List sub = lista.subList(0,2)
   ```