# U3-ejercicio20
# 🎟️ Control de Asistencia a un Evento Exclusivo

Ejercicio de **Programación Orientada a Objetos en Java** que modela el control de aforo de un evento privado aplicando el principio de **encapsulamiento**. El número de asistentes es un contador interno protegido: ningún agente externo puede alterarlo directamente, y solo cambia mediante métodos que respetan la capacidad máxima del evento.

## 🎯 Objetivo

Garantizar un registro exacto del aforo, impidiendo que el contador supere la capacidad permitida o descienda por debajo de cero.

## ✨ Características

- Atributos privados: `capacidadMaxima` y `asistentesActuales`.
- `registrarIngreso()`: incrementa el contador solo si hay espacio disponible.
- `registrarSalida()`: decrementa el contador solo si hay asistentes dentro del evento.
- Cada operación devuelve `true` o `false` para saber si fue aceptada.
- Sin setter del contador: se consulta con `getAsistentesActuales()`.
- Constructor que exige una capacidad mayor a 0.
- Consultas generales: lugares disponibles, aforo completo y estado formateado.

## 📚 Conceptos aplicados

Encapsulamiento · Modificadores de acceso · Control de límites · Getters · Validación de estado · Constructores

![U3 ejercicio20](U3%20ejercicio20.png)
