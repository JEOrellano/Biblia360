package com.orellano.biblia360.daoSQLite.sql.spa;

public final class LoadJob {
  public LoadJob() {}
  public static final String SQL_PARTE_1 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Job', 1, 1, 'Las calamidades de Job', 'Hubo en tierra de Uz un varón llamado Job; y era este hombre perfecto y recto, temeroso de Dios y apartado del mal.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 1, 2, NULL, 'Y le nacieron siete hijos y tres hijas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 1, 3, NULL, 'Su hacienda era siete mil ovejas, tres mil camellos, quinientas yuntas de bueyes, quinientas asnas, y muchísimos criados; y era aquel varón más grande que todos los orientales.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 1, 4, NULL, 'E iban sus hijos y hacían banquetes en sus casas, cada uno en su día; y enviaban a llamar a sus tres hermanas para que comiesen y bebiesen con ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 1, 5, NULL, 'Y acontecía que habiendo pasado en turno los días del convite, Job enviaba y los santificaba, y se levantaba de mañana y ofrecía holocaustos conforme al número de todos ellos. Porque decía Job: Quizá habrán pecado mis hijos, y habrán blasfemado contra Dios en sus corazones. De esta manera hacía todos los días.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 1, 6, NULL, 'Un día vinieron a presentarse delante de Jehová los hijos de Dios, entre los cuales vino también Satanás.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 1, 7, NULL, 'Y dijo Jehová a Satanás: ¿De dónde vienes? Respondiendo Satanás a Jehová, dijo: De rodear la tierra y de andar por ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 1, 8, NULL, 'Y Jehová dijo a Satanás: ¿No has considerado a mi siervo Job, que no hay otro como él en la tierra, varón perfecto y recto, temeroso de Dios y apartado del mal?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 1, 9, NULL, 'Respondiendo Satanás a Jehová, dijo: ¿Acaso teme Job a Dios de balde?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 1, 10, NULL, '¿No le has cercado alrededor a él y a su casa y a todo lo que tiene? Al trabajo de sus manos has dado bendición; por tanto, sus bienes han aumentado sobre la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 1, 11, NULL, 'Pero extiende ahora tu mano y toca todo lo que tiene, y verás si no blasfema contra ti en tu misma presencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 1, 12, NULL, 'Dijo Jehová a Satanás: He aquí, todo lo que tiene está en tu mano; solamente no pongas tu mano sobre él. Y salió Satanás de delante de Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 1, 13, NULL, 'Y un día aconteció que sus hijos e hijas comían y bebían vino en casa de su hermano el primogénito,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 1, 14, NULL, 'y vino un mensajero a Job, y le dijo: Estaban arando los bueyes, y las asnas paciendo cerca de ellos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 1, 15, NULL, 'y acometieron los sabeos y los tomaron, y mataron a los criados a filo de espada; solamente escapé yo para darte la noticia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 1, 16, NULL, 'Aún estaba este hablando, cuando vino otro que dijo: Fuego de Dios cayó del cielo, que quemó las ovejas y a los pastores, y los consumió; solamente escapé yo para darte la noticia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 1, 17, NULL, 'Todavía estaba este hablando, y vino otro que dijo: Los caldeos hicieron tres escuadrones, y arremetieron contra los camellos y se los llevaron, y mataron a los criados a filo de espada; y solamente escapé yo para darte la noticia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 1, 18, NULL, 'Entre tanto que este hablaba, vino otro que dijo: Tus hijos y tus hijas estaban comiendo y bebiendo vino en casa de su hermano el primogénito;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 1, 19, NULL, 'y un gran viento vino del lado del desierto y azotó las cuatro esquinas de la casa, la cual cayó sobre los jóvenes, y murieron; y solamente escapé yo para darte la noticia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 1, 20, NULL, 'Entonces Job se levantó, y rasgó su manto, y rasuró su cabeza, y se postró en tierra y adoró,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 1, 21, NULL, 'y dijo: Desnudo salí del vientre de mi madre, y desnudo volveré allá. Jehová dio, y Jehová quitó; sea el nombre de Jehová bendito.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 1, 22, NULL, 'En todo esto no pecó Job, ni atribuyó a Dios despropósito alguno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 2, 1, NULL, 'Aconteció que otro día vinieron los hijos de Dios para presentarse delante de Jehová, y Satanás vino también entre ellos presentándose delante de Jehová.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 2, 2, NULL, 'Y dijo Jehová a Satanás: ¿De dónde vienes? Respondió Satanás a Jehová, y dijo: De rodear la tierra, y de andar por ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 2, 3, NULL, 'Y Jehová dijo a Satanás: ¿No has considerado a mi siervo Job, que no hay otro como él en la tierra, varón perfecto y recto, temeroso de Dios y apartado del mal, y que todavía retiene su integridad, aun cuando tú me incitaste contra él para que lo arruinara sin causa?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 2, 4, NULL, 'Respondiendo Satanás, dijo a Jehová: Piel por piel, todo lo que el hombre tiene dará por su vida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 2, 5, NULL, 'Pero extiende ahora tu mano, y toca su hueso y su carne, y verás si no blasfema contra ti en tu misma presencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 2, 6, NULL, 'Y Jehová dijo a Satanás: He aquí, él está en tu mano; mas guarda su vida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 2, 7, NULL, 'Entonces salió Satanás de la presencia de Jehová, e hirió a Job con una sarna maligna desde la planta del pie hasta la coronilla de la cabeza.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 2, 8, NULL, 'Y tomaba Job un tiesto para rascarse con él, y estaba sentado en medio de ceniza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 2, 9, NULL, 'Entonces le dijo su mujer: ¿Aún retienes tu integridad? Maldice a Dios, y muérete.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 2, 10, NULL, 'Y él le dijo: Como suele hablar cualquiera de las mujeres fatuas, has hablado. ¿Qué? ¿Recibiremos de Dios el bien, y el mal no lo recibiremos? En todo esto no pecó Job con sus labios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 2, 11, NULL, 'Y tres amigos de Job, Elifaz temanita, Bildad suhita, y Zofar naamatita, luego que oyeron todo este mal que le había sobrevenido, vinieron cada uno de su lugar; porque habían convenido en venir juntos para condolerse de él y para consolarle.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 2, 12, NULL, 'Los cuales, alzando los ojos desde lejos, no lo conocieron, y lloraron a gritos; y cada uno de ellos rasgó su manto, y los tres esparcieron polvo sobre sus cabezas hacia el cielo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 2, 13, NULL, 'Así se sentaron con él en tierra por siete días y siete noches, y ninguno le hablaba palabra, porque veían que su dolor era muy grande.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 3, 1, 'Job maldice el día en que nació', 'Después de esto abrió Job su boca, y maldijo su día.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 3, 2, NULL, 'Y exclamó Job, y dijo:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 3, 3, NULL, 'Perezca el día en que yo nací, Y la noche en que se dijo: Varón es concebido.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 3, 4, NULL, 'Sea aquel día sombrío, Y no cuide de él Dios desde arriba, Ni claridad sobre él resplandezca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 3, 5, NULL, 'Aféenlo tinieblas y sombra de muerte; Repose sobre él nublado Que lo haga horrible como día caliginoso.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 3, 6, NULL, 'Ocupe aquella noche la oscuridad; No sea contada entre los días del año, Ni venga en el número de los meses.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 3, 7, NULL, '¡Oh, que fuera aquella noche solitaria, Que no viniera canción alguna en ella!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 3, 8, NULL, 'Maldíganla los que maldicen el día, Los que se aprestan para despertar a Leviatán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 3, 9, NULL, 'Oscurézcanse las estrellas de su alba; Espere la luz, y no venga, Ni vea los párpados de la mañana;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 3, 10, NULL, 'Por cuanto no cerró las puertas del vientre donde yo estaba, Ni escondió de mis ojos la miseria.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 3, 11, NULL, '¿Por qué no morí yo en la matriz, O expiré al salir del vientre?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 3, 12, NULL, '¿Por qué me recibieron las rodillas? ¿Y a qué los pechos para que mamase?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 3, 13, NULL, 'Pues ahora estaría yo muerto, y reposaría; Dormiría, y entonces tendría descanso,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 3, 14, NULL, 'Con los reyes y con los consejeros de la tierra, Que reedifican para sí ruinas;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 3, 15, NULL, 'O con los príncipes que poseían el oro, Que llenaban de plata sus casas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 3, 16, NULL, '¿Por qué no fui escondido como abortivo, Como los pequeñitos que nunca vieron la luz?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 3, 17, NULL, 'Allí los impíos dejan de perturbar, Y allí descansan los de agotadas fuerzas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 3, 18, NULL, 'Allí también reposan los cautivos; No oyen la voz del capataz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 3, 19, NULL, 'Allí están el chico y el grande, Y el siervo libre de su señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 3, 20, NULL, '¿Por qué se da luz al trabajado, Y vida a los de ánimo amargado,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 3, 21, NULL, 'Que esperan la muerte, y ella no llega, Aunque la buscan más que tesoros;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 3, 22, NULL, 'Que se alegran sobremanera, Y se gozan cuando hallan el sepulcro?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 3, 23, NULL, '¿Por qué se da vida al hombre que no sabe por dónde ha de ir, Y a quien Dios ha encerrado?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 3, 24, NULL, 'Pues antes que mi pan viene mi suspiro, Y mis gemidos corren como aguas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 3, 25, NULL, 'Porque el temor que me espantaba me ha venido, Y me ha acontecido lo que yo temía.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 3, 26, NULL, 'No he tenido paz, no me aseguré, ni estuve reposado; No obstante, me vino turbación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 4, 1, 'Elifaz reprende a Job', 'Entonces respondió Elifaz temanita, y dijo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 4, 2, NULL, 'Si probáremos a hablarte, te será molesto; Pero ¿quién podrá detener las palabras?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 4, 3, NULL, 'He aquí, tú enseñabas a muchos, Y fortalecías las manos débiles;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 4, 4, NULL, 'Al que tropezaba enderezaban tus palabras, Y esforzabas las rodillas que decaían.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 4, 5, NULL, 'Mas ahora que el mal ha venido sobre ti, te desalientas; Y cuando ha llegado hasta ti, te turbas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 4, 6, NULL, '¿No es tu temor a Dios tu confianza? ¿No es tu esperanza la integridad de tus caminos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 4, 7, NULL, 'Recapacita ahora; ¿qué inocente se ha perdido? Y ¿en dónde han sido destruidos los rectos?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 4, 8, NULL, 'Como yo he visto, los que aran iniquidad Y siembran injuria, la siegan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 4, 9, NULL, 'Perecen por el aliento de Dios, Y por el soplo de su ira son consumidos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 4, 10, NULL, 'Los rugidos del león, y los bramidos del rugiente, Y los dientes de los leoncillos son quebrantados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 4, 11, NULL, 'El león viejo perece por falta de presa, Y los hijos de la leona se dispersan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 4, 12, NULL, 'El asunto también me era a mí oculto; Mas mi oído ha percibido algo de ello.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 4, 13, NULL, 'En imaginaciones de visiones nocturnas, Cuando el sueño cae sobre los hombres,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 4, 14, NULL, 'Me sobrevino un espanto y un temblor, Que estremeció todos mis huesos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 4, 15, NULL, 'Y al pasar un espíritu por delante de mí, Hizo que se erizara el pelo de mi cuerpo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 4, 16, NULL, 'Paróse delante de mis ojos un fantasma, Cuyo rostro yo no conocí, Y quedo, oí que decía:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 4, 17, NULL, '¿Será el hombre más justo que Dios? ¿Será el varón más limpio que el que lo hizo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 4, 18, NULL, 'He aquí, en sus siervos no confía, Y notó necedad en sus ángeles;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 4, 19, NULL, '¡Cuánto más en los que habitan en casas de barro, Cuyos cimientos están en el polvo, Y que serán quebrantados por la polilla!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 4, 20, NULL, 'De la mañana a la tarde son destruidos, Y se pierden para siempre, sin haber quien repare en ello.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 4, 21, NULL, 'Su hermosura, ¿no se pierde con ellos mismos? Y mueren sin haber adquirido sabiduría.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 5, 1, NULL, 'Ahora, pues, da voces; ¿habrá quien te responda? ¿Y a cuál de los santos te volverás?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 5, 2, NULL, 'Es cierto que al necio lo mata la ira, Y al codicioso lo consume la envidia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 5, 3, NULL, 'Yo he visto al necio que echaba raíces, Y en la misma hora maldije su habitación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 5, 4, NULL, 'Sus hijos estarán lejos de la seguridad; En la puerta serán quebrantados, Y no habrá quién los libre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 5, 5, NULL, 'Su mies comerán los hambrientos, Y la sacarán de entre los espinos, Y los sedientos beberán su hacienda.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 5, 6, NULL, 'Porque la aflicción no sale del polvo, Ni la molestia brota de la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 5, 7, NULL, 'Pero como las chispas se levantan para volar por el aire, Así el hombre nace para la aflicción.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 5, 8, NULL, 'Ciertamente yo buscaría a Dios, Y encomendaría a él mi causa;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 5, 9, NULL, 'El cual hace cosas grandes e inescrutables, Y maravillas sin número;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 5, 10, NULL, 'Que da la lluvia sobre la faz de la tierra, Y envía las aguas sobre los campos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 5, 11, NULL, 'Que pone a los humildes en altura, Y a los enlutados levanta a seguridad;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 5, 12, NULL, 'Que frustra los pensamientos de los astutos, Para que sus manos no hagan nada;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 5, 13, NULL, 'Que prende a los sabios en la astucia de ellos, Y frustra los designios de los perversos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 5, 14, NULL, 'De día tropiezan con tinieblas, Y a mediodía andan a tientas como de noche.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 5, 15, NULL, 'Así libra de la espada al pobre, de la boca de los impíos, Y de la mano violenta;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 5, 16, NULL, 'Pues es esperanza al menesteroso, Y la iniquidad cerrará su boca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 5, 17, NULL, 'He aquí, bienaventurado es el hombre a quien Dios castiga; Por tanto, no menosprecies la corrección del Todopoderoso.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 5, 18, NULL, 'Porque él es quien hace la llaga, y él la vendará; Él hiere, y sus manos curan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 5, 19, NULL, 'En seis tribulaciones te librará, Y en la séptima no te tocará el mal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 5, 20, NULL, 'En el hambre te salvará de la muerte, Y del poder de la espada en la guerra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 5, 21, NULL, 'Del azote de la lengua serás encubierto; No temerás la destrucción cuando viniere.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 5, 22, NULL, 'De la destrucción y del hambre te reirás, Y no temerás de las fieras del campo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 5, 23, NULL, 'Pues aun con las piedras del campo tendrás tu pacto, Y las fieras del campo estarán en paz contigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 5, 24, NULL, 'Sabrás que hay paz en tu tienda; Visitarás tu morada, y nada te faltará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 5, 25, NULL, 'Asimismo echarás de ver que tu descendencia es mucha, Y tu prole como la hierba de la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 5, 26, NULL, 'Vendrás en la vejez a la sepultura, Como la gavilla de trigo que se recoge a su tiempo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 5, 27, NULL, 'He aquí lo que hemos inquirido, lo cual es así; Óyelo, y conócelo tú para tu provecho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 6, 1, 'Job reprocha la actitud de sus amigos', 'Respondió entonces Job, y dijo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 6, 2, NULL, '¡Oh, que pesasen justamente mi queja y mi tormento, Y se alzasen igualmente en balanza!', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 6, 3, NULL, 'Porque pesarían ahora más que la arena del mar; Por eso mis palabras han sido precipitadas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 6, 4, NULL, 'Porque las saetas del Todopoderoso están en mí, Cuyo veneno bebe mi espíritu; Y terrores de Dios me combaten.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 6, 5, NULL, '¿Acaso gime el asno montés junto a la hierba? ¿Muge el buey junto a su pasto?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 6, 6, NULL, '¿Se comerá lo desabrido sin sal? ¿Habrá gusto en la clara del huevo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 6, 7, NULL, 'Las cosas que mi alma no quería tocar, Son ahora mi alimento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 6, 8, NULL, '¡Quién me diera que viniese mi petición, Y que me otorgase Dios lo que anhelo,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 6, 9, NULL, 'Y que agradara a Dios quebrantarme; Que soltara su mano, y acabara conmigo!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 6, 10, NULL, 'Sería aún mi consuelo, Si me asaltase con dolor sin dar más tregua, Que yo no he escondido las palabras del Santo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 6, 11, NULL, '¿Cuál es mi fuerza para esperar aún? ¿Y cuál mi fin para que tenga aún paciencia?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 6, 12, NULL, '¿Es mi fuerza la de las piedras, O es mi carne de bronce?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 6, 13, NULL, '¿No es así que ni aun a mí mismo me puedo valer, Y que todo auxilio me ha faltado?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 6, 14, NULL, 'El atribulado es consolado por su compañero; Aun aquel que abandona el temor del Omnipotente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 6, 15, NULL, 'Pero mis hermanos me traicionaron como un torrente; Pasan como corrientes impetuosas', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 6, 16, NULL, 'Que están escondidas por la helada, Y encubiertas por la nieve;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 6, 17, NULL, 'Que al tiempo del calor son deshechas, Y al calentarse, desaparecen de su lugar;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 6, 18, NULL, 'Se apartan de la senda de su rumbo, Van menguando, y se pierden.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 6, 19, NULL, 'Miraron los caminantes de Temán, Los caminantes de Sabá esperaron en ellas;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 6, 20, NULL, 'Pero fueron avergonzados por su esperanza; Porque vinieron hasta ellas, y se hallaron confusos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 6, 21, NULL, 'Ahora ciertamente como ellas sois vosotros; Pues habéis visto el tormento, y teméis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 6, 22, NULL, '¿Os he dicho yo: Traedme, Y pagad por mí de vuestra hacienda;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 6, 23, NULL, 'Libradme de la mano del opresor, Y redimidme del poder de los violentos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 6, 24, NULL, 'Enseñadme, y yo callaré; Hacedme entender en qué he errado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 6, 25, NULL, '¡Cuán eficaces son las palabras rectas! Pero ¿qué reprende la censura vuestra?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 6, 26, NULL, '¿Pensáis censurar palabras, Y los discursos de un desesperado, que son como el viento?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 6, 27, NULL, 'También os arrojáis sobre el huérfano, Y caváis un hoyo para vuestro amigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 6, 28, NULL, 'Ahora, pues, si queréis, miradme, Y ved si digo mentira delante de vosotros.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 6, 29, NULL, 'Volved ahora, y no haya iniquidad; Volved aún a considerar mi justicia en esto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 6, 30, NULL, '¿Hay iniquidad en mi lengua? ¿Acaso no puede mi paladar discernir las cosas inicuas?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 7, 1, 'Job argumenta contra Dios', '¿No es acaso brega la vida del hombre sobre la tierra, Y sus días como los días del jornalero?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 7, 2, NULL, 'Como el siervo suspira por la sombra, Y como el jornalero espera el reposo de su trabajo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 7, 3, NULL, 'Así he recibido meses de calamidad, Y noches de trabajo me dieron por cuenta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 7, 4, NULL, 'Cuando estoy acostado, digo: ¿Cuándo me levantaré? Mas la noche es larga, y estoy lleno de inquietudes hasta el alba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 7, 5, NULL, 'Mi carne está vestida de gusanos, y de costras de polvo; Mi piel hendida y abominable.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 7, 6, NULL, 'Y mis días fueron más veloces que la lanzadera del tejedor, Y fenecieron sin esperanza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 7, 7, NULL, 'Acuérdate que mi vida es un soplo, Y que mis ojos no volverán a ver el bien.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 7, 8, NULL, 'Los ojos de los que me ven, no me verán más; Fijarás en mí tus ojos, y dejaré de ser.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 7, 9, NULL, 'Como la nube se desvanece y se va, Así el que desciende al Seol no subirá;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 7, 10, NULL, 'No volverá más a su casa, Ni su lugar le conocerá más.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 7, 11, NULL, 'Por tanto, no refrenaré mi boca; Hablaré en la angustia de mi espíritu, Y me quejaré con la amargura de mi alma.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 7, 12, NULL, '¿Soy yo el mar, o un monstruo marino, Para que me pongas guarda?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 7, 13, NULL, 'Cuando digo: Me consolará mi lecho, Mi cama atenuará mis quejas;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 7, 14, NULL, 'Entonces me asustas con sueños, Y me aterras con visiones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 7, 15, NULL, 'Y así mi alma tuvo por mejor la estrangulación, Y quiso la muerte más que mis huesos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 7, 16, NULL, 'Abomino de mi vida; no he de vivir para siempre; Déjame, pues, porque mis días son vanidad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 7, 17, NULL, '¿Qué es el hombre, para que lo engrandezcas, Y para que pongas sobre él tu corazón,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 7, 18, NULL, 'Y lo visites todas las mañanas, Y todos los momentos lo pruebes?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 7, 19, NULL, '¿Hasta cuándo no apartarás de mí tu mirada, Y no me soltarás siquiera hasta que trague mi saliva?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 7, 20, NULL, 'Si he pecado, ¿qué puedo hacerte a ti, oh Guarda de los hombres? ¿Por qué me pones por blanco tuyo, Hasta convertirme en una carga para mí mismo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 7, 21, NULL, '¿Y por qué no quitas mi rebelión, y perdonas mi iniquidad? Porque ahora dormiré en el polvo, Y si me buscares de mañana, ya no existiré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 8, 1, 'Bildad proclama la justicia de Dios', 'Respondió Bildad suhita, y dijo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 8, 2, NULL, '¿Hasta cuándo hablarás tales cosas, Y las palabras de tu boca serán como viento impetuoso?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 8, 3, NULL, '¿Acaso torcerá Dios el derecho, O pervertirá el Todopoderoso la justicia?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 8, 4, NULL, 'Si tus hijos pecaron contra él, Él los echó en el lugar de su pecado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 8, 5, NULL, 'Si tú de mañana buscares a Dios, Y rogares al Todopoderoso;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 8, 6, NULL, 'Si fueres limpio y recto, Ciertamente luego se despertará por ti, Y hará próspera la morada de tu justicia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 8, 7, NULL, 'Y aunque tu principio haya sido pequeño, Tu postrer estado será muy grande.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 8, 8, NULL, 'Porque pregunta ahora a las generaciones pasadas, Y disponte para inquirir a los padres de ellas;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 8, 9, NULL, 'Pues nosotros somos de ayer, y nada sabemos, Siendo nuestros días sobre la tierra como sombra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 8, 10, NULL, '¿No te enseñarán ellos, te hablarán, Y de su corazón sacarán palabras?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 8, 11, NULL, '¿Crece el junco sin lodo? ¿Crece el prado sin agua?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 8, 12, NULL, 'Aun en su verdor, y sin haber sido cortado, Con todo, se seca primero que toda hierba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 8, 13, NULL, 'Tales son los caminos de todos los que olvidan a Dios; Y la esperanza del impío perecerá;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 8, 14, NULL, 'Porque su esperanza será cortada, Y su confianza es tela de araña.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 8, 15, NULL, 'Se apoyará él en su casa, mas no permanecerá ella en pie; Se asirá de ella, mas no resistirá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 8, 16, NULL, 'A manera de un árbol está verde delante del sol, Y sus renuevos salen sobre su huerto;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 8, 17, NULL, 'Se van entretejiendo sus raíces junto a una fuente, Y enlazándose hasta un lugar pedregoso.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 8, 18, NULL, 'Si le arrancaren de su lugar, Este le negará entonces, diciendo: Nunca te vi.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 8, 19, NULL, 'Ciertamente este será el gozo de su camino; Y del polvo mismo nacerán otros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 8, 20, NULL, 'He aquí, Dios no aborrece al perfecto, Ni apoya la mano de los malignos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 8, 21, NULL, 'Aún llenará tu boca de risa, Y tus labios de júbilo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 8, 22, NULL, 'Los que te aborrecen serán vestidos de confusión; Y la habitación de los impíos perecerá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 9, 1, 'Incapacidad de Job para responder a Dios', 'Respondió Job, y dijo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 9, 2, NULL, 'Ciertamente yo sé que es así; ¿Y cómo se justificará el hombre con Dios?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 9, 3, NULL, 'Si quisiere contender con él, No le podrá responder a una cosa entre mil.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 9, 4, NULL, 'Él es sabio de corazón, y poderoso en fuerzas; ¿Quién se endureció contra él, y le fue bien?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 9, 5, NULL, 'Él arranca los montes con su furor, Y no saben quién los trastornó;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 9, 6, NULL, 'Él remueve la tierra de su lugar, Y hace temblar sus columnas;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 9, 7, NULL, 'Él manda al sol, y no sale; Y sella las estrellas;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 9, 8, NULL, 'Él solo extendió los cielos, Y anda sobre las olas del mar;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 9, 9, NULL, 'Él hizo la Osa, el Orión y las Pléyades, Y los lugares secretos del sur;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 9, 10, NULL, 'Él hace cosas grandes e incomprensibles, Y maravillosas, sin número.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 9, 11, NULL, 'He aquí que él pasará delante de mí, y yo no lo veré; Pasará, y no lo entenderé.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 9, 12, NULL, 'He aquí, arrebatará; ¿quién le hará restituir? ¿Quién le dirá: Qué haces?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 9, 13, NULL, 'Dios no volverá atrás su ira, Y debajo de él se abaten los que ayudan a los soberbios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 9, 14, NULL, '¿Cuánto menos le responderé yo, Y hablaré con él palabras escogidas?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 9, 15, NULL, 'Aunque fuese yo justo, no respondería; Antes habría de rogar a mi juez.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 9, 16, NULL, 'Si yo le invocara, y él me respondiese, Aún no creeré que haya escuchado mi voz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 9, 17, NULL, 'Porque me ha quebrantado con tempestad, Y ha aumentado mis heridas sin causa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 9, 18, NULL, 'No me ha concedido que tome aliento, Sino que me ha llenado de amarguras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 9, 19, NULL, 'Si habláremos de su potencia, por cierto es fuerte; Si de juicio, ¿quién me emplazará?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 9, 20, NULL, 'Si yo me justificare, me condenaría mi boca; Si me dijere perfecto, esto me haría inicuo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 9, 21, NULL, 'Si fuese íntegro, no haría caso de mí mismo; Despreciaría mi vida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 9, 22, NULL, 'Una cosa resta que yo diga: Al perfecto y al impío él los consume.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 9, 23, NULL, 'Si azote mata de repente, Se ríe del sufrimiento de los inocentes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 9, 24, NULL, 'La tierra es entregada en manos de los impíos, Y él cubre el rostro de sus jueces. Si no es él, ¿quién es? ¿Dónde está?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 9, 25, NULL, 'Mis días han sido más ligeros que un correo; Huyeron, y no vieron el bien.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 9, 26, NULL, 'Pasaron cual naves veloces; Como el águila que se arroja sobre la presa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 9, 27, NULL, 'Si yo dijere: Olvidaré mi queja, Dejaré mi triste semblante, y me esforzaré,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 9, 28, NULL, 'Me turban todos mis dolores; Sé que no me tendrás por inocente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 9, 29, NULL, 'Yo soy impío; ¿Para qué trabajaré en vano?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 9, 30, NULL, 'Aunque me lave con aguas de nieve, Y limpie mis manos con la limpieza misma,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 9, 31, NULL, 'Aún me hundirás en el hoyo, Y mis propios vestidos me abominarán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 9, 32, NULL, 'Porque no es hombre como yo, para que yo le responda, Y vengamos juntamente a juicio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 9, 33, NULL, 'No hay entre nosotros árbitro Que ponga su mano sobre nosotros dos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 9, 34, NULL, 'Quite de sobre mí su vara, Y su terror no me espante.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 9, 35, NULL, 'Entonces hablaré, y no le temeré; Porque en este estado no estoy en mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 10, 1, 'Job lamenta su condición', 'Está mi alma hastiada de mi vida; Daré libre curso a mi queja, Hablaré con amargura de mi alma.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 10, 2, NULL, 'Diré a Dios: No me condenes; Hazme entender por qué contiendes conmigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 10, 3, NULL, '¿Te parece bien que oprimas, Que deseches la obra de tus manos, Y que favorezcas los designios de los impíos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 10, 4, NULL, '¿Tienes tú acaso ojos de carne? ¿Ves tú como ve el hombre?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 10, 5, NULL, '¿Son tus días como los días del hombre, O tus años como los tiempos humanos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 10, 6, NULL, 'Para que inquieras mi iniquidad, Y busques mi pecado,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 10, 7, NULL, 'Aunque tú sabes que no soy impío, Y que no hay quien de tu mano me libre?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 10, 8, NULL, 'Tus manos me hicieron y me formaron; ¿Y luego te vuelves y me deshaces?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 10, 9, NULL, 'Acuérdate que como a barro me diste forma; ¿Y en polvo me has de volver?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 10, 10, NULL, '¿No me vaciaste como leche, Y como queso me cuajaste?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 10, 11, NULL, 'Me vestiste de piel y carne, Y me tejiste con huesos y nervios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 10, 12, NULL, 'Vida y misericordia me concediste, Y tu cuidado guardó mi espíritu.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 10, 13, NULL, 'Estas cosas tienes guardadas en tu corazón; Yo sé que están cerca de ti.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 10, 14, NULL, 'Si pequé, tú me has observado, Y no me tendrás por limpio de mi iniquidad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 10, 15, NULL, 'Si fuere malo, ¡ay de mí! Y si fuere justo, no levantaré mi cabeza, Estando hastiado de deshonra, y de verme afligido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 10, 16, NULL, 'Si mi cabeza se alzare, cual león tú me cazas; Y vuelves a hacer en mí maravillas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 10, 17, NULL, 'Renuevas contra mí tus pruebas, Y aumentas conmigo tu furor como tropas de relevo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 10, 18, NULL, '¿Por qué me sacaste de la matriz? Hubiera yo expirado, y ningún ojo me habría visto.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 10, 19, NULL, 'Fuera como si nunca hubiera existido, Llevado del vientre a la sepultura.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 10, 20, NULL, '¿No son pocos mis días? Cesa, pues, y déjame, para que me consuele un poco,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 10, 21, NULL, 'Antes que vaya para no volver, A la tierra de tinieblas y de sombra de muerte;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 10, 22, NULL, 'Tierra de oscuridad, lóbrega, Como sombra de muerte y sin orden, Y cuya luz es como densas tinieblas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 11, 1, 'Zofar acusa de maldad a Job', 'Respondió Zofar naamatita, y dijo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 11, 2, NULL, '¿Las muchas palabras no han de tener respuesta? ¿Y el hombre que habla mucho será justificado?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 11, 3, NULL, '¿Harán tus falacias callar a los hombres? ¿Harás escarnio y no habrá quien te avergüence?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 11, 4, NULL, 'Tú dices: Mi doctrina es pura, Y yo soy limpio delante de tus ojos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 11, 5, NULL, 'Mas ¡oh, quién diera que Dios hablara, Y abriera sus labios contigo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 11, 6, NULL, 'Y te declarara los secretos de la sabiduría, Que son de doble valor que las riquezas! Conocerías entonces que Dios te ha castigado menos de lo que tu iniquidad merece.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 11, 7, NULL, '¿Descubrirás tú los secretos de Dios? ¿Llegarás tú a la perfección del Todopoderoso?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 11, 8, NULL, 'Es más alta que los cielos; ¿qué harás? Es más profunda que el Seol; ¿cómo la conocerás?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 11, 9, NULL, 'Su dimensión es más extensa que la tierra, Y más ancha que el mar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 11, 10, NULL, 'Si él pasa, y aprisiona, y llama a juicio, ¿Quién podrá contrarrestarle?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 11, 11, NULL, 'Porque él conoce a los hombres vanos; Ve asimismo la iniquidad, ¿y no hará caso?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 11, 12, NULL, 'El hombre vano se hará entendido, Cuando un pollino de asno montés nazca hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 11, 13, NULL, 'Si tú dispusieres tu corazón, Y extendieres a él tus manos;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 11, 14, NULL, 'Si alguna iniquidad hubiere en tu mano, y la echares de ti, Y no consintieres que more en tu casa la injusticia,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 11, 15, NULL, 'Entonces levantarás tu rostro limpio de mancha, Y serás fuerte, y nada temerás;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 11, 16, NULL, 'Y olvidarás tu miseria, O te acordarás de ella como de aguas que pasaron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 11, 17, NULL, 'La vida te será más clara que el mediodía; Aunque oscureciere, será como la mañana.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 11, 18, NULL, 'Tendrás confianza, porque hay esperanza; Mirarás alrededor, y dormirás seguro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 11, 19, NULL, 'Te acostarás, y no habrá quien te espante; Y muchos suplicarán tu favor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 11, 20, NULL, 'Pero los ojos de los malos se consumirán, Y no tendrán refugio; Y su esperanza será dar su último suspiro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 12, 1, 'Job proclama el poder y la sabiduría de Dios', 'Respondió entonces Job, diciendo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 12, 2, NULL, 'Ciertamente vosotros sois el pueblo, Y con vosotros morirá la sabiduría.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 12, 3, NULL, 'También tengo yo entendimiento como vosotros; No soy yo menos que vosotros; ¿Y quién habrá que no pueda decir otro tanto?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 12, 4, NULL, 'Yo soy uno de quien su amigo se mofa, Que invoca a Dios, y él le responde; Con todo, el justo y perfecto es escarnecido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 12, 5, NULL, 'Aquel cuyos pies van a resbalar Es como una lámpara despreciada de aquel que está a sus anchas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 12, 6, NULL, 'Prosperan las tiendas de los ladrones, Y los que provocan a Dios viven seguros, En cuyas manos él ha puesto cuanto tienen.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 12, 7, NULL, 'Y en efecto, pregunta ahora a las bestias, y ellas te enseñarán; A las aves de los cielos, y ellas te lo mostrarán;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 12, 8, NULL, 'O habla a la tierra, y ella te enseñará; Los peces del mar te lo declararán también.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 12, 9, NULL, '¿Qué cosa de todas estas no entiende Que la mano de Jehová la hizo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 12, 10, NULL, 'En su mano está el alma de todo viviente, Y el hálito de todo el género humano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 12, 11, NULL, 'Ciertamente el oído distingue las palabras, Y el paladar gusta las viandas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 12, 12, NULL, 'En los ancianos está la ciencia, Y en la larga edad la inteligencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 12, 13, NULL, 'Con Dios está la sabiduría y el poder; Suyo es el consejo y la inteligencia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 12, 14, NULL, 'Si él derriba, no hay quien edifique; Encerrará al hombre, y no habrá quien le abra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 12, 15, NULL, 'Si él detiene las aguas, todo se seca; Si las envía, destruyen la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 12, 16, NULL, 'Con él está el poder y la sabiduría; Suyo es el que yerra, y el que hace errar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 12, 17, NULL, 'Él hace andar despojados de consejo a los consejeros, Y entontece a los jueces.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 12, 18, NULL, 'Él rompe las cadenas de los tiranos, Y les ata una soga a sus lomos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 12, 19, NULL, 'Él lleva despojados a los príncipes, Y trastorna a los poderosos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 12, 20, NULL, 'Priva del habla a los que dicen verdad, Y quita a los ancianos el consejo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 12, 21, NULL, 'Él derrama menosprecio sobre los príncipes, Y desata el cinto de los fuertes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 12, 22, NULL, 'Él descubre las profundidades de las tinieblas, Y saca a luz la sombra de muerte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 12, 23, NULL, 'Él multiplica las naciones, y él las destruye; Esparce a las naciones, y las vuelve a reunir.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 12, 24, NULL, 'Él quita el entendimiento a los jefes del pueblo de la tierra, Y los hace vagar como por un yermo sin camino.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 12, 25, NULL, 'Van a tientas, como en tinieblas y sin luz, Y los hace errar como borrachos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 13, 1, 'Job defiende su integridad', 'He aquí que todas estas cosas han visto mis ojos, Y oído y entendido mis oídos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 13, 2, NULL, 'Como vosotros lo sabéis, lo sé yo; No soy menos que vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 13, 3, NULL, 'Mas yo hablaría con el Todopoderoso, Y querría razonar con Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 13, 4, NULL, 'Porque ciertamente vosotros sois fraguadores de mentira; Sois todos vosotros médicos nulos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 13, 5, NULL, 'Ojalá callarais por completo, Porque esto os fuera sabiduría.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 13, 6, NULL, 'Oíd ahora mi razonamiento, Y estad atentos a los argumentos de mis labios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 13, 7, NULL, '¿Hablaréis iniquidad por Dios? ¿Hablaréis por él engaño?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 13, 8, NULL, '¿Haréis acepción de personas a su favor? ¿Contenderéis vosotros por Dios?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 13, 9, NULL, '¿Sería bueno que él os escudriñase? ¿Os burlaréis de él como quien se burla de algún hombre?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 13, 10, NULL, 'Él os reprochará de seguro, Si solapadamente hacéis acepción de personas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 13, 11, NULL, 'De cierto su alteza os habría de espantar, Y su pavor habría de caer sobre vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 13, 12, NULL, 'Vuestras máximas son refranes de ceniza, Y vuestros baluartes son baluartes de lodo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 13, 13, NULL, 'Escuchadme, y hablaré yo, Y que me venga después lo que viniere.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 13, 14, NULL, '¿Por qué quitaré yo mi carne con mis dientes, Y tomaré mi vida en mi mano?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 13, 15, NULL, 'He aquí, aunque él me matare, en él esperaré; No obstante, defenderé delante de él mis caminos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 13, 16, NULL, 'Y él mismo será mi salvación, Porque no entrará en su presencia el impío.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 13, 17, NULL, 'Oíd con atención mi razonamiento, Y mi declaración entre en vuestros oídos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 13, 18, NULL, 'He aquí ahora, si yo expusiere mi causa, Sé que seré justificado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 13, 19, NULL, '¿Quién es el que contenderá conmigo? Porque si ahora yo callara, moriría.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 13, 20, NULL, 'A lo menos dos cosas no hagas conmigo; Entonces no me esconderé de tu rostro:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 13, 21, NULL, 'Aparta de mí tu mano, Y no me asombre tu terror.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 13, 22, NULL, 'Llama luego, y yo responderé; O yo hablaré, y respóndeme tú.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 13, 23, NULL, '¿Cuántas iniquidades y pecados tengo yo? Hazme entender mi transgresión y mi pecado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 13, 24, NULL, '¿Por qué escondes tu rostro, Y me cuentas por tu enemigo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 13, 25, NULL, '¿A la hoja arrebatada has de quebrantar, Y a una paja seca has de perseguir?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 13, 26, NULL, '¿Por qué escribes contra mí amarguras, Y me haces cargo de los pecados de mi juventud?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 13, 27, NULL, 'Pones además mis pies en el cepo, y observas todos mis caminos, Trazando un límite para las plantas de mis pies.', 0, 'spa', 'RVR1960', NULL);\n"
;

