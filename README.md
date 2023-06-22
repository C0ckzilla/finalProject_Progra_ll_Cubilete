# finalProject_Progra_ll_Cubilete
Repositorio con el objeto de desarrollar un Cubilete tipo Casino

Modificaciones de esta version:

Hemos dividido el problema en varias partes y hemos implementado cada una de ellas paso a paso. Aquí está un resumen de lo que hemos hecho:

    Clase Die: Creamos una clase Die para representar un dado individual en el juego. Esta clase tiene un método roll() que genera un número aleatorio entre 1 y 6 para simular el lanzamiento de un dado.

    Clase Player: Creamos una clase Player para representar a un jugador en el juego. Esta clase tiene una lista de objetos Die para representar los dados del jugador, un método rollDice() para lanzar todos los dados del jugador, y un método displayHand() para mostrar los valores de los dados del jugador.

    Enumeración Hand: Creamos una enumeración Hand para representar los diferentes tipos de manos que un jugador puede tener en el juego de Cubilete. Esta enumeración incluye todos los tipos de manos posibles, desde "Nada" hasta "Quintilla".

    Evaluación de manos: Implementamos un método evaluateHand() en la enumeración Hand que toma una lista de dados y determina qué tipo de mano representan. Este método utiliza un mapa para contar la frecuencia de cada valor de dado, y luego verifica cada tipo de mano posible en orden de mayor a menor.

    Valor de la mano: Agregamos un campo value a la clase Player para almacenar el valor de la mano del jugador. Este valor se calcula como un valor base determinado por el tipo de mano, más la suma de los valores de los dados. Este valor se puede usar para comparar las manos de los jugadores y determinar quién ganó.
