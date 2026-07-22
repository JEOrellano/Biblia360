package com.orellano.biblia360.daoSQLite.sql.spa;

public final class LoadGenesis {
  public LoadGenesis() {}
  public static final String SQL_PARTE_1 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Gn', 1, 1, 'La creación', 'En el principio creó Dios los cielos y la tierra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 1, 2, NULL, 'Y la tierra estaba desordenada y vacía, y las tinieblas estaban sobre la faz del abismo, y el Espíritu de Dios se movía sobre la faz de las aguas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 1, 3, NULL, 'Y dijo Dios: Sea la luz; y fue la luz.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 1, 4, NULL, 'Y vio Dios que la luz era buena; y separó Dios la luz de las tinieblas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 1, 5, NULL, 'Y llamó Dios a la luz Día, y a las tinieblas llamó Noche. Y fue la tarde y la mañana un día.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 1, 6, NULL, 'Luego dijo Dios: Haya expansión en medio de las aguas, y separe las aguas de las aguas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 1, 7, NULL, 'E hizo Dios la expansión, y separó las aguas que estaban debajo de la expansión, de las aguas que estaban sobre la expansión. Y fue así.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 1, 8, NULL, 'Y llamó Dios a la expansión Cielos. Y fue la tarde y la mañana el día segundo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 1, 9, NULL, 'Dijo también Dios: Júntense las aguas que están debajo de los cielos en un lugar, y descúbrase lo seco. Y fue así.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 1, 10, NULL, 'Y llamó Dios a lo seco Tierra, y a la reunión de las aguas llamó Mares. Y vio Dios que era bueno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 1, 11, NULL, 'Después dijo Dios: Produzca la tierra hierba verde, hierba que dé semilla; árbol de fruto que dé fruto según su género, que su semilla esté en él, sobre la tierra. Y fue así.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 1, 12, NULL, 'Produjo, pues, la tierra hierba verde, hierba que da semilla según su naturaleza, y árbol que da fruto, cuya semilla está en él, según su género. Y vio Dios que era bueno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 1, 13, NULL, 'Y fue la tarde y la mañana el día tercero.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 1, 14, NULL, 'Dijo luego Dios: Haya lumbreras en la expansión de los cielos para separar el día de la noche; y sirvan de señales para las estaciones, para días y años,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 1, 15, NULL, 'y sean por lumbreras en la expansión de los cielos para alumbrar sobre la tierra. Y fue así.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 1, 16, NULL, 'E hizo Dios las dos grandes lumbreras; la lumbrera mayor para que señorease en el día, y la lumbrera menor para que señorease en la noche; hizo también las estrellas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 1, 17, NULL, 'Y las puso Dios en la expansión de los cielos para alumbrar sobre la tierra,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 1, 18, NULL, 'y para señorear en el día y en la noche, y para separar la luz de las tinieblas. Y vio Dios que era bueno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 1, 19, NULL, 'Y fue la tarde y la mañana el día cuarto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 1, 20, NULL, 'Dijo Dios: Produzcan las aguas seres vivientes, y aves que vuelen sobre la tierra, en la abierta expansión de los cielos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 1, 21, NULL, 'Y creó Dios los grandes monstruos marinos, y todo ser viviente que se mueve, que las aguas produjeron según su género, y toda ave alada según su especie. Y vio Dios que era bueno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 1, 22, NULL, 'Y Dios los bendijo, diciendo: Fructificad y multiplicaos, y llenad las aguas en los mares, y multiplíquense las aves en la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 1, 23, NULL, 'Y fue la tarde y la mañana el día quinto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 1, 24, NULL, 'Luego dijo Dios: Produzca la tierra seres vivientes según su género, bestias y serpientes y animales de la tierra según su especie. Y fue así.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 1, 25, NULL, 'E hizo Dios animales de la tierra según su género, y ganado según su género, y todo animal que se arrastra sobre la tierra según su especie. Y vio Dios que era bueno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 1, 26, NULL, 'Entonces dijo Dios: Hagamos al hombre a nuestra imagen, conforme a nuestra semejanza; y señoree en los peces del mar, en las aves de los cielos, en las bestias, en toda la tierra, y en todo animal que se arrastra sobre la tierra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 1, 27, NULL, 'Y creó Dios al hombre a su imagen, a imagen de Dios lo creó; varón y hembra los creó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 1, 28, NULL, 'Y los bendijo Dios, y les dijo: Fructificad y multiplicaos; llenad la tierra, y sojuzgadla, y señoread en los peces del mar, en las aves de los cielos, y en todas las bestias que se mueven sobre la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 1, 29, NULL, 'Y dijo Dios: He aquí que os he dado toda planta que da semilla, que está sobre toda la tierra, y todo árbol en que hay fruto y que da semilla; os serán para comer.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 1, 30, NULL, 'Y a toda bestia de la tierra, y a todas las aves de los cielos, y a todo lo que se arrastra sobre la tierra, en que hay vida, toda planta verde les será para comer. Y fue así.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 1, 31, NULL, 'Y vio Dios todo lo que había hecho, y he aquí que era bueno en gran manera. Y fue la tarde y la mañana el día sexto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 2, 1, NULL, 'Fueron, pues, acabados los cielos y la tierra, y todo el ejército de ellos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 2, 2, NULL, 'Y acabó Dios en el día séptimo la obra que hizo; y reposó el día séptimo de toda la obra que hizo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 2, 3, NULL, 'Y bendijo Dios al día séptimo, y lo santificó, porque en él reposó de toda la obra que había hecho en la creación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 2, 4, 'El hombre en el huerto de Edén', 'Estos son los orígenes de los cielos y de la tierra cuando fueron creados, el día que Jehová Dios hizo la tierra y los cielos,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 2, 5, NULL, 'y toda planta del campo antes que fuese en la tierra, y toda hierba del campo antes que naciese; porque Jehová Dios aún no había hecho llover sobre la tierra, ni había hombre para que labrase la tierra,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 2, 6, NULL, 'sino que subía de la tierra un vapor, el cual regaba toda la faz de la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 2, 7, NULL, 'Entonces Jehová Dios formó al hombre del polvo de la tierra, y sopló en su nariz aliento de vida, y fue el hombre un ser viviente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 2, 8, NULL, 'Y Jehová Dios plantó un huerto en Edén, al oriente; y puso allí al hombre que había formado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 2, 9, NULL, 'Y Jehová Dios hizo nacer de la tierra todo árbol delicioso a la vista, y bueno para comer; también el árbol de vida en medio del huerto, y el árbol de la ciencia del bien y del mal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 2, 10, NULL, 'Y salía de Edén un río para regar el huerto, y de allí se repartía en cuatro brazos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 2, 11, NULL, 'El nombre del uno era Pisón; este es el que rodea toda la tierra de Havila, donde hay oro;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 2, 12, NULL, 'y el oro de aquella tierra es bueno; hay allí también bedelio y ónice.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 2, 13, NULL, 'El nombre del segundo río es Gihón; este es el que rodea toda la tierra de Cus.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 2, 14, NULL, 'Y el nombre del tercer río es Hidekel; este es el que va al oriente de Asiria. Y el cuarto río es el Éufrates.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 2, 15, NULL, 'Tomó, pues, Jehová Dios al hombre, y lo puso en el huerto de Edén, para que lo labrara y lo guardase.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 2, 16, NULL, 'Y mandó Jehová Dios al hombre, diciendo: De todo árbol del huerto podrás comer;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 2, 17, NULL, 'mas del árbol de la ciencia del bien y del mal no comerás; porque el día que de él comieres, ciertamente morirás.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 2, 18, NULL, 'Y dijo Jehová Dios: No es bueno que el hombre esté solo; le haré ayuda idónea para él.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 2, 19, NULL, 'Jehová Dios formó, pues, de la tierra toda bestia del campo, y toda ave de los cielos, y las trajo a Adán para que viese cómo las había de llamar; y todo lo que Adán llamó a los animales vivientes, ese es su nombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 2, 20, NULL, 'Y puso Adán nombre a toda bestia y ave de los cielos y a todo ganado del campo; mas para Adán no se halló ayuda idónea para él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 2, 21, NULL, 'Entonces Jehová Dios hizo caer sueño profundo sobre Adán, y mientras este dormía, tomó una de sus costillas, y cerró la carne en su lugar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 2, 22, NULL, 'Y de la costilla que Jehová Dios tomó del hombre, hizo una mujer, y la trajo al hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 2, 23, NULL, 'Dijo entonces Adán: Esto es ahora hueso de mis huesos y carne de mi carne; esta será llamada Varona, porque del varón fue tomada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 2, 24, NULL, 'Por tanto, dejará el hombre a su padre y a su madre, y se unirá a su mujer, y serán una sola carne.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 2, 25, NULL, 'Y estaban ambos desnudos, Adán y su mujer, y no se avergonzaban.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 3, 1, 'Desobediencia del hombre', 'Pero la serpiente era astuta, más que todos los animales del campo que Jehová Dios había hecho; la cual dijo a la mujer: ¿Conque Dios os ha dicho: No comáis de todo árbol del huerto?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 3, 2, NULL, 'Y la mujer respondió a la serpiente: Del fruto de los árboles del huerto podemos comer;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 3, 3, NULL, 'pero del fruto del árbol que está en medio del huerto dijo Dios: No comeréis de él, ni le tocaréis, para que no muráis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 3, 4, NULL, 'Entonces la serpiente dijo a la mujer: No moriréis;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 3, 5, NULL, 'sino que sabe Dios que el día que comáis de él, serán abiertos vuestros ojos, y seréis como Dios, sabiendo el bien y el mal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 3, 6, NULL, 'Y vio la mujer que el árbol era bueno para comer, y que era agradable a los ojos, y árbol codiciable para alcanzar la sabiduría; y tomó de su fruto, y comió; y dio también a su marido, el cual comió así como ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 3, 7, NULL, 'Entonces fueron abiertos los ojos de ambos, y conocieron que estaban desnudos; entonces cosieron hojas de higuera, y se hicieron delantales.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 3, 8, NULL, 'Y oyeron la voz de Jehová Dios que se paseaba en el huerto, al aire del día; y el hombre y su mujer se escondieron de la presencia de Jehová Dios entre los árboles del huerto.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 3, 9, NULL, 'Mas Jehová Dios llamó al hombre, y le dijo: ¿Dónde estás tú?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 3, 10, NULL, 'Y él respondió: Oí tu voz en el huerto, y tuve miedo, porque estaba desnudo; y me escondí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 3, 11, NULL, 'Y Dios le dijo: ¿Quién te enseñó que estabas desnudo? ¿Has comido del árbol del que yo te mandé no comieses?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 3, 12, NULL, 'Y el hombre respondió: La mujer que me diste por compañera me dio del árbol, y yo comí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 3, 13, NULL, 'Entonces Jehová Dios dijo a la mujer: ¿Qué es lo que has hecho? Y dijo la mujer: La serpiente me engañó, y comí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 3, 14, NULL, 'Y Jehová Dios dijo a la serpiente: Por cuanto esto hiciste, maldita serás entre todas las bestias y entre todos los animales del campo; sobre tu pecho andarás, y polvo comerás todos los días de tu vida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 3, 15, NULL, 'Y pondré enemistad entre ti y la mujer, y entre tu simiente y la simiente suya; esta te herirá en la cabeza, y tú le herirás en el calcañar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 3, 16, NULL, 'A la mujer dijo: Multiplicaré en gran manera los dolores en tus preñeces; con dolor darás a luz los hijos; y tu deseo será para tu marido, y él se enseñoreará de ti.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 3, 17, NULL, 'Y al hombre dijo: Por cuanto obedeciste a la voz de tu mujer, y comiste del árbol de que te mandé diciendo: No comerás de él; maldita será la tierra por tu causa; con dolor comerás de ella todos los días de tu vida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 3, 18, NULL, 'Espinos y cardos te producirá, y comerás plantas del campo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 3, 19, NULL, 'Con el sudor de tu rostro comerás el pan hasta que vuelvas a la tierra, porque de ella fuiste tomado; pues polvo eres, y al polvo volverás.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 3, 20, NULL, 'Y llamó Adán el nombre de su mujer, Eva, por cuanto ella era madre de todos los vivientes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 3, 21, NULL, 'Y Jehová Dios hizo al hombre y a su mujer túnicas de pieles, y los vistió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 3, 22, NULL, 'Y dijo Jehová Dios: He aquí el hombre es como uno de nosotros, sabiendo el bien y el mal; ahora, pues, que no alargue su mano, y tome también del árbol de la vida, y coma, y viva para siempre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 3, 23, NULL, 'Y lo sacó Jehová del huerto de Edén, para que labrase la tierra de que fue tomado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 3, 24, NULL, 'Echó, pues, fuera al hombre, y puso al oriente del huerto de Edén querubines, y una espada encendida que se revolvía por todos lados, para guardar el camino del árbol de la vida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 4, 1, 'Caín y Abel', 'Conoció Adán a su mujer Eva, la cual concibió y dio a luz a Caín, y dijo: Por voluntad de Jehová he adquirido varón.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 4, 2, NULL, 'Después dio a luz a su hermano Abel. Y Abel fue pastor de ovejas, y Caín fue labrador de la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 4, 3, NULL, 'Y aconteció andando el tiempo, que Caín trajo del fruto de la tierra una ofrenda a Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 4, 4, NULL, 'Y Abel trajo también de los primogénitos de sus ovejas, de lo más gordo de ellas. Y miró Jehová con agrado a Abel y a su ofrenda;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 4, 5, NULL, 'pero no miró con agrado a Caín y a la ofrenda suya. Y se ensañó Caín en gran manera, y decayó su semblante.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 4, 6, NULL, 'Entonces Jehová dijo a Caín: ¿Por qué te has ensañado, y por qué ha decaído tu semblante?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 4, 7, NULL, 'Si bien hicieres, ¿no serás enaltecido? y si no hicieres bien, el pecado está a la puerta; con todo esto, a ti será su deseo, y tú te enseñorearás de él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 4, 8, NULL, 'Y dijo Caín a su hermano Abel: Salgamos al campo. Y aconteció que estando ellos en el campo, Caín se levantó contra su hermano Abel, y lo mató.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 4, 9, NULL, 'Y Jehová dijo a Caín: ¿Dónde está Abel tu hermano? Y él respondió: No sé. ¿Soy yo acaso guarda de mi hermano?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 4, 10, NULL, 'Y él le dijo: ¿Qué has hecho? La voz de la sangre de tu hermano clama a mí desde la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 4, 11, NULL, 'Ahora, pues, maldito seas tú de la tierra, que abrió su boca para recibir de tu mano la sangre de tu hermano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 4, 12, NULL, 'Cuando labres la tierra, no te volverá a dar su fuerza; errante y extranjero serás en la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 4, 13, NULL, 'Y dijo Caín a Jehová: Grande es mi castigo para ser soportado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 4, 14, NULL, 'He aquí me echas hoy de la tierra, y de tu presencia me esconderé, y seré errante y extranjero en la tierra; y sucederá que cualquiera que me hallare, me matará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 4, 15, NULL, 'Y le respondió Jehová: Ciertamente cualquiera que matare a Caín, siete veces será castigado. Entonces Jehová puso señal en Caín, para que no lo matase cualquiera que le hallara.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 4, 16, NULL, 'Salió, pues, Caín de delante de Jehová, y habitó en tierra de Nod, al oriente de Edén.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 4, 17, NULL, 'Y conoció Caín a su mujer, la cual concibió y dio a luz a Enoc; y edificó una ciudad, y llamó el nombre de la ciudad del nombre de su hijo, Enoc.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 4, 18, NULL, 'Y a Enoc le nació Irad, e Irad engendró a Mehujael, y Mehujael engendró a Metusael, y Metusael engendró a Lamec.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 4, 19, NULL, 'Y Lamec tomó para sí dos mujeres; el nombre de la una fue Ada, y el nombre de la otra, Zila.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 4, 20, NULL, 'Y Ada dio a luz a Jabal, el cual fue padre de los que habitan en tiendas y crían ganados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 4, 21, NULL, 'Y el nombre de su hermano fue Jubal, el cual fue padre de todos los que tocan arpa y flauta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 4, 22, NULL, 'Y Zila también dio a luz a Tubal-caín, artífice de toda obra de bronce y de hierro; y la hermana de Tubal-caín fue Naama.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 4, 23, NULL, 'Y dijo Lamec a sus mujeres: Ada y Zila, oíd mi voz; Mujeres de Lamec, escuchad mi dicho: Que un varón mataré por mi herida, Y un joven por mi golpe.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 4, 24, NULL, 'Si siete veces será vengado Caín, Lamec en verdad setenta veces siete lo será.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 4, 25, NULL, 'Y conoció de nuevo Adán a su mujer, la cual dio a luz un hijo, y llamó su nombre Set: Porque Dios (dijo ella) me ha sustituido otro hijo en lugar de Abel, a quien mató Caín.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 4, 26, NULL, 'Y a Set también le nació un hijo, y llamó su nombre Enós. Entonces los hombres comenzaron a invocar el nombre de Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 5, 1, 'Los descendientes de Adán', 'Este es el libro de las generaciones de Adán. El día en que creó Dios al hombre, a semejanza de Dios lo hizo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 5, 2, NULL, 'Varón y hembra los creó; y los bendijo, y llamó el nombre de ellos Adán, el día en que fueron creados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 5, 3, NULL, 'Y vivió Adán ciento treinta años, y engendró un hijo a su semejanza, conforme a su imagen, y llamó su nombre Set.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 5, 4, NULL, 'Y fueron los días de Adán después que engendró a Set, ochocientos años, y engendró hijos e hijas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 5, 5, NULL, 'Y fueron todos los días que vivió Adán novecientos treinta años; y murió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 5, 6, NULL, 'Vivió Set ciento cinco años, y engendró a Enós.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 5, 7, NULL, 'Y vivió Set, después que engendró a Enós, ochocientos siete años, y engendró hijos e hijas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 5, 8, NULL, 'Y fueron todos los días de Set novecientos doce años; y murió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 5, 9, NULL, 'Vivió Enós noventa años, y engendró a Cainán.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 5, 10, NULL, 'Y vivió Enós, después que engendró a Cainán, ochocientos quince años, y engendró hijos e hijas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 5, 11, NULL, 'Y fueron todos los días de Enós novecientos cinco años; y murió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 5, 12, NULL, 'Vivió Cainán setenta años, y engendró a Mahalaleel.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 5, 13, NULL, 'Y vivió Cainán, después que engendró a Mahalaleel, ochocientos cuarenta años, y engendró hijos e hijas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 5, 14, NULL, 'Y fueron todos los días de Cainán novecientos diez años; y murió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 5, 15, NULL, 'Vivió Mahalaleel sesenta y cinco años, y engendró a Jared.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 5, 16, NULL, 'Y vivió Mahalaleel, después que engendró a Jared, ochocientos treinta años, y engendró hijos e hijas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 5, 17, NULL, 'Y fueron todos los días de Mahalaleel ochocientos noventa y cinco años; y murió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 5, 18, NULL, 'Vivió Jared ciento sesenta y dos años, y engendró a Enoc.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 5, 19, NULL, 'Y vivió Jared, después que engendró a Enoc, ochocientos años, y engendró hijos e hijas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 5, 20, NULL, 'Y fueron todos los días de Jared novecientos sesenta y dos años; y murió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 5, 21, NULL, 'Vivió Enoc sesenta y cinco años, y engendró a Matusalén.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 5, 22, NULL, 'Y caminó Enoc con Dios, después que engendró a Matusalén, trescientos años, y engendró hijos e hijas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 5, 23, NULL, 'Y fueron todos los días de Enoc trescientos sesenta y cinco años.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 5, 24, NULL, 'Caminó, pues, Enoc con Dios, y desapareció, porque le llevó Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 5, 25, NULL, 'Vivió Matusalén ciento ochenta y siete años, y engendró a Lamec.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 5, 26, NULL, 'Y vivió Matusalén, después que engendró a Lamec, setecientos ochenta y dos años, y engendró hijos e hijas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 5, 27, NULL, 'Fueron, pues, todos los días de Matusalén novecientos sesenta y nueve años; y murió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 5, 28, NULL, 'Vivió Lamec ciento ochenta y dos años, y engendró un hijo;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 5, 29, NULL, 'y llamó su nombre Noé, diciendo: Este nos aliviará de nuestras obras y del trabajo de nuestras manos, a causa de la tierra que Jehová maldijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 5, 30, NULL, 'Y vivió Lamec, después que engendró a Noé, quinientos noventa y cinco años, y engendró hijos e hijas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 5, 31, NULL, 'Y fueron todos los días de Lamec setecientos setenta y siete años; y murió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 5, 32, NULL, 'Y siendo Noé de quinientos años, engendró a Sem, a Cam y a Jafet.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 6, 1, 'La maldad de los hombres', 'Aconteció que cuando comenzaron los hombres a multiplicarse sobre la faz de la tierra, y les nacieron hijas,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 6, 2, NULL, 'que viendo los hijos de Dios que las hijas de los hombres eran hermosas, tomaron para sí mujeres, escogiendo entre todas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 6, 3, NULL, 'Y dijo Jehová: No contenderá mi espíritu con el hombre para siempre, porque ciertamente él es carne; mas serán sus días ciento veinte años.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 6, 4, NULL, 'Había gigantes en la tierra en aquellos días, y también después que se llegaron los hijos de Dios a las hijas de los hombres, y les engendraron hijos. Estos fueron los valientes que desde la antigüedad fueron varones de renombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 6, 5, NULL, 'Y vio Jehová que la maldad de los hombres era mucha en la tierra, y que todo designio de los pensamientos del corazón de ellos era de continuo solamente el mal.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 6, 6, NULL, 'Y se arrepintió Jehová de haber hecho hombre en la tierra, y le dolió en su corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 6, 7, NULL, 'Y dijo Jehová: Raeré de sobre la faz de la tierra a los hombres que he creado, desde el hombre hasta la bestia, y hasta el reptil y las aves del cielo; pues me arrepiento de haberlos hecho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 6, 8, NULL, 'Pero Noé halló gracia ante los ojos de Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 6, 9, 'Noé construye el arca', 'Estas son las generaciones de Noé: Noé, varón justo, era perfecto en sus generaciones; con Dios caminó Noé.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 6, 10, NULL, 'Y engendró Noé tres hijos: a Sem, a Cam y a Jafet.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 6, 11, NULL, 'Y se corrompió la tierra delante de Dios, y estaba la tierra llena de violencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 6, 12, NULL, 'Y miró Dios la tierra, y he aquí que estaba corrompida; porque toda carne había corrompido su camino sobre la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 6, 13, NULL, 'Dijo, pues, Dios a Noé: He decidido el fin de todo ser, porque la tierra está llena de violencia a causa de ellos; y he aquí que yo los destruiré con la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 6, 14, NULL, 'Hazte un arca de madera de gofer; harás aposentos en el arca, y la calafatearás con brea por dentro y por fuera.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 6, 15, NULL, 'Y de esta manera la harás: de trescientos codos la longitud del arca, de cincuenta codos su anchura, y de treinta codos su altura.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 6, 16, NULL, 'Una ventana harás al arca, y la acabarás a un codo de elevación por la parte de arriba; y pondrás la puerta del arca a su lado; y le harás piso bajo, segundo y tercero.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 6, 17, NULL, 'Y he aquí que yo traigo un diluvio de aguas sobre la tierra, para destruir toda carne en que haya espíritu de vida debajo del cielo; todo lo que hay en la tierra morirá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 6, 18, NULL, 'Mas estableceré mi pacto contigo, y entrarás en el arca tú, tus hijos, tu mujer, y las mujeres de tus hijos contigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 6, 19, NULL, 'Y de todo lo que vive, de toda carne, dos de cada especie meterás en el arca, para que tengan vida contigo; macho y hembra serán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 6, 20, NULL, 'De las aves según su especie, y de las bestias según su especie, de todo reptil de la tierra según su especie, dos de cada especie entrarán contigo, para que tengan vida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 6, 21, NULL, 'Y toma contigo de todo alimento que se come, y almacénalo, y servirá de sustento para ti y para ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 6, 22, NULL, 'Y lo hizo así Noé; hizo conforme a todo lo que Dios le mandó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 7, 1, 'El diluvio', 'Dijo luego Jehová a Noé: Entra tú y toda tu casa en el arca; porque a ti he visto justo delante de mí en esta generación.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 7, 2, NULL, 'De todo animal limpio tomarás siete parejas, macho y su hembra; mas de los animales que no son limpios, una pareja, el macho y su hembra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 7, 3, NULL, 'También de las aves de los cielos, siete parejas, macho y hembra, para conservar viva la especie sobre la faz de la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 7, 4, NULL, 'Porque pasados aún siete días, yo haré llover sobre la tierra cuarenta días y cuarenta noches; y raeré de sobre la faz de la tierra a todo ser viviente que hice.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 7, 5, NULL, 'E hizo Noé conforme a todo lo que le mandó Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 7, 6, NULL, 'Era Noé de seiscientos años cuando el diluvio de las aguas vino sobre la tierra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 7, 7, NULL, 'Y por causa de las aguas del diluvio entró Noé al arca, y con él sus hijos, su mujer, y las mujeres de sus hijos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 7, 8, NULL, 'De los animales limpios, y de los animales que no eran limpios, y de las aves, y de todo lo que se arrastra sobre la tierra,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 7, 9, NULL, 'de dos en dos entraron con Noé en el arca; macho y hembra, como mandó Dios a Noé.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 7, 10, NULL, 'Y sucedió que al séptimo día las aguas del diluvio vinieron sobre la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 7, 11, NULL, 'El año seiscientos de la vida de Noé, en el mes segundo, a los diecisiete días del mes, aquel día fueron rotas todas las fuentes del grande abismo, y las cataratas de los cielos fueron abiertas,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 7, 12, NULL, 'y hubo lluvia sobre la tierra cuarenta días y cuarenta noches.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 7, 13, NULL, 'En este mismo día entraron Noé, y Sem, Cam y Jafet hijos de Noé, la mujer de Noé, y las tres mujeres de sus hijos, con él en el arca;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 7, 14, NULL, 'ellos, y todos los animales silvestres según sus especies, y todos los animales domesticados según sus especies, y todo reptil que se arrastra sobre la tierra según su especie, y toda ave según su especie, y todo pájaro de toda especie.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 7, 15, NULL, 'Vinieron, pues, con Noé al arca, de dos en dos de toda carne en que había espíritu de vida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 7, 16, NULL, 'Y los que vinieron, macho y hembra de toda carne vinieron, como le había mandado Dios; y Jehová le cerró la puerta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 7, 17, NULL, 'Y fue el diluvio cuarenta días sobre la tierra; y las aguas crecieron, y alzaron el arca, y se elevó sobre la tierra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 7, 18, NULL, 'Y subieron las aguas y crecieron en gran manera sobre la tierra; y flotaba el arca sobre la superficie de las aguas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 7, 19, NULL, 'Y las aguas subieron mucho sobre la tierra; y todos los montes altos que había debajo de todos los cielos, fueron cubiertos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 7, 20, NULL, 'Quince codos más alto subieron las aguas, después que fueron cubiertos los montes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 7, 21, NULL, 'Y murió toda carne que se mueve sobre la tierra, así de aves como de ganado y de bestias, y de todo reptil que se arrastra sobre la tierra, y todo hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 7, 22, NULL, 'Todo lo que tenía aliento de espíritu de vida en sus narices, todo lo que había en la tierra, murió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 7, 23, NULL, 'Así fue destruido todo ser que vivía sobre la faz de la tierra, desde el hombre hasta la bestia, los reptiles, y las aves del cielo; y fueron raídos de la tierra, y quedó solamente Noé, y los que con él estaban en el arca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 7, 24, NULL, 'Y prevalecieron las aguas sobre la tierra ciento cincuenta días.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 8, 1, NULL, 'Y se acordó Dios de Noé, y de todos los animales, y de todas las bestias que estaban con él en el arca; e hizo pasar Dios un viento sobre la tierra, y disminuyeron las aguas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 8, 2, NULL, 'Y se cerraron las fuentes del abismo y las cataratas de los cielos; y la lluvia de los cielos fue detenida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 8, 3, NULL, 'Y las aguas decrecían gradualmente de sobre la tierra; y se retiraron las aguas al cabo de ciento cincuenta días.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 8, 4, NULL, 'Y reposó el arca en el mes séptimo, a los diecisiete días del mes, sobre los montes de Ararat.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 8, 5, NULL, 'Y las aguas fueron decreciendo hasta el mes décimo; en el décimo, al primero del mes, se descubrieron las cimas de los montes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 8, 6, NULL, 'Sucedió que al cabo de cuarenta días abrió Noé la ventana del arca que había hecho,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 8, 7, NULL, 'y envió un cuervo, el cual salió, y estuvo yendo y volviendo hasta que las aguas se secaron sobre la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 8, 8, NULL, 'Envió también de sí una paloma, para ver si las aguas se habían retirado de sobre la faz de la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 8, 9, NULL, 'Y no halló la paloma donde sentar la planta de su pie, y volvió a él al arca, porque las aguas estaban aún sobre la faz de toda la tierra. Entonces él extendió su mano, y tomándola, la hizo entrar consigo en el arca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 8, 10, NULL, 'Esperó aún otros siete días, y volvió a enviar la paloma fuera del arca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 8, 11, NULL, 'Y la paloma volvió a él a la hora de la tarde; y he aquí que traía una hoja de olivo en el pico; y entendió Noé que las aguas se habían retirado de sobre la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 8, 12, NULL, 'Y esperó aún otros siete días, y envió la paloma, la cual no volvió ya más a él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 8, 13, NULL, 'Y sucedió que en el año seiscientos uno de Noé, en el mes primero, el día primero del mes, las aguas se secaron sobre la tierra; y quitó Noé la cubierta del arca, y miró, y he aquí que la faz de la tierra estaba seca.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 8, 14, NULL, 'Y en el mes segundo, a los veintisiete días del mes, se secó la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 8, 15, NULL, 'Entonces habló Dios a Noé, diciendo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 8, 16, NULL, 'Sal del arca tú, y tu mujer, y tus hijos, y las mujeres de tus hijos contigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 8, 17, NULL, 'Todos los animales que están contigo de toda carne, de aves y de bestias y de todo reptil que se arrastra sobre la tierra, sacarás contigo; y vayan por la tierra, y fructifiquen y multiplíquense sobre la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 8, 18, NULL, 'Entonces salió Noé, y sus hijos, su mujer, y las mujeres de sus hijos con él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 8, 19, NULL, 'Todos los animales, y todo reptil y toda ave, todo lo que se mueve sobre la tierra según sus especies, salieron del arca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 8, 20, NULL, 'Y edificó Noé un altar a Jehová, y tomó de todo animal limpio y de toda ave limpia, y ofreció holocausto en el altar.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 8, 21, NULL, 'Y percibió Jehová olor grato; y dijo Jehová en su corazón: No volveré más a maldecir la tierra por causa del hombre; porque el intento del corazón del hombre es malo desde su juventud; ni volveré más a destruir todo ser viviente, como he hecho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 8, 22, NULL, 'Mientras la tierra permanezca, no cesarán la sementera y la siega, el frío y el calor, el verano y el invierno, y el día y la noche.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 9, 1, 'Pacto de Dios con Noé', 'Bendijo Dios a Noé y a sus hijos, y les dijo: Fructificad y multiplicaos, y llenad la tierra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 9, 2, NULL, 'El temor y el miedo de vosotros estarán sobre todo animal de la tierra, y sobre toda ave de los cielos, en todo lo que se mueva sobre la tierra, y en todos los peces del mar; en vuestra mano son entregados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 9, 3, NULL, 'Todo lo que se mueve y vive, os será para mantenimiento: así como las legumbres y plantas verdes, os lo he dado todo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 9, 4, NULL, 'Pero carne con su vida, que es su sangre, no comeréis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 9, 5, NULL, 'Porque ciertamente demandaré la sangre de vuestras vidas; de mano de todo animal la demandaré, y de mano del hombre; de mano del varón su hermano demandaré la vida del hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 9, 6, NULL, 'El que derramare sangre de hombre, por el hombre su sangre será derramada; porque a imagen de Dios es hecho el hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 9, 7, NULL, 'Mas vosotros fructificad y multiplicaos; procread abundantemente en la tierra, y multiplicaos en ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 9, 8, NULL, 'Y habló Dios a Noé y a sus hijos con él, diciendo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 9, 9, NULL, 'He aquí que yo establezco mi pacto con vosotros, y con vuestros descendientes después de vosotros;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 9, 10, NULL, 'y con todo ser viviente que está con vosotros; aves, animales y toda bestia de la tierra que está con vosotros, desde todos los que salieron del arca hasta todo animal de la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 9, 11, NULL, 'Estableceré mi pacto con vosotros, y no exterminaré ya más toda carne con aguas de diluvio, ni habrá más diluvio para destruir la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 9, 12, NULL, 'Y dijo Dios: Esta es la señal del pacto que yo establezco entre mí y vosotros y todo ser viviente que está con vosotros, por siglos perpetuos:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 9, 13, NULL, 'Mi arco he puesto en las nubes, el cual será por señal del pacto entre mí y la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 9, 14, NULL, 'Y sucederá que cuando haga venir nubes sobre la tierra, se dejará ver entonces mi arco en las nubes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 9, 15, NULL, 'Y me acordaré del pacto mío, que hay entre mí y vosotros y todo ser viviente de toda carne; y no habrá más diluvio de aguas para destruir toda carne.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 9, 16, NULL, 'Estará el arco en las nubes, y lo veré, y me acordaré del pacto perpetuo entre Dios y todo ser viviente, con toda carne que hay sobre la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 9, 17, NULL, 'Dijo, pues, Dios a Noé: Esta es la señal del pacto que he establecido entre mí y toda carne que está sobre la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 9, 18, 'Embriaguez de Noé', 'Y los hijos de Noé que salieron del arca fueron Sem, Cam y Jafet; y Cam es el padre de Canaán.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 9, 19, NULL, 'Estos tres son los hijos de Noé, y de ellos fue llena toda la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 9, 20, NULL, 'Después comenzó Noé a labrar la tierra, y plantó una viña;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 9, 21, NULL, 'y bebió del vino, y se embriagó, y estaba descubierto en medio de su tienda.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 9, 22, NULL, 'Y Cam, padre de Canaán, vio la desnudez de su padre, y lo dijo a sus dos hermanos que estaban afuera.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 9, 23, NULL, 'Entonces Sem y Jafet tomaron la ropa, y la pusieron sobre sus propios hombros, y andando hacia atrás, cubrieron la desnudez de su padre, teniendo vueltos sus rostros, y así no vieron la desnudez de su padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 9, 24, NULL, 'Y despertó Noé de su embriaguez, y supo lo que le había hecho su hijo más joven,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 9, 25, NULL, 'y dijo: Maldito sea Canaán; Siervo de siervos será a sus hermanos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 9, 26, NULL, 'Dijo más: Bendito por Jehová mi Dios sea Sem, Y sea Canaán su siervo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 9, 27, NULL, 'Engrandezca Dios a Jafet, Y habite en las tiendas de Sem, Y sea Canaán su siervo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 9, 28, NULL, 'Y vivió Noé después del diluvio trescientos cincuenta años.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 9, 29, NULL, 'Y fueron todos los días de Noé novecientos cincuenta años; y murió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 10, 1, 'Los descendientes de los hijos de Noé', 'Estas son las generaciones de los hijos de Noé: Sem, Cam y Jafet, a quienes nacieron hijos después del diluvio.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 10, 2, NULL, 'Los hijos de Jafet: Gomer, Magog, Madai, Javán, Tubal, Mesec y Tiras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 10, 3, NULL, 'Los hijos de Gomer: Askenaz, Rifat y Togarma.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 10, 4, NULL, 'Los hijos de Javán: Elisa, Tarsis, Quitim y Dodanim.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 10, 5, NULL, 'De estos se poblaron las costas, cada cual según su lengua, conforme a sus familias en sus naciones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 10, 6, NULL, 'Los hijos de Cam: Cus, Mizraim, Fut y Canaán.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 10, 7, NULL, 'Y los hijos de Cus: Seba, Havila, Sabta, Raama y Sabteca. Y los hijos de Raama: Seba y Dedán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 10, 8, NULL, 'Y Cus engendró a Nimrod, quien llegó a ser el primer poderoso en la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 10, 9, NULL, 'Este fue vigoroso cazador delante de Jehová; por lo cual se dice: Así como Nimrod, vigoroso cazador delante de Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 10, 10, NULL, 'Y fue el comienzo de su reino Babel, Erec, Acad y Calne, en la tierra de Sinar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 10, 11, NULL, 'De esta tierra salió para Asiria, y edificó Nínive, Rehobot, Cala,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 10, 12, NULL, 'y Resén entre Nínive y Cala, la cual es ciudad grande.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 10, 13, NULL, 'Mizraim engendró a Ludim, a Anamim, a Lehabim, a Naftuhim,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 10, 14, NULL, 'a Patrusim, a Casluhim, de donde salieron los filisteos, y a Caftorim.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 10, 15, NULL, 'Y Canaán engendró a Sidón su primogénito, a Het,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 10, 16, NULL, 'al jebuseo, al amorreo, al gergeseo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 10, 17, NULL, 'al heveo, al araceo, al sineo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 10, 18, NULL, 'al arvadeo, al zemareo y al hamateo; y después se dispersaron las familias de los cananeos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 10, 19, NULL, 'Y fue el territorio de los cananeos desde Sidón, en dirección a Gerar, hasta Gaza; y en dirección de Sodoma, Gomorra, Adma y Zeboim, hasta Lasa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 10, 20, NULL, 'Estos son los hijos de Cam por sus familias, por sus lenguas, en sus tierras, en sus naciones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 10, 21, NULL, 'También le nacieron hijos a Sem, padre de todos los hijos de Heber, y hermano mayor de Jafet.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 10, 22, NULL, 'Los hijos de Sem fueron Elam, Asur, Arfaxad, Lud y Aram.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 10, 23, NULL, 'Y los hijos de Aram: Uz, Hul, Geter y Mas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 10, 24, NULL, 'Arfaxad engendró a Sala, y Sala engendró a Heber.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 10, 25, NULL, 'Y a Heber nacieron dos hijos: el nombre del uno fue Peleg, porque en sus días fue repartida la tierra; y el nombre de su hermano, Joctán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 10, 26, NULL, 'Y Joctán engendró a Almodad, Selef, Hazar-mavet, Jera,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 10, 27, NULL, 'Adoram, Uzal, Dicla,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 10, 28, NULL, 'Obal, Abimael, Seba,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 10, 29, NULL, 'Ofir, Havila y Jobab; todos estos fueron hijos de Joctán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 10, 30, NULL, 'Y la tierra en que habitaron fue desde Mesa en dirección de Sefar, hasta la región montañosa del oriente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 10, 31, NULL, 'Estos fueron los hijos de Sem por sus familias, por sus lenguas, en sus tierras, en sus naciones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 10, 32, NULL, 'Estas son las familias de los hijos de Noé por sus descendencias, en sus naciones; y de estos se esparcieron las naciones en la tierra después del diluvio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 11, 1, 'La torre de Babel', 'Tenía entonces toda la tierra una sola lengua y unas mismas palabras.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 11, 2, NULL, 'Y aconteció que cuando salieron de oriente, hallaron una llanura en la tierra de Sinar, y se establecieron allí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 11, 3, NULL, 'Y se dijeron unos a otros: Vamos, hagamos ladrillo y cozámoslo con fuego. Y les sirvió el ladrillo en lugar de piedra, y el asfalto en lugar de mezcla.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 11, 4, NULL, 'Y dijeron: Vamos, edifiquémonos una ciudad y una torre, cuya cúspide llegue al cielo; y hagámonos un nombre, por si fuéremos esparcidos sobre la faz de toda la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 11, 5, NULL, 'Y descendió Jehová para ver la ciudad y la torre que edificaban los hijos de los hombres.', 0, 'spa', 'RVR1960', NULL);\n"
