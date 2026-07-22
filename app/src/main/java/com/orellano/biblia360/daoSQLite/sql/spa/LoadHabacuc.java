package com.orellano.biblia360.daoSQLite.sql.spa;

public final class LoadHabacuc {
  public LoadHabacuc() {}
  public static final String SQL_PARTE_1 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Hab', 1, 1, 'Habacuc se queja de injusticia', 'La profecía que vio el profeta Habacuc.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 1, 2, NULL, '¿Hasta cuándo, oh Jehová, clamaré, y no oirás; y daré voces a ti a causa de la violencia, y no salvarás?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 1, 3, NULL, '¿Por qué me haces ver iniquidad, y haces que vea molestia? Destrucción y violencia están delante de mí, y pleito y contienda se levantan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 1, 4, NULL, 'Por lo cual la ley es debilitada, y el juicio no sale según la verdad; por cuanto el impío asedia al justo, por eso sale torcida la justicia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 1, 5, 'Los caldeos castigarán a Judá', 'Mirad entre las naciones, y ved, y asombraos; porque haré una obra en vuestros días, que aun cuando se os contare, no la creeréis.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 1, 6, NULL, 'Porque he aquí, yo levanto a los caldeos, nación cruel y presurosa, que camina por la anchura de la tierra para poseer las moradas ajenas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 1, 7, NULL, 'Formidable es y terrible; de ella misma procede su justicia y su dignidad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 1, 8, NULL, 'Sus caballos serán más ligeros que leopardos, y más feroces que lobos nocturnos, y sus jinetes se multiplicarán; vendrán de lejos sus jinetes, y volarán como águilas que se apresuran a devorar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 1, 9, NULL, 'Toda ella vendrá a la presa; el terror va delante de ella, y recogerá cautivos como arena.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 1, 10, NULL, 'Escarnecerá a los reyes, y de los príncipes hará burla; se reirá de toda fortaleza, y levantará terraplén y la tomará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 1, 11, NULL, 'Luego pasará como el huracán, y ofenderá atribuyendo su fuerza a su dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 1, 12, 'Protesta de Habacuc', '¿No eres tú desde el principio, oh Jehová, Dios mío, Santo mío? No moriremos. Oh Jehová, para juicio lo pusiste; y tú, oh Roca, lo fundaste para castigar.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 1, 13, NULL, 'Muy limpio eres de ojos para ver el mal, ni puedes ver el agravio; ¿por qué ves a los menospreciadores, y callas cuando destruye el impío al más justo que él,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 1, 14, NULL, 'y haces que sean los hombres como los peces del mar, como reptiles que no tienen quien los gobierne?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 1, 15, NULL, 'Sacará a todos con anzuelo, los recogerá con su red, y los juntará en sus mallas; por lo cual se alegrará y se regocijará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 1, 16, NULL, 'Por esto hará sacrificios a su red, y ofrecerá sahumerios a sus mallas; porque con ellas engordó su porción, y engrasó su comida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 1, 17, NULL, '¿Vaciará por eso su red, y no tendrá piedad de aniquilar naciones continuamente?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 2, 1, 'Jehová responde a Habacuc', 'Sobre mi guarda estaré, y sobre la fortaleza afirmaré el pie, y velaré para ver lo que se me dirá, y qué he de responder tocante a mi queja.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 2, 2, NULL, 'Y Jehová me respondió, y dijo: Escribe la visión, y declárala en tablas, para que corra el que leyere en ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 2, 3, NULL, 'Aunque la visión tardará aún por un tiempo, mas se apresura hacia el fin, y no mentirá; aunque tardare, espéralo, porque sin duda vendrá, no tardará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 2, 4, NULL, 'He aquí que aquel cuya alma no es recta, se enorgullece; mas el justo por su fe vivirá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 2, 5, NULL, 'Y también, el que es dado al vino es traicionero, hombre soberbio, que no permanecerá; ensanchó como el Seol su alma, y es como la muerte, que no se saciará; antes reunió para sí todas las gentes, y juntó para sí todos los pueblos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 2, 6, 'Ayes contra los injustos', '¿No han de levantar todos estos refrán sobre él, y sarcasmos contra él? Dirán: ¡Ay del que multiplicó lo que no era suyo! ¿Hasta cuándo había de acumular sobre sí prenda tras prenda?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 2, 7, NULL, '¿No se levantarán de repente tus deudores, y se despertarán los que te harán temblar, y serás despojo para ellos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 2, 8, NULL, 'Por cuanto tú has despojado a muchas naciones, todos los otros pueblos te despojarán, a causa de la sangre de los hombres, y de los robos de la tierra, de las ciudades y de todos los que habitan en ellas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 2, 9, NULL, '¡Ay del que codicia injusta ganancia para su casa, para poner en alto su nido, para escaparse del poder del mal!', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 2, 10, NULL, 'Tomaste consejo vergonzoso para tu casa, asolaste muchos pueblos, y has pecado contra tu vida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 2, 11, NULL, 'Porque la piedra clamará desde el muro, y la tabla del enmaderado le responderá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 2, 12, NULL, '¡Ay del que edifica la ciudad con sangre, y del que funda una ciudad con iniquidad!', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 2, 13, NULL, '¿No es esto de Jehová de los ejércitos? Los pueblos, pues, trabajarán para el fuego, y las naciones se fatigarán en vano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 2, 14, NULL, 'Porque la tierra será llena del conocimiento de la gloria de Jehová, como las aguas cubren el mar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 2, 15, NULL, '¡Ay del que da de beber a su prójimo! ¡Ay de ti, que le acercas tu hiel, y le embriagas para mirar su desnudez!', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 2, 16, NULL, 'Te has llenado de deshonra más que de honra; bebe tú también, y serás descubierto; el cáliz de la mano derecha de Jehová vendrá hasta ti, y vómito de afrenta sobre tu gloria.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 2, 17, NULL, 'Porque la rapiña del Líbano caerá sobre ti, y la destrucción de las fieras te quebrantará, a causa de la sangre de los hombres, y del robo de la tierra, de las ciudades y de todos los que en ellas habitaban.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 2, 18, NULL, '¿De qué sirve la escultura que esculpió el que la hizo?, ¿la estatua de fundición que enseña mentira, para que haciendo imágenes mudas confíe el hacedor en su obra?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 2, 19, NULL, '¡Ay del que dice al palo: Despiértate; y a la piedra muda: Levántate! ¿Podrá él enseñar? He aquí está cubierto de oro y plata, y no hay espíritu dentro de él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 2, 20, NULL, 'Mas Jehová está en su santo templo; calle delante de él toda la tierra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 3, 1, 'Oración de Habacuc', 'Oración del profeta Habacuc, sobre Sigionot.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 3, 2, NULL, 'Oh Jehová, he oído tu palabra, y temí. Oh Jehová, aviva tu obra en medio de los tiempos, En medio de los tiempos hazla conocer; En la ira acuérdate de la misericordia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 3, 3, NULL, 'Dios vendrá de Temán, Y el Santo desde el monte de Parán. Selah Su gloria cubrió los cielos, Y la tierra se llenó de su alabanza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 3, 4, NULL, 'Y el resplandor fue como la luz; Rayos brillantes salían de su mano, Y allí estaba escondido su poder.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 3, 5, NULL, 'Delante de su rostro iba mortandad, Y a sus pies salían carbones encendidos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 3, 6, NULL, 'Se levantó, y midió la tierra; Miró, e hizo temblar las gentes; Los montes antiguos fueron desmenuzados, Los collados antiguos se humillaron. Sus caminos son eternos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 3, 7, NULL, 'He visto las tiendas de Cusán en aflicción; Las tiendas de la tierra de Madián temblaron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 3, 8, NULL, '¿Te airaste, oh Jehová, contra los ríos? ¿Contra los ríos te airaste? ¿Fue tu ira contra el mar Cuando montaste en tus caballos, Y en tus carros de victoria?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 3, 9, NULL, 'Se descubrió enteramente tu arco; Los juramentos a las tribus fueron palabra segura. Selah Hendiste la tierra con ríos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 3, 10, NULL, 'Te vieron y tuvieron temor los montes; Pasó la inundación de las aguas; El abismo dio su voz, A lo alto alzó sus manos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 3, 11, NULL, 'El sol y la luna se pararon en su lugar; A la luz de tus saetas anduvieron, Y al resplandor de tu fulgente lanza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 3, 12, NULL, 'Con ira hollaste la tierra, Con furor trillaste las naciones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 3, 13, NULL, 'Saliste para socorrer a tu pueblo, Para socorrer a tu ungido. Traspasaste la cabeza de la casa del impío, Descubriendo el cimiento hasta la roca. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 3, 14, NULL, 'Horadaste con sus propios dardos las cabezas de sus guerreros, Que como tempestad acometieron para dispersarme, Cuyo regocijo era como para devorar al pobre encubiertamente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 3, 15, NULL, 'Caminaste en el mar con tus caballos, Sobre la mole de las grandes aguas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 3, 16, NULL, 'Oí, y se conmovieron mis entrañas; A la voz temblaron mis labios; Pudrición entró en mis huesos, y dentro de mí me estremecí; Si bien estaré quieto en el día de la angustia, Cuando suba al pueblo el que lo invadirá con sus tropas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 3, 17, NULL, 'Aunque la higuera no florezca, Ni en las vides haya frutos, Aunque falte el producto del olivo, Y los labrados no den mantenimiento, Y las ovejas sean quitadas de la majada, Y no haya vacas en los corrales;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 3, 18, NULL, 'Con todo, yo me alegraré en Jehová, Y me gozaré en el Dios de mi salvación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hab', 3, 19, NULL, 'Jehová el Señor es mi fortaleza, El cual hace mis pies como de ciervas, Y en mis alturas me hace andar.', 0, 'spa', 'RVR1960', NULL);\n"
;

}