package com.orellano.biblia360.daoSQLite.sql.spa;

public final class LoadCantares {
  public LoadCantares() {}
  public static final String SQL_PARTE_1 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Cnt', 1, 1, 'La esposa y las hijas de Jerusalén', 'Cantar de los cantares, el cual es de Salomón.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 1, 2, NULL, '¡Oh, si él me besara con besos de su boca! Porque mejores son tus amores que el vino.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 1, 3, NULL, 'A más del olor de tus suaves ungüentos, Tu nombre es como ungüento derramado; Por eso las doncellas te aman.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 1, 4, NULL, 'Atráeme; en pos de ti correremos. El rey me ha metido en sus cámaras; Nos gozaremos y alegraremos en ti; Nos acordaremos de tus amores más que del vino; Con razón te aman.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 1, 5, NULL, 'Morena soy, oh hijas de Jerusalén, pero codiciable Como las tiendas de Cedar, Como las cortinas de Salomón.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 1, 6, NULL, 'No reparéis en que soy morena, Porque el sol me miró. Los hijos de mi madre se airaron contra mí; Me pusieron a guardar las viñas; Y mi viña, que era mía, no guardé.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 1, 7, NULL, 'Hazme saber, oh tú a quien ama mi alma, Dónde apacientas, dónde sesteas al mediodía; Pues ¿por qué había de estar yo como errante Junto a los rebaños de tus compañeros?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 1, 8, NULL, 'Si tú no lo sabes, oh hermosa entre las mujeres, Ve, sigue las huellas del rebaño, Y apacienta tus cabritas junto a las cabañas de los pastores.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 1, 9, 'La esposa y el esposo', 'A yegua de los carros de Faraón Te he comparado, amiga mía.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 1, 10, NULL, 'Hermosas son tus mejillas entre los pendientes, Tu cuello entre los collares.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 1, 11, NULL, 'Zarcillos de oro te haremos, Tachonados de plata.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 1, 12, NULL, 'Mientras el rey estaba en su reclinatorio, Mi nardo dio su olor.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 1, 13, NULL, 'Mi amado es para mí un manojito de mirra, Que reposa entre mis pechos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 1, 14, NULL, 'Racimo de flores de alheña en las viñas de En-gadi Es para mí mi amado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 1, 15, NULL, 'He aquí que tú eres hermosa, amiga mía; He aquí eres bella; tus ojos son como palomas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 1, 16, NULL, 'He aquí que tú eres hermoso, amado mío, y dulce; Nuestro lecho es de flores.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 1, 17, NULL, 'Las vigas de nuestra casa son de cedro, Y de ciprés los artesonados.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 2, 1, NULL, 'Yo soy la rosa de Sarón, Y el lirio de los valles.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 2, 2, NULL, 'Como el lirio entre los espinos, Así es mi amiga entre las doncellas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 2, 3, NULL, 'Como el manzano entre los árboles silvestres, Así es mi amado entre los jóvenes; Bajo la sombra del deseado me senté, Y su fruto fue dulce a mi paladar.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 2, 4, NULL, 'Me llevó a la casa del banquete, Y su bandera sobre mí fue amor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 2, 5, NULL, 'Sustentadme con pasas, confortadme con manzanas; Porque estoy enferma de amor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 2, 6, NULL, 'Su izquierda esté debajo de mi cabeza, Y su derecha me abrace.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 2, 7, NULL, 'Yo os conjuro, oh doncellas de Jerusalén, Por los corzos y por las ciervas del campo, Que no despertéis ni hagáis velar al amor, Hasta que quiera.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 2, 8, NULL, '¡La voz de mi amado! He aquí él viene Saltando sobre los montes, Brincando sobre los collados.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 2, 9, NULL, 'Mi amado es semejante al corzo, O al cervatillo. Helo aquí, está tras nuestra pared, Mirando por las ventanas, Atisbando por las celosías.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 2, 10, NULL, 'Mi amado habló, y me dijo: Levántate, oh amiga mía, hermosa mía, y ven.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 2, 11, NULL, 'Porque he aquí ha pasado el invierno, Se ha mudado, la lluvia se fue;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 2, 12, NULL, 'Se han mostrado las flores en la tierra, El tiempo de la canción ha venido, Y en nuestro país se ha oído la voz de la tórtola.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 2, 13, NULL, 'La higuera ha echado sus higos, Y las vides en cierne dieron olor; Levántate, oh amiga mía, hermosa mía, y ven.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 2, 14, NULL, 'Paloma mía, que estás en los agujeros de la peña, en lo escondido de escarpados parajes, Muéstrame tu rostro, hazme oír tu voz; Porque dulce es la voz tuya, y hermoso tu aspecto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 2, 15, NULL, 'Cazadnos las zorras, las zorras pequeñas, que echan a perder las viñas; Porque nuestras viñas están en cierne.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 2, 16, NULL, 'Mi amado es mío, y yo suya; Él apacienta entre lirios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 2, 17, NULL, 'Hasta que apunte el día, y huyan las sombras, Vuélvete, amado mío; sé semejante al corzo, o como el cervatillo Sobre los montes de Beter.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 3, 1, 'El ensueño de la esposa', 'Por las noches busqué en mi lecho al que ama mi alma; Lo busqué, y no lo hallé.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 3, 2, NULL, 'Y dije: Me levantaré ahora, y rodearé por la ciudad; Por las calles y por las plazas Buscaré al que ama mi alma; Lo busqué, y no lo hallé.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 3, 3, NULL, 'Me hallaron los guardas que rondan la ciudad, Y les dije: ¿Habéis visto al que ama mi alma?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 3, 4, NULL, 'Apenas hube pasado de ellos un poco, Hallé luego al que ama mi alma; Lo así, y no lo dejé, Hasta que lo metí en casa de mi madre, Y en la cámara de la que me dio a luz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 3, 5, NULL, 'Yo os conjuro, oh doncellas de Jerusalén, Por los corzos y por las ciervas del campo, Que no despertéis ni hagáis velar al amor, Hasta que quiera.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 3, 6, 'El cortejo de bodas', '¿Quién es esta que sube del desierto como columna de humo, Sahumada de mirra y de incienso Y de todo polvo aromático?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 3, 7, NULL, 'He aquí es la litera de Salomón; Sesenta valientes la rodean, De los fuertes de Israel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 3, 8, NULL, 'Todos ellos tienen espadas, diestros en la guerra; Cada uno su espada sobre su muslo, Por los temores de la noche.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 3, 9, NULL, 'El rey Salomón se hizo una carroza De madera del Líbano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 3, 10, NULL, 'Hizo sus columnas de plata, Su respaldo de oro, Su asiento de grana, Su interior recamado de amor Por las doncellas de Jerusalén.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 3, 11, NULL, 'Salid, oh doncellas de Sion, y ved al rey Salomón Con la corona con que le coronó su madre en el día de su desposorio, Y el día del gozo de su corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 4, 1, 'El esposo alaba a la esposa', 'He aquí que tú eres hermosa, amiga mía; he aquí que tú eres hermosa; Tus ojos entre tus guedejas como de paloma; Tus cabellos como manada de cabras Que se recuestan en las laderas de Galaad.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 4, 2, NULL, 'Tus dientes como manadas de ovejas trasquiladas, Que suben del lavadero, Todas con crías gemelas, Y ninguna entre ellas estéril.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 4, 3, NULL, 'Tus labios como hilo de grana, Y tu habla hermosa; Tus mejillas, como cachos de granada detrás de tu velo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 4, 4, NULL, 'Tu cuello, como la torre de David, edificada para armería; Mil escudos están colgados en ella, Todos escudos de valientes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 4, 5, NULL, 'Tus dos pechos, como gemelos de gacela, Que se apacientan entre lirios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 4, 6, NULL, 'Hasta que apunte el día y huyan las sombras, Me iré al monte de la mirra, Y al collado del incienso.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 4, 7, NULL, 'Toda tú eres hermosa, amiga mía, Y en ti no hay mancha.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 4, 8, NULL, 'Ven conmigo desde el Líbano, oh esposa mía; Ven conmigo desde el Líbano. Mira desde la cumbre de Amana, Desde la cumbre de Senir y de Hermón, Desde las guaridas de los leones, Desde los montes de los leopardos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 4, 9, NULL, 'Prendiste mi corazón, hermana, esposa mía; Has apresado mi corazón con uno de tus ojos, Con una gargantilla de tu cuello.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 4, 10, NULL, '¡Cuán hermosos son tus amores, hermana, esposa mía! ¡Cuánto mejores que el vino tus amores, Y el olor de tus ungüentos que todas las especias aromáticas!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 4, 11, NULL, 'Como panal de miel destilan tus labios, oh esposa; Miel y leche hay debajo de tu lengua; Y el olor de tus vestidos como el olor del Líbano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 4, 12, NULL, 'Huerto cerrado eres, hermana mía, esposa mía; Fuente cerrada, fuente sellada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 4, 13, NULL, 'Tus renuevos son paraíso de granados, con frutos suaves, De flores de alheña y nardos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 4, 14, NULL, 'Nardo y azafrán, caña aromática y canela, Con todos los árboles de incienso; Mirra y áloes, con todas las principales especias aromáticas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 4, 15, NULL, 'Fuente de huertos, Pozo de aguas vivas, Que corren del Líbano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 4, 16, NULL, 'Levántate, Aquilón, y ven, Austro; Soplad en mi huerto, despréndanse sus aromas. Venga mi amado a su huerto, Y coma de su dulce fruta.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 5, 1, NULL, 'Yo vine a mi huerto, oh hermana, esposa mía; He recogido mi mirra y mis aromas; He comido mi panal y mi miel, Mi vino y mi leche he bebido. Comed, amigos; bebed en abundancia, oh amados.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 5, 2, 'El tormento de la separación', 'Yo dormía, pero mi corazón velaba. Es la voz de mi amado que llama: Ábreme, hermana mía, amiga mía, paloma mía, perfecta mía, Porque mi cabeza está llena de rocío, Mis cabellos de las gotas de la noche.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 5, 3, NULL, 'Me he desnudado de mi ropa; ¿cómo me he de vestir? He lavado mis pies; ¿cómo los he de ensuciar?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 5, 4, NULL, 'Mi amado metió su mano por la ventanilla, Y mi corazón se conmovió dentro de mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 5, 5, NULL, 'Yo me levanté para abrir a mi amado, Y mis manos gotearon mirra, Y mis dedos mirra, que corría Sobre la manecilla del cerrojo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 5, 6, NULL, 'Abrí yo a mi amado; Pero mi amado se había ido, había ya pasado; Y tras su hablar salió mi alma. Lo busqué, y no lo hallé; Lo llamé, y no me respondió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 5, 7, NULL, 'Me hallaron los guardas que rondan la ciudad; Me golpearon, me hirieron; Me quitaron mi manto de encima los guardas de los muros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 5, 8, NULL, 'Yo os conjuro, oh doncellas de Jerusalén, si halláis a mi amado, Que le hagáis saber que estoy enferma de amor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 5, 9, 'La esposa alaba al esposo', '¿Qué es tu amado más que otro amado, Oh la más hermosa de todas las mujeres? ¿Qué es tu amado más que otro amado, Que así nos conjuras?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 5, 10, NULL, 'Mi amado es blanco y rubio, Señalado entre diez mil.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 5, 11, NULL, 'Su cabeza como oro finísimo; Sus cabellos crespos, negros como el cuervo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 5, 12, NULL, 'Sus ojos, como palomas junto a los arroyos de las aguas, Que se lavan con leche, y a la perfección colocados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 5, 13, NULL, 'Sus mejillas, como una era de especias aromáticas, como fragantes flores; Sus labios, como lirios que destilan mirra fragante.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 5, 14, NULL, 'Sus manos, como anillos de oro engastados de jacintos; Su cuerpo, como claro marfil cubierto de zafiros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 5, 15, NULL, 'Sus piernas, como columnas de mármol fundadas sobre basas de oro fino; Su aspecto como el Líbano, escogido como los cedros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 5, 16, NULL, 'Su paladar, dulcísimo, y todo él codiciable. Tal es mi amado, tal es mi amigo, Oh doncellas de Jerusalén.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 6, 1, 'Mutuo encanto del esposo y de la esposa', '¿A dónde se ha ido tu amado, oh la más hermosa de todas las mujeres? ¿A dónde se apartó tu amado, Y lo buscaremos contigo?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 6, 2, NULL, 'Mi amado descendió a su huerto, a las eras de las especias, Para apacentar en los huertos, y para recoger los lirios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 6, 3, NULL, 'Yo soy de mi amado, y mi amado es mío; Él apacienta entre los lirios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 6, 4, NULL, 'Hermosa eres tú, oh amiga mía, como Tirsa; De desear, como Jerusalén; Imponente como ejércitos en orden.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 6, 5, NULL, 'Aparta tus ojos de delante de mí, Porque ellos me vencieron. Tu cabello es como manada de cabras Que se recuestan en las laderas de Galaad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 6, 6, NULL, 'Tus dientes, como manadas de ovejas que suben del lavadero, Todas con crías gemelas, Y estéril no hay entre ellas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 6, 7, NULL, 'Como cachos de granada son tus mejillas Detrás de tu velo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 6, 8, NULL, 'Sesenta son las reinas, y ochenta las concubinas, Y las doncellas sin número;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 6, 9, NULL, 'Mas una es la paloma mía, la perfecta mía; Es la única de su madre, La escogida de la que la dio a luz. La vieron las doncellas, y la llamaron bienaventurada; Las reinas y las concubinas, y la alabaron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 6, 10, NULL, '¿Quién es esta que se muestra como el alba, Hermosa como la luna, Esclarecida como el sol, Imponente como ejércitos en orden?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 6, 11, NULL, 'Al huerto de los nogales descendí A ver los frutos del valle, Y para ver si brotaban las vides, Si florecían los granados.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 6, 12, NULL, 'Antes que lo supiera, mi alma me puso Entre los carros de Aminadab.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 6, 13, NULL, 'Vuélvete, vuélvete, oh sulamita; Vuélvete, vuélvete, y te miraremos. ¿Qué veréis en la sulamita? Algo como la reunión de dos campamentos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 7, 1, NULL, '¡Cuán hermosos son tus pies en las sandalias, Oh hija de príncipe! Los contornos de tus muslos son como joyas, Obra de mano de excelente maestro.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 7, 2, NULL, 'Tu ombligo como una taza redonda Que no le falta bebida. Tu vientre como montón de trigo Cercado de lirios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 7, 3, NULL, 'Tus dos pechos, como gemelos de gacela.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 7, 4, NULL, 'Tu cuello, como torre de marfil; Tus ojos, como los estanques de Hesbón junto a la puerta de Bat-rabim; Tu nariz, como la torre del Líbano, Que mira hacia Damasco.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 7, 5, NULL, 'Tu cabeza encima de ti, como el Carmelo; Y el cabello de tu cabeza, como la púrpura del rey Suspendida en los corredores.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 7, 6, NULL, '¡Qué hermosa eres, y cuán suave, Oh amor deleitoso!', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 7, 7, NULL, 'Tu estatura es semejante a la palmera, Y tus pechos a los racimos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 7, 8, NULL, 'Yo dije: Subiré a la palmera, Asiré sus ramas. Deja que tus pechos sean como racimos de vid, Y el olor de tu boca como de manzanas,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 7, 9, NULL, 'Y tu paladar como el buen vino, Que se entra a mi amado suavemente, Y hace hablar los labios de los viejos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 7, 10, NULL, 'Yo soy de mi amado, Y conmigo tiene su contentamiento.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 7, 11, NULL, 'Ven, oh amado mío, salgamos al campo, Moremos en las aldeas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 7, 12, NULL, 'Levantémonos de mañana a las viñas; Veamos si brotan las vides, si están en cierne, Si han florecido los granados; Allí te daré mis amores.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 7, 13, NULL, 'Las mandrágoras han dado olor, Y a nuestras puertas hay toda suerte de dulces frutas, Nuevas y añejas, que para ti, oh amado mío, he guardado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 8, 1, NULL, '¡Oh, si tú fueras como un hermano mío Que mamó los pechos de mi madre! Entonces, hallándote fuera, te besaría, Y no me menospreciarían.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 8, 2, NULL, 'Yo te llevaría, te metería en casa de mi madre; Tú me enseñarías, Y yo te haría beber vino Adobado del mosto de mis granadas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 8, 3, NULL, 'Su izquierda esté debajo de mi cabeza, Y su derecha me abrace.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 8, 4, NULL, 'Os conjuro, oh doncellas de Jerusalén, Que no despertéis ni hagáis velar al amor, Hasta que quiera.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 8, 5, 'El poder del amor', '¿Quién es esta que sube del desierto, Recostada sobre su amado? Debajo de un manzano te desperté; Allí tuvo tu madre dolores, Allí tuvo dolores la que te dio a luz.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 8, 6, NULL, 'Ponme como un sello sobre tu corazón, como una marca sobre tu brazo; Porque fuerte es como la muerte el amor; Duros como el Seol los celos; Sus brasas, brasas de fuego, fuerte llama.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 8, 7, NULL, 'Las muchas aguas no podrán apagar el amor, Ni lo ahogarán los ríos. Si diese el hombre todos los bienes de su casa por este amor, De cierto lo menospreciarían.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 8, 8, NULL, 'Tenemos una pequeña hermana, Que no tiene pechos; ¿Qué haremos a nuestra hermana Cuando de ella se hablare?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 8, 9, NULL, 'Si ella es muro, Edificaremos sobre él un palacio de plata; Si fuere puerta, La guarneceremos con tablas de cedro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 8, 10, NULL, 'Yo soy muro, y mis pechos como torres, Desde que fui en sus ojos como la que halla paz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 8, 11, NULL, 'Salomón tuvo una viña en Baal-hamón, La cual entregó a guardas, Cada uno de los cuales debía traer mil monedas de plata por su fruto.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 8, 12, NULL, 'Mi viña, que es mía, está delante de mí; Las mil serán tuyas, oh Salomón, Y doscientas para los que guardan su fruto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 8, 13, NULL, 'Oh, tú que habitas en los huertos, Los compañeros escuchan tu voz; Házmela oír.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Cnt', 8, 14, NULL, 'Apresúrate, amado mío, Y sé semejante al corzo, o al cervatillo, Sobre las montañas de los aromas.', 1, 'spa', 'RVR1960', NULL);\n"
;

}