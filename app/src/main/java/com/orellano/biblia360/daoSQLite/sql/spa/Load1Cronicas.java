package com.orellano.biblia360.daoSQLite.sql.spa;

public final class Load1Cronicas {
  public Load1Cronicas() {}
  public static final String SQL_PARTE_1 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 1, 'Descendientes de Adán', 'Adán, Set, Enós,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 2, NULL, 'Cainán, Mahalaleel, Jared,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 3, NULL, 'Enoc, Matusalén, Lamec,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 4, NULL, 'Noé, Sem, Cam y Jafet.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 5, 'Descendientes de los hijos de Noé', 'Los hijos de Jafet: Gomer, Magog, Madai, Javán, Tubal, Mesec y Tiras.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 6, NULL, 'Los hijos de Gomer: Askenaz, Rifat y Togarma.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 7, NULL, 'Los hijos de Javán: Elisa, Tarsis, Quitim y Dodanim.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 8, NULL, 'Los hijos de Cam: Cus, Mizraim, Fut y Canaán.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 9, NULL, 'Los hijos de Cus: Seba, Havila, Sabta, Raama y Sabteca. Y los hijos de Raama: Seba y Dedán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 10, NULL, 'Cus engendró a Nimrod; este llegó a ser poderoso en la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 11, NULL, 'Mizraim engendró a Ludim, Anamim, Lehabim, Naftuhim,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 12, NULL, 'Patrusim y Casluhim; de estos salieron los filisteos y los caftoreos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 13, NULL, 'Canaán engendró a Sidón su primogénito, y a Het,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 14, NULL, 'al jebuseo, al amorreo, al gergeseo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 15, NULL, 'al heveo, al araceo, al sineo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 16, NULL, 'al arvadeo, al zemareo y al hamateo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 17, NULL, 'Los hijos de Sem: Elam, Asur, Arfaxad, Lud, Aram, Uz, Hul, Geter y Mesec.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 18, NULL, 'Arfaxad engendró a Sela, y Sela engendró a Heber.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 19, NULL, 'Y a Heber nacieron dos hijos; el nombre del uno fue Peleg, por cuanto en sus días fue dividida la tierra; y el nombre de su hermano fue Joctán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 20, NULL, 'Joctán engendró a Almodad, Selef, Hazar-mavet y Jera.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 21, NULL, 'A Adoram también, a Uzal, Dicla,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 22, NULL, 'Ebal, Abimael, Seba,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 23, NULL, 'Ofir, Havila y Jobab; todos hijos de Joctán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 24, 'Descendientes de Sem', 'Sem, Arfaxad, Sela,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 25, NULL, 'Heber, Peleg, Reu,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 26, NULL, 'Serug, Nacor, Taré,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 27, NULL, 'y Abram, el cual es Abraham.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 28, 'Descendientes de Ismael y de Cetura', 'Los hijos de Abraham: Isaac e Ismael.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 29, NULL, 'Y estas son sus descendencias: el primogénito de Ismael, Nebaiot; después Cedar, Adbeel, Mibsam,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 30, NULL, 'Misma, Duma, Massa, Hadad, Tema,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 31, NULL, 'Jetur, Nafis y Cedema; estos son los hijos de Ismael.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 32, NULL, 'Y Cetura, concubina de Abraham, dio a luz a Zimram, Jocsán, Medán, Madián, Isbac y Súa. Los hijos de Jocsán: Seba y Dedán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 33, NULL, 'Los hijos de Madián: Efa, Efer, Hanoc, Abida y Elda; todos estos fueron hijos de Cetura.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 34, 'Descendientes de Esaú', 'Abraham engendró a Isaac, y los hijos de Isaac fueron Esaú e Israel.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 35, NULL, 'Los hijos de Esaú: Elifaz, Reuel, Jeús, Jaalam y Coré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 36, NULL, 'Los hijos de Elifaz: Temán, Omar, Zefo, Gatam, Cenaz, Timna y Amalec.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 37, NULL, 'Los hijos de Reuel: Nahat, Zera, Sama y Miza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 38, NULL, 'Los hijos de Seir: Lotán, Sobal, Zibeón, Aná, Disón, Ezer y Disán.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 39, NULL, 'Los hijos de Lotán: Hori y Homam; y Timna fue hermana de Lotán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 40, NULL, 'Los hijos de Sobal: Alván, Manahat, Ebal, Sefo y Onam. Los hijos de Zibeón: Aja y Aná.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 41, NULL, 'Disón fue hijo de Aná; y los hijos de Disón: Amram, Esbán, Itrán y Querán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 42, NULL, 'Los hijos de Ezer: Bilhán, Zaaván y Jaacán. Los hijos de Disán: Uz y Arán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 43, NULL, 'Y estos son los reyes que reinaron en la tierra de Edom, antes que reinase rey sobre los hijos de Israel: Bela hijo de Beor; y el nombre de su ciudad fue Dinaba.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 44, NULL, 'Muerto Bela, reinó en su lugar Jobab hijo de Zera, de Bosra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 45, NULL, 'Y muerto Jobab, reinó en su lugar Husam, de la tierra de los temanitas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 46, NULL, 'Muerto Husam, reinó en su lugar Hadad hijo de Bedad, el que derrotó a Madián en el campo de Moab; y el nombre de su ciudad fue Avit.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 47, NULL, 'Muerto Hadad, reinó en su lugar Samla de Masreca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 48, NULL, 'Muerto también Samla, reinó en su lugar Saúl de Rehobot, que está junto al Éufrates.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 49, NULL, 'Y muerto Saúl, reinó en su lugar Baal-hanán hijo de Acbor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 50, NULL, 'Muerto Baal-hanán, reinó en su lugar Hadad, el nombre de cuya ciudad fue Pai; y el nombre de su mujer, Mehetabel hija de Matred, hija de Mezaab.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 51, NULL, 'Muerto Hadad, sucedieron en Edom los jefes Timna, Alva, Jetet,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 52, NULL, 'Aholibama, Ela, Pinón,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 53, NULL, 'Cenaz, Temán, Mibzar,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 1, 54, NULL, 'Magdiel e Iram. Estos fueron los jefes de Edom.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 1, 'Los hijos de Israel', 'Estos son los hijos de Israel: Rubén, Simeón, Leví, Judá, Isacar, Zabulón,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 2, NULL, 'Dan, José, Benjamín, Neftalí, Gad y Aser.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 3, 'Descendientes de Judá', 'Los hijos de Judá: Er, Onán y Sela. Estos tres le nacieron de la hija de Súa, cananea. Y Er, primogénito de Judá, fue malo delante de Jehová, quien lo mató.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 4, NULL, 'Y Tamar su nuera dio a luz a Fares y a Zera. Todos los hijos de Judá fueron cinco.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 5, NULL, 'Los hijos de Fares: Hezrón y Hamul.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 6, NULL, 'Y los hijos de Zera: Zimri, Etán, Hemán, Calcol y Dara; por todos cinco.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 7, NULL, 'Hijo de Carmi fue Acán, el que perturbó a Israel, porque prevaricó en el anatema.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 8, NULL, 'Azarías fue hijo de Etán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 9, NULL, 'Los hijos que nacieron a Hezrón: Jerameel, Ram y Quelubai.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 10, NULL, 'Ram engendró a Aminadab, y Aminadab engendró a Naasón, príncipe de los hijos de Judá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 11, NULL, 'Naasón engendró a Salmón, y Salmón engendró a Booz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 12, NULL, 'Booz engendró a Obed, y Obed engendró a Isaí,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 13, NULL, 'e Isaí engendró a Eliab su primogénito, el segundo Abinadab, Simea el tercero,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 14, NULL, 'el cuarto Natanael, el quinto Radai,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 15, NULL, 'el sexto Ozem, el séptimo David,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 16, NULL, 'de los cuales Sarvia y Abigail fueron hermanas. Los hijos de Sarvia fueron tres: Abisai, Joab y Asael.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 17, NULL, 'Abigail dio a luz a Amasa, cuyo padre fue Jeter ismaelita,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 18, NULL, 'Caleb hijo de Hezrón engendró a Jeriot de su mujer Azuba. Y los hijos de ella fueron Jeser, Sobab y Ardón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 19, NULL, 'Muerta Azuba, tomó Caleb por mujer a Efrata, la cual dio a luz a Hur.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 20, NULL, 'Y Hur engendró a Uri, y Uri engendró a Bezaleel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 21, NULL, 'Después entró Hezrón a la hija de Maquir padre de Galaad, la cual tomó siendo él de sesenta años, y ella dio a luz a Segub.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 22, NULL, 'Y Segub engendró a Jair, el cual tuvo veintitrés ciudades en la tierra de Galaad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 23, NULL, 'Pero Gesur y Aram tomaron de ellos las ciudades de Jair, con Kenat y sus aldeas, sesenta lugares. Todos estos fueron de los hijos de Maquir padre de Galaad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 24, NULL, 'Muerto Hezrón en Caleb de Efrata, Abías mujer de Hezrón dio a luz a Asur padre de Tecoa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 25, NULL, 'Los hijos de Jerameel primogénito de Hezrón fueron Ram su primogénito, Buna, Orén, Ozem y Ahías.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 26, NULL, 'Y tuvo Jerameel otra mujer llamada Atara, que fue madre de Onam.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 27, NULL, 'Los hijos de Ram primogénito de Jerameel fueron Maaz, Jamín y Equer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 28, NULL, 'Y los hijos de Onam fueron Samai y Jada. Los hijos de Samai: Nadab y Abisur.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 29, NULL, 'Y el nombre de la mujer de Abisur fue Abihail, la cual dio a luz a Ahbán y a Molid.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 30, NULL, 'Los hijos de Nadab: Seled y Apaim. Y Seled murió sin hijos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 31, NULL, 'Isi fue hijo de Apaim, y Sesán hijo de Isi, e hijo de Sesán, Ahlai.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 32, NULL, 'Los hijos de Jada hermano de Samai: Jeter y Jonatán. Y murió Jeter sin hijos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 33, NULL, 'Los hijos de Jonatán: Pelet y Zaza. Estos fueron los hijos de Jerameel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 34, NULL, 'Y Sesán no tuvo hijos, sino hijas; pero tenía Sesán un siervo egipcio llamado Jarha.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 35, NULL, 'A este Sesán dio su hija por mujer, y ella dio a luz a Atai.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 36, NULL, 'Atai engendró a Natán, y Natán engendró a Zabad;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 37, NULL, 'Zabad engendró a Eflal, Eflal engendró a Obed;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 38, NULL, 'Obed engendró a Jehú, Jehú engendró a Azarías;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 39, NULL, 'Azarías engendró a Heles, Heles engendró a Elasa;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 40, NULL, 'Elasa engendró a Sismai, Sismai engendró a Salum;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 41, NULL, 'Salum engendró a Jecamías, y Jecamías engendró a Elisama.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 42, NULL, 'Los hijos de Caleb hermano de Jerameel fueron: Mesa su primogénito, que fue el padre de Zif; y los hijos de Maresa padre de Hebrón.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 43, NULL, 'Y los hijos de Hebrón: Coré, Tapúa, Requem y Sema.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 44, NULL, 'Sema engendró a Raham padre de Jorcoam, y Requem engendró a Samai.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 45, NULL, 'Maón fue hijo de Samai, y Maón padre de Bet-sur.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 46, NULL, 'Y Efa concubina de Caleb dio a luz a Harán, a Mosa y a Gazez. Y Harán engendró a Gazez.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 47, NULL, 'Los hijos de Jahdai: Regem, Jotam, Gesam, Pelet, Efa y Saaf.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 48, NULL, 'Maaca concubina de Caleb dio a luz a Seber y a Tirhana.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 49, NULL, 'También dio a luz a Saaf padre de Madmana, y a Seva padre de Macbena y padre de Gibea. Y Acsa fue hija de Caleb.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 50, NULL, 'Estos fueron los hijos de Caleb. Los hijos de Hur primogénito de Efrata: Sobal padre de Quiriat-jearim,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 51, NULL, 'Salma padre de Belén, y Haref padre de Bet-gader.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 52, NULL, 'Y los hijos de Sobal padre de Quiriat-jearim fueron Haroe, la mitad de los manahetitas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 53, NULL, 'Y las familias de Quiriat-jearim fueron los itritas, los futitas, los sumatitas y los misraítas, de los cuales salieron los zoratitas y los estaolitas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 54, NULL, 'Los hijos de Salma: Belén, y los netofatitas, Atrot-bet-joab, y la mitad de los manahetitas, los zoraítas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 2, 55, NULL, 'Y las familias de los escribas que moraban en Jabes fueron los tirateos, los simeateos y los sucateos, los cuales son los ceneos que vinieron de Hamat padre de la casa de Recab.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 3, 1, 'Los hijos de David', 'Estos son los hijos de David que le nacieron en Hebrón: Amnón el primogénito, de Ahinoam jezreelita; el segundo, Daniel, de Abigail la de Carmel;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 3, 2, NULL, 'el tercero, Absalón hijo de Maaca, hija de Talmai rey de Gesur; el cuarto, Adonías hijo de Haguit;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 3, 3, NULL, 'el quinto, Sefatías, de Abital; el sexto, Itream, de Egla su mujer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 3, 4, NULL, 'Estos seis le nacieron en Hebrón, donde reinó siete años y seis meses; y en Jerusalén reinó treinta y tres años.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 3, 5, NULL, 'Estos cuatro le nacieron en Jerusalén: Simea, Sobab, Natán, y Salomón hijo de Bet-súa hija de Amiel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 3, 6, NULL, 'Y otros nueve: Ibhar, Elisama, Elifelet,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 3, 7, NULL, 'Noga, Nefeg, Jafía,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 3, 8, NULL, 'Elisama, Eliada y Elifelet.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 3, 9, NULL, 'Todos estos fueron los hijos de David, sin los hijos de las concubinas. Y Tamar fue hermana de ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 3, 10, 'Descendientes de Salomón', 'Hijo de Salomón fue Roboam, cuyo hijo fue Abías, del cual fue hijo Asa, cuyo hijo fue Josafat,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 3, 11, NULL, 'de quien fue hijo Joram, cuyo hijo fue Ocozías, hijo del cual fue Joás,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 3, 12, NULL, 'del cual fue hijo Amasías, cuyo hijo fue Azarías, e hijo de este, Jotam.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 3, 13, NULL, 'Hijo de este fue Acaz, del que fue hijo Ezequías, cuyo hijo fue Manasés,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 3, 14, NULL, 'del cual fue hijo Amón, cuyo hijo fue Josías.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 3, 15, NULL, 'Y los hijos de Josías: Johanán su primogénito, el segundo Joacim, el tercero Sedequías, el cuarto Salum.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 3, 16, NULL, 'Los hijos de Joacim: Jeconías su hijo, hijo del cual fue Sedequías.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 3, 17, NULL, 'Y los hijos de Jeconías: Asir, Salatiel,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 3, 18, NULL, 'Malquiram, Pedaías, Senazar, Jecamías, Hosama y Nedabías.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 3, 19, NULL, 'Los hijos de Pedaías: Zorobabel y Simei. Y los hijos de Zorobabel: Mesulam, Hananías, y Selomit su hermana;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 3, 20, NULL, 'y Hasuba, Ohel, Berequías, Hasadías y Jusab-hesed; cinco por todos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 3, 21, NULL, 'Los hijos de Hananías: Pelatías y Jesaías; su hijo, Refaías; su hijo, Arnán; su hijo, Abdías; su hijo, Secanías.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 3, 22, NULL, 'Hijo de Secanías fue Semaías; y los hijos de Semaías: Hatús, Igal, Barías, Nearías y Safat, seis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 3, 23, NULL, 'Los hijos de Nearías fueron estos tres: Elioenai, Ezequías y Azricam.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 3, 24, NULL, 'Los hijos de Elioenai fueron estos siete: Hodavías, Eliasib, Pelaías, Acub, Johanán, Dalaías y Anani.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 1, 'Descendientes de Judá', 'Los hijos de Judá: Fares, Hezrón, Carmi, Hur y Sobal.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 2, NULL, 'Reaía hijo de Sobal engendró a Jahat, y Jahat engendró a Ahumai y a Lahad. Estas son las familias de los zoratitas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 3, NULL, 'Y estas son las del padre de Etam: Jezreel, Isma e Ibdas. Y el nombre de su hermana fue Haze-lelponi.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 4, NULL, 'Penuel fue padre de Gedor, y Ezer padre de Husa. Estos fueron los hijos de Hur primogénito de Efrata, padre de Belén.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 5, NULL, 'Asur padre de Tecoa tuvo dos mujeres, Hela y Naara.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 6, NULL, 'Y Naara dio a luz a Ahuzam, Hefer, Temeni y Ahastari. Estos fueron los hijos de Naara.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 7, NULL, 'Los hijos de Hela: Zeret, Jezoar y Etnán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 8, NULL, 'Cos engendró a Anub, a Zobeba, y la familia de Aharhel hijo de Harum.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 9, NULL, 'Y Jabes fue más ilustre que sus hermanos, al cual su madre llamó Jabes, diciendo: Por cuanto lo di a luz en dolor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 10, NULL, 'E invocó Jabes al Dios de Israel, diciendo: ¡Oh, si me dieras bendición, y ensancharas mi territorio, y si tu mano estuviera conmigo, y me libraras de mal, para que no me dañe! Y le otorgó Dios lo que pidió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 11, NULL, 'Quelub hermano de Súa engendró a Mehir, el cual fue padre de Estón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 12, NULL, 'Y Estón engendró a Bet-rafa, a Paseah, y a Tehina padre de la ciudad de Nahas; estos son los varones de Reca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 13, NULL, 'Los hijos de Cenaz: Otoniel y Seraías. Los hijos de Otoniel: Hatat,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 14, NULL, 'y Meonotai, el cual engendró a Ofra. Y Seraías engendró a Joab, padre de los habitantes del valle de Carisim, porque fueron artífices.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 15, NULL, 'Los hijos de Caleb hijo de Jefone: Iru, Ela y Naam; e hijo de Ela fue Cenaz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 16, NULL, 'Los hijos de Jehalelel: Zif, Zifa, Tirías y Asareel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 17, NULL, 'Y los hijos de Esdras: Jeter, Mered, Efer y Jalón; también engendró a María, a Samai y a Isba padre de Estemoa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 18, NULL, 'Y su mujer Jehudaía dio a luz a Jered padre de Gedor, a Heber padre de Soco y a Jecutiel padre de Zanoa. Estos fueron los hijos de Bitia hija de Faraón, con la cual casó Mered.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 19, NULL, 'Y los hijos de la mujer de Hodías, hermana de Naham, fueron el padre de Keila garmita, y Estemoa maacateo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 20, NULL, 'Los hijos de Simón: Amnón, Rina, Ben-hanán y Tilón. Y los hijos de Isi: Zohet y Benzohet.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 21, NULL, 'Los hijos de Sela hijo de Judá: Er padre de Leca, y Laada padre de Maresa, y las familias de los que trabajan lino en Bet-asbea;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 22, NULL, 'y Joacim, y los varones de Cozeba, Joás, y Saraf, los cuales dominaron en Moab y volvieron a Lehem, según registros antiguos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 23, NULL, 'Estos eran alfareros, y moraban en medio de plantíos y cercados; moraban allá con el rey, ocupados en su servicio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 24, 'Descendientes de Simeón', 'Los hijos de Simeón: Nemuel, Jamín, Jarib, Zera, Saúl,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 25, NULL, 'y Salum su hijo, Mibsam su hijo y Misma su hijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 26, NULL, 'Los hijos de Misma: Hamuel su hijo, Zacur su hijo, y Simei su hijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 27, NULL, 'Los hijos de Simei fueron dieciséis, y seis hijas; pero sus hermanos no tuvieron muchos hijos, ni multiplicaron toda su familia como los hijos de Judá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 28, NULL, 'Y habitaron en Beerseba, Molada, Hazar-sual,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 29, NULL, 'Bilha, Ezem, Tolad,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 30, NULL, 'Betuel, Horma, Siclag,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 31, NULL, 'Bet-marcabot, Hazar-susim, Bet-birai y Saaraim. Estas fueron sus ciudades hasta el reinado de David.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 32, NULL, 'Y sus aldeas fueron Etam, Aín, Rimón, Toquén y Asán; cinco pueblos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 33, NULL, 'y todas sus aldeas que estaban en contorno de estas ciudades hasta Baal. Esta fue su habitación, y esta su descendencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 34, NULL, 'Y Mesobab, Jamlec, Josías hijo de Amasías,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 35, NULL, 'Joel, Jehú hijo de Josibías, hijo de Seraías, hijo de Asiel,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 36, NULL, 'Elioenai, Jaacoba, Jesohaía, Asaías, Adiel, Jesimiel, Benaía,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 37, NULL, 'y Ziza hijo de Sifi, hijo de Alón, hijo de Jedaías, hijo de Simri, hijo de Semaías.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 38, NULL, 'Estos, por sus nombres, son los principales entre sus familias; y las casas de sus padres fueron multiplicadas en gran manera.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 39, NULL, 'Y llegaron hasta la entrada de Gedor hasta el oriente del valle, buscando pastos para sus ganados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 40, NULL, 'Y hallaron gruesos y buenos pastos, y tierra ancha y espaciosa, quieta y reposada, porque los de Cam la habitaban antes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 41, NULL, 'Y estos que han sido escritos por sus nombres, vinieron en días de Ezequías rey de Judá, y desbarataron sus tiendas y cabañas que allí hallaron, y los destruyeron hasta hoy, y habitaron allí en lugar de ellos; por cuanto había allí pastos para sus ganados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 42, NULL, 'Asimismo quinientos hombres de ellos, de los hijos de Simeón, fueron al monte de Seir, llevando por capitanes a Pelatías, Nearías, Refaías y Uziel, hijos de Isi,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 4, 43, NULL, 'y destruyeron a los que habían quedado de Amalec, y habitaron allí hasta hoy.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 5, 1, 'Descendientes de Rubén', 'Los hijos de Rubén primogénito de Israel (porque él era el primogénito, mas como violó el lecho de su padre, sus derechos de primogenitura fueron dados a los hijos de José, hijo de Israel, y no fue contado por primogénito;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 5, 2, NULL, 'bien que Judá llegó a ser el mayor sobre sus hermanos, y el príncipe de ellos; mas el derecho de primogenitura fue de José);', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 5, 3, NULL, 'fueron, pues, los hijos de Rubén primogénito de Israel: Hanoc, Falú, Hezrón y Carmi.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 5, 4, NULL, 'Los hijos de Joel: Semaías su hijo, Gog su hijo, Simei su hijo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 5, 5, NULL, 'Micaía su hijo, Reaía su hijo, Baal su hijo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 5, 6, NULL, 'Beera su hijo, el cual fue transportado por Tiglat-pileser rey de los asirios. Este era principal de los rubenitas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 5, 7, NULL, 'Y sus hermanos por sus familias, cuando eran contados en sus descendencias, tenían por príncipes a Jeiel y a Zacarías.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 5, 8, NULL, 'Y Bela hijo de Azaz, hijo de Sema, hijo de Joel, habitó en Aroer hasta Nebo y Baal-meón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 5, 9, NULL, 'Habitó también desde el oriente hasta la entrada del desierto, desde el río Éufrates; porque tenía mucho ganado en la tierra de Galaad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 5, 10, NULL, 'Y en los días de Saúl hicieron guerra contra los agarenos, los cuales cayeron en su mano; y ellos habitaron en sus tiendas en toda la región oriental de Galaad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 5, 11, 'Descendientes de Gad', 'Y los hijos de Gad habitaron enfrente de ellos en la tierra de Basán hasta Salca.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 5, 12, NULL, 'Joel fue el principal en Basán; el segundo Safán, luego Jaanai, después Safat.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 5, 13, NULL, 'Y sus hermanos, según las familias de sus padres, fueron Micael, Mesulam, Seba, Jorai, Jacán, Zía y Heber; por todos siete.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 5, 14, NULL, 'Estos fueron los hijos de Abihail hijo de Huri, hijo de Jaroa, hijo de Galaad, hijo de Micael, hijo de Jesisai, hijo de Jahdo, hijo de Buz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 5, 15, NULL, 'También Ahí hijo de Abdiel, hijo de Guni, fue principal en la casa de sus padres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 5, 16, NULL, 'Y habitaron en Galaad, en Basán y en sus aldeas, y en todos los ejidos de Sarón hasta salir de ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 5, 17, NULL, 'Todos estos fueron contados por sus generaciones en días de Jotam rey de Judá y en días de Jeroboam rey de Israel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 5, 18, 'Historia de las dos tribus y media', 'Los hijos de Rubén y de Gad, y la media tribu de Manasés, hombres valientes, hombres que traían escudo y espada, que entesaban arco, y diestros en la guerra, eran cuarenta y cuatro mil setecientos sesenta que salían a batalla.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 5, 19, NULL, 'Estos tuvieron guerra contra los agarenos, y Jetur, Nafis y Nodab.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 5, 20, NULL, 'Y fueron ayudados contra ellos, y los agarenos y todos los que con ellos estaban se rindieron en sus manos; porque clamaron a Dios en la guerra, y les fue favorable, porque esperaron en él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 5, 21, NULL, 'Y tomaron sus ganados, cincuenta mil camellos, doscientas cincuenta mil ovejas y dos mil asnos; y cien mil personas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 5, 22, NULL, 'Y cayeron muchos muertos, porque la guerra era de Dios; y habitaron en sus lugares hasta el cautiverio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 5, 23, NULL, 'Los hijos de la media tribu de Manasés, multiplicados en gran manera, habitaron en la tierra desde Basán hasta Baal-hermón y Senir y el monte de Hermón.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 5, 24, NULL, 'Y estos fueron los jefes de las casas de sus padres: Efer, Isi, Eliel, Azriel, Jeremías, Hodavías y Jahdiel, hombres valientes y esforzados, varones de nombre y jefes de las casas de sus padres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 5, 25, NULL, 'Pero se rebelaron contra el Dios de sus padres, y se prostituyeron siguiendo a los dioses de los pueblos de la tierra, a los cuales Jehová había quitado de delante de ellos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 5, 26, NULL, 'por lo cual el Dios de Israel excitó el espíritu de Pul rey de los asirios, y el espíritu de Tiglat-pileser rey de los asirios, el cual transportó a los rubenitas y gaditas y a la media tribu de Manasés, y los llevó a Halah, a Habor, a Hara y al río Gozán, hasta hoy.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 1, 'Descendientes de Leví', 'Los hijos de Leví: Gersón, Coat y Merari.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 2, NULL, 'Los hijos de Coat: Amram, Izhar, Hebrón y Uziel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 3, NULL, 'Los hijos de Amram: Aarón, Moisés y María. Los hijos de Aarón: Nadab, Abiú, Eleazar e Itamar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 4, NULL, 'Eleazar engendró a Finees, Finees engendró a Abisúa,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 5, NULL, 'Abisúa engendró a Buqui, Buqui engendró a Uzi,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 6, NULL, 'Uzi engendró a Zeraías, Zeraías engendró a Meraiot,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 7, NULL, 'Meraiot engendró a Amarías, Amarías engendró a Ahitob,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 8, NULL, 'Ahitob engendró a Sadoc, Sadoc engendró a Ahimaas,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 9, NULL, 'Ahimaas engendró a Azarías, Azarías engendró a Johanán,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 10, NULL, 'y Johanán engendró a Azarías, el que tuvo el sacerdocio en la casa que Salomón edificó en Jerusalén.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 11, NULL, 'Azarías engendró a Amarías, Amarías engendró a Ahitob,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 12, NULL, 'Ahitob engendró a Sadoc, Sadoc engendró a Salum,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 13, NULL, 'Salum engendró a Hilcías, Hilcías engendró a Azarías,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 14, NULL, 'Azarías engendró a Seraías, y Seraías engendró a Josadac,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 15, NULL, 'y Josadac fue llevado cautivo cuando Jehová transportó a Judá y a Jerusalén por mano de Nabucodonosor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 16, NULL, 'Los hijos de Leví: Gersón, Coat y Merari.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 17, NULL, 'Y estos son los nombres de los hijos de Gersón: Libni y Simei.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 18, NULL, 'Los hijos de Coat: Amram, Izhar, Hebrón y Uziel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 19, NULL, 'Los hijos de Merari: Mahli y Musi. Estas son las familias de Leví, según sus descendencias.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 20, NULL, 'Gersón: Libni su hijo, Jahat su hijo, Zima su hijo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 21, NULL, 'Joa su hijo, Iddo su hijo, Zera su hijo, Jeatrai su hijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 22, NULL, 'Los hijos de Coat: Aminadab su hijo, Coré su hijo, Asir su hijo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 23, NULL, 'Elcana su hijo, Ebiasaf su hijo, Asir su hijo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 24, NULL, 'Tahat su hijo, Uriel su hijo, Uzías su hijo, y Saúl su hijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 25, NULL, 'Los hijos de Elcana: Amasai y Ahimot;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 26, NULL, 'Elcana su hijo, Zofai su hijo, Nahat su hijo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 27, NULL, 'Eliab su hijo, Jeroham su hijo, Elcana su hijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 28, NULL, 'Los hijos de Samuel: el primogénito Vasni, y Abías.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 29, NULL, 'Los hijos de Merari: Mahli, Libni su hijo, Simei su hijo, Uza su hijo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 30, NULL, 'Simea su hijo, Haguía su hijo, Asaías su hijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 31, 'Cantores del templo nombrados por David', 'Estos son los que David puso sobre el servicio de canto en la casa de Jehová, después que el arca tuvo reposo,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 32, NULL, 'los cuales servían delante de la tienda del tabernáculo de reunión en el canto, hasta que Salomón edificó la casa de Jehová en Jerusalén; después estuvieron en su ministerio según su costumbre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 33, NULL, 'Estos, pues, con sus hijos, ayudaban: de los hijos de Coat, el cantor Hemán hijo de Joel, hijo de Samuel,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 34, NULL, 'hijo de Elcana, hijo de Jeroham, hijo de Eliel, hijo de Toa,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 35, NULL, 'hijo de Zuf, hijo de Elcana, hijo de Mahat, hijo de Amasai,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 36, NULL, 'hijo de Elcana, hijo de Joel, hijo de Azarías, hijo de Sofonías,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 37, NULL, 'hijo de Tahat, hijo de Asir, hijo de Ebiasaf, hijo de Coré,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 38, NULL, 'hijo de Izhar, hijo de Coat, hijo de Leví, hijo de Israel;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 39, NULL, 'y su hermano Asaf, el cual estaba a su mano derecha; Asaf, hijo de Berequías, hijo de Simea,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 40, NULL, 'hijo de Micael, hijo de Baasías, hijo de Malquías,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 41, NULL, 'hijo de Etni, hijo de Zera, hijo de Adaía,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 42, NULL, 'hijo de Etán, hijo de Zima, hijo de Simei,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 43, NULL, 'hijo de Jahat, hijo de Gersón, hijo de Leví.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 44, NULL, 'Pero a la mano izquierda estaban sus hermanos los hijos de Merari, esto es, Etán hijo de Quisi, hijo de Abdi, hijo de Maluc,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 45, NULL, 'hijo de Hasabías, hijo de Amasías, hijo de Hilcías,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 46, NULL, 'hijo de Amsi, hijo de Bani, hijo de Semer,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 47, NULL, 'hijo de Mahli, hijo de Musi, hijo de Merari, hijo de Leví.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 48, NULL, 'Y sus hermanos los levitas fueron puestos sobre todo el ministerio del tabernáculo de la casa de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 49, 'Descendientes de Aarón', 'Mas Aarón y sus hijos ofrecían sacrificios sobre el altar del holocausto, y sobre el altar del perfume quemaban incienso, y ministraban en toda la obra del lugar santísimo, y hacían las expiaciones por Israel conforme a todo lo que Moisés siervo de Dios había mandado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 50, NULL, 'Los hijos de Aarón son estos: Eleazar su hijo, Finees su hijo, Abisúa su hijo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 51, NULL, 'Buqui su hijo, Uzi su hijo, Zeraías su hijo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 52, NULL, 'Meraiot su hijo, Amarías su hijo, Ahitob su hijo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 53, NULL, 'Sadoc su hijo, Ahimaas su hijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 54, 'Las ciudades de los levitas', 'Estas son sus habitaciones, conforme a sus domicilios y sus términos, las de los hijos de Aarón por las familias de los coatitas, porque a ellos les tocó en suerte.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 55, NULL, 'Les dieron, pues, Hebrón en tierra de Judá, y sus ejidos alrededor de ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 56, NULL, 'Pero el territorio de la ciudad y sus aldeas se dieron a Caleb, hijo de Jefone.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 57, NULL, 'De Judá dieron a los hijos de Aarón la ciudad de refugio, esto es, Hebrón; además, Libna con sus ejidos, Jatir, Estemoa con sus ejidos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 58, NULL, 'Hilén con sus ejidos, Debir con sus ejidos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 59, NULL, 'Asán con sus ejidos y Bet-semes con sus ejidos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 60, NULL, 'Y de la tribu de Benjamín, Geba con sus ejidos, Alemet con sus ejidos y Anatot con sus ejidos. Todas sus ciudades fueron trece ciudades, repartidas por sus linajes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 61, NULL, 'A los hijos de Coat que quedaron de su parentela, dieron por suerte diez ciudades de la media tribu de Manasés.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 62, NULL, 'A los hijos de Gersón, por sus linajes, dieron de la tribu de Isacar, de la tribu de Aser, de la tribu de Neftalí y de la tribu de Manasés en Basán, trece ciudades.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 63, NULL, 'Y a los hijos de Merari, por sus linajes, de la tribu de Rubén, de la tribu de Gad y de la tribu de Zabulón, dieron por suerte doce ciudades.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 64, NULL, 'Y los hijos de Israel dieron a los levitas ciudades con sus ejidos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 65, NULL, 'Dieron por suerte de la tribu de los hijos de Judá, de la tribu de los hijos de Simeón y de la tribu de los hijos de Benjamín, las ciudades que nombraron por sus nombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 66, NULL, 'A las familias de los hijos de Coat dieron ciudades con sus ejidos de la tribu de Efraín.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 67, NULL, 'Les dieron la ciudad de refugio, Siquem con sus ejidos en el monte de Efraín; además, Gezer con sus ejidos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 68, NULL, 'Jocmeam con sus ejidos, Bet-horón con sus ejidos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 69, NULL, 'Ajalón con sus ejidos y Gat-rimón con sus ejidos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 70, NULL, 'De la media tribu de Manasés, Aner con sus ejidos y Bileam con sus ejidos, para los de las familias de los hijos de Coat que habían quedado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 71, NULL, 'A los hijos de Gersón dieron de la media tribu de Manasés, Golán en Basán con sus ejidos y Astarot con sus ejidos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 72, NULL, 'De la tribu de Isacar, Cedes con sus ejidos, Daberat con sus ejidos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 73, NULL, 'Ramot con sus ejidos y Anem con sus ejidos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 74, NULL, 'De la tribu de Aser, Masal con sus ejidos, Abdón con sus ejidos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 75, NULL, 'Hucoc con sus ejidos y Rehob con sus ejidos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 76, NULL, 'De la tribu de Neftalí, Cedes en Galilea con sus ejidos, Hamón con sus ejidos y Quiriataim con sus ejidos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 77, NULL, 'A los hijos de Merari que habían quedado, dieron de la tribu de Zabulón, Rimón con sus ejidos y Tabor con sus ejidos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 78, NULL, 'Del otro lado del Jordán frente a Jericó, al oriente del Jordán, dieron de la tribu de Rubén, Beser en el desierto con sus ejidos, Jaza con sus ejidos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 79, NULL, 'Cademot con sus ejidos y Mefaat con sus ejidos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 80, NULL, 'Y de la tribu de Gad, Ramot de Galaad con sus ejidos, Mahanaim con sus ejidos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 6, 81, NULL, 'Hesbón con sus ejidos y Jazer con sus ejidos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 1, 'Descendientes de Isacar', 'Los hijos de Isacar fueron cuatro: Tola, Fúa, Jasub y Simrón.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 2, NULL, 'Los hijos de Tola: Uzi, Refaías, Jeriel, Jahmai, Jibsam y Semuel, jefes de las familias de sus padres. De Tola fueron contados por sus linajes en el tiempo de David, veintidós mil seiscientos hombres muy valerosos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 3, NULL, 'Hijo de Uzi fue Israhías; y los hijos de Israhías: Micael, Obadías, Joel e Isías; por todos, cinco príncipes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 4, NULL, 'Y había con ellos en sus linajes, por las familias de sus padres, treinta y seis mil hombres de guerra; porque tuvieron muchas mujeres e hijos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 5, NULL, 'Y sus hermanos por todas las familias de Isacar, contados todos por sus genealogías, eran ochenta y siete mil hombres valientes en extremo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 6, 'Descendientes de Benjamín', 'Los hijos de Benjamín fueron tres: Bela, Bequer y Jediael.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 7, NULL, 'Los hijos de Bela: Ezbón, Uzi, Uziel, Jerimot e Iri; cinco jefes de casas paternas, hombres de gran valor, y de cuya descendencia fueron contados veintidós mil treinta y cuatro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 8, NULL, 'Los hijos de Bequer: Zemira, Joás, Eliezer, Elioenai, Omri, Jerimot, Abías, Anatot y Alamet; todos estos fueron hijos de Bequer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 9, NULL, 'Y contados por sus descendencias, por sus linajes, los que eran jefes de familias resultaron veinte mil doscientos hombres de grande esfuerzo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 10, NULL, 'Hijo de Jediael fue Bilhán; y los hijos de Bilhán: Jeús, Benjamín, Aod, Quenaana, Zetán, Tarsis y Ahisahar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 11, NULL, 'Todos estos fueron hijos de Jediael, jefes de familias, hombres muy valerosos, diecisiete mil doscientos que salían a combatir en la guerra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 12, NULL, 'Supim y Hupim fueron hijos de Hir; y Husim, hijo de Aher.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 13, 'Descendientes de Neftalí', 'Los hijos de Neftalí: Jahzeel, Guni, Jezer y Salum, hijos de Bilha.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 14, 'Descendientes de Manasés', 'Los hijos de Manasés: Asriel, al cual dio a luz su concubina la siria, la cual también dio a luz a Maquir padre de Galaad.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 15, NULL, 'Y Maquir tomó mujer de Hupim y Supim, cuya hermana tuvo por nombre Maaca; y el nombre del segundo fue Zelofehad. Y Zelofehad tuvo hijas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 16, NULL, 'Y Maaca mujer de Maquir dio a luz un hijo, y lo llamó Peres; y el nombre de su hermano fue Seres, cuyos hijos fueron Ulam y Requem.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 17, NULL, 'Hijo de Ulam fue Bedán. Estos fueron los hijos de Galaad, hijo de Maquir, hijo de Manasés.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 18, NULL, 'Y su hermana Hamolequet dio a luz a Isod, Abiezer y Mahala.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 19, NULL, 'Y los hijos de Semida fueron Ahián, Siquem, Likhi y Aniam.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 20, 'Descendientes de Efraín', 'Los hijos de Efraín: Sutela, Bered su hijo, Tahat su hijo, Elada su hijo, Tahat su hijo,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 21, NULL, 'Zabad su hijo, Sutela su hijo, Ezer y Elad. Mas los hijos de Gat, naturales de aquella tierra, los mataron, porque vinieron a tomarles sus ganados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 22, NULL, 'Y Efraín su padre hizo duelo por muchos días, y vinieron sus hermanos a consolarlo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 23, NULL, 'Después él se llegó a su mujer, y ella concibió y dio a luz un hijo, al cual puso por nombre Bería, por cuanto había estado en aflicción en su casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 24, NULL, 'Y su hija fue Seera, la cual edificó a Bet-horón la baja y la alta, y a Uzen-seera.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 25, NULL, 'Hijo de este Bería fue Refa, y Resef, y Telah su hijo, y Tahán su hijo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 26, NULL, 'Laadán su hijo, Amiud su hijo, Elisama su hijo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 27, NULL, 'Nun su hijo, Josué su hijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 28, NULL, 'Y la heredad y habitación de ellos fue Bet-el con sus aldeas; y hacia el oriente Naarán, y a la parte del occidente Gezer y sus aldeas; asimismo Siquem con sus aldeas, hasta Gaza y sus aldeas;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 29, NULL, 'y junto al territorio de los hijos de Manasés, Bet-seán con sus aldeas, Taanac con sus aldeas, Meguido con sus aldeas, y Dor con sus aldeas. En estos lugares habitaron los hijos de José hijo de Israel.', 0, 'spa', 'RVR1960', NULL);\n"