;

  public static final String SQL_PARTE_2 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Gn', 11, 6, NULL, 'Y dijo Jehová: He aquí el pueblo es uno, y todos estos tienen un solo lenguaje; y han comenzado la obra, y nada les hará desistir ahora de lo que han pensado hacer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 11, 7, NULL, 'Ahora, pues, descendamos, y confundamos allí su lengua, para que ninguno entienda el habla de su compañero.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 11, 8, NULL, 'Así los esparció Jehová desde allí sobre la faz de toda la tierra, y dejaron de edificar la ciudad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 11, 9, NULL, 'Por esto fue llamado el nombre de ella Babel, porque allí confundió Jehová el lenguaje de toda la tierra, y desde allí los esparció sobre la faz de toda la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 11, 10, 'Los descendientes de Sem', 'Estas son las generaciones de Sem: Sem, de edad de cien años, engendró a Arfaxad, dos años después del diluvio.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 11, 11, NULL, 'Y vivió Sem, después que engendró a Arfaxad, quinientos años, y engendró hijos e hijas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 11, 12, NULL, 'Arfaxad vivió treinta y cinco años, y engendró a Sala.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 11, 13, NULL, 'Y vivió Arfaxad, después que engendró a Sala, cuatrocientos tres años, y engendró hijos e hijas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 11, 14, NULL, 'Sala vivió treinta años, y engendró a Heber.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 11, 15, NULL, 'Y vivió Sala, después que engendró a Heber, cuatrocientos tres años, y engendró hijos e hijas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 11, 16, NULL, 'Heber vivió treinta y cuatro años, y engendró a Peleg.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 11, 17, NULL, 'Y vivió Heber, después que engendró a Peleg, cuatrocientos treinta años, y engendró hijos e hijas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 11, 18, NULL, 'Peleg vivió treinta años, y engendró a Reu.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 11, 19, NULL, 'Y vivió Peleg, después que engendró a Reu, doscientos nueve años, y engendró hijos e hijas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 11, 20, NULL, 'Reu vivió treinta y dos años, y engendró a Serug.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 11, 21, NULL, 'Y vivió Reu, después que engendró a Serug, doscientos siete años, y engendró hijos e hijas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 11, 22, NULL, 'Serug vivió treinta años, y engendró a Nacor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 11, 23, NULL, 'Y vivió Serug, después que engendró a Nacor, doscientos años, y engendró hijos e hijas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 11, 24, NULL, 'Nacor vivió veintinueve años, y engendró a Taré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 11, 25, NULL, 'Y vivió Nacor, después que engendró a Taré, ciento diecinueve años, y engendró hijos e hijas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 11, 26, NULL, 'Taré vivió setenta años, y engendró a Abram, a Nacor y a Harán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 11, 27, 'Los descendientes de Taré', 'Estas son las generaciones de Taré: Taré engendró a Abram, a Nacor y a Harán; y Harán engendró a Lot.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 11, 28, NULL, 'Y murió Harán antes que su padre Taré en la tierra de su nacimiento, en Ur de los caldeos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 11, 29, NULL, 'Y tomaron Abram y Nacor para sí mujeres; el nombre de la mujer de Abram era Sarai, y el nombre de la mujer de Nacor, Milca, hija de Harán, padre de Milca y de Isca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 11, 30, NULL, 'Mas Sarai era estéril, y no tenía hijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 11, 31, NULL, 'Y tomó Taré a Abram su hijo, y a Lot hijo de Harán, hijo de su hijo, y a Sarai su nuera, mujer de Abram su hijo, y salió con ellos de Ur de los caldeos, para ir a la tierra de Canaán; y vinieron hasta Harán, y se quedaron allí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 11, 32, NULL, 'Y fueron los días de Taré doscientos cinco años; y murió Taré en Harán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 12, 1, 'Dios llama a Abram', 'Pero Jehová había dicho a Abram: Vete de tu tierra y de tu parentela, y de la casa de tu padre, a la tierra que te mostraré.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 12, 2, NULL, 'Y haré de ti una nación grande, y te bendeciré, y engrandeceré tu nombre, y serás bendición.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 12, 3, NULL, 'Bendeciré a los que te bendijeren, y a los que te maldijeren maldeciré; y serán benditas en ti todas las familias de la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 12, 4, NULL, 'Y se fue Abram, como Jehová le dijo; y Lot fue con él. Y era Abram de edad de setenta y cinco años cuando salió de Harán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 12, 5, NULL, 'Tomó, pues, Abram a Sarai su mujer, y a Lot hijo de su hermano, y todos sus bienes que habían ganado y las personas que habían adquirido en Harán, y salieron para ir a tierra de Canaán; y a tierra de Canaán llegaron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 12, 6, NULL, 'Y pasó Abram por aquella tierra hasta el lugar de Siquem, hasta el encino de More; y el cananeo estaba entonces en la tierra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 12, 7, NULL, 'Y apareció Jehová a Abram, y le dijo: A tu descendencia daré esta tierra. Y edificó allí un altar a Jehová, quien le había aparecido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 12, 8, NULL, 'Luego se pasó de allí a un monte al oriente de Bet-el, y plantó su tienda, teniendo a Bet-el al occidente y Hai al oriente; y edificó allí altar a Jehová, e invocó el nombre de Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 12, 9, NULL, 'Y Abram partió de allí, caminando y yendo hacia el Neguev.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 12, 10, 'Abram en Egipto', 'Hubo entonces hambre en la tierra, y descendió Abram a Egipto para morar allá; porque era grande el hambre en la tierra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 12, 11, NULL, 'Y aconteció que cuando estaba para entrar en Egipto, dijo a Sarai su mujer: He aquí, ahora conozco que eres mujer de hermoso aspecto;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 12, 12, NULL, 'y cuando te vean los egipcios, dirán: Su mujer es; y me matarán a mí, y a ti te reservarán la vida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 12, 13, NULL, 'Ahora, pues, di que eres mi hermana, para que me vaya bien por causa tuya, y viva mi alma por causa de ti.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 12, 14, NULL, 'Y aconteció que cuando entró Abram en Egipto, los egipcios vieron que la mujer era hermosa en gran manera.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 12, 15, NULL, 'También la vieron los príncipes de Faraón, y la alabaron delante de él; y fue llevada la mujer a casa de Faraón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 12, 16, NULL, 'E hizo bien a Abram por causa de ella; y él tuvo ovejas, vacas, asnos, siervos, criadas, asnas y camellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 12, 17, NULL, 'Mas Jehová hirió a Faraón y a su casa con grandes plagas, por causa de Sarai mujer de Abram.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 12, 18, NULL, 'Entonces Faraón llamó a Abram, y le dijo: ¿Qué es esto que has hecho conmigo? ¿Por qué no me declaraste que era tu mujer?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 12, 19, NULL, '¿Por qué dijiste: Es mi hermana, poniéndome en ocasión de tomarla para mí por mujer? Ahora, pues, he aquí tu mujer; tómala, y vete.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 12, 20, NULL, 'Entonces Faraón dio orden a su gente acerca de Abram; y le acompañaron, y a su mujer, con todo lo que tenía.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 13, 1, 'Abram y Lot se separan', 'Subió, pues, Abram de Egipto hacia el Neguev, él y su mujer, con todo lo que tenía, y con él Lot.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 13, 2, NULL, 'Y Abram era riquísimo en ganado, en plata y en oro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 13, 3, NULL, 'Y volvió por sus jornadas desde el Neguev hacia Bet-el, hasta el lugar donde había estado antes su tienda entre Bet-el y Hai,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 13, 4, NULL, 'al lugar del altar que había hecho allí antes; e invocó allí Abram el nombre de Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 13, 5, NULL, 'También Lot, que andaba con Abram, tenía ovejas, vacas y tiendas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 13, 6, NULL, 'Y la tierra no era suficiente para que habitasen juntos, pues sus posesiones eran muchas, y no podían morar en un mismo lugar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 13, 7, NULL, 'Y hubo contienda entre los pastores del ganado de Abram y los pastores del ganado de Lot; y el cananeo y el ferezeo habitaban entonces en la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 13, 8, NULL, 'Entonces Abram dijo a Lot: No haya ahora altercado entre nosotros dos, entre mis pastores y los tuyos, porque somos hermanos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 13, 9, NULL, '¿No está toda la tierra delante de ti? Yo te ruego que te apartes de mí. Si fueres a la mano izquierda, yo iré a la derecha; y si tú a la derecha, yo iré a la izquierda.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 13, 10, NULL, 'Y alzó Lot sus ojos, y vio toda la llanura del Jordán, que toda ella era de riego, como el huerto de Jehová, como la tierra de Egipto en la dirección de Zoar, antes que destruyese Jehová a Sodoma y a Gomorra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 13, 11, NULL, 'Entonces Lot escogió para sí toda la llanura del Jordán; y se fue Lot hacia el oriente, y se apartaron el uno del otro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 13, 12, NULL, 'Abram acampó en la tierra de Canaán, en tanto que Lot habitó en las ciudades de la llanura, y fue poniendo sus tiendas hasta Sodoma.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 13, 13, NULL, 'Mas los hombres de Sodoma eran malos y pecadores contra Jehová en gran manera.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 13, 14, NULL, 'Y Jehová dijo a Abram, después que Lot se apartó de él: Alza ahora tus ojos, y mira desde el lugar donde estás hacia el norte y el sur, y al oriente y al occidente.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 13, 15, NULL, 'Porque toda la tierra que ves, la daré a ti y a tu descendencia para siempre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 13, 16, NULL, 'Y haré tu descendencia como el polvo de la tierra; que si alguno puede contar el polvo de la tierra, también tu descendencia será contada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 13, 17, NULL, 'Levántate, ve por la tierra a lo largo de ella y a su ancho; porque a ti la daré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 13, 18, NULL, 'Abram, pues, removiendo su tienda, vino y moró en el encinar de Mamre, que está en Hebrón, y edificó allí altar a Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 14, 1, 'Abram liberta a Lot', 'Aconteció en los días de Amrafel rey de Sinar, Arioc rey de Elasar, Quedorlaomer rey de Elam, y Tidal rey de Goim,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 14, 2, NULL, 'que estos hicieron guerra contra Bera rey de Sodoma, contra Birsa rey de Gomorra, contra Sinab rey de Adma, contra Semeber rey de Zeboim, y contra el rey de Bela, la cual es Zoar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 14, 3, NULL, 'Todos estos se juntaron en el valle de Sidim, que es el Mar Salado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 14, 4, NULL, 'Doce años habían servido a Quedorlaomer, y en el decimotercero se rebelaron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 14, 5, NULL, 'Y en el año decimocuarto vino Quedorlaomer, y los reyes que estaban de su parte, y derrotaron a los refaítas en Astarot Karnaim, a los zuzitas en Ham, a los emitas en Save-quiriataim,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 14, 6, NULL, 'y a los horeos en el monte de Seir, hasta la llanura de Parán, que está junto al desierto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 14, 7, NULL, 'Y volvieron y vinieron a En-mispat, que es Cades, y devastaron todo el país de los amalecitas, y también al amorreo que habitaba en Hazezontamar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 14, 8, NULL, 'Y salieron el rey de Sodoma, el rey de Gomorra, el rey de Adma, el rey de Zeboim y el rey de Bela, que es Zoar, y ordenaron contra ellos batalla en el valle de Sidim;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 14, 9, NULL, 'esto es, contra Quedorlaomer rey de Elam, Tidal rey de Goim, Amrafel rey de Sinar, y Arioc rey de Elasar; cuatro reyes contra cinco.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 14, 10, NULL, 'Y el valle de Sidim estaba lleno de pozos de asfalto; y cuando huyeron el rey de Sodoma y el de Gomorra, algunos cayeron allí; y los demás huyeron al monte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 14, 11, NULL, 'Y tomaron toda la riqueza de Sodoma y de Gomorra, y todas sus provisiones, y se fueron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 14, 12, NULL, 'Tomaron también a Lot, hijo del hermano de Abram, que moraba en Sodoma, y sus bienes, y se fueron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 14, 13, NULL, 'Y vino uno de los que escaparon, y lo anunció a Abram el hebreo, que habitaba en el encinar de Mamre el amorreo, hermano de Escol y hermano de Aner, los cuales eran aliados de Abram.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 14, 14, NULL, 'Oyó Abram que su pariente estaba prisionero, y armó a sus criados, los nacidos en su casa, trescientos dieciocho, y los siguió hasta Dan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 14, 15, NULL, 'Y cayó sobre ellos de noche, él y sus siervos, y les atacó, y les fue siguiendo hasta Hoba al norte de Damasco.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 14, 16, NULL, 'Y recobró todos los bienes, y también a Lot su pariente y sus bienes, y a las mujeres y demás gente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 14, 17, 'Melquisedec bendice a Abram', 'Cuando volvía de la derrota de Quedorlaomer y de los reyes que con él estaban, salió el rey de Sodoma a recibirlo al valle de Save, que es el Valle del Rey.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 14, 18, NULL, 'Entonces Melquisedec, rey de Salem y sacerdote del Dios Altísimo, sacó pan y vino;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 14, 19, NULL, 'y le bendijo, diciendo: Bendito sea Abram del Dios Altísimo, creador de los cielos y de la tierra;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 14, 20, NULL, 'y bendito sea el Dios Altísimo, que entregó tus enemigos en tu mano. Y le dio Abram los diezmos de todo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 14, 21, NULL, 'Entonces el rey de Sodoma dijo a Abram: Dame las personas, y toma para ti los bienes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 14, 22, NULL, 'Y respondió Abram al rey de Sodoma: He alzado mi mano a Jehová Dios Altísimo, creador de los cielos y de la tierra,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 14, 23, NULL, 'que desde un hilo hasta una correa de calzado, nada tomaré de todo lo que es tuyo, para que no digas: Yo enriquecí a Abram;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 14, 24, NULL, 'excepto solamente lo que comieron los jóvenes, y la parte de los varones que fueron conmigo, Aner, Escol y Mamre, los cuales tomarán su parte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 15, 1, 'Dios promete a Abram un hijo', 'Después de estas cosas vino la palabra de Jehová a Abram en visión, diciendo: No temas, Abram; yo soy tu escudo, y tu galardón será sobremanera grande.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 15, 2, NULL, 'Y respondió Abram: Señor Jehová, ¿qué me darás, siendo así que ando sin hijo, y el mayordomo de mi casa es ese damasceno Eliezer?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 15, 3, NULL, 'Dijo también Abram: Mira que no me has dado prole, y he aquí que será mi heredero un esclavo nacido en mi casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 15, 4, NULL, 'Luego vino a él palabra de Jehová, diciendo: No te heredará este, sino un hijo tuyo será el que te heredará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 15, 5, NULL, 'Y lo llevó fuera, y le dijo: Mira ahora los cielos, y cuenta las estrellas, si las puedes contar. Y le dijo: Así será tu descendencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 15, 6, NULL, 'Y creyó a Jehová, y le fue contado por justicia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 15, 7, NULL, 'Y le dijo: Yo soy Jehová, que te saqué de Ur de los caldeos, para darte a heredar esta tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 15, 8, NULL, 'Y él respondió: Señor Jehová, ¿en qué conoceré que la he de heredar?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 15, 9, NULL, 'Y le dijo: Tráeme una becerra de tres años, y una cabra de tres años, y un carnero de tres años, una tórtola también, y un palomino.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 15, 10, NULL, 'Y tomó él todo esto, y los partió por la mitad, y puso cada mitad una enfrente de la otra; mas no partió las aves.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 15, 11, NULL, 'Y descendían aves de rapiña sobre los cuerpos muertos, y Abram las ahuyentaba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 15, 12, NULL, 'Mas a la caída del sol sobrecogió el sueño a Abram, y he aquí que el temor de una grande oscuridad cayó sobre él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 15, 13, NULL, 'Entonces Jehová dijo a Abram: Ten por cierto que tu descendencia morará en tierra ajena, y será esclava allí, y será oprimida cuatrocientos años.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 15, 14, NULL, 'Mas también a la nación a la cual servirán, juzgaré yo; y después de esto saldrán con gran riqueza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 15, 15, NULL, 'Y tú vendrás a tus padres en paz, y serás sepultado en buena vejez.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 15, 16, NULL, 'Y en la cuarta generación volverán acá; porque aún no ha llegado a su colmo la maldad del amorreo hasta aquí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 15, 17, NULL, 'Y sucedió que puesto el sol, y ya oscurecido, se veía un horno humeando, y una antorcha de fuego que pasaba por entre los animales divididos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 15, 18, NULL, 'En aquel día hizo Jehová un pacto con Abram, diciendo: A tu descendencia daré esta tierra, desde el río de Egipto hasta el río grande, el río Éufrates;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 15, 19, NULL, 'la tierra de los ceneos, los cenezeos, los cadmoneos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 15, 20, NULL, 'los heteos, los ferezeos, los refaítas,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 15, 21, NULL, 'los amorreos, los cananeos, los gergeseos y los jebuseos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 16, 1, 'Agar e Ismael', 'Sarai mujer de Abram no le daba hijos; y ella tenía una sierva egipcia, que se llamaba Agar.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 16, 2, NULL, 'Dijo entonces Sarai a Abram: Ya ves que Jehová me ha hecho estéril; te ruego, pues, que te llegues a mi sierva; quizá tendré hijos de ella. Y atendió Abram al ruego de Sarai.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 16, 3, NULL, 'Y Sarai mujer de Abram tomó a Agar su sierva egipcia, al cabo de diez años que había habitado Abram en la tierra de Canaán, y la dio por mujer a Abram su marido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 16, 4, NULL, 'Y él se llegó a Agar, la cual concibió; y cuando vio que había concebido, miraba con desprecio a su señora.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 16, 5, NULL, 'Entonces Sarai dijo a Abram: Mi afrenta sea sobre ti; yo te di mi sierva por mujer, y viéndose encinta, me mira con desprecio; juzgue Jehová entre tú y yo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 16, 6, NULL, 'Y respondió Abram a Sarai: He aquí, tu sierva está en tu mano; haz con ella lo que bien te parezca. Y como Sarai la afligía, ella huyó de su presencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 16, 7, NULL, 'Y la halló el ángel de Jehová junto a una fuente de agua en el desierto, junto a la fuente que está en el camino de Shur.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 16, 8, NULL, 'Y le dijo: Agar, sierva de Sarai, ¿de dónde vienes tú, y a dónde vas? Y ella respondió: Huyo de delante de Sarai mi señora.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 16, 9, NULL, 'Y le dijo el ángel de Jehová: Vuélvete a tu señora, y ponte sumisa bajo su mano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 16, 10, NULL, 'Le dijo también el ángel de Jehová: Multiplicaré tanto tu descendencia, que no podrá ser contada a causa de la multitud.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 16, 11, NULL, 'Además le dijo el ángel de Jehová: He aquí que has concebido, y darás a luz un hijo, y llamarás su nombre Ismael, porque Jehová ha oído tu aflicción.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 16, 12, NULL, 'Y él será hombre fiero; su mano será contra todos, y la mano de todos contra él, y delante de todos sus hermanos habitará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 16, 13, NULL, 'Entonces llamó el nombre de Jehová que con ella hablaba: Tú eres Dios que ve; porque dijo: ¿No he visto también aquí al que me ve?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 16, 14, NULL, 'Por lo cual llamó al pozo: Pozo del Viviente-que-me-ve. He aquí está entre Cades y Bered.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 16, 15, NULL, 'Y Agar dio a luz un hijo a Abram, y llamó Abram el nombre del hijo que le dio Agar, Ismael.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 16, 16, NULL, 'Era Abram de edad de ochenta y seis años, cuando Agar dio a luz a Ismael.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 17, 1, 'La circuncisión, señal del pacto', 'Era Abram de edad de noventa y nueve años, cuando le apareció Jehová y le dijo: Yo soy el Dios Todopoderoso; anda delante de mí y sé perfecto.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 17, 2, NULL, 'Y pondré mi pacto entre mí y ti, y te multiplicaré en gran manera.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 17, 3, NULL, 'Entonces Abram se postró sobre su rostro, y Dios habló con él, diciendo:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 17, 4, NULL, 'He aquí mi pacto es contigo, y serás padre de muchedumbre de gentes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 17, 5, NULL, 'Y no se llamará más tu nombre Abram, sino que será tu nombre Abraham, porque te he puesto por padre de muchedumbre de gentes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 17, 6, NULL, 'Y te multiplicaré en gran manera, y haré naciones de ti, y reyes saldrán de ti.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 17, 7, NULL, 'Y estableceré mi pacto entre mí y ti, y tu descendencia después de ti en sus generaciones, por pacto perpetuo, para ser tu Dios, y el de tu descendencia después de ti.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 17, 8, NULL, 'Y te daré a ti, y a tu descendencia después de ti, la tierra en que moras, toda la tierra de Canaán en heredad perpetua; y seré el Dios de ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 17, 9, NULL, 'Dijo de nuevo Dios a Abraham: En cuanto a ti, guardarás mi pacto, tú y tu descendencia después de ti por sus generaciones.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 17, 10, NULL, 'Este es mi pacto, que guardaréis entre mí y vosotros y tu descendencia después de ti: Será circuncidado todo varón de entre vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 17, 11, NULL, 'Circuncidaréis, pues, la carne de vuestro prepucio, y será por señal del pacto entre mí y vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 17, 12, NULL, 'Y de edad de ocho días será circuncidado todo varón entre vosotros por vuestras generaciones; el nacido en casa, y el comprado por dinero a cualquier extranjero, que no fuere de tu linaje.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 17, 13, NULL, 'Debe ser circuncidado el nacido en tu casa, y el comprado por tu dinero; y estará mi pacto en vuestra carne por pacto perpetuo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 17, 14, NULL, 'Y el varón incircunciso, el que no hubiere circuncidado la carne de su prepucio, aquella persona será cortada de su pueblo; ha violado mi pacto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 17, 15, NULL, 'Dijo también Dios a Abraham: A Sarai tu mujer no la llamarás Sarai, mas Sara será su nombre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 17, 16, NULL, 'Y la bendeciré, y también te daré de ella hijo; sí, la bendeciré, y vendrá a ser madre de naciones; reyes de pueblos vendrán de ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 17, 17, NULL, 'Entonces Abraham se postró sobre su rostro, y se rio, y dijo en su corazón: ¿A hombre de cien años ha de nacer hijo? ¿Y Sara, ya de noventa años, ha de concebir?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 17, 18, NULL, 'Y dijo Abraham a Dios: Ojalá Ismael viva delante de ti.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 17, 19, NULL, 'Respondió Dios: Ciertamente Sara tu mujer te dará a luz un hijo, y llamarás su nombre Isaac; y confirmaré mi pacto con él como pacto perpetuo para sus descendientes después de él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 17, 20, NULL, 'Y en cuanto a Ismael, también te he oído; he aquí que le bendeciré, y le haré fructificar y multiplicar mucho en gran manera; doce príncipes engendrará, y haré de él una gran nación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 17, 21, NULL, 'Mas yo estableceré mi pacto con Isaac, el que Sara te dará a luz por este tiempo el año que viene.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 17, 22, NULL, 'Y acabó de hablar con él, y subió Dios de estar con Abraham.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 17, 23, NULL, 'Entonces tomó Abraham a Ismael su hijo, y a todos los siervos nacidos en su casa, y a todos los comprados por su dinero, a todo varón entre los domésticos de la casa de Abraham, y circuncidó la carne del prepucio de ellos en aquel mismo día, como Dios le había dicho.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 17, 24, NULL, 'Era Abraham de edad de noventa y nueve años cuando circuncidó la carne de su prepucio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 17, 25, NULL, 'E Ismael su hijo era de trece años, cuando fue circuncidada la carne de su prepucio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 17, 26, NULL, 'En el mismo día fueron circuncidados Abraham e Ismael su hijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 17, 27, NULL, 'Y todos los varones de su casa, el siervo nacido en casa, y el comprado del extranjero por dinero, fueron circuncidados con él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 18, 1, 'Promesa del nacimiento de Isaac', 'Después le apareció Jehová en el encinar de Mamre, estando él sentado a la puerta de su tienda en el calor del día.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 18, 2, NULL, 'Y alzó sus ojos y miró, y he aquí tres varones que estaban junto a él; y cuando los vio, salió corriendo de la puerta de su tienda a recibirlos, y se postró en tierra,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 18, 3, NULL, 'y dijo: Señor, si ahora he hallado gracia en tus ojos, te ruego que no pases de tu siervo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 18, 4, NULL, 'Que se traiga ahora un poco de agua, y lavad vuestros pies; y recostaos debajo de un árbol,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 18, 5, NULL, 'y traeré un bocado de pan, y sustentad vuestro corazón, y después pasaréis; pues por eso habéis pasado cerca de vuestro siervo. Y ellos dijeron: Haz así como has dicho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 18, 6, NULL, 'Entonces Abraham fue de prisa a la tienda a Sara, y le dijo: Toma pronto tres medidas de flor de harina, y amasa y haz panes cocidos debajo del rescoldo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 18, 7, NULL, 'Y corrió Abraham a las vacas, y tomó un becerro tierno y bueno, y lo dio al criado, y este se dio prisa a prepararlo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 18, 8, NULL, 'Tomó también mantequilla y leche, y el becerro que había preparado, y lo puso delante de ellos; y él se estuvo con ellos debajo del árbol, y comieron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 18, 9, NULL, 'Y le dijeron: ¿Dónde está Sara tu mujer? Y él respondió: Aquí en la tienda.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 18, 10, NULL, 'Entonces dijo: De cierto volveré a ti; y según el tiempo de la vida, he aquí que Sara tu mujer tendrá un hijo. Y Sara escuchaba a la puerta de la tienda, que estaba detrás de él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 18, 11, NULL, 'Y Abraham y Sara eran viejos, de edad avanzada; y a Sara le había cesado ya la costumbre de las mujeres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 18, 12, NULL, 'Se rio, pues, Sara entre sí, diciendo: ¿Después que he envejecido tendré deleite, siendo también mi señor ya viejo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 18, 13, NULL, 'Entonces Jehová dijo a Abraham: ¿Por qué se ha reído Sara diciendo: Será cierto que he de dar a luz siendo ya vieja?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 18, 14, NULL, '¿Hay para Dios alguna cosa difícil? Al tiempo señalado volveré a ti, y según el tiempo de la vida, Sara tendrá un hijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 18, 15, NULL, 'Entonces Sara negó, diciendo: No me reí; porque tuvo miedo. Y él dijo: No es así, sino que te has reído.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 18, 16, 'Abraham intercede por Sodoma', 'Y los varones se levantaron de allí, y miraron hacia Sodoma; y Abraham iba con ellos acompañándolos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 18, 17, NULL, 'Y Jehová dijo: ¿Encubriré yo a Abraham lo que voy a hacer,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 18, 18, NULL, 'habiendo de ser Abraham una nación grande y fuerte, y habiendo de ser benditas en él todas las naciones de la tierra?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 18, 19, NULL, 'Porque yo sé que mandará a sus hijos y a su casa después de sí, que guarden el camino de Jehová, haciendo justicia y juicio, para que haga venir Jehová sobre Abraham lo que ha hablado acerca de él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 18, 20, NULL, 'Entonces Jehová le dijo: Por cuanto el clamor contra Sodoma y Gomorra se aumenta más y más, y el pecado de ellos se ha agravado en extremo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 18, 21, NULL, 'descenderé ahora, y veré si han consumado su obra según el clamor que ha venido hasta mí; y si no, lo sabré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 18, 22, NULL, 'Y se apartaron de allí los varones, y fueron hacia Sodoma; pero Abraham estaba aún delante de Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 18, 23, NULL, 'Y se acercó Abraham y dijo: ¿Destruirás también al justo con el impío?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 18, 24, NULL, 'Quizá haya cincuenta justos dentro de la ciudad: ¿destruirás también y no perdonarás al lugar por amor a los cincuenta justos que estén dentro de él?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 18, 25, NULL, 'Lejos de ti el hacer tal, que hagas morir al justo con el impío, y que sea el justo tratado como el impío; nunca tal hagas. El Juez de toda la tierra, ¿no ha de hacer lo que es justo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 18, 26, NULL, 'Entonces respondió Jehová: Si hallare en Sodoma cincuenta justos dentro de la ciudad, perdonaré a todo este lugar por amor a ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 18, 27, NULL, 'Y Abraham replicó y dijo: He aquí ahora que he comenzado a hablar a mi Señor, aunque soy polvo y ceniza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 18, 28, NULL, 'Quizá faltarán de cincuenta justos cinco; ¿destruirás por aquellos cinco toda la ciudad? Y dijo: No la destruiré, si hallare allí cuarenta y cinco.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 18, 29, NULL, 'Y volvió a hablarle, y dijo: Quizá se hallarán allí cuarenta. Y respondió: No lo haré por amor a los cuarenta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 18, 30, NULL, 'Y dijo: No se enoje ahora mi Señor, si hablare: quizá se hallarán allí treinta. Y respondió: No lo haré si hallare allí treinta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 18, 31, NULL, 'Y dijo: He aquí ahora que he emprendido el hablar a mi Señor: quizá se hallarán allí veinte. No la destruiré, respondió, por amor a los veinte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 18, 32, NULL, 'Y volvió a decir: No se enoje ahora mi Señor, si hablare solamente una vez: quizá se hallarán allí diez. No la destruiré, respondió, por amor a los diez.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 18, 33, NULL, 'Y Jehová se fue, luego que acabó de hablar a Abraham; y Abraham volvió a su lugar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 19, 1, 'Destrucción de Sodoma y Gomorra', 'Llegaron, pues, los dos ángeles a Sodoma a la caída de la tarde; y Lot estaba sentado a la puerta de Sodoma. Y viéndolos Lot, se levantó a recibirlos, y se inclinó hacia el suelo,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 19, 2, NULL, 'y dijo: Ahora, mis señores, os ruego que vengáis a casa de vuestro siervo y os hospedéis, y lavaréis vuestros pies; y por la mañana os levantaréis, y seguiréis vuestro camino. Y ellos respondieron: No, que en la calle nos quedaremos esta noche.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 19, 3, NULL, 'Mas él porfió con ellos mucho, y fueron con él, y entraron en su casa; y les hizo banquete, y coció panes sin levadura, y comieron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 19, 4, NULL, 'Pero antes que se acostasen, rodearon la casa los hombres de la ciudad, los varones de Sodoma, todo el pueblo junto, desde el más joven hasta el más viejo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 19, 5, NULL, 'Y llamaron a Lot, y le dijeron: ¿Dónde están los varones que vinieron a ti esta noche? Sácalos, para que los conozcamos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 19, 6, NULL, 'Entonces Lot salió a ellos a la puerta, y cerró la puerta tras sí,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 19, 7, NULL, 'y dijo: Os ruego, hermanos míos, que no hagáis tal maldad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 19, 8, NULL, 'He aquí ahora yo tengo dos hijas que no han conocido varón; os las sacaré fuera, y haced de ellas como bien os pareciere; solamente que a estos varones no hagáis nada, pues que vinieron a la sombra de mi tejado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 19, 9, NULL, 'Y ellos respondieron: Quita allá; y añadieron: Vino este extraño para habitar entre nosotros, ¿y habrá de erigirse en juez? Ahora te haremos más mal que a ellos. Y hacían gran violencia al varón, a Lot, y se acercaron para romper la puerta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 19, 10, NULL, 'Entonces los varones alargaron la mano, y metieron a Lot en casa con ellos, y cerraron la puerta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 19, 11, NULL, 'Y a los hombres que estaban a la puerta de la casa hirieron con ceguera desde el menor hasta el mayor, de manera que se fatigaban buscando la puerta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 19, 12, NULL, 'Y dijeron los varones a Lot: ¿Tienes aquí alguno más? Yernos, y tus hijos y tus hijas, y todo lo que tienes en la ciudad, sácalo de este lugar;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 19, 13, NULL, 'porque vamos a destruir este lugar, por cuanto el clamor contra ellos ha subido de punto delante de Jehová; por tanto, Jehová nos ha enviado para destruirlo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 19, 14, NULL, 'Entonces salió Lot y habló a sus yernos, los que habían de tomar sus hijas, y les dijo: Levantaos, salid de este lugar; porque Jehová va a destruir esta ciudad. Mas pareció a sus yernos como que se burlaba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 19, 15, NULL, 'Y al rayar el alba, los ángeles daban prisa a Lot, diciendo: Levántate, toma tu mujer, y tus dos hijas que se hallan aquí, para que no perezcas en el castigo de la ciudad.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 19, 16, NULL, 'Y deteniéndose él, los varones asieron de su mano, y de la mano de su mujer y de las manos de sus dos hijas, según la misericordia de Jehová para con él; y lo sacaron y lo pusieron fuera de la ciudad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 19, 17, NULL, 'Y cuando los hubieron llevado fuera, dijeron: Escapa por tu vida; no mires tras ti, ni pares en toda esta llanura; escapa al monte, no sea que perezcas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 19, 18, NULL, 'Pero Lot les dijo: No, yo os ruego, señores míos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 19, 19, NULL, 'He aquí ahora ha hallado vuestro siervo gracia en vuestros ojos, y habéis engrandecido vuestra misericordia que habéis hecho conmigo dándome la vida; mas yo no podré escapar al monte, no sea que me alcance el mal, y muera.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 19, 20, NULL, 'He aquí ahora esta ciudad está cerca para huir allá, la cual es pequeña; dejadme escapar ahora allá (¿no es ella pequeña?), y salvaré mi vida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 19, 21, NULL, 'Y le respondió: He aquí he recibido también tu súplica sobre esto, y no destruiré la ciudad de que has hablado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 19, 22, NULL, 'Date prisa, escápate allá; porque nada podré hacer hasta que hayas llegado allí. Por eso fue llamado el nombre de la ciudad, Zoar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 19, 23, NULL, 'El sol salía sobre la tierra, cuando Lot llegó a Zoar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 19, 24, NULL, 'Entonces Jehová hizo llover sobre Sodoma y sobre Gomorra azufre y fuego de parte de Jehová desde los cielos;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 19, 25, NULL, 'y destruyó las ciudades, y toda aquella llanura, con todos los moradores de aquellas ciudades, y el fruto de la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 19, 26, NULL, 'Entonces la mujer de Lot miró atrás, a espaldas de él, y se volvió estatua de sal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 19, 27, NULL, 'Y subió Abraham por la mañana al lugar donde había estado delante de Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 19, 28, NULL, 'Y miró hacia Sodoma y Gomorra, y hacia toda la tierra de aquella llanura miró; y he aquí que el humo subía de la tierra como el humo de un horno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 19, 29, NULL, 'Así, cuando destruyó Dios las ciudades de la llanura, Dios se acordó de Abraham, y envió fuera a Lot de en medio de la destrucción, al asolar las ciudades donde Lot estaba.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 19, 30, NULL, 'Pero Lot subió de Zoar y moró en el monte, y sus dos hijas con él; porque tuvo miedo de quedarse en Zoar, y habitó en una cueva él y sus dos hijas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 19, 31, NULL, 'Entonces la mayor dijo a la menor: Nuestro padre es viejo, y no queda varón en la tierra que entre a nosotras conforme a la costumbre de toda la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 19, 32, NULL, 'Ven, demos a beber vino a nuestro padre, y durmamos con él, y conservaremos de nuestro padre descendencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 19, 33, NULL, 'Y dieron a beber vino a su padre aquella noche, y entró la mayor, y durmió con su padre; mas él no sintió cuándo se acostó ella, ni cuándo se levantó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 19, 34, NULL, 'El día siguiente, dijo la mayor a la menor: He aquí, yo dormí la noche pasada con mi padre; démosle a beber vino también esta noche, y entra y duerme con él, para que conservemos de nuestro padre descendencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 19, 35, NULL, 'Y dieron a beber vino a su padre también aquella noche, y se levantó la menor, y durmió con él; pero él no echó de ver cuándo se acostó ella, ni cuándo se levantó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 19, 36, NULL, 'Y las dos hijas de Lot concibieron de su padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 19, 37, NULL, 'Y dio a luz la mayor un hijo, y llamó su nombre Moab, el cual es padre de los moabitas hasta hoy.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 19, 38, NULL, 'La menor también dio a luz un hijo, y llamó su nombre Ben-ammi, el cual es padre de los amonitas hasta hoy.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 20, 1, 'Abraham y Abimelec', 'De allí partió Abraham a la tierra del Neguev, y acampó entre Cades y Shur, y habitó como forastero en Gerar.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 20, 2, NULL, 'Y dijo Abraham de Sara su mujer: Es mi hermana. Y Abimelec rey de Gerar envió y tomó a Sara.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 20, 3, NULL, 'Pero Dios vino a Abimelec en sueños de noche, y le dijo: He aquí, muerto eres, a causa de la mujer que has tomado, la cual es casada con marido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 20, 4, NULL, 'Mas Abimelec no se había llegado a ella, y dijo: Señor, ¿matarás también al inocente?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 20, 5, NULL, '¿No me dijo él: Mi hermana es; y ella también dijo: Es mi hermano? Con sencillez de mi corazón y con limpieza de mis manos he hecho esto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 20, 6, NULL, 'Y le dijo Dios en sueños: Yo también sé que con integridad de tu corazón has hecho esto; y yo también te detuve de pecar contra mí, y así no te permití que la tocases.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 20, 7, NULL, 'Ahora, pues, devuelve la mujer a su marido; porque es profeta, y orará por ti, y vivirás. Y si no la devolvieres, sabe que de cierto morirás tú, y todos los tuyos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 20, 8, NULL, 'Entonces Abimelec se levantó de mañana y llamó a todos sus siervos, y dijo todas estas palabras en los oídos de ellos; y temieron los hombres en gran manera.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 20, 9, NULL, 'Después llamó Abimelec a Abraham, y le dijo: ¿Qué nos has hecho? ¿En qué pequé yo contra ti, que has atraído sobre mí y sobre mi reino tan grande pecado? Lo que no debiste hacer has hecho conmigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 20, 10, NULL, 'Dijo también Abimelec a Abraham: ¿Qué pensabas, para que hicieses esto?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 20, 11, NULL, 'Y Abraham respondió: Porque dije para mí: Ciertamente no hay temor de Dios en este lugar, y me matarán por causa de mi mujer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 20, 12, NULL, 'Y a la verdad también es mi hermana, hija de mi padre, mas no hija de mi madre, y la tomé por mujer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 20, 13, NULL, 'Y cuando Dios me hizo salir errante de la casa de mi padre, yo le dije: Esta es la merced que tú harás conmigo, que en todos los lugares adonde lleguemos, digas de mí: Mi hermano es.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 20, 14, NULL, 'Entonces Abimelec tomó ovejas y vacas, y siervos y siervas, y se los dio a Abraham, y le devolvió a Sara su mujer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 20, 15, NULL, 'Y dijo Abimelec: He aquí mi tierra está delante de ti; habita donde bien te parezca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 20, 16, NULL, 'Y a Sara dijo: He aquí he dado mil monedas de plata a tu hermano; mira que él te es como un velo para los ojos de todos los que están contigo, y para con todos; así fue vindicada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 20, 17, NULL, 'Entonces Abraham oró a Dios; y Dios sanó a Abimelec y a su mujer, y a sus siervas, y tuvieron hijos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 20, 18, NULL, 'Porque Jehová había cerrado completamente toda matriz de la casa de Abimelec, a causa de Sara mujer de Abraham.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 21, 1, 'Nacimiento de Isaac', 'Visitó Jehová a Sara, como había dicho, e hizo Jehová con Sara como había hablado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 21, 2, NULL, 'Y Sara concibió y dio a Abraham un hijo en su vejez, en el tiempo que Dios le había dicho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 21, 3, NULL, 'Y llamó Abraham el nombre de su hijo que le nació, que le dio a luz Sara, Isaac.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 21, 4, NULL, 'Y circuncidó Abraham a su hijo Isaac de ocho días, como Dios le había mandado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 21, 5, NULL, 'Y era Abraham de cien años cuando nació Isaac su hijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 21, 6, NULL, 'Entonces dijo Sara: Dios me ha hecho reír, y cualquiera que lo oyere, se reirá conmigo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 21, 7, NULL, 'Y añadió: ¿Quién dijera a Abraham que Sara habría de dar de mamar a hijos? Pues le he dado un hijo en su vejez.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 21, 8, 'Agar e Ismael son echados de la casa de Abraham', 'Y creció el niño, y fue destetado; e hizo Abraham gran banquete el día que fue destetado Isaac.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 21, 9, NULL, 'Y vio Sara que el hijo de Agar la egipcia, el cual esta le había dado a luz a Abraham, se burlaba de su hijo Isaac.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 21, 10, NULL, 'Por tanto, dijo a Abraham: Echa a esta sierva y a su hijo, porque el hijo de esta sierva no ha de heredar con Isaac mi hijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 21, 11, NULL, 'Este dicho pareció grave en gran manera a Abraham a causa de su hijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 21, 12, NULL, 'Entonces dijo Dios a Abraham: No te parezca grave a causa del muchacho y de tu sierva; en todo lo que te dijere Sara, oye su voz, porque en Isaac te será llamada descendencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 21, 13, NULL, 'Y también del hijo de la sierva haré una nación, porque es tu descendiente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 21, 14, NULL, 'Entonces Abraham se levantó muy de mañana, y tomó pan, y un odre de agua, y lo dio a Agar, poniéndolo sobre su hombro, y le entregó el muchacho, y la despidió. Y ella salió y anduvo errante por el desierto de Beerseba.', 0, 'spa', 'RVR1960', NULL);\n"
