package com.orellano.biblia360.daoSQLite.sql.spa;

public final class LoadMarcos {
  public LoadMarcos() {}
  public static final String SQL_PARTE_1 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Mr', 1, 1, 'Predicación de Juan el Bautista', 'Principio del evangelio de Jesucristo, Hijo de Dios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 2, NULL, 'Como está escrito en Isaías el profeta: He aquí yo envío mi mensajero delante de tu faz, El cual preparará tu camino delante de ti.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 3, NULL, 'Voz del que clama en el desierto: Preparad el camino del Señor; Enderezad sus sendas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 4, NULL, 'Bautizaba Juan en el desierto, y predicaba el bautismo de arrepentimiento para perdón de pecados.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 5, NULL, 'Y salían a él toda la provincia de Judea, y todos los de Jerusalén; y eran bautizados por él en el río Jordán, confesando sus pecados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 6, NULL, 'Y Juan estaba vestido de pelo de camello, y tenía un cinto de cuero alrededor de sus lomos; y comía langostas y miel silvestre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 7, NULL, 'Y predicaba, diciendo: Viene tras mí el que es más poderoso que yo, a quien no soy digno de desatar encorvado la correa de su calzado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 8, NULL, 'Yo a la verdad os he bautizado con agua; pero él os bautizará con Espíritu Santo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 9, 'El bautismo de Jesús', 'Aconteció en aquellos días, que Jesús vino de Nazaret de Galilea, y fue bautizado por Juan en el Jordán.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 10, NULL, 'Y luego, cuando subía del agua, vio abrirse los cielos, y al Espíritu como paloma que descendía sobre él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 11, NULL, 'Y vino una voz de los cielos que decía: Tú eres mi Hijo amado; en ti tengo complacencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 12, 'Tentación de Jesús', 'Y luego el Espíritu le impulsó al desierto.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 13, NULL, 'Y estuvo allí en el desierto cuarenta días, y era tentado por Satanás, y estaba con las fieras; y los ángeles le servían.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 14, 'Jesús principia su ministerio', 'Después que Juan fue encarcelado, Jesús vino a Galilea predicando el evangelio del reino de Dios,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 15, NULL, 'diciendo: El tiempo se ha cumplido, y el reino de Dios se ha acercado; arrepentíos, y creed en el evangelio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 16, 'Jesús llama a cuatro pescadores', 'Andando junto al mar de Galilea, vio a Simón y a Andrés su hermano, que echaban la red en el mar; porque eran pescadores.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 17, NULL, 'Y les dijo Jesús: Venid en pos de mí, y haré que seáis pescadores de hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 18, NULL, 'Y dejando luego sus redes, le siguieron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 19, NULL, 'Pasando de allí un poco más adelante, vio a Jacobo hijo de Zebedeo, y a Juan su hermano, también ellos en la barca, que remendaban las redes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 20, NULL, 'Y luego los llamó; y dejando a su padre Zebedeo en la barca con los jornaleros, le siguieron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 21, 'Un hombre que tenía un espíritu inmundo', 'Y entraron en Capernaum; y los días de reposo, entrando en la sinagoga, enseñaba.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 22, NULL, 'Y se admiraban de su doctrina; porque les enseñaba como quien tiene autoridad, y no como los escribas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 23, NULL, 'Pero había en la sinagoga de ellos un hombre con espíritu inmundo, que dio voces,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 24, NULL, 'diciendo: ¡Ah! ¿qué tienes con nosotros, Jesús nazareno? ¿Has venido para destruirnos? Sé quién eres, el Santo de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 25, NULL, 'Pero Jesús le reprendió, diciendo: ¡Cállate, y sal de él!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 26, NULL, 'Y el espíritu inmundo, sacudiéndole con violencia, y clamando a gran voz, salió de él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 27, NULL, 'Y todos se asombraron, de tal manera que discutían entre sí, diciendo: ¿Qué es esto? ¿Qué nueva doctrina es esta, que con autoridad manda aun a los espíritus inmundos, y le obedecen?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 28, NULL, 'Y muy pronto se difundió su fama por toda la provincia alrededor de Galilea.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 29, 'Jesús sana a la suegra de Pedro', 'Al salir de la sinagoga, vinieron a casa de Simón y Andrés, con Jacobo y Juan.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 30, NULL, 'Y la suegra de Simón estaba acostada con fiebre; y en seguida le hablaron de ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 31, NULL, 'Entonces él se acercó, y la tomó de la mano y la levantó; e inmediatamente le dejó la fiebre, y ella les servía.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 32, 'Muchos sanados al ponerse el sol', 'Cuando llegó la noche, luego que el sol se puso, le trajeron todos los que tenían enfermedades, y a los endemoniados;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 33, NULL, 'y toda la ciudad se agolpó a la puerta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 34, NULL, 'Y sanó a muchos que estaban enfermos de diversas enfermedades, y echó fuera muchos demonios; y no dejaba hablar a los demonios, porque le conocían.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 35, 'Jesús recorre Galilea predicando', 'Levantándose muy de mañana, siendo aún muy oscuro, salió y se fue a un lugar desierto, y allí oraba.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 36, NULL, 'Y le buscó Simón, y los que con él estaban;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 37, NULL, 'y hallándole, le dijeron: Todos te buscan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 38, NULL, 'Él les dijo: Vamos a los lugares vecinos, para que predique también allí; porque para esto he venido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 39, NULL, 'Y predicaba en las sinagogas de ellos en toda Galilea, y echaba fuera los demonios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 40, 'Jesús sana a un leproso', 'Vino a él un leproso, rogándole; e hincada la rodilla, le dijo: Si quieres, puedes limpiarme.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 41, NULL, 'Y Jesús, teniendo misericordia de él, extendió la mano y le tocó, y le dijo: Quiero, sé limpio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 42, NULL, 'Y así que él hubo hablado, al instante la lepra se fue de aquel, y quedó limpio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 43, NULL, 'Entonces le encargó rigurosamente, y le despidió luego,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 44, NULL, 'y le dijo: Mira, no digas a nadie nada, sino ve, muéstrate al sacerdote, y ofrece por tu purificación lo que Moisés mandó, para testimonio a ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 1, 45, NULL, 'Pero ido él, comenzó a publicarlo mucho y a divulgar el hecho, de manera que ya Jesús no podía entrar abiertamente en la ciudad, sino que se quedaba fuera en los lugares desiertos; y venían a él de todas partes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 2, 1, 'Jesús sana a un paralítico', 'Entró Jesús otra vez en Capernaum después de algunos días; y se oyó que estaba en casa.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 2, 2, NULL, 'E inmediatamente se juntaron muchos, de manera que ya no cabían ni aun a la puerta; y les predicaba la palabra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 2, 3, NULL, 'Entonces vinieron a él unos trayendo un paralítico, que era cargado por cuatro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 2, 4, NULL, 'Y como no podían acercarse a él a causa de la multitud, descubrieron el techo de donde estaba, y haciendo una abertura, bajaron el lecho en que yacía el paralítico.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 2, 5, NULL, 'Al ver Jesús la fe de ellos, dijo al paralítico: Hijo, tus pecados te son perdonados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 2, 6, NULL, 'Estaban allí sentados algunos de los escribas, los cuales cavilaban en sus corazones:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 2, 7, NULL, '¿Por qué habla este así? Blasfemias dice. ¿Quién puede perdonar pecados, sino solo Dios?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 2, 8, NULL, 'Y conociendo luego Jesús en su espíritu que cavilaban de esta manera dentro de sí mismos, les dijo: ¿Por qué caviláis así en vuestros corazones?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 2, 9, NULL, '¿Qué es más fácil, decir al paralítico: Tus pecados te son perdonados, o decirle: Levántate, toma tu lecho y anda?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 2, 10, NULL, 'Pues para que sepáis que el Hijo del Hombre tiene potestad en la tierra para perdonar pecados (dijo al paralítico):', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 2, 11, NULL, 'A ti te digo: Levántate, toma tu lecho, y vete a tu casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 2, 12, NULL, 'Entonces él se levantó en seguida, y tomando su lecho, salió delante de todos, de manera que todos se asombraron, y glorificaron a Dios, diciendo: Nunca hemos visto tal cosa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 2, 13, 'Llamamiento de Leví', 'Después volvió a salir al mar; y toda la gente venía a él, y les enseñaba.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 2, 14, NULL, 'Y al pasar, vio a Leví hijo de Alfeo, sentado al banco de los tributos públicos, y le dijo: Sígueme. Y levantándose, le siguió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 2, 15, NULL, 'Aconteció que estando Jesús a la mesa en casa de él, muchos publicanos y pecadores estaban también a la mesa juntamente con Jesús y sus discípulos; porque había muchos que le habían seguido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 2, 16, NULL, 'Y los escribas y los fariseos, viéndole comer con los publicanos y con los pecadores, dijeron a los discípulos: ¿Qué es esto, que él come y bebe con los publicanos y pecadores?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 2, 17, NULL, 'Al oír esto Jesús, les dijo: Los sanos no tienen necesidad de médico, sino los enfermos. No he venido a llamar a justos, sino a pecadores.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 2, 18, 'La pregunta sobre el ayuno', 'Y los discípulos de Juan y los de los fariseos ayunaban; y vinieron, y le dijeron: ¿Por qué los discípulos de Juan y los de los fariseos ayunan, y tus discípulos no ayunan?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 2, 19, NULL, 'Jesús les dijo: ¿Acaso pueden los que están de bodas ayunar mientras está con ellos el esposo? Entre tanto que tienen consigo al esposo, no pueden ayunar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 2, 20, NULL, 'Pero vendrán días cuando el esposo les será quitado, y entonces en aquellos días ayunarán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 2, 21, NULL, 'Nadie pone remiendo de paño nuevo en vestido viejo; de otra manera, el mismo remiendo nuevo tira de lo viejo, y se hace peor la rotura.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 2, 22, NULL, 'Y nadie echa vino nuevo en odres viejos; de otra manera, el vino nuevo rompe los odres, y el vino se derrama, y los odres se pierden; pero el vino nuevo en odres nuevos se ha de echar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 2, 23, 'Los discípulos recogen espigas en el día de reposo', 'Aconteció que al pasar él por los sembrados un día de reposo, sus discípulos, andando, comenzaron a arrancar espigas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 2, 24, NULL, 'Entonces los fariseos le dijeron: Mira, ¿por qué hacen en el día de reposo lo que no es lícito?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 2, 25, NULL, 'Pero él les dijo: ¿Nunca leísteis lo que hizo David cuando tuvo necesidad, y sintió hambre, él y los que con él estaban;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 2, 26, NULL, 'cómo entró en la casa de Dios, siendo Abiatar sumo sacerdote, y comió los panes de la proposición, de los cuales no es lícito comer sino a los sacerdotes, y aun dio a los que con él estaban?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 2, 27, NULL, 'También les dijo: El día de reposo fue hecho por causa del hombre, y no el hombre por causa del día de reposo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 2, 28, NULL, 'Por tanto, el Hijo del Hombre es Señor aun del día de reposo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 3, 1, 'El hombre de la mano seca', 'Otra vez entró Jesús en la sinagoga; y había allí un hombre que tenía seca una mano.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 3, 2, NULL, 'Y le acechaban para ver si en el día de reposo le sanaría, a fin de poder acusarle.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 3, 3, NULL, 'Entonces dijo al hombre que tenía la mano seca: Levántate y ponte en medio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 3, 4, NULL, 'Y les dijo: ¿Es lícito en los días de reposo hacer bien, o hacer mal; salvar la vida, o quitarla? Pero ellos callaban.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 3, 5, NULL, 'Entonces, mirándolos alrededor con enojo, entristecido por la dureza de sus corazones, dijo al hombre: Extiende tu mano. Y él la extendió, y la mano le fue restaurada sana.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 3, 6, NULL, 'Y salidos los fariseos, tomaron consejo con los herodianos contra él para destruirle.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 3, 7, 'La multitud a la orilla del mar', 'Mas Jesús se retiró al mar con sus discípulos, y le siguió gran multitud de Galilea. Y de Judea,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 3, 8, NULL, 'de Jerusalén, de Idumea, del otro lado del Jordán, y de los alrededores de Tiro y de Sidón, oyendo cuán grandes cosas hacía, grandes multitudes vinieron a él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 3, 9, NULL, 'Y dijo a sus discípulos que le tuviesen siempre lista la barca, a causa del gentío, para que no le oprimiesen.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 3, 10, NULL, 'Porque había sanado a muchos; de manera que por tocarle, cuantos tenían plagas caían sobre él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 3, 11, NULL, 'Y los espíritus inmundos, al verle, se postraban delante de él, y daban voces, diciendo: Tú eres el Hijo de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 3, 12, NULL, 'Mas él les reprendía mucho para que no le descubriesen.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 3, 13, 'Elección de los doce apóstoles', 'Después subió al monte, y llamó a sí a los que él quiso; y vinieron a él.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 3, 14, NULL, 'Y estableció a doce, para que estuviesen con él, y para enviarlos a predicar,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 3, 15, NULL, 'y que tuviesen autoridad para sanar enfermedades y para echar fuera demonios:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 3, 16, NULL, 'a Simón, a quien puso por sobrenombre Pedro;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 3, 17, NULL, 'a Jacobo hijo de Zebedeo, y a Juan hermano de Jacobo, a quienes apellidó Boanerges, esto es, Hijos del trueno;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 3, 18, NULL, 'a Andrés, Felipe, Bartolomé, Mateo, Tomás, Jacobo hijo de Alfeo, Tadeo, Simón el cananista,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 3, 19, NULL, 'y Judas Iscariote, el que le entregó. Y vinieron a casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 3, 20, 'La blasfemia contra el Espíritu Santo', 'Y se agolpó de nuevo la gente, de modo que ellos ni aun podían comer pan.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 3, 21, NULL, 'Cuando lo oyeron los suyos, vinieron para prenderle; porque decían: Está fuera de sí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 3, 22, NULL, 'Pero los escribas que habían venido de Jerusalén decían que tenía a Beelzebú, y que por el príncipe de los demonios echaba fuera los demonios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 3, 23, NULL, 'Y habiéndolos llamado, les decía en parábolas: ¿Cómo puede Satanás echar fuera a Satanás?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 3, 24, NULL, 'Si un reino está dividido contra sí mismo, tal reino no puede permanecer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 3, 25, NULL, 'Y si una casa está dividida contra sí misma, tal casa no puede permanecer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 3, 26, NULL, 'Y si Satanás se levanta contra sí mismo, y se divide, no puede permanecer, sino que ha llegado su fin.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 3, 27, NULL, 'Ninguno puede entrar en la casa de un hombre fuerte y saquear sus bienes, si antes no le ata, y entonces podrá saquear su casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 3, 28, NULL, 'De cierto os digo que todos los pecados serán perdonados a los hijos de los hombres, y las blasfemias cualesquiera que sean;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 3, 29, NULL, 'pero cualquiera que blasfeme contra el Espíritu Santo, no tiene jamás perdón, sino que es reo de juicio eterno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 3, 30, NULL, 'Porque ellos habían dicho: Tiene espíritu inmundo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 3, 31, 'La madre y los hermanos de Jesús', 'Vienen después sus hermanos y su madre, y quedándose afuera, enviaron a llamarle.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 3, 32, NULL, 'Y la gente que estaba sentada alrededor de él le dijo: Tu madre y tus hermanos están afuera, y te buscan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 3, 33, NULL, 'Él les respondió diciendo: ¿Quién es mi madre y mis hermanos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 3, 34, NULL, 'Y mirando a los que estaban sentados alrededor de él, dijo: He aquí mi madre y mis hermanos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 3, 35, NULL, 'Porque todo aquel que hace la voluntad de Dios, ese es mi hermano, y mi hermana, y mi madre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 1, 'Parábola del sembrador', 'Otra vez comenzó Jesús a enseñar junto al mar, y se reunió alrededor de él mucha gente, tanto que entrando en una barca, se sentó en ella en el mar; y toda la gente estaba en tierra junto al mar.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 2, NULL, 'Y les enseñaba por parábolas muchas cosas, y les decía en su doctrina:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 3, NULL, 'Oíd: He aquí, el sembrador salió a sembrar;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 4, NULL, 'y al sembrar, aconteció que una parte cayó junto al camino, y vinieron las aves del cielo y la comieron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 5, NULL, 'Otra parte cayó en pedregales, donde no tenía mucha tierra; y brotó pronto, porque no tenía profundidad de tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 6, NULL, 'Pero salido el sol, se quemó; y porque no tenía raíz, se secó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 7, NULL, 'Otra parte cayó entre espinos; y los espinos crecieron y la ahogaron, y no dio fruto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 8, NULL, 'Pero otra parte cayó en buena tierra, y dio fruto, pues brotó y creció, y produjo a treinta, a sesenta, y a ciento por uno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 9, NULL, 'Entonces les dijo: El que tiene oídos para oír, oiga.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 10, NULL, 'Cuando estuvo solo, los que estaban cerca de él con los doce le preguntaron sobre la parábola.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 11, NULL, 'Y les dijo: A vosotros os es dado saber el misterio del reino de Dios; mas a los que están fuera, por parábolas todas las cosas;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 12, NULL, 'para que viendo, vean y no perciban; y oyendo, oigan y no entiendan; para que no se conviertan, y les sean perdonados los pecados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 13, NULL, 'Y les dijo: ¿No sabéis esta parábola? ¿Cómo, pues, entenderéis todas las parábolas?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 14, NULL, 'El sembrador es el que siembra la palabra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 15, NULL, 'Y estos son los de junto al camino: en quienes se siembra la palabra, pero después que la oyen, en seguida viene Satanás, y quita la palabra que se sembró en sus corazones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 16, NULL, 'Estos son asimismo los que fueron sembrados en pedregales: los que cuando han oído la palabra, al momento la reciben con gozo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 17, NULL, 'pero no tienen raíz en sí, sino que son de corta duración, porque cuando viene la tribulación o la persecución por causa de la palabra, luego tropiezan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 18, NULL, 'Estos son los que fueron sembrados entre espinos: los que oyen la palabra,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 19, NULL, 'pero los afanes de este siglo, y el engaño de las riquezas, y las codicias de otras cosas, entran y ahogan la palabra, y se hace infructuosa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 20, NULL, 'Y estos son los que fueron sembrados en buena tierra: los que oyen la palabra y la reciben, y dan fruto a treinta, a sesenta, y a ciento por uno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 21, 'Nada oculto que no haya de ser manifestado', 'También les dijo: ¿Acaso se trae la luz para ponerla debajo del almud, o debajo de la cama? ¿No es para ponerla en el candelero?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 22, NULL, 'Porque no hay nada oculto que no haya de ser manifestado; ni escondido, que no haya de salir a luz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 23, NULL, 'Si alguno tiene oídos para oír, oiga.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 24, NULL, 'Les dijo también: Mirad lo que oís; porque con la medida con que medís, os será medido, y aun se os añadirá a vosotros los que oís.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 25, NULL, 'Porque al que tiene, se le dará; y al que no tiene, aun lo que tiene se le quitará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 26, 'Parábola del crecimiento de la semilla', 'Decía además: Así es el reino de Dios, como cuando un hombre echa semilla en la tierra;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 27, NULL, 'y duerme y se levanta, de noche y de día, y la semilla brota y crece sin que él sepa cómo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 28, NULL, 'Porque de suyo lleva fruto la tierra, primero hierba, luego espiga, después grano lleno en la espiga;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 29, NULL, 'y cuando el fruto está maduro, en seguida se mete la hoz, porque la siega ha llegado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 30, 'Parábola de la semilla de mostaza', 'Decía también: ¿A qué haremos semejante el reino de Dios, o con qué parábola lo compararemos?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 31, NULL, 'Es como el grano de mostaza, que cuando se siembra en tierra, es la más pequeña de todas las semillas que hay en la tierra;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 32, NULL, 'pero después de sembrado, crece, y se hace la mayor de todas las hortalizas, y echa grandes ramas, de tal manera que las aves del cielo pueden morar bajo su sombra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 33, 'El uso que Jesús hace de las parábolas', 'Con muchas parábolas como estas les hablaba la palabra, conforme a lo que podían oír.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 34, NULL, 'Y sin parábolas no les hablaba; aunque a sus discípulos en particular les declaraba todo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 35, 'Jesús calma la tempestad', 'Aquel día, cuando llegó la noche, les dijo: Pasemos al otro lado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 36, NULL, 'Y despidiendo a la multitud, le tomaron como estaba, en la barca; y había también con él otras barcas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 37, NULL, 'Pero se levantó una gran tempestad de viento, y echaba las olas en la barca, de tal manera que ya se anegaba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 38, NULL, 'Y él estaba en la popa, durmiendo sobre un cabezal; y le despertaron, y le dijeron: Maestro, ¿no tienes cuidado que perecemos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 39, NULL, 'Y levantándose, reprendió al viento, y dijo al mar: Calla, enmudece. Y cesó el viento, y se hizo grande bonanza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 40, NULL, 'Y les dijo: ¿Por qué estáis así amedrentados? ¿Cómo no tenéis fe?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 4, 41, NULL, 'Entonces temieron con gran temor, y se decían el uno al otro: ¿Quién es este, que aun el viento y el mar le obedecen?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 1, 'El endemoniado gadareno', 'Vinieron al otro lado del mar, a la región de los gadarenos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 2, NULL, 'Y cuando salió él de la barca, en seguida vino a su encuentro, de los sepulcros, un hombre con un espíritu inmundo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 3, NULL, 'que tenía su morada en los sepulcros, y nadie podía atarle, ni aun con cadenas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 4, NULL, 'Porque muchas veces había sido atado con grillos y cadenas, mas las cadenas habían sido hechas pedazos por él, y desmenuzados los grillos; y nadie le podía dominar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 5, NULL, 'Y siempre, de día y de noche, andaba dando voces en los montes y en los sepulcros, e hiriéndose con piedras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 6, NULL, 'Cuando vio, pues, a Jesús de lejos, corrió, y se arrodilló ante él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 7, NULL, 'Y clamando a gran voz, dijo: ¿Qué tienes conmigo, Jesús, Hijo del Dios Altísimo? Te conjuro por Dios que no me atormentes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 8, NULL, 'Porque le decía: Sal de este hombre, espíritu inmundo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 9, NULL, 'Y le preguntó: ¿Cómo te llamas? Y respondió diciendo: Legión me llamo; porque somos muchos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 10, NULL, 'Y le rogaba mucho que no los enviase fuera de aquella región.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 11, NULL, 'Estaba allí cerca del monte un gran hato de cerdos paciendo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 12, NULL, 'Y le rogaron todos los demonios, diciendo: Envíanos a los cerdos para que entremos en ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 13, NULL, 'Y luego Jesús les dio permiso. Y saliendo aquellos espíritus inmundos, entraron en los cerdos, los cuales eran como dos mil; y el hato se precipitó en el mar por un despeñadero, y en el mar se ahogaron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 14, NULL, 'Y los que apacentaban los cerdos huyeron, y dieron aviso en la ciudad y en los campos. Y salieron a ver qué era aquello que había sucedido.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 15, NULL, 'Vienen a Jesús, y ven al que había sido atormentado del demonio, y que había tenido la legión, sentado, vestido y en su juicio cabal; y tuvieron miedo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 16, NULL, 'Y les contaron los que lo habían visto, cómo le había acontecido al que había tenido el demonio, y lo de los cerdos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 17, NULL, 'Y comenzaron a rogarle que se fuera de sus contornos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 18, NULL, 'Al entrar él en la barca, el que había estado endemoniado le rogaba que le dejase estar con él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 19, NULL, 'Mas Jesús no se lo permitió, sino que le dijo: Vete a tu casa, a los tuyos, y cuéntales cuán grandes cosas el Señor ha hecho contigo, y cómo ha tenido misericordia de ti.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 20, NULL, 'Y se fue, y comenzó a publicar en Decápolis cuán grandes cosas había hecho Jesús con él; y todos se maravillaban.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 21, 'La hija de Jairo, y la mujer que tocó el manto de Jesús', 'Pasando otra vez Jesús en una barca a la otra orilla, se reunió alrededor de él una gran multitud; y él estaba junto al mar.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 22, NULL, 'Y vino uno de los principales de la sinagoga, llamado Jairo; y luego que le vio, se postró a sus pies,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 23, NULL, 'y le rogaba mucho, diciendo: Mi hija está agonizando; ven y pon las manos sobre ella para que sea salva, y vivirá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 24, NULL, 'Fue, pues, con él; y le seguía una gran multitud, y le apretaban.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 25, NULL, 'Pero una mujer que desde hacía doce años padecía de flujo de sangre,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 26, NULL, 'y había sufrido mucho de muchos médicos, y gastado todo lo que tenía, y nada había aprovechado, antes le iba peor,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 27, NULL, 'cuando oyó hablar de Jesús, vino por detrás entre la multitud, y tocó su manto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 28, NULL, 'Porque decía: Si tocare tan solamente su manto, seré salva.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 29, NULL, 'Y en seguida la fuente de su sangre se secó; y sintió en el cuerpo que estaba sana de aquel azote.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 30, NULL, 'Luego Jesús, conociendo en sí mismo el poder que había salido de él, volviéndose a la multitud, dijo: ¿Quién ha tocado mis vestidos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 31, NULL, 'Sus discípulos le dijeron: Ves que la multitud te aprieta, y dices: ¿Quién me ha tocado?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 32, NULL, 'Pero él miraba alrededor para ver quién había hecho esto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 33, NULL, 'Entonces la mujer, temiendo y temblando, sabiendo lo que en ella había sido hecho, vino y se postró delante de él, y le dijo toda la verdad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 34, NULL, 'Y él le dijo: Hija, tu fe te ha hecho salva; ve en paz, y queda sana de tu azote.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 35, NULL, 'Mientras él aún hablaba, vinieron de casa del principal de la sinagoga, diciendo: Tu hija ha muerto; ¿para qué molestas más al Maestro?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 36, NULL, 'Pero Jesús, luego que oyó lo que se decía, dijo al principal de la sinagoga: No temas, cree solamente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 37, NULL, 'Y no permitió que le siguiese nadie sino Pedro, Jacobo, y Juan hermano de Jacobo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 38, NULL, 'Y vino a casa del principal de la sinagoga, y vio el alboroto y a los que lloraban y lamentaban mucho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 39, NULL, 'Y entrando, les dijo: ¿Por qué alborotáis y lloráis? La niña no está muerta, sino duerme.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 40, NULL, 'Y se burlaban de él. Mas él, echando fuera a todos, tomó al padre y a la madre de la niña, y a los que estaban con él, y entró donde estaba la niña.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 41, NULL, 'Y tomando la mano de la niña, le dijo: Talita cumi; que traducido es: Niña, a ti te digo, levántate.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 42, NULL, 'Y luego la niña se levantó y andaba, pues tenía doce años. Y se espantaron grandemente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 5, 43, NULL, 'Pero él les mandó mucho que nadie lo supiese, y dijo que se le diese de comer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 1, 'Jesús en Nazaret', 'Salió Jesús de allí y vino a su tierra, y le seguían sus discípulos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 2, NULL, 'Y llegado el día de reposo, comenzó a enseñar en la sinagoga; y muchos, oyéndole, se admiraban, y decían: ¿De dónde tiene este estas cosas? ¿Y qué sabiduría es esta que le es dada, y estos milagros que por sus manos son hechos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 3, NULL, '¿No es este el carpintero, hijo de María, hermano de Jacobo, de José, de Judas y de Simón? ¿No están también aquí con nosotros sus hermanas? Y se escandalizaban de él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 4, NULL, 'Mas Jesús les decía: No hay profeta sin honra sino en su propia tierra, y entre sus parientes, y en su casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 5, NULL, 'Y no pudo hacer allí ningún milagro, salvo que sanó a unos pocos enfermos, poniendo sobre ellos las manos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 6, NULL, 'Y estaba asombrado de la incredulidad de ellos. Y recorría las aldeas de alrededor, enseñando.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 7, 'Misión de los doce discípulos', 'Después llamó a los doce, y comenzó a enviarlos de dos en dos; y les dio autoridad sobre los espíritus inmundos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 8, NULL, 'Y les mandó que no llevasen nada para el camino, sino solamente bordón; ni alforja, ni pan, ni dinero en el cinto,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 9, NULL, 'sino que calzasen sandalias, y no vistiesen dos túnicas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 10, NULL, 'Y les dijo: Dondequiera que entréis en una casa, posad en ella hasta que salgáis de aquel lugar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 11, NULL, 'Y si en algún lugar no os recibieren ni os oyeren, salid de allí, y sacudid el polvo que está debajo de vuestros pies, para testimonio a ellos. De cierto os digo que en el día del juicio, será más tolerable el castigo para los de Sodoma y Gomorra, que para aquella ciudad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 12, NULL, 'Y saliendo, predicaban que los hombres se arrepintiesen.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 13, NULL, 'Y echaban fuera muchos demonios, y ungían con aceite a muchos enfermos, y los sanaban.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 14, 'Muerte de Juan el Bautista', 'Oyó el rey Herodes la fama de Jesús, porque su nombre se había hecho notorio; y dijo: Juan el Bautista ha resucitado de los muertos, y por eso actúan en él estos poderes.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 15, NULL, 'Otros decían: Es Elías. Y otros decían: Es un profeta, o alguno de los profetas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 16, NULL, 'Al oír esto Herodes, dijo: Este es Juan, el que yo decapité, que ha resucitado de los muertos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 17, NULL, 'Porque el mismo Herodes había enviado y prendido a Juan, y le había encadenado en la cárcel por causa de Herodías, mujer de Felipe su hermano; pues la había tomado por mujer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 18, NULL, 'Porque Juan decía a Herodes: No te es lícito tener la mujer de tu hermano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 19, NULL, 'Pero Herodías le acechaba, y deseaba matarle, y no podía;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 20, NULL, 'porque Herodes temía a Juan, sabiendo que era varón justo y santo, y le guardaba a salvo; y oyéndole, se quedaba muy perplejo, pero le escuchaba de buena gana.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 21, NULL, 'Pero venido un día oportuno, en que Herodes, en la fiesta de su cumpleaños, daba una cena a sus príncipes y tribunos y a los principales de Galilea,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 22, NULL, 'entrando la hija de Herodías, danzó, y agradó a Herodes y a los que estaban con él a la mesa; y el rey dijo a la muchacha: Pídeme lo que quieras, y yo te lo daré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 23, NULL, 'Y le juró: Todo lo que me pidas te daré, hasta la mitad de mi reino.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 24, NULL, 'Saliendo ella, dijo a su madre: ¿Qué pediré? Y ella le dijo: La cabeza de Juan el Bautista.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 25, NULL, 'Entonces ella entró prontamente al rey, y pidió diciendo: Quiero que ahora mismo me des en un plato la cabeza de Juan el Bautista.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 26, NULL, 'Y el rey se entristeció mucho; pero a causa del juramento, y de los que estaban con él a la mesa, no quiso desecharla.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 27, NULL, 'Y en seguida el rey, enviando a uno de la guardia, mandó que fuese traída la cabeza de Juan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 28, NULL, 'El guarda fue, le decapitó en la cárcel, y trajo su cabeza en un plato y la dio a la muchacha, y la muchacha la dio a su madre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 29, NULL, 'Cuando oyeron esto sus discípulos, vinieron y tomaron su cuerpo, y lo pusieron en un sepulcro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 30, 'Alimentación de los cinco mil', 'Entonces los apóstoles se juntaron con Jesús, y le contaron todo lo que habían hecho, y lo que habían enseñado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 31, NULL, 'Él les dijo: Venid vosotros aparte a un lugar desierto, y descansad un poco. Porque eran muchos los que iban y venían, de manera que ni aun tenían tiempo para comer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 32, NULL, 'Y se fueron solos en una barca a un lugar desierto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 33, NULL, 'Pero muchos los vieron ir, y le reconocieron; y muchos fueron allá a pie desde las ciudades, y llegaron antes que ellos, y se juntaron a él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 34, NULL, 'Y salió Jesús y vio una gran multitud, y tuvo compasión de ellos, porque eran como ovejas que no tenían pastor; y comenzó a enseñarles muchas cosas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 35, NULL, 'Cuando ya era muy avanzada la hora, sus discípulos se acercaron a él, diciendo: El lugar es desierto, y la hora ya muy avanzada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 36, NULL, 'Despídelos para que vayan a los campos y aldeas de alrededor, y compren pan, pues no tienen qué comer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 37, NULL, 'Respondiendo él, les dijo: Dadles vosotros de comer. Ellos le dijeron: ¿Que vayamos y compremos pan por doscientos denarios, y les demos de comer?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 38, NULL, 'Él les dijo: ¿Cuántos panes tenéis? Id y vedlo. Y al saberlo, dijeron: Cinco, y dos peces.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 39, NULL, 'Y les mandó que hiciesen recostar a todos por grupos sobre la hierba verde.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 40, NULL, 'Y se recostaron por grupos, de ciento en ciento, y de cincuenta en cincuenta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 41, NULL, 'Entonces tomó los cinco panes y los dos peces, y levantando los ojos al cielo, bendijo, y partió los panes, y dio a sus discípulos para que los pusiesen delante; y repartió los dos peces entre todos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 42, NULL, 'Y comieron todos, y se saciaron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 43, NULL, 'Y recogieron de los pedazos doce cestas llenas, y de lo que sobró de los peces.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 44, NULL, 'Y los que comieron eran cinco mil hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 45, 'Jesús anda sobre el mar', 'En seguida hizo a sus discípulos entrar en la barca e ir delante de él a Betsaida, en la otra ribera, entre tanto que él despedía a la multitud.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 46, NULL, 'Y después que los hubo despedido, se fue al monte a orar;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 47, NULL, 'y al venir la noche, la barca estaba en medio del mar, y él solo en tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 48, NULL, 'Y viéndoles remar con gran fatiga, porque el viento les era contrario, cerca de la cuarta vigilia de la noche vino a ellos andando sobre el mar, y quería adelantárseles.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 49, NULL, 'Viéndole ellos andar sobre el mar, pensaron que era un fantasma, y gritaron;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 50, NULL, 'porque todos le veían, y se turbaron. Pero en seguida habló con ellos, y les dijo: ¡Tened ánimo; yo soy, no temáis!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 51, NULL, 'Y subió a ellos en la barca, y se calmó el viento; y ellos se asombraron en gran manera, y se maravillaban.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 52, NULL, 'Porque aún no habían entendido lo de los panes, por cuanto estaban endurecidos sus corazones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 53, 'Jesús sana a los enfermos en Genesaret', 'Terminada la travesía, vinieron a tierra de Genesaret, y arribaron a la orilla.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 54, NULL, 'Y saliendo ellos de la barca, en seguida la gente le conoció.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 55, NULL, 'Y recorriendo toda la tierra de alrededor, comenzaron a traer de todas partes enfermos en lechos, a donde oían que estaba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 6, 56, NULL, 'Y dondequiera que entraba, en aldeas, ciudades o campos, ponían en las calles a los que estaban enfermos, y le rogaban que les dejase tocar siquiera el borde de su manto; y todos los que le tocaban quedaban sanos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 7, 1, 'Lo que contamina al hombre', 'Se juntaron a Jesús los fariseos, y algunos de los escribas, que habían venido de Jerusalén;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 7, 2, NULL, 'los cuales, viendo a algunos de los discípulos de Jesús comer pan con manos inmundas, esto es, no lavadas, los condenaban.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 7, 3, NULL, 'Porque los fariseos y todos los judíos, aferrándose a la tradición de los ancianos, si muchas veces no se lavan las manos, no comen.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 7, 4, NULL, 'Y volviendo de la plaza, si no se lavan, no comen. Y otras muchas cosas hay que tomaron para guardar, como los lavamientos de los vasos de beber, y de los jarros, y de los utensilios de metal, y de los lechos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 7, 5, NULL, 'Le preguntaron, pues, los fariseos y los escribas: ¿Por qué tus discípulos no andan conforme a la tradición de los ancianos, sino que comen pan con manos inmundas?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 7, 6, NULL, 'Respondiendo él, les dijo: Hipócritas, bien profetizó de vosotros Isaías, como está escrito: Este pueblo de labios me honra, Mas su corazón está lejos de mí.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 7, 7, NULL, 'Pues en vano me honran, Enseñando como doctrinas mandamientos de hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 7, 8, NULL, 'Porque dejando el mandamiento de Dios, os aferráis a la tradición de los hombres: los lavamientos de los jarros y de los vasos de beber; y hacéis otras muchas cosas semejantes.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 7, 9, NULL, 'Les decía también: Bien invalidáis el mandamiento de Dios para guardar vuestra tradición.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 7, 10, NULL, 'Porque Moisés dijo: Honra a tu padre y a tu madre; y: El que maldiga al padre o a la madre, muera irremisiblemente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 7, 11, NULL, 'Pero vosotros decís: Basta que diga un hombre al padre o a la madre: Es Corbán (que quiere decir, mi ofrenda a Dios) todo aquello con que pudiera ayudarte,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 7, 12, NULL, 'y no le dejáis hacer más por su padre o por su madre,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 7, 13, NULL, 'invalidando la palabra de Dios con vuestra tradición que habéis transmitido. Y muchas cosas hacéis semejantes a estas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 7, 14, NULL, 'Y llamando a sí a toda la multitud, les dijo: Oídme todos, y entended:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 7, 15, NULL, 'Nada hay fuera del hombre que entre en él, que le pueda contaminar; pero lo que sale de él, eso es lo que contamina al hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 7, 16, NULL, 'Si alguno tiene oídos para oír, oiga.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 7, 17, NULL, 'Cuando se alejó de la multitud y entró en casa, le preguntaron sus discípulos sobre la parábola.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 7, 18, NULL, 'Él les dijo: ¿También vosotros estáis así sin entendimiento? ¿No entendéis que todo lo de fuera que entra en el hombre, no le puede contaminar,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 7, 19, NULL, 'porque no entra en su corazón, sino en el vientre, y sale a la letrina? Esto decía, haciendo limpios todos los alimentos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 7, 20, NULL, 'Pero decía, que lo que del hombre sale, eso contamina al hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 7, 21, NULL, 'Porque de dentro, del corazón de los hombres, salen los malos pensamientos, los adulterios, las fornicaciones, los homicidios,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 7, 22, NULL, 'los hurtos, las avaricias, las maldades, el engaño, la lascivia, la envidia, la maledicencia, la soberbia, la insensatez.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 7, 23, NULL, 'Todas estas maldades de dentro salen, y contaminan al hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 7, 24, 'La fe de la mujer sirofenicia', 'Levantándose de allí, se fue a la región de Tiro y de Sidón; y entrando en una casa, no quiso que nadie lo supiese; pero no pudo esconderse.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 7, 25, NULL, 'Porque una mujer, cuya hija tenía un espíritu inmundo, luego que oyó de él, vino y se postró a sus pies.', 0, 'spa', 'RVR1960', NULL);\n"
