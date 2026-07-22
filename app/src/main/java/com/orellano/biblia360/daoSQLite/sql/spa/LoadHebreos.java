package com.orellano.biblia360.daoSQLite.sql.spa;

public final class LoadHebreos {
  public LoadHebreos() {}
  public static final String SQL_PARTE_1 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Heb', 1, 1, 'Dios ha hablado por su Hijo', 'Dios, habiendo hablado muchas veces y de muchas maneras en otro tiempo a los padres por los profetas,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 1, 2, NULL, 'en estos postreros días nos ha hablado por el Hijo, a quien constituyó heredero de todo, y por quien asimismo hizo el universo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 1, 3, NULL, 'el cual, siendo el resplandor de su gloria, y la imagen misma de su sustancia, y quien sustenta todas las cosas con la palabra de su poder, habiendo efectuado la purificación de nuestros pecados por medio de sí mismo, se sentó a la diestra de la Majestad en las alturas,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 1, 4, NULL, 'hecho tanto superior a los ángeles, cuanto heredó más excelente nombre que ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 1, 5, 'El Hijo, superior a los ángeles', 'Porque ¿a cuál de los ángeles dijo Dios jamás: Mi Hijo eres tú, Yo te he engendrado hoy, y otra vez: Yo seré a él Padre, Y él me será a mí hijo?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 1, 6, NULL, 'Y otra vez, cuando introduce al Primogénito en el mundo, dice: Adórenle todos los ángeles de Dios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 1, 7, NULL, 'Ciertamente de los ángeles dice: El que hace a sus ángeles espíritus, Y a sus ministros llama de fuego.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 1, 8, NULL, 'Mas del Hijo dice: Tu trono, oh Dios, por el siglo del siglo; Cetro de equidad es el cetro de tu reino.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 1, 9, NULL, 'Has amado la justicia, y aborrecido la maldad, Por lo cual te ungió Dios, el Dios tuyo, Con óleo de alegría más que a tus compañeros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 1, 10, NULL, 'Y: Tú, oh Señor, en el principio fundaste la tierra, Y los cielos son obra de tus manos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 1, 11, NULL, 'Ellos perecerán, mas tú permaneces; Y todos ellos se envejecerán como una vestidura,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 1, 12, NULL, 'Y como un vestido los envolverás, y serán mudados; Pero tú eres el mismo, Y tus años no acabarán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 1, 13, NULL, 'Pues, ¿a cuál de los ángeles dijo Dios jamás: Siéntate a mi diestra, Hasta que ponga a tus enemigos por estrado de tus pies?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 1, 14, NULL, '¿No son todos espíritus ministradores, enviados para servicio a favor de los que serán herederos de la salvación?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 2, 1, 'Una salvación tan grande', 'Por tanto, es necesario que con más diligencia atendamos a las cosas que hemos oído, no sea que nos deslicemos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 2, 2, NULL, 'Porque si la palabra dicha por medio de los ángeles fue firme, y toda transgresión y desobediencia recibió justa retribución,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 2, 3, NULL, '¿cómo escaparemos nosotros, si descuidamos una salvación tan grande? La cual, habiendo sido anunciada primeramente por el Señor, nos fue confirmada por los que oyeron,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 2, 4, NULL, 'testificando Dios juntamente con ellos, con señales y prodigios y diversos milagros y repartimientos del Espíritu Santo según su voluntad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 2, 5, 'El autor de la salvación', 'Porque no sujetó a los ángeles el mundo venidero, acerca del cual estamos hablando;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 2, 6, NULL, 'pero alguien testificó en cierto lugar, diciendo: ¿Qué es el hombre, para que te acuerdes de él, O el hijo del hombre, para que le visites?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 2, 7, NULL, 'Le hiciste un poco menor que los ángeles, Le coronaste de gloria y de honra, Y le pusiste sobre las obras de tus manos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 2, 8, NULL, 'Todo lo sujetaste bajo sus pies. Porque en cuanto le sujetó todas las cosas, nada dejó que no sea sujeto a él; pero todavía no vemos que todas las cosas le sean sujetas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 2, 9, NULL, 'Pero vemos a aquel que fue hecho un poco menor que los ángeles, a Jesús, coronado de gloria y de honra, a causa del padecimiento de la muerte, para que por la gracia de Dios gustase la muerte por todos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 2, 10, NULL, 'Porque convenía a aquel por cuya causa son todas las cosas, y por quien todas las cosas subsisten, que habiendo de llevar muchos hijos a la gloria, perfeccionase por aflicciones al autor de la salvación de ellos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 2, 11, NULL, 'Porque el que santifica y los que son santificados, de uno son todos; por lo cual no se avergüenza de llamarlos hermanos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 2, 12, NULL, 'diciendo: Anunciaré a mis hermanos tu nombre, En medio de la congregación te alabaré.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 2, 13, NULL, 'Y otra vez: Yo confiaré en él. Y de nuevo: He aquí, yo y los hijos que Dios me dio.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 2, 14, NULL, 'Así que, por cuanto los hijos participaron de carne y sangre, él también participó de lo mismo, para destruir por medio de la muerte al que tenía el imperio de la muerte, esto es, al diablo,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 2, 15, NULL, 'y librar a todos los que por el temor de la muerte estaban durante toda la vida sujetos a servidumbre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 2, 16, NULL, 'Porque ciertamente no socorrió a los ángeles, sino que socorrió a la descendencia de Abraham.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 2, 17, NULL, 'Por lo cual debía ser en todo semejante a sus hermanos, para venir a ser misericordioso y fiel sumo sacerdote en lo que a Dios se refiere, para expiar los pecados del pueblo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 2, 18, NULL, 'Pues en cuanto él mismo padeció siendo tentado, es poderoso para socorrer a los que son tentados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 3, 1, 'Jesús es superior a Moisés', 'Por tanto, hermanos santos, participantes del llamamiento celestial, considerad al apóstol y sumo sacerdote de nuestra profesión, Cristo Jesús;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 3, 2, NULL, 'el cual es fiel al que le constituyó, como también lo fue Moisés en toda la casa de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 3, 3, NULL, 'Porque de tanto mayor gloria que Moisés es estimado digno este, cuanto tiene mayor honra que la casa el que la hizo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 3, 4, NULL, 'Porque toda casa es hecha por alguno; pero el que hizo todas las cosas es Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 3, 5, NULL, 'Y Moisés a la verdad fue fiel en toda la casa de Dios, como siervo, para testimonio de lo que se iba a decir;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 3, 6, NULL, 'pero Cristo como hijo sobre su casa, la cual casa somos nosotros, si retenemos firme hasta el fin la confianza y el gloriarnos en la esperanza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 3, 7, 'El reposo del pueblo de Dios', 'Por lo cual, como dice el Espíritu Santo: Si oyereis hoy su voz,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 3, 8, NULL, 'No endurezcáis vuestros corazones, Como en la provocación, en el día de la tentación en el desierto,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 3, 9, NULL, 'Donde me tentaron vuestros padres; me probaron, Y vieron mis obras cuarenta años.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 3, 10, NULL, 'A causa de lo cual me disgusté contra esa generación, Y dije: Siempre andan vagando en su corazón, Y no han conocido mis caminos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 3, 11, NULL, 'Por tanto, juré en mi ira: No entrarán en mi reposo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 3, 12, NULL, 'Mirad, hermanos, que no haya en ninguno de vosotros corazón malo de incredulidad para apartarse del Dios vivo;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 3, 13, NULL, 'antes exhortaos los unos a los otros cada día, entre tanto que se dice: Hoy; para que ninguno de vosotros se endurezca por el engaño del pecado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 3, 14, NULL, 'Porque somos hechos participantes de Cristo, con tal que retengamos firme hasta el fin nuestra confianza del principio,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 3, 15, NULL, 'entre tanto que se dice: Si oyereis hoy su voz, No endurezcáis vuestros corazones, como en la provocación.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 3, 16, NULL, '¿Quiénes fueron los que, habiendo oído, le provocaron? ¿No fueron todos los que salieron de Egipto por mano de Moisés?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 3, 17, NULL, '¿Y con quiénes estuvo él disgustado cuarenta años? ¿No fue con los que pecaron, cuyos cuerpos cayeron en el desierto?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 3, 18, NULL, '¿Y a quiénes juró que no entrarían en su reposo, sino a aquellos que desobedecieron?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 3, 19, NULL, 'Y vemos que no pudieron entrar a causa de incredulidad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 4, 1, NULL, 'Temamos, pues, no sea que permaneciendo aún la promesa de entrar en su reposo, alguno de vosotros parezca no haberlo alcanzado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 4, 2, NULL, 'Porque también a nosotros se nos ha anunciado la buena nueva como a ellos; pero no les aprovechó el oír la palabra, por no ir acompañada de fe en los que la oyeron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 4, 3, NULL, 'Pero los que hemos creído entramos en el reposo, de la manera que dijo: Por tanto, juré en mi ira, No entrarán en mi reposo; aunque las obras suyas estaban acabadas desde la fundación del mundo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 4, 4, NULL, 'Porque en cierto lugar dijo así del séptimo día: Y reposó Dios de todas sus obras en el séptimo día.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 4, 5, NULL, 'Y otra vez aquí: No entrarán en mi reposo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 4, 6, NULL, 'Por lo tanto, puesto que falta que algunos entren en él, y aquellos a quienes primero se les anunció la buena nueva no entraron por causa de desobediencia,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 4, 7, NULL, 'otra vez determina un día: Hoy, diciendo después de tanto tiempo, por medio de David, como se dijo: Si oyereis hoy su voz, No endurezcáis vuestros corazones.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 4, 8, NULL, 'Porque si Josué les hubiera dado el reposo, no hablaría después de otro día.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 4, 9, NULL, 'Por tanto, queda un reposo para el pueblo de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 4, 10, NULL, 'Porque el que ha entrado en su reposo, también ha reposado de sus obras, como Dios de las suyas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 4, 11, NULL, 'Procuremos, pues, entrar en aquel reposo, para que ninguno caiga en semejante ejemplo de desobediencia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 4, 12, NULL, 'Porque la palabra de Dios es viva y eficaz, y más cortante que toda espada de dos filos; y penetra hasta partir el alma y el espíritu, las coyunturas y los tuétanos, y discierne los pensamientos y las intenciones del corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 4, 13, NULL, 'Y no hay cosa creada que no sea manifiesta en su presencia; antes bien todas las cosas están desnudas y abiertas a los ojos de aquel a quien tenemos que dar cuenta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 4, 14, 'Jesús el gran sumo sacerdote', 'Por tanto, teniendo un gran sumo sacerdote que traspasó los cielos, Jesús el Hijo de Dios, retengamos nuestra profesión.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 4, 15, NULL, 'Porque no tenemos un sumo sacerdote que no pueda compadecerse de nuestras debilidades, sino uno que fue tentado en todo según nuestra semejanza, pero sin pecado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 4, 16, NULL, 'Acerquémonos, pues, confiadamente al trono de la gracia, para alcanzar misericordia y hallar gracia para el oportuno socorro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 5, 1, NULL, 'Porque todo sumo sacerdote tomado de entre los hombres es constituido a favor de los hombres en lo que a Dios se refiere, para que presente ofrendas y sacrificios por los pecados;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 5, 2, NULL, 'para que se muestre paciente con los ignorantes y extraviados, puesto que él también está rodeado de debilidad;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 5, 3, NULL, 'y por causa de ella debe ofrecer por los pecados, tanto por sí mismo como también por el pueblo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 5, 4, NULL, 'Y nadie toma para sí esta honra, sino el que es llamado por Dios, como lo fue Aarón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 5, 5, NULL, 'Así tampoco Cristo se glorificó a sí mismo haciéndose sumo sacerdote, sino el que le dijo: Tú eres mi Hijo, Yo te he engendrado hoy.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 5, 6, NULL, 'Como también dice en otro lugar: Tú eres sacerdote para siempre, Según el orden de Melquisedec.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 5, 7, NULL, 'Y Cristo, en los días de su carne, ofreciendo ruegos y súplicas con gran clamor y lágrimas al que le podía librar de la muerte, fue oído a causa de su temor reverente.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 5, 8, NULL, 'Y aunque era Hijo, por lo que padeció aprendió la obediencia;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 5, 9, NULL, 'y habiendo sido perfeccionado, vino a ser autor de eterna salvación para todos los que le obedecen;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 5, 10, NULL, 'y fue declarado por Dios sumo sacerdote según el orden de Melquisedec.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 5, 11, 'Advertencia contra la apostasía', 'Acerca de esto tenemos mucho que decir, y difícil de explicar, por cuanto os habéis hecho tardos para oír.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 5, 12, NULL, 'Porque debiendo ser ya maestros, después de tanto tiempo, tenéis necesidad de que se os vuelva a enseñar cuáles son los primeros rudimentos de las palabras de Dios; y habéis llegado a ser tales que tenéis necesidad de leche, y no de alimento sólido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 5, 13, NULL, 'Y todo aquel que participa de la leche es inexperto en la palabra de justicia, porque es niño;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 5, 14, NULL, 'pero el alimento sólido es para los que han alcanzado madurez, para los que por el uso tienen los sentidos ejercitados en el discernimiento del bien y del mal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 6, 1, NULL, 'Por tanto, dejando ya los rudimentos de la doctrina de Cristo, vamos adelante a la perfección; no echando otra vez el fundamento del arrepentimiento de obras muertas, de la fe en Dios,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 6, 2, NULL, 'de la doctrina de bautismos, de la imposición de manos, de la resurrección de los muertos y del juicio eterno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 6, 3, NULL, 'Y esto haremos, si Dios en verdad lo permite.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 6, 4, NULL, 'Porque es imposible que los que una vez fueron iluminados y gustaron del don celestial, y fueron hechos partícipes del Espíritu Santo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 6, 5, NULL, 'y asimismo gustaron de la buena palabra de Dios y los poderes del siglo venidero,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 6, 6, NULL, 'y recayeron, sean otra vez renovados para arrepentimiento, crucificando de nuevo para sí mismos al Hijo de Dios y exponiéndole a vituperio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 6, 7, NULL, 'Porque la tierra que bebe la lluvia que muchas veces cae sobre ella, y produce hierba provechosa a aquellos por los cuales es labrada, recibe bendición de Dios;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 6, 8, NULL, 'pero la que produce espinos y abrojos es reprobada, está próxima a ser maldecida, y su fin es el ser quemada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 6, 9, NULL, 'Pero en cuanto a vosotros, oh amados, estamos persuadidos de cosas mejores, y que pertenecen a la salvación, aunque hablamos así.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 6, 10, NULL, 'Porque Dios no es injusto para olvidar vuestra obra y el trabajo de amor que habéis mostrado hacia su nombre, habiendo servido a los santos y sirviéndoles aún.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 6, 11, NULL, 'Pero deseamos que cada uno de vosotros muestre la misma solicitud hasta el fin, para plena certeza de la esperanza,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 6, 12, NULL, 'a fin de que no os hagáis perezosos, sino imitadores de aquellos que por la fe y la paciencia heredan las promesas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 6, 13, NULL, 'Porque cuando Dios hizo la promesa a Abraham, no pudiendo jurar por otro mayor, juró por sí mismo,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 6, 14, NULL, 'diciendo: De cierto te bendeciré con abundancia y te multiplicaré grandemente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 6, 15, NULL, 'Y habiendo esperado con paciencia, alcanzó la promesa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 6, 16, NULL, 'Porque los hombres ciertamente juran por uno mayor que ellos, y para ellos el fin de toda controversia es el juramento para confirmación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 6, 17, NULL, 'Por lo cual, queriendo Dios mostrar más abundantemente a los herederos de la promesa la inmutabilidad de su consejo, interpuso juramento;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 6, 18, NULL, 'para que por dos cosas inmutables, en las cuales es imposible que Dios mienta, tengamos un fortísimo consuelo los que hemos acudido para asirnos de la esperanza puesta delante de nosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 6, 19, NULL, 'La cual tenemos como segura y firme ancla del alma, y que penetra hasta dentro del velo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 6, 20, NULL, 'donde Jesús entró por nosotros como precursor, hecho sumo sacerdote para siempre según el orden de Melquisedec.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 7, 1, 'El sacerdocio de Melquisedec', 'Porque este Melquisedec, rey de Salem, sacerdote del Dios Altísimo, que salió a recibir a Abraham que volvía de la derrota de los reyes, y le bendijo,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 7, 2, NULL, 'a quien asimismo dio Abraham los diezmos de todo; cuyo nombre significa primeramente Rey de justicia, y también Rey de Salem, esto es, Rey de paz;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 7, 3, NULL, 'sin padre, sin madre, sin genealogía; que ni tiene principio de días, ni fin de vida, sino hecho semejante al Hijo de Dios, permanece sacerdote para siempre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 7, 4, NULL, 'Considerad, pues, cuán grande era este, a quien aun Abraham el patriarca dio diezmos del botín.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 7, 5, NULL, 'Ciertamente los que de entre los hijos de Leví reciben el sacerdocio, tienen mandamiento de tomar del pueblo los diezmos según la ley, es decir, de sus hermanos, aunque estos también hayan salido de los lomos de Abraham.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 7, 6, NULL, 'Pero aquel cuya genealogía no es contada de entre ellos, tomó de Abraham los diezmos, y bendijo al que tenía las promesas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 7, 7, NULL, 'Y sin discusión alguna, el menor es bendecido por el mayor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 7, 8, NULL, 'Y aquí ciertamente reciben los diezmos hombres mortales; pero allí, uno de quien se da testimonio de que vive.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 7, 9, NULL, 'Y por decirlo así, en Abraham pagó el diezmo también Leví, que recibe los diezmos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 7, 10, NULL, 'porque aún estaba en los lomos de su padre cuando Melquisedec le salió al encuentro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 7, 11, NULL, 'Si, pues, la perfección fuera por el sacerdocio levítico (porque bajo él recibió el pueblo la ley), ¿qué necesidad habría aún de que se levantase otro sacerdote, según el orden de Melquisedec, y que no fuese llamado según el orden de Aarón?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 7, 12, NULL, 'Porque cambiado el sacerdocio, necesario es que haya también cambio de ley;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 7, 13, NULL, 'y aquel de quien se dice esto, es de otra tribu, de la cual nadie sirvió al altar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 7, 14, NULL, 'Porque manifiesto es que nuestro Señor vino de la tribu de Judá, de la cual nada habló Moisés tocante al sacerdocio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 7, 15, NULL, 'Y esto es aun más manifiesto, si a semejanza de Melquisedec se levanta un sacerdote distinto,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 7, 16, NULL, 'no constituido conforme a la ley del mandamiento acerca de la descendencia, sino según el poder de una vida indestructible.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 7, 17, NULL, 'Pues se da testimonio de él: Tú eres sacerdote para siempre, Según el orden de Melquisedec.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 7, 18, NULL, 'Queda, pues, abrogado el mandamiento anterior a causa de su debilidad e ineficacia', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 7, 19, NULL, '(pues nada perfeccionó la ley), y de la introducción de una mejor esperanza, por la cual nos acercamos a Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 7, 20, NULL, 'Y esto no fue hecho sin juramento;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 7, 21, NULL, 'porque los otros ciertamente sin juramento fueron hechos sacerdotes; pero este, con el juramento del que le dijo: Juró el Señor, y no se arrepentirá: Tú eres sacerdote para siempre, Según el orden de Melquisedec.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 7, 22, NULL, 'Por tanto, Jesús es hecho fiador de un mejor pacto.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 7, 23, NULL, 'Y los otros sacerdotes llegaron a ser muchos, debido a que por la muerte no podían continuar;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 7, 24, NULL, 'mas este, por cuanto permanece para siempre, tiene un sacerdocio inmutable;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 7, 25, NULL, 'por lo cual puede también salvar perpetuamente a los que por él se acercan a Dios, viviendo siempre para interceder por ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 7, 26, NULL, 'Porque tal sumo sacerdote nos convenía: santo, inocente, sin mancha, apartado de los pecadores, y hecho más sublime que los cielos;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 7, 27, NULL, 'que no tiene necesidad cada día, como aquellos sumos sacerdotes, de ofrecer primero sacrificios por sus propios pecados, y luego por los del pueblo; porque esto lo hizo una vez para siempre, ofreciéndose a sí mismo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 7, 28, NULL, 'Porque la ley constituye sumos sacerdotes a débiles hombres; pero la palabra del juramento, posterior a la ley, al Hijo, hecho perfecto para siempre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 8, 1, 'El mediador de un nuevo pacto', 'Ahora bien, el punto principal de lo que venimos diciendo es que tenemos tal sumo sacerdote, el cual se sentó a la diestra del trono de la Majestad en los cielos,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 8, 2, NULL, 'ministro del santuario, y de aquel verdadero tabernáculo que levantó el Señor, y no el hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 8, 3, NULL, 'Porque todo sumo sacerdote está constituido para presentar ofrendas y sacrificios; por lo cual es necesario que también este tenga algo que ofrecer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 8, 4, NULL, 'Así que, si estuviese sobre la tierra, ni siquiera sería sacerdote, habiendo aún sacerdotes que presentan las ofrendas según la ley;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 8, 5, NULL, 'los cuales sirven a lo que es figura y sombra de las cosas celestiales, como se le advirtió a Moisés cuando iba a erigir el tabernáculo, diciéndole: Mira, haz todas las cosas conforme al modelo que se te ha mostrado en el monte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 8, 6, NULL, 'Pero ahora tanto mejor ministerio es el suyo, cuanto es mediador de un mejor pacto, establecido sobre mejores promesas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 8, 7, NULL, 'Porque si aquel primero hubiera sido sin defecto, ciertamente no se hubiera procurado lugar para el segundo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 8, 8, NULL, 'Porque reprendiéndolos dice: He aquí vienen días, dice el Señor, En que estableceré con la casa de Israel y la casa de Judá un nuevo pacto;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 8, 9, NULL, 'No como el pacto que hice con sus padres El día que los tomé de la mano para sacarlos de la tierra de Egipto; Porque ellos no permanecieron en mi pacto, Y yo me desentendí de ellos, dice el Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 8, 10, NULL, 'Por lo cual, este es el pacto que haré con la casa de Israel Después de aquellos días, dice el Señor: Pondré mis leyes en la mente de ellos, Y sobre su corazón las escribiré; Y seré a ellos por Dios, Y ellos me serán a mí por pueblo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 8, 11, NULL, 'Y ninguno enseñará a su prójimo, Ni ninguno a su hermano, diciendo: Conoce al Señor; Porque todos me conocerán, Desde el menor hasta el mayor de ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 8, 12, NULL, 'Porque seré propicio a sus injusticias, Y nunca más me acordaré de sus pecados y de sus iniquidades.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 8, 13, NULL, 'Al decir: Nuevo pacto, ha dado por viejo al primero; y lo que se da por viejo y se envejece, está próximo a desaparecer.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 9, 1, NULL, 'Ahora bien, aun el primer pacto tenía ordenanzas de culto y un santuario terrenal.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 9, 2, NULL, 'Porque el tabernáculo estaba dispuesto así: en la primera parte, llamada el Lugar Santo, estaban el candelabro, la mesa y los panes de la proposición.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 9, 3, NULL, 'Tras el segundo velo estaba la parte del tabernáculo llamada el Lugar Santísimo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 9, 4, NULL, 'el cual tenía un incensario de oro y el arca del pacto cubierta de oro por todas partes, en la que estaba una urna de oro que contenía el maná, la vara de Aarón que reverdeció, y las tablas del pacto;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 9, 5, NULL, 'y sobre ella los querubines de gloria que cubrían el propiciatorio; de las cuales cosas no se puede ahora hablar en detalle.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 9, 6, NULL, 'Y así dispuestas estas cosas, en la primera parte del tabernáculo entran los sacerdotes continuamente para cumplir los oficios del culto;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 9, 7, NULL, 'pero en la segunda parte, sólo el sumo sacerdote una vez al año, no sin sangre, la cual ofrece por sí mismo y por los pecados de ignorancia del pueblo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 9, 8, NULL, 'dando el Espíritu Santo a entender con esto que aún no se había manifestado el camino al Lugar Santísimo, entre tanto que la primera parte del tabernáculo estuviese en pie.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 9, 9, NULL, 'Lo cual es símbolo para el tiempo presente, según el cual se presentan ofrendas y sacrificios que no pueden hacer perfecto, en cuanto a la conciencia, al que practica ese culto,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 9, 10, NULL, 'ya que consiste solo de comidas y bebidas, de diversas abluciones, y ordenanzas acerca de la carne, impuestas hasta el tiempo de reformar las cosas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 9, 11, NULL, 'Pero estando ya presente Cristo, sumo sacerdote de los bienes venideros, por el más amplio y más perfecto tabernáculo, no hecho de manos, es decir, no de esta creación,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 9, 12, NULL, 'y no por sangre de machos cabríos ni de becerros, sino por su propia sangre, entró una vez para siempre en el Lugar Santísimo, habiendo obtenido eterna redención.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 9, 13, NULL, 'Porque si la sangre de los toros y de los machos cabríos, y las cenizas de la becerra rociadas a los inmundos, santifican para la purificación de la carne,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 9, 14, NULL, '¿cuánto más la sangre de Cristo, el cual mediante el Espíritu eterno se ofreció a sí mismo sin mancha a Dios, limpiará vuestras conciencias de obras muertas para que sirváis al Dios vivo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 9, 15, NULL, 'Así que, por eso es mediador de un nuevo pacto, para que interviniendo muerte para la remisión de las transgresiones que había bajo el primer pacto, los llamados reciban la promesa de la herencia eterna.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 9, 16, NULL, 'Porque donde hay testamento, es necesario que intervenga muerte del testador.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 9, 17, NULL, 'Porque el testamento con la muerte se confirma; pues no es válido entre tanto que el testador vive.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 9, 18, NULL, 'De donde ni aun el primer pacto fue instituido sin sangre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 9, 19, NULL, 'Porque habiendo anunciado Moisés todos los mandamientos de la ley a todo el pueblo, tomó la sangre de los becerros y de los machos cabríos, con agua, lana escarlata e hisopo, y roció el mismo libro y también a todo el pueblo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 9, 20, NULL, 'diciendo: Esta es la sangre del pacto que Dios os ha mandado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 9, 21, NULL, 'Y además de esto, roció también con la sangre el tabernáculo y todos los vasos del ministerio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 9, 22, NULL, 'Y casi todo es purificado, según la ley, con sangre; y sin derramamiento de sangre no se hace remisión.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 9, 23, 'El sacrificio de Cristo quita el pecado', 'Fue, pues, necesario que las figuras de las cosas celestiales fuesen purificadas así; pero las cosas celestiales mismas, con mejores sacrificios que estos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 9, 24, NULL, 'Porque no entró Cristo en el santuario hecho de mano, figura del verdadero, sino en el cielo mismo para presentarse ahora por nosotros ante Dios;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 9, 25, NULL, 'y no para ofrecerse muchas veces, como entra el sumo sacerdote en el Lugar Santísimo cada año con sangre ajena.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 9, 26, NULL, 'De otra manera le hubiera sido necesario padecer muchas veces desde el principio del mundo; pero ahora, en la consumación de los siglos, se presentó una vez para siempre por el sacrificio de sí mismo para quitar de en medio el pecado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 9, 27, NULL, 'Y de la manera que está establecido para los hombres que mueran una sola vez, y después de esto el juicio,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 9, 28, NULL, 'así también Cristo fue ofrecido una sola vez para llevar los pecados de muchos; y aparecerá por segunda vez, sin relación con el pecado, para salvar a los que le esperan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 10, 1, NULL, 'Porque la ley, teniendo la sombra de los bienes venideros, no la imagen misma de las cosas, nunca puede, por los mismos sacrificios que se ofrecen continuamente cada año, hacer perfectos a los que se acercan.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 10, 2, NULL, 'De otra manera cesarían de ofrecerse, pues los que tributan este culto, limpios una vez, no tendrían ya más conciencia de pecado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 10, 3, NULL, 'Pero en estos sacrificios cada año se hace memoria de los pecados;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 10, 4, NULL, 'porque la sangre de los toros y de los machos cabríos no puede quitar los pecados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 10, 5, NULL, 'Por lo cual, entrando en el mundo dice: Sacrificio y ofrenda no quisiste; Mas me preparaste cuerpo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 10, 6, NULL, 'Holocaustos y expiaciones por el pecado no te agradaron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 10, 7, NULL, 'Entonces dije: He aquí que vengo, oh Dios, para hacer tu voluntad, Como en el rollo del libro está escrito de mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 10, 8, NULL, 'Diciendo primero: Sacrificio y ofrenda y holocaustos y expiaciones por el pecado no quisiste, ni te agradaron (las cuales cosas se ofrecen según la ley),', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 10, 9, NULL, 'y diciendo luego: He aquí que vengo, oh Dios, para hacer tu voluntad; quita lo primero, para establecer esto último.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 10, 10, NULL, 'En esa voluntad somos santificados mediante la ofrenda del cuerpo de Jesucristo hecha una vez para siempre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 10, 11, NULL, 'Y ciertamente todo sacerdote está día tras día ministrando y ofreciendo muchas veces los mismos sacrificios, que nunca pueden quitar los pecados;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 10, 12, NULL, 'pero Cristo, habiendo ofrecido una vez para siempre un solo sacrificio por los pecados, se ha sentado a la diestra de Dios,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 10, 13, NULL, 'de ahí en adelante esperando hasta que sus enemigos sean puestos por estrado de sus pies;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 10, 14, NULL, 'porque con una sola ofrenda hizo perfectos para siempre a los santificados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 10, 15, NULL, 'Y nos atestigua lo mismo el Espíritu Santo; porque después de haber dicho:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 10, 16, NULL, 'Este es el pacto que haré con ellos Después de aquellos días, dice el Señor: Pondré mis leyes en sus corazones, Y en sus mentes las escribiré,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 10, 17, NULL, 'añade: Y nunca más me acordaré de sus pecados y transgresiones.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 10, 18, NULL, 'Pues donde hay remisión de estos, no hay más ofrenda por el pecado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 10, 19, NULL, 'Así que, hermanos, teniendo libertad para entrar en el Lugar Santísimo por la sangre de Jesucristo,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 10, 20, NULL, 'por el camino nuevo y vivo que él nos abrió a través del velo, esto es, de su carne,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 10, 21, NULL, 'y teniendo un gran sacerdote sobre la casa de Dios,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 10, 22, NULL, 'acerquémonos con corazón sincero, en plena certidumbre de fe, purificados los corazones de mala conciencia, y lavados los cuerpos con agua pura.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 10, 23, NULL, 'Mantengamos firme, sin fluctuar, la profesión de nuestra esperanza, porque fiel es el que prometió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 10, 24, NULL, 'Y considerémonos unos a otros para estimularnos al amor y a las buenas obras;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 10, 25, NULL, 'no dejando de congregarnos, como algunos tienen por costumbre, sino exhortándonos; y tanto más, cuanto veis que aquel día se acerca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 10, 26, 'Advertencia al que peca deliberadamente', 'Porque si pecáremos voluntariamente después de haber recibido el conocimiento de la verdad, ya no queda más sacrificio por los pecados,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 10, 27, NULL, 'sino una horrenda expectación de juicio, y de hervor de fuego que ha de devorar a los adversarios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 10, 28, NULL, 'El que viola la ley de Moisés, por el testimonio de dos o de tres testigos muere irremisiblemente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 10, 29, NULL, '¿Cuánto mayor castigo pensáis que merecerá el que pisoteare al Hijo de Dios, y tuviere por inmunda la sangre del pacto en la cual fue santificado, e hiciere afrenta al Espíritu de gracia?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 10, 30, NULL, 'Pues conocemos al que dijo: Mía es la venganza, yo daré el pago, dice el Señor. Y otra vez: El Señor juzgará a su pueblo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 10, 31, NULL, '¡Horrenda cosa es caer en manos del Dios vivo!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 10, 32, NULL, 'Pero traed a la memoria los días pasados, en los cuales, después de haber sido iluminados, sostuvisteis gran combate de padecimientos;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 10, 33, NULL, 'por una parte, ciertamente, con vituperios y tribulaciones fuisteis hechos espectáculo; y por otra, llegasteis a ser compañeros de los que estaban en una situación semejante.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 10, 34, NULL, 'Porque de los presos también os compadecisteis, y el despojo de vuestros bienes sufristeis con gozo, sabiendo que tenéis en vosotros una mejor y perdurable herencia en los cielos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 10, 35, NULL, 'No perdáis, pues, vuestra confianza, que tiene grande galardón;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 10, 36, NULL, 'porque os es necesaria la paciencia, para que habiendo hecho la voluntad de Dios, obtengáis la promesa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 10, 37, NULL, 'Porque aún un poquito, Y el que ha de venir vendrá, y no tardará.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 10, 38, NULL, 'Mas el justo vivirá por fe; Y si retrocediere, no agradará a mi alma.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 10, 39, NULL, 'Pero nosotros no somos de los que retroceden para perdición, sino de los que tienen fe para preservación del alma.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 1, 'La fe', 'Es, pues, la fe la certeza de lo que se espera, la convicción de lo que no se ve.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 2, NULL, 'Porque por ella alcanzaron buen testimonio los antiguos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 3, NULL, 'Por la fe entendemos haber sido constituido el universo por la palabra de Dios, de modo que lo que se ve fue hecho de lo que no se veía.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 4, NULL, 'Por la fe Abel ofreció a Dios más excelente sacrificio que Caín, por lo cual alcanzó testimonio de que era justo, dando Dios testimonio de sus ofrendas; y muerto, aún habla por ella.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 5, NULL, 'Por la fe Enoc fue traspuesto para no ver muerte, y no fue hallado, porque lo traspuso Dios; y antes que fuese traspuesto, tuvo testimonio de haber agradado a Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 6, NULL, 'Pero sin fe es imposible agradar a Dios; porque es necesario que el que se acerca a Dios crea que le hay, y que es galardonador de los que le buscan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 7, NULL, 'Por la fe Noé, cuando fue advertido por Dios acerca de cosas que aún no se veían, con temor preparó el arca en que su casa se salvase; y por esa fe condenó al mundo, y fue hecho heredero de la justicia que viene por la fe.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 8, NULL, 'Por la fe Abraham, siendo llamado, obedeció para salir al lugar que había de recibir como herencia; y salió sin saber a dónde iba.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 9, NULL, 'Por la fe habitó como extranjero en la tierra prometida como en tierra ajena, morando en tiendas con Isaac y Jacob, coherederos de la misma promesa;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 10, NULL, 'porque esperaba la ciudad que tiene fundamentos, cuyo arquitecto y constructor es Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 11, NULL, 'Por la fe también la misma Sara, siendo estéril, recibió fuerza para concebir; y dio a luz aun fuera del tiempo de la edad, porque creyó que era fiel quien lo había prometido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 12, NULL, 'Por lo cual también, de uno, y ese ya casi muerto, salieron como las estrellas del cielo en multitud, y como la arena innumerable que está a la orilla del mar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 13, NULL, 'Conforme a la fe murieron todos estos sin haber recibido lo prometido, sino mirándolo de lejos, y creyéndolo, y saludándolo, y confesando que eran extranjeros y peregrinos sobre la tierra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 14, NULL, 'Porque los que esto dicen, claramente dan a entender que buscan una patria;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 15, NULL, 'pues si hubiesen estado pensando en aquella de donde salieron, ciertamente tenían tiempo de volver.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 16, NULL, 'Pero anhelaban una mejor, esto es, celestial; por lo cual Dios no se avergüenza de llamarse Dios de ellos; porque les ha preparado una ciudad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 17, NULL, 'Por la fe Abraham, cuando fue probado, ofreció a Isaac; y el que había recibido las promesas ofrecía su unigénito,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 18, NULL, 'habiéndosele dicho: En Isaac te será llamada descendencia;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 19, NULL, 'pensando que Dios es poderoso para levantar aun de entre los muertos, de donde, en sentido figurado, también le volvió a recibir.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 20, NULL, 'Por la fe bendijo Isaac a Jacob y a Esaú respecto a cosas venideras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 21, NULL, 'Por la fe Jacob, al morir, bendijo a cada uno de los hijos de José, y adoró apoyado sobre el extremo de su bordón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 22, NULL, 'Por la fe José, al morir, mencionó la salida de los hijos de Israel, y dio mandamiento acerca de sus huesos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 23, NULL, 'Por la fe Moisés, cuando nació, fue escondido por sus padres por tres meses, porque le vieron niño hermoso, y no temieron el decreto del rey.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 24, NULL, 'Por la fe Moisés, hecho ya grande, rehusó llamarse hijo de la hija de Faraón,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 25, NULL, 'escogiendo antes ser maltratado con el pueblo de Dios, que gozar de los deleites temporales del pecado,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 26, NULL, 'teniendo por mayores riquezas el vituperio de Cristo que los tesoros de los egipcios; porque tenía puesta la mirada en el galardón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 27, NULL, 'Por la fe dejó a Egipto, no temiendo la ira del rey; porque se sostuvo como viendo al Invisible.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 28, NULL, 'Por la fe celebró la pascua y la aspersión de la sangre, para que el que destruía a los primogénitos no los tocase a ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 29, NULL, 'Por la fe pasaron el Mar Rojo como por tierra seca; e intentando los egipcios hacer lo mismo, fueron ahogados.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 30, NULL, 'Por la fe cayeron los muros de Jericó después de rodearlos siete días.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 31, NULL, 'Por la fe Rahab la ramera no pereció juntamente con los desobedientes, habiendo recibido a los espías en paz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 32, NULL, '¿Y qué más digo? Porque el tiempo me faltaría contando de Gedeón, de Barac, de Sansón,(AA) de Jefté,(AB) de David,(AC) así como de Samuel(AD) y de los profetas;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 33, NULL, 'que por fe conquistaron reinos, hicieron justicia, alcanzaron promesas, taparon bocas de leones,(AE)', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 34, NULL, 'apagaron fuegos impetuosos,(AF) evitaron filo de espada, sacaron fuerzas de debilidad, se hicieron fuertes en batallas, pusieron en fuga ejércitos extranjeros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 35, NULL, 'Las mujeres recibieron sus muertos mediante resurrección;(AG) mas otros fueron atormentados, no aceptando el rescate, a fin de obtener mejor resurrección.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 36, NULL, 'Otros experimentaron vituperios y azotes, y a más de esto prisiones y cárceles.(AH)', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 37, NULL, 'Fueron apedreados,(AI) aserrados, puestos a prueba, muertos a filo de espada; anduvieron de acá para allá cubiertos de pieles de ovejas y de cabras, pobres, angustiados, maltratados;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 38, NULL, 'de los cuales el mundo no era digno; errando por los desiertos, por los montes, por las cuevas y por las cavernas de la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 39, NULL, 'Y todos estos, aunque alcanzaron buen testimonio mediante la fe, no recibieron lo prometido;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 11, 40, NULL, 'proveyendo Dios alguna cosa mejor para nosotros, para que no fuesen ellos perfeccionados aparte de nosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 12, 1, 'Puestos los ojos en Jesús', 'Por tanto, nosotros también, teniendo en derredor nuestro tan grande nube de testigos, despojémonos de todo peso y del pecado que nos asedia, y corramos con paciencia la carrera que tenemos por delante,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 12, 2, NULL, 'puestos los ojos en Jesús, el autor y consumador de la fe, el cual por el gozo puesto delante de él sufrió la cruz, menospreciando el oprobio, y se sentó a la diestra del trono de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 12, 3, NULL, 'Considerad a aquel que sufrió tal contradicción de pecadores contra sí mismo, para que vuestro ánimo no se canse hasta desmayar.', 1, 'spa', 'RVR1960', NULL);\n"