;

  public static final String SQL_PARTE_3 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Gn', 21, 15, NULL, 'Y le faltó el agua del odre, y echó al muchacho debajo de un arbusto,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 21, 16, NULL, 'y se fue y se sentó enfrente, a distancia de un tiro de arco; porque decía: No veré cuando el muchacho muera. Y cuando ella se sentó enfrente, el muchacho alzó su voz y lloró.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 21, 17, NULL, 'Y oyó Dios la voz del muchacho; y el ángel de Dios llamó a Agar desde el cielo, y le dijo: ¿Qué tienes, Agar? No temas; porque Dios ha oído la voz del muchacho en donde está.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 21, 18, NULL, 'Levántate, alza al muchacho, y sostenlo con tu mano, porque yo haré de él una gran nación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 21, 19, NULL, 'Entonces Dios le abrió los ojos, y vio una fuente de agua; y fue y llenó el odre de agua, y dio de beber al muchacho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 21, 20, NULL, 'Y Dios estaba con el muchacho; y creció, y habitó en el desierto, y fue tirador de arco.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 21, 21, NULL, 'Y habitó en el desierto de Parán; y su madre le tomó mujer de la tierra de Egipto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 21, 22, 'Pacto entre Abraham y Abimelec', 'Aconteció en aquel mismo tiempo que habló Abimelec, y Ficol príncipe de su ejército, a Abraham, diciendo: Dios está contigo en todo cuanto haces.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 21, 23, NULL, 'Ahora, pues, júrame aquí por Dios, que no faltarás a mí, ni a mi hijo ni a mi nieto, sino que conforme a la bondad que yo hice contigo, harás tú conmigo, y con la tierra en donde has morado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 21, 24, NULL, 'Y respondió Abraham: Yo juraré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 21, 25, NULL, 'Y Abraham reconvino a Abimelec a causa de un pozo de agua, que los siervos de Abimelec le habían quitado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 21, 26, NULL, 'Y respondió Abimelec: No sé quién haya hecho esto, ni tampoco tú me lo hiciste saber, ni yo lo he oído hasta hoy.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 21, 27, NULL, 'Y tomó Abraham ovejas y vacas, y dio a Abimelec; e hicieron ambos pacto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 21, 28, NULL, 'Entonces puso Abraham siete corderas del rebaño aparte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 21, 29, NULL, 'Y dijo Abimelec a Abraham: ¿Qué significan esas siete corderas que has puesto aparte?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 21, 30, NULL, 'Y él respondió: Que estas siete corderas tomarás de mi mano, para que me sirvan de testimonio de que yo cavé este pozo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 21, 31, NULL, 'Por esto llamó a aquel lugar Beerseba; porque allí juraron ambos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 21, 32, NULL, 'Así hicieron pacto en Beerseba; y se levantó Abimelec, y Ficol príncipe de su ejército, y volvieron a tierra de los filisteos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 21, 33, NULL, 'Y plantó Abraham un árbol tamarisco en Beerseba, e invocó allí el nombre de Jehová Dios eterno.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 21, 34, NULL, 'Y moró Abraham en tierra de los filisteos muchos días.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 22, 1, 'Dios ordena a Abraham que sacrifique a Isaac', 'Aconteció después de estas cosas, que probó Dios a Abraham, y le dijo: Abraham. Y él respondió: Heme aquí.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 22, 2, NULL, 'Y dijo: Toma ahora tu hijo, tu único, Isaac, a quien amas, y vete a tierra de Moriah, y ofrécelo allí en holocausto sobre uno de los montes que yo te diré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 22, 3, NULL, 'Y Abraham se levantó muy de mañana, y enalbardó su asno, y tomó consigo dos siervos suyos, y a Isaac su hijo; y cortó leña para el holocausto, y se levantó, y fue al lugar que Dios le dijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 22, 4, NULL, 'Al tercer día alzó Abraham sus ojos, y vio el lugar de lejos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 22, 5, NULL, 'Entonces dijo Abraham a sus siervos: Esperad aquí con el asno, y yo y el muchacho iremos hasta allí y adoraremos, y volveremos a vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 22, 6, NULL, 'Y tomó Abraham la leña del holocausto, y la puso sobre Isaac su hijo, y él tomó en su mano el fuego y el cuchillo; y fueron ambos juntos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 22, 7, NULL, 'Entonces habló Isaac a Abraham su padre, y dijo: Padre mío. Y él respondió: Heme aquí, mi hijo. Y él dijo: He aquí el fuego y la leña; mas ¿dónde está el cordero para el holocausto?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 22, 8, NULL, 'Y respondió Abraham: Dios se proveerá de cordero para el holocausto, hijo mío. E iban juntos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 22, 9, NULL, 'Y cuando llegaron al lugar que Dios le había dicho, edificó allí Abraham un altar, y compuso la leña, y ató a Isaac su hijo, y lo puso en el altar sobre la leña.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 22, 10, NULL, 'Y extendió Abraham su mano y tomó el cuchillo para degollar a su hijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 22, 11, NULL, 'Entonces el ángel de Jehová le dio voces desde el cielo, y dijo: Abraham, Abraham. Y él respondió: Heme aquí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 22, 12, NULL, 'Y dijo: No extiendas tu mano sobre el muchacho, ni le hagas nada; porque ya conozco que temes a Dios, por cuanto no me rehusaste tu hijo, tu único.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 22, 13, NULL, 'Entonces alzó Abraham sus ojos y miró, y he aquí a sus espaldas un carnero trabado en un zarzal por sus cuernos; y fue Abraham y tomó el carnero, y lo ofreció en holocausto en lugar de su hijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 22, 14, NULL, 'Y llamó Abraham el nombre de aquel lugar, Jehová proveerá. Por tanto se dice hoy: En el monte de Jehová será provisto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 22, 15, NULL, 'Y llamó el ángel de Jehová a Abraham por segunda vez desde el cielo,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 22, 16, NULL, 'y dijo: Por mí mismo he jurado, dice Jehová, que por cuanto has hecho esto, y no me has rehusado tu hijo, tu único hijo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 22, 17, NULL, 'de cierto te bendeciré, y multiplicaré tu descendencia como las estrellas del cielo y como la arena que está a la orilla del mar; y tu descendencia poseerá las puertas de sus enemigos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 22, 18, NULL, 'En tu simiente serán benditas todas las naciones de la tierra, por cuanto obedeciste a mi voz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 22, 19, NULL, 'Y volvió Abraham a sus siervos, y se levantaron y se fueron juntos a Beerseba; y habitó Abraham en Beerseba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 22, 20, NULL, 'Aconteció después de estas cosas, que fue dada noticia a Abraham, diciendo: He aquí que también Milca ha dado a luz hijos a Nacor tu hermano:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 22, 21, NULL, 'Uz su primogénito, Buz su hermano, Kemuel padre de Aram,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 22, 22, NULL, 'Quesed, Hazo, Pildas, Jidlaf y Betuel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 22, 23, NULL, 'Y Betuel fue el padre de Rebeca. Estos son los ocho hijos que dio a luz Milca, de Nacor hermano de Abraham.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 22, 24, NULL, 'Y su concubina, que se llamaba Reúma, dio a luz también a Teba, a Gaham, a Tahas y a Maaca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 23, 1, 'Muerte y sepultura de Sara', 'Fue la vida de Sara ciento veintisiete años; tantos fueron los años de la vida de Sara.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 23, 2, NULL, 'Y murió Sara en Quiriat-arba, que es Hebrón, en la tierra de Canaán; y vino Abraham a hacer duelo por Sara, y a llorarla.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 23, 3, NULL, 'Y se levantó Abraham de delante de su muerta, y habló a los hijos de Het, diciendo:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 23, 4, NULL, 'Extranjero y forastero soy entre vosotros; dadme propiedad para sepultura entre vosotros, y sepultaré mi muerta de delante de mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 23, 5, NULL, 'Y respondieron los hijos de Het a Abraham, y le dijeron:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 23, 6, NULL, 'Óyenos, señor nuestro; eres un príncipe de Dios entre nosotros; en lo mejor de nuestros sepulcros sepulta a tu muerta; ninguno de nosotros te negará su sepulcro, ni te impedirá que entierres tu muerta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 23, 7, NULL, 'Y Abraham se levantó, y se inclinó al pueblo de aquella tierra, a los hijos de Het,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 23, 8, NULL, 'y habló con ellos, diciendo: Si tenéis voluntad de que yo sepulte mi muerta de delante de mí, oídme, e interceded por mí con Efrón hijo de Zohar,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 23, 9, NULL, 'para que me dé la cueva de Macpela, que tiene al extremo de su heredad; que por su justo precio me la dé, para posesión de sepultura en medio de vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 23, 10, NULL, 'Este Efrón estaba entre los hijos de Het; y respondió Efrón heteo a Abraham, en presencia de los hijos de Het, de todos los que entraban por la puerta de su ciudad, diciendo:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 23, 11, NULL, 'No, señor mío, óyeme: te doy la heredad, y te doy también la cueva que está en ella; en presencia de los hijos de mi pueblo te la doy; sepulta tu muerta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 23, 12, NULL, 'Entonces Abraham se inclinó delante del pueblo de la tierra,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 23, 13, NULL, 'y respondió a Efrón en presencia del pueblo de la tierra, diciendo: Antes, si te place, te ruego que me oigas. Yo daré el precio de la heredad; tómalo de mí, y sepultaré en ella mi muerta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 23, 14, NULL, 'Respondió Efrón a Abraham, diciéndole:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 23, 15, NULL, 'Señor mío, escúchame: la tierra vale cuatrocientos siclos de plata; ¿qué es esto entre tú y yo? Entierra, pues, tu muerta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 23, 16, NULL, 'Entonces Abraham se convino con Efrón, y pesó Abraham a Efrón el dinero que dijo, en presencia de los hijos de Het, cuatrocientos siclos de plata, de buena ley entre mercaderes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 23, 17, NULL, 'Y quedó la heredad de Efrón que estaba en Macpela al oriente de Mamre, la heredad con la cueva que estaba en ella, y todos los árboles que había en la heredad, y en todos sus contornos,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 23, 18, NULL, 'como propiedad de Abraham, en presencia de los hijos de Het y de todos los que entraban por la puerta de la ciudad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 23, 19, NULL, 'Después de esto sepultó Abraham a Sara su mujer en la cueva de la heredad de Macpela al oriente de Mamre, que es Hebrón, en la tierra de Canaán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 23, 20, NULL, 'Y quedó la heredad y la cueva que en ella había, de Abraham, como una posesión para sepultura, recibida de los hijos de Het.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 1, 'Abraham busca esposa para Isaac', 'Era Abraham ya viejo, y bien avanzado en años; y Jehová había bendecido a Abraham en todo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 2, NULL, 'Y dijo Abraham a un criado suyo, el más viejo de su casa, que era el que gobernaba en todo lo que tenía: Pon ahora tu mano debajo de mi muslo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 3, NULL, 'y te juramentaré por Jehová, Dios de los cielos y Dios de la tierra, que no tomarás para mi hijo mujer de las hijas de los cananeos, entre los cuales yo habito;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 4, NULL, 'sino que irás a mi tierra y a mi parentela, y tomarás mujer para mi hijo Isaac.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 5, NULL, 'El criado le respondió: Quizá la mujer no querrá venir en pos de mí a esta tierra. ¿Volveré, pues, tu hijo a la tierra de donde saliste?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 6, NULL, 'Y Abraham le dijo: Guárdate que no vuelvas a mi hijo allá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 7, NULL, 'Jehová, Dios de los cielos, que me tomó de la casa de mi padre y de la tierra de mi parentela, y me habló y me juró, diciendo: A tu descendencia daré esta tierra; él enviará su ángel delante de ti, y tú traerás de allá mujer para mi hijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 8, NULL, 'Y si la mujer no quisiere venir en pos de ti, serás libre de este mi juramento; solamente que no vuelvas allá a mi hijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 9, NULL, 'Entonces el criado puso su mano debajo del muslo de Abraham su señor, y le juró sobre este negocio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 10, NULL, 'Y el criado tomó diez camellos de los camellos de su señor, y se fue, tomando toda clase de regalos escogidos de su señor; y puesto en camino, llegó a Mesopotamia, a la ciudad de Nacor.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 11, NULL, 'E hizo arrodillar los camellos fuera de la ciudad, junto a un pozo de agua, a la hora de la tarde, la hora en que salen las doncellas por agua.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 12, NULL, 'Y dijo: Oh Jehová, Dios de mi señor Abraham, dame, te ruego, el tener hoy buen encuentro, y haz misericordia con mi señor Abraham.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 13, NULL, 'He aquí yo estoy junto a la fuente de agua, y las hijas de los varones de esta ciudad salen por agua.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 14, NULL, 'Sea, pues, que la doncella a quien yo dijere: Baja tu cántaro, te ruego, para que yo beba, y ella respondiere: Bebe, y también daré de beber a tus camellos; que sea esta la que tú has destinado para tu siervo Isaac; y en esto conoceré que habrás hecho misericordia con mi señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 15, NULL, 'Y aconteció que antes que él acabase de hablar, he aquí Rebeca, que había nacido a Betuel, hijo de Milca mujer de Nacor hermano de Abraham, la cual salía con su cántaro sobre su hombro.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 16, NULL, 'Y la doncella era de aspecto muy hermoso, virgen, a la que varón no había conocido; la cual descendió a la fuente, y llenó su cántaro, y se volvía.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 17, NULL, 'Entonces el criado corrió hacia ella, y dijo: Te ruego que me des a beber un poco de agua de tu cántaro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 18, NULL, 'Ella respondió: Bebe, señor mío; y se dio prisa a bajar su cántaro sobre su mano, y le dio a beber.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 19, NULL, 'Y cuando acabó de darle de beber, dijo: También para tus camellos sacaré agua, hasta que acaben de beber.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 20, NULL, 'Y se dio prisa, y vació su cántaro en la pila, y corrió otra vez al pozo para sacar agua, y sacó para todos sus camellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 21, NULL, 'Y el hombre estaba maravillado de ella, callando, para saber si Jehová había prosperado su viaje, o no.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 22, NULL, 'Y cuando los camellos acabaron de beber, le dio el hombre un pendiente de oro que pesaba medio siclo, y dos brazaletes que pesaban diez,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 23, NULL, 'y dijo: ¿De quién eres hija? Te ruego que me digas: ¿hay en casa de tu padre lugar donde posemos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 24, NULL, 'Y ella respondió: Soy hija de Betuel hijo de Milca, el cual ella dio a luz a Nacor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 25, NULL, 'Y añadió: También hay en nuestra casa paja y mucho forraje, y lugar para posar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 26, NULL, 'El hombre entonces se inclinó, y adoró a Jehová,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 27, NULL, 'y dijo: Bendito sea Jehová, Dios de mi amo Abraham, que no apartó de mi amo su misericordia y su verdad, guiándome Jehová en el camino a casa de los hermanos de mi amo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 28, NULL, 'Y la doncella corrió, e hizo saber en casa de su madre estas cosas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 29, NULL, 'Y Rebeca tenía un hermano que se llamaba Labán, el cual corrió afuera hacia el hombre, a la fuente.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 30, NULL, 'Y cuando vio el pendiente y los brazaletes en las manos de su hermana, que decía: Así me habló aquel hombre, vino a él; y he aquí que estaba con los camellos junto a la fuente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 31, NULL, 'Y le dijo: Ven, bendito de Jehová; ¿por qué estás fuera? He preparado la casa, y el lugar para los camellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 32, NULL, 'Entonces el hombre vino a casa, y Labán desató los camellos; y les dio paja y forraje, y agua para lavar los pies de él, y los pies de los hombres que con él venían.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 33, NULL, 'Y le pusieron delante qué comer; mas él dijo: No comeré hasta que haya dicho mi mensaje. Y él le dijo: Habla.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 34, NULL, 'Entonces dijo: Yo soy criado de Abraham.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 35, NULL, 'Y Jehová ha bendecido mucho a mi amo, y él se ha engrandecido; y le ha dado ovejas y vacas, plata y oro, siervos y siervas, camellos y asnos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 36, NULL, 'Y Sara, mujer de mi amo, dio a luz en su vejez un hijo a mi señor, quien le ha dado a él todo cuanto tiene.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 37, NULL, 'Y mi amo me hizo jurar, diciendo: No tomarás para mi hijo mujer de las hijas de los cananeos, en cuya tierra habito;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 38, NULL, 'sino que irás a la casa de mi padre y a mi parentela, y tomarás mujer para mi hijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 39, NULL, 'Y yo dije: Quizá la mujer no querrá seguirme.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 40, NULL, 'Entonces él me respondió: Jehová, en cuya presencia he andado, enviará su ángel contigo, y prosperará tu camino; y tomarás para mi hijo mujer de mi familia y de la casa de mi padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 41, NULL, 'Entonces serás libre de mi juramento, cuando hayas llegado a mi familia; y si no te la dieren, serás libre de mi juramento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 42, NULL, 'Llegué, pues, hoy a la fuente, y dije: Jehová, Dios de mi señor Abraham, si tú prosperas ahora mi camino por el cual ando,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 43, NULL, 'he aquí yo estoy junto a la fuente de agua; sea, pues, que la doncella que saliere por agua, a la cual dijere: Dame de beber, te ruego, un poco de agua de tu cántaro,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 44, NULL, 'y ella me respondiere: Bebe tú, y también para tus camellos sacaré agua; sea esta la mujer que destinó Jehová para el hijo de mi señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 45, NULL, 'Antes que acabase de hablar en mi corazón, he aquí Rebeca, que salía con su cántaro sobre su hombro; y descendió a la fuente, y sacó agua; y le dije: Te ruego que me des de beber.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 46, NULL, 'Y bajó prontamente su cántaro de encima de sí, y dijo: Bebe, y también a tus camellos daré de beber. Y bebí, y dio también de beber a mis camellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 47, NULL, 'Entonces le pregunté, y dije: ¿De quién eres hija? Y ella respondió: Hija de Betuel hijo de Nacor, que le dio a luz Milca. Entonces le puse un pendiente en su nariz, y brazaletes en sus brazos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 48, NULL, 'y me incliné y adoré a Jehová, y bendije a Jehová Dios de mi señor Abraham, que me había guiado por camino de verdad para tomar la hija del hermano de mi señor para su hijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 49, NULL, 'Ahora, pues, si vosotros hacéis misericordia y verdad con mi señor, declarádmelo; y si no, declarádmelo; y me iré a la diestra o a la siniestra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 50, NULL, 'Entonces Labán y Betuel respondieron y dijeron: De Jehová ha salido esto; no podemos hablarte malo ni bueno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 51, NULL, 'He ahí Rebeca delante de ti; tómala y vete, y sea mujer del hijo de tu señor, como lo ha dicho Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 52, NULL, 'Cuando el criado de Abraham oyó sus palabras, se inclinó en tierra ante Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 53, NULL, 'Y sacó el criado alhajas de plata y alhajas de oro, y vestidos, y dio a Rebeca; también dio cosas preciosas a su hermano y a su madre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 54, NULL, 'Y comieron y bebieron él y los varones que venían con él, y durmieron; y levantándose de mañana, dijo: Enviadme a mi señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 55, NULL, 'Entonces respondieron su hermano y su madre: Espere la doncella con nosotros a lo menos diez días, y después irá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 56, NULL, 'Y él les dijo: No me detengáis, ya que Jehová ha prosperado mi camino; despachadme para que me vaya a mi señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 57, NULL, 'Ellos respondieron entonces: Llamemos a la doncella y preguntémosle.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 58, NULL, 'Y llamaron a Rebeca, y le dijeron: ¿Irás tú con este varón? Y ella respondió: Sí, iré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 59, NULL, 'Entonces dejaron ir a Rebeca su hermana, y a su nodriza, y al criado de Abraham y a sus hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 60, NULL, 'Y bendijeron a Rebeca, y le dijeron: Hermana nuestra, sé madre de millares de millares, y posean tus descendientes la puerta de sus enemigos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 61, NULL, 'Entonces se levantó Rebeca y sus doncellas, y montaron en los camellos, y siguieron al hombre; y el criado tomó a Rebeca, y se fue.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 62, NULL, 'Y venía Isaac del pozo del Viviente-que-me-ve; porque él habitaba en el Neguev.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 63, NULL, 'Y había salido Isaac a meditar al campo, a la hora de la tarde; y alzando sus ojos miró, y he aquí los camellos que venían.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 64, NULL, 'Rebeca también alzó sus ojos, y vio a Isaac, y descendió del camello;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 65, NULL, 'porque había preguntado al criado: ¿Quién es este varón que viene por el campo hacia nosotros? Y el criado había respondido: Este es mi señor. Ella entonces tomó el velo, y se cubrió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 66, NULL, 'Entonces el criado contó a Isaac todo lo que había hecho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 24, 67, NULL, 'Y la trajo Isaac a la tienda de su madre Sara, y tomó a Rebeca por mujer, y la amó; y se consoló Isaac después de la muerte de su madre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 25, 1, 'Los descendientes de Abraham y Cetura', 'Abraham tomó otra mujer, cuyo nombre era Cetura,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 25, 2, NULL, 'la cual le dio a luz a Zimram, Jocsán, Medán, Madián, Isbac y Súa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 25, 3, NULL, 'Y Jocsán engendró a Seba y a Dedán; e hijos de Dedán fueron Asurim, Letusim y Leumim.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 25, 4, NULL, 'E hijos de Madián: Efa, Efer, Hanoc, Abida y Elda. Todos estos fueron hijos de Cetura.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 25, 5, NULL, 'Y Abraham dio todo cuanto tenía a Isaac.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 25, 6, NULL, 'Pero a los hijos de sus concubinas dio Abraham dones, y los envió lejos de Isaac su hijo, mientras él vivía, hacia el oriente, a la tierra oriental.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 25, 7, 'Muerte y sepultura de Abraham', 'Y estos fueron los días que vivió Abraham: ciento setenta y cinco años.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 25, 8, NULL, 'Y exhaló el espíritu, y murió Abraham en buena vejez, anciano y lleno de años, y fue unido a su pueblo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 25, 9, NULL, 'Y lo sepultaron Isaac e Ismael sus hijos en la cueva de Macpela, en la heredad de Efrón hijo de Zohar heteo, que está enfrente de Mamre,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 25, 10, NULL, 'heredad que compró Abraham de los hijos de Het; allí fue sepultado Abraham, y Sara su mujer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 25, 11, NULL, 'Y sucedió, después de muerto Abraham, que Dios bendijo a Isaac su hijo; y habitó Isaac junto al pozo del Viviente-que-me-ve.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 25, 12, 'Los descendientes de Ismael', 'Estos son los descendientes de Ismael hijo de Abraham, a quien le dio a luz Agar la egipcia, sierva de Sara;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 25, 13, NULL, 'estos, pues, son los nombres de los hijos de Ismael, nombrados en el orden de su nacimiento: El primogénito de Ismael, Nebaiot; luego Cedar, Adbeel, Mibsam,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 25, 14, NULL, 'Misma, Duma, Massa,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 25, 15, NULL, 'Hadar, Tema, Jetur, Nafis y Cedema.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 25, 16, NULL, 'Estos son los hijos de Ismael, y estos sus nombres, por sus villas y por sus campamentos; doce príncipes por sus familias.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 25, 17, NULL, 'Y estos fueron los años de la vida de Ismael, ciento treinta y siete años; y exhaló el espíritu Ismael, y murió, y fue unido a su pueblo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 25, 18, NULL, 'Y habitaron desde Havila hasta Shur, que está enfrente de Egipto viniendo a Asiria; y murió en presencia de todos sus hermanos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 25, 19, 'Nacimiento de Jacob y Esaú', 'Estos son los descendientes de Isaac hijo de Abraham: Abraham engendró a Isaac,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 25, 20, NULL, 'y era Isaac de cuarenta años cuando tomó por mujer a Rebeca, hija de Betuel arameo de Padan-aram, hermana de Labán arameo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 25, 21, NULL, 'Y oró Isaac a Jehová por su mujer, que era estéril; y lo aceptó Jehová, y concibió Rebeca su mujer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 25, 22, NULL, 'Y los hijos luchaban dentro de ella; y dijo: Si es así, ¿para qué vivo yo? Y fue a consultar a Jehová;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 25, 23, NULL, 'y le respondió Jehová: Dos naciones hay en tu seno, Y dos pueblos serán divididos desde tus entrañas; El un pueblo será más fuerte que el otro pueblo, Y el mayor servirá al menor.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 25, 24, NULL, 'Cuando se cumplieron sus días para dar a luz, he aquí había gemelos en su vientre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 25, 25, NULL, 'Y salió el primero rubio, y era todo velludo como una pelliza; y llamaron su nombre Esaú.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 25, 26, NULL, 'Después salió su hermano, trabada su mano al calcañar de Esaú; y fue llamado su nombre Jacob. Y era Isaac de edad de sesenta años cuando ella los dio a luz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 25, 27, 'Esaú vende su primogenitura', 'Y crecieron los niños, y Esaú fue diestro en la caza, hombre del campo; pero Jacob era varón quieto, que habitaba en tiendas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 25, 28, NULL, 'Y amó Isaac a Esaú, porque comía de su caza; mas Rebeca amaba a Jacob.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 25, 29, NULL, 'Y guisó Jacob un potaje; y volviendo Esaú del campo, cansado,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 25, 30, NULL, 'dijo a Jacob: Te ruego que me des a comer de ese guiso rojo, pues estoy muy cansado. Por tanto fue llamado su nombre Edom.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 25, 31, NULL, 'Y Jacob respondió: Véndeme en este día tu primogenitura.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 25, 32, NULL, 'Entonces dijo Esaú: He aquí yo me voy a morir; ¿para qué, pues, me servirá la primogenitura?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 25, 33, NULL, 'Y dijo Jacob: Júramelo en este día. Y él le juró, y vendió a Jacob su primogenitura.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 25, 34, NULL, 'Entonces Jacob dio a Esaú pan y del guisado de las lentejas; y él comió y bebió, y se levantó y se fue. Así menospreció Esaú la primogenitura.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 26, 1, 'Isaac en Gerar', 'Después hubo hambre en la tierra, además de la primera hambre que hubo en los días de Abraham; y se fue Isaac a Abimelec rey de los filisteos, en Gerar.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 26, 2, NULL, 'Y se le apareció Jehová, y le dijo: No desciendas a Egipto; habita en la tierra que yo te diré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 26, 3, NULL, 'Habita como forastero en esta tierra, y estaré contigo, y te bendeciré; porque a ti y a tu descendencia daré todas estas tierras, y confirmaré el juramento que hice a Abraham tu padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 26, 4, NULL, 'Multiplicaré tu descendencia como las estrellas del cielo, y daré a tu descendencia todas estas tierras; y todas las naciones de la tierra serán benditas en tu simiente,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 26, 5, NULL, 'por cuanto oyó Abraham mi voz, y guardó mi precepto, mis mandamientos, mis estatutos y mis leyes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 26, 6, NULL, 'Habitó, pues, Isaac en Gerar.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 26, 7, NULL, 'Y los hombres de aquel lugar le preguntaron acerca de su mujer; y él respondió: Es mi hermana; porque tuvo miedo de decir: Es mi mujer; pensando que tal vez los hombres del lugar lo matarían por causa de Rebeca, pues ella era de hermoso aspecto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 26, 8, NULL, 'Sucedió que después que él estuvo allí muchos días, Abimelec, rey de los filisteos, mirando por una ventana, vio a Isaac que acariciaba a Rebeca su mujer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 26, 9, NULL, 'Y llamó Abimelec a Isaac, y dijo: He aquí ella es de cierto tu mujer. ¿Cómo, pues, dijiste: Es mi hermana? E Isaac le respondió: Porque dije: Quizá moriré por causa de ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 26, 10, NULL, 'Y Abimelec dijo: ¿Por qué nos has hecho esto? Por poco hubiera dormido alguno del pueblo con tu mujer, y hubieras traído sobre nosotros el pecado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 26, 11, NULL, 'Entonces Abimelec mandó a todo el pueblo, diciendo: El que tocare a este hombre o a su mujer, de cierto morirá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 26, 12, NULL, 'Y sembró Isaac en aquella tierra, y cosechó aquel año ciento por uno; y le bendijo Jehová.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 26, 13, NULL, 'El varón se enriqueció, y fue prosperado, y se engrandeció hasta hacerse muy poderoso.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 26, 14, NULL, 'Y tuvo hato de ovejas, y hato de vacas, y mucha labranza; y los filisteos le tuvieron envidia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 26, 15, NULL, 'Y todos los pozos que habían abierto los criados de Abraham su padre en sus días, los filisteos los habían cegado y llenado de tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 26, 16, NULL, 'Entonces dijo Abimelec a Isaac: Apártate de nosotros, porque mucho más poderoso que nosotros te has hecho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 26, 17, NULL, 'E Isaac se fue de allí, y acampó en el valle de Gerar, y habitó allí.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 26, 18, NULL, 'Y volvió a abrir Isaac los pozos de agua que habían abierto en los días de Abraham su padre, y que los filisteos habían cegado después de la muerte de Abraham; y los llamó por los nombres que su padre los había llamado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 26, 19, NULL, 'Pero cuando los siervos de Isaac cavaron en el valle, y hallaron allí un pozo de aguas vivas,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 26, 20, NULL, 'los pastores de Gerar riñeron con los pastores de Isaac, diciendo: El agua es nuestra. Por eso llamó el nombre del pozo Esek, porque habían altercado con él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 26, 21, NULL, 'Y abrieron otro pozo, y también riñeron sobre él; y llamó su nombre Sitna.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 26, 22, NULL, 'Y se apartó de allí, y abrió otro pozo, y no riñeron sobre él; y llamó su nombre Rehobot, y dijo: Porque ahora Jehová nos ha prosperado, y fructificaremos en la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 26, 23, NULL, 'Y de allí subió a Beerseba.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 26, 24, NULL, 'Y se le apareció Jehová aquella noche, y le dijo: Yo soy el Dios de Abraham tu padre; no temas, porque yo estoy contigo, y te bendeciré, y multiplicaré tu descendencia por amor de Abraham mi siervo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 26, 25, NULL, 'Y edificó allí un altar, e invocó el nombre de Jehová, y plantó allí su tienda; y abrieron allí los siervos de Isaac un pozo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 26, 26, NULL, 'Y Abimelec vino a él desde Gerar, y Ahuzat, amigo suyo, y Ficol, capitán de su ejército.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 26, 27, NULL, 'Y les dijo Isaac: ¿Por qué venís a mí, pues que me habéis aborrecido, y me echasteis de entre vosotros?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 26, 28, NULL, 'Y ellos respondieron: Hemos visto que Jehová está contigo; y dijimos: Haya ahora juramento entre nosotros, entre tú y nosotros, y haremos pacto contigo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 26, 29, NULL, 'que no nos hagas mal, como nosotros no te hemos tocado, y como solamente te hemos hecho bien, y te enviamos en paz; tú eres ahora bendito de Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 26, 30, NULL, 'Entonces él les hizo banquete, y comieron y bebieron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 26, 31, NULL, 'Y se levantaron de madrugada, y juraron el uno al otro; e Isaac los despidió, y ellos se despidieron de él en paz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 26, 32, NULL, 'En aquel día sucedió que vinieron los criados de Isaac, y le dieron nuevas acerca del pozo que habían abierto, y le dijeron: Hemos hallado agua.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 26, 33, NULL, 'Y lo llamó Seba; por esta causa el nombre de aquella ciudad es Beerseba hasta este día.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 26, 34, NULL, 'Y cuando Esaú era de cuarenta años, tomó por mujer a Judit hija de Beeri heteo, y a Basemat hija de Elón heteo;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 26, 35, NULL, 'y fueron amargura de espíritu para Isaac y para Rebeca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 1, 'Jacob obtiene la bendición de Isaac', 'Aconteció que cuando Isaac envejeció, y sus ojos se oscurecieron quedando sin vista, llamó a Esaú su hijo mayor, y le dijo: Hijo mío. Y él respondió: Heme aquí.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 2, NULL, 'Y él dijo: He aquí ya soy viejo, no sé el día de mi muerte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 3, NULL, 'Toma, pues, ahora tus armas, tu aljaba y tu arco, y sal al campo y tráeme caza;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 4, NULL, 'y hazme un guisado como a mí me gusta, y tráemelo, y comeré, para que yo te bendiga antes que muera.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 5, NULL, 'Y Rebeca estaba oyendo, cuando hablaba Isaac a Esaú su hijo; y se fue Esaú al campo para buscar la caza que había de traer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 6, NULL, 'Entonces Rebeca habló a Jacob su hijo, diciendo: He aquí yo he oído a tu padre que hablaba con Esaú tu hermano, diciendo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 7, NULL, 'Tráeme caza y hazme un guisado, para que coma, y te bendiga en presencia de Jehová antes que yo muera.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 8, NULL, 'Ahora, pues, hijo mío, obedece a mi voz en lo que te mando.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 9, NULL, 'Ve ahora al ganado, y tráeme de allí dos buenos cabritos de las cabras, y haré de ellos viandas para tu padre, como a él le gusta;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 10, NULL, 'y tú las llevarás a tu padre, y comerá, para que él te bendiga antes de su muerte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 11, NULL, 'Y Jacob dijo a Rebeca su madre: He aquí, Esaú mi hermano es hombre velloso, y yo lampiño.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 12, NULL, 'Quizá me palpará mi padre, y me tendrá por burlador, y traeré sobre mí maldición y no bendición.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 13, NULL, 'Y su madre respondió: Hijo mío, sea sobre mí tu maldición; solamente obedece a mi voz y ve y tráemelos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 14, NULL, 'Entonces él fue y los tomó, y los trajo a su madre; y su madre hizo guisados, como a su padre le gustaba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 15, NULL, 'Y tomó Rebeca los vestidos de Esaú su hijo mayor, los preciosos, que ella tenía en casa, y vistió a Jacob su hijo menor;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 16, NULL, 'y cubrió sus manos y la parte de su cuello donde no tenía vello, con las pieles de los cabritos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 17, NULL, 'y entregó los guisados y el pan que había preparado, en manos de Jacob su hijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 18, NULL, 'Entonces este fue a su padre y dijo: Padre mío. E Isaac respondió: Heme aquí; ¿quién eres, hijo mío?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 19, NULL, 'Y Jacob dijo a su padre: Yo soy Esaú tu primogénito; he hecho como me dijiste: levántate ahora, y siéntate, y come de mi caza, para que me bendigas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 20, NULL, 'Entonces Isaac dijo a su hijo: ¿Cómo es que la hallaste tan pronto, hijo mío? Y él respondió: Porque Jehová tu Dios hizo que la encontrase delante de mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 21, NULL, 'E Isaac dijo a Jacob: Acércate ahora, y te palparé, hijo mío, por si eres mi hijo Esaú o no.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 22, NULL, 'Y se acercó Jacob a su padre Isaac, quien le palpó, y dijo: La voz es la voz de Jacob, pero las manos, las manos de Esaú.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 23, NULL, 'Y no le conoció, porque sus manos eran vellosas como las manos de Esaú; y le bendijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 24, NULL, 'Y dijo: ¿Eres tú mi hijo Esaú? Y Jacob respondió: Yo soy.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 25, NULL, 'Dijo también: Acércamela, y comeré de la caza de mi hijo, para que yo te bendiga; y Jacob se la acercó, e Isaac comió; le trajo también vino, y bebió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 26, NULL, 'Y le dijo Isaac su padre: Acércate ahora, y bésame, hijo mío.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 27, NULL, 'Y Jacob se acercó, y le besó; y olió Isaac el olor de sus vestidos, y le bendijo, diciendo: Mira, el olor de mi hijo, Como el olor del campo que Jehová ha bendecido;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 28, NULL, 'Dios, pues, te dé del rocío del cielo, Y de las grosuras de la tierra, Y abundancia de trigo y de mosto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 29, NULL, 'Sírvante pueblos, Y naciones se inclinen a ti; Sé señor de tus hermanos, Y se inclinen ante ti los hijos de tu madre. Malditos los que te maldijeren, Y benditos los que te bendijeren.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 30, NULL, 'Y aconteció, luego que Isaac acabó de bendecir a Jacob, y apenas había salido Jacob de delante de Isaac su padre, que Esaú su hermano volvió de cazar.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 31, NULL, 'E hizo él también guisados, y se los llevó a su padre, y le dijo: Levántese mi padre, y coma de la caza de su hijo, para que me bendiga.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 32, NULL, 'Entonces Isaac su padre le dijo: ¿Quién eres tú? Y él le dijo: Yo soy tu hijo, tu primogénito, Esaú.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 33, NULL, 'Y se estremeció Isaac grandemente, y dijo: ¿Quién es el que vino aquí, que trajo caza, y me dio, y comí de todo antes que tú vinieses? Yo le bendije, y será bendito.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 34, NULL, 'Cuando Esaú oyó las palabras de su padre, clamó con una muy grande y muy amarga exclamación, y le dijo: Bendíceme también a mí, padre mío.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 35, NULL, 'Y él dijo: Vino tu hermano con engaño, y tomó tu bendición.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 36, NULL, 'Y Esaú respondió: Bien llamaron su nombre Jacob, pues ya me ha suplantado dos veces: se apoderó de mi primogenitura, y he aquí ahora ha tomado mi bendición. Y dijo: ¿No has guardado bendición para mí?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 37, NULL, 'Isaac respondió y dijo a Esaú: He aquí yo le he puesto por señor tuyo, y le he dado por siervos a todos sus hermanos; de trigo y de vino le he provisto; ¿qué, pues, te haré a ti ahora, hijo mío?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 38, NULL, 'Y Esaú respondió a su padre: ¿No tienes más que una sola bendición, padre mío? Bendíceme también a mí, padre mío. Y alzó Esaú su voz, y lloró.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 39, NULL, 'Entonces Isaac su padre habló y le dijo: He aquí, será tu habitación en grosuras de la tierra, Y del rocío de los cielos de arriba;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 40, NULL, 'Y por tu espada vivirás, y a tu hermano servirás; Y sucederá cuando te fortalezcas, Que descargarás su yugo de tu cerviz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 41, 'Jacob huye de Esaú', 'Y aborreció Esaú a Jacob por la bendición con que su padre le había bendecido, y dijo en su corazón: Llegarán los días del luto de mi padre, y yo mataré a mi hermano Jacob.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 42, NULL, 'Y fueron dichas a Rebeca las palabras de Esaú su hijo mayor; y ella envió y llamó a Jacob su hijo menor, y le dijo: He aquí, Esaú tu hermano se consuela acerca de ti con la idea de matarte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 43, NULL, 'Ahora pues, hijo mío, obedece a mi voz; levántate y huye a casa de Labán mi hermano en Harán,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 44, NULL, 'y mora con él algunos días, hasta que el enojo de tu hermano se mitigue;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 45, NULL, 'hasta que se aplaque la ira de tu hermano contra ti, y olvide lo que le has hecho; yo enviaré entonces, y te traeré de allá. ¿Por qué seré privada de vosotros ambos en un día?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 27, 46, NULL, 'Y dijo Rebeca a Isaac: Fastidio tengo de mi vida, a causa de las hijas de Het. Si Jacob toma mujer de las hijas de Het, como estas, de las hijas de esta tierra, ¿para qué quiero la vida?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 28, 1, NULL, 'Entonces Isaac llamó a Jacob, y lo bendijo, y le mandó diciendo: No tomes mujer de las hijas de Canaán.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 28, 2, NULL, 'Levántate, ve a Padan-aram, a casa de Betuel, padre de tu madre, y toma allí mujer de las hijas de Labán, hermano de tu madre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 28, 3, NULL, 'Y el Dios omnipotente te bendiga, y te haga fructificar y te multiplique, hasta llegar a ser multitud de pueblos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 28, 4, NULL, 'y te dé la bendición de Abraham, y a tu descendencia contigo, para que heredes la tierra en que moras, que Dios dio a Abraham.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 28, 5, NULL, 'Así envió Isaac a Jacob, el cual fue a Padan-aram, a Labán hijo de Betuel arameo, hermano de Rebeca madre de Jacob y de Esaú.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 28, 6, NULL, 'Y vio Esaú cómo Isaac había bendecido a Jacob, y le había enviado a Padan-aram, para tomar para sí mujer de allí; y que cuando le bendijo, le había mandado diciendo: No tomarás mujer de las hijas de Canaán;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 28, 7, NULL, 'y que Jacob había obedecido a su padre y a su madre, y se había ido a Padan-aram.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 28, 8, NULL, 'Vio asimismo Esaú que las hijas de Canaán parecían mal a Isaac su padre;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 28, 9, NULL, 'y se fue Esaú a Ismael, y tomó para sí por mujer a Mahalat, hija de Ismael hijo de Abraham, hermana de Nebaiot, además de sus otras mujeres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 28, 10, 'Dios se aparece a Jacob en Bet-el', 'Salió, pues, Jacob de Beerseba, y fue a Harán.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 28, 11, NULL, 'Y llegó a un cierto lugar, y durmió allí, porque ya el sol se había puesto; y tomó de las piedras de aquel paraje y puso a su cabecera, y se acostó en aquel lugar.', 0, 'spa', 'RVR1960', NULL);\n"
