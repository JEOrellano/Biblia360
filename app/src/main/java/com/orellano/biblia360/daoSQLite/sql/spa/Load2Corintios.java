package com.orellano.biblia360.daoSQLite.sql.spa;

public final class Load2Corintios {
  public Load2Corintios() {}
  public static final String SQL_PARTE_1 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', '2 Co', 1, 1, 'Salutación', 'Pablo, apóstol de Jesucristo por la voluntad de Dios, y el hermano Timoteo, a la iglesia de Dios que está en Corinto, con todos los santos que están en toda Acaya:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 1, 2, NULL, 'Gracia y paz a vosotros, de Dios nuestro Padre y del Señor Jesucristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 1, 3, 'Aflicciones de Pablo', 'Bendito sea el Dios y Padre de nuestro Señor Jesucristo, Padre de misericordias y Dios de toda consolación,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 1, 4, NULL, 'el cual nos consuela en todas nuestras tribulaciones, para que podamos también nosotros consolar a los que están en cualquier tribulación, por medio de la consolación con que nosotros somos consolados por Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 1, 5, NULL, 'Porque de la manera que abundan en nosotros las aflicciones de Cristo, así abunda también por el mismo Cristo nuestra consolación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 1, 6, NULL, 'Pero si somos atribulados, es para vuestra consolación y salvación; o si somos consolados, es para vuestra consolación y salvación, la cual se opera en el sufrir las mismas aflicciones que nosotros también padecemos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 1, 7, NULL, 'Y nuestra esperanza respecto de vosotros es firme, pues sabemos que así como sois compañeros en las aflicciones, también lo sois en la consolación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 1, 8, NULL, 'Porque hermanos, no queremos que ignoréis acerca de nuestra tribulación que nos sobrevino en Asia; pues fuimos abrumados sobremanera más allá de nuestras fuerzas, de tal modo que aun perdimos la esperanza de conservar la vida.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 1, 9, NULL, 'Pero tuvimos en nosotros mismos sentencia de muerte, para que no confiásemos en nosotros mismos, sino en Dios que resucita a los muertos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 1, 10, NULL, 'el cual nos libró, y nos libra, y en quien esperamos que aún nos librará, de tan gran muerte;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 1, 11, NULL, 'cooperando también vosotros a favor nuestro con la oración, para que por muchas personas sean dadas gracias a favor nuestro por el don concedido a nosotros por medio de muchos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 1, 12, 'Por qué Pablo pospuso su visita a Corinto', 'Porque nuestra gloria es esta: el testimonio de nuestra conciencia, que con sencillez y sinceridad de Dios, no con sabiduría humana, sino con la gracia de Dios, nos hemos conducido en el mundo, y mucho más con vosotros.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 1, 13, NULL, 'Porque no os escribimos otras cosas de las que leéis, o también entendéis; y espero que hasta el fin las entenderéis;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 1, 14, NULL, 'como también en parte habéis entendido que somos vuestra gloria, así como también vosotros la nuestra, para el día del Señor Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 1, 15, NULL, 'Con esta confianza quise ir primero a vosotros, para que tuvieseis una segunda gracia,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 1, 16, NULL, 'y por vosotros pasar a Macedonia, y desde Macedonia venir otra vez a vosotros, y ser encaminado por vosotros a Judea.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 1, 17, NULL, 'Así que, al proponerme esto, ¿usé quizá de ligereza? ¿O lo que pienso hacer, lo pienso según la carne, para que haya en mí Sí y No?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 1, 18, NULL, 'Mas, como Dios es fiel, nuestra palabra a vosotros no es Sí y No.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 1, 19, NULL, 'Porque el Hijo de Dios, Jesucristo, que entre vosotros ha sido predicado por nosotros, por mí, Silvano y Timoteo, no ha sido Sí y No; mas ha sido Sí en él;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 1, 20, NULL, 'porque todas las promesas de Dios son en él Sí, y en él Amén, por medio de nosotros, para la gloria de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 1, 21, NULL, 'Y el que nos confirma con vosotros en Cristo, y el que nos ungió, es Dios,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 1, 22, NULL, 'el cual también nos ha sellado, y nos ha dado las arras del Espíritu en nuestros corazones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 1, 23, NULL, 'Mas yo invoco a Dios por testigo sobre mi alma, que por ser indulgente con vosotros no he pasado todavía a Corinto.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 1, 24, NULL, 'No que nos enseñoreemos de vuestra fe, sino que colaboramos para vuestro gozo; porque por la fe estáis firmes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 2, 1, NULL, 'Esto, pues, determiné para conmigo, no ir otra vez a vosotros con tristeza.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 2, 2, NULL, 'Porque si yo os contristo, ¿quién será luego el que me alegre, sino aquel a quien yo contristé?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 2, 3, NULL, 'Y esto mismo os escribí, para que cuando llegue no tenga tristeza de parte de aquellos de quienes me debiera gozar; confiando en vosotros todos que mi gozo es el de todos vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 2, 4, NULL, 'Porque por la mucha tribulación y angustia del corazón os escribí con muchas lágrimas, no para que fueseis contristados, sino para que supieseis cuán grande es el amor que os tengo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 2, 5, 'Pablo perdona al ofensor', 'Pero si alguno me ha causado tristeza, no me la ha causado solo a mí, sino en cierto modo (por no exagerar) a todos vosotros.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 2, 6, NULL, 'Le basta a tal persona esta reprensión hecha por muchos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 2, 7, NULL, 'así que, al contrario, vosotros más bien debéis perdonarle y consolarle, para que no sea consumido de demasiada tristeza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 2, 8, NULL, 'Por lo cual os ruego que confirméis el amor para con él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 2, 9, NULL, 'Porque también para este fin os escribí, para tener la prueba de si vosotros sois obedientes en todo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 2, 10, NULL, 'Y al que vosotros perdonáis, yo también; porque también yo lo que he perdonado, si algo he perdonado, por vosotros lo he hecho en presencia de Cristo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 2, 11, NULL, 'para que Satanás no gane ventaja alguna sobre nosotros; pues no ignoramos sus maquinaciones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 2, 12, 'Ansiedad de Pablo en Troas', 'Cuando llegué a Troas para predicar el evangelio de Cristo, aunque se me abrió puerta en el Señor,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 2, 13, NULL, 'no tuve reposo en mi espíritu, por no haber hallado a mi hermano Tito; así, despidiéndome de ellos, partí para Macedonia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 2, 14, 'Triunfantes en Cristo', 'Mas a Dios gracias, el cual nos lleva siempre en triunfo en Cristo Jesús, y por medio de nosotros manifiesta en todo lugar el olor de su conocimiento.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 2, 15, NULL, 'Porque para Dios somos grato olor de Cristo en los que se salvan, y en los que se pierden;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 2, 16, NULL, 'a estos ciertamente olor de muerte para muerte, y a aquellos olor de vida para vida. Y para estas cosas, ¿quién es suficiente?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 2, 17, NULL, 'Pues no somos como muchos, que medran falsificando la palabra de Dios, sino que con sinceridad, como de parte de Dios, y delante de Dios, hablamos en Cristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 3, 1, 'Ministros del nuevo pacto', '¿Comenzamos otra vez a recomendarnos a nosotros mismos? ¿O tenemos necesidad, como algunos, de cartas de recomendación para vosotros, o de recomendación de vosotros?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 3, 2, NULL, 'Nuestras cartas sois vosotros, escritas en nuestros corazones, conocidas y leídas por todos los hombres;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 3, 3, NULL, 'siendo manifiesto que sois carta de Cristo expedida por nosotros, escrita no con tinta, sino con el Espíritu del Dios vivo; no en tablas de piedra, sino en tablas de carne del corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 3, 4, NULL, 'Y tal confianza tenemos mediante Cristo para con Dios;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 3, 5, NULL, 'no que seamos competentes por nosotros mismos para pensar algo como de nosotros mismos, sino que nuestra competencia proviene de Dios,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 3, 6, NULL, 'el cual asimismo nos hizo ministros competentes de un nuevo pacto, no de la letra, sino del espíritu; porque la letra mata, mas el espíritu vivifica.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 3, 7, NULL, 'Y si el ministerio de muerte grabado con letras en piedras fue con gloria, tanto que los hijos de Israel no pudieron fijar la vista en el rostro de Moisés a causa de la gloria de su rostro, la cual había de perecer,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 3, 8, NULL, '¿cómo no será más bien con gloria el ministerio del espíritu?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 3, 9, NULL, 'Porque si el ministerio de condenación fue con gloria, mucho más abundará en gloria el ministerio de justificación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 3, 10, NULL, 'Porque aun lo que fue glorioso, no es glorioso en este respecto, en comparación con la gloria más eminente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 3, 11, NULL, 'Porque si lo que perece tuvo gloria, mucho más glorioso será lo que permanece.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 3, 12, NULL, 'Así que, teniendo tal esperanza, usamos de mucha franqueza;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 3, 13, NULL, 'y no como Moisés, que ponía un velo sobre su rostro, para que los hijos de Israel no fijaran la vista en el fin de aquello que había de ser abolido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 3, 14, NULL, 'Pero el entendimiento de ellos se embotó; porque hasta el día de hoy, cuando leen el antiguo pacto, les queda el mismo velo no descubierto, el cual por Cristo es quitado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 3, 15, NULL, 'Y aun hasta el día de hoy, cuando se lee a Moisés, el velo está puesto sobre el corazón de ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 3, 16, NULL, 'Pero cuando se conviertan al Señor, el velo se quitará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 3, 17, NULL, 'Porque el Señor es el Espíritu; y donde está el Espíritu del Señor, allí hay libertad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 3, 18, NULL, 'Por tanto, nosotros todos, mirando a cara descubierta como en un espejo la gloria del Señor, somos transformados de gloria en gloria en la misma imagen, como por el Espíritu del Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 4, 1, NULL, 'Por lo cual, teniendo nosotros este ministerio según la misericordia que hemos recibido, no desmayamos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 4, 2, NULL, 'Antes bien renunciamos a lo oculto y vergonzoso, no andando con astucia, ni adulterando la palabra de Dios, sino por la manifestación de la verdad recomendándonos a toda conciencia humana delante de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 4, 3, NULL, 'Pero si nuestro evangelio está aún encubierto, entre los que se pierden está encubierto;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 4, 4, NULL, 'en los cuales el dios de este siglo cegó el entendimiento de los incrédulos, para que no les resplandezca la luz del evangelio de la gloria de Cristo, el cual es la imagen de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 4, 5, NULL, 'Porque no nos predicamos a nosotros mismos, sino a Jesucristo como Señor, y a nosotros como vuestros siervos por amor de Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 4, 6, NULL, 'Porque Dios, que mandó que de las tinieblas resplandeciese la luz, es el que resplandeció en nuestros corazones, para iluminación del conocimiento de la gloria de Dios en la faz de Jesucristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 4, 7, 'Viviendo por la fe', 'Pero tenemos este tesoro en vasos de barro, para que la excelencia del poder sea de Dios, y no de nosotros,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 4, 8, NULL, 'que estamos atribulados en todo, mas no angustiados; en apuros, mas no desesperados;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 4, 9, NULL, 'perseguidos, mas no desamparados; derribados, pero no destruidos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 4, 10, NULL, 'llevando en el cuerpo siempre por todas partes la muerte de Jesús, para que también la vida de Jesús se manifieste en nuestros cuerpos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 4, 11, NULL, 'Porque nosotros que vivimos, siempre estamos entregados a muerte por causa de Jesús, para que también la vida de Jesús se manifieste en nuestra carne mortal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 4, 12, NULL, 'De manera que la muerte actúa en nosotros, y en vosotros la vida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 4, 13, NULL, 'Pero teniendo el mismo espíritu de fe, conforme a lo que está escrito: Creí, por lo cual hablé, nosotros también creemos, por lo cual también hablamos,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 4, 14, NULL, 'sabiendo que el que resucitó al Señor Jesús, a nosotros también nos resucitará con Jesús, y nos presentará juntamente con vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 4, 15, NULL, 'Porque todas estas cosas padecemos por amor a vosotros, para que abundando la gracia por medio de muchos, la acción de gracias sobreabunde para gloria de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 4, 16, NULL, 'Por tanto, no desmayamos; antes aunque este nuestro hombre exterior se va desgastando, el interior no obstante se renueva de día en día.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 4, 17, NULL, 'Porque esta leve tribulación momentánea produce en nosotros un cada vez más excelente y eterno peso de gloria;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 4, 18, NULL, 'no mirando nosotros las cosas que se ven, sino las que no se ven; pues las cosas que se ven son temporales, pero las que no se ven son eternas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 5, 1, NULL, 'Porque sabemos que si nuestra morada terrestre, este tabernáculo, se deshiciere, tenemos de Dios un edificio, una casa no hecha de manos, eterna, en los cielos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 5, 2, NULL, 'Y por esto también gemimos, deseando ser revestidos de aquella nuestra habitación celestial;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 5, 3, NULL, 'pues así seremos hallados vestidos, y no desnudos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 5, 4, NULL, 'Porque asimismo los que estamos en este tabernáculo gemimos con angustia; porque no quisiéramos ser desnudados, sino revestidos, para que lo mortal sea absorbido por la vida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 5, 5, NULL, 'Mas el que nos hizo para esto mismo es Dios, quien nos ha dado las arras del Espíritu.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 5, 6, NULL, 'Así que vivimos confiados siempre, y sabiendo que entre tanto que estamos en el cuerpo, estamos ausentes del Señor', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 5, 7, NULL, '(porque por fe andamos, no por vista);', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 5, 8, NULL, 'pero confiamos, y más quisiéramos estar ausentes del cuerpo, y presentes al Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 5, 9, NULL, 'Por tanto procuramos también, o ausentes o presentes, serle agradables.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 5, 10, NULL, 'Porque es necesario que todos nosotros comparezcamos ante el tribunal de Cristo, para que cada uno reciba según lo que haya hecho mientras estaba en el cuerpo, sea bueno o sea malo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 5, 11, 'El ministerio de la reconciliación', 'Conociendo, pues, el temor del Señor, persuadimos a los hombres; pero a Dios le es manifiesto lo que somos; y espero que también lo sea a vuestras conciencias.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 5, 12, NULL, 'No nos recomendamos, pues, otra vez a vosotros, sino os damos ocasión de gloriaros por nosotros, para que tengáis con qué responder a los que se glorían en las apariencias y no en el corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 5, 13, NULL, 'Porque si estamos locos, es para Dios; y si somos cuerdos, es para vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 5, 14, NULL, 'Porque el amor de Cristo nos constriñe, pensando esto: que si uno murió por todos, luego todos murieron;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 5, 15, NULL, 'y por todos murió, para que los que viven, ya no vivan para sí, sino para aquel que murió y resucitó por ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 5, 16, NULL, 'De manera que nosotros de aquí en adelante a nadie conocemos según la carne; y aun si a Cristo conocimos según la carne, ya no lo conocemos así.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 5, 17, NULL, 'De modo que si alguno está en Cristo, nueva criatura es; las cosas viejas pasaron; he aquí todas son hechas nuevas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 5, 18, NULL, 'Y todo esto proviene de Dios, quien nos reconcilió consigo mismo por Cristo, y nos dio el ministerio de la reconciliación;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 5, 19, NULL, 'que Dios estaba en Cristo reconciliando consigo al mundo, no tomándoles en cuenta a los hombres sus pecados, y nos encargó a nosotros la palabra de la reconciliación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 5, 20, NULL, 'Así que, somos embajadores en nombre de Cristo, como si Dios rogase por medio de nosotros; os rogamos en nombre de Cristo: Reconciliaos con Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 5, 21, NULL, 'Al que no conoció pecado, por nosotros lo hizo pecado, para que nosotros fuésemos hechos justicia de Dios en él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 6, 1, NULL, 'Así, pues, nosotros, como colaboradores suyos, os exhortamos también a que no recibáis en vano la gracia de Dios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 6, 2, NULL, 'Porque dice: En tiempo aceptable te he oído, Y en día de salvación te he socorrido. He aquí ahora el tiempo aceptable; he aquí ahora el día de salvación.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 6, 3, NULL, 'No damos a nadie ninguna ocasión de tropiezo, para que nuestro ministerio no sea vituperado;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 6, 4, NULL, 'antes bien, nos recomendamos en todo como ministros de Dios, en mucha paciencia, en tribulaciones, en necesidades, en angustias;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 6, 5, NULL, 'en azotes, en cárceles, en tumultos, en trabajos, en desvelos, en ayunos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 6, 6, NULL, 'en pureza, en ciencia, en longanimidad, en bondad, en el Espíritu Santo, en amor sincero,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 6, 7, NULL, 'en palabra de verdad, en poder de Dios, con armas de justicia a diestra y a siniestra;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 6, 8, NULL, 'por honra y por deshonra, por mala fama y por buena fama; como engañadores, pero veraces;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 6, 9, NULL, 'como desconocidos, pero bien conocidos; como moribundos, mas he aquí vivimos; como castigados, mas no muertos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 6, 10, NULL, 'como entristecidos, mas siempre gozosos; como pobres, mas enriqueciendo a muchos; como no teniendo nada, mas poseyéndolo todo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 6, 11, NULL, 'Nuestra boca se ha abierto a vosotros, oh corintios; nuestro corazón se ha ensanchado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 6, 12, NULL, 'No estáis estrechos en nosotros, pero sí sois estrechos en vuestro propio corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 6, 13, NULL, 'Pues, para corresponder del mismo modo (como a hijos hablo), ensanchaos también vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 6, 14, 'Somos templo del Dios viviente', 'No os unáis en yugo desigual con los incrédulos; porque ¿qué compañerismo tiene la justicia con la injusticia? ¿Y qué comunión la luz con las tinieblas?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 6, 15, NULL, '¿Y qué concordia Cristo con Belial? ¿O qué parte el creyente con el incrédulo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 6, 16, NULL, '¿Y qué acuerdo hay entre el templo de Dios y los ídolos? Porque vosotros sois el templo del Dios viviente, como Dios dijo: Habitaré y andaré entre ellos, Y seré su Dios, Y ellos serán mi pueblo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 6, 17, NULL, 'Por lo cual, Salid de en medio de ellos, y apartaos, dice el Señor, Y no toquéis lo inmundo; Y yo os recibiré,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 6, 18, NULL, 'Y seré para vosotros por Padre, Y vosotros me seréis hijos e hijas, dice el Señor Todopoderoso.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 7, 1, NULL, 'Así que, amados, puesto que tenemos tales promesas, limpiémonos de toda contaminación de carne y de espíritu, perfeccionando la santidad en el temor de Dios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 7, 2, 'Regocijo de Pablo al arrepentirse los corintios', 'Admitidnos: a nadie hemos agraviado, a nadie hemos corrompido, a nadie hemos engañado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 7, 3, NULL, 'No lo digo para condenaros; pues ya he dicho antes que estáis en nuestro corazón, para morir y para vivir juntamente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 7, 4, NULL, 'Mucha franqueza tengo con vosotros; mucho me glorío con respecto de vosotros; lleno estoy de consolación; sobreabundo de gozo en todas nuestras tribulaciones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 7, 5, NULL, 'Porque de cierto, cuando vinimos a Macedonia, ningún reposo tuvo nuestro cuerpo, sino que en todo fuimos atribulados; de fuera, conflictos; de dentro, temores.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 7, 6, NULL, 'Pero Dios, que consuela a los humildes, nos consoló con la venida de Tito;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 7, 7, NULL, 'y no solo con su venida, sino también con la consolación con que él había sido consolado en cuanto a vosotros, haciéndonos saber vuestro gran afecto, vuestro llanto, vuestra solicitud por mí, de manera que me regocijé aún más.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 7, 8, NULL, 'Porque aunque os contristé con la carta, no me pesa, aunque entonces lo lamenté; porque veo que aquella carta, aunque por algún tiempo, os contristó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 7, 9, NULL, 'Ahora me gozo, no porque hayáis sido contristados, sino porque fuisteis contristados para arrepentimiento; porque habéis sido contristados según Dios, para que ninguna pérdida padecieseis por nuestra parte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 7, 10, NULL, 'Porque la tristeza que es según Dios produce arrepentimiento para salvación, de que no hay que arrepentirse; pero la tristeza del mundo produce muerte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 7, 11, NULL, 'Porque he aquí, esto mismo de que hayáis sido contristados según Dios, ¡qué solicitud produjo en vosotros, qué defensa, qué indignación, qué temor, qué ardiente afecto, qué celo, y qué vindicación! En todo os habéis mostrado limpios en el asunto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 7, 12, NULL, 'Así que, aunque os escribí, no fue por causa del que cometió el agravio, ni por causa del que lo padeció, sino para que se os hiciese manifiesta nuestra solicitud que tenemos por vosotros delante de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 7, 13, NULL, 'Por esto hemos sido consolados en vuestra consolación; pero mucho más nos gozamos por el gozo de Tito, que haya sido confortado su espíritu por todos vosotros.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 7, 14, NULL, 'Pues si de algo me he gloriado con él respecto de vosotros, no he sido avergonzado, sino que así como en todo os hemos hablado con verdad, también nuestro gloriarnos con Tito resultó verdad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 7, 15, NULL, 'Y su cariño para con vosotros es aun más abundante, cuando se acuerda de la obediencia de todos vosotros, de cómo lo recibisteis con temor y temblor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 7, 16, NULL, 'Me gozo de que en todo tengo confianza en vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 8, 1, 'La ofrenda para los santos', 'Asimismo, hermanos, os hacemos saber la gracia de Dios que se ha dado a las iglesias de Macedonia;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 8, 2, NULL, 'que en grande prueba de tribulación, la abundancia de su gozo y su profunda pobreza abundaron en riquezas de su generosidad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 8, 3, NULL, 'Pues doy testimonio de que con agrado han dado conforme a sus fuerzas, y aun más allá de sus fuerzas,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 8, 4, NULL, 'pidiéndonos con muchos ruegos que les concediésemos el privilegio de participar en este servicio para los santos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 8, 5, NULL, 'Y no como lo esperábamos, sino que a sí mismos se dieron primeramente al Señor, y luego a nosotros por la voluntad de Dios;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 8, 6, NULL, 'de manera que exhortamos a Tito para que tal como comenzó antes, asimismo acabe también entre vosotros esta obra de gracia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 8, 7, NULL, 'Por tanto, como en todo abundáis, en fe, en palabra, en ciencia, en toda solicitud, y en vuestro amor para con nosotros, abundad también en esta gracia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 8, 8, NULL, 'No hablo como quien manda, sino para poner a prueba, por medio de la diligencia de otros, también la sinceridad del amor vuestro.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 8, 9, NULL, 'Porque ya conocéis la gracia de nuestro Señor Jesucristo, que por amor a vosotros se hizo pobre, siendo rico, para que vosotros con su pobreza fueseis enriquecidos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 8, 10, NULL, 'Y en esto doy mi consejo; porque esto os conviene a vosotros, que comenzasteis antes, no solo a hacerlo, sino también a quererlo, desde el año pasado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 8, 11, NULL, 'Ahora, pues, llevad también a cabo el hacerlo, para que como estuvisteis prontos a querer, así también lo estéis en cumplir conforme a lo que tengáis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 8, 12, NULL, 'Porque si primero hay la voluntad dispuesta, será acepta según lo que uno tiene, no según lo que no tiene.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 8, 13, NULL, 'Porque no digo esto para que haya para otros holgura, y para vosotros estrechez,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 8, 14, NULL, 'sino para que en este tiempo, con igualdad, la abundancia vuestra supla la escasez de ellos, para que también la abundancia de ellos supla la necesidad vuestra, para que haya igualdad,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 8, 15, NULL, 'como está escrito: El que recogió mucho, no tuvo más, y el que poco, no tuvo menos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 8, 16, NULL, 'Pero gracias a Dios que puso en el corazón de Tito la misma solicitud por vosotros.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 8, 17, NULL, 'Pues a la verdad recibió la exhortación; pero estando también muy solícito, por su propia voluntad partió para ir a vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 8, 18, NULL, 'Y enviamos juntamente con él al hermano cuya alabanza en el evangelio se oye por todas las iglesias;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 8, 19, NULL, 'y no solo esto, sino que también fue designado por las iglesias como compañero de nuestra peregrinación para llevar este donativo, que es administrado por nosotros para gloria del Señor mismo, y para demostrar vuestra buena voluntad;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 8, 20, NULL, 'evitando que nadie nos censure en cuanto a esta ofrenda abundante que administramos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 8, 21, NULL, 'procurando hacer las cosas honradamente, no solo delante del Señor sino también delante de los hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 8, 22, NULL, 'Enviamos también con ellos a nuestro hermano, cuya diligencia hemos comprobado repetidas veces en muchas cosas, y ahora mucho más diligente por la mucha confianza que tiene en vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 8, 23, NULL, 'En cuanto a Tito, es mi compañero y colaborador para con vosotros; y en cuanto a nuestros hermanos, son mensajeros de las iglesias, y gloria de Cristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 8, 24, NULL, 'Mostrad, pues, para con ellos ante las iglesias la prueba de vuestro amor, y de nuestro gloriarnos respecto de vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 9, 1, NULL, 'Cuanto a la ministración para los santos, es por demás que yo os escriba;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 9, 2, NULL, 'pues conozco vuestra buena voluntad, de la cual yo me glorío entre los de Macedonia, que Acaya está preparada desde el año pasado; y vuestro celo ha estimulado a la mayoría.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 9, 3, NULL, 'Pero he enviado a los hermanos, para que nuestro gloriarnos de vosotros no sea vano en esta parte; para que como lo he dicho, estéis preparados;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 9, 4, NULL, 'no sea que si vinieren conmigo algunos macedonios, y os hallaren desprevenidos, nos avergoncemos nosotros, por no decir vosotros, de esta nuestra confianza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 9, 5, NULL, 'Por tanto, tuve por necesario exhortar a los hermanos que fuesen primero a vosotros y preparasen primero vuestra generosidad antes prometida, para que esté lista como de generosidad, y no como de exigencia nuestra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 9, 6, NULL, 'Pero esto digo: El que siembra escasamente, también segará escasamente; y el que siembra generosamente, generosamente también segará.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 9, 7, NULL, 'Cada uno dé como propuso en su corazón: no con tristeza, ni por necesidad, porque Dios ama al dador alegre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 9, 8, NULL, 'Y poderoso es Dios para hacer que abunde en vosotros toda gracia, a fin de que, teniendo siempre en todas las cosas todo lo suficiente, abundéis para toda buena obra;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 9, 9, NULL, 'como está escrito: Repartió, dio a los pobres; Su justicia permanece para siempre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 9, 10, NULL, 'Y el que da semilla al que siembra, y pan al que come, proveerá y multiplicará vuestra sementera, y aumentará los frutos de vuestra justicia,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 9, 11, NULL, 'para que estéis enriquecidos en todo para toda liberalidad, la cual produce por medio de nosotros acción de gracias a Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 9, 12, NULL, 'Porque la ministración de este servicio no solamente suple lo que a los santos falta, sino que también abunda en muchas acciones de gracias a Dios;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 9, 13, NULL, 'pues por la experiencia de esta ministración glorifican a Dios por la obediencia que profesáis al evangelio de Cristo, y por la liberalidad de vuestra contribución para ellos y para todos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 9, 14, NULL, 'asimismo en la oración de ellos por vosotros, a quienes aman a causa de la superabundante gracia de Dios en vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 9, 15, NULL, '¡Gracias a Dios por su don inefable!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 10, 1, 'Pablo defiende su ministerio', 'Yo Pablo os ruego por la mansedumbre y ternura de Cristo, yo que estando presente ciertamente soy humilde entre vosotros, mas ausente soy osado para con vosotros;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 10, 2, NULL, 'ruego, pues, que cuando esté presente, no tenga que usar de aquella osadía con que estoy dispuesto a proceder resueltamente contra algunos que nos tienen como si anduviésemos según la carne.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 10, 3, NULL, 'Pues aunque andamos en la carne, no militamos según la carne;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 10, 4, NULL, 'porque las armas de nuestra milicia no son carnales, sino poderosas en Dios para la destrucción de fortalezas,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 10, 5, NULL, 'derribando argumentos y toda altivez que se levanta contra el conocimiento de Dios, y llevando cautivo todo pensamiento a la obediencia a Cristo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 10, 6, NULL, 'y estando prontos para castigar toda desobediencia, cuando vuestra obediencia sea perfecta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 10, 7, NULL, 'Miráis las cosas según la apariencia. Si alguno está persuadido en sí mismo que es de Cristo, esto también piense por sí mismo, que como él es de Cristo, así también nosotros somos de Cristo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 10, 8, NULL, 'Porque aunque me gloríe algo más todavía de nuestra autoridad, la cual el Señor nos dio para edificación y no para vuestra destrucción, no me avergonzaré;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 10, 9, NULL, 'para que no parezca como que os quiero amedrentar por cartas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 10, 10, NULL, 'Porque a la verdad, dicen, las cartas son duras y fuertes; mas la presencia corporal débil, y la palabra menospreciable.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 10, 11, NULL, 'Esto tenga en cuenta tal persona, que así como somos en la palabra por cartas, estando ausentes, lo seremos también en hechos, estando presentes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 10, 12, NULL, 'Porque no nos atrevemos a contarnos ni a compararnos con algunos que se alaban a sí mismos; pero ellos, midiéndose a sí mismos por sí mismos, y comparándose consigo mismos, no son juiciosos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 10, 13, NULL, 'Pero nosotros no nos gloriaremos desmedidamente, sino conforme a la regla que Dios nos ha dado por medida, para llegar también hasta vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 10, 14, NULL, 'Porque no nos hemos extralimitado, como si no llegásemos hasta vosotros, pues fuimos los primeros en llegar hasta vosotros con el evangelio de Cristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 10, 15, NULL, 'No nos gloriamos desmedidamente en trabajos ajenos, sino que esperamos que conforme crezca vuestra fe seremos muy engrandecidos entre vosotros, conforme a nuestra regla;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 10, 16, NULL, 'y que anunciaremos el evangelio en los lugares más allá de vosotros, sin entrar en la obra de otro para gloriarnos en lo que ya estaba preparado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 10, 17, NULL, 'Mas el que se gloría, gloríese en el Señor;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 10, 18, NULL, 'porque no es aprobado el que se alaba a sí mismo, sino aquel a quien Dios alaba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 11, 1, NULL, '¡Ojalá me toleraseis un poco de locura! Sí, toleradme.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 11, 2, NULL, 'Porque os celo con celo de Dios; pues os he desposado con un solo esposo, para presentaros como una virgen pura a Cristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 11, 3, NULL, 'Pero temo que como la serpiente con su astucia engañó a Eva, vuestros sentidos sean de alguna manera extraviados de la sincera fidelidad a Cristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 11, 4, NULL, 'Porque si viene alguno predicando a otro Jesús que el que os hemos predicado, o si recibís otro espíritu que el que habéis recibido, u otro evangelio que el que habéis aceptado, bien lo toleráis;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 11, 5, NULL, 'y pienso que en nada he sido inferior a aquellos grandes apóstoles.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 11, 6, NULL, 'Pues aunque sea tosco en la palabra, no lo soy en el conocimiento; en todo y por todo os lo hemos demostrado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 11, 7, NULL, '¿Pequé yo humillándome a mí mismo, para que vosotros fueseis enaltecidos, por cuanto os he predicado el evangelio de Dios de balde?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 11, 8, NULL, 'He despojado a otras iglesias, recibiendo salario para serviros a vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 11, 9, NULL, 'Y cuando estaba entre vosotros y tuve necesidad, a ninguno fui carga, pues lo que me faltaba, lo suplieron los hermanos que vinieron de Macedonia, y en todo me guardé y me guardaré de seros gravoso.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 11, 10, NULL, 'Por la verdad de Cristo que está en mí, que no se me impedirá esta mi gloria en las regiones de Acaya.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 11, 11, NULL, '¿Por qué? ¿Porque no os amo? Dios lo sabe.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 11, 12, NULL, 'Mas lo que hago, lo haré aún, para quitar la ocasión a aquellos que la desean, a fin de que en aquello en que se glorían, sean hallados semejantes a nosotros.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 11, 13, NULL, 'Porque estos son falsos apóstoles, obreros fraudulentos, que se disfrazan como apóstoles de Cristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 11, 14, NULL, 'Y no es maravilla, porque el mismo Satanás se disfraza como ángel de luz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 11, 15, NULL, 'Así que, no es extraño si también sus ministros se disfrazan como ministros de justicia; cuyo fin será conforme a sus obras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 11, 16, 'Sufrimientos de Pablo como apóstol', 'Otra vez digo: Que nadie me tenga por loco; o de otra manera, recibidme como a loco, para que yo también me gloríe un poquito.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 11, 17, NULL, 'Lo que hablo, no lo hablo según el Señor, sino como en locura, con esta confianza de gloriarme.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 11, 18, NULL, 'Puesto que muchos se glorían según la carne, también yo me gloriaré;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 11, 19, NULL, 'porque de buena gana toleráis a los necios, siendo vosotros cuerdos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 11, 20, NULL, 'Pues toleráis si alguno os esclaviza, si alguno os devora, si alguno toma lo vuestro, si alguno se enaltece, si alguno os da de bofetadas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 11, 21, NULL, 'Para vergüenza mía lo digo, para eso fuimos demasiado débiles. Pero en lo que otro tenga osadía (hablo con locura), también yo tengo osadía.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 11, 22, NULL, '¿Son hebreos? Yo también. ¿Son israelitas? Yo también. ¿Son descendientes de Abraham? También yo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 11, 23, NULL, '¿Son ministros de Cristo? (Como si estuviera loco hablo.) Yo más; en trabajos más abundante; en azotes sin número; en cárceles más; en peligros de muerte muchas veces.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 11, 24, NULL, 'De los judíos cinco veces he recibido cuarenta azotes menos uno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 11, 25, NULL, 'Tres veces he sido azotado con varas; una vez apedreado; tres veces he padecido naufragio; una noche y un día he estado como náufrago en alta mar;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 11, 26, NULL, 'en caminos muchas veces; en peligros de ríos, peligros de ladrones, peligros de los de mi nación, peligros de los gentiles, peligros en la ciudad, peligros en el desierto, peligros en el mar, peligros entre falsos hermanos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 11, 27, NULL, 'en trabajo y fatiga, en muchos desvelos, en hambre y sed, en muchos ayunos, en frío y en desnudez;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 11, 28, NULL, 'y además de otras cosas, lo que sobre mí se agolpa cada día, la preocupación por todas las iglesias.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 11, 29, NULL, '¿Quién enferma, y yo no enfermo? ¿A quién se le hace tropezar, y yo no me indigno?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 11, 30, NULL, 'Si es necesario gloriarse, me gloriaré en lo que es de mi debilidad.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 11, 31, NULL, 'El Dios y Padre de nuestro Señor Jesucristo, quien es bendito por los siglos, sabe que no miento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 11, 32, NULL, 'En Damasco, el gobernador de la provincia del rey Aretas guardaba la ciudad de los damascenos para prenderme;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 11, 33, NULL, 'y fui descolgado del muro en un canasto por una ventana, y escapé de sus manos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 12, 1, 'El aguijón en la carne', 'Ciertamente no me conviene gloriarme; pero vendré a las visiones y a las revelaciones del Señor.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 12, 2, NULL, 'Conozco a un hombre en Cristo, que hace catorce años (si en el cuerpo, no lo sé; si fuera del cuerpo, no lo sé; Dios lo sabe) fue arrebatado hasta el tercer cielo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 12, 3, NULL, 'Y conozco al tal hombre (si en el cuerpo, o fuera del cuerpo, no lo sé; Dios lo sabe),', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 12, 4, NULL, 'que fue arrebatado al paraíso, donde oyó palabras inefables que no le es dado al hombre expresar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 12, 5, NULL, 'De tal hombre me gloriaré; pero de mí mismo en nada me gloriaré, sino en mis debilidades.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 12, 6, NULL, 'Sin embargo, si quisiera gloriarme, no sería insensato, porque diría la verdad; pero lo dejo, para que nadie piense de mí más de lo que en mí ve, u oye de mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 12, 7, NULL, 'Y para que la grandeza de las revelaciones no me exaltase desmedidamente, me fue dado un aguijón en mi carne, un mensajero de Satanás que me abofetee, para que no me enaltezca sobremanera;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 12, 8, NULL, 'respecto a lo cual tres veces he rogado al Señor, que lo quite de mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 12, 9, NULL, 'Y me ha dicho: Bástate mi gracia; porque mi poder se perfecciona en la debilidad. Por tanto, de buena gana me gloriaré más bien en mis debilidades, para que repose sobre mí el poder de Cristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 12, 10, NULL, 'Por lo cual, por amor a Cristo me gozo en las debilidades, en afrentas, en necesidades, en persecuciones, en angustias; porque cuando soy débil, entonces soy fuerte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 12, 11, NULL, 'Me he hecho un necio al gloriarme; vosotros me obligasteis a ello, pues yo debía ser alabado por vosotros; porque en nada he sido menos que aquellos grandes apóstoles, aunque nada soy.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 12, 12, NULL, 'Con todo, las señales de apóstol han sido hechas entre vosotros en toda paciencia, por señales, prodigios y milagros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 12, 13, NULL, 'Porque ¿en qué habéis sido menos que las otras iglesias, sino en que yo mismo no os he sido carga? ¡Perdonadme este agravio!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 12, 14, 'Pablo anuncia su tercera visita', 'He aquí, por tercera vez estoy preparado para ir a vosotros; y no os seré gravoso, porque no busco lo vuestro, sino a vosotros, pues no deben atesorar los hijos para los padres, sino los padres para los hijos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 12, 15, NULL, 'Y yo con el mayor placer gastaré lo mío, y aun yo mismo me gastaré del todo por amor de vuestras almas, aunque amándoos más, sea amado menos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 12, 16, NULL, 'Pero admitiendo esto, que yo no os he sido carga, sino que como soy astuto, os prendí por engaño,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 12, 17, NULL, '¿acaso os he engañado por alguno de los que he enviado a vosotros?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 12, 18, NULL, 'Rogué a Tito, y envié con él al hermano. ¿Os engañó acaso Tito? ¿No hemos procedido con el mismo espíritu y en las mismas pisadas?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 12, 19, NULL, '¿Pensáis aún que nos disculpamos con vosotros? Delante de Dios en Cristo hablamos; y todo, muy amados, para vuestra edificación.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 12, 20, NULL, 'Pues me temo que cuando llegue, no os halle tales como quiero, y yo sea hallado de vosotros cual no queréis; que haya entre vosotros contiendas, envidias, iras, divisiones, maledicencias, murmuraciones, soberbias, desórdenes;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 12, 21, NULL, 'que cuando vuelva, me humille Dios entre vosotros, y quizá tenga que llorar por muchos de los que antes han pecado, y no se han arrepentido de la inmundicia y fornicación y lascivia que han cometido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 13, 1, NULL, 'Esta es la tercera vez que voy a vosotros. Por boca de dos o de tres testigos se decidirá todo asunto.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 13, 2, NULL, 'He dicho antes, y ahora digo otra vez como si estuviera presente, y ahora ausente lo escribo a los que antes pecaron, y a todos los demás, que si voy otra vez, no seré indulgente;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 13, 3, NULL, 'pues buscáis una prueba de que habla Cristo en mí, el cual no es débil para con vosotros, sino que es poderoso en vosotros.', 0, 'spa', 'RVR1960', NULL);\n"
;

