package com.orellano.biblia360.daoSQLite.sql.spa;

public final class LoadJuan {
  public LoadJuan() {}
  public static final String SQL_PARTE_1 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Jn', 1, 1, 'El Verbo hecho carne', 'En el principio era el Verbo, y el Verbo era con Dios, y el Verbo era Dios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 2, NULL, 'Este era en el principio con Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 3, NULL, 'Todas las cosas por él fueron hechas, y sin él nada de lo que ha sido hecho, fue hecho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 4, NULL, 'En él estaba la vida, y la vida era la luz de los hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 5, NULL, 'La luz en las tinieblas resplandece, y las tinieblas no prevalecieron contra ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 6, NULL, 'Hubo un hombre enviado de Dios, el cual se llamaba Juan.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 7, NULL, 'Este vino por testimonio, para que diese testimonio de la luz, a fin de que todos creyesen por él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 8, NULL, 'No era él la luz, sino para que diese testimonio de la luz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 9, NULL, 'Aquella luz verdadera, que alumbra a todo hombre, venía a este mundo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 10, NULL, 'En el mundo estaba, y el mundo por él fue hecho; pero el mundo no le conoció.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 11, NULL, 'A lo suyo vino, y los suyos no le recibieron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 12, NULL, 'Mas a todos los que le recibieron, a los que creen en su nombre, les dio potestad de ser hechos hijos de Dios;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 13, NULL, 'los cuales no son engendrados de sangre, ni de voluntad de carne, ni de voluntad de varón, sino de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 14, NULL, 'Y aquel Verbo fue hecho carne, y habitó entre nosotros (y vimos su gloria, gloria como del unigénito del Padre), lleno de gracia y de verdad.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 15, NULL, 'Juan dio testimonio de él, y clamó diciendo: Este es de quien yo decía: El que viene después de mí, es antes de mí; porque era primero que yo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 16, NULL, 'Porque de su plenitud tomamos todos, y gracia sobre gracia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 17, NULL, 'Pues la ley por medio de Moisés fue dada, pero la gracia y la verdad vinieron por medio de Jesucristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 18, NULL, 'A Dios nadie le vio jamás; el unigénito Hijo, que está en el seno del Padre, él le ha dado a conocer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 19, 'Testimonio de Juan el Bautista', 'Este es el testimonio de Juan, cuando los judíos enviaron de Jerusalén sacerdotes y levitas para que le preguntasen: ¿Tú, quién eres?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 20, NULL, 'Confesó, y no negó, sino confesó: Yo no soy el Cristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 21, NULL, 'Y le preguntaron: ¿Qué pues? ¿Eres tú Elías? Dijo: No soy. ¿Eres tú el profeta? Y respondió: No.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 22, NULL, 'Le dijeron: ¿Pues quién eres? para que demos respuesta a los que nos enviaron. ¿Qué dices de ti mismo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 23, NULL, 'Dijo: Yo soy la voz de uno que clama en el desierto: Enderezad el camino del Señor, como dijo el profeta Isaías.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 24, NULL, 'Y los que habían sido enviados eran de los fariseos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 25, NULL, 'Y le preguntaron, y le dijeron: ¿Por qué, pues, bautizas, si tú no eres el Cristo, ni Elías, ni el profeta?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 26, NULL, 'Juan les respondió diciendo: Yo bautizo con agua; mas en medio de vosotros está uno a quien vosotros no conocéis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 27, NULL, 'Este es el que viene después de mí, el que es antes de mí, del cual yo no soy digno de desatar la correa del calzado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 28, NULL, 'Estas cosas sucedieron en Betábara, al otro lado del Jordán, donde Juan estaba bautizando.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 29, 'El Cordero de Dios', 'El siguiente día vio Juan a Jesús que venía a él, y dijo: He aquí el Cordero de Dios, que quita el pecado del mundo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 30, NULL, 'Este es aquel de quien yo dije: Después de mí viene un varón, el cual es antes de mí; porque era primero que yo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 31, NULL, 'Y yo no le conocía; mas para que fuese manifestado a Israel, por esto vine yo bautizando con agua.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 32, NULL, 'También dio Juan testimonio, diciendo: Vi al Espíritu que descendía del cielo como paloma, y permaneció sobre él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 33, NULL, 'Y yo no le conocía; pero el que me envió a bautizar con agua, aquel me dijo: Sobre quien veas descender el Espíritu y que permanece sobre él, ese es el que bautiza con el Espíritu Santo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 34, NULL, 'Y yo le vi, y he dado testimonio de que este es el Hijo de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 35, 'Los primeros discípulos', 'El siguiente día otra vez estaba Juan, y dos de sus discípulos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 36, NULL, 'Y mirando a Jesús que andaba por allí, dijo: He aquí el Cordero de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 37, NULL, 'Le oyeron hablar los dos discípulos, y siguieron a Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 38, NULL, 'Y volviéndose Jesús, y viendo que le seguían, les dijo: ¿Qué buscáis? Ellos le dijeron: Rabí (que traducido es, Maestro), ¿dónde moras?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 39, NULL, 'Les dijo: Venid y ved. Fueron, y vieron donde moraba, y se quedaron con él aquel día; porque era como la hora décima.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 40, NULL, 'Andrés, hermano de Simón Pedro, era uno de los dos que habían oído a Juan, y habían seguido a Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 41, NULL, 'Este halló primero a su hermano Simón, y le dijo: Hemos hallado al Mesías (que traducido es, el Cristo).', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 42, NULL, 'Y le trajo a Jesús. Y mirándole Jesús, dijo: Tú eres Simón, hijo de Jonás; tú serás llamado Cefas (que quiere decir, Pedro).', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 43, 'Jesús llama a Felipe y a Natanael', 'El siguiente día quiso Jesús ir a Galilea, y halló a Felipe, y le dijo: Sígueme.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 44, NULL, 'Y Felipe era de Betsaida, la ciudad de Andrés y Pedro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 45, NULL, 'Felipe halló a Natanael, y le dijo: Hemos hallado a aquel de quien escribió Moisés en la ley, así como los profetas: a Jesús, el hijo de José, de Nazaret.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 46, NULL, 'Natanael le dijo: ¿De Nazaret puede salir algo de bueno? Le dijo Felipe: Ven y ve.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 47, NULL, 'Cuando Jesús vio a Natanael que se le acercaba, dijo de él: He aquí un verdadero israelita, en quien no hay engaño.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 48, NULL, 'Le dijo Natanael: ¿De dónde me conoces? Respondió Jesús y le dijo: Antes que Felipe te llamara, cuando estabas debajo de la higuera, te vi.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 49, NULL, 'Respondió Natanael y le dijo: Rabí, tú eres el Hijo de Dios; tú eres el Rey de Israel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 50, NULL, 'Respondió Jesús y le dijo: ¿Porque te dije: Te vi debajo de la higuera, crees? Cosas mayores que estas verás.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 1, 51, NULL, 'Y le dijo: De cierto, de cierto os digo: De aquí en adelante veréis el cielo abierto, y a los ángeles de Dios que suben y descienden sobre el Hijo del Hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 2, 1, 'Las bodas de Caná', 'Al tercer día se hicieron unas bodas en Caná de Galilea; y estaba allí la madre de Jesús.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 2, 2, NULL, 'Y fueron también invitados a las bodas Jesús y sus discípulos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 2, 3, NULL, 'Y faltando el vino, la madre de Jesús le dijo: No tienen vino.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 2, 4, NULL, 'Jesús le dijo: ¿Qué tienes conmigo, mujer? Aún no ha venido mi hora.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 2, 5, NULL, 'Su madre dijo a los que servían: Haced todo lo que os dijere.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 2, 6, NULL, 'Y estaban allí seis tinajas de piedra para agua, conforme al rito de la purificación de los judíos, en cada una de las cuales cabían dos o tres cántaros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 2, 7, NULL, 'Jesús les dijo: Llenad estas tinajas de agua. Y las llenaron hasta arriba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 2, 8, NULL, 'Entonces les dijo: Sacad ahora, y llevadlo al maestresala. Y se lo llevaron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 2, 9, NULL, 'Cuando el maestresala probó el agua hecha vino, sin saber él de dónde era, aunque lo sabían los sirvientes que habían sacado el agua, llamó al esposo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 2, 10, NULL, 'y le dijo: Todo hombre sirve primero el buen vino, y cuando ya han bebido mucho, entonces el inferior; mas tú has reservado el buen vino hasta ahora.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 2, 11, NULL, 'Este principio de señales hizo Jesús en Caná de Galilea, y manifestó su gloria; y sus discípulos creyeron en él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 2, 12, NULL, 'Después de esto descendieron a Capernaum, él, su madre, sus hermanos y sus discípulos; y estuvieron allí no muchos días.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 2, 13, 'Jesús purifica el templo', 'Estaba cerca la pascua de los judíos; y subió Jesús a Jerusalén,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 2, 14, NULL, 'y halló en el templo a los que vendían bueyes, ovejas y palomas, y a los cambistas allí sentados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 2, 15, NULL, 'Y haciendo un azote de cuerdas, echó fuera del templo a todos, y las ovejas y los bueyes; y esparció las monedas de los cambistas, y volcó las mesas;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 2, 16, NULL, 'y dijo a los que vendían palomas: Quitad de aquí esto, y no hagáis de la casa de mi Padre casa de mercado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 2, 17, NULL, 'Entonces se acordaron sus discípulos que está escrito: El celo de tu casa me consume.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 2, 18, NULL, 'Y los judíos respondieron y le dijeron: ¿Qué señal nos muestras, ya que haces esto?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 2, 19, NULL, 'Respondió Jesús y les dijo: Destruid este templo, y en tres días lo levantaré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 2, 20, NULL, 'Dijeron luego los judíos: En cuarenta y seis años fue edificado este templo, ¿y tú en tres días lo levantarás?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 2, 21, NULL, 'Mas él hablaba del templo de su cuerpo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 2, 22, NULL, 'Por tanto, cuando resucitó de entre los muertos, sus discípulos se acordaron que había dicho esto; y creyeron la Escritura y la palabra que Jesús había dicho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 2, 23, 'Jesús conoce a todos los hombres', 'Estando en Jerusalén en la fiesta de la pascua, muchos creyeron en su nombre, viendo las señales que hacía.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 2, 24, NULL, 'Pero Jesús mismo no se fiaba de ellos, porque conocía a todos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 2, 25, NULL, 'y no tenía necesidad de que nadie le diese testimonio del hombre, pues él sabía lo que había en el hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 3, 1, 'Jesús y Nicodemo', 'Había un hombre de los fariseos que se llamaba Nicodemo, un principal entre los judíos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 3, 2, NULL, 'Este vino a Jesús de noche, y le dijo: Rabí, sabemos que has venido de Dios como maestro; porque nadie puede hacer estas señales que tú haces, si no está Dios con él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 3, 3, NULL, 'Respondió Jesús y le dijo: De cierto, de cierto te digo, que el que no naciere de nuevo, no puede ver el reino de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 3, 4, NULL, 'Nicodemo le dijo: ¿Cómo puede un hombre nacer siendo viejo? ¿Puede acaso entrar por segunda vez en el vientre de su madre, y nacer?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 3, 5, NULL, 'Respondió Jesús: De cierto, de cierto te digo, que el que no naciere de agua y del Espíritu, no puede entrar en el reino de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 3, 6, NULL, 'Lo que es nacido de la carne, carne es; y lo que es nacido del Espíritu, espíritu es.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 3, 7, NULL, 'No te maravilles de que te dije: Os es necesario nacer de nuevo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 3, 8, NULL, 'El viento sopla de donde quiere, y oyes su sonido; mas ni sabes de dónde viene, ni a dónde va; así es todo aquel que es nacido del Espíritu.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 3, 9, NULL, 'Respondió Nicodemo y le dijo: ¿Cómo puede hacerse esto?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 3, 10, NULL, 'Respondió Jesús y le dijo: ¿Eres tú maestro de Israel, y no sabes esto?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 3, 11, NULL, 'De cierto, de cierto te digo, que lo que sabemos hablamos, y lo que hemos visto, testificamos; y no recibís nuestro testimonio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 3, 12, NULL, 'Si os he dicho cosas terrenales, y no creéis, ¿cómo creeréis si os dijere las celestiales?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 3, 13, NULL, 'Nadie subió al cielo, sino el que descendió del cielo; el Hijo del Hombre, que está en el cielo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 3, 14, NULL, 'Y como Moisés levantó la serpiente en el desierto, así es necesario que el Hijo del Hombre sea levantado,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 3, 15, NULL, 'para que todo aquel que en él cree, no se pierda, mas tenga vida eterna.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 3, 16, 'De tal manera amó Dios al mundo', 'Porque de tal manera amó Dios al mundo, que ha dado a su Hijo unigénito, para que todo aquel que en él cree, no se pierda, mas tenga vida eterna.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 3, 17, NULL, 'Porque no envió Dios a su Hijo al mundo para condenar al mundo, sino para que el mundo sea salvo por él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 3, 18, NULL, 'El que en él cree, no es condenado; pero el que no cree, ya ha sido condenado, porque no ha creído en el nombre del unigénito Hijo de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 3, 19, NULL, 'Y esta es la condenación: que la luz vino al mundo, y los hombres amaron más las tinieblas que la luz, porque sus obras eran malas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 3, 20, NULL, 'Porque todo aquel que hace lo malo, aborrece la luz y no viene a la luz, para que sus obras no sean reprendidas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 3, 21, NULL, 'Mas el que practica la verdad viene a la luz, para que sea manifiesto que sus obras son hechas en Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 3, 22, 'El amigo del esposo', 'Después de esto, vino Jesús con sus discípulos a la tierra de Judea, y estuvo allí con ellos, y bautizaba.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 3, 23, NULL, 'Juan bautizaba también en Enón, junto a Salim, porque había allí muchas aguas; y venían, y eran bautizados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 3, 24, NULL, 'Porque Juan no había sido aún encarcelado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 3, 25, NULL, 'Entonces hubo discusión entre los discípulos de Juan y los judíos acerca de la purificación.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 3, 26, NULL, 'Y vinieron a Juan y le dijeron: Rabí, mira que el que estaba contigo al otro lado del Jordán, de quien tú diste testimonio, bautiza, y todos vienen a él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 3, 27, NULL, 'Respondió Juan y dijo: No puede el hombre recibir nada, si no le fuere dado del cielo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 3, 28, NULL, 'Vosotros mismos me sois testigos de que dije: Yo no soy el Cristo, sino que soy enviado delante de él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 3, 29, NULL, 'El que tiene la esposa, es el esposo; mas el amigo del esposo, que está a su lado y le oye, se goza grandemente de la voz del esposo; así pues, este mi gozo está cumplido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 3, 30, NULL, 'Es necesario que él crezca, pero que yo mengüe.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 3, 31, 'El que viene de arriba', 'El que de arriba viene, es sobre todos; el que es de la tierra, es terrenal, y cosas terrenales habla; el que viene del cielo, es sobre todos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 3, 32, NULL, 'Y lo que vio y oyó, esto testifica; y nadie recibe su testimonio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 3, 33, NULL, 'El que recibe su testimonio, este atestigua que Dios es veraz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 3, 34, NULL, 'Porque el que Dios envió, las palabras de Dios habla; pues Dios no da el Espíritu por medida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 3, 35, NULL, 'El Padre ama al Hijo, y todas las cosas ha entregado en su mano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 3, 36, NULL, 'El que cree en el Hijo tiene vida eterna; pero el que rehúsa creer en el Hijo no verá la vida, sino que la ira de Dios está sobre él.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 1, 'Jesús y la mujer samaritana', 'Cuando, pues, el Señor entendió que los fariseos habían oído decir: Jesús hace y bautiza más discípulos que Juan', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 2, NULL, '(aunque Jesús no bautizaba, sino sus discípulos),', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 3, NULL, 'salió de Judea, y se fue otra vez a Galilea.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 4, NULL, 'Y le era necesario pasar por Samaria.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 5, NULL, 'Vino, pues, a una ciudad de Samaria llamada Sicar, junto a la heredad que Jacob dio a su hijo José.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 6, NULL, 'Y estaba allí el pozo de Jacob. Entonces Jesús, cansado del camino, se sentó así junto al pozo. Era como la hora sexta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 7, NULL, 'Vino una mujer de Samaria a sacar agua; y Jesús le dijo: Dame de beber.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 8, NULL, 'Pues sus discípulos habían ido a la ciudad a comprar de comer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 9, NULL, 'La mujer samaritana le dijo: ¿Cómo tú, siendo judío, me pides a mí de beber, que soy mujer samaritana? Porque judíos y samaritanos no se tratan entre sí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 10, NULL, 'Respondió Jesús y le dijo: Si conocieras el don de Dios, y quién es el que te dice: Dame de beber; tú le pedirías, y él te daría agua viva.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 11, NULL, 'La mujer le dijo: Señor, no tienes con qué sacarla, y el pozo es hondo. ¿De dónde, pues, tienes el agua viva?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 12, NULL, '¿Acaso eres tú mayor que nuestro padre Jacob, que nos dio este pozo, del cual bebieron él, sus hijos y sus ganados?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 13, NULL, 'Respondió Jesús y le dijo: Cualquiera que bebiere de esta agua, volverá a tener sed;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 14, NULL, 'mas el que bebiere del agua que yo le daré, no tendrá sed jamás; sino que el agua que yo le daré será en él una fuente de agua que salte para vida eterna.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 15, NULL, 'La mujer le dijo: Señor, dame esa agua, para que no tenga yo sed, ni venga aquí a sacarla.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 16, NULL, 'Jesús le dijo: Ve, llama a tu marido, y ven acá.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 17, NULL, 'Respondió la mujer y dijo: No tengo marido. Jesús le dijo: Bien has dicho: No tengo marido;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 18, NULL, 'porque cinco maridos has tenido, y el que ahora tienes no es tu marido; esto has dicho con verdad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 19, NULL, 'Le dijo la mujer: Señor, me parece que tú eres profeta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 20, NULL, 'Nuestros padres adoraron en este monte, y vosotros decís que en Jerusalén es el lugar donde se debe adorar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 21, NULL, 'Jesús le dijo: Mujer, créeme, que la hora viene cuando ni en este monte ni en Jerusalén adoraréis al Padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 22, NULL, 'Vosotros adoráis lo que no sabéis; nosotros adoramos lo que sabemos; porque la salvación viene de los judíos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 23, NULL, 'Mas la hora viene, y ahora es, cuando los verdaderos adoradores adorarán al Padre en espíritu y en verdad; porque también el Padre tales adoradores busca que le adoren.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 24, NULL, 'Dios es Espíritu; y los que le adoran, en espíritu y en verdad es necesario que adoren.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 25, NULL, 'Le dijo la mujer: Sé que ha de venir el Mesías, llamado el Cristo; cuando él venga nos declarará todas las cosas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 26, NULL, 'Jesús le dijo: Yo soy, el que habla contigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 27, NULL, 'En esto vinieron sus discípulos, y se maravillaron de que hablaba con una mujer; sin embargo, ninguno dijo: ¿Qué preguntas? o, ¿Qué hablas con ella?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 28, NULL, 'Entonces la mujer dejó su cántaro, y fue a la ciudad, y dijo a los hombres:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 29, NULL, 'Venid, ved a un hombre que me ha dicho todo cuanto he hecho. ¿No será este el Cristo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 30, NULL, 'Entonces salieron de la ciudad, y vinieron a él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 31, NULL, 'Entre tanto, los discípulos le rogaban, diciendo: Rabí, come.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 32, NULL, 'Él les dijo: Yo tengo una comida que comer, que vosotros no sabéis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 33, NULL, 'Entonces los discípulos decían unos a otros: ¿Le habrá traído alguien de comer?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 34, NULL, 'Jesús les dijo: Mi comida es que haga la voluntad del que me envió, y que acabe su obra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 35, NULL, '¿No decís vosotros: Aún faltan cuatro meses para que llegue la siega? He aquí os digo: Alzad vuestros ojos y mirad los campos, porque ya están blancos para la siega.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 36, NULL, 'Y el que siega recibe salario, y recoge fruto para vida eterna, para que el que siembra goce juntamente con el que siega.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 37, NULL, 'Porque en esto es verdadero el dicho: Uno es el que siembra, y otro es el que siega.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 38, NULL, 'Yo os he enviado a segar lo que vosotros no labrasteis; otros labraron, y vosotros habéis entrado en sus labores.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 39, NULL, 'Y muchos de los samaritanos de aquella ciudad creyeron en él por la palabra de la mujer, que daba testimonio diciendo: Me dijo todo lo que he hecho.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 40, NULL, 'Entonces vinieron los samaritanos a él y le rogaron que se quedase con ellos; y se quedó allí dos días.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 41, NULL, 'Y creyeron muchos más por la palabra de él,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 42, NULL, 'y decían a la mujer: Ya no creemos solamente por tu dicho, porque nosotros mismos hemos oído, y sabemos que verdaderamente este es el Salvador del mundo, el Cristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 43, 'Jesús sana al hijo de un noble', 'Dos días después, salió de allí y fue a Galilea.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 44, NULL, 'Porque Jesús mismo dio testimonio de que el profeta no tiene honra en su propia tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 45, NULL, 'Cuando vino a Galilea, los galileos le recibieron, habiendo visto todas las cosas que había hecho en Jerusalén, en la fiesta; porque también ellos habían ido a la fiesta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 46, NULL, 'Vino, pues, Jesús otra vez a Caná de Galilea, donde había convertido el agua en vino. Y había en Capernaum un oficial del rey, cuyo hijo estaba enfermo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 47, NULL, 'Este, cuando oyó que Jesús había llegado de Judea a Galilea, vino a él y le rogó que descendiese y sanase a su hijo, que estaba a punto de morir.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 48, NULL, 'Entonces Jesús le dijo: Si no viereis señales y prodigios, no creeréis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 49, NULL, 'El oficial del rey le dijo: Señor, desciende antes que mi hijo muera.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 50, NULL, 'Jesús le dijo: Ve, tu hijo vive. Y el hombre creyó la palabra que Jesús le dijo, y se fue.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 51, NULL, 'Cuando ya él descendía, sus siervos salieron a recibirle, y le dieron nuevas, diciendo: Tu hijo vive.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 52, NULL, 'Entonces él les preguntó a qué hora había comenzado a estar mejor. Y le dijeron: Ayer a las siete le dejó la fiebre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 53, NULL, 'El padre entonces entendió que aquella era la hora en que Jesús le había dicho: Tu hijo vive; y creyó él con toda su casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 4, 54, NULL, 'Esta segunda señal hizo Jesús, cuando fue de Judea a Galilea.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 1, 'El paralítico de Betesda', 'Después de estas cosas había una fiesta de los judíos, y subió Jesús a Jerusalén.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 2, NULL, 'Y hay en Jerusalén, cerca de la puerta de las ovejas, un estanque, llamado en hebreo Betesda, el cual tiene cinco pórticos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 3, NULL, 'En estos yacía una multitud de enfermos, ciegos, cojos y paralíticos, que esperaban el movimiento del agua.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 4, NULL, 'Porque un ángel descendía de tiempo en tiempo al estanque, y agitaba el agua; y el que primero descendía al estanque después del movimiento del agua, quedaba sano de cualquier enfermedad que tuviese.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 5, NULL, 'Y había allí un hombre que hacía treinta y ocho años que estaba enfermo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 6, NULL, 'Cuando Jesús lo vio acostado, y supo que llevaba ya mucho tiempo así, le dijo: ¿Quieres ser sano?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 7, NULL, 'Señor, le respondió el enfermo, no tengo quien me meta en el estanque cuando se agita el agua; y entre tanto que yo voy, otro desciende antes que yo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 8, NULL, 'Jesús le dijo: Levántate, toma tu lecho, y anda.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 9, NULL, 'Y al instante aquel hombre fue sanado, y tomó su lecho, y anduvo. Y era día de reposo aquel día.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 10, NULL, 'Entonces los judíos dijeron a aquel que había sido sanado: Es día de reposo; no te es lícito llevar tu lecho.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 11, NULL, 'Él les respondió: El que me sanó, él mismo me dijo: Toma tu lecho y anda.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 12, NULL, 'Entonces le preguntaron: ¿Quién es el que te dijo: Toma tu lecho y anda?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 13, NULL, 'Y el que había sido sanado no sabía quién fuese, porque Jesús se había apartado de la gente que estaba en aquel lugar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 14, NULL, 'Después le halló Jesús en el templo, y le dijo: Mira, has sido sanado; no peques más, para que no te venga alguna cosa peor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 15, NULL, 'El hombre se fue, y dio aviso a los judíos, que Jesús era el que le había sanado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 16, NULL, 'Y por esta causa los judíos perseguían a Jesús, y procuraban matarle, porque hacía estas cosas en el día de reposo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 17, NULL, 'Y Jesús les respondió: Mi Padre hasta ahora trabaja, y yo trabajo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 18, NULL, 'Por esto los judíos aún más procuraban matarle, porque no solo quebrantaba el día de reposo, sino que también decía que Dios era su propio Padre, haciéndose igual a Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 19, 'La autoridad del Hijo', 'Respondió entonces Jesús, y les dijo: De cierto, de cierto os digo: No puede el Hijo hacer nada por sí mismo, sino lo que ve hacer al Padre; porque todo lo que el Padre hace, también lo hace el Hijo igualmente.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 20, NULL, 'Porque el Padre ama al Hijo, y le muestra todas las cosas que él hace; y mayores obras que estas le mostrará, de modo que vosotros os maravilléis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 21, NULL, 'Porque como el Padre levanta a los muertos, y les da vida, así también el Hijo a los que quiere da vida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 22, NULL, 'Porque el Padre a nadie juzga, sino que todo el juicio dio al Hijo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 23, NULL, 'para que todos honren al Hijo como honran al Padre. El que no honra al Hijo, no honra al Padre que le envió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 24, NULL, 'De cierto, de cierto os digo: El que oye mi palabra, y cree al que me envió, tiene vida eterna; y no vendrá a condenación, mas ha pasado de muerte a vida.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 25, NULL, 'De cierto, de cierto os digo: Viene la hora, y ahora es, cuando los muertos oirán la voz del Hijo de Dios; y los que la oyeren vivirán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 26, NULL, 'Porque como el Padre tiene vida en sí mismo, así también ha dado al Hijo el tener vida en sí mismo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 27, NULL, 'y también le dio autoridad de hacer juicio, por cuanto es el Hijo del Hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 28, NULL, 'No os maravilléis de esto; porque vendrá hora cuando todos los que están en los sepulcros oirán su voz;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 29, NULL, 'y los que hicieron lo bueno, saldrán a resurrección de vida; mas los que hicieron lo malo, a resurrección de condenación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 30, 'Testigos de Cristo', 'No puedo yo hacer nada por mí mismo; según oigo, así juzgo; y mi juicio es justo, porque no busco mi voluntad, sino la voluntad del que me envió, la del Padre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 31, NULL, 'Si yo doy testimonio acerca de mí mismo, mi testimonio no es verdadero.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 32, NULL, 'Otro es el que da testimonio acerca de mí, y sé que el testimonio que da de mí es verdadero.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 33, NULL, 'Vosotros enviasteis mensajeros a Juan, y él dio testimonio de la verdad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 34, NULL, 'Pero yo no recibo testimonio de hombre alguno; mas digo esto, para que vosotros seáis salvos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 35, NULL, 'Él era antorcha que ardía y alumbraba; y vosotros quisisteis regocijaros por un tiempo en su luz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 36, NULL, 'Mas yo tengo mayor testimonio que el de Juan; porque las obras que el Padre me dio para que cumpliese, las mismas obras que yo hago, dan testimonio de mí, que el Padre me ha enviado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 37, NULL, 'También el Padre que me envió ha dado testimonio de mí. Nunca habéis oído su voz, ni habéis visto su aspecto,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 38, NULL, 'ni tenéis su palabra morando en vosotros; porque a quien él envió, vosotros no creéis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 39, NULL, 'Escudriñad las Escrituras; porque a vosotros os parece que en ellas tenéis la vida eterna; y ellas son las que dan testimonio de mí;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 40, NULL, 'y no queréis venir a mí para que tengáis vida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 41, NULL, 'Gloria de los hombres no recibo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 42, NULL, 'Mas yo os conozco, que no tenéis amor de Dios en vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 43, NULL, 'Yo he venido en nombre de mi Padre, y no me recibís; si otro viniere en su propio nombre, a ese recibiréis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 44, NULL, '¿Cómo podéis vosotros creer, pues recibís gloria los unos de los otros, y no buscáis la gloria que viene del Dios único?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 45, NULL, 'No penséis que yo voy a acusaros delante del Padre; hay quien os acusa, Moisés, en quien tenéis vuestra esperanza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 46, NULL, 'Porque si creyeseis a Moisés, me creeríais a mí, porque de mí escribió él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 5, 47, NULL, 'Pero si no creéis a sus escritos, ¿cómo creeréis a mis palabras?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 1, 'Alimentación de los cinco mil', 'Después de esto, Jesús fue al otro lado del mar de Galilea, el de Tiberias.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 2, NULL, 'Y le seguía gran multitud, porque veían las señales que hacía en los enfermos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 3, NULL, 'Entonces subió Jesús a un monte, y se sentó allí con sus discípulos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 4, NULL, 'Y estaba cerca la pascua, la fiesta de los judíos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 5, NULL, 'Cuando alzó Jesús los ojos, y vio que había venido a él gran multitud, dijo a Felipe: ¿De dónde compraremos pan para que coman estos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 6, NULL, 'Pero esto decía para probarle; porque él sabía lo que había de hacer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 7, NULL, 'Felipe le respondió: Doscientos denarios de pan no bastarían para que cada uno de ellos tomase un poco.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 8, NULL, 'Uno de sus discípulos, Andrés, hermano de Simón Pedro, le dijo:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 9, NULL, 'Aquí está un muchacho, que tiene cinco panes de cebada y dos pececillos; mas ¿qué es esto para tantos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 10, NULL, 'Entonces Jesús dijo: Haced recostar la gente. Y había mucha hierba en aquel lugar; y se recostaron como en número de cinco mil varones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 11, NULL, 'Y tomó Jesús aquellos panes, y habiendo dado gracias, los repartió entre los discípulos, y los discípulos entre los que estaban recostados; asimismo de los peces, cuanto querían.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 12, NULL, 'Y cuando se hubieron saciado, dijo a sus discípulos: Recoged los pedazos que sobraron, para que no se pierda nada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 13, NULL, 'Recogieron, pues, y llenaron doce cestas de pedazos, que de los cinco panes de cebada sobraron a los que habían comido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 14, NULL, 'Aquellos hombres entonces, viendo la señal que Jesús había hecho, dijeron: Este verdaderamente es el profeta que había de venir al mundo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 15, NULL, 'Pero entendiendo Jesús que iban a venir para apoderarse de él y hacerle rey, volvió a retirarse al monte él solo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 16, 'Jesús anda sobre el mar', 'Al anochecer, descendieron sus discípulos al mar,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 17, NULL, 'y entrando en una barca, iban cruzando el mar hacia Capernaum. Estaba ya oscuro, y Jesús no había venido a ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 18, NULL, 'Y se levantaba el mar con un gran viento que soplaba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 19, NULL, 'Cuando habían remado como veinticinco o treinta estadios, vieron a Jesús que andaba sobre el mar y se acercaba a la barca; y tuvieron miedo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 20, NULL, 'Mas él les dijo: Yo soy; no temáis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 21, NULL, 'Ellos entonces con gusto le recibieron en la barca, la cual llegó en seguida a la tierra adonde iban.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 22, 'La gente busca a Jesús', 'El día siguiente, la gente que estaba al otro lado del mar vio que no había habido allí más que una sola barca, y que Jesús no había entrado en ella con sus discípulos, sino que estos se habían ido solos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 23, NULL, 'Pero otras barcas habían arribado de Tiberias junto al lugar donde habían comido el pan después de haber dado gracias el Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 24, NULL, 'Cuando vio, pues, la gente que Jesús no estaba allí, ni sus discípulos, entraron en las barcas y fueron a Capernaum, buscando a Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 25, 'Jesús, el pan de vida', 'Y hallándole al otro lado del mar, le dijeron: Rabí, ¿cuándo llegaste acá?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 26, NULL, 'Respondió Jesús y les dijo: De cierto, de cierto os digo que me buscáis, no porque habéis visto las señales, sino porque comisteis el pan y os saciasteis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 27, NULL, 'Trabajad, no por la comida que perece, sino por la comida que a vida eterna permanece, la cual el Hijo del Hombre os dará; porque a este señaló Dios el Padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 28, NULL, 'Entonces le dijeron: ¿Qué debemos hacer para poner en práctica las obras de Dios?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 29, NULL, 'Respondió Jesús y les dijo: Esta es la obra de Dios, que creáis en el que él ha enviado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 30, NULL, 'Le dijeron entonces: ¿Qué señal, pues, haces tú, para que veamos, y te creamos? ¿Qué obra haces?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 31, NULL, 'Nuestros padres comieron el maná en el desierto, como está escrito: Pan del cielo les dio a comer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 32, NULL, 'Y Jesús les dijo: De cierto, de cierto os digo: No os dio Moisés el pan del cielo, mas mi Padre os da el verdadero pan del cielo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 33, NULL, 'Porque el pan de Dios es aquel que descendió del cielo y da vida al mundo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 34, NULL, 'Le dijeron: Señor, danos siempre este pan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 35, NULL, 'Jesús les dijo: Yo soy el pan de vida; el que a mí viene, nunca tendrá hambre; y el que en mí cree, no tendrá sed jamás.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 36, NULL, 'Mas os he dicho, que aunque me habéis visto, no creéis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 37, NULL, 'Todo lo que el Padre me da, vendrá a mí; y al que a mí viene, no le echo fuera.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 38, NULL, 'Porque he descendido del cielo, no para hacer mi voluntad, sino la voluntad del que me envió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 39, NULL, 'Y esta es la voluntad del Padre, el que me envió: Que de todo lo que me diere, no pierda yo nada, sino que lo resucite en el día postrero.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 40, NULL, 'Y esta es la voluntad del que me ha enviado: Que todo aquel que ve al Hijo, y cree en él, tenga vida eterna; y yo le resucitaré en el día postrero.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 41, NULL, 'Murmuraban entonces de él los judíos, porque había dicho: Yo soy el pan que descendió del cielo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 42, NULL, 'Y decían: ¿No es este Jesús, el hijo de José, cuyo padre y madre nosotros conocemos? ¿Cómo, pues, dice este: Del cielo he descendido?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 43, NULL, 'Jesús respondió y les dijo: No murmuréis entre vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 44, NULL, 'Ninguno puede venir a mí, si el Padre que me envió no le trajere; y yo le resucitaré en el día postrero.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 45, NULL, 'Escrito está en los profetas: Y serán todos enseñados por Dios. Así que, todo aquel que oyó al Padre, y aprendió de él, viene a mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 46, NULL, 'No que alguno haya visto al Padre, sino aquel que vino de Dios; este ha visto al Padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 47, NULL, 'De cierto, de cierto os digo: El que cree en mí, tiene vida eterna.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 48, NULL, 'Yo soy el pan de vida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 49, NULL, 'Vuestros padres comieron el maná en el desierto, y murieron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 50, NULL, 'Este es el pan que desciende del cielo, para que el que de él come, no muera.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 51, NULL, 'Yo soy el pan vivo que descendió del cielo; si alguno comiere de este pan, vivirá para siempre; y el pan que yo daré es mi carne, la cual yo daré por la vida del mundo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 52, NULL, 'Entonces los judíos contendían entre sí, diciendo: ¿Cómo puede este darnos a comer su carne?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 53, NULL, 'Jesús les dijo: De cierto, de cierto os digo: Si no coméis la carne del Hijo del Hombre, y bebéis su sangre, no tenéis vida en vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 54, NULL, 'El que come mi carne y bebe mi sangre, tiene vida eterna; y yo le resucitaré en el día postrero.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 55, NULL, 'Porque mi carne es verdadera comida, y mi sangre es verdadera bebida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 56, NULL, 'El que come mi carne y bebe mi sangre, en mí permanece, y yo en él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 57, NULL, 'Como me envió el Padre viviente, y yo vivo por el Padre, asimismo el que me come, él también vivirá por mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 58, NULL, 'Este es el pan que descendió del cielo; no como vuestros padres comieron el maná, y murieron; el que come de este pan, vivirá eternamente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 59, NULL, 'Estas cosas dijo en la sinagoga, enseñando en Capernaum.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 60, 'Palabras de vida eterna', 'Al oírlas, muchos de sus discípulos dijeron: Dura es esta palabra; ¿quién la puede oír?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 61, NULL, 'Sabiendo Jesús en sí mismo que sus discípulos murmuraban de esto, les dijo: ¿Esto os ofende?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 62, NULL, '¿Pues qué, si viereis al Hijo del Hombre subir adonde estaba primero?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 63, NULL, 'El espíritu es el que da vida; la carne para nada aprovecha; las palabras que yo os he hablado son espíritu y son vida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 64, NULL, 'Pero hay algunos de vosotros que no creen. Porque Jesús sabía desde el principio quiénes eran los que no creían, y quién le había de entregar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 65, NULL, 'Y dijo: Por eso os he dicho que ninguno puede venir a mí, si no le fuere dado del Padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 66, NULL, 'Desde entonces muchos de sus discípulos volvieron atrás, y ya no andaban con él.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 67, NULL, 'Dijo entonces Jesús a los doce: ¿Queréis acaso iros también vosotros?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 68, NULL, 'Le respondió Simón Pedro: Señor, ¿a quién iremos? Tú tienes palabras de vida eterna.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 69, NULL, 'Y nosotros hemos creído y conocemos que tú eres el Cristo, el Hijo del Dios viviente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 70, NULL, 'Jesús les respondió: ¿No os he escogido yo a vosotros los doce, y uno de vosotros es diablo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 6, 71, NULL, 'Hablaba de Judas Iscariote, hijo de Simón; porque este era el que le iba a entregar, y era uno de los doce.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 1, 'Incredulidad de los hermanos de Jesús', 'Después de estas cosas, andaba Jesús en Galilea; pues no quería andar en Judea, porque los judíos procuraban matarle.', 1, 'spa', 'RVR1960', NULL);\n"
;

