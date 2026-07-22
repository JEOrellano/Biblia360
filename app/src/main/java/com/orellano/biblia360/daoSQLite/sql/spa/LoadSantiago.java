package com.orellano.biblia360.daoSQLite.sql.spa;

public final class LoadSantiago {
  public LoadSantiago() {}
  public static final String SQL_PARTE_1 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'St', 1, 1, 'Salutación', 'Santiago, siervo de Dios y del Señor Jesucristo, a las doce tribus que están en la dispersión: Salud.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 1, 2, 'La sabiduría que viene de Dios', 'Hermanos míos, tened por sumo gozo cuando os halléis en diversas pruebas,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 1, 3, NULL, 'sabiendo que la prueba de vuestra fe produce paciencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 1, 4, NULL, 'Mas tenga la paciencia su obra completa, para que seáis perfectos y cabales, sin que os falte cosa alguna.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 1, 5, NULL, 'Y si alguno de vosotros tiene falta de sabiduría, pídala a Dios, el cual da a todos abundantemente y sin reproche, y le será dada.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 1, 6, NULL, 'Pero pida con fe, no dudando nada; porque el que duda es semejante a la onda del mar, que es arrastrada por el viento y echada de una parte a otra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 1, 7, NULL, 'No piense, pues, quien tal haga, que recibirá cosa alguna del Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 1, 8, NULL, 'El hombre de doble ánimo es inconstante en todos sus caminos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 1, 9, NULL, 'El hermano que es de humilde condición, gloríese en su exaltación;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 1, 10, NULL, 'pero el que es rico, en su humillación; porque él pasará como la flor de la hierba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 1, 11, NULL, 'Porque cuando sale el sol con calor abrasador, la hierba se seca, su flor se cae, y perece su hermosa apariencia; así también se marchitará el rico en todas sus empresas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 1, 12, 'Soportando las pruebas', 'Bienaventurado el varón que soporta la tentación; porque cuando haya resistido la prueba, recibirá la corona de vida, que Dios ha prometido a los que le aman.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 1, 13, NULL, 'Cuando alguno es tentado, no diga que es tentado de parte de Dios; porque Dios no puede ser tentado por el mal, ni él tienta a nadie;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 1, 14, NULL, 'sino que cada uno es tentado, cuando de su propia concupiscencia es atraído y seducido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 1, 15, NULL, 'Entonces la concupiscencia, después que ha concebido, da a luz el pecado; y el pecado, siendo consumado, da a luz la muerte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 1, 16, NULL, 'Amados hermanos míos, no erréis.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 1, 17, NULL, 'Toda buena dádiva y todo don perfecto desciende de lo alto, del Padre de las luces, en el cual no hay mudanza, ni sombra de variación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 1, 18, NULL, 'Él, de su voluntad, nos hizo nacer por la palabra de verdad, para que seamos primicias de sus criaturas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 1, 19, 'Hacedores de la palabra', 'Por esto, mis amados hermanos, todo hombre sea pronto para oír, tardo para hablar, tardo para airarse;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 1, 20, NULL, 'porque la ira del hombre no obra la justicia de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 1, 21, NULL, 'Por lo cual, desechando toda inmundicia y abundancia de malicia, recibid con mansedumbre la palabra implantada, la cual puede salvar vuestras almas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 1, 22, NULL, 'Pero sed hacedores de la palabra, y no tan solamente oidores, engañándoos a vosotros mismos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 1, 23, NULL, 'Porque si alguno es oidor de la palabra pero no hacedor de ella, este es semejante al hombre que considera en un espejo su rostro natural.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 1, 24, NULL, 'Porque él se considera a sí mismo, y se va, y luego olvida cómo era.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 1, 25, NULL, 'Mas el que mira atentamente en la perfecta ley, la de la libertad, y persevera en ella, no siendo oidor olvidadizo, sino hacedor de la obra, este será bienaventurado en lo que hace.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 1, 26, NULL, 'Si alguno se cree religioso entre vosotros, y no refrena su lengua, sino que engaña su corazón, la religión del tal es vana.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 1, 27, NULL, 'La religión pura y sin mácula delante de Dios el Padre es esta: Visitar a los huérfanos y a las viudas en sus tribulaciones, y guardarse sin mancha del mundo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 2, 1, 'Amonestación contra la parcialidad', 'Hermanos míos, que vuestra fe en nuestro glorioso Señor Jesucristo sea sin acepción de personas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 2, 2, NULL, 'Porque si en vuestra congregación entra un hombre con anillo de oro y con ropa espléndida, y también entra un pobre con vestido andrajoso,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 2, 3, NULL, 'y miráis con agrado al que trae la ropa espléndida y le decís: Siéntate tú aquí en buen lugar; y decís al pobre: Estate tú allí en pie, o siéntate aquí bajo mi estrado;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 2, 4, NULL, '¿no hacéis distinciones entre vosotros mismos, y venís a ser jueces con malos pensamientos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 2, 5, NULL, 'Hermanos míos amados, oíd: ¿No ha elegido Dios a los pobres de este mundo, para que sean ricos en fe y herederos del reino que ha prometido a los que le aman?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 2, 6, NULL, 'Pero vosotros habéis afrentado al pobre. ¿No os oprimen los ricos, y no son ellos los mismos que os arrastran a los tribunales?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 2, 7, NULL, '¿No blasfeman ellos el buen nombre que fue invocado sobre vosotros?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 2, 8, NULL, 'Si en verdad cumplís la ley real, conforme a la Escritura: Amarás a tu prójimo como a ti mismo, bien hacéis;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 2, 9, NULL, 'pero si hacéis acepción de personas, cometéis pecado, y quedáis convictos por la ley como transgresores.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 2, 10, NULL, 'Porque cualquiera que guardare toda la ley, pero ofendiere en un punto, se hace culpable de todos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 2, 11, NULL, 'Porque el que dijo: No cometerás adulterio, también ha dicho: No matarás. Ahora bien, si no cometes adulterio, pero matas, ya te has hecho transgresor de la ley.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 2, 12, NULL, 'Así hablad, y así haced, como los que habéis de ser juzgados por la ley de la libertad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 2, 13, NULL, 'Porque juicio sin misericordia se hará con aquel que no hiciere misericordia; y la misericordia triunfa sobre el juicio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 2, 14, 'La fe sin obras es muerta', 'Hermanos míos, ¿de qué aprovechará si alguno dice que tiene fe, y no tiene obras? ¿Podrá la fe salvarle?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 2, 15, NULL, 'Y si un hermano o una hermana están desnudos, y tienen necesidad del mantenimiento de cada día,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 2, 16, NULL, 'y alguno de vosotros les dice: Id en paz, calentaos y saciaos, pero no les dais las cosas que son necesarias para el cuerpo, ¿de qué aprovecha?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 2, 17, NULL, 'Así también la fe, si no tiene obras, es muerta en sí misma.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 2, 18, NULL, 'Pero alguno dirá: Tú tienes fe, y yo tengo obras. Muéstrame tu fe sin tus obras, y yo te mostraré mi fe por mis obras.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 2, 19, NULL, 'Tú crees que Dios es uno; bien haces. También los demonios creen, y tiemblan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 2, 20, NULL, '¿Mas quieres saber, hombre vano, que la fe sin obras es muerta?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 2, 21, NULL, '¿No fue justificado por las obras Abraham nuestro padre, cuando ofreció a su hijo Isaac sobre el altar?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 2, 22, NULL, '¿No ves que la fe actuó juntamente con sus obras, y que la fe se perfeccionó por las obras?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 2, 23, NULL, 'Y se cumplió la Escritura que dice: Abraham creyó a Dios, y le fue contado por justicia, y fue llamado amigo de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 2, 24, NULL, 'Vosotros veis, pues, que el hombre es justificado por las obras, y no solamente por la fe.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 2, 25, NULL, 'Asimismo también Rahab la ramera, ¿no fue justificada por obras, cuando recibió a los mensajeros y los envió por otro camino?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 2, 26, NULL, 'Porque como el cuerpo sin espíritu está muerto, así también la fe sin obras está muerta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 3, 1, 'La lengua', 'Hermanos míos, no os hagáis maestros muchos de vosotros, sabiendo que recibiremos mayor condenación.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 3, 2, NULL, 'Porque todos ofendemos muchas veces. Si alguno no ofende en palabra, este es varón perfecto, capaz también de refrenar todo el cuerpo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 3, 3, NULL, 'He aquí nosotros ponemos freno en la boca de los caballos para que nos obedezcan, y dirigimos así todo su cuerpo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 3, 4, NULL, 'Mirad también las naves; aunque tan grandes, y llevadas de impetuosos vientos, son gobernadas con un muy pequeño timón por donde el que las gobierna quiere.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 3, 5, NULL, 'Así también la lengua es un miembro pequeño, pero se jacta de grandes cosas. He aquí, ¡cuán grande bosque enciende un pequeño fuego!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 3, 6, NULL, 'Y la lengua es un fuego, un mundo de maldad. La lengua está puesta entre nuestros miembros, y contamina todo el cuerpo, e inflama la rueda de la creación, y ella misma es inflamada por el infierno.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 3, 7, NULL, 'Porque toda naturaleza de bestias, y de aves, y de serpientes, y de seres del mar, se doma y ha sido domada por la naturaleza humana;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 3, 8, NULL, 'pero ningún hombre puede domar la lengua, que es un mal que no puede ser refrenado, llena de veneno mortal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 3, 9, NULL, 'Con ella bendecimos al Dios y Padre, y con ella maldecimos a los hombres, que están hechos a la semejanza de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 3, 10, NULL, 'De una misma boca proceden bendición y maldición. Hermanos míos, esto no debe ser así.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 3, 11, NULL, '¿Acaso alguna fuente echa por una misma abertura agua dulce y amarga?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 3, 12, NULL, 'Hermanos míos, ¿puede acaso la higuera producir aceitunas, o la vid higos? Así también ninguna fuente puede dar agua salada y dulce.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 3, 13, 'La sabiduría de lo alto', '¿Quién es sabio y entendido entre vosotros? Muestre por la buena conducta sus obras en sabia mansedumbre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 3, 14, NULL, 'Pero si tenéis celos amargos y contención en vuestro corazón, no os jactéis, ni mintáis contra la verdad;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 3, 15, NULL, 'porque esta sabiduría no es la que desciende de lo alto, sino terrenal, animal, diabólica.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 3, 16, NULL, 'Porque donde hay celos y contención, allí hay perturbación y toda obra perversa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 3, 17, NULL, 'Pero la sabiduría que es de lo alto es primeramente pura, después pacífica, amable, benigna, llena de misericordia y de buenos frutos, sin incertidumbre ni hipocresía.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 3, 18, NULL, 'Y el fruto de justicia se siembra en paz para aquellos que hacen la paz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 4, 1, 'La amistad con el mundo', '¿De dónde vienen las guerras y los pleitos entre vosotros? ¿No es de vuestras pasiones, las cuales combaten en vuestros miembros?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 4, 2, NULL, 'Codiciáis, y no tenéis; matáis y ardéis de envidia, y no podéis alcanzar; combatís y lucháis, pero no tenéis lo que deseáis, porque no pedís.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 4, 3, NULL, 'Pedís, y no recibís, porque pedís mal, para gastar en vuestros deleites.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 4, 4, NULL, '¡Oh almas adúlteras! ¿No sabéis que la amistad del mundo es enemistad contra Dios? Cualquiera, pues, que quiera ser amigo del mundo, se constituye enemigo de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 4, 5, NULL, '¿O pensáis que la Escritura dice en vano: El Espíritu que él ha hecho morar en nosotros nos anhela celosamente?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 4, 6, NULL, 'Pero él da mayor gracia. Por esto dice: Dios resiste a los soberbios, y da gracia a los humildes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 4, 7, NULL, 'Someteos, pues, a Dios; resistid al diablo, y huirá de vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 4, 8, NULL, 'Acercaos a Dios, y él se acercará a vosotros. Pecadores, limpiad las manos; y vosotros los de doble ánimo, purificad vuestros corazones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 4, 9, NULL, 'Afligíos, y lamentad, y llorad. Vuestra risa se convierta en lloro, y vuestro gozo en tristeza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 4, 10, NULL, 'Humillaos delante del Señor, y él os exaltará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 4, 11, 'Juzgando al hermano', 'Hermanos, no murmuréis los unos de los otros. El que murmura del hermano y juzga a su hermano, murmura de la ley y juzga a la ley; pero si tú juzgas a la ley, no eres hacedor de la ley, sino juez.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 4, 12, NULL, 'Uno solo es el dador de la ley, que puede salvar y perder; pero tú, ¿quién eres para que juzgues a otro?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 4, 13, 'No os gloriéis del día de mañana', '¡Vamos ahora! los que decís: Hoy y mañana iremos a tal ciudad, y estaremos allá un año, y traficaremos, y ganaremos;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 4, 14, NULL, 'cuando no sabéis lo que será mañana. Porque ¿qué es vuestra vida? Ciertamente es neblina que se aparece por un poco de tiempo, y luego se desvanece.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 4, 15, NULL, 'En lugar de lo cual deberíais decir: Si el Señor quiere, viviremos y haremos esto o aquello.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 4, 16, NULL, 'Pero ahora os jactáis en vuestras soberbias. Toda jactancia semejante es mala;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 4, 17, NULL, 'y al que sabe hacer lo bueno, y no lo hace, le es pecado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 5, 1, 'Contra los ricos opresores', '¡Vamos ahora, ricos! Llorad y aullad por las miserias que os vendrán.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 5, 2, NULL, 'Vuestras riquezas están podridas, y vuestras ropas están comidas de polilla.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 5, 3, NULL, 'Vuestro oro y plata están enmohecidos; y su moho testificará contra vosotros, y devorará del todo vuestras carnes como fuego. Habéis acumulado tesoros para los días postreros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 5, 4, NULL, 'He aquí, clama el jornal de los obreros que han cosechado vuestras tierras, el cual por engaño no les ha sido pagado por vosotros; y los clamores de los que habían segado han entrado en los oídos del Señor de los ejércitos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 5, 5, NULL, 'Habéis vivido en deleites sobre la tierra, y sido disolutos; habéis engordado vuestros corazones como en día de matanza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 5, 6, NULL, 'Habéis condenado y dado muerte al justo, y él no os hace resistencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 5, 7, 'Sed pacientes y orad', 'Por tanto, hermanos, tened paciencia hasta la venida del Señor. Mirad cómo el labrador espera el precioso fruto de la tierra, aguardando con paciencia hasta que reciba la lluvia temprana y la tardía.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 5, 8, NULL, 'Tened también vosotros paciencia, y afirmad vuestros corazones; porque la venida del Señor se acerca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 5, 9, NULL, 'Hermanos, no os quejéis unos contra otros, para que no seáis condenados; he aquí, el juez está delante de la puerta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 5, 10, NULL, 'Hermanos míos, tomad como ejemplo de aflicción y de paciencia a los profetas que hablaron en nombre del Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 5, 11, NULL, 'He aquí, tenemos por bienaventurados a los que sufren. Habéis oído de la paciencia de Job, y habéis visto el fin del Señor, que el Señor es muy misericordioso y compasivo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 5, 12, NULL, 'Pero sobre todo, hermanos míos, no juréis, ni por el cielo, ni por la tierra, ni por ningún otro juramento; sino que vuestro sí sea sí, y vuestro no sea no, para que no caigáis en condenación.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 5, 13, NULL, '¿Está alguno entre vosotros afligido? Haga oración. ¿Está alguno alegre? Cante alabanzas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 5, 14, NULL, '¿Está alguno enfermo entre vosotros? Llame a los ancianos de la iglesia, y oren por él, ungiéndole con aceite en el nombre del Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 5, 15, NULL, 'Y la oración de fe salvará al enfermo, y el Señor lo levantará; y si hubiere cometido pecados, le serán perdonados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 5, 16, NULL, 'Confesaos vuestras ofensas unos a otros, y orad unos por otros, para que seáis sanados. La oración eficaz del justo puede mucho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 5, 17, NULL, 'Elías era hombre sujeto a pasiones semejantes a las nuestras, y oró fervientemente para que no lloviese, y no llovió sobre la tierra por tres años y seis meses.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 5, 18, NULL, 'Y otra vez oró, y el cielo dio lluvia, y la tierra produjo su fruto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 5, 19, NULL, 'Hermanos, si alguno de entre vosotros se ha extraviado de la verdad, y alguno le hace volver,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'St', 5, 20, NULL, 'sepa que el que haga volver al pecador del error de su camino, salvará de muerte un alma, y cubrirá multitud de pecados.', 0, 'spa', 'RVR1960', NULL);\n"
;

}