;

  public static final String SQL_PARTE_2 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 30, 'Descendientes de Aser', 'Los hijos de Aser: Imna, Isúa, Isúi, Bería, y su hermana Sera.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 31, NULL, 'Los hijos de Bería: Heber, y Malquiel, el cual fue padre de Birzavit.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 32, NULL, 'Y Heber engendró a Jaflet, Somer, Hotam, y Súa hermana de ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 33, NULL, 'Los hijos de Jaflet: Pasac, Bimhal y Asvat. Estos fueron los hijos de Jaflet.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 34, NULL, 'Y los hijos de Semer: Ahí, Rohga, Jehúba y Aram.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 35, NULL, 'Los hijos de Helem su hermano: Zofa, Imna, Seles y Amal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 36, NULL, 'Los hijos de Zofa: Súa, Harnefer, Súal, Beri, Imra,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 37, NULL, 'Beser, Hod, Sama, Silsa, Itrán y Beera.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 38, NULL, 'Los hijos de Jeter: Jefone, Pispa y Ara.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 39, NULL, 'Y los hijos de Ula: Ara, Haniel y Rezia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 7, 40, NULL, 'Todos estos fueron hijos de Aser, cabezas de familias paternas, escogidos, esforzados, jefes de príncipes; y contados que fueron por sus linajes entre los que podían tomar las armas, el número de ellos fue veintiséis mil hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 1, 'Descendientes de Benjamín', 'Benjamín engendró a Bela su primogénito, Asbel el segundo, Ahara el tercero,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 2, NULL, 'Noha el cuarto, y Rafa el quinto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 3, NULL, 'Y los hijos de Bela fueron Adar, Gera, Abiud,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 4, NULL, 'Abisúa, Naamán, Ahoa,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 5, NULL, 'Gera, Sefufán e Hiram.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 6, NULL, 'Y estos son los hijos de Aod, estos los jefes de casas paternas que habitaron en Geba y fueron transportados a Manahat:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 7, NULL, 'Naamán, Ahías y Gera; este los transportó, y engendró a Uza y a Ahiud.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 8, NULL, 'Y Saharaim engendró hijos en la provincia de Moab, después que dejó a Husim y a Baara que eran sus mujeres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 9, NULL, 'Engendró, pues, de Hodes su mujer a Jobab, Sibia, Mesa, Malcam,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 10, NULL, 'Jeúz, Saquías y Mirma. Estos son sus hijos, jefes de familias.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 11, NULL, 'Mas de Husim engendró a Abitob y a Elpaal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 12, NULL, 'Y los hijos de Elpaal: Heber, Misam y Semed (el cual edificó Ono, y Lod con sus aldeas),', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 13, NULL, 'Bería también, y Sema, que fueron jefes de las familias de los moradores de Ajalón, los cuales echaron a los moradores de Gat.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 14, NULL, 'Y Ahío, Sasac, Jeremot,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 15, NULL, 'Zebadías, Arad, Ader,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 16, NULL, 'Micael, Ispa y Joha, hijos de Bería.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 17, NULL, 'Y Zebadías, Mesulam, Hizqui, Heber,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 18, NULL, 'Ismerai, Jezlías y Jobab, hijos de Elpaal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 19, NULL, 'Y Jaquim, Zicri, Zabdi,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 20, NULL, 'Elienai, Ziletai, Eliel,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 21, NULL, 'Adaías, Beraías y Simrat, hijos de Simei.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 22, NULL, 'E Ispán, Heber, Eliel,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 23, NULL, 'Abdón, Zicri, Hanán,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 24, NULL, 'Hananías, Elam, Anatotías,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 25, NULL, 'Ifdaías y Peniel, hijos de Sasac.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 26, NULL, 'Y Samserai, Seharías, Atalías,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 27, NULL, 'Jaresías, Elías y Zicri, hijos de Jeroham.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 28, NULL, 'Estos fueron jefes principales de familias por sus linajes, y habitaron en Jerusalén.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 29, NULL, 'Y en Gabaón habitaron Abigabaón, la mujer del cual se llamó Maaca,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 30, NULL, 'y su hijo primogénito Abdón, y Zur, Cis, Baal, Nadab,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 31, NULL, 'Gedor, Ahío y Zequer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 32, NULL, 'Y Miclot engendró a Simea. Estos también habitaron con sus hermanos en Jerusalén, enfrente de ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 33, NULL, 'Ner engendró a Cis, Cis engendró a Saúl, y Saúl engendró a Jonatán, Malquisúa, Abinadab y Es-baal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 34, NULL, 'Hijo de Jonatán fue Merib-baal, y Merib-baal engendró a Micaía.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 35, NULL, 'Los hijos de Micaía: Pitón, Melec, Tarea y Acaz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 36, NULL, 'Acaz engendró a Joada, Joada engendró a Alemet, Azmavet y Zimri, y Zimri engendró a Mosa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 37, NULL, 'Mosa engendró a Bina, hijo del cual fue Rafa, hijo del cual fue Elasa, cuyo hijo fue Azel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 38, NULL, 'Los hijos de Azel fueron seis, cuyos nombres son Azricam, Bocru, Ismael, Searías, Obadías y Hanán; todos estos fueron hijos de Azel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 39, NULL, 'Y los hijos de Esec su hermano: Ulam su primogénito, Jehús el segundo, Elifelet el tercero.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 8, 40, NULL, 'Y fueron los hijos de Ulam hombres valientes y vigorosos, flecheros diestros, los cuales tuvieron muchos hijos y nietos, ciento cincuenta. Todos estos fueron de los hijos de Benjamín.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 1, 'Los que regresaron de Babilonia', 'Contado todo Israel por sus genealogías, fueron escritos en el libro de los reyes de Israel. Y los de Judá fueron transportados a Babilonia por su rebelión.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 2, NULL, 'Los primeros moradores que entraron en sus posesiones en las ciudades fueron israelitas, sacerdotes, levitas y sirvientes del templo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 3, NULL, 'Habitaron en Jerusalén, de los hijos de Judá, de los hijos de Benjamín, de los hijos de Efraín y Manasés:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 4, NULL, 'Utai hijo de Amiud, hijo de Omri, hijo de Imri, hijo de Bani, de los hijos de Fares hijo de Judá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 5, NULL, 'Y de los silonitas, Asaías el primogénito, y sus hijos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 6, NULL, 'De los hijos de Zera, Jeuel y sus hermanos, seiscientos noventa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 7, NULL, 'Y de los hijos de Benjamín: Salú hijo de Mesulam, hijo de Hodavías, hijo de Asenúa,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 8, NULL, 'Ibneías hijo de Jeroham, Ela hijo de Uzi, hijo de Micri, y Mesulam hijo de Sefatías, hijo de Reuel, hijo de Ibnías.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 9, NULL, 'Y sus hermanos por sus linajes fueron novecientos cincuenta y seis. Todos estos hombres fueron jefes de familia en sus casas paternas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 10, NULL, 'De los sacerdotes: Jedaías, Joiarib, Jaquín,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 11, NULL, 'Azarías hijo de Hilcías, hijo de Mesulam, hijo de Sadoc, hijo de Meraiot, hijo de Ahitob, príncipe de la casa de Dios;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 12, NULL, 'Adaía hijo de Jeroham, hijo de Pasur, hijo de Malquías; Masai hijo de Adiel, hijo de Jazera, hijo de Mesulam, hijo de Mesilemit, hijo de Imer,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 13, NULL, 'y sus hermanos, jefes de sus casas paternas, en número de mil setecientos sesenta, hombres muy eficaces en la obra del ministerio en la casa de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 14, NULL, 'De los levitas: Semaías hijo de Hasub, hijo de Azricam, hijo de Hasabías, de los hijos de Merari,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 15, NULL, 'Bacbacar, Heres, Galal, Matanías hijo de Micaía, hijo de Zicri, hijo de Asaf;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 16, NULL, 'Obadías hijo de Semaías, hijo de Galal, hijo de Jedutún; y Berequías hijo de Asa, hijo de Elcana, el cual habitó en las aldeas de los netofatitas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 17, NULL, 'Y los porteros: Salum, Acub, Talmón, Ahimán y sus hermanos. Salum era el jefe.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 18, NULL, 'Hasta ahora entre las cuadrillas de los hijos de Leví han sido estos los porteros en la puerta del rey que está al oriente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 19, NULL, 'Salum hijo de Coré, hijo de Ebiasaf, hijo de Coré, y sus hermanos los coreítas por la casa de su padre, tuvieron a su cargo la obra del ministerio, guardando las puertas del tabernáculo, como sus padres guardaron la entrada del campamento de Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 20, NULL, 'Y Finees hijo de Eleazar fue antes capitán sobre ellos; y Jehová estaba con él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 21, NULL, 'Zacarías hijo de Meselemías era portero de la puerta del tabernáculo de reunión.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 22, NULL, 'Todos estos, escogidos para guardas en las puertas, eran doscientos doce cuando fueron contados por el orden de sus linajes en sus villas, a los cuales constituyó en su oficio David y Samuel el vidente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 23, NULL, 'Así ellos y sus hijos eran porteros por sus turnos a las puertas de la casa de Jehová, y de la casa del tabernáculo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 24, NULL, 'Y estaban los porteros a los cuatro lados; al oriente, al occidente, al norte y al sur.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 25, NULL, 'Y sus hermanos que estaban en sus aldeas, venían cada siete días según su turno para estar con ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 26, NULL, 'Porque cuatro principales de los porteros levitas estaban en el oficio, y tenían a su cargo las cámaras y los tesoros de la casa de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 27, NULL, 'Estos moraban alrededor de la casa de Dios, porque tenían el cargo de guardarla, y de abrirla todas las mañanas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 28, NULL, 'Algunos de estos tenían a su cargo los utensilios para el ministerio, los cuales se metían por cuenta, y por cuenta se sacaban.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 29, NULL, 'Y otros de ellos tenían el cargo de la vajilla, y de todos los utensilios del santuario, de la harina, del vino, del aceite, del incienso y de las especias.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 30, NULL, 'Y algunos de los hijos de los sacerdotes hacían los perfumes aromáticos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 31, NULL, 'Matatías, uno de los levitas, primogénito de Salum coreíta, tenía a su cargo las cosas que se hacían en sartén.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 32, NULL, 'Y algunos de los hijos de Coat, y de sus hermanos, tenían a su cargo los panes de la proposición, los cuales ponían por orden cada día de reposo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 33, NULL, 'También había cantores, jefes de familias de los levitas, los cuales moraban en las cámaras del templo, exentos de otros servicios, porque de día y de noche estaban en aquella obra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 34, NULL, 'Estos eran jefes de familias de los levitas por sus linajes, jefes que habitaban en Jerusalén.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 35, 'Genealogía de Saúl', 'En Gabaón habitaba Jehiel padre de Gabaón, el nombre de cuya mujer era Maaca;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 36, NULL, 'y su hijo primogénito Abdón, luego Zur, Cis, Baal, Ner, Nadab,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 37, NULL, 'Gedor, Ahío, Zacarías y Miclot;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 38, NULL, 'y Miclot engendró a Simeam. Estos habitaban también en Jerusalén con sus hermanos enfrente de ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 39, NULL, 'Ner engendró a Cis, Cis engendró a Saúl, y Saúl engendró a Jonatán, Malquisúa, Abinadab y Es-baal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 40, NULL, 'Hijo de Jonatán fue Merib-baal, y Merib-baal engendró a Micaía.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 41, NULL, 'Y los hijos de Micaía: Pitón, Melec, Tarea y Acaz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 42, NULL, 'Acaz engendró a Jara, Jara engendró a Alemet, Azmavet y Zimri, y Zimri engendró a Mosa,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 43, NULL, 'y Mosa engendró a Bina, cuyo hijo fue Refaías, del que fue hijo Elasa, cuyo hijo fue Azel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 9, 44, NULL, 'Y Azel tuvo seis hijos, los nombres de los cuales son: Azricam, Bocru, Ismael, Searías, Obadías y Hanán. Estos fueron los hijos de Azel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 10, 1, 'Muerte de Saúl y de sus hijos', 'Los filisteos pelearon contra Israel; y huyeron delante de ellos los israelitas, y cayeron heridos en el monte de Gilboa.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 10, 2, NULL, 'Y los filisteos siguieron a Saúl y a sus hijos, y mataron los filisteos a Jonatán, a Abinadab y a Malquisúa, hijos de Saúl.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 10, 3, NULL, 'Y arreciando la batalla contra Saúl, le alcanzaron los flecheros, y fue herido por los flecheros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 10, 4, NULL, 'Entonces dijo Saúl a su escudero: Saca tu espada y traspásame con ella, no sea que vengan estos incircuncisos y hagan escarnio de mí; pero su escudero no quiso, porque tenía mucho miedo. Entonces Saúl tomó la espada, y se echó sobre ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 10, 5, NULL, 'Cuando su escudero vio a Saúl muerto, él también se echó sobre su espada y se mató.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 10, 6, NULL, 'Así murieron Saúl y sus tres hijos; y toda su casa murió juntamente con él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 10, 7, NULL, 'Y viendo todos los de Israel que habitaban en el valle, que habían huido, y que Saúl y sus hijos eran muertos, dejaron sus ciudades y huyeron, y vinieron los filisteos y habitaron en ellas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 10, 8, NULL, 'Sucedió al día siguiente, que al venir los filisteos a despojar a los muertos, hallaron a Saúl y a sus hijos tendidos en el monte de Gilboa.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 10, 9, NULL, 'Y luego que le despojaron, tomaron su cabeza y sus armas, y enviaron mensajeros por toda la tierra de los filisteos para dar las nuevas a sus ídolos y al pueblo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 10, 10, NULL, 'Y pusieron sus armas en el templo de sus dioses, y colgaron la cabeza en el templo de Dagón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 10, 11, NULL, 'Y oyendo todos los de Jabes de Galaad lo que los filisteos habían hecho de Saúl,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 10, 12, NULL, 'se levantaron todos los hombres valientes, y tomaron el cuerpo de Saúl y los cuerpos de sus hijos, y los trajeron a Jabes; y enterraron sus huesos debajo de una encina en Jabes, y ayunaron siete días.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 10, 13, NULL, 'Así murió Saúl por su rebelión con que prevaricó contra Jehová, contra la palabra de Jehová, la cual no guardó, y porque consultó a una adivina,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 10, 14, NULL, 'y no consultó a Jehová; por esta causa lo mató, y traspasó el reino a David hijo de Isaí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 1, 'David es proclamado rey de Israel', 'Entonces todo Israel se juntó a David en Hebrón, diciendo: He aquí nosotros somos tu hueso y tu carne.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 2, NULL, 'También antes de ahora, mientras Saúl reinaba, tú eras quien sacaba a la guerra a Israel, y lo volvía a traer. También Jehová tu Dios te ha dicho: Tú apacentarás a mi pueblo Israel, y tú serás príncipe sobre Israel mi pueblo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 3, NULL, 'Y vinieron todos los ancianos de Israel al rey en Hebrón, y David hizo con ellos pacto delante de Jehová; y ungieron a David por rey sobre Israel, conforme a la palabra de Jehová por medio de Samuel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 4, 'David toma la fortaleza de Sion', 'Entonces se fue David con todo Israel a Jerusalén, la cual es Jebús; y los jebuseos habitaban en aquella tierra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 5, NULL, 'Y los moradores de Jebús dijeron a David: No entrarás acá. Mas David tomó la fortaleza de Sion, que es la ciudad de David.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 6, NULL, 'Y David había dicho: El que primero derrote a los jebuseos será cabeza y jefe. Entonces Joab hijo de Sarvia subió el primero, y fue hecho jefe.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 7, NULL, 'Y David habitó en la fortaleza, y por esto la llamaron la Ciudad de David.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 8, NULL, 'Y edificó la ciudad alrededor, desde Milo hasta el muro; y Joab reparó el resto de la ciudad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 9, NULL, 'Y David iba adelantando y creciendo, y Jehová de los ejércitos estaba con él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 10, 'Los valientes de David', 'Estos son los principales de los valientes que David tuvo, y los que le ayudaron en su reino, con todo Israel, para hacerle rey sobre Israel, conforme a la palabra de Jehová.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 11, NULL, 'Y este es el número de los valientes que David tuvo: Jasobeam hijo de Hacmoni, caudillo de los treinta, el cual blandió su lanza una vez contra trescientos, a los cuales mató.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 12, NULL, 'Tras de este estaba Eleazar hijo de Dodo, ahohíta, el cual era de los tres valientes.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 13, NULL, 'Este estuvo con David en Pasdamim, estando allí juntos en batalla los filisteos; y había allí una parcela de tierra llena de cebada, y huyendo el pueblo delante de los filisteos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 14, NULL, 'se pusieron ellos en medio de la parcela y la defendieron, y vencieron a los filisteos, porque Jehová los favoreció con una gran victoria.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 15, NULL, 'Y tres de los treinta principales descendieron a la peña a David, a la cueva de Adulam, estando el campamento de los filisteos en el valle de Refaim.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 16, NULL, 'David estaba entonces en la fortaleza, y había entonces guarnición de los filisteos en Belén.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 17, NULL, 'David deseó entonces, y dijo: ¡Quién me diera de beber de las aguas del pozo de Belén, que está a la puerta!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 18, NULL, 'Y aquellos tres rompieron por el campamento de los filisteos, y sacaron agua del pozo de Belén, que está a la puerta, y la tomaron y la trajeron a David; mas él no la quiso beber, sino que la derramó para Jehová, y dijo:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 19, NULL, 'Guárdeme mi Dios de hacer esto. ¿Había yo de beber la sangre y la vida de estos varones, que con peligro de sus vidas la han traído? Y no la quiso beber. Esto hicieron aquellos tres valientes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 20, NULL, 'Y Abisai, hermano de Joab, era jefe de los treinta, el cual blandió su lanza contra trescientos y los mató, y ganó renombre con los tres.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 21, NULL, 'Fue el más ilustre de los treinta, y fue el jefe de ellos, pero no igualó a los tres primeros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 22, NULL, 'Benaía hijo de Joiada, hijo de un varón valiente de Cabseel, de grandes hechos; él venció a los dos leones de Moab; también descendió y mató a un león en medio de un foso, en tiempo de nieve.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 23, NULL, 'Él mismo venció a un egipcio, hombre de cinco codos de estatura; y el egipcio traía una lanza como un rodillo de tejedor, mas él descendió con un báculo, y arrebató al egipcio la lanza de la mano, y lo mató con su misma lanza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 24, NULL, 'Esto hizo Benaía hijo de Joiada, y fue nombrado con los tres valientes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 25, NULL, 'Y fue el más distinguido de los treinta, pero no igualó a los tres primeros. A este puso David en su guardia personal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 26, NULL, 'Y los valientes de los ejércitos: Asael hermano de Joab, Elhanan hijo de Dodo de Belén,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 27, NULL, 'Samot harodita, Heles pelonita;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 28, NULL, 'Ira hijo de Iques tecoíta, Abiezer anatotita,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 29, NULL, 'Sibecai husatita, Ilai ahohíta,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 30, NULL, 'Maharai netofatita, Heled hijo de Baana netofatita,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 31, NULL, 'Itai hijo de Ribai, de Gabaa de los hijos de Benjamín, Benaía piratonita,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 32, NULL, 'Hurai del río Gaas, Abiel arbatita,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 33, NULL, 'Azmavet barhumita, Eliaba saalbonita,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 34, NULL, 'los hijos de Hasem gizonita, Jonatán hijo de Sage ararita,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 35, NULL, 'Ahíam hijo de Sacar ararita, Elifal hijo de Ur,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 36, NULL, 'Hefer mequeratita, Ahías pelonita,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 37, NULL, 'Hezro carmelita, Naarai hijo de Ezbai,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 38, NULL, 'Joel hermano de Natán, Mibhar hijo de Hagrai,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 39, NULL, 'Selec amonita, Naharai beerotita, escudero de Joab hijo de Sarvia,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 40, NULL, 'Ira itrita, Gareb itrita,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 41, NULL, 'Urías heteo, Zabad hijo de Ahlai,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 42, NULL, 'Adina hijo de Siza rubenita, príncipe de los rubenitas, y con él treinta,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 43, NULL, 'Hanán hijo de Maaca, Josafat mitnita,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 44, NULL, 'Uzías astarotita, Sama y Jehiel hijos de Hotam aroerita;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 45, NULL, 'Jediael hijo de Simri, y Joha su hermano, tizita,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 46, NULL, 'Eliel mahavita, Jerebai y Josavía hijos de Elnaam, Itma moabita,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 11, 47, NULL, 'Eliel, Obed, y Jaasiel mesobaíta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 1, 'El ejército de David', 'Estos son los que vinieron a David en Siclag, estando él aún encerrado por causa de Saúl hijo de Cis, y eran de los valientes que le ayudaron en la guerra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 2, NULL, 'Estaban armados de arcos, y usaban de ambas manos para tirar piedras con honda y saetas con arco. De los hermanos de Saúl de Benjamín:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 3, NULL, 'El principal Ahiezer, después Joás, hijos de Semaa gabaatita; Jeziel y Pelet hijos de Azmavet, Beraca, Jehú anatotita,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 4, NULL, 'Ismaías gabaonita, valiente entre los treinta, y más que los treinta; Jeremías, Jahaziel, Johanán, Jozabad gederatita,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 5, NULL, 'Eluzai, Jerimot, Bealías, Semarías, Sefatías harufita,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 6, NULL, 'Elcana, Isías, Azareel, Joezer y Jasobeam, coreítas,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 7, NULL, 'y Joela y Zebadías hijos de Jeroham de Gedor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 8, NULL, 'También de los de Gad huyeron y fueron a David, al lugar fuerte en el desierto, hombres de guerra muy valientes para pelear, diestros con escudo y pavés; sus rostros eran como rostros de leones, y eran ligeros como las gacelas sobre las montañas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 9, NULL, 'Ezer el primero, Obadías el segundo, Eliab el tercero,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 10, NULL, 'Mismana el cuarto, Jeremías el quinto,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 11, NULL, 'Atai el sexto, Eliel el séptimo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 12, NULL, 'Johanán el octavo, Elzabad el noveno,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 13, NULL, 'Jeremías el décimo y Macbanai el undécimo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 14, NULL, 'Estos fueron capitanes del ejército de los hijos de Gad. El menor tenía cargo de cien hombres, y el mayor de mil.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 15, NULL, 'Estos pasaron el Jordán en el mes primero, cuando se había desbordado por todas sus riberas; e hicieron huir a todos los de los valles al oriente y al poniente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 16, NULL, 'Asimismo algunos de los hijos de Benjamín y de Judá vinieron a David al lugar fuerte.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 17, NULL, 'Y David salió a ellos, y les habló diciendo: Si habéis venido a mí para paz y para ayudarme, mi corazón será unido con vosotros; mas si es para entregarme a mis enemigos, sin haber iniquidad en mis manos, véalo el Dios de nuestros padres, y lo demande.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 18, NULL, 'Entonces el Espíritu vino sobre Amasai, jefe de los treinta, y dijo: Por ti, oh David, y contigo, oh hijo de Isaí. Paz, paz contigo, y paz con tus ayudadores, pues también tu Dios te ayuda. Y David los recibió, y los puso entre los capitanes de la tropa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 19, NULL, 'También se pasaron a David algunos de Manasés, cuando vino con los filisteos a la batalla contra Saúl (pero David no les ayudó, porque los jefes de los filisteos, habido consejo, lo despidieron, diciendo: Con peligro de nuestras cabezas se pasará a su señor Saúl).', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 20, NULL, 'Así que viniendo él a Siclag, se pasaron a él de los de Manasés, Adnas, Jozabad, Jediaiel, Micael, Jozabad, Eliú y Ziletai, príncipes de millares de los de Manasés.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 21, NULL, 'Estos ayudaron a David contra la banda de merodeadores, pues todos ellos eran hombres valientes, y fueron capitanes en el ejército.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 22, NULL, 'Porque entonces todos los días venía ayuda a David, hasta hacerse un gran ejército, como ejército de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 23, NULL, 'Y este es el número de los principales que estaban listos para la guerra, y vinieron a David en Hebrón para traspasarle el reino de Saúl, conforme a la palabra de Jehová:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 24, NULL, 'De los hijos de Judá que traían escudo y lanza, seis mil ochocientos, listos para la guerra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 25, NULL, 'De los hijos de Simeón, siete mil cien hombres, valientes y esforzados para la guerra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 26, NULL, 'De los hijos de Leví, cuatro mil seiscientos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 27, NULL, 'asimismo Joiada, príncipe de los del linaje de Aarón, y con él tres mil setecientos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 28, NULL, 'y Sadoc, joven valiente y esforzado, con veintidós de los principales de la casa de su padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 29, NULL, 'De los hijos de Benjamín hermanos de Saúl, tres mil; porque hasta entonces muchos de ellos se mantenían fieles a la casa de Saúl.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 30, NULL, 'De los hijos de Efraín, veinte mil ochocientos, muy valientes, varones ilustres en las casas de sus padres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 31, NULL, 'De la media tribu de Manasés, dieciocho mil, los cuales fueron tomados por lista para venir a poner a David por rey.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 32, NULL, 'De los hijos de Isacar, doscientos principales, entendidos en los tiempos, y que sabían lo que Israel debía hacer, cuyo dicho seguían todos sus hermanos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 33, NULL, 'De Zabulón cincuenta mil, que salían a campaña prontos para la guerra, con toda clase de armas de guerra, dispuestos a pelear sin doblez de corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 34, NULL, 'De Neftalí, mil capitanes, y con ellos treinta y siete mil con escudo y lanza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 35, NULL, 'De los de Dan, dispuestos a pelear, veintiocho mil seiscientos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 36, NULL, 'De Aser, dispuestos para la guerra y preparados para pelear, cuarenta mil.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 37, NULL, 'Y del otro lado del Jordán, de los rubenitas y gaditas y de la media tribu de Manasés, ciento veinte mil con toda clase de armas de guerra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 38, NULL, 'Todos estos hombres de guerra, dispuestos para guerrear, vinieron con corazón perfecto a Hebrón, para poner a David por rey sobre todo Israel; asimismo todos los demás de Israel estaban de un mismo ánimo para poner a David por rey.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 39, NULL, 'Y estuvieron allí con David tres días comiendo y bebiendo, porque sus hermanos habían preparado para ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 12, 40, NULL, 'También los que les eran vecinos, hasta Isacar y Zabulón y Neftalí, trajeron víveres en asnos, camellos, mulos y bueyes; provisión de harina, tortas de higos, pasas, vino y aceite, y bueyes y ovejas en abundancia, porque en Israel había alegría.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 13, 1, 'David propone trasladar el arca a Jerusalén', 'Entonces David tomó consejo con los capitanes de millares y de centenas, y con todos los jefes.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 13, 2, NULL, 'Y dijo David a toda la asamblea de Israel: Si os parece bien y si es la voluntad de Jehová nuestro Dios, enviaremos a todas partes por nuestros hermanos que han quedado en todas las tierras de Israel, y por los sacerdotes y levitas que están con ellos en sus ciudades y ejidos, para que se reúnan con nosotros;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 13, 3, NULL, 'y traigamos el arca de nuestro Dios a nosotros, porque desde el tiempo de Saúl no hemos hecho caso de ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 13, 4, NULL, 'Y dijo toda la asamblea que se hiciese así, porque la cosa parecía bien a todo el pueblo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 13, 5, 'David intenta traer el arca', 'Entonces David reunió a todo Israel, desde Sihor de Egipto hasta la entrada de Hamat, para que trajesen el arca de Dios de Quiriat-jearim.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 13, 6, NULL, 'Y subió David con todo Israel a Baala de Quiriat-jearim, que está en Judá, para pasar de allí el arca de Jehová Dios, que mora entre los querubines, sobre la cual su nombre es invocado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 13, 7, NULL, 'Y llevaron el arca de Dios de la casa de Abinadab en un carro nuevo; y Uza y Ahío guiaban el carro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 13, 8, NULL, 'Y David y todo Israel se regocijaban delante de Dios con todas sus fuerzas, con cánticos, arpas, salterios, tamboriles, címbalos y trompetas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 13, 9, NULL, 'Pero cuando llegaron a la era de Quidón, Uza extendió su mano al arca para sostenerla, porque los bueyes tropezaban.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 13, 10, NULL, 'Y el furor de Jehová se encendió contra Uza, y lo hirió, porque había extendido su mano al arca; y murió allí delante de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 13, 11, NULL, 'Y David tuvo pesar, porque Jehová había quebrantado a Uza; por lo que llamó aquel lugar Pérez-uza, hasta hoy.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 13, 12, NULL, 'Y David temió a Dios aquel día, y dijo: ¿Cómo he de traer a mi casa el arca de Dios?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 13, 13, NULL, 'Y no trajo David el arca a su casa en la ciudad de David, sino que la llevó a casa de Obed-edom geteo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 13, 14, NULL, 'Y el arca de Dios estuvo con la familia de Obed-edom, en su casa, tres meses; y bendijo Jehová la casa de Obed-edom, y todo lo que tenía.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 14, 1, 'Hiram envía embajadores a David', 'Hiram rey de Tiro envió a David embajadores, y madera de cedro, y albañiles y carpinteros, para que le edificasen una casa.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 14, 2, NULL, 'Y entendió David que Jehová lo había confirmado como rey sobre Israel, y que había exaltado su reino sobre su pueblo Israel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 14, 3, 'Hijos de David nacidos en Jerusalén', 'Entonces David tomó también mujeres en Jerusalén, y engendró David más hijos e hijas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 14, 4, NULL, 'Y estos son los nombres de los que le nacieron en Jerusalén: Samúa, Sobab, Natán, Salomón,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 14, 5, NULL, 'Ibhar, Elisúa, Elpelet,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 14, 6, NULL, 'Noga, Nefeg, Jafía,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 14, 7, NULL, 'Elisama, Beeliada y Elifelet.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 14, 8, 'David derrota a los filisteos', 'Oyendo los filisteos que David había sido ungido rey sobre todo Israel, subieron todos los filisteos en busca de David. Y cuando David lo oyó, salió contra ellos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 14, 9, NULL, 'Y vinieron los filisteos, y se extendieron por el valle de Refaim.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 14, 10, NULL, 'Entonces David consultó a Dios, diciendo: ¿Subiré contra los filisteos? ¿Los entregarás en mi mano? Y Jehová le dijo: Sube, porque yo los entregaré en tus manos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 14, 11, NULL, 'Subieron, pues, a Baal-perazim, y allí los derrotó David. Dijo luego David: Dios rompió mis enemigos por mi mano, como se rompen las aguas. Por esto llamaron el nombre de aquel lugar Baal-perazim.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 14, 12, NULL, 'Y dejaron allí sus dioses, y David dijo que los quemasen.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 14, 13, NULL, 'Y volviendo los filisteos a extenderse por el valle,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 14, 14, NULL, 'David volvió a consultar a Dios, y Dios le dijo: No subas tras ellos, sino rodéalos, para venir a ellos por delante de las balsameras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 14, 15, NULL, 'Y así que oigas venir un estruendo por las copas de las balsameras, sal luego a la batalla, porque Dios saldrá delante de ti y herirá el ejército de los filisteos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 14, 16, NULL, 'Hizo, pues, David como Dios le mandó, y derrotaron al ejército de los filisteos desde Gabaón hasta Gezer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 14, 17, NULL, 'Y la fama de David fue divulgada por todas aquellas tierras; y Jehová puso el temor de David sobre todas las naciones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 15, 1, 'David trae el arca a Jerusalén', 'Hizo David también casas para sí en la ciudad de David, y arregló un lugar para el arca de Dios, y le levantó una tienda.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 15, 2, NULL, 'Entonces dijo David: El arca de Dios no debe ser llevada sino por los levitas; porque a ellos ha elegido Jehová para que lleven el arca de Jehová, y le sirvan perpetuamente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 15, 3, NULL, 'Y congregó David a todo Israel en Jerusalén, para que pasasen el arca de Jehová a su lugar, el cual le había él preparado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 15, 4, NULL, 'Reunió también David a los hijos de Aarón y a los levitas;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 15, 5, NULL, 'de los hijos de Coat, Uriel el principal, y sus hermanos, ciento veinte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 15, 6, NULL, 'De los hijos de Merari, Asaías el principal, y sus hermanos, doscientos veinte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 15, 7, NULL, 'De los hijos de Gersón, Joel el principal, y sus hermanos, ciento treinta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 15, 8, NULL, 'De los hijos de Elizafán, Semaías el principal, y sus hermanos, doscientos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 15, 9, NULL, 'De los hijos de Hebrón, Eliel el principal, y sus hermanos, ochenta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 15, 10, NULL, 'De los hijos de Uziel, Aminadab el principal, y sus hermanos, ciento doce.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 15, 11, NULL, 'Y llamó David a los sacerdotes Sadoc y Abiatar, y a los levitas Uriel, Asaías, Joel, Semaías, Eliel y Aminadab,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 15, 12, NULL, 'y les dijo: Vosotros que sois los principales padres de las familias de los levitas, santificaos, vosotros y vuestros hermanos, y pasad el arca de Jehová Dios de Israel al lugar que le he preparado;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 15, 13, NULL, 'pues por no haberlo hecho así vosotros la primera vez, Jehová nuestro Dios nos quebrantó, por cuanto no le buscamos según su ordenanza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 15, 14, NULL, 'Así los sacerdotes y los levitas se santificaron para traer el arca de Jehová Dios de Israel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 15, 15, NULL, 'Y los hijos de los levitas trajeron el arca de Dios puesta sobre sus hombros en las barras, como lo había mandado Moisés, conforme a la palabra de Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 15, 16, NULL, 'Asimismo dijo David a los principales de los levitas, que designasen de sus hermanos a cantores con instrumentos de música, con salterios y arpas y címbalos, que resonasen y alzasen la voz con alegría.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 15, 17, NULL, 'Y los levitas designaron a Hemán hijo de Joel; y de sus hermanos, a Asaf hijo de Berequías; y de los hijos de Merari y de sus hermanos, a Etán hijo de Cusaías.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 15, 18, NULL, 'Y con ellos a sus hermanos del segundo orden, a Zacarías, Jaaziel, Semiramot, Jehiel, Uni, Eliab, Benaía, Maasías, Matatías, Elifelehu, Micnías, Obed-edom y Jeiel, los porteros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 15, 19, NULL, 'Así Hemán, Asaf y Etán, que eran cantores, sonaban címbalos de bronce.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 15, 20, NULL, 'Y Zacarías, Aziel, Semiramot, Jehiel, Uni, Eliab, Maasías y Benaía, con salterios sobre Alamot.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 15, 21, NULL, 'Matatías, Elifelehu, Micnías, Obed-edom, Jeiel y Azazías tenían arpas afinadas en la octava para dirigir.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 15, 22, NULL, 'Y Quenanías, principal de los levitas en la música, fue puesto para dirigir el canto, porque era entendido en ello.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 15, 23, NULL, 'Berequías y Elcana eran porteros del arca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 15, 24, NULL, 'Y Sebanías, Josafat, Natanael, Amasai, Zacarías, Benaía y Eliezer, sacerdotes, tocaban las trompetas delante del arca de Dios; Obed-edom y Jehías eran también porteros del arca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 15, 25, NULL, 'David, pues, y los ancianos de Israel y los capitanes de millares, fueron a traer el arca del pacto de Jehová, de casa de Obed-edom, con alegría.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 15, 26, NULL, 'Y ayudando Dios a los levitas que llevaban el arca del pacto de Jehová, sacrificaron siete novillos y siete carneros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 15, 27, NULL, 'Y David iba vestido de lino fino, y también todos los levitas que llevaban el arca, y asimismo los cantores; y Quenanías era maestro de canto entre los cantores. Llevaba también David sobre sí un efod de lino.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 15, 28, NULL, 'De esta manera llevaba todo Israel el arca del pacto de Jehová, con júbilo y sonido de bocinas y trompetas y címbalos, y al son de salterios y arpas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 15, 29, NULL, 'Pero cuando el arca del pacto de Jehová llegó a la ciudad de David, Mical, hija de Saúl, mirando por una ventana, vio al rey David que saltaba y danzaba; y lo menospreció en su corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 1, NULL, 'Así trajeron el arca de Dios, y la pusieron en medio de la tienda que David había levantado para ella; y ofrecieron holocaustos y sacrificios de paz delante de Dios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 2, NULL, 'Y cuando David acabó de ofrecer el holocausto y los sacrificios de paz, bendijo al pueblo en el nombre de Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 3, NULL, 'Y repartió a todo Israel, así a hombres como a mujeres, a cada uno una torta de pan, una pieza de carne, y una torta de pasas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 4, NULL, 'Y puso delante del arca de Jehová ministros de los levitas, para que recordasen y confesasen y loasen a Jehová Dios de Israel:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 5, NULL, 'Asaf el primero; el segundo después de él, Zacarías; Jeiel, Semiramot, Jehiel, Matatías, Eliab, Benaía, Obed-edom y Jeiel, con sus instrumentos de salterios y arpas; pero Asaf sonaba los címbalos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 6, NULL, 'También los sacerdotes Benaía y Jahaziel sonaban continuamente las trompetas delante del arca del pacto de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 7, 'Salmo de acción de gracias de David', 'Entonces, en aquel día, David comenzó a aclamar a Jehová por mano de Asaf y de sus hermanos:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 8, NULL, 'Alabad a Jehová, invocad su nombre, Dad a conocer en los pueblos sus obras.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 9, NULL, 'Cantad a él, cantadle salmos; Hablad de todas sus maravillas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 10, NULL, 'Gloriaos en su santo nombre; Alégrese el corazón de los que buscan a Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 11, NULL, 'Buscad a Jehová y su poder; Buscad su rostro continuamente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 12, NULL, 'Haced memoria de las maravillas que ha hecho, De sus prodigios, y de los juicios de su boca,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 13, NULL, 'Oh vosotros, hijos de Israel su siervo, Hijos de Jacob, sus escogidos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 14, NULL, 'Jehová, él es nuestro Dios; Sus juicios están en toda la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 15, NULL, 'Él hace memoria de su pacto perpetuamente, Y de la palabra que él mandó para mil generaciones;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 16, NULL, 'Del pacto que concertó con Abraham, Y de su juramento a Isaac;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 17, NULL, 'El cual confirmó a Jacob por estatuto, Y a Israel por pacto sempiterno,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 18, NULL, 'Diciendo: A ti daré la tierra de Canaán, Porción de tu heredad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 19, NULL, 'Cuando ellos eran pocos en número, Pocos y forasteros en ella,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 20, NULL, 'Y andaban de nación en nación, Y de un reino a otro pueblo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 21, NULL, 'No permitió que nadie los oprimiese; Antes por amor de ellos castigó a los reyes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 22, NULL, 'No toquéis, dijo, a mis ungidos, Ni hagáis mal a mis profetas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 23, NULL, 'Cantad a Jehová toda la tierra, Proclamad de día en día su salvación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 24, NULL, 'Cantad entre las gentes su gloria, Y en todos los pueblos sus maravillas.', 0, 'spa', 'RVR1960', NULL);\n"