;

  public static final String SQL_PARTE_4 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Gn', 28, 12, NULL, 'Y soñó: y he aquí una escalera que estaba apoyada en tierra, y su extremo tocaba en el cielo; y he aquí ángeles de Dios que subían y descendían por ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 28, 13, NULL, 'Y he aquí, Jehová estaba en lo alto de ella, el cual dijo: Yo soy Jehová, el Dios de Abraham tu padre, y el Dios de Isaac; la tierra en que estás acostado te la daré a ti y a tu descendencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 28, 14, NULL, 'Será tu descendencia como el polvo de la tierra, y te extenderás al occidente, al oriente, al norte y al sur; y todas las familias de la tierra serán benditas en ti y en tu simiente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 28, 15, NULL, 'He aquí, yo estoy contigo, y te guardaré por dondequiera que fueres, y volveré a traerte a esta tierra; porque no te dejaré hasta que haya hecho lo que te he dicho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 28, 16, NULL, 'Y despertó Jacob de su sueño, y dijo: Ciertamente Jehová está en este lugar, y yo no lo sabía.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 28, 17, NULL, 'Y tuvo miedo, y dijo: ¡Cuán terrible es este lugar! No es otra cosa que casa de Dios, y puerta del cielo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 28, 18, NULL, 'Y se levantó Jacob de mañana, y tomó la piedra que había puesto de cabecera, y la alzó por señal, y derramó aceite encima de ella.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 28, 19, NULL, 'Y llamó el nombre de aquel lugar Bet-el, aunque Luz era el nombre de la ciudad primero.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 28, 20, NULL, 'E hizo Jacob voto, diciendo: Si fuere Dios conmigo, y me guardare en este viaje en que voy, y me diere pan para comer y vestido para vestir,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 28, 21, NULL, 'y si volviere en paz a casa de mi padre, Jehová será mi Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 28, 22, NULL, 'Y esta piedra que he puesto por señal, será casa de Dios; y de todo lo que me dieres, el diezmo apartaré para ti.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 29, 1, 'Jacob sirve a Labán por Raquel y Lea', 'Siguió luego Jacob su camino, y fue a la tierra de los orientales.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 29, 2, NULL, 'Y miró, y vio un pozo en el campo; y he aquí tres rebaños de ovejas que yacían cerca de él, porque de aquel pozo abrevaban los ganados; y había una gran piedra sobre la boca del pozo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 29, 3, NULL, 'Y juntaban allí todos los rebaños; y revolvían la piedra de la boca del pozo, y abrevaban las ovejas, y volvían la piedra sobre la boca del pozo a su lugar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 29, 4, NULL, 'Y les dijo Jacob: Hermanos míos, ¿de dónde sois? Y ellos respondieron: De Harán somos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 29, 5, NULL, 'Él les dijo: ¿Conocéis a Labán hijo de Nacor? Y ellos dijeron: Sí, le conocemos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 29, 6, NULL, 'Y él les dijo: ¿Está bien? Y ellos dijeron: Bien, y he aquí Raquel su hija viene con las ovejas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 29, 7, NULL, 'Y él dijo: He aquí es aún muy de día; no es tiempo todavía de recoger el ganado; abrevad las ovejas, e id a apacentarlas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 29, 8, NULL, 'Y ellos respondieron: No podemos, hasta que se junten todos los rebaños, y remuevan la piedra de la boca del pozo, para que abrevemos las ovejas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 29, 9, NULL, 'Mientras él aún hablaba con ellos, Raquel vino con el rebaño de su padre, porque ella era la pastora.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 29, 10, NULL, 'Y sucedió que cuando Jacob vio a Raquel, hija de Labán hermano de su madre, y las ovejas de Labán el hermano de su madre, se acercó Jacob y removió la piedra de la boca del pozo, y abrevó el rebaño de Labán hermano de su madre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 29, 11, NULL, 'Y Jacob besó a Raquel, y alzó su voz y lloró.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 29, 12, NULL, 'Y Jacob dijo a Raquel que él era hermano de su padre, y que era hijo de Rebeca; y ella corrió, y dio las nuevas a su padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 29, 13, NULL, 'Así que oyó Labán las nuevas de Jacob, hijo de su hermana, corrió a recibirlo, y lo abrazó, lo besó, y lo trajo a su casa; y él contó a Labán todas estas cosas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 29, 14, NULL, 'Y Labán le dijo: Ciertamente hueso mío y carne mía eres. Y estuvo con él durante un mes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 29, 15, NULL, 'Entonces dijo Labán a Jacob: ¿Por ser tú mi hermano, me servirás de balde? Dime cuál será tu salario.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 29, 16, NULL, 'Y Labán tenía dos hijas: el nombre de la mayor era Lea, y el nombre de la menor, Raquel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 29, 17, NULL, 'Y los ojos de Lea eran delicados, pero Raquel era de lindo semblante y de hermoso parecer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 29, 18, NULL, 'Y Jacob amó a Raquel, y dijo: Yo te serviré siete años por Raquel tu hija menor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 29, 19, NULL, 'Y Labán respondió: Mejor es que te la dé a ti, y no que la dé a otro hombre; quédate conmigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 29, 20, NULL, 'Así sirvió Jacob por Raquel siete años; y le parecieron como pocos días, porque la amaba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 29, 21, NULL, 'Entonces dijo Jacob a Labán: Dame mi mujer, porque mi tiempo se ha cumplido, para unirme a ella.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 29, 22, NULL, 'Entonces Labán juntó a todos los varones de aquel lugar, e hizo banquete.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 29, 23, NULL, 'Y sucedió que a la noche tomó a Lea su hija, y se la trajo; y él se llegó a ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 29, 24, NULL, 'Y dio Labán su sierva Zilpa a su hija Lea por criada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 29, 25, NULL, 'Venida la mañana, he aquí que era Lea; y Jacob dijo a Labán: ¿Qué es esto que me has hecho? ¿No te he servido por Raquel? ¿Por qué, pues, me has engañado?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 29, 26, NULL, 'Y Labán respondió: No se hace así en nuestro lugar, que se dé la menor antes de la mayor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 29, 27, NULL, 'Cumple la semana de esta, y se te dará también la otra, por el servicio que hagas conmigo otros siete años.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 29, 28, NULL, 'E hizo Jacob así, y cumplió la semana de aquella; y él le dio a Raquel su hija por mujer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 29, 29, NULL, 'Y dio Labán a Raquel su hija su sierva Bilha por criada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 29, 30, NULL, 'Y se llegó también a Raquel, y la amó también más que a Lea; y sirvió a Labán aún otros siete años.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 29, 31, 'Los hijos de Jacob', 'Y vio Jehová que Lea era menospreciada, y le dio hijos; pero Raquel era estéril.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 29, 32, NULL, 'Y concibió Lea, y dio a luz un hijo, y llamó su nombre Rubén, porque dijo: Ha mirado Jehová mi aflicción; ahora, por tanto, me amará mi marido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 29, 33, NULL, 'Concibió otra vez, y dio a luz un hijo, y dijo: Por cuanto oyó Jehová que yo era menospreciada, me ha dado también este. Y llamó su nombre Simeón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 29, 34, NULL, 'Y concibió otra vez, y dio a luz un hijo, y dijo: Ahora esta vez se unirá mi marido conmigo, porque le he dado a luz tres hijos; por tanto, llamó su nombre Leví.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 29, 35, NULL, 'Concibió otra vez, y dio a luz un hijo, y dijo: Esta vez alabaré a Jehová; por esto llamó su nombre Judá; y dejó de dar a luz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 1, NULL, 'Viendo Raquel que no daba hijos a Jacob, tuvo envidia de su hermana, y decía a Jacob: Dame hijos, o si no, me muero.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 2, NULL, 'Y Jacob se enojó contra Raquel, y dijo: ¿Soy yo acaso Dios, que te impidió el fruto de tu vientre?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 3, NULL, 'Y ella dijo: He aquí mi sierva Bilha; llégate a ella, y dará a luz sobre mis rodillas, y yo también tendré hijos de ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 4, NULL, 'Así le dio a Bilha su sierva por mujer; y Jacob se llegó a ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 5, NULL, 'Y concibió Bilha, y dio a luz un hijo a Jacob.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 6, NULL, 'Dijo entonces Raquel: Me juzgó Dios, y también oyó mi voz, y me dio un hijo. Por tanto llamó su nombre Dan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 7, NULL, 'Concibió otra vez Bilha la sierva de Raquel, y dio a luz un segundo hijo a Jacob.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 8, NULL, 'Y dijo Raquel: Con luchas de Dios he contendido con mi hermana, y he vencido. Y llamó su nombre Neftalí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 9, NULL, 'Viendo, pues, Lea, que había dejado de dar a luz, tomó a Zilpa su sierva, y la dio a Jacob por mujer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 10, NULL, 'Y Zilpa sierva de Lea dio a luz un hijo a Jacob.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 11, NULL, 'Y dijo Lea: Vino la ventura; y llamó su nombre Gad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 12, NULL, 'Luego Zilpa la sierva de Lea dio a luz otro hijo a Jacob.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 13, NULL, 'Y dijo Lea: Para dicha mía; porque las mujeres me dirán dichosa; y llamó su nombre Aser.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 14, NULL, 'Fue Rubén en tiempo de la siega de los trigos, y halló mandrágoras en el campo, y las trajo a Lea su madre; y dijo Raquel a Lea: Te ruego que me des de las mandrágoras de tu hijo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 15, NULL, 'Y ella respondió: ¿Es poco que hayas tomado mi marido, sino que también te has de llevar las mandrágoras de mi hijo? Y dijo Raquel: Pues dormirá contigo esta noche por las mandrágoras de tu hijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 16, NULL, 'Cuando, pues, Jacob volvía del campo a la tarde, salió Lea a él, y le dijo: Llégate a mí, porque a la verdad te he alquilado por las mandrágoras de mi hijo. Y durmió con ella aquella noche.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 17, NULL, 'Y oyó Dios a Lea; y concibió, y dio a luz el quinto hijo a Jacob.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 18, NULL, 'Y dijo Lea: Dios me ha dado mi recompensa, por cuanto di mi sierva a mi marido; por eso llamó su nombre Isacar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 19, NULL, 'Después concibió Lea otra vez, y dio a luz el sexto hijo a Jacob.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 20, NULL, 'Y dijo Lea: Dios me ha dado una buena dote; ahora morará conmigo mi marido, porque le he dado a luz seis hijos; y llamó su nombre Zabulón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 21, NULL, 'Después dio a luz una hija, y llamó su nombre Dina.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 22, NULL, 'Y se acordó Dios de Raquel, y la oyó Dios, y le concedió hijos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 23, NULL, 'Y concibió, y dio a luz un hijo, y dijo: Dios ha quitado mi afrenta;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 24, NULL, 'y llamó su nombre José, diciendo: Añádame Jehová otro hijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 25, 'Tretas de Jacob y de Labán', 'Aconteció cuando Raquel hubo dado a luz a José, que Jacob dijo a Labán: Envíame, e iré a mi lugar, y a mi tierra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 26, NULL, 'Dame mis mujeres y mis hijos, por las cuales he servido contigo, y déjame ir; pues tú sabes los servicios que te he hecho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 27, NULL, 'Y Labán le respondió: Halle yo ahora gracia en tus ojos, y quédate; he experimentado que Jehová me ha bendecido por tu causa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 28, NULL, 'Y dijo: Señálame tu salario, y yo lo daré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 29, NULL, 'Y él respondió: Tú sabes cómo te he servido, y cómo ha estado tu ganado conmigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 30, NULL, 'Porque poco tenías antes de mi venida, y ha crecido en gran número, y Jehová te ha bendecido con mi llegada; y ahora, ¿cuándo trabajaré también por mi propia casa?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 31, NULL, 'Y él dijo: ¿Qué te daré? Y respondió Jacob: No me des nada; si hicieres por mí esto, volveré a apacentar tus ovejas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 32, NULL, 'Yo pasaré hoy por todo tu rebaño, poniendo aparte todas las ovejas manchadas y salpicadas de color, y todas las ovejas de color oscuro, y las manchadas y salpicadas de color entre las cabras; y esto será mi salario.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 33, NULL, 'Así responderá por mí mi honradez mañana, cuando vengas a reconocer mi salario; toda la que no fuere pintada ni manchada en las cabras, y de color oscuro entre mis ovejas, se me ha de tener como de hurto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 34, NULL, 'Dijo entonces Labán: Mira, sea como tú dices.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 35, NULL, 'Y Labán apartó aquel día los machos cabríos manchados y rayados, y todas las cabras manchadas y salpicadas de color, y toda aquella que tenía en sí algo de blanco, y todas las de color oscuro entre las ovejas, y las puso en mano de sus hijos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 36, NULL, 'Y puso tres días de camino entre sí y Jacob; y Jacob apacentaba las otras ovejas de Labán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 37, NULL, 'Tomó luego Jacob varas verdes de álamo, de avellano y de castaño, y descortezó en ellas mondaduras blancas, descubriendo así lo blanco de las varas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 38, NULL, 'Y puso las varas que había mondado delante del ganado, en los canales de los abrevaderos del agua donde venían a beber las ovejas, las cuales procreaban cuando venían a beber.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 39, NULL, 'Así concebían las ovejas delante de las varas; y parían borregos listados, pintados y salpicados de diversos colores.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 40, NULL, 'Y apartaba Jacob los corderos, y ponía con su propio rebaño los listados y todo lo que era oscuro del hato de Labán. Y ponía su hato aparte, y no lo ponía con las ovejas de Labán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 41, NULL, 'Y sucedía que cuantas veces se hallaban en celo las ovejas más fuertes, Jacob ponía las varas delante de las ovejas en los abrevaderos, para que concibiesen a la vista de las varas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 42, NULL, 'Pero cuando venían las ovejas más débiles, no las ponía; así eran las más débiles para Labán, y las más fuertes para Jacob.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 30, 43, NULL, 'Y se enriqueció el varón muchísimo, y tuvo muchas ovejas, y siervas y siervos, y camellos y asnos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 1, NULL, 'Y oía Jacob las palabras de los hijos de Labán, que decían: Jacob ha tomado todo lo que era de nuestro padre, y de lo que era de nuestro padre ha adquirido toda esta riqueza.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 2, NULL, 'Miraba también Jacob el semblante de Labán, y veía que no era para con él como había sido antes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 3, NULL, 'También Jehová dijo a Jacob: Vuélvete a la tierra de tus padres, y a tu parentela, y yo estaré contigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 4, NULL, 'Envió, pues, Jacob, y llamó a Raquel y a Lea al campo donde estaban sus ovejas,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 5, NULL, 'y les dijo: Veo que el semblante de vuestro padre no es para conmigo como era antes; mas el Dios de mi padre ha estado conmigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 6, NULL, 'Vosotras sabéis que con todas mis fuerzas he servido a vuestro padre;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 7, NULL, 'y vuestro padre me ha engañado, y me ha cambiado el salario diez veces; pero Dios no le ha permitido que me hiciese mal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 8, NULL, 'Si él decía así: Los pintados serán tu salario, entonces todas las ovejas parían pintados; y si decía así: Los listados serán tu salario; entonces todas las ovejas parían listados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 9, NULL, 'Así quitó Dios el ganado de vuestro padre, y me lo dio a mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 10, NULL, 'Y sucedió que al tiempo que las ovejas estaban en celo, alcé yo mis ojos y vi en sueños, y he aquí los machos que cubrían a las hembras eran listados, pintados y abigarrados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 11, NULL, 'Y me dijo el ángel de Dios en sueños: Jacob. Y yo dije: Heme aquí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 12, NULL, 'Y él dijo: Alza ahora tus ojos, y verás que todos los machos que cubren a las hembras son listados, pintados y abigarrados; porque yo he visto todo lo que Labán te ha hecho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 13, NULL, 'Yo soy el Dios de Bet-el, donde tú ungiste la piedra, y donde me hiciste un voto. Levántate ahora y sal de esta tierra, y vuélvete a la tierra de tu nacimiento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 14, NULL, 'Respondieron Raquel y Lea, y le dijeron: ¿Tenemos acaso parte o heredad en la casa de nuestro padre?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 15, NULL, '¿No nos tiene ya como por extrañas, pues que nos vendió, y aun se ha comido del todo nuestro precio?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 16, NULL, 'Porque toda la riqueza que Dios ha quitado a nuestro padre, nuestra es y de nuestros hijos; ahora, pues, haz todo lo que Dios te ha dicho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 17, 'Jacob huye de Labán', 'Entonces se levantó Jacob, y subió sus hijos y sus mujeres sobre los camellos,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 18, NULL, 'y puso en camino todo su ganado, y todo cuanto había adquirido, el ganado de su ganancia que había obtenido en Padan-aram, para volverse a Isaac su padre en la tierra de Canaán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 19, NULL, 'Pero Labán había ido a trasquilar sus ovejas; y Raquel hurtó los ídolos de su padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 20, NULL, 'Y Jacob engañó a Labán arameo, no haciéndole saber que se iba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 21, NULL, 'Huyó, pues, con todo lo que tenía; y se levantó y pasó el Éufrates, y se dirigió al monte de Galaad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 22, NULL, 'Y al tercer día fue dicho a Labán que Jacob había huido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 23, NULL, 'Entonces Labán tomó a sus parientes consigo, y fue tras Jacob camino de siete días, y le alcanzó en el monte de Galaad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 24, NULL, 'Y vino Dios a Labán arameo en sueños aquella noche, y le dijo: Guárdate que no hables a Jacob descomedidamente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 25, NULL, 'Alcanzó, pues, Labán a Jacob; y este había fijado su tienda en el monte; y Labán acampó con sus parientes en el monte de Galaad.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 26, NULL, 'Y dijo Labán a Jacob: ¿Qué has hecho, que me engañaste, y has traído a mis hijas como prisioneras de guerra?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 27, NULL, '¿Por qué te escondiste para huir, y me engañaste, y no me lo hiciste saber para que yo te despidiera con alegría y con cantares, con tamborín y arpa?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 28, NULL, 'Pues ni aun me dejaste besar a mis hijos y mis hijas. Ahora, locamente has hecho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 29, NULL, 'Poder hay en mi mano para haceros mal; mas el Dios de tu padre me habló anoche diciendo: Guárdate que no hables a Jacob descomedidamente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 30, NULL, 'Y ya que te ibas, porque tenías deseo de la casa de tu padre, ¿por qué me hurtaste mis dioses?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 31, NULL, 'Respondió Jacob y dijo a Labán: Porque tuve miedo; pues pensé que quizá me quitarías por fuerza tus hijas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 32, NULL, 'Aquel en cuyo poder hallares tus dioses, no viva; delante de nuestros hermanos reconoce lo que yo tenga tuyo, y llévatelo. Jacob no sabía que Raquel los había hurtado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 33, NULL, 'Entró Labán en la tienda de Jacob, en la tienda de Lea, y en la tienda de las dos siervas, y no los halló; y salió de la tienda de Lea, y entró en la tienda de Raquel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 34, NULL, 'Pero tomó Raquel los ídolos y los puso en una albarda de un camello, y se sentó sobre ellos; y buscó Labán en toda la tienda, y no los halló.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 35, NULL, 'Y ella dijo a su padre: No se enoje mi señor, porque no me puedo levantar delante de ti; pues estoy con la costumbre de las mujeres. Y él buscó, pero no halló los ídolos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 36, NULL, 'Entonces Jacob se enojó, y riñó con Labán; y respondió Jacob y dijo a Labán: ¿Qué transgresión es la mía? ¿Cuál es mi pecado, para que con tanto ardor hayas venido en mi persecución?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 37, NULL, 'Pues que has buscado en todas mis cosas, ¿qué has hallado de todos los enseres de tu casa? Ponlo aquí delante de mis hermanos y de los tuyos, y juzguen entre nosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 38, NULL, 'Estos veinte años he estado contigo; tus ovejas y tus cabras nunca abortaron, ni yo comí carnero de tus ovejas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 39, NULL, 'Nunca te traje lo arrebatado por las fieras: yo pagaba el daño; lo hurtado así de día como de noche, a mí me lo cobrabas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 40, NULL, 'De día me consumía el calor, y de noche la helada, y el sueño huía de mis ojos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 41, NULL, 'Así he estado veinte años en tu casa; catorce años te serví por tus dos hijas, y seis años por tu ganado, y has cambiado mi salario diez veces.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 42, NULL, 'Si el Dios de mi padre, Dios de Abraham y temor de Isaac, no estuviera conmigo, de cierto me enviarías ahora con las manos vacías; pero Dios vio mi aflicción y el trabajo de mis manos, y te reprendió anoche.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 43, NULL, 'Respondió Labán y dijo a Jacob: Las hijas son hijas mías, y los hijos, hijos míos son, y las ovejas son mis ovejas, y todo lo que tú ves es mío: ¿y qué puedo yo hacer hoy a estas mis hijas, o a sus hijos que ellas han dado a luz?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 44, NULL, 'Ven, pues, ahora, y hagamos pacto tú y yo, y sea por testimonio entre nosotros dos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 45, NULL, 'Entonces Jacob tomó una piedra, y la levantó por señal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 46, NULL, 'Y dijo Jacob a sus hermanos: Recoged piedras. Y tomaron piedras e hicieron un majano, y comieron allí sobre aquel majano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 47, NULL, 'Y lo llamó Labán, Jegar Sahaduta; y lo llamó Jacob, Galaad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 48, NULL, 'Porque Labán dijo: Este majano es testigo hoy entre nosotros dos; por eso fue llamado su nombre Galaad;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 49, NULL, 'y Mizpa, por cuanto dijo: Atalaye Jehová entre tú y yo, cuando nos apartemos el uno del otro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 50, NULL, 'Si afligieres a mis hijas, o si tomares otras mujeres además de mis hijas, nadie está con nosotros; mira, Dios es testigo entre nosotros dos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 51, NULL, 'Dijo más Labán a Jacob: He aquí este majano, y he aquí esta señal, que he erigido entre tú y yo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 52, NULL, 'Testigo sea este majano, y testigo sea esta señal, que ni yo pasaré de este majano contra ti, ni tú pasarás de este majano ni de esta señal contra mí, para mal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 53, NULL, 'El Dios de Abraham y el Dios de Nacor juzgue entre nosotros, el Dios de sus padres. Y Jacob juró por aquel a quien temía Isaac su padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 54, NULL, 'Entonces Jacob inmoló víctimas en el monte, y llamó a sus hermanos a comer pan; y comieron pan, y durmieron aquella noche en el monte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 31, 55, NULL, 'Y se levantó Labán de mañana, y besó sus hijos y sus hijas, y los bendijo; y regresó y se volvió a su lugar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 32, 1, 'Jacob se prepara para el encuentro con Esaú', 'Jacob siguió su camino, y le salieron al encuentro ángeles de Dios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 32, 2, NULL, 'Y dijo Jacob cuando los vio: Campamento de Dios es este; y llamó el nombre de aquel lugar Mahanaim.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 32, 3, NULL, 'Y envió Jacob mensajeros delante de sí a Esaú su hermano, a la tierra de Seir, campo de Edom.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 32, 4, NULL, 'Y les mandó diciendo: Así diréis a mi señor Esaú: Así dice tu siervo Jacob: Con Labán he morado, y me he detenido hasta ahora;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 32, 5, NULL, 'y tengo vacas, asnos, ovejas, y siervos y siervas; y envío a decirlo a mi señor, para hallar gracia en tus ojos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 32, 6, NULL, 'Y los mensajeros volvieron a Jacob, diciendo: Vinimos a tu hermano Esaú, y él también viene a recibirte, y cuatrocientos hombres con él.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 32, 7, NULL, 'Entonces Jacob tuvo gran temor, y se angustió; y distribuyó el pueblo que tenía consigo, y las ovejas y las vacas y los camellos, en dos campamentos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 32, 8, NULL, 'Y dijo: Si viene Esaú contra un campamento y lo ataca, el otro campamento escapará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 32, 9, NULL, 'Y dijo Jacob: Dios de mi padre Abraham, y Dios de mi padre Isaac, Jehová, que me dijiste: Vuélvete a tu tierra y a tu parentela, y yo te haré bien;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 32, 10, NULL, 'menor soy que todas las misericordias y que toda la verdad que has usado para con tu siervo; pues con mi cayado pasé este Jordán, y ahora estoy sobre dos campamentos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 32, 11, NULL, 'Líbrame ahora de la mano de mi hermano, de la mano de Esaú, porque le temo; no venga acaso y me hiera la madre con los hijos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 32, 12, NULL, 'Y tú has dicho: Yo te haré bien, y tu descendencia será como la arena del mar, que no se puede contar por la multitud.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 32, 13, NULL, 'Y durmió allí aquella noche, y tomó de lo que le vino a la mano un presente para su hermano Esaú:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 32, 14, NULL, 'doscientas cabras y veinte machos cabríos, doscientas ovejas y veinte carneros,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 32, 15, NULL, 'treinta camellas paridas con sus crías, cuarenta vacas y diez novillos, veinte asnas y diez borricos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 32, 16, NULL, 'Y lo entregó a sus siervos, cada manada de por sí; y dijo a sus siervos: Pasad delante de mí, y poned espacio entre manada y manada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 32, 17, NULL, 'Y mandó al primero, diciendo: Si Esaú mi hermano te encontrare, y te preguntare, diciendo: ¿De quién eres? ¿y adónde vas? ¿y para quién es esto que llevas delante de ti?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 32, 18, NULL, 'entonces dirás: Es un presente de tu siervo Jacob, que envía a mi señor Esaú; y he aquí también él viene tras nosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 32, 19, NULL, 'Mandó también al segundo, y al tercero, y a todos los que iban tras aquellas manadas, diciendo: Conforme a esto hablaréis a Esaú, cuando le hallareis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 32, 20, NULL, 'Y diréis también: He aquí tu siervo Jacob viene tras nosotros. Porque dijo: Apaciguaré su ira con el presente que va delante de mí, y después veré su rostro; quizá le seré acepto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 32, 21, NULL, 'Pasó, pues, el presente delante de él; y él durmió aquella noche en el campamento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 32, 22, 'Jacob lucha con el ángel en Peniel', 'Y se levantó aquella noche, y tomó sus dos mujeres, y sus dos siervas, y sus once hijos, y pasó el vado de Jaboc.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 32, 23, NULL, 'Los tomó, pues, e hizo pasar el arroyo a ellos y a todo lo que tenía.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 32, 24, NULL, 'Así se quedó Jacob solo; y luchó con él un varón hasta que rayaba el alba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 32, 25, NULL, 'Y cuando el varón vio que no podía con él, tocó en el sitio del encaje de su muslo, y se descoyuntó el muslo de Jacob mientras con él luchaba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 32, 26, NULL, 'Y dijo: Déjame, porque raya el alba. Y Jacob le respondió: No te dejaré, si no me bendices.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 32, 27, NULL, 'Y el varón le dijo: ¿Cuál es tu nombre? Y él respondió: Jacob.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 32, 28, NULL, 'Y el varón le dijo: No se dirá más tu nombre Jacob, sino Israel; porque has luchado con Dios y con los hombres, y has vencido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 32, 29, NULL, 'Entonces Jacob le preguntó, y dijo: Declárame ahora tu nombre. Y el varón respondió: ¿Por qué me preguntas por mi nombre? Y lo bendijo allí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 32, 30, NULL, 'Y llamó Jacob el nombre de aquel lugar, Peniel; porque dijo: Vi a Dios cara a cara, y fue librada mi alma.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 32, 31, NULL, 'Y cuando había pasado Peniel, le salió el sol; y cojeaba de su cadera.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 32, 32, NULL, 'Por esto no comen los hijos de Israel, hasta hoy día, del tendón que se contrajo, el cual está en el encaje del muslo; porque tocó a Jacob este sitio de su muslo en el tendón que se contrajo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 33, 1, 'Reconciliación entre Jacob y Esaú', 'Alzando Jacob sus ojos, miró, y he aquí venía Esaú, y los cuatrocientos hombres con él; entonces repartió él los niños entre Lea y Raquel y las dos siervas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 33, 2, NULL, 'Y puso las siervas y sus niños delante, luego a Lea y sus niños, y a Raquel y a José los últimos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 33, 3, NULL, 'Y él pasó delante de ellos y se inclinó a tierra siete veces, hasta que llegó a su hermano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 33, 4, NULL, 'Pero Esaú corrió a su encuentro y le abrazó, y se echó sobre su cuello, y le besó; y lloraron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 33, 5, NULL, 'Y alzó sus ojos y vio a las mujeres y los niños, y dijo: ¿Quiénes son estos? Y él respondió: Son los niños que Dios ha dado a tu siervo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 33, 6, NULL, 'Luego vinieron las siervas, ellas y sus niños, y se inclinaron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 33, 7, NULL, 'Y vino Lea con sus niños, y se inclinaron; y después llegó José y Raquel, y también se inclinaron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 33, 8, NULL, 'Y Esaú dijo: ¿Qué te propones con todos estos grupos que he encontrado? Y Jacob respondió: El hallar gracia en los ojos de mi señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 33, 9, NULL, 'Y dijo Esaú: Suficiente tengo yo, hermano mío; sea para ti lo que es tuyo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 33, 10, NULL, 'Y dijo Jacob: No, yo te ruego; si he hallado ahora gracia en tus ojos, acepta mi presente, porque he visto tu rostro, como si hubiera visto el rostro de Dios, pues que con tanto favor me has recibido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 33, 11, NULL, 'Acepta, te ruego, mi presente que te he traído, porque Dios me ha hecho merced, y todo lo que hay aquí es mío. E insistió con él, y Esaú lo tomó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 33, 12, NULL, 'Y Esaú dijo: Anda, vamos; y yo iré delante de ti.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 33, 13, NULL, 'Y Jacob le dijo: Mi señor sabe que los niños son tiernos, y que tengo ovejas y vacas paridas; y si las fatigan, en un día morirán todas las ovejas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 33, 14, NULL, 'Pase ahora mi señor delante de su siervo, y yo me iré poco a poco al paso del ganado que va delante de mí, y al paso de los niños, hasta que llegue a mi señor a Seir.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 33, 15, NULL, 'Y Esaú dijo: Dejaré ahora contigo de la gente que viene conmigo. Y Jacob dijo: ¿Para qué esto? Halle yo gracia en los ojos de mi señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 33, 16, NULL, 'Así volvió Esaú aquel día por su camino a Seir.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 33, 17, NULL, 'Y Jacob fue a Sucot, y edificó allí casa para sí, e hizo cabañas para su ganado; por tanto, llamó el nombre de aquel lugar Sucot.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 33, 18, NULL, 'Después Jacob llegó sano y salvo a la ciudad de Siquem, que está en la tierra de Canaán, cuando venía de Padan-aram; y acampó delante de la ciudad.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 33, 19, NULL, 'Y compró una parte del campo, donde plantó su tienda, de mano de los hijos de Hamor padre de Siquem, por cien monedas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 33, 20, NULL, 'Y erigió allí un altar, y lo llamó El-Elohe-Israel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 34, 1, 'La deshonra de Dina vengada', 'Salió Dina la hija de Lea, la cual esta había dado a luz a Jacob, a ver a las hijas del país.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 34, 2, NULL, 'Y la vio Siquem hijo de Hamor heveo, príncipe de aquella tierra, y la tomó, y se acostó con ella, y la deshonró.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 34, 3, NULL, 'Pero su alma se apegó a Dina la hija de Lea, y se enamoró de la joven, y habló al corazón de ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 34, 4, NULL, 'Y habló Siquem a Hamor su padre, diciendo: Tómame por mujer a esta joven.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 34, 5, NULL, 'Pero oyó Jacob que Siquem había amancillado a Dina su hija; y estando sus hijos con su ganado en el campo, calló Jacob hasta que ellos viniesen.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 34, 6, NULL, 'Y se dirigió Hamor padre de Siquem a Jacob, para hablar con él.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 34, 7, NULL, 'Y los hijos de Jacob vinieron del campo cuando lo supieron; y se entristecieron los varones, y se enojaron mucho, porque hizo vileza en Israel acostándose con la hija de Jacob, lo que no se debía haber hecho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 34, 8, NULL, 'Y Hamor habló con ellos, diciendo: El alma de mi hijo Siquem se ha apegado a vuestra hija; os ruego que se la deis por mujer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 34, 9, NULL, 'Y emparentad con nosotros; dadnos vuestras hijas, y tomad vosotros las nuestras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 34, 10, NULL, 'Y habitad con nosotros, porque la tierra estará delante de vosotros; morad y negociad en ella, y tomad en ella posesión.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 34, 11, NULL, 'Siquem también dijo al padre de Dina y a los hermanos de ella: Halle yo gracia en vuestros ojos, y daré lo que me dijereis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 34, 12, NULL, 'Aumentad a cargo mío mucha dote y dones, y yo daré cuanto me dijereis; y dadme la joven por mujer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 34, 13, NULL, 'Pero respondieron los hijos de Jacob a Siquem y a Hamor su padre con palabras engañosas, por cuanto había amancillado a Dina su hermana.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 34, 14, NULL, 'Y les dijeron: No podemos hacer esto de dar nuestra hermana a hombre incircunciso, porque entre nosotros es abominación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 34, 15, NULL, 'Mas con esta condición os complaceremos: si habéis de ser como nosotros, que se circuncide entre vosotros todo varón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 34, 16, NULL, 'Entonces os daremos nuestras hijas, y tomaremos nosotros las vuestras; y habitaremos con vosotros, y seremos un pueblo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 34, 17, NULL, 'Mas si no nos prestareis oído para circuncidaros, tomaremos nuestra hija y nos iremos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 34, 18, NULL, 'Y parecieron bien sus palabras a Hamor, y a Siquem hijo de Hamor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 34, 19, NULL, 'Y no tardó el joven en hacer aquello, porque la hija de Jacob le había agradado; y él era el más distinguido de toda la casa de su padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 34, 20, NULL, 'Entonces Hamor y Siquem su hijo vinieron a la puerta de su ciudad, y hablaron a los varones de su ciudad, diciendo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 34, 21, NULL, 'Estos varones son pacíficos con nosotros, y habitarán en el país, y traficarán en él; pues he aquí la tierra es bastante ancha para ellos; nosotros tomaremos sus hijas por mujeres, y les daremos las nuestras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 34, 22, NULL, 'Mas con esta condición consentirán estos hombres en habitar con nosotros, para que seamos un pueblo: que se circuncide todo varón entre nosotros, así como ellos son circuncidados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 34, 23, NULL, 'Su ganado, sus bienes y todas sus bestias serán nuestros; solamente convengamos con ellos, y habitarán con nosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 34, 24, NULL, 'Y obedecieron a Hamor y a Siquem su hijo todos los que salían por la puerta de la ciudad, y circuncidaron a todo varón, a cuantos salían por la puerta de su ciudad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 34, 25, NULL, 'Pero sucedió que al tercer día, cuando sentían ellos el mayor dolor, dos de los hijos de Jacob, Simeón y Leví, hermanos de Dina, tomaron cada uno su espada, y vinieron contra la ciudad, que estaba desprevenida, y mataron a todo varón.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 34, 26, NULL, 'Y a Hamor y a Siquem su hijo los mataron a filo de espada; y tomaron a Dina de casa de Siquem, y se fueron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 34, 27, NULL, 'Y los hijos de Jacob vinieron a los muertos, y saquearon la ciudad, por cuanto habían amancillado a su hermana.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 34, 28, NULL, 'Tomaron sus ovejas y vacas y sus asnos, y lo que había en la ciudad y en el campo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 34, 29, NULL, 'y todos sus bienes; llevaron cautivos a todos sus niños y sus mujeres, y robaron todo lo que había en casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 34, 30, NULL, 'Entonces dijo Jacob a Simeón y a Leví: Me habéis turbado con hacerme abominable a los moradores de esta tierra, el cananeo y el ferezeo; y teniendo yo pocos hombres, se juntarán contra mí y me atacarán, y seré destruido yo y mi casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 34, 31, NULL, 'Pero ellos respondieron: ¿Había él de tratar a nuestra hermana como a una ramera?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 35, 1, 'Dios bendice a Jacob en Bet-el', 'Dijo Dios a Jacob: Levántate y sube a Bet-el, y quédate allí; y haz allí un altar al Dios que te apareció cuando huías de tu hermano Esaú.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 35, 2, NULL, 'Entonces Jacob dijo a su familia y a todos los que con él estaban: Quitad los dioses ajenos que hay entre vosotros, y limpiaos, y mudad vuestros vestidos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 35, 3, NULL, 'Y levantémonos, y subamos a Bet-el; y haré allí altar al Dios que me respondió en el día de mi angustia, y ha estado conmigo en el camino que he andado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 35, 4, NULL, 'Así dieron a Jacob todos los dioses ajenos que había en poder de ellos, y los zarcillos que estaban en sus orejas; y Jacob los escondió debajo de una encina que estaba junto a Siquem.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 35, 5, NULL, 'Y salieron, y el terror de Dios estuvo sobre las ciudades que había en sus alrededores, y no persiguieron a los hijos de Jacob.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 35, 6, NULL, 'Y llegó Jacob a Luz, que está en tierra de Canaán (esta es Bet-el), él y todo el pueblo que con él estaba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 35, 7, NULL, 'Y edificó allí un altar, y llamó al lugar El-bet-el, porque allí le había aparecido Dios, cuando huía de su hermano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 35, 8, NULL, 'Entonces murió Débora, ama de Rebeca, y fue sepultada al pie de Bet-el, debajo de una encina, la cual fue llamada Alón-bacut.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 35, 9, NULL, 'Apareció otra vez Dios a Jacob, cuando había vuelto de Padan-aram, y le bendijo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 35, 10, NULL, 'Y le dijo Dios: Tu nombre es Jacob; no se llamará más tu nombre Jacob, sino Israel será tu nombre; y llamó su nombre Israel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 35, 11, NULL, 'También le dijo Dios: Yo soy el Dios omnipotente: crece y multiplícate; una nación y conjunto de naciones procederán de ti, y reyes saldrán de tus lomos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 35, 12, NULL, 'La tierra que he dado a Abraham y a Isaac, la daré a ti, y a tu descendencia después de ti daré la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 35, 13, NULL, 'Y se fue de él Dios, del lugar en donde había hablado con él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 35, 14, NULL, 'Y Jacob erigió una señal en el lugar donde había hablado con él, una señal de piedra, y derramó sobre ella libación, y echó sobre ella aceite.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 35, 15, NULL, 'Y llamó Jacob el nombre de aquel lugar donde Dios había hablado con él, Bet-el.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 35, 16, 'Muerte de Raquel', 'Después partieron de Bet-el; y había aún como media legua de tierra para llegar a Efrata, cuando dio a luz Raquel, y hubo trabajo en su parto.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 35, 17, NULL, 'Y aconteció, como había trabajo en su parto, que le dijo la partera: No temas, que también tendrás este hijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 35, 18, NULL, 'Y aconteció que al salírsele el alma (pues murió), llamó su nombre Benoni; mas su padre lo llamó Benjamín.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 35, 19, NULL, 'Así murió Raquel, y fue sepultada en el camino de Efrata, la cual es Belén.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 35, 20, NULL, 'Y levantó Jacob un pilar sobre su sepultura; esta es la señal de la sepultura de Raquel hasta hoy.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 35, 21, NULL, 'Y salió Israel, y plantó su tienda más allá de Migdal-edar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 35, 22, 'Los hijos de Jacob', 'Aconteció que cuando moraba Israel en aquella tierra, fue Rubén y durmió con Bilha la concubina de su padre; lo cual llegó a saber Israel. Ahora bien, los hijos de Israel fueron doce:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 35, 23, NULL, 'los hijos de Lea: Rubén el primogénito de Jacob; Simeón, Leví, Judá, Isacar y Zabulón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 35, 24, NULL, 'Los hijos de Raquel: José y Benjamín.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 35, 25, NULL, 'Los hijos de Bilha, sierva de Raquel: Dan y Neftalí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 35, 26, NULL, 'Y los hijos de Zilpa, sierva de Lea: Gad y Aser. Estos fueron los hijos de Jacob, que le nacieron en Padan-aram.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 35, 27, 'Muerte de Isaac', 'Después vino Jacob a Isaac su padre a Mamre, a la ciudad de Arba, que es Hebrón, donde habitaron Abraham e Isaac.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 35, 28, NULL, 'Y fueron los días de Isaac ciento ochenta años.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 35, 29, NULL, 'Y exhaló Isaac el espíritu, y murió, y fue recogido a su pueblo, viejo y lleno de días; y lo sepultaron Esaú y Jacob sus hijos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 1, 'Los descendientes de Esaú', 'Estas son las generaciones de Esaú, el cual es Edom:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 2, NULL, 'Esaú tomó sus mujeres de las hijas de Canaán: a Ada, hija de Elón heteo, a Aholibama, hija de Aná, hijo de Zibeón heveo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 3, NULL, 'y a Basemat hija de Ismael, hermana de Nebaiot.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 4, NULL, 'Ada dio a luz a Esaú a Elifaz; y Basemat dio a luz a Reuel.', 0, 'spa', 'RVR1960', NULL);\n"