;

  public static final String SQL_PARTE_2 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Mr', 7, 26, NULL, 'La mujer era griega, y sirofenicia de nación; y le rogaba que echase fuera de su hija al demonio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 7, 27, NULL, 'Pero Jesús le dijo: Deja primero que se sacien los hijos, porque no está bien tomar el pan de los hijos y echarlo a los perrillos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 7, 28, NULL, 'Respondió ella y le dijo: Sí, Señor; pero aun los perrillos, debajo de la mesa, comen de las migajas de los hijos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 7, 29, NULL, 'Entonces le dijo: Por esta palabra, ve; el demonio ha salido de tu hija.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 7, 30, NULL, 'Y cuando llegó ella a su casa, halló que el demonio había salido, y a la hija acostada en la cama.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 7, 31, 'Jesús sana a un sordomudo', 'Volviendo a salir de la región de Tiro, vino por Sidón al mar de Galilea, pasando por la región de Decápolis.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 7, 32, NULL, 'Y le trajeron un sordo y tartamudo, y le rogaron que le pusiera la mano encima.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 7, 33, NULL, 'Y tomándole aparte de la gente, metió los dedos en las orejas de él, y escupiendo, tocó su lengua;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 7, 34, NULL, 'y levantando los ojos al cielo, gimió, y le dijo: Efata, es decir: Sé abierto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 7, 35, NULL, 'Al momento fueron abiertos sus oídos, y se desató la ligadura de su lengua, y hablaba bien.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 7, 36, NULL, 'Y les mandó que no lo dijesen a nadie; pero cuanto más les mandaba, tanto más y más lo divulgaban.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 7, 37, NULL, 'Y en gran manera se maravillaban, diciendo: bien lo ha hecho todo; hace a los sordos oír, y a los mudos hablar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 8, 1, 'Alimentación de los cuatro mil', 'En aquellos días, como había una gran multitud, y no tenían qué comer, Jesús llamó a sus discípulos, y les dijo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 8, 2, NULL, 'Tengo compasión de la gente, porque ya hace tres días que están conmigo, y no tienen qué comer;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 8, 3, NULL, 'y si los enviare en ayunas a sus casas, se desmayarán en el camino, pues algunos de ellos han venido de lejos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 8, 4, NULL, 'Sus discípulos le respondieron: ¿De dónde podrá alguien saciar de pan a estos aquí en el desierto?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 8, 5, NULL, 'Él les preguntó: ¿Cuántos panes tenéis? Ellos dijeron: Siete.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 8, 6, NULL, 'Entonces mandó a la multitud que se recostase en tierra; y tomando los siete panes, habiendo dado gracias, los partió, y dio a sus discípulos para que los pusiesen delante; y los pusieron delante de la multitud.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 8, 7, NULL, 'Tenían también unos pocos pececillos; y los bendijo, y mandó que también los pusiesen delante.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 8, 8, NULL, 'Y comieron, y se saciaron; y recogieron de los pedazos que habían sobrado, siete canastas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 8, 9, NULL, 'Eran los que comieron, como cuatro mil; y los despidió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 8, 10, NULL, 'Y luego entrando en la barca con sus discípulos, vino a la región de Dalmanuta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 8, 11, 'La demanda de una señal', 'Vinieron entonces los fariseos y comenzaron a discutir con él, pidiéndole señal del cielo, para tentarle.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 8, 12, NULL, 'Y gimiendo en su espíritu, dijo: ¿Por qué pide señal esta generación? De cierto os digo que no se dará señal a esta generación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 8, 13, NULL, 'Y dejándolos, volvió a entrar en la barca, y se fue a la otra ribera.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 8, 14, 'La levadura de los fariseos', 'Habían olvidado de traer pan, y no tenían sino un pan consigo en la barca.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 8, 15, NULL, 'Y él les mandó, diciendo: Mirad, guardaos de la levadura de los fariseos, y de la levadura de Herodes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 8, 16, NULL, 'Y discutían entre sí, diciendo: Es porque no trajimos pan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 8, 17, NULL, 'Y entendiéndolo Jesús, les dijo: ¿Qué discutís, porque no tenéis pan? ¿No entendéis ni comprendéis? ¿Aún tenéis endurecido vuestro corazón?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 8, 18, NULL, '¿Teniendo ojos no veis, y teniendo oídos no oís? ¿Y no recordáis?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 8, 19, NULL, 'Cuando partí los cinco panes entre cinco mil, ¿cuántas cestas llenas de los pedazos recogisteis? Y ellos dijeron: Doce.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 8, 20, NULL, 'Y cuando los siete panes entre cuatro mil, ¿cuántas canastas llenas de los pedazos recogisteis? Y ellos dijeron: Siete.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 8, 21, NULL, 'Y les dijo: ¿Cómo aún no entendéis?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 8, 22, 'Un ciego sanado en Betsaida', 'Vino luego a Betsaida; y le trajeron un ciego, y le rogaron que le tocase.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 8, 23, NULL, 'Entonces, tomando la mano del ciego, le sacó fuera de la aldea; y escupiendo en sus ojos, le puso las manos encima, y le preguntó si veía algo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 8, 24, NULL, 'Él, mirando, dijo: Veo los hombres como árboles, pero los veo que andan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 8, 25, NULL, 'Luego le puso otra vez las manos sobre los ojos, y le hizo que mirase; y fue restablecido, y vio de lejos y claramente a todos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 8, 26, NULL, 'Y lo envió a su casa, diciendo: No entres en la aldea, ni lo digas a nadie en la aldea.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 8, 27, 'La confesión de Pedro', 'Salieron Jesús y sus discípulos por las aldeas de Cesarea de Filipo. Y en el camino preguntó a sus discípulos, diciéndoles: ¿Quién dicen los hombres que soy yo?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 8, 28, NULL, 'Ellos respondieron: Unos, Juan el Bautista; otros, Elías; y otros, alguno de los profetas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 8, 29, NULL, 'Entonces él les dijo: Y vosotros, ¿quién decís que soy? Respondiendo Pedro, le dijo: Tú eres el Cristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 8, 30, NULL, 'Pero él les mandó que no dijesen esto de él a ninguno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 8, 31, 'Jesús anuncia su muerte', 'Y comenzó a enseñarles que le era necesario al Hijo del Hombre padecer mucho, y ser desechado por los ancianos, por los principales sacerdotes y por los escribas, y ser muerto, y resucitar después de tres días.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 8, 32, NULL, 'Esto les decía claramente. Entonces Pedro le tomó aparte y comenzó a reconvenirle.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 8, 33, NULL, 'Pero él, volviéndose y mirando a los discípulos, reprendió a Pedro, diciendo: ¡Quítate de delante de mí, Satanás! porque no pones la mira en las cosas de Dios, sino en las de los hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 8, 34, NULL, 'Y llamando a la gente y a sus discípulos, les dijo: Si alguno quiere venir en pos de mí, niéguese a sí mismo, y tome su cruz, y sígame.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 8, 35, NULL, 'Porque todo el que quiera salvar su vida, la perderá; y todo el que pierda su vida por causa de mí y del evangelio, la salvará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 8, 36, NULL, 'Porque ¿qué aprovechará al hombre si ganare todo el mundo, y perdiere su alma?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 8, 37, NULL, '¿O qué recompensa dará el hombre por su alma?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 8, 38, NULL, 'Porque el que se avergonzare de mí y de mis palabras en esta generación adúltera y pecadora, el Hijo del Hombre se avergonzará también de él, cuando venga en la gloria de su Padre con los santos ángeles.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 1, NULL, 'También les dijo: De cierto os digo que hay algunos de los que están aquí, que no gustarán la muerte hasta que hayan visto el reino de Dios venido con poder.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 2, 'La transfiguración', 'Seis días después, Jesús tomó a Pedro, a Jacobo y a Juan, y los llevó aparte solos a un monte alto; y se transfiguró delante de ellos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 3, NULL, 'Y sus vestidos se volvieron resplandecientes, muy blancos, como la nieve, tanto que ningún lavador en la tierra los puede hacer tan blancos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 4, NULL, 'Y les apareció Elías con Moisés, que hablaban con Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 5, NULL, 'Entonces Pedro dijo a Jesús: Maestro, bueno es para nosotros que estemos aquí; y hagamos tres enramadas, una para ti, otra para Moisés, y otra para Elías.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 6, NULL, 'Porque no sabía lo que hablaba, pues estaban espantados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 7, NULL, 'Entonces vino una nube que les hizo sombra, y desde la nube una voz que decía: Este es mi Hijo amado; a él oíd.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 8, NULL, 'Y luego, cuando miraron, no vieron más a nadie consigo, sino a Jesús solo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 9, NULL, 'Y descendiendo ellos del monte, les mandó que a nadie dijesen lo que habían visto, sino cuando el Hijo del Hombre hubiese resucitado de los muertos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 10, NULL, 'Y guardaron la palabra entre sí, discutiendo qué sería aquello de resucitar de los muertos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 11, NULL, 'Y le preguntaron, diciendo: ¿Por qué dicen los escribas que es necesario que Elías venga primero?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 12, NULL, 'Respondiendo él, les dijo: Elías a la verdad vendrá primero, y restaurará todas las cosas; ¿y cómo está escrito del Hijo del Hombre, que padezca mucho y sea tenido en nada?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 13, NULL, 'Pero os digo que Elías ya vino, y le hicieron todo lo que quisieron, como está escrito de él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 14, 'Jesús sana a un muchacho endemoniado', 'Cuando llegó a donde estaban los discípulos, vio una gran multitud alrededor de ellos, y escribas que disputaban con ellos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 15, NULL, 'Y en seguida toda la gente, viéndole, se asombró, y corriendo a él, le saludaron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 16, NULL, 'Él les preguntó: ¿Qué disputáis con ellos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 17, NULL, 'Y respondiendo uno de la multitud, dijo: Maestro, traje a ti a mi hijo, que tiene un espíritu mudo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 18, NULL, 'el cual, dondequiera que le toma, le sacude; y echa espumarajos, y cruje los dientes, y se va secando; y dije a tus discípulos que lo echasen fuera, y no pudieron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 19, NULL, 'Y respondiendo él, les dijo: ¡Oh generación incrédula! ¿Hasta cuándo he de estar con vosotros? ¿Hasta cuándo os he de soportar? Traédmelo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 20, NULL, 'Y se lo trajeron; y cuando el espíritu vio a Jesús, sacudió con violencia al muchacho, quien cayendo en tierra se revolcaba, echando espumarajos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 21, NULL, 'Jesús preguntó al padre: ¿Cuánto tiempo hace que le sucede esto? Y él dijo: Desde niño.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 22, NULL, 'Y muchas veces le echa en el fuego y en el agua, para matarle; pero si puedes hacer algo, ten misericordia de nosotros, y ayúdanos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 23, NULL, 'Jesús le dijo: Si puedes creer, al que cree todo le es posible.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 24, NULL, 'E inmediatamente el padre del muchacho clamó y dijo: Creo; ayuda mi incredulidad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 25, NULL, 'Y cuando Jesús vio que la multitud se agolpaba, reprendió al espíritu inmundo, diciéndole: Espíritu mudo y sordo, yo te mando, sal de él, y no entres más en él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 26, NULL, 'Entonces el espíritu, clamando y sacudiéndole con violencia, salió; y él quedó como muerto, de modo que muchos decían: Está muerto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 27, NULL, 'Pero Jesús, tomándole de la mano, le enderezó; y se levantó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 28, NULL, 'Cuando él entró en casa, sus discípulos le preguntaron aparte: ¿Por qué nosotros no pudimos echarle fuera?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 29, NULL, 'Y les dijo: Este género con nada puede salir, sino con oración y ayuno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 30, 'Jesús anuncia otra vez su muerte', 'Habiendo salido de allí, caminaron por Galilea; y no quería que nadie lo supiese.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 31, NULL, 'Porque enseñaba a sus discípulos, y les decía: El Hijo del Hombre será entregado en manos de hombres, y le matarán; pero después de muerto, resucitará al tercer día.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 32, NULL, 'Pero ellos no entendían esta palabra, y tenían miedo de preguntarle.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 33, '¿Quién es el mayor?', 'Y llegó a Capernaum; y cuando estuvo en casa, les preguntó: ¿Qué disputabais entre vosotros en el camino?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 34, NULL, 'Mas ellos callaron; porque en el camino habían disputado entre sí, quién había de ser el mayor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 35, NULL, 'Entonces él se sentó y llamó a los doce, y les dijo: Si alguno quiere ser el primero, será el postrero de todos, y el servidor de todos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 36, NULL, 'Y tomó a un niño, y lo puso en medio de ellos; y tomándole en sus brazos, les dijo:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 37, NULL, 'El que reciba en mi nombre a un niño como este, me recibe a mí; y el que a mí me recibe, no me recibe a mí sino al que me envió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 38, 'El que no es contra nosotros, por nosotros es', 'Juan le respondió diciendo: Maestro, hemos visto a uno que en tu nombre echaba fuera demonios, pero él no nos sigue; y se lo prohibimos, porque no nos seguía.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 39, NULL, 'Pero Jesús dijo: No se lo prohibáis; porque ninguno hay que haga milagro en mi nombre, que luego pueda decir mal de mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 40, NULL, 'Porque el que no es contra nosotros, por nosotros es.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 41, NULL, 'Y cualquiera que os diere un vaso de agua en mi nombre, porque sois de Cristo, de cierto os digo que no perderá su recompensa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 42, 'Ocasiones de caer', 'Cualquiera que haga tropezar a uno de estos pequeñitos que creen en mí, mejor le fuera si se le atase una piedra de molino al cuello, y se le arrojase en el mar.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 43, NULL, 'Si tu mano te fuere ocasión de caer, córtala; mejor te es entrar en la vida manco, que teniendo dos manos ir al infierno, al fuego que no puede ser apagado,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 44, NULL, 'donde el gusano de ellos no muere, y el fuego nunca se apaga.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 45, NULL, 'Y si tu pie te fuere ocasión de caer, córtalo; mejor te es entrar a la vida cojo, que teniendo dos pies ser echado en el infierno, al fuego que no puede ser apagado,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 46, NULL, 'donde el gusano de ellos no muere, y el fuego nunca se apaga.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 47, NULL, 'Y si tu ojo te fuere ocasión de caer, sácalo; mejor te es entrar en el reino de Dios con un ojo, que teniendo dos ojos ser echado al infierno,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 48, NULL, 'donde el gusano de ellos no muere, y el fuego nunca se apaga.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 49, NULL, 'Porque todos serán salados con fuego, y todo sacrificio será salado con sal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 9, 50, NULL, 'Buena es la sal; mas si la sal se hace insípida, ¿con qué la sazonaréis? Tened sal en vosotros mismos; y tened paz los unos con los otros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 1, 'Jesús enseña sobre el divorcio', 'Levantándose de allí, vino a la región de Judea y al otro lado del Jordán; y volvió el pueblo a juntarse a él, y de nuevo les enseñaba como solía.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 2, NULL, 'Y se acercaron los fariseos y le preguntaron, para tentarle, si era lícito al marido repudiar a su mujer.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 3, NULL, 'Él, respondiendo, les dijo: ¿Qué os mandó Moisés?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 4, NULL, 'Ellos dijeron: Moisés permitió dar carta de divorcio, y repudiarla.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 5, NULL, 'Y respondiendo Jesús, les dijo: Por la dureza de vuestro corazón os escribió este mandamiento;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 6, NULL, 'pero al principio de la creación, varón y hembra los hizo Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 7, NULL, 'Por esto dejará el hombre a su padre y a su madre, y se unirá a su mujer,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 8, NULL, 'y los dos serán una sola carne; así que no son ya más dos, sino uno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 9, NULL, 'Por tanto, lo que Dios juntó, no lo separe el hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 10, NULL, 'En casa volvieron los discípulos a preguntarle de lo mismo,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 11, NULL, 'y les dijo: Cualquiera que repudia a su mujer y se casa con otra, comete adulterio contra ella;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 12, NULL, 'y si la mujer repudia a su marido y se casa con otro, comete adulterio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 13, 'Jesús bendice a los niños', 'Y le presentaban niños para que los tocase; y los discípulos reprendían a los que los presentaban.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 14, NULL, 'Viéndolo Jesús, se indignó, y les dijo: Dejad a los niños venir a mí, y no se lo impidáis; porque de los tales es el reino de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 15, NULL, 'De cierto os digo, que el que no reciba el reino de Dios como un niño, no entrará en él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 16, NULL, 'Y tomándolos en los brazos, poniendo las manos sobre ellos, los bendecía.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 17, 'El joven rico', 'Al salir él para seguir su camino, vino uno corriendo, e hincando la rodilla delante de él, le preguntó: Maestro bueno, ¿qué haré para heredar la vida eterna?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 18, NULL, 'Jesús le dijo: ¿Por qué me llamas bueno? Ninguno hay bueno, sino solo uno, Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 19, NULL, 'Los mandamientos sabes: No adulteres. No mates. No hurtes. No digas falso testimonio. No defraudes. Honra a tu padre y a tu madre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 20, NULL, 'Él entonces, respondiendo, le dijo: Maestro, todo esto lo he guardado desde mi juventud.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 21, NULL, 'Entonces Jesús, mirándole, le amó, y le dijo: Una cosa te falta: anda, vende todo lo que tienes, y dalo a los pobres, y tendrás tesoro en el cielo; y ven, sígueme, tomando tu cruz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 22, NULL, 'Pero él, afligido por esta palabra, se fue triste, porque tenía muchas posesiones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 23, NULL, 'Entonces Jesús, mirando alrededor, dijo a sus discípulos: ¡Cuán difícilmente entrarán en el reino de Dios los que tienen riquezas!', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 24, NULL, 'Los discípulos se asombraron de sus palabras; pero Jesús, respondiendo, volvió a decirles: Hijos, ¡cuán difícil les es entrar en el reino de Dios, a los que confían en las riquezas!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 25, NULL, 'Más fácil es pasar un camello por el ojo de una aguja, que entrar un rico en el reino de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 26, NULL, 'Ellos se asombraban aún más, diciendo entre sí: ¿Quién, pues, podrá ser salvo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 27, NULL, 'Entonces Jesús, mirándolos, dijo: Para los hombres es imposible, mas para Dios, no; porque todas las cosas son posibles para Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 28, NULL, 'Entonces Pedro comenzó a decirle: He aquí, nosotros lo hemos dejado todo, y te hemos seguido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 29, NULL, 'Respondió Jesús y dijo: De cierto os digo que no hay ninguno que haya dejado casa, o hermanos, o hermanas, o padre, o madre, o mujer, o hijos, o tierras, por causa de mí y del evangelio,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 30, NULL, 'que no reciba cien veces más ahora en este tiempo; casas, hermanos, hermanas, madres, hijos, y tierras, con persecuciones; y en el siglo venidero la vida eterna.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 31, NULL, 'Pero muchos primeros serán postreros, y los postreros, primeros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 32, 'Nuevamente Jesús anuncia su muerte', 'Iban por el camino subiendo a Jerusalén; y Jesús iba delante, y ellos se asombraron, y le seguían con miedo. Entonces volviendo a tomar a los doce aparte, les comenzó a decir las cosas que le habían de acontecer:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 33, NULL, 'He aquí subimos a Jerusalén, y el Hijo del Hombre será entregado a los principales sacerdotes y a los escribas, y le condenarán a muerte, y le entregarán a los gentiles;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 34, NULL, 'y le escarnecerán, le azotarán, y escupirán en él, y le matarán; mas al tercer día resucitará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 35, 'Petición de Santiago y de Juan', 'Entonces Jacobo y Juan, hijos de Zebedeo, se le acercaron, diciendo: Maestro, querríamos que nos hagas lo que pidiéremos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 36, NULL, 'Él les dijo: ¿Qué queréis que os haga?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 37, NULL, 'Ellos le dijeron: Concédenos que en tu gloria nos sentemos el uno a tu derecha, y el otro a tu izquierda.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 38, NULL, 'Entonces Jesús les dijo: No sabéis lo que pedís. ¿Podéis beber del vaso que yo bebo, o ser bautizados con el bautismo con que yo soy bautizado?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 39, NULL, 'Ellos dijeron: Podemos. Jesús les dijo: A la verdad, del vaso que yo bebo, beberéis, y con el bautismo con que yo soy bautizado, seréis bautizados;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 40, NULL, 'pero el sentaros a mi derecha y a mi izquierda, no es mío darlo, sino a aquellos para quienes está preparado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 41, NULL, 'Cuando lo oyeron los diez, comenzaron a enojarse contra Jacobo y contra Juan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 42, NULL, 'Mas Jesús, llamándolos, les dijo: Sabéis que los que son tenidos por gobernantes de las naciones se enseñorean de ellas, y sus grandes ejercen sobre ellas potestad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 43, NULL, 'Pero no será así entre vosotros, sino que el que quiera hacerse grande entre vosotros será vuestro servidor,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 44, NULL, 'y el que de vosotros quiera ser el primero, será siervo de todos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 45, NULL, 'Porque el Hijo del Hombre no vino para ser servido, sino para servir, y para dar su vida en rescate por muchos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 46, 'El ciego Bartimeo recibe la vista', 'Entonces vinieron a Jericó; y al salir de Jericó él y sus discípulos y una gran multitud, Bartimeo el ciego, hijo de Timeo, estaba sentado junto al camino mendigando.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 47, NULL, 'Y oyendo que era Jesús nazareno, comenzó a dar voces y a decir: ¡Jesús, Hijo de David, ten misericordia de mí!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 48, NULL, 'Y muchos le reprendían para que callase, pero él clamaba mucho más: ¡Hijo de David, ten misericordia de mí!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 49, NULL, 'Entonces Jesús, deteniéndose, mandó llamarle; y llamaron al ciego, diciéndole: Ten confianza; levántate, te llama.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 50, NULL, 'Él entonces, arrojando su capa, se levantó y vino a Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 51, NULL, 'Respondiendo Jesús, le dijo: ¿Qué quieres que te haga? Y el ciego le dijo: Maestro, que recobre la vista.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 10, 52, NULL, 'Y Jesús le dijo: Vete, tu fe te ha salvado. Y en seguida recobró la vista, y seguía a Jesús en el camino.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 11, 1, 'La entrada triunfal en Jerusalén', 'Cuando se acercaban a Jerusalén, junto a Betfagé y a Betania, frente al monte de los Olivos, Jesús envió dos de sus discípulos,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 11, 2, NULL, 'y les dijo: Id a la aldea que está enfrente de vosotros, y luego que entréis en ella, hallaréis un pollino atado, en el cual ningún hombre ha montado; desatadlo y traedlo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 11, 3, NULL, 'Y si alguien os dijere: ¿Por qué hacéis eso? decid que el Señor lo necesita, y que luego lo devolverá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 11, 4, NULL, 'Fueron, y hallaron el pollino atado afuera a la puerta, en el recodo del camino, y lo desataron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 11, 5, NULL, 'Y unos de los que estaban allí les dijeron: ¿Qué hacéis desatando el pollino?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 11, 6, NULL, 'Ellos entonces les dijeron como Jesús había mandado; y los dejaron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 11, 7, NULL, 'Y trajeron el pollino a Jesús, y echaron sobre él sus mantos, y se sentó sobre él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 11, 8, NULL, 'También muchos tendían sus mantos por el camino, y otros cortaban ramas de los árboles, y las tendían por el camino.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 11, 9, NULL, 'Y los que iban delante y los que venían detrás daban voces, diciendo: ¡Hosanna! ¡Bendito el que viene en el nombre del Señor!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 11, 10, NULL, '¡Bendito el reino de nuestro padre David que viene! ¡Hosanna en las alturas!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 11, 11, NULL, 'Y entró Jesús en Jerusalén, y en el templo; y habiendo mirado alrededor todas las cosas, como ya anochecía, se fue a Betania con los doce.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 11, 12, 'Maldición de la higuera estéril', 'Al día siguiente, cuando salieron de Betania, tuvo hambre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 11, 13, NULL, 'Y viendo de lejos una higuera que tenía hojas, fue a ver si tal vez hallaba en ella algo; pero cuando llegó a ella, nada halló sino hojas, pues no era tiempo de higos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 11, 14, NULL, 'Entonces Jesús dijo a la higuera: Nunca jamás coma nadie fruto de ti. Y lo oyeron sus discípulos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 11, 15, 'Purificación del templo', 'Vinieron, pues, a Jerusalén; y entrando Jesús en el templo, comenzó a echar fuera a los que vendían y compraban en el templo; y volcó las mesas de los cambistas, y las sillas de los que vendían palomas;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 11, 16, NULL, 'y no consentía que nadie atravesase el templo llevando utensilio alguno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 11, 17, NULL, 'Y les enseñaba, diciendo: ¿No está escrito: Mi casa será llamada casa de oración para todas las naciones? Mas vosotros la habéis hecho cueva de ladrones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 11, 18, NULL, 'Y lo oyeron los escribas y los principales sacerdotes, y buscaban cómo matarle; porque le tenían miedo, por cuanto todo el pueblo estaba admirado de su doctrina.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 11, 19, NULL, 'Pero al llegar la noche, Jesús salió de la ciudad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 11, 20, 'La higuera maldecida se seca', 'Y pasando por la mañana, vieron que la higuera se había secado desde las raíces.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 11, 21, NULL, 'Entonces Pedro, acordándose, le dijo: Maestro, mira, la higuera que maldijiste se ha secado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 11, 22, NULL, 'Respondiendo Jesús, les dijo: Tened fe en Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 11, 23, NULL, 'Porque de cierto os digo que cualquiera que dijere a este monte: Quítate y échate en el mar, y no dudare en su corazón, sino creyere que será hecho lo que dice, lo que diga le será hecho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 11, 24, NULL, 'Por tanto, os digo que todo lo que pidiereis orando, creed que lo recibiréis, y os vendrá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 11, 25, NULL, 'Y cuando estéis orando, perdonad, si tenéis algo contra alguno, para que también vuestro Padre que está en los cielos os perdone a vosotros vuestras ofensas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 11, 26, NULL, 'Porque si vosotros no perdonáis, tampoco vuestro Padre que está en los cielos os perdonará vuestras ofensas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 11, 27, 'La autoridad de Jesús', 'Volvieron entonces a Jerusalén; y andando él por el templo, vinieron a él los principales sacerdotes, los escribas y los ancianos,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 11, 28, NULL, 'y le dijeron: ¿Con qué autoridad haces estas cosas, y quién te dio autoridad para hacer estas cosas?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 11, 29, NULL, 'Jesús, respondiendo, les dijo: Os haré yo también una pregunta; respondedme, y os diré con qué autoridad hago estas cosas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 11, 30, NULL, 'El bautismo de Juan, ¿era del cielo, o de los hombres? Respondedme.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 11, 31, NULL, 'Entonces ellos discutían entre sí, diciendo: Si decimos, del cielo, dirá: ¿Por qué, pues, no le creísteis?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 11, 32, NULL, '¿Y si decimos, de los hombres…? Pero temían al pueblo, pues todos tenían a Juan como un verdadero profeta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 11, 33, NULL, 'Así que, respondiendo, dijeron a Jesús: No sabemos. Entonces respondiendo Jesús, les dijo: Tampoco yo os digo con qué autoridad hago estas cosas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 1, 'Los labradores malvados', 'Entonces comenzó Jesús a decirles por parábolas: Un hombre plantó una viña, la cercó de vallado, cavó un lagar, edificó una torre, y la arrendó a unos labradores, y se fue lejos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 2, NULL, 'Y a su tiempo envió un siervo a los labradores, para que recibiese de estos del fruto de la viña.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 3, NULL, 'Mas ellos, tomándole, le golpearon, y le enviaron con las manos vacías.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 4, NULL, 'Volvió a enviarles otro siervo; pero apedreándole, le hirieron en la cabeza, y también le enviaron afrentado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 5, NULL, 'Volvió a enviar otro, y a este mataron; y a otros muchos, golpeando a unos y matando a otros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 6, NULL, 'Por último, teniendo aún un hijo suyo, amado, lo envió también a ellos, diciendo: Tendrán respeto a mi hijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 7, NULL, 'Mas aquellos labradores dijeron entre sí: Este es el heredero; venid, matémosle, y la heredad será nuestra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 8, NULL, 'Y tomándole, le mataron, y le echaron fuera de la viña.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 9, NULL, '¿Qué, pues, hará el señor de la viña? Vendrá, y destruirá a los labradores, y dará su viña a otros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 10, NULL, '¿Ni aun esta escritura habéis leído: La piedra que desecharon los edificadores Ha venido a ser cabeza del ángulo;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 11, NULL, 'El Señor ha hecho esto, Y es cosa maravillosa a nuestros ojos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 12, NULL, 'Y procuraban prenderle, porque entendían que decía contra ellos aquella parábola; pero temían a la multitud, y dejándole, se fueron.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 13, 'La cuestión del tributo', 'Y le enviaron algunos de los fariseos y de los herodianos, para que le sorprendiesen en alguna palabra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 14, NULL, 'Viniendo ellos, le dijeron: Maestro, sabemos que eres hombre veraz, y que no te cuidas de nadie; porque no miras la apariencia de los hombres, sino que con verdad enseñas el camino de Dios. ¿Es lícito dar tributo a César, o no? ¿Daremos, o no daremos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 15, NULL, 'Mas él, percibiendo la hipocresía de ellos, les dijo: ¿Por qué me tentáis? Traedme la moneda para que la vea.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 16, NULL, 'Ellos se la trajeron; y les dijo: ¿De quién es esta imagen y la inscripción? Ellos le dijeron: De César.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 17, NULL, 'Respondiendo Jesús, les dijo: Dad a César lo que es de César, y a Dios lo que es de Dios. Y se maravillaron de él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 18, 'La pregunta sobre la resurrección', 'Entonces vinieron a él los saduceos, que dicen que no hay resurrección, y le preguntaron, diciendo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 19, NULL, 'Maestro, Moisés nos escribió que si el hermano de alguno muriere y dejare esposa, pero no dejare hijos, que su hermano se case con ella, y levante descendencia a su hermano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 20, NULL, 'Hubo siete hermanos; el primero tomó esposa, y murió sin dejar descendencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 21, NULL, 'Y el segundo se casó con ella, y murió, y tampoco dejó descendencia; y el tercero, de la misma manera.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 22, NULL, 'Y así los siete, y no dejaron descendencia; y después de todos murió también la mujer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 23, NULL, 'En la resurrección, pues, cuando resuciten, ¿de cuál de ellos será ella mujer, ya que los siete la tuvieron por mujer?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 24, NULL, 'Entonces respondiendo Jesús, les dijo: ¿No erráis por esto, porque ignoráis las Escrituras, y el poder de Dios?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 25, NULL, 'Porque cuando resuciten de los muertos, ni se casarán ni se darán en casamiento, sino serán como los ángeles que están en los cielos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 26, NULL, 'Pero respecto a que los muertos resucitan, ¿no habéis leído en el libro de Moisés cómo le habló Dios en la zarza, diciendo: Yo soy el Dios de Abraham, el Dios de Isaac y el Dios de Jacob?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 27, NULL, 'Dios no es Dios de muertos, sino Dios de vivos; así que vosotros mucho erráis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 28, 'El gran mandamiento', 'Acercándose uno de los escribas, que los había oído disputar, y sabía que les había respondido bien, le preguntó: ¿Cuál es el primer mandamiento de todos?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 29, NULL, 'Jesús le respondió: El primer mandamiento de todos es: Oye, Israel; el Señor nuestro Dios, el Señor uno es.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 30, NULL, 'Y amarás al Señor tu Dios con todo tu corazón, y con toda tu alma, y con toda tu mente y con todas tus fuerzas. Este es el principal mandamiento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 31, NULL, 'Y el segundo es semejante: Amarás a tu prójimo como a ti mismo. No hay otro mandamiento mayor que estos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 32, NULL, 'Entonces el escriba le dijo: Bien, Maestro, verdad has dicho, que uno es Dios, y no hay otro fuera de él;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 33, NULL, 'y el amarle con todo el corazón, con todo el entendimiento, con toda el alma, y con todas las fuerzas, y amar al prójimo como a uno mismo, es más que todos los holocaustos y sacrificios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 34, NULL, 'Jesús entonces, viendo que había respondido sabiamente, le dijo: No estás lejos del reino de Dios. Y ya ninguno osaba preguntarle.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 35, '¿De quién es hijo el Cristo?', 'Enseñando Jesús en el templo, decía: ¿Cómo dicen los escribas que el Cristo es hijo de David?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 36, NULL, 'Porque el mismo David dijo por el Espíritu Santo: Dijo el Señor a mi Señor: Siéntate a mi diestra, Hasta que ponga tus enemigos por estrado de tus pies.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 37, NULL, 'David mismo le llama Señor; ¿cómo, pues, es su hijo? Y gran multitud del pueblo le oía de buena gana.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 38, 'Jesús acusa a los escribas', 'Y les decía en su doctrina: Guardaos de los escribas, que gustan de andar con largas ropas, y aman las salutaciones en las plazas,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 39, NULL, 'y las primeras sillas en las sinagogas, y los primeros asientos en las cenas;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 40, NULL, 'que devoran las casas de las viudas, y por pretexto hacen largas oraciones. Estos recibirán mayor condenación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 41, 'La ofrenda de la viuda', 'Estando Jesús sentado delante del arca de la ofrenda, miraba cómo el pueblo echaba dinero en el arca; y muchos ricos echaban mucho.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 42, NULL, 'Y vino una viuda pobre, y echó dos blancas, o sea un cuadrante.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 43, NULL, 'Entonces llamando a sus discípulos, les dijo: De cierto os digo que esta viuda pobre echó más que todos los que han echado en el arca;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 12, 44, NULL, 'porque todos han echado de lo que les sobra; pero esta, de su pobreza echó todo lo que tenía, todo su sustento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 13, 1, 'Jesús predice la destrucción del templo', 'Saliendo Jesús del templo, le dijo uno de sus discípulos: Maestro, mira qué piedras, y qué edificios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 13, 2, NULL, 'Jesús, respondiendo, le dijo: ¿Ves estos grandes edificios? No quedará piedra sobre piedra, que no sea derribada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 13, 3, 'Señales antes del fin', 'Y se sentó en el monte de los Olivos, frente al templo. Y Pedro, Jacobo, Juan y Andrés le preguntaron aparte:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 13, 4, NULL, 'Dinos, ¿cuándo serán estas cosas? ¿Y qué señal habrá cuando todas estas cosas hayan de cumplirse?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 13, 5, NULL, 'Jesús, respondiéndoles, comenzó a decir: Mirad que nadie os engañe;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 13, 6, NULL, 'porque vendrán muchos en mi nombre, diciendo: Yo soy el Cristo; y engañarán a muchos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 13, 7, NULL, 'Mas cuando oigáis de guerras y de rumores de guerras, no os turbéis, porque es necesario que suceda así; pero aún no es el fin.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 13, 8, NULL, 'Porque se levantará nación contra nación, y reino contra reino; y habrá terremotos en muchos lugares, y habrá hambres y alborotos; principios de dolores son estos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 13, 9, NULL, 'Pero mirad por vosotros mismos; porque os entregarán a los concilios, y en las sinagogas os azotarán; y delante de gobernadores y de reyes os llevarán por causa de mí, para testimonio a ellos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 13, 10, NULL, 'Y es necesario que el evangelio sea predicado antes a todas las naciones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 13, 11, NULL, 'Pero cuando os trajeren para entregaros, no os preocupéis por lo que habéis de decir, ni lo penséis, sino lo que os fuere dado en aquella hora, eso hablad; porque no sois vosotros los que habláis, sino el Espíritu Santo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 13, 12, NULL, 'Y el hermano entregará a la muerte al hermano, y el padre al hijo; y se levantarán los hijos contra los padres, y los matarán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 13, 13, NULL, 'Y seréis aborrecidos de todos por causa de mi nombre; mas el que persevere hasta el fin, este será salvo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 13, 14, NULL, 'Pero cuando veáis la abominación desoladora de que habló el profeta Daniel, puesta donde no debe estar (el que lee, entienda), entonces los que estén en Judea huyan a los montes.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 13, 15, NULL, 'El que esté en la azotea, no descienda a la casa, ni entre para tomar algo de su casa;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 13, 16, NULL, 'y el que esté en el campo, no vuelva atrás a tomar su capa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 13, 17, NULL, 'Mas ¡ay de las que estén encintas, y de las que críen en aquellos días!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 13, 18, NULL, 'Orad, pues, que vuestra huida no sea en invierno;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 13, 19, NULL, 'porque aquellos días serán de tribulación cual nunca ha habido desde el principio de la creación que Dios creó, hasta este tiempo, ni la habrá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 13, 20, NULL, 'Y si el Señor no hubiese acortado aquellos días, nadie sería salvo; mas por causa de los escogidos que él escogió, acortó aquellos días.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 13, 21, NULL, 'Entonces si alguno os dijere: Mirad, aquí está el Cristo; o, mirad, allí está, no le creáis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 13, 22, NULL, 'Porque se levantarán falsos Cristos y falsos profetas, y harán señales y prodigios, para engañar, si fuese posible, aun a los escogidos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 13, 23, NULL, 'Mas vosotros mirad; os lo he dicho todo antes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 13, 24, 'La venida del Hijo del Hombre', 'Pero en aquellos días, después de aquella tribulación, el sol se oscurecerá, y la luna no dará su resplandor,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 13, 25, NULL, 'y las estrellas caerán del cielo, y las potencias que están en los cielos serán conmovidas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 13, 26, NULL, 'Entonces verán al Hijo del Hombre, que vendrá en las nubes con gran poder y gloria.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 13, 27, NULL, 'Y entonces enviará sus ángeles, y juntará a sus escogidos de los cuatro vientos, desde el extremo de la tierra hasta el extremo del cielo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 13, 28, NULL, 'De la higuera aprended la parábola: Cuando ya su rama está tierna, y brotan las hojas, sabéis que el verano está cerca.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 13, 29, NULL, 'Así también vosotros, cuando veáis que suceden estas cosas, conoced que está cerca, a las puertas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 13, 30, NULL, 'De cierto os digo, que no pasará esta generación hasta que todo esto acontezca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 13, 31, NULL, 'El cielo y la tierra pasarán, pero mis palabras no pasarán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 13, 32, NULL, 'Pero de aquel día y de la hora nadie sabe, ni aun los ángeles que están en el cielo, ni el Hijo, sino el Padre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 13, 33, NULL, 'Mirad, velad y orad; porque no sabéis cuándo será el tiempo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 13, 34, NULL, 'Es como el hombre que yéndose lejos, dejó su casa, y dio autoridad a sus siervos, y a cada uno su obra, y al portero mandó que velase.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 13, 35, NULL, 'Velad, pues, porque no sabéis cuándo vendrá el señor de la casa; si al anochecer, o a la medianoche, o al canto del gallo, o a la mañana;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 13, 36, NULL, 'para que cuando venga de repente, no os halle durmiendo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 13, 37, NULL, 'Y lo que a vosotros digo, a todos lo digo: Velad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 1, 'El complot para prender a Jesús', 'Dos días después era la pascua, y la fiesta de los panes sin levadura; y buscaban los principales sacerdotes y los escribas cómo prenderle por engaño y matarle.', 1, 'spa', 'RVR1960', NULL);\n"
