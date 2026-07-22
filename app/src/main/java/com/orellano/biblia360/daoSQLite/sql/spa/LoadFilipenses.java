package com.orellano.biblia360.daoSQLite.sql.spa;

public final class LoadFilipenses {
  public LoadFilipenses() {}
  public static final String SQL_PARTE_1 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Fil', 1, 1, 'Salutación', 'Pablo y Timoteo, siervos de Jesucristo, a todos los santos en Cristo Jesús que están en Filipos, con los obispos y diáconos:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 1, 2, NULL, 'Gracia y paz a vosotros, de Dios nuestro Padre y del Señor Jesucristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 1, 3, 'Oración de Pablo por los creyentes', 'Doy gracias a mi Dios siempre que me acuerdo de vosotros,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 1, 4, NULL, 'siempre en todas mis oraciones rogando con gozo por todos vosotros,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 1, 5, NULL, 'por vuestra comunión en el evangelio, desde el primer día hasta ahora;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 1, 6, NULL, 'estando persuadido de esto, que el que comenzó en vosotros la buena obra, la perfeccionará hasta el día de Jesucristo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 1, 7, NULL, 'como me es justo sentir esto de todos vosotros, por cuanto os tengo en el corazón; y en mis prisiones, y en la defensa y confirmación del evangelio, todos vosotros sois participantes conmigo de la gracia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 1, 8, NULL, 'Porque Dios me es testigo de cómo os amo a todos vosotros con el entrañable amor de Jesucristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 1, 9, NULL, 'Y esto pido en oración, que vuestro amor abunde aún más y más en ciencia y en todo conocimiento,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 1, 10, NULL, 'para que aprobéis lo mejor, a fin de que seáis sinceros e irreprensibles para el día de Cristo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 1, 11, NULL, 'llenos de frutos de justicia que son por medio de Jesucristo, para gloria y alabanza de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 1, 12, 'Para mí el vivir es Cristo', 'Quiero que sepáis, hermanos, que las cosas que me han sucedido, han redundado más bien para el progreso del evangelio,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 1, 13, NULL, 'de tal manera que mis prisiones se han hecho patentes en Cristo en todo el pretorio, y a todos los demás.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 1, 14, NULL, 'Y la mayoría de los hermanos, cobrando ánimo en el Señor con mis prisiones, se atreven mucho más a hablar la palabra sin temor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 1, 15, NULL, 'Algunos, a la verdad, predican a Cristo por envidia y contienda; pero otros de buena voluntad.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 1, 16, NULL, 'Los unos anuncian a Cristo por contención, no sinceramente, pensando añadir aflicción a mis prisiones;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 1, 17, NULL, 'pero los otros por amor, sabiendo que estoy puesto para la defensa del evangelio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 1, 18, NULL, '¿Qué, pues? Que no obstante, de todas maneras, o por pretexto o por verdad, Cristo es anunciado; y en esto me gozo, y me gozaré aún.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 1, 19, NULL, 'Porque sé que por vuestra oración y la suministración del Espíritu de Jesucristo, esto resultará en mi liberación,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 1, 20, NULL, 'conforme a mi anhelo y esperanza de que en nada seré avergonzado; antes bien con toda confianza, como siempre, ahora también será magnificado Cristo en mi cuerpo, o por vida o por muerte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 1, 21, NULL, 'Porque para mí el vivir es Cristo, y el morir es ganancia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 1, 22, NULL, 'Mas si el vivir en la carne resulta para mí en beneficio de la obra, no sé entonces qué escoger.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 1, 23, NULL, 'Porque de ambas cosas estoy puesto en estrecho, teniendo deseo de partir y estar con Cristo, lo cual es muchísimo mejor;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 1, 24, NULL, 'pero quedar en la carne es más necesario por causa de vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 1, 25, NULL, 'Y confiado en esto, sé que quedaré, que aún permaneceré con todos vosotros, para vuestro provecho y gozo de la fe,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 1, 26, NULL, 'para que abunde vuestra gloria de mí en Cristo Jesús por mi presencia otra vez entre vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 1, 27, NULL, 'Solamente que os comportéis como es digno del evangelio de Cristo, para que o sea que vaya a veros, o que esté ausente, oiga de vosotros que estáis firmes en un mismo espíritu, combatiendo unánimes por la fe del evangelio,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 1, 28, NULL, 'y en nada intimidados por los que se oponen, que para ellos ciertamente es indicio de perdición, mas para vosotros de salvación; y esto de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 1, 29, NULL, 'Porque a vosotros os es concedido a causa de Cristo, no solo que creáis en él, sino también que padezcáis por él,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 1, 30, NULL, 'teniendo el mismo conflicto que habéis visto en mí, y ahora oís que hay en mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 2, 1, 'Humillación y exaltación de Cristo', 'Por tanto, si hay alguna consolación en Cristo, si algún consuelo de amor, si alguna comunión del Espíritu, si algún afecto entrañable, si alguna misericordia,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 2, 2, NULL, 'completad mi gozo, sintiendo lo mismo, teniendo el mismo amor, unánimes, sintiendo una misma cosa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 2, 3, NULL, 'Nada hagáis por contienda o por vanagloria; antes bien con humildad, estimando cada uno a los demás como superiores a él mismo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 2, 4, NULL, 'no mirando cada uno por lo suyo propio, sino cada cual también por lo de los otros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 2, 5, NULL, 'Haya, pues, en vosotros este sentir que hubo también en Cristo Jesús,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 2, 6, NULL, 'el cual, siendo en forma de Dios, no estimó el ser igual a Dios como cosa a que aferrarse,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 2, 7, NULL, 'sino que se despojó a sí mismo, tomando forma de siervo, hecho semejante a los hombres;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 2, 8, NULL, 'y estando en la condición de hombre, se humilló a sí mismo, haciéndose obediente hasta la muerte, y muerte de cruz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 2, 9, NULL, 'Por lo cual Dios también le exaltó hasta lo sumo, y le dio un nombre que es sobre todo nombre,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 2, 10, NULL, 'para que en el nombre de Jesús se doble toda rodilla de los que están en los cielos, y en la tierra, y debajo de la tierra;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 2, 11, NULL, 'y toda lengua confiese que Jesucristo es el Señor, para gloria de Dios Padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 2, 12, 'Luminares en el mundo', 'Por tanto, amados míos, como siempre habéis obedecido, no como en mi presencia solamente, sino mucho más ahora en mi ausencia, ocupaos en vuestra salvación con temor y temblor,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 2, 13, NULL, 'porque Dios es el que en vosotros produce así el querer como el hacer, por su buena voluntad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 2, 14, NULL, 'Haced todo sin murmuraciones y contiendas,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 2, 15, NULL, 'para que seáis irreprensibles y sencillos, hijos de Dios sin mancha en medio de una generación maligna y perversa, en medio de la cual resplandecéis como luminares en el mundo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 2, 16, NULL, 'asidos de la palabra de vida, para que en el día de Cristo yo pueda gloriarme de que no he corrido en vano, ni en vano he trabajado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 2, 17, NULL, 'Y aunque sea derramado en libación sobre el sacrificio y servicio de vuestra fe, me gozo y regocijo con todos vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 2, 18, NULL, 'Y asimismo gozaos y regocijaos también vosotros conmigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 2, 19, 'Timoteo y Epafrodito', 'Espero en el Señor Jesús enviaros pronto a Timoteo, para que yo también esté de buen ánimo al saber de vuestro estado;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 2, 20, NULL, 'pues a ninguno tengo del mismo ánimo, y que tan sinceramente se interese por vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 2, 21, NULL, 'Porque todos buscan lo suyo propio, no lo que es de Cristo Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 2, 22, NULL, 'Pero ya conocéis los méritos de él, que como hijo a padre ha servido conmigo en el evangelio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 2, 23, NULL, 'Así que a este espero enviaros, luego que yo vea cómo van mis asuntos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 2, 24, NULL, 'y confío en el Señor que yo también iré pronto a vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 2, 25, NULL, 'Mas tuve por necesario enviaros a Epafrodito, mi hermano y colaborador y compañero de milicia, vuestro mensajero, y ministrador de mis necesidades;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 2, 26, NULL, 'porque él tenía gran deseo de veros a todos vosotros, y gravemente se angustió porque habíais oído que había enfermado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 2, 27, NULL, 'Pues en verdad estuvo enfermo, a punto de morir; pero Dios tuvo misericordia de él, y no solamente de él, sino también de mí, para que yo no tuviese tristeza sobre tristeza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 2, 28, NULL, 'Así que le envío con mayor solicitud, para que al verle de nuevo, os gocéis, y yo esté con menos tristeza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 2, 29, NULL, 'Recibidle, pues, en el Señor, con todo gozo, y tened en estima a los que son como él;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 2, 30, NULL, 'porque por la obra de Cristo estuvo próximo a la muerte, exponiendo su vida para suplir lo que faltaba en vuestro servicio por mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 3, 1, 'Prosigo al blanco', 'Por lo demás, hermanos, gozaos en el Señor. A mí no me es molesto el escribiros las mismas cosas, y para vosotros es seguro.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 3, 2, NULL, 'Guardaos de los perros, guardaos de los malos obreros, guardaos de los mutiladores del cuerpo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 3, 3, NULL, 'Porque nosotros somos la circuncisión, los que en espíritu servimos a Dios y nos gloriamos en Cristo Jesús, no teniendo confianza en la carne.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 3, 4, NULL, 'Aunque yo tengo también de qué confiar en la carne. Si alguno piensa que tiene de qué confiar en la carne, yo más:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 3, 5, NULL, 'circuncidado al octavo día, del linaje de Israel, de la tribu de Benjamín, hebreo de hebreos; en cuanto a la ley, fariseo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 3, 6, NULL, 'en cuanto a celo, perseguidor de la iglesia; en cuanto a la justicia que es en la ley, irreprensible.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 3, 7, NULL, 'Pero cuantas cosas eran para mí ganancia, las he estimado como pérdida por amor de Cristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 3, 8, NULL, 'Y ciertamente, aun estimo todas las cosas como pérdida por la excelencia del conocimiento de Cristo Jesús, mi Señor, por amor del cual lo he perdido todo, y lo tengo por basura, para ganar a Cristo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 3, 9, NULL, 'y ser hallado en él, no teniendo mi propia justicia, que es por la ley, sino la que es por la fe de Cristo, la justicia que es de Dios por la fe;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 3, 10, NULL, 'a fin de conocerle, y el poder de su resurrección, y la participación de sus padecimientos, llegando a ser semejante a él en su muerte,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 3, 11, NULL, 'si en alguna manera llegase a la resurrección de entre los muertos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 3, 12, NULL, 'No que lo haya alcanzado ya, ni que ya sea perfecto; sino que prosigo, por ver si logro asir aquello para lo cual fui también asido por Cristo Jesús.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 3, 13, NULL, 'Hermanos, yo mismo no pretendo haberlo ya alcanzado; pero una cosa hago: olvidando ciertamente lo que queda atrás, y extendiéndome a lo que está delante,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 3, 14, NULL, 'prosigo a la meta, al premio del supremo llamamiento de Dios en Cristo Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 3, 15, NULL, 'Así que, todos los que somos perfectos, esto mismo sintamos; y si otra cosa sentís, esto también os lo revelará Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 3, 16, NULL, 'Pero en aquello a que hemos llegado, sigamos una misma regla, sintamos una misma cosa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 3, 17, NULL, 'Hermanos, sed imitadores de mí, y mirad a los que así se conducen según el ejemplo que tenéis en nosotros.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 3, 18, NULL, 'Porque por ahí andan muchos, de los cuales os dije muchas veces, y aun ahora lo digo llorando, que son enemigos de la cruz de Cristo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 3, 19, NULL, 'el fin de los cuales será perdición, cuyo dios es el vientre, y cuya gloria es su vergüenza; que solo piensan en lo terrenal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 3, 20, NULL, 'Mas nuestra ciudadanía está en los cielos, de donde también esperamos al Salvador, al Señor Jesucristo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 3, 21, NULL, 'el cual transformará el cuerpo de la humillación nuestra, para que sea semejante al cuerpo de la gloria suya, por el poder con el cual puede también sujetar a sí mismo todas las cosas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 4, 1, 'Regocijaos en el Señor siempre', 'Así que, hermanos míos amados y deseados, gozo y corona mía, estad así firmes en el Señor, amados.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 4, 2, NULL, 'Ruego a Evodia y a Síntique, que sean de un mismo sentir en el Señor.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 4, 3, NULL, 'Asimismo te ruego también a ti, compañero fiel, que ayudes a estas que combatieron juntamente conmigo en el evangelio, con Clemente también y los demás colaboradores míos, cuyos nombres están en el libro de la vida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 4, 4, NULL, 'Regocijaos en el Señor siempre. Otra vez digo: ¡Regocijaos!', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 4, 5, NULL, 'Vuestra gentileza sea conocida de todos los hombres. El Señor está cerca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 4, 6, NULL, 'Por nada estéis afanosos, sino sean conocidas vuestras peticiones delante de Dios en toda oración y ruego, con acción de gracias.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 4, 7, NULL, 'Y la paz de Dios, que sobrepasa todo entendimiento, guardará vuestros corazones y vuestros pensamientos en Cristo Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 4, 8, 'En esto pensad', 'Por lo demás, hermanos, todo lo que es verdadero, todo lo honesto, todo lo justo, todo lo puro, todo lo amable, todo lo que es de buen nombre; si hay virtud alguna, si algo digno de alabanza, en esto pensad.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 4, 9, NULL, 'Lo que aprendisteis y recibisteis y oísteis y visteis en mí, esto haced; y el Dios de paz estará con vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 4, 10, 'Dádivas de los filipenses', 'En gran manera me gocé en el Señor de que ya al fin habéis revivido vuestro cuidado de mí; de lo cual también estabais solícitos, pero os faltaba la oportunidad.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 4, 11, NULL, 'No lo digo porque tenga escasez, pues he aprendido a contentarme, cualquiera que sea mi situación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 4, 12, NULL, 'Sé vivir humildemente, y sé tener abundancia; en todo y por todo estoy enseñado, así para estar saciado como para tener hambre, así para tener abundancia como para padecer necesidad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 4, 13, NULL, 'Todo lo puedo en Cristo que me fortalece.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 4, 14, NULL, 'Sin embargo, bien hicisteis en participar conmigo en mi tribulación.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 4, 15, NULL, 'Y sabéis también vosotros, oh filipenses, que al principio de la predicación del evangelio, cuando partí de Macedonia, ninguna iglesia participó conmigo en razón de dar y recibir, sino vosotros solos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 4, 16, NULL, 'pues aun a Tesalónica me enviasteis una y otra vez para mis necesidades.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 4, 17, NULL, 'No es que busque dádivas, sino que busco fruto que abunde en vuestra cuenta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 4, 18, NULL, 'Pero todo lo he recibido, y tengo abundancia; estoy lleno, habiendo recibido de Epafrodito lo que enviasteis; olor fragante, sacrificio acepto, agradable a Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 4, 19, NULL, 'Mi Dios, pues, suplirá todo lo que os falta conforme a sus riquezas en gloria en Cristo Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 4, 20, NULL, 'Al Dios y Padre nuestro sea gloria por los siglos de los siglos. Amén.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 4, 21, 'Salutaciones finales', 'Saludad a todos los santos en Cristo Jesús. Los hermanos que están conmigo os saludan.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 4, 22, NULL, 'Todos los santos os saludan, y especialmente los de la casa de César.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Fil', 4, 23, NULL, 'La gracia de nuestro Señor Jesucristo sea con todos vosotros. Amén.', 1, 'spa', 'RVR1960', NULL);\n"
;

}