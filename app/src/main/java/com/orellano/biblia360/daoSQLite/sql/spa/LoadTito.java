package com.orellano.biblia360.daoSQLite.sql.spa;

public final class LoadTito {
  public LoadTito() {}
  public static final String SQL_PARTE_1 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Tit', 1, 1, 'Salutación', 'Pablo, siervo de Dios y apóstol de Jesucristo, conforme a la fe de los escogidos de Dios y el conocimiento de la verdad que es según la piedad,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 1, 2, NULL, 'en la esperanza de la vida eterna, la cual Dios, que no miente, prometió desde antes del principio de los siglos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 1, 3, NULL, 'y a su debido tiempo manifestó su palabra por medio de la predicación que me fue encomendada por mandato de Dios nuestro Salvador,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 1, 4, NULL, 'a Tito, verdadero hijo en la común fe: Gracia, misericordia y paz, de Dios Padre y del Señor Jesucristo nuestro Salvador.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 1, 5, 'Requisitos de ancianos y obispos', 'Por esta causa te dejé en Creta, para que corrigieses lo deficiente, y establecieses ancianos en cada ciudad, así como yo te mandé;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 1, 6, NULL, 'el que fuere irreprensible, marido de una sola mujer, y tenga hijos creyentes que no estén acusados de disolución ni de rebeldía.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 1, 7, NULL, 'Porque es necesario que el obispo sea irreprensible, como administrador de Dios; no soberbio, no iracundo, no dado al vino, no pendenciero, no codicioso de ganancias deshonestas,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 1, 8, NULL, 'sino hospedador, amante de lo bueno, sobrio, justo, santo, dueño de sí mismo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 1, 9, NULL, 'retenedor de la palabra fiel tal como ha sido enseñada, para que también pueda exhortar con sana enseñanza y convencer a los que contradicen.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 1, 10, NULL, 'Porque hay aún muchos contumaces, habladores de vanidades y engañadores, mayormente los de la circuncisión,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 1, 11, NULL, 'a los cuales es preciso tapar la boca; que trastornan casas enteras, enseñando por ganancia deshonesta lo que no conviene.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 1, 12, NULL, 'Uno de ellos, su propio profeta, dijo: Los cretenses, siempre mentirosos, malas bestias, glotones ociosos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 1, 13, NULL, 'Este testimonio es verdadero; por tanto, repréndelos duramente, para que sean sanos en la fe,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 1, 14, NULL, 'no atendiendo a fábulas judaicas, ni a mandamientos de hombres que se apartan de la verdad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 1, 15, NULL, 'Todas las cosas son puras para los puros, mas para los corrompidos e incrédulos nada les es puro; pues hasta su mente y su conciencia están corrompidas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 1, 16, NULL, 'Profesan conocer a Dios, pero con los hechos lo niegan, siendo abominables y rebeldes, reprobados en cuanto a toda buena obra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 2, 1, 'Enseñanza de la sana doctrina', 'Pero tú habla lo que está de acuerdo con la sana doctrina.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 2, 2, NULL, 'Que los ancianos sean sobrios, serios, prudentes, sanos en la fe, en el amor, en la paciencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 2, 3, NULL, 'Las ancianas asimismo sean reverentes en su porte; no calumniadoras, no esclavas del vino, maestras del bien;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 2, 4, NULL, 'que enseñen a las mujeres jóvenes a amar a sus maridos y a sus hijos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 2, 5, NULL, 'a ser prudentes, castas, cuidadosas de su casa, buenas, sujetas a sus maridos, para que la palabra de Dios no sea blasfemada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 2, 6, NULL, 'Exhorta asimismo a los jóvenes a que sean prudentes;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 2, 7, NULL, 'presentándote tú en todo como ejemplo de buenas obras; en la enseñanza mostrando integridad, seriedad,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 2, 8, NULL, 'palabra sana e irreprochable, de modo que el adversario se avergüence, y no tenga nada malo que decir de vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 2, 9, NULL, 'Exhorta a los siervos a que se sujeten a sus amos, que agraden en todo, que no sean respondones;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 2, 10, NULL, 'no defraudando, sino mostrándose fieles en todo, para que en todo adornen la doctrina de Dios nuestro Salvador.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 2, 11, NULL, 'Porque la gracia de Dios se ha manifestado para salvación a todos los hombres,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 2, 12, NULL, 'enseñándonos que, renunciando a la impiedad y a los deseos mundanos, vivamos en este siglo sobria, justa y piadosamente,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 2, 13, NULL, 'aguardando la esperanza bienaventurada y la manifestación gloriosa de nuestro gran Dios y Salvador Jesucristo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 2, 14, NULL, 'quien se dio a sí mismo por nosotros para redimirnos de toda iniquidad y purificar para sí un pueblo propio, celoso de buenas obras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 2, 15, NULL, 'Esto habla, y exhorta y reprende con toda autoridad. Nadie te menosprecie.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 3, 1, 'Justificados por gracia', 'Recuérdales que se sujeten a los gobernantes y autoridades, que obedezcan, que estén dispuestos a toda buena obra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 3, 2, NULL, 'Que a nadie difamen, que no sean pendencieros, sino amables, mostrando toda mansedumbre para con todos los hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 3, 3, NULL, 'Porque nosotros también éramos en otro tiempo insensatos, rebeldes, extraviados, esclavos de concupiscencias y deleites diversos, viviendo en malicia y envidia, aborrecibles, y aborreciéndonos unos a otros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 3, 4, NULL, 'Pero cuando se manifestó la bondad de Dios nuestro Salvador, y su amor para con los hombres,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 3, 5, NULL, 'nos salvó, no por obras de justicia que nosotros hubiéramos hecho, sino por su misericordia, por el lavamiento de la regeneración y por la renovación en el Espíritu Santo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 3, 6, NULL, 'el cual derramó en nosotros abundantemente por Jesucristo nuestro Salvador,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 3, 7, NULL, 'para que justificados por su gracia, viniésemos a ser herederos conforme a la esperanza de la vida eterna.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 3, 8, NULL, 'Palabra fiel es esta, y en estas cosas quiero que insistas con firmeza, para que los que creen en Dios procuren ocuparse en buenas obras. Estas cosas son buenas y útiles a los hombres.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 3, 9, NULL, 'Pero evita las cuestiones necias, y genealogías, y contenciones, y discusiones acerca de la ley; porque son vanas y sin provecho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 3, 10, NULL, 'Al hombre que cause divisiones, después de una y otra amonestación deséchalo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 3, 11, NULL, 'sabiendo que el tal se ha pervertido, y peca y está condenado por su propio juicio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 3, 12, 'Instrucciones personales', 'Cuando envíe a ti a Artemas o a Tíquico, apresúrate a venir a mí en Nicópolis, porque allí he determinado pasar el invierno.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 3, 13, NULL, 'A Zenas intérprete de la ley, y a Apolos, encamínales con solicitud, de modo que nada les falte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 3, 14, NULL, 'Y aprendan también los nuestros a ocuparse en buenas obras para los casos de necesidad, para que no sean sin fruto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Tit', 3, 15, 'Salutaciones y bendición final', 'Todos los que están conmigo te saludan. Saluda a los que nos aman en la fe. La gracia sea con todos vosotros. Amén.', 1, 'spa', 'RVR1960', NULL);\n"
;

}