  public static final String SQL_PARTE_2 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Job', 13, 28, NULL, 'Y mi cuerpo se va gastando como de carcoma, Como vestido que roe la polilla.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 14, 1, 'Job discurre sobre la brevedad de la vida', 'El hombre nacido de mujer, Corto de días, y hastiado de sinsabores,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 14, 2, NULL, 'Sale como una flor y es cortado, Y huye como la sombra y no permanece.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 14, 3, NULL, '¿Sobre este abres tus ojos, Y me traes a juicio contigo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 14, 4, NULL, '¿Quién hará limpio a lo inmundo? Nadie.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 14, 5, NULL, 'Ciertamente sus días están determinados, Y el número de sus meses está cerca de ti; Le pusiste límites, de los cuales no pasará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 14, 6, NULL, 'Si tú lo abandonares, él dejará de ser; Entre tanto deseará, como el jornalero, su día.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 14, 7, NULL, 'Porque si el árbol fuere cortado, aún queda de él esperanza; Retoñará aún, y sus renuevos no faltarán.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 14, 8, NULL, 'Si se envejeciere en la tierra su raíz, Y su tronco fuere muerto en el polvo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 14, 9, NULL, 'Al percibir el agua reverdecerá, Y hará copa como planta nueva.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 14, 10, NULL, 'Mas el hombre morirá, y será cortado; Perecerá el hombre, ¿y dónde estará él?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 14, 11, NULL, 'Como las aguas se van del mar, Y el río se agota y se seca,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 14, 12, NULL, 'Así el hombre yace y no vuelve a levantarse; Hasta que no haya cielo, no despertarán, Ni se levantarán de su sueño.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 14, 13, NULL, '¡Oh, quién me diera que me escondieses en el Seol, Que me encubrieses hasta apaciguarse tu ira, Que me pusieses plazo, y de mí te acordaras!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 14, 14, NULL, 'Si el hombre muriere, ¿volverá a vivir? Todos los días de mi edad esperaré, Hasta que venga mi liberación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 14, 15, NULL, 'Entonces llamarás, y yo te responderé; Tendrás afecto a la hechura de tus manos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 14, 16, NULL, 'Pero ahora me cuentas los pasos, Y no das tregua a mi pecado;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 14, 17, NULL, 'Tienes sellada en saco mi prevaricación, Y tienes cosida mi iniquidad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 14, 18, NULL, 'Ciertamente el monte que cae se deshace, Y las peñas son removidas de su lugar;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 14, 19, NULL, 'Las piedras se desgastan con el agua impetuosa, que se lleva el polvo de la tierra; De igual manera haces tú perecer la esperanza del hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 14, 20, NULL, 'Para siempre serás más fuerte que él, y él se va; Demudarás su rostro, y le despedirás.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 14, 21, NULL, 'Sus hijos tendrán honores, pero él no lo sabrá; O serán humillados, y no entenderá de ello.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 14, 22, NULL, 'Mas su carne sobre él se dolerá, Y se entristecerá en él su alma.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 15, 1, 'Elifaz reprende a Job', 'Respondió Elifaz temanita, y dijo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 15, 2, NULL, '¿Proferirá el sabio vana sabiduría, Y llenará su vientre de viento solano?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 15, 3, NULL, '¿Disputará con palabras inútiles, Y con razones sin provecho?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 15, 4, NULL, 'Tú también disipas el temor, Y menoscabas la oración delante de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 15, 5, NULL, 'Porque tu boca declaró tu iniquidad, Pues has escogido el hablar de los astutos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 15, 6, NULL, 'Tu boca te condenará, y no yo; Y tus labios testificarán contra ti.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 15, 7, NULL, '¿Naciste tú primero que Adán? ¿O fuiste formado antes que los collados?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 15, 8, NULL, '¿Oíste tú el secreto de Dios, Y está limitada a ti la sabiduría?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 15, 9, NULL, '¿Qué sabes tú que no sepamos? ¿Qué entiendes tú que no se halle en nosotros?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 15, 10, NULL, 'Cabezas canas y hombres muy ancianos hay entre nosotros, Mucho más avanzados en días que tu padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 15, 11, NULL, '¿En tan poco tienes las consolaciones de Dios, Y las palabras que con dulzura se te dicen?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 15, 12, NULL, '¿Por qué tu corazón te aleja, Y por qué guiñan tus ojos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 15, 13, NULL, 'Para que contra Dios vuelvas tu espíritu, Y saques tales palabras de tu boca?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 15, 14, NULL, '¿Qué cosa es el hombre para que sea limpio, Y para que se justifique el nacido de mujer?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 15, 15, NULL, 'He aquí, en sus santos no confía, Y ni aun los cielos son limpios delante de sus ojos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 15, 16, NULL, '¿Cuánto menos el hombre abominable y vil, Que bebe la iniquidad como agua?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 15, 17, NULL, 'Escúchame; yo te mostraré, Y te contaré lo que he visto;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 15, 18, NULL, 'Lo que los sabios nos contaron De sus padres, y no lo encubrieron;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 15, 19, NULL, 'A quienes únicamente fue dada la tierra, Y no pasó extraño por en medio de ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 15, 20, NULL, 'Todos sus días, el impío es atormentado de dolor, Y el número de sus años está escondido para el violento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 15, 21, NULL, 'Estruendos espantosos hay en sus oídos; En la prosperidad el asolador vendrá sobre él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 15, 22, NULL, 'Él no cree que volverá de las tinieblas, Y descubierto está para la espada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 15, 23, NULL, 'Vaga alrededor tras el pan, diciendo: ¿En dónde está? Sabe que le está preparado día de tinieblas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 15, 24, NULL, 'Tribulación y angustia le turbarán, Y se esforzarán contra él como un rey dispuesto para la batalla,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 15, 25, NULL, 'Por cuanto él extendió su mano contra Dios, Y se portó con soberbia contra el Todopoderoso.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 15, 26, NULL, 'Corrió contra él con cuello erguido, Con la espesa barrera de sus escudos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 15, 27, NULL, 'Porque la gordura cubrió su rostro, E hizo pliegues sobre sus ijares;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 15, 28, NULL, 'Y habitó las ciudades asoladas, Las casas inhabitadas, Que estaban en ruinas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 15, 29, NULL, 'No prosperará, ni durarán sus riquezas, Ni extenderá por la tierra su hermosura.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 15, 30, NULL, 'No escapará de las tinieblas; La llama secará sus ramas, Y con el aliento de su boca perecerá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 15, 31, NULL, 'No confíe el iluso en la vanidad, Porque ella será su recompensa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 15, 32, NULL, 'Él será cortado antes de su tiempo, Y sus renuevos no reverdecerán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 15, 33, NULL, 'Perderá su agraz como la vid, Y derramará su flor como el olivo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 15, 34, NULL, 'Porque la congregación de los impíos será asolada, Y fuego consumirá las tiendas de soborno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 15, 35, NULL, 'Concibieron dolor, dieron a luz iniquidad, Y en sus entrañas traman engaño.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 16, 1, 'Job se queja contra Dios', 'Respondió Job, y dijo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 16, 2, NULL, 'Muchas veces he oído cosas como estas; Consoladores molestos sois todos vosotros.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 16, 3, NULL, '¿Tendrán fin las palabras vacías? ¿O qué te anima a responder?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 16, 4, NULL, 'También yo podría hablar como vosotros, Si vuestra alma estuviera en lugar de la mía; Yo podría hilvanar contra vosotros palabras, Y sobre vosotros mover mi cabeza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 16, 5, NULL, 'Pero yo os alentaría con mis palabras, Y la consolación de mis labios apaciguaría vuestro dolor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 16, 6, NULL, 'Si hablo, mi dolor no cesa; Y si dejo de hablar, no se aparta de mí.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 16, 7, NULL, 'Pero ahora tú me has fatigado; Has asolado toda mi compañía.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 16, 8, NULL, 'Tú me has llenado de arrugas; testigo es mi flacura, Que se levanta contra mí para testificar en mi rostro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 16, 9, NULL, 'Su furor me despedazó, y me ha sido contrario; Crujió sus dientes contra mí; Contra mí aguzó sus ojos mi enemigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 16, 10, NULL, 'Abrieron contra mí su boca; Hirieron mis mejillas con afrenta; Contra mí se juntaron todos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 16, 11, NULL, 'Me ha entregado Dios al mentiroso, Y en las manos de los impíos me hizo caer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 16, 12, NULL, 'Próspero estaba, y me desmenuzó; Me arrebató por la cerviz y me despedazó, Y me puso por blanco suyo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 16, 13, NULL, 'Me rodearon sus flecheros, Partió mis riñones, y no perdonó; Mi hiel derramó por tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 16, 14, NULL, 'Me quebrantó de quebranto en quebranto; Corrió contra mí como un gigante.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 16, 15, NULL, 'Cosí cilicio sobre mi piel, Y puse mi cabeza en el polvo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 16, 16, NULL, 'Mi rostro está inflamado con el lloro, Y mis párpados entenebrecidos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 16, 17, NULL, 'A pesar de no haber iniquidad en mis manos, Y de haber sido mi oración pura.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 16, 18, NULL, '¡Oh tierra! no cubras mi sangre, Y no haya lugar para mi clamor.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 16, 19, NULL, 'Mas he aquí que en los cielos está mi testigo, Y mi testimonio en las alturas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 16, 20, NULL, 'Disputadores son mis amigos; Mas ante Dios derramaré mis lágrimas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 16, 21, NULL, '¡Ojalá pudiese disputar el hombre con Dios, Como con su prójimo!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 16, 22, NULL, 'Mas los años contados vendrán, Y yo iré por el camino de donde no volveré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 17, 1, NULL, 'Mi aliento se agota, se acortan mis días, Y me está preparado el sepulcro.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 17, 2, NULL, 'No hay conmigo sino escarnecedores, En cuya amargura se detienen mis ojos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 17, 3, NULL, 'Dame fianza, oh Dios; sea mi protección cerca de ti. Porque ¿quién querría responder por mí?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 17, 4, NULL, 'Porque a estos has escondido de su corazón la inteligencia; Por tanto, no los exaltarás.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 17, 5, NULL, 'Al que denuncia a sus amigos como presa, Los ojos de sus hijos desfallecerán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 17, 6, NULL, 'Él me ha puesto por refrán de pueblos, Y delante de ellos he sido como tamboril.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 17, 7, NULL, 'Mis ojos se oscurecieron por el dolor, Y mis pensamientos todos son como sombra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 17, 8, NULL, 'Los rectos se maravillarán de esto, Y el inocente se levantará contra el impío.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 17, 9, NULL, 'No obstante, proseguirá el justo su camino, Y el limpio de manos aumentará la fuerza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 17, 10, NULL, 'Pero volved todos vosotros, y venid ahora, Y no hallaré entre vosotros sabio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 17, 11, NULL, 'Pasaron mis días, fueron arrancados mis pensamientos, Los designios de mi corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 17, 12, NULL, 'Pusieron la noche por día, Y la luz se acorta delante de las tinieblas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 17, 13, NULL, 'Si yo espero, el Seol es mi casa; Haré mi cama en las tinieblas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 17, 14, NULL, 'A la corrupción he dicho: Mi padre eres tú; A los gusanos: Mi madre y mi hermana.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 17, 15, NULL, '¿Dónde, pues, estará ahora mi esperanza? Y mi esperanza, ¿quién la verá?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 17, 16, NULL, 'A la profundidad del Seol descenderán, Y juntamente descansarán en el polvo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 18, 1, 'Bildad describe la suerte de los malos', 'Respondió Bildad suhita, y dijo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 18, 2, NULL, '¿Cuándo pondréis fin a las palabras? Entended, y después hablemos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 18, 3, NULL, '¿Por qué somos tenidos por bestias, Y a vuestros ojos somos viles?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 18, 4, NULL, 'Oh tú, que te despedazas en tu furor, ¿Será abandonada la tierra por tu causa, Y serán removidas de su lugar las peñas?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 18, 5, NULL, 'Ciertamente la luz de los impíos será apagada, Y no resplandecerá la centella de su fuego.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 18, 6, NULL, 'La luz se oscurecerá en su tienda, Y se apagará sobre él su lámpara.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 18, 7, NULL, 'Sus pasos vigorosos serán acortados, Y su mismo consejo lo precipitará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 18, 8, NULL, 'Porque red será echada a sus pies, Y sobre mallas andará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 18, 9, NULL, 'Lazo prenderá su calcañar; Se afirmará la trampa contra él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 18, 10, NULL, 'Su cuerda está escondida en la tierra, Y una trampa le aguarda en la senda.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 18, 11, NULL, 'De todas partes lo asombrarán temores, Y le harán huir desconcertado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 18, 12, NULL, 'Serán gastadas de hambre sus fuerzas, Y a su lado estará preparado quebrantamiento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 18, 13, NULL, 'La enfermedad roerá su piel, Y a sus miembros devorará el primogénito de la muerte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 18, 14, NULL, 'Su confianza será arrancada de su tienda, Y al rey de los espantos será conducido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 18, 15, NULL, 'En su tienda morará como si no fuese suya; Piedra de azufre será esparcida sobre su morada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 18, 16, NULL, 'Abajo se secarán sus raíces, Y arriba serán cortadas sus ramas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 18, 17, NULL, 'Su memoria perecerá de la tierra, Y no tendrá nombre por las calles.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 18, 18, NULL, 'De la luz será lanzado a las tinieblas, Y echado fuera del mundo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 18, 19, NULL, 'No tendrá hijo ni nieto en su pueblo, Ni quien le suceda en sus moradas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 18, 20, NULL, 'Sobre su día se espantarán los de occidente, Y pavor caerá sobre los de oriente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 18, 21, NULL, 'Ciertamente tales son las moradas del impío, Y este será el lugar del que no conoció a Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 19, 1, 'Job confía en que Dios lo justificará', 'Respondió entonces Job, y dijo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 19, 2, NULL, '¿Hasta cuándo angustiaréis mi alma, Y me moleréis con palabras?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 19, 3, NULL, 'Ya me habéis vituperado diez veces; ¿No os avergonzáis de injuriarme?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 19, 4, NULL, 'Aun siendo verdad que yo haya errado, Sobre mí recaería mi error.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 19, 5, NULL, 'Pero si vosotros os engrandecéis contra mí, Y contra mí alegáis mi oprobio,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 19, 6, NULL, 'Sabed ahora que Dios me ha derribado, Y me ha envuelto en su red.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 19, 7, NULL, 'He aquí, yo clamaré agravio, y no seré oído; Daré voces, y no habrá juicio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 19, 8, NULL, 'Cercó de vallado mi camino, y no pasaré; Y sobre mis veredas puso tinieblas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 19, 9, NULL, 'Me ha despojado de mi gloria, Y quitado la corona de mi cabeza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 19, 10, NULL, 'Me arruinó por todos lados, y perezco; Y ha hecho pasar mi esperanza como árbol arrancado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 19, 11, NULL, 'Hizo arder contra mí su furor, Y me contó para sí entre sus enemigos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 19, 12, NULL, 'Vinieron sus ejércitos a una, y se atrincheraron en mí, Y acamparon en derredor de mi tienda.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 19, 13, NULL, 'Hizo alejar de mí a mis hermanos, Y mis conocidos como extraños se apartaron de mí.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 19, 14, NULL, 'Mis parientes se detuvieron, Y mis conocidos se olvidaron de mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 19, 15, NULL, 'Los moradores de mi casa y mis criadas me tuvieron por extraño; Forastero fui yo a sus ojos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 19, 16, NULL, 'Llamé a mi siervo, y no respondió; De mi propia boca le suplicaba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 19, 17, NULL, 'Mi aliento vino a ser extraño a mi mujer, Aunque por los hijos de mis entrañas le rogaba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 19, 18, NULL, 'Aun los muchachos me menospreciaron; Al levantarme, hablaban contra mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 19, 19, NULL, 'Todos mis íntimos amigos me aborrecieron, Y los que yo amaba se volvieron contra mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 19, 20, NULL, 'Mi piel y mi carne se pegaron a mis huesos, Y he escapado con solo la piel de mis dientes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 19, 21, NULL, '¡Oh, vosotros mis amigos, tened compasión de mí, tened compasión de mí! Porque la mano de Dios me ha tocado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 19, 22, NULL, '¿Por qué me perseguís como Dios, Y ni aun de mi carne os saciáis?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 19, 23, NULL, '¡Quién diese ahora que mis palabras fuesen escritas! ¡Quién diese que se escribiesen en un libro;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 19, 24, NULL, 'Que con cincel de hierro y con plomo Fuesen esculpidas en piedra para siempre!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 19, 25, NULL, 'Yo sé que mi Redentor vive, Y al fin se levantará sobre el polvo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 19, 26, NULL, 'Y después de deshecha esta mi piel, En mi carne he de ver a Dios;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 19, 27, NULL, 'Al cual veré por mí mismo, Y mis ojos lo verán, y no otro, Aunque mi corazón desfallece dentro de mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 19, 28, NULL, 'Mas debierais decir: ¿Por qué le perseguimos? Ya que la raíz del asunto se halla en mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 19, 29, NULL, 'Temed vosotros delante de la espada; Porque sobreviene el furor de la espada a causa de las injusticias, Para que sepáis que hay un juicio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 20, 1, 'Zofar describe las calamidades de los malos', 'Respondió Zofar naamatita, y dijo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 20, 2, NULL, 'Por cierto mis pensamientos me hacen responder, Y por tanto me apresuro.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 20, 3, NULL, 'La reprensión de mi censura he oído, Y me hace responder el espíritu de mi inteligencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 20, 4, NULL, '¿No sabes esto, que así fue siempre, Desde el tiempo que fue puesto el hombre sobre la tierra,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 20, 5, NULL, 'Que la alegría de los malos es breve, Y el gozo del impío por un momento?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 20, 6, NULL, 'Aunque subiere su altivez hasta el cielo, Y su cabeza tocare en las nubes,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 20, 7, NULL, 'Como su estiércol, perecerá para siempre; Los que le hubieren visto dirán: ¿Qué hay de él?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 20, 8, NULL, 'Como sueño volará, y no será hallado, Y se disipará como visión nocturna.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 20, 9, NULL, 'El ojo que le veía, nunca más le verá, Ni su lugar le conocerá más.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 20, 10, NULL, 'Sus hijos solicitarán el favor de los pobres, Y sus manos devolverán lo que él robó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 20, 11, NULL, 'Sus huesos están llenos de su juventud, Mas con él en el polvo yacerán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 20, 12, NULL, 'Si el mal se endulzó en su boca, Si lo ocultaba debajo de su lengua,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 20, 13, NULL, 'Si le parecía bien, y no lo dejaba, Sino que lo detenía en su paladar;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 20, 14, NULL, 'Su comida se mudará en sus entrañas; Hiel de áspides será dentro de él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 20, 15, NULL, 'Devoró riquezas, pero las vomitará; De su vientre las sacará Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 20, 16, NULL, 'Veneno de áspides chupará; Lo matará lengua de víbora.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 20, 17, NULL, 'No verá los arroyos, los ríos, Los torrentes de miel y de leche.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 20, 18, NULL, 'Restituirá el trabajo conforme a los bienes que tomó, Y no los tragará ni gozará.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 20, 19, NULL, 'Por cuanto quebrantó y desamparó a los pobres, Robó casas, y no las edificó;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 20, 20, NULL, 'Por tanto, no tendrá sosiego en su vientre, Ni salvará nada de lo que codiciaba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 20, 21, NULL, 'No quedó nada que no comiese; Por tanto, su bienestar no será duradero.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 20, 22, NULL, 'En el colmo de su abundancia padecerá estrechez; La mano de todos los malvados vendrá sobre él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 20, 23, NULL, 'Cuando se pusiere a llenar su vientre, Dios enviará sobre él el ardor de su ira, Y la hará llover sobre él y sobre su comida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 20, 24, NULL, 'Huirá de las armas de hierro, Y el arco de bronce le atravesará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 20, 25, NULL, 'La saeta le traspasará y saldrá de su cuerpo, Y la punta relumbrante saldrá por su hiel; Sobre él vendrán terrores.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 20, 26, NULL, 'Todas las tinieblas están reservadas para sus tesoros; Fuego no atizado los consumirá; Devorará lo que quede en su tienda.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 20, 27, NULL, 'Los cielos descubrirán su iniquidad, Y la tierra se levantará contra él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 20, 28, NULL, 'Los renuevos de su casa serán transportados; Serán esparcidos en el día de su furor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 20, 29, NULL, 'Esta es la porción que Dios prepara al hombre impío, Y la heredad que Dios le señala por su palabra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 21, 1, 'Job afirma que los malos prosperan', 'Entonces respondió Job, y dijo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 21, 2, NULL, 'Oíd atentamente mi palabra, Y sea esto el consuelo que me deis.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 21, 3, NULL, 'Toleradme, y yo hablaré; Y después que haya hablado, escarneced.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 21, 4, NULL, '¿Acaso me quejo yo de algún hombre? ¿Y por qué no se ha de angustiar mi espíritu?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 21, 5, NULL, 'Miradme, y espantaos, Y poned la mano sobre la boca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 21, 6, NULL, 'Aun yo mismo, cuando me acuerdo, me asombro, Y el temblor estremece mi carne.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 21, 7, NULL, '¿Por qué viven los impíos, Y se envejecen, y aun crecen en riquezas?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 21, 8, NULL, 'Su descendencia se robustece a su vista, Y sus renuevos están delante de sus ojos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 21, 9, NULL, 'Sus casas están a salvo de temor, Ni viene azote de Dios sobre ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 21, 10, NULL, 'Sus toros engendran, y no fallan; Paren sus vacas, y no malogran su cría.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 21, 11, NULL, 'Salen sus pequeñuelos como manada, Y sus hijos andan saltando.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 21, 12, NULL, 'Al son de tamboril y de cítara saltan, Y se regocijan al son de la flauta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 21, 13, NULL, 'Pasan sus días en prosperidad, Y en paz descienden al Seol.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 21, 14, NULL, 'Dicen, pues, a Dios: Apártate de nosotros, Porque no queremos el conocimiento de tus caminos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 21, 15, NULL, '¿Quién es el Todopoderoso, para que le sirvamos? ¿Y de qué nos aprovechará que oremos a él?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 21, 16, NULL, 'He aquí que su bien no está en mano de ellos; El consejo de los impíos lejos esté de mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 21, 17, NULL, '¡Oh, cuántas veces la lámpara de los impíos es apagada, Y viene sobre ellos su quebranto, Y Dios en su ira les reparte dolores!', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 21, 18, NULL, 'Serán como la paja delante del viento, Y como el tamo que arrebata el torbellino.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 21, 19, NULL, 'Dios guardará para los hijos de ellos su violencia; Le dará su pago, para que conozca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 21, 20, NULL, 'Verán sus ojos su quebranto, Y beberá de la ira del Todopoderoso.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 21, 21, NULL, 'Porque ¿qué deleite tendrá él de su casa después de sí, Siendo cortado el número de sus meses?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 21, 22, NULL, '¿Enseñará alguien a Dios sabiduría, Juzgando él a los que están elevados?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 21, 23, NULL, 'Este morirá en el vigor de su hermosura, todo quieto y pacífico;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 21, 24, NULL, 'Sus vasijas estarán llenas de leche, Y sus huesos serán regados de tuétano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 21, 25, NULL, 'Y este otro morirá en amargura de ánimo, Y sin haber comido jamás con gusto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 21, 26, NULL, 'Igualmente yacerán ellos en el polvo, Y gusanos los cubrirán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 21, 27, NULL, 'He aquí, yo conozco vuestros pensamientos, Y las imaginaciones que contra mí forjáis.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 21, 28, NULL, 'Porque decís: ¿Qué hay de la casa del príncipe, Y qué de la tienda de las moradas de los impíos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 21, 29, NULL, '¿No habéis preguntado a los que pasan por los caminos, Y no habéis conocido su respuesta,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 21, 30, NULL, 'Que el malo es preservado en el día de la destrucción? Guardado será en el día de la ira.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 21, 31, NULL, '¿Quién le denunciará en su cara su camino? Y de lo que él hizo, ¿quién le dará el pago?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 21, 32, NULL, 'Porque llevado será a los sepulcros, Y sobre su túmulo estarán velando.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 21, 33, NULL, 'Los terrones del valle le serán dulces; Tras de él será llevado todo hombre, Y antes de él han ido innumerables.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 21, 34, NULL, '¿Cómo, pues, me consoláis en vano, Viniendo a parar vuestras respuestas en falacia?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 22, 1, 'Elifaz acusa a Job de gran maldad', 'Respondió Elifaz temanita, y dijo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 22, 2, NULL, '¿Traerá el hombre provecho a Dios? Al contrario, para sí mismo es provechoso el hombre sabio.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 22, 3, NULL, '¿Tiene contentamiento el Omnipotente en que tú seas justificado, O provecho de que tú hagas perfectos tus caminos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 22, 4, NULL, '¿Acaso te castiga, O viene a juicio contigo, a causa de tu piedad?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 22, 5, NULL, 'Por cierto tu malicia es grande, Y tus maldades no tienen fin.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 22, 6, NULL, 'Porque sacaste prenda a tus hermanos sin causa, Y despojaste de sus ropas a los desnudos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 22, 7, NULL, 'No diste de beber agua al cansado, Y detuviste el pan al hambriento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 22, 8, NULL, 'Pero el hombre pudiente tuvo la tierra, Y habitó en ella el distinguido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 22, 9, NULL, 'A las viudas enviaste vacías, Y los brazos de los huérfanos fueron quebrados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 22, 10, NULL, 'Por tanto, hay lazos alrededor de ti, Y te turba espanto repentino;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 22, 11, NULL, 'O tinieblas, para que no veas, Y abundancia de agua te cubre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 22, 12, NULL, '¿No está Dios en la altura de los cielos? Mira lo encumbrado de las estrellas, cuán elevadas están.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 22, 13, NULL, '¿Y dirás tú: Qué sabe Dios? ¿Cómo juzgará a través de la oscuridad?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 22, 14, NULL, 'Las nubes le rodearon, y no ve; Y por el circuito del cielo se pasea.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 22, 15, NULL, '¿Quieres tú seguir la senda antigua Que pisaron los hombres perversos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 22, 16, NULL, 'Los cuales fueron cortados antes de tiempo, Cuyo fundamento fue como un río derramado?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 22, 17, NULL, 'Decían a Dios: Apártate de nosotros. ¿Y qué les había hecho el Omnipotente?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 22, 18, NULL, 'Les había colmado de bienes sus casas. Pero sea el consejo de ellos lejos de mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 22, 19, NULL, 'Verán los justos y se gozarán; Y el inocente los escarnecerá, diciendo:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 22, 20, NULL, 'Fueron destruidos nuestros adversarios, Y el fuego consumió lo que de ellos quedó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 22, 21, NULL, 'Vuelve ahora en amistad con él, y tendrás paz; Y por ello te vendrá bien.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 22, 22, NULL, 'Toma ahora la ley de su boca, Y pon sus palabras en tu corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 22, 23, NULL, 'Si te volvieres al Omnipotente, serás edificado; Alejarás de tu tienda la aflicción;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 22, 24, NULL, 'Tendrás más oro que tierra, Y como piedras de arroyos oro de Ofir;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 22, 25, NULL, 'El Todopoderoso será tu defensa, Y tendrás plata en abundancia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 22, 26, NULL, 'Porque entonces te deleitarás en el Omnipotente, Y alzarás a Dios tu rostro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 22, 27, NULL, 'Orarás a él, y él te oirá; Y tú pagarás tus votos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 22, 28, NULL, 'Determinarás asimismo una cosa, y te será firme, Y sobre tus caminos resplandecerá luz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 22, 29, NULL, 'Cuando fueren abatidos, dirás tú: Enaltecimiento habrá; Y Dios salvará al humilde de ojos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 22, 30, NULL, 'Él libertará al inocente, Y por la limpieza de tus manos este será librado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 23, 1, 'Job desea abogar su causa delante de Dios', 'Respondió Job, y dijo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 23, 2, NULL, 'Hoy también hablaré con amargura; Porque es más grave mi llaga que mi gemido.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 23, 3, NULL, '¡Quién me diera el saber dónde hallar a Dios! Yo iría hasta su silla.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 23, 4, NULL, 'Expondría mi causa delante de él, Y llenaría mi boca de argumentos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 23, 5, NULL, 'Yo sabría lo que él me respondiese, Y entendería lo que me dijera.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 23, 6, NULL, '¿Contendería conmigo con grandeza de fuerza? No; antes él me atendería.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 23, 7, NULL, 'Allí el justo razonaría con él; Y yo escaparía para siempre de mi juez.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 23, 8, NULL, 'He aquí yo iré al oriente, y no lo hallaré; Y al occidente, y no lo percibiré;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 23, 9, NULL, 'Si muestra su poder al norte, yo no lo veré; Al sur se esconderá, y no lo veré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 23, 10, NULL, 'Mas él conoce mi camino; Me probará, y saldré como oro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 23, 11, NULL, 'Mis pies han seguido sus pisadas; Guardé su camino, y no me aparté.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 23, 12, NULL, 'Del mandamiento de sus labios nunca me separé; Guardé las palabras de su boca más que mi comida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 23, 13, NULL, 'Pero si él determina una cosa, ¿quién lo hará cambiar? Su alma deseó, e hizo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 23, 14, NULL, 'Él, pues, acabará lo que ha determinado de mí; Y muchas cosas como estas hay en él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 23, 15, NULL, 'Por lo cual yo me espanto en su presencia; Cuando lo considero, tiemblo a causa de él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 23, 16, NULL, 'Dios ha enervado mi corazón, Y me ha turbado el Omnipotente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 23, 17, NULL, '¿Por qué no fui yo cortado delante de las tinieblas, Ni fue cubierto con oscuridad mi rostro?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 24, 1, 'Job se queja de que Dios es indiferente ante la maldad', 'Puesto que no son ocultos los tiempos al Todopoderoso, ¿Por qué los que le conocen no ven sus días?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 24, 2, NULL, 'Traspasan los linderos, Roban los ganados, y los apacientan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 24, 3, NULL, 'Se llevan el asno de los huérfanos, Y toman en prenda el buey de la viuda.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 24, 4, NULL, 'Hacen apartar del camino a los menesterosos, Y todos los pobres de la tierra se esconden.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 24, 5, NULL, 'He aquí, como asnos monteses en el desierto, Salen a su obra madrugando para robar; El desierto es mantenimiento de sus hijos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 24, 6, NULL, 'En el campo siegan su pasto, Y los impíos vendimian la viña ajena.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 24, 7, NULL, 'Al desnudo hacen dormir sin ropa, Sin tener cobertura contra el frío.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 24, 8, NULL, 'Con las lluvias de los montes se mojan, Y abrazan las peñas por falta de abrigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 24, 9, NULL, 'Quitan el pecho a los huérfanos, Y de sobre el pobre toman la prenda.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 24, 10, NULL, 'Al desnudo hacen andar sin vestido, Y a los hambrientos quitan las gavillas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 24, 11, NULL, 'Dentro de sus paredes exprimen el aceite, Pisan los lagares, y mueren de sed.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 24, 12, NULL, 'Desde la ciudad gimen los moribundos, Y claman las almas de los heridos de muerte, Pero Dios no atiende su oración.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 24, 13, NULL, 'Ellos son los que, rebeldes a la luz, Nunca conocieron sus caminos, Ni estuvieron en sus veredas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 24, 14, NULL, 'A la luz se levanta el matador; mata al pobre y al necesitado, Y de noche es como ladrón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 24, 15, NULL, 'El ojo del adúltero está aguardando la noche, Diciendo: No me verá nadie; Y esconde su rostro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 24, 16, NULL, 'En las tinieblas minan las casas Que de día para sí señalaron; No conocen la luz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 24, 17, NULL, 'Porque la mañana es para todos ellos como sombra de muerte; Si son conocidos, terrores de sombra de muerte los toman.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 24, 18, NULL, 'Huyen ligeros como corriente de aguas; Su porción es maldita en la tierra; No andarán por el camino de las viñas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 24, 19, NULL, 'La sequía y el calor arrebatan las aguas de la nieve; Así también el Seol a los pecadores.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 24, 20, NULL, 'Los olvidará el seno materno; de ellos sentirán los gusanos dulzura; Nunca más habrá de ellos memoria, Y como un árbol los impíos serán quebrantados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 24, 21, NULL, 'A la mujer estéril, que no concebía, afligió, Y a la viuda nunca hizo bien.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 24, 22, NULL, 'Pero a los fuertes adelantó con su poder; Una vez que se levante, ninguno está seguro de la vida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 24, 23, NULL, 'Él les da seguridad y confianza; Sus ojos están sobre los caminos de ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 24, 24, NULL, 'Fueron exaltados un poco, mas desaparecen, Y son abatidos como todos los demás; Serán encerrados, y cortados como cabezas de espigas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 24, 25, NULL, 'Y si no, ¿quién me desmentirá ahora, O reducirá a nada mis palabras?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 25, 1, 'Bildad niega que el hombre pueda ser justificado delante de Dios', 'Respondió Bildad suhita, y dijo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 25, 2, NULL, 'El señorío y el temor están con él; Él hace paz en sus alturas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 25, 3, NULL, '¿Tienen sus ejércitos número? ¿Sobre quién no está su luz?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 25, 4, NULL, '¿Cómo, pues, se justificará el hombre para con Dios? ¿Y cómo será limpio el que nace de mujer?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 25, 5, NULL, 'He aquí que ni aun la misma luna será resplandeciente, Ni las estrellas son limpias delante de sus ojos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 25, 6, NULL, '¿Cuánto menos el hombre, que es un gusano, Y el hijo de hombre, también gusano?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 26, 1, 'Job proclama la soberanía de Dios', 'Respondió Job, y dijo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 26, 2, NULL, '¿En qué ayudaste al que no tiene poder? ¿Cómo has amparado al brazo sin fuerza?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 26, 3, NULL, '¿En qué aconsejaste al que no tiene ciencia, Y qué plenitud de inteligencia has dado a conocer?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 26, 4, NULL, '¿A quién has anunciado palabras, Y de quién es el espíritu que de ti procede?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 26, 5, NULL, 'Las sombras tiemblan en lo profundo, Los mares y cuanto en ellos mora.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 26, 6, NULL, 'El Seol está descubierto delante de él, y el Abadón no tiene cobertura.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 26, 7, NULL, 'Él extiende el norte sobre vacío, Cuelga la tierra sobre nada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 26, 8, NULL, 'Ata las aguas en sus nubes, Y las nubes no se rompen debajo de ellas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 26, 9, NULL, 'Él encubre la faz de su trono, Y sobre él extiende su nube.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 26, 10, NULL, 'Puso límite a la superficie de las aguas, Hasta el fin de la luz y las tinieblas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 26, 11, NULL, 'Las columnas del cielo tiemblan, Y se espantan a su reprensión.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 26, 12, NULL, 'Él agita el mar con su poder, Y con su entendimiento hiere la arrogancia suya.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 26, 13, NULL, 'Su espíritu adornó los cielos; Su mano creó la serpiente tortuosa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 26, 14, NULL, 'He aquí, estas cosas son solo los bordes de sus caminos; ¡Y cuán leve es el susurro que hemos oído de él! Pero el trueno de su poder, ¿quién lo puede comprender?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 27, 1, 'Job describe el castigo de los malos', 'Reasumió Job su discurso, y dijo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 27, 2, NULL, 'Vive Dios, que ha quitado mi derecho, Y el Omnipotente, que amargó el alma mía,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 27, 3, NULL, 'Que todo el tiempo que mi alma esté en mí, Y haya hálito de Dios en mis narices,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 27, 4, NULL, 'Mis labios no hablarán iniquidad, Ni mi lengua pronunciará engaño.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 27, 5, NULL, 'Nunca tal acontezca que yo os justifique; Hasta que muera, no quitaré de mí mi integridad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 27, 6, NULL, 'Mi justicia tengo asida, y no la cederé; No me reprochará mi corazón en todos mis días.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 27, 7, NULL, 'Sea como el impío mi enemigo, Y como el inicuo mi adversario.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 27, 8, NULL, 'Porque ¿cuál es la esperanza del impío, por mucho que hubiere robado, Cuando Dios le quitare la vida?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 27, 9, NULL, '¿Oirá Dios su clamor Cuando la tribulación viniere sobre él?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 27, 10, NULL, '¿Se deleitará en el Omnipotente? ¿Invocará a Dios en todo tiempo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 27, 11, NULL, 'Yo os enseñaré en cuanto a la mano de Dios; No esconderé lo que hay para con el Omnipotente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 27, 12, NULL, 'He aquí que todos vosotros lo habéis visto; ¿Por qué, pues, os habéis hecho tan enteramente vanos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 27, 13, NULL, 'Esta es para con Dios la porción del hombre impío, Y la herencia que los violentos han de recibir del Omnipotente:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 27, 14, NULL, 'Si sus hijos fueren multiplicados, serán para la espada; Y sus pequeños no se saciarán de pan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 27, 15, NULL, 'Los que de él quedaren, en muerte serán sepultados, Y no los llorarán sus viudas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 27, 16, NULL, 'Aunque amontone plata como polvo, Y prepare ropa como lodo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 27, 17, NULL, 'La habrá preparado él, mas el justo se vestirá, Y el inocente repartirá la plata.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 27, 18, NULL, 'Edificó su casa como la polilla, Y como enramada que hizo el guarda.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 27, 19, NULL, 'Rico se acuesta, pero por última vez; Abrirá sus ojos, y nada tendrá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 27, 20, NULL, 'Se apoderarán de él terrores como aguas; Torbellino lo arrebatará de noche.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 27, 21, NULL, 'Le eleva el solano, y se va; Y tempestad lo arrebatará de su lugar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 27, 22, NULL, 'Dios, pues, descargará sobre él, y no perdonará; Hará él por huir de su mano.', 0, 'spa', 'RVR1960', NULL);\n"