  public static final String SQL_PARTE_2 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Jn', 7, 2, NULL, 'Estaba cerca la fiesta de los judíos, la de los tabernáculos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 3, NULL, 'y le dijeron sus hermanos: Sal de aquí, y vete a Judea, para que también tus discípulos vean las obras que haces.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 4, NULL, 'Porque ninguno que procura darse a conocer hace algo en secreto. Si estas cosas haces, manifiéstate al mundo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 5, NULL, 'Porque ni aun sus hermanos creían en él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 6, NULL, 'Entonces Jesús les dijo: Mi tiempo aún no ha llegado, mas vuestro tiempo siempre está presto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 7, NULL, 'No puede el mundo aborreceros a vosotros; mas a mí me aborrece, porque yo testifico de él, que sus obras son malas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 8, NULL, 'Subid vosotros a la fiesta; yo no subo todavía a esa fiesta, porque mi tiempo aún no se ha cumplido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 9, NULL, 'Y habiéndoles dicho esto, se quedó en Galilea.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 10, 'Jesús en la fiesta de los tabernáculos', 'Pero después que sus hermanos habían subido, entonces él también subió a la fiesta, no abiertamente, sino como en secreto.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 11, NULL, 'Y le buscaban los judíos en la fiesta, y decían: ¿Dónde está aquel?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 12, NULL, 'Y había gran murmullo acerca de él entre la multitud, pues unos decían: Es bueno; pero otros decían: No, sino que engaña al pueblo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 13, NULL, 'Pero ninguno hablaba abiertamente de él, por miedo a los judíos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 14, NULL, 'Mas a la mitad de la fiesta subió Jesús al templo, y enseñaba.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 15, NULL, 'Y se maravillaban los judíos, diciendo: ¿Cómo sabe este letras, sin haber estudiado?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 16, NULL, 'Jesús les respondió y dijo: Mi doctrina no es mía, sino de aquel que me envió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 17, NULL, 'El que quiera hacer la voluntad de Dios, conocerá si la doctrina es de Dios, o si yo hablo por mi propia cuenta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 18, NULL, 'El que habla por su propia cuenta, su propia gloria busca; pero el que busca la gloria del que le envió, este es verdadero, y no hay en él injusticia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 19, NULL, '¿No os dio Moisés la ley, y ninguno de vosotros cumple la ley? ¿Por qué procuráis matarme?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 20, NULL, 'Respondió la multitud y dijo: Demonio tienes; ¿quién procura matarte?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 21, NULL, 'Jesús respondió y les dijo: Una obra hice, y todos os maravilláis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 22, NULL, 'Por cierto, Moisés os dio la circuncisión (no porque sea de Moisés, sino de los padres); y en el día de reposo circuncidáis al hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 23, NULL, 'Si recibe el hombre la circuncisión en el día de reposo, para que la ley de Moisés no sea quebrantada, ¿os enojáis conmigo porque en el día de reposo sané completamente a un hombre?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 24, NULL, 'No juzguéis según las apariencias, sino juzgad con justo juicio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 25, '¿Es este el Cristo?', 'Decían entonces unos de Jerusalén: ¿No es este a quien buscan para matarle?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 26, NULL, 'Pues mirad, habla públicamente, y no le dicen nada. ¿Habrán reconocido en verdad los gobernantes que este es el Cristo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 27, NULL, 'Pero este, sabemos de dónde es; mas cuando venga el Cristo, nadie sabrá de dónde sea.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 28, NULL, 'Jesús entonces, enseñando en el templo, alzó la voz y dijo: A mí me conocéis, y sabéis de dónde soy; y no he venido de mí mismo, pero el que me envió es verdadero, a quien vosotros no conocéis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 29, NULL, 'Pero yo le conozco, porque de él procedo, y él me envió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 30, NULL, 'Entonces procuraban prenderle; pero ninguno le echó mano, porque aún no había llegado su hora.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 31, NULL, 'Y muchos de la multitud creyeron en él, y decían: El Cristo, cuando venga, ¿hará más señales que las que este hace?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 32, 'Los fariseos envían alguaciles para prender a Jesús', 'Los fariseos oyeron a la gente que murmuraba de él estas cosas; y los principales sacerdotes y los fariseos enviaron alguaciles para que le prendiesen.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 33, NULL, 'Entonces Jesús dijo: Todavía un poco de tiempo estaré con vosotros, e iré al que me envió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 34, NULL, 'Me buscaréis, y no me hallaréis; y a donde yo estaré, vosotros no podréis venir.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 35, NULL, 'Entonces los judíos dijeron entre sí: ¿Adónde se irá este, que no le hallemos? ¿Se irá a los dispersos entre los griegos, y enseñará a los griegos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 36, NULL, '¿Qué significa esto que dijo: Me buscaréis, y no me hallaréis; y a donde yo estaré, vosotros no podréis venir?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 37, 'Ríos de agua viva', 'En el último y gran día de la fiesta, Jesús se puso en pie y alzó la voz, diciendo: Si alguno tiene sed, venga a mí y beba.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 38, NULL, 'El que cree en mí, como dice la Escritura, de su interior correrán ríos de agua viva.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 39, NULL, 'Esto dijo del Espíritu que habían de recibir los que creyesen en él; pues aún no había venido el Espíritu Santo, porque Jesús no había sido aún glorificado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 40, 'División entre la gente', 'Entonces algunos de la multitud, oyendo estas palabras, decían: Verdaderamente este es el profeta.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 41, NULL, 'Otros decían: Este es el Cristo. Pero algunos decían: ¿De Galilea ha de venir el Cristo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 42, NULL, '¿No dice la Escritura que del linaje de David, y de la aldea de Belén, de donde era David, ha de venir el Cristo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 43, NULL, 'Hubo entonces disensión entre la gente a causa de él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 44, NULL, 'Y algunos de ellos querían prenderle; pero ninguno le echó mano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 45, '¡Nunca ha hablado hombre así!', 'Los alguaciles vinieron a los principales sacerdotes y a los fariseos; y estos les dijeron: ¿Por qué no le habéis traído?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 46, NULL, 'Los alguaciles respondieron: ¡Jamás hombre alguno ha hablado como este hombre!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 47, NULL, 'Entonces los fariseos les respondieron: ¿También vosotros habéis sido engañados?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 48, NULL, '¿Acaso ha creído en él alguno de los gobernantes, o de los fariseos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 49, NULL, 'Mas esta gente que no sabe la ley, maldita es.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 50, NULL, 'Les dijo Nicodemo, el que vino a él de noche, el cual era uno de ellos:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 51, NULL, '¿Juzga acaso nuestra ley a un hombre si primero no le oye, y sabe lo que ha hecho?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 52, NULL, 'Respondieron y le dijeron: ¿Eres tú también galileo? Escudriña y ve que de Galilea nunca se ha levantado profeta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 7, 53, 'La mujer adúltera', 'Cada uno se fue a su casa;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 1, NULL, '1 y Jesús se fue al monte de los Olivos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 2, NULL, 'Y por la mañana volvió al templo, y todo el pueblo vino a él; y sentado él, les enseñaba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 3, NULL, 'Entonces los escribas y los fariseos le trajeron una mujer sorprendida en adulterio; y poniéndola en medio,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 4, NULL, 'le dijeron: Maestro, esta mujer ha sido sorprendida en el acto mismo de adulterio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 5, NULL, 'Y en la ley nos mandó Moisés apedrear a tales mujeres. Tú, pues, ¿qué dices?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 6, NULL, 'Mas esto decían tentándole, para poder acusarle. Pero Jesús, inclinado hacia el suelo, escribía en tierra con el dedo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 7, NULL, 'Y como insistieran en preguntarle, se enderezó y les dijo: El que de vosotros esté sin pecado sea el primero en arrojar la piedra contra ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 8, NULL, 'E inclinándose de nuevo hacia el suelo, siguió escribiendo en tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 9, NULL, 'Pero ellos, al oír esto, acusados por su conciencia, salían uno a uno, comenzando desde los más viejos hasta los postreros; y quedó solo Jesús, y la mujer que estaba en medio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 10, NULL, 'Enderezándose Jesús, y no viendo a nadie sino a la mujer, le dijo: Mujer, ¿dónde están los que te acusaban? ¿Ninguno te condenó?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 11, NULL, 'Ella dijo: Ninguno, Señor. Entonces Jesús le dijo: Ni yo te condeno; vete, y no peques más.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 12, 'Jesús, la luz del mundo', 'Otra vez Jesús les habló, diciendo: Yo soy la luz del mundo; el que me sigue, no andará en tinieblas, sino que tendrá la luz de la vida.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 13, NULL, 'Entonces los fariseos le dijeron: Tú das testimonio acerca de ti mismo; tu testimonio no es verdadero.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 14, NULL, 'Respondió Jesús y les dijo: Aunque yo doy testimonio acerca de mí mismo, mi testimonio es verdadero, porque sé de dónde he venido y a dónde voy; pero vosotros no sabéis de dónde vengo, ni a dónde voy.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 15, NULL, 'Vosotros juzgáis según la carne; yo no juzgo a nadie.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 16, NULL, 'Y si yo juzgo, mi juicio es verdadero; porque no soy yo solo, sino yo y el que me envió, el Padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 17, NULL, 'Y en vuestra ley está escrito que el testimonio de dos hombres es verdadero.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 18, NULL, 'Yo soy el que doy testimonio de mí mismo, y el Padre que me envió da testimonio de mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 19, NULL, 'Ellos le dijeron: ¿Dónde está tu Padre? Respondió Jesús: Ni a mí me conocéis, ni a mi Padre; si a mí me conocieseis, también a mi Padre conoceríais.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 20, NULL, 'Estas palabras habló Jesús en el lugar de las ofrendas, enseñando en el templo; y nadie le prendió, porque aún no había llegado su hora.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 21, 'A donde yo voy, vosotros no podéis venir', 'Otra vez les dijo Jesús: Yo me voy, y me buscaréis, pero en vuestro pecado moriréis; a donde yo voy, vosotros no podéis venir.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 22, NULL, 'Decían entonces los judíos: ¿Acaso se matará a sí mismo, que dice: A donde yo voy, vosotros no podéis venir?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 23, NULL, 'Y les dijo: Vosotros sois de abajo, yo soy de arriba; vosotros sois de este mundo, yo no soy de este mundo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 24, NULL, 'Por eso os dije que moriréis en vuestros pecados; porque si no creéis que yo soy, en vuestros pecados moriréis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 25, NULL, 'Entonces le dijeron: ¿Tú quién eres? Entonces Jesús les dijo: Lo que desde el principio os he dicho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 26, NULL, 'Muchas cosas tengo que decir y juzgar de vosotros; pero el que me envió es verdadero; y yo, lo que he oído de él, esto hablo al mundo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 27, NULL, 'Pero no entendieron que les hablaba del Padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 28, NULL, 'Les dijo, pues, Jesús: Cuando hayáis levantado al Hijo del Hombre, entonces conoceréis que yo soy, y que nada hago por mí mismo, sino que según me enseñó el Padre, así hablo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 29, NULL, 'Porque el que me envió, conmigo está; no me ha dejado solo el Padre, porque yo hago siempre lo que le agrada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 30, NULL, 'Hablando él estas cosas, muchos creyeron en él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 31, 'La verdad os hará libres', 'Dijo entonces Jesús a los judíos que habían creído en él: Si vosotros permaneciereis en mi palabra, seréis verdaderamente mis discípulos;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 32, NULL, 'y conoceréis la verdad, y la verdad os hará libres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 33, NULL, 'Le respondieron: Linaje de Abraham somos, y jamás hemos sido esclavos de nadie. ¿Cómo dices tú: Seréis libres?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 34, NULL, 'Jesús les respondió: De cierto, de cierto os digo, que todo aquel que hace pecado, esclavo es del pecado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 35, NULL, 'Y el esclavo no queda en la casa para siempre; el hijo sí queda para siempre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 36, NULL, 'Así que, si el Hijo os libertare, seréis verdaderamente libres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 37, NULL, 'Sé que sois descendientes de Abraham; pero procuráis matarme, porque mi palabra no halla cabida en vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 38, NULL, 'Yo hablo lo que he visto cerca del Padre; y vosotros hacéis lo que habéis oído cerca de vuestro padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 39, 'Sois de vuestro padre el diablo', 'Respondieron y le dijeron: Nuestro padre es Abraham. Jesús les dijo: Si fueseis hijos de Abraham, las obras de Abraham haríais.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 40, NULL, 'Pero ahora procuráis matarme a mí, hombre que os he hablado la verdad, la cual he oído de Dios; no hizo esto Abraham.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 41, NULL, 'Vosotros hacéis las obras de vuestro padre. Entonces le dijeron: Nosotros no somos nacidos de fornicación; un padre tenemos, que es Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 42, NULL, 'Jesús entonces les dijo: Si vuestro padre fuese Dios, ciertamente me amaríais; porque yo de Dios he salido, y he venido; pues no he venido de mí mismo, sino que él me envió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 43, NULL, '¿Por qué no entendéis mi lenguaje? Porque no podéis escuchar mi palabra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 44, NULL, 'Vosotros sois de vuestro padre el diablo, y los deseos de vuestro padre queréis hacer. Él ha sido homicida desde el principio, y no ha permanecido en la verdad, porque no hay verdad en él. Cuando habla mentira, de suyo habla; porque es mentiroso, y padre de mentira.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 45, NULL, 'Y a mí, porque digo la verdad, no me creéis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 46, NULL, '¿Quién de vosotros me redarguye de pecado? Pues si digo la verdad, ¿por qué vosotros no me creéis?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 47, NULL, 'El que es de Dios, las palabras de Dios oye; por esto no las oís vosotros, porque no sois de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 48, 'La preexistencia de Cristo', 'Respondieron entonces los judíos, y le dijeron: ¿No decimos bien nosotros, que tú eres samaritano, y que tienes demonio?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 49, NULL, 'Respondió Jesús: Yo no tengo demonio, antes honro a mi Padre; y vosotros me deshonráis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 50, NULL, 'Pero yo no busco mi gloria; hay quien la busca, y juzga.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 51, NULL, 'De cierto, de cierto os digo, que el que guarda mi palabra, nunca verá muerte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 52, NULL, 'Entonces los judíos le dijeron: Ahora conocemos que tienes demonio. Abraham murió, y los profetas; y tú dices: El que guarda mi palabra, nunca sufrirá muerte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 53, NULL, '¿Eres tú acaso mayor que nuestro padre Abraham, el cual murió? ¡Y los profetas murieron! ¿Quién te haces a ti mismo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 54, NULL, 'Respondió Jesús: Si yo me glorifico a mí mismo, mi gloria nada es; mi Padre es el que me glorifica, el que vosotros decís que es vuestro Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 55, NULL, 'Pero vosotros no le conocéis; mas yo le conozco, y si dijere que no le conozco, sería mentiroso como vosotros; pero le conozco, y guardo su palabra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 56, NULL, 'Abraham vuestro padre se gozó de que había de ver mi día; y lo vio, y se gozó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 57, NULL, 'Entonces le dijeron los judíos: Aún no tienes cincuenta años, ¿y has visto a Abraham?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 58, NULL, 'Jesús les dijo: De cierto, de cierto os digo: Antes que Abraham fuese, yo soy.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 8, 59, NULL, 'Tomaron entonces piedras para arrojárselas; pero Jesús se escondió y salió del templo; y atravesando por en medio de ellos, se fue.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 1, 'Jesús sana a un ciego de nacimiento', 'Al pasar Jesús, vio a un hombre ciego de nacimiento.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 2, NULL, 'Y le preguntaron sus discípulos, diciendo: Rabí, ¿quién pecó, este o sus padres, para que haya nacido ciego?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 3, NULL, 'Respondió Jesús: No es que pecó este, ni sus padres, sino para que las obras de Dios se manifiesten en él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 4, NULL, 'Me es necesario hacer las obras del que me envió, entre tanto que el día dura; la noche viene, cuando nadie puede trabajar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 5, NULL, 'Entre tanto que estoy en el mundo, luz soy del mundo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 6, NULL, 'Dicho esto, escupió en tierra, e hizo lodo con la saliva, y untó con el lodo los ojos del ciego,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 7, NULL, 'y le dijo: Ve a lavarte en el estanque de Siloé (que traducido es, Enviado). Fue entonces, y se lavó, y regresó viendo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 8, NULL, 'Entonces los vecinos, y los que antes le habían visto que era ciego, decían: ¿No es este el que se sentaba y mendigaba?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 9, NULL, 'Unos decían: Él es; y otros: A él se parece. Él decía: Yo soy.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 10, NULL, 'Y le dijeron: ¿Cómo te fueron abiertos los ojos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 11, NULL, 'Respondió él y dijo: Aquel hombre que se llama Jesús hizo lodo, me untó los ojos, y me dijo: Ve al Siloé, y lávate; y fui, y me lavé, y recibí la vista.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 12, NULL, 'Entonces le dijeron: ¿Dónde está él? Él dijo: No sé.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 13, 'Los fariseos interrogan al ciego sanado', 'Llevaron ante los fariseos al que había sido ciego.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 14, NULL, 'Y era día de reposo cuando Jesús había hecho el lodo, y le había abierto los ojos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 15, NULL, 'Volvieron, pues, a preguntarle también los fariseos cómo había recibido la vista. Él les dijo: Me puso lodo sobre los ojos, y me lavé, y veo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 16, NULL, 'Entonces algunos de los fariseos decían: Ese hombre no procede de Dios, porque no guarda el día de reposo. Otros decían: ¿Cómo puede un hombre pecador hacer estas señales? Y había disensión entre ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 17, NULL, 'Entonces volvieron a decirle al ciego: ¿Qué dices tú del que te abrió los ojos? Y él dijo: Que es profeta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 18, NULL, 'Pero los judíos no creían que él había sido ciego, y que había recibido la vista, hasta que llamaron a los padres del que había recibido la vista,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 19, NULL, 'y les preguntaron, diciendo: ¿Es este vuestro hijo, el que vosotros decís que nació ciego? ¿Cómo, pues, ve ahora?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 20, NULL, 'Sus padres respondieron y les dijeron: Sabemos que este es nuestro hijo, y que nació ciego;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 21, NULL, 'pero cómo vea ahora, no lo sabemos; o quién le haya abierto los ojos, nosotros tampoco lo sabemos; edad tiene, preguntadle a él; él hablará por sí mismo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 22, NULL, 'Esto dijeron sus padres, porque tenían miedo de los judíos, por cuanto los judíos ya habían acordado que si alguno confesase que Jesús era el Mesías, fuera expulsado de la sinagoga.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 23, NULL, 'Por eso dijeron sus padres: Edad tiene, preguntadle a él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 24, NULL, 'Entonces volvieron a llamar al hombre que había sido ciego, y le dijeron: Da gloria a Dios; nosotros sabemos que ese hombre es pecador.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 25, NULL, 'Entonces él respondió y dijo: Si es pecador, no lo sé; una cosa sé, que habiendo yo sido ciego, ahora veo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 26, NULL, 'Le volvieron a decir: ¿Qué te hizo? ¿Cómo te abrió los ojos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 27, NULL, 'Él les respondió: Ya os lo he dicho, y no habéis querido oír; ¿por qué lo queréis oír otra vez? ¿Queréis también vosotros haceros sus discípulos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 28, NULL, 'Y le injuriaron, y dijeron: Tú eres su discípulo; pero nosotros, discípulos de Moisés somos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 29, NULL, 'Nosotros sabemos que Dios ha hablado a Moisés; pero respecto a ese, no sabemos de dónde sea.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 30, NULL, 'Respondió el hombre, y les dijo: Pues esto es lo maravilloso, que vosotros no sepáis de dónde sea, y a mí me abrió los ojos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 31, NULL, 'Y sabemos que Dios no oye a los pecadores; pero si alguno es temeroso de Dios, y hace su voluntad, a ese oye.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 32, NULL, 'Desde el principio no se ha oído decir que alguno abriese los ojos a uno que nació ciego.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 33, NULL, 'Si este no viniera de Dios, nada podría hacer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 34, NULL, 'Respondieron y le dijeron: Tú naciste del todo en pecado, ¿y nos enseñas a nosotros? Y le expulsaron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 35, 'Ceguera espiritual', 'Oyó Jesús que le habían expulsado; y hallándole, le dijo: ¿Crees tú en el Hijo de Dios?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 36, NULL, 'Respondió él y dijo: ¿Quién es, Señor, para que crea en él?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 37, NULL, 'Le dijo Jesús: Pues le has visto, y el que habla contigo, él es.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 38, NULL, 'Y él dijo: Creo, Señor; y le adoró.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 39, NULL, 'Dijo Jesús: Para juicio he venido yo a este mundo; para que los que no ven, vean, y los que ven, sean cegados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 40, NULL, 'Entonces algunos de los fariseos que estaban con él, al oír esto, le dijeron: ¿Acaso nosotros somos también ciegos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 9, 41, NULL, 'Jesús les respondió: Si fuerais ciegos, no tendríais pecado; mas ahora, porque decís: Vemos, vuestro pecado permanece.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 1, 'Parábola del redil', 'De cierto, de cierto os digo: El que no entra por la puerta en el redil de las ovejas, sino que sube por otra parte, ese es ladrón y salteador.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 2, NULL, 'Mas el que entra por la puerta, el pastor de las ovejas es.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 3, NULL, 'A este abre el portero, y las ovejas oyen su voz; y a sus ovejas llama por nombre, y las saca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 4, NULL, 'Y cuando ha sacado fuera todas las propias, va delante de ellas; y las ovejas le siguen, porque conocen su voz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 5, NULL, 'Mas al extraño no seguirán, sino huirán de él, porque no conocen la voz de los extraños.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 6, NULL, 'Esta alegoría les dijo Jesús; pero ellos no entendieron qué era lo que les decía.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 7, 'Jesús, el buen pastor', 'Volvió, pues, Jesús a decirles: De cierto, de cierto os digo: Yo soy la puerta de las ovejas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 8, NULL, 'Todos los que antes de mí vinieron, ladrones son y salteadores; pero no los oyeron las ovejas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 9, NULL, 'Yo soy la puerta; el que por mí entrare, será salvo; y entrará, y saldrá, y hallará pastos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 10, NULL, 'El ladrón no viene sino para hurtar y matar y destruir; yo he venido para que tengan vida, y para que la tengan en abundancia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 11, NULL, 'Yo soy el buen pastor; el buen pastor su vida da por las ovejas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 12, NULL, 'Mas el asalariado, y que no es el pastor, de quien no son propias las ovejas, ve venir al lobo y deja las ovejas y huye, y el lobo arrebata las ovejas y las dispersa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 13, NULL, 'Así que el asalariado huye, porque es asalariado, y no le importan las ovejas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 14, NULL, 'Yo soy el buen pastor; y conozco mis ovejas, y las mías me conocen,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 15, NULL, 'así como el Padre me conoce, y yo conozco al Padre; y pongo mi vida por las ovejas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 16, NULL, 'También tengo otras ovejas que no son de este redil; aquellas también debo traer, y oirán mi voz; y habrá un rebaño, y un pastor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 17, NULL, 'Por eso me ama el Padre, porque yo pongo mi vida, para volverla a tomar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 18, NULL, 'Nadie me la quita, sino que yo de mí mismo la pongo. Tengo poder para ponerla, y tengo poder para volverla a tomar. Este mandamiento recibí de mi Padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 19, NULL, 'Volvió a haber disensión entre los judíos por estas palabras.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 20, NULL, 'Muchos de ellos decían: Demonio tiene, y está fuera de sí; ¿por qué le oís?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 21, NULL, 'Decían otros: Estas palabras no son de endemoniado. ¿Puede acaso el demonio abrir los ojos de los ciegos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 22, 'Los judíos rechazan a Jesús', 'Celebrábase en Jerusalén la fiesta de la dedicación. Era invierno,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 23, NULL, 'y Jesús andaba en el templo por el pórtico de Salomón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 24, NULL, 'Y le rodearon los judíos y le dijeron: ¿Hasta cuándo nos turbarás el alma? Si tú eres el Cristo, dínoslo abiertamente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 25, NULL, 'Jesús les respondió: Os lo he dicho, y no creéis; las obras que yo hago en nombre de mi Padre, ellas dan testimonio de mí;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 26, NULL, 'pero vosotros no creéis, porque no sois de mis ovejas, como os he dicho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 27, NULL, 'Mis ovejas oyen mi voz, y yo las conozco, y me siguen,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 28, NULL, 'y yo les doy vida eterna; y no perecerán jamás, ni nadie las arrebatará de mi mano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 29, NULL, 'Mi Padre que me las dio, es mayor que todos, y nadie las puede arrebatar de la mano de mi Padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 30, NULL, 'Yo y el Padre uno somos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 31, NULL, 'Entonces los judíos volvieron a tomar piedras para apedrearle.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 32, NULL, 'Jesús les respondió: Muchas buenas obras os he mostrado de mi Padre; ¿por cuál de ellas me apedreáis?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 33, NULL, 'Le respondieron los judíos, diciendo: Por buena obra no te apedreamos, sino por la blasfemia; porque tú, siendo hombre, te haces Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 34, NULL, 'Jesús les respondió: ¿No está escrito en vuestra ley: Yo dije, dioses sois?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 35, NULL, 'Si llamó dioses a aquellos a quienes vino la palabra de Dios (y la Escritura no puede ser quebrantada),', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 36, NULL, '¿al que el Padre santificó y envió al mundo, vosotros decís: Tú blasfemas, porque dije: Hijo de Dios soy?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 37, NULL, 'Si no hago las obras de mi Padre, no me creáis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 38, NULL, 'Mas si las hago, aunque no me creáis a mí, creed a las obras, para que conozcáis y creáis que el Padre está en mí, y yo en el Padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 39, NULL, 'Procuraron otra vez prenderle, pero él se escapó de sus manos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 40, NULL, 'Y se fue de nuevo al otro lado del Jordán, al lugar donde primero había estado bautizando Juan; y se quedó allí.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 41, NULL, 'Y muchos venían a él, y decían: Juan, a la verdad, ninguna señal hizo; pero todo lo que Juan dijo de este, era verdad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 10, 42, NULL, 'Y muchos creyeron en él allí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 1, 'Muerte de Lázaro', 'Estaba entonces enfermo uno llamado Lázaro, de Betania, la aldea de María y de Marta su hermana.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 2, NULL, '(María, cuyo hermano Lázaro estaba enfermo, fue la que ungió al Señor con perfume, y le enjugó los pies con sus cabellos.)', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 3, NULL, 'Enviaron, pues, las hermanas para decir a Jesús: Señor, he aquí el que amas está enfermo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 4, NULL, 'Oyéndolo Jesús, dijo: Esta enfermedad no es para muerte, sino para la gloria de Dios, para que el Hijo de Dios sea glorificado por ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 5, NULL, 'Y amaba Jesús a Marta, a su hermana y a Lázaro.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 6, NULL, 'Cuando oyó, pues, que estaba enfermo, se quedó dos días más en el lugar donde estaba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 7, NULL, 'Luego, después de esto, dijo a los discípulos: Vamos a Judea otra vez.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 8, NULL, 'Le dijeron los discípulos: Rabí, ahora procuraban los judíos apedrearte, ¿y otra vez vas allá?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 9, NULL, 'Respondió Jesús: ¿No tiene el día doce horas? El que anda de día, no tropieza, porque ve la luz de este mundo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 10, NULL, 'pero el que anda de noche, tropieza, porque no hay luz en él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 11, NULL, 'Dicho esto, les dijo después: Nuestro amigo Lázaro duerme; mas voy para despertarle.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 12, NULL, 'Dijeron entonces sus discípulos: Señor, si duerme, sanará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 13, NULL, 'Pero Jesús decía esto de la muerte de Lázaro; y ellos pensaron que hablaba del reposar del sueño.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 14, NULL, 'Entonces Jesús les dijo claramente: Lázaro ha muerto;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 15, NULL, 'y me alegro por vosotros, de no haber estado allí, para que creáis; mas vamos a él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 16, NULL, 'Dijo entonces Tomás, llamado Dídimo, a sus condiscípulos: Vamos también nosotros, para que muramos con él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 17, 'Jesús, la resurrección y la vida', 'Vino, pues, Jesús, y halló que hacía ya cuatro días que Lázaro estaba en el sepulcro.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 18, NULL, 'Betania estaba cerca de Jerusalén, como a quince estadios;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 19, NULL, 'y muchos de los judíos habían venido a Marta y a María, para consolarlas por su hermano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 20, NULL, 'Entonces Marta, cuando oyó que Jesús venía, salió a encontrarle; pero María se quedó en casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 21, NULL, 'Y Marta dijo a Jesús: Señor, si hubieses estado aquí, mi hermano no habría muerto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 22, NULL, 'Mas también sé ahora que todo lo que pidas a Dios, Dios te lo dará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 23, NULL, 'Jesús le dijo: Tu hermano resucitará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 24, NULL, 'Marta le dijo: Yo sé que resucitará en la resurrección, en el día postrero.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 25, NULL, 'Le dijo Jesús: Yo soy la resurrección y la vida; el que cree en mí, aunque esté muerto, vivirá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 26, NULL, 'Y todo aquel que vive y cree en mí, no morirá eternamente. ¿Crees esto?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 27, NULL, 'Le dijo: Sí, Señor; yo he creído que tú eres el Cristo, el Hijo de Dios, que has venido al mundo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 28, 'Jesús llora ante la tumba de Lázaro', 'Habiendo dicho esto, fue y llamó a María su hermana, diciéndole en secreto: El Maestro está aquí y te llama.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 29, NULL, 'Ella, cuando lo oyó, se levantó de prisa y vino a él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 30, NULL, 'Jesús todavía no había entrado en la aldea, sino que estaba en el lugar donde Marta le había encontrado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 31, NULL, 'Entonces los judíos que estaban en casa con ella y la consolaban, cuando vieron que María se había levantado de prisa y había salido, la siguieron, diciendo: Va al sepulcro a llorar allí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 32, NULL, 'María, cuando llegó a donde estaba Jesús, al verle, se postró a sus pies, diciéndole: Señor, si hubieses estado aquí, no habría muerto mi hermano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 33, NULL, 'Jesús entonces, al verla llorando, y a los judíos que la acompañaban, también llorando, se estremeció en espíritu y se conmovió,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 34, NULL, 'y dijo: ¿Dónde le pusisteis? Le dijeron: Señor, ven y ve.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 35, NULL, 'Jesús lloró.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 36, NULL, 'Dijeron entonces los judíos: Mirad cómo le amaba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 37, NULL, 'Y algunos de ellos dijeron: ¿No podía este, que abrió los ojos al ciego, haber hecho también que Lázaro no muriera?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 38, 'Resurrección de Lázaro', 'Jesús, profundamente conmovido otra vez, vino al sepulcro. Era una cueva, y tenía una piedra puesta encima.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 39, NULL, 'Dijo Jesús: Quitad la piedra. Marta, la hermana del que había muerto, le dijo: Señor, hiede ya, porque es de cuatro días.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 40, NULL, 'Jesús le dijo: ¿No te he dicho que si crees, verás la gloria de Dios?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 41, NULL, 'Entonces quitaron la piedra de donde había sido puesto el muerto. Y Jesús, alzando los ojos a lo alto, dijo: Padre, gracias te doy por haberme oído.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 42, NULL, 'Yo sabía que siempre me oyes; pero lo dije por causa de la multitud que está alrededor, para que crean que tú me has enviado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 43, NULL, 'Y habiendo dicho esto, clamó a gran voz: ¡Lázaro, ven fuera!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 44, NULL, 'Y el que había muerto salió, atadas las manos y los pies con vendas, y el rostro envuelto en un sudario. Jesús les dijo: Desatadle, y dejadle ir.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 45, 'El complot para matar a Jesús', 'Entonces muchos de los judíos que habían venido para acompañar a María, y vieron lo que hizo Jesús, creyeron en él.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 46, NULL, 'Pero algunos de ellos fueron a los fariseos y les dijeron lo que Jesús había hecho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 47, NULL, 'Entonces los principales sacerdotes y los fariseos reunieron el concilio, y dijeron: ¿Qué haremos? Porque este hombre hace muchas señales.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 48, NULL, 'Si le dejamos así, todos creerán en él; y vendrán los romanos, y destruirán nuestro lugar santo y nuestra nación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 49, NULL, 'Entonces Caifás, uno de ellos, sumo sacerdote aquel año, les dijo: Vosotros no sabéis nada;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 50, NULL, 'ni pensáis que nos conviene que un hombre muera por el pueblo, y no que toda la nación perezca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 51, NULL, 'Esto no lo dijo por sí mismo, sino que como era el sumo sacerdote aquel año, profetizó que Jesús había de morir por la nación;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 52, NULL, 'y no solamente por la nación, sino también para congregar en uno a los hijos de Dios que estaban dispersos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 53, NULL, 'Así que, desde aquel día acordaron matarle.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 54, NULL, 'Por tanto, Jesús ya no andaba abiertamente entre los judíos, sino que se alejó de allí a la región contigua al desierto, a una ciudad llamada Efraín; y se quedó allí con sus discípulos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 55, NULL, 'Y estaba cerca la pascua de los judíos; y muchos subieron de aquella región a Jerusalén antes de la pascua, para purificarse.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 56, NULL, 'Y buscaban a Jesús, y estando ellos en el templo, se preguntaban unos a otros: ¿Qué os parece? ¿No vendrá a la fiesta?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 11, 57, NULL, 'Y los principales sacerdotes y los fariseos habían dado orden de que si alguno supiese dónde estaba, lo manifestase, para que le prendiesen.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 1, 'Jesús es ungido en Betania', 'Seis días antes de la pascua, vino Jesús a Betania, donde estaba Lázaro, el que había estado muerto, y a quien había resucitado de los muertos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 2, NULL, 'Y le hicieron allí una cena; Marta servía, y Lázaro era uno de los que estaban sentados a la mesa con él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 3, NULL, 'Entonces María tomó una libra de perfume de nardo puro, de mucho precio, y ungió los pies de Jesús, y los enjugó con sus cabellos; y la casa se llenó del olor del perfume.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 4, NULL, 'Y dijo uno de sus discípulos, Judas Iscariote hijo de Simón, el que le había de entregar:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 5, NULL, '¿Por qué no fue este perfume vendido por trescientos denarios, y dado a los pobres?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 6, NULL, 'Pero dijo esto, no porque se cuidara de los pobres, sino porque era ladrón, y teniendo la bolsa, sustraía de lo que se echaba en ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 7, NULL, 'Entonces Jesús dijo: Déjala; para el día de mi sepultura ha guardado esto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 8, NULL, 'Porque a los pobres siempre los tendréis con vosotros, mas a mí no siempre me tendréis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 9, 'El complot contra Lázaro', 'Gran multitud de los judíos supieron entonces que él estaba allí, y vinieron, no solamente por causa de Jesús, sino también para ver a Lázaro, a quien había resucitado de los muertos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 10, NULL, 'Pero los principales sacerdotes acordaron dar muerte también a Lázaro,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 11, NULL, 'porque a causa de él muchos de los judíos se apartaban y creían en Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 12, 'La entrada triunfal en Jerusalén', 'El siguiente día, grandes multitudes que habían venido a la fiesta, al oír que Jesús venía a Jerusalén,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 13, NULL, 'tomaron ramas de palmera y salieron a recibirle, y clamaban: ¡Hosanna! ¡Bendito el que viene en el nombre del Señor, el Rey de Israel!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 14, NULL, 'Y halló Jesús un asnillo, y montó sobre él, como está escrito:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 15, NULL, 'No temas, hija de Sion; He aquí tu Rey viene, Montado sobre un pollino de asna.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 16, NULL, 'Estas cosas no las entendieron sus discípulos al principio; pero cuando Jesús fue glorificado, entonces se acordaron de que estas cosas estaban escritas acerca de él, y de que se las habían hecho.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 17, NULL, 'Y daba testimonio la gente que estaba con él cuando llamó a Lázaro del sepulcro, y le resucitó de los muertos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 18, NULL, 'Por lo cual también había venido la gente a recibirle, porque había oído que él había hecho esta señal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 19, NULL, 'Pero los fariseos dijeron entre sí: Ya veis que no conseguís nada. Mirad, el mundo se va tras él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 20, 'Unos griegos buscan a Jesús', 'Había ciertos griegos entre los que habían subido a adorar en la fiesta.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 21, NULL, 'Estos, pues, se acercaron a Felipe, que era de Betsaida de Galilea, y le rogaron, diciendo: Señor, quisiéramos ver a Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 22, NULL, 'Felipe fue y se lo dijo a Andrés; entonces Andrés y Felipe se lo dijeron a Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 23, NULL, 'Jesús les respondió diciendo: Ha llegado la hora para que el Hijo del Hombre sea glorificado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 24, NULL, 'De cierto, de cierto os digo, que si el grano de trigo no cae en la tierra y muere, queda solo; pero si muere, lleva mucho fruto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 25, NULL, 'El que ama su vida, la perderá; y el que aborrece su vida en este mundo, para vida eterna la guardará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 26, NULL, 'Si alguno me sirve, sígame; y donde yo estuviere, allí también estará mi servidor. Si alguno me sirviere, mi Padre le honrará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 27, 'Jesús anuncia su muerte', 'Ahora está turbada mi alma; ¿y qué diré? ¿Padre, sálvame de esta hora? Mas para esto he llegado a esta hora.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 28, NULL, 'Padre, glorifica tu nombre. Entonces vino una voz del cielo: Lo he glorificado, y lo glorificaré otra vez.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 29, NULL, 'Y la multitud que estaba allí, y había oído la voz, decía que había sido un trueno. Otros decían: Un ángel le ha hablado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 30, NULL, 'Respondió Jesús y dijo: No ha venido esta voz por causa mía, sino por causa de vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 31, NULL, 'Ahora es el juicio de este mundo; ahora el príncipe de este mundo será echado fuera.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 32, NULL, 'Y yo, si fuere levantado de la tierra, a todos atraeré a mí mismo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 33, NULL, 'Y decía esto dando a entender de qué muerte iba a morir.', 0, 'spa', 'RVR1960', NULL);\n"
