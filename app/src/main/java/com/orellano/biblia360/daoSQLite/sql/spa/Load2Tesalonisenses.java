package com.orellano.biblia360.daoSQLite.sql.spa;

public final class Load2Tesalonisenses {
  public Load2Tesalonisenses() {}
  public static final String SQL_PARTE_1 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', '2 Ts', 1, 1, 'Salutación', 'Pablo, Silvano y Timoteo, a la iglesia de los tesalonicenses en Dios nuestro Padre y en el Señor Jesucristo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 1, 2, NULL, 'Gracia y paz a vosotros, de Dios nuestro Padre y del Señor Jesucristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 1, 3, 'Dios juzgará a los pecadores en la venida de Cristo', 'Debemos siempre dar gracias a Dios por vosotros, hermanos, como es digno, por cuanto vuestra fe va creciendo, y el amor de todos y cada uno de vosotros abunda para con los demás;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 1, 4, NULL, 'tanto, que nosotros mismos nos gloriamos de vosotros en las iglesias de Dios, por vuestra paciencia y fe en todas vuestras persecuciones y tribulaciones que soportáis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 1, 5, NULL, 'Esto es demostración del justo juicio de Dios, para que seáis tenidos por dignos del reino de Dios, por el cual asimismo padecéis.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 1, 6, NULL, 'Porque es justo delante de Dios pagar con tribulación a los que os atribulan,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 1, 7, NULL, 'y a vosotros que sois atribulados, daros reposo con nosotros, cuando se manifieste el Señor Jesús desde el cielo con los ángeles de su poder,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 1, 8, NULL, 'en llama de fuego, para dar retribución a los que no conocieron a Dios, ni obedecen al evangelio de nuestro Señor Jesucristo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 1, 9, NULL, 'los cuales sufrirán pena de eterna perdición, excluidos de la presencia del Señor y de la gloria de su poder,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 1, 10, NULL, 'cuando venga en aquel día para ser glorificado en sus santos y ser admirado en todos los que creyeron (por cuanto nuestro testimonio ha sido creído entre vosotros).', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 1, 11, NULL, 'Por lo cual asimismo oramos siempre por vosotros, para que nuestro Dios os tenga por dignos de su llamamiento, y cumpla todo propósito de bondad y toda obra de fe con su poder,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 1, 12, NULL, 'para que el nombre de nuestro Señor Jesucristo sea glorificado en vosotros, y vosotros en él, por la gracia de nuestro Dios y del Señor Jesucristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 2, 1, 'Manifestación del hombre de pecado', 'Pero con respecto a la venida de nuestro Señor Jesucristo, y nuestra reunión con él, os rogamos, hermanos,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 2, 2, NULL, 'que no os dejéis mover fácilmente de vuestro modo de pensar, ni os conturbéis, ni por espíritu, ni por palabra, ni por carta como si fuera nuestra, en el sentido de que el día del Señor está cerca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 2, 3, NULL, 'Nadie os engañe en ninguna manera; porque no vendrá sin que antes venga la apostasía, y se manifieste el hombre de pecado, el hijo de perdición,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 2, 4, NULL, 'el cual se opone y se levanta contra todo lo que se llama Dios o es objeto de culto; tanto que se sienta en el templo de Dios como Dios, haciéndose pasar por Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 2, 5, NULL, '¿No os acordáis que cuando yo estaba todavía con vosotros, os decía esto?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 2, 6, NULL, 'Y ahora vosotros sabéis lo que lo detiene, a fin de que a su debido tiempo se manifieste.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 2, 7, NULL, 'Porque ya está en acción el misterio de la iniquidad; solo que hay quien al presente lo detiene, hasta que él a su vez sea quitado de en medio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 2, 8, NULL, 'Y entonces se manifestará aquel inicuo, a quien el Señor matará con el espíritu de su boca, y destruirá con el resplandor de su venida;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 2, 9, NULL, 'inicuo cuyo advenimiento es por obra de Satanás, con gran poder y señales y prodigios mentirosos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 2, 10, NULL, 'y con todo engaño de iniquidad para los que se pierden, por cuanto no recibieron el amor de la verdad para ser salvos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 2, 11, NULL, 'Por esto Dios les envía un poder engañoso, para que crean la mentira,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 2, 12, NULL, 'a fin de que sean condenados todos los que no creyeron a la verdad, sino que se complacieron en la injusticia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 2, 13, 'Escogidos para salvación', 'Pero nosotros debemos dar siempre gracias a Dios respecto a vosotros, hermanos amados por el Señor, de que Dios os haya escogido desde el principio para salvación, mediante la santificación por el Espíritu y la fe en la verdad,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 2, 14, NULL, 'a lo cual os llamó mediante nuestro evangelio, para alcanzar la gloria de nuestro Señor Jesucristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 2, 15, NULL, 'Así que, hermanos, estad firmes, y retened la doctrina que habéis aprendido, sea por palabra, o por carta nuestra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 2, 16, NULL, 'Y el mismo Jesucristo Señor nuestro, y Dios nuestro Padre, el cual nos amó y nos dio consolación eterna y buena esperanza por gracia,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 2, 17, NULL, 'conforte vuestros corazones, y os confirme en toda buena palabra y obra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 3, 1, 'Que la palabra de Dios sea glorificada', 'Por lo demás, hermanos, orad por nosotros, para que la palabra del Señor corra y sea glorificada, así como lo fue entre vosotros,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 3, 2, NULL, 'y para que seamos librados de hombres perversos y malos; porque no es de todos la fe.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 3, 3, NULL, 'Pero fiel es el Señor, que os afirmará y guardará del mal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 3, 4, NULL, 'Y tenemos confianza respecto a vosotros en el Señor, en que hacéis y haréis lo que os hemos mandado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 3, 5, NULL, 'Y el Señor encamine vuestros corazones al amor de Dios, y a la paciencia de Cristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 3, 6, 'El deber de trabajar', 'Pero os ordenamos, hermanos, en el nombre de nuestro Señor Jesucristo, que os apartéis de todo hermano que ande desordenadamente, y no según la enseñanza que recibisteis de nosotros.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 3, 7, NULL, 'Porque vosotros mismos sabéis de qué manera debéis imitarnos; pues nosotros no anduvimos desordenadamente entre vosotros,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 3, 8, NULL, 'ni comimos de balde el pan de nadie, sino que trabajamos con afán y fatiga día y noche, para no ser gravosos a ninguno de vosotros;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 3, 9, NULL, 'no porque no tuviésemos derecho, sino por daros nosotros mismos un ejemplo para que nos imitaseis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 3, 10, NULL, 'Porque también cuando estábamos con vosotros, os ordenábamos esto: Si alguno no quiere trabajar, tampoco coma.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 3, 11, NULL, 'Porque oímos que algunos de entre vosotros andan desordenadamente, no trabajando en nada, sino entremetiéndose en lo ajeno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 3, 12, NULL, 'A los tales mandamos y exhortamos por nuestro Señor Jesucristo, que trabajando sosegadamente, coman su propio pan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 3, 13, NULL, 'Y vosotros, hermanos, no os canséis de hacer bien.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 3, 14, NULL, 'Si alguno no obedece a lo que decimos por medio de esta carta, a ese señaladlo, y no os juntéis con él, para que se avergüence.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 3, 15, NULL, 'Mas no lo tengáis por enemigo, sino amonestadle como a hermano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 3, 16, 'Bendición final', 'Y el mismo Señor de paz os dé siempre paz en toda manera. El Señor sea con todos vosotros.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 3, 17, NULL, 'La salutación es de mi propia mano, de Pablo, que es el signo en toda carta mía; así escribo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Ts', 3, 18, NULL, 'La gracia de nuestro Señor Jesucristo sea con todos vosotros. Amén.', 0, 'spa', 'RVR1960', NULL);\n"
;

}