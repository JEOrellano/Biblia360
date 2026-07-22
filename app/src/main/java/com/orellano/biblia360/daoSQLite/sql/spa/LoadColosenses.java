package com.orellano.biblia360.daoSQLite.sql.spa;

public final class LoadColosenses {
  public LoadColosenses() {}
  public static final String SQL_PARTE_1 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Col', 1, 1, 'Salutación', 'Pablo, apóstol de Jesucristo por la voluntad de Dios, y el hermano Timoteo,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 1, 2, NULL, 'a los santos y fieles hermanos en Cristo que están en Colosas: Gracia y paz sean a vosotros, de Dios nuestro Padre y del Señor Jesucristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 1, 3, 'Pablo pide que Dios les conceda sabiduría espiritual', 'Siempre orando por vosotros, damos gracias a Dios, Padre de nuestro Señor Jesucristo,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 1, 4, NULL, 'habiendo oído de vuestra fe en Cristo Jesús, y del amor que tenéis a todos los santos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 1, 5, NULL, 'a causa de la esperanza que os está guardada en los cielos, de la cual ya habéis oído por la palabra verdadera del evangelio,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 1, 6, NULL, 'que ha llegado hasta vosotros, así como a todo el mundo, y lleva fruto y crece también en vosotros, desde el día que oísteis y conocisteis la gracia de Dios en verdad,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 1, 7, NULL, 'como lo habéis aprendido de Epafras, nuestro consiervo amado, que es un fiel ministro de Cristo para vosotros,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 1, 8, NULL, 'quien también nos ha declarado vuestro amor en el Espíritu.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 1, 9, NULL, 'Por lo cual también nosotros, desde el día que lo oímos, no cesamos de orar por vosotros, y de pedir que seáis llenos del conocimiento de su voluntad en toda sabiduría e inteligencia espiritual,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 1, 10, NULL, 'para que andéis como es digno del Señor, agradándole en todo, llevando fruto en toda buena obra, y creciendo en el conocimiento de Dios;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 1, 11, NULL, 'fortalecidos con todo poder, conforme a la potencia de su gloria, para toda paciencia y longanimidad;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 1, 12, NULL, 'con gozo dando gracias al Padre que nos hizo aptos para participar de la herencia de los santos en luz;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 1, 13, NULL, 'el cual nos ha librado de la potestad de las tinieblas, y trasladado al reino de su amado Hijo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 1, 14, NULL, 'en quien tenemos redención por su sangre, el perdón de pecados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 1, 15, 'Reconciliación por medio de la muerte de Cristo', 'Él es la imagen del Dios invisible, el primogénito de toda creación.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 1, 16, NULL, 'Porque en él fueron creadas todas las cosas, las que hay en los cielos y las que hay en la tierra, visibles e invisibles; sean tronos, sean dominios, sean principados, sean potestades; todo fue creado por medio de él y para él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 1, 17, NULL, 'Y él es antes de todas las cosas, y todas las cosas en él subsisten;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 1, 18, NULL, 'y él es la cabeza del cuerpo que es la iglesia, él que es el principio, el primogénito de entre los muertos, para que en todo tenga la preeminencia;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 1, 19, NULL, 'por cuanto agradó al Padre que en él habitase toda plenitud,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 1, 20, NULL, 'y por medio de él reconciliar consigo todas las cosas, así las que están en la tierra como las que están en los cielos, haciendo la paz mediante la sangre de su cruz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 1, 21, NULL, 'Y a vosotros también, que erais en otro tiempo extraños y enemigos en vuestra mente, haciendo malas obras, ahora os ha reconciliado', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 1, 22, NULL, 'en su cuerpo de carne, por medio de la muerte, para presentaros santos y sin mancha e irreprensibles delante de él;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 1, 23, NULL, 'si en verdad permanecéis fundados y firmes en la fe, y sin moveros de la esperanza del evangelio que habéis oído, el cual se predica en toda la creación que está debajo del cielo; del cual yo Pablo fui hecho ministro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 1, 24, 'Ministerio de Pablo a los gentiles', 'Ahora me gozo en lo que padezco por vosotros, y cumplo en mi carne lo que falta de las aflicciones de Cristo por su cuerpo, que es la iglesia;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 1, 25, NULL, 'de la cual fui hecho ministro, según la administración de Dios que me fue dada para con vosotros, para que anuncie cumplidamente la palabra de Dios,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 1, 26, NULL, 'el misterio que había estado oculto desde los siglos y edades, pero que ahora ha sido manifestado a sus santos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 1, 27, NULL, 'a quienes Dios quiso dar a conocer las riquezas de la gloria de este misterio entre los gentiles; que es Cristo en vosotros, la esperanza de gloria,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 1, 28, NULL, 'a quien anunciamos, amonestando a todo hombre, y enseñando a todo hombre en toda sabiduría, a fin de presentar perfecto en Cristo Jesús a todo hombre;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 1, 29, NULL, 'para lo cual también trabajo, luchando según la potencia de él, la cual actúa poderosamente en mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 2, 1, NULL, 'Porque quiero que sepáis cuán gran lucha sostengo por vosotros, y por los que están en Laodicea, y por todos los que nunca han visto mi rostro;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 2, 2, NULL, 'para que sean consolados sus corazones, unidos en amor, hasta alcanzar todas las riquezas de pleno entendimiento, a fin de conocer el misterio de Dios el Padre, y de Cristo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 2, 3, NULL, 'en quien están escondidos todos los tesoros de la sabiduría y del conocimiento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 2, 4, NULL, 'Y esto lo digo para que nadie os engañe con palabras persuasivas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 2, 5, NULL, 'Porque aunque estoy ausente en cuerpo, no obstante en espíritu estoy con vosotros, gozándome y mirando vuestro buen orden y la firmeza de vuestra fe en Cristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 2, 6, NULL, 'Por tanto, de la manera que habéis recibido al Señor Jesucristo, andad en él;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 2, 7, NULL, 'arraigados y sobreedificados en él, y confirmados en la fe, así como habéis sido enseñados, abundando en acciones de gracias.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 2, 8, 'Plenitud de vida en Cristo', 'Mirad que nadie os engañe por medio de filosofías y huecas sutilezas, según las tradiciones de los hombres, conforme a los rudimentos del mundo, y no según Cristo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 2, 9, NULL, 'Porque en él habita corporalmente toda la plenitud de la Deidad,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 2, 10, NULL, 'y vosotros estáis completos en él, que es la cabeza de todo principado y potestad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 2, 11, NULL, 'En él también fuisteis circuncidados con circuncisión no hecha a mano, al echar de vosotros el cuerpo pecaminoso carnal, en la circuncisión de Cristo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 2, 12, NULL, 'sepultados con él en el bautismo, en el cual fuisteis también resucitados con él, mediante la fe en el poder de Dios que le levantó de los muertos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 2, 13, NULL, 'Y a vosotros, estando muertos en pecados y en la incircuncisión de vuestra carne, os dio vida juntamente con él, perdonándoos todos los pecados,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 2, 14, NULL, 'anulando el acta de los decretos que había contra nosotros, que nos era contraria, quitándola de en medio y clavándola en la cruz,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 2, 15, NULL, 'y despojando a los principados y a las potestades, los exhibió públicamente, triunfando sobre ellos en la cruz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 2, 16, NULL, 'Por tanto, nadie os juzgue en comida o en bebida, o en cuanto a días de fiesta, luna nueva o días de reposo,,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 2, 17, NULL, 'todo lo cual es sombra de lo que ha de venir; pero el cuerpo es de Cristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 2, 18, NULL, 'Nadie os prive de vuestro premio, afectando humildad y culto a los ángeles, entremetiéndose en lo que no ha visto, vanamente hinchado por su propia mente carnal,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 2, 19, NULL, 'y no asiéndose de la Cabeza, en virtud de quien todo el cuerpo, nutriéndose y uniéndose por las coyunturas y ligamentos, crece con el crecimiento que da Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 2, 20, NULL, 'Pues si habéis muerto con Cristo en cuanto a los rudimentos del mundo, ¿por qué, como si vivieseis en el mundo, os sometéis a preceptos', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 2, 21, NULL, 'tales como: No manejes, ni gustes, ni aun toques', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 2, 22, NULL, '(en conformidad a mandamientos y doctrinas de hombres), cosas que todas se destruyen con el uso?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 2, 23, NULL, 'Tales cosas tienen a la verdad cierta reputación de sabiduría en culto voluntario, en humildad y en duro trato del cuerpo; pero no tienen valor alguno contra los apetitos de la carne.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 3, 1, NULL, 'Si, pues, habéis resucitado con Cristo, buscad las cosas de arriba, donde está Cristo sentado a la diestra de Dios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 3, 2, NULL, 'Poned la mira en las cosas de arriba, no en las de la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 3, 3, NULL, 'Porque habéis muerto, y vuestra vida está escondida con Cristo en Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 3, 4, NULL, 'Cuando Cristo, vuestra vida, se manifieste, entonces vosotros también seréis manifestados con él en gloria.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 3, 5, 'La vida antigua y la nueva', 'Haced morir, pues, lo terrenal en vosotros: fornicación, impureza, pasiones desordenadas, malos deseos y avaricia, que es idolatría;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 3, 6, NULL, 'cosas por las cuales la ira de Dios viene sobre los hijos de desobediencia,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 3, 7, NULL, 'en las cuales vosotros también anduvisteis en otro tiempo cuando vivíais en ellas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 3, 8, NULL, 'Pero ahora dejad también vosotros todas estas cosas: ira, enojo, malicia, blasfemia, palabras deshonestas de vuestra boca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 3, 9, NULL, 'No mintáis los unos a los otros, habiéndoos despojado del viejo hombre con sus hechos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 3, 10, NULL, 'y revestido del nuevo, el cual conforme a la imagen del que lo creó se va renovando hasta el conocimiento pleno,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 3, 11, NULL, 'donde no hay griego ni judío, circuncisión ni incircuncisión, bárbaro ni escita, siervo ni libre, sino que Cristo es el todo, y en todos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 3, 12, NULL, 'Vestíos, pues, como escogidos de Dios, santos y amados, de entrañable misericordia, de benignidad, de humildad, de mansedumbre, de paciencia;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 3, 13, NULL, 'soportándoos unos a otros, y perdonándoos unos a otros si alguno tuviere queja contra otro. De la manera que Cristo os perdonó, así también hacedlo vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 3, 14, NULL, 'Y sobre todas estas cosas vestíos de amor, que es el vínculo perfecto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 3, 15, NULL, 'Y la paz de Dios gobierne en vuestros corazones, a la que asimismo fuisteis llamados en un solo cuerpo; y sed agradecidos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 3, 16, NULL, 'La palabra de Cristo more en abundancia en vosotros, enseñándoos y exhortándoos unos a otros en toda sabiduría, cantando con gracia en vuestros corazones al Señor con salmos e himnos y cánticos espirituales.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 3, 17, NULL, 'Y todo lo que hacéis, sea de palabra o de hecho, hacedlo todo en el nombre del Señor Jesús, dando gracias a Dios Padre por medio de él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 3, 18, 'Deberes sociales de la nueva vida', 'Casadas, estad sujetas a vuestros maridos, como conviene en el Señor.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 3, 19, NULL, 'Maridos, amad a vuestras mujeres, y no seáis ásperos con ellas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 3, 20, NULL, 'Hijos, obedeced a vuestros padres en todo, porque esto agrada al Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 3, 21, NULL, 'Padres, no exasperéis a vuestros hijos, para que no se desalienten.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 3, 22, NULL, 'Siervos, obedeced en todo a vuestros amos terrenales, no sirviendo al ojo, como los que quieren agradar a los hombres, sino con corazón sincero, temiendo a Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 3, 23, NULL, 'Y todo lo que hagáis, hacedlo de corazón, como para el Señor y no para los hombres;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 3, 24, NULL, 'sabiendo que del Señor recibiréis la recompensa de la herencia, porque a Cristo el Señor servís.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 3, 25, NULL, 'Mas el que hace injusticia, recibirá la injusticia que hiciere, porque no hay acepción de personas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 4, 1, NULL, 'Amos, haced lo que es justo y recto con vuestros siervos, sabiendo que también vosotros tenéis un Amo en los cielos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 4, 2, NULL, 'Perseverad en la oración, velando en ella con acción de gracias;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 4, 3, NULL, 'orando también al mismo tiempo por nosotros, para que el Señor nos abra puerta para la palabra, a fin de dar a conocer el misterio de Cristo, por el cual también estoy preso,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 4, 4, NULL, 'para que lo manifieste como debo hablar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 4, 5, NULL, 'Andad sabiamente para con los de afuera, redimiendo el tiempo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 4, 6, NULL, 'Sea vuestra palabra siempre con gracia, sazonada con sal, para que sepáis cómo debéis responder a cada uno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 4, 7, 'Salutaciones finales', 'Todo lo que a mí se refiere, os lo hará saber Tíquico, amado hermano y fiel ministro y consiervo en el Señor,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 4, 8, NULL, 'el cual he enviado a vosotros para esto mismo, para que conozca lo que a vosotros se refiere, y conforte vuestros corazones,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 4, 9, NULL, 'con Onésimo, amado y fiel hermano, que es uno de vosotros. Todo lo que acá pasa, os lo harán saber.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 4, 10, NULL, 'Aristarco, mi compañero de prisiones, os saluda, y Marcos el sobrino de Bernabé, acerca del cual habéis recibido mandamientos; si fuere a vosotros, recibidle;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 4, 11, NULL, 'y Jesús, llamado Justo; que son los únicos de la circuncisión que me ayudan en el reino de Dios, y han sido para mí un consuelo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 4, 12, NULL, 'Os saluda Epafras, el cual es uno de vosotros, siervo de Cristo, siempre rogando encarecidamente por vosotros en sus oraciones, para que estéis firmes, perfectos y completos en todo lo que Dios quiere.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 4, 13, NULL, 'Porque de él doy testimonio de que tiene gran solicitud por vosotros, y por los que están en Laodicea, y los que están en Hierápolis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 4, 14, NULL, 'Os saluda Lucas el médico amado, y Demas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 4, 15, NULL, 'Saludad a los hermanos que están en Laodicea, y a Ninfas y a la iglesia que está en su casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 4, 16, NULL, 'Cuando esta carta haya sido leída entre vosotros, haced que también se lea en la iglesia de los laodicenses, y que la de Laodicea la leáis también vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 4, 17, NULL, 'Decid a Arquipo: Mira que cumplas el ministerio que recibiste en el Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Col', 4, 18, NULL, 'La salutación de mi propia mano, de Pablo. Acordaos de mis prisiones. La gracia sea con vosotros. Amén.', 1, 'spa', 'RVR1960', NULL);\n"
;

}