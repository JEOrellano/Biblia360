package com.orellano.biblia360.daoSQLite.sql.spa;

public final class LoadProverbios {
  public LoadProverbios() {}
  public static final String SQL_PARTE_1 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Pr', 1, 1, 'Motivo de los proverbios', 'Los proverbios de Salomón, hijo de David, rey de Israel.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 1, 2, NULL, 'Para entender sabiduría y doctrina, Para conocer razones prudentes,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 1, 3, NULL, 'Para recibir el consejo de prudencia, Justicia, juicio y equidad;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 1, 4, NULL, 'Para dar sagacidad a los simples, Y a los jóvenes inteligencia y cordura.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 1, 5, NULL, 'Oirá el sabio, y aumentará el saber, Y el entendido adquirirá consejo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 1, 6, NULL, 'Para entender proverbio y declaración, Palabras de sabios, y sus dichos profundos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 1, 7, NULL, 'El principio de la sabiduría es el temor de Jehová; Los insensatos desprecian la sabiduría y la enseñanza.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 1, 8, 'Amonestaciones de la Sabiduría', 'Oye, hijo mío, la instrucción de tu padre, Y no desprecies la dirección de tu madre;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 1, 9, NULL, 'Porque adorno de gracia serán a tu cabeza, Y collares a tu cuello.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 1, 10, NULL, 'Hijo mío, si los pecadores te quisieren engañar, No consientas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 1, 11, NULL, 'Si dijeren: Ven con nosotros; Pongamos asechanzas para derramar sangre, Acechemos sin motivo al inocente;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 1, 12, NULL, 'Los tragaremos vivos como el Seol, Y enteros, como los que caen en un abismo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 1, 13, NULL, 'Hallaremos riquezas de toda clase, Llenaremos nuestras casas de despojos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 1, 14, NULL, 'Echa tu suerte entre nosotros; Tengamos todos una bolsa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 1, 15, NULL, 'Hijo mío, no andes en camino con ellos. Aparta tu pie de sus veredas,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 1, 16, NULL, 'Porque sus pies corren hacia el mal, Y van presurosos a derramar sangre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 1, 17, NULL, 'Porque en vano se tenderá la red Ante los ojos de toda ave;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 1, 18, NULL, 'Pero ellos a su propia sangre ponen asechanzas, Y a sus almas tienden lazo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 1, 19, NULL, 'Tales son las sendas de todo el que es dado a la codicia, La cual quita la vida de sus poseedores.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 1, 20, NULL, 'La sabiduría clama en las calles, Alza su voz en las plazas;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 1, 21, NULL, 'Clama en los principales lugares de reunión; En las entradas de las puertas de la ciudad dice sus razones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 1, 22, NULL, '¿Hasta cuándo, oh simples, amaréis la simpleza, Y los burladores desearán el burlar, Y los insensatos aborrecerán la ciencia?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 1, 23, NULL, 'Volveos a mi reprensión; He aquí yo derramaré mi espíritu sobre vosotros, Y os haré saber mis palabras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 1, 24, NULL, 'Por cuanto llamé, y no quisisteis oír, Extendí mi mano, y no hubo quien atendiese,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 1, 25, NULL, 'Sino que desechasteis todo consejo mío Y mi reprensión no quisisteis,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 1, 26, NULL, 'También yo me reiré en vuestra calamidad, Y me burlaré cuando os viniere lo que teméis;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 1, 27, NULL, 'Cuando viniere como una destrucción lo que teméis, Y vuestra calamidad llegare como un torbellino; Cuando sobre vosotros viniere tribulación y angustia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 1, 28, NULL, 'Entonces me llamarán, y no responderé; Me buscarán de mañana, y no me hallarán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 1, 29, NULL, 'Por cuanto aborrecieron la sabiduría, Y no escogieron el temor de Jehová,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 1, 30, NULL, 'Ni quisieron mi consejo, Y menospreciaron toda reprensión mía,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 1, 31, NULL, 'Comerán del fruto de su camino, Y serán hastiados de sus propios consejos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 1, 32, NULL, 'Porque el desvío de los ignorantes los matará, Y la prosperidad de los necios los echará a perder;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 1, 33, NULL, 'Mas el que me oyere, habitará confiadamente Y vivirá tranquilo, sin temor del mal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 2, 1, 'Excelencias de la sabiduría', 'Hijo mío, si recibieres mis palabras, Y mis mandamientos guardares dentro de ti,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 2, 2, NULL, 'Haciendo estar atento tu oído a la sabiduría; Si inclinares tu corazón a la prudencia,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 2, 3, NULL, 'Si clamares a la inteligencia, Y a la prudencia dieres tu voz;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 2, 4, NULL, 'Si como a la plata la buscares, Y la escudriñares como a tesoros,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 2, 5, NULL, 'Entonces entenderás el temor de Jehová, Y hallarás el conocimiento de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 2, 6, NULL, 'Porque Jehová da la sabiduría, Y de su boca viene el conocimiento y la inteligencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 2, 7, NULL, 'Él provee de sana sabiduría a los rectos; Es escudo a los que caminan rectamente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 2, 8, NULL, 'Es el que guarda las veredas del juicio, Y preserva el camino de sus santos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 2, 9, NULL, 'Entonces entenderás justicia, juicio Y equidad, y todo buen camino.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 2, 10, NULL, 'Cuando la sabiduría entrare en tu corazón, Y la ciencia fuere grata a tu alma,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 2, 11, NULL, 'La discreción te guardará; Te preservará la inteligencia,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 2, 12, NULL, 'Para librarte del mal camino, De los hombres que hablan perversidades,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 2, 13, NULL, 'Que dejan los caminos derechos, Para andar por sendas tenebrosas;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 2, 14, NULL, 'Que se alegran haciendo el mal, Que se huelgan en las perversidades del vicio;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 2, 15, NULL, 'Cuyas veredas son torcidas, Y torcidos sus caminos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 2, 16, NULL, 'Serás librado de la mujer extraña, De la ajena que halaga con sus palabras,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 2, 17, NULL, 'La cual abandona al compañero de su juventud, Y se olvida del pacto de su Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 2, 18, NULL, 'Por lo cual su casa está inclinada a la muerte, Y sus veredas hacia los muertos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 2, 19, NULL, 'Todos los que a ella se lleguen, no volverán, Ni seguirán otra vez los senderos de la vida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 2, 20, NULL, 'Así andarás por el camino de los buenos, Y seguirás las veredas de los justos;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 2, 21, NULL, 'Porque los rectos habitarán la tierra, Y los perfectos permanecerán en ella,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 2, 22, NULL, 'Mas los impíos serán cortados de la tierra, Y los prevaricadores serán de ella desarraigados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 3, 1, 'Exhortación a la obediencia', 'Hijo mío, no te olvides de mi ley, Y tu corazón guarde mis mandamientos;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 3, 2, NULL, 'Porque largura de días y años de vida Y paz te aumentarán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 3, 3, NULL, 'Nunca se aparten de ti la misericordia y la verdad; Átalas a tu cuello, Escríbelas en la tabla de tu corazón;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 3, 4, NULL, 'Y hallarás gracia y buena opinión Ante los ojos de Dios y de los hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 3, 5, NULL, 'Fíate de Jehová de todo tu corazón, Y no te apoyes en tu propia prudencia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 3, 6, NULL, 'Reconócelo en todos tus caminos, Y él enderezará tus veredas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 3, 7, NULL, 'No seas sabio en tu propia opinión; Teme a Jehová, y apártate del mal;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 3, 8, NULL, 'Porque será medicina a tu cuerpo, Y refrigerio para tus huesos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 3, 9, NULL, 'Honra a Jehová con tus bienes, Y con las primicias de todos tus frutos;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 3, 10, NULL, 'Y serán llenos tus graneros con abundancia, Y tus lagares rebosarán de mosto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 3, 11, NULL, 'No menosprecies, hijo mío, el castigo de Jehová, Ni te fatigues de su corrección;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 3, 12, NULL, 'Porque Jehová al que ama castiga, Como el padre al hijo a quien quiere.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 3, 13, NULL, 'Bienaventurado el hombre que halla la sabiduría, Y que obtiene la inteligencia;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 3, 14, NULL, 'Porque su ganancia es mejor que la ganancia de la plata, Y sus frutos más que el oro fino.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 3, 15, NULL, 'Más preciosa es que las piedras preciosas; Y todo lo que puedes desear, no se puede comparar a ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 3, 16, NULL, 'Largura de días está en su mano derecha; En su izquierda, riquezas y honra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 3, 17, NULL, 'Sus caminos son caminos deleitosos, Y todas sus veredas paz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 3, 18, NULL, 'Ella es árbol de vida a los que de ella echan mano, Y bienaventurados son los que la retienen.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 3, 19, NULL, 'Jehová con sabiduría fundó la tierra; Afirmó los cielos con inteligencia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 3, 20, NULL, 'Con su ciencia los abismos fueron divididos, Y destilan rocío los cielos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 3, 21, NULL, 'Hijo mío, no se aparten estas cosas de tus ojos; Guarda la ley y el consejo,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 3, 22, NULL, 'Y serán vida a tu alma, Y gracia a tu cuello.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 3, 23, NULL, 'Entonces andarás por tu camino confiadamente, Y tu pie no tropezará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 3, 24, NULL, 'Cuando te acuestes, no tendrás temor, Sino que te acostarás, y tu sueño será grato.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 3, 25, NULL, 'No tendrás temor de pavor repentino, Ni de la ruina de los impíos cuando viniere,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 3, 26, NULL, 'Porque Jehová será tu confianza, Y él preservará tu pie de quedar preso.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 3, 27, NULL, 'No te niegues a hacer el bien a quien es debido, Cuando tuvieres poder para hacerlo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 3, 28, NULL, 'No digas a tu prójimo: Anda, y vuelve, Y mañana te daré, Cuando tienes contigo qué darle.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 3, 29, NULL, 'No intentes mal contra tu prójimo Que habita confiado junto a ti.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 3, 30, NULL, 'No tengas pleito con nadie sin razón, Si no te han hecho agravio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 3, 31, NULL, 'No envidies al hombre injusto, Ni escojas ninguno de sus caminos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 3, 32, NULL, 'Porque Jehová abomina al perverso; Mas su comunión íntima es con los justos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 3, 33, NULL, 'La maldición de Jehová está en la casa del impío, Pero bendecirá la morada de los justos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 3, 34, NULL, 'Ciertamente él escarnecerá a los escarnecedores, Y a los humildes dará gracia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 3, 35, NULL, 'Los sabios heredarán honra, Mas los necios llevarán ignominia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 4, 1, 'Beneficios de la sabiduría', 'Oíd, hijos, la enseñanza de un padre, Y estad atentos, para que conozcáis cordura.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 4, 2, NULL, 'Porque os doy buena enseñanza; No desamparéis mi ley.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 4, 3, NULL, 'Porque yo también fui hijo de mi padre, Delicado y único delante de mi madre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 4, 4, NULL, 'Y él me enseñaba, y me decía: Retenga tu corazón mis razones, Guarda mis mandamientos, y vivirás.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 4, 5, NULL, 'Adquiere sabiduría, adquiere inteligencia; No te olvides ni te apartes de las razones de mi boca;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 4, 6, NULL, 'No la dejes, y ella te guardará; Ámala, y te conservará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 4, 7, NULL, 'Sabiduría ante todo; adquiere sabiduría; Y sobre todas tus posesiones adquiere inteligencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 4, 8, NULL, 'Engrandécela, y ella te engrandecerá; Ella te honrará, cuando tú la hayas abrazado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 4, 9, NULL, 'Adorno de gracia dará a tu cabeza; Corona de hermosura te entregará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 4, 10, NULL, 'Oye, hijo mío, y recibe mis razones, Y se te multiplicarán años de vida.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 4, 11, NULL, 'Por el camino de la sabiduría te he encaminado, Y por veredas derechas te he hecho andar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 4, 12, NULL, 'Cuando anduvieres, no se estrecharán tus pasos, Y si corrieres, no tropezarás.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 4, 13, NULL, 'Retén el consejo, no lo dejes; Guárdalo, porque eso es tu vida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 4, 14, NULL, 'No entres por la vereda de los impíos, Ni vayas por el camino de los malos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 4, 15, NULL, 'Déjala, no pases por ella; Apártate de ella, pasa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 4, 16, NULL, 'Porque no duermen ellos si no han hecho mal, Y pierden el sueño si no han hecho caer a alguno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 4, 17, NULL, 'Porque comen pan de maldad, y beben vino de robos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 4, 18, NULL, 'Mas la senda de los justos es como la luz de la aurora, Que va en aumento hasta que el día es perfecto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 4, 19, NULL, 'El camino de los impíos es como la oscuridad; No saben en qué tropiezan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 4, 20, NULL, 'Hijo mío, está atento a mis palabras; Inclina tu oído a mis razones.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 4, 21, NULL, 'No se aparten de tus ojos; Guárdalas en medio de tu corazón;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 4, 22, NULL, 'Porque son vida a los que las hallan, Y medicina a todo su cuerpo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 4, 23, NULL, 'Sobre toda cosa guardada, guarda tu corazón; Porque de él mana la vida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 4, 24, NULL, 'Aparta de ti la perversidad de la boca, Y aleja de ti la iniquidad de los labios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 4, 25, NULL, 'Tus ojos miren lo recto, Y diríjanse tus párpados hacia lo que tienes delante.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 4, 26, NULL, 'Examina la senda de tus pies, Y todos tus caminos sean rectos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 4, 27, NULL, 'No te desvíes a la derecha ni a la izquierda; Aparta tu pie del mal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 5, 1, 'Amonestación contra la impureza', 'Hijo mío, está atento a mi sabiduría, Y a mi inteligencia inclina tu oído,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 5, 2, NULL, 'Para que guardes consejo, Y tus labios conserven la ciencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 5, 3, NULL, 'Porque los labios de la mujer extraña destilan miel, Y su paladar es más blando que el aceite;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 5, 4, NULL, 'Mas su fin es amargo como el ajenjo, Agudo como espada de dos filos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 5, 5, NULL, 'Sus pies descienden a la muerte; Sus pasos conducen al Seol.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 5, 6, NULL, 'Sus caminos son inestables; no los conocerás, Si no considerares el camino de vida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 5, 7, NULL, 'Ahora pues, hijos, oídme, Y no os apartéis de las razones de mi boca.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 5, 8, NULL, 'Aleja de ella tu camino, Y no te acerques a la puerta de su casa;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 5, 9, NULL, 'Para que no des a los extraños tu honor, Y tus años al cruel;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 5, 10, NULL, 'No sea que extraños se sacien de tu fuerza, Y tus trabajos estén en casa del extraño;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 5, 11, NULL, 'Y gimas al final, Cuando se consuma tu carne y tu cuerpo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 5, 12, NULL, 'Y digas: ¡Cómo aborrecí el consejo, Y mi corazón menospreció la reprensión;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 5, 13, NULL, 'No oí la voz de los que me instruían, Y a los que me enseñaban no incliné mi oído!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 5, 14, NULL, 'Casi en todo mal he estado, En medio de la sociedad y de la congregación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 5, 15, NULL, 'Bebe el agua de tu misma cisterna, Y los raudales de tu propio pozo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 5, 16, NULL, '¿Se derramarán tus fuentes por las calles, Y tus corrientes de aguas por las plazas?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 5, 17, NULL, 'Sean para ti solo, Y no para los extraños contigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 5, 18, NULL, 'Sea bendito tu manantial, Y alégrate con la mujer de tu juventud,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 5, 19, NULL, 'Como cierva amada y graciosa gacela. Sus caricias te satisfagan en todo tiempo, Y en su amor recréate siempre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 5, 20, NULL, '¿Y por qué, hijo mío, andarás ciego con la mujer ajena, Y abrazarás el seno de la extraña?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 5, 21, NULL, 'Porque los caminos del hombre están ante los ojos de Jehová, Y él considera todas sus veredas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 5, 22, NULL, 'Prenderán al impío sus propias iniquidades, Y retenido será con las cuerdas de su pecado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 5, 23, NULL, 'Él morirá por falta de corrección, Y errará por lo inmenso de su locura.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 6, 1, 'Amonestación contra la pereza y la falsedad', 'Hijo mío, si salieres fiador por tu amigo, Si has empeñado tu palabra a un extraño,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 6, 2, NULL, 'Te has enlazado con las palabras de tu boca, Y has quedado preso en los dichos de tus labios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 6, 3, NULL, 'Haz esto ahora, hijo mío, y líbrate, Ya que has caído en la mano de tu prójimo; Ve, humíllate, y asegúrate de tu amigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 6, 4, NULL, 'No des sueño a tus ojos, Ni a tus párpados adormecimiento;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 6, 5, NULL, 'Escápate como gacela de la mano del cazador, Y como ave de la mano del que arma lazos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 6, 6, NULL, 'Ve a la hormiga, oh perezoso, Mira sus caminos, y sé sabio;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 6, 7, NULL, 'La cual no teniendo capitán, Ni gobernador, ni señor,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 6, 8, NULL, 'Prepara en el verano su comida, Y recoge en el tiempo de la siega su mantenimiento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 6, 9, NULL, 'Perezoso, ¿hasta cuándo has de dormir? ¿Cuándo te levantarás de tu sueño?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 6, 10, NULL, 'Un poco de sueño, un poco de dormitar, Y cruzar por un poco las manos para reposo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 6, 11, NULL, 'Así vendrá tu necesidad como caminante, Y tu pobreza como hombre armado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 6, 12, NULL, 'El hombre malo, el hombre depravado, Es el que anda en perversidad de boca;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 6, 13, NULL, 'Que guiña los ojos, que habla con los pies, Que hace señas con los dedos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 6, 14, NULL, 'Perversidades hay en su corazón; anda pensando el mal en todo tiempo; Siembra las discordias.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 6, 15, NULL, 'Por tanto, su calamidad vendrá de repente; Súbitamente será quebrantado, y no habrá remedio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 6, 16, NULL, 'Seis cosas aborrece Jehová, Y aun siete abomina su alma:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 6, 17, NULL, 'Los ojos altivos, la lengua mentirosa, Las manos derramadoras de sangre inocente,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 6, 18, NULL, 'El corazón que maquina pensamientos inicuos, Los pies presurosos para correr al mal,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 6, 19, NULL, 'El testigo falso que habla mentiras, Y el que siembra discordia entre hermanos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 6, 20, 'Amonestación contra el adulterio', 'Guarda, hijo mío, el mandamiento de tu padre, Y no dejes la enseñanza de tu madre;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 6, 21, NULL, 'Átalos siempre en tu corazón, Enlázalos a tu cuello.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 6, 22, NULL, 'Te guiarán cuando andes; cuando duermas te guardarán; Hablarán contigo cuando despiertes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 6, 23, NULL, 'Porque el mandamiento es lámpara, y la enseñanza es luz, Y camino de vida las reprensiones que te instruyen,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 6, 24, NULL, 'Para que te guarden de la mala mujer, De la blandura de la lengua de la mujer extraña.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 6, 25, NULL, 'No codicies su hermosura en tu corazón, Ni ella te prenda con sus ojos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 6, 26, NULL, 'Porque a causa de la mujer ramera el hombre es reducido a un bocado de pan; Y la mujer caza la preciosa alma del varón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 6, 27, NULL, '¿Tomará el hombre fuego en su seno Sin que sus vestidos ardan?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 6, 28, NULL, '¿Andará el hombre sobre brasas Sin que sus pies se quemen?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 6, 29, NULL, 'Así es el que se llega a la mujer de su prójimo; No quedará impune ninguno que la tocare.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 6, 30, NULL, 'No tienen en poco al ladrón si hurta Para saciar su apetito cuando tiene hambre;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 6, 31, NULL, 'Pero si es sorprendido, pagará siete veces; Entregará todo el haber de su casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 6, 32, NULL, 'Mas el que comete adulterio es falto de entendimiento; Corrompe su alma el que tal hace.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 6, 33, NULL, 'Heridas y vergüenza hallará, Y su afrenta nunca será borrada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 6, 34, NULL, 'Porque los celos son el furor del hombre, Y no perdonará en el día de la venganza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 6, 35, NULL, 'No aceptará ningún rescate, Ni querrá perdonar, aunque multipliques los dones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 7, 1, 'Las artimañas de la ramera', 'Hijo mío, guarda mis razones, Y atesora contigo mis mandamientos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 7, 2, NULL, 'Guarda mis mandamientos y vivirás, Y mi ley como las niñas de tus ojos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 7, 3, NULL, 'Lígalos a tus dedos; Escríbelos en la tabla de tu corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 7, 4, NULL, 'Di a la sabiduría: Tú eres mi hermana, Y a la inteligencia llama parienta;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 7, 5, NULL, 'Para que te guarden de la mujer ajena, Y de la extraña que ablanda sus palabras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 7, 6, NULL, 'Porque mirando yo por la ventana de mi casa, Por mi celosía,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 7, 7, NULL, 'Vi entre los simples, Consideré entre los jóvenes, A un joven falto de entendimiento,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 7, 8, NULL, 'El cual pasaba por la calle, junto a la esquina, E iba camino a la casa de ella,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 7, 9, NULL, 'A la tarde del día, cuando ya oscurecía, En la oscuridad y tinieblas de la noche.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 7, 10, NULL, 'Cuando he aquí, una mujer le sale al encuentro, Con atavío de ramera y astuta de corazón.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 7, 11, NULL, 'Alborotadora y rencillosa, Sus pies no pueden estar en casa;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 7, 12, NULL, 'Unas veces está en la calle, otras veces en las plazas, Acechando por todas las esquinas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 7, 13, NULL, 'Se asió de él, y le besó. Con semblante descarado le dijo:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 7, 14, NULL, 'Sacrificios de paz había prometido, Hoy he pagado mis votos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 7, 15, NULL, 'Por tanto, he salido a encontrarte, Buscando diligentemente tu rostro, y te he hallado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 7, 16, NULL, 'He adornado mi cama con colchas Recamadas con cordoncillo de Egipto;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 7, 17, NULL, 'He perfumado mi cámara Con mirra, áloes y canela.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 7, 18, NULL, 'Ven, embriaguémonos de amores hasta la mañana; Alegrémonos en amores.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 7, 19, NULL, 'Porque el marido no está en casa; Se ha ido a un largo viaje.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 7, 20, NULL, 'La bolsa de dinero llevó en su mano; El día señalado volverá a su casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 7, 21, NULL, 'Lo rindió con la suavidad de sus muchas palabras, Le obligó con la zalamería de sus labios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 7, 22, NULL, 'Al punto se marchó tras ella, Como va el buey al degolladero, Y como el necio a las prisiones para ser castigado;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 7, 23, NULL, 'Como el ave que se apresura a la red, Y no sabe que es contra su vida, Hasta que la saeta traspasa su corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 7, 24, NULL, 'Ahora pues, hijos, oídme, Y estad atentos a las razones de mi boca.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 7, 25, NULL, 'No se aparte tu corazón a sus caminos; No yerres en sus veredas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 7, 26, NULL, 'Porque a muchos ha hecho caer heridos, Y aun los más fuertes han sido muertos por ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 7, 27, NULL, 'Camino al Seol es su casa, Que conduce a las cámaras de la muerte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 8, 1, 'Excelencia y eternidad de la Sabiduría', '¿No clama la sabiduría, Y da su voz la inteligencia?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 8, 2, NULL, 'En las alturas junto al camino, A las encrucijadas de las veredas se para;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 8, 3, NULL, 'En el lugar de las puertas, a la entrada de la ciudad, A la entrada de las puertas da voces:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 8, 4, NULL, 'Oh hombres, a vosotros clamo; Dirijo mi voz a los hijos de los hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 8, 5, NULL, 'Entended, oh simples, discreción; Y vosotros, necios, entrad en cordura.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 8, 6, NULL, 'Oíd, porque hablaré cosas excelentes, Y abriré mis labios para cosas rectas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 8, 7, NULL, 'Porque mi boca hablará verdad, Y la impiedad abominan mis labios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 8, 8, NULL, 'Justas son todas las razones de mi boca; No hay en ellas cosa perversa ni torcida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 8, 9, NULL, 'Todas ellas son rectas al que entiende, Y razonables a los que han hallado sabiduría.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 8, 10, NULL, 'Recibid mi enseñanza, y no plata; Y ciencia antes que el oro escogido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 8, 11, NULL, 'Porque mejor es la sabiduría que las piedras preciosas; Y todo cuanto se puede desear, no es de compararse con ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 8, 12, NULL, 'Yo, la sabiduría, habito con la cordura, Y hallo la ciencia de los consejos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 8, 13, NULL, 'El temor de Jehová es aborrecer el mal; La soberbia y la arrogancia, el mal camino, Y la boca perversa, aborrezco.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 8, 14, NULL, 'Conmigo está el consejo y el buen juicio; Yo soy la inteligencia; mío es el poder.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 8, 15, NULL, 'Por mí reinan los reyes, Y los príncipes determinan justicia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 8, 16, NULL, 'Por mí dominan los príncipes, Y todos los gobernadores juzgan la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 8, 17, NULL, 'Yo amo a los que me aman, Y me hallan los que temprano me buscan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 8, 18, NULL, 'Las riquezas y la honra están conmigo; Riquezas duraderas, y justicia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 8, 19, NULL, 'Mejor es mi fruto que el oro, y que el oro refinado; Y mi rédito mejor que la plata escogida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 8, 20, NULL, 'Por vereda de justicia guiaré, Por en medio de sendas de juicio,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 8, 21, NULL, 'Para hacer que los que me aman tengan su heredad, Y que yo llene sus tesoros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 8, 22, NULL, 'Jehová me poseía en el principio, Ya de antiguo, antes de sus obras.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 8, 23, NULL, 'Eternamente tuve el principado, desde el principio, Antes de la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 8, 24, NULL, 'Antes de los abismos fui engendrada; Antes que fuesen las fuentes de las muchas aguas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 8, 25, NULL, 'Antes que los montes fuesen formados, Antes de los collados, ya había sido yo engendrada;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 8, 26, NULL, 'No había aún hecho la tierra, ni los campos, Ni el principio del polvo del mundo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 8, 27, NULL, 'Cuando formaba los cielos, allí estaba yo; Cuando trazaba el círculo sobre la faz del abismo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 8, 28, NULL, 'Cuando afirmaba los cielos arriba, Cuando afirmaba las fuentes del abismo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 8, 29, NULL, 'Cuando ponía al mar su estatuto, Para que las aguas no traspasasen su mandamiento; Cuando establecía los fundamentos de la tierra,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 8, 30, NULL, 'Con él estaba yo ordenándolo todo, Y era su delicia de día en día, Teniendo solaz delante de él en todo tiempo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 8, 31, NULL, 'Me regocijo en la parte habitable de su tierra; Y mis delicias son con los hijos de los hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 8, 32, NULL, 'Ahora, pues, hijos, oídme, Y bienaventurados los que guardan mis caminos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 8, 33, NULL, 'Atended el consejo, y sed sabios, Y no lo menospreciéis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 8, 34, NULL, 'Bienaventurado el hombre que me escucha, Velando a mis puertas cada día, Aguardando a los postes de mis puertas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 8, 35, NULL, 'Porque el que me halle, hallará la vida, Y alcanzará el favor de Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 8, 36, NULL, 'Mas el que peca contra mí, defrauda su alma; Todos los que me aborrecen aman la muerte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 9, 1, 'La Sabiduría y la mujer insensata', 'La sabiduría edificó su casa, Labró sus siete columnas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 9, 2, NULL, 'Mató sus víctimas, mezcló su vino, Y puso su mesa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 9, 3, NULL, 'Envió sus criadas; Sobre lo más alto de la ciudad clamó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 9, 4, NULL, 'Dice a cualquier simple: Ven acá. A los faltos de cordura dice:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 9, 5, NULL, 'Venid, comed mi pan, Y bebed del vino que yo he mezclado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 9, 6, NULL, 'Dejad las simplezas, y vivid, Y andad por el camino de la inteligencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 9, 7, NULL, 'El que corrige al escarnecedor, se acarrea afrenta; El que reprende al impío, se atrae mancha.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 9, 8, NULL, 'No reprendas al escarnecedor, para que no te aborrezca; Corrige al sabio, y te amará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 9, 9, NULL, 'Da al sabio, y será más sabio; Enseña al justo, y aumentará su saber.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 9, 10, NULL, 'El temor de Jehová es el principio de la sabiduría, Y el conocimiento del Santísimo es la inteligencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 9, 11, NULL, 'Porque por mí se aumentarán tus días, Y años de vida se te añadirán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 9, 12, NULL, 'Si fueres sabio, para ti lo serás; Y si fueres escarnecedor, pagarás tú solo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 9, 13, NULL, 'La mujer insensata es alborotadora; Es simple e ignorante.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 9, 14, NULL, 'Se sienta en una silla a la puerta de su casa, En los lugares altos de la ciudad,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 9, 15, NULL, 'Para llamar a los que pasan por el camino, Que van por sus caminos derechos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 9, 16, NULL, 'Dice a cualquier simple: Ven acá. A los faltos de cordura dijo:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 9, 17, NULL, 'Las aguas hurtadas son dulces, Y el pan comido en oculto es sabroso.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 9, 18, NULL, 'Y no saben que allí están los muertos; Que sus convidados están en lo profundo del Seol.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 10, 1, 'Contraste entre el justo y el malvado', 'Los proverbios de Salomón. El hijo sabio alegra al padre, Pero el hijo necio es tristeza de su madre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 10, 2, NULL, 'Los tesoros de maldad no serán de provecho; Mas la justicia libra de muerte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 10, 3, NULL, 'Jehová no dejará padecer hambre al justo; Mas la iniquidad lanzará a los impíos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 10, 4, NULL, 'La mano negligente empobrece; Mas la mano de los diligentes enriquece.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 10, 5, NULL, 'El que recoge en el verano es hombre entendido; El que duerme en el tiempo de la siega es hijo que avergüenza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 10, 6, NULL, 'Hay bendiciones sobre la cabeza del justo; Pero violencia cubrirá la boca de los impíos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 10, 7, NULL, 'La memoria del justo será bendita; Mas el nombre de los impíos se pudrirá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 10, 8, NULL, 'El sabio de corazón recibirá los mandamientos; Mas el necio de labios caerá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 10, 9, NULL, 'El que camina en integridad anda confiado; Mas el que pervierte sus caminos será quebrantado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 10, 10, NULL, 'El que guiña el ojo acarrea tristeza; Y el necio de labios será castigado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 10, 11, NULL, 'Manantial de vida es la boca del justo; Pero violencia cubrirá la boca de los impíos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 10, 12, NULL, 'El odio despierta rencillas; Pero el amor cubrirá todas las faltas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 10, 13, NULL, 'En los labios del prudente se halla sabiduría; Mas la vara es para las espaldas del falto de cordura.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 10, 14, NULL, 'Los sabios guardan la sabiduría; Mas la boca del necio es calamidad cercana.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 10, 15, NULL, 'Las riquezas del rico son su ciudad fortificada; Y el desmayo de los pobres es su pobreza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 10, 16, NULL, 'La obra del justo es para vida; Mas el fruto del impío es para pecado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 10, 17, NULL, 'Camino a la vida es guardar la instrucción; Pero quien desecha la reprensión, yerra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 10, 18, NULL, 'El que encubre el odio es de labios mentirosos; Y el que propaga calumnia es necio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 10, 19, NULL, 'En las muchas palabras no falta pecado; Mas el que refrena sus labios es prudente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 10, 20, NULL, 'Plata escogida es la lengua del justo; Mas el corazón de los impíos es como nada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 10, 21, NULL, 'Los labios del justo apacientan a muchos, Mas los necios mueren por falta de entendimiento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 10, 22, NULL, 'La bendición de Jehová es la que enriquece, Y no añade tristeza con ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 10, 23, NULL, 'El hacer maldad es como una diversión al insensato; Mas la sabiduría recrea al hombre de entendimiento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 10, 24, NULL, 'Lo que el impío teme, eso le vendrá; Pero a los justos les será dado lo que desean.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 10, 25, NULL, 'Como pasa el torbellino, así el malo no permanece; Mas el justo permanece para siempre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 10, 26, NULL, 'Como el vinagre a los dientes, y como el humo a los ojos, Así es el perezoso a los que lo envían.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 10, 27, NULL, 'El temor de Jehová aumentará los días; Mas los años de los impíos serán acortados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 10, 28, NULL, 'La esperanza de los justos es alegría; Mas la esperanza de los impíos perecerá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 10, 29, NULL, 'El camino de Jehová es fortaleza al perfecto; Pero es destrucción a los que hacen maldad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 10, 30, NULL, 'El justo no será removido jamás; Pero los impíos no habitarán la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 10, 31, NULL, 'La boca del justo producirá sabiduría; Mas la lengua perversa será cortada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 10, 32, NULL, 'Los labios del justo saben hablar lo que agrada; Mas la boca de los impíos habla perversidades.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 11, 1, NULL, 'El peso falso es abominación a Jehová; Mas la pesa cabal le agrada.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 11, 2, NULL, 'Cuando viene la soberbia, viene también la deshonra; Mas con los humildes está la sabiduría.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 11, 3, NULL, 'La integridad de los rectos los encaminará; Pero destruirá a los pecadores la perversidad de ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 11, 4, NULL, 'No aprovecharán las riquezas en el día de la ira; Mas la justicia librará de muerte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 11, 5, NULL, 'La justicia del perfecto enderezará su camino; Mas el impío por su impiedad caerá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 11, 6, NULL, 'La justicia de los rectos los librará; Mas los pecadores serán atrapados en su pecado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 11, 7, NULL, 'Cuando muere el hombre impío, perece su esperanza; Y la expectación de los malos perecerá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 11, 8, NULL, 'El justo es librado de la tribulación; Mas el impío entra en lugar suyo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 11, 9, NULL, 'El hipócrita con la boca daña a su prójimo; Mas los justos son librados con la sabiduría.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 11, 10, NULL, 'En el bien de los justos la ciudad se alegra; Mas cuando los impíos perecen hay fiesta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 11, 11, NULL, 'Por la bendición de los rectos la ciudad será engrandecida; Mas por la boca de los impíos será trastornada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 11, 12, NULL, 'El que carece de entendimiento menosprecia a su prójimo; Mas el hombre prudente calla.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 11, 13, NULL, 'El que anda en chismes descubre el secreto; Mas el de espíritu fiel lo guarda todo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 11, 14, NULL, 'Donde no hay dirección sabia, caerá el pueblo; Mas en la multitud de consejeros hay seguridad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 11, 15, NULL, 'Con ansiedad será afligido el que sale por fiador de un extraño; Mas el que aborreciere las fianzas vivirá seguro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 11, 16, NULL, 'La mujer agraciada tendrá honra, Y los fuertes tendrán riquezas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 11, 17, NULL, 'A su alma hace bien el hombre misericordioso; Mas el cruel se atormenta a sí mismo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 11, 18, NULL, 'El impío hace obra falsa; Mas el que siembra justicia tendrá galardón firme.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 11, 19, NULL, 'Como la justicia conduce a la vida, Así el que sigue el mal lo hace para su muerte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 11, 20, NULL, 'Abominación son a Jehová los perversos de corazón; Mas los perfectos de camino le son agradables.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 11, 21, NULL, 'Tarde o temprano, el malo será castigado; Mas la descendencia de los justos será librada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 11, 22, NULL, 'Como zarcillo de oro en el hocico de un cerdo Es la mujer hermosa y apartada de razón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 11, 23, NULL, 'El deseo de los justos es solamente el bien; Mas la esperanza de los impíos es el enojo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 11, 24, NULL, 'Hay quienes reparten, y les es añadido más; Y hay quienes retienen más de lo que es justo, pero vienen a pobreza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 11, 25, NULL, 'El alma generosa será prosperada; Y el que saciare, él también será saciado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 11, 26, NULL, 'Al que acapara el grano, el pueblo lo maldecirá; Pero bendición será sobre la cabeza del que lo vende.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 11, 27, NULL, 'El que procura el bien buscará favor; Mas al que busca el mal, este le vendrá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 11, 28, NULL, 'El que confía en sus riquezas caerá; Mas los justos reverdecerán como ramas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 11, 29, NULL, 'El que turba su casa heredará viento; Y el necio será siervo del sabio de corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 11, 30, NULL, 'El fruto del justo es árbol de vida; Y el que gana almas es sabio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 11, 31, NULL, 'Ciertamente el justo será recompensado en la tierra; ¡Cuánto más el impío y el pecador!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 12, 1, NULL, 'El que ama la instrucción ama la sabiduría; Mas el que aborrece la reprensión es ignorante.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 12, 2, NULL, 'El bueno alcanzará favor de Jehová; Mas él condenará al hombre de malos pensamientos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 12, 3, NULL, 'El hombre no se afirmará por medio de la impiedad; Mas la raíz de los justos no será removida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 12, 4, NULL, 'La mujer virtuosa es corona de su marido; Mas la mala, como carcoma en sus huesos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 12, 5, NULL, 'Los pensamientos de los justos son rectitud; Mas los consejos de los impíos, engaño.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 12, 6, NULL, 'Las palabras de los impíos son asechanzas para derramar sangre; Mas la boca de los rectos los librará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 12, 7, NULL, 'Dios trastornará a los impíos, y no serán más; Pero la casa de los justos permanecerá firme.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 12, 8, NULL, 'Según su sabiduría es alabado el hombre; Mas el perverso de corazón será menospreciado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 12, 9, NULL, 'Más vale el despreciado que tiene servidores, Que el que se jacta, y carece de pan.', 0, 'spa', 'RVR1960', NULL);\n"
