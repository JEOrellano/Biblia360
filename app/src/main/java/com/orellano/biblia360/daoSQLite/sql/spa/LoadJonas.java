package com.orellano.biblia360.daoSQLite.sql.spa;

public final class LoadJonas {
  public LoadJonas() {}
  public static final String SQL_PARTE_1 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Jon', 1, 1, 'Jonás huye de Jehová', 'Vino palabra de Jehová a Jonás hijo de Amitai, diciendo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 1, 2, NULL, 'Levántate y ve a Nínive, aquella gran ciudad, y pregona contra ella; porque ha subido su maldad delante de mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 1, 3, NULL, 'Y Jonás se levantó para huir de la presencia de Jehová a Tarsis, y descendió a Jope, y halló una nave que partía para Tarsis; y pagando su pasaje, entró en ella para irse con ellos a Tarsis, lejos de la presencia de Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 1, 4, NULL, 'Pero Jehová hizo levantar un gran viento en el mar, y hubo en el mar una tempestad tan grande que se pensó que se partiría la nave.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 1, 5, NULL, 'Y los marineros tuvieron miedo, y cada uno clamaba a su dios; y echaron al mar los enseres que había en la nave, para descargarla de ellos. Pero Jonás había bajado al interior de la nave, y se había echado a dormir.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 1, 6, NULL, 'Y el patrón de la nave se le acercó y le dijo: ¿Qué tienes, dormilón? Levántate, y clama a tu Dios; quizá él tendrá compasión de nosotros, y no pereceremos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 1, 7, NULL, 'Y dijeron cada uno a su compañero: Venid y echemos suertes, para que sepamos por causa de quién nos ha venido este mal. Y echaron suertes, y la suerte cayó sobre Jonás.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 1, 8, NULL, 'Entonces le dijeron ellos: Decláranos ahora por qué nos ha venido este mal. ¿Qué oficio tienes, y de dónde vienes? ¿Cuál es tu tierra, y de qué pueblo eres?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 1, 9, NULL, 'Y él les respondió: Soy hebreo, y temo a Jehová, Dios de los cielos, que hizo el mar y la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 1, 10, NULL, 'Y aquellos hombres temieron sobremanera, y le dijeron: ¿Por qué has hecho esto? Porque ellos sabían que huía de la presencia de Jehová, pues él se lo había declarado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 1, 11, NULL, 'Y le dijeron: ¿Qué haremos contigo para que el mar se nos aquiete? Porque el mar se iba embraveciendo más y más.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 1, 12, NULL, 'Él les respondió: Tomadme y echadme al mar, y el mar se os aquietará; porque yo sé que por mi causa ha venido esta gran tempestad sobre vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 1, 13, NULL, 'Y aquellos hombres trabajaron para hacer volver la nave a tierra; mas no pudieron, porque el mar se iba embraveciendo más y más contra ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 1, 14, NULL, 'Entonces clamaron a Jehová y dijeron: Te rogamos ahora, Jehová, que no perezcamos nosotros por la vida de este hombre, ni pongas sobre nosotros la sangre inocente; porque tú, Jehová, has hecho como has querido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 1, 15, NULL, 'Y tomaron a Jonás, y lo echaron al mar; y el mar se aquietó de su furor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 1, 16, NULL, 'Y temieron aquellos hombres a Jehová con gran temor, y ofrecieron sacrificio a Jehová, e hicieron votos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 1, 17, NULL, 'Pero Jehová tenía preparado un gran pez que tragase a Jonás; y estuvo Jonás en el vientre del pez tres días y tres noches.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 2, 1, 'Oración de Jonás', 'Entonces oró Jonás a Jehová su Dios desde el vientre del pez,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 2, 2, NULL, 'y dijo: Invoqué en mi angustia a Jehová, y él me oyó; Desde el seno del Seol clamé, Y mi voz oíste.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 2, 3, NULL, 'Me echaste a lo profundo, en medio de los mares, Y me rodeó la corriente; Todas tus ondas y tus olas pasaron sobre mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 2, 4, NULL, 'Entonces dije: Desechado soy de delante de tus ojos; Mas aún veré tu santo templo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 2, 5, NULL, 'Las aguas me rodearon hasta el alma, Rodeóme el abismo; El alga se enredó a mi cabeza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 2, 6, NULL, 'Descendí a los cimientos de los montes; La tierra echó sus cerrojos sobre mí para siempre; Mas tú sacaste mi vida de la sepultura, oh Jehová Dios mío.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 2, 7, NULL, 'Cuando mi alma desfallecía en mí, me acordé de Jehová, Y mi oración llegó hasta ti en tu santo templo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 2, 8, NULL, 'Los que siguen vanidades ilusorias, Su misericordia abandonan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 2, 9, NULL, 'Mas yo con voz de alabanza te ofreceré sacrificios; Pagaré lo que prometí. La salvación es de Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 2, 10, NULL, 'Y mandó Jehová al pez, y vomitó a Jonás en tierra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 3, 1, 'Nínive se arrepiente', 'Vino palabra de Jehová por segunda vez a Jonás, diciendo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 3, 2, NULL, 'Levántate y ve a Nínive, aquella gran ciudad, y proclama en ella el mensaje que yo te diré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 3, 3, NULL, 'Y se levantó Jonás, y fue a Nínive conforme a la palabra de Jehová. Y era Nínive ciudad grande en extremo, de tres días de camino.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 3, 4, NULL, 'Y comenzó Jonás a entrar por la ciudad, camino de un día, y predicaba diciendo: De aquí a cuarenta días Nínive será destruida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 3, 5, NULL, 'Y los hombres de Nínive creyeron a Dios, y proclamaron ayuno, y se vistieron de cilicio desde el mayor hasta el menor de ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 3, 6, NULL, 'Y llegó la noticia hasta el rey de Nínive, y se levantó de su silla, se despojó de su vestido, y se cubrió de cilicio y se sentó sobre ceniza.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 3, 7, NULL, 'E hizo proclamar y anunciar en Nínive, por mandato del rey y de sus grandes, diciendo: Hombres y animales, bueyes y ovejas, no gusten cosa alguna; no se les dé alimento, ni beban agua;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 3, 8, NULL, 'sino cúbranse de cilicio hombres y animales, y clamen a Dios fuertemente; y conviértase cada uno de su mal camino, de la rapiña que hay en sus manos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 3, 9, NULL, '¿Quién sabe si se volverá y se arrepentirá Dios, y se apartará del ardor de su ira, y no pereceremos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 3, 10, NULL, 'Y vio Dios lo que hicieron, que se convirtieron de su mal camino; y se arrepintió del mal que había dicho que les haría, y no lo hizo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 4, 1, 'El enojo de Jonás', 'Pero Jonás se apesadumbró en extremo, y se enojó.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 4, 2, NULL, 'Y oró a Jehová y dijo: Ahora, oh Jehová, ¿no es esto lo que yo decía estando aún en mi tierra? Por eso me apresuré a huir a Tarsis; porque sabía yo que tú eres Dios clemente y piadoso, tardo en enojarte, y de grande misericordia, y que te arrepientes del mal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 4, 3, NULL, 'Ahora pues, oh Jehová, te ruego que me quites la vida; porque mejor me es la muerte que la vida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 4, 4, NULL, 'Y Jehová le dijo: ¿Haces tú bien en enojarte tanto?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 4, 5, NULL, 'Y salió Jonás de la ciudad, y acampó hacia el oriente de la ciudad, y se hizo allí una enramada, y se sentó debajo de ella a la sombra, hasta ver qué acontecería en la ciudad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 4, 6, NULL, 'Y preparó Jehová Dios una calabacera, la cual creció sobre Jonás para que hiciese sombra sobre su cabeza, y le librase de su malestar; y Jonás se alegró grandemente por la calabacera.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 4, 7, NULL, 'Pero al venir el alba del día siguiente, Dios preparó un gusano, el cual hirió la calabacera, y se secó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 4, 8, NULL, 'Y aconteció que al salir el sol, preparó Dios un recio viento solano, y el sol hirió a Jonás en la cabeza, y se desmayaba, y deseaba la muerte, diciendo: Mejor sería para mí la muerte que la vida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 4, 9, NULL, 'Entonces dijo Dios a Jonás: ¿Tanto te enojas por la calabacera? Y él respondió: Mucho me enojo, hasta la muerte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 4, 10, NULL, 'Y dijo Jehová: Tuviste tú lástima de la calabacera, en la cual no trabajaste, ni tú la hiciste crecer; que en espacio de una noche nació, y en espacio de otra noche pereció.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Jon', 4, 11, NULL, '¿Y no tendré yo piedad de Nínive, aquella gran ciudad donde hay más de ciento veinte mil personas que no saben discernir entre su mano derecha y su mano izquierda, y muchos animales?', 0, 'spa', 'RVR1960', NULL);\n"
;

}