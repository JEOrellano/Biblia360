package com.orellano.biblia360.daoSQLite.sql.spa;

public final class Load2Timoteo {
  public Load2Timoteo() {}
  public static final String SQL_PARTE_1 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', '2 Tim', 1, 1, 'Salutación', 'Pablo, apóstol de Jesucristo por la voluntad de Dios, según la promesa de la vida que es en Cristo Jesús,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 1, 2, NULL, 'a Timoteo, amado hijo: Gracia, misericordia y paz, de Dios Padre y de Jesucristo nuestro Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 1, 3, 'Testificando de Cristo', 'Doy gracias a Dios, al cual sirvo desde mis mayores con limpia conciencia, de que sin cesar me acuerdo de ti en mis oraciones noche y día;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 1, 4, NULL, 'deseando verte, al acordarme de tus lágrimas, para llenarme de gozo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 1, 5, NULL, 'trayendo a la memoria la fe no fingida que hay en ti, la cual habitó primero en tu abuela Loida, y en tu madre Eunice, y estoy seguro que en ti también.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 1, 6, NULL, 'Por lo cual te aconsejo que avives el fuego del don de Dios que está en ti por la imposición de mis manos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 1, 7, NULL, 'Porque no nos ha dado Dios espíritu de cobardía, sino de poder, de amor y de dominio propio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 1, 8, NULL, 'Por tanto, no te avergüences de dar testimonio de nuestro Señor, ni de mí, preso suyo, sino participa de las aflicciones por el evangelio según el poder de Dios,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 1, 9, NULL, 'quien nos salvó y llamó con llamamiento santo, no conforme a nuestras obras, sino según el propósito suyo y la gracia que nos fue dada en Cristo Jesús antes de los tiempos de los siglos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 1, 10, NULL, 'pero que ahora ha sido manifestada por la aparición de nuestro Salvador Jesucristo, el cual quitó la muerte y sacó a luz la vida y la inmortalidad por el evangelio,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 1, 11, NULL, 'del cual yo fui constituido predicador, apóstol y maestro de los gentiles.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 1, 12, NULL, 'Por lo cual asimismo padezco esto; pero no me avergüenzo, porque yo sé a quién he creído, y estoy seguro que es poderoso para guardar mi depósito para aquel día.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 1, 13, NULL, 'Retén la forma de las sanas palabras que de mí oíste, en la fe y amor que es en Cristo Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 1, 14, NULL, 'Guarda el buen depósito por el Espíritu Santo que mora en nosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 1, 15, NULL, 'Ya sabes esto, que me abandonaron todos los que están en Asia, de los cuales son Figelo y Hermógenes.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 1, 16, NULL, 'Tenga el Señor misericordia de la casa de Onesíforo, porque muchas veces me confortó, y no se avergonzó de mis cadenas,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 1, 17, NULL, 'sino que cuando estuvo en Roma, me buscó solícitamente y me halló.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 1, 18, NULL, 'Concédale el Señor que halle misericordia cerca del Señor en aquel día. Y cuánto nos ayudó en Éfeso, tú lo sabes mejor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 2, 1, 'Un buen soldado de Jesucristo', 'Tú, pues, hijo mío, esfuérzate en la gracia que es en Cristo Jesús.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 2, 2, NULL, 'Lo que has oído de mí ante muchos testigos, esto encarga a hombres fieles que sean idóneos para enseñar también a otros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 2, 3, NULL, 'Tú, pues, sufre penalidades como buen soldado de Jesucristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 2, 4, NULL, 'Ninguno que milita se enreda en los negocios de la vida, a fin de agradar a aquel que lo tomó por soldado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 2, 5, NULL, 'Y también el que lucha como atleta, no es coronado si no lucha legítimamente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 2, 6, NULL, 'El labrador, para participar de los frutos, debe trabajar primero.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 2, 7, NULL, 'Considera lo que digo, y el Señor te dé entendimiento en todo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 2, 8, NULL, 'Acuérdate de Jesucristo, del linaje de David, resucitado de los muertos conforme a mi evangelio,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 2, 9, NULL, 'en el cual sufro penalidades, hasta prisiones a modo de malhechor; mas la palabra de Dios no está presa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 2, 10, NULL, 'Por tanto, todo lo soporto por amor de los escogidos, para que ellos también obtengan la salvación que es en Cristo Jesús con gloria eterna.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 2, 11, NULL, 'Palabra fiel es esta: Si somos muertos con él, también viviremos con él;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 2, 12, NULL, 'Si sufrimos, también reinaremos con él; Si le negáremos, él también nos negará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 2, 13, NULL, 'Si fuéremos infieles, él permanece fiel; Él no puede negarse a sí mismo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 2, 14, 'Un obrero aprobado', 'Recuérdales esto, exhortándoles delante del Señor a que no contiendan sobre palabras, lo cual para nada aprovecha, sino que es para perdición de los oyentes.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 2, 15, NULL, 'Procura con diligencia presentarte a Dios aprobado, como obrero que no tiene de qué avergonzarse, que usa bien la palabra de verdad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 2, 16, NULL, 'Mas evita profanas y vanas palabrerías, porque conducirán más y más a la impiedad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 2, 17, NULL, 'Y su palabra carcomerá como gangrena; de los cuales son Himeneo y Fileto,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 2, 18, NULL, 'que se desviaron de la verdad, diciendo que la resurrección ya se efectuó, y trastornan la fe de algunos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 2, 19, NULL, 'Pero el fundamento de Dios está firme, teniendo este sello: Conoce el Señor a los que son suyos; y: Apártese de iniquidad todo aquel que invoca el nombre de Cristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 2, 20, NULL, 'Pero en una casa grande, no solamente hay utensilios de oro y de plata, sino también de madera y de barro; y unos son para usos honrosos, y otros para usos viles.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 2, 21, NULL, 'Así que, si alguno se limpia de estas cosas, será instrumento para honra, santificado, útil al Señor, y dispuesto para toda buena obra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 2, 22, NULL, 'Huye también de las pasiones juveniles, y sigue la justicia, la fe, el amor y la paz, con los que de corazón limpio invocan al Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 2, 23, NULL, 'Pero desecha las cuestiones necias e insensatas, sabiendo que engendran contiendas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 2, 24, NULL, 'Porque el siervo del Señor no debe ser contencioso, sino amable para con todos, apto para enseñar, sufrido;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 2, 25, NULL, 'que con mansedumbre corrija a los que se oponen, por si quizá Dios les conceda que se arrepientan para conocer la verdad,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 2, 26, NULL, 'y escapen del lazo del diablo, en que están cautivos a voluntad de él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 3, 1, 'Carácter de los hombres en los postreros días', 'También debes saber esto: que en los postreros días vendrán tiempos peligrosos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 3, 2, NULL, 'Porque habrá hombres amadores de sí mismos, avaros, vanagloriosos, soberbios, blasfemos, desobedientes a los padres, ingratos, impíos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 3, 3, NULL, 'sin afecto natural, implacables, calumniadores, intemperantes, crueles, aborrecedores de lo bueno,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 3, 4, NULL, 'traidores, impetuosos, infatuados, amadores de los deleites más que de Dios,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 3, 5, NULL, 'que tendrán apariencia de piedad, pero negarán la eficacia de ella; a estos evita.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 3, 6, NULL, 'Porque de estos son los que se meten en las casas y llevan cautivas a las mujercillas cargadas de pecados, arrastradas por diversas concupiscencias.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 3, 7, NULL, 'Estas siempre están aprendiendo, y nunca pueden llegar al conocimiento de la verdad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 3, 8, NULL, 'Y de la manera que Janes y Jambres resistieron a Moisés, así también estos resisten a la verdad; hombres corruptos de entendimiento, réprobos en cuanto a la fe.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 3, 9, NULL, 'Mas no irán más adelante; porque su insensatez será manifiesta a todos, como también lo fue la de aquellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 3, 10, NULL, 'Pero tú has seguido mi doctrina, conducta, propósito, fe, longanimidad, amor, paciencia,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 3, 11, NULL, 'persecuciones, padecimientos, como los que me sobrevinieron en Antioquía, en Iconio, en Listra; persecuciones que he sufrido, y de todas me ha librado el Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 3, 12, NULL, 'Y también todos los que quieren vivir piadosamente en Cristo Jesús padecerán persecución;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 3, 13, NULL, 'mas los malos hombres y los engañadores irán de mal en peor, engañando y siendo engañados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 3, 14, NULL, 'Pero persiste tú en lo que has aprendido y te persuadiste, sabiendo de quién has aprendido;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 3, 15, NULL, 'y que desde la niñez has sabido las Sagradas Escrituras, las cuales te pueden hacer sabio para la salvación por la fe que es en Cristo Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 3, 16, NULL, 'Toda la Escritura es inspirada por Dios, y útil para enseñar, para redargüir, para corregir, para instruir en justicia,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 3, 17, NULL, 'a fin de que el hombre de Dios sea perfecto, enteramente preparado para toda buena obra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 4, 1, 'Predica la palabra', 'Te encarezco delante de Dios y del Señor Jesucristo, que juzgará a los vivos y a los muertos en su manifestación y en su reino,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 4, 2, NULL, 'que prediques la palabra; que instes a tiempo y fuera de tiempo; redarguye, reprende, exhorta con toda paciencia y doctrina.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 4, 3, NULL, 'Porque vendrá tiempo cuando no sufrirán la sana doctrina, sino que teniendo comezón de oír, se amontonarán maestros conforme a sus propias concupiscencias,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 4, 4, NULL, 'y apartarán de la verdad el oído y se volverán a las fábulas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 4, 5, NULL, 'Pero tú sé sobrio en todo, soporta las aflicciones, haz obra de evangelista, cumple tu ministerio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 4, 6, NULL, 'Porque yo ya estoy para ser sacrificado, y el tiempo de mi partida está cercano.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 4, 7, NULL, 'He peleado la buena batalla, he acabado la carrera, he guardado la fe.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 4, 8, NULL, 'Por lo demás, me está guardada la corona de justicia, la cual me dará el Señor, juez justo, en aquel día; y no solo a mí, sino también a todos los que aman su venida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 4, 9, 'Instrucciones personales', 'Procura venir pronto a verme,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 4, 10, NULL, 'porque Demas me ha desamparado, amando este mundo, y se ha ido a Tesalónica. Crescente fue a Galacia, y Tito a Dalmacia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 4, 11, NULL, 'Solo Lucas está conmigo. Toma a Marcos y tráele contigo, porque me es útil para el ministerio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 4, 12, NULL, 'A Tíquico lo envié a Éfeso.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 4, 13, NULL, 'Trae, cuando vengas, el capote que dejé en Troas en casa de Carpo, y los libros, mayormente los pergaminos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 4, 14, NULL, 'Alejandro el calderero me ha causado muchos males; el Señor le pague conforme a sus hechos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 4, 15, NULL, 'Guárdate tú también de él, pues en gran manera se ha opuesto a nuestras palabras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 4, 16, NULL, 'En mi primera defensa ninguno estuvo a mi lado, sino que todos me desampararon; no les sea tomado en cuenta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 4, 17, NULL, 'Pero el Señor estuvo a mi lado, y me dio fuerzas, para que por mí fuese cumplida la predicación, y que todos los gentiles oyesen. Así fui librado de la boca del león.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 4, 18, NULL, 'Y el Señor me librará de toda obra mala, y me preservará para su reino celestial. A él sea gloria por los siglos de los siglos. Amén.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 4, 19, 'Saludos y bendición final', 'Saluda a Prisca y a Aquila, y a la casa de Onesíforo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 4, 20, NULL, 'Erasto se quedó en Corinto, y a Trófimo dejé en Mileto enfermo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 4, 21, NULL, 'Procura venir antes del invierno. Eubulo te saluda, y Pudente, Lino, Claudia y todos los hermanos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '2 Tim', 4, 22, NULL, 'El Señor Jesucristo esté con tu espíritu. La gracia sea con vosotros. Amén.', 1, 'spa', 'RVR1960', NULL);\n"
;

}