;

  public static final String SQL_PARTE_5 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Gn', 36, 5, NULL, 'Y Aholibama dio a luz a Jeús, a Jaalam y a Coré; estos son los hijos de Esaú, que le nacieron en la tierra de Canaán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 6, NULL, 'Y Esaú tomó sus mujeres, sus hijos y sus hijas, y todas las personas de su casa, y sus ganados, y todas sus bestias, y todo cuanto había adquirido en la tierra de Canaán, y se fue a otra tierra, separándose de Jacob su hermano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 7, NULL, 'Porque los bienes de ellos eran muchos; y no podían habitar juntos, ni la tierra en donde moraban los podía sostener a causa de sus ganados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 8, NULL, 'Y Esaú habitó en el monte de Seir; Esaú es Edom.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 9, NULL, 'Estos son los linajes de Esaú, padre de Edom, en el monte de Seir.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 10, NULL, 'Estos son los nombres de los hijos de Esaú: Elifaz, hijo de Ada mujer de Esaú; Reuel, hijo de Basemat mujer de Esaú.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 11, NULL, 'Y los hijos de Elifaz fueron Temán, Omar, Zefo, Gatam y Cenaz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 12, NULL, 'Y Timna fue concubina de Elifaz hijo de Esaú, y ella le dio a luz a Amalec; estos son los hijos de Ada, mujer de Esaú.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 13, NULL, 'Los hijos de Reuel fueron Nahat, Zera, Sama y Miza; estos son los hijos de Basemat mujer de Esaú.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 14, NULL, 'Estos fueron los hijos de Aholibama mujer de Esaú, hija de Aná, que fue hijo de Zibeón: ella dio a luz a Jeús, Jaalam y Coré, hijos de Esaú.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 15, NULL, 'Estos son los jefes de entre los hijos de Esaú: hijos de Elifaz, primogénito de Esaú: los jefes Temán, Omar, Zefo, Cenaz,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 16, NULL, 'Coré, Gatam y Amalec; estos son los jefes de Elifaz en la tierra de Edom; estos fueron los hijos de Ada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 17, NULL, 'Y estos son los hijos de Reuel, hijo de Esaú: los jefes Nahat, Zera, Sama y Miza; estos son los jefes de la línea de Reuel en la tierra de Edom; estos hijos vienen de Basemat mujer de Esaú.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 18, NULL, 'Y estos son los hijos de Aholibama mujer de Esaú: los jefes Jeús, Jaalam y Coré; estos fueron los jefes que salieron de Aholibama mujer de Esaú, hija de Aná.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 19, NULL, 'Estos, pues, son los hijos de Esaú, y sus jefes; él es Edom.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 20, NULL, 'Estos son los hijos de Seir horeo, moradores de aquella tierra: Lotán, Sobal, Zibeón, Aná,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 21, NULL, 'Disón, Ezer y Disán; estos son los jefes de los horeos, hijos de Seir, en la tierra de Edom.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 22, NULL, 'Los hijos de Lotán fueron Hori y Hemam; y Timna fue hermana de Lotán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 23, NULL, 'Los hijos de Sobal fueron Alván, Manahat, Ebal, Sefo y Onam.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 24, NULL, 'Y los hijos de Zibeón fueron Aja y Aná. Este Aná es el que descubrió manantiales en el desierto, cuando apacentaba los asnos de Zibeón su padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 25, NULL, 'Los hijos de Aná fueron Disón, y Aholibama hija de Aná.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 26, NULL, 'Estos fueron los hijos de Disón: Hemdán, Esbán, Itrán y Querán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 27, NULL, 'Y estos fueron los hijos de Ezer: Bilhán, Zaaván y Acán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 28, NULL, 'Estos fueron los hijos de Disán: Uz y Arán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 29, NULL, 'Y estos fueron los jefes de los horeos: los jefes Lotán, Sobal, Zibeón, Aná,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 30, NULL, 'Disón, Ezer y Disán; estos fueron los jefes de los horeos, por sus mandos en la tierra de Seir.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 31, NULL, 'Y los reyes que reinaron en la tierra de Edom, antes que reinase rey sobre los hijos de Israel, fueron estos:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 32, NULL, 'Bela hijo de Beor reinó en Edom; y el nombre de su ciudad fue Dinaba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 33, NULL, 'Murió Bela, y reinó en su lugar Jobab hijo de Zera, de Bosra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 34, NULL, 'Murió Jobab, y en su lugar reinó Husam, de tierra de Temán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 35, NULL, 'Murió Husam, y reinó en su lugar Hadad hijo de Bedad, el que derrotó a Madián en el campo de Moab; y el nombre de su ciudad fue Avit.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 36, NULL, 'Murió Hadad, y en su lugar reinó Samla de Masreca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 37, NULL, 'Murió Samla, y reinó en su lugar Saúl de Rehobot junto al Éufrates.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 38, NULL, 'Murió Saúl, y en lugar suyo reinó Baal-hanán hijo de Acbor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 39, NULL, 'Y murió Baal-hanán hijo de Acbor, y reinó Hadar en lugar suyo; y el nombre de su ciudad fue Pau; y el nombre de su mujer, Mehetabel hija de Matred, hija de Mezaab.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 40, NULL, 'Estos, pues, son los nombres de los jefes de Esaú por sus linajes, por sus lugares, y sus nombres: Timna, Alva, Jetet,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 41, NULL, 'Aholibama, Ela, Pinón,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 42, NULL, 'Cenaz, Temán, Mibzar,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 36, 43, NULL, 'Magdiel e Iram. Estos fueron los jefes de Edom según sus moradas en la tierra de su posesión. Edom es el mismo Esaú, padre de los edomitas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 37, 1, 'José es vendido por sus hermanos', 'Habitó Jacob en la tierra donde había morado su padre, en la tierra de Canaán.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 37, 2, NULL, 'Esta es la historia de la familia de Jacob: José, siendo de edad de diecisiete años, apacentaba las ovejas con sus hermanos; y el joven estaba con los hijos de Bilha y con los hijos de Zilpa, mujeres de su padre; e informaba José a su padre la mala fama de ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 37, 3, NULL, 'Y amaba Israel a José más que a todos sus hijos, porque lo había tenido en su vejez; y le hizo una túnica de diversos colores.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 37, 4, NULL, 'Y viendo sus hermanos que su padre lo amaba más que a todos sus hermanos, le aborrecían, y no podían hablarle pacíficamente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 37, 5, NULL, 'Y soñó José un sueño, y lo contó a sus hermanos; y ellos llegaron a aborrecerle más todavía.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 37, 6, NULL, 'Y él les dijo: Oíd ahora este sueño que he soñado:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 37, 7, NULL, 'He aquí que atábamos manojos en medio del campo, y he aquí que mi manojo se levantaba y estaba derecho, y que vuestros manojos estaban alrededor y se inclinaban al mío.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 37, 8, NULL, 'Le respondieron sus hermanos: ¿Reinarás tú sobre nosotros, o señorearás sobre nosotros? Y le aborrecieron aún más a causa de sus sueños y sus palabras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 37, 9, NULL, 'Soñó aun otro sueño, y lo contó a sus hermanos, diciendo: He aquí que he soñado otro sueño, y he aquí que el sol y la luna y once estrellas se inclinaban a mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 37, 10, NULL, 'Y lo contó a su padre y a sus hermanos; y su padre le reprendió, y le dijo: ¿Qué sueño es este que soñaste? ¿Acaso vendremos yo y tu madre y tus hermanos a postrarnos en tierra ante ti?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 37, 11, NULL, 'Y sus hermanos le tenían envidia, mas su padre meditaba en esto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 37, 12, NULL, 'Después fueron sus hermanos a apacentar las ovejas de su padre en Siquem.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 37, 13, NULL, 'Y dijo Israel a José: Tus hermanos apacientan las ovejas en Siquem: ven, y te enviaré a ellos. Y él respondió: Heme aquí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 37, 14, NULL, 'E Israel le dijo: Ve ahora, mira cómo están tus hermanos y cómo están las ovejas, y tráeme la respuesta. Y lo envió del valle de Hebrón, y llegó a Siquem.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 37, 15, NULL, 'Y lo halló un hombre, andando él errante por el campo, y le preguntó aquel hombre, diciendo: ¿Qué buscas?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 37, 16, NULL, 'José respondió: Busco a mis hermanos; te ruego que me muestres dónde están apacentando.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 37, 17, NULL, 'Aquel hombre respondió: Ya se han ido de aquí; y yo les oí decir: Vamos a Dotán. Entonces José fue tras de sus hermanos, y los halló en Dotán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 37, 18, NULL, 'Cuando ellos lo vieron de lejos, antes que llegara cerca de ellos, conspiraron contra él para matarle.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 37, 19, NULL, 'Y dijeron el uno al otro: He aquí viene el soñador.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 37, 20, NULL, 'Ahora pues, venid, y matémosle y echémosle en una cisterna, y diremos: Alguna mala bestia lo devoró; y veremos qué será de sus sueños.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 37, 21, NULL, 'Cuando Rubén oyó esto, lo libró de sus manos, y dijo: No lo matemos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 37, 22, NULL, 'Y les dijo Rubén: No derraméis sangre; echadlo en esta cisterna que está en el desierto, y no pongáis mano en él; por librarlo así de sus manos, para hacerlo volver a su padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 37, 23, NULL, 'Sucedió, pues, que cuando llegó José a sus hermanos, ellos quitaron a José su túnica, la túnica de colores que tenía sobre sí;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 37, 24, NULL, 'y le tomaron y le echaron en la cisterna; pero la cisterna estaba vacía, no había en ella agua.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 37, 25, NULL, 'Y se sentaron a comer pan; y alzando los ojos miraron, y he aquí una compañía de ismaelitas que venía de Galaad, y sus camellos traían aromas, bálsamo y mirra, e iban a llevarlo a Egipto.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 37, 26, NULL, 'Entonces Judá dijo a sus hermanos: ¿Qué provecho hay en que matemos a nuestro hermano y encubramos su muerte?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 37, 27, NULL, 'Venid, y vendámosle a los ismaelitas, y no sea nuestra mano sobre él; porque él es nuestro hermano, nuestra propia carne. Y sus hermanos convinieron con él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 37, 28, NULL, 'Y cuando pasaban los madianitas mercaderes, sacaron ellos a José de la cisterna, y le trajeron arriba, y le vendieron a los ismaelitas por veinte piezas de plata. Y llevaron a José a Egipto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 37, 29, NULL, 'Después Rubén volvió a la cisterna, y no halló a José adentro, y se rasgó los vestidos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 37, 30, NULL, 'Y volvió a sus hermanos, y dijo: El joven no aparece; y yo, ¿a dónde iré?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 37, 31, NULL, 'Entonces tomaron ellos la túnica de José, y degollaron un cabrito de las cabras, y tiñeron la túnica con la sangre;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 37, 32, NULL, 'y enviaron la túnica de colores y la trajeron a su padre, y dijeron: Esto hemos hallado; reconoce ahora si es la túnica de tu hijo, o no.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 37, 33, NULL, 'Y él la reconoció, y dijo: La túnica de mi hijo es; alguna mala bestia lo devoró; José ha sido despedazado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 37, 34, NULL, 'Entonces Jacob rasgó sus vestidos, y puso cilicio sobre sus lomos, y guardó luto por su hijo muchos días.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 37, 35, NULL, 'Y se levantaron todos sus hijos y todas sus hijas para consolarlo; mas él no quiso recibir consuelo, y dijo: Descenderé enlutado a mi hijo hasta el Seol. Y lo lloró su padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 37, 36, NULL, 'Y los madianitas lo vendieron en Egipto a Potifar, oficial de Faraón, capitán de la guardia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 38, 1, 'Judá y Tamar', 'Aconteció en aquel tiempo, que Judá se apartó de sus hermanos, y se fue a un varón adulamita que se llamaba Hira.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 38, 2, NULL, 'Y vio allí Judá la hija de un hombre cananeo, el cual se llamaba Súa; y la tomó, y se llegó a ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 38, 3, NULL, 'Y ella concibió, y dio a luz un hijo, y llamó su nombre Er.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 38, 4, NULL, 'Concibió otra vez, y dio a luz un hijo, y llamó su nombre Onán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 38, 5, NULL, 'Y volvió a concebir, y dio a luz un hijo, y llamó su nombre Sela. Y estaba en Quezib cuando lo dio a luz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 38, 6, NULL, 'Después Judá tomó mujer para su primogénito Er, la cual se llamaba Tamar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 38, 7, NULL, 'Y Er, el primogénito de Judá, fue malo ante los ojos de Jehová, y le quitó Jehová la vida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 38, 8, NULL, 'Entonces Judá dijo a Onán: Llégate a la mujer de tu hermano, y despósate con ella, y levanta descendencia a tu hermano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 38, 9, NULL, 'Y sabiendo Onán que la descendencia no había de ser suya, sucedía que cuando se llegaba a la mujer de su hermano, vertía en tierra, por no dar descendencia a su hermano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 38, 10, NULL, 'Y desagradó en ojos de Jehová lo que hacía, y a él también le quitó la vida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 38, 11, NULL, 'Y Judá dijo a Tamar su nuera: Quédate viuda en casa de tu padre, hasta que crezca Sela mi hijo; porque dijo: No sea que muera él también como sus hermanos. Y se fue Tamar, y estuvo en casa de su padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 38, 12, NULL, 'Pasaron muchos días, y murió la hija de Súa, mujer de Judá. Después Judá se consoló, y subía a los trasquiladores de sus ovejas a Timnat, él y su amigo Hira el adulamita.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 38, 13, NULL, 'Y fue dado aviso a Tamar, diciendo: He aquí tu suegro sube a Timnat a trasquilar sus ovejas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 38, 14, NULL, 'Entonces se quitó ella los vestidos de su viudez, y se cubrió con un velo, y se arrebozó, y se puso a la entrada de Enaim junto al camino de Timnat; porque veía que había crecido Sela, y ella no era dada a él por mujer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 38, 15, NULL, 'Y la vio Judá, y la tuvo por ramera, porque ella había cubierto su rostro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 38, 16, NULL, 'Y se apartó del camino hacia ella, y le dijo: Déjame ahora llegarme a ti: pues no sabía que era su nuera; y ella dijo: ¿Qué me darás por llegarte a mí?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 38, 17, NULL, 'Él respondió: Yo te enviaré del ganado un cabrito de las cabras. Y ella dijo: Dame una prenda hasta que lo envíes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 38, 18, NULL, 'Entonces Judá dijo: ¿Qué prenda te daré? Ella respondió: Tu sello, tu cordón, y tu báculo que tienes en tu mano. Y él se los dio, y se llegó a ella, y ella concibió de él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 38, 19, NULL, 'Luego se levantó y se fue, y se quitó el velo de sobre sí, y se vistió las ropas de su viudez.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 38, 20, NULL, 'Y Judá envió el cabrito de las cabras por medio de su amigo el adulamita, para que este recibiese la prenda de la mujer; pero no la halló.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 38, 21, NULL, 'Y preguntó a los hombres de aquel lugar, diciendo: ¿Dónde está la ramera de Enaim junto al camino? Y ellos le dijeron: No ha estado aquí ramera alguna.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 38, 22, NULL, 'Entonces él se volvió a Judá, y dijo: No la he hallado; y también los hombres del lugar dijeron: Aquí no ha estado ramera.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 38, 23, NULL, 'Y Judá dijo: Tómeselo para sí, para que no seamos menospreciados; he aquí yo he enviado este cabrito, y tú no la hallaste.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 38, 24, NULL, 'Sucedió que al cabo de unos tres meses fue dado aviso a Judá, diciendo: Tamar tu nuera ha fornicado, y ciertamente está encinta a causa de las fornicaciones. Y Judá dijo: Sacadla, y sea quemada.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 38, 25, NULL, 'Pero ella, cuando la sacaban, envió a decir a su suegro: Del varón cuyas son estas cosas, estoy encinta. También dijo: Mira ahora de quién son estas cosas, el sello, el cordón y el báculo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 38, 26, NULL, 'Entonces Judá los reconoció, y dijo: Más justa es ella que yo, por cuanto no la he dado a Sela mi hijo. Y nunca más la conoció.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 38, 27, NULL, 'Y aconteció que al tiempo de dar a luz, he aquí había gemelos en su seno.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 38, 28, NULL, 'Sucedió cuando daba a luz, que sacó la mano el uno, y la partera tomó y ató a su mano un hilo de grana, diciendo: Este salió primero.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 38, 29, NULL, 'Pero volviendo él a meter la mano, he aquí salió su hermano; y ella dijo: ¡Qué brecha te has abierto! Y llamó su nombre Fares.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 38, 30, NULL, 'Después salió su hermano, el que tenía en su mano el hilo de grana, y llamó su nombre Zara.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 39, 1, 'José y la esposa de Potifar', 'Llevado, pues, José a Egipto, Potifar oficial de Faraón, capitán de la guardia, varón egipcio, lo compró de los ismaelitas que lo habían llevado allá.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 39, 2, NULL, 'Mas Jehová estaba con José, y fue varón próspero; y estaba en la casa de su amo el egipcio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 39, 3, NULL, 'Y vio su amo que Jehová estaba con él, y que todo lo que él hacía, Jehová lo hacía prosperar en su mano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 39, 4, NULL, 'Así halló José gracia en sus ojos, y le servía; y él le hizo mayordomo de su casa y entregó en su poder todo lo que tenía.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 39, 5, NULL, 'Y aconteció que desde cuando le dio el encargo de su casa y de todo lo que tenía, Jehová bendijo la casa del egipcio a causa de José, y la bendición de Jehová estaba sobre todo lo que tenía, así en casa como en el campo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 39, 6, NULL, 'Y dejó todo lo que tenía en mano de José, y con él no se preocupaba de cosa alguna sino del pan que comía. Y era José de hermoso semblante y bella presencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 39, 7, NULL, 'Aconteció después de esto, que la mujer de su amo puso sus ojos en José, y dijo: Duerme conmigo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 39, 8, NULL, 'Y él no quiso, y dijo a la mujer de su amo: He aquí que mi señor no se preocupa conmigo de lo que hay en casa, y ha puesto en mi mano todo lo que tiene.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 39, 9, NULL, 'No hay otro mayor que yo en esta casa, y ninguna cosa me ha reservado sino a ti, por cuanto tú eres su mujer; ¿cómo, pues, haría yo este grande mal, y pecaría contra Dios?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 39, 10, NULL, 'Hablando ella a José cada día, y no escuchándola él para acostarse al lado de ella, para estar con ella,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 39, 11, NULL, 'aconteció que entró él un día en casa para hacer su oficio, y no había nadie de los de casa allí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 39, 12, NULL, 'Y ella lo asió por su ropa, diciendo: Duerme conmigo. Entonces él dejó su ropa en las manos de ella, y huyó y salió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 39, 13, NULL, 'Cuando vio ella que le había dejado su ropa en sus manos, y había huido fuera,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 39, 14, NULL, 'llamó a los de casa, y les habló diciendo: Mirad, nos ha traído un hebreo para que hiciese burla de nosotros. Vino él a mí para dormir conmigo, y yo di grandes voces;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 39, 15, NULL, 'y viendo que yo alzaba la voz y gritaba, dejó junto a mí su ropa, y huyó y salió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 39, 16, NULL, 'Y ella puso junto a sí la ropa de José, hasta que vino su señor a su casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 39, 17, NULL, 'Entonces le habló ella las mismas palabras, diciendo: El siervo hebreo que nos trajiste, vino a mí para deshonrarme.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 39, 18, NULL, 'Y cuando yo alcé mi voz y grité, él dejó su ropa junto a mí y huyó fuera.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 39, 19, NULL, 'Y sucedió que cuando oyó el amo de José las palabras que su mujer le hablaba, diciendo: Así me ha tratado tu siervo, se encendió su furor.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 39, 20, NULL, 'Y tomó su amo a José, y lo puso en la cárcel, donde estaban los presos del rey, y estuvo allí en la cárcel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 39, 21, NULL, 'Pero Jehová estaba con José y le extendió su misericordia, y le dio gracia en los ojos del jefe de la cárcel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 39, 22, NULL, 'Y el jefe de la cárcel entregó en mano de José el cuidado de todos los presos que había en aquella prisión; todo lo que se hacía allí, él lo hacía.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 39, 23, NULL, 'No necesitaba atender el jefe de la cárcel cosa alguna de las que estaban al cuidado de José, porque Jehová estaba con José, y lo que él hacía, Jehová lo prosperaba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 40, 1, 'José interpreta dos sueños', 'Aconteció después de estas cosas, que el copero del rey de Egipto y el panadero delinquieron contra su señor el rey de Egipto.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 40, 2, NULL, 'Y se enojó Faraón contra sus dos oficiales, contra el jefe de los coperos y contra el jefe de los panaderos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 40, 3, NULL, 'y los puso en prisión en la casa del capitán de la guardia, en la cárcel donde José estaba preso.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 40, 4, NULL, 'Y el capitán de la guardia encargó de ellos a José, y él les servía; y estuvieron días en la prisión.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 40, 5, NULL, 'Y ambos, el copero y el panadero del rey de Egipto, que estaban arrestados en la prisión, tuvieron un sueño, cada uno su propio sueño en una misma noche, cada uno con su propio significado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 40, 6, NULL, 'Vino a ellos José por la mañana, y los miró, y he aquí que estaban tristes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 40, 7, NULL, 'Y él preguntó a aquellos oficiales de Faraón, que estaban con él en la prisión de la casa de su señor, diciendo: ¿Por qué parecen hoy mal vuestros semblantes?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 40, 8, NULL, 'Ellos le dijeron: Hemos tenido un sueño, y no hay quien lo interprete. Entonces les dijo José: ¿No son de Dios las interpretaciones? Contádmelo ahora.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 40, 9, NULL, 'Entonces el jefe de los coperos contó su sueño a José, y le dijo: Yo soñaba que veía una vid delante de mí,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 40, 10, NULL, 'y en la vid tres sarmientos; y ella como que brotaba, y arrojaba su flor, viniendo a madurar sus racimos de uvas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 40, 11, NULL, 'Y que la copa de Faraón estaba en mi mano, y tomaba yo las uvas y las exprimía en la copa de Faraón, y daba yo la copa en mano de Faraón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 40, 12, NULL, 'Y le dijo José: Esta es su interpretación: los tres sarmientos son tres días.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 40, 13, NULL, 'Al cabo de tres días levantará Faraón tu cabeza, y te restituirá a tu puesto, y darás la copa a Faraón en su mano, como solías hacerlo cuando eras su copero.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 40, 14, NULL, 'Acuérdate, pues, de mí cuando tengas ese bien, y te ruego que uses conmigo de misericordia, y hagas mención de mí a Faraón, y me saques de esta casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 40, 15, NULL, 'Porque fui hurtado de la tierra de los hebreos; y tampoco he hecho aquí por qué me pusiesen en la cárcel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 40, 16, NULL, 'Viendo el jefe de los panaderos que había interpretado para bien, dijo a José: También yo soñé que veía tres canastillos blancos sobre mi cabeza.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 40, 17, NULL, 'En el canastillo más alto había de toda clase de manjares de pastelería para Faraón; y las aves las comían del canastillo de sobre mi cabeza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 40, 18, NULL, 'Entonces respondió José, y dijo: Esta es su interpretación: Los tres canastillos tres días son.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 40, 19, NULL, 'Al cabo de tres días quitará Faraón tu cabeza de sobre ti, y te hará colgar en la horca, y las aves comerán tu carne de sobre ti.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 40, 20, NULL, 'Al tercer día, que era el día del cumpleaños de Faraón, el rey hizo banquete a todos sus sirvientes; y alzó la cabeza del jefe de los coperos, y la cabeza del jefe de los panaderos, entre sus servidores.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 40, 21, NULL, 'E hizo volver a su oficio al jefe de los coperos, y dio este la copa en mano de Faraón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 40, 22, NULL, 'Mas hizo ahorcar al jefe de los panaderos, como lo había interpretado José.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 40, 23, NULL, 'Y el jefe de los coperos no se acordó de José, sino que le olvidó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 1, 'José interpreta el sueño de Faraón', 'Aconteció que pasados dos años tuvo Faraón un sueño. Le parecía que estaba junto al río;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 2, NULL, 'y que del río subían siete vacas, hermosas a la vista, y muy gordas, y pacían en el prado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 3, NULL, 'Y que tras ellas subían del río otras siete vacas de feo aspecto y enjutas de carne, y se pararon cerca de las vacas hermosas a la orilla del río;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 4, NULL, 'y que las vacas de feo aspecto y enjutas de carne devoraban a las siete vacas hermosas y muy gordas. Y despertó Faraón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 5, NULL, 'Se durmió de nuevo, y soñó la segunda vez: Que siete espigas llenas y hermosas crecían de una sola caña,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 6, NULL, 'y que después de ellas salían otras siete espigas menudas y abatidas del viento solano;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 7, NULL, 'y las siete espigas menudas devoraban a las siete espigas gruesas y llenas. Y despertó Faraón, y he aquí que era sueño.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 8, NULL, 'Sucedió que por la mañana estaba agitado su espíritu, y envió e hizo llamar a todos los magos de Egipto, y a todos sus sabios; y les contó Faraón sus sueños, mas no había quien los pudiese interpretar a Faraón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 9, NULL, 'Entonces el jefe de los coperos habló a Faraón, diciendo: Me acuerdo hoy de mis faltas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 10, NULL, 'Cuando Faraón se enojó contra sus siervos, nos echó a la prisión de la casa del capitán de la guardia a mí y al jefe de los panaderos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 11, NULL, 'Y él y yo tuvimos un sueño en la misma noche, y cada sueño tenía su propio significado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 12, NULL, 'Estaba allí con nosotros un joven hebreo, siervo del capitán de la guardia; y se lo contamos, y él nos interpretó nuestros sueños, y declaró a cada uno conforme a su sueño.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 13, NULL, 'Y aconteció que como él nos los interpretó, así fue: yo fui restablecido en mi puesto, y el otro fue colgado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 14, NULL, 'Entonces Faraón envió y llamó a José. Y lo sacaron apresuradamente de la cárcel, y se afeitó, y mudó sus vestidos, y vino a Faraón.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 15, NULL, 'Y dijo Faraón a José: Yo he tenido un sueño, y no hay quien lo interprete; mas he oído decir de ti, que oyes sueños para interpretarlos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 16, NULL, 'Respondió José a Faraón, diciendo: No está en mí; Dios será el que dé respuesta propicia a Faraón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 17, NULL, 'Entonces Faraón dijo a José: En mi sueño me parecía que estaba a la orilla del río;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 18, NULL, 'y que del río subían siete vacas de gruesas carnes y hermosa apariencia, que pacían en el prado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 19, NULL, 'Y que otras siete vacas subían después de ellas, flacas y de muy feo aspecto; tan extenuadas, que no he visto otras semejantes en fealdad en toda la tierra de Egipto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 20, NULL, 'Y las vacas flacas y feas devoraban a las siete primeras vacas gordas;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 21, NULL, 'y estas entraban en sus entrañas, mas no se conocía que hubiesen entrado, porque la apariencia de las flacas era aún mala, como al principio. Y yo desperté.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 22, NULL, 'Vi también soñando, que siete espigas crecían en una misma caña, llenas y hermosas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 23, NULL, 'Y que otras siete espigas menudas, marchitas, abatidas del viento solano, crecían después de ellas;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 24, NULL, 'y las espigas menudas devoraban a las siete espigas hermosas; y lo he dicho a los magos, mas no hay quien me lo interprete.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 25, NULL, 'Entonces respondió José a Faraón: El sueño de Faraón es uno mismo; Dios ha mostrado a Faraón lo que va a hacer.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 26, NULL, 'Las siete vacas hermosas siete años son; y las espigas hermosas son siete años: el sueño es uno mismo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 27, NULL, 'También las siete vacas flacas y feas que subían tras ellas, son siete años; y las siete espigas menudas y marchitas del viento solano, siete años serán de hambre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 28, NULL, 'Esto es lo que respondo a Faraón. Lo que Dios va a hacer, lo ha mostrado a Faraón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 29, NULL, 'He aquí vienen siete años de gran abundancia en toda la tierra de Egipto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 30, NULL, 'Y tras ellos seguirán siete años de hambre; y toda la abundancia será olvidada en la tierra de Egipto, y el hambre consumirá la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 31, NULL, 'Y aquella abundancia no se echará de ver, a causa del hambre siguiente la cual será gravísima.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 32, NULL, 'Y el suceder el sueño a Faraón dos veces, significa que la cosa es firme de parte de Dios, y que Dios se apresura a hacerla.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 33, NULL, 'Por tanto, provéase ahora Faraón de un varón prudente y sabio, y póngalo sobre la tierra de Egipto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 34, NULL, 'Haga esto Faraón, y ponga gobernadores sobre el país, y quinte la tierra de Egipto en los siete años de la abundancia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 35, NULL, 'Y junten toda la provisión de estos buenos años que vienen, y recojan el trigo bajo la mano de Faraón para mantenimiento de las ciudades; y guárdenlo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 36, NULL, 'Y esté aquella provisión en depósito para el país, para los siete años de hambre que habrá en la tierra de Egipto; y el país no perecerá de hambre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 37, 'José, gobernador de Egipto', 'El asunto pareció bien a Faraón y a sus siervos,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 38, NULL, 'y dijo Faraón a sus siervos: ¿Acaso hallaremos a otro hombre como este, en quien esté el espíritu de Dios?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 39, NULL, 'Y dijo Faraón a José: Pues que Dios te ha hecho saber todo esto, no hay entendido ni sabio como tú.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 40, NULL, 'Tú estarás sobre mi casa, y por tu palabra se gobernará todo mi pueblo; solamente en el trono seré yo mayor que tú.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 41, NULL, 'Dijo además Faraón a José: He aquí yo te he puesto sobre toda la tierra de Egipto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 42, NULL, 'Entonces Faraón quitó su anillo de su mano, y lo puso en la mano de José, y lo hizo vestir de ropas de lino finísimo, y puso un collar de oro en su cuello;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 43, NULL, 'y lo hizo subir en su segundo carro, y pregonaron delante de él: ¡Doblad la rodilla!; y lo puso sobre toda la tierra de Egipto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 44, NULL, 'Y dijo Faraón a José: Yo soy Faraón; y sin ti ninguno alzará su mano ni su pie en toda la tierra de Egipto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 45, NULL, 'Y llamó Faraón el nombre de José, Zafnat-panea; y le dio por mujer a Asenat, hija de Potifera sacerdote de On. Y salió José por toda la tierra de Egipto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 46, NULL, 'Era José de edad de treinta años cuando fue presentado delante de Faraón rey de Egipto; y salió José de delante de Faraón, y recorrió toda la tierra de Egipto.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 47, NULL, 'En aquellos siete años de abundancia la tierra produjo a montones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 48, NULL, 'Y él reunió todo el alimento de los siete años de abundancia que hubo en la tierra de Egipto, y guardó alimento en las ciudades, poniendo en cada ciudad el alimento del campo de sus alrededores.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 49, NULL, 'Recogió José trigo como arena del mar, mucho en extremo, hasta no poderse contar, porque no tenía número.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 50, NULL, 'Y nacieron a José dos hijos antes que viniese el primer año del hambre, los cuales le dio a luz Asenat, hija de Potifera sacerdote de On.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 51, NULL, 'Y llamó José el nombre del primogénito, Manasés; porque dijo: Dios me hizo olvidar todo mi trabajo, y toda la casa de mi padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 52, NULL, 'Y llamó el nombre del segundo, Efraín; porque dijo: Dios me hizo fructificar en la tierra de mi aflicción.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 53, NULL, 'Así se cumplieron los siete años de abundancia que hubo en la tierra de Egipto.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 54, NULL, 'Y comenzaron a venir los siete años del hambre, como José había dicho; y hubo hambre en todos los países, mas en toda la tierra de Egipto había pan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 55, NULL, 'Cuando se sintió el hambre en toda la tierra de Egipto, el pueblo clamó a Faraón por pan. Y dijo Faraón a todos los egipcios: Id a José, y haced lo que él os dijere.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 56, NULL, 'Y el hambre estaba por toda la extensión del país. Entonces abrió José todo granero donde había, y vendía a los egipcios; porque había crecido el hambre en la tierra de Egipto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 41, 57, NULL, 'Y de toda la tierra venían a Egipto para comprar de José, porque por toda la tierra había crecido el hambre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 42, 1, 'Los hermanos de José vienen por alimentos', 'Viendo Jacob que en Egipto había alimentos, dijo a sus hijos: ¿Por qué os estáis mirando?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 42, 2, NULL, 'Y dijo: He aquí, yo he oído que hay víveres en Egipto; descended allá, y comprad de allí para nosotros, para que podamos vivir, y no muramos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 42, 3, NULL, 'Y descendieron los diez hermanos de José a comprar trigo en Egipto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 42, 4, NULL, 'Mas Jacob no envió a Benjamín, hermano de José, con sus hermanos; porque dijo: No sea que le acontezca algún desastre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 42, 5, NULL, 'Vinieron los hijos de Israel a comprar entre los que venían; porque había hambre en la tierra de Canaán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 42, 6, NULL, 'Y José era el señor de la tierra, quien le vendía a todo el pueblo de la tierra; y llegaron los hermanos de José, y se inclinaron a él rostro a tierra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 42, 7, NULL, 'Y José, cuando vio a sus hermanos, los conoció; mas hizo como que no los conocía, y les habló ásperamente, y les dijo: ¿De dónde habéis venido? Ellos respondieron: De la tierra de Canaán, para comprar alimentos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 42, 8, NULL, 'José, pues, conoció a sus hermanos; pero ellos no le conocieron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 42, 9, NULL, 'Entonces se acordó José de los sueños que había tenido acerca de ellos, y les dijo: Espías sois; por ver lo descubierto del país habéis venido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 42, 10, NULL, 'Ellos le respondieron: No, señor nuestro, sino que tus siervos han venido a comprar alimentos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 42, 11, NULL, 'Todos nosotros somos hijos de un varón; somos hombres honrados; tus siervos nunca fueron espías.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 42, 12, NULL, 'Pero José les dijo: No; para ver lo descubierto del país habéis venido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 42, 13, NULL, 'Y ellos respondieron: Tus siervos somos doce hermanos, hijos de un varón en la tierra de Canaán; y he aquí el menor está hoy con nuestro padre, y otro no parece.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 42, 14, NULL, 'Y José les dijo: Eso es lo que os he dicho, afirmando que sois espías.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 42, 15, NULL, 'En esto seréis probados: Vive Faraón, que no saldréis de aquí, sino cuando vuestro hermano menor viniere aquí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 42, 16, NULL, 'Enviad a uno de vosotros y traiga a vuestro hermano, y vosotros quedad presos, y vuestras palabras serán probadas, si hay verdad en vosotros; y si no, vive Faraón, que sois espías.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 42, 17, NULL, 'Entonces los puso juntos en la cárcel por tres días.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 42, 18, NULL, 'Y al tercer día les dijo José: Haced esto, y vivid: Yo temo a Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 42, 19, NULL, 'Si sois hombres honrados, quede preso en la casa de vuestra cárcel uno de vuestros hermanos, y vosotros id y llevad el alimento para el hambre de vuestra casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 42, 20, NULL, 'Pero traeréis a vuestro hermano menor, y serán verificadas vuestras palabras, y no moriréis. Y ellos lo hicieron así.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 42, 21, NULL, 'Y decían el uno al otro: Verdaderamente hemos pecado contra nuestro hermano, pues vimos la angustia de su alma cuando nos rogaba, y no le escuchamos; por eso ha venido sobre nosotros esta angustia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 42, 22, NULL, 'Entonces Rubén les respondió, diciendo: ¿No os hablé yo y dije: No pequéis contra el joven, y no escuchasteis? He aquí también se nos demanda su sangre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 42, 23, NULL, 'Pero ellos no sabían que los entendía José, porque había intérprete entre ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 42, 24, NULL, 'Y se apartó José de ellos, y lloró; después volvió a ellos, y les habló, y tomó de entre ellos a Simeón, y lo aprisionó a vista de ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 42, 25, NULL, 'Después mandó José que llenaran sus sacos de trigo, y devolviesen el dinero de cada uno de ellos, poniéndolo en su saco, y les diesen comida para el camino; y así se hizo con ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 42, 26, NULL, 'Y ellos pusieron su trigo sobre sus asnos, y se fueron de allí.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 42, 27, NULL, 'Pero abriendo uno de ellos su saco para dar de comer a su asno en el mesón, vio su dinero que estaba en la boca de su costal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 42, 28, NULL, 'Y dijo a sus hermanos: Mi dinero se me ha devuelto, y helo aquí en mi saco. Entonces se les sobresaltó el corazón, y espantados dijeron el uno al otro: ¿Qué es esto que nos ha hecho Dios?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 42, 29, NULL, 'Y venidos a Jacob su padre en tierra de Canaán, le contaron todo lo que les había acontecido, diciendo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 42, 30, NULL, 'Aquel varón, el señor de la tierra, nos habló ásperamente, y nos trató como a espías de la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 42, 31, NULL, 'Y nosotros le dijimos: Somos hombres honrados, nunca fuimos espías.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 42, 32, NULL, 'Somos doce hermanos, hijos de nuestro padre; uno no parece, y el menor está hoy con nuestro padre en la tierra de Canaán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 42, 33, NULL, 'Entonces aquel varón, el señor de la tierra, nos dijo: En esto conoceré que sois hombres honrados: dejad conmigo uno de vuestros hermanos, y tomad para el hambre de vuestras casas, y andad,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 42, 34, NULL, 'y traedme a vuestro hermano el menor, para que yo sepa que no sois espías, sino hombres honrados; así os daré a vuestro hermano, y negociaréis en la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 42, 35, NULL, 'Y aconteció que vaciando ellos sus sacos, he aquí que en el saco de cada uno estaba el atado de su dinero; y viendo ellos y su padre los atados de su dinero, tuvieron temor.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 42, 36, NULL, 'Entonces su padre Jacob les dijo: Me habéis privado de mis hijos; José no parece, ni Simeón tampoco, y a Benjamín le llevaréis; contra mí son todas estas cosas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 42, 37, NULL, 'Y Rubén habló a su padre, diciendo: Harás morir a mis dos hijos, si no te lo devuelvo; entrégalo en mi mano, que yo lo devolveré a ti.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 42, 38, NULL, 'Y él dijo: No descenderá mi hijo con vosotros, pues su hermano ha muerto, y él solo ha quedado; y si le aconteciere algún desastre en el camino por donde vais, haréis descender mis canas con dolor al Seol.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 43, 1, 'Los hermanos de José regresan con Benjamín', 'El hambre era grande en la tierra;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 43, 2, NULL, 'y aconteció que cuando acabaron de comer el trigo que trajeron de Egipto, les dijo su padre: Volved, y comprad para nosotros un poco de alimento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 43, 3, NULL, 'Respondió Judá, diciendo: Aquel varón nos protestó con ánimo resuelto, diciendo: No veréis mi rostro si no traéis a vuestro hermano con vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 43, 4, NULL, 'Si enviares a nuestro hermano con nosotros, descenderemos y te compraremos alimento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 43, 5, NULL, 'Pero si no le enviares, no descenderemos; porque aquel varón nos dijo: No veréis mi rostro si no traéis a vuestro hermano con vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 43, 6, NULL, 'Dijo entonces Israel: ¿Por qué me hicisteis tanto mal, declarando al varón que teníais otro hermano?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 43, 7, NULL, 'Y ellos respondieron: Aquel varón nos preguntó expresamente por nosotros, y por nuestra familia, diciendo: ¿Vive aún vuestro padre? ¿Tenéis otro hermano? Y le declaramos conforme a estas palabras. ¿Acaso podíamos saber que él nos diría: Haced venir a vuestro hermano?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 43, 8, NULL, 'Entonces Judá dijo a Israel su padre: Envía al joven conmigo, y nos levantaremos e iremos, a fin de que vivamos y no muramos nosotros, y tú, y nuestros niños.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 43, 9, NULL, 'Yo te respondo por él; a mí me pedirás cuenta. Si yo no te lo vuelvo a traer, y si no lo pongo delante de ti, seré para ti el culpable para siempre;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 43, 10, NULL, 'pues si no nos hubiéramos detenido, ciertamente hubiéramos ya vuelto dos veces.', 0, 'spa', 'RVR1960', NULL);\n"
