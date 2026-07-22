package com.orellano.biblia360.daoSQLite.sql.spa;

public final class LoadEfesios {
  public LoadEfesios() {}
  public static final String SQL_PARTE_1 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Ef', 1, 1, 'Salutación', 'Pablo, apóstol de Jesucristo por la voluntad de Dios, a los santos y fieles en Cristo Jesús que están en Éfeso:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 1, 2, NULL, 'Gracia y paz a vosotros, de Dios nuestro Padre y del Señor Jesucristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 1, 3, 'Bendiciones espirituales en Cristo', 'Bendito sea el Dios y Padre de nuestro Señor Jesucristo, que nos bendijo con toda bendición espiritual en los lugares celestiales en Cristo,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 1, 4, NULL, 'según nos escogió en él antes de la fundación del mundo, para que fuésemos santos y sin mancha delante de él,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 1, 5, NULL, 'en amor habiéndonos predestinado para ser adoptados hijos suyos por medio de Jesucristo, según el puro afecto de su voluntad,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 1, 6, NULL, 'para alabanza de la gloria de su gracia, con la cual nos hizo aceptos en el Amado,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 1, 7, NULL, 'en quien tenemos redención por su sangre, el perdón de pecados según las riquezas de su gracia,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 1, 8, NULL, 'que hizo sobreabundar para con nosotros en toda sabiduría e inteligencia,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 1, 9, NULL, 'dándonos a conocer el misterio de su voluntad, según su beneplácito, el cual se había propuesto en sí mismo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 1, 10, NULL, 'de reunir todas las cosas en Cristo, en la dispensación del cumplimiento de los tiempos, así las que están en los cielos, como las que están en la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 1, 11, NULL, 'En él asimismo tuvimos herencia, habiendo sido predestinados conforme al propósito del que hace todas las cosas según el designio de su voluntad,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 1, 12, NULL, 'a fin de que seamos para alabanza de su gloria, nosotros los que primeramente esperábamos en Cristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 1, 13, NULL, 'En él también vosotros, habiendo oído la palabra de verdad, el evangelio de vuestra salvación, y habiendo creído en él, fuisteis sellados con el Espíritu Santo de la promesa,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 1, 14, NULL, 'que es las arras de nuestra herencia hasta la redención de la posesión adquirida, para alabanza de su gloria.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 1, 15, 'El espíritu de sabiduría y de revelación', 'Por esta causa también yo, habiendo oído de vuestra fe en el Señor Jesús, y de vuestro amor para con todos los santos,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 1, 16, NULL, 'no ceso de dar gracias por vosotros, haciendo memoria de vosotros en mis oraciones,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 1, 17, NULL, 'para que el Dios de nuestro Señor Jesucristo, el Padre de gloria, os dé espíritu de sabiduría y de revelación en el conocimiento de él,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 1, 18, NULL, 'alumbrando los ojos de vuestro entendimiento, para que sepáis cuál es la esperanza a que él os ha llamado, y cuáles las riquezas de la gloria de su herencia en los santos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 1, 19, NULL, 'y cuál la supereminente grandeza de su poder para con nosotros los que creemos, según la operación del poder de su fuerza,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 1, 20, NULL, 'la cual operó en Cristo, resucitándole de los muertos y sentándole a su diestra en los lugares celestiales,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 1, 21, NULL, 'sobre todo principado y autoridad y poder y señorío, y sobre todo nombre que se nombra, no solo en este siglo, sino también en el venidero;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 1, 22, NULL, 'y sometió todas las cosas bajo sus pies, y lo dio por cabeza sobre todas las cosas a la iglesia,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 1, 23, NULL, 'la cual es su cuerpo, la plenitud de Aquel que todo lo llena en todo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 2, 1, 'Salvos por gracia', 'Y él os dio vida a vosotros, cuando estabais muertos en vuestros delitos y pecados,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 2, 2, NULL, 'en los cuales anduvisteis en otro tiempo, siguiendo la corriente de este mundo, conforme al príncipe de la potestad del aire, el espíritu que ahora opera en los hijos de desobediencia,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 2, 3, NULL, 'entre los cuales también todos nosotros vivimos en otro tiempo en los deseos de nuestra carne, haciendo la voluntad de la carne y de los pensamientos, y éramos por naturaleza hijos de ira, lo mismo que los demás.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 2, 4, NULL, 'Pero Dios, que es rico en misericordia, por su gran amor con que nos amó,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 2, 5, NULL, 'aun estando nosotros muertos en pecados, nos dio vida juntamente con Cristo (por gracia sois salvos),', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 2, 6, NULL, 'y juntamente con él nos resucitó, y asimismo nos hizo sentar en los lugares celestiales con Cristo Jesús,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 2, 7, NULL, 'para mostrar en los siglos venideros las abundantes riquezas de su gracia en su bondad para con nosotros en Cristo Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 2, 8, NULL, 'Porque por gracia sois salvos por medio de la fe; y esto no de vosotros, pues es don de Dios;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 2, 9, NULL, 'no por obras, para que nadie se gloríe.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 2, 10, NULL, 'Porque somos hechura suya, creados en Cristo Jesús para buenas obras, las cuales Dios preparó de antemano para que anduviésemos en ellas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 2, 11, 'Reconciliación por medio de la cruz', 'Por tanto, acordaos de que en otro tiempo vosotros, los gentiles en cuanto a la carne, erais llamados incircuncisión por la llamada circuncisión hecha con mano en la carne.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 2, 12, NULL, 'En aquel tiempo estabais sin Cristo, alejados de la ciudadanía de Israel y ajenos a los pactos de la promesa, sin esperanza y sin Dios en el mundo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 2, 13, NULL, 'Pero ahora en Cristo Jesús, vosotros que en otro tiempo estabais lejos, habéis sido hechos cercanos por la sangre de Cristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 2, 14, NULL, 'Porque él es nuestra paz, que de ambos pueblos hizo uno, derribando la pared intermedia de separación,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 2, 15, NULL, 'aboliendo en su carne las enemistades, la ley de los mandamientos expresados en ordenanzas, para crear en sí mismo de los dos un solo y nuevo hombre, haciendo la paz,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 2, 16, NULL, 'y mediante la cruz reconciliar con Dios a ambos en un solo cuerpo, matando en ella las enemistades.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 2, 17, NULL, 'Y vino y anunció las buenas nuevas de paz a vosotros que estabais lejos, y a los que estaban cerca;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 2, 18, NULL, 'porque por medio de él los unos y los otros tenemos entrada por un mismo Espíritu al Padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 2, 19, NULL, 'Así que ya no sois extranjeros ni advenedizos, sino conciudadanos de los santos, y miembros de la familia de Dios,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 2, 20, NULL, 'edificados sobre el fundamento de los apóstoles y profetas, siendo la principal piedra del ángulo Jesucristo mismo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 2, 21, NULL, 'en quien todo el edificio, bien coordinado, va creciendo para ser un templo santo en el Señor;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 2, 22, NULL, 'en quien vosotros también sois juntamente edificados para morada de Dios en el Espíritu.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 3, 1, 'Ministerio de Pablo a los gentiles', 'Por esta causa yo Pablo, prisionero de Cristo Jesús por vosotros los gentiles;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 3, 2, NULL, 'si es que habéis oído de la administración de la gracia de Dios que me fue dada para con vosotros;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 3, 3, NULL, 'que por revelación me fue declarado el misterio, como antes lo he escrito brevemente,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 3, 4, NULL, 'leyendo lo cual podéis entender cuál sea mi conocimiento en el misterio de Cristo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 3, 5, NULL, 'misterio que en otras generaciones no se dio a conocer a los hijos de los hombres, como ahora es revelado a sus santos apóstoles y profetas por el Espíritu:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 3, 6, NULL, 'que los gentiles son coherederos y miembros del mismo cuerpo, y copartícipes de la promesa en Cristo Jesús por medio del evangelio,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 3, 7, NULL, 'del cual yo fui hecho ministro por el don de la gracia de Dios que me ha sido dado según la operación de su poder.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 3, 8, NULL, 'A mí, que soy menos que el más pequeño de todos los santos, me fue dada esta gracia de anunciar entre los gentiles el evangelio de las inescrutables riquezas de Cristo,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 3, 9, NULL, 'y de aclarar a todos cuál sea la dispensación del misterio escondido desde los siglos en Dios, que creó todas las cosas;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 3, 10, NULL, 'para que la multiforme sabiduría de Dios sea ahora dada a conocer por medio de la iglesia a los principados y potestades en los lugares celestiales,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 3, 11, NULL, 'conforme al propósito eterno que hizo en Cristo Jesús nuestro Señor,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 3, 12, NULL, 'en quien tenemos seguridad y acceso con confianza por medio de la fe en él;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 3, 13, NULL, 'por lo cual pido que no desmayéis a causa de mis tribulaciones por vosotros, las cuales son vuestra gloria.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 3, 14, 'El amor que excede a todo conocimiento', 'Por esta causa doblo mis rodillas ante el Padre de nuestro Señor Jesucristo,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 3, 15, NULL, 'de quien toma nombre toda familia en los cielos y en la tierra,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 3, 16, NULL, 'para que os dé, conforme a las riquezas de su gloria, el ser fortalecidos con poder en el hombre interior por su Espíritu;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 3, 17, NULL, 'para que habite Cristo por la fe en vuestros corazones, a fin de que, arraigados y cimentados en amor,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 3, 18, NULL, 'seáis plenamente capaces de comprender con todos los santos cuál sea la anchura, la longitud, la profundidad y la altura,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 3, 19, NULL, 'y de conocer el amor de Cristo, que excede a todo conocimiento, para que seáis llenos de toda la plenitud de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 3, 20, NULL, 'Y a Aquel que es poderoso para hacer todas las cosas mucho más abundantemente de lo que pedimos o entendemos, según el poder que actúa en nosotros,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 3, 21, NULL, 'a él sea gloria en la iglesia en Cristo Jesús por todas las edades, por los siglos de los siglos. Amén.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 4, 1, 'La unidad del Espíritu', 'Yo pues, preso en el Señor, os ruego que andéis como es digno de la vocación con que fuisteis llamados,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 4, 2, NULL, 'con toda humildad y mansedumbre, soportándoos con paciencia los unos a los otros en amor,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 4, 3, NULL, 'solícitos en guardar la unidad del Espíritu en el vínculo de la paz;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 4, 4, NULL, 'un cuerpo, y un Espíritu, como fuisteis también llamados en una misma esperanza de vuestra vocación;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 4, 5, NULL, 'un Señor, una fe, un bautismo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 4, 6, NULL, 'un Dios y Padre de todos, el cual es sobre todos, y por todos, y en todos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 4, 7, NULL, 'Pero a cada uno de nosotros fue dada la gracia conforme a la medida del don de Cristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 4, 8, NULL, 'Por lo cual dice: Subiendo a lo alto, llevó cautiva la cautividad, Y dio dones a los hombres.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 4, 9, NULL, 'Y eso de que subió, ¿qué es, sino que también había descendido primero a las partes más bajas de la tierra?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 4, 10, NULL, 'El que descendió, es el mismo que también subió por encima de todos los cielos para llenarlo todo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 4, 11, NULL, 'Y él mismo constituyó a unos, apóstoles; a otros, profetas; a otros, evangelistas; a otros, pastores y maestros,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 4, 12, NULL, 'a fin de perfeccionar a los santos para la obra del ministerio, para la edificación del cuerpo de Cristo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 4, 13, NULL, 'hasta que todos lleguemos a la unidad de la fe y del conocimiento del Hijo de Dios, a un varón perfecto, a la medida de la estatura de la plenitud de Cristo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 4, 14, NULL, 'para que ya no seamos niños fluctuantes, llevados por doquiera de todo viento de doctrina, por estratagema de hombres que para engañar emplean con astucia las artimañas del error,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 4, 15, NULL, 'sino que siguiendo la verdad en amor, crezcamos en todo en aquel que es la cabeza, esto es, Cristo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 4, 16, NULL, 'de quien todo el cuerpo, bien concertado y unido entre sí por todas las coyunturas que se ayudan mutuamente, según la actividad propia de cada miembro, recibe su crecimiento para ir edificándose en amor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 4, 17, 'La nueva vida en Cristo', 'Esto, pues, digo y requiero en el Señor: que ya no andéis como los otros gentiles, que andan en la vanidad de su mente,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 4, 18, NULL, 'teniendo el entendimiento entenebrecido, ajenos de la vida de Dios por la ignorancia que en ellos hay, por la dureza de su corazón;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 4, 19, NULL, 'los cuales, después que perdieron toda sensibilidad, se entregaron a la lascivia para cometer con avidez toda clase de impureza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 4, 20, NULL, 'Mas vosotros no habéis aprendido así a Cristo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 4, 21, NULL, 'si en verdad le habéis oído, y habéis sido por él enseñados, conforme a la verdad que está en Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 4, 22, NULL, 'En cuanto a la pasada manera de vivir, despojaos del viejo hombre, que está viciado conforme a los deseos engañosos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 4, 23, NULL, 'y renovaos en el espíritu de vuestra mente,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 4, 24, NULL, 'y vestíos del nuevo hombre, creado según Dios en la justicia y santidad de la verdad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 4, 25, NULL, 'Por lo cual, desechando la mentira, hablad verdad cada uno con su prójimo; porque somos miembros los unos de los otros.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 4, 26, NULL, 'Airaos, pero no pequéis; no se ponga el sol sobre vuestro enojo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 4, 27, NULL, 'ni deis lugar al diablo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 4, 28, NULL, 'El que hurtaba, no hurte más, sino trabaje, haciendo con sus manos lo que es bueno, para que tenga qué compartir con el que padece necesidad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 4, 29, NULL, 'Ninguna palabra corrompida salga de vuestra boca, sino la que sea buena para la necesaria edificación, a fin de dar gracia a los oyentes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 4, 30, NULL, 'Y no contristéis al Espíritu Santo de Dios, con el cual fuisteis sellados para el día de la redención.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 4, 31, NULL, 'Quítense de vosotros toda amargura, enojo, ira, gritería y maledicencia, y toda malicia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 4, 32, NULL, 'Antes sed benignos unos con otros, misericordiosos, perdonándoos unos a otros, como Dios también os perdonó a vosotros en Cristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 5, 1, 'Andad como hijos de luz', 'Sed, pues, imitadores de Dios como hijos amados.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 5, 2, NULL, 'Y andad en amor, como también Cristo nos amó, y se entregó a sí mismo por nosotros, ofrenda y sacrificio a Dios en olor fragante.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 5, 3, NULL, 'Pero fornicación y toda inmundicia, o avaricia, ni aun se nombre entre vosotros, como conviene a santos;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 5, 4, NULL, 'ni palabras deshonestas, ni necedades, ni truhanerías, que no convienen, sino antes bien acciones de gracias.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 5, 5, NULL, 'Porque sabéis esto, que ningún fornicario, o inmundo, o avaro, que es idólatra, tiene herencia en el reino de Cristo y de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 5, 6, NULL, 'Nadie os engañe con palabras vanas, porque por estas cosas viene la ira de Dios sobre los hijos de desobediencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 5, 7, NULL, 'No seáis, pues, partícipes con ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 5, 8, NULL, 'Porque en otro tiempo erais tinieblas, mas ahora sois luz en el Señor; andad como hijos de luz', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 5, 9, NULL, '(porque el fruto del Espíritu es en toda bondad, justicia y verdad),', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 5, 10, NULL, 'comprobando lo que es agradable al Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 5, 11, NULL, 'Y no participéis en las obras infructuosas de las tinieblas, sino más bien reprendedlas;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 5, 12, NULL, 'porque vergonzoso es aun hablar de lo que ellos hacen en secreto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 5, 13, NULL, 'Mas todas las cosas, cuando son puestas en evidencia por la luz, son hechas manifiestas; porque la luz es lo que manifiesta todo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 5, 14, NULL, 'Por lo cual dice: Despiértate, tú que duermes, Y levántate de los muertos, Y te alumbrará Cristo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 5, 15, NULL, 'Mirad, pues, con diligencia cómo andéis, no como necios sino como sabios,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 5, 16, NULL, 'aprovechando bien el tiempo, porque los días son malos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 5, 17, NULL, 'Por tanto, no seáis insensatos, sino entendidos de cuál sea la voluntad del Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 5, 18, NULL, 'No os embriaguéis con vino, en lo cual hay disolución; antes bien sed llenos del Espíritu,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 5, 19, NULL, 'hablando entre vosotros con salmos, con himnos y cánticos espirituales, cantando y alabando al Señor en vuestros corazones;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 5, 20, NULL, 'dando siempre gracias por todo al Dios y Padre, en el nombre de nuestro Señor Jesucristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 5, 21, 'Someteos los unos a los otros', 'Someteos unos a otros en el temor de Dios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 5, 22, NULL, 'Las casadas estén sujetas a sus propios maridos, como al Señor;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 5, 23, NULL, 'porque el marido es cabeza de la mujer, así como Cristo es cabeza de la iglesia, la cual es su cuerpo, y él es su Salvador.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 5, 24, NULL, 'Así que, como la iglesia está sujeta a Cristo, así también las casadas lo estén a sus maridos en todo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 5, 25, NULL, 'Maridos, amad a vuestras mujeres, así como Cristo amó a la iglesia, y se entregó a sí mismo por ella,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 5, 26, NULL, 'para santificarla, habiéndola purificado en el lavamiento del agua por la palabra,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 5, 27, NULL, 'a fin de presentársela a sí mismo, una iglesia gloriosa, que no tuviese mancha ni arruga ni cosa semejante, sino que fuese santa y sin mancha.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 5, 28, NULL, 'Así también los maridos deben amar a sus mujeres como a sus mismos cuerpos. El que ama a su mujer, a sí mismo se ama.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 5, 29, NULL, 'Porque nadie aborreció jamás a su propia carne, sino que la sustenta y la cuida, como también Cristo a la iglesia,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 5, 30, NULL, 'porque somos miembros de su cuerpo, de su carne y de sus huesos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 5, 31, NULL, 'Por esto dejará el hombre a su padre y a su madre, y se unirá a su mujer, y los dos serán una sola carne.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 5, 32, NULL, 'Grande es este misterio; mas yo digo esto respecto de Cristo y de la iglesia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 5, 33, NULL, 'Por lo demás, cada uno de vosotros ame también a su mujer como a sí mismo; y la mujer respete a su marido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 6, 1, NULL, 'Hijos, obedeced en el Señor a vuestros padres, porque esto es justo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 6, 2, NULL, 'Honra a tu padre y a tu madre, que es el primer mandamiento con promesa;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 6, 3, NULL, 'para que te vaya bien, y seas de larga vida sobre la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 6, 4, NULL, 'Y vosotros, padres, no provoquéis a ira a vuestros hijos, sino criadlos en disciplina y amonestación del Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 6, 5, NULL, 'Siervos, obedeced a vuestros amos terrenales con temor y temblor, con sencillez de vuestro corazón, como a Cristo;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 6, 6, NULL, 'no sirviendo al ojo, como los que quieren agradar a los hombres, sino como siervos de Cristo, de corazón haciendo la voluntad de Dios;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 6, 7, NULL, 'sirviendo de buena voluntad, como al Señor y no a los hombres,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 6, 8, NULL, 'sabiendo que el bien que cada uno hiciere, ese recibirá del Señor, sea siervo o sea libre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 6, 9, NULL, 'Y vosotros, amos, haced con ellos lo mismo, dejando las amenazas, sabiendo que el Señor de ellos y vuestro está en los cielos, y que para él no hay acepción de personas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 6, 10, 'La armadura de Dios', 'Por lo demás, hermanos míos, fortaleceos en el Señor, y en el poder de su fuerza.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 6, 11, NULL, 'Vestíos de toda la armadura de Dios, para que podáis estar firmes contra las asechanzas del diablo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 6, 12, NULL, 'Porque no tenemos lucha contra sangre y carne, sino contra principados, contra potestades, contra los gobernadores de las tinieblas de este siglo, contra huestes espirituales de maldad en las regiones celestes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 6, 13, NULL, 'Por tanto, tomad toda la armadura de Dios, para que podáis resistir en el día malo, y habiendo acabado todo, estar firmes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 6, 14, NULL, 'Estad, pues, firmes, ceñidos vuestros lomos con la verdad, y vestidos con la coraza de justicia,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 6, 15, NULL, 'y calzados los pies con el apresto del evangelio de la paz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 6, 16, NULL, 'Sobre todo, tomad el escudo de la fe, con que podáis apagar todos los dardos de fuego del maligno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 6, 17, NULL, 'Y tomad el yelmo de la salvación, y la espada del Espíritu, que es la palabra de Dios;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 6, 18, NULL, 'orando en todo tiempo con toda oración y súplica en el Espíritu, y velando en ello con toda perseverancia y súplica por todos los santos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 6, 19, NULL, 'y por mí, a fin de que al abrir mi boca me sea dada palabra para dar a conocer con denuedo el misterio del evangelio,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 6, 20, NULL, 'por el cual soy embajador en cadenas; que con denuedo hable de él, como debo hablar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 6, 21, 'Salutaciones finales', 'Para que también vosotros sepáis mis asuntos, y lo que hago, todo os lo hará saber Tíquico, hermano amado y fiel ministro en el Señor,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 6, 22, NULL, 'el cual envié a vosotros para esto mismo, para que sepáis lo tocante a nosotros, y que consuele vuestros corazones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 6, 23, NULL, 'Paz sea a los hermanos, y amor con fe, de Dios Padre y del Señor Jesucristo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Ef', 6, 24, NULL, 'La gracia sea con todos los que aman a nuestro Señor Jesucristo con amor inalterable. Amén.', 0, 'spa', 'RVR1960', NULL);\n"
;

}