;

  public static final String SQL_PARTE_3 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Jn', 12, 34, NULL, 'Le respondió la gente: Nosotros hemos oído de la ley, que el Cristo permanece para siempre. ¿Cómo, pues, dices tú que es necesario que el Hijo del Hombre sea levantado? ¿Quién es este Hijo del Hombre?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 35, NULL, 'Entonces Jesús les dijo: Aún por un poco está la luz entre vosotros; andad entre tanto que tenéis luz, para que no os sorprendan las tinieblas; porque el que anda en tinieblas, no sabe a dónde va.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 36, NULL, 'Entre tanto que tenéis la luz, creed en la luz, para que seáis hijos de luz. Estas cosas habló Jesús, y se fue y se ocultó de ellos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 37, 'Incredulidad de los judíos', 'Pero a pesar de que había hecho tantas señales delante de ellos, no creían en él;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 38, NULL, 'para que se cumpliese la palabra del profeta Isaías, que dijo: Señor, ¿quién ha creído a nuestro anuncio? ¿Y a quién se ha revelado el brazo del Señor?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 39, NULL, 'Por esto no podían creer, porque también dijo Isaías:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 40, NULL, 'Cegó los ojos de ellos, y endureció su corazón; Para que no vean con los ojos, y entiendan con el corazón, Y se conviertan, y yo los sane.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 41, NULL, 'Isaías dijo esto cuando vio su gloria, y habló acerca de él.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 42, NULL, 'Con todo eso, aun de los gobernantes, muchos creyeron en él; pero a causa de los fariseos no lo confesaban, para no ser expulsados de la sinagoga.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 43, NULL, 'Porque amaban más la gloria de los hombres que la gloria de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 44, 'Las palabras de Jesús juzgarán a los hombres', 'Jesús clamó y dijo: El que cree en mí, no cree en mí, sino en el que me envió;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 45, NULL, 'y el que me ve, ve al que me envió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 46, NULL, 'Yo, la luz, he venido al mundo, para que todo aquel que cree en mí no permanezca en tinieblas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 47, NULL, 'Al que oye mis palabras, y no las guarda, yo no le juzgo; porque no he venido a juzgar al mundo, sino a salvar al mundo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 48, NULL, 'El que me rechaza, y no recibe mis palabras, tiene quien le juzgue; la palabra que he hablado, ella le juzgará en el día postrero.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 49, NULL, 'Porque yo no he hablado por mi propia cuenta; el Padre que me envió, él me dio mandamiento de lo que he de decir, y de lo que he de hablar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 12, 50, NULL, 'Y sé que su mandamiento es vida eterna. Así pues, lo que yo hablo, lo hablo como el Padre me lo ha dicho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 13, 1, 'Jesús lava los pies de sus discípulos', 'Antes de la fiesta de la pascua, sabiendo Jesús que su hora había llegado para que pasase de este mundo al Padre, como había amado a los suyos que estaban en el mundo, los amó hasta el fin.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 13, 2, NULL, 'Y cuando cenaban, como el diablo ya había puesto en el corazón de Judas Iscariote, hijo de Simón, que le entregase,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 13, 3, NULL, 'sabiendo Jesús que el Padre le había dado todas las cosas en las manos, y que había salido de Dios, y a Dios iba,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 13, 4, NULL, 'se levantó de la cena, y se quitó su manto, y tomando una toalla, se la ciñó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 13, 5, NULL, 'Luego puso agua en un lebrillo, y comenzó a lavar los pies de los discípulos, y a enjugarlos con la toalla con que estaba ceñido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 13, 6, NULL, 'Entonces vino a Simón Pedro; y Pedro le dijo: Señor, ¿tú me lavas los pies?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 13, 7, NULL, 'Respondió Jesús y le dijo: Lo que yo hago, tú no lo comprendes ahora; mas lo entenderás después.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 13, 8, NULL, 'Pedro le dijo: No me lavarás los pies jamás. Jesús le respondió: Si no te lavare, no tendrás parte conmigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 13, 9, NULL, 'Le dijo Simón Pedro: Señor, no solo mis pies, sino también las manos y la cabeza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 13, 10, NULL, 'Jesús le dijo: El que está lavado, no necesita sino lavarse los pies, pues está todo limpio; y vosotros limpios estáis, aunque no todos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 13, 11, NULL, 'Porque sabía quién le iba a entregar; por eso dijo: No estáis limpios todos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 13, 12, NULL, 'Así que, después que les hubo lavado los pies, tomó su manto, volvió a la mesa, y les dijo: ¿Sabéis lo que os he hecho?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 13, 13, NULL, 'Vosotros me llamáis Maestro, y Señor; y decís bien, porque lo soy.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 13, 14, NULL, 'Pues si yo, el Señor y el Maestro, he lavado vuestros pies, vosotros también debéis lavaros los pies los unos a los otros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 13, 15, NULL, 'Porque ejemplo os he dado, para que como yo os he hecho, vosotros también hagáis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 13, 16, NULL, 'De cierto, de cierto os digo: El siervo no es mayor que su señor, ni el enviado es mayor que el que le envió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 13, 17, NULL, 'Si sabéis estas cosas, bienaventurados seréis si las hiciereis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 13, 18, NULL, 'No hablo de todos vosotros; yo sé a quienes he elegido; mas para que se cumpla la Escritura: El que come pan conmigo, levantó contra mí su calcañar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 13, 19, NULL, 'Desde ahora os lo digo antes que suceda, para que cuando suceda, creáis que yo soy.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 13, 20, NULL, 'De cierto, de cierto os digo: El que recibe al que yo enviare, me recibe a mí; y el que me recibe a mí, recibe al que me envió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 13, 21, 'Jesús anuncia la traición de Judas', 'Habiendo dicho Jesús esto, se conmovió en espíritu, y declaró y dijo: De cierto, de cierto os digo, que uno de vosotros me va a entregar.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 13, 22, NULL, 'Entonces los discípulos se miraban unos a otros, dudando de quién hablaba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 13, 23, NULL, 'Y uno de sus discípulos, al cual Jesús amaba, estaba recostado al lado de Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 13, 24, NULL, 'A este, pues, hizo señas Simón Pedro, para que preguntase quién era aquel de quien hablaba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 13, 25, NULL, 'Él entonces, recostado cerca del pecho de Jesús, le dijo: Señor, ¿quién es?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 13, 26, NULL, 'Respondió Jesús: A quien yo diere el pan mojado, aquel es. Y mojando el pan, lo dio a Judas Iscariote hijo de Simón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 13, 27, NULL, 'Y después del bocado, Satanás entró en él. Entonces Jesús le dijo: Lo que vas a hacer, hazlo más pronto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 13, 28, NULL, 'Pero ninguno de los que estaban a la mesa entendió por qué le dijo esto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 13, 29, NULL, 'Porque algunos pensaban, puesto que Judas tenía la bolsa, que Jesús le decía: Compra lo que necesitamos para la fiesta; o que diese algo a los pobres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 13, 30, NULL, 'Cuando él, pues, hubo tomado el bocado, luego salió; y era ya de noche.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 13, 31, 'El nuevo mandamiento', 'Entonces, cuando hubo salido, dijo Jesús: Ahora es glorificado el Hijo del Hombre, y Dios es glorificado en él.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 13, 32, NULL, 'Si Dios es glorificado en él, Dios también le glorificará en sí mismo, y en seguida le glorificará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 13, 33, NULL, 'Hijitos, aún estaré con vosotros un poco. Me buscaréis; pero como dije a los judíos, así os digo ahora a vosotros: A donde yo voy, vosotros no podéis ir.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 13, 34, NULL, 'Un mandamiento nuevo os doy: Que os améis unos a otros; como yo os he amado, que también os améis unos a otros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 13, 35, NULL, 'En esto conocerán todos que sois mis discípulos, si tuviereis amor los unos con los otros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 13, 36, 'Jesús anuncia la negación de Pedro', 'Le dijo Simón Pedro: Señor, ¿a dónde vas? Jesús le respondió: A donde yo voy, no me puedes seguir ahora; mas me seguirás después.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 13, 37, NULL, 'Le dijo Pedro: Señor, ¿por qué no te puedo seguir ahora? Mi vida pondré por ti.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 13, 38, NULL, 'Jesús le respondió: ¿Tu vida pondrás por mí? De cierto, de cierto te digo: No cantará el gallo, sin que me hayas negado tres veces.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 14, 1, 'Jesús, el camino al Padre', 'No se turbe vuestro corazón; creéis en Dios, creed también en mí.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 14, 2, NULL, 'En la casa de mi Padre muchas moradas hay; si así no fuera, yo os lo hubiera dicho; voy, pues, a preparar lugar para vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 14, 3, NULL, 'Y si me fuere y os preparare lugar, vendré otra vez, y os tomaré a mí mismo, para que donde yo estoy, vosotros también estéis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 14, 4, NULL, 'Y sabéis a dónde voy, y sabéis el camino.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 14, 5, NULL, 'Le dijo Tomás: Señor, no sabemos a dónde vas; ¿cómo, pues, podemos saber el camino?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 14, 6, NULL, 'Jesús le dijo: Yo soy el camino, y la verdad, y la vida; nadie viene al Padre, sino por mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 14, 7, NULL, 'Si me conocieseis, también a mi Padre conoceríais; y desde ahora le conocéis, y le habéis visto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 14, 8, NULL, 'Felipe le dijo: Señor, muéstranos el Padre, y nos basta.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 14, 9, NULL, 'Jesús le dijo: ¿Tanto tiempo hace que estoy con vosotros, y no me has conocido, Felipe? El que me ha visto a mí, ha visto al Padre; ¿cómo, pues, dices tú: Muéstranos el Padre?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 14, 10, NULL, '¿No crees que yo soy en el Padre, y el Padre en mí? Las palabras que yo os hablo, no las hablo por mi propia cuenta, sino que el Padre que mora en mí, él hace las obras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 14, 11, NULL, 'Creedme que yo soy en el Padre, y el Padre en mí; de otra manera, creedme por las mismas obras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 14, 12, NULL, 'De cierto, de cierto os digo: El que en mí cree, las obras que yo hago, él las hará también; y aun mayores hará, porque yo voy al Padre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 14, 13, NULL, 'Y todo lo que pidiereis al Padre en mi nombre, lo haré, para que el Padre sea glorificado en el Hijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 14, 14, NULL, 'Si algo pidiereis en mi nombre, yo lo haré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 14, 15, 'La promesa del Espíritu Santo', 'Si me amáis, guardad mis mandamientos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 14, 16, NULL, 'Y yo rogaré al Padre, y os dará otro Consolador, para que esté con vosotros para siempre:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 14, 17, NULL, 'el Espíritu de verdad, al cual el mundo no puede recibir, porque no le ve, ni le conoce; pero vosotros le conocéis, porque mora con vosotros, y estará en vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 14, 18, NULL, 'No os dejaré huérfanos; vendré a vosotros.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 14, 19, NULL, 'Todavía un poco, y el mundo no me verá más; pero vosotros me veréis; porque yo vivo, vosotros también viviréis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 14, 20, NULL, 'En aquel día vosotros conoceréis que yo estoy en mi Padre, y vosotros en mí, y yo en vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 14, 21, NULL, 'El que tiene mis mandamientos, y los guarda, ese es el que me ama; y el que me ama, será amado por mi Padre, y yo le amaré, y me manifestaré a él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 14, 22, NULL, 'Le dijo Judas (no el Iscariote): Señor, ¿cómo es que te manifestarás a nosotros, y no al mundo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 14, 23, NULL, 'Respondió Jesús y le dijo: El que me ama, mi palabra guardará; y mi Padre le amará, y vendremos a él, y haremos morada con él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 14, 24, NULL, 'El que no me ama, no guarda mis palabras; y la palabra que habéis oído no es mía, sino del Padre que me envió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 14, 25, NULL, 'Os he dicho estas cosas estando con vosotros.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 14, 26, NULL, 'Mas el Consolador, el Espíritu Santo, a quien el Padre enviará en mi nombre, él os enseñará todas las cosas, y os recordará todo lo que yo os he dicho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 14, 27, NULL, 'La paz os dejo, mi paz os doy; yo no os la doy como el mundo la da. No se turbe vuestro corazón, ni tenga miedo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 14, 28, NULL, 'Habéis oído que yo os he dicho: Voy, y vengo a vosotros. Si me amarais, os habríais regocijado, porque he dicho que voy al Padre; porque el Padre mayor es que yo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 14, 29, NULL, 'Y ahora os lo he dicho antes que suceda, para que cuando suceda, creáis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 14, 30, NULL, 'No hablaré ya mucho con vosotros; porque viene el príncipe de este mundo, y él nada tiene en mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 14, 31, NULL, 'Mas para que el mundo conozca que amo al Padre, y como el Padre me mandó, así hago. Levantaos, vamos de aquí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 15, 1, 'Jesús, la vid verdadera', 'Yo soy la vid verdadera, y mi Padre es el labrador.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 15, 2, NULL, 'Todo pámpano que en mí no lleva fruto, lo quitará; y todo aquel que lleva fruto, lo limpiará, para que lleve más fruto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 15, 3, NULL, 'Ya vosotros estáis limpios por la palabra que os he hablado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 15, 4, NULL, 'Permaneced en mí, y yo en vosotros. Como el pámpano no puede llevar fruto por sí mismo, si no permanece en la vid, así tampoco vosotros, si no permanecéis en mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 15, 5, NULL, 'Yo soy la vid, vosotros los pámpanos; el que permanece en mí, y yo en él, este lleva mucho fruto; porque separados de mí nada podéis hacer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 15, 6, NULL, 'El que en mí no permanece, será echado fuera como pámpano, y se secará; y los recogen, y los echan en el fuego, y arden.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 15, 7, NULL, 'Si permanecéis en mí, y mis palabras permanecen en vosotros, pedid todo lo que queréis, y os será hecho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 15, 8, NULL, 'En esto es glorificado mi Padre, en que llevéis mucho fruto, y seáis así mis discípulos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 15, 9, NULL, 'Como el Padre me ha amado, así también yo os he amado; permaneced en mi amor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 15, 10, NULL, 'Si guardareis mis mandamientos, permaneceréis en mi amor; así como yo he guardado los mandamientos de mi Padre, y permanezco en su amor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 15, 11, NULL, 'Estas cosas os he hablado, para que mi gozo esté en vosotros, y vuestro gozo sea cumplido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 15, 12, NULL, 'Este es mi mandamiento: Que os améis unos a otros, como yo os he amado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 15, 13, NULL, 'Nadie tiene mayor amor que este, que uno ponga su vida por sus amigos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 15, 14, NULL, 'Vosotros sois mis amigos, si hacéis lo que yo os mando.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 15, 15, NULL, 'Ya no os llamaré siervos, porque el siervo no sabe lo que hace su señor; pero os he llamado amigos, porque todas las cosas que oí de mi Padre, os las he dado a conocer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 15, 16, NULL, 'No me elegisteis vosotros a mí, sino que yo os elegí a vosotros, y os he puesto para que vayáis y llevéis fruto, y vuestro fruto permanezca; para que todo lo que pidiereis al Padre en mi nombre, él os lo dé.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 15, 17, NULL, 'Esto os mando: Que os améis unos a otros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 15, 18, 'El mundo os aborrecerá', 'Si el mundo os aborrece, sabed que a mí me ha aborrecido antes que a vosotros.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 15, 19, NULL, 'Si fuerais del mundo, el mundo amaría lo suyo; pero porque no sois del mundo, antes yo os elegí del mundo, por eso el mundo os aborrece.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 15, 20, NULL, 'Acordaos de la palabra que yo os he dicho: El siervo no es mayor que su señor. Si a mí me han perseguido, también a vosotros os perseguirán; si han guardado mi palabra, también guardarán la vuestra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 15, 21, NULL, 'Mas todo esto os harán por causa de mi nombre, porque no conocen al que me ha enviado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 15, 22, NULL, 'Si yo no hubiera venido, ni les hubiera hablado, no tendrían pecado; pero ahora no tienen excusa por su pecado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 15, 23, NULL, 'El que me aborrece a mí, también a mi Padre aborrece.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 15, 24, NULL, 'Si yo no hubiese hecho entre ellos obras que ningún otro ha hecho, no tendrían pecado; pero ahora han visto y han aborrecido a mí y a mi Padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 15, 25, NULL, 'Pero esto es para que se cumpla la palabra que está escrita en su ley: Sin causa me aborrecieron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 15, 26, NULL, 'Pero cuando venga el Consolador, a quien yo os enviaré del Padre, el Espíritu de verdad, el cual procede del Padre, él dará testimonio acerca de mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 15, 27, NULL, 'Y vosotros daréis testimonio también, porque habéis estado conmigo desde el principio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 16, 1, NULL, 'Estas cosas os he hablado, para que no tengáis tropiezo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 16, 2, NULL, 'Os expulsarán de las sinagogas; y aun viene la hora cuando cualquiera que os mate, pensará que rinde servicio a Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 16, 3, NULL, 'Y harán esto porque no conocen al Padre ni a mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 16, 4, NULL, 'Mas os he dicho estas cosas, para que cuando llegue la hora, os acordéis de que ya os lo había dicho. Esto no os lo dije al principio, porque yo estaba con vosotros.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 16, 5, 'La obra del Espíritu Santo', 'Pero ahora voy al que me envió; y ninguno de vosotros me pregunta: ¿A dónde vas?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 16, 6, NULL, 'Antes, porque os he dicho estas cosas, tristeza ha llenado vuestro corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 16, 7, NULL, 'Pero yo os digo la verdad: Os conviene que yo me vaya; porque si no me fuera, el Consolador no vendría a vosotros; mas si me fuere, os lo enviaré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 16, 8, NULL, 'Y cuando él venga, convencerá al mundo de pecado, de justicia y de juicio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 16, 9, NULL, 'De pecado, por cuanto no creen en mí;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 16, 10, NULL, 'de justicia, por cuanto voy al Padre, y no me veréis más;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 16, 11, NULL, 'y de juicio, por cuanto el príncipe de este mundo ha sido ya juzgado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 16, 12, NULL, 'Aún tengo muchas cosas que deciros, pero ahora no las podéis sobrellevar.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 16, 13, NULL, 'Pero cuando venga el Espíritu de verdad, él os guiará a toda la verdad; porque no hablará por su propia cuenta, sino que hablará todo lo que oyere, y os hará saber las cosas que habrán de venir.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 16, 14, NULL, 'Él me glorificará; porque tomará de lo mío, y os lo hará saber.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 16, 15, NULL, 'Todo lo que tiene el Padre es mío; por eso dije que tomará de lo mío, y os lo hará saber.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 16, 16, 'La tristeza se convertirá en gozo', 'Todavía un poco, y no me veréis; y de nuevo un poco, y me veréis; porque yo voy al Padre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 16, 17, NULL, 'Entonces se dijeron algunos de sus discípulos unos a otros: ¿Qué es esto que nos dice: Todavía un poco y no me veréis; y de nuevo un poco, y me veréis; y, porque yo voy al Padre?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 16, 18, NULL, 'Decían, pues: ¿Qué quiere decir con: Todavía un poco? No entendemos lo que habla.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 16, 19, NULL, 'Jesús conoció que querían preguntarle, y les dijo: ¿Preguntáis entre vosotros acerca de esto que dije: Todavía un poco y no me veréis, y de nuevo un poco y me veréis?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 16, 20, NULL, 'De cierto, de cierto os digo, que vosotros lloraréis y lamentaréis, y el mundo se alegrará; pero aunque vosotros estéis tristes, vuestra tristeza se convertirá en gozo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 16, 21, NULL, 'La mujer cuando da a luz, tiene dolor, porque ha llegado su hora; pero después que ha dado a luz un niño, ya no se acuerda de la angustia, por el gozo de que haya nacido un hombre en el mundo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 16, 22, NULL, 'También vosotros ahora tenéis tristeza; pero os volveré a ver, y se gozará vuestro corazón, y nadie os quitará vuestro gozo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 16, 23, NULL, 'En aquel día no me preguntaréis nada. De cierto, de cierto os digo, que todo cuanto pidiereis al Padre en mi nombre, os lo dará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 16, 24, NULL, 'Hasta ahora nada habéis pedido en mi nombre; pedid, y recibiréis, para que vuestro gozo sea cumplido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 16, 25, 'Yo he vencido al mundo', 'Estas cosas os he hablado en alegorías; la hora viene cuando ya no os hablaré por alegorías, sino que claramente os anunciaré acerca del Padre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 16, 26, NULL, 'En aquel día pediréis en mi nombre; y no os digo que yo rogaré al Padre por vosotros,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 16, 27, NULL, 'pues el Padre mismo os ama, porque vosotros me habéis amado, y habéis creído que yo salí de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 16, 28, NULL, 'Salí del Padre, y he venido al mundo; otra vez dejo el mundo, y voy al Padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 16, 29, NULL, 'Le dijeron sus discípulos: He aquí ahora hablas claramente, y ninguna alegoría dices.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 16, 30, NULL, 'Ahora entendemos que sabes todas las cosas, y no necesitas que nadie te pregunte; por esto creemos que has salido de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 16, 31, NULL, 'Jesús les respondió: ¿Ahora creéis?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 16, 32, NULL, 'He aquí la hora viene, y ha venido ya, en que seréis esparcidos cada uno por su lado, y me dejaréis solo; mas no estoy solo, porque el Padre está conmigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 16, 33, NULL, 'Estas cosas os he hablado para que en mí tengáis paz. En el mundo tendréis aflicción; pero confiad, yo he vencido al mundo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 17, 1, 'Jesús ora por sus discípulos', 'Estas cosas habló Jesús, y levantando los ojos al cielo, dijo: Padre, la hora ha llegado; glorifica a tu Hijo, para que también tu Hijo te glorifique a ti;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 17, 2, NULL, 'como le has dado potestad sobre toda carne, para que dé vida eterna a todos los que le diste.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 17, 3, NULL, 'Y esta es la vida eterna: que te conozcan a ti, el único Dios verdadero, y a Jesucristo, a quien has enviado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 17, 4, NULL, 'Yo te he glorificado en la tierra; he acabado la obra que me diste que hiciese.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 17, 5, NULL, 'Ahora pues, Padre, glorifícame tú al lado tuyo, con aquella gloria que tuve contigo antes que el mundo fuese.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 17, 6, NULL, 'He manifestado tu nombre a los hombres que del mundo me diste; tuyos eran, y me los diste, y han guardado tu palabra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 17, 7, NULL, 'Ahora han conocido que todas las cosas que me has dado, proceden de ti;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 17, 8, NULL, 'porque las palabras que me diste, les he dado; y ellos las recibieron, y han conocido verdaderamente que salí de ti, y han creído que tú me enviaste.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 17, 9, NULL, 'Yo ruego por ellos; no ruego por el mundo, sino por los que me diste; porque tuyos son,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 17, 10, NULL, 'y todo lo mío es tuyo, y lo tuyo mío; y he sido glorificado en ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 17, 11, NULL, 'Y ya no estoy en el mundo; mas estos están en el mundo, y yo voy a ti. Padre santo, a los que me has dado, guárdalos en tu nombre, para que sean uno, así como nosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 17, 12, NULL, 'Cuando estaba con ellos en el mundo, yo los guardaba en tu nombre; a los que me diste, yo los guardé, y ninguno de ellos se perdió, sino el hijo de perdición, para que la Escritura se cumpliese.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 17, 13, NULL, 'Pero ahora voy a ti; y hablo esto en el mundo, para que tengan mi gozo cumplido en sí mismos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 17, 14, NULL, 'Yo les he dado tu palabra; y el mundo los aborreció, porque no son del mundo, como tampoco yo soy del mundo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 17, 15, NULL, 'No ruego que los quites del mundo, sino que los guardes del mal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 17, 16, NULL, 'No son del mundo, como tampoco yo soy del mundo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 17, 17, NULL, 'Santifícalos en tu verdad; tu palabra es verdad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 17, 18, NULL, 'Como tú me enviaste al mundo, así yo los he enviado al mundo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 17, 19, NULL, 'Y por ellos yo me santifico a mí mismo, para que también ellos sean santificados en la verdad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 17, 20, NULL, 'Mas no ruego solamente por estos, sino también por los que han de creer en mí por la palabra de ellos,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 17, 21, NULL, 'para que todos sean uno; como tú, oh Padre, en mí, y yo en ti, que también ellos sean uno en nosotros; para que el mundo crea que tú me enviaste.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 17, 22, NULL, 'La gloria que me diste, yo les he dado, para que sean uno, así como nosotros somos uno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 17, 23, NULL, 'Yo en ellos, y tú en mí, para que sean perfectos en unidad, para que el mundo conozca que tú me enviaste, y que los has amado a ellos como también a mí me has amado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 17, 24, NULL, 'Padre, aquellos que me has dado, quiero que donde yo estoy, también ellos estén conmigo, para que vean mi gloria que me has dado; porque me has amado desde antes de la fundación del mundo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 17, 25, NULL, 'Padre justo, el mundo no te ha conocido, pero yo te he conocido, y estos han conocido que tú me enviaste.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 17, 26, NULL, 'Y les he dado a conocer tu nombre, y lo daré a conocer aún, para que el amor con que me has amado, esté en ellos, y yo en ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 1, 'Arresto de Jesús', 'Habiendo dicho Jesús estas cosas, salió con sus discípulos al otro lado del torrente de Cedrón, donde había un huerto, en el cual entró con sus discípulos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 2, NULL, 'Y también Judas, el que le entregaba, conocía aquel lugar, porque muchas veces Jesús se había reunido allí con sus discípulos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 3, NULL, 'Judas, pues, tomando una compañía de soldados, y alguaciles de los principales sacerdotes y de los fariseos, fue allí con linternas y antorchas, y con armas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 4, NULL, 'Pero Jesús, sabiendo todas las cosas que le habían de sobrevenir, se adelantó y les dijo: ¿A quién buscáis?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 5, NULL, 'Le respondieron: A Jesús nazareno. Jesús les dijo: Yo soy. Y estaba también con ellos Judas, el que le entregaba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 6, NULL, 'Cuando les dijo: Yo soy, retrocedieron, y cayeron a tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 7, NULL, 'Volvió, pues, a preguntarles: ¿A quién buscáis? Y ellos dijeron: A Jesús nazareno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 8, NULL, 'Respondió Jesús: Os he dicho que yo soy; pues si me buscáis a mí, dejad ir a estos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 9, NULL, 'para que se cumpliese aquello que había dicho: De los que me diste, no perdí ninguno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 10, NULL, 'Entonces Simón Pedro, que tenía una espada, la desenvainó, e hirió al siervo del sumo sacerdote, y le cortó la oreja derecha. Y el siervo se llamaba Malco.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 11, NULL, 'Jesús entonces dijo a Pedro: Mete tu espada en la vaina; la copa que el Padre me ha dado, ¿no la he de beber?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 12, 'Jesús ante el sumo sacerdote', 'Entonces la compañía de soldados, el tribuno y los alguaciles de los judíos, prendieron a Jesús y le ataron,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 13, NULL, 'y le llevaron primeramente a Anás; porque era suegro de Caifás, que era sumo sacerdote aquel año.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 14, NULL, 'Era Caifás el que había dado el consejo a los judíos, de que convenía que un solo hombre muriese por el pueblo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 15, 'Pedro en el patio de Anás', 'Y seguían a Jesús Simón Pedro y otro discípulo. Y este discípulo era conocido del sumo sacerdote, y entró con Jesús al patio del sumo sacerdote;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 16, NULL, 'mas Pedro estaba fuera, a la puerta. Salió, pues, el discípulo que era conocido del sumo sacerdote, y habló a la portera, e hizo entrar a Pedro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 17, NULL, 'Entonces la criada portera dijo a Pedro: ¿No eres tú también de los discípulos de este hombre? Dijo él: No lo soy.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 18, NULL, 'Y estaban en pie los siervos y los alguaciles que habían encendido un fuego; porque hacía frío, y se calentaban; y también con ellos estaba Pedro en pie, calentándose.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 19, 'Anás interroga a Jesús', 'Y el sumo sacerdote preguntó a Jesús acerca de sus discípulos y de su doctrina.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 20, NULL, 'Jesús le respondió: Yo públicamente he hablado al mundo; siempre he enseñado en la sinagoga y en el templo, donde se reúnen todos los judíos, y nada he hablado en oculto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 21, NULL, '¿Por qué me preguntas a mí? Pregunta a los que han oído, qué les haya yo hablado; he aquí, ellos saben lo que yo he dicho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 22, NULL, 'Cuando Jesús hubo dicho esto, uno de los alguaciles, que estaba allí, le dio una bofetada, diciendo: ¿Así respondes al sumo sacerdote?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 23, NULL, 'Jesús le respondió: Si he hablado mal, testifica en qué está el mal; y si bien, ¿por qué me golpeas?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 24, NULL, 'Anás entonces le envió atado a Caifás, el sumo sacerdote.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 25, 'Pedro niega a Jesús', 'Estaba, pues, Pedro en pie, calentándose. Y le dijeron: ¿No eres tú de sus discípulos? Él negó, y dijo: No lo soy.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 26, NULL, 'Uno de los siervos del sumo sacerdote, pariente de aquel a quien Pedro había cortado la oreja, le dijo: ¿No te vi yo en el huerto con él?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 27, NULL, 'Negó Pedro otra vez; y en seguida cantó el gallo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 28, 'Jesús ante Pilato', 'Llevaron a Jesús de casa de Caifás al pretorio. Era de mañana, y ellos no entraron en el pretorio para no contaminarse, y así poder comer la pascua.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 29, NULL, 'Entonces salió Pilato a ellos, y les dijo: ¿Qué acusación traéis contra este hombre?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 30, NULL, 'Respondieron y le dijeron: Si este no fuera malhechor, no te lo habríamos entregado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 31, NULL, 'Entonces les dijo Pilato: Tomadle vosotros, y juzgadle según vuestra ley. Y los judíos le dijeron: A nosotros no nos está permitido dar muerte a nadie;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 32, NULL, 'para que se cumpliese la palabra que Jesús había dicho, dando a entender de qué muerte iba a morir.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 33, NULL, 'Entonces Pilato volvió a entrar en el pretorio, y llamó a Jesús y le dijo: ¿Eres tú el Rey de los judíos?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 34, NULL, 'Jesús le respondió: ¿Dices tú esto por ti mismo, o te lo han dicho otros de mí?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 35, NULL, 'Pilato le respondió: ¿Soy yo acaso judío? Tu nación, y los principales sacerdotes, te han entregado a mí. ¿Qué has hecho?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 36, NULL, 'Respondió Jesús: Mi reino no es de este mundo; si mi reino fuera de este mundo, mis servidores pelearían para que yo no fuera entregado a los judíos; pero mi reino no es de aquí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 37, NULL, 'Le dijo entonces Pilato: ¿Luego, eres tú rey? Respondió Jesús: Tú dices que yo soy rey. Yo para esto he nacido, y para esto he venido al mundo, para dar testimonio a la verdad. Todo aquel que es de la verdad, oye mi voz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 38, NULL, 'Le dijo Pilato: ¿Qué es la verdad? Y cuando hubo dicho esto, salió otra vez a los judíos, y les dijo: Yo no hallo en él ningún delito.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 39, NULL, 'Pero vosotros tenéis la costumbre de que os suelte uno en la pascua. ¿Queréis, pues, que os suelte al Rey de los judíos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 18, 40, NULL, 'Entonces todos dieron voces de nuevo, diciendo: No a este, sino a Barrabás. Y Barrabás era ladrón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 1, NULL, 'Así que, entonces tomó Pilato a Jesús, y le azotó.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 2, NULL, 'Y los soldados entretejieron una corona de espinas, y la pusieron sobre su cabeza, y le vistieron con un manto de púrpura;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 3, NULL, 'y le decían: ¡Salve, Rey de los judíos! y le daban de bofetadas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 4, NULL, 'Entonces Pilato salió otra vez, y les dijo: Mirad, os lo traigo fuera, para que entendáis que ningún delito hallo en él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 5, NULL, 'Y salió Jesús, llevando la corona de espinas y el manto de púrpura. Y Pilato les dijo: ¡He aquí el hombre!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 6, NULL, 'Cuando le vieron los principales sacerdotes y los alguaciles, dieron voces, diciendo: ¡Crucifícale! ¡Crucifícale! Pilato les dijo: Tomadle vosotros, y crucificadle; porque yo no hallo delito en él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 7, NULL, 'Los judíos le respondieron: Nosotros tenemos una ley, y según nuestra ley debe morir, porque se hizo a sí mismo Hijo de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 8, NULL, 'Cuando Pilato oyó decir esto, tuvo más miedo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 9, NULL, 'Y entró otra vez en el pretorio, y dijo a Jesús: ¿De dónde eres tú? Mas Jesús no le dio respuesta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 10, NULL, 'Entonces le dijo Pilato: ¿A mí no me hablas? ¿No sabes que tengo autoridad para crucificarte, y que tengo autoridad para soltarte?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 11, NULL, 'Respondió Jesús: Ninguna autoridad tendrías contra mí, si no te fuese dada de arriba; por tanto, el que a ti me ha entregado, mayor pecado tiene.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 12, NULL, 'Desde entonces procuraba Pilato soltarle; pero los judíos daban voces, diciendo: Si a este sueltas, no eres amigo de César; todo el que se hace rey, a César se opone.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 13, NULL, 'Entonces Pilato, oyendo esto, llevó fuera a Jesús, y se sentó en el tribunal en el lugar llamado el Enlosado, y en hebreo Gabata.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 14, NULL, 'Era la preparación de la pascua, y como la hora sexta. Entonces dijo a los judíos: ¡He aquí vuestro Rey!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 15, NULL, 'Pero ellos gritaron: ¡Fuera, fuera, crucifícale! Pilato les dijo: ¿A vuestro Rey he de crucificar? Respondieron los principales sacerdotes: No tenemos más rey que César.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 16, NULL, 'Así que entonces lo entregó a ellos para que fuese crucificado. Tomaron, pues, a Jesús, y le llevaron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 17, 'Crucifixión y muerte de Jesús', 'Y él, cargando su cruz, salió al lugar llamado de la Calavera, y en hebreo, Gólgota;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 18, NULL, 'y allí le crucificaron, y con él a otros dos, uno a cada lado, y Jesús en medio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 19, NULL, 'Escribió también Pilato un título, que puso sobre la cruz, el cual decía: JESÚS NAZARENO, REY DE LOS JUDÍOS.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 20, NULL, 'Y muchos de los judíos leyeron este título; porque el lugar donde Jesús fue crucificado estaba cerca de la ciudad, y el título estaba escrito en hebreo, en griego y en latín.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 21, NULL, 'Dijeron a Pilato los principales sacerdotes de los judíos: No escribas: Rey de los judíos; sino, que él dijo: Soy Rey de los judíos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 22, NULL, 'Respondió Pilato: Lo que he escrito, he escrito.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 23, NULL, 'Cuando los soldados hubieron crucificado a Jesús, tomaron sus vestidos, e hicieron cuatro partes, una para cada soldado. Tomaron también su túnica, la cual era sin costura, de un solo tejido de arriba abajo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 24, NULL, 'Entonces dijeron entre sí: No la partamos, sino echemos suertes sobre ella, a ver de quién será. Esto fue para que se cumpliese la Escritura, que dice: Repartieron entre sí mis vestidos, Y sobre mi ropa echaron suertes. Y así lo hicieron los soldados.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 25, NULL, 'Estaban junto a la cruz de Jesús su madre, y la hermana de su madre, María mujer de Cleofas, y María Magdalena.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 26, NULL, 'Cuando vio Jesús a su madre, y al discípulo a quien él amaba, que estaba presente, dijo a su madre: Mujer, he ahí tu hijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 27, NULL, 'Después dijo al discípulo: He ahí tu madre. Y desde aquella hora el discípulo la recibió en su casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 28, NULL, 'Después de esto, sabiendo Jesús que ya todo estaba consumado, dijo, para que la Escritura se cumpliese: Tengo sed.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 29, NULL, 'Y estaba allí una vasija llena de vinagre; entonces ellos empaparon en vinagre una esponja, y poniéndola en un hisopo, se la acercaron a la boca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 30, NULL, 'Cuando Jesús hubo tomado el vinagre, dijo: Consumado es. Y habiendo inclinado la cabeza, entregó el espíritu.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 31, 'El costado de Jesús traspasado', 'Entonces los judíos, por cuanto era la preparación de la pascua, a fin de que los cuerpos no quedasen en la cruz en el día de reposo (pues aquel día de reposo era de gran solemnidad), rogaron a Pilato que se les quebrasen las piernas, y fuesen quitados de allí.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 32, NULL, 'Vinieron, pues, los soldados, y quebraron las piernas al primero, y asimismo al otro que había sido crucificado con él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 33, NULL, 'Mas cuando llegaron a Jesús, como le vieron ya muerto, no le quebraron las piernas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 34, NULL, 'Pero uno de los soldados le abrió el costado con una lanza, y al instante salió sangre y agua.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 35, NULL, 'Y el que lo vio da testimonio, y su testimonio es verdadero; y él sabe que dice verdad, para que vosotros también creáis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 36, NULL, 'Porque estas cosas sucedieron para que se cumpliese la Escritura: No será quebrado hueso suyo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 37, NULL, 'Y también otra Escritura dice: Mirarán al que traspasaron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 38, 'Jesús es sepultado', 'Después de todo esto, José de Arimatea, que era discípulo de Jesús, pero secretamente por miedo de los judíos, rogó a Pilato que le permitiese llevarse el cuerpo de Jesús; y Pilato se lo concedió. Entonces vino, y se llevó el cuerpo de Jesús.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 39, NULL, 'También Nicodemo, el que antes había visitado a Jesús de noche, vino trayendo un compuesto de mirra y de áloes, como cien libras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 40, NULL, 'Tomaron, pues, el cuerpo de Jesús, y lo envolvieron en lienzos con especias aromáticas, según es costumbre sepultar entre los judíos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 41, NULL, 'Y en el lugar donde había sido crucificado, había un huerto, y en el huerto un sepulcro nuevo, en el cual aún no había sido puesto ninguno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 19, 42, NULL, 'Allí, pues, por causa de la preparación de la pascua de los judíos, y porque aquel sepulcro estaba cerca, pusieron a Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 20, 1, 'La resurrección', 'El primer día de la semana, María Magdalena fue de mañana, siendo aún oscuro, al sepulcro; y vio quitada la piedra del sepulcro.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 20, 2, NULL, 'Entonces corrió, y fue a Simón Pedro y al otro discípulo, aquel al que amaba Jesús, y les dijo: Se han llevado del sepulcro al Señor, y no sabemos dónde le han puesto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 20, 3, NULL, 'Y salieron Pedro y el otro discípulo, y fueron al sepulcro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 20, 4, NULL, 'Corrían los dos juntos; pero el otro discípulo corrió más aprisa que Pedro, y llegó primero al sepulcro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 20, 5, NULL, 'Y bajándose a mirar, vio los lienzos puestos allí, pero no entró.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 20, 6, NULL, 'Luego llegó Simón Pedro tras él, y entró en el sepulcro, y vio los lienzos puestos allí,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 20, 7, NULL, 'y el sudario, que había estado sobre la cabeza de Jesús, no puesto con los lienzos, sino enrollado en un lugar aparte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 20, 8, NULL, 'Entonces entró también el otro discípulo, que había venido primero al sepulcro; y vio, y creyó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 20, 9, NULL, 'Porque aún no habían entendido la Escritura, que era necesario que él resucitase de los muertos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 20, 10, NULL, 'Y volvieron los discípulos a los suyos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 20, 11, 'Jesús se aparece a María Magdalena', 'Pero María estaba fuera llorando junto al sepulcro; y mientras lloraba, se inclinó para mirar dentro del sepulcro;', 1, 'spa', 'RVR1960', NULL);\n"
