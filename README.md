# Neuropsico

Este proyecto es una simulación sencilla en Java que modela aspectos de la neuropsicología mediante programación orientada a objetos. Se crean clases que representan partes anatómicas, partes del cerebro, funciones, trastornos, enfermedades y datos de pacientes, demostrando cómo se pueden relacionar estos conceptos en una aplicación.

## Estructura del Proyecto

- **Anatomy.java**  
  Gestiona una lista de partes anatómicas (como "Gray Matter" o "White Matter") mediante un `ArrayList`.  
  *Métodos destacados*: getter, setter, `addAnatomyPart()`, y `toString()`.

- **Brain.java**  
  Extiende la clase `Patient` para representar un cerebro. Contiene listas de:
  - Objetos `BrainPart` (partes del cerebro).
  - Objetos `Disorder` (trastornos).
  - Objetos `Function` (funciones cerebrales).  
  *Métodos destacados*: métodos para agregar partes, funciones y trastornos, y un `toString()` que muestra información del paciente y algunas partes del cerebro.

- **BrainPart.java**  
  Representa una parte específica del cerebro (por ejemplo, "Frontal Lobe" o "Occipital Lobe") y permite asociar:
  - Objetos `Anatomy`.
  - Objetos `Function`.
  - Objetos `Disorder`.  
  *Métodos destacados*: métodos para agregar anatomía, funciones y trastornos, y un `toString()` que resume la información.

- **Disease.java**  
  Define una enfermedad con un nombre y descripción. Se utiliza para modelar condiciones médicas generales.

- **Disorder.java**  
  Similar a `Disease.java`, pero orientado a describir trastornos específicos del cerebro, con un nombre y una descripción.

- **Function.java**  
  Representa una función cerebral, identificada por un nombre y con una lista de detalles (por ejemplo, "Problem Solving", "Memory Processing").  
  *Métodos destacados*: `addFunctionDetail()` y `toString()`.

- **Patient.java**  
  Clase base para representar a un paciente, que almacena atributos como nombre y edad.

- **Main.java**  
  Contiene el método `main` que demuestra el uso de las clases anteriores. En este ejemplo se:
  - Crean instancias de `BrainPart` (por ejemplo, "Frontal Lobe" y "Occipital Lobe").
  - Se asocian objetos de `Anatomy`, `Function` y `Disorder` a cada parte del cerebro.
  - Se instancia un objeto `Brain` para el paciente "Juana" de 32 años, integrando las partes, funciones y trastornos.
  - Se imprime la información resultante en la consola.

## Cómo Ejecutar el Proyecto

1. **Clonar el repositorio**  
   ```bash
   git clone https://github.com/camimm10/neuropsico.git
