package com.orellano.biblia360.daoSQLite.sql.spa;

public final class LoadAbdias {
  public LoadAbdias() {}
  public static final String SQL_PARTE_1 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Abd', 1, 1, 'La humillación de Edom', 'Visión de Abdías. Jehová el Señor ha dicho así en cuanto a Edom: Hemos oído el pregón de Jehová, y mensajero ha sido enviado a las naciones. Levantaos, y levantémonos contra este pueblo en batalla.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Abd', 1, 2, NULL, 'He aquí, pequeño te he hecho entre las naciones; estás abatido en gran manera.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Abd', 1, 3, NULL, 'La soberbia de tu corazón te ha engañado, tú que moras en las hendiduras de las peñas, en tu altísima morada; que dices en tu corazón: ¿Quién me derribará a tierra?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Abd', 1, 4, NULL, 'Si te remontares como águila, y aunque entre las estrellas pusieres tu nido, de ahí te derribaré, dice Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Abd', 1, 5, NULL, 'Si ladrones vinieran a ti, o robadores de noche (¡cómo has sido destruido!), ¿no hurtarían lo que les bastase? Si entraran a ti vendimiadores, ¿no dejarían algún rebusco?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Abd', 1, 6, NULL, '¡Cómo fueron escudriñadas las cosas de Esaú! Sus tesoros escondidos fueron buscados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Abd', 1, 7, NULL, 'Todos tus aliados te han engañado; hasta los confines te hicieron llegar; los que estaban en paz contigo prevalecieron contra ti; los que comían tu pan pusieron lazo debajo de ti; no hay en ello entendimiento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Abd', 1, 8, NULL, '¿No haré que perezcan en aquel día, dice Jehová, los sabios de Edom, y la prudencia del monte de Esaú?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Abd', 1, 9, NULL, 'Y tus valientes, oh Temán, serán amedrentados; porque todo hombre será cortado del monte de Esaú por el estrago.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Abd', 1, 10, NULL, 'Por la injuria a tu hermano Jacob te cubrirá vergüenza, y serás cortado para siempre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Abd', 1, 11, NULL, 'El día que estando tú delante, llevaban extraños cautivo su ejército, y extraños entraban por sus puertas, y echaban suertes sobre Jerusalén, tú también eras como uno de ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Abd', 1, 12, NULL, 'Pues no debiste tú haber estado mirando en el día de tu hermano, en el día de su infortunio; no debiste haberte alegrado de los hijos de Judá en el día en que se perdieron, ni debiste haberte jactado en el día de la angustia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Abd', 1, 13, NULL, 'No debiste haber entrado por la puerta de mi pueblo en el día de su quebrantamiento; no, no debiste haber mirado su mal en el día de su quebranto, ni haber echado mano a sus bienes en el día de su calamidad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Abd', 1, 14, NULL, 'Tampoco debiste haberte parado en las encrucijadas para matar a los que de ellos escapasen; ni debiste haber entregado a los que quedaban en el día de angustia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Abd', 1, 15, 'La exaltación de Israel', 'Porque cercano está el día de Jehová sobre todas las naciones; como tú hiciste se hará contigo; tu recompensa volverá sobre tu cabeza.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Abd', 1, 16, NULL, 'De la manera que vosotros bebisteis en mi santo monte, beberán continuamente todas las naciones; beberán, y engullirán, y serán como si no hubieran sido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Abd', 1, 17, NULL, 'Mas en el monte de Sion habrá un remanente que se salve; y será santo, y la casa de Jacob recuperará sus posesiones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Abd', 1, 18, NULL, 'La casa de Jacob será fuego, y la casa de José será llama, y la casa de Esaú estopa, y los quemarán y los consumirán; ni aun resto quedará de la casa de Esaú, porque Jehová lo ha dicho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Abd', 1, 19, NULL, 'Y los del Neguev poseerán el monte de Esaú, y los de la Sefela a los filisteos; poseerán también los campos de Efraín, y los campos de Samaria; y Benjamín a Galaad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Abd', 1, 20, NULL, 'Y los cautivos de este ejército de los hijos de Israel poseerán lo de los cananeos hasta Sarepta; y los cautivos de Jerusalén que están en Sefarad poseerán las ciudades del Neguev.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Abd', 1, 21, NULL, 'Y subirán salvadores al monte de Sion para juzgar al monte de Esaú; y el reino será de Jehová.', 0, 'spa', 'RVR1960', NULL);\n"
;

}