;

  public static final String SQL_PARTE_6 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Gn', 43, 11, NULL, 'Entonces Israel su padre les respondió: Pues que así es, hacedlo; tomad de lo mejor de la tierra en vuestros sacos, y llevad a aquel varón un presente, un poco de bálsamo, un poco de miel, aromas y mirra, nueces y almendras.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 43, 12, NULL, 'Y tomad en vuestras manos doble cantidad de dinero, y llevad en vuestra mano el dinero vuelto en las bocas de vuestros costales; quizá fue equivocación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 43, 13, NULL, 'Tomad también a vuestro hermano, y levantaos, y volved a aquel varón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 43, 14, NULL, 'Y el Dios Omnipotente os dé misericordia delante de aquel varón, y os suelte al otro vuestro hermano, y a este Benjamín. Y si he de ser privado de mis hijos, séalo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 43, 15, NULL, 'Entonces tomaron aquellos varones el presente, y tomaron en su mano doble cantidad de dinero, y a Benjamín; y se levantaron y descendieron a Egipto, y se presentaron delante de José.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 43, 16, NULL, 'Y vio José a Benjamín con ellos, y dijo al mayordomo de su casa: Lleva a casa a esos hombres, y degüella una res y prepárala, pues estos hombres comerán conmigo al mediodía.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 43, 17, NULL, 'E hizo el hombre como José dijo, y llevó a los hombres a casa de José.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 43, 18, NULL, 'Entonces aquellos hombres tuvieron temor, cuando fueron llevados a casa de José, y decían: Por el dinero que fue devuelto en nuestros costales la primera vez nos han traído aquí, para tendernos lazo, y atacarnos, y tomarnos por siervos a nosotros, y a nuestros asnos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 43, 19, NULL, 'Y se acercaron al mayordomo de la casa de José, y le hablaron a la entrada de la casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 43, 20, NULL, 'Y dijeron: Ay, señor nuestro, nosotros en realidad de verdad descendimos al principio a comprar alimentos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 43, 21, NULL, 'Y aconteció que cuando llegamos al mesón y abrimos nuestros costales, he aquí el dinero de cada uno estaba en la boca de su costal, nuestro dinero en su justo peso; y lo hemos vuelto a traer con nosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 43, 22, NULL, 'Hemos también traído en nuestras manos otro dinero para comprar alimentos; nosotros no sabemos quién haya puesto nuestro dinero en nuestros costales.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 43, 23, NULL, 'Él les respondió: Paz a vosotros, no temáis; vuestro Dios y el Dios de vuestro padre os dio el tesoro en vuestros costales; yo recibí vuestro dinero. Y sacó a Simeón a ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 43, 24, NULL, 'Y llevó aquel varón a los hombres a casa de José; y les dio agua, y lavaron sus pies, y dio de comer a sus asnos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 43, 25, NULL, 'Y ellos prepararon el presente entretanto que venía José a mediodía, porque habían oído que allí habrían de comer pan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 43, 26, NULL, 'Y vino José a casa, y ellos le trajeron el presente que tenían en su mano dentro de la casa, y se inclinaron ante él hasta la tierra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 43, 27, NULL, 'Entonces les preguntó José cómo estaban, y dijo: ¿Vuestro padre, el anciano que dijisteis, lo pasa bien? ¿Vive todavía?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 43, 28, NULL, 'Y ellos respondieron: Bien va a tu siervo nuestro padre; aún vive. Y se inclinaron, e hicieron reverencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 43, 29, NULL, 'Y alzando José sus ojos vio a Benjamín su hermano, hijo de su madre, y dijo: ¿Es este vuestro hermano menor, de quien me hablasteis? Y dijo: Dios tenga misericordia de ti, hijo mío.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 43, 30, NULL, 'Entonces José se apresuró, porque se conmovieron sus entrañas a causa de su hermano, y buscó dónde llorar; y entró en su cámara, y lloró allí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 43, 31, NULL, 'Y lavó su rostro y salió, y se contuvo, y dijo: Poned pan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 43, 32, NULL, 'Y pusieron para él aparte, y separadamente para ellos, y aparte para los egipcios que con él comían; porque los egipcios no pueden comer pan con los hebreos, lo cual es abominación a los egipcios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 43, 33, NULL, 'Y se sentaron delante de él, el mayor conforme a su primogenitura, y el menor conforme a su menor edad; y estaban aquellos hombres atónitos mirándose el uno al otro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 43, 34, NULL, 'Y José tomó viandas de delante de sí para ellos; mas la porción de Benjamín era cinco veces mayor que cualquiera de las de ellos. Y bebieron, y se alegraron con él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 44, 1, 'La copa de José', 'Mandó José al mayordomo de su casa, diciendo: Llena de alimento los costales de estos varones, cuanto puedan llevar, y pon el dinero de cada uno en la boca de su costal.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 44, 2, NULL, 'Y pondrás mi copa, la copa de plata, en la boca del costal del menor, con el dinero de su trigo. Y él hizo como dijo José.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 44, 3, NULL, 'Venida la mañana, los hombres fueron despedidos con sus asnos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 44, 4, NULL, 'Habiendo ellos salido de la ciudad, de la que aún no se habían alejado, dijo José a su mayordomo: Levántate y sigue a esos hombres; y cuando los alcances, diles: ¿Por qué habéis vuelto mal por bien? ¿Por qué habéis robado mi copa de plata?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 44, 5, NULL, '¿No es esta en la que bebe mi señor, y por la que suele adivinar? Habéis hecho mal en lo que hicisteis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 44, 6, NULL, 'Cuando él los alcanzó, les dijo estas palabras.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 44, 7, NULL, 'Y ellos le respondieron: ¿Por qué dice nuestro señor tales cosas? Nunca tal hagan tus siervos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 44, 8, NULL, 'He aquí, el dinero que hallamos en la boca de nuestros costales, te lo volvimos a traer desde la tierra de Canaán; ¿cómo, pues, habíamos de hurtar de casa de tu señor plata ni oro?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 44, 9, NULL, 'Aquel de tus siervos en quien fuere hallada la copa, que muera, y aun nosotros seremos siervos de mi señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 44, 10, NULL, 'Y él dijo: También ahora sea conforme a vuestras palabras; aquel en quien se hallare será mi siervo, y vosotros seréis sin culpa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 44, 11, NULL, 'Ellos entonces se dieron prisa, y derribando cada uno su costal en tierra, abrió cada cual el costal suyo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 44, 12, NULL, 'Y buscó; desde el mayor comenzó, y acabó en el menor; y la copa fue hallada en el costal de Benjamín.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 44, 13, NULL, 'Entonces ellos rasgaron sus vestidos, y cargó cada uno su asno y volvieron a la ciudad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 44, 14, NULL, 'Vino Judá con sus hermanos a casa de José, que aún estaba allí, y se postraron delante de él en tierra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 44, 15, NULL, 'Y les dijo José: ¿Qué acción es esta que habéis hecho? ¿No sabéis que un hombre como yo sabe adivinar?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 44, 16, NULL, 'Entonces dijo Judá: ¿Qué diremos a mi señor? ¿Qué hablaremos, o con qué nos justificaremos? Dios ha hallado la maldad de tus siervos; he aquí, nosotros somos siervos de mi señor, nosotros, y también aquel en cuyo poder fue hallada la copa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 44, 17, NULL, 'José respondió: Nunca yo tal haga. El varón en cuyo poder fue hallada la copa, él será mi siervo; vosotros id en paz a vuestro padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 44, 18, 'Judá intercede por Benjamín', 'Entonces Judá se acercó a él, y dijo: Ay, señor mío, te ruego que permitas que hable tu siervo una palabra en oídos de mi señor, y no se encienda tu enojo contra tu siervo, pues tú eres como Faraón.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 44, 19, NULL, 'Mi señor preguntó a sus siervos, diciendo: ¿Tenéis padre o hermano?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 44, 20, NULL, 'Y nosotros respondimos a mi señor: Tenemos un padre anciano, y un hermano joven, pequeño aún, que le nació en su vejez; y un hermano suyo murió, y él solo quedó de los hijos de su madre; y su padre lo ama.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 44, 21, NULL, 'Y tú dijiste a tus siervos: Traédmelo, y pondré mis ojos sobre él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 44, 22, NULL, 'Y nosotros dijimos a mi señor: El joven no puede dejar a su padre, porque si lo dejare, su padre morirá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 44, 23, NULL, 'Y dijiste a tus siervos: Si vuestro hermano menor no desciende con vosotros, no veréis más mi rostro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 44, 24, NULL, 'Aconteció, pues, que cuando llegamos a mi padre tu siervo, le contamos las palabras de mi señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 44, 25, NULL, 'Y dijo nuestro padre: Volved a comprarnos un poco de alimento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 44, 26, NULL, 'Y nosotros respondimos: No podemos ir; si nuestro hermano va con nosotros, iremos; porque no podremos ver el rostro del varón, si no está con nosotros nuestro hermano el menor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 44, 27, NULL, 'Entonces tu siervo mi padre nos dijo: Vosotros sabéis que dos hijos me dio a luz mi mujer;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 44, 28, NULL, 'y el uno salió de mi presencia, y pienso de cierto que fue despedazado, y hasta ahora no lo he visto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 44, 29, NULL, 'Y si tomáis también a este de delante de mí, y le acontece algún desastre, haréis descender mis canas con dolor al Seol.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 44, 30, NULL, 'Ahora, pues, cuando vuelva yo a tu siervo mi padre, si el joven no va conmigo, como su vida está ligada a la vida de él,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 44, 31, NULL, 'sucederá que cuando no vea al joven, morirá; y tus siervos harán descender las canas de tu siervo nuestro padre con dolor al Seol.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 44, 32, NULL, 'Como tu siervo salió por fiador del joven con mi padre, diciendo: Si no te lo vuelvo a traer, entonces yo seré culpable ante mi padre para siempre;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 44, 33, NULL, 'te ruego, por tanto, que quede ahora tu siervo en lugar del joven por siervo de mi señor, y que el joven vaya con sus hermanos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 44, 34, NULL, 'Porque ¿cómo volveré yo a mi padre sin el joven? No podré, por no ver el mal que sobrevendrá a mi padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 45, 1, 'José se da a conocer a sus hermanos', 'No podía ya José contenerse delante de todos los que estaban al lado suyo, y clamó: Haced salir de mi presencia a todos. Y no quedó nadie con él, al darse a conocer José a sus hermanos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 45, 2, NULL, 'Entonces se dio a llorar a gritos; y oyeron los egipcios, y oyó también la casa de Faraón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 45, 3, NULL, 'Y dijo José a sus hermanos: Yo soy José; ¿vive aún mi padre? Y sus hermanos no pudieron responderle, porque estaban turbados delante de él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 45, 4, NULL, 'Entonces dijo José a sus hermanos: Acercaos ahora a mí. Y ellos se acercaron. Y él dijo: Yo soy José vuestro hermano, el que vendisteis para Egipto.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 45, 5, NULL, 'Ahora, pues, no os entristezcáis, ni os pese de haberme vendido acá; porque para preservación de vida me envió Dios delante de vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 45, 6, NULL, 'Pues ya ha habido dos años de hambre en medio de la tierra, y aún quedan cinco años en los cuales ni habrá arada ni siega.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 45, 7, NULL, 'Y Dios me envió delante de vosotros, para preservaros posteridad sobre la tierra, y para daros vida por medio de gran liberación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 45, 8, NULL, 'Así, pues, no me enviasteis acá vosotros, sino Dios, que me ha puesto por padre de Faraón y por señor de toda su casa, y por gobernador en toda la tierra de Egipto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 45, 9, NULL, 'Daos prisa, id a mi padre y decidle: Así dice tu hijo José: Dios me ha puesto por señor de todo Egipto; ven a mí, no te detengas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 45, 10, NULL, 'Habitarás en la tierra de Gosén, y estarás cerca de mí, tú y tus hijos, y los hijos de tus hijos, tus ganados y tus vacas, y todo lo que tienes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 45, 11, NULL, 'Y allí te alimentaré, pues aún quedan cinco años de hambre, para que no perezcas de pobreza tú y tu casa, y todo lo que tienes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 45, 12, NULL, 'He aquí, vuestros ojos ven, y los ojos de mi hermano Benjamín, que mi boca os habla.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 45, 13, NULL, 'Haréis, pues, saber a mi padre toda mi gloria en Egipto, y todo lo que habéis visto; y daos prisa, y traed a mi padre acá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 45, 14, NULL, 'Y se echó sobre el cuello de Benjamín su hermano, y lloró; y también Benjamín lloró sobre su cuello.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 45, 15, NULL, 'Y besó a todos sus hermanos, y lloró sobre ellos; y después sus hermanos hablaron con él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 45, 16, NULL, 'Y se oyó la noticia en la casa de Faraón, diciendo: Los hermanos de José han venido. Y esto agradó en los ojos de Faraón y de sus siervos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 45, 17, NULL, 'Y dijo Faraón a José: Di a tus hermanos: Haced esto: cargad vuestras bestias, e id, volved a la tierra de Canaán;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 45, 18, NULL, 'y tomad a vuestro padre y a vuestras familias y venid a mí, porque yo os daré lo bueno de la tierra de Egipto, y comeréis de la abundancia de la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 45, 19, NULL, 'Y tú manda: Haced esto: tomaos de la tierra de Egipto carros para vuestros niños y vuestras mujeres, y traed a vuestro padre, y venid.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 45, 20, NULL, 'Y no os preocupéis por vuestros enseres, porque la riqueza de la tierra de Egipto será vuestra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 45, 21, NULL, 'Y lo hicieron así los hijos de Israel; y les dio José carros conforme a la orden de Faraón, y les suministró víveres para el camino.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 45, 22, NULL, 'A cada uno de todos ellos dio mudas de vestidos, y a Benjamín dio trescientas piezas de plata, y cinco mudas de vestidos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 45, 23, NULL, 'Y a su padre envió esto: diez asnos cargados de lo mejor de Egipto, y diez asnas cargadas de trigo, y pan y comida, para su padre en el camino.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 45, 24, NULL, 'Y despidió a sus hermanos, y ellos se fueron. Y él les dijo: No riñáis por el camino.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 45, 25, NULL, 'Y subieron de Egipto, y llegaron a la tierra de Canaán a Jacob su padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 45, 26, NULL, 'Y le dieron las nuevas, diciendo: José vive aún; y él es señor en toda la tierra de Egipto. Y el corazón de Jacob se afligió, porque no los creía.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 45, 27, NULL, 'Y ellos le contaron todas las palabras de José, que él les había hablado; y viendo Jacob los carros que José enviaba para llevarlo, su espíritu revivió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 45, 28, NULL, 'Entonces dijo Israel: Basta; José mi hijo vive todavía; iré, y le veré antes que yo muera.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 46, 1, 'Jacob y su familia en Egipto', 'Salió Israel con todo lo que tenía, y vino a Beerseba, y ofreció sacrificios al Dios de su padre Isaac.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 46, 2, NULL, 'Y habló Dios a Israel en visiones de noche, y dijo: Jacob, Jacob. Y él respondió: Heme aquí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 46, 3, NULL, 'Y dijo: Yo soy Dios, el Dios de tu padre; no temas de descender a Egipto, porque allí yo haré de ti una gran nación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 46, 4, NULL, 'Yo descenderé contigo a Egipto, y yo también te haré volver; y la mano de José cerrará tus ojos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 46, 5, NULL, 'Y se levantó Jacob de Beerseba; y tomaron los hijos de Israel a su padre Jacob, y a sus niños, y a sus mujeres, en los carros que Faraón había enviado para llevarlo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 46, 6, NULL, 'Y tomaron sus ganados, y sus bienes que habían adquirido en la tierra de Canaán, y vinieron a Egipto, Jacob y toda su descendencia consigo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 46, 7, NULL, 'sus hijos, y los hijos de sus hijos consigo; sus hijas, y las hijas de sus hijos, y a toda su descendencia trajo consigo a Egipto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 46, 8, NULL, 'Y estos son los nombres de los hijos de Israel, que entraron en Egipto, Jacob y sus hijos: Rubén, el primogénito de Jacob.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 46, 9, NULL, 'Y los hijos de Rubén: Hanoc, Falú, Hezrón y Carmi.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 46, 10, NULL, 'Los hijos de Simeón: Jemuel, Jamín, Ohad, Jaquín, Zohar, y Saúl hijo de la cananea.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 46, 11, NULL, 'Los hijos de Leví: Gersón, Coat y Merari.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 46, 12, NULL, 'Los hijos de Judá: Er, Onán, Sela, Fares y Zara; mas Er y Onán murieron en la tierra de Canaán. Y los hijos de Fares fueron Hezrón y Hamul.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 46, 13, NULL, 'Los hijos de Isacar: Tola, Fúa, Job y Simrón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 46, 14, NULL, 'Los hijos de Zabulón: Sered, Elón y Jahleel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 46, 15, NULL, 'Estos fueron los hijos de Lea, los que dio a luz a Jacob en Padan-aram, y además su hija Dina; treinta y tres las personas todas de sus hijos e hijas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 46, 16, NULL, 'Los hijos de Gad: Zifión, Hagui, Ezbón, Suni, Eri, Arodi y Areli.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 46, 17, NULL, 'Y los hijos de Aser: Imna, Isúa, Isúi, Bería, y Sera hermana de ellos. Los hijos de Bería: Heber y Malquiel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 46, 18, NULL, 'Estos fueron los hijos de Zilpa, la que Labán dio a su hija Lea, y dio a luz estos a Jacob; por todas dieciséis personas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 46, 19, NULL, 'Los hijos de Raquel, mujer de Jacob: José y Benjamín.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 46, 20, NULL, 'Y nacieron a José en la tierra de Egipto Manasés y Efraín, los que le dio a luz Asenat, hija de Potifera sacerdote de On.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 46, 21, NULL, 'Los hijos de Benjamín fueron Bela, Bequer, Asbel, Gera, Naamán, Ehi, Ros, Mupim, Hupim y Ard.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 46, 22, NULL, 'Estos fueron los hijos de Raquel, que nacieron a Jacob; por todas catorce personas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 46, 23, NULL, 'Los hijos de Dan: Husim.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 46, 24, NULL, 'Los hijos de Neftalí: Jahzeel, Guni, Jezer y Silem.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 46, 25, NULL, 'Estos fueron los hijos de Bilha, la que dio Labán a Raquel su hija, y dio a luz estos a Jacob; por todas siete personas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 46, 26, NULL, 'Todas las personas que vinieron con Jacob a Egipto, procedentes de sus lomos, sin las mujeres de los hijos de Jacob, todas las personas fueron sesenta y seis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 46, 27, NULL, 'Y los hijos de José, que le nacieron en Egipto, dos personas. Todas las personas de la casa de Jacob, que entraron en Egipto, fueron setenta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 46, 28, NULL, 'Y envió Jacob a Judá delante de sí a José, para que le viniese a ver en Gosén; y llegaron a la tierra de Gosén.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 46, 29, NULL, 'Y José unció su carro y vino a recibir a Israel su padre en Gosén; y se manifestó a él, y se echó sobre su cuello, y lloró sobre su cuello largamente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 46, 30, NULL, 'Entonces Israel dijo a José: Muera yo ahora, ya que he visto tu rostro, y sé que aún vives.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 46, 31, NULL, 'Y José dijo a sus hermanos, y a la casa de su padre: Subiré y lo haré saber a Faraón, y le diré: Mis hermanos y la casa de mi padre, que estaban en la tierra de Canaán, han venido a mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 46, 32, NULL, 'Y los hombres son pastores de ovejas, porque son hombres ganaderos; y han traído sus ovejas y sus vacas, y todo lo que tenían.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 46, 33, NULL, 'Y cuando Faraón os llamare y dijere: ¿Cuál es vuestro oficio?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 46, 34, NULL, 'entonces diréis: Hombres de ganadería han sido tus siervos desde nuestra juventud hasta ahora, nosotros y nuestros padres; a fin de que moréis en la tierra de Gosén, porque para los egipcios es abominación todo pastor de ovejas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 47, 1, NULL, 'Vino José y lo hizo saber a Faraón, y dijo: Mi padre y mis hermanos, y sus ovejas y sus vacas, con todo lo que tienen, han venido de la tierra de Canaán, y he aquí están en la tierra de Gosén.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 47, 2, NULL, 'Y de los postreros de sus hermanos tomó cinco varones, y los presentó delante de Faraón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 47, 3, NULL, 'Y Faraón dijo a sus hermanos: ¿Cuál es vuestro oficio? Y ellos respondieron a Faraón: Pastores de ovejas son tus siervos, así nosotros como nuestros padres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 47, 4, NULL, 'Dijeron además a Faraón: Para morar en esta tierra hemos venido; porque no hay pasto para las ovejas de tus siervos, pues el hambre es grave en la tierra de Canaán; por tanto, te rogamos ahora que permitas que habiten tus siervos en la tierra de Gosén.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 47, 5, NULL, 'Entonces Faraón habló a José, diciendo: Tu padre y tus hermanos han venido a ti.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 47, 6, NULL, 'La tierra de Egipto delante de ti está; en lo mejor de la tierra haz habitar a tu padre y a tus hermanos; habiten en la tierra de Gosén; y si entiendes que hay entre ellos hombres capaces, ponlos por mayorales del ganado mío.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 47, 7, NULL, 'También José introdujo a Jacob su padre, y lo presentó delante de Faraón; y Jacob bendijo a Faraón.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 47, 8, NULL, 'Y dijo Faraón a Jacob: ¿Cuántos son los días de los años de tu vida?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 47, 9, NULL, 'Y Jacob respondió a Faraón: Los días de los años de mi peregrinación son ciento treinta años; pocos y malos han sido los días de los años de mi vida, y no han llegado a los días de los años de la vida de mis padres en los días de su peregrinación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 47, 10, NULL, 'Y Jacob bendijo a Faraón, y salió de la presencia de Faraón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 47, 11, NULL, 'Así José hizo habitar a su padre y a sus hermanos, y les dio posesión en la tierra de Egipto, en lo mejor de la tierra, en la tierra de Ramesés, como mandó Faraón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 47, 12, NULL, 'Y alimentaba José a su padre y a sus hermanos, y a toda la casa de su padre, con pan, según el número de los hijos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 47, 13, NULL, 'No había pan en toda la tierra, y el hambre era muy grave, por lo que desfalleció de hambre la tierra de Egipto y la tierra de Canaán.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 47, 14, NULL, 'Y recogió José todo el dinero que había en la tierra de Egipto y en la tierra de Canaán, por los alimentos que de él compraban; y metió José el dinero en casa de Faraón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 47, 15, NULL, 'Acabado el dinero de la tierra de Egipto y de la tierra de Canaán, vino todo Egipto a José, diciendo: Danos pan; ¿por qué moriremos delante de ti, por haberse acabado el dinero?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 47, 16, NULL, 'Y José dijo: Dad vuestros ganados y yo os daré por vuestros ganados, si se ha acabado el dinero.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 47, 17, NULL, 'Y ellos trajeron sus ganados a José, y José les dio alimentos por caballos, y por el ganado de las ovejas, y por el ganado de las vacas, y por asnos; y les sustentó de pan por todos sus ganados aquel año.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 47, 18, NULL, 'Acabado aquel año, vinieron a él el segundo año, y le dijeron: No encubrimos a nuestro señor que el dinero ciertamente se ha acabado; también el ganado es ya de nuestro señor; nada ha quedado delante de nuestro señor sino nuestros cuerpos y nuestra tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 47, 19, NULL, '¿Por qué moriremos delante de tus ojos, así nosotros como nuestra tierra? Cómpranos a nosotros y a nuestra tierra por pan, y seremos nosotros y nuestra tierra siervos de Faraón; y danos semilla para que vivamos y no muramos, y no sea asolada la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 47, 20, NULL, 'Entonces compró José toda la tierra de Egipto para Faraón; pues los egipcios vendieron cada uno sus tierras, porque se agravó el hambre sobre ellos; y la tierra vino a ser de Faraón.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 47, 21, NULL, 'Y al pueblo lo hizo pasar a las ciudades, desde un extremo al otro del territorio de Egipto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 47, 22, NULL, 'Solamente la tierra de los sacerdotes no compró, por cuanto los sacerdotes tenían ración de Faraón, y ellos comían la ración que Faraón les daba; por eso no vendieron su tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 47, 23, NULL, 'Y José dijo al pueblo: He aquí os he comprado hoy, a vosotros y a vuestra tierra, para Faraón; ved aquí semilla, y sembraréis la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 47, 24, NULL, 'De los frutos daréis el quinto a Faraón, y las cuatro partes serán vuestras para sembrar las tierras, y para vuestro mantenimiento, y de los que están en vuestras casas, y para que coman vuestros niños.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 47, 25, NULL, 'Y ellos respondieron: La vida nos has dado; hallemos gracia en ojos de nuestro señor, y seamos siervos de Faraón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 47, 26, NULL, 'Entonces José lo puso por ley hasta hoy sobre la tierra de Egipto, señalando para Faraón el quinto, excepto solo la tierra de los sacerdotes, que no fue de Faraón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 47, 27, NULL, 'Así habitó Israel en la tierra de Egipto, en la tierra de Gosén; y tomaron posesión de ella, y se aumentaron, y se multiplicaron en gran manera.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 47, 28, NULL, 'Y vivió Jacob en la tierra de Egipto diecisiete años; y fueron los días de Jacob, los años de su vida, ciento cuarenta y siete años.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 47, 29, NULL, 'Y llegaron los días de Israel para morir, y llamó a José su hijo, y le dijo: Si he hallado ahora gracia en tus ojos, te ruego que pongas tu mano debajo de mi muslo, y harás conmigo misericordia y verdad. Te ruego que no me entierres en Egipto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 47, 30, NULL, 'Mas cuando duerma con mis padres, me llevarás de Egipto y me sepultarás en el sepulcro de ellos. Y José respondió: Haré como tú dices.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 47, 31, NULL, 'E Israel dijo: Júramelo. Y José le juró. Entonces Israel se inclinó sobre la cabecera de la cama.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 48, 1, 'Jacob bendice a Efraín y a Manasés', 'Sucedió después de estas cosas que dijeron a José: He aquí tu padre está enfermo. Y él tomó consigo a sus dos hijos, Manasés y Efraín.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 48, 2, NULL, 'Y se le hizo saber a Jacob, diciendo: He aquí tu hijo José viene a ti. Entonces se esforzó Israel, y se sentó sobre la cama,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 48, 3, NULL, 'y dijo a José: El Dios Omnipotente me apareció en Luz en la tierra de Canaán, y me bendijo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 48, 4, NULL, 'y me dijo: He aquí yo te haré crecer, y te multiplicaré, y te pondré por estirpe de naciones; y daré esta tierra a tu descendencia después de ti por heredad perpetua.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 48, 5, NULL, 'Y ahora tus dos hijos Efraín y Manasés, que te nacieron en la tierra de Egipto, antes que viniese a ti a la tierra de Egipto, míos son; como Rubén y Simeón, serán míos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 48, 6, NULL, 'Y los que después de ellos has engendrado, serán tuyos; por el nombre de sus hermanos serán llamados en sus heredades.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 48, 7, NULL, 'Porque cuando yo venía de Padan-aram, se me murió Raquel en la tierra de Canaán, en el camino, como media legua de tierra viniendo a Efrata; y la sepulté allí en el camino de Efrata, que es Belén.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 48, 8, NULL, 'Y vio Israel los hijos de José, y dijo: ¿Quiénes son estos?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 48, 9, NULL, 'Y respondió José a su padre: Son mis hijos, que Dios me ha dado aquí. Y él dijo: Acércalos ahora a mí, y los bendeciré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 48, 10, NULL, 'Y los ojos de Israel estaban tan agravados por la vejez, que no podía ver. Les hizo, pues, acercarse a él, y él les besó y les abrazó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 48, 11, NULL, 'Y dijo Israel a José: No pensaba yo ver tu rostro, y he aquí Dios me ha hecho ver también a tu descendencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 48, 12, NULL, 'Entonces José los sacó de entre sus rodillas, y se inclinó a tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 48, 13, NULL, 'Y los tomó José a ambos, Efraín a su derecha, a la izquierda de Israel, y Manasés a su izquierda, a la derecha de Israel; y los acercó a él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 48, 14, NULL, 'Entonces Israel extendió su mano derecha, y la puso sobre la cabeza de Efraín, que era el menor, y su mano izquierda sobre la cabeza de Manasés, colocando así sus manos adrede, aunque Manasés era el primogénito.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 48, 15, NULL, 'Y bendijo a José, diciendo: El Dios en cuya presencia anduvieron mis padres Abraham e Isaac, el Dios que me mantiene desde que yo soy hasta este día,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 48, 16, NULL, 'el Ángel que me liberta de todo mal, bendiga a estos jóvenes; y sea perpetuado en ellos mi nombre, y el nombre de mis padres Abraham e Isaac, y multiplíquense en gran manera en medio de la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 48, 17, NULL, 'Pero viendo José que su padre ponía la mano derecha sobre la cabeza de Efraín, le causó esto disgusto; y asió la mano de su padre, para cambiarla de la cabeza de Efraín a la cabeza de Manasés.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 48, 18, NULL, 'Y dijo José a su padre: No así, padre mío, porque este es el primogénito; pon tu mano derecha sobre su cabeza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 48, 19, NULL, 'Mas su padre no quiso, y dijo: Lo sé, hijo mío, lo sé; también él vendrá a ser un pueblo, y será también engrandecido; pero su hermano menor será más grande que él, y su descendencia formará multitud de naciones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 48, 20, NULL, 'Y los bendijo aquel día, diciendo: En ti bendecirá Israel, diciendo: Hágate Dios como a Efraín y como a Manasés. Y puso a Efraín antes de Manasés.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 48, 21, NULL, 'Y dijo Israel a José: He aquí yo muero; pero Dios estará con vosotros, y os hará volver a la tierra de vuestros padres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 48, 22, NULL, 'Y yo te he dado a ti una parte más que a tus hermanos, la cual tomé yo de mano del amorreo con mi espada y con mi arco.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 49, 1, 'Profecía de Jacob acerca de sus hijos', 'Y llamó Jacob a sus hijos, y dijo: Juntaos, y os declararé lo que os ha de acontecer en los días venideros.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 49, 2, NULL, 'Juntaos y oíd, hijos de Jacob, Y escuchad a vuestro padre Israel.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 49, 3, NULL, 'Rubén, tú eres mi primogénito, mi fortaleza, y el principio de mi vigor; Principal en dignidad, principal en poder.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 49, 4, NULL, 'Impetuoso como las aguas, no serás el principal, Por cuanto subiste al lecho de tu padre; Entonces te envileciste, subiendo a mi estrado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 49, 5, NULL, 'Simeón y Leví son hermanos; Armas de iniquidad sus armas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 49, 6, NULL, 'En su consejo no entre mi alma, Ni mi espíritu se junte en su compañía. Porque en su furor mataron hombres, Y en su temeridad desjarretaron toros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 49, 7, NULL, 'Maldito su furor, que fue fiero; Y su ira, que fue dura. Yo los apartaré en Jacob, Y los esparciré en Israel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 49, 8, NULL, 'Judá, te alabarán tus hermanos; Tu mano en la cerviz de tus enemigos; Los hijos de tu padre se inclinarán a ti.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 49, 9, NULL, 'Cachorro de león, Judá; De la presa subiste, hijo mío. Se encorvó, se echó como león, Así como león viejo: ¿quién lo despertará?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 49, 10, NULL, 'No será quitado el cetro de Judá, Ni el legislador de entre sus pies, Hasta que venga Siloh; Y a él se congregarán los pueblos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 49, 11, NULL, 'Atando a la vid su pollino, Y a la cepa el hijo de su asna, Lavó en el vino su vestido, Y en la sangre de uvas su manto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 49, 12, NULL, 'Sus ojos, rojos del vino, Y sus dientes blancos de la leche.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 49, 13, NULL, 'Zabulón en puertos de mar habitará; Será para puerto de naves, Y su límite hasta Sidón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 49, 14, NULL, 'Isacar, asno fuerte Que se recuesta entre los apriscos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 49, 15, NULL, 'Y vio que el descanso era bueno, y que la tierra era deleitosa; Y bajó su hombro para llevar, Y sirvió en tributo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 49, 16, NULL, 'Dan juzgará a su pueblo, Como una de las tribus de Israel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 49, 17, NULL, 'Será Dan serpiente junto al camino, Víbora junto a la senda, Que muerde los talones del caballo, Y hace caer hacia atrás al jinete.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 49, 18, NULL, 'Tu salvación esperé, oh Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 49, 19, NULL, 'Gad, ejército lo acometerá; Mas él acometerá al fin.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 49, 20, NULL, 'El pan de Aser será substancioso, Y él dará deleites al rey.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 49, 21, NULL, 'Neftalí, cierva suelta, Que pronunciará dichos hermosos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 49, 22, NULL, 'Rama fructífera es José, Rama fructífera junto a una fuente, Cuyos vástagos se extienden sobre el muro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 49, 23, NULL, 'Le causaron amargura, Le asaetearon, Y le aborrecieron los arqueros;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 49, 24, NULL, 'Mas su arco se mantuvo poderoso, Y los brazos de sus manos se fortalecieron Por las manos del Fuerte de Jacob (Por el nombre del Pastor, la Roca de Israel),', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 49, 25, NULL, 'Por el Dios de tu padre, el cual te ayudará, Por el Dios Omnipotente, el cual te bendecirá Con bendiciones de los cielos de arriba, Con bendiciones del abismo que está abajo, Con bendiciones de los pechos y del vientre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 49, 26, NULL, 'Las bendiciones de tu padre Fueron mayores que las bendiciones de mis progenitores; Hasta el término de los collados eternos Serán sobre la cabeza de José, Y sobre la frente del que fue apartado de entre sus hermanos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 49, 27, NULL, 'Benjamín es lobo arrebatador; A la mañana comerá la presa, Y a la tarde repartirá los despojos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 49, 28, 'Muerte y sepelio de Jacob', 'Todos estos fueron las doce tribus de Israel, y esto fue lo que su padre les dijo, al bendecirlos; a cada uno por su bendición los bendijo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 49, 29, NULL, 'Les mandó luego, y les dijo: Yo voy a ser reunido con mi pueblo. Sepultadme con mis padres en la cueva que está en el campo de Efrón el heteo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 49, 30, NULL, 'en la cueva que está en el campo de Macpela, al oriente de Mamre en la tierra de Canaán, la cual compró Abraham con el mismo campo de Efrón el heteo, para heredad de sepultura.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 49, 31, NULL, 'Allí sepultaron a Abraham y a Sara su mujer; allí sepultaron a Isaac y a Rebeca su mujer; allí también sepulté yo a Lea.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 49, 32, NULL, 'La compra del campo y de la cueva que está en él, fue de los hijos de Het.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 49, 33, NULL, 'Y cuando acabó Jacob de dar mandamientos a sus hijos, encogió sus pies en la cama, y expiró, y fue reunido con sus padres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 50, 1, NULL, 'Entonces se echó José sobre el rostro de su padre, y lloró sobre él, y lo besó.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 50, 2, NULL, 'Y mandó José a sus siervos los médicos que embalsamasen a su padre; y los médicos embalsamaron a Israel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 50, 3, NULL, 'Y le cumplieron cuarenta días, porque así cumplían los días de los embalsamados, y lo lloraron los egipcios setenta días.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 50, 4, NULL, 'Y pasados los días de su luto, habló José a los de la casa de Faraón, diciendo: Si he hallado ahora gracia en vuestros ojos, os ruego que habléis en oídos de Faraón, diciendo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 50, 5, NULL, 'Mi padre me hizo jurar, diciendo: He aquí que voy a morir; en el sepulcro que cavé para mí en la tierra de Canaán, allí me sepultarás; ruego, pues, que vaya yo ahora y sepulte a mi padre, y volveré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 50, 6, NULL, 'Y Faraón dijo: Ve, y sepulta a tu padre, como él te hizo jurar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 50, 7, NULL, 'Entonces José subió para sepultar a su padre; y subieron con él todos los siervos de Faraón, los ancianos de su casa, y todos los ancianos de la tierra de Egipto,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 50, 8, NULL, 'y toda la casa de José, y sus hermanos, y la casa de su padre; solamente dejaron en la tierra de Gosén sus niños, y sus ovejas y sus vacas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 50, 9, NULL, 'Subieron también con él carros y gente de a caballo, y se hizo un escuadrón muy grande.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 50, 10, NULL, 'Y llegaron hasta la era de Atad, que está al otro lado del Jordán, y endecharon allí con grande y muy triste lamentación; y José hizo a su padre duelo por siete días.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 50, 11, NULL, 'Y viendo los moradores de la tierra, los cananeos, el llanto en la era de Atad, dijeron: Llanto grande es este de los egipcios; por eso fue llamado su nombre Abel-mizraim, que está al otro lado del Jordán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 50, 12, NULL, 'Hicieron, pues, sus hijos con él según les había mandado;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 50, 13, NULL, 'pues lo llevaron sus hijos a la tierra de Canaán, y lo sepultaron en la cueva del campo de Macpela, la que había comprado Abraham con el mismo campo, para heredad de sepultura, de Efrón el heteo, al oriente de Mamre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 50, 14, NULL, 'Y volvió José a Egipto, él y sus hermanos, y todos los que subieron con él a sepultar a su padre, después que lo hubo sepultado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 50, 15, 'Muerte de José', 'Viendo los hermanos de José que su padre era muerto, dijeron: Quizá nos aborrecerá José, y nos dará el pago de todo el mal que le hicimos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 50, 16, NULL, 'Y enviaron a decir a José: Tu padre mandó antes de su muerte, diciendo:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 50, 17, NULL, 'Así diréis a José: Te ruego que perdones ahora la maldad de tus hermanos y su pecado, porque mal te trataron; por tanto, ahora te rogamos que perdones la maldad de los siervos del Dios de tu padre. Y José lloró mientras hablaban.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 50, 18, NULL, 'Vinieron también sus hermanos y se postraron delante de él, y dijeron: Henos aquí por siervos tuyos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 50, 19, NULL, 'Y les respondió José: No temáis; ¿acaso estoy yo en lugar de Dios?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 50, 20, NULL, 'Vosotros pensasteis mal contra mí, mas Dios lo encaminó a bien, para hacer lo que vemos hoy, para mantener en vida a mucho pueblo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 50, 21, NULL, 'Ahora, pues, no tengáis miedo; yo os sustentaré a vosotros y a vuestros hijos. Así los consoló, y les habló al corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 50, 22, NULL, 'Y habitó José en Egipto, él y la casa de su padre; y vivió José ciento diez años.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 50, 23, NULL, 'Y vio José los hijos de Efraín hasta la tercera generación; también los hijos de Maquir hijo de Manasés fueron criados sobre las rodillas de José.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 50, 24, NULL, 'Y José dijo a sus hermanos: Yo voy a morir; mas Dios ciertamente os visitará, y os hará subir de esta tierra a la tierra que juró a Abraham, a Isaac y a Jacob.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 50, 25, NULL, 'E hizo jurar José a los hijos de Israel, diciendo: Dios ciertamente os visitará, y haréis llevar de aquí mis huesos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Gn', 50, 26, NULL, 'Y murió José a la edad de ciento diez años; y lo embalsamaron, y fue puesto en un ataúd en Egipto.', 0, 'spa', 'RVR1960', NULL);\n"
;

}