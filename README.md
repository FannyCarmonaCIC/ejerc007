# Aplicación para un cine

    • Vender entradas
    • Cine con 3 salas.
    • Butacas por sala:
        ◦ 100
        ◦ 50
        ◦ 20
    • Las entradas adjudican butacas al azar. Nº de butacas
    • Cada película tiene 3 sesiones: 17h, 20h y 22h30
    • En cada sala puede haber una película distinta o no.
    • En la entrada aparece:
        ◦ Sala
        ◦ Sesión
        ◦ Precio pagado
    • Precio fijo por entrada: 5€
    • Por la compra de 5 o más entradas se hace un 10% de descuento
    • Se puede cancelar una compra.
    • Se puede modificar una compra (cambio de sala, sesión o número de entradas).
    • Se debe poder comprobar las butacas libres de las salas.
    • Ver el total por cine, sala o proyección (9 proyecciones).
    • Comprobar las ventas realizadas
    

## Comentarios de Fanny

**Cómo crear una entrada usando curl**

- curl -X POST -H 'Content-Type: application/json' -d '{"id": 1,"SalaDTO": "null","SesionDTO": "null","pelicula": "Indiana Jones","totalDeEntradas": 3}' http://localhost:8080/crearentrada

**Cómo ver la lista de entradas:**

- curl -X GET http://localhost:8080/entradas/listar

**Sobre la clase SalaDTO**

No tengo claro si tiene sentido meter la lista de sesiones. No sé cómo resolver esa parte.

### Cosas que faltan

- [ ] Calcular las butacas libres
- [ ] Completar el método modificarEntrada
- [ ] Calcular el total vendido por proyección
- [ ] Calcular las ventas realizadas en total