;

  public static final String SQL_PARTE_2 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Pr', 12, 10, NULL, 'El justo cuida de la vida de su bestia; Mas el corazón de los impíos es cruel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 12, 11, NULL, 'El que labra su tierra se saciará de pan; Mas el que sigue a los vagabundos es falto de entendimiento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 12, 12, NULL, 'Codicia el impío la red de los malvados; Mas la raíz de los justos dará fruto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 12, 13, NULL, 'El impío es enredado en la prevaricación de sus labios; Mas el justo saldrá de la tribulación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 12, 14, NULL, 'El hombre será saciado de bien del fruto de su boca; Y le será pagado según la obra de sus manos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 12, 15, NULL, 'El camino del necio es derecho en su opinión; Mas el que obedece al consejo es sabio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 12, 16, NULL, 'El necio al punto da a conocer su ira; Mas el que no hace caso de la injuria es prudente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 12, 17, NULL, 'El que habla verdad declara justicia; Mas el testigo mentiroso, engaño.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 12, 18, NULL, 'Hay hombres cuyas palabras son como golpes de espada; Mas la lengua de los sabios es medicina.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 12, 19, NULL, 'El labio veraz permanecerá para siempre; Mas la lengua mentirosa solo por un momento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 12, 20, NULL, 'Engaño hay en el corazón de los que piensan el mal; Pero alegría en el de los que piensan el bien.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 12, 21, NULL, 'Ninguna adversidad acontecerá al justo; Mas los impíos serán colmados de males.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 12, 22, NULL, 'Los labios mentirosos son abominación a Jehová; Pero los que hacen verdad son su contentamiento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 12, 23, NULL, 'El hombre cuerdo encubre su saber; Mas el corazón de los necios publica la necedad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 12, 24, NULL, 'La mano de los diligentes señoreará; Mas la negligencia será tributaria.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 12, 25, NULL, 'La congoja en el corazón del hombre lo abate; Mas la buena palabra lo alegra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 12, 26, NULL, 'El justo sirve de guía a su prójimo; Mas el camino de los impíos les hace errar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 12, 27, NULL, 'El indolente ni aun asará lo que ha cazado; Pero haber precioso del hombre es la diligencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 12, 28, NULL, 'En el camino de la justicia está la vida; Y en sus caminos no hay muerte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 13, 1, NULL, 'El hijo sabio recibe el consejo del padre; Mas el burlador no escucha las reprensiones.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 13, 2, NULL, 'Del fruto de su boca el hombre comerá el bien; Mas el alma de los prevaricadores hallará el mal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 13, 3, NULL, 'El que guarda su boca guarda su alma; Mas el que mucho abre sus labios tendrá calamidad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 13, 4, NULL, 'El alma del perezoso desea, y nada alcanza; Mas el alma de los diligentes será prosperada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 13, 5, NULL, 'El justo aborrece la palabra de mentira; Mas el impío se hace odioso e infame.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 13, 6, NULL, 'La justicia guarda al de perfecto camino; Mas la impiedad trastornará al pecador.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 13, 7, NULL, 'Hay quienes pretenden ser ricos, y no tienen nada; Y hay quienes pretenden ser pobres, y tienen muchas riquezas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 13, 8, NULL, 'El rescate de la vida del hombre está en sus riquezas; Pero el pobre no oye censuras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 13, 9, NULL, 'La luz de los justos se alegrará; Mas se apagará la lámpara de los impíos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 13, 10, NULL, 'Ciertamente la soberbia concebirá contienda; Mas con los avisados está la sabiduría.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 13, 11, NULL, 'Las riquezas de vanidad disminuirán; Pero el que recoge con mano laboriosa las aumenta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 13, 12, NULL, 'La esperanza que se demora es tormento del corazón; Pero árbol de vida es el deseo cumplido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 13, 13, NULL, 'El que menosprecia el precepto perecerá por ello; Mas el que teme el mandamiento será recompensado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 13, 14, NULL, 'La ley del sabio es manantial de vida Para apartarse de los lazos de la muerte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 13, 15, NULL, 'El buen entendimiento da gracia; Mas el camino de los transgresores es duro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 13, 16, NULL, 'Todo hombre prudente procede con sabiduría; Mas el necio manifestará necedad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 13, 17, NULL, 'El mal mensajero acarrea desgracia; Mas el mensajero fiel acarrea salud.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 13, 18, NULL, 'Pobreza y vergüenza tendrá el que menosprecia el consejo; Mas el que guarda la corrección recibirá honra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 13, 19, NULL, 'El deseo cumplido regocija el alma; Pero apartarse del mal es abominación a los necios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 13, 20, NULL, 'El que anda con sabios, sabio será; Mas el que se junta con necios será quebrantado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 13, 21, NULL, 'El mal perseguirá a los pecadores, Mas los justos serán premiados con el bien.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 13, 22, NULL, 'El bueno dejará herederos a los hijos de sus hijos; Pero la riqueza del pecador está guardada para el justo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 13, 23, NULL, 'En el barbecho de los pobres hay mucho pan; Mas se pierde por falta de juicio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 13, 24, NULL, 'El que detiene el castigo, a su hijo aborrece; Mas el que lo ama, desde temprano lo corrige.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 13, 25, NULL, 'El justo come hasta saciar su alma; Mas el vientre de los impíos tendrá necesidad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 14, 1, NULL, 'La mujer sabia edifica su casa; Mas la necia con sus manos la derriba.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 14, 2, NULL, 'El que camina en su rectitud teme a Jehová; Mas el de caminos pervertidos lo menosprecia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 14, 3, NULL, 'En la boca del necio está la vara de la soberbia; Mas los labios de los sabios los guardarán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 14, 4, NULL, 'Sin bueyes el granero está vacío; Mas por la fuerza del buey hay abundancia de pan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 14, 5, NULL, 'El testigo verdadero no mentirá; Mas el testigo falso hablará mentiras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 14, 6, NULL, 'Busca el escarnecedor la sabiduría y no la halla; Mas al hombre entendido la sabiduría le es fácil.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 14, 7, NULL, 'Vete de delante del hombre necio, Porque en él no hallarás labios de ciencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 14, 8, NULL, 'La ciencia del prudente está en entender su camino; Mas la indiscreción de los necios es engaño.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 14, 9, NULL, 'Los necios se mofan del pecado; Mas entre los rectos hay buena voluntad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 14, 10, NULL, 'El corazón conoce la amargura de su alma; Y extraño no se entremeterá en su alegría.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 14, 11, NULL, 'La casa de los impíos será asolada; Pero florecerá la tienda de los rectos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 14, 12, NULL, 'Hay camino que al hombre le parece derecho; Pero su fin es camino de muerte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 14, 13, NULL, 'Aun en la risa tendrá dolor el corazón; Y el término de la alegría es congoja.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 14, 14, NULL, 'De sus caminos será hastiado el necio de corazón; Pero el hombre de bien estará contento del suyo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 14, 15, NULL, 'El simple todo lo cree; Mas el avisado mira bien sus pasos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 14, 16, NULL, 'El sabio teme y se aparta del mal; Mas el insensato se muestra insolente y confiado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 14, 17, NULL, 'El que fácilmente se enoja hará locuras; Y el hombre perverso será aborrecido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 14, 18, NULL, 'Los simples heredarán necedad; Mas los prudentes se coronarán de sabiduría.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 14, 19, NULL, 'Los malos se inclinarán delante de los buenos, Y los impíos a las puertas del justo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 14, 20, NULL, 'El pobre es odioso aun a su amigo; Pero muchos son los que aman al rico.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 14, 21, NULL, 'Peca el que menosprecia a su prójimo; Mas el que tiene misericordia de los pobres es bienaventurado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 14, 22, NULL, '¿No yerran los que piensan el mal? Misericordia y verdad alcanzarán los que piensan el bien.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 14, 23, NULL, 'En toda labor hay fruto; Mas las vanas palabras de los labios empobrecen.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 14, 24, NULL, 'Las riquezas de los sabios son su corona; Pero la insensatez de los necios es infatuación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 14, 25, NULL, 'El testigo verdadero libra las almas; Mas el engañoso hablará mentiras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 14, 26, NULL, 'En el temor de Jehová está la fuerte confianza; Y esperanza tendrán sus hijos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 14, 27, NULL, 'El temor de Jehová es manantial de vida Para apartarse de los lazos de la muerte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 14, 28, NULL, 'En la multitud del pueblo está la gloria del rey; Y en la falta de pueblo la debilidad del príncipe.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 14, 29, NULL, 'El que tarda en airarse es grande de entendimiento; Mas el que es impaciente de espíritu enaltece la necedad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 14, 30, NULL, 'El corazón apacible es vida de la carne; Mas la envidia es carcoma de los huesos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 14, 31, NULL, 'El que oprime al pobre afrenta a su Hacedor; Mas el que tiene misericordia del pobre, lo honra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 14, 32, NULL, 'Por su maldad será lanzado el impío; Mas el justo en su muerte tiene esperanza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 14, 33, NULL, 'En el corazón del prudente reposa la sabiduría; Pero no es conocida en medio de los necios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 14, 34, NULL, 'La justicia engrandece a la nación; Mas el pecado es afrenta de las naciones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 14, 35, NULL, 'La benevolencia del rey es para con el servidor entendido; Mas su enojo contra el que lo avergüenza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 15, 1, NULL, 'La blanda respuesta quita la ira; Mas la palabra áspera hace subir el furor.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 15, 2, NULL, 'La lengua de los sabios adornará la sabiduría; Mas la boca de los necios hablará sandeces.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 15, 3, NULL, 'Los ojos de Jehová están en todo lugar, Mirando a los malos y a los buenos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 15, 4, NULL, 'La lengua apacible es árbol de vida; Mas la perversidad de ella es quebrantamiento de espíritu.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 15, 5, NULL, 'El necio menosprecia el consejo de su padre; Mas el que guarda la corrección vendrá a ser prudente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 15, 6, NULL, 'En la casa del justo hay gran provisión; Pero turbación en las ganancias del impío.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 15, 7, NULL, 'La boca de los sabios esparce sabiduría; No así el corazón de los necios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 15, 8, NULL, 'El sacrificio de los impíos es abominación a Jehová; Mas la oración de los rectos es su gozo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 15, 9, NULL, 'Abominación es a Jehová el camino del impío; Mas él ama al que sigue justicia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 15, 10, NULL, 'La reconvención es molesta al que deja el camino; Y el que aborrece la corrección morirá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 15, 11, NULL, 'El Seol y el Abadón están delante de Jehová; ¡Cuánto más los corazones de los hombres!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 15, 12, NULL, 'El escarnecedor no ama al que le reprende, Ni se junta con los sabios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 15, 13, NULL, 'El corazón alegre hermosea el rostro; Mas por el dolor del corazón el espíritu se abate.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 15, 14, NULL, 'El corazón entendido busca la sabiduría; Mas la boca de los necios se alimenta de necedades.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 15, 15, NULL, 'Todos los días del afligido son difíciles; Mas el de corazón contento tiene un banquete continuo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 15, 16, NULL, 'Mejor es lo poco con el temor de Jehová, Que el gran tesoro donde hay turbación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 15, 17, NULL, 'Mejor es la comida de legumbres donde hay amor, Que de buey engordado donde hay odio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 15, 18, NULL, 'El hombre iracundo promueve contiendas; Mas el que tarda en airarse apacigua la rencilla.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 15, 19, NULL, 'El camino del perezoso es como seto de espinos; Mas la vereda de los rectos, como una calzada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 15, 20, NULL, 'El hijo sabio alegra al padre; Mas el hombre necio menosprecia a su madre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 15, 21, NULL, 'La necedad es alegría al falto de entendimiento; Mas el hombre entendido endereza sus pasos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 15, 22, NULL, 'Los pensamientos son frustrados donde no hay consejo; Mas en la multitud de consejeros se afirman.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 15, 23, NULL, 'El hombre se alegra con la respuesta de su boca; Y la palabra a su tiempo, ¡cuán buena es!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 15, 24, NULL, 'El camino de la vida es hacia arriba al entendido, Para apartarse del Seol abajo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 15, 25, NULL, 'Jehová asolará la casa de los soberbios; Pero afirmará la heredad de la viuda.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 15, 26, NULL, 'Abominación son a Jehová los pensamientos del malo; Mas las expresiones de los limpios son limpias.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 15, 27, NULL, 'Alborota su casa el codicioso; Mas el que aborrece el soborno vivirá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 15, 28, NULL, 'El corazón del justo piensa para responder; Mas la boca de los impíos derrama malas cosas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 15, 29, NULL, 'Jehová está lejos de los impíos; Pero él oye la oración de los justos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 15, 30, NULL, 'La luz de los ojos alegra el corazón, Y la buena nueva conforta los huesos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 15, 31, NULL, 'El oído que escucha las amonestaciones de la vida, Entre los sabios morará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 15, 32, NULL, 'El que tiene en poco la disciplina menosprecia su alma; Mas el que escucha la corrección tiene entendimiento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 15, 33, NULL, 'El temor de Jehová es enseñanza de sabiduría; Y a la honra precede la humildad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 16, 1, 'Proverbios sobre la vida y la conducta', 'Del hombre son las disposiciones del corazón; Mas de Jehová es la respuesta de la lengua.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 16, 2, NULL, 'Todos los caminos del hombre son limpios en su propia opinión; Pero Jehová pesa los espíritus.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 16, 3, NULL, 'Encomienda a Jehová tus obras, Y tus pensamientos serán afirmados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 16, 4, NULL, 'Todas las cosas ha hecho Jehová para sí mismo, Y aun al impío para el día malo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 16, 5, NULL, 'Abominación es a Jehová todo altivo de corazón; Ciertamente no quedará impune.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 16, 6, NULL, 'Con misericordia y verdad se corrige el pecado, Y con el temor de Jehová los hombres se apartan del mal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 16, 7, NULL, 'Cuando los caminos del hombre son agradables a Jehová, Aun a sus enemigos hace estar en paz con él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 16, 8, NULL, 'Mejor es lo poco con justicia Que la muchedumbre de frutos sin derecho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 16, 9, NULL, 'El corazón del hombre piensa su camino; Mas Jehová endereza sus pasos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 16, 10, NULL, 'Oráculo hay en los labios del rey; En juicio no prevaricará su boca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 16, 11, NULL, 'Peso y balanzas justas son de Jehová; Obra suya son todas las pesas de la bolsa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 16, 12, NULL, 'Abominación es a los reyes hacer impiedad, Porque con justicia será afirmado el trono.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 16, 13, NULL, 'Los labios justos son el contentamiento de los reyes, Y estos aman al que habla lo recto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 16, 14, NULL, 'La ira del rey es mensajero de muerte; Mas el hombre sabio la evitará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 16, 15, NULL, 'En la alegría del rostro del rey está la vida, Y su benevolencia es como nube de lluvia tardía.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 16, 16, NULL, 'Mejor es adquirir sabiduría que oro preciado; Y adquirir inteligencia vale más que la plata.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 16, 17, NULL, 'El camino de los rectos se aparta del mal; Su vida guarda el que guarda su camino.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 16, 18, NULL, 'Antes del quebrantamiento es la soberbia, Y antes de la caída la altivez de espíritu.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 16, 19, NULL, 'Mejor es humillar el espíritu con los humildes Que repartir despojos con los soberbios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 16, 20, NULL, 'El entendido en la palabra hallará el bien, Y el que confía en Jehová es bienaventurado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 16, 21, NULL, 'El sabio de corazón es llamado prudente, Y la dulzura de labios aumenta el saber.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 16, 22, NULL, 'Manantial de vida es el entendimiento al que lo posee; Mas la erudición de los necios es necedad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 16, 23, NULL, 'El corazón del sabio hace prudente su boca, Y añade gracia a sus labios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 16, 24, NULL, 'Panal de miel son los dichos suaves; Suavidad al alma y medicina para los huesos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 16, 25, NULL, 'Hay camino que parece derecho al hombre, Pero su fin es camino de muerte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 16, 26, NULL, 'El alma del que trabaja, trabaja para sí, Porque su boca le estimula.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 16, 27, NULL, 'El hombre perverso cava en busca del mal, Y en sus labios hay como llama de fuego.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 16, 28, NULL, 'El hombre perverso levanta contienda, Y el chismoso aparta a los mejores amigos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 16, 29, NULL, 'El hombre malo lisonjea a su prójimo, Y le hace andar por camino no bueno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 16, 30, NULL, 'Cierra sus ojos para pensar perversidades; Mueve sus labios, efectúa el mal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 16, 31, NULL, 'Corona de honra es la vejez Que se halla en el camino de justicia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 16, 32, NULL, 'Mejor es el que tarda en airarse que el fuerte; Y el que se enseñorea de su espíritu, que el que toma una ciudad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 16, 33, NULL, 'La suerte se echa en el regazo; Mas de Jehová es la decisión de ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 17, 1, NULL, 'Mejor es un bocado seco, y en paz, Que casa de contiendas llena de provisiones.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 17, 2, NULL, 'El siervo prudente se enseñoreará del hijo que deshonra, Y con los hermanos compartirá la herencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 17, 3, NULL, 'El crisol para la plata, y la hornaza para el oro; Pero Jehová prueba los corazones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 17, 4, NULL, 'El malo está atento al labio inicuo; Y el mentiroso escucha la lengua detractora.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 17, 5, NULL, 'El que escarnece al pobre afrenta a su Hacedor; Y el que se alegra de la calamidad no quedará sin castigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 17, 6, NULL, 'Corona de los viejos son los nietos, Y la honra de los hijos, sus padres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 17, 7, NULL, 'No conviene al necio la altilocuencia; ¡Cuánto menos al príncipe el labio mentiroso!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 17, 8, NULL, 'Piedra preciosa es el soborno para el que lo practica; Adondequiera que se vuelve, halla prosperidad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 17, 9, NULL, 'El que cubre la falta busca amistad; Mas el que la divulga, aparta al amigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 17, 10, NULL, 'La reprensión aprovecha al entendido, Más que cien azotes al necio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 17, 11, NULL, 'El rebelde no busca sino el mal, Y mensajero cruel será enviado contra él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 17, 12, NULL, 'Mejor es encontrarse con una osa a la cual han robado sus cachorros, Que con un fatuo en su necedad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 17, 13, NULL, 'El que da mal por bien, No se apartará el mal de su casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 17, 14, NULL, 'El que comienza la discordia es como quien suelta las aguas; Deja, pues, la contienda, antes que se enrede.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 17, 15, NULL, 'El que justifica al impío, y el que condena al justo, Ambos son igualmente abominación a Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 17, 16, NULL, '¿De qué sirve el precio en la mano del necio para comprar sabiduría, No teniendo entendimiento?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 17, 17, NULL, 'En todo tiempo ama el amigo, Y es como un hermano en tiempo de angustia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 17, 18, NULL, 'El hombre falto de entendimiento presta fianzas, Y sale por fiador en presencia de su amigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 17, 19, NULL, 'El que ama la disputa, ama la transgresión; Y el que abre demasiado la puerta busca su ruina.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 17, 20, NULL, 'El perverso de corazón nunca hallará el bien, Y el que revuelve con su lengua caerá en el mal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 17, 21, NULL, 'El que engendra al insensato, para su tristeza lo engendra; Y el padre del necio no se alegrará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 17, 22, NULL, 'El corazón alegre constituye buen remedio; Mas el espíritu triste seca los huesos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 17, 23, NULL, 'El impío toma soborno del seno Para pervertir las sendas de la justicia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 17, 24, NULL, 'En el rostro del entendido aparece la sabiduría; Mas los ojos del necio vagan hasta el extremo de la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 17, 25, NULL, 'El hijo necio es pesadumbre de su padre, Y amargura a la que lo dio a luz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 17, 26, NULL, 'Ciertamente no es bueno condenar al justo, Ni herir a los nobles que hacen lo recto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 17, 27, NULL, 'El que ahorra sus palabras tiene sabiduría; De espíritu prudente es el hombre entendido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 17, 28, NULL, 'Aun el necio, cuando calla, es contado por sabio; El que cierra sus labios es entendido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 18, 1, NULL, 'Su deseo busca el que se desvía, Y se entremete en todo negocio.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 18, 2, NULL, 'No toma placer el necio en la inteligencia, Sino en que su corazón se descubra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 18, 3, NULL, 'Cuando viene el impío, viene también el menosprecio, Y con el deshonrador la afrenta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 18, 4, NULL, 'Aguas profundas son las palabras de la boca del hombre; Y arroyo que rebosa, la fuente de la sabiduría.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 18, 5, NULL, 'Tener respeto a la persona del impío, Para pervertir el derecho del justo, no es bueno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 18, 6, NULL, 'Los labios del necio traen contienda; Y su boca los azotes llama.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 18, 7, NULL, 'La boca del necio es quebrantamiento para sí, Y sus labios son lazos para su alma.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 18, 8, NULL, 'Las palabras del chismoso son como bocados suaves, Y penetran hasta las entrañas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 18, 9, NULL, 'También el que es negligente en su trabajo Es hermano del hombre disipador.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 18, 10, NULL, 'Torre fuerte es el nombre de Jehová; A él correrá el justo, y será levantado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 18, 11, NULL, 'Las riquezas del rico son su ciudad fortificada, Y como un muro alto en su imaginación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 18, 12, NULL, 'Antes del quebrantamiento se eleva el corazón del hombre, Y antes de la honra es el abatimiento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 18, 13, NULL, 'Al que responde palabra antes de oír, Le es fatuidad y oprobio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 18, 14, NULL, 'El ánimo del hombre soportará su enfermedad; Mas ¿quién soportará al ánimo angustiado?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 18, 15, NULL, 'El corazón del entendido adquiere sabiduría; Y el oído de los sabios busca la ciencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 18, 16, NULL, 'La dádiva del hombre le ensancha el camino Y le lleva delante de los grandes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 18, 17, NULL, 'Justo parece el primero que aboga por su causa; Pero viene su adversario, y le descubre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 18, 18, NULL, 'La suerte pone fin a los pleitos, Y decide entre los poderosos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 18, 19, NULL, 'El hermano ofendido es más tenaz que una ciudad fuerte, Y las contiendas de los hermanos son como cerrojos de alcázar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 18, 20, NULL, 'Del fruto de la boca del hombre se llenará su vientre; Se saciará del producto de sus labios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 18, 21, NULL, 'La muerte y la vida están en poder de la lengua, Y el que la ama comerá de sus frutos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 18, 22, NULL, 'El que halla esposa halla el bien, Y alcanza la benevolencia de Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 18, 23, NULL, 'El pobre habla con ruegos, Mas el rico responde durezas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 18, 24, NULL, 'El hombre que tiene amigos ha de mostrarse amigo; Y amigo hay más unido que un hermano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 19, 1, NULL, 'Mejor es el pobre que camina en integridad, Que el de perversos labios y fatuo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 19, 2, NULL, 'El alma sin ciencia no es buena, Y aquel que se apresura con los pies, peca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 19, 3, NULL, 'La insensatez del hombre tuerce su camino, Y luego contra Jehová se irrita su corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 19, 4, NULL, 'Las riquezas traen muchos amigos; Mas el pobre es apartado de su amigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 19, 5, NULL, 'El testigo falso no quedará sin castigo, Y el que habla mentiras no escapará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 19, 6, NULL, 'Muchos buscan el favor del generoso, Y cada uno es amigo del hombre que da.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 19, 7, NULL, 'Todos los hermanos del pobre le aborrecen; ¡Cuánto más sus amigos se alejarán de él! Buscará la palabra, y no la hallará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 19, 8, NULL, 'El que posee entendimiento ama su alma; El que guarda la inteligencia hallará el bien.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 19, 9, NULL, 'El testigo falso no quedará sin castigo, Y el que habla mentiras perecerá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 19, 10, NULL, 'No conviene al necio el deleite; ¡Cuánto menos al siervo ser señor de los príncipes!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 19, 11, NULL, 'La cordura del hombre detiene su furor, Y su honra es pasar por alto la ofensa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 19, 12, NULL, 'Como rugido de cachorro de león es la ira del rey, Y su favor como el rocío sobre la hierba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 19, 13, NULL, 'Dolor es para su padre el hijo necio, Y gotera continua las contiendas de la mujer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 19, 14, NULL, 'La casa y las riquezas son herencia de los padres; Mas de Jehová la mujer prudente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 19, 15, NULL, 'La pereza hace caer en profundo sueño, Y el alma negligente padecerá hambre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 19, 16, NULL, 'El que guarda el mandamiento guarda su alma; Mas el que menosprecia sus caminos morirá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 19, 17, NULL, 'A Jehová presta el que da al pobre, Y el bien que ha hecho, se lo volverá a pagar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 19, 18, NULL, 'Castiga a tu hijo en tanto que hay esperanza; Mas no se apresure tu alma para destruirlo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 19, 19, NULL, 'El de grande ira llevará la pena; Y si usa de violencias, añadirá nuevos males.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 19, 20, NULL, 'Escucha el consejo, y recibe la corrección, Para que seas sabio en tu vejez.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 19, 21, NULL, 'Muchos pensamientos hay en el corazón del hombre; Mas el consejo de Jehová permanecerá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 19, 22, NULL, 'Contentamiento es a los hombres hacer misericordia; Pero mejor es el pobre que el mentiroso.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 19, 23, NULL, 'El temor de Jehová es para vida, Y con él vivirá lleno de reposo el hombre; No será visitado de mal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 19, 24, NULL, 'El perezoso mete su mano en el plato, Y ni aun a su boca la llevará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 19, 25, NULL, 'Hiere al escarnecedor, y el simple se hará avisado; Y corrigiendo al entendido, entenderá ciencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 19, 26, NULL, 'El que roba a su padre y ahuyenta a su madre, Es hijo que causa vergüenza y acarrea oprobio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 19, 27, NULL, 'Cesa, hijo mío, de oír las enseñanzas Que te hacen divagar de las razones de sabiduría.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 19, 28, NULL, 'El testigo perverso se burlará del juicio, Y la boca de los impíos encubrirá la iniquidad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 19, 29, NULL, 'Preparados están juicios para los escarnecedores, Y azotes para las espaldas de los necios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 20, 1, NULL, 'El vino es escarnecedor, la sidra alborotadora, Y cualquiera que por ellos yerra no es sabio.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 20, 2, NULL, 'Como rugido de cachorro de león es el terror del rey; El que lo enfurece peca contra sí mismo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 20, 3, NULL, 'Honra es del hombre dejar la contienda; Mas todo insensato se envolverá en ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 20, 4, NULL, 'El perezoso no ara a causa del invierno; Pedirá, pues, en la siega, y no hallará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 20, 5, NULL, 'Como aguas profundas es el consejo en el corazón del hombre; Mas el hombre entendido lo alcanzará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 20, 6, NULL, 'Muchos hombres proclaman cada uno su propia bondad, Pero hombre de verdad, ¿quién lo hallará?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 20, 7, NULL, 'Camina en su integridad el justo; Sus hijos son dichosos después de él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 20, 8, NULL, 'El rey que se sienta en el trono de juicio, Con su mirar disipa todo mal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 20, 9, NULL, '¿Quién podrá decir: Yo he limpiado mi corazón, Limpio estoy de mi pecado?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 20, 10, NULL, 'Pesa falsa y medida falsa, Ambas cosas son abominación a Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 20, 11, NULL, 'Aun el muchacho es conocido por sus hechos, Si su conducta fuere limpia y recta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 20, 12, NULL, 'El oído que oye, y el ojo que ve, Ambas cosas igualmente ha hecho Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 20, 13, NULL, 'No ames el sueño, para que no te empobrezcas; Abre tus ojos, y te saciarás de pan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 20, 14, NULL, 'El que compra dice: Malo es, malo es; Mas cuando se aparta, se alaba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 20, 15, NULL, 'Hay oro y multitud de piedras preciosas; Mas los labios prudentes son joya preciosa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 20, 16, NULL, 'Quítale su ropa al que salió por fiador del extraño, Y toma prenda del que sale fiador por los extraños.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 20, 17, NULL, 'Sabroso es al hombre el pan de mentira; Pero después su boca será llena de cascajo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 20, 18, NULL, 'Los pensamientos con el consejo se ordenan; Y con dirección sabia se hace la guerra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 20, 19, NULL, 'El que anda en chismes descubre el secreto; No te entremetas, pues, con el suelto de lengua.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 20, 20, NULL, 'Al que maldice a su padre o a su madre, Se le apagará su lámpara en oscuridad tenebrosa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 20, 21, NULL, 'Los bienes que se adquieren de prisa al principio, No serán al final bendecidos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 20, 22, NULL, 'No digas: Yo me vengaré; Espera a Jehová, y él te salvará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 20, 23, NULL, 'Abominación son a Jehová las pesas falsas, Y la balanza falsa no es buena.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 20, 24, NULL, 'De Jehová son los pasos del hombre; ¿Cómo, pues, entenderá el hombre su camino?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 20, 25, NULL, 'Lazo es al hombre hacer apresuradamente voto de consagración, Y después de hacerlo, reflexionar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 20, 26, NULL, 'El rey sabio avienta a los impíos, Y sobre ellos hace rodar la rueda.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 20, 27, NULL, 'Lámpara de Jehová es el espíritu del hombre, La cual escudriña lo más profundo del corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 20, 28, NULL, 'Misericordia y verdad guardan al rey, Y con clemencia se sustenta su trono.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 20, 29, NULL, 'La gloria de los jóvenes es su fuerza, Y la hermosura de los ancianos es su vejez.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 20, 30, NULL, 'Los azotes que hieren son medicina para el malo, Y el castigo purifica el corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 21, 1, NULL, 'Como los repartimientos de las aguas, Así está el corazón del rey en la mano de Jehová; A todo lo que quiere lo inclina.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 21, 2, NULL, 'Todo camino del hombre es recto en su propia opinión; Pero Jehová pesa los corazones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 21, 3, NULL, 'Hacer justicia y juicio es a Jehová Más agradable que sacrificio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 21, 4, NULL, 'Altivez de ojos, y orgullo de corazón, Y pensamiento de impíos, son pecado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 21, 5, NULL, 'Los pensamientos del diligente ciertamente tienden a la abundancia; Mas todo el que se apresura alocadamente, de cierto va a la pobreza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 21, 6, NULL, 'Amontonar tesoros con lengua mentirosa Es aliento fugaz de aquellos que buscan la muerte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 21, 7, NULL, 'La rapiña de los impíos los destruirá, Por cuanto no quisieron hacer juicio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 21, 8, NULL, 'El camino del hombre perverso es torcido y extraño; Mas los hechos del limpio son rectos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 21, 9, NULL, 'Mejor es vivir en un rincón del terrado Que con mujer rencillosa en casa espaciosa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 21, 10, NULL, 'El alma del impío desea el mal; Su prójimo no halla favor en sus ojos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 21, 11, NULL, 'Cuando el escarnecedor es castigado, el simple se hace sabio; Y cuando se le amonesta al sabio, aprende ciencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 21, 12, NULL, 'Considera el justo la casa del impío, Cómo los impíos son trastornados por el mal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 21, 13, NULL, 'El que cierra su oído al clamor del pobre, También él clamará, y no será oído.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 21, 14, NULL, 'La dádiva en secreto calma el furor, Y el don en el seno, la fuerte ira.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 21, 15, NULL, 'Alegría es para el justo el hacer juicio; Mas destrucción a los que hacen iniquidad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 21, 16, NULL, 'El hombre que se aparta del camino de la sabiduría Vendrá a parar en la compañía de los muertos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 21, 17, NULL, 'Hombre necesitado será el que ama el deleite, Y el que ama el vino y los ungüentos no se enriquecerá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 21, 18, NULL, 'Rescate del justo es el impío, Y por los rectos, el prevaricador.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 21, 19, NULL, 'Mejor es morar en tierra desierta Que con la mujer rencillosa e iracunda.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 21, 20, NULL, 'Tesoro precioso y aceite hay en la casa del sabio; Mas el hombre insensato todo lo disipa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 21, 21, NULL, 'El que sigue la justicia y la misericordia Hallará la vida, la justicia y la honra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 21, 22, NULL, 'Tomó el sabio la ciudad de los fuertes, Y derribó la fuerza en que ella confiaba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 21, 23, NULL, 'El que guarda su boca y su lengua, Su alma guarda de angustias.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 21, 24, NULL, 'Escarnecedor es el nombre del soberbio y presuntuoso Que obra en la insolencia de su presunción.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 21, 25, NULL, 'El deseo del perezoso le mata, Porque sus manos no quieren trabajar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 21, 26, NULL, 'Hay quien todo el día codicia; Pero el justo da, y no detiene su mano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 21, 27, NULL, 'El sacrificio de los impíos es abominación; ¡Cuánto más ofreciéndolo con maldad!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 21, 28, NULL, 'El testigo mentiroso perecerá; Mas el hombre que oye, permanecerá en su dicho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 21, 29, NULL, 'El hombre impío endurece su rostro; Mas el recto ordena sus caminos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 21, 30, NULL, 'No hay sabiduría, ni inteligencia, Ni consejo, contra Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 21, 31, NULL, 'El caballo se alista para el día de la batalla; Mas Jehová es el que da la victoria.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 22, 1, NULL, 'De más estima es el buen nombre que las muchas riquezas, Y la buena fama más que la plata y el oro.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 22, 2, NULL, 'El rico y el pobre se encuentran; A ambos los hizo Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 22, 3, NULL, 'El avisado ve el mal y se esconde; Mas los simples pasan y reciben el daño.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 22, 4, NULL, 'Riquezas, honra y vida Son la remuneración de la humildad y del temor de Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 22, 5, NULL, 'Espinos y lazos hay en el camino del perverso; El que guarda su alma se alejará de ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 22, 6, NULL, 'Instruye al niño en su camino, Y aun cuando fuere viejo no se apartará de él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 22, 7, NULL, 'El rico se enseñorea de los pobres, Y el que toma prestado es siervo del que presta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 22, 8, NULL, 'El que sembrare iniquidad, iniquidad segará, Y la vara de su insolencia se quebrará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 22, 9, NULL, 'El ojo misericordioso será bendito, Porque dio de su pan al indigente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 22, 10, NULL, 'Echa fuera al escarnecedor, y saldrá la contienda, Y cesará el pleito y la afrenta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 22, 11, NULL, 'El que ama la limpieza de corazón, Por la gracia de sus labios tendrá la amistad del rey.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 22, 12, NULL, 'Los ojos de Jehová velan por la ciencia; Mas él trastorna las cosas de los prevaricadores.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 22, 13, NULL, 'Dice el perezoso: El león está fuera; Seré muerto en la calle.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 22, 14, NULL, 'Fosa profunda es la boca de la mujer extraña; Aquel contra el cual Jehová estuviere airado caerá en ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 22, 15, NULL, 'La necedad está ligada en el corazón del muchacho; Mas la vara de la corrección la alejará de él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 22, 16, NULL, 'El que oprime al pobre para aumentar sus ganancias, O que da al rico, ciertamente se empobrecerá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 22, 17, 'Preceptos y amonestaciones', 'Inclina tu oído y oye las palabras de los sabios, Y aplica tu corazón a mi sabiduría;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 22, 18, NULL, 'Porque es cosa deliciosa, si las guardares dentro de ti; Si juntamente se afirmaren sobre tus labios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 22, 19, NULL, 'Para que tu confianza sea en Jehová, Te las he hecho saber hoy a ti también.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 22, 20, NULL, '¿No te he escrito tres veces En consejos y en ciencia,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 22, 21, NULL, 'Para hacerte saber la certidumbre de las palabras de verdad, A fin de que vuelvas a llevar palabras de verdad a los que te enviaron?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 22, 22, NULL, 'No robes al pobre, porque es pobre, Ni quebrantes en la puerta al afligido;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 22, 23, NULL, 'Porque Jehová juzgará la causa de ellos, Y despojará el alma de aquellos que los despojaren.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 22, 24, NULL, 'No te entremetas con el iracundo, Ni te acompañes con el hombre de enojos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 22, 25, NULL, 'No sea que aprendas sus maneras, Y tomes lazo para tu alma.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 22, 26, NULL, 'No seas de aquellos que se comprometen, Ni de los que salen por fiadores de deudas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 22, 27, NULL, 'Si no tuvieres para pagar, ¿Por qué han de quitar tu cama de debajo de ti?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 22, 28, NULL, 'No traspases los linderos antiguos Que pusieron tus padres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 22, 29, NULL, '¿Has visto hombre solícito en su trabajo? Delante de los reyes estará; No estará delante de los de baja condición.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 23, 1, NULL, 'Cuando te sientes a comer con algún señor, Considera bien lo que está delante de ti,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 23, 2, NULL, 'Y pon cuchillo a tu garganta, Si tienes gran apetito.', 0, 'spa', 'RVR1960', NULL);\n"