;

  public static final String SQL_PARTE_3 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 25, NULL, 'Porque grande es Jehová, y digno de suprema alabanza, Y de ser temido sobre todos los dioses.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 26, NULL, 'Porque todos los dioses de los pueblos son ídolos; Mas Jehová hizo los cielos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 27, NULL, 'Alabanza y magnificencia delante de él; Poder y alegría en su morada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 28, NULL, 'Tributad a Jehová, oh familias de los pueblos, Dad a Jehová gloria y poder.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 29, NULL, 'Dad a Jehová la honra debida a su nombre; Traed ofrenda, y venid delante de él; Postraos delante de Jehová en la hermosura de la santidad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 30, NULL, 'Temed en su presencia, toda la tierra; El mundo será aún establecido, para que no se conmueva.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 31, NULL, 'Alégrense los cielos, y gócese la tierra, Y digan en las naciones: Jehová reina.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 32, NULL, 'Resuene el mar, y su plenitud; Alégrese el campo, y todo lo que contiene.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 33, NULL, 'Entonces cantarán los árboles de los bosques delante de Jehová, Porque viene a juzgar la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 34, NULL, 'Aclamad a Jehová, porque él es bueno; Porque su misericordia es eterna.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 35, NULL, 'Y decid: Sálvanos, oh Dios, salvación nuestra; Recógenos, y líbranos de las naciones, Para que confesemos tu santo nombre, Y nos gloriemos en tus alabanzas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 36, NULL, 'Bendito sea Jehová Dios de Israel, De eternidad a eternidad. Y dijo todo el pueblo, Amén, y alabó a Jehová.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 37, 'Los levitas encargados del arca', 'Y dejó allí, delante del arca del pacto de Jehová, a Asaf y a sus hermanos, para que ministrasen de continuo delante del arca, cada cosa en su día;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 38, NULL, 'y a Obed-edom y a sus sesenta y ocho hermanos; y a Obed-edom hijo de Jedutún y a Hosa como porteros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 39, NULL, 'Asimismo al sacerdote Sadoc, y a los sacerdotes sus hermanos, delante del tabernáculo de Jehová en el lugar alto que estaba en Gabaón,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 40, NULL, 'para que sacrificasen continuamente, a mañana y tarde, holocaustos a Jehová en el altar del holocausto, conforme a todo lo que está escrito en la ley de Jehová, que él prescribió a Israel;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 41, NULL, 'y con ellos a Hemán, a Jedutún y a los otros escogidos declarados por sus nombres, para glorificar a Jehová, porque es eterna su misericordia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 42, NULL, 'Con ellos a Hemán y a Jedutún con trompetas y címbalos para los que tocaban, y con otros instrumentos de música de Dios; y a los hijos de Jedutún para porteros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 16, 43, NULL, 'Y todo el pueblo se fue cada uno a su casa; y David se volvió para bendecir su casa.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 17, 1, 'Pacto de Dios con David', 'Aconteció que morando David en su casa, dijo David al profeta Natán: He aquí yo habito en casa de cedro, y el arca del pacto de Jehová debajo de cortinas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 17, 2, NULL, 'Y Natán dijo a David: Haz todo lo que está en tu corazón, porque Dios está contigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 17, 3, NULL, 'En aquella misma noche vino palabra de Dios a Natán, diciendo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 17, 4, NULL, 'Ve y di a David mi siervo: Así ha dicho Jehová: Tú no me edificarás casa en que habite.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 17, 5, NULL, 'Porque no he habitado en casa alguna desde el día que saqué a los hijos de Israel hasta hoy; antes estuve de tienda en tienda, y de tabernáculo en tabernáculo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 17, 6, NULL, 'Por dondequiera que anduve con todo Israel, ¿hablé una palabra a alguno de los jueces de Israel, a los cuales mandé que apacentasen a mi pueblo, para decirles: Por qué no me edificáis una casa de cedro?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 17, 7, NULL, 'Por tanto, ahora dirás a mi siervo David: Así ha dicho Jehová de los ejércitos: Yo te tomé del redil, de detrás de las ovejas, para que fueses príncipe sobre mi pueblo Israel;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 17, 8, NULL, 'y he estado contigo en todo cuanto has andado, y he cortado a todos tus enemigos de delante de ti, y te haré gran nombre, como el nombre de los grandes en la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 17, 9, NULL, 'Asimismo he dispuesto lugar para mi pueblo Israel, y lo he plantado para que habite en él y no sea más removido; ni los hijos de iniquidad lo consumirán más, como antes,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 17, 10, NULL, 'y desde el tiempo que puse los jueces sobre mi pueblo Israel; mas humillaré a todos tus enemigos. Te hago saber, además, que Jehová te edificará casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 17, 11, NULL, 'Y cuando tus días sean cumplidos para irte con tus padres, levantaré descendencia después de ti, a uno de entre tus hijos, y afirmaré su reino.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 17, 12, NULL, 'Él me edificará casa, y yo confirmaré su trono eternamente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 17, 13, NULL, 'Yo le seré por padre, y él me será por hijo; y no quitaré de él mi misericordia, como la quité de aquel que fue antes de ti;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 17, 14, NULL, 'sino que lo confirmaré en mi casa y en mi reino eternamente, y su trono será firme para siempre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 17, 15, NULL, 'Conforme a todas estas palabras, y conforme a toda esta visión, así habló Natán a David.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 17, 16, NULL, 'Y entró el rey David y estuvo delante de Jehová, y dijo: Jehová Dios, ¿quién soy yo, y cuál es mi casa, para que me hayas traído hasta este lugar?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 17, 17, NULL, 'Y aun esto, oh Dios, te ha parecido poco, pues que has hablado de la casa de tu siervo para tiempo más lejano, y me has mirado como a un hombre excelente, oh Jehová Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 17, 18, NULL, '¿Qué más puede añadir David pidiendo de ti para glorificar a tu siervo? Mas tú conoces a tu siervo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 17, 19, NULL, 'Oh Jehová, por amor de tu siervo y según tu corazón, has hecho toda esta grandeza, para hacer notorias todas tus grandezas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 17, 20, NULL, 'Jehová, no hay semejante a ti, ni hay Dios sino tú, según todas las cosas que hemos oído con nuestros oídos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 17, 21, NULL, '¿Y qué pueblo hay en la tierra como tu pueblo Israel, cuyo Dios fuese y se redimiese un pueblo, para hacerte nombre con grandezas y maravillas, echando a las naciones de delante de tu pueblo, que tú rescataste de Egipto?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 17, 22, NULL, 'Tú has constituido a tu pueblo Israel por pueblo tuyo para siempre; y tú, Jehová, has venido a ser su Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 17, 23, NULL, 'Ahora pues, Jehová, la palabra que has hablado acerca de tu siervo y de su casa, sea firme para siempre, y haz como has dicho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 17, 24, NULL, 'Permanezca, pues, y sea engrandecido tu nombre para siempre, a fin de que se diga: Jehová de los ejércitos, Dios de Israel, es Dios para Israel. Y sea la casa de tu siervo David firme delante de ti.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 17, 25, NULL, 'Porque tú, Dios mío, revelaste al oído a tu siervo que le has de edificar casa; por eso ha hallado tu siervo motivo para orar delante de ti.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 17, 26, NULL, 'Ahora pues, Jehová, tú eres el Dios que has hablado de tu siervo este bien;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 17, 27, NULL, 'y ahora has querido bendecir la casa de tu siervo, para que permanezca perpetuamente delante de ti; porque tú, Jehová, la has bendecido, y será bendita para siempre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 18, 1, 'David extiende sus dominios', 'Después de estas cosas aconteció que David derrotó a los filisteos, y los humilló, y tomó a Gat y sus villas de mano de los filisteos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 18, 2, NULL, 'También derrotó a Moab, y los moabitas fueron siervos de David, trayéndole presentes.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 18, 3, NULL, 'Asimismo derrotó David a Hadad-ezer rey de Soba, en Hamat, yendo este a asegurar su dominio junto al río Éufrates.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 18, 4, NULL, 'Y le tomó David mil carros, siete mil de a caballo, y veinte mil hombres de a pie; y desjarretó David los caballos de todos los carros, excepto los de cien carros que dejó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 18, 5, NULL, 'Y viniendo los sirios de Damasco en ayuda de Hadad-ezer rey de Soba, David hirió de ellos veintidós mil hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 18, 6, NULL, 'Y puso David guarnición en Siria de Damasco, y los sirios fueron hechos siervos de David, trayéndole presentes; porque Jehová daba la victoria a David dondequiera que iba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 18, 7, NULL, 'Tomó también David los escudos de oro que llevaban los siervos de Hadad-ezer, y los trajo a Jerusalén.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 18, 8, NULL, 'Asimismo de Tibhat y de Cun, ciudades de Hadad-ezer, tomó David muchísimo bronce, con el que Salomón hizo el mar de bronce, las columnas, y utensilios de bronce.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 18, 9, NULL, 'Y oyendo Toi rey de Hamat que David había deshecho todo el ejército de Hadad-ezer rey de Soba,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 18, 10, NULL, 'envió a Adoram su hijo al rey David, para saludarle y bendecirle por haber peleado con Hadad-ezer y haberle vencido; porque Toi tenía guerra contra Hadad-ezer. Le envió también toda clase de utensilios de oro, de plata y de bronce;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 18, 11, NULL, 'los cuales el rey David dedicó a Jehová, con la plata y el oro que había tomado de todas las naciones de Edom, de Moab, de los hijos de Amón, de los filisteos y de Amalec.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 18, 12, NULL, 'Además de esto, Abisai hijo de Sarvia destrozó en el valle de la Sal a dieciocho mil edomitas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 18, 13, NULL, 'Y puso guarnición en Edom, y todos los edomitas fueron siervos de David; porque Jehová daba el triunfo a David dondequiera que iba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 18, 14, 'Oficiales de David', 'Reinó David sobre todo Israel, y juzgaba con justicia a todo su pueblo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 18, 15, NULL, 'Y Joab hijo de Sarvia era general del ejército, y Josafat hijo de Ahilud, canciller.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 18, 16, NULL, 'Sadoc hijo de Ahitob y Abimelec hijo de Abiatar eran sacerdotes, y Savsa, secretario.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 18, 17, NULL, 'Y Benaía hijo de Joiada estaba sobre los cereteos y peleteos; y los hijos de David eran los príncipes cerca del rey.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 19, 1, 'Derrotas de amonitas y sirios', 'Después de estas cosas aconteció que murió Nahas rey de los hijos de Amón, y reinó en su lugar su hijo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 19, 2, NULL, 'Y dijo David: Manifestaré misericordia con Hanún hijo de Nahas, porque también su padre me mostró misericordia. Así David envió embajadores que lo consolasen de la muerte de su padre. Pero cuando llegaron los siervos de David a la tierra de los hijos de Amón a Hanún, para consolarle,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 19, 3, NULL, 'los príncipes de los hijos de Amón dijeron a Hanún: ¿A tu parecer honra David a tu padre, que te ha enviado consoladores? ¿No vienen más bien sus siervos a ti para espiar, e inquirir, y reconocer la tierra?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 19, 4, NULL, 'Entonces Hanún tomó los siervos de David y los rapó, y les cortó los vestidos por la mitad, hasta las nalgas, y los despachó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 19, 5, NULL, 'Se fueron luego, y cuando llegó a David la noticia sobre aquellos varones, él envió a recibirlos, porque estaban muy afrentados. El rey mandó que les dijeran: Estaos en Jericó hasta que os crezca la barba, y entonces volveréis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 19, 6, NULL, 'Y viendo los hijos de Amón que se habían hecho odiosos a David, Hanún y los hijos de Amón enviaron mil talentos de plata para tomar a sueldo carros y gente de a caballo de Mesopotamia, de Siria, de Maaca y de Soba.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 19, 7, NULL, 'Y tomaron a sueldo treinta y dos mil carros, y al rey de Maaca y a su ejército, los cuales vinieron y acamparon delante de Medeba. Y se juntaron también los hijos de Amón de sus ciudades, y vinieron a la guerra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 19, 8, NULL, 'Oyéndolo David, envió a Joab con todo el ejército de los hombres valientes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 19, 9, NULL, 'Y los hijos de Amón salieron, y ordenaron la batalla a la entrada de la ciudad; y los reyes que habían venido estaban aparte en el campo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 19, 10, NULL, 'Y viendo Joab que el ataque contra él había sido dispuesto por el frente y por la retaguardia, escogió de los más aventajados que había en Israel, y con ellos ordenó su ejército contra los sirios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 19, 11, NULL, 'Puso luego el resto de la gente en mano de Abisai su hermano, y los ordenó en batalla contra los amonitas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 19, 12, NULL, 'Y dijo: Si los sirios fueren más fuertes que yo, tú me ayudarás; y si los amonitas fueren más fuertes que tú, yo te ayudaré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 19, 13, NULL, 'Esfuérzate, y esforcémonos por nuestro pueblo, y por las ciudades de nuestro Dios; y haga Jehová lo que bien le parezca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 19, 14, NULL, 'Entonces se acercó Joab y el pueblo que tenía consigo, para pelear contra los sirios; mas ellos huyeron delante de él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 19, 15, NULL, 'Y los hijos de Amón, viendo que los sirios habían huido, huyeron también ellos delante de Abisai su hermano, y entraron en la ciudad. Entonces Joab volvió a Jerusalén.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 19, 16, NULL, 'Viendo los sirios que habían caído delante de Israel, enviaron embajadores, y trajeron a los sirios que estaban al otro lado del Éufrates, cuyo capitán era Sofac, general del ejército de Hadad-ezer.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 19, 17, NULL, 'Luego que fue dado aviso a David, reunió a todo Israel, y cruzando el Jordán vino a ellos, y ordenó batalla contra ellos. Y cuando David hubo ordenado su tropa contra ellos, pelearon contra él los sirios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 19, 18, NULL, 'Mas el pueblo sirio huyó delante de Israel; y mató David de los sirios a siete mil hombres de los carros, y cuarenta mil hombres de a pie; asimismo mató a Sofac general del ejército.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 19, 19, NULL, 'Y viendo los siervos de Hadad-ezer que habían caído delante de Israel, concertaron paz con David, y fueron sus siervos; y el pueblo sirio nunca más quiso ayudar a los hijos de Amón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 20, 1, 'David captura a Rabá', 'Aconteció a la vuelta del año, en el tiempo que suelen los reyes salir a la guerra, que Joab sacó las fuerzas del ejército, y destruyó la tierra de los hijos de Amón, y vino y sitió a Rabá. Mas David estaba en Jerusalén; y Joab batió a Rabá, y la destruyó.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 20, 2, NULL, 'Y tomó David la corona de encima de la cabeza del rey de Rabá, y la halló de peso de un talento de oro, y había en ella piedras preciosas; y fue puesta sobre la cabeza de David. Además de esto sacó de la ciudad muy grande botín.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 20, 3, NULL, 'Sacó también al pueblo que estaba en ella, y lo puso a trabajar con sierras, con trillos de hierro y con hachas. Lo mismo hizo David a todas las ciudades de los hijos de Amón. Y volvió David con todo el pueblo a Jerusalén.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 20, 4, 'Los hombres de David matan a los gigantes', 'Después de esto aconteció que se levantó guerra en Gezer contra los filisteos; y Sibecai husatita mató a Sipai, de los descendientes de los gigantes; y fueron humillados.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 20, 5, NULL, 'Volvió a levantarse guerra contra los filisteos; y Elhanán hijo de Jair mató a Lahmi, hermano de Goliat geteo, el asta de cuya lanza era como un rodillo de telar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 20, 6, NULL, 'Y volvió a haber guerra en Gat, donde había un hombre de grande estatura, el cual tenía seis dedos en pies y manos, veinticuatro por todos; y era descendiente de los gigantes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 20, 7, NULL, 'Este hombre injurió a Israel, pero lo mató Jonatán, hijo de Simea hermano de David.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 20, 8, NULL, 'Estos eran descendientes de los gigantes en Gat, los cuales cayeron por mano de David y de sus siervos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 21, 1, 'David censa al pueblo', 'Pero Satanás se levantó contra Israel, e incitó a David a que hiciese censo de Israel.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 21, 2, NULL, 'Y dijo David a Joab y a los príncipes del pueblo: Id, haced censo de Israel desde Beerseba hasta Dan, e informadme sobre el número de ellos para que yo lo sepa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 21, 3, NULL, 'Y dijo Joab: Añada Jehová a su pueblo cien veces más, rey señor mío; ¿no son todos estos siervos de mi señor? ¿Para qué procura mi señor esto, que será para pecado a Israel?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 21, 4, NULL, 'Mas la orden del rey pudo más que Joab. Salió, por tanto, Joab, y recorrió todo Israel, y volvió a Jerusalén y dio la cuenta del número del pueblo a David.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 21, 5, NULL, 'Y había en todo Israel un millón cien mil que sacaban espada, y de Judá cuatrocientos setenta mil hombres que sacaban espada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 21, 6, NULL, 'Entre estos no fueron contados los levitas, ni los hijos de Benjamín, porque la orden del rey era abominable a Joab.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 21, 7, NULL, 'Asimismo esto desagradó a Dios, e hirió a Israel.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 21, 8, NULL, 'Entonces dijo David a Dios: He pecado gravemente al hacer esto; te ruego que quites la iniquidad de tu siervo, porque he hecho muy locamente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 21, 9, NULL, 'Y habló Jehová a Gad, vidente de David, diciendo:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 21, 10, NULL, 'Ve y habla a David, y dile: Así ha dicho Jehová: Tres cosas te propongo; escoge de ellas una que yo haga contigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 21, 11, NULL, 'Y viniendo Gad a David, le dijo: Así ha dicho Jehová:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 21, 12, NULL, 'Escoge para ti: o tres años de hambre, o por tres meses ser derrotado delante de tus enemigos con la espada de tus adversarios, o por tres días la espada de Jehová, esto es, la peste en la tierra, y que el ángel de Jehová haga destrucción en todos los términos de Israel. Mira, pues, qué responderé al que me ha enviado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 21, 13, NULL, 'Entonces David dijo a Gad: Estoy en grande angustia. Ruego que yo caiga en la mano de Jehová, porque sus misericordias son muchas en extremo; pero que no caiga en manos de hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 21, 14, NULL, 'Así Jehová envió una peste en Israel, y murieron de Israel setenta mil hombres.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 21, 15, NULL, 'Y envió Jehová el ángel a Jerusalén para destruirla; pero cuando él estaba destruyendo, miró Jehová y se arrepintió de aquel mal, y dijo al ángel que destruía: Basta ya; detén tu mano. El ángel de Jehová estaba junto a la era de Ornán jebuseo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 21, 16, NULL, 'Y alzando David sus ojos, vio al ángel de Jehová, que estaba entre el cielo y la tierra, con una espada desnuda en su mano, extendida contra Jerusalén. Entonces David y los ancianos se postraron sobre sus rostros, cubiertos de cilicio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 21, 17, NULL, 'Y dijo David a Dios: ¿No soy yo el que hizo contar el pueblo? Yo mismo soy el que pequé, y ciertamente he hecho mal; pero estas ovejas, ¿qué han hecho? Jehová Dios mío, sea ahora tu mano contra mí, y contra la casa de mi padre, y no venga la peste sobre tu pueblo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 21, 18, NULL, 'Y el ángel de Jehová ordenó a Gad que dijese a David que subiese y construyese un altar a Jehová en la era de Ornán jebuseo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 21, 19, NULL, 'Entonces David subió, conforme a la palabra que Gad le había dicho en nombre de Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 21, 20, NULL, 'Y volviéndose Ornán, vio al ángel, por lo que se escondieron cuatro hijos suyos que con él estaban. Y Ornán trillaba el trigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 21, 21, NULL, 'Y viniendo David a Ornán, miró Ornán, y vio a David; y saliendo de la era, se postró en tierra ante David.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 21, 22, NULL, 'Entonces dijo David a Ornán: Dame este lugar de la era, para que edifique un altar a Jehová; dámelo por su cabal precio, para que cese la mortandad en el pueblo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 21, 23, NULL, 'Y Ornán respondió a David: Tómala para ti, y haga mi señor el rey lo que bien le parezca; y aun los bueyes daré para el holocausto, y los trillos para leña, y trigo para la ofrenda; yo lo doy todo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 21, 24, NULL, 'Entonces el rey David dijo a Ornán: No, sino que efectivamente la compraré por su justo precio; porque no tomaré para Jehová lo que es tuyo, ni sacrificaré holocausto que nada me cueste.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 21, 25, NULL, 'Y dio David a Ornán por aquel lugar el peso de seiscientos siclos de oro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 21, 26, NULL, 'Y edificó allí David un altar a Jehová, en el que ofreció holocaustos y ofrendas de paz, e invocó a Jehová, quien le respondió por fuego desde los cielos en el altar del holocausto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 21, 27, NULL, 'Entonces Jehová habló al ángel, y este volvió su espada a la vaina.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 21, 28, 'El lugar para el templo', 'Viendo David que Jehová le había oído en la era de Ornán jebuseo, ofreció sacrificios allí.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 21, 29, NULL, 'Y el tabernáculo de Jehová que Moisés había hecho en el desierto, y el altar del holocausto, estaban entonces en el lugar alto de Gabaón;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 21, 30, NULL, 'pero David no pudo ir allá a consultar a Dios, porque estaba atemorizado a causa de la espada del ángel de Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 22, 1, NULL, 'Y dijo David: Aquí estará la casa de Jehová Dios, y aquí el altar del holocausto para Israel.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 22, 2, 'Preparativos para el templo', 'Después mandó David que se reuniese a los extranjeros que había en la tierra de Israel, y señaló de entre ellos canteros que labrasen piedras para edificar la casa de Dios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 22, 3, NULL, 'Asimismo preparó David mucho hierro para la clavazón de las puertas, y para las junturas; y mucho bronce sin peso, y madera de cedro sin cuenta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 22, 4, NULL, 'Porque los sidonios y tirios habían traído a David abundancia de madera de cedro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 22, 5, NULL, 'Y dijo David: Salomón mi hijo es muchacho y de tierna edad, y la casa que se ha de edificar a Jehová ha de ser magnífica por excelencia, para renombre y honra en todas las tierras; ahora, pues, yo le prepararé lo necesario. Y David antes de su muerte hizo preparativos en gran abundancia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 22, 6, NULL, 'Llamó entonces David a Salomón su hijo, y le mandó que edificase casa a Jehová Dios de Israel.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 22, 7, NULL, 'Y dijo David a Salomón: Hijo mío, en mi corazón tuve el edificar templo al nombre de Jehová mi Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 22, 8, NULL, 'Mas vino a mí palabra de Jehová, diciendo: Tú has derramado mucha sangre, y has hecho grandes guerras; no edificarás casa a mi nombre, porque has derramado mucha sangre en la tierra delante de mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 22, 9, NULL, 'He aquí te nacerá un hijo, el cual será varón de paz, porque yo le daré paz de todos sus enemigos en derredor; por tanto, su nombre será Salomón, y yo daré paz y reposo sobre Israel en sus días.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 22, 10, NULL, 'Él edificará casa a mi nombre, y él me será a mí por hijo, y yo le seré por padre; y afirmaré el trono de su reino sobre Israel para siempre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 22, 11, NULL, 'Ahora pues, hijo mío, Jehová esté contigo, y seas prosperado, y edifiques casa a Jehová tu Dios, como él ha dicho de ti.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 22, 12, NULL, 'Y Jehová te dé entendimiento y prudencia, para que cuando gobiernes a Israel, guardes la ley de Jehová tu Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 22, 13, NULL, 'Entonces serás prosperado, si cuidares de poner por obra los estatutos y decretos que Jehová mandó a Moisés para Israel. Esfuérzate, pues, y cobra ánimo; no temas, ni desmayes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 22, 14, NULL, 'He aquí, yo con grandes esfuerzos he preparado para la casa de Jehová cien mil talentos de oro, y un millón de talentos de plata, y bronce y hierro sin medida, porque es mucho. Asimismo he preparado madera y piedra, a lo cual tú añadirás.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 22, 15, NULL, 'Tú tienes contigo muchos obreros, canteros, albañiles, carpinteros, y todo hombre experto en toda obra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 22, 16, NULL, 'Del oro, de la plata, del bronce y del hierro, no hay cuenta. Levántate, y manos a la obra; y Jehová esté contigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 22, 17, NULL, 'Asimismo mandó David a todos los principales de Israel que ayudasen a Salomón su hijo, diciendo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 22, 18, NULL, '¿No está con vosotros Jehová vuestro Dios, el cual os ha dado paz por todas partes? Porque él ha entregado en mi mano a los moradores de la tierra, y la tierra ha sido sometida delante de Jehová, y delante de su pueblo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 22, 19, NULL, 'Poned, pues, ahora vuestros corazones y vuestros ánimos en buscar a Jehová vuestro Dios; y levantaos, y edificad el santuario de Jehová Dios, para traer el arca del pacto de Jehová, y los utensilios consagrados a Dios, a la casa edificada al nombre de Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 23, 1, 'Distribución y deberes de los levitas', 'Siendo, pues, David ya viejo y lleno de días, hizo a Salomón su hijo rey sobre Israel.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 23, 2, NULL, 'Y juntando a todos los principales de Israel, y a los sacerdotes y levitas,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 23, 3, NULL, 'fueron contados los levitas de treinta años arriba; y fue el número de ellos por sus cabezas, contados uno por uno, treinta y ocho mil.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 23, 4, NULL, 'De estos, veinticuatro mil para dirigir la obra de la casa de Jehová, y seis mil para gobernadores y jueces.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 23, 5, NULL, 'Además, cuatro mil porteros, y cuatro mil para alabar a Jehová, dijo David, con los instrumentos que he hecho para tributar alabanzas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 23, 6, NULL, 'Y los repartió David en grupos conforme a los hijos de Leví: Gersón, Coat y Merari.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 23, 7, NULL, 'Los hijos de Gersón: Laadán y Simei.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 23, 8, NULL, 'Los hijos de Laadán, tres: Jehiel el primero, después Zetam y Joel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 23, 9, NULL, 'Los hijos de Simei, tres: Selomit, Haziel y Harán. Estos fueron los jefes de las familias de Laadán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 23, 10, NULL, 'Y los hijos de Simei: Jahat, Zina, Jeús y Bería. Estos cuatro fueron los hijos de Simei.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 23, 11, NULL, 'Jahat era el primero, y Zina el segundo; pero Jeús y Bería no tuvieron muchos hijos, por lo cual fueron contados como una familia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 23, 12, NULL, 'Los hijos de Coat: Amram, Izhar, Hebrón y Uziel, ellos cuatro.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 23, 13, NULL, 'Los hijos de Amram: Aarón y Moisés. Y Aarón fue apartado para ser dedicado a las cosas más santas, él y sus hijos para siempre, para que quemasen incienso delante de Jehová, y le ministrasen y bendijesen en su nombre, para siempre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 23, 14, NULL, 'Y los hijos de Moisés varón de Dios fueron contados en la tribu de Leví.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 23, 15, NULL, 'Los hijos de Moisés fueron Gersón y Eliezer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 23, 16, NULL, 'Hijo de Gersón fue Sebuel el jefe.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 23, 17, NULL, 'E hijo de Eliezer fue Rehabías el jefe. Y Eliezer no tuvo otros hijos; mas los hijos de Rehabías fueron muchos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 23, 18, NULL, 'Hijo de Izhar fue Selomit el jefe.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 23, 19, NULL, 'Los hijos de Hebrón: Jerías el jefe, Amarías el segundo, Jahaziel el tercero, y Jecamán el cuarto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 23, 20, NULL, 'Los hijos de Uziel: Micaía el jefe, e Isías el segundo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 23, 21, NULL, 'Los hijos de Merari: Mahli y Musi. Los hijos de Mahli: Eleazar y Cis.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 23, 22, NULL, 'Y murió Eleazar sin hijos; pero tuvo hijas, y los hijos de Cis, sus parientes, las tomaron por mujeres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 23, 23, NULL, 'Los hijos de Musi: Mahli, Edar y Jeremot, ellos tres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 23, 24, NULL, 'Estos son los hijos de Leví en las familias de sus padres, jefes de familias según el censo de ellos, contados por sus nombres, por sus cabezas, de veinte años arriba, los cuales trabajaban en el ministerio de la casa de Jehová.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 23, 25, NULL, 'Porque David dijo: Jehová Dios de Israel ha dado paz a su pueblo Israel, y él habitará en Jerusalén para siempre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 23, 26, NULL, 'Y también los levitas no tendrán que llevar más el tabernáculo y todos los utensilios para su ministerio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 23, 27, NULL, 'Así que, conforme a las postreras palabras de David, se hizo la cuenta de los hijos de Leví de veinte años arriba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 23, 28, NULL, 'Y estaban bajo las órdenes de los hijos de Aarón para ministrar en la casa de Jehová, en los atrios, en las cámaras, y en la purificación de toda cosa santificada, y en la demás obra del ministerio de la casa de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 23, 29, NULL, 'Asimismo para los panes de la proposición, para la flor de harina para el sacrificio, para las hojuelas sin levadura, para lo preparado en sartén, para lo tostado, y para toda medida y cuenta;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 23, 30, NULL, 'y para asistir cada mañana todos los días a dar gracias y tributar alabanzas a Jehová, y asimismo por la tarde;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 23, 31, NULL, 'y para ofrecer todos los holocaustos a Jehová los días de reposo, lunas nuevas y fiestas solemnes, según su número y de acuerdo con su rito, continuamente delante de Jehová;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 23, 32, NULL, 'y para que tuviesen la guarda del tabernáculo de reunión, y la guarda del santuario, bajo las órdenes de los hijos de Aarón sus hermanos, en el ministerio de la casa de Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 24, 1, NULL, 'También los hijos de Aarón fueron distribuidos en grupos. Los hijos de Aarón: Nadab, Abiú, Eleazar e Itamar.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 24, 2, NULL, 'Mas como Nadab y Abiú murieron antes que su padre, y no tuvieron hijos, Eleazar e Itamar ejercieron el sacerdocio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 24, 3, NULL, 'Y David, con Sadoc de los hijos de Eleazar, y Ahimelec de los hijos de Itamar, los repartió por sus turnos en el ministerio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 24, 4, NULL, 'Y de los hijos de Eleazar había más varones principales que de los hijos de Itamar; y los repartieron así: De los hijos de Eleazar, dieciséis cabezas de casas paternas; y de los hijos de Itamar, por sus casas paternas, ocho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 24, 5, NULL, 'Los repartieron, pues, por suerte los unos con los otros; porque de los hijos de Eleazar y de los hijos de Itamar hubo príncipes del santuario, y príncipes de la casa de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 24, 6, NULL, 'Y el escriba Semaías hijo de Natanael, de los levitas, escribió sus nombres en presencia del rey y de los príncipes, y delante de Sadoc el sacerdote, de Ahimelec hijo de Abiatar y de los jefes de las casas paternas de los sacerdotes y levitas, designando por suerte una casa paterna para Eleazar, y otra para Itamar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 24, 7, NULL, 'La primera suerte tocó a Joiarib, la segunda a Jedaías,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 24, 8, NULL, 'la tercera a Harim, la cuarta a Seorim,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 24, 9, NULL, 'la quinta a Malquías, la sexta a Mijamín,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 24, 10, NULL, 'la séptima a Cos, la octava a Abías,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 24, 11, NULL, 'la novena a Jesúa, la décima a Secanías,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 24, 12, NULL, 'la undécima a Eliasib, la duodécima a Jaquim,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 24, 13, NULL, 'la decimatercera a Hupa, la decimacuarta a Jesebeab,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 24, 14, NULL, 'la decimaquinta a Bilga, la decimasexta a Imer,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 24, 15, NULL, 'la decimaséptima a Hezir, la decimaoctava a Afses,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 24, 16, NULL, 'la decimanovena a Petaías, la vigésima a Hezequiel,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 24, 17, NULL, 'la vigesimaprimera a Jaquín, la vigesimasegunda a Gamul,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 24, 18, NULL, 'la vigesimatercera a Delaía, la vigesimacuarta a Maazías.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 24, 19, NULL, 'Estos fueron distribuidos para su ministerio, para que entrasen en la casa de Jehová, según les fue ordenado por Aarón su padre, de la manera que le había mandado Jehová el Dios de Israel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 24, 20, NULL, 'Y de los hijos de Leví que quedaron: Subael, de los hijos de Amram; y de los hijos de Subael, Jehedías.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 24, 21, NULL, 'Y de los hijos de Rehabías, Isías el jefe.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 24, 22, NULL, 'De los izharitas, Selomot; e hijo de Selomot, Jahat.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 24, 23, NULL, 'De los hijos de Hebrón: Jerías el jefe, el segundo Amarías, el tercero Jahaziel, el cuarto Jecamán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 24, 24, NULL, 'Hijo de Uziel, Micaía; e hijo de Micaía, Samir.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 24, 25, NULL, 'Hermano de Micaía, Isías; e hijo de Isías, Zacarías.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 24, 26, NULL, 'Los hijos de Merari: Mahli y Musi; hijo de Jaazías, Beno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 24, 27, NULL, 'Los hijos de Merari por Jaazías: Beno, Soham, Zacur e Ibri.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 24, 28, NULL, 'Y de Mahli, Eleazar, quien no tuvo hijos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 24, 29, NULL, 'Hijo de Cis, Jerameel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 24, 30, NULL, 'Los hijos de Musi: Mahli, Edar y Jerimot. Estos fueron los hijos de los levitas conforme a sus casas paternas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 24, 31, NULL, 'Estos también echaron suertes, como sus hermanos los hijos de Aarón, delante del rey David, y de Sadoc y de Ahimelec, y de los jefes de las casas paternas de los sacerdotes y levitas; el principal de los padres igualmente que el menor de sus hermanos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 25, 1, 'Distribución de músicos y cantores', 'Asimismo David y los jefes del ejército apartaron para el ministerio a los hijos de Asaf, de Hemán y de Jedutún, para que profetizasen con arpas, salterios y címbalos; y el número de ellos, hombres idóneos para la obra de su ministerio, fue:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 25, 2, NULL, 'De los hijos de Asaf: Zacur, José, Netanías y Asarela, hijos de Asaf, bajo la dirección de Asaf, el cual profetizaba bajo las órdenes del rey.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 25, 3, NULL, 'De los hijos de Jedutún: Gedalías, Zeri, Jesaías, Hasabías, Matatías y Simei; seis, bajo la dirección de su padre Jedutún, el cual profetizaba con arpa, para aclamar y alabar a Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 25, 4, NULL, 'De los hijos de Hemán: Buquías, Matanías, Uziel, Sebuel, Jeremot, Hananías, Hanani, Eliata, Gidalti, Romanti-ezer, Josbecasa, Maloti, Hotir y Mahaziot.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 25, 5, NULL, 'Todos estos fueron hijos de Hemán, vidente del rey en las cosas de Dios, para exaltar su poder; y Dios dio a Hemán catorce hijos y tres hijas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 25, 6, NULL, 'Y todos estos estaban bajo la dirección de su padre en la música, en la casa de Jehová, con címbalos, salterios y arpas, para el ministerio del templo de Dios. Asaf, Jedutún y Hemán estaban por disposición del rey.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 25, 7, NULL, 'Y el número de ellos, con sus hermanos, instruidos en el canto para Jehová, todos los aptos, fue doscientos ochenta y ocho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 25, 8, NULL, 'Y echaron suertes para servir por turnos, entrando el pequeño con el grande, lo mismo el maestro que el discípulo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 25, 9, NULL, 'La primera suerte salió por Asaf, para José; la segunda para Gedalías, quien con sus hermanos e hijos fueron doce;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 25, 10, NULL, 'la tercera para Zacur, con sus hijos y sus hermanos, doce;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 25, 11, NULL, 'la cuarta para Izri, con sus hijos y sus hermanos, doce;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 25, 12, NULL, 'la quinta para Netanías, con sus hijos y sus hermanos, doce;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 25, 13, NULL, 'la sexta para Buquías, con sus hijos y sus hermanos, doce;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 25, 14, NULL, 'la séptima para Jesarela, con sus hijos y sus hermanos, doce;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 25, 15, NULL, 'la octava para Jesahías, con sus hijos y sus hermanos, doce;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 25, 16, NULL, 'la novena para Matanías, con sus hijos y sus hermanos, doce;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 25, 17, NULL, 'la décima para Simei, con sus hijos y sus hermanos, doce;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 25, 18, NULL, 'la undécima para Azareel, con sus hijos y sus hermanos, doce;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 25, 19, NULL, 'la duodécima para Hasabías, con sus hijos y sus hermanos, doce;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 25, 20, NULL, 'la decimatercera para Subael, con sus hijos y sus hermanos, doce;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 25, 21, NULL, 'la decimacuarta para Matatías, con sus hijos y sus hermanos, doce;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 25, 22, NULL, 'la decimaquinta para Jeremot, con sus hijos y sus hermanos, doce;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 25, 23, NULL, 'la decimasexta para Hananías, con sus hijos y sus hermanos, doce;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 25, 24, NULL, 'la decimaséptima para Josbecasa, con sus hijos y sus hermanos, doce;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 25, 25, NULL, 'la decimaoctava para Hanani, con sus hijos y sus hermanos, doce;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 25, 26, NULL, 'la decimanovena para Maloti, con sus hijos y sus hermanos, doce;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 25, 27, NULL, 'la vigésima para Eliata, con sus hijos y sus hermanos, doce;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 25, 28, NULL, 'la vigesimaprimera para Hotir, con sus hijos y sus hermanos, doce;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 25, 29, NULL, 'la vigesimasegunda para Gidalti, con sus hijos y sus hermanos, doce;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 25, 30, NULL, 'la vigesimatercera para Mahaziot, con sus hijos y sus hermanos, doce;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 25, 31, NULL, 'la vigesimacuarta para Romanti-ezer, con sus hijos y sus hermanos, doce.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 26, 1, 'Porteros y oficiales', 'También fueron distribuidos los porteros: de los coreítas, Meselemías hijo de Coré, de los hijos de Asaf.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 26, 2, NULL, 'Los hijos de Meselemías: Zacarías el primogénito, Jediael el segundo, Zebadías el tercero, Jatniel el cuarto,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 26, 3, NULL, 'Elam el quinto, Johanán el sexto, Elioenai el séptimo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 26, 4, NULL, 'Los hijos de Obed-edom: Semaías el primogénito, Jozabad el segundo, Joa el tercero, el cuarto Sacar, el quinto Natanael,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 26, 5, NULL, 'el sexto Amiel, el séptimo Isacar, el octavo Peultai; porque Dios había bendecido a Obed-edom.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 26, 6, NULL, 'También de Semaías su hijo nacieron hijos que fueron señores sobre la casa de sus padres; porque eran varones valerosos y esforzados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 26, 7, NULL, 'Los hijos de Semaías: Otni, Rafael, Obed, Elzabad, y sus hermanos, hombres esforzados; asimismo Eliú y Samaquías.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 26, 8, NULL, 'Todos estos de los hijos de Obed-edom; ellos con sus hijos y sus hermanos, hombres robustos y fuertes para el servicio; sesenta y dos, de Obed-edom.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 26, 9, NULL, 'Y los hijos de Meselemías y sus hermanos, dieciocho hombres valientes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 26, 10, NULL, 'De Hosa, de los hijos de Merari: Simri el jefe (aunque no era el primogénito, mas su padre lo puso por jefe),', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 26, 11, NULL, 'el segundo Hilcías, el tercero Tebalías, el cuarto Zacarías; todos los hijos de Hosa y sus hermanos fueron trece.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 26, 12, NULL, 'Entre estos se hizo la distribución de los porteros, alternando los principales de los varones en la guardia con sus hermanos, para servir en la casa de Jehová.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 26, 13, NULL, 'Echaron suertes, el pequeño con el grande, según sus casas paternas, para cada puerta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 26, 14, NULL, 'Y la suerte para la del oriente cayó a Selemías. Y metieron en las suertes a Zacarías su hijo, consejero entendido; y salió la suerte suya para la del norte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 26, 15, NULL, 'Y para Obed-edom la puerta del sur, y a sus hijos la casa de provisiones del templo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 26, 16, NULL, 'Para Supim y Hosa, la del occidente, la puerta de Salequet, en el camino de la subida, correspondiéndose guardia con guardia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 26, 17, NULL, 'Al oriente seis levitas, al norte cuatro de día; al sur cuatro de día; y a la casa de provisiones de dos en dos.', 0, 'spa', 'RVR1960', NULL);\n"