;

  public static final String SQL_PARTE_2 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Heb', 12, 4, NULL, 'Porque aún no habéis resistido hasta la sangre, combatiendo contra el pecado;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 12, 5, NULL, 'y habéis ya olvidado la exhortación que como a hijos se os dirige, diciendo: Hijo mío, no menosprecies la disciplina del Señor, Ni desmayes cuando eres reprendido por él;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 12, 6, NULL, 'Porque el Señor al que ama, disciplina, Y azota a todo el que recibe por hijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 12, 7, NULL, 'Si soportáis la disciplina, Dios os trata como a hijos; porque ¿qué hijo es aquel a quien el padre no disciplina?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 12, 8, NULL, 'Pero si se os deja sin disciplina, de la cual todos han sido participantes, entonces sois bastardos, y no hijos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 12, 9, NULL, 'Por otra parte, tuvimos a nuestros padres terrenales que nos disciplinaban, y los venerábamos. ¿Por qué no obedeceremos mucho mejor al Padre de los espíritus, y viviremos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 12, 10, NULL, 'Y aquellos, ciertamente por pocos días nos disciplinaban como a ellos les parecía, pero este para lo que nos es provechoso, para que participemos de su santidad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 12, 11, NULL, 'Es verdad que ninguna disciplina al presente parece ser causa de gozo, sino de tristeza; pero después da fruto apacible de justicia a los que en ella han sido ejercitados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 12, 12, 'Los que rechazan la gracia de Dios', 'Por lo cual, levantad las manos caídas y las rodillas paralizadas;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 12, 13, NULL, 'y haced sendas derechas para vuestros pies, para que lo cojo no se salga del camino, sino que sea sanado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 12, 14, NULL, 'Seguid la paz con todos, y la santidad, sin la cual nadie verá al Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 12, 15, NULL, 'Mirad bien, no sea que alguno deje de alcanzar la gracia de Dios; que brotando alguna raíz de amargura, os estorbe, y por ella muchos sean contaminados;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 12, 16, NULL, 'no sea que haya algún fornicario, o profano, como Esaú, que por una sola comida vendió su primogenitura.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 12, 17, NULL, 'Porque ya sabéis que aun después, deseando heredar la bendición, fue desechado, y no hubo oportunidad para el arrepentimiento, aunque la procuró con lágrimas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 12, 18, NULL, 'Porque no os habéis acercado al monte que se podía palpar, y que ardía en fuego, a la oscuridad, a las tinieblas y a la tempestad,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 12, 19, NULL, 'al sonido de la trompeta, y a la voz que hablaba, la cual los que la oyeron rogaron que no se les hablase más,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 12, 20, NULL, 'porque no podían soportar lo que se ordenaba: Si aun una bestia tocare el monte, será apedreada, o pasada con dardo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 12, 21, NULL, 'y tan terrible era lo que se veía, que Moisés dijo: Estoy espantado y temblando;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 12, 22, NULL, 'sino que os habéis acercado al monte de Sion, a la ciudad del Dios vivo, Jerusalén la celestial, a la compañía de muchos millares de ángeles,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 12, 23, NULL, 'a la congregación de los primogénitos que están inscritos en los cielos, a Dios el Juez de todos, a los espíritus de los justos hechos perfectos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 12, 24, NULL, 'a Jesús el Mediador del nuevo pacto, y a la sangre rociada que habla mejor que la de Abel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 12, 25, NULL, 'Mirad que no desechéis al que habla. Porque si no escaparon aquellos que desecharon al que los amonestaba en la tierra, mucho menos nosotros, si desecháremos al que amonesta desde los cielos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 12, 26, NULL, 'La voz del cual conmovió entonces la tierra, pero ahora ha prometido, diciendo: Aún una vez, y conmoveré no solamente la tierra, sino también el cielo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 12, 27, NULL, 'Y esta frase: Aún una vez, indica la remoción de las cosas movibles, como cosas hechas, para que queden las inconmovibles.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 12, 28, NULL, 'Así que, recibiendo nosotros un reino inconmovible, tengamos gratitud, y mediante ella sirvamos a Dios agradándole con temor y reverencia;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 12, 29, NULL, 'porque nuestro Dios es fuego consumidor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 13, 1, 'Deberes cristianos', 'Permanezca el amor fraternal.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 13, 2, NULL, 'No os olvidéis de la hospitalidad, porque por ella algunos, sin saberlo, hospedaron ángeles.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 13, 3, NULL, 'Acordaos de los presos, como si estuvierais presos juntamente con ellos; y de los maltratados, como que también vosotros mismos estáis en el cuerpo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 13, 4, NULL, 'Honroso sea en todos el matrimonio, y el lecho sin mancilla; pero a los fornicarios y a los adúlteros los juzgará Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 13, 5, NULL, 'Sean vuestras costumbres sin avaricia, contentos con lo que tenéis ahora; porque él dijo: No te desampararé, ni te dejaré;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 13, 6, NULL, 'de manera que podemos decir confiadamente: El Señor es mi ayudador; no temeré Lo que me pueda hacer el hombre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 13, 7, NULL, 'Acordaos de vuestros pastores, que os hablaron la palabra de Dios; considerad cuál haya sido el resultado de su conducta, e imitad su fe.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 13, 8, NULL, 'Jesucristo es el mismo ayer, y hoy, y por los siglos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 13, 9, NULL, 'No os dejéis llevar de doctrinas diversas y extrañas; porque buena cosa es afirmar el corazón con la gracia, no con viandas, que nunca aprovecharon a los que se han ocupado de ellas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 13, 10, NULL, 'Tenemos un altar, del cual no tienen derecho de comer los que sirven al tabernáculo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 13, 11, NULL, 'Porque los cuerpos de aquellos animales cuya sangre a causa del pecado es introducida en el santuario por el sumo sacerdote, son quemados fuera del campamento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 13, 12, NULL, 'Por lo cual también Jesús, para santificar al pueblo mediante su propia sangre, padeció fuera de la puerta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 13, 13, NULL, 'Salgamos, pues, a él, fuera del campamento, llevando su vituperio;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 13, 14, NULL, 'porque no tenemos aquí ciudad permanente, sino que buscamos la por venir.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 13, 15, NULL, 'Así que, ofrezcamos siempre a Dios, por medio de él, sacrificio de alabanza, es decir, fruto de labios que confiesan su nombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 13, 16, NULL, 'Y de hacer bien y de la ayuda mutua no os olvidéis; porque de tales sacrificios se agrada Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 13, 17, NULL, 'Obedeced a vuestros pastores, y sujetaos a ellos; porque ellos velan por vuestras almas, como quienes han de dar cuenta; para que lo hagan con alegría, y no quejándose, porque esto no os es provechoso.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 13, 18, NULL, 'Orad por nosotros; pues confiamos en que tenemos buena conciencia, deseando conducirnos bien en todo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 13, 19, NULL, 'Y más os ruego que lo hagáis así, para que yo os sea restituido más pronto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 13, 20, 'Bendición y salutaciones finales', 'Y el Dios de paz que resucitó de los muertos a nuestro Señor Jesucristo, el gran pastor de las ovejas, por la sangre del pacto eterno,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 13, 21, NULL, 'os haga aptos en toda obra buena para que hagáis su voluntad, haciendo él en vosotros lo que es agradable delante de él por Jesucristo; al cual sea la gloria por los siglos de los siglos. Amén.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 13, 22, NULL, 'Os ruego, hermanos, que soportéis la palabra de exhortación, pues os he escrito brevemente.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 13, 23, NULL, 'Sabed que está en libertad nuestro hermano Timoteo, con el cual, si viniere pronto, iré a veros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 13, 24, NULL, 'Saludad a todos vuestros pastores, y a todos los santos. Los de Italia os saludan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Heb', 13, 25, NULL, 'La gracia sea con todos vosotros. Amén.', 0, 'spa', 'RVR1960', NULL);\n"
;

}