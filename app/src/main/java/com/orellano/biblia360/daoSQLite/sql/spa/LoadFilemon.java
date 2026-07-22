package com.orellano.biblia360.daoSQLite.sql.spa;

public final class LoadFilemon {
  public LoadFilemon() {}
  public static final String SQL_PARTE_1 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Flm', 1, 1, 'Salutación', 'Pablo, prisionero de Jesucristo, y el hermano Timoteo, al amado Filemón, colaborador nuestro,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Flm', 1, 2, NULL, 'y a la amada hermana Apia, y a Arquipo nuestro compañero de milicia, y a la iglesia que está en tu casa:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Flm', 1, 3, NULL, 'Gracia y paz a vosotros, de Dios nuestro Padre y del Señor Jesucristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Flm', 1, 4, 'El amor y la fe de Filemón', 'Doy gracias a mi Dios, haciendo siempre memoria de ti en mis oraciones,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Flm', 1, 5, NULL, 'porque oigo del amor y de la fe que tienes hacia el Señor Jesús, y para con todos los santos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Flm', 1, 6, NULL, 'para que la participación de tu fe sea eficaz en el conocimiento de todo el bien que está en vosotros por Cristo Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Flm', 1, 7, NULL, 'Pues tenemos gran gozo y consolación en tu amor, porque por ti, oh hermano, han sido confortados los corazones de los santos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Flm', 1, 8, 'Pablo intercede por Onésimo', 'Por lo cual, aunque tengo mucha libertad en Cristo para mandarte lo que conviene,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Flm', 1, 9, NULL, 'más bien te ruego por amor, siendo como soy, Pablo ya anciano, y ahora, además, prisionero de Jesucristo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Flm', 1, 10, NULL, 'te ruego por mi hijo Onésimo,, a quien engendré en mis prisiones,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Flm', 1, 11, NULL, 'el cual en otro tiempo te fue inútil, pero ahora a ti y a mí nos es útil,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Flm', 1, 12, NULL, 'el cual vuelvo a enviarte; tú, pues, recíbele como a mí mismo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Flm', 1, 13, NULL, 'Yo quisiera retenerle conmigo, para que en lugar tuyo me sirviese en mis prisiones por el evangelio;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Flm', 1, 14, NULL, 'pero nada quise hacer sin tu consentimiento, para que tu favor no fuese como de necesidad, sino voluntario.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Flm', 1, 15, NULL, 'Porque quizá para esto se apartó de ti por algún tiempo, para que le recibieses para siempre;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Flm', 1, 16, NULL, 'no ya como esclavo, sino como más que esclavo, como hermano amado, mayormente para mí, pero cuánto más para ti, tanto en la carne como en el Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Flm', 1, 17, NULL, 'Así que, si me tienes por compañero, recíbele como a mí mismo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Flm', 1, 18, NULL, 'Y si en algo te dañó, o te debe, ponlo a mi cuenta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Flm', 1, 19, NULL, 'Yo Pablo lo escribo de mi mano, yo lo pagaré; por no decirte que aun tú mismo te me debes también.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Flm', 1, 20, NULL, 'Sí, hermano, tenga yo algún provecho de ti en el Señor; conforta mi corazón en el Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Flm', 1, 21, NULL, 'Te he escrito confiando en tu obediencia, sabiendo que harás aun más de lo que te digo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Flm', 1, 22, NULL, 'Prepárame también alojamiento; porque espero que por vuestras oraciones os seré concedido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Flm', 1, 23, 'Salutaciones y bendición final', 'Te saludan Epafras, mi compañero de prisiones por Cristo Jesús,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Flm', 1, 24, NULL, 'Marcos, Aristarco, Demas y Lucas, mis colaboradores.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Flm', 1, 25, NULL, 'La gracia de nuestro Señor Jesucristo sea con vuestro espíritu. Amén.', 1, 'spa', 'RVR1960', NULL);\n"
;

}