;

  public static final String SQL_PARTE_3 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Pr', 23, 3, NULL, 'No codicies sus manjares delicados, Porque es pan engañoso.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 23, 4, NULL, 'No te afanes por hacerte rico; Sé prudente, y desiste.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 23, 5, NULL, '¿Has de poner tus ojos en las riquezas, siendo ningunas? Porque se harán alas Como alas de águila, y volarán al cielo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 23, 6, NULL, 'No comas pan con el avaro, Ni codicies sus manjares;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 23, 7, NULL, 'Porque cual es su pensamiento en su corazón, tal es él. Come y bebe, te dirá; Mas su corazón no está contigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 23, 8, NULL, 'Vomitarás la parte que comiste, Y perderás tus suaves palabras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 23, 9, NULL, 'No hables a oídos del necio, Porque menospreciará la prudencia de tus razones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 23, 10, NULL, 'No traspases el lindero antiguo, Ni entres en la heredad de los huérfanos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 23, 11, NULL, 'Porque el defensor de ellos es el Fuerte, El cual juzgará la causa de ellos contra ti.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 23, 12, NULL, 'Aplica tu corazón a la enseñanza, Y tus oídos a las palabras de sabiduría.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 23, 13, NULL, 'No rehúses corregir al muchacho; Porque si lo castigas con vara, no morirá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 23, 14, NULL, 'Lo castigarás con vara, Y librarás su alma del Seol.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 23, 15, NULL, 'Hijo mío, si tu corazón fuere sabio, También a mí se me alegrará el corazón;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 23, 16, NULL, 'Mis entrañas también se alegrarán Cuando tus labios hablaren cosas rectas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 23, 17, NULL, 'No tenga tu corazón envidia de los pecadores, Antes persevera en el temor de Jehová todo el tiempo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 23, 18, NULL, 'Porque ciertamente hay fin, Y tu esperanza no será cortada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 23, 19, NULL, 'Oye, hijo mío, y sé sabio, Y endereza tu corazón al camino.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 23, 20, NULL, 'No estés con los bebedores de vino, Ni con los comedores de carne;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 23, 21, NULL, 'Porque el bebedor y el comilón empobrecerán, Y el sueño hará vestir vestidos rotos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 23, 22, NULL, 'Oye a tu padre, a aquel que te engendró; Y cuando tu madre envejeciere, no la menosprecies.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 23, 23, NULL, 'Compra la verdad, y no la vendas; La sabiduría, la enseñanza y la inteligencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 23, 24, NULL, 'Mucho se alegrará el padre del justo, Y el que engendra sabio se gozará con él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 23, 25, NULL, 'Alégrense tu padre y tu madre, Y gócese la que te dio a luz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 23, 26, NULL, 'Dame, hijo mío, tu corazón, Y miren tus ojos por mis caminos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 23, 27, NULL, 'Porque abismo profundo es la ramera, Y pozo angosto la extraña.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 23, 28, NULL, 'También ella, como robador, acecha, Y multiplica entre los hombres los prevaricadores.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 23, 29, NULL, '¿Para quién será el ay? ¿Para quién el dolor? ¿Para quién las rencillas? ¿Para quién las quejas? ¿Para quién las heridas en balde? ¿Para quién lo amoratado de los ojos?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 23, 30, NULL, 'Para los que se detienen mucho en el vino, Para los que van buscando la mistura.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 23, 31, NULL, 'No mires al vino cuando rojea, Cuando resplandece su color en la copa. Se entra suavemente;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 23, 32, NULL, 'Mas al fin como serpiente morderá, Y como áspid dará dolor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 23, 33, NULL, 'Tus ojos mirarán cosas extrañas, Y tu corazón hablará perversidades.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 23, 34, NULL, 'Serás como el que yace en medio del mar, O como el que está en la punta de un mastelero.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 23, 35, NULL, 'Y dirás: Me hirieron, mas no me dolió; Me azotaron, mas no lo sentí; Cuando despertare, aún lo volveré a buscar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 24, 1, NULL, 'No tengas envidia de los hombres malos, Ni desees estar con ellos;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 24, 2, NULL, 'Porque su corazón piensa en robar, E iniquidad hablan sus labios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 24, 3, NULL, 'Con sabiduría se edificará la casa, Y con prudencia se afirmará;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 24, 4, NULL, 'Y con ciencia se llenarán las cámaras De todo bien preciado y agradable.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 24, 5, NULL, 'El hombre sabio es fuerte, Y de pujante vigor el hombre docto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 24, 6, NULL, 'Porque con ingenio harás la guerra, Y en la multitud de consejeros está la victoria.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 24, 7, NULL, 'Alta está para el insensato la sabiduría; En la puerta no abrirá él su boca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 24, 8, NULL, 'Al que piensa hacer el mal, Le llamarán hombre de malos pensamientos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 24, 9, NULL, 'El pensamiento del necio es pecado, Y abominación a los hombres el escarnecedor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 24, 10, NULL, 'Si fueres flojo en el día de trabajo, Tu fuerza será reducida.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 24, 11, NULL, 'Libra a los que son llevados a la muerte; Salva a los que están en peligro de muerte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 24, 12, NULL, 'Porque si dijeres: Ciertamente no lo supimos, ¿Acaso no lo entenderá el que pesa los corazones? El que mira por tu alma, él lo conocerá, Y dará al hombre según sus obras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 24, 13, NULL, 'Come, hijo mío, de la miel, porque es buena, Y el panal es dulce a tu paladar.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 24, 14, NULL, 'Así será a tu alma el conocimiento de la sabiduría; Si la hallares tendrás recompensa, Y al fin tu esperanza no será cortada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 24, 15, NULL, 'Oh impío, no aceches la tienda del justo, No saquees su cámara;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 24, 16, NULL, 'Porque siete veces cae el justo, y vuelve a levantarse; Mas los impíos caerán en el mal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 24, 17, NULL, 'Cuando cayere tu enemigo, no te regocijes, Y cuando tropezare, no se alegre tu corazón;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 24, 18, NULL, 'No sea que Jehová lo mire, y le desagrade, Y aparte de sobre él su enojo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 24, 19, NULL, 'No te entremetas con los malignos, Ni tengas envidia de los impíos;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 24, 20, NULL, 'Porque para el malo no habrá buen fin, Y la lámpara de los impíos será apagada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 24, 21, NULL, 'Teme a Jehová, hijo mío, y al rey; No te entremetas con los veleidosos;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 24, 22, NULL, 'Porque su quebrantamiento vendrá de repente; Y el quebrantamiento de ambos, ¿quién lo comprende?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 24, 23, NULL, 'También estos son dichos de los sabios: Hacer acepción de personas en el juicio no es bueno.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 24, 24, NULL, 'El que dijere al malo: Justo eres, Los pueblos lo maldecirán, y le detestarán las naciones;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 24, 25, NULL, 'Mas los que lo reprendieren tendrán felicidad, Y sobre ellos vendrá gran bendición.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 24, 26, NULL, 'Besados serán los labios Del que responde palabras rectas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 24, 27, NULL, 'Prepara tus labores fuera, Y disponlas en tus campos, Y después edificarás tu casa.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 24, 28, NULL, 'No seas sin causa testigo contra tu prójimo, Y no lisonjees con tus labios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 24, 29, NULL, 'No digas: Como me hizo, así le haré; Daré el pago al hombre según su obra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 24, 30, NULL, 'Pasé junto al campo del hombre perezoso, Y junto a la viña del hombre falto de entendimiento;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 24, 31, NULL, 'Y he aquí que por toda ella habían crecido los espinos, Ortigas habían ya cubierto su faz, Y su cerca de piedra estaba ya destruida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 24, 32, NULL, 'Miré, y lo puse en mi corazón; Lo vi, y tomé consejo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 24, 33, NULL, 'Un poco de sueño, cabeceando otro poco, Poniendo mano sobre mano otro poco para dormir;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 24, 34, NULL, 'Así vendrá como caminante tu necesidad, Y tu pobreza como hombre armado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 25, 1, 'Comparaciones y lecciones morales', 'También estos son proverbios de Salomón, los cuales copiaron los varones de Ezequías, rey de Judá:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 25, 2, NULL, 'Gloria de Dios es encubrir un asunto; Pero honra del rey es escudriñarlo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 25, 3, NULL, 'Para la altura de los cielos, y para la profundidad de la tierra, Y para el corazón de los reyes, no hay investigación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 25, 4, NULL, 'Quita las escorias de la plata, Y saldrá alhaja al fundidor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 25, 5, NULL, 'Aparta al impío de la presencia del rey, Y su trono se afirmará en justicia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 25, 6, NULL, 'No te alabes delante del rey, Ni estés en el lugar de los grandes;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 25, 7, NULL, 'Porque mejor es que se te diga: Sube acá, Y no que seas humillado delante del príncipe A quien han mirado tus ojos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 25, 8, NULL, 'No entres apresuradamente en pleito, No sea que no sepas qué hacer al fin, Después que tu prójimo te haya avergonzado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 25, 9, NULL, 'Trata tu causa con tu compañero, Y no descubras el secreto a otro,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 25, 10, NULL, 'No sea que te deshonre el que lo oyere, Y tu infamia no pueda repararse.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 25, 11, NULL, 'Manzana de oro con figuras de plata Es la palabra dicha como conviene.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 25, 12, NULL, 'Como zarcillo de oro y joyel de oro fino Es el que reprende al sabio que tiene oído dócil.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 25, 13, NULL, 'Como frío de nieve en tiempo de la siega, Así es el mensajero fiel a los que lo envían, Pues al alma de su señor da refrigerio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 25, 14, NULL, 'Como nubes y vientos sin lluvia, Así es el hombre que se jacta de falsa liberalidad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 25, 15, NULL, 'Con larga paciencia se aplaca el príncipe, Y la lengua blanda quebranta los huesos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 25, 16, NULL, '¿Hallaste miel? Come lo que te basta, No sea que hastiado de ella la vomites.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 25, 17, NULL, 'Detén tu pie de la casa de tu vecino, No sea que hastiado de ti te aborrezca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 25, 18, NULL, 'Martillo y cuchillo y saeta aguda Es el hombre que habla contra su prójimo falso testimonio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 25, 19, NULL, 'Como diente roto y pie descoyuntado Es la confianza en el prevaricador en tiempo de angustia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 25, 20, NULL, 'El que canta canciones al corazón afligido Es como el que quita la ropa en tiempo de frío, o el que sobre el jabón echa vinagre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 25, 21, NULL, 'Si el que te aborrece tuviere hambre, dale de comer pan, Y si tuviere sed, dale de beber agua;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 25, 22, NULL, 'Porque ascuas amontonarás sobre su cabeza, Y Jehová te lo pagará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 25, 23, NULL, 'El viento del norte ahuyenta la lluvia, Y el rostro airado la lengua detractora.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 25, 24, NULL, 'Mejor es estar en un rincón del terrado, Que con mujer rencillosa en casa espaciosa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 25, 25, NULL, 'Como el agua fría al alma sedienta, Así son las buenas nuevas de lejanas tierras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 25, 26, NULL, 'Como fuente turbia y manantial corrompido, Es el justo que cae delante del impío.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 25, 27, NULL, 'Comer mucha miel no es bueno, Ni el buscar la propia gloria es gloria.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 25, 28, NULL, 'Como ciudad derribada y sin muro Es el hombre cuyo espíritu no tiene rienda.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 26, 1, NULL, 'Como no conviene la nieve en el verano, ni la lluvia en la siega, Así no conviene al necio la honra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 26, 2, NULL, 'Como el gorrión en su vagar, y como la golondrina en su vuelo, Así la maldición nunca vendrá sin causa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 26, 3, NULL, 'El látigo para el caballo, el cabestro para el asno, Y la vara para la espalda del necio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 26, 4, NULL, 'Nunca respondas al necio de acuerdo con su necedad, Para que no seas tú también como él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 26, 5, NULL, 'Responde al necio como merece su necedad, Para que no se estime sabio en su propia opinión.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 26, 6, NULL, 'Como el que se corta los pies y bebe su daño, Así es el que envía recado por mano de un necio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 26, 7, NULL, 'Las piernas del cojo penden inútiles; Así es el proverbio en la boca del necio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 26, 8, NULL, 'Como quien liga la piedra en la honda, Así hace el que da honra al necio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 26, 9, NULL, 'Espinas hincadas en mano del embriagado, Tal es el proverbio en la boca de los necios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 26, 10, NULL, 'Como arquero que a todos hiere, Es el que toma a sueldo insensatos y vagabundos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 26, 11, NULL, 'Como perro que vuelve a su vómito, Así es el necio que repite su necedad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 26, 12, NULL, '¿Has visto hombre sabio en su propia opinión? Más esperanza hay del necio que de él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 26, 13, NULL, 'Dice el perezoso: El león está en el camino; El león está en las calles.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 26, 14, NULL, 'Como la puerta gira sobre sus quicios, Así el perezoso se vuelve en su cama.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 26, 15, NULL, 'Mete el perezoso su mano en el plato; Se cansa de llevarla a su boca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 26, 16, NULL, 'En su propia opinión el perezoso es más sabio Que siete que sepan aconsejar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 26, 17, NULL, 'El que pasando se deja llevar de la ira en pleito ajeno Es como el que toma al perro por las orejas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 26, 18, NULL, 'Como el que enloquece, y echa llamas Y saetas y muerte,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 26, 19, NULL, 'Tal es el hombre que engaña a su amigo, Y dice: Ciertamente lo hice por broma.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 26, 20, NULL, 'Sin leña se apaga el fuego, Y donde no hay chismoso, cesa la contienda.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 26, 21, NULL, 'El carbón para brasas, y la leña para el fuego; Y el hombre rencilloso para encender contienda.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 26, 22, NULL, 'Las palabras del chismoso son como bocados suaves, Y penetran hasta las entrañas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 26, 23, NULL, 'Como escoria de plata echada sobre el tiesto Son los labios lisonjeros y el corazón malo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 26, 24, NULL, 'El que odia disimula con sus labios; Mas en su interior maquina engaño.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 26, 25, NULL, 'Cuando hablare amigablemente, no le creas; Porque siete abominaciones hay en su corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 26, 26, NULL, 'Aunque su odio se cubra con disimulo, Su maldad será descubierta en la congregación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 26, 27, NULL, 'El que cava foso caerá en él; Y al que revuelve la piedra, sobre él le volverá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 26, 28, NULL, 'La lengua falsa atormenta al que ha lastimado, Y la boca lisonjera hace resbalar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 27, 1, NULL, 'No te jactes del día de mañana; Porque no sabes qué dará de sí el día.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 27, 2, NULL, 'Alábete el extraño, y no tu propia boca; El ajeno, y no los labios tuyos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 27, 3, NULL, 'Pesada es la piedra, y la arena pesa; Mas la ira del necio es más pesada que ambas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 27, 4, NULL, 'Cruel es la ira, e impetuoso el furor; Mas ¿quién podrá sostenerse delante de la envidia?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 27, 5, NULL, 'Mejor es reprensión manifiesta Que amor oculto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 27, 6, NULL, 'Fieles son las heridas del que ama; Pero importunos los besos del que aborrece.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 27, 7, NULL, 'El hombre saciado desprecia el panal de miel; Pero al hambriento todo lo amargo es dulce.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 27, 8, NULL, 'Cual ave que se va de su nido, Tal es el hombre que se va de su lugar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 27, 9, NULL, 'El ungüento y el perfume alegran el corazón, Y el cordial consejo del amigo, al hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 27, 10, NULL, 'No dejes a tu amigo, ni al amigo de tu padre; Ni vayas a la casa de tu hermano en el día de tu aflicción. Mejor es el vecino cerca que el hermano lejos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 27, 11, NULL, 'Sé sabio, hijo mío, y alegra mi corazón, Y tendré qué responder al que me agravie.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 27, 12, NULL, 'El avisado ve el mal y se esconde; Mas los simples pasan y llevan el daño.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 27, 13, NULL, 'Quítale su ropa al que salió fiador por el extraño; Y al que fía a la extraña, tómale prenda.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 27, 14, NULL, 'El que bendice a su amigo en alta voz, madrugando de mañana, Por maldición se le contará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 27, 15, NULL, 'Gotera continua en tiempo de lluvia Y la mujer rencillosa, son semejantes;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 27, 16, NULL, 'Pretender contenerla es como refrenar el viento, O sujetar el aceite en la mano derecha.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 27, 17, NULL, 'Hierro con hierro se aguza; Y así el hombre aguza el rostro de su amigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 27, 18, NULL, 'Quien cuida la higuera comerá su fruto, Y el que mira por los intereses de su señor, tendrá honra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 27, 19, NULL, 'Como en el agua el rostro corresponde al rostro, Así el corazón del hombre al del hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 27, 20, NULL, 'El Seol y el Abadón nunca se sacian; Así los ojos del hombre nunca están satisfechos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 27, 21, NULL, 'El crisol prueba la plata, y la hornaza el oro, Y al hombre la boca del que lo alaba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 27, 22, NULL, 'Aunque majes al necio en un mortero entre granos de trigo majados con el pisón, No se apartará de él su necedad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 27, 23, NULL, 'Sé diligente en conocer el estado de tus ovejas, Y mira con cuidado por tus rebaños;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 27, 24, NULL, 'Porque las riquezas no duran para siempre; ¿Y será la corona para perpetuas generaciones?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 27, 25, NULL, 'Saldrá la grama, aparecerá la hierba, Y se segarán las hierbas de los montes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 27, 26, NULL, 'Los corderos son para tus vestidos, Y los cabritos para el precio del campo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 27, 27, NULL, 'Y abundancia de leche de las cabras para tu mantenimiento, para mantenimiento de tu casa, Y para sustento de tus criadas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 28, 1, 'Proverbios antitéticos', 'Huye el impío sin que nadie lo persiga; Mas el justo está confiado como un león.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 28, 2, NULL, 'Por la rebelión de la tierra sus príncipes son muchos; Mas por el hombre entendido y sabio permanece estable.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 28, 3, NULL, 'El hombre pobre y robador de los pobres Es como lluvia torrencial que deja sin pan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 28, 4, NULL, 'Los que dejan la ley alaban a los impíos; Mas los que la guardan contenderán con ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 28, 5, NULL, 'Los hombres malos no entienden el juicio; Mas los que buscan a Jehová entienden todas las cosas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 28, 6, NULL, 'Mejor es el pobre que camina en su integridad, Que el de perversos caminos y rico.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 28, 7, NULL, 'El que guarda la ley es hijo prudente; Mas el que es compañero de glotones avergüenza a su padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 28, 8, NULL, 'El que aumenta sus riquezas con usura y crecido interés, Para aquel que se compadece de los pobres las aumenta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 28, 9, NULL, 'El que aparta su oído para no oír la ley, Su oración también es abominable.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 28, 10, NULL, 'El que hace errar a los rectos por el mal camino, Él caerá en su misma fosa; Mas los perfectos heredarán el bien.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 28, 11, NULL, 'El hombre rico es sabio en su propia opinión; Mas el pobre entendido lo escudriña.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 28, 12, NULL, 'Cuando los justos se alegran, grande es la gloria; Mas cuando se levantan los impíos, tienen que esconderse los hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 28, 13, NULL, 'El que encubre sus pecados no prosperará; Mas el que los confiesa y se aparta alcanzará misericordia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 28, 14, NULL, 'Bienaventurado el hombre que siempre teme a Dios; Mas el que endurece su corazón caerá en el mal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 28, 15, NULL, 'León rugiente y oso hambriento Es el príncipe impío sobre el pueblo pobre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 28, 16, NULL, 'El príncipe falto de entendimiento multiplicará la extorsión; Mas el que aborrece la avaricia prolongará sus días.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 28, 17, NULL, 'El hombre cargado de la sangre de alguno Huirá hasta el sepulcro, y nadie le detendrá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 28, 18, NULL, 'El que en integridad camina será salvo; Mas el de perversos caminos caerá en alguno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 28, 19, NULL, 'El que labra su tierra se saciará de pan; Mas el que sigue a los ociosos se llenará de pobreza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 28, 20, NULL, 'El hombre de verdad tendrá muchas bendiciones; Mas el que se apresura a enriquecerse no será sin culpa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 28, 21, NULL, 'Hacer acepción de personas no es bueno; Hasta por un bocado de pan prevaricará el hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 28, 22, NULL, 'Se apresura a ser rico el avaro, Y no sabe que le ha de venir pobreza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 28, 23, NULL, 'El que reprende al hombre, hallará después mayor gracia Que el que lisonjea con la lengua.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 28, 24, NULL, 'El que roba a su padre o a su madre, y dice que no es maldad, Compañero es del hombre destruidor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 28, 25, NULL, 'El altivo de ánimo suscita contiendas; Mas el que confía en Jehová prosperará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 28, 26, NULL, 'El que confía en su propio corazón es necio; Mas el que camina en sabiduría será librado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 28, 27, NULL, 'El que da al pobre no tendrá pobreza; Mas el que aparta sus ojos tendrá muchas maldiciones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 28, 28, NULL, 'Cuando los impíos son levantados se esconde el hombre; Mas cuando perecen, los justos se multiplican.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 29, 1, NULL, 'El hombre que reprendido endurece la cerviz, De repente será quebrantado, y no habrá para él medicina.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 29, 2, NULL, 'Cuando los justos dominan, el pueblo se alegra; Mas cuando domina el impío, el pueblo gime.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 29, 3, NULL, 'El hombre que ama la sabiduría alegra a su padre; Mas el que frecuenta rameras perderá los bienes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 29, 4, NULL, 'El rey con el juicio afirma la tierra; Mas el que exige presentes la destruye.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 29, 5, NULL, 'El hombre que lisonjea a su prójimo, Red tiende delante de sus pasos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 29, 6, NULL, 'En la transgresión del hombre malo hay lazo; Mas el justo cantará y se alegrará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 29, 7, NULL, 'Conoce el justo la causa de los pobres; Mas el impío no entiende sabiduría.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 29, 8, NULL, 'Los hombres escarnecedores ponen la ciudad en llamas; Mas los sabios apartan la ira.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 29, 9, NULL, 'Si el hombre sabio contendiere con el necio, Que se enoje o que se ría, no tendrá reposo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 29, 10, NULL, 'Los hombres sanguinarios aborrecen al perfecto, Mas los rectos buscan su contentamiento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 29, 11, NULL, 'El necio da rienda suelta a toda su ira, Mas el sabio al fin la sosiega.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 29, 12, NULL, 'Si un gobernante atiende la palabra mentirosa, Todos sus servidores serán impíos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 29, 13, NULL, 'El pobre y el usurero se encuentran; Jehová alumbra los ojos de ambos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 29, 14, NULL, 'Del rey que juzga con verdad a los pobres, El trono será firme para siempre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 29, 15, NULL, 'La vara y la corrección dan sabiduría; Mas el muchacho consentido avergonzará a su madre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 29, 16, NULL, 'Cuando los impíos son muchos, mucha es la transgresión; Mas los justos verán la ruina de ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 29, 17, NULL, 'Corrige a tu hijo, y te dará descanso, Y dará alegría a tu alma.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 29, 18, NULL, 'Sin profecía el pueblo se desenfrena; Mas el que guarda la ley es bienaventurado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 29, 19, NULL, 'El siervo no se corrige con palabras; Porque entiende, mas no hace caso.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 29, 20, NULL, '¿Has visto hombre ligero en sus palabras? Más esperanza hay del necio que de él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 29, 21, NULL, 'El siervo mimado desde la niñez por su amo, A la postre será su heredero.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 29, 22, NULL, 'El hombre iracundo levanta contiendas, Y el furioso muchas veces peca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 29, 23, NULL, 'La soberbia del hombre le abate; Pero al humilde de espíritu sustenta la honra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 29, 24, NULL, 'El cómplice del ladrón aborrece su propia alma; Pues oye la imprecación y no dice nada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 29, 25, NULL, 'El temor del hombre pondrá lazo; Mas el que confía en Jehová será exaltado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 29, 26, NULL, 'Muchos buscan el favor del príncipe; Mas de Jehová viene el juicio de cada uno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 29, 27, NULL, 'Abominación es a los justos el hombre inicuo; Y abominación es al impío el de caminos rectos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 30, 1, 'Las palabras de Agur', 'Palabras de Agur, hijo de Jaqué; la profecía que dijo el varón a Itiel, a Itiel y a Ucal.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 30, 2, NULL, 'Ciertamente más rudo soy yo que ninguno, Ni tengo entendimiento de hombre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 30, 3, NULL, 'Yo ni aprendí sabiduría, Ni conozco la ciencia del Santo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 30, 4, NULL, '¿Quién subió al cielo, y descendió? ¿Quién encerró los vientos en sus puños? ¿Quién ató las aguas en un paño? ¿Quién afirmó todos los términos de la tierra? ¿Cuál es su nombre, y el nombre de su hijo, si sabes?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 30, 5, NULL, 'Toda palabra de Dios es limpia; Él es escudo a los que en él esperan.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 30, 6, NULL, 'No añadas a sus palabras, para que no te reprenda, Y seas hallado mentiroso.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 30, 7, NULL, 'Dos cosas te he demandado; No me las niegues antes que muera:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 30, 8, NULL, 'Vanidad y palabra mentirosa aparta de mí; No me des pobreza ni riquezas; Manténme del pan necesario;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 30, 9, NULL, 'No sea que me sacie, y te niegue, y diga: ¿Quién es Jehová? O que siendo pobre, hurte, Y blasfeme el nombre de mi Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 30, 10, NULL, 'No acuses al siervo ante su señor, No sea que te maldiga, y lleves el castigo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 30, 11, NULL, 'Hay generación que maldice a su padre Y a su madre no bendice.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 30, 12, NULL, 'Hay generación limpia en su propia opinión, Si bien no se ha limpiado de su inmundicia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 30, 13, NULL, 'Hay generación cuyos ojos son altivos Y cuyos párpados están levantados en alto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 30, 14, NULL, 'Hay generación cuyos dientes son espadas, y sus muelas cuchillos, Para devorar a los pobres de la tierra, y a los menesterosos de entre los hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 30, 15, NULL, 'La sanguijuela tiene dos hijas que dicen: ¡Dame! ¡dame! Tres cosas hay que nunca se sacian; Aun la cuarta nunca dice: ¡Basta!', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 30, 16, NULL, 'El Seol, la matriz estéril, La tierra que no se sacia de aguas, Y el fuego que jamás dice: ¡Basta!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 30, 17, NULL, 'El ojo que escarnece a su padre Y menosprecia la enseñanza de la madre, Los cuervos de la cañada lo saquen, Y lo devoren los hijos del águila.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 30, 18, NULL, 'Tres cosas me son ocultas; Aun tampoco sé la cuarta:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 30, 19, NULL, 'El rastro del águila en el aire; El rastro de la culebra sobre la peña; El rastro de la nave en medio del mar; Y el rastro del hombre en la doncella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 30, 20, NULL, 'El proceder de la mujer adúltera es así: Come, y limpia su boca Y dice: No he hecho maldad.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 30, 21, NULL, 'Por tres cosas se alborota la tierra, Y la cuarta ella no puede sufrir:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 30, 22, NULL, 'Por el siervo cuando reina; Por el necio cuando se sacia de pan;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 30, 23, NULL, 'Por la mujer odiada cuando se casa; Y por la sierva cuando hereda a su señora.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 30, 24, NULL, 'Cuatro cosas son de las más pequeñas de la tierra, Y las mismas son más sabias que los sabios:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 30, 25, NULL, 'Las hormigas, pueblo no fuerte, Y en el verano preparan su comida;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 30, 26, NULL, 'Los conejos, pueblo nada esforzado, Y ponen su casa en la piedra;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 30, 27, NULL, 'Las langostas, que no tienen rey, Y salen todas por cuadrillas;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 30, 28, NULL, 'La araña que atrapas con la mano, Y está en palacios de rey.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 30, 29, NULL, 'Tres cosas hay de hermoso andar, Y la cuarta pasea muy bien:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 30, 30, NULL, 'El león, fuerte entre todos los animales, Que no vuelve atrás por nada;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 30, 31, NULL, 'El ceñido de lomos; asimismo el macho cabrío; Y el rey, a quien nadie resiste.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 30, 32, NULL, 'Si neciamente has procurado enaltecerte, O si has pensado hacer mal, Pon el dedo sobre tu boca.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 30, 33, NULL, 'Ciertamente el que bate la leche sacará mantequilla, Y el que recio se suena las narices sacará sangre; Y el que provoca la ira causará contienda.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 31, 1, 'Exhortación a un rey', 'Palabras del rey Lemuel; la profecía con que le enseñó su madre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 31, 2, NULL, '¿Qué, hijo mío? ¿y qué, hijo de mi vientre? ¿Y qué, hijo de mis deseos?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 31, 3, NULL, 'No des a las mujeres tu fuerza, Ni tus caminos a lo que destruye a los reyes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 31, 4, NULL, 'No es de los reyes, oh Lemuel, no es de los reyes beber vino, Ni de los príncipes la sidra;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 31, 5, NULL, 'No sea que bebiendo olviden la ley, Y perviertan el derecho de todos los afligidos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 31, 6, NULL, 'Dad la sidra al desfallecido, Y el vino a los de amargado ánimo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 31, 7, NULL, 'Beban, y olvídense de su necesidad, Y de su miseria no se acuerden más.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 31, 8, NULL, 'Abre tu boca por el mudo En el juicio de todos los desvalidos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 31, 9, NULL, 'Abre tu boca, juzga con justicia, Y defiende la causa del pobre y del menesteroso.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 31, 10, 'Elogio de la mujer virtuosa', 'Mujer virtuosa, ¿quién la hallará? Porque su estima sobrepasa largamente a la de las piedras preciosas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 31, 11, NULL, 'El corazón de su marido está en ella confiado, Y no carecerá de ganancias.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 31, 12, NULL, 'Le da ella bien y no mal Todos los días de su vida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 31, 13, NULL, 'Busca lana y lino, Y con voluntad trabaja con sus manos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 31, 14, NULL, 'Es como nave de mercader; Trae su pan de lejos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 31, 15, NULL, 'Se levanta aun de noche Y da comida a su familia Y ración a sus criadas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 31, 16, NULL, 'Considera la heredad, y la compra, Y planta viña del fruto de sus manos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 31, 17, NULL, 'Ciñe de fuerza sus lomos, Y esfuerza sus brazos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 31, 18, NULL, 'Ve que van bien sus negocios; Su lámpara no se apaga de noche.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 31, 19, NULL, 'Aplica su mano al huso, Y sus manos a la rueca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 31, 20, NULL, 'Alarga su mano al pobre, Y extiende sus manos al menesteroso.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 31, 21, NULL, 'No tiene temor de la nieve por su familia, Porque toda su familia está vestida de ropas dobles.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 31, 22, NULL, 'Ella se hace tapices; De lino fino y púrpura es su vestido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 31, 23, NULL, 'Su marido es conocido en las puertas, Cuando se sienta con los ancianos de la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 31, 24, NULL, 'Hace telas, y vende, Y da cintas al mercader.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 31, 25, NULL, 'Fuerza y honor son su vestidura; Y se ríe de lo por venir.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 31, 26, NULL, 'Abre su boca con sabiduría, Y la ley de clemencia está en su lengua.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 31, 27, NULL, 'Considera los caminos de su casa, Y no come el pan de balde.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 31, 28, NULL, 'Se levantan sus hijos y la llaman bienaventurada; Y su marido también la alaba:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 31, 29, NULL, 'Muchas mujeres hicieron el bien; Mas tú sobrepasas a todas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 31, 30, NULL, 'Engañosa es la gracia, y vana la hermosura; La mujer que teme a Jehová, esa será alabada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Pr', 31, 31, NULL, 'Dadle del fruto de sus manos, Y alábenla en las puertas sus hechos.', 0, 'spa', 'RVR1960', NULL);\n"
;

}