;

  public static final String SQL_PARTE_4 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', '1 Cr', 26, 18, NULL, 'En la cámara de los utensilios al occidente, cuatro al camino, y dos en la cámara.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 26, 19, NULL, 'Estas son las distribuciones de los porteros, hijos de los coreítas y de los hijos de Merari.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 26, 20, NULL, 'Y de los levitas, Ahías tenía cargo de los tesoros de la casa de Dios, y de los tesoros de las cosas santificadas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 26, 21, NULL, 'Cuanto a los hijos de Laadán hijo de Gersón: de Laadán, los jefes de las casas paternas de Laadán gersonita fueron los jehielitas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 26, 22, NULL, 'Los hijos de Jehieli, Zetam y Joel su hermano, tuvieron cargo de los tesoros de la casa de Jehová.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 26, 23, NULL, 'De entre los amramitas, de los izharitas, de los hebronitas y de los uzielitas,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 26, 24, NULL, 'Sebuel hijo de Gersón, hijo de Moisés, era jefe sobre los tesoros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 26, 25, NULL, 'En cuanto a su hermano Eliezer, hijo de este era Rehabías, hijo de este Jesaías, hijo de este Joram, hijo de este Zicri, del que fue hijo Selomit.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 26, 26, NULL, 'Este Selomit y sus hermanos tenían a su cargo todos los tesoros de todas las cosas santificadas que había consagrado el rey David, y los jefes de las casas paternas, los capitanes de millares y de centenas, y los jefes del ejército;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 26, 27, NULL, 'de lo que habían consagrado de las guerras y de los botines, para reparar la casa de Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 26, 28, NULL, 'Asimismo todas las cosas que había consagrado el vidente Samuel, y Saúl hijo de Cis, Abner hijo de Ner y Joab hijo de Sarvia, y todo lo que cualquiera consagraba, estaba a cargo de Selomit y de sus hermanos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 26, 29, NULL, 'De los izharitas, Quenanías y sus hijos eran gobernadores y jueces sobre Israel en asuntos exteriores.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 26, 30, NULL, 'De los hebronitas, Hasabías y sus hermanos, hombres de vigor, mil setecientos, gobernaban a Israel al otro lado del Jordán, al occidente, en toda la obra de Jehová, y en el servicio del rey.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 26, 31, NULL, 'De los hebronitas, Jerías era el jefe de los hebronitas repartidos en sus linajes por sus familias. En el año cuarenta del reinado de David se registraron, y fueron hallados entre ellos hombres fuertes y vigorosos en Jazer de Galaad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 26, 32, NULL, 'Y sus hermanos, hombres valientes, eran dos mil setecientos, jefes de familias, los cuales el rey David constituyó sobre los rubenitas, los gaditas y la media tribu de Manasés, para todas las cosas de Dios y los negocios del rey.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 27, 1, 'Otros oficiales de David', 'Estos son los principales de los hijos de Israel, jefes de familias, jefes de millares y de centenas, y oficiales que servían al rey en todos los negocios de las divisiones que entraban y salían cada mes durante todo el año, siendo cada división de veinticuatro mil.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 27, 2, NULL, 'Sobre la primera división del primer mes estaba Jasobeam hijo de Zabdiel; y había en su división veinticuatro mil.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 27, 3, NULL, 'De los hijos de Fares, él fue jefe de todos los capitanes de las compañías del primer mes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 27, 4, NULL, 'Sobre la división del segundo mes estaba Dodai ahohíta; y Miclot era jefe en su división, en la que también había veinticuatro mil.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 27, 5, NULL, 'El jefe de la tercera división para el tercer mes era Benaía, hijo del sumo sacerdote Joiada; y en su división había veinticuatro mil.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 27, 6, NULL, 'Este Benaía era valiente entre los treinta y sobre los treinta; y en su división estaba Amisabad su hijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 27, 7, NULL, 'El cuarto jefe para el cuarto mes era Asael hermano de Joab, y después de él Zebadías su hijo; y en su división había veinticuatro mil.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 27, 8, NULL, 'El quinto jefe para el quinto mes era Samhut izraíta; y en su división había veinticuatro mil.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 27, 9, NULL, 'El sexto para el sexto mes era Ira hijo de Iques, de Tecoa; y en su división veinticuatro mil.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 27, 10, NULL, 'El séptimo para el séptimo mes era Heles pelonita, de los hijos de Efraín; y en su división veinticuatro mil.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 27, 11, NULL, 'El octavo para el octavo mes era Sibecai husatita, de los zeraítas; y en su división veinticuatro mil.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 27, 12, NULL, 'El noveno para el noveno mes era Abiezer anatotita, de los benjamitas; y en su división veinticuatro mil.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 27, 13, NULL, 'El décimo para el décimo mes era Maharai netofatita, de los zeraítas; y en su división veinticuatro mil.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 27, 14, NULL, 'El undécimo para el undécimo mes era Benaía piratonita, de los hijos de Efraín; y en su división veinticuatro mil.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 27, 15, NULL, 'El duodécimo para el duodécimo mes era Heldai netofatita, de Otoniel; y en su división veinticuatro mil.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 27, 16, NULL, 'Asimismo sobre las tribus de Israel: el jefe de los rubenitas era Eliezer hijo de Zicri; de los simeonitas, Sefatías, hijo de Maaca.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 27, 17, NULL, 'De los levitas, Hasabías hijo de Kemuel; de los de Aarón, Sadoc.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 27, 18, NULL, 'De Judá, Eliú, uno de los hermanos de David; de los de Isacar, Omri hijo de Micael.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 27, 19, NULL, 'De los de Zabulón, Ismaías hijo de Abdías; de los de Neftalí, Jerimot hijo de Azriel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 27, 20, NULL, 'De los hijos de Efraín, Oseas hijo de Azazías; de la media tribu de Manasés, Joel hijo de Pedaías.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 27, 21, NULL, 'De la otra media tribu de Manasés, en Galaad, Iddo hijo de Zacarías; de los de Benjamín, Jaasiel hijo de Abner.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 27, 22, NULL, 'Y de Dan, Azareel hijo de Jeroham. Estos fueron los jefes de las tribus de Israel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 27, 23, NULL, 'Y no tomó David el número de los que eran de veinte años abajo, por cuanto Jehová había dicho que él multiplicaría a Israel como las estrellas del cielo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 27, 24, NULL, 'Joab hijo de Sarvia había comenzado a contar; pero no acabó, pues por esto vino el castigo sobre Israel, y así el número no fue puesto en el registro de las crónicas del rey David.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 27, 25, NULL, 'Azmavet hijo de Adiel tenía a su cargo los tesoros del rey; y Jonatán hijo de Uzías los tesoros de los campos, de las ciudades, de las aldeas y de las torres.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 27, 26, NULL, 'Y de los que trabajaban en la labranza de las tierras, Ezri hijo de Quelub.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 27, 27, NULL, 'De las viñas, Simei ramatita; y del fruto de las viñas para las bodegas, Zabdi sifmita.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 27, 28, NULL, 'De los olivares e higuerales de la Sefela, Baal-hanán gederita; y de los almacenes del aceite, Joás.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 27, 29, NULL, 'Del ganado que pastaba en Sarón, Sitrai saronita; y del ganado que estaba en los valles, Safat hijo de Adlai.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 27, 30, NULL, 'De los camellos, Obil ismaelita; de las asnas, Jehedías meronotita;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 27, 31, NULL, 'y de las ovejas, Jaziz agareno. Todos estos eran administradores de la hacienda del rey David.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 27, 32, NULL, 'Y Jonatán tío de David era consejero, varón prudente y escriba; y Jehiel hijo de Hacmoni estaba con los hijos del rey.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 27, 33, NULL, 'También Ahitofel era consejero del rey, y Husai arquita amigo del rey.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 27, 34, NULL, 'Después de Ahitofel estaba Joiada hijo de Benaía, y Abiatar. Y Joab era el general del ejército del rey.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 28, 1, 'Salomón sucede a David', 'Reunió David en Jerusalén a todos los principales de Israel, los jefes de las tribus, los jefes de las divisiones que servían al rey, los jefes de millares y de centenas, los administradores de toda la hacienda y posesión del rey y de sus hijos, y los oficiales y los más poderosos y valientes de sus hombres.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 28, 2, NULL, 'Y levantándose el rey David, puesto en pie dijo: Oídme, hermanos míos, y pueblo mío. Yo tenía el propósito de edificar una casa en la cual reposara el arca del pacto de Jehová, y para el estrado de los pies de nuestro Dios; y había ya preparado todo para edificar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 28, 3, NULL, 'Mas Dios me dijo: Tú no edificarás casa a mi nombre, porque eres hombre de guerra, y has derramado mucha sangre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 28, 4, NULL, 'Pero Jehová el Dios de Israel me eligió de toda la casa de mi padre, para que perpetuamente fuese rey sobre Israel; porque a Judá escogió por caudillo, y de la casa de Judá a la familia de mi padre; y de entre los hijos de mi padre se agradó de mí para ponerme por rey sobre todo Israel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 28, 5, NULL, 'Y de entre todos mis hijos (porque Jehová me ha dado muchos hijos), eligió a mi hijo Salomón para que se siente en el trono del reino de Jehová sobre Israel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 28, 6, NULL, 'Y me ha dicho: Salomón tu hijo, él edificará mi casa y mis atrios; porque a este he escogido por hijo, y yo le seré a él por padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 28, 7, NULL, 'Asimismo yo confirmaré su reino para siempre, si él se esforzare a poner por obra mis mandamientos y mis decretos, como en este día.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 28, 8, NULL, 'Ahora, pues, ante los ojos de todo Israel, congregación de Jehová, y en oídos de nuestro Dios, guardad e inquirid todos los preceptos de Jehová vuestro Dios, para que poseáis la buena tierra, y la dejéis en herencia a vuestros hijos después de vosotros perpetuamente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 28, 9, NULL, 'Y tú, Salomón, hijo mío, reconoce al Dios de tu padre, y sírvele con corazón perfecto y con ánimo voluntario; porque Jehová escudriña los corazones de todos, y entiende todo intento de los pensamientos. Si tú le buscares, lo hallarás; mas si lo dejares, él te desechará para siempre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 28, 10, NULL, 'Mira, pues, ahora, que Jehová te ha elegido para que edifiques casa para el santuario; esfuérzate, y hazla.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 28, 11, NULL, 'Y David dio a Salomón su hijo el plano del pórtico del templo y sus casas, sus tesorerías, sus aposentos, sus cámaras y la casa del propiciatorio.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 28, 12, NULL, 'Asimismo el plano de todas las cosas que tenía en mente para los atrios de la casa de Jehová, para todas las cámaras alrededor, para las tesorerías de la casa de Dios, y para las tesorerías de las cosas santificadas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 28, 13, NULL, 'También para los grupos de los sacerdotes y de los levitas, para toda la obra del ministerio de la casa de Jehová, y para todos los utensilios del ministerio de la casa de Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 28, 14, NULL, 'Y dio oro en peso para las cosas de oro, para todos los utensilios de cada servicio, y plata en peso para todas las cosas de plata, para todos los utensilios de cada servicio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 28, 15, NULL, 'Oro en peso para los candeleros de oro, y para sus lámparas; en peso el oro para cada candelero y sus lámparas; y para los candeleros de plata, plata en peso para cada candelero y sus lámparas, conforme al servicio de cada candelero.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 28, 16, NULL, 'Asimismo dio oro en peso para las mesas de la proposición, para cada mesa; del mismo modo plata para las mesas de plata.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 28, 17, NULL, 'También oro puro para los garfios, para los lebrillos, para las copas y para las tazas de oro; para cada taza por peso; y para las tazas de plata, por peso para cada taza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 28, 18, NULL, 'Además, oro puro en peso para el altar del incienso, y para el carro de los querubines de oro, que con las alas extendidas cubrían el arca del pacto de Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 28, 19, NULL, 'Todas estas cosas, dijo David, me fueron trazadas por la mano de Jehová, que me hizo entender todas las obras del diseño.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 28, 20, NULL, 'Dijo además David a Salomón su hijo: Anímate y esfuérzate, y manos a la obra; no temas, ni desmayes, porque Jehová Dios, mi Dios, estará contigo; él no te dejará ni te desamparará, hasta que acabes toda la obra para el servicio de la casa de Jehová.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 28, 21, NULL, 'He aquí los grupos de los sacerdotes y de los levitas, para todo el ministerio de la casa de Dios, estarán contigo en toda la obra; asimismo todos los voluntarios e inteligentes para toda forma de servicio, y los príncipes, y todo el pueblo para ejecutar todas tus órdenes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 29, 1, NULL, 'Después dijo el rey David a toda la asamblea: Solamente a Salomón mi hijo ha elegido Dios; él es joven y tierno de edad, y la obra grande; porque la casa no es para hombre, sino para Jehová Dios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 29, 2, NULL, 'Yo con todas mis fuerzas he preparado para la casa de mi Dios, oro para las cosas de oro, plata para las cosas de plata, bronce para las de bronce, hierro para las de hierro, y madera para las de madera; y piedras de ónice, piedras preciosas, piedras negras, piedras de diversos colores, y toda clase de piedras preciosas, y piedras de mármol en abundancia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 29, 3, NULL, 'Además de esto, por cuanto tengo mi afecto en la casa de mi Dios, yo guardo en mi tesoro particular oro y plata que, además de todas las cosas que he preparado para la casa del santuario, he dado para la casa de mi Dios:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 29, 4, NULL, 'tres mil talentos de oro, de oro de Ofir, y siete mil talentos de plata refinada para cubrir las paredes de las casas;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 29, 5, NULL, 'oro, pues, para las cosas de oro, y plata para las cosas de plata, y para toda la obra de las manos de los artífices. ¿Y quién quiere hacer hoy ofrenda voluntaria a Jehová?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 29, 6, NULL, 'Entonces los jefes de familia, y los príncipes de las tribus de Israel, jefes de millares y de centenas, con los administradores de la hacienda del rey, ofrecieron voluntariamente.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 29, 7, NULL, 'Y dieron para el servicio de la casa de Dios cinco mil talentos y diez mil dracmas de oro, diez mil talentos de plata, dieciocho mil talentos de bronce, y cinco mil talentos de hierro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 29, 8, NULL, 'Y todo el que tenía piedras preciosas las dio para el tesoro de la casa de Jehová, en mano de Jehiel gersonita.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 29, 9, NULL, 'Y se alegró el pueblo por haber contribuido voluntariamente; porque de todo corazón ofrecieron a Jehová voluntariamente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 29, 10, NULL, 'Asimismo se alegró mucho el rey David, y bendijo a Jehová delante de toda la congregación; y dijo David: Bendito seas tú, oh Jehová, Dios de Israel nuestro padre, desde el siglo y hasta el siglo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 29, 11, NULL, 'Tuya es, oh Jehová, la magnificencia y el poder, la gloria, la victoria y el honor; porque todas las cosas que están en los cielos y en la tierra son tuyas. Tuyo, oh Jehová, es el reino, y tú eres excelso sobre todos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 29, 12, NULL, 'Las riquezas y la gloria proceden de ti, y tú dominas sobre todo; en tu mano está la fuerza y el poder, y en tu mano el hacer grande y el dar poder a todos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 29, 13, NULL, 'Ahora pues, Dios nuestro, nosotros alabamos y loamos tu glorioso nombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 29, 14, NULL, 'Porque ¿quién soy yo, y quién es mi pueblo, para que pudiésemos ofrecer voluntariamente cosas semejantes? Pues todo es tuyo, y de lo recibido de tu mano te damos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 29, 15, NULL, 'Porque nosotros, extranjeros y advenedizos somos delante de ti, como todos nuestros padres; y nuestros días sobre la tierra, cual sombra que no dura.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 29, 16, NULL, 'Oh Jehová Dios nuestro, toda esta abundancia que hemos preparado para edificar casa a tu santo nombre, de tu mano es, y todo es tuyo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 29, 17, NULL, 'Yo sé, Dios mío, que tú escudriñas los corazones, y que la rectitud te agrada; por eso yo con rectitud de mi corazón voluntariamente te he ofrecido todo esto, y ahora he visto con alegría que tu pueblo, reunido aquí ahora, ha dado para ti espontáneamente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 29, 18, NULL, 'Jehová, Dios de Abraham, de Isaac y de Israel nuestros padres, conserva perpetuamente esta voluntad del corazón de tu pueblo, y encamina su corazón a ti.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 29, 19, NULL, 'Asimismo da a mi hijo Salomón corazón perfecto, para que guarde tus mandamientos, tus testimonios y tus estatutos, y para que haga todas las cosas, y te edifique la casa para la cual yo he hecho preparativos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 29, 20, NULL, 'Después dijo David a toda la congregación: Bendecid ahora a Jehová vuestro Dios. Entonces toda la congregación bendijo a Jehová Dios de sus padres, e inclinándose adoraron delante de Jehová y del rey.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 29, 21, NULL, 'Y sacrificaron víctimas a Jehová, y ofrecieron a Jehová holocaustos al día siguiente; mil becerros, mil carneros, mil corderos con sus libaciones, y muchos sacrificios de parte de todo Israel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 29, 22, NULL, 'Y comieron y bebieron delante de Jehová aquel día con gran gozo; y dieron por segunda vez la investidura del reino a Salomón hijo de David, y ante Jehová le ungieron por príncipe, y a Sadoc por sacerdote.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 29, 23, NULL, 'Y se sentó Salomón por rey en el trono de Jehová en lugar de David su padre, y fue prosperado; y le obedeció todo Israel.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 29, 24, NULL, 'Y todos los príncipes y poderosos, y todos los hijos del rey David, prestaron homenaje al rey Salomón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 29, 25, NULL, 'Y Jehová engrandeció en extremo a Salomón a ojos de todo Israel, y le dio tal gloria en su reino, cual ningún rey la tuvo antes de él en Israel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 29, 26, 'Muerte de David', 'Así reinó David hijo de Isaí sobre todo Israel.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 29, 27, NULL, 'El tiempo que reinó sobre Israel fue cuarenta años. Siete años reinó en Hebrón, y treinta y tres reinó en Jerusalén.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 29, 28, NULL, 'Y murió en buena vejez, lleno de días, de riquezas y de gloria; y reinó en su lugar Salomón su hijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 29, 29, NULL, 'Y los hechos del rey David, primeros y postreros, están escritos en el libro de las crónicas de Samuel vidente, en las crónicas del profeta Natán, y en las crónicas de Gad vidente,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', '1 Cr', 29, 30, NULL, 'con todo lo relativo a su reinado, y su poder, y los tiempos que pasaron sobre él, y sobre Israel y sobre todos los reinos de aquellas tierras.', 0, 'spa', 'RVR1960', NULL);\n"
;

}