  public static final String SQL_PARTE_2 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', '2 Co', 13, 4, NULL, 'Porque aunque fue crucificado en debilidad, vive por el poder de Dios. Pues también nosotros somos débiles en él, pero viviremos con él por el poder de Dios para con vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 13, 5, NULL, 'Examinaos a vosotros mismos si estáis en la fe; probaos a vosotros mismos. ¿O no os conocéis a vosotros mismos, que Jesucristo está en vosotros, a menos que estéis reprobados?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 13, 6, NULL, 'Mas espero que conoceréis que nosotros no estamos reprobados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 13, 7, NULL, 'Y oramos a Dios que ninguna cosa mala hagáis; no para que nosotros aparezcamos aprobados, sino para que vosotros hagáis lo bueno, aunque nosotros seamos como reprobados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 13, 8, NULL, 'Porque nada podemos contra la verdad, sino por la verdad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 13, 9, NULL, 'Por lo cual nos gozamos de que seamos nosotros débiles, y que vosotros estéis fuertes; y aun oramos por vuestra perfección.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 13, 10, NULL, 'Por esto os escribo estando ausente, para no usar de severidad cuando esté presente, conforme a la autoridad que el Señor me ha dado para edificación, y no para destrucción.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 13, 11, 'Saludos y doxología final', 'Por lo demás, hermanos, tened gozo, perfeccionaos, consolaos, sed de un mismo sentir, y vivid en paz; y el Dios de paz y de amor estará con vosotros.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 13, 12, NULL, 'Saludaos unos a otros con ósculo santo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 13, 13, NULL, 'Todos los santos os saludan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Co', 13, 14, NULL, 'La gracia del Señor Jesucristo, el amor de Dios, y la comunión del Espíritu Santo sean con todos vosotros. Amén.', 0, 'spa', 'RVR1960', NULL);\n"
;

}