# 🚀 Evaluación Técnica: Conversor de Números Romanos

¡Bienvenido/a al proceso de evaluación técnica! Este ejercicio está diseñado para evaluar tus habilidades de lógica de programación, diseño de código y paso de pruebas unitarias en **Java**.

## 📝 El Reto

Tu objetivo es implementar un método que convierta **números enteros (arábigos)** en su representación correspondiente en **números romanos** (en formato String).

### 🔢 Reglas de los Números Romanos:
* Los símbolos básicos son: `I` (1), `V` (5), `X` (10), `L` (50), `C` (100), `D` (500), `M` (1000).
* Los símbolos se combinan de izquierda a derecha de mayor a menor valor (Ej: `VI` = 6, `XV` = 15).
* Los símbolos `I`, `X`, `C` y `M` no pueden repetirse más de tres veces consecutivas.
* Restas (notación sustractiva): Si un símbolo de menor valor está a la izquierda de uno mayor, se resta (Ej: `IV` = 4, `IX` = 9, `XL` = 40, `XC` = 90, `CD` = 400, `CM` = 900).
* **Restricción:** El rango de conversión requerido para este ejercicio es del **1 al 3999**. Si el número está fuera de este rango, el método debe lanzar una excepción de tipo `IllegalArgumentException`.

---

## 🛠️ Instrucciones para realizar el ejercicio

Sigue estos pasos ordenadamente para completar la prueba:

### 1. Preparación (Fork y Clonación)
1. Haz un **Fork** de este repositorio a tu propia cuenta de GitHub (botón "Fork" arriba a la derecha).
2. Clona **tu fork** localmente en tu computadora:
   ```bash
   git clone https://github.com
   ```
3. Abre el proyecto en tu IDE favorito (IntelliJ IDEA, Eclipse, VS Code, etc.) como un proyecto **Maven**.

### 2. Desarrollo
* Dirígete a la clase `src/main/java/roman/converter/number/RomanConverter.java`.
* Encontrarás el método `convertToRoman(int number)`. Actualmente retorna una cadena vacía o incompleta.
* Escribe tu código dentro de ese método hasta cumplir con todos los requerimientos. *No modifiques la firma del método.*

### 3. Validación Local (Ejecutar Pruebas)
Hemos incluido una suite de pruebas unitarias para comprobar tu solución. Puedes ejecutarlas desde tu IDE o abriendo una terminal en la raíz del proyecto y corriendo:
```bash
mvn test
```
El ejercicio se considerará correcto únicamente cuando **el 100% de los tests pasen con éxito**.

### 4. Entrega
1. Guarda tus cambios y haz commit:
   ```bash
   git add .
   git commit -m "Solución del ejercicio de números romanos"
   ```
2. Sube el código a tu repositorio de GitHub:
   ```bash
   git push origin main
   ```
3. **Validación Automática:** Ve a la pestaña **Actions** en tu repositorio de GitHub para verificar que la integración continua compile tu código y pase los tests en la nube de forma exitosa (marcado con un check verde `✓`).
