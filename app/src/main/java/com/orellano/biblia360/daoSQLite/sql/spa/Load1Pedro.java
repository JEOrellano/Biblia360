package com.orellano.biblia360.daoSQLite.sql.spa;

public final class Load1Pedro {
  public Load1Pedro() {}
  public static final String SQL_PARTE_1 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', '1 P', 1, 1, 'Salutación', 'Pedro, apóstol de Jesucristo, a los expatriados de la dispersión en el Ponto, Galacia, Capadocia, Asia y Bitinia,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 1, 2, NULL, 'elegidos según la presciencia de Dios Padre en santificación del Espíritu, para obedecer y ser rociados con la sangre de Jesucristo: Gracia y paz os sean multiplicadas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 1, 3, 'Una esperanza viva', 'Bendito el Dios y Padre de nuestro Señor Jesucristo, que según su grande misericordia nos hizo renacer para una esperanza viva, por la resurrección de Jesucristo de los muertos,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 1, 4, NULL, 'para una herencia incorruptible, incontaminada e inmarcesible, reservada en los cielos para vosotros,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 1, 5, NULL, 'que sois guardados por el poder de Dios mediante la fe, para alcanzar la salvación que está preparada para ser manifestada en el tiempo postrero.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 1, 6, NULL, 'En lo cual vosotros os alegráis, aunque ahora por un poco de tiempo, si es necesario, tengáis que ser afligidos en diversas pruebas,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 1, 7, NULL, 'para que sometida a prueba vuestra fe, mucho más preciosa que el oro, el cual aunque perecedero se prueba con fuego, sea hallada en alabanza, gloria y honra cuando sea manifestado Jesucristo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 1, 8, NULL, 'a quien amáis sin haberle visto, en quien creyendo, aunque ahora no lo veáis, os alegráis con gozo inefable y glorioso;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 1, 9, NULL, 'obteniendo el fin de vuestra fe, que es la salvación de vuestras almas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 1, 10, NULL, 'Los profetas que profetizaron de la gracia destinada a vosotros, inquirieron y diligentemente indagaron acerca de esta salvación,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 1, 11, NULL, 'escudriñando qué persona y qué tiempo indicaba el Espíritu de Cristo que estaba en ellos, el cual anunciaba de antemano los sufrimientos de Cristo, y las glorias que vendrían tras ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 1, 12, NULL, 'A estos se les reveló que no para sí mismos, sino para nosotros, administraban las cosas que ahora os son anunciadas por los que os han predicado el evangelio por el Espíritu Santo enviado del cielo; cosas en las cuales anhelan mirar los ángeles.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 1, 13, 'Llamamiento a una vida santa', 'Por tanto, ceñid los lomos de vuestro entendimiento, sed sobrios, y esperad por completo en la gracia que se os traerá cuando Jesucristo sea manifestado;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 1, 14, NULL, 'como hijos obedientes, no os conforméis a los deseos que antes teníais estando en vuestra ignorancia;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 1, 15, NULL, 'sino, como aquel que os llamó es santo, sed también vosotros santos en toda vuestra manera de vivir;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 1, 16, NULL, 'porque escrito está: Sed santos, porque yo soy santo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 1, 17, NULL, 'Y si invocáis por Padre a aquel que sin acepción de personas juzga según la obra de cada uno, conducíos en temor todo el tiempo de vuestra peregrinación;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 1, 18, NULL, 'sabiendo que fuisteis rescatados de vuestra vana manera de vivir, la cual recibisteis de vuestros padres, no con cosas corruptibles, como oro o plata,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 1, 19, NULL, 'sino con la sangre preciosa de Cristo, como de un cordero sin mancha y sin contaminación,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 1, 20, NULL, 'ya destinado desde antes de la fundación del mundo, pero manifestado en los postreros tiempos por amor de vosotros,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 1, 21, NULL, 'y mediante el cual creéis en Dios, quien le resucitó de los muertos y le ha dado gloria, para que vuestra fe y esperanza sean en Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 1, 22, NULL, 'Habiendo purificado vuestras almas por la obediencia a la verdad, mediante el Espíritu, para el amor fraternal no fingido, amaos unos a otros entrañablemente, de corazón puro;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 1, 23, NULL, 'siendo renacidos, no de simiente corruptible, sino de incorruptible, por la palabra de Dios que vive y permanece para siempre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 1, 24, NULL, 'Porque: Toda carne es como hierba, Y toda la gloria del hombre como flor de la hierba. La hierba se seca, y la flor se cae;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 1, 25, NULL, 'Mas la palabra del Señor permanece para siempre. Y esta es la palabra que por el evangelio os ha sido anunciada.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 2, 1, NULL, 'Desechando, pues, toda malicia, todo engaño, hipocresía, envidias, y todas las detracciones,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 2, 2, NULL, 'desead, como niños recién nacidos, la leche espiritual no adulterada, para que por ella crezcáis para salvación,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 2, 3, NULL, 'si es que habéis gustado la benignidad del Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 2, 4, 'La piedra viva', 'Acercándoos a él, piedra viva, desechada ciertamente por los hombres, mas para Dios escogida y preciosa,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 2, 5, NULL, 'vosotros también, como piedras vivas, sed edificados como casa espiritual y sacerdocio santo, para ofrecer sacrificios espirituales aceptables a Dios por medio de Jesucristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 2, 6, NULL, 'Por lo cual también contiene la Escritura: He aquí, pongo en Sion la principal piedra del ángulo, escogida, preciosa; Y el que creyere en él, no será avergonzado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 2, 7, NULL, 'Para vosotros, pues, los que creéis, él es precioso; pero para los que no creen, La piedra que los edificadores desecharon, Ha venido a ser la cabeza del ángulo;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 2, 8, NULL, 'y: Piedra de tropiezo, y roca que hace caer, porque tropiezan en la palabra, siendo desobedientes; a lo cual fueron también destinados.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 2, 9, 'El pueblo de Dios', 'Mas vosotros sois linaje escogido, real sacerdocio, nación santa, pueblo adquirido por Dios, para que anunciéis las virtudes de aquel que os llamó de las tinieblas a su luz admirable;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 2, 10, NULL, 'vosotros que en otro tiempo no erais pueblo, pero que ahora sois pueblo de Dios; que en otro tiempo no habíais alcanzado misericordia, pero ahora habéis alcanzado misericordia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 2, 11, 'Vivid como siervos de Dios', 'Amados, yo os ruego como a extranjeros y peregrinos, que os abstengáis de los deseos carnales que batallan contra el alma,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 2, 12, NULL, 'manteniendo buena vuestra manera de vivir entre los gentiles; para que en lo que murmuran de vosotros como de malhechores, glorifiquen a Dios en el día de la visitación, al considerar vuestras buenas obras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 2, 13, NULL, 'Por causa del Señor someteos a toda institución humana, ya sea al rey, como a superior,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 2, 14, NULL, 'ya a los gobernadores, como por él enviados para castigo de los malhechores y alabanza de los que hacen bien.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 2, 15, NULL, 'Porque esta es la voluntad de Dios: que haciendo bien, hagáis callar la ignorancia de los hombres insensatos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 2, 16, NULL, 'como libres, pero no como los que tienen la libertad como pretexto para hacer lo malo, sino como siervos de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 2, 17, NULL, 'Honrad a todos. Amad a los hermanos. Temed a Dios. Honrad al rey.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 2, 18, NULL, 'Criados, estad sujetos con todo respeto a vuestros amos; no solamente a los buenos y afables, sino también a los difíciles de soportar.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 2, 19, NULL, 'Porque esto merece aprobación, si alguno a causa de la conciencia delante de Dios, sufre molestias padeciendo injustamente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 2, 20, NULL, 'Pues ¿qué gloria es, si pecando sois abofeteados, y lo soportáis? Mas si haciendo lo bueno sufrís, y lo soportáis, esto ciertamente es aprobado delante de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 2, 21, NULL, 'Pues para esto fuisteis llamados; porque también Cristo padeció por nosotros, dejándonos ejemplo, para que sigáis sus pisadas;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 2, 22, NULL, 'el cual no hizo pecado, ni se halló engaño en su boca;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 2, 23, NULL, 'quien cuando le maldecían, no respondía con maldición; cuando padecía, no amenazaba, sino encomendaba la causa al que juzga justamente;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 2, 24, NULL, 'quien llevó él mismo nuestros pecados en su cuerpo sobre el madero, para que nosotros, estando muertos a los pecados, vivamos a la justicia; y por cuya herida fuisteis sanados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 2, 25, NULL, 'Porque vosotros erais como ovejas descarriadas, pero ahora habéis vuelto al Pastor y Obispo de vuestras almas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 3, 1, 'Deberes conyugales', 'Asimismo vosotras, mujeres, estad sujetas a vuestros maridos; para que también los que no creen a la palabra, sean ganados sin palabra por la conducta de sus esposas,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 3, 2, NULL, 'considerando vuestra conducta casta y respetuosa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 3, 3, NULL, 'Vuestro atavío no sea el externo de peinados ostentosos, de adornos de oro o de vestidos lujosos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 3, 4, NULL, 'sino el interno, el del corazón, en el incorruptible ornato de un espíritu afable y apacible, que es de grande estima delante de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 3, 5, NULL, 'Porque así también se ataviaban en otro tiempo aquellas santas mujeres que esperaban en Dios, estando sujetas a sus maridos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 3, 6, NULL, 'como Sara obedecía a Abraham, llamándole señor; de la cual vosotras habéis venido a ser hijas, si hacéis el bien, sin temer ninguna amenaza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 3, 7, NULL, 'Vosotros, maridos, igualmente, vivid con ellas sabiamente, dando honor a la mujer como a vaso más frágil, y como a coherederas de la gracia de la vida, para que vuestras oraciones no tengan estorbo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 3, 8, 'Una buena conciencia', 'Finalmente, sed todos de un mismo sentir, compasivos, amándoos fraternalmente, misericordiosos, amigables;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 3, 9, NULL, 'no devolviendo mal por mal, ni maldición por maldición, sino por el contrario, bendiciendo, sabiendo que fuisteis llamados para que heredaseis bendición.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 3, 10, NULL, 'Porque: El que quiere amar la vida Y ver días buenos, Refrene su lengua de mal, Y sus labios no hablen engaño;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 3, 11, NULL, 'Apártese del mal, y haga el bien; Busque la paz, y sígala.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 3, 12, NULL, 'Porque los ojos del Señor están sobre los justos, Y sus oídos atentos a sus oraciones; Pero el rostro del Señor está contra aquellos que hacen el mal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 3, 13, NULL, '¿Y quién es aquel que os podrá hacer daño, si vosotros seguís el bien?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 3, 14, NULL, 'Mas también si alguna cosa padecéis por causa de la justicia, bienaventurados sois. Por tanto, no os amedrentéis por temor de ellos, ni os conturbéis,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 3, 15, NULL, 'sino santificad a Dios el Señor en vuestros corazones, y estad siempre preparados para presentar defensa con mansedumbre y reverencia ante todo el que os demande razón de la esperanza que hay en vosotros;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 3, 16, NULL, 'teniendo buena conciencia, para que en lo que murmuran de vosotros como de malhechores, sean avergonzados los que calumnian vuestra buena conducta en Cristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 3, 17, NULL, 'Porque mejor es que padezcáis haciendo el bien, si la voluntad de Dios así lo quiere, que haciendo el mal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 3, 18, NULL, 'Porque también Cristo padeció una sola vez por los pecados, el justo por los injustos, para llevarnos a Dios, siendo a la verdad muerto en la carne, pero vivificado en espíritu;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 3, 19, NULL, 'en el cual también fue y predicó a los espíritus encarcelados,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 3, 20, NULL, 'los que en otro tiempo desobedecieron, cuando una vez esperaba la paciencia de Dios en los días de Noé, mientras se preparaba el arca, en la cual pocas personas, es decir, ocho, fueron salvadas por agua.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 3, 21, NULL, 'El bautismo que corresponde a esto ahora nos salva (no quitando las inmundicias de la carne, sino como la aspiración de una buena conciencia hacia Dios) por la resurrección de Jesucristo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 3, 22, NULL, 'quien habiendo subido al cielo está a la diestra de Dios; y a él están sujetos ángeles, autoridades y potestades.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 4, 1, 'Buenos administradores de la gracia de Dios', 'Puesto que Cristo ha padecido por nosotros en la carne, vosotros también armaos del mismo pensamiento; pues quien ha padecido en la carne, terminó con el pecado,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 4, 2, NULL, 'para no vivir el tiempo que resta en la carne, conforme a las concupiscencias de los hombres, sino conforme a la voluntad de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 4, 3, NULL, 'Baste ya el tiempo pasado para haber hecho lo que agrada a los gentiles, andando en lascivias, concupiscencias, embriagueces, orgías, disipación y abominables idolatrías.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 4, 4, NULL, 'A estos les parece cosa extraña que vosotros no corráis con ellos en el mismo desenfreno de disolución, y os ultrajan;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 4, 5, NULL, 'pero ellos darán cuenta al que está preparado para juzgar a los vivos y a los muertos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 4, 6, NULL, 'Porque por esto también ha sido predicado el evangelio a los muertos, para que sean juzgados en carne según los hombres, pero vivan en espíritu según Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 4, 7, NULL, 'Mas el fin de todas las cosas se acerca; sed, pues, sobrios, y velad en oración.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 4, 8, NULL, 'Y ante todo, tened entre vosotros ferviente amor; porque el amor cubrirá multitud de pecados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 4, 9, NULL, 'Hospedaos los unos a los otros sin murmuraciones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 4, 10, NULL, 'Cada uno según el don que ha recibido, minístrelo a los otros, como buenos administradores de la multiforme gracia de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 4, 11, NULL, 'Si alguno habla, hable conforme a las palabras de Dios; si alguno ministra, ministre conforme al poder que Dios da, para que en todo sea Dios glorificado por Jesucristo, a quien pertenecen la gloria y el imperio por los siglos de los siglos. Amén.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 4, 12, 'Padeciendo como cristianos', 'Amados, no os sorprendáis del fuego de prueba que os ha sobrevenido, como si alguna cosa extraña os aconteciese,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 4, 13, NULL, 'sino gozaos por cuanto sois participantes de los padecimientos de Cristo, para que también en la revelación de su gloria os gocéis con gran alegría.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 4, 14, NULL, 'Si sois vituperados por el nombre de Cristo, sois bienaventurados, porque el glorioso Espíritu de Dios reposa sobre vosotros. Ciertamente, de parte de ellos, él es blasfemado, pero por vosotros es glorificado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 4, 15, NULL, 'Así que, ninguno de vosotros padezca como homicida, o ladrón, o malhechor, o por entremeterse en lo ajeno;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 4, 16, NULL, 'pero si alguno padece como cristiano, no se avergüence, sino glorifique a Dios por ello.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 4, 17, NULL, 'Porque es tiempo de que el juicio comience por la casa de Dios; y si primero comienza por nosotros, ¿cuál será el fin de aquellos que no obedecen al evangelio de Dios?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 4, 18, NULL, 'Y: Si el justo con dificultad se salva, ¿En dónde aparecerá el impío y el pecador?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 4, 19, NULL, 'De modo que los que padecen según la voluntad de Dios, encomienden sus almas al fiel Creador, y hagan el bien.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 5, 1, 'Apacentad la grey de Dios', 'Ruego a los ancianos que están entre vosotros, yo anciano también con ellos, y testigo de los padecimientos de Cristo, que soy también participante de la gloria que será revelada:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 5, 2, NULL, 'Apacentad la grey de Dios que está entre vosotros, cuidando de ella, no por fuerza, sino voluntariamente; no por ganancia deshonesta, sino con ánimo pronto;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 5, 3, NULL, 'no como teniendo señorío sobre los que están a vuestro cuidado, sino siendo ejemplos de la grey.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 5, 4, NULL, 'Y cuando aparezca el Príncipe de los pastores, vosotros recibiréis la corona incorruptible de gloria.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 5, 5, NULL, 'Igualmente, jóvenes, estad sujetos a los ancianos; y todos, sumisos unos a otros, revestíos de humildad; porque: Dios resiste a los soberbios, Y da gracia a los humildes.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 5, 6, NULL, 'Humillaos, pues, bajo la poderosa mano de Dios, para que él os exalte cuando fuere tiempo;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 5, 7, NULL, 'echando toda vuestra ansiedad sobre él, porque él tiene cuidado de vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 5, 8, NULL, 'Sed sobrios, y velad; porque vuestro adversario el diablo, como león rugiente, anda alrededor buscando a quien devorar;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 5, 9, NULL, 'al cual resistid firmes en la fe, sabiendo que los mismos padecimientos se van cumpliendo en vuestros hermanos en todo el mundo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 5, 10, NULL, 'Mas el Dios de toda gracia, que nos llamó a su gloria eterna en Jesucristo, después que hayáis padecido un poco de tiempo, él mismo os perfeccione, afirme, fortalezca y establezca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 5, 11, NULL, 'A él sea la gloria y el imperio por los siglos de los siglos. Amén.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 5, 12, 'Salutaciones finales', 'Por conducto de Silvano, a quien tengo por hermano fiel, os he escrito brevemente, amonestándoos, y testificando que esta es la verdadera gracia de Dios, en la cual estáis.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 5, 13, NULL, 'La iglesia que está en Babilonia, elegida juntamente con vosotros, y Marcos mi hijo, os saludan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 P', 5, 14, NULL, 'Saludaos unos a otros con ósculo de amor. Paz sea con todos vosotros los que estáis en Jesucristo. Amén.', 0, 'spa', 'RVR1960', NULL);\n"
;

}