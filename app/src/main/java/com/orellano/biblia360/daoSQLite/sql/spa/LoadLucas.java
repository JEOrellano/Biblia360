package com.orellano.biblia360.daoSQLite.sql.spa;

public final class LoadLucas {
  public LoadLucas() {}
  public static final String SQL_PARTE_1 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Lc', 1, 1, 'Dedicatoria a Teófilo', 'Puesto que ya muchos han tratado de poner en orden la historia de las cosas que entre nosotros han sido ciertísimas,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 2, NULL, 'tal como nos lo enseñaron los que desde el principio lo vieron con sus ojos, y fueron ministros de la palabra,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 3, NULL, 'me ha parecido también a mí, después de haber investigado con diligencia todas las cosas desde su origen, escribírtelas por orden, oh excelentísimo Teófilo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 4, NULL, 'para que conozcas bien la verdad de las cosas en las cuales has sido instruido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 5, 'Anuncio del nacimiento de Juan', 'Hubo en los días de Herodes, rey de Judea, un sacerdote llamado Zacarías, de la clase de Abías; su mujer era de las hijas de Aarón, y se llamaba Elisabet.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 6, NULL, 'Ambos eran justos delante de Dios, y andaban irreprensibles en todos los mandamientos y ordenanzas del Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 7, NULL, 'Pero no tenían hijo, porque Elisabet era estéril, y ambos eran ya de edad avanzada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 8, NULL, 'Aconteció que ejerciendo Zacarías el sacerdocio delante de Dios según el orden de su clase,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 9, NULL, 'conforme a la costumbre del sacerdocio, le tocó en suerte ofrecer el incienso, entrando en el santuario del Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 10, NULL, 'Y toda la multitud del pueblo estaba fuera orando a la hora del incienso.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 11, NULL, 'Y se le apareció un ángel del Señor puesto en pie a la derecha del altar del incienso.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 12, NULL, 'Y se turbó Zacarías al verle, y le sobrecogió temor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 13, NULL, 'Pero el ángel le dijo: Zacarías, no temas; porque tu oración ha sido oída, y tu mujer Elisabet te dará a luz un hijo, y llamarás su nombre Juan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 14, NULL, 'Y tendrás gozo y alegría, y muchos se regocijarán de su nacimiento;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 15, NULL, 'porque será grande delante de Dios. No beberá vino ni sidra, y será lleno del Espíritu Santo, aun desde el vientre de su madre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 16, NULL, 'Y hará que muchos de los hijos de Israel se conviertan al Señor Dios de ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 17, NULL, 'E irá delante de él con el espíritu y el poder de Elías, para hacer volver los corazones de los padres a los hijos, y de los rebeldes a la prudencia de los justos, para preparar al Señor un pueblo bien dispuesto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 18, NULL, 'Dijo Zacarías al ángel: ¿En qué conoceré esto? Porque yo soy viejo, y mi mujer es de edad avanzada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 19, NULL, 'Respondiendo el ángel, le dijo: Yo soy Gabriel, que estoy delante de Dios; y he sido enviado a hablarte, y darte estas buenas nuevas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 20, NULL, 'Y ahora quedarás mudo y no podrás hablar, hasta el día en que esto se haga, por cuanto no creíste mis palabras, las cuales se cumplirán a su tiempo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 21, NULL, 'Y el pueblo estaba esperando a Zacarías, y se extrañaba de que él se demorase en el santuario.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 22, NULL, 'Pero cuando salió, no les podía hablar; y comprendieron que había visto visión en el santuario. Él les hablaba por señas, y permaneció mudo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 23, NULL, 'Y cumplidos los días de su ministerio, se fue a su casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 24, NULL, 'Después de aquellos días concibió su mujer Elisabet, y se recluyó en casa por cinco meses, diciendo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 25, NULL, 'Así ha hecho conmigo el Señor en los días en que se dignó quitar mi afrenta entre los hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 26, 'Anuncio del nacimiento de Jesús', 'Al sexto mes el ángel Gabriel fue enviado por Dios a una ciudad de Galilea, llamada Nazaret,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 27, NULL, 'a una virgen desposada con un varón que se llamaba José, de la casa de David; y el nombre de la virgen era María.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 28, NULL, 'Y entrando el ángel en donde ella estaba, dijo: ¡Salve, muy favorecida! El Señor es contigo; bendita tú entre las mujeres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 29, NULL, 'Mas ella, cuando le vio, se turbó por sus palabras, y pensaba qué salutación sería esta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 30, NULL, 'Entonces el ángel le dijo: María, no temas, porque has hallado gracia delante de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 31, NULL, 'Y ahora, concebirás en tu vientre, y darás a luz un hijo, y llamarás su nombre JESÚS.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 32, NULL, 'Este será grande, y será llamado Hijo del Altísimo; y el Señor Dios le dará el trono de David su padre;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 33, NULL, 'y reinará sobre la casa de Jacob para siempre, y su reino no tendrá fin.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 34, NULL, 'Entonces María dijo al ángel: ¿Cómo será esto? pues no conozco varón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 35, NULL, 'Respondiendo el ángel, le dijo: El Espíritu Santo vendrá sobre ti, y el poder del Altísimo te cubrirá con su sombra; por lo cual también el Santo Ser que nacerá, será llamado Hijo de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 36, NULL, 'Y he aquí tu parienta Elisabet, ella también ha concebido hijo en su vejez; y este es el sexto mes para ella, la que llamaban estéril;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 37, NULL, 'porque nada hay imposible para Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 38, NULL, 'Entonces María dijo: He aquí la sierva del Señor; hágase conmigo conforme a tu palabra. Y el ángel se fue de su presencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 39, 'María visita a Elisabet', 'En aquellos días, levantándose María, fue de prisa a la montaña, a una ciudad de Judá;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 40, NULL, 'y entró en casa de Zacarías, y saludó a Elisabet.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 41, NULL, 'Y aconteció que cuando oyó Elisabet la salutación de María, la criatura saltó en su vientre; y Elisabet fue llena del Espíritu Santo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 42, NULL, 'y exclamó a gran voz, y dijo: Bendita tú entre las mujeres, y bendito el fruto de tu vientre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 43, NULL, '¿Por qué se me concede esto a mí, que la madre de mi Señor venga a mí?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 44, NULL, 'Porque tan pronto como llegó la voz de tu salutación a mis oídos, la criatura saltó de alegría en mi vientre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 45, NULL, 'Y bienaventurada la que creyó, porque se cumplirá lo que le fue dicho de parte del Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 46, NULL, 'Entonces María dijo: Engrandece mi alma al Señor;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 47, NULL, 'Y mi espíritu se regocija en Dios mi Salvador.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 48, NULL, 'Porque ha mirado la bajeza de su sierva; Pues he aquí, desde ahora me dirán bienaventurada todas las generaciones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 49, NULL, 'Porque me ha hecho grandes cosas el Poderoso; Santo es su nombre,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 50, NULL, 'Y su misericordia es de generación en generación A los que le temen.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 51, NULL, 'Hizo proezas con su brazo; Esparció a los soberbios en el pensamiento de sus corazones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 52, NULL, 'Quitó de los tronos a los poderosos, Y exaltó a los humildes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 53, NULL, 'A los hambrientos colmó de bienes, Y a los ricos envió vacíos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 54, NULL, 'Socorrió a Israel su siervo, Acordándose de la misericordia', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 55, NULL, 'De la cual habló a nuestros padres, Para con Abraham y su descendencia para siempre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 56, NULL, 'Y se quedó María con ella como tres meses; después se volvió a su casa.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 57, 'Nacimiento de Juan el Bautista', 'Cuando a Elisabet se le cumplió el tiempo de su alumbramiento, dio a luz un hijo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 58, NULL, 'Y cuando oyeron los vecinos y los parientes que Dios había engrandecido para con ella su misericordia, se regocijaron con ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 59, NULL, 'Aconteció que al octavo día vinieron para circuncidar al niño; y le llamaban con el nombre de su padre, Zacarías;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 60, NULL, 'pero respondiendo su madre, dijo: No; se llamará Juan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 61, NULL, 'Le dijeron: ¿Por qué? No hay nadie en tu parentela que se llame con ese nombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 62, NULL, 'Entonces preguntaron por señas a su padre, cómo le quería llamar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 63, NULL, 'Y pidiendo una tablilla, escribió, diciendo: Juan es su nombre. Y todos se maravillaron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 64, NULL, 'Al momento fue abierta su boca y suelta su lengua, y habló bendiciendo a Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 65, NULL, 'Y se llenaron de temor todos sus vecinos; y en todas las montañas de Judea se divulgaron todas estas cosas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 66, NULL, 'Y todos los que las oían las guardaban en su corazón, diciendo: ¿Quién, pues, será este niño? Y la mano del Señor estaba con él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 67, 'Profecía de Zacarías', 'Y Zacarías su padre fue lleno del Espíritu Santo, y profetizó, diciendo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 68, NULL, 'Bendito el Señor Dios de Israel, Que ha visitado y redimido a su pueblo,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 69, NULL, 'Y nos levantó un poderoso Salvador En la casa de David su siervo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 70, NULL, 'Como habló por boca de sus santos profetas que fueron desde el principio;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 71, NULL, 'Salvación de nuestros enemigos, y de la mano de todos los que nos aborrecieron;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 72, NULL, 'Para hacer misericordia con nuestros padres, Y acordarse de su santo pacto;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 73, NULL, 'Del juramento que hizo a Abraham nuestro padre, Que nos había de conceder', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 74, NULL, 'Que, librados de nuestros enemigos, Sin temor le serviríamos', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 75, NULL, 'En santidad y en justicia delante de él, todos nuestros días.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 76, NULL, 'Y tú, niño, profeta del Altísimo serás llamado; Porque irás delante de la presencia del Señor, para preparar sus caminos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 77, NULL, 'Para dar conocimiento de salvación a su pueblo, Para perdón de sus pecados,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 78, NULL, 'Por la entrañable misericordia de nuestro Dios, Con que nos visitó desde lo alto la aurora,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 79, NULL, 'Para dar luz a los que habitan en tinieblas y en sombra de muerte; Para encaminar nuestros pies por camino de paz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 1, 80, NULL, 'Y el niño crecía, y se fortalecía en espíritu; y estuvo en lugares desiertos hasta el día de su manifestación a Israel.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 1, 'Nacimiento de Jesús', 'Aconteció en aquellos días, que se promulgó un edicto de parte de Augusto César, que todo el mundo fuese empadronado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 2, NULL, 'Este primer censo se hizo siendo Cirenio gobernador de Siria.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 3, NULL, 'E iban todos para ser empadronados, cada uno a su ciudad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 4, NULL, 'Y José subió de Galilea, de la ciudad de Nazaret, a Judea, a la ciudad de David, que se llama Belén, por cuanto era de la casa y familia de David;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 5, NULL, 'para ser empadronado con María su mujer, desposada con él, la cual estaba encinta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 6, NULL, 'Y aconteció que estando ellos allí, se cumplieron los días de su alumbramiento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 7, NULL, 'Y dio a luz a su hijo primogénito, y lo envolvió en pañales, y lo acostó en un pesebre, porque no había lugar para ellos en el mesón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 8, 'Los ángeles y los pastores', 'Había pastores en la misma región, que velaban y guardaban las vigilias de la noche sobre su rebaño.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 9, NULL, 'Y he aquí, se les presentó un ángel del Señor, y la gloria del Señor los rodeó de resplandor; y tuvieron gran temor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 10, NULL, 'Pero el ángel les dijo: No temáis; porque he aquí os doy nuevas de gran gozo, que será para todo el pueblo:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 11, NULL, 'que os ha nacido hoy, en la ciudad de David, un Salvador, que es CRISTO el Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 12, NULL, 'Esto os servirá de señal: Hallaréis al niño envuelto en pañales, acostado en un pesebre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 13, NULL, 'Y repentinamente apareció con el ángel una multitud de las huestes celestiales, que alababan a Dios, y decían:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 14, NULL, '¡Gloria a Dios en las alturas, Y en la tierra paz, buena voluntad para con los hombres!', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 15, NULL, 'Sucedió que cuando los ángeles se fueron de ellos al cielo, los pastores se dijeron unos a otros: Pasemos, pues, hasta Belén, y veamos esto que ha sucedido, y que el Señor nos ha manifestado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 16, NULL, 'Vinieron, pues, apresuradamente, y hallaron a María y a José, y al niño acostado en el pesebre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 17, NULL, 'Y al verlo, dieron a conocer lo que se les había dicho acerca del niño.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 18, NULL, 'Y todos los que oyeron, se maravillaron de lo que los pastores les decían.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 19, NULL, 'Pero María guardaba todas estas cosas, meditándolas en su corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 20, NULL, 'Y volvieron los pastores glorificando y alabando a Dios por todas las cosas que habían oído y visto, como se les había dicho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 21, 'Presentación de Jesús en el templo', 'Cumplidos los ocho días para circuncidar al niño, le pusieron por nombre JESÚS, el cual le había sido puesto por el ángel antes que fuese concebido.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 22, NULL, 'Y cuando se cumplieron los días de la purificación de ellos, conforme a la ley de Moisés, le trajeron a Jerusalén para presentarle al Señor', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 23, NULL, '(como está escrito en la ley del Señor: Todo varón que abriere la matriz será llamado santo al Señor),', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 24, NULL, 'y para ofrecer conforme a lo que se dice en la ley del Señor: Un par de tórtolas, o dos palominos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 25, NULL, 'Y he aquí había en Jerusalén un hombre llamado Simeón, y este hombre, justo y piadoso, esperaba la consolación de Israel; y el Espíritu Santo estaba sobre él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 26, NULL, 'Y le había sido revelado por el Espíritu Santo, que no vería la muerte antes que viese al Ungido del Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 27, NULL, 'Y movido por el Espíritu, vino al templo. Y cuando los padres del niño Jesús lo trajeron al templo, para hacer por él conforme al rito de la ley,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 28, NULL, 'él le tomó en sus brazos, y bendijo a Dios, diciendo:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 29, NULL, 'Ahora, Señor, despides a tu siervo en paz, Conforme a tu palabra;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 30, NULL, 'Porque han visto mis ojos tu salvación,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 31, NULL, 'La cual has preparado en presencia de todos los pueblos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 32, NULL, 'Luz para revelación a los gentiles, Y gloria de tu pueblo Israel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 33, NULL, 'Y José y su madre estaban maravillados de todo lo que se decía de él.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 34, NULL, 'Y los bendijo Simeón, y dijo a su madre María: He aquí, este está puesto para caída y para levantamiento de muchos en Israel, y para señal que será contradicha', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 35, NULL, '(y una espada traspasará tu misma alma), para que sean revelados los pensamientos de muchos corazones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 36, NULL, 'Estaba también allí Ana, profetisa, hija de Fanuel, de la tribu de Aser, de edad muy avanzada, pues había vivido con su marido siete años desde su virginidad,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 37, NULL, 'y era viuda hacía ochenta y cuatro años; y no se apartaba del templo, sirviendo de noche y de día con ayunos y oraciones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 38, NULL, 'Esta, presentándose en la misma hora, daba gracias a Dios, y hablaba del niño a todos los que esperaban la redención en Jerusalén.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 39, 'El regreso a Nazaret', 'Después de haber cumplido con todo lo prescrito en la ley del Señor, volvieron a Galilea, a su ciudad de Nazaret.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 40, NULL, 'Y el niño crecía y se fortalecía, y se llenaba de sabiduría; y la gracia de Dios era sobre él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 41, 'El niño Jesús en el templo', 'Iban sus padres todos los años a Jerusalén en la fiesta de la pascua;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 42, NULL, 'y cuando tuvo doce años, subieron a Jerusalén conforme a la costumbre de la fiesta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 43, NULL, 'Al regresar ellos, acabada la fiesta, se quedó el niño Jesús en Jerusalén, sin que lo supiesen José y su madre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 44, NULL, 'Y pensando que estaba entre la compañía, anduvieron camino de un día; y le buscaban entre los parientes y los conocidos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 45, NULL, 'pero como no le hallaron, volvieron a Jerusalén buscándole.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 46, NULL, 'Y aconteció que tres días después le hallaron en el templo, sentado en medio de los doctores de la ley, oyéndoles y preguntándoles.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 47, NULL, 'Y todos los que le oían, se maravillaban de su inteligencia y de sus respuestas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 48, NULL, 'Cuando le vieron, se sorprendieron; y le dijo su madre: Hijo, ¿por qué nos has hecho así? He aquí, tu padre y yo te hemos buscado con angustia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 49, NULL, 'Entonces él les dijo: ¿Por qué me buscabais? ¿No sabíais que en los negocios de mi Padre me es necesario estar?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 50, NULL, 'Mas ellos no entendieron las palabras que les habló.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 51, NULL, 'Y descendió con ellos, y volvió a Nazaret, y estaba sujeto a ellos. Y su madre guardaba todas estas cosas en su corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 2, 52, NULL, 'Y Jesús crecía en sabiduría y en estatura, y en gracia para con Dios y los hombres.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 3, 1, 'Predicación de Juan el Bautista', 'En el año decimoquinto del imperio de Tiberio César, siendo gobernador de Judea Poncio Pilato, y Herodes tetrarca de Galilea, y su hermano Felipe tetrarca de Iturea y de la provincia de Traconite, y Lisanias tetrarca de Abilinia,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 3, 2, NULL, 'y siendo sumos sacerdotes Anás y Caifás, vino palabra de Dios a Juan, hijo de Zacarías, en el desierto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 3, 3, NULL, 'Y él fue por toda la región contigua al Jordán, predicando el bautismo del arrepentimiento para perdón de pecados,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 3, 4, NULL, 'como está escrito en el libro de las palabras del profeta Isaías, que dice: Voz del que clama en el desierto: Preparad el camino del Señor; Enderezad sus sendas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 3, 5, NULL, 'Todo valle se rellenará, Y se bajará todo monte y collado; Los caminos torcidos serán enderezados, Y los caminos ásperos allanados;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 3, 6, NULL, 'Y verá toda carne la salvación de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 3, 7, NULL, 'Y decía a las multitudes que salían para ser bautizadas por él: ¡Oh generación de víboras! ¿Quién os enseñó a huir de la ira venidera?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 3, 8, NULL, 'Haced, pues, frutos dignos de arrepentimiento, y no comencéis a decir dentro de vosotros mismos: Tenemos a Abraham por padre; porque os digo que Dios puede levantar hijos a Abraham aun de estas piedras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 3, 9, NULL, 'Y ya también el hacha está puesta a la raíz de los árboles; por tanto, todo árbol que no da buen fruto se corta y se echa en el fuego.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 3, 10, NULL, 'Y la gente le preguntaba, diciendo: Entonces, ¿qué haremos?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 3, 11, NULL, 'Y respondiendo, les dijo: El que tiene dos túnicas, dé al que no tiene; y el que tiene qué comer, haga lo mismo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 3, 12, NULL, 'Vinieron también unos publicanos para ser bautizados, y le dijeron: Maestro, ¿qué haremos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 3, 13, NULL, 'Él les dijo: No exijáis más de lo que os está ordenado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 3, 14, NULL, 'También le preguntaron unos soldados, diciendo: Y nosotros, ¿qué haremos? Y les dijo: No hagáis extorsión a nadie, ni calumniéis; y contentaos con vuestro salario.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 3, 15, NULL, 'Como el pueblo estaba en expectativa, preguntándose todos en sus corazones si acaso Juan sería el Cristo,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 3, 16, NULL, 'respondió Juan, diciendo a todos: Yo a la verdad os bautizo en agua; pero viene uno más poderoso que yo, de quien no soy digno de desatar la correa de su calzado; él os bautizará en Espíritu Santo y fuego.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 3, 17, NULL, 'Su aventador está en su mano, y limpiará su era, y recogerá el trigo en su granero, y quemará la paja en fuego que nunca se apagará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 3, 18, NULL, 'Con estas y otras muchas exhortaciones anunciaba las buenas nuevas al pueblo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 3, 19, NULL, 'Entonces Herodes el tetrarca, siendo reprendido por Juan a causa de Herodías, mujer de Felipe su hermano, y de todas las maldades que Herodes había hecho,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 3, 20, NULL, 'sobre todas ellas, añadió además esta: encerró a Juan en la cárcel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 3, 21, 'El bautismo de Jesús', 'Aconteció que cuando todo el pueblo se bautizaba, también Jesús fue bautizado; y orando, el cielo se abrió,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 3, 22, NULL, 'y descendió el Espíritu Santo sobre él en forma corporal, como paloma, y vino una voz del cielo que decía: Tú eres mi Hijo amado; en ti tengo complacencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 3, 23, 'Genealogía de Jesús', 'Jesús mismo al comenzar su ministerio era como de treinta años, hijo, según se creía, de José, hijo de Elí,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 3, 24, NULL, 'hijo de Matat, hijo de Leví, hijo de Melqui, hijo de Jana, hijo de José,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 3, 25, NULL, 'hijo de Matatías, hijo de Amós, hijo de Nahum, hijo de Esli, hijo de Nagai,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 3, 26, NULL, 'hijo de Maat, hijo de Matatías, hijo de Semei, hijo de José, hijo de Judá,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 3, 27, NULL, 'hijo de Joana, hijo de Resa, hijo de Zorobabel, hijo de Salatiel, hijo de Neri,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 3, 28, NULL, 'hijo de Melqui, hijo de Adi, hijo de Cosam, hijo de Elmodam, hijo de Er,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 3, 29, NULL, 'hijo de Josué, hijo de Eliezer, hijo de Jorim, hijo de Matat,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 3, 30, NULL, 'hijo de Leví, hijo de Simeón, hijo de Judá, hijo de José, hijo de Jonán, hijo de Eliaquim,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 3, 31, NULL, 'hijo de Melea, hijo de Mainán, hijo de Matata, hijo de Natán,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 3, 32, NULL, 'hijo de David, hijo de Isaí, hijo de Obed, hijo de Booz, hijo de Salmón, hijo de Naasón,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 3, 33, NULL, 'hijo de Aminadab, hijo de Aram, hijo de Esrom, hijo de Fares, hijo de Judá,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 3, 34, NULL, 'hijo de Jacob, hijo de Isaac, hijo de Abraham, hijo de Taré, hijo de Nacor,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 3, 35, NULL, 'hijo de Serug, hijo de Ragau, hijo de Peleg, hijo de Heber, hijo de Sala,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 3, 36, NULL, 'hijo de Cainán, hijo de Arfaxad, hijo de Sem, hijo de Noé, hijo de Lamec,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 3, 37, NULL, 'hijo de Matusalén, hijo de Enoc, hijo de Jared, hijo de Mahalaleel, hijo de Cainán,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 3, 38, NULL, 'hijo de Enós, hijo de Set, hijo de Adán, hijo de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 1, 'Tentación de Jesús', 'Jesús, lleno del Espíritu Santo, volvió del Jordán, y fue llevado por el Espíritu al desierto', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 2, NULL, 'por cuarenta días, y era tentado por el diablo. Y no comió nada en aquellos días, pasados los cuales, tuvo hambre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 3, NULL, 'Entonces el diablo le dijo: Si eres Hijo de Dios, di a esta piedra que se convierta en pan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 4, NULL, 'Jesús, respondiéndole, dijo: Escrito está: No solo de pan vivirá el hombre, sino de toda palabra de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 5, NULL, 'Y le llevó el diablo a un alto monte, y le mostró en un momento todos los reinos de la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 6, NULL, 'Y le dijo el diablo: A ti te daré toda esta potestad, y la gloria de ellos; porque a mí me ha sido entregada, y a quien quiero la doy.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 7, NULL, 'Si tú postrado me adorares, todos serán tuyos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 8, NULL, 'Respondiendo Jesús, le dijo: Vete de mí, Satanás, porque escrito está: Al Señor tu Dios adorarás, y a él sólo servirás.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 9, NULL, 'Y le llevó a Jerusalén, y le puso sobre el pináculo del templo, y le dijo: Si eres Hijo de Dios, échate de aquí abajo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 10, NULL, 'porque escrito está: A sus ángeles mandará acerca de ti, que te guarden;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 11, NULL, 'y, En las manos te sostendrán, Para que no tropieces con tu pie en piedra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 12, NULL, 'Respondiendo Jesús, le dijo: Dicho está: No tentarás al Señor tu Dios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 13, NULL, 'Y cuando el diablo hubo acabado toda tentación, se apartó de él por un tiempo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 14, 'Jesús principia su ministerio', 'Y Jesús volvió en el poder del Espíritu a Galilea, y se difundió su fama por toda la tierra de alrededor.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 15, NULL, 'Y enseñaba en las sinagogas de ellos, y era glorificado por todos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 16, 'Jesús en Nazaret', 'Vino a Nazaret, donde se había criado; y en el día de reposo entró en la sinagoga, conforme a su costumbre, y se levantó a leer.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 17, NULL, 'Y se le dio el libro del profeta Isaías; y habiendo abierto el libro, halló el lugar donde estaba escrito:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 18, NULL, 'El Espíritu del Señor está sobre mí, Por cuanto me ha ungido para dar buenas nuevas a los pobres; Me ha enviado a sanar a los quebrantados de corazón; A pregonar libertad a los cautivos, Y vista a los ciegos; A poner en libertad a los oprimidos;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 19, NULL, 'A predicar el año agradable del Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 20, NULL, 'Y enrollando el libro, lo dio al ministro, y se sentó; y los ojos de todos en la sinagoga estaban fijos en él.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 21, NULL, 'Y comenzó a decirles: Hoy se ha cumplido esta Escritura delante de vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 22, NULL, 'Y todos daban buen testimonio de él, y estaban maravillados de las palabras de gracia que salían de su boca, y decían: ¿No es este el hijo de José?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 23, NULL, 'Él les dijo: Sin duda me diréis este refrán: Médico, cúrate a ti mismo; de tantas cosas que hemos oído que se han hecho en Capernaum, haz también aquí en tu tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 24, NULL, 'Y añadió: De cierto os digo, que ningún profeta es acepto en su propia tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 25, NULL, 'Y en verdad os digo que muchas viudas había en Israel en los días de Elías, cuando el cielo fue cerrado por tres años y seis meses, y hubo una gran hambre en toda la tierra;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 26, NULL, 'pero a ninguna de ellas fue enviado Elías, sino a una mujer viuda en Sarepta de Sidón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 27, NULL, 'Y muchos leprosos había en Israel en tiempo del profeta Eliseo; pero ninguno de ellos fue limpiado, sino Naamán el sirio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 28, NULL, 'Al oír estas cosas, todos en la sinagoga se llenaron de ira;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 29, NULL, 'y levantándose, le echaron fuera de la ciudad, y le llevaron hasta la cumbre del monte sobre el cual estaba edificada la ciudad de ellos, para despeñarle.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 30, NULL, 'Mas él pasó por en medio de ellos, y se fue.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 31, 'Un hombre que tenía un espíritu inmundo', 'Descendió Jesús a Capernaum, ciudad de Galilea; y les enseñaba en los días de reposo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 32, NULL, 'Y se admiraban de su doctrina, porque su palabra era con autoridad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 33, NULL, 'Estaba en la sinagoga un hombre que tenía un espíritu de demonio inmundo, el cual exclamó a gran voz,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 34, NULL, 'diciendo: Déjanos; ¿qué tienes con nosotros, Jesús nazareno? ¿Has venido para destruirnos? Yo te conozco quién eres, el Santo de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 35, NULL, 'Y Jesús le reprendió, diciendo: Cállate, y sal de él. Entonces el demonio, derribándole en medio de ellos, salió de él, y no le hizo daño alguno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 36, NULL, 'Y estaban todos maravillados, y hablaban unos a otros, diciendo: ¿Qué palabra es esta, que con autoridad y poder manda a los espíritus inmundos, y salen?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 37, NULL, 'Y su fama se difundía por todos los lugares de los contornos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 38, 'Jesús sana a la suegra de Pedro', 'Entonces Jesús se levantó y salió de la sinagoga, y entró en casa de Simón. La suegra de Simón tenía una gran fiebre; y le rogaron por ella.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 39, NULL, 'E inclinándose hacia ella, reprendió a la fiebre; y la fiebre la dejó, y levantándose ella al instante, les servía.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 40, 'Muchos sanados al ponerse el sol', 'Al ponerse el sol, todos los que tenían enfermos de diversas enfermedades los traían a él; y él, poniendo las manos sobre cada uno de ellos, los sanaba.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 41, NULL, 'También salían demonios de muchos, dando voces y diciendo: Tú eres el Hijo de Dios. Pero él los reprendía y no les dejaba hablar, porque sabían que él era el Cristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 42, 'Jesús recorre Galilea predicando', 'Cuando ya era de día, salió y se fue a un lugar desierto; y la gente le buscaba, y llegando a donde estaba, le detenían para que no se fuera de ellos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 43, NULL, 'Pero él les dijo: Es necesario que también a otras ciudades anuncie el evangelio del reino de Dios; porque para esto he sido enviado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 4, 44, NULL, 'Y predicaba en las sinagogas de Galilea.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 5, 1, 'La pesca milagrosa', 'Aconteció que estando Jesús junto al lago de Genesaret, el gentío se agolpaba sobre él para oír la palabra de Dios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 5, 2, NULL, 'Y vio dos barcas que estaban cerca de la orilla del lago; y los pescadores, habiendo descendido de ellas, lavaban sus redes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 5, 3, NULL, 'Y entrando en una de aquellas barcas, la cual era de Simón, le rogó que la apartase de tierra un poco; y sentándose, enseñaba desde la barca a la multitud.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 5, 4, NULL, 'Cuando terminó de hablar, dijo a Simón: Boga mar adentro, y echad vuestras redes para pescar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 5, 5, NULL, 'Respondiendo Simón, le dijo: Maestro, toda la noche hemos estado trabajando, y nada hemos pescado; mas en tu palabra echaré la red.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 5, 6, NULL, 'Y habiéndolo hecho, encerraron gran cantidad de peces, y su red se rompía.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 5, 7, NULL, 'Entonces hicieron señas a los compañeros que estaban en la otra barca, para que viniesen a ayudarles; y vinieron, y llenaron ambas barcas, de tal manera que se hundían.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 5, 8, NULL, 'Viendo esto Simón Pedro, cayó de rodillas ante Jesús, diciendo: Apártate de mí, Señor, porque soy hombre pecador.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 5, 9, NULL, 'Porque por la pesca que habían hecho, el temor se había apoderado de él, y de todos los que estaban con él,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 5, 10, NULL, 'y asimismo de Jacobo y Juan, hijos de Zebedeo, que eran compañeros de Simón. Pero Jesús dijo a Simón: No temas; desde ahora serás pescador de hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 5, 11, NULL, 'Y cuando trajeron a tierra las barcas, dejándolo todo, le siguieron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 5, 12, 'Jesús sana a un leproso', 'Sucedió que estando él en una de las ciudades, se presentó un hombre lleno de lepra, el cual, viendo a Jesús, se postró con el rostro en tierra y le rogó, diciendo: Señor, si quieres, puedes limpiarme.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 5, 13, NULL, 'Entonces, extendiendo él la mano, le tocó, diciendo: Quiero; sé limpio. Y al instante la lepra se fue de él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 5, 14, NULL, 'Y él le mandó que no lo dijese a nadie; sino ve, le dijo, muéstrate al sacerdote, y ofrece por tu purificación, según mandó Moisés, para testimonio a ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 5, 15, NULL, 'Pero su fama se extendía más y más; y se reunía mucha gente para oírle, y para que les sanase de sus enfermedades.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 5, 16, NULL, 'Mas él se apartaba a lugares desiertos, y oraba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 5, 17, 'Jesús sana a un paralítico', 'Aconteció un día, que él estaba enseñando, y estaban sentados los fariseos y doctores de la ley, los cuales habían venido de todas las aldeas de Galilea, de Judea y Jerusalén; y el poder del Señor estaba con él para sanar.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 5, 18, NULL, 'Y sucedió que unos hombres que traían en un lecho a un hombre que estaba paralítico, procuraban llevarle adentro y ponerle delante de él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 5, 19, NULL, 'Pero no hallando cómo hacerlo a causa de la multitud, subieron encima de la casa, y por el tejado le bajaron con el lecho, poniéndole en medio, delante de Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 5, 20, NULL, 'Al ver él la fe de ellos, le dijo: Hombre, tus pecados te son perdonados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 5, 21, NULL, 'Entonces los escribas y los fariseos comenzaron a cavilar, diciendo: ¿Quién es este que habla blasfemias? ¿Quién puede perdonar pecados sino solo Dios?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 5, 22, NULL, 'Jesús entonces, conociendo los pensamientos de ellos, respondiendo les dijo: ¿Qué caviláis en vuestros corazones?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 5, 23, NULL, '¿Qué es más fácil, decir: Tus pecados te son perdonados, o decir: Levántate y anda?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 5, 24, NULL, 'Pues para que sepáis que el Hijo del Hombre tiene potestad en la tierra para perdonar pecados (dijo al paralítico): A ti te digo: Levántate, toma tu lecho, y vete a tu casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 5, 25, NULL, 'Al instante, levantándose en presencia de ellos, y tomando el lecho en que estaba acostado, se fue a su casa, glorificando a Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 5, 26, NULL, 'Y todos, sobrecogidos de asombro, glorificaban a Dios; y llenos de temor, decían: Hoy hemos visto maravillas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 5, 27, 'Llamamiento de Leví', 'Después de estas cosas salió, y vio a un publicano llamado Leví, sentado al banco de los tributos públicos, y le dijo: Sígueme.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 5, 28, NULL, 'Y dejándolo todo, se levantó y le siguió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 5, 29, NULL, 'Y Leví le hizo gran banquete en su casa; y había mucha compañía de publicanos y de otros que estaban a la mesa con ellos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 5, 30, NULL, 'Y los escribas y los fariseos murmuraban contra los discípulos, diciendo: ¿Por qué coméis y bebéis con publicanos y pecadores?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 5, 31, NULL, 'Respondiendo Jesús, les dijo: Los que están sanos no tienen necesidad de médico, sino los enfermos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 5, 32, NULL, 'No he venido a llamar a justos, sino a pecadores al arrepentimiento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 5, 33, 'La pregunta sobre el ayuno', 'Entonces ellos le dijeron: ¿Por qué los discípulos de Juan ayunan muchas veces y hacen oraciones, y asimismo los de los fariseos, pero los tuyos comen y beben?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 5, 34, NULL, 'Él les dijo: ¿Podéis acaso hacer que los que están de bodas ayunen, entre tanto que el esposo está con ellos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 5, 35, NULL, 'Mas vendrán días cuando el esposo les será quitado; entonces, en aquellos días ayunarán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 5, 36, NULL, 'Les dijo también una parábola: Nadie corta un pedazo de un vestido nuevo y lo pone en un vestido viejo; pues si lo hace, no solamente rompe el nuevo, sino que el remiendo sacado de él no armoniza con el viejo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 5, 37, NULL, 'Y nadie echa vino nuevo en odres viejos; de otra manera, el vino nuevo romperá los odres y se derramará, y los odres se perderán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 5, 38, NULL, 'Mas el vino nuevo en odres nuevos se ha de echar; y lo uno y lo otro se conservan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 5, 39, NULL, 'Y ninguno que beba del añejo, quiere luego el nuevo; porque dice: El añejo es mejor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 1, 'Los discípulos recogen espigas en el día de reposo', 'Aconteció en un día de reposo, que pasando Jesús por los sembrados, sus discípulos arrancaban espigas y comían, restregándolas con las manos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 2, NULL, 'Y algunos de los fariseos les dijeron: ¿Por qué hacéis lo que no es lícito hacer en los días de reposo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 3, NULL, 'Respondiendo Jesús, les dijo: ¿Ni aun esto habéis leído, lo que hizo David cuando tuvo hambre él, y los que con él estaban;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 4, NULL, 'cómo entró en la casa de Dios, y tomó los panes de la proposición, de los cuales no es lícito comer sino solo a los sacerdotes, y comió, y dio también a los que estaban con él?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 5, NULL, 'Y les decía: El Hijo del Hombre es Señor aun del día de reposo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 6, 'El hombre de la mano seca', 'Aconteció también en otro día de reposo, que él entró en la sinagoga y enseñaba; y estaba allí un hombre que tenía seca la mano derecha.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 7, NULL, 'Y le acechaban los escribas y los fariseos, para ver si en el día de reposo lo sanaría, a fin de hallar de qué acusarle.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 8, NULL, 'Mas él conocía los pensamientos de ellos; y dijo al hombre que tenía la mano seca: Levántate, y ponte en medio. Y él, levantándose, se puso en pie.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 9, NULL, 'Entonces Jesús les dijo: Os preguntaré una cosa: ¿Es lícito en día de reposo hacer bien, o hacer mal?, ¿salvar la vida, o quitarla?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 10, NULL, 'Y mirándolos a todos alrededor, dijo al hombre: Extiende tu mano. Y él lo hizo así, y su mano fue restaurada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 11, NULL, 'Y ellos se llenaron de furor, y hablaban entre sí qué podrían hacer contra Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 12, 'Elección de los doce apóstoles', 'En aquellos días él fue al monte a orar, y pasó la noche orando a Dios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 13, NULL, 'Y cuando era de día, llamó a sus discípulos, y escogió a doce de ellos, a los cuales también llamó apóstoles:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 14, NULL, 'a Simón, a quien también llamó Pedro, a Andrés su hermano, Jacobo y Juan, Felipe y Bartolomé,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 15, NULL, 'Mateo, Tomás, Jacobo hijo de Alfeo, Simón llamado Zelote,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 16, NULL, 'Judas hermano de Jacobo, y Judas Iscariote, que llegó a ser el traidor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 17, 'Jesús atiende a una multitud', 'Y descendió con ellos, y se detuvo en un lugar llano, en compañía de sus discípulos y de una gran multitud de gente de toda Judea, de Jerusalén y de la costa de Tiro y de Sidón, que había venido para oírle, y para ser sanados de sus enfermedades;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 18, NULL, 'y los que habían sido atormentados de espíritus inmundos eran sanados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 19, NULL, 'Y toda la gente procuraba tocarle, porque poder salía de él y sanaba a todos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 20, 'Bienaventuranzas y ayes', 'Y alzando los ojos hacia sus discípulos, decía: Bienaventurados vosotros los pobres, porque vuestro es el reino de Dios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 21, NULL, 'Bienaventurados los que ahora tenéis hambre, porque seréis saciados. Bienaventurados los que ahora lloráis, porque reiréis.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 22, NULL, 'Bienaventurados seréis cuando los hombres os aborrezcan, y cuando os aparten de sí, y os vituperen, y desechen vuestro nombre como malo, por causa del Hijo del Hombre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 23, NULL, 'Gozaos en aquel día, y alegraos, porque he aquí vuestro galardón es grande en los cielos; porque así hacían sus padres con los profetas.', 0, 'spa', 'RVR1960', NULL);\n"