;

  public static final String SQL_PARTE_3 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Job', 27, 23, NULL, 'Batirán las manos sobre él, Y desde su lugar le silbarán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 28, 1, 'El hombre en busca de la sabiduría', 'Ciertamente la plata tiene sus veneros, Y el oro lugar donde se refina.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 28, 2, NULL, 'El hierro se saca del polvo, Y de la piedra se funde el cobre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 28, 3, NULL, 'A las tinieblas ponen término, Y examinan todo a la perfección, Las piedras que hay en oscuridad y en sombra de muerte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 28, 4, NULL, 'Abren minas lejos de lo habitado, En lugares olvidados, donde el pie no pasa. Son suspendidos y balanceados, lejos de los demás hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 28, 5, NULL, 'De la tierra nace el pan, Y debajo de ella está como convertida en fuego.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 28, 6, NULL, 'Lugar hay cuyas piedras son zafiro, Y sus polvos de oro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 28, 7, NULL, 'Senda que nunca la conoció ave, Ni ojo de buitre la vio;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 28, 8, NULL, 'Nunca la pisaron animales fieros, Ni león pasó por ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 28, 9, NULL, 'En el pedernal puso su mano, Y trastornó de raíz los montes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 28, 10, NULL, 'De los peñascos cortó ríos, Y sus ojos vieron todo lo preciado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 28, 11, NULL, 'Detuvo los ríos en su nacimiento, E hizo salir a luz lo escondido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 28, 12, NULL, 'Mas ¿dónde se hallará la sabiduría? ¿Dónde está el lugar de la inteligencia?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 28, 13, NULL, 'No conoce su valor el hombre, Ni se halla en la tierra de los vivientes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 28, 14, NULL, 'El abismo dice: No está en mí; Y el mar dijo: Ni conmigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 28, 15, NULL, 'No se dará por oro, Ni su precio será a peso de plata.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 28, 16, NULL, 'No puede ser apreciada con oro de Ofir, Ni con ónice precioso, ni con zafiro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 28, 17, NULL, 'El oro no se le igualará, ni el diamante, Ni se cambiará por alhajas de oro fino.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 28, 18, NULL, 'No se hará mención de coral ni de perlas; La sabiduría es mejor que las piedras preciosas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 28, 19, NULL, 'No se igualará con ella topacio de Etiopía; No se podrá apreciar con oro fino.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 28, 20, NULL, '¿De dónde, pues, vendrá la sabiduría? ¿Y dónde está el lugar de la inteligencia?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 28, 21, NULL, 'Porque encubierta está a los ojos de todo viviente, Y a toda ave del cielo es oculta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 28, 22, NULL, 'El Abadón y la muerte dijeron: Su fama hemos oído con nuestros oídos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 28, 23, NULL, 'Dios entiende el camino de ella, Y conoce su lugar.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 28, 24, NULL, 'Porque él mira hasta los fines de la tierra, Y ve cuanto hay bajo los cielos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 28, 25, NULL, 'Al dar peso al viento, Y poner las aguas por medida;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 28, 26, NULL, 'Cuando él dio ley a la lluvia, Y camino al relámpago de los truenos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 28, 27, NULL, 'Entonces la veía él, y la manifestaba; La preparó y la descubrió también.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 28, 28, NULL, 'Y dijo al hombre: He aquí que el temor del Señor es la sabiduría, Y el apartarse del mal, la inteligencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 29, 1, 'Job recuerda su felicidad anterior', 'Volvió Job a reanudar su discurso, y dijo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 29, 2, NULL, '¡Quién me volviese como en los meses pasados, Como en los días en que Dios me guardaba,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 29, 3, NULL, 'Cuando hacía resplandecer sobre mi cabeza su lámpara, A cuya luz yo caminaba en la oscuridad;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 29, 4, NULL, 'Como fui en los días de mi juventud, Cuando el favor de Dios velaba sobre mi tienda;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 29, 5, NULL, 'Cuando aún estaba conmigo el Omnipotente, Y mis hijos alrededor de mí;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 29, 6, NULL, 'Cuando lavaba yo mis pasos con leche, Y la piedra me derramaba ríos de aceite!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 29, 7, NULL, 'Cuando yo salía a la puerta a juicio, Y en la plaza hacía preparar mi asiento,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 29, 8, NULL, 'Los jóvenes me veían, y se escondían; Y los ancianos se levantaban, y estaban de pie.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 29, 9, NULL, 'Los príncipes detenían sus palabras; Ponían la mano sobre su boca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 29, 10, NULL, 'La voz de los principales se apagaba, Y su lengua se pegaba a su paladar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 29, 11, NULL, 'Los oídos que me oían me llamaban bienaventurado, Y los ojos que me veían me daban testimonio,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 29, 12, NULL, 'Porque yo libraba al pobre que clamaba, Y al huérfano que carecía de ayudador.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 29, 13, NULL, 'La bendición del que se iba a perder venía sobre mí, Y al corazón de la viuda yo daba alegría.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 29, 14, NULL, 'Me vestía de justicia, y ella me cubría; Como manto y diadema era mi rectitud.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 29, 15, NULL, 'Yo era ojos al ciego, Y pies al cojo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 29, 16, NULL, 'A los menesterosos era padre, Y de la causa que no entendía, me informaba con diligencia;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 29, 17, NULL, 'Y quebrantaba los colmillos del inicuo, Y de sus dientes hacía soltar la presa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 29, 18, NULL, 'Decía yo: En mi nido moriré, Y como arena multiplicaré mis días.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 29, 19, NULL, 'Mi raíz estaba abierta junto a las aguas, Y en mis ramas permanecía el rocío.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 29, 20, NULL, 'Mi honra se renovaba en mí, Y mi arco se fortalecía en mi mano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 29, 21, NULL, 'Me oían, y esperaban, Y callaban a mi consejo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 29, 22, NULL, 'Tras mi palabra no replicaban, Y mi razón destilaba sobre ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 29, 23, NULL, 'Me esperaban como a la lluvia, Y abrían su boca como a la lluvia tardía.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 29, 24, NULL, 'Si me reía con ellos, no lo creían; Y no abatían la luz de mi rostro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 29, 25, NULL, 'Calificaba yo el camino de ellos, y me sentaba entre ellos como el jefe; Y moraba como rey en el ejército, Como el que consuela a los que lloran.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 30, 1, 'Job lamenta su desdicha actual', 'Pero ahora se ríen de mí los más jóvenes que yo, A cuyos padres yo desdeñara poner con los perros de mi ganado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 30, 2, NULL, '¿Y de qué me serviría ni aun la fuerza de sus manos? No tienen fuerza alguna.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 30, 3, NULL, 'Por causa de la pobreza y del hambre andaban solos; Huían a la soledad, a lugar tenebroso, asolado y desierto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 30, 4, NULL, 'Recogían malvas entre los arbustos, Y raíces de enebro para calentarse.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 30, 5, NULL, 'Eran arrojados de entre las gentes, Y todos les daban grita como tras el ladrón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 30, 6, NULL, 'Habitaban en las barrancas de los arroyos, En las cavernas de la tierra, y en las rocas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 30, 7, NULL, 'Bramaban entre las matas, Y se reunían debajo de los espinos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 30, 8, NULL, 'Hijos de viles, y hombres sin nombre, Más bajos que la misma tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 30, 9, NULL, 'Y ahora yo soy objeto de su burla, Y les sirvo de refrán.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 30, 10, NULL, 'Me abominan, se alejan de mí, Y aun de mi rostro no detuvieron su saliva.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 30, 11, NULL, 'Porque Dios desató su cuerda, y me afligió, Por eso se desenfrenaron delante de mi rostro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 30, 12, NULL, 'A la mano derecha se levantó el populacho; Empujaron mis pies, Y prepararon contra mí caminos de perdición.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 30, 13, NULL, 'Mi senda desbarataron, Se aprovecharon de mi quebrantamiento, Y contra ellos no hubo ayudador.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 30, 14, NULL, 'Vinieron como por portillo ancho, Se revolvieron sobre mi calamidad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 30, 15, NULL, 'Se han revuelto turbaciones sobre mí; Combatieron como viento mi honor, Y mi prosperidad pasó como nube.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 30, 16, NULL, 'Y ahora mi alma está derramada en mí; Días de aflicción se apoderan de mí.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 30, 17, NULL, 'La noche taladra mis huesos, Y los dolores que me roen no reposan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 30, 18, NULL, 'La violencia deforma mi vestidura; me ciñe como el cuello de mi túnica.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 30, 19, NULL, 'Él me derribó en el lodo, Y soy semejante al polvo y a la ceniza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 30, 20, NULL, 'Clamo a ti, y no me oyes; Me presento, y no me atiendes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 30, 21, NULL, 'Te has vuelto cruel para mí; Con el poder de tu mano me persigues.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 30, 22, NULL, 'Me alzaste sobre el viento, me hiciste cabalgar en él, Y disolviste mi sustancia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 30, 23, NULL, 'Porque yo sé que me conduces a la muerte, Y a la casa determinada a todo viviente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 30, 24, NULL, 'Mas él no extenderá la mano contra el sepulcro; ¿Clamarán los sepultados cuando él los quebrantare?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 30, 25, NULL, '¿No lloré yo al afligido? Y mi alma, ¿no se entristeció sobre el menesteroso?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 30, 26, NULL, 'Cuando esperaba yo el bien, entonces vino el mal; Y cuando esperaba luz, vino la oscuridad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 30, 27, NULL, 'Mis entrañas se agitan, y no reposan; Días de aflicción me han sobrecogido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 30, 28, NULL, 'Ando ennegrecido, y no por el sol; Me he levantado en la congregación, y clamado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 30, 29, NULL, 'He venido a ser hermano de chacales, Y compañero de avestruces.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 30, 30, NULL, 'Mi piel se ha ennegrecido y se me cae, Y mis huesos arden de calor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 30, 31, NULL, 'Se ha cambiado mi arpa en luto, Y mi flauta en voz de lamentadores.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 1, 'Job afirma su integridad', 'Hice pacto con mis ojos; ¿Cómo, pues, había yo de mirar a una virgen?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 2, NULL, 'Porque ¿qué galardón me daría de arriba Dios, Y qué heredad el Omnipotente desde las alturas?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 3, NULL, '¿No hay quebrantamiento para el impío, Y extrañamiento para los que hacen iniquidad?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 4, NULL, '¿No ve él mis caminos, Y cuenta todos mis pasos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 5, NULL, 'Si anduve con mentira, Y si mi pie se apresuró a engaño,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 6, NULL, 'Péseme Dios en balanzas de justicia, Y conocerá mi integridad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 7, NULL, 'Si mis pasos se apartaron del camino, Si mi corazón se fue tras mis ojos, Y si algo se pegó a mis manos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 8, NULL, 'Siembre yo, y otro coma, Y sea arrancada mi siembra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 9, NULL, 'Si fue mi corazón engañado acerca de mujer, Y si estuve acechando a la puerta de mi prójimo,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 10, NULL, 'Muela para otro mi mujer, Y sobre ella otros se encorven.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 11, NULL, 'Porque es maldad e iniquidad Que han de castigar los jueces.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 12, NULL, 'Porque es fuego que devoraría hasta el Abadón, Y consumiría toda mi hacienda.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 13, NULL, 'Si hubiera tenido en poco el derecho de mi siervo y de mi sierva, Cuando ellos contendían conmigo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 14, NULL, '¿Qué haría yo cuando Dios se levantase? Y cuando él preguntara, ¿qué le respondería yo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 15, NULL, 'El que en el vientre me hizo a mí, ¿no lo hizo a él? ¿Y no nos dispuso uno mismo en la matriz?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 16, NULL, 'Si estorbé el contento de los pobres, E hice desfallecer los ojos de la viuda;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 17, NULL, 'Si comí mi bocado solo, Y no comió de él el huérfano', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 18, NULL, '(Porque desde mi juventud creció conmigo como con un padre, Y desde el vientre de mi madre fui guía de la viuda);', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 19, NULL, 'Si he visto que pereciera alguno sin vestido, Y al menesteroso sin abrigo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 20, NULL, 'Si no me bendijeron sus lomos, Y del vellón de mis ovejas se calentaron;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 21, NULL, 'Si alcé contra el huérfano mi mano, Aunque viese que me ayudaran en la puerta;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 22, NULL, 'Mi espalda se caiga de mi hombro, Y el hueso de mi brazo sea quebrado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 23, NULL, 'Porque temí el castigo de Dios, Contra cuya majestad yo no tendría poder.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 24, NULL, 'Si puse en el oro mi esperanza, Y dije al oro: Mi confianza eres tú;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 25, NULL, 'Si me alegré de que mis riquezas se multiplicasen, Y de que mi mano hallase mucho;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 26, NULL, 'Si he mirado al sol cuando resplandecía, O a la luna cuando iba hermosa,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 27, NULL, 'Y mi corazón se engañó en secreto, Y mi boca besó mi mano;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 28, NULL, 'Esto también sería maldad juzgada; Porque habría negado al Dios soberano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 29, NULL, 'Si me alegré en el quebrantamiento del que me aborrecía, Y me regocijé cuando le halló el mal', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 30, NULL, '(Ni aun entregué al pecado mi lengua, Pidiendo maldición para su alma);', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 31, NULL, 'Si mis siervos no decían: ¿Quién no se ha saciado de su carne?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 32, NULL, '(El forastero no pasaba fuera la noche; Mis puertas abría al caminante);', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 33, NULL, 'Si encubrí como hombre mis transgresiones, Escondiendo en mi seno mi iniquidad,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 34, NULL, 'Porque tuve temor de la gran multitud, Y el menosprecio de las familias me atemorizó, Y callé, y no salí de mi puerta;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 35, NULL, '¡Quién me diera quien me oyese! He aquí mi confianza es que el Omnipotente testificará por mí, Aunque mi adversario me forme proceso.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 36, NULL, 'Ciertamente yo lo llevaría sobre mi hombro, Y me lo ceñiría como una corona.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 37, NULL, 'Yo le contaría el número de mis pasos, Y como príncipe me presentaría ante él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 38, NULL, 'Si mi tierra clama contra mí, Y lloran todos sus surcos;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 39, NULL, 'Si comí su sustancia sin dinero, O afligí el alma de sus dueños,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 31, 40, NULL, 'En lugar de trigo me nazcan abrojos, Y espinos en lugar de cebada. Aquí terminan las palabras de Job.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 32, 1, 'Eliú justifica su derecho de contestar a Job', 'Cesaron estos tres varones de responder a Job, por cuanto él era justo a sus propios ojos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 32, 2, NULL, 'Entonces Eliú hijo de Baraquel buzita, de la familia de Ram, se encendió en ira contra Job; se encendió en ira, por cuanto se justificaba a sí mismo más que a Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 32, 3, NULL, 'Asimismo se encendió en ira contra sus tres amigos, porque no hallaban qué responder, aunque habían condenado a Job.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 32, 4, NULL, 'Y Eliú había esperado a Job en la disputa, porque los otros eran más viejos que él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 32, 5, NULL, 'Pero viendo Eliú que no había respuesta en la boca de aquellos tres varones, se encendió en ira.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 32, 6, NULL, 'Y respondió Eliú hijo de Baraquel buzita, y dijo: Yo soy joven, y vosotros ancianos; Por tanto, he tenido miedo, y he temido declararos mi opinión.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 32, 7, NULL, 'Yo decía: Los días hablarán, Y la muchedumbre de años declarará sabiduría.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 32, 8, NULL, 'Ciertamente espíritu hay en el hombre, Y el soplo del Omnipotente le hace que entienda.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 32, 9, NULL, 'No son los sabios los de mucha edad, Ni los ancianos entienden el derecho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 32, 10, NULL, 'Por tanto, yo dije: Escuchadme; Declararé yo también mi sabiduría.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 32, 11, NULL, 'He aquí yo he esperado a vuestras razones, He escuchado vuestros argumentos, En tanto que buscabais palabras.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 32, 12, NULL, 'Os he prestado atención, Y he aquí que no hay de vosotros quien redarguya a Job, Y responda a sus razones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 32, 13, NULL, 'Para que no digáis: Nosotros hemos hallado sabiduría; Lo vence Dios, no el hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 32, 14, NULL, 'Ahora bien, Job no dirigió contra mí sus palabras, Ni yo le responderé con vuestras razones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 32, 15, NULL, 'Se espantaron, no respondieron más; Se les fueron los razonamientos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 32, 16, NULL, 'Yo, pues, he esperado, pero no hablaban; Más bien callaron y no respondieron más.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 32, 17, NULL, 'Por eso yo también responderé mi parte; También yo declararé mi juicio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 32, 18, NULL, 'Porque lleno estoy de palabras, Y me apremia el espíritu dentro de mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 32, 19, NULL, 'De cierto mi corazón está como el vino que no tiene respiradero, Y se rompe como odres nuevos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 32, 20, NULL, 'Hablaré, pues, y respiraré; Abriré mis labios, y responderé.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 32, 21, NULL, 'No haré ahora acepción de personas, Ni usaré con nadie de títulos lisonjeros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 32, 22, NULL, 'Porque no sé hablar lisonjas; De otra manera, en breve mi Hacedor me consumiría.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 33, 1, 'Eliú censura a Job', 'Por tanto, Job, oye ahora mis razones, Y escucha todas mis palabras.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 33, 2, NULL, 'He aquí yo abriré ahora mi boca, Y mi lengua hablará en mi garganta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 33, 3, NULL, 'Mis razones declararán la rectitud de mi corazón, Y lo que saben mis labios, lo hablarán con sinceridad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 33, 4, NULL, 'El espíritu de Dios me hizo, Y el soplo del Omnipotente me dio vida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 33, 5, NULL, 'Respóndeme si puedes; Ordena tus palabras, ponte en pie.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 33, 6, NULL, 'Heme aquí a mí en lugar de Dios, conforme a tu dicho; De barro fui yo también formado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 33, 7, NULL, 'He aquí, mi terror no te espantará, Ni mi mano se agravará sobre ti.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 33, 8, NULL, 'De cierto tú dijiste a oídos míos, Y yo oí la voz de tus palabras que decían:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 33, 9, NULL, 'Yo soy limpio y sin defecto; Soy inocente, y no hay maldad en mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 33, 10, NULL, 'He aquí que él buscó reproches contra mí, Y me tiene por su enemigo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 33, 11, NULL, 'Puso mis pies en el cepo, Y vigiló todas mis sendas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 33, 12, NULL, 'He aquí, en esto no has hablado justamente; Yo te responderé que mayor es Dios que el hombre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 33, 13, NULL, '¿Por qué contiendes contra él? Porque él no da cuenta de ninguna de sus razones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 33, 14, NULL, 'Sin embargo, en una o en dos maneras habla Dios; Pero el hombre no entiende.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 33, 15, NULL, 'Por sueño, en visión nocturna, Cuando el sueño cae sobre los hombres, Cuando se adormecen sobre el lecho,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 33, 16, NULL, 'Entonces revela al oído de los hombres, Y les señala su consejo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 33, 17, NULL, 'Para quitar al hombre de su obra, Y apartar del varón la soberbia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 33, 18, NULL, 'Detendrá su alma del sepulcro, Y su vida de que perezca a espada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 33, 19, NULL, 'También sobre su cama es castigado Con dolor fuerte en todos sus huesos,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 33, 20, NULL, 'Que le hace que su vida aborrezca el pan, Y su alma la comida suave.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 33, 21, NULL, 'Su carne desfallece, de manera que no se ve, Y sus huesos, que antes no se veían, aparecen.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 33, 22, NULL, 'Su alma se acerca al sepulcro, Y su vida a los que causan la muerte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 33, 23, NULL, 'Si tuviese cerca de él Algún elocuente mediador muy escogido, Que anuncie al hombre su deber;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 33, 24, NULL, 'Que le diga que Dios tuvo de él misericordia, Que lo libró de descender al sepulcro, Que halló redención;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 33, 25, NULL, 'Su carne será más tierna que la del niño, Volverá a los días de su juventud.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 33, 26, NULL, 'Orará a Dios, y este le amará, Y verá su faz con júbilo; Y restaurará al hombre su justicia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 33, 27, NULL, 'Él mira sobre los hombres; y al que dijere: Pequé, y pervertí lo recto, Y no me ha aprovechado,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 33, 28, NULL, 'Dios redimirá su alma para que no pase al sepulcro, Y su vida se verá en luz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 33, 29, NULL, 'He aquí, todas estas cosas hace Dios Dos y tres veces con el hombre,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 33, 30, NULL, 'Para apartar su alma del sepulcro, Y para iluminarlo con la luz de los vivientes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 33, 31, NULL, 'Escucha, Job, y óyeme; Calla, y yo hablaré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 33, 32, NULL, 'Si tienes razones, respóndeme; Habla, porque yo te quiero justificar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 33, 33, NULL, 'Y si no, óyeme tú a mí; Calla, y te enseñaré sabiduría.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 34, 1, 'Eliú justifica a Dios', 'Además Eliú dijo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 34, 2, NULL, 'Oíd, sabios, mis palabras; Y vosotros, doctos, estadme atentos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 34, 3, NULL, 'Porque el oído prueba las palabras, Como el paladar gusta lo que uno come.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 34, 4, NULL, 'Escojamos para nosotros el juicio, Conozcamos entre nosotros cuál sea lo bueno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 34, 5, NULL, 'Porque Job ha dicho: Yo soy justo, Y Dios me ha quitado mi derecho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 34, 6, NULL, '¿He de mentir yo contra mi razón? Dolorosa es mi herida sin haber hecho yo transgresión.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 34, 7, NULL, '¿Qué hombre hay como Job, Que bebe el escarnio como agua,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 34, 8, NULL, 'Y va en compañía con los que hacen iniquidad, Y anda con los hombres malos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 34, 9, NULL, 'Porque ha dicho: De nada servirá al hombre El conformar su voluntad a Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 34, 10, NULL, 'Por tanto, varones de inteligencia, oídme: Lejos esté de Dios la impiedad, Y del Omnipotente la iniquidad.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 34, 11, NULL, 'Porque él pagará al hombre según su obra, Y le retribuirá conforme a su camino.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 34, 12, NULL, 'Sí, por cierto, Dios no hará injusticia, Y el Omnipotente no pervertirá el derecho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 34, 13, NULL, '¿Quién visitó por él la tierra? ¿Y quién puso en orden todo el mundo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 34, 14, NULL, 'Si él pusiese sobre el hombre su corazón, Y recogiese así su espíritu y su aliento,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 34, 15, NULL, 'Toda carne perecería juntamente, Y el hombre volvería al polvo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 34, 16, NULL, 'Si, pues, hay en ti entendimiento, oye esto; Escucha la voz de mis palabras.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 34, 17, NULL, '¿Gobernará el que aborrece juicio? ¿Y condenarás tú al que es tan justo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 34, 18, NULL, '¿Se dirá al rey: Perverso; Y a los príncipes: Impíos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 34, 19, NULL, '¿Cuánto menos a aquel que no hace acepción de personas de príncipes. Ni respeta más al rico que al pobre, Porque todos son obra de sus manos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 34, 20, NULL, 'En un momento morirán, Y a medianoche se alborotarán los pueblos, y pasarán, Y sin mano será quitado el poderoso.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 34, 21, NULL, 'Porque sus ojos están sobre los caminos del hombre, Y ve todos sus pasos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 34, 22, NULL, 'No hay tinieblas ni sombra de muerte Donde se escondan los que hacen maldad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 34, 23, NULL, 'No carga, pues, él al hombre más de lo justo, Para que vaya con Dios a juicio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 34, 24, NULL, 'Él quebrantará a los fuertes sin indagación, Y hará estar a otros en su lugar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 34, 25, NULL, 'Por tanto, él hará notorias las obras de ellos, Cuando los trastorne en la noche, y sean quebrantados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 34, 26, NULL, 'Como a malos los herirá En lugar donde sean vistos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 34, 27, NULL, 'Por cuanto así se apartaron de él, Y no consideraron ninguno de sus caminos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 34, 28, NULL, 'Haciendo venir delante de él el clamor del pobre, Y que oiga el clamor de los necesitados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 34, 29, NULL, 'Si él diere reposo, ¿quién inquietará? Si escondiere el rostro, ¿quién lo mirará? Esto sobre una nación, y lo mismo sobre un hombre;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 34, 30, NULL, 'Haciendo que no reine el hombre impío Para vejaciones del pueblo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 34, 31, NULL, 'De seguro conviene que se diga a Dios: He llevado ya castigo, no ofenderé ya más;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 34, 32, NULL, 'Enséñame tú lo que yo no veo; Si hice mal, no lo haré más.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 34, 33, NULL, '¿Ha de ser eso según tu parecer? Él te retribuirá, ora rehúses, ora aceptes, y no yo; Di, si no, lo que tú sabes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 34, 34, NULL, 'Los hombres inteligentes dirán conmigo, Y el hombre sabio que me oiga:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 34, 35, NULL, 'Que Job no habla con sabiduría, Y que sus palabras no son con entendimiento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 34, 36, NULL, 'Deseo yo que Job sea probado ampliamente, A causa de sus respuestas semejantes a las de los hombres inicuos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 34, 37, NULL, 'Porque a su pecado añadió rebeldía; Bate palmas contra nosotros, Y contra Dios multiplica sus palabras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 35, 1, NULL, 'Prosiguió Eliú en su razonamiento, y dijo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 35, 2, NULL, '¿Piensas que es cosa recta lo que has dicho: Más justo soy yo que Dios?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 35, 3, NULL, 'Porque dijiste: ¿Qué ventaja sacaré de ello? ¿O qué provecho tendré de no haber pecado?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 35, 4, NULL, 'Yo te responderé razones, Y a tus compañeros contigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 35, 5, NULL, 'Mira a los cielos, y ve, Y considera que las nubes son más altas que tú.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 35, 6, NULL, 'Si pecares, ¿qué habrás logrado contra él? Y si tus rebeliones se multiplicaren, ¿qué le harás tú?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 35, 7, NULL, 'Si fueres justo, ¿qué le darás a él? ¿O qué recibirá de tu mano?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 35, 8, NULL, 'Al hombre como tú dañará tu impiedad, Y al hijo de hombre aprovechará tu justicia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 35, 9, NULL, 'A causa de la multitud de las violencias claman, Y se lamentan por el poderío de los grandes.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 35, 10, NULL, 'Y ninguno dice: ¿Dónde está Dios mi Hacedor, Que da cánticos en la noche,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 35, 11, NULL, 'Que nos enseña más que a las bestias de la tierra, Y nos hace sabios más que a las aves del cielo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 35, 12, NULL, 'Allí clamarán, y él no oirá, Por la soberbia de los malos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 35, 13, NULL, 'Ciertamente Dios no oirá la vanidad, Ni la mirará el Omnipotente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 35, 14, NULL, '¿Cuánto menos cuando dices que no haces caso de él? La causa está delante de él; por tanto, aguárdale.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 35, 15, NULL, 'Mas ahora, porque en su ira no castiga, Ni inquiere con rigor,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 35, 16, NULL, 'Por eso Job abre su boca vanamente, Y multiplica palabras sin sabiduría.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 36, 1, 'Eliú exalta la grandeza de Dios', 'Añadió Eliú y dijo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 36, 2, NULL, 'Espérame un poco, y te enseñaré; Porque todavía tengo razones en defensa de Dios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 36, 3, NULL, 'Tomaré mi saber desde lejos, Y atribuiré justicia a mi Hacedor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 36, 4, NULL, 'Porque de cierto no son mentira mis palabras; Contigo está el que es íntegro en sus conceptos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 36, 5, NULL, 'He aquí que Dios es grande, pero no desestima a nadie; Es poderoso en fuerza de sabiduría.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 36, 6, NULL, 'No otorgará vida al impío, Pero a los afligidos dará su derecho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 36, 7, NULL, 'No apartará de los justos sus ojos; Antes bien con los reyes los pondrá en trono para siempre, Y serán exaltados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 36, 8, NULL, 'Y si estuvieren prendidos en grillos, Y aprisionados en las cuerdas de aflicción,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 36, 9, NULL, 'Él les dará a conocer la obra de ellos, Y que prevalecieron sus rebeliones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 36, 10, NULL, 'Despierta además el oído de ellos para la corrección, Y les dice que se conviertan de la iniquidad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 36, 11, NULL, 'Si oyeren, y le sirvieren, Acabarán sus días en bienestar, Y sus años en dicha.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 36, 12, NULL, 'Pero si no oyeren, serán pasados a espada, Y perecerán sin sabiduría.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 36, 13, NULL, 'Mas los hipócritas de corazón atesoran para sí la ira, Y no clamarán cuando él los atare.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 36, 14, NULL, 'Fallecerá el alma de ellos en su juventud, Y su vida entre los sodomitas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 36, 15, NULL, 'Al pobre librará de su pobreza, Y en la aflicción despertará su oído.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 36, 16, NULL, 'Asimismo te apartará de la boca de la angustia A lugar espacioso, libre de todo apuro, Y te preparará mesa llena de grosura.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 36, 17, NULL, 'Mas tú has llenado el juicio del impío, En vez de sustentar el juicio y la justicia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 36, 18, NULL, 'Por lo cual teme, no sea que en su ira te quite con golpe, El cual no puedas apartar de ti con gran rescate.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 36, 19, NULL, '¿Hará él estima de tus riquezas, del oro, O de todas las fuerzas del poder?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 36, 20, NULL, 'No anheles la noche, En que los pueblos desaparecen de su lugar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 36, 21, NULL, 'Guárdate, no te vuelvas a la iniquidad; Pues esta escogiste más bien que la aflicción.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 36, 22, NULL, 'He aquí que Dios es excelso en su poder; ¿Qué enseñador semejante a él?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 36, 23, NULL, '¿Quién le ha prescrito su camino? ¿Y quién le dirá: Has hecho mal?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 36, 24, NULL, 'Acuérdate de engrandecer su obra, La cual contemplan los hombres.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 36, 25, NULL, 'Los hombres todos la ven; La mira el hombre de lejos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 36, 26, NULL, 'He aquí, Dios es grande, y nosotros no le conocemos, Ni se puede seguir la huella de sus años.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 36, 27, NULL, 'Él atrae las gotas de las aguas, Al transformarse el vapor en lluvia,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 36, 28, NULL, 'La cual destilan las nubes, Goteando en abundancia sobre los hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 36, 29, NULL, '¿Quién podrá comprender la extensión de las nubes, Y el sonido estrepitoso de su morada?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 36, 30, NULL, 'He aquí que sobre él extiende su luz, Y cobija con ella las profundidades del mar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 36, 31, NULL, 'Bien que por esos medios castiga a los pueblos, A la multitud él da sustento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 36, 32, NULL, 'Con las nubes encubre la luz, Y le manda no brillar, interponiendo aquellas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 36, 33, NULL, 'El trueno declara su indignación, Y la tempestad proclama su ira contra la iniquidad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 37, 1, NULL, 'Por eso también se estremece mi corazón, Y salta de su lugar.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 37, 2, NULL, 'Oíd atentamente el estrépito de su voz, Y el sonido que sale de su boca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 37, 3, NULL, 'Debajo de todos los cielos lo dirige, Y su luz hasta los fines de la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 37, 4, NULL, 'Después de ella brama el sonido, Truena él con voz majestuosa; Y aunque sea oída su voz, no los detiene.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 37, 5, NULL, 'Truena Dios maravillosamente con su voz; Él hace grandes cosas, que nosotros no entendemos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 37, 6, NULL, 'Porque a la nieve dice: Desciende a la tierra; También a la llovizna, y a los aguaceros torrenciales.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 37, 7, NULL, 'Así hace retirarse a todo hombre, Para que los hombres todos reconozcan su obra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 37, 8, NULL, 'Las bestias entran en su escondrijo, Y se están en sus moradas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 37, 9, NULL, 'Del sur viene el torbellino, Y el frío de los vientos del norte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 37, 10, NULL, 'Por el soplo de Dios se da el hielo, Y las anchas aguas se congelan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 37, 11, NULL, 'Regando también llega a disipar la densa nube, Y con su luz esparce la niebla.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 37, 12, NULL, 'Asimismo por sus designios se revuelven las nubes en derredor, Para hacer sobre la faz del mundo, En la tierra, lo que él les mande.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 37, 13, NULL, 'Unas veces por azote, otras por causa de su tierra, Otras por misericordia las hará venir.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 37, 14, NULL, 'Escucha esto, Job; Detente, y considera las maravillas de Dios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 37, 15, NULL, '¿Sabes tú cómo Dios las pone en concierto, Y hace resplandecer la luz de su nube?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 37, 16, NULL, '¿Has conocido tú las diferencias de las nubes, Las maravillas del Perfecto en sabiduría?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 37, 17, NULL, '¿Por qué están calientes tus vestidos Cuando él sosiega la tierra con el viento del sur?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 37, 18, NULL, '¿Extendiste tú con él los cielos, Firmes como un espejo fundido?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 37, 19, NULL, 'Muéstranos qué le hemos de decir; Porque nosotros no podemos ordenar las ideas a causa de las tinieblas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 37, 20, NULL, '¿Será preciso contarle cuando yo hablare? Por más que el hombre razone, quedará como abismado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 37, 21, NULL, 'Mas ahora ya no se puede mirar la luz esplendente en los cielos, Luego que pasa el viento y los limpia,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 37, 22, NULL, 'Viniendo de la parte del norte la dorada claridad. En Dios hay una majestad terrible.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 37, 23, NULL, 'Él es Todopoderoso, al cual no alcanzamos, grande en poder; Y en juicio y en multitud de justicia no afligirá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 37, 24, NULL, 'Lo temerán por tanto los hombres; Él no estima a ninguno que cree en su propio corazón ser sabio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 1, 'Jehová convence a Job de su ignorancia', 'Entonces respondió Jehová a Job desde un torbellino, y dijo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 2, NULL, '¿Quién es ese que oscurece el consejo Con palabras sin sabiduría?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 3, NULL, 'Ahora ciñe como varón tus lomos; Yo te preguntaré, y tú me contestarás.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 4, NULL, '¿Dónde estabas tú cuando yo fundaba la tierra? Házmelo saber, si tienes inteligencia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 5, NULL, '¿Quién ordenó sus medidas, si lo sabes? ¿O quién extendió sobre ella cordel?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 6, NULL, '¿Sobre qué están fundadas sus bases? ¿O quién puso su piedra angular,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 7, NULL, 'Cuando alababan todas las estrellas del alba, Y se regocijaban todos los hijos de Dios?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 8, NULL, '¿Quién encerró con puertas el mar, Cuando se derramaba saliéndose de su seno,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 9, NULL, 'Cuando puse yo nubes por vestidura suya, Y por su faja oscuridad,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 10, NULL, 'Y establecí sobre él mi decreto, Le puse puertas y cerrojo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 11, NULL, 'Y dije: Hasta aquí llegarás, y no pasarás adelante, Y ahí parará el orgullo de tus olas?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 12, NULL, '¿Has mandado tú a la mañana en tus días? ¿Has mostrado al alba su lugar,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 13, NULL, 'Para que ocupe los fines de la tierra, Y para que sean sacudidos de ella los impíos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 14, NULL, 'Ella muda luego de aspecto como barro bajo el sello, Y viene a estar como con vestidura;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 15, NULL, 'Mas la luz de los impíos es quitada de ellos, Y el brazo enaltecido es quebrantado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 16, NULL, '¿Has entrado tú hasta las fuentes del mar, Y has andado escudriñando el abismo?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 17, NULL, '¿Te han sido descubiertas las puertas de la muerte, Y has visto las puertas de la sombra de muerte?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 18, NULL, '¿Has considerado tú hasta las anchuras de la tierra? Declara si sabes todo esto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 19, NULL, '¿Por dónde va el camino a la habitación de la luz, Y dónde está el lugar de las tinieblas,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 20, NULL, 'Para que las lleves a sus límites, Y entiendas las sendas de su casa?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 21, NULL, '¡Tú lo sabes! Pues entonces ya habías nacido, Y es grande el número de tus días.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 22, NULL, '¿Has entrado tú en los tesoros de la nieve, O has visto los tesoros del granizo,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 23, NULL, 'Que tengo reservados para el tiempo de angustia, Para el día de la guerra y de la batalla?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 24, NULL, '¿Por qué camino se reparte la luz, Y se esparce el viento solano sobre la tierra?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 25, NULL, '¿Quién repartió conducto al turbión, Y camino a los relámpagos y truenos,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 26, NULL, 'Haciendo llover sobre la tierra deshabitada, Sobre el desierto, donde no hay hombre,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 27, NULL, 'Para saciar la tierra desierta e inculta, Y para hacer brotar la tierna hierba?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 28, NULL, '¿Tiene la lluvia padre? ¿O quién engendró las gotas del rocío?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 29, NULL, '¿De qué vientre salió el hielo? Y la escarcha del cielo, ¿quién la engendró?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 30, NULL, 'Las aguas se endurecen a manera de piedra, Y se congela la faz del abismo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 31, NULL, '¿Podrás tú atar los lazos de las Pléyades, O desatarás las ligaduras de Orión?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 32, NULL, '¿Sacarás tú a su tiempo las constelaciones de los cielos, O guiarás a la Osa Mayor con sus hijos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 33, NULL, '¿Supiste tú las ordenanzas de los cielos? ¿Dispondrás tú de su potestad en la tierra?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 34, NULL, '¿Alzarás tú a las nubes tu voz, Para que te cubra muchedumbre de aguas?', 1, 'spa', 'RVR1960', NULL);\n"