;

  public static final String SQL_PARTE_4 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Jn', 20, 12, NULL, 'y vio a dos ángeles con vestiduras blancas, que estaban sentados el uno a la cabecera, y el otro a los pies, donde el cuerpo de Jesús había sido puesto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 20, 13, NULL, 'Y le dijeron: Mujer, ¿por qué lloras? Les dijo: Porque se han llevado a mi Señor, y no sé dónde le han puesto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 20, 14, NULL, 'Cuando había dicho esto, se volvió, y vio a Jesús que estaba allí; mas no sabía que era Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 20, 15, NULL, 'Jesús le dijo: Mujer, ¿por qué lloras? ¿A quién buscas? Ella, pensando que era el hortelano, le dijo: Señor, si tú lo has llevado, dime dónde lo has puesto, y yo lo llevaré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 20, 16, NULL, 'Jesús le dijo: ¡María! Volviéndose ella, le dijo: ¡Raboni! (que quiere decir, Maestro).', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 20, 17, NULL, 'Jesús le dijo: No me toques, porque aún no he subido a mi Padre; mas ve a mis hermanos, y diles: Subo a mi Padre y a vuestro Padre, a mi Dios y a vuestro Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 20, 18, NULL, 'Fue entonces María Magdalena para dar a los discípulos las nuevas de que había visto al Señor, y que él le había dicho estas cosas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 20, 19, 'Jesús se aparece a los discípulos', 'Cuando llegó la noche de aquel mismo día, el primero de la semana, estando las puertas cerradas en el lugar donde los discípulos estaban reunidos por miedo de los judíos, vino Jesús, y puesto en medio, les dijo: Paz a vosotros.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 20, 20, NULL, 'Y cuando les hubo dicho esto, les mostró las manos y el costado. Y los discípulos se regocijaron viendo al Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 20, 21, NULL, 'Entonces Jesús les dijo otra vez: Paz a vosotros. Como me envió el Padre, así también yo os envío.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 20, 22, NULL, 'Y habiendo dicho esto, sopló, y les dijo: Recibid el Espíritu Santo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 20, 23, NULL, 'A quienes remitiereis los pecados, les son remitidos; y a quienes se los retuviereis, les son retenidos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 20, 24, 'Incredulidad de Tomás', 'Pero Tomás, uno de los doce, llamado Dídimo, no estaba con ellos cuando Jesús vino.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 20, 25, NULL, 'Le dijeron, pues, los otros discípulos: Al Señor hemos visto. Él les dijo: Si no viere en sus manos la señal de los clavos, y metiere mi dedo en el lugar de los clavos, y metiere mi mano en su costado, no creeré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 20, 26, NULL, 'Ocho días después, estaban otra vez sus discípulos dentro, y con ellos Tomás. Llegó Jesús, estando las puertas cerradas, y se puso en medio y les dijo: Paz a vosotros.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 20, 27, NULL, 'Luego dijo a Tomás: Pon aquí tu dedo, y mira mis manos; y acerca tu mano, y métela en mi costado; y no seas incrédulo, sino creyente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 20, 28, NULL, 'Entonces Tomás respondió y le dijo: ¡Señor mío, y Dios mío!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 20, 29, NULL, 'Jesús le dijo: Porque me has visto, Tomás, creíste; bienaventurados los que no vieron, y creyeron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 20, 30, 'El propósito del libro', 'Hizo además Jesús muchas otras señales en presencia de sus discípulos, las cuales no están escritas en este libro.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 20, 31, NULL, 'Pero estas se han escrito para que creáis que Jesús es el Cristo, el Hijo de Dios, y para que creyendo, tengáis vida en su nombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 21, 1, 'Jesús se aparece a siete de sus discípulos', 'Después de esto, Jesús se manifestó otra vez a sus discípulos junto al mar de Tiberias; y se manifestó de esta manera:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 21, 2, NULL, 'Estaban juntos Simón Pedro, Tomás llamado el Dídimo, Natanael el de Caná de Galilea, los hijos de Zebedeo, y otros dos de sus discípulos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 21, 3, NULL, 'Simón Pedro les dijo: Voy a pescar. Ellos le dijeron: Vamos nosotros también contigo. Fueron, y entraron en una barca; y aquella noche no pescaron nada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 21, 4, NULL, 'Cuando ya iba amaneciendo, se presentó Jesús en la playa; mas los discípulos no sabían que era Jesús.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 21, 5, NULL, 'Y les dijo: Hijitos, ¿tenéis algo de comer? Le respondieron: No.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 21, 6, NULL, 'Él les dijo: Echad la red a la derecha de la barca, y hallaréis. Entonces la echaron, y ya no la podían sacar, por la gran cantidad de peces.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 21, 7, NULL, 'Entonces aquel discípulo a quien Jesús amaba dijo a Pedro: ¡Es el Señor! Simón Pedro, cuando oyó que era el Señor, se ciñó la ropa (porque se había despojado de ella), y se echó al mar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 21, 8, NULL, 'Y los otros discípulos vinieron con la barca, arrastrando la red de peces, pues no distaban de tierra sino como doscientos codos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 21, 9, NULL, 'Al descender a tierra, vieron brasas puestas, y un pez encima de ellas, y pan.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 21, 10, NULL, 'Jesús les dijo: Traed de los peces que acabáis de pescar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 21, 11, NULL, 'Subió Simón Pedro, y sacó la red a tierra, llena de grandes peces, ciento cincuenta y tres; y aun siendo tantos, la red no se rompió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 21, 12, NULL, 'Les dijo Jesús: Venid, comed. Y ninguno de los discípulos se atrevía a preguntarle: ¿Tú, quién eres? sabiendo que era el Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 21, 13, NULL, 'Vino, pues, Jesús, y tomó el pan y les dio, y asimismo del pescado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 21, 14, NULL, 'Esta era ya la tercera vez que Jesús se manifestaba a sus discípulos, después de haber resucitado de los muertos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 21, 15, 'Apacienta mis ovejas', 'Cuando hubieron comido, Jesús dijo a Simón Pedro: Simón, hijo de Jonás, ¿me amas más que estos? Le respondió: Sí, Señor; tú sabes que te amo. Él le dijo: Apacienta mis corderos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 21, 16, NULL, 'Volvió a decirle la segunda vez: Simón, hijo de Jonás, ¿me amas? Pedro le respondió: Sí, Señor; tú sabes que te amo. Le dijo: Pastorea mis ovejas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 21, 17, NULL, 'Le dijo la tercera vez: Simón, hijo de Jonás, ¿me amas? Pedro se entristeció de que le dijese la tercera vez: ¿Me amas? y le respondió: Señor, tú lo sabes todo; tú sabes que te amo. Jesús le dijo: Apacienta mis ovejas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 21, 18, NULL, 'De cierto, de cierto te digo: Cuando eras más joven, te ceñías, e ibas a donde querías; mas cuando ya seas viejo, extenderás tus manos, y te ceñirá otro, y te llevará a donde no quieras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 21, 19, NULL, 'Esto dijo, dando a entender con qué muerte había de glorificar a Dios. Y dicho esto, añadió: Sígueme.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 21, 20, 'El discípulo amado', 'Volviéndose Pedro, vio que les seguía el discípulo a quien amaba Jesús, el mismo que en la cena se había recostado al lado de él, y le había dicho: Señor, ¿quién es el que te ha de entregar?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 21, 21, NULL, 'Cuando Pedro le vio, dijo a Jesús: Señor, ¿y qué de este?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 21, 22, NULL, 'Jesús le dijo: Si quiero que él quede hasta que yo venga, ¿qué a ti? Sígueme tú.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 21, 23, NULL, 'Este dicho se extendió entonces entre los hermanos, que aquel discípulo no moriría. Pero Jesús no le dijo que no moriría, sino: Si quiero que él quede hasta que yo venga, ¿qué a ti?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 21, 24, NULL, 'Este es el discípulo que da testimonio de estas cosas, y escribió estas cosas; y sabemos que su testimonio es verdadero.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jn', 21, 25, NULL, 'Y hay también otras muchas cosas que hizo Jesús, las cuales si se escribieran una por una, pienso que ni aun en el mundo cabrían los libros que se habrían de escribir. Amén.', 1, 'spa', 'RVR1960', NULL);\n"
;

}