;

  public static final String SQL_PARTE_2 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Lc', 6, 24, NULL, 'Mas ¡ay de vosotros, ricos! porque ya tenéis vuestro consuelo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 25, NULL, '¡Ay de vosotros, los que ahora estáis saciados! porque tendréis hambre. ¡Ay de vosotros, los que ahora reís! porque lamentaréis y lloraréis.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 26, NULL, '¡Ay de vosotros, cuando todos los hombres hablen bien de vosotros! porque así hacían sus padres con los falsos profetas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 27, 'El amor hacia los enemigos, y la regla de oro', 'Pero a vosotros los que oís, os digo: Amad a vuestros enemigos, haced bien a los que os aborrecen;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 28, NULL, 'bendecid a los que os maldicen, y orad por los que os calumnian.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 29, NULL, 'Al que te hiera en una mejilla, preséntale también la otra; y al que te quite la capa, ni aun la túnica le niegues.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 30, NULL, 'A cualquiera que te pida, dale; y al que tome lo que es tuyo, no pidas que te lo devuelva.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 31, NULL, 'Y como queréis que hagan los hombres con vosotros, así también haced vosotros con ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 32, NULL, 'Porque si amáis a los que os aman, ¿qué mérito tenéis? Porque también los pecadores aman a los que los aman.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 33, NULL, 'Y si hacéis bien a los que os hacen bien, ¿qué mérito tenéis? Porque también los pecadores hacen lo mismo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 34, NULL, 'Y si prestáis a aquellos de quienes esperáis recibir, ¿qué mérito tenéis? Porque también los pecadores prestan a los pecadores, para recibir otro tanto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 35, NULL, 'Amad, pues, a vuestros enemigos, y haced bien, y prestad, no esperando de ello nada; y será vuestro galardón grande, y seréis hijos del Altísimo; porque él es benigno para con los ingratos y malos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 36, NULL, 'Sed, pues, misericordiosos, como también vuestro Padre es misericordioso.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 37, 'El juzgar a los demás', 'No juzguéis, y no seréis juzgados; no condenéis, y no seréis condenados; perdonad, y seréis perdonados.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 38, NULL, 'Dad, y se os dará; medida buena, apretada, remecida y rebosando darán en vuestro regazo; porque con la misma medida con que medís, os volverán a medir.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 39, NULL, 'Y les decía una parábola: ¿Acaso puede un ciego guiar a otro ciego? ¿No caerán ambos en el hoyo?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 40, NULL, 'El discípulo no es superior a su maestro; mas todo el que fuere perfeccionado, será como su maestro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 41, NULL, '¿Por qué miras la paja que está en el ojo de tu hermano, y no echas de ver la viga que está en tu propio ojo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 42, NULL, '¿O cómo puedes decir a tu hermano: Hermano, déjame sacar la paja que está en tu ojo, no mirando tú la viga que está en el ojo tuyo? Hipócrita, saca primero la viga de tu propio ojo, y entonces verás bien para sacar la paja que está en el ojo de tu hermano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 43, 'Por sus frutos los conoceréis', 'No es buen árbol el que da malos frutos, ni árbol malo el que da buen fruto.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 44, NULL, 'Porque cada árbol se conoce por su fruto; pues no se cosechan higos de los espinos, ni de las zarzas se vendimian uvas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 45, NULL, 'El hombre bueno, del buen tesoro de su corazón saca lo bueno; y el hombre malo, del mal tesoro de su corazón saca lo malo; porque de la abundancia del corazón habla la boca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 46, 'Los dos cimientos', '¿Por qué me llamáis, Señor, Señor, y no hacéis lo que yo digo?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 47, NULL, 'Todo aquel que viene a mí, y oye mis palabras y las hace, os indicaré a quién es semejante.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 48, NULL, 'Semejante es al hombre que al edificar una casa, cavó y ahondó y puso el fundamento sobre la roca; y cuando vino una inundación, el río dio con ímpetu contra aquella casa, pero no la pudo mover, porque estaba fundada sobre la roca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 6, 49, NULL, 'Mas el que oyó y no hizo, semejante es al hombre que edificó su casa sobre tierra, sin fundamento; contra la cual el río dio con ímpetu, y luego cayó, y fue grande la ruina de aquella casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 1, 'Jesús sana al siervo de un centurión', 'Después que hubo terminado todas sus palabras al pueblo que le oía, entró en Capernaum.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 2, NULL, 'Y el siervo de un centurión, a quien este quería mucho, estaba enfermo y a punto de morir.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 3, NULL, 'Cuando el centurión oyó hablar de Jesús, le envió unos ancianos de los judíos, rogándole que viniese y sanase a su siervo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 4, NULL, 'Y ellos vinieron a Jesús y le rogaron con solicitud, diciéndole: Es digno de que le concedas esto;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 5, NULL, 'porque ama a nuestra nación, y nos edificó una sinagoga.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 6, NULL, 'Y Jesús fue con ellos. Pero cuando ya no estaban lejos de la casa, el centurión envió a él unos amigos, diciéndole: Señor, no te molestes, pues no soy digno de que entres bajo mi techo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 7, NULL, 'por lo que ni aun me tuve por digno de venir a ti; pero di la palabra, y mi siervo será sano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 8, NULL, 'Porque también yo soy hombre puesto bajo autoridad, y tengo soldados bajo mis órdenes; y digo a este: Ve, y va; y al otro: Ven, y viene; y a mi siervo: Haz esto, y lo hace.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 9, NULL, 'Al oír esto, Jesús se maravilló de él, y volviéndose, dijo a la gente que le seguía: Os digo que ni aun en Israel he hallado tanta fe.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 10, NULL, 'Y al regresar a casa los que habían sido enviados, hallaron sano al siervo que había estado enfermo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 11, 'Jesús resucita al hijo de la viuda de Naín', 'Aconteció después, que él iba a la ciudad que se llama Naín, e iban con él muchos de sus discípulos, y una gran multitud.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 12, NULL, 'Cuando llegó cerca de la puerta de la ciudad, he aquí que llevaban a enterrar a un difunto, hijo único de su madre, la cual era viuda; y había con ella mucha gente de la ciudad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 13, NULL, 'Y cuando el Señor la vio, se compadeció de ella, y le dijo: No llores.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 14, NULL, 'Y acercándose, tocó el féretro; y los que lo llevaban se detuvieron. Y dijo: Joven, a ti te digo, levántate.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 15, NULL, 'Entonces se incorporó el que había muerto, y comenzó a hablar. Y lo dio a su madre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 16, NULL, 'Y todos tuvieron miedo, y glorificaban a Dios, diciendo: Un gran profeta se ha levantado entre nosotros; y: Dios ha visitado a su pueblo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 17, NULL, 'Y se extendió la fama de él por toda Judea, y por toda la región de alrededor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 18, 'Los mensajeros de Juan el Bautista', 'Los discípulos de Juan le dieron las nuevas de todas estas cosas. Y llamó Juan a dos de sus discípulos,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 19, NULL, 'y los envió a Jesús, para preguntarle: ¿Eres tú el que había de venir, o esperaremos a otro?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 20, NULL, 'Cuando, pues, los hombres vinieron a él, dijeron: Juan el Bautista nos ha enviado a ti, para preguntarte: ¿Eres tú el que había de venir, o esperaremos a otro?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 21, NULL, 'En esa misma hora sanó a muchos de enfermedades y plagas, y de espíritus malos, y a muchos ciegos les dio la vista.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 22, NULL, 'Y respondiendo Jesús, les dijo: Id, haced saber a Juan lo que habéis visto y oído: los ciegos ven, los cojos andan, los leprosos son limpiados, los sordos oyen, los muertos son resucitados, y a los pobres es anunciado el evangelio;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 23, NULL, 'y bienaventurado es aquel que no halle tropiezo en mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 24, NULL, 'Cuando se fueron los mensajeros de Juan, comenzó a decir de Juan a la gente: ¿Qué salisteis a ver al desierto? ¿Una caña sacudida por el viento?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 25, NULL, 'Mas ¿qué salisteis a ver? ¿A un hombre cubierto de vestiduras delicadas? He aquí, los que tienen vestidura preciosa y viven en deleites, en los palacios de los reyes están.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 26, NULL, 'Mas ¿qué salisteis a ver? ¿A un profeta? Sí, os digo, y más que profeta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 27, NULL, 'Este es de quien está escrito: He aquí, envío mi mensajero delante de tu faz, El cual preparará tu camino delante de ti.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 28, NULL, 'Os digo que entre los nacidos de mujeres, no hay mayor profeta que Juan el Bautista; pero el más pequeño en el reino de Dios es mayor que él.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 29, NULL, 'Y todo el pueblo y los publicanos, cuando lo oyeron, justificaron a Dios, bautizándose con el bautismo de Juan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 30, NULL, 'Mas los fariseos y los intérpretes de la ley desecharon los designios de Dios respecto de sí mismos, no siendo bautizados por Juan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 31, NULL, 'Y dijo el Señor: ¿A qué, pues, compararé los hombres de esta generación, y a qué son semejantes?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 32, NULL, 'Semejantes son a los muchachos sentados en la plaza, que dan voces unos a otros y dicen: Os tocamos flauta, y no bailasteis; os endechamos, y no llorasteis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 33, NULL, 'Porque vino Juan el Bautista, que ni comía pan ni bebía vino, y decís: Demonio tiene.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 34, NULL, 'Vino el Hijo del Hombre, que come y bebe, y decís: Este es un hombre comilón y bebedor de vino, amigo de publicanos y de pecadores.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 35, NULL, 'Mas la sabiduría es justificada por todos sus hijos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 36, 'Jesús en el hogar de Simón el fariseo', 'Uno de los fariseos rogó a Jesús que comiese con él. Y habiendo entrado en casa del fariseo, se sentó a la mesa.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 37, NULL, 'Entonces una mujer de la ciudad, que era pecadora, al saber que Jesús estaba a la mesa en casa del fariseo, trajo un frasco de alabastro con perfume;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 38, NULL, 'y estando detrás de él a sus pies, llorando, comenzó a regar con lágrimas sus pies, y los enjugaba con sus cabellos; y besaba sus pies, y los ungía con el perfume.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 39, NULL, 'Cuando vio esto el fariseo que le había convidado, dijo para sí: Este, si fuera profeta, conocería quién y qué clase de mujer es la que le toca, que es pecadora.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 40, NULL, 'Entonces respondiendo Jesús, le dijo: Simón, una cosa tengo que decirte. Y él le dijo: Di, Maestro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 41, NULL, 'Un acreedor tenía dos deudores: el uno le debía quinientos denarios, y el otro cincuenta;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 42, NULL, 'y no teniendo ellos con qué pagar, perdonó a ambos. Di, pues, ¿cuál de ellos le amará más?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 43, NULL, 'Respondiendo Simón, dijo: Pienso que aquel a quien perdonó más. Y él le dijo: Rectamente has juzgado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 44, NULL, 'Y vuelto a la mujer, dijo a Simón: ¿Ves esta mujer? Entré en tu casa, y no me diste agua para mis pies; mas esta ha regado mis pies con lágrimas, y los ha enjugado con sus cabellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 45, NULL, 'No me diste beso; mas esta, desde que entré, no ha cesado de besar mis pies.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 46, NULL, 'No ungiste mi cabeza con aceite; mas esta ha ungido con perfume mis pies.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 47, NULL, 'Por lo cual te digo que sus muchos pecados le son perdonados, porque amó mucho; mas aquel a quien se le perdona poco, poco ama.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 48, NULL, 'Y a ella le dijo: Tus pecados te son perdonados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 49, NULL, 'Y los que estaban juntamente sentados a la mesa, comenzaron a decir entre sí: ¿Quién es este, que también perdona pecados?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 7, 50, NULL, 'Pero él dijo a la mujer: Tu fe te ha salvado, ve en paz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 1, 'Mujeres que sirven a Jesús', 'Aconteció después, que Jesús iba por todas las ciudades y aldeas, predicando y anunciando el evangelio del reino de Dios, y los doce con él,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 2, NULL, 'y algunas mujeres que habían sido sanadas de espíritus malos y de enfermedades: María, que se llamaba Magdalena, de la que habían salido siete demonios,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 3, NULL, 'Juana, mujer de Chuza intendente de Herodes, y Susana, y otras muchas que le servían de sus bienes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 4, 'Parábola del sembrador', 'Juntándose una gran multitud, y los que de cada ciudad venían a él, les dijo por parábola:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 5, NULL, 'El sembrador salió a sembrar su semilla; y mientras sembraba, una parte cayó junto al camino, y fue hollada, y las aves del cielo la comieron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 6, NULL, 'Otra parte cayó sobre la piedra; y nacida, se secó, porque no tenía humedad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 7, NULL, 'Otra parte cayó entre espinos, y los espinos que nacieron juntamente con ella, la ahogaron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 8, NULL, 'Y otra parte cayó en buena tierra, y nació y llevó fruto a ciento por uno. Hablando estas cosas, decía a gran voz: El que tiene oídos para oír, oiga.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 9, NULL, 'Y sus discípulos le preguntaron, diciendo: ¿Qué significa esta parábola?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 10, NULL, 'Y él dijo: A vosotros os es dado conocer los misterios del reino de Dios; pero a los otros por parábolas, para que viendo no vean, y oyendo no entiendan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 11, NULL, 'Esta es, pues, la parábola: La semilla es la palabra de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 12, NULL, 'Y los de junto al camino son los que oyen, y luego viene el diablo y quita de su corazón la palabra, para que no crean y se salven.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 13, NULL, 'Los de sobre la piedra son los que habiendo oído, reciben la palabra con gozo; pero estos no tienen raíces; creen por algún tiempo, y en el tiempo de la prueba se apartan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 14, NULL, 'La que cayó entre espinos, estos son los que oyen, pero yéndose, son ahogados por los afanes y las riquezas y los placeres de la vida, y no llevan fruto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 15, NULL, 'Mas la que cayó en buena tierra, estos son los que con corazón bueno y recto retienen la palabra oída, y dan fruto con perseverancia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 16, 'Nada oculto que no haya de ser manifestado', 'Nadie que enciende una luz la cubre con una vasija, ni la pone debajo de la cama, sino que la pone en un candelero para que los que entran vean la luz.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 17, NULL, 'Porque nada hay oculto, que no haya de ser manifestado; ni escondido, que no haya de ser conocido, y de salir a luz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 18, NULL, 'Mirad, pues, cómo oís; porque a todo el que tiene, se le dará; y a todo el que no tiene, aun lo que piensa tener se le quitará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 19, 'La madre y los hermanos de Jesús', 'Entonces su madre y sus hermanos vinieron a él; pero no podían llegar hasta él por causa de la multitud.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 20, NULL, 'Y se le avisó, diciendo: Tu madre y tus hermanos están fuera y quieren verte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 21, NULL, 'Él entonces respondiendo, les dijo: Mi madre y mis hermanos son los que oyen la palabra de Dios, y la hacen.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 22, 'Jesús calma la tempestad', 'Aconteció un día, que entró en una barca con sus discípulos, y les dijo: Pasemos al otro lado del lago. Y partieron.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 23, NULL, 'Pero mientras navegaban, él se durmió. Y se desencadenó una tempestad de viento en el lago; y se anegaban y peligraban.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 24, NULL, 'Y vinieron a él y le despertaron, diciendo: ¡Maestro, Maestro, que perecemos! Despertando él, reprendió al viento y a las olas; y cesaron, y se hizo bonanza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 25, NULL, 'Y les dijo: ¿Dónde está vuestra fe? Y atemorizados, se maravillaban, y se decían unos a otros: ¿Quién es este, que aun a los vientos y a las aguas manda, y le obedecen?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 26, 'El endemoniado gadareno', 'Y arribaron a la tierra de los gadarenos, que está en la ribera opuesta a Galilea.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 27, NULL, 'Al llegar él a tierra, vino a su encuentro un hombre de la ciudad, endemoniado desde hacía mucho tiempo; y no vestía ropa, ni moraba en casa, sino en los sepulcros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 28, NULL, 'Este, al ver a Jesús, lanzó un gran grito, y postrándose a sus pies exclamó a gran voz: ¿Qué tienes conmigo, Jesús, Hijo del Dios Altísimo? Te ruego que no me atormentes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 29, NULL, '(Porque mandaba al espíritu inmundo que saliese del hombre, pues hacía mucho tiempo que se había apoderado de él; y le ataban con cadenas y grillos, pero rompiendo las cadenas, era impelido por el demonio a los desiertos.)', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 30, NULL, 'Y le preguntó Jesús, diciendo: ¿Cómo te llamas? Y él dijo: Legión. Porque muchos demonios habían entrado en él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 31, NULL, 'Y le rogaban que no los mandase ir al abismo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 32, NULL, 'Había allí un hato de muchos cerdos que pacían en el monte; y le rogaron que los dejase entrar en ellos; y les dio permiso.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 33, NULL, 'Y los demonios, salidos del hombre, entraron en los cerdos; y el hato se precipitó por un despeñadero al lago, y se ahogó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 34, NULL, 'Y los que apacentaban los cerdos, cuando vieron lo que había acontecido, huyeron, y yendo dieron aviso en la ciudad y por los campos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 35, NULL, 'Y salieron a ver lo que había sucedido; y vinieron a Jesús, y hallaron al hombre de quien habían salido los demonios, sentado a los pies de Jesús, vestido, y en su cabal juicio; y tuvieron miedo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 36, NULL, 'Y los que lo habían visto, les contaron cómo había sido salvado el endemoniado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 37, NULL, 'Entonces toda la multitud de la región alrededor de los gadarenos le rogó que se marchase de ellos, pues tenían gran temor. Y Jesús, entrando en la barca, se volvió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 38, NULL, 'Y el hombre de quien habían salido los demonios le rogaba que le dejase estar con él; pero Jesús le despidió, diciendo:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 39, NULL, 'Vuélvete a tu casa, y cuenta cuán grandes cosas ha hecho Dios contigo. Y él se fue, publicando por toda la ciudad cuán grandes cosas había hecho Jesús con él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 40, 'La hija de Jairo, y la mujer que tocó el manto de Jesús', 'Cuando volvió Jesús, le recibió la multitud con gozo; porque todos le esperaban.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 41, NULL, 'Entonces vino un varón llamado Jairo, que era principal de la sinagoga, y postrándose a los pies de Jesús, le rogaba que entrase en su casa;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 42, NULL, 'porque tenía una hija única, como de doce años, que se estaba muriendo. Y mientras iba, la multitud le oprimía.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 43, NULL, 'Pero una mujer que padecía de flujo de sangre desde hacía doce años, y que había gastado en médicos todo cuanto tenía, y por ninguno había podido ser curada,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 44, NULL, 'se le acercó por detrás y tocó el borde de su manto; y al instante se detuvo el flujo de su sangre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 45, NULL, 'Entonces Jesús dijo: ¿Quién es el que me ha tocado? Y negando todos, dijo Pedro y los que con él estaban: Maestro, la multitud te aprieta y oprime, y dices: ¿Quién es el que me ha tocado?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 46, NULL, 'Pero Jesús dijo: Alguien me ha tocado; porque yo he conocido que ha salido poder de mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 47, NULL, 'Entonces, cuando la mujer vio que no había quedado oculta, vino temblando, y postrándose a sus pies, le declaró delante de todo el pueblo por qué causa le había tocado, y cómo al instante había sido sanada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 48, NULL, 'Y él le dijo: Hija, tu fe te ha salvado; ve en paz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 49, NULL, 'Estaba hablando aún, cuando vino uno de casa del principal de la sinagoga a decirle: Tu hija ha muerto; no molestes más al Maestro.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 50, NULL, 'Oyéndolo Jesús, le respondió: No temas; cree solamente, y será salva.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 51, NULL, 'Entrando en la casa, no dejó entrar a nadie consigo, sino a Pedro, a Jacobo, a Juan, y al padre y a la madre de la niña.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 52, NULL, 'Y lloraban todos y hacían lamentación por ella. Pero él dijo: No lloréis; no está muerta, sino que duerme.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 53, NULL, 'Y se burlaban de él, sabiendo que estaba muerta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 54, NULL, 'Mas él, tomándola de la mano, clamó diciendo: Muchacha, levántate.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 55, NULL, 'Entonces su espíritu volvió, e inmediatamente se levantó; y él mandó que se le diese de comer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 8, 56, NULL, 'Y sus padres estaban atónitos; pero Jesús les mandó que a nadie dijesen lo que había sucedido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 1, 'Misión de los doce discípulos', 'Habiendo reunido a sus doce discípulos, les dio poder y autoridad sobre todos los demonios, y para sanar enfermedades.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 2, NULL, 'Y los envió a predicar el reino de Dios, y a sanar a los enfermos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 3, NULL, 'Y les dijo: No toméis nada para el camino, ni bordón, ni alforja, ni pan, ni dinero; ni llevéis dos túnicas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 4, NULL, 'Y en cualquier casa donde entréis, quedad allí, y de allí salid.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 5, NULL, 'Y dondequiera que no os recibieren, salid de aquella ciudad, y sacudid el polvo de vuestros pies en testimonio contra ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 6, NULL, 'Y saliendo, pasaban por todas las aldeas, anunciando el evangelio y sanando por todas partes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 7, 'Muerte de Juan el Bautista', 'Herodes el tetrarca oyó de todas las cosas que hacía Jesús; y estaba perplejo, porque decían algunos: Juan ha resucitado de los muertos;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 8, NULL, 'otros: Elías ha aparecido; y otros: Algún profeta de los antiguos ha resucitado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 9, NULL, 'Y dijo Herodes: A Juan yo le hice decapitar; ¿quién, pues, es este, de quien oigo tales cosas? Y procuraba verle.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 10, 'Alimentación de los cinco mil', 'Vueltos los apóstoles, le contaron todo lo que habían hecho. Y tomándolos, se retiró aparte, a un lugar desierto de la ciudad llamada Betsaida.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 11, NULL, 'Y cuando la gente lo supo, le siguió; y él les recibió, y les hablaba del reino de Dios, y sanaba a los que necesitaban ser curados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 12, NULL, 'Pero el día comenzaba a declinar; y acercándose los doce, le dijeron: Despide a la gente, para que vayan a las aldeas y campos de alrededor, y se alojen y encuentren alimentos; porque aquí estamos en lugar desierto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 13, NULL, 'Él les dijo: Dadles vosotros de comer. Y dijeron ellos: No tenemos más que cinco panes y dos pescados, a no ser que vayamos nosotros a comprar alimentos para toda esta multitud.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 14, NULL, 'Y eran como cinco mil hombres. Entonces dijo a sus discípulos: Hacedlos sentar en grupos, de cincuenta en cincuenta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 15, NULL, 'Así lo hicieron, haciéndolos sentar a todos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 16, NULL, 'Y tomando los cinco panes y los dos pescados, levantando los ojos al cielo, los bendijo, y los partió, y dio a sus discípulos para que los pusiesen delante de la gente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 17, NULL, 'Y comieron todos, y se saciaron; y recogieron lo que les sobró, doce cestas de pedazos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 18, 'La confesión de Pedro', 'Aconteció que mientras Jesús oraba aparte, estaban con él los discípulos; y les preguntó, diciendo: ¿Quién dice la gente que soy yo?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 19, NULL, 'Ellos respondieron: Unos, Juan el Bautista; otros, Elías; y otros, que algún profeta de los antiguos ha resucitado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 20, NULL, 'Él les dijo: ¿Y vosotros, quién decís que soy? Entonces respondiendo Pedro, dijo: El Cristo de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 21, 'Jesús anuncia su muerte', 'Pero él les mandó que a nadie dijesen esto, encargándoselo rigurosamente,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 22, NULL, 'y diciendo: Es necesario que el Hijo del Hombre padezca muchas cosas, y sea desechado por los ancianos, por los principales sacerdotes y por los escribas, y que sea muerto, y resucite al tercer día.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 23, NULL, 'Y decía a todos: Si alguno quiere venir en pos de mí, niéguese a sí mismo, tome su cruz cada día, y sígame.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 24, NULL, 'Porque todo el que quiera salvar su vida, la perderá; y todo el que pierda su vida por causa de mí, este la salvará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 25, NULL, 'Pues ¿qué aprovecha al hombre, si gana todo el mundo, y se destruye o se pierde a sí mismo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 26, NULL, 'Porque el que se avergonzare de mí y de mis palabras, de este se avergonzará el Hijo del Hombre cuando venga en su gloria, y en la del Padre, y de los santos ángeles.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 27, NULL, 'Pero os digo en verdad, que hay algunos de los que están aquí, que no gustarán la muerte hasta que vean el reino de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 28, 'La transfiguración', 'Aconteció como ocho días después de estas palabras, que tomó a Pedro, a Juan y a Jacobo, y subió al monte a orar.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 29, NULL, 'Y entre tanto que oraba, la apariencia de su rostro se hizo otra, y su vestido blanco y resplandeciente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 30, NULL, 'Y he aquí dos varones que hablaban con él, los cuales eran Moisés y Elías;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 31, NULL, 'quienes aparecieron rodeados de gloria, y hablaban de su partida, que iba Jesús a cumplir en Jerusalén.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 32, NULL, 'Y Pedro y los que estaban con él estaban rendidos de sueño; mas permaneciendo despiertos, vieron la gloria de Jesús, y a los dos varones que estaban con él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 33, NULL, 'Y sucedió que apartándose ellos de él, Pedro dijo a Jesús: Maestro, bueno es para nosotros que estemos aquí; y hagamos tres enramadas, una para ti, una para Moisés, y una para Elías; no sabiendo lo que decía.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 34, NULL, 'Mientras él decía esto, vino una nube que los cubrió; y tuvieron temor al entrar en la nube.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 35, NULL, 'Y vino una voz desde la nube, que decía: Este es mi Hijo amado; a él oíd.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 36, NULL, 'Y cuando cesó la voz, Jesús fue hallado solo; y ellos callaron, y por aquellos días no dijeron nada a nadie de lo que habían visto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 37, 'Jesús sana a un muchacho endemoniado', 'Al día siguiente, cuando descendieron del monte, una gran multitud les salió al encuentro.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 38, NULL, 'Y he aquí, un hombre de la multitud clamó diciendo: Maestro, te ruego que veas a mi hijo, pues es el único que tengo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 39, NULL, 'y sucede que un espíritu le toma, y de repente da voces, y le sacude con violencia, y le hace echar espuma, y estropeándole, a duras penas se aparta de él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 40, NULL, 'Y rogué a tus discípulos que le echasen fuera, y no pudieron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 41, NULL, 'Respondiendo Jesús, dijo: ¡Oh generación incrédula y perversa! ¿Hasta cuándo he de estar con vosotros, y os he de soportar? Trae acá a tu hijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 42, NULL, 'Y mientras se acercaba el muchacho, el demonio le derribó y le sacudió con violencia; pero Jesús reprendió al espíritu inmundo, y sanó al muchacho, y se lo devolvió a su padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 43, NULL, 'Y todos se admiraban de la grandeza de Dios. Y maravillándose todos de todas las cosas que hacía, dijo a sus discípulos:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 44, 'Jesús anuncia otra vez su muerte', 'Haced que os penetren bien en los oídos estas palabras; porque acontecerá que el Hijo del Hombre será entregado en manos de hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 45, NULL, 'Mas ellos no entendían estas palabras, pues les estaban veladas para que no las entendiesen; y temían preguntarle sobre esas palabras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 46, '¿Quién es el mayor?', 'Entonces entraron en discusión sobre quién de ellos sería el mayor.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 47, NULL, 'Y Jesús, percibiendo los pensamientos de sus corazones, tomó a un niño y lo puso junto a sí,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 48, NULL, 'y les dijo: Cualquiera que reciba a este niño en mi nombre, a mí me recibe; y cualquiera que me recibe a mí, recibe al que me envió; porque el que es más pequeño entre todos vosotros, ese es el más grande.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 49, 'El que no es contra nosotros, por nosotros es', 'Entonces respondiendo Juan, dijo: Maestro, hemos visto a uno que echaba fuera demonios en tu nombre; y se lo prohibimos, porque no sigue con nosotros.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 50, NULL, 'Jesús le dijo: No se lo prohibáis; porque el que no es contra nosotros, por nosotros es.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 51, 'Jesús reprende a Jacobo y a Juan', 'Cuando se cumplió el tiempo en que él había de ser recibido arriba, afirmó su rostro para ir a Jerusalén.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 52, NULL, 'Y envió mensajeros delante de él, los cuales fueron y entraron en una aldea de los samaritanos para hacerle preparativos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 53, NULL, 'Mas no le recibieron, porque su aspecto era como de ir a Jerusalén.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 54, NULL, 'Viendo esto sus discípulos Jacobo y Juan, dijeron: Señor, ¿quieres que mandemos que descienda fuego del cielo, como hizo Elías, y los consuma?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 55, NULL, 'Entonces volviéndose él, los reprendió, diciendo: Vosotros no sabéis de qué espíritu sois;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 56, NULL, 'porque el Hijo del Hombre no ha venido para perder las almas de los hombres, sino para salvarlas. Y se fueron a otra aldea.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 57, 'Los que querían seguir a Jesús', 'Yendo ellos, uno le dijo en el camino: Señor, te seguiré adondequiera que vayas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 58, NULL, 'Y le dijo Jesús: Las zorras tienen guaridas, y las aves de los cielos nidos; mas el Hijo del Hombre no tiene dónde recostar la cabeza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 59, NULL, 'Y dijo a otro: Sígueme. Él le dijo: Señor, déjame que primero vaya y entierre a mi padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 60, NULL, 'Jesús le dijo: Deja que los muertos entierren a sus muertos; y tú ve, y anuncia el reino de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 61, NULL, 'Entonces también dijo otro: Te seguiré, Señor; pero déjame que me despida primero de los que están en mi casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 9, 62, NULL, 'Y Jesús le dijo: Ninguno que poniendo su mano en el arado mira hacia atrás, es apto para el reino de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 1, 'Misión de los setenta', 'Después de estas cosas, designó el Señor también a otros setenta, a quienes envió de dos en dos delante de él a toda ciudad y lugar adonde él había de ir.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 2, NULL, 'Y les decía: La mies a la verdad es mucha, mas los obreros pocos; por tanto, rogad al Señor de la mies que envíe obreros a su mies.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 3, NULL, 'Id; he aquí yo os envío como corderos en medio de lobos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 4, NULL, 'No llevéis bolsa, ni alforja, ni calzado; y a nadie saludéis por el camino.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 5, NULL, 'En cualquier casa donde entréis, primeramente decid: Paz sea a esta casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 6, NULL, 'Y si hubiere allí algún hijo de paz, vuestra paz reposará sobre él; y si no, se volverá a vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 7, NULL, 'Y posad en aquella misma casa, comiendo y bebiendo lo que os den; porque el obrero es digno de su salario. No os paséis de casa en casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 8, NULL, 'En cualquier ciudad donde entréis, y os reciban, comed lo que os pongan delante;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 9, NULL, 'y sanad a los enfermos que en ella haya, y decidles: Se ha acercado a vosotros el reino de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 10, NULL, 'Mas en cualquier ciudad donde entréis, y no os reciban, saliendo por sus calles, decid:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 11, NULL, 'Aun el polvo de vuestra ciudad, que se ha pegado a nuestros pies, lo sacudimos contra vosotros. Pero esto sabed, que el reino de Dios se ha acercado a vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 12, NULL, 'Y os digo que en aquel día será más tolerable el castigo para Sodoma, que para aquella ciudad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 13, 'Ayes sobre las ciudades impenitentes', '¡Ay de ti, Corazín! ¡Ay de ti, Betsaida! que si en Tiro y en Sidón se hubieran hecho los milagros que se han hecho en vosotras, tiempo ha que sentadas en cilicio y ceniza, se habrían arrepentido.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 14, NULL, 'Por tanto, en el juicio será más tolerable el castigo para Tiro y Sidón, que para vosotras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 15, NULL, 'Y tú, Capernaum, que hasta los cielos eres levantada, hasta el Hades serás abatida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 16, NULL, 'El que a vosotros oye, a mí me oye; y el que a vosotros desecha, a mí me desecha; y el que me desecha a mí, desecha al que me envió.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 17, 'Regreso de los setenta', 'Volvieron los setenta con gozo, diciendo: Señor, aun los demonios se nos sujetan en tu nombre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 18, NULL, 'Y les dijo: Yo veía a Satanás caer del cielo como un rayo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 19, NULL, 'He aquí os doy potestad de hollar serpientes y escorpiones, y sobre toda fuerza del enemigo, y nada os dañará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 20, NULL, 'Pero no os regocijéis de que los espíritus se os sujetan, sino regocijaos de que vuestros nombres están escritos en los cielos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 21, 'Jesús se regocija', 'En aquella misma hora Jesús se regocijó en el Espíritu, y dijo: Yo te alabo, oh Padre, Señor del cielo y de la tierra, porque escondiste estas cosas de los sabios y entendidos, y las has revelado a los niños. Sí, Padre, porque así te agradó.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 22, NULL, 'Todas las cosas me fueron entregadas por mi Padre; y nadie conoce quién es el Hijo sino el Padre; ni quién es el Padre, sino el Hijo, y aquel a quien el Hijo lo quiera revelar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 23, NULL, 'Y volviéndose a los discípulos, les dijo aparte: Bienaventurados los ojos que ven lo que vosotros veis;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 24, NULL, 'porque os digo que muchos profetas y reyes desearon ver lo que vosotros veis, y no lo vieron; y oír lo que oís, y no lo oyeron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 25, 'El buen samaritano', 'Y he aquí un intérprete de la ley se levantó y dijo, para probarle: Maestro, ¿haciendo qué cosa heredaré la vida eterna?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 26, NULL, 'Él le dijo: ¿Qué está escrito en la ley? ¿Cómo lees?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 27, NULL, 'Aquel, respondiendo, dijo: Amarás al Señor tu Dios con todo tu corazón, y con toda tu alma, y con todas tus fuerzas, y con toda tu mente; y a tu prójimo como a ti mismo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 28, NULL, 'Y le dijo: Bien has respondido; haz esto, y vivirás.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 29, NULL, 'Pero él, queriendo justificarse a sí mismo, dijo a Jesús: ¿Y quién es mi prójimo?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 30, NULL, 'Respondiendo Jesús, dijo: Un hombre descendía de Jerusalén a Jericó, y cayó en manos de ladrones, los cuales le despojaron; e hiriéndole, se fueron, dejándole medio muerto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 31, NULL, 'Aconteció que descendió un sacerdote por aquel camino, y viéndole, pasó de largo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 32, NULL, 'Asimismo un levita, llegando cerca de aquel lugar, y viéndole, pasó de largo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 33, NULL, 'Pero un samaritano, que iba de camino, vino cerca de él, y viéndole, fue movido a misericordia;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 34, NULL, 'y acercándose, vendó sus heridas, echándoles aceite y vino; y poniéndole en su cabalgadura, lo llevó al mesón, y cuidó de él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 35, NULL, 'Otro día al partir, sacó dos denarios, y los dio al mesonero, y le dijo: Cuídamele; y todo lo que gastes de más, yo te lo pagaré cuando regrese.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 36, NULL, '¿Quién, pues, de estos tres te parece que fue el prójimo del que cayó en manos de los ladrones?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 37, NULL, 'Él dijo: El que usó de misericordia con él. Entonces Jesús le dijo: Ve, y haz tú lo mismo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 38, 'Jesús visita a Marta y a María', 'Aconteció que yendo de camino, entró en una aldea; y una mujer llamada Marta le recibió en su casa.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 39, NULL, 'Esta tenía una hermana que se llamaba María, la cual, sentándose a los pies de Jesús, oía su palabra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 40, NULL, 'Pero Marta se preocupaba con muchos quehaceres, y acercándose, dijo: Señor, ¿no te da cuidado que mi hermana me deje servir sola? Dile, pues, que me ayude.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 41, NULL, 'Respondiendo Jesús, le dijo: Marta, Marta, afanada y turbada estás con muchas cosas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 10, 42, NULL, 'Pero solo una cosa es necesaria; y María ha escogido la buena parte, la cual no le será quitada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 1, 'Jesús y la oración', 'Aconteció que estaba Jesús orando en un lugar, y cuando terminó, uno de sus discípulos le dijo: Señor, enséñanos a orar, como también Juan enseñó a sus discípulos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 2, NULL, 'Y les dijo: Cuando oréis, decid: Padre nuestro que estás en los cielos, santificado sea tu nombre. Venga tu reino. Hágase tu voluntad, como en el cielo, así también en la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 3, NULL, 'El pan nuestro de cada día, dánoslo hoy.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 4, NULL, 'Y perdónanos nuestros pecados, porque también nosotros perdonamos a todos los que nos deben. Y no nos metas en tentación, mas líbranos del mal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 5, NULL, 'Les dijo también: ¿Quién de vosotros que tenga un amigo, va a él a medianoche y le dice: Amigo, préstame tres panes,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 6, NULL, 'porque un amigo mío ha venido a mí de viaje, y no tengo qué ponerle delante;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 7, NULL, 'y aquel, respondiendo desde adentro, le dice: No me molestes; la puerta ya está cerrada, y mis niños están conmigo en cama; no puedo levantarme, y dártelos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 8, NULL, 'Os digo, que aunque no se levante a dárselos por ser su amigo, sin embargo por su importunidad se levantará y le dará todo lo que necesite.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 9, NULL, 'Y yo os digo: Pedid, y se os dará; buscad, y hallaréis; llamad, y se os abrirá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 10, NULL, 'Porque todo aquel que pide, recibe; y el que busca, halla; y al que llama, se le abrirá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 11, NULL, '¿Qué padre de vosotros, si su hijo le pide pan, le dará una piedra? ¿o si pescado, en lugar de pescado, le dará una serpiente?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 12, NULL, '¿O si le pide un huevo, le dará un escorpión?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 13, NULL, 'Pues si vosotros, siendo malos, sabéis dar buenas dádivas a vuestros hijos, ¿cuánto más vuestro Padre celestial dará el Espíritu Santo a los que se lo pidan?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 14, 'Una casa dividida contra sí misma', 'Estaba Jesús echando fuera un demonio, que era mudo; y aconteció que salido el demonio, el mudo habló; y la gente se maravilló.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 15, NULL, 'Pero algunos de ellos decían: Por Beelzebú, príncipe de los demonios, echa fuera los demonios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 16, NULL, 'Otros, para tentarle, le pedían señal del cielo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 17, NULL, 'Mas él, conociendo los pensamientos de ellos, les dijo: Todo reino dividido contra sí mismo, es asolado; y una casa dividida contra sí misma, cae.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 18, NULL, 'Y si también Satanás está dividido contra sí mismo, ¿cómo permanecerá su reino? ya que decís que por Beelzebú echo yo fuera los demonios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 19, NULL, 'Pues si yo echo fuera los demonios por Beelzebú, ¿vuestros hijos por quién los echan? Por tanto, ellos serán vuestros jueces.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 20, NULL, 'Mas si por el dedo de Dios echo yo fuera los demonios, ciertamente el reino de Dios ha llegado a vosotros.', 0, 'spa', 'RVR1960', NULL);\n"
