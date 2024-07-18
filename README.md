# Java_7th_Exercise_ElementosComunes

mkdir Java_7th_Exercise_ElementosComunes
cd Java_7th_Exercise_ElementosComunes
mkdir -p src/main/java/com/example/commonarray/model
mkdir -p src/main/java/com/example/commonarray/service
mkdir -p src/test/java/com/example/commonarray/service

Enunciado:
Se quiere desarrollar un programa en java que busque elementos comunes en dos arrays de numeros enteros.


# Estructura del Proyecto
Java_7th_Exercise_ElementosComunes/<br>
├── src/<br>
│   ├── main/<br>
│   │   ├── java/<br>
│   │   │   ├── com/<br>
│   │   │   │   ├── example/<br>
│   │   │   │   │   ├── commonarray/<br>
│   │   │   │   │   │   ├── model/<br>
│   │   │   │   │   │   │   └── ArrayElement.java<br>
│   │   │   │   │   │   ├── service/<br>
│   │   │   │   │   │   │   └── ArrayService.java<br>
│   │   │   │   │   │   └── Main.java<br>
│   ├── test/<br>
│   │   ├── java/<br>
│   │   │   ├── com/<br>
│   │   │   │   ├── example/<br>
│   │   │   │   │   ├── commonarray/<br>
│   │   │   │   │   │   ├── service/<br>
│   │   │   │   │   │   └── ArrayServiceTest.java<br>
├── .vscode/<br>
│   └── settings.json<br>
├── .gitignore<br>
├── pom.xml<br>
└── README.md<br>


Entregable:
- Repositorio de git
- Obligatorio realizar los pruebas unitarias

# Diagrama de Clases
+-------------------+<br>
|    ArrayElement   |<br>
+-------------------+<br>
| - int value       |<br>
| - int position1   |<br>
| - int position2   |<br>
+-------------------+<br>
| + ArrayElement()  |<br>
| + getValue()      |<br>
| + getPosition1()  |<br>
| + getPosition2()  |<br>
| + toString()      |<br>
+-------------------+<br>

+--------------------------------------------------------+<br>
|   ArrayService                                         |<br>
+--------------------------------------------------------+<br>
| + findCommonElements(int[], int[]): List<ArrayElement> |<br>
+--------------------------------------------------------+<br>

+-------------------+<br>
|       Main        |<br>
+-------------------+<br>
| + main(String[])  |<br>
+-------------------+<br>

# Texto Enunciado:
[Link Enunciado Elementos Comunes]https://docs.google.com/document/d/1qdHz1CkfiQ4T5CO6hDseqKauh-io8GmxqV4-w9uVejA/edit#heading=h.ardn09bhefvb