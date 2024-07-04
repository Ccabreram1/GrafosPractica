@Author Diana Avila 
@Author Sebastian Cabrera

Descripcion del proyecto=
El proyecto ejecuta que apartir de una lista de usuarios exista un usuario y se pueda añadir a mas personas a su red social como un ejemplo de ello.
Despues la misma persona pueda ver que amigos tienen los mismos gusto y agregarlos a una lista solo de gustos y asi todo el programa imprime 
la lista de amigos que se agregaron a partir de la conexion y despues una lista de usuarios con gusto en comun.

App.java: Clase principal que inicia la aplicación, en donde se presenta la listan de usuarios que tiene el sistema,
          ademas añadido con los gustos personales y cada se agregan conexiones en la misma para que se pueda imprimrir.
User.java: Representa un usuario en el sistema, en donde tiene datos como el nombre, edad y una lista de intereses, en donde
           cada uno tiene un get para poder implementarlo en las otras clases y asi mismo se utiliza un HashSet para que no
           se repitan las personas dentro de una lista.

Graph.java: Implementación de la estructura de datos de grafo, para añadir amigos, conexiones, imprimir las conexiones 
            y para que pueda utilizar en las otras clases los get.

RecommendationEngine.java: Es en donde se realizan las recomendaciones que utiliza el grafo para generar sugerencias de los
            posibles amigos a partir de un Umbral que ayuda a visualizar quienes tienen los mismos gustos en comun e imprima 
            a partir de los bucles que se genera.