;

  public static final String SQL_PARTE_3 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Mr', 14, 2, NULL, 'Y decían: No durante la fiesta para que no se haga alboroto del pueblo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 3, 'Jesús es ungido en Betania', 'Pero estando él en Betania, en casa de Simón el leproso, y sentado a la mesa, vino una mujer con un vaso de alabastro de perfume de nardo puro de mucho precio; y quebrando el vaso de alabastro, se lo derramó sobre su cabeza.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 4, NULL, 'Y hubo algunos que se enojaron dentro de sí, y dijeron: ¿Para qué se ha hecho este desperdicio de perfume?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 5, NULL, 'Porque podía haberse vendido por más de trescientos denarios, y haberse dado a los pobres. Y murmuraban contra ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 6, NULL, 'Pero Jesús dijo: Dejadla, ¿por qué la molestáis? Buena obra me ha hecho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 7, NULL, 'Siempre tendréis a los pobres con vosotros, y cuando queráis les podréis hacer bien; pero a mí no siempre me tendréis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 8, NULL, 'Esta ha hecho lo que podía; porque se ha anticipado a ungir mi cuerpo para la sepultura.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 9, NULL, 'De cierto os digo que dondequiera que se predique este evangelio, en todo el mundo, también se contará lo que esta ha hecho, para memoria de ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 10, 'Judas ofrece entregar a Jesús', 'Entonces Judas Iscariote, uno de los doce, fue a los principales sacerdotes para entregárselo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 11, NULL, 'Ellos, al oírlo, se alegraron, y prometieron darle dinero. Y Judas buscaba oportunidad para entregarle.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 12, 'Institución de la Cena del Señor', 'El primer día de la fiesta de los panes sin levadura, cuando sacrificaban el cordero de la pascua, sus discípulos le dijeron: ¿Dónde quieres que vayamos a preparar para que comas la pascua?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 13, NULL, 'Y envió dos de sus discípulos, y les dijo: Id a la ciudad, y os saldrá al encuentro un hombre que lleva un cántaro de agua; seguidle,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 14, NULL, 'y donde entrare, decid al señor de la casa: El Maestro dice: ¿Dónde está el aposento donde he de comer la pascua con mis discípulos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 15, NULL, 'Y él os mostrará un gran aposento alto ya dispuesto; preparad para nosotros allí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 16, NULL, 'Fueron sus discípulos y entraron en la ciudad, y hallaron como les había dicho; y prepararon la pascua.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 17, NULL, 'Y cuando llegó la noche, vino él con los doce.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 18, NULL, 'Y cuando se sentaron a la mesa, mientras comían, dijo Jesús: De cierto os digo que uno de vosotros, que come conmigo, me va a entregar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 19, NULL, 'Entonces ellos comenzaron a entristecerse, y a decirle uno por uno: ¿Seré yo? Y el otro: ¿Seré yo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 20, NULL, 'Él, respondiendo, les dijo: Es uno de los doce, el que moja conmigo en el plato.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 21, NULL, 'A la verdad el Hijo del Hombre va, según está escrito de él, mas ¡ay de aquel hombre por quien el Hijo del Hombre es entregado! Bueno le fuera a ese hombre no haber nacido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 22, NULL, 'Y mientras comían, Jesús tomó pan y bendijo, y lo partió y les dio, diciendo: Tomad, esto es mi cuerpo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 23, NULL, 'Y tomando la copa, y habiendo dado gracias, les dio; y bebieron de ella todos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 24, NULL, 'Y les dijo: Esto es mi sangre del nuevo pacto, que por muchos es derramada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 25, NULL, 'De cierto os digo que no beberé más del fruto de la vid, hasta aquel día en que lo beba nuevo en el reino de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 26, 'Jesús anuncia la negación de Pedro', 'Cuando hubieron cantado el himno, salieron al monte de los Olivos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 27, NULL, 'Entonces Jesús les dijo: Todos os escandalizaréis de mí esta noche; porque escrito está: Heriré al pastor, y las ovejas serán dispersadas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 28, NULL, 'Pero después que haya resucitado, iré delante de vosotros a Galilea.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 29, NULL, 'Entonces Pedro le dijo: Aunque todos se escandalicen, yo no.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 30, NULL, 'Y le dijo Jesús: De cierto te digo que tú, hoy, en esta noche, antes que el gallo haya cantado dos veces, me negarás tres veces.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 31, NULL, 'Mas él con mayor insistencia decía: Si me fuere necesario morir contigo, no te negaré. También todos decían lo mismo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 32, 'Jesús ora en Getsemaní', 'Vinieron, pues, a un lugar que se llama Getsemaní, y dijo a sus discípulos: Sentaos aquí, entre tanto que yo oro.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 33, NULL, 'Y tomó consigo a Pedro, a Jacobo y a Juan, y comenzó a entristecerse y a angustiarse.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 34, NULL, 'Y les dijo: Mi alma está muy triste, hasta la muerte; quedaos aquí y velad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 35, NULL, 'Yéndose un poco adelante, se postró en tierra, y oró que si fuese posible, pasase de él aquella hora.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 36, NULL, 'Y decía: Abba, Padre, todas las cosas son posibles para ti; aparta de mí esta copa; mas no lo que yo quiero, sino lo que tú.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 37, NULL, 'Vino luego y los halló durmiendo; y dijo a Pedro: Simón, ¿duermes? ¿No has podido velar una hora?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 38, NULL, 'Velad y orad, para que no entréis en tentación; el espíritu a la verdad está dispuesto, pero la carne es débil.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 39, NULL, 'Otra vez fue y oró, diciendo las mismas palabras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 40, NULL, 'Al volver, otra vez los halló durmiendo, porque los ojos de ellos estaban cargados de sueño; y no sabían qué responderle.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 41, NULL, 'Vino la tercera vez, y les dijo: Dormid ya, y descansad. Basta, la hora ha venido; he aquí, el Hijo del Hombre es entregado en manos de los pecadores.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 42, NULL, 'Levantaos, vamos; he aquí, se acerca el que me entrega.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 43, 'Arresto de Jesús', 'Luego, hablando él aún, vino Judas, que era uno de los doce, y con él mucha gente con espadas y palos, de parte de los principales sacerdotes y de los escribas y de los ancianos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 44, NULL, 'Y el que le entregaba les había dado señal, diciendo: Al que yo besare, ese es; prendedle, y llevadle con seguridad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 45, NULL, 'Y cuando vino, se acercó luego a él, y le dijo: Maestro, Maestro. Y le besó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 46, NULL, 'Entonces ellos le echaron mano, y le prendieron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 47, NULL, 'Pero uno de los que estaban allí, sacando la espada, hirió al siervo del sumo sacerdote, cortándole la oreja.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 48, NULL, 'Y respondiendo Jesús, les dijo: ¿Como contra un ladrón habéis salido con espadas y con palos para prenderme?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 49, NULL, 'Cada día estaba con vosotros enseñando en el templo, y no me prendisteis; pero es así, para que se cumplan las Escrituras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 50, NULL, 'Entonces todos los discípulos, dejándole, huyeron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 51, 'El joven que huyó', 'Pero cierto joven le seguía, cubierto el cuerpo con una sábana; y le prendieron;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 52, NULL, 'mas él, dejando la sábana, huyó desnudo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 53, 'Jesús ante el concilio', 'Trajeron, pues, a Jesús al sumo sacerdote; y se reunieron todos los principales sacerdotes y los ancianos y los escribas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 54, NULL, 'Y Pedro le siguió de lejos hasta dentro del patio del sumo sacerdote; y estaba sentado con los alguaciles, calentándose al fuego.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 55, NULL, 'Y los principales sacerdotes y todo el concilio buscaban testimonio contra Jesús, para entregarle a la muerte; pero no lo hallaban.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 56, NULL, 'Porque muchos decían falso testimonio contra él, mas sus testimonios no concordaban.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 57, NULL, 'Entonces levantándose unos, dieron falso testimonio contra él, diciendo:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 58, NULL, 'Nosotros le hemos oído decir: Yo derribaré este templo hecho a mano, y en tres días edificaré otro hecho sin mano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 59, NULL, 'Pero ni aun así concordaban en el testimonio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 60, NULL, 'Entonces el sumo sacerdote, levantándose en medio, preguntó a Jesús, diciendo: ¿No respondes nada? ¿Qué testifican estos contra ti?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 61, NULL, 'Mas él callaba, y nada respondía. El sumo sacerdote le volvió a preguntar, y le dijo: ¿Eres tú el Cristo, el Hijo del Bendito?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 62, NULL, 'Y Jesús le dijo: Yo soy; y veréis al Hijo del Hombre sentado a la diestra del poder de Dios, y viniendo en las nubes del cielo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 63, NULL, 'Entonces el sumo sacerdote, rasgando su vestidura, dijo: ¿Qué más necesidad tenemos de testigos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 64, NULL, 'Habéis oído la blasfemia; ¿qué os parece? Y todos ellos le condenaron, declarándole ser digno de muerte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 65, NULL, 'Y algunos comenzaron a escupirle, y a cubrirle el rostro y a darle de puñetazos, y a decirle: Profetiza. Y los alguaciles le daban de bofetadas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 66, 'Pedro niega a Jesús', 'Estando Pedro abajo, en el patio, vino una de las criadas del sumo sacerdote;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 67, NULL, 'y cuando vio a Pedro que se calentaba, mirándole, dijo: Tú también estabas con Jesús el nazareno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 68, NULL, 'Mas él negó, diciendo: No le conozco, ni sé lo que dices. Y salió a la entrada; y cantó el gallo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 69, NULL, 'Y la criada, viéndole otra vez, comenzó a decir a los que estaban allí: Este es de ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 70, NULL, 'Pero él negó otra vez. Y poco después, los que estaban allí dijeron otra vez a Pedro: Verdaderamente tú eres de ellos; porque eres galileo, y tu manera de hablar es semejante a la de ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 71, NULL, 'Entonces él comenzó a maldecir, y a jurar: No conozco a este hombre de quien habláis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 14, 72, NULL, 'Y el gallo cantó la segunda vez. Entonces Pedro se acordó de las palabras que Jesús le había dicho: Antes que el gallo cante dos veces, me negarás tres veces. Y pensando en esto, lloraba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 1, 'Jesús ante Pilato', 'Muy de mañana, habiendo tenido consejo los principales sacerdotes con los ancianos, con los escribas y con todo el concilio, llevaron a Jesús atado, y le entregaron a Pilato.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 2, NULL, 'Pilato le preguntó: ¿Eres tú el Rey de los judíos? Respondiendo él, le dijo: Tú lo dices.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 3, NULL, 'Y los principales sacerdotes le acusaban mucho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 4, NULL, 'Otra vez le preguntó Pilato, diciendo: ¿Nada respondes? Mira de cuántas cosas te acusan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 5, NULL, 'Mas Jesús ni aun con eso respondió; de modo que Pilato se maravillaba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 6, 'Jesús sentenciado a muerte', 'Ahora bien, en el día de la fiesta les soltaba un preso, cualquiera que pidiesen.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 7, NULL, 'Y había uno que se llamaba Barrabás, preso con sus compañeros de motín que habían cometido homicidio en una revuelta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 8, NULL, 'Y viniendo la multitud, comenzó a pedir que hiciese como siempre les había hecho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 9, NULL, 'Y Pilato les respondió diciendo: ¿Queréis que os suelte al Rey de los judíos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 10, NULL, 'Porque conocía que por envidia le habían entregado los principales sacerdotes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 11, NULL, 'Mas los principales sacerdotes incitaron a la multitud para que les soltase más bien a Barrabás.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 12, NULL, 'Respondiendo Pilato, les dijo otra vez: ¿Qué, pues, queréis que haga del que llamáis Rey de los judíos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 13, NULL, 'Y ellos volvieron a dar voces: ¡Crucifícale!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 14, NULL, 'Pilato les decía: ¿Pues qué mal ha hecho? Pero ellos gritaban aún más: ¡Crucifícale!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 15, NULL, 'Y Pilato, queriendo satisfacer al pueblo, les soltó a Barrabás, y entregó a Jesús, después de azotarle, para que fuese crucificado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 16, NULL, 'Entonces los soldados le llevaron dentro del atrio, esto es, al pretorio, y convocaron a toda la compañía.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 17, NULL, 'Y le vistieron de púrpura, y poniéndole una corona tejida de espinas,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 18, NULL, 'comenzaron luego a saludarle: ¡Salve, Rey de los judíos!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 19, NULL, 'Y le golpeaban en la cabeza con una caña, y le escupían, y puestos de rodillas le hacían reverencias.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 20, NULL, 'Después de haberle escarnecido, le desnudaron la púrpura, y le pusieron sus propios vestidos, y le sacaron para crucificarle.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 21, 'Crucifixión y muerte de Jesús', 'Y obligaron a uno que pasaba, Simón de Cirene, padre de Alejandro y de Rufo, que venía del campo, a que le llevase la cruz.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 22, NULL, 'Y le llevaron a un lugar llamado Gólgota, que traducido es: Lugar de la Calavera.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 23, NULL, 'Y le dieron a beber vino mezclado con mirra; mas él no lo tomó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 24, NULL, 'Cuando le hubieron crucificado, repartieron entre sí sus vestidos, echando suertes sobre ellos para ver qué se llevaría cada uno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 25, NULL, 'Era la hora tercera cuando le crucificaron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 26, NULL, 'Y el título escrito de su causa era: EL REY DE LOS JUDÍOS.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 27, NULL, 'Crucificaron también con él a dos ladrones, uno a su derecha, y el otro a su izquierda.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 28, NULL, 'Y se cumplió la Escritura que dice: Y fue contado con los inicuos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 29, NULL, 'Y los que pasaban le injuriaban, meneando la cabeza y diciendo: ¡Bah! tú que derribas el templo de Dios, y en tres días lo reedificas,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 30, NULL, 'sálvate a ti mismo, y desciende de la cruz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 31, NULL, 'De esta manera también los principales sacerdotes, escarneciendo, se decían unos a otros, con los escribas: A otros salvó, a sí mismo no se puede salvar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 32, NULL, 'El Cristo, Rey de Israel, descienda ahora de la cruz, para que veamos y creamos. También los que estaban crucificados con él le injuriaban.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 33, NULL, 'Cuando vino la hora sexta, hubo tinieblas sobre toda la tierra hasta la hora novena.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 34, NULL, 'Y a la hora novena Jesús clamó a gran voz, diciendo: Eloi, Eloi, ¿lama sabactani? que traducido es: Dios mío, Dios mío, ¿por qué me has desamparado?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 35, NULL, 'Y algunos de los que estaban allí decían, al oírlo: Mirad, llama a Elías.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 36, NULL, 'Y corrió uno, y empapando una esponja en vinagre, y poniéndola en una caña, le dio a beber, diciendo: Dejad, veamos si viene Elías a bajarle.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 37, NULL, 'Mas Jesús, dando una gran voz, expiró.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 38, NULL, 'Entonces el velo del templo se rasgó en dos, de arriba abajo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 39, NULL, 'Y el centurión que estaba frente a él, viendo que después de clamar había expirado así, dijo: Verdaderamente este hombre era Hijo de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 40, NULL, 'También había algunas mujeres mirando de lejos, entre las cuales estaban María Magdalena, María la madre de Jacobo el menor y de José, y Salomé,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 41, NULL, 'quienes, cuando él estaba en Galilea, le seguían y le servían; y otras muchas que habían subido con él a Jerusalén.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 42, 'Jesús es sepultado', 'Cuando llegó la noche, porque era la preparación, es decir, la víspera del día de reposo,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 43, NULL, 'José de Arimatea, miembro noble del concilio, que también esperaba el reino de Dios, vino y entró osadamente a Pilato, y pidió el cuerpo de Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 44, NULL, 'Pilato se sorprendió de que ya hubiese muerto; y haciendo venir al centurión, le preguntó si ya estaba muerto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 45, NULL, 'E informado por el centurión, dio el cuerpo a José,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 46, NULL, 'el cual compró una sábana, y quitándolo, lo envolvió en la sábana, y lo puso en un sepulcro que estaba cavado en una peña, e hizo rodar una piedra a la entrada del sepulcro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 15, 47, NULL, 'Y María Magdalena y María madre de José miraban dónde lo ponían.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 16, 1, 'La resurrección', 'Cuando pasó el día de reposo, María Magdalena, María la madre de Jacobo, y Salomé, compraron especias aromáticas para ir a ungirle.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 16, 2, NULL, 'Y muy de mañana, el primer día de la semana, vinieron al sepulcro, ya salido el sol.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 16, 3, NULL, 'Pero decían entre sí: ¿Quién nos removerá la piedra de la entrada del sepulcro?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 16, 4, NULL, 'Pero cuando miraron, vieron removida la piedra, que era muy grande.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 16, 5, NULL, 'Y cuando entraron en el sepulcro, vieron a un joven sentado al lado derecho, cubierto de una larga ropa blanca; y se espantaron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 16, 6, NULL, 'Mas él les dijo: No os asustéis; buscáis a Jesús nazareno, el que fue crucificado; ha resucitado, no está aquí; mirad el lugar en donde le pusieron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 16, 7, NULL, 'Pero id, decid a sus discípulos, y a Pedro, que él va delante de vosotros a Galilea; allí le veréis, como os dijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 16, 8, NULL, 'Y ellas se fueron huyendo del sepulcro, porque les había tomado temblor y espanto; ni decían nada a nadie, porque tenían miedo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 16, 9, 'Jesús se aparece a María Magdalena', 'Habiendo, pues, resucitado Jesús por la mañana, el primer día de la semana, apareció primeramente a María Magdalena, de quien había echado siete demonios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 16, 10, NULL, 'Yendo ella, lo hizo saber a los que habían estado con él, que estaban tristes y llorando.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 16, 11, NULL, 'Ellos, cuando oyeron que vivía, y que había sido visto por ella, no lo creyeron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 16, 12, 'Jesús se aparece a dos de sus discípulos', 'Pero después apareció en otra forma a dos de ellos que iban de camino, yendo al campo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 16, 13, NULL, 'Ellos fueron y lo hicieron saber a los otros; y ni aun a ellos creyeron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 16, 14, 'Jesús comisiona a los apóstoles', 'Finalmente se apareció a los once mismos, estando ellos sentados a la mesa, y les reprochó su incredulidad y dureza de corazón, porque no habían creído a los que le habían visto resucitado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 16, 15, NULL, 'Y les dijo: Id por todo el mundo y predicad el evangelio a toda criatura.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 16, 16, NULL, 'El que creyere y fuere bautizado, será salvo; mas el que no creyere, será condenado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 16, 17, NULL, 'Y estas señales seguirán a los que creen: En mi nombre echarán fuera demonios; hablarán nuevas lenguas;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 16, 18, NULL, 'tomarán en las manos serpientes, y si bebieren cosa mortífera, no les hará daño; sobre los enfermos pondrán sus manos, y sanarán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 16, 19, 'La ascensión', 'Y el Señor, después que les habló, fue recibido arriba en el cielo, y se sentó a la diestra de Dios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mr', 16, 20, NULL, 'Y ellos, saliendo, predicaron en todas partes, ayudándoles el Señor y confirmando la palabra con las señales que la seguían. Amén.', 0, 'spa', 'RVR1960', NULL);\n"
;

}