;

  public static final String SQL_PARTE_3 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Lc', 11, 21, NULL, 'Cuando el hombre fuerte armado guarda su palacio, en paz está lo que posee.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 22, NULL, 'Pero cuando viene otro más fuerte que él y le vence, le quita todas sus armas en que confiaba, y reparte el botín.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 23, NULL, 'El que no es conmigo, contra mí es; y el que conmigo no recoge, desparrama.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 24, 'El espíritu inmundo que vuelve', 'Cuando el espíritu inmundo sale del hombre, anda por lugares secos, buscando reposo; y no hallándolo, dice: Volveré a mi casa de donde salí.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 25, NULL, 'Y cuando llega, la halla barrida y adornada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 26, NULL, 'Entonces va, y toma otros siete espíritus peores que él; y entrados, moran allí; y el postrer estado de aquel hombre viene a ser peor que el primero.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 27, 'Los que en verdad son bienaventurados', 'Mientras él decía estas cosas, una mujer de entre la multitud levantó la voz y le dijo: Bienaventurado el vientre que te trajo, y los senos que mamaste.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 28, NULL, 'Y él dijo: Antes bienaventurados los que oyen la palabra de Dios, y la guardan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 29, 'La generación perversa demanda señal', 'Y apiñándose las multitudes, comenzó a decir: Esta generación es mala; demanda señal, pero señal no le será dada, sino la señal de Jonás.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 30, NULL, 'Porque así como Jonás fue señal a los ninivitas, también lo será el Hijo del Hombre a esta generación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 31, NULL, 'La reina del Sur se levantará en el juicio con los hombres de esta generación, y los condenará; porque ella vino de los fines de la tierra para oír la sabiduría de Salomón, y he aquí más que Salomón en este lugar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 32, NULL, 'Los hombres de Nínive se levantarán en el juicio con esta generación, y la condenarán; porque a la predicación de Jonás se arrepintieron, y he aquí más que Jonás en este lugar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 33, 'La lámpara del cuerpo', 'Nadie pone en oculto la luz encendida, ni debajo del almud, sino en el candelero, para que los que entran vean la luz.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 34, NULL, 'La lámpara del cuerpo es el ojo; cuando tu ojo es bueno, también todo tu cuerpo está lleno de luz; pero cuando tu ojo es maligno, también tu cuerpo está en tinieblas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 35, NULL, 'Mira pues, no suceda que la luz que en ti hay, sea tinieblas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 36, NULL, 'Así que, si todo tu cuerpo está lleno de luz, no teniendo parte alguna de tinieblas, será todo luminoso, como cuando una lámpara te alumbra con su resplandor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 37, 'Jesús acusa a fariseos y a intérpretes de la ley', 'Luego que hubo hablado, le rogó un fariseo que comiese con él; y entrando Jesús en la casa, se sentó a la mesa.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 38, NULL, 'El fariseo, cuando lo vio, se extrañó de que no se hubiese lavado antes de comer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 39, NULL, 'Pero el Señor le dijo: Ahora bien, vosotros los fariseos limpiáis lo de fuera del vaso y del plato, pero por dentro estáis llenos de rapacidad y de maldad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 40, NULL, 'Necios, ¿el que hizo lo de fuera, no hizo también lo de adentro?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 41, NULL, 'Pero dad limosna de lo que tenéis, y entonces todo os será limpio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 42, NULL, 'Mas ¡ay de vosotros, fariseos! que diezmáis la menta, y la ruda, y toda hortaliza, y pasáis por alto la justicia y el amor de Dios. Esto os era necesario hacer, sin dejar aquello.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 43, NULL, '¡Ay de vosotros, fariseos! que amáis las primeras sillas en las sinagogas, y las salutaciones en las plazas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 44, NULL, '¡Ay de vosotros, escribas y fariseos, hipócritas! que sois como sepulcros que no se ven, y los hombres que andan encima no lo saben.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 45, NULL, 'Respondiendo uno de los intérpretes de la ley, le dijo: Maestro, cuando dices esto, también nos afrentas a nosotros.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 46, NULL, 'Y él dijo: ¡Ay de vosotros también, intérpretes de la ley! porque cargáis a los hombres con cargas que no pueden llevar, pero vosotros ni aun con un dedo las tocáis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 47, NULL, '¡Ay de vosotros, que edificáis los sepulcros de los profetas a quienes mataron vuestros padres!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 48, NULL, 'De modo que sois testigos y consentidores de los hechos de vuestros padres; porque a la verdad ellos los mataron, y vosotros edificáis sus sepulcros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 49, NULL, 'Por eso la sabiduría de Dios también dijo: Les enviaré profetas y apóstoles; y de ellos, a unos matarán y a otros perseguirán,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 50, NULL, 'para que se demande de esta generación la sangre de todos los profetas que se ha derramado desde la fundación del mundo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 51, NULL, 'desde la sangre de Abel hasta la sangre de Zacarías, que murió entre el altar y el templo; sí, os digo que será demandada de esta generación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 52, NULL, '¡Ay de vosotros, intérpretes de la ley! porque habéis quitado la llave de la ciencia; vosotros mismos no entrasteis, y a los que entraban se lo impedisteis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 53, NULL, 'Diciéndoles él estas cosas, los escribas y los fariseos comenzaron a estrecharle en gran manera, y a provocarle a que hablase de muchas cosas;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 11, 54, NULL, 'acechándole, y procurando cazar alguna palabra de su boca para acusarle.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 1, 'La levadura de los fariseos', 'En esto, juntándose por millares la multitud, tanto que unos a otros se atropellaban, comenzó a decir a sus discípulos, primeramente: Guardaos de la levadura de los fariseos, que es la hipocresía.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 2, NULL, 'Porque nada hay encubierto, que no haya de descubrirse; ni oculto, que no haya de saberse.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 3, NULL, 'Por tanto, todo lo que habéis dicho en tinieblas, a la luz se oirá; y lo que habéis hablado al oído en los aposentos, se proclamará en las azoteas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 4, 'A quién se debe temer', 'Mas os digo, amigos míos: No temáis a los que matan el cuerpo, y después nada más pueden hacer.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 5, NULL, 'Pero os enseñaré a quién debéis temer: Temed a aquel que después de haber quitado la vida, tiene poder de echar en el infierno; sí, os digo, a este temed.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 6, NULL, '¿No se venden cinco pajarillos por dos cuartos? Con todo, ni uno de ellos está olvidado delante de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 7, NULL, 'Pues aun los cabellos de vuestra cabeza están todos contados. No temáis, pues; más valéis vosotros que muchos pajarillos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 8, 'El que me confesare delante de los hombres', 'Os digo que todo aquel que me confesare delante de los hombres, también el Hijo del Hombre le confesará delante de los ángeles de Dios;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 9, NULL, 'mas el que me negare delante de los hombres, será negado delante de los ángeles de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 10, NULL, 'A todo aquel que dijere alguna palabra contra el Hijo del Hombre, le será perdonado; pero al que blasfemare contra el Espíritu Santo, no le será perdonado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 11, NULL, 'Cuando os trajeren a las sinagogas, y ante los magistrados y las autoridades, no os preocupéis por cómo o qué habréis de responder, o qué habréis de decir;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 12, NULL, 'porque el Espíritu Santo os enseñará en la misma hora lo que debáis decir.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 13, 'El rico insensato', 'Le dijo uno de la multitud: Maestro, di a mi hermano que parta conmigo la herencia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 14, NULL, 'Mas él le dijo: Hombre, ¿quién me ha puesto sobre vosotros como juez o partidor?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 15, NULL, 'Y les dijo: Mirad, y guardaos de toda avaricia; porque la vida del hombre no consiste en la abundancia de los bienes que posee.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 16, NULL, 'También les refirió una parábola, diciendo: La heredad de un hombre rico había producido mucho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 17, NULL, 'Y él pensaba dentro de sí, diciendo: ¿Qué haré, porque no tengo dónde guardar mis frutos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 18, NULL, 'Y dijo: Esto haré: derribaré mis graneros, y los edificaré mayores, y allí guardaré todos mis frutos y mis bienes;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 19, NULL, 'y diré a mi alma: Alma, muchos bienes tienes guardados para muchos años; repósate, come, bebe, regocíjate.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 20, NULL, 'Pero Dios le dijo: Necio, esta noche vienen a pedirte tu alma; y lo que has provisto, ¿de quién será?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 21, NULL, 'Así es el que hace para sí tesoro, y no es rico para con Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 22, 'El afán y la ansiedad', 'Dijo luego a sus discípulos: Por tanto os digo: No os afanéis por vuestra vida, qué comeréis; ni por el cuerpo, qué vestiréis.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 23, NULL, 'La vida es más que la comida, y el cuerpo que el vestido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 24, NULL, 'Considerad los cuervos, que ni siembran, ni siegan; que ni tienen despensa, ni granero, y Dios los alimenta. ¿No valéis vosotros mucho más que las aves?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 25, NULL, '¿Y quién de vosotros podrá con afanarse añadir a su estatura un codo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 26, NULL, 'Pues si no podéis ni aun lo que es menos, ¿por qué os afanáis por lo demás?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 27, NULL, 'Considerad los lirios, cómo crecen; no trabajan, ni hilan; mas os digo, que ni aun Salomón con toda su gloria se vistió como uno de ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 28, NULL, 'Y si así viste Dios la hierba que hoy está en el campo, y mañana es echada al horno, ¿cuánto más a vosotros, hombres de poca fe?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 29, NULL, 'Vosotros, pues, no os preocupéis por lo que habéis de comer, ni por lo que habéis de beber, ni estéis en ansiosa inquietud.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 30, NULL, 'Porque todas estas cosas buscan las gentes del mundo; pero vuestro Padre sabe que tenéis necesidad de estas cosas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 31, NULL, 'Mas buscad el reino de Dios, y todas estas cosas os serán añadidas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 32, 'Tesoro en el cielo', 'No temáis, manada pequeña, porque a vuestro Padre le ha placido daros el reino.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 33, NULL, 'Vended lo que poseéis, y dad limosna; haceos bolsas que no se envejezcan, tesoro en los cielos que no se agote, donde ladrón no llega, ni polilla destruye.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 34, NULL, 'Porque donde está vuestro tesoro, allí estará también vuestro corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 35, 'El siervo vigilante', 'Estén ceñidos vuestros lomos, y vuestras lámparas encendidas;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 36, NULL, 'y vosotros sed semejantes a hombres que aguardan a que su señor regrese de las bodas, para que cuando llegue y llame, le abran en seguida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 37, NULL, 'Bienaventurados aquellos siervos a los cuales su señor, cuando venga, halle velando; de cierto os digo que se ceñirá, y hará que se sienten a la mesa, y vendrá a servirles.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 38, NULL, 'Y aunque venga a la segunda vigilia, y aunque venga a la tercera vigilia, si los hallare así, bienaventurados son aquellos siervos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 39, NULL, 'Pero sabed esto, que si supiese el padre de familia a qué hora el ladrón había de venir, velaría ciertamente, y no dejaría minar su casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 40, NULL, 'Vosotros, pues, también, estad preparados, porque a la hora que no penséis, el Hijo del Hombre vendrá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 41, 'El siervo infiel', 'Entonces Pedro le dijo: Señor, ¿dices esta parábola a nosotros, o también a todos?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 42, NULL, 'Y dijo el Señor: ¿Quién es el mayordomo fiel y prudente al cual su señor pondrá sobre su casa, para que a tiempo les dé su ración?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 43, NULL, 'Bienaventurado aquel siervo al cual, cuando su señor venga, le halle haciendo así.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 44, NULL, 'En verdad os digo que le pondrá sobre todos sus bienes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 45, NULL, 'Mas si aquel siervo dijere en su corazón: Mi señor tarda en venir; y comenzare a golpear a los criados y a las criadas, y a comer y beber y embriagarse,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 46, NULL, 'vendrá el señor de aquel siervo en día que este no espera, y a la hora que no sabe, y le castigará duramente, y le pondrá con los infieles.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 47, NULL, 'Aquel siervo que conociendo la voluntad de su señor, no se preparó, ni hizo conforme a su voluntad, recibirá muchos azotes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 48, NULL, 'Mas el que sin conocerla hizo cosas dignas de azotes, será azotado poco; porque a todo aquel a quien se haya dado mucho, mucho se le demandará; y al que mucho se le haya confiado, más se le pedirá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 49, 'Jesús, causa de división', 'Fuego vine a echar en la tierra; ¿y qué quiero, si ya se ha encendido?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 50, NULL, 'De un bautismo tengo que ser bautizado; y ¡cómo me angustio hasta que se cumpla!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 51, NULL, '¿Pensáis que he venido para dar paz en la tierra? Os digo: No, sino disensión.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 52, NULL, 'Porque de aquí en adelante, cinco en una familia estarán divididos, tres contra dos, y dos contra tres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 53, NULL, 'Estará dividido el padre contra el hijo, y el hijo contra el padre; la madre contra la hija, y la hija contra la madre; la suegra contra su nuera, y la nuera contra su suegra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 54, '¿Cómo no reconocéis este tiempo?', 'Decía también a la multitud: Cuando veis la nube que sale del poniente, luego decís: Agua viene; y así sucede.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 55, NULL, 'Y cuando sopla el viento del sur, decís: Hará calor; y lo hace.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 56, NULL, '¡Hipócritas! Sabéis distinguir el aspecto del cielo y de la tierra; ¿y cómo no distinguís este tiempo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 57, 'Arréglate con tu adversario', '¿Y por qué no juzgáis por vosotros mismos lo que es justo?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 58, NULL, 'Cuando vayas al magistrado con tu adversario, procura en el camino arreglarte con él, no sea que te arrastre al juez, y el juez te entregue al alguacil, y el alguacil te meta en la cárcel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 12, 59, NULL, 'Te digo que no saldrás de allí, hasta que hayas pagado aun la última blanca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 13, 1, 'Arrepentíos o pereceréis', 'En este mismo tiempo estaban allí algunos que le contaban acerca de los galileos cuya sangre Pilato había mezclado con los sacrificios de ellos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 13, 2, NULL, 'Respondiendo Jesús, les dijo: ¿Pensáis que estos galileos, porque padecieron tales cosas, eran más pecadores que todos los galileos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 13, 3, NULL, 'Os digo: No; antes si no os arrepentís, todos pereceréis igualmente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 13, 4, NULL, 'O aquellos dieciocho sobre los cuales cayó la torre en Siloé, y los mató, ¿pensáis que eran más culpables que todos los hombres que habitan en Jerusalén?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 13, 5, NULL, 'Os digo: No; antes si no os arrepentís, todos pereceréis igualmente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 13, 6, 'Parábola de la higuera estéril', 'Dijo también esta parábola: Tenía un hombre una higuera plantada en su viña, y vino a buscar fruto en ella, y no lo halló.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 13, 7, NULL, 'Y dijo al viñador: He aquí, hace tres años que vengo a buscar fruto en esta higuera, y no lo hallo; córtala; ¿para qué inutiliza también la tierra?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 13, 8, NULL, 'Él entonces, respondiendo, le dijo: Señor, déjala todavía este año, hasta que yo cave alrededor de ella, y la abone.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 13, 9, NULL, 'Y si diere fruto, bien; y si no, la cortarás después.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 13, 10, 'Jesús sana a una mujer en el día de reposo', 'Enseñaba Jesús en una sinagoga en el día de reposo;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 13, 11, NULL, 'y había allí una mujer que desde hacía dieciocho años tenía espíritu de enfermedad, y andaba encorvada, y en ninguna manera se podía enderezar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 13, 12, NULL, 'Cuando Jesús la vio, la llamó y le dijo: Mujer, eres libre de tu enfermedad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 13, 13, NULL, 'Y puso las manos sobre ella; y ella se enderezó luego, y glorificaba a Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 13, 14, NULL, 'Pero el principal de la sinagoga, enojado de que Jesús hubiese sanado en el día de reposo, dijo a la gente: Seis días hay en que se debe trabajar; en estos, pues, venid y sed sanados, y no en día de reposo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 13, 15, NULL, 'Entonces el Señor le respondió y dijo: Hipócrita, cada uno de vosotros ¿no desata en el día de reposo su buey o su asno del pesebre y lo lleva a beber?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 13, 16, NULL, 'Y a esta hija de Abraham, que Satanás había atado dieciocho años, ¿no se le debía desatar de esta ligadura en el día de reposo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 13, 17, NULL, 'Al decir él estas cosas, se avergonzaban todos sus adversarios; pero todo el pueblo se regocijaba por todas las cosas gloriosas hechas por él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 13, 18, 'Parábola de la semilla de mostaza', 'Y dijo: ¿A qué es semejante el reino de Dios, y con qué lo compararé?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 13, 19, NULL, 'Es semejante al grano de mostaza, que un hombre tomó y sembró en su huerto; y creció, y se hizo árbol grande, y las aves del cielo anidaron en sus ramas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 13, 20, 'Parábola de la levadura', 'Y volvió a decir: ¿A qué compararé el reino de Dios?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 13, 21, NULL, 'Es semejante a la levadura, que una mujer tomó y escondió en tres medidas de harina, hasta que todo hubo fermentado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 13, 22, 'La puerta estrecha', 'Pasaba Jesús por ciudades y aldeas, enseñando, y encaminándose a Jerusalén.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 13, 23, NULL, 'Y alguien le dijo: Señor, ¿son pocos los que se salvan? Y él les dijo:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 13, 24, NULL, 'Esforzaos a entrar por la puerta angosta; porque os digo que muchos procurarán entrar, y no podrán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 13, 25, NULL, 'Después que el padre de familia se haya levantado y cerrado la puerta, y estando fuera empecéis a llamar a la puerta, diciendo: Señor, Señor, ábrenos, él respondiendo os dirá: No sé de dónde sois.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 13, 26, NULL, 'Entonces comenzaréis a decir: Delante de ti hemos comido y bebido, y en nuestras plazas enseñaste.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 13, 27, NULL, 'Pero os dirá: Os digo que no sé de dónde sois; apartaos de mí todos vosotros, hacedores de maldad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 13, 28, NULL, 'Allí será el llanto y el crujir de dientes, cuando veáis a Abraham, a Isaac, a Jacob y a todos los profetas en el reino de Dios, y vosotros estéis excluidos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 13, 29, NULL, 'Porque vendrán del oriente y del occidente, del norte y del sur, y se sentarán a la mesa en el reino de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 13, 30, NULL, 'Y he aquí, hay postreros que serán primeros, y primeros que serán postreros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 13, 31, 'Lamento de Jesús sobre Jerusalén', 'Aquel mismo día llegaron unos fariseos, diciéndole: Sal, y vete de aquí, porque Herodes te quiere matar.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 13, 32, NULL, 'Y les dijo: Id, y decid a aquella zorra: He aquí, echo fuera demonios y hago curaciones hoy y mañana, y al tercer día termino mi obra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 13, 33, NULL, 'Sin embargo, es necesario que hoy y mañana y pasado mañana siga mi camino; porque no es posible que un profeta muera fuera de Jerusalén.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 13, 34, NULL, '¡Jerusalén, Jerusalén, que matas a los profetas, y apedreas a los que te son enviados! ¡Cuántas veces quise juntar a tus hijos, como la gallina a sus polluelos debajo de sus alas, y no quisiste!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 13, 35, NULL, 'He aquí, vuestra casa os es dejada desierta; y os digo que no me veréis, hasta que llegue el tiempo en que digáis: Bendito el que viene en nombre del Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 14, 1, 'Jesús sana a un hidrópico', 'Aconteció un día de reposo, que habiendo entrado para comer en casa de un gobernante, que era fariseo, estos le acechaban.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 14, 2, NULL, 'Y he aquí estaba delante de él un hombre hidrópico.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 14, 3, NULL, 'Entonces Jesús habló a los intérpretes de la ley y a los fariseos, diciendo: ¿Es lícito sanar en el día de reposo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 14, 4, NULL, 'Mas ellos callaron. Y él, tomándole, le sanó, y le despidió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 14, 5, NULL, 'Y dirigiéndose a ellos, dijo: ¿Quién de vosotros, si su asno o su buey cae en algún pozo, no lo sacará inmediatamente, aunque sea en día de reposo?,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 14, 6, NULL, 'Y no le podían replicar a estas cosas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 14, 7, 'Los convidados a las bodas', 'Observando cómo escogían los primeros asientos a la mesa, refirió a los convidados una parábola, diciéndoles:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 14, 8, NULL, 'Cuando fueres convidado por alguno a bodas, no te sientes en el primer lugar, no sea que otro más distinguido que tú esté convidado por él,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 14, 9, NULL, 'y viniendo el que te convidó a ti y a él, te diga: Da lugar a este; y entonces comiences con vergüenza a ocupar el último lugar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 14, 10, NULL, 'Mas cuando fueres convidado, ve y siéntate en el último lugar, para que cuando venga el que te convidó, te diga: Amigo, sube más arriba; entonces tendrás gloria delante de los que se sientan contigo a la mesa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 14, 11, NULL, 'Porque cualquiera que se enaltece, será humillado; y el que se humilla, será enaltecido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 14, 12, NULL, 'Dijo también al que le había convidado: Cuando hagas comida o cena, no llames a tus amigos, ni a tus hermanos, ni a tus parientes, ni a vecinos ricos; no sea que ellos a su vez te vuelvan a convidar, y seas recompensado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 14, 13, NULL, 'Mas cuando hagas banquete, llama a los pobres, los mancos, los cojos y los ciegos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 14, 14, NULL, 'y serás bienaventurado; porque ellos no te pueden recompensar, pero te será recompensado en la resurrección de los justos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 14, 15, 'Parábola de la gran cena', 'Oyendo esto uno de los que estaban sentados con él a la mesa, le dijo: Bienaventurado el que coma pan en el reino de Dios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 14, 16, NULL, 'Entonces Jesús le dijo: Un hombre hizo una gran cena, y convidó a muchos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 14, 17, NULL, 'Y a la hora de la cena envió a su siervo a decir a los convidados: Venid, que ya todo está preparado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 14, 18, NULL, 'Y todos a una comenzaron a excusarse. El primero dijo: He comprado una hacienda, y necesito ir a verla; te ruego que me excuses.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 14, 19, NULL, 'Otro dijo: He comprado cinco yuntas de bueyes, y voy a probarlos; te ruego que me excuses.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 14, 20, NULL, 'Y otro dijo: Acabo de casarme, y por tanto no puedo ir.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 14, 21, NULL, 'Vuelto el siervo, hizo saber estas cosas a su señor. Entonces enojado el padre de familia, dijo a su siervo: Ve pronto por las plazas y las calles de la ciudad, y trae acá a los pobres, los mancos, los cojos y los ciegos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 14, 22, NULL, 'Y dijo el siervo: Señor, se ha hecho como mandaste, y aún hay lugar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 14, 23, NULL, 'Dijo el señor al siervo: Ve por los caminos y por los vallados, y fuérzalos a entrar, para que se llene mi casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 14, 24, NULL, 'Porque os digo que ninguno de aquellos hombres que fueron convidados, gustará mi cena.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 14, 25, 'Lo que cuesta seguir a Cristo', 'Grandes multitudes iban con él; y volviéndose, les dijo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 14, 26, NULL, 'Si alguno viene a mí, y no aborrece a su padre, y madre, y mujer, e hijos, y hermanos, y hermanas, y aun también su propia vida, no puede ser mi discípulo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 14, 27, NULL, 'Y el que no lleva su cruz y viene en pos de mí, no puede ser mi discípulo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 14, 28, NULL, 'Porque ¿quién de vosotros, queriendo edificar una torre, no se sienta primero y calcula los gastos, a ver si tiene lo que necesita para acabarla?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 14, 29, NULL, 'No sea que después que haya puesto el cimiento, y no pueda acabarla, todos los que lo vean comiencen a hacer burla de él,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 14, 30, NULL, 'diciendo: Este hombre comenzó a edificar, y no pudo acabar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 14, 31, NULL, '¿O qué rey, al marchar a la guerra contra otro rey, no se sienta primero y considera si puede hacer frente con diez mil al que viene contra él con veinte mil?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 14, 32, NULL, 'Y si no puede, cuando el otro está todavía lejos, le envía una embajada y le pide condiciones de paz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 14, 33, NULL, 'Así, pues, cualquiera de vosotros que no renuncia a todo lo que posee, no puede ser mi discípulo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 14, 34, 'Cuando la sal pierde su sabor', 'Buena es la sal; mas si la sal se hiciere insípida, ¿con qué se sazonará?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 14, 35, NULL, 'Ni para la tierra ni para el muladar es útil; la arrojan fuera. El que tiene oídos para oír, oiga.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 15, 1, 'Parábola de la oveja perdida', 'Se acercaban a Jesús todos los publicanos y pecadores para oírle,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 15, 2, NULL, 'y los fariseos y los escribas murmuraban, diciendo: Este a los pecadores recibe, y con ellos come.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 15, 3, NULL, 'Entonces él les refirió esta parábola, diciendo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 15, 4, NULL, '¿Qué hombre de vosotros, teniendo cien ovejas, si pierde una de ellas, no deja las noventa y nueve en el desierto, y va tras la que se perdió, hasta encontrarla?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 15, 5, NULL, 'Y cuando la encuentra, la pone sobre sus hombros gozoso;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 15, 6, NULL, 'y al llegar a casa, reúne a sus amigos y vecinos, diciéndoles: Gozaos conmigo, porque he encontrado mi oveja que se había perdido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 15, 7, NULL, 'Os digo que así habrá más gozo en el cielo por un pecador que se arrepiente, que por noventa y nueve justos que no necesitan de arrepentimiento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 15, 8, 'Parábola de la moneda perdida', '¿O qué mujer que tiene diez dracmas, si pierde una dracma, no enciende la lámpara, y barre la casa, y busca con diligencia hasta encontrarla?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 15, 9, NULL, 'Y cuando la encuentra, reúne a sus amigas y vecinas, diciendo: Gozaos conmigo, porque he encontrado la dracma que había perdido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 15, 10, NULL, 'Así os digo que hay gozo delante de los ángeles de Dios por un pecador que se arrepiente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 15, 11, 'Parábola del hijo pródigo', 'También dijo: Un hombre tenía dos hijos;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 15, 12, NULL, 'y el menor de ellos dijo a su padre: Padre, dame la parte de los bienes que me corresponde; y les repartió los bienes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 15, 13, NULL, 'No muchos días después, juntándolo todo el hijo menor, se fue lejos a una provincia apartada; y allí desperdició sus bienes viviendo perdidamente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 15, 14, NULL, 'Y cuando todo lo hubo malgastado, vino una gran hambre en aquella provincia, y comenzó a faltarle.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 15, 15, NULL, 'Y fue y se arrimó a uno de los ciudadanos de aquella tierra, el cual le envió a su hacienda para que apacentase cerdos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 15, 16, NULL, 'Y deseaba llenar su vientre de las algarrobas que comían los cerdos, pero nadie le daba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 15, 17, NULL, 'Y volviendo en sí, dijo: ¡Cuántos jornaleros en casa de mi padre tienen abundancia de pan, y yo aquí perezco de hambre!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 15, 18, NULL, 'Me levantaré e iré a mi padre, y le diré: Padre, he pecado contra el cielo y contra ti.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 15, 19, NULL, 'Ya no soy digno de ser llamado tu hijo; hazme como a uno de tus jornaleros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 15, 20, NULL, 'Y levantándose, vino a su padre. Y cuando aún estaba lejos, lo vio su padre, y fue movido a misericordia, y corrió, y se echó sobre su cuello, y le besó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 15, 21, NULL, 'Y el hijo le dijo: Padre, he pecado contra el cielo y contra ti, y ya no soy digno de ser llamado tu hijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 15, 22, NULL, 'Pero el padre dijo a sus siervos: Sacad el mejor vestido, y vestidle; y poned un anillo en su mano, y calzado en sus pies.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 15, 23, NULL, 'Y traed el becerro gordo y matadlo, y comamos y hagamos fiesta;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 15, 24, NULL, 'porque este mi hijo muerto era, y ha revivido; se había perdido, y es hallado. Y comenzaron a regocijarse.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 15, 25, NULL, 'Y su hijo mayor estaba en el campo; y cuando vino, y llegó cerca de la casa, oyó la música y las danzas;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 15, 26, NULL, 'y llamando a uno de los criados, le preguntó qué era aquello.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 15, 27, NULL, 'Él le dijo: Tu hermano ha venido; y tu padre ha hecho matar el becerro gordo, por haberle recibido bueno y sano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 15, 28, NULL, 'Entonces se enojó, y no quería entrar. Salió por tanto su padre, y le rogaba que entrase.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 15, 29, NULL, 'Mas él, respondiendo, dijo al padre: He aquí, tantos años te sirvo, no habiéndote desobedecido jamás, y nunca me has dado ni un cabrito para gozarme con mis amigos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 15, 30, NULL, 'Pero cuando vino este tu hijo, que ha consumido tus bienes con rameras, has hecho matar para él el becerro gordo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 15, 31, NULL, 'Él entonces le dijo: Hijo, tú siempre estás conmigo, y todas mis cosas son tuyas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 15, 32, NULL, 'Mas era necesario hacer fiesta y regocijarnos, porque este tu hermano era muerto, y ha revivido; se había perdido, y es hallado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 16, 1, 'Parábola del mayordomo infiel', 'Dijo también a sus discípulos: Había un hombre rico que tenía un mayordomo, y este fue acusado ante él como disipador de sus bienes.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 16, 2, NULL, 'Entonces le llamó, y le dijo: ¿Qué es esto que oigo acerca de ti? Da cuenta de tu mayordomía, porque ya no podrás más ser mayordomo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 16, 3, NULL, 'Entonces el mayordomo dijo para sí: ¿Qué haré? Porque mi amo me quita la mayordomía. Cavar, no puedo; mendigar, me da vergüenza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 16, 4, NULL, 'Ya sé lo que haré para que cuando se me quite de la mayordomía, me reciban en sus casas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 16, 5, NULL, 'Y llamando a cada uno de los deudores de su amo, dijo al primero: ¿Cuánto debes a mi amo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 16, 6, NULL, 'Él dijo: Cien barriles de aceite. Y le dijo: Toma tu cuenta, siéntate pronto, y escribe cincuenta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 16, 7, NULL, 'Después dijo a otro: Y tú, ¿cuánto debes? Y él dijo: Cien medidas de trigo. Él le dijo: Toma tu cuenta, y escribe ochenta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 16, 8, NULL, 'Y alabó el amo al mayordomo malo por haber hecho sagazmente; porque los hijos de este siglo son más sagaces en el trato con sus semejantes que los hijos de luz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 16, 9, NULL, 'Y yo os digo: Ganad amigos por medio de las riquezas injustas, para que cuando estas falten, os reciban en las moradas eternas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 16, 10, NULL, 'El que es fiel en lo muy poco, también en lo más es fiel; y el que en lo muy poco es injusto, también en lo más es injusto.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 16, 11, NULL, 'Pues si en las riquezas injustas no fuisteis fieles, ¿quién os confiará lo verdadero?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 16, 12, NULL, 'Y si en lo ajeno no fuisteis fieles, ¿quién os dará lo que es vuestro?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 16, 13, NULL, 'Ningún siervo puede servir a dos señores; porque o aborrecerá al uno y amará al otro, o estimará al uno y menospreciará al otro. No podéis servir a Dios y a las riquezas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 16, 14, NULL, 'Y oían también todas estas cosas los fariseos, que eran avaros, y se burlaban de él.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 16, 15, NULL, 'Entonces les dijo: Vosotros sois los que os justificáis a vosotros mismos delante de los hombres; mas Dios conoce vuestros corazones; porque lo que los hombres tienen por sublime, delante de Dios es abominación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 16, 16, 'La ley y el reino de Dios', 'La ley y los profetas eran hasta Juan; desde entonces el reino de Dios es anunciado, y todos se esfuerzan por entrar en él.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 16, 17, NULL, 'Pero más fácil es que pasen el cielo y la tierra, que se frustre una tilde de la ley.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 16, 18, 'Jesús enseña sobre el divorcio', 'Todo el que repudia a su mujer, y se casa con otra, adultera; y el que se casa con la repudiada del marido, adultera.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 16, 19, 'El rico y Lázaro', 'Había un hombre rico, que se vestía de púrpura y de lino fino, y hacía cada día banquete con esplendidez.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 16, 20, NULL, 'Había también un mendigo llamado Lázaro, que estaba echado a la puerta de aquel, lleno de llagas,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 16, 21, NULL, 'y ansiaba saciarse de las migajas que caían de la mesa del rico; y aun los perros venían y le lamían las llagas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 16, 22, NULL, 'Aconteció que murió el mendigo, y fue llevado por los ángeles al seno de Abraham; y murió también el rico, y fue sepultado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 16, 23, NULL, 'Y en el Hades alzó sus ojos, estando en tormentos, y vio de lejos a Abraham, y a Lázaro en su seno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 16, 24, NULL, 'Entonces él, dando voces, dijo: Padre Abraham, ten misericordia de mí, y envía a Lázaro para que moje la punta de su dedo en agua, y refresque mi lengua; porque estoy atormentado en esta llama.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 16, 25, NULL, 'Pero Abraham le dijo: Hijo, acuérdate que recibiste tus bienes en tu vida, y Lázaro también males; pero ahora este es consolado aquí, y tú atormentado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 16, 26, NULL, 'Además de todo esto, una gran sima está puesta entre nosotros y vosotros, de manera que los que quisieren pasar de aquí a vosotros, no pueden, ni de allá pasar acá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 16, 27, NULL, 'Entonces le dijo: Te ruego, pues, padre, que le envíes a la casa de mi padre,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 16, 28, NULL, 'porque tengo cinco hermanos, para que les testifique, a fin de que no vengan ellos también a este lugar de tormento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 16, 29, NULL, 'Y Abraham le dijo: A Moisés y a los profetas tienen; óiganlos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 16, 30, NULL, 'Él entonces dijo: No, padre Abraham; pero si alguno fuere a ellos de entre los muertos, se arrepentirán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 16, 31, NULL, 'Mas Abraham le dijo: Si no oyen a Moisés y a los profetas, tampoco se persuadirán aunque alguno se levantare de los muertos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 17, 1, 'Ocasiones de caer', 'Dijo Jesús a sus discípulos: Imposible es que no vengan tropiezos; mas ¡ay de aquel por quien vienen!', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 17, 2, NULL, 'Mejor le fuera que se le atase al cuello una piedra de molino y se le arrojase al mar, que hacer tropezar a uno de estos pequeñitos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 17, 3, NULL, 'Mirad por vosotros mismos. Si tu hermano pecare contra ti, repréndele; y si se arrepintiere, perdónale.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 17, 4, NULL, 'Y si siete veces al día pecare contra ti, y siete veces al día volviere a ti, diciendo: Me arrepiento; perdónale.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 17, 5, 'Auméntanos la fe', 'Dijeron los apóstoles al Señor: Auméntanos la fe.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 17, 6, NULL, 'Entonces el Señor dijo: Si tuvierais fe como un grano de mostaza, podríais decir a este sicómoro: Desarráigate, y plántate en el mar; y os obedecería.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 17, 7, 'El deber del siervo', '¿Quién de vosotros, teniendo un siervo que ara o apacienta ganado, al volver él del campo, luego le dice: Pasa, siéntate a la mesa?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 17, 8, NULL, '¿No le dice más bien: Prepárame la cena, cíñete, y sírveme hasta que haya comido y bebido; y después de esto, come y bebe tú?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 17, 9, NULL, '¿Acaso da gracias al siervo porque hizo lo que se le había mandado? Pienso que no.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 17, 10, NULL, 'Así también vosotros, cuando hayáis hecho todo lo que os ha sido ordenado, decid: Siervos inútiles somos, pues lo que debíamos hacer, hicimos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 17, 11, 'Diez leprosos son limpiados', 'Yendo Jesús a Jerusalén, pasaba entre Samaria y Galilea.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 17, 12, NULL, 'Y al entrar en una aldea, le salieron al encuentro diez hombres leprosos, los cuales se pararon de lejos', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 17, 13, NULL, 'y alzaron la voz, diciendo: ¡Jesús, Maestro, ten misericordia de nosotros!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 17, 14, NULL, 'Cuando él los vio, les dijo: Id, mostraos a los sacerdotes. Y aconteció que mientras iban, fueron limpiados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 17, 15, NULL, 'Entonces uno de ellos, viendo que había sido sanado, volvió, glorificando a Dios a gran voz,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 17, 16, NULL, 'y se postró rostro en tierra a sus pies, dándole gracias; y este era samaritano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 17, 17, NULL, 'Respondiendo Jesús, dijo: ¿No son diez los que fueron limpiados? Y los nueve, ¿dónde están?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 17, 18, NULL, '¿No hubo quien volviese y diese gloria a Dios sino este extranjero?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 17, 19, NULL, 'Y le dijo: Levántate, vete; tu fe te ha salvado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 17, 20, 'La venida del Reino', 'Preguntado por los fariseos, cuándo había de venir el reino de Dios, les respondió y dijo: El reino de Dios no vendrá con advertencia,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 17, 21, NULL, 'ni dirán: Helo aquí, o helo allí; porque he aquí el reino de Dios está entre vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 17, 22, NULL, 'Y dijo a sus discípulos: Tiempo vendrá cuando desearéis ver uno de los días del Hijo del Hombre, y no lo veréis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 17, 23, NULL, 'Y os dirán: Helo aquí, o helo allí. No vayáis, ni los sigáis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 17, 24, NULL, 'Porque como el relámpago que al fulgurar resplandece desde un extremo del cielo hasta el otro, así también será el Hijo del Hombre en su día.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 17, 25, NULL, 'Pero primero es necesario que padezca mucho, y sea desechado por esta generación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 17, 26, NULL, 'Como fue en los días de Noé, así también será en los días del Hijo del Hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 17, 27, NULL, 'Comían, bebían, se casaban y se daban en casamiento, hasta el día en que entró Noé en el arca, y vino el diluvio y los destruyó a todos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 17, 28, NULL, 'Asimismo como sucedió en los días de Lot; comían, bebían, compraban, vendían, plantaban, edificaban;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 17, 29, NULL, 'mas el día en que Lot salió de Sodoma, llovió del cielo fuego y azufre, y los destruyó a todos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 17, 30, NULL, 'Así será el día en que el Hijo del Hombre se manifieste.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 17, 31, NULL, 'En aquel día, el que esté en la azotea, y sus bienes en casa, no descienda a tomarlos; y el que en el campo, asimismo no vuelva atrás.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 17, 32, NULL, 'Acordaos de la mujer de Lot.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 17, 33, NULL, 'Todo el que procure salvar su vida, la perderá; y todo el que la pierda, la salvará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 17, 34, NULL, 'Os digo que en aquella noche estarán dos en una cama; el uno será tomado, y el otro será dejado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 17, 35, NULL, 'Dos mujeres estarán moliendo juntas; la una será tomada, y la otra dejada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 17, 36, NULL, 'Dos estarán en el campo; el uno será tomado, y el otro dejado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 17, 37, NULL, 'Y respondiendo, le dijeron: ¿Dónde, Señor? Él les dijo: Donde estuviere el cuerpo, allí se juntarán también las águilas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 1, 'Parábola de la viuda y el juez injusto', 'También les refirió Jesús una parábola sobre la necesidad de orar siempre, y no desmayar,', 1, 'spa', 'RVR1960', NULL);\n"
;

  public static final String SQL_PARTE_4 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Lc', 18, 2, NULL, 'diciendo: Había en una ciudad un juez, que ni temía a Dios, ni respetaba a hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 3, NULL, 'Había también en aquella ciudad una viuda, la cual venía a él, diciendo: Hazme justicia de mi adversario.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 4, NULL, 'Y él no quiso por algún tiempo; pero después de esto dijo dentro de sí: Aunque ni temo a Dios, ni tengo respeto a hombre,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 5, NULL, 'sin embargo, porque esta viuda me es molesta, le haré justicia, no sea que viniendo de continuo, me agote la paciencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 6, NULL, 'Y dijo el Señor: Oíd lo que dijo el juez injusto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 7, NULL, '¿Y acaso Dios no hará justicia a sus escogidos, que claman a él día y noche? ¿Se tardará en responderles?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 8, NULL, 'Os digo que pronto les hará justicia. Pero cuando venga el Hijo del Hombre, ¿hallará fe en la tierra?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 9, 'Parábola del fariseo y el publicano', 'A unos que confiaban en sí mismos como justos, y menospreciaban a los otros, dijo también esta parábola:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 10, NULL, 'Dos hombres subieron al templo a orar: uno era fariseo, y el otro publicano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 11, NULL, 'El fariseo, puesto en pie, oraba consigo mismo de esta manera: Dios, te doy gracias porque no soy como los otros hombres, ladrones, injustos, adúlteros, ni aun como este publicano;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 12, NULL, 'ayuno dos veces a la semana, doy diezmos de todo lo que gano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 13, NULL, 'Mas el publicano, estando lejos, no quería ni aun alzar los ojos al cielo, sino que se golpeaba el pecho, diciendo: Dios, sé propicio a mí, pecador.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 14, NULL, 'Os digo que este descendió a su casa justificado antes que el otro; porque cualquiera que se enaltece, será humillado; y el que se humilla será enaltecido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 15, 'Jesús bendice a los niños', 'Traían a él los niños para que los tocase; lo cual viendo los discípulos, les reprendieron.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 16, NULL, 'Mas Jesús, llamándolos, dijo: Dejad a los niños venir a mí, y no se lo impidáis; porque de los tales es el reino de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 17, NULL, 'De cierto os digo, que el que no recibe el reino de Dios como un niño, no entrará en él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 18, 'El joven rico', 'Un hombre principal le preguntó, diciendo: Maestro bueno, ¿qué haré para heredar la vida eterna?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 19, NULL, 'Jesús le dijo: ¿Por qué me llamas bueno? Ninguno hay bueno, sino solo Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 20, NULL, 'Los mandamientos sabes: No adulterarás; no matarás; no hurtarás; no dirás falso testimonio; honra a tu padre y a tu madre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 21, NULL, 'Él dijo: Todo esto lo he guardado desde mi juventud.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 22, NULL, 'Jesús, oyendo esto, le dijo: Aún te falta una cosa: vende todo lo que tienes, y dalo a los pobres, y tendrás tesoro en el cielo; y ven, sígueme.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 23, NULL, 'Entonces él, oyendo esto, se puso muy triste, porque era muy rico.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 24, NULL, 'Al ver Jesús que se había entristecido mucho, dijo: ¡Cuán difícilmente entrarán en el reino de Dios los que tienen riquezas!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 25, NULL, 'Porque es más fácil pasar un camello por el ojo de una aguja, que entrar un rico en el reino de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 26, NULL, 'Y los que oyeron esto dijeron: ¿Quién, pues, podrá ser salvo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 27, NULL, 'Él les dijo: Lo que es imposible para los hombres, es posible para Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 28, NULL, 'Entonces Pedro dijo: He aquí, nosotros hemos dejado nuestras posesiones y te hemos seguido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 29, NULL, 'Y él les dijo: De cierto os digo, que no hay nadie que haya dejado casa, o padres, o hermanos, o mujer, o hijos, por el reino de Dios,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 30, NULL, 'que no haya de recibir mucho más en este tiempo, y en el siglo venidero la vida eterna.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 31, 'Nuevamente Jesús anuncia su muerte', 'Tomando Jesús a los doce, les dijo: He aquí subimos a Jerusalén, y se cumplirán todas las cosas escritas por los profetas acerca del Hijo del Hombre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 32, NULL, 'Pues será entregado a los gentiles, y será escarnecido, y afrentado, y escupido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 33, NULL, 'Y después que le hayan azotado, le matarán; mas al tercer día resucitará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 34, NULL, 'Pero ellos nada comprendieron de estas cosas, y esta palabra les era encubierta, y no entendían lo que se les decía.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 35, 'Un ciego de Jericó recibe la vista', 'Aconteció que acercándose Jesús a Jericó, un ciego estaba sentado junto al camino mendigando;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 36, NULL, 'y al oír a la multitud que pasaba, preguntó qué era aquello.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 37, NULL, 'Y le dijeron que pasaba Jesús nazareno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 38, NULL, 'Entonces dio voces, diciendo: ¡Jesús, Hijo de David, ten misericordia de mí!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 39, NULL, 'Y los que iban delante le reprendían para que callase; pero él clamaba mucho más: ¡Hijo de David, ten misericordia de mí!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 40, NULL, 'Jesús entonces, deteniéndose, mandó traerle a su presencia; y cuando llegó, le preguntó,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 41, NULL, 'diciendo: ¿Qué quieres que te haga? Y él dijo: Señor, que reciba la vista.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 42, NULL, 'Jesús le dijo: Recíbela, tu fe te ha salvado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 18, 43, NULL, 'Y luego vio, y le seguía, glorificando a Dios; y todo el pueblo, cuando vio aquello, dio alabanza a Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 1, 'Jesús y Zaqueo', 'Habiendo entrado Jesús en Jericó, iba pasando por la ciudad.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 2, NULL, 'Y sucedió que un varón llamado Zaqueo, que era jefe de los publicanos, y rico,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 3, NULL, 'procuraba ver quién era Jesús; pero no podía a causa de la multitud, pues era pequeño de estatura.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 4, NULL, 'Y corriendo delante, subió a un árbol sicómoro para verle; porque había de pasar por allí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 5, NULL, 'Cuando Jesús llegó a aquel lugar, mirando hacia arriba, le vio, y le dijo: Zaqueo, date prisa, desciende, porque hoy es necesario que pose yo en tu casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 6, NULL, 'Entonces él descendió aprisa, y le recibió gozoso.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 7, NULL, 'Al ver esto, todos murmuraban, diciendo que había entrado a posar con un hombre pecador.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 8, NULL, 'Entonces Zaqueo, puesto en pie, dijo al Señor: He aquí, Señor, la mitad de mis bienes doy a los pobres; y si en algo he defraudado a alguno, se lo devuelvo cuadruplicado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 9, NULL, 'Jesús le dijo: Hoy ha venido la salvación a esta casa; por cuanto él también es hijo de Abraham.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 10, NULL, 'Porque el Hijo del Hombre vino a buscar y a salvar lo que se había perdido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 11, 'Parábola de las diez minas', 'Oyendo ellos estas cosas, prosiguió Jesús y dijo una parábola, por cuanto estaba cerca de Jerusalén, y ellos pensaban que el reino de Dios se manifestaría inmediatamente.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 12, NULL, 'Dijo, pues: Un hombre noble se fue a un país lejano, para recibir un reino y volver.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 13, NULL, 'Y llamando a diez siervos suyos, les dio diez minas, y les dijo: Negociad entre tanto que vengo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 14, NULL, 'Pero sus conciudadanos le aborrecían, y enviaron tras él una embajada, diciendo: No queremos que este reine sobre nosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 15, NULL, 'Aconteció que vuelto él, después de recibir el reino, mandó llamar ante él a aquellos siervos a los cuales había dado el dinero, para saber lo que había negociado cada uno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 16, NULL, 'Vino el primero, diciendo: Señor, tu mina ha ganado diez minas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 17, NULL, 'Él le dijo: Está bien, buen siervo; por cuanto en lo poco has sido fiel, tendrás autoridad sobre diez ciudades.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 18, NULL, 'Vino otro, diciendo: Señor, tu mina ha producido cinco minas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 19, NULL, 'Y también a este dijo: Tú también sé sobre cinco ciudades.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 20, NULL, 'Vino otro, diciendo: Señor, aquí está tu mina, la cual he tenido guardada en un pañuelo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 21, NULL, 'porque tuve miedo de ti, por cuanto eres hombre severo, que tomas lo que no pusiste, y siegas lo que no sembraste.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 22, NULL, 'Entonces él le dijo: Mal siervo, por tu propia boca te juzgo. Sabías que yo era hombre severo, que tomo lo que no puse, y que siego lo que no sembré;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 23, NULL, '¿por qué, pues, no pusiste mi dinero en el banco, para que al volver yo, lo hubiera recibido con los intereses?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 24, NULL, 'Y dijo a los que estaban presentes: Quitadle la mina, y dadla al que tiene las diez minas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 25, NULL, 'Ellos le dijeron: Señor, tiene diez minas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 26, NULL, 'Pues yo os digo que a todo el que tiene, se le dará; mas al que no tiene, aun lo que tiene se le quitará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 27, NULL, 'Y también a aquellos mis enemigos que no querían que yo reinase sobre ellos, traedlos acá, y decapitadlos delante de mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 28, 'La entrada triunfal en Jerusalén', 'Dicho esto, iba delante subiendo a Jerusalén.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 29, NULL, 'Y aconteció que llegando cerca de Betfagé y de Betania, al monte que se llama de los Olivos, envió dos de sus discípulos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 30, NULL, 'diciendo: Id a la aldea de enfrente, y al entrar en ella hallaréis un pollino atado, en el cual ningún hombre ha montado jamás; desatadlo, y traedlo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 31, NULL, 'Y si alguien os preguntare: ¿Por qué lo desatáis? le responderéis así: Porque el Señor lo necesita.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 32, NULL, 'Fueron los que habían sido enviados, y hallaron como les dijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 33, NULL, 'Y cuando desataban el pollino, sus dueños les dijeron: ¿Por qué desatáis el pollino?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 34, NULL, 'Ellos dijeron: Porque el Señor lo necesita.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 35, NULL, 'Y lo trajeron a Jesús; y habiendo echado sus mantos sobre el pollino, subieron a Jesús encima.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 36, NULL, 'Y a su paso tendían sus mantos por el camino.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 37, NULL, 'Cuando llegaban ya cerca de la bajada del monte de los Olivos, toda la multitud de los discípulos, gozándose, comenzó a alabar a Dios a grandes voces por todas las maravillas que habían visto,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 38, NULL, 'diciendo: ¡Bendito el rey que viene en el nombre del Señor; paz en el cielo, y gloria en las alturas!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 39, NULL, 'Entonces algunos de los fariseos de entre la multitud le dijeron: Maestro, reprende a tus discípulos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 40, NULL, 'Él, respondiendo, les dijo: Os digo que si estos callaran, las piedras clamarían.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 41, NULL, 'Y cuando llegó cerca de la ciudad, al verla, lloró sobre ella,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 42, NULL, 'diciendo: ¡Oh, si también tú conocieses, a lo menos en este tu día, lo que es para tu paz! Mas ahora está encubierto de tus ojos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 43, NULL, 'Porque vendrán días sobre ti, cuando tus enemigos te rodearán con vallado, y te sitiarán, y por todas partes te estrecharán,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 44, NULL, 'y te derribarán a tierra, y a tus hijos dentro de ti, y no dejarán en ti piedra sobre piedra, por cuanto no conociste el tiempo de tu visitación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 45, 'Purificación del templo', 'Y entrando en el templo, comenzó a echar fuera a todos los que vendían y compraban en él,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 46, NULL, 'diciéndoles: Escrito está: Mi casa es casa de oración; mas vosotros la habéis hecho cueva de ladrones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 47, NULL, 'Y enseñaba cada día en el templo; pero los principales sacerdotes, los escribas y los principales del pueblo procuraban matarle.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 19, 48, NULL, 'Y no hallaban nada que pudieran hacerle, porque todo el pueblo estaba suspenso oyéndole.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 1, 'La autoridad de Jesús', 'Sucedió un día, que enseñando Jesús al pueblo en el templo, y anunciando el evangelio, llegaron los principales sacerdotes y los escribas, con los ancianos,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 2, NULL, 'y le hablaron diciendo: Dinos: ¿con qué autoridad haces estas cosas?, ¿o quién es el que te ha dado esta autoridad?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 3, NULL, 'Respondiendo Jesús, les dijo: Os haré yo también una pregunta; respondedme:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 4, NULL, 'El bautismo de Juan, ¿era del cielo, o de los hombres?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 5, NULL, 'Entonces ellos discutían entre sí, diciendo: Si decimos, del cielo, dirá: ¿Por qué, pues, no le creísteis?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 6, NULL, 'Y si decimos, de los hombres, todo el pueblo nos apedreará; porque están persuadidos de que Juan era profeta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 7, NULL, 'Y respondieron que no sabían de dónde fuese.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 8, NULL, 'Entonces Jesús les dijo: Yo tampoco os diré con qué autoridad hago estas cosas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 9, 'Los labradores malvados', 'Comenzó luego a decir al pueblo esta parábola: Un hombre plantó una viña, la arrendó a labradores, y se ausentó por mucho tiempo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 10, NULL, 'Y a su tiempo envió un siervo a los labradores, para que le diesen del fruto de la viña; pero los labradores le golpearon, y le enviaron con las manos vacías.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 11, NULL, 'Volvió a enviar otro siervo; mas ellos a este también, golpeado y afrentado, le enviaron con las manos vacías.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 12, NULL, 'Volvió a enviar un tercer siervo; mas ellos también a este echaron fuera, herido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 13, NULL, 'Entonces el señor de la viña dijo: ¿Qué haré? Enviaré a mi hijo amado; quizá cuando le vean a él, le tendrán respeto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 14, NULL, 'Mas los labradores, al verle, discutían entre sí, diciendo: Este es el heredero; venid, matémosle, para que la heredad sea nuestra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 15, NULL, 'Y le echaron fuera de la viña, y le mataron. ¿Qué, pues, les hará el señor de la viña?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 16, NULL, 'Vendrá y destruirá a estos labradores, y dará su viña a otros. Cuando ellos oyeron esto, dijeron: ¡Dios nos libre!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 17, NULL, 'Pero él, mirándolos, dijo: ¿Qué, pues, es lo que está escrito: La piedra que desecharon los edificadores Ha venido a ser cabeza del ángulo?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 18, NULL, 'Todo el que cayere sobre aquella piedra, será quebrantado; mas sobre quien ella cayere, le desmenuzará.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 19, 'La cuestión del tributo', 'Procuraban los principales sacerdotes y los escribas echarle mano en aquella hora, porque comprendieron que contra ellos había dicho esta parábola; pero temieron al pueblo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 20, NULL, 'Y acechándole enviaron espías que se simulasen justos, a fin de sorprenderle en alguna palabra, para entregarle al poder y autoridad del gobernador.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 21, NULL, 'Y le preguntaron, diciendo: Maestro, sabemos que dices y enseñas rectamente, y que no haces acepción de persona, sino que enseñas el camino de Dios con verdad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 22, NULL, '¿Nos es lícito dar tributo a César, o no?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 23, NULL, 'Mas él, comprendiendo la astucia de ellos, les dijo: ¿Por qué me tentáis?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 24, NULL, 'Mostradme la moneda. ¿De quién tiene la imagen y la inscripción? Y respondiendo dijeron: De César.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 25, NULL, 'Entonces les dijo: Pues dad a César lo que es de César, y a Dios lo que es de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 26, NULL, 'Y no pudieron sorprenderle en palabra alguna delante del pueblo, sino que maravillados de su respuesta, callaron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 27, 'La pregunta sobre la resurrección', 'Llegando entonces algunos de los saduceos, los cuales niegan haber resurrección, le preguntaron,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 28, NULL, 'diciendo: Maestro, Moisés nos escribió: Si el hermano de alguno muriere teniendo mujer, y no dejare hijos, que su hermano se case con ella, y levante descendencia a su hermano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 29, NULL, 'Hubo, pues, siete hermanos; y el primero tomó esposa, y murió sin hijos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 30, NULL, 'Y la tomó el segundo, el cual también murió sin hijos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 31, NULL, 'La tomó el tercero, y así todos los siete, y murieron sin dejar descendencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 32, NULL, 'Finalmente murió también la mujer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 33, NULL, 'En la resurrección, pues, ¿de cuál de ellos será mujer, ya que los siete la tuvieron por mujer?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 34, NULL, 'Entonces respondiendo Jesús, les dijo: Los hijos de este siglo se casan, y se dan en casamiento;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 35, NULL, 'mas los que fueren tenidos por dignos de alcanzar aquel siglo y la resurrección de entre los muertos, ni se casan, ni se dan en casamiento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 36, NULL, 'Porque no pueden ya más morir, pues son iguales a los ángeles, y son hijos de Dios, al ser hijos de la resurrección.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 37, NULL, 'Pero en cuanto a que los muertos han de resucitar, aun Moisés lo enseñó en el pasaje de la zarza, cuando llama al Señor, Dios de Abraham, Dios de Isaac y Dios de Jacob.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 38, NULL, 'Porque Dios no es Dios de muertos, sino de vivos, pues para él todos viven.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 39, NULL, 'Respondiéndole algunos de los escribas, dijeron: Maestro, bien has dicho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 40, NULL, 'Y no osaron preguntarle nada más.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 41, '¿De quién es hijo el Cristo?', 'Entonces él les dijo: ¿Cómo dicen que el Cristo es hijo de David?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 42, NULL, 'Pues el mismo David dice en el libro de los Salmos: Dijo el Señor a mi Señor: Siéntate a mi diestra,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 43, NULL, 'Hasta que ponga a tus enemigos por estrado de tus pies.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 44, NULL, 'David, pues, le llama Señor; ¿cómo entonces es su hijo?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 45, 'Jesús acusa a los escribas', 'Y oyéndole todo el pueblo, dijo a sus discípulos:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 46, NULL, 'Guardaos de los escribas, que gustan de andar con ropas largas, y aman las salutaciones en las plazas, y las primeras sillas en las sinagogas, y los primeros asientos en las cenas;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 20, 47, NULL, 'que devoran las casas de las viudas, y por pretexto hacen largas oraciones; estos recibirán mayor condenación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 21, 1, 'La ofrenda de la viuda', 'Levantando los ojos, vio a los ricos que echaban sus ofrendas en el arca de las ofrendas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 21, 2, NULL, 'Vio también a una viuda muy pobre, que echaba allí dos blancas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 21, 3, NULL, 'Y dijo: En verdad os digo, que esta viuda pobre echó más que todos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 21, 4, NULL, 'Porque todos aquellos echaron para las ofrendas de Dios de lo que les sobra; mas esta, de su pobreza echó todo el sustento que tenía.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 21, 5, 'Jesús predice la destrucción del templo', 'Y a unos que hablaban de que el templo estaba adornado de hermosas piedras y ofrendas votivas, dijo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 21, 6, NULL, 'En cuanto a estas cosas que veis, días vendrán en que no quedará piedra sobre piedra, que no sea destruida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 21, 7, 'Señales antes del fin', 'Y le preguntaron, diciendo: Maestro, ¿cuándo será esto? ¿y qué señal habrá cuando estas cosas estén para suceder?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 21, 8, NULL, 'Él entonces dijo: Mirad que no seáis engañados; porque vendrán muchos en mi nombre, diciendo: Yo soy el Cristo, y: El tiempo está cerca. Mas no vayáis en pos de ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 21, 9, NULL, 'Y cuando oigáis de guerras y de sediciones, no os alarméis; porque es necesario que estas cosas acontezcan primero; pero el fin no será inmediatamente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 21, 10, NULL, 'Entonces les dijo: Se levantará nación contra nación, y reino contra reino;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 21, 11, NULL, 'y habrá grandes terremotos, y en diferentes lugares hambres y pestilencias; y habrá terror y grandes señales del cielo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 21, 12, NULL, 'Pero antes de todas estas cosas os echarán mano, y os perseguirán, y os entregarán a las sinagogas y a las cárceles, y seréis llevados ante reyes y ante gobernadores por causa de mi nombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 21, 13, NULL, 'Y esto os será ocasión para dar testimonio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 21, 14, NULL, 'Proponed en vuestros corazones no pensar antes cómo habéis de responder en vuestra defensa;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 21, 15, NULL, 'porque yo os daré palabra y sabiduría, la cual no podrán resistir ni contradecir todos los que se opongan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 21, 16, NULL, 'Mas seréis entregados aun por vuestros padres, y hermanos, y parientes, y amigos; y matarán a algunos de vosotros;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 21, 17, NULL, 'y seréis aborrecidos de todos por causa de mi nombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 21, 18, NULL, 'Pero ni un cabello de vuestra cabeza perecerá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 21, 19, NULL, 'Con vuestra paciencia ganaréis vuestras almas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 21, 20, NULL, 'Pero cuando viereis a Jerusalén rodeada de ejércitos, sabed entonces que su destrucción ha llegado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 21, 21, NULL, 'Entonces los que estén en Judea, huyan a los montes; y los que en medio de ella, váyanse; y los que estén en los campos, no entren en ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 21, 22, NULL, 'Porque estos son días de retribución, para que se cumplan todas las cosas que están escritas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 21, 23, NULL, 'Mas ¡ay de las que estén encintas, y de las que críen en aquellos días! porque habrá gran calamidad en la tierra, e ira sobre este pueblo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 21, 24, NULL, 'Y caerán a filo de espada, y serán llevados cautivos a todas las naciones; y Jerusalén será hollada por los gentiles, hasta que los tiempos de los gentiles se cumplan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 21, 25, 'La venida del Hijo del Hombre', 'Entonces habrá señales en el sol, en la luna y en las estrellas, y en la tierra angustia de las gentes, confundidas a causa del bramido del mar y de las olas;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 21, 26, NULL, 'desfalleciendo los hombres por el temor y la expectación de las cosas que sobrevendrán en la tierra; porque las potencias de los cielos serán conmovidas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 21, 27, NULL, 'Entonces verán al Hijo del Hombre, que vendrá en una nube con poder y gran gloria.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 21, 28, NULL, 'Cuando estas cosas comiencen a suceder, erguíos y levantad vuestra cabeza, porque vuestra redención está cerca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 21, 29, NULL, 'También les dijo una parábola: Mirad la higuera y todos los árboles.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 21, 30, NULL, 'Cuando ya brotan, viéndolo, sabéis por vosotros mismos que el verano está ya cerca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 21, 31, NULL, 'Así también vosotros, cuando veáis que suceden estas cosas, sabed que está cerca el reino de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 21, 32, NULL, 'De cierto os digo, que no pasará esta generación hasta que todo esto acontezca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 21, 33, NULL, 'El cielo y la tierra pasarán, pero mis palabras no pasarán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 21, 34, NULL, 'Mirad también por vosotros mismos, que vuestros corazones no se carguen de glotonería y embriaguez y de los afanes de esta vida, y venga de repente sobre vosotros aquel día.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 21, 35, NULL, 'Porque como un lazo vendrá sobre todos los que habitan sobre la faz de toda la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 21, 36, NULL, 'Velad, pues, en todo tiempo orando que seáis tenidos por dignos de escapar de todas estas cosas que vendrán, y de estar en pie delante del Hijo del Hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 21, 37, NULL, 'Y enseñaba de día en el templo; y de noche, saliendo, se estaba en el monte que se llama de los Olivos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 21, 38, NULL, 'Y todo el pueblo venía a él por la mañana, para oírle en el templo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 1, 'El complot para matar a Jesús', 'Estaba cerca la fiesta de los panes sin levadura, que se llama la pascua.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 2, NULL, 'Y los principales sacerdotes y los escribas buscaban cómo matarle; porque temían al pueblo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 3, NULL, 'Y entró Satanás en Judas, por sobrenombre Iscariote, el cual era uno del número de los doce;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 4, NULL, 'y este fue y habló con los principales sacerdotes, y con los jefes de la guardia, de cómo se lo entregaría.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 5, NULL, 'Ellos se alegraron, y convinieron en darle dinero.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 6, NULL, 'Y él se comprometió, y buscaba una oportunidad para entregárselo a espaldas del pueblo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 7, 'Institución de la Cena del Señor', 'Llegó el día de los panes sin levadura, en el cual era necesario sacrificar el cordero de la pascua.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 8, NULL, 'Y Jesús envió a Pedro y a Juan, diciendo: Id, preparadnos la pascua para que la comamos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 9, NULL, 'Ellos le dijeron: ¿Dónde quieres que la preparemos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 10, NULL, 'Él les dijo: He aquí, al entrar en la ciudad os saldrá al encuentro un hombre que lleva un cántaro de agua; seguidle hasta la casa donde entrare,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 11, NULL, 'y decid al padre de familia de esa casa: El Maestro te dice: ¿Dónde está el aposento donde he de comer la pascua con mis discípulos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 12, NULL, 'Entonces él os mostrará un gran aposento alto ya dispuesto; preparad allí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 13, NULL, 'Fueron, pues, y hallaron como les había dicho; y prepararon la pascua.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 14, NULL, 'Cuando era la hora, se sentó a la mesa, y con él los apóstoles.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 15, NULL, 'Y les dijo: ¡Cuánto he deseado comer con vosotros esta pascua antes que padezca!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 16, NULL, 'Porque os digo que no la comeré más, hasta que se cumpla en el reino de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 17, NULL, 'Y habiendo tomado la copa, dio gracias, y dijo: Tomad esto, y repartidlo entre vosotros;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 18, NULL, 'porque os digo que no beberé más del fruto de la vid, hasta que el reino de Dios venga.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 19, NULL, 'Y tomó el pan y dio gracias, y lo partió y les dio, diciendo: Esto es mi cuerpo, que por vosotros es dado; haced esto en memoria de mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 20, NULL, 'De igual manera, después que hubo cenado, tomó la copa, diciendo: Esta copa es el nuevo pacto en mi sangre, que por vosotros se derrama.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 21, NULL, 'Mas he aquí, la mano del que me entrega está conmigo en la mesa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 22, NULL, 'A la verdad el Hijo del Hombre va, según lo que está determinado; pero ¡ay de aquel hombre por quien es entregado!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 23, NULL, 'Entonces ellos comenzaron a discutir entre sí, quién de ellos sería el que había de hacer esto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 24, 'La grandeza en el servicio', 'Hubo también entre ellos una disputa sobre quién de ellos sería el mayor.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 25, NULL, 'Pero él les dijo: Los reyes de las naciones se enseñorean de ellas, y los que sobre ellas tienen autoridad son llamados bienhechores;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 26, NULL, 'mas no así vosotros, sino sea el mayor entre vosotros como el más joven, y el que dirige, como el que sirve.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 27, NULL, 'Porque, ¿cuál es mayor, el que se sienta a la mesa, o el que sirve? ¿No es el que se sienta a la mesa? Mas yo estoy entre vosotros como el que sirve.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 28, NULL, 'Pero vosotros sois los que habéis permanecido conmigo en mis pruebas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 29, NULL, 'Yo, pues, os asigno un reino, como mi Padre me lo asignó a mí,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 30, NULL, 'para que comáis y bebáis a mi mesa en mi reino, y os sentéis en tronos juzgando a las doce tribus de Israel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 31, 'Jesús anuncia la negación de Pedro', 'Dijo también el Señor: Simón, Simón, he aquí Satanás os ha pedido para zarandearos como a trigo;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 32, NULL, 'pero yo he rogado por ti, que tu fe no falte; y tú, una vez vuelto, confirma a tus hermanos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 33, NULL, 'Él le dijo: Señor, dispuesto estoy a ir contigo no solo a la cárcel, sino también a la muerte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 34, NULL, 'Y él le dijo: Pedro, te digo que el gallo no cantará hoy antes que tú niegues tres veces que me conoces.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 35, 'Bolsa, alforja y espada', 'Y a ellos dijo: Cuando os envié sin bolsa, sin alforja, y sin calzado, ¿os faltó algo? Ellos dijeron: Nada.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 36, NULL, 'Y les dijo: Pues ahora, el que tiene bolsa, tómela, y también la alforja; y el que no tiene espada, venda su capa y compre una.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 37, NULL, 'Porque os digo que es necesario que se cumpla todavía en mí aquello que está escrito: Y fue contado con los inicuos; porque lo que está escrito de mí, tiene cumplimiento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 38, NULL, 'Entonces ellos dijeron: Señor, aquí hay dos espadas. Y él les dijo: Basta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 39, 'Jesús ora en Getsemaní', 'Y saliendo, se fue, como solía, al monte de los Olivos; y sus discípulos también le siguieron.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 40, NULL, 'Cuando llegó a aquel lugar, les dijo: Orad que no entréis en tentación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 41, NULL, 'Y él se apartó de ellos a distancia como de un tiro de piedra; y puesto de rodillas oró,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 42, NULL, 'diciendo: Padre, si quieres, pasa de mí esta copa; pero no se haga mi voluntad, sino la tuya.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 43, NULL, 'Y se le apareció un ángel del cielo para fortalecerle.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 44, NULL, 'Y estando en agonía, oraba más intensamente; y era su sudor como grandes gotas de sangre que caían hasta la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 45, NULL, 'Cuando se levantó de la oración, y vino a sus discípulos, los halló durmiendo a causa de la tristeza;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 46, NULL, 'y les dijo: ¿Por qué dormís? Levantaos, y orad para que no entréis en tentación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 47, 'Arresto de Jesús', 'Mientras él aún hablaba, se presentó una turba; y el que se llamaba Judas, uno de los doce, iba al frente de ellos; y se acercó hasta Jesús para besarle.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 48, NULL, 'Entonces Jesús le dijo: Judas, ¿con un beso entregas al Hijo del Hombre?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 49, NULL, 'Viendo los que estaban con él lo que había de acontecer, le dijeron: Señor, ¿heriremos a espada?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 50, NULL, 'Y uno de ellos hirió a un siervo del sumo sacerdote, y le cortó la oreja derecha.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 51, NULL, 'Entonces respondiendo Jesús, dijo: Basta ya; dejad. Y tocando su oreja, le sanó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 52, NULL, 'Y Jesús dijo a los principales sacerdotes, a los jefes de la guardia del templo y a los ancianos, que habían venido contra él: ¿Como contra un ladrón habéis salido con espadas y palos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 53, NULL, 'Habiendo estado con vosotros cada día en el templo, no extendisteis las manos contra mí; mas esta es vuestra hora, y la potestad de las tinieblas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 54, 'Pedro niega a Jesús', 'Y prendiéndole, le llevaron, y le condujeron a casa del sumo sacerdote. Y Pedro le seguía de lejos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 55, NULL, 'Y habiendo ellos encendido fuego en medio del patio, se sentaron alrededor; y Pedro se sentó también entre ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 56, NULL, 'Pero una criada, al verle sentado al fuego, se fijó en él, y dijo: También este estaba con él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 57, NULL, 'Pero él lo negó, diciendo: Mujer, no lo conozco.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 58, NULL, 'Un poco después, viéndole otro, dijo: Tú también eres de ellos. Y Pedro dijo: Hombre, no lo soy.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 59, NULL, 'Como una hora después, otro afirmaba, diciendo: Verdaderamente también este estaba con él, porque es galileo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 60, NULL, 'Y Pedro dijo: Hombre, no sé lo que dices. Y en seguida, mientras él todavía hablaba, el gallo cantó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 61, NULL, 'Entonces, vuelto el Señor, miró a Pedro; y Pedro se acordó de la palabra del Señor, que le había dicho: Antes que el gallo cante, me negarás tres veces.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 62, NULL, 'Y Pedro, saliendo fuera, lloró amargamente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 63, 'Jesús escarnecido y azotado', 'Y los hombres que custodiaban a Jesús se burlaban de él y le golpeaban;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 64, NULL, 'y vendándole los ojos, le golpeaban el rostro, y le preguntaban, diciendo: Profetiza, ¿quién es el que te golpeó?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 65, NULL, 'Y decían otras muchas cosas injuriándole.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 66, 'Jesús ante el concilio', 'Cuando era de día, se juntaron los ancianos del pueblo, los principales sacerdotes y los escribas, y le trajeron al concilio, diciendo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 67, NULL, '¿Eres tú el Cristo? Dínoslo. Y les dijo: Si os lo dijere, no creeréis;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 68, NULL, 'y también si os preguntare, no me responderéis, ni me soltaréis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 69, NULL, 'Pero desde ahora el Hijo del Hombre se sentará a la diestra del poder de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 70, NULL, 'Dijeron todos: ¿Luego eres tú el Hijo de Dios? Y él les dijo: Vosotros decís que lo soy.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 22, 71, NULL, 'Entonces ellos dijeron: ¿Qué más testimonio necesitamos? porque nosotros mismos lo hemos oído de su boca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 1, 'Jesús ante Pilato', 'Levantándose entonces toda la muchedumbre de ellos, llevaron a Jesús a Pilato.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 2, NULL, 'Y comenzaron a acusarle, diciendo: A este hemos hallado que pervierte a la nación, y que prohíbe dar tributo a César, diciendo que él mismo es el Cristo, un rey.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 3, NULL, 'Entonces Pilato le preguntó, diciendo: ¿Eres tú el Rey de los judíos? Y respondiéndole él, dijo: Tú lo dices.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 4, NULL, 'Y Pilato dijo a los principales sacerdotes, y a la gente: Ningún delito hallo en este hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 5, NULL, 'Pero ellos porfiaban, diciendo: Alborota al pueblo, enseñando por toda Judea, comenzando desde Galilea hasta aquí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 6, 'Jesús ante Herodes', 'Entonces Pilato, oyendo decir, Galilea, preguntó si el hombre era galileo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 7, NULL, 'Y al saber que era de la jurisdicción de Herodes, le remitió a Herodes, que en aquellos días también estaba en Jerusalén.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 8, NULL, 'Herodes, viendo a Jesús, se alegró mucho, porque hacía tiempo que deseaba verle; porque había oído muchas cosas acerca de él, y esperaba verle hacer alguna señal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 9, NULL, 'Y le hacía muchas preguntas, pero él nada le respondió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 10, NULL, 'Y estaban los principales sacerdotes y los escribas acusándole con gran vehemencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 11, NULL, 'Entonces Herodes con sus soldados le menospreció y escarneció, vistiéndole de una ropa espléndida; y volvió a enviarle a Pilato.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 12, NULL, 'Y se hicieron amigos Pilato y Herodes aquel día; porque antes estaban enemistados entre sí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 13, 'Jesús sentenciado a muerte', 'Entonces Pilato, convocando a los principales sacerdotes, a los gobernantes, y al pueblo,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 14, NULL, 'les dijo: Me habéis presentado a este como un hombre que perturba al pueblo; pero habiéndole interrogado yo delante de vosotros, no he hallado en este hombre delito alguno de aquellos de que le acusáis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 15, NULL, 'Y ni aun Herodes, porque os remití a él; y he aquí, nada digno de muerte ha hecho este hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 16, NULL, 'Le soltaré, pues, después de castigarle.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 17, NULL, 'Y tenía necesidad de soltarles uno en cada fiesta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 18, NULL, 'Mas toda la multitud dio voces a una, diciendo: ¡Fuera con este, y suéltanos a Barrabás!', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 19, NULL, 'Este había sido echado en la cárcel por sedición en la ciudad, y por un homicidio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 20, NULL, 'Les habló otra vez Pilato, queriendo soltar a Jesús;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 21, NULL, 'pero ellos volvieron a dar voces, diciendo: ¡Crucifícale, crucifícale!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 22, NULL, 'Él les dijo por tercera vez: ¿Pues qué mal ha hecho este? Ningún delito digno de muerte he hallado en él; le castigaré, pues, y le soltaré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 23, NULL, 'Mas ellos instaban a grandes voces, pidiendo que fuese crucificado. Y las voces de ellos y de los principales sacerdotes prevalecieron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 24, NULL, 'Entonces Pilato sentenció que se hiciese lo que ellos pedían;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 25, NULL, 'y les soltó a aquel que había sido echado en la cárcel por sedición y homicidio, a quien habían pedido; y entregó a Jesús a la voluntad de ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 26, 'Crucifixión y muerte de Jesús', 'Y llevándole, tomaron a cierto Simón de Cirene, que venía del campo, y le pusieron encima la cruz para que la llevase tras Jesús.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 27, NULL, 'Y le seguía gran multitud del pueblo, y de mujeres que lloraban y hacían lamentación por él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 28, NULL, 'Pero Jesús, vuelto hacia ellas, les dijo: Hijas de Jerusalén, no lloréis por mí, sino llorad por vosotras mismas y por vuestros hijos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 29, NULL, 'Porque he aquí vendrán días en que dirán: Bienaventuradas las estériles, y los vientres que no concibieron, y los pechos que no criaron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 30, NULL, 'Entonces comenzarán a decir a los montes: Caed sobre nosotros; y a los collados: Cubridnos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 31, NULL, 'Porque si en el árbol verde hacen estas cosas, ¿en el seco, qué no se hará?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 32, NULL, 'Llevaban también con él a otros dos, que eran malhechores, para ser muertos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 33, NULL, 'Y cuando llegaron al lugar llamado de la Calavera, le crucificaron allí, y a los malhechores, uno a la derecha y otro a la izquierda.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 34, NULL, 'Y Jesús decía: Padre, perdónalos, porque no saben lo que hacen. Y repartieron entre sí sus vestidos, echando suertes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 35, NULL, 'Y el pueblo estaba mirando; y aun los gobernantes se burlaban de él, diciendo: A otros salvó; sálvese a sí mismo, si este es el Cristo, el escogido de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 36, NULL, 'Los soldados también le escarnecían, acercándose y presentándole vinagre,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 37, NULL, 'y diciendo: Si tú eres el Rey de los judíos, sálvate a ti mismo.', 0, 'spa', 'RVR1960', NULL);\n"
;

  public static final String SQL_PARTE_5 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Lc', 23, 38, NULL, 'Había también sobre él un título escrito con letras griegas, latinas y hebreas: ESTE ES EL REY DE LOS JUDÍOS.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 39, NULL, 'Y uno de los malhechores que estaban colgados le injuriaba, diciendo: Si tú eres el Cristo, sálvate a ti mismo y a nosotros.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 40, NULL, 'Respondiendo el otro, le reprendió, diciendo: ¿Ni aun temes tú a Dios, estando en la misma condenación?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 41, NULL, 'Nosotros, a la verdad, justamente padecemos, porque recibimos lo que merecieron nuestros hechos; mas este ningún mal hizo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 42, NULL, 'Y dijo a Jesús: Acuérdate de mí cuando vengas en tu reino.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 43, NULL, 'Entonces Jesús le dijo: De cierto te digo que hoy estarás conmigo en el paraíso.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 44, NULL, 'Cuando era como la hora sexta, hubo tinieblas sobre toda la tierra hasta la hora novena.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 45, NULL, 'Y el sol se oscureció, y el velo del templo se rasgó por la mitad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 46, NULL, 'Entonces Jesús, clamando a gran voz, dijo: Padre, en tus manos encomiendo mi espíritu. Y habiendo dicho esto, expiró.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 47, NULL, 'Cuando el centurión vio lo que había acontecido, dio gloria a Dios, diciendo: Verdaderamente este hombre era justo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 48, NULL, 'Y toda la multitud de los que estaban presentes en este espectáculo, viendo lo que había acontecido, se volvían golpeándose el pecho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 49, NULL, 'Pero todos sus conocidos, y las mujeres que le habían seguido desde Galilea, estaban lejos mirando estas cosas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 50, 'Jesús es sepultado', 'Había un varón llamado José, de Arimatea, ciudad de Judea, el cual era miembro del concilio, varón bueno y justo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 51, NULL, 'Este, que también esperaba el reino de Dios, y no había consentido en el acuerdo ni en los hechos de ellos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 52, NULL, 'fue a Pilato, y pidió el cuerpo de Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 53, NULL, 'Y quitándolo, lo envolvió en una sábana, y lo puso en un sepulcro abierto en una peña, en el cual aún no se había puesto a nadie.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 54, NULL, 'Era día de la preparación, y estaba para comenzar el día de reposo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 55, NULL, 'Y las mujeres que habían venido con él desde Galilea, siguieron también, y vieron el sepulcro, y cómo fue puesto su cuerpo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 23, 56, NULL, 'Y vueltas, prepararon especias aromáticas y ungüentos; y descansaron el día de reposo, conforme al mandamiento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 1, 'La resurrección', 'El primer día de la semana, muy de mañana, vinieron al sepulcro, trayendo las especias aromáticas que habían preparado, y algunas otras mujeres con ellas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 2, NULL, 'Y hallaron removida la piedra del sepulcro;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 3, NULL, 'y entrando, no hallaron el cuerpo del Señor Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 4, NULL, 'Aconteció que estando ellas perplejas por esto, he aquí se pararon junto a ellas dos varones con vestiduras resplandecientes;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 5, NULL, 'y como tuvieron temor, y bajaron el rostro a tierra, les dijeron: ¿Por qué buscáis entre los muertos al que vive?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 6, NULL, 'No está aquí, sino que ha resucitado. Acordaos de lo que os habló, cuando aún estaba en Galilea,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 7, NULL, 'diciendo: Es necesario que el Hijo del Hombre sea entregado en manos de hombres pecadores, y que sea crucificado, y resucite al tercer día.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 8, NULL, 'Entonces ellas se acordaron de sus palabras,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 9, NULL, 'y volviendo del sepulcro, dieron nuevas de todas estas cosas a los once, y a todos los demás.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 10, NULL, 'Eran María Magdalena, y Juana, y María madre de Jacobo, y las demás con ellas, quienes dijeron estas cosas a los apóstoles.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 11, NULL, 'Mas a ellos les parecían locura las palabras de ellas, y no las creían.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 12, NULL, 'Pero levantándose Pedro, corrió al sepulcro; y cuando miró dentro, vio los lienzos solos, y se fue a casa maravillándose de lo que había sucedido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 13, 'En el camino a Emaús', 'Y he aquí, dos de ellos iban el mismo día a una aldea llamada Emaús, que estaba a sesenta estadios de Jerusalén.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 14, NULL, 'E iban hablando entre sí de todas aquellas cosas que habían acontecido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 15, NULL, 'Sucedió que mientras hablaban y discutían entre sí, Jesús mismo se acercó, y caminaba con ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 16, NULL, 'Mas los ojos de ellos estaban velados, para que no le conociesen.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 17, NULL, 'Y les dijo: ¿Qué pláticas son estas que tenéis entre vosotros mientras camináis, y por qué estáis tristes?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 18, NULL, 'Respondiendo uno de ellos, que se llamaba Cleofas, le dijo: ¿Eres tú el único forastero en Jerusalén que no has sabido las cosas que en ella han acontecido en estos días?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 19, NULL, 'Entonces él les dijo: ¿Qué cosas? Y ellos le dijeron: De Jesús nazareno, que fue varón profeta, poderoso en obra y en palabra delante de Dios y de todo el pueblo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 20, NULL, 'y cómo le entregaron los principales sacerdotes y nuestros gobernantes a sentencia de muerte, y le crucificaron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 21, NULL, 'Pero nosotros esperábamos que él era el que había de redimir a Israel; y ahora, además de todo esto, hoy es ya el tercer día que esto ha acontecido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 22, NULL, 'Aunque también nos han asombrado unas mujeres de entre nosotros, las que antes del día fueron al sepulcro;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 23, NULL, 'y como no hallaron su cuerpo, vinieron diciendo que también habían visto visión de ángeles, quienes dijeron que él vive.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 24, NULL, 'Y fueron algunos de los nuestros al sepulcro, y hallaron así como las mujeres habían dicho, pero a él no le vieron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 25, NULL, 'Entonces él les dijo: ¡Oh insensatos, y tardos de corazón para creer todo lo que los profetas han dicho!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 26, NULL, '¿No era necesario que el Cristo padeciera estas cosas, y que entrara en su gloria?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 27, NULL, 'Y comenzando desde Moisés, y siguiendo por todos los profetas, les declaraba en todas las Escrituras lo que de él decían.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 28, NULL, 'Llegaron a la aldea adonde iban, y él hizo como que iba más lejos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 29, NULL, 'Mas ellos le obligaron a quedarse, diciendo: Quédate con nosotros, porque se hace tarde, y el día ya ha declinado. Entró, pues, a quedarse con ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 30, NULL, 'Y aconteció que estando sentado con ellos a la mesa, tomó el pan y lo bendijo, lo partió, y les dio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 31, NULL, 'Entonces les fueron abiertos los ojos, y le reconocieron; mas él se desapareció de su vista.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 32, NULL, 'Y se decían el uno al otro: ¿No ardía nuestro corazón en nosotros, mientras nos hablaba en el camino, y cuando nos abría las Escrituras?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 33, NULL, 'Y levantándose en la misma hora, volvieron a Jerusalén, y hallaron a los once reunidos, y a los que estaban con ellos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 34, NULL, 'que decían: Ha resucitado el Señor verdaderamente, y ha aparecido a Simón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 35, NULL, 'Entonces ellos contaban las cosas que les habían acontecido en el camino, y cómo le habían reconocido al partir el pan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 36, 'Jesús se aparece a los discípulos', 'Mientras ellos aún hablaban de estas cosas, Jesús se puso en medio de ellos, y les dijo: Paz a vosotros.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 37, NULL, 'Entonces, espantados y atemorizados, pensaban que veían espíritu.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 38, NULL, 'Pero él les dijo: ¿Por qué estáis turbados, y vienen a vuestro corazón estos pensamientos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 39, NULL, 'Mirad mis manos y mis pies, que yo mismo soy; palpad, y ved; porque un espíritu no tiene carne ni huesos, como veis que yo tengo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 40, NULL, 'Y diciendo esto, les mostró las manos y los pies.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 41, NULL, 'Y como todavía ellos, de gozo, no lo creían, y estaban maravillados, les dijo: ¿Tenéis aquí algo de comer?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 42, NULL, 'Entonces le dieron parte de un pez asado, y un panal de miel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 43, NULL, 'Y él lo tomó, y comió delante de ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 44, NULL, 'Y les dijo: Estas son las palabras que os hablé, estando aún con vosotros: que era necesario que se cumpliese todo lo que está escrito de mí en la ley de Moisés, en los profetas y en los salmos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 45, NULL, 'Entonces les abrió el entendimiento, para que comprendiesen las Escrituras;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 46, NULL, 'y les dijo: Así está escrito, y así fue necesario que el Cristo padeciese, y resucitase de los muertos al tercer día;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 47, NULL, 'y que se predicase en su nombre el arrepentimiento y el perdón de pecados en todas las naciones, comenzando desde Jerusalén.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 48, NULL, 'Y vosotros sois testigos de estas cosas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 49, NULL, 'He aquí, yo enviaré la promesa de mi Padre sobre vosotros; pero quedaos vosotros en la ciudad de Jerusalén, hasta que seáis investidos de poder desde lo alto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 50, 'La ascensión', 'Y los sacó fuera hasta Betania, y alzando sus manos, los bendijo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 51, NULL, 'Y aconteció que bendiciéndolos, se separó de ellos, y fue llevado arriba al cielo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 52, NULL, 'Ellos, después de haberle adorado, volvieron a Jerusalén con gran gozo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Lc', 24, 53, NULL, 'y estaban siempre en el templo, alabando y bendiciendo a Dios. Amén.', 0, 'spa', 'RVR1960', NULL);\n"
;

}