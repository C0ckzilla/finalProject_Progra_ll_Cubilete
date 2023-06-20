# finalProject_Progra_ll_Cubilete
Repositorio con el objeto de desarrollar un Cubilete tipo Casino

Dexcripción detallada de cada Clase creada (y el enum):

1. *Die (Dado):* Esta clase representa un dado individual en el juego. Cada dado tiene un valor que se establece al lanzarlo. El método `roll()` genera un número aleatorio entre 1 y 6 para simular el lanzamiento de un dado.

2. *Player (Jugador):* Esta clase representa a un jugador en el juego. Cada jugador tiene un nombre, una lista de dados, una mano (que es un tipo de `Hand`), una lista de valores de los dados en su mano y un saldo. Los jugadores pueden lanzar sus dados, lo que también actualiza su mano y los valores de los dados en su mano. También pueden verificar su saldo y si tienen suficiente saldo para hacer un lanzamiento.

3. *Hand (Mano):* Este es un enum que representa los diferentes tipos de manos posibles en el juego. Los tipos de manos son, en orden de menor a mayor: Nada, Pareja, Doble Pareja, Tercia, Escalera, Full, Póker, y Quintilla. Hay un método estático `evaluateHand()` que toma una lista de dados y devuelve el tipo de mano que representan esos dados.

Estas clases y enum trabajan juntas para simular un juego de Cubilete. Los jugadores lanzan sus dados, luego se evalúan sus manos y se compara el tipo de mano de cada jugador para determinar quién ganó.