;

  public static final String SQL_PARTE_4 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Job', 38, 35, NULL, '¿Enviarás tú los relámpagos, para que ellos vayan? ¿Y te dirán ellos: Henos aquí?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 36, NULL, '¿Quién puso la sabiduría en el corazón? ¿O quién dio al espíritu inteligencia?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 37, NULL, '¿Quién puso por cuenta los cielos con sabiduría? Y los odres de los cielos, ¿quién los hace inclinar,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 38, NULL, 'Cuando el polvo se ha convertido en dureza, Y los terrones se han pegado unos con otros?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 39, NULL, '¿Cazarás tú la presa para el león? ¿Saciarás el hambre de los leoncillos,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 40, NULL, 'Cuando están echados en las cuevas, O se están en sus guaridas para acechar?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 38, 41, NULL, '¿Quién prepara al cuervo su alimento, Cuando sus polluelos claman a Dios, Y andan errantes por falta de comida?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 39, 1, NULL, '¿Sabes tú el tiempo en que paren las cabras monteses? ¿O miraste tú las ciervas cuando están pariendo?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 39, 2, NULL, '¿Contaste tú los meses de su preñez, Y sabes el tiempo cuando han de parir?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 39, 3, NULL, 'Se encorvan, hacen salir sus hijos, Pasan sus dolores.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 39, 4, NULL, 'Sus hijos se fortalecen, crecen con el pasto; Salen, y no vuelven a ellas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 39, 5, NULL, '¿Quién echó libre al asno montés, Y quién soltó sus ataduras?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 39, 6, NULL, 'Al cual yo puse casa en la soledad, Y sus moradas en lugares estériles.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 39, 7, NULL, 'Se burla de la multitud de la ciudad; No oye las voces del arriero.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 39, 8, NULL, 'Lo oculto de los montes es su pasto, Y anda buscando toda cosa verde.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 39, 9, NULL, '¿Querrá el búfalo servirte a ti, O quedar en tu pesebre?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 39, 10, NULL, '¿Atarás tú al búfalo con coyunda para el surco? ¿Labrará los valles en pos de ti?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 39, 11, NULL, '¿Confiarás tú en él, por ser grande su fuerza, Y le fiarás tu labor?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 39, 12, NULL, '¿Fiarás de él para que recoja tu semilla, Y la junte en tu era?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 39, 13, NULL, '¿Diste tú hermosas alas al pavo real, O alas y plumas al avestruz?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 39, 14, NULL, 'El cual desampara en la tierra sus huevos, Y sobre el polvo los calienta,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 39, 15, NULL, 'Y olvida que el pie los puede pisar, Y que puede quebrarlos la bestia del campo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 39, 16, NULL, 'Se endurece para con sus hijos, como si no fuesen suyos, No temiendo que su trabajo haya sido en vano;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 39, 17, NULL, 'Porque le privó Dios de sabiduría, Y no le dio inteligencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 39, 18, NULL, 'Luego que se levanta en alto, Se burla del caballo y de su jinete.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 39, 19, NULL, '¿Diste tú al caballo la fuerza? ¿Vestiste tú su cuello de crines ondulantes?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 39, 20, NULL, '¿Le intimidarás tú como a langosta? El resoplido de su nariz es formidable.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 39, 21, NULL, 'Escarba la tierra, se alegra en su fuerza, Sale al encuentro de las armas;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 39, 22, NULL, 'Hace burla del espanto, y no teme, Ni vuelve el rostro delante de la espada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 39, 23, NULL, 'Contra él suenan la aljaba, El hierro de la lanza y de la jabalina;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 39, 24, NULL, 'Y él con ímpetu y furor escarba la tierra, Sin importarle el sonido de la trompeta;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 39, 25, NULL, 'Antes como que dice entre los clarines: ¡Ea! Y desde lejos huele la batalla, El grito de los capitanes, y el vocerío.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 39, 26, NULL, '¿Vuela el gavilán por tu sabiduría, Y extiende hacia el sur sus alas?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 39, 27, NULL, '¿Se remonta el águila por tu mandamiento, Y pone en alto su nido?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 39, 28, NULL, 'Ella habita y mora en la peña, En la cumbre del peñasco y de la roca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 39, 29, NULL, 'Desde allí acecha la presa; Sus ojos observan de muy lejos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 39, 30, NULL, 'Sus polluelos chupan la sangre; Y donde hubiere cadáveres, allí está ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 40, 1, NULL, 'Además respondió Jehová a Job, y dijo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 40, 2, NULL, '¿Es sabiduría contender con el Omnipotente? El que disputa con Dios, responda a esto.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 40, 3, NULL, 'Entonces respondió Job a Jehová, y dijo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 40, 4, NULL, 'He aquí que yo soy vil; ¿qué te responderé? Mi mano pongo sobre mi boca.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 40, 5, NULL, 'Una vez hablé, mas no responderé; Aun dos veces, mas no volveré a hablar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 40, 6, 'Manifestaciones del poder de Dios', 'Respondió Jehová a Job desde el torbellino, y dijo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 40, 7, NULL, 'Cíñete ahora como varón tus lomos; Yo te preguntaré, y tú me responderás.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 40, 8, NULL, '¿Invalidarás tú también mi juicio? ¿Me condenarás a mí, para justificarte tú?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 40, 9, NULL, '¿Tienes tú un brazo como el de Dios? ¿Y truenas con voz como la suya?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 40, 10, NULL, 'Adórnate ahora de majestad y de alteza, Y vístete de honra y de hermosura.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 40, 11, NULL, 'Derrama el ardor de tu ira; Mira a todo altivo, y abátelo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 40, 12, NULL, 'Mira a todo soberbio, y humíllalo, Y quebranta a los impíos en su sitio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 40, 13, NULL, 'Encúbrelos a todos en el polvo, Encierra sus rostros en la oscuridad;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 40, 14, NULL, 'Y yo también te confesaré Que podrá salvarte tu diestra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 40, 15, NULL, 'He aquí ahora behemot, el cual hice como a ti; Hierba come como buey.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 40, 16, NULL, 'He aquí ahora que su fuerza está en sus lomos, Y su vigor en los músculos de su vientre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 40, 17, NULL, 'Su cola mueve como un cedro, Y los nervios de sus muslos están entretejidos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 40, 18, NULL, 'Sus huesos son fuertes como bronce, Y sus miembros como barras de hierro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 40, 19, NULL, 'Él es el principio de los caminos de Dios; El que lo hizo, puede hacer que su espada a él se acerque.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 40, 20, NULL, 'Ciertamente los montes producen hierba para él; Y toda bestia del campo retoza allá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 40, 21, NULL, 'Se echará debajo de las sombras, En lo oculto de las cañas y de los lugares húmedos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 40, 22, NULL, 'Los árboles sombríos lo cubren con su sombra; Los sauces del arroyo lo rodean.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 40, 23, NULL, 'He aquí, sale de madre el río, pero él no se inmuta; Tranquilo está, aunque todo un Jordán se estrelle contra su boca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 40, 24, NULL, '¿Lo tomará alguno cuando está vigilante, Y horadará su nariz?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 41, 1, NULL, '¿Sacarás tú al leviatán con anzuelo, O con cuerda que le eches en su lengua?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 41, 2, NULL, '¿Pondrás tú soga en sus narices, Y horadarás con garfio su quijada?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 41, 3, NULL, '¿Multiplicará él ruegos para contigo? ¿Te hablará él lisonjas?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 41, 4, NULL, '¿Hará pacto contigo Para que lo tomes por siervo perpetuo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 41, 5, NULL, '¿Jugarás con él como con pájaro, O lo atarás para tus niñas?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 41, 6, NULL, '¿Harán de él banquete los compañeros? ¿Lo repartirán entre los mercaderes?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 41, 7, NULL, '¿Cortarás tú con cuchillo su piel, O con arpón de pescadores su cabeza?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 41, 8, NULL, 'Pon tu mano sobre él; Te acordarás de la batalla, y nunca más volverás.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 41, 9, NULL, 'He aquí que la esperanza acerca de él será burlada, Porque aun a su sola vista se desmayarán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 41, 10, NULL, 'Nadie hay tan osado que lo despierte; ¿Quién, pues, podrá estar delante de mí?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 41, 11, NULL, '¿Quién me ha dado a mí primero, para que yo restituya? Todo lo que hay debajo del cielo es mío.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 41, 12, NULL, 'No guardaré silencio sobre sus miembros, Ni sobre sus fuerzas y la gracia de su disposición.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 41, 13, NULL, '¿Quién descubrirá la delantera de su vestidura? ¿Quién se acercará a él con su freno doble?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 41, 14, NULL, '¿Quién abrirá las puertas de su rostro? Las hileras de sus dientes espantan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 41, 15, NULL, 'La gloria de su vestido son escudos fuertes, Cerrados entre sí estrechamente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 41, 16, NULL, 'El uno se junta con el otro, Que viento no entra entre ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 41, 17, NULL, 'Pegado está el uno con el otro; Están trabados entre sí, que no se pueden apartar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 41, 18, NULL, 'Con sus estornudos enciende lumbre, Y sus ojos son como los párpados del alba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 41, 19, NULL, 'De su boca salen hachones de fuego; Centellas de fuego proceden.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 41, 20, NULL, 'De sus narices sale humo, Como de una olla o caldero que hierve.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 41, 21, NULL, 'Su aliento enciende los carbones, Y de su boca sale llama.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 41, 22, NULL, 'En su cerviz está la fuerza, Y delante de él se esparce el desaliento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 41, 23, NULL, 'Las partes más flojas de su carne están endurecidas; Están en él firmes, y no se mueven.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 41, 24, NULL, 'Su corazón es firme como una piedra, Y fuerte como la muela de abajo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 41, 25, NULL, 'De su grandeza tienen temor los fuertes, Y a causa de su desfallecimiento hacen por purificarse.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 41, 26, NULL, 'Cuando alguno lo alcanzare, Ni espada, ni lanza, ni dardo, ni coselete durará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 41, 27, NULL, 'Estima como paja el hierro, Y el bronce como leño podrido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 41, 28, NULL, 'Saeta no le hace huir; Las piedras de honda le son como paja.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 41, 29, NULL, 'Tiene toda arma por hojarasca, Y del blandir de la jabalina se burla.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 41, 30, NULL, 'Por debajo tiene agudas conchas; Imprime su agudez en el suelo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 41, 31, NULL, 'Hace hervir como una olla el mar profundo, Y lo vuelve como una olla de ungüento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 41, 32, NULL, 'En pos de sí hace resplandecer la senda, Que parece que el abismo es cano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 41, 33, NULL, 'No hay sobre la tierra quien se le parezca; Animal hecho exento de temor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 41, 34, NULL, 'Menosprecia toda cosa alta; Es rey sobre todos los soberbios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 42, 1, 'Confesión y justificación de Job', 'Respondió Job a Jehová, y dijo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 42, 2, NULL, 'Yo conozco que todo lo puedes, Y que no hay pensamiento que se esconda de ti.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 42, 3, NULL, '¿Quién es el que oscurece el consejo sin entendimiento? Por tanto, yo hablaba lo que no entendía; Cosas demasiado maravillosas para mí, que yo no comprendía.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 42, 4, NULL, 'Oye, te ruego, y hablaré; Te preguntaré, y tú me enseñarás.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 42, 5, NULL, 'De oídas te había oído; Mas ahora mis ojos te ven.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 42, 6, NULL, 'Por tanto me aborrezco, Y me arrepiento en polvo y ceniza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 42, 7, NULL, 'Y aconteció que después que habló Jehová estas palabras a Job, Jehová dijo a Elifaz temanita: Mi ira se encendió contra ti y tus dos compañeros; porque no habéis hablado de mí lo recto, como mi siervo Job.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 42, 8, NULL, 'Ahora, pues, tomaos siete becerros y siete carneros, e id a mi siervo Job, y ofreced holocausto por vosotros, y mi siervo Job orará por vosotros; porque de cierto a él atenderé para no trataros afrentosamente, por cuanto no habéis hablado de mí con rectitud, como mi siervo Job.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 42, 9, NULL, 'Fueron, pues, Elifaz temanita, Bildad suhita y Zofar naamatita, e hicieron como Jehová les dijo; y Jehová aceptó la oración de Job.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 42, 10, 'Restauración de la prosperidad de Job', 'Y quitó Jehová la aflicción de Job, cuando él hubo orado por sus amigos; y aumentó al doble todas las cosas que habían sido de Job.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 42, 11, NULL, 'Y vinieron a él todos sus hermanos y todas sus hermanas, y todos los que antes le habían conocido, y comieron con él pan en su casa, y se condolieron de él, y le consolaron de todo aquel mal que Jehová había traído sobre él; y cada uno de ellos le dio una pieza de dinero y un anillo de oro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 42, 12, NULL, 'Y bendijo Jehová el postrer estado de Job más que el primero; porque tuvo catorce mil ovejas, seis mil camellos, mil yuntas de bueyes y mil asnas,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 42, 13, NULL, 'y tuvo siete hijos y tres hijas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 42, 14, NULL, 'Llamó el nombre de la primera, Jemima, el de la segunda, Cesia, y el de la tercera, Keren-hapuc.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 42, 15, NULL, 'Y no había mujeres tan hermosas como las hijas de Job en toda la tierra; y les dio su padre herencia entre sus hermanos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 42, 16, NULL, 'Después de esto vivió Job ciento cuarenta años, y vio a sus hijos, y a los hijos de sus hijos, hasta la cuarta generación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Job', 42, 17, NULL, 'Y murió Job viejo y lleno de días.', 0, 'spa', 'RVR1960', NULL);\n"
;

}