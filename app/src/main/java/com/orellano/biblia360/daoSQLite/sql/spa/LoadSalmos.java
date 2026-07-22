package com.orellano.biblia360.daoSQLite.sql.spa;

public final class LoadSalmos {
  public LoadSalmos() {}
  public static final String SQL_PARTE_1 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Sal', 1, 1, 'El justo y los pecadores', 'Bienaventurado el varón que no anduvo en consejo de malos, Ni estuvo en camino de pecadores, Ni en silla de escarnecedores se ha sentado;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 1, 2, NULL, 'Sino que en la ley de Jehová está su delicia, Y en su ley medita de día y de noche.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 1, 3, NULL, 'Será como árbol plantado junto a corrientes de aguas, Que da su fruto en su tiempo, Y su hoja no cae; Y todo lo que hace, prosperará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 1, 4, NULL, 'No así los malos, Que son como el tamo que arrebata el viento.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 1, 5, NULL, 'Por tanto, no se levantarán los malos en el juicio, Ni los pecadores en la congregación de los justos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 1, 6, NULL, 'Porque Jehová conoce el camino de los justos; Mas la senda de los malos perecerá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 2, 1, 'El reino del ungido de Jehová', '¿Por qué se amotinan las gentes, Y los pueblos piensan cosas vanas?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 2, 2, NULL, 'Se levantarán los reyes de la tierra, Y príncipes consultarán unidos Contra Jehová y contra su ungido, diciendo:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 2, 3, NULL, 'Rompamos sus ligaduras, Y echemos de nosotros sus cuerdas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 2, 4, NULL, 'El que mora en los cielos se reirá; El Señor se burlará de ellos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 2, 5, NULL, 'Luego hablará a ellos en su furor, Y los turbará con su ira.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 2, 6, NULL, 'Pero yo he puesto mi rey Sobre Sion, mi santo monte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 2, 7, NULL, 'Yo publicaré el decreto; Jehová me ha dicho: Mi hijo eres tú; Yo te engendré hoy.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 2, 8, NULL, 'Pídeme, y te daré por herencia las naciones, Y como posesión tuya los confines de la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 2, 9, NULL, 'Los quebrantarás con vara de hierro; Como vasija de alfarero los desmenuzarás.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 2, 10, NULL, 'Ahora, pues, oh reyes, sed prudentes; Admitid amonestación, jueces de la tierra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 2, 11, NULL, 'Servid a Jehová con temor, Y alegraos con temblor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 2, 12, NULL, 'Honrad al Hijo, para que no se enoje, y perezcáis en el camino; Pues se inflama de pronto su ira. Bienaventurados todos los que en él confían.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 3, 1, 'Oración matutina de confianza en Dios', '¡Oh Jehová, cuánto se han multiplicado mis adversarios! Muchos son los que se levantan contra mí.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 3, 2, NULL, 'Muchos son los que dicen de mí: No hay para él salvación en Dios. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 3, 3, NULL, 'Mas tú, Jehová, eres escudo alrededor de mí; Mi gloria, y el que levanta mi cabeza.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 3, 4, NULL, 'Con mi voz clamé a Jehová, Y él me respondió desde su monte santo. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 3, 5, NULL, 'Yo me acosté y dormí, Y desperté, porque Jehová me sustentaba.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 3, 6, NULL, 'No temeré a diez millares de gente, Que pusieren sitio contra mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 3, 7, NULL, 'Levántate, Jehová; sálvame, Dios mío; Porque tú heriste a todos mis enemigos en la mejilla; Los dientes de los perversos quebrantaste.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 3, 8, NULL, 'La salvación es de Jehová; Sobre tu pueblo sea tu bendición. Selah', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 4, 1, 'Oración vespertina de confianza en Dios', 'Respóndeme cuando clamo, oh Dios de mi justicia. Cuando estaba en angustia, tú me hiciste ensanchar; Ten misericordia de mí, y oye mi oración.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 4, 2, NULL, 'Hijos de los hombres, ¿hasta cuándo volveréis mi honra en infamia, Amaréis la vanidad, y buscaréis la mentira? Selah', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 4, 3, NULL, 'Sabed, pues, que Jehová ha escogido al piadoso para sí; Jehová oirá cuando yo a él clamare.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 4, 4, NULL, 'Temblad, y no pequéis; Meditad en vuestro corazón estando en vuestra cama, y callad. Selah', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 4, 5, NULL, 'Ofreced sacrificios de justicia, Y confiad en Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 4, 6, NULL, 'Muchos son los que dicen: ¿Quién nos mostrará el bien? Alza sobre nosotros, oh Jehová, la luz de tu rostro.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 4, 7, NULL, 'Tú diste alegría a mi corazón Mayor que la de ellos cuando abundaba su grano y su mosto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 4, 8, NULL, 'En paz me acostaré, y asimismo dormiré; Porque solo tú, Jehová, me haces vivir confiado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 5, 1, 'Plegaria pidiendo protección', 'Escucha, oh Jehová, mis palabras; Considera mi gemir.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 5, 2, NULL, 'Está atento a la voz de mi clamor, Rey mío y Dios mío, Porque a ti oraré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 5, 3, NULL, 'Oh Jehová, de mañana oirás mi voz; De mañana me presentaré delante de ti, y esperaré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 5, 4, NULL, 'Porque tú no eres un Dios que se complace en la maldad; El malo no habitará junto a ti.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 5, 5, NULL, 'Los insensatos no estarán delante de tus ojos; Aborreces a todos los que hacen iniquidad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 5, 6, NULL, 'Destruirás a los que hablan mentira; Al hombre sanguinario y engañador abominará Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 5, 7, NULL, 'Mas yo por la abundancia de tu misericordia entraré en tu casa; Adoraré hacia tu santo templo en tu temor.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 5, 8, NULL, 'Guíame, Jehová, en tu justicia, a causa de mis enemigos; Endereza delante de mí tu camino.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 5, 9, NULL, 'Porque en la boca de ellos no hay sinceridad; Sus entrañas son maldad, Sepulcro abierto es su garganta, Con su lengua hablan lisonjas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 5, 10, NULL, 'Castígalos, oh Dios; Caigan por sus mismos consejos; Por la multitud de sus transgresiones échalos fuera, Porque se rebelaron contra ti.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 5, 11, NULL, 'Pero alégrense todos los que en ti confían; Den voces de júbilo para siempre, porque tú los defiendes; En ti se regocijen los que aman tu nombre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 5, 12, NULL, 'Porque tú, oh Jehová, bendecirás al justo; Como con un escudo lo rodearás de tu favor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 6, 1, 'Oración pidiendo misericordia en tiempo de prueba', 'Jehová, no me reprendas en tu enojo, Ni me castigues con tu ira.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 6, 2, NULL, 'Ten misericordia de mí, oh Jehová, porque estoy enfermo; Sáname, oh Jehová, porque mis huesos se estremecen.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 6, 3, NULL, 'Mi alma también está muy turbada; Y tú, Jehová, ¿hasta cuándo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 6, 4, NULL, 'Vuélvete, oh Jehová, libra mi alma; Sálvame por tu misericordia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 6, 5, NULL, 'Porque en la muerte no hay memoria de ti; En el Seol, ¿quién te alabará?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 6, 6, NULL, 'Me he consumido a fuerza de gemir; Todas las noches inundo de llanto mi lecho, Riego mi cama con mis lágrimas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 6, 7, NULL, 'Mis ojos están gastados de sufrir; Se han envejecido a causa de todos mis angustiadores.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 6, 8, NULL, 'Apartaos de mí, todos los hacedores de iniquidad; Porque Jehová ha oído la voz de mi lloro.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 6, 9, NULL, 'Jehová ha oído mi ruego; Ha recibido Jehová mi oración.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 6, 10, NULL, 'Se avergonzarán y se turbarán mucho todos mis enemigos; Se volverán y serán avergonzados de repente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 7, 1, 'Plegaria pidiendo vindicación', 'Jehová Dios mío, en ti he confiado; Sálvame de todos los que me persiguen, y líbrame,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 7, 2, NULL, 'No sea que desgarren mi alma cual león, Y me destrocen sin que haya quien me libre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 7, 3, NULL, 'Jehová Dios mío, si yo he hecho esto, Si hay en mis manos iniquidad;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 7, 4, NULL, 'Si he dado mal pago al que estaba en paz conmigo (Antes he libertado al que sin causa era mi enemigo),', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 7, 5, NULL, 'Persiga el enemigo mi alma, y alcáncela; Huelle en tierra mi vida, Y mi honra ponga en el polvo. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 7, 6, NULL, 'Levántate, oh Jehová, en tu ira; Álzate en contra de la furia de mis angustiadores, Y despierta en favor mío el juicio que mandaste.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 7, 7, NULL, 'Te rodeará congregación de pueblos, Y sobre ella vuélvete a sentar en alto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 7, 8, NULL, 'Jehová juzgará a los pueblos; Júzgame, oh Jehová, conforme a mi justicia, Y conforme a mi integridad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 7, 9, NULL, 'Fenezca ahora la maldad de los inicuos, mas establece tú al justo; Porque el Dios justo prueba la mente y el corazón.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 7, 10, NULL, 'Mi escudo está en Dios, Que salva a los rectos de corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 7, 11, NULL, 'Dios es juez justo, Y Dios está airado contra el impío todos los días.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 7, 12, NULL, 'Si no se arrepiente, él afilará su espada; Armado tiene ya su arco, y lo ha preparado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 7, 13, NULL, 'Asimismo ha preparado armas de muerte, Y ha labrado saetas ardientes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 7, 14, NULL, 'He aquí, el impío concibió maldad, Se preñó de iniquidad, Y dio a luz engaño.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 7, 15, NULL, 'Pozo ha cavado, y lo ha ahondado; Y en el hoyo que hizo caerá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 7, 16, NULL, 'Su iniquidad volverá sobre su cabeza, Y su agravio caerá sobre su propia coronilla.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 7, 17, NULL, 'Alabaré a Jehová conforme a su justicia, Y cantaré al nombre de Jehová el Altísimo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 8, 1, 'La gloria de Dios y la honra del hombre', '¡Oh Jehová, Señor nuestro, Cuán glorioso es tu nombre en toda la tierra! Has puesto tu gloria sobre los cielos;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 8, 2, NULL, 'De la boca de los niños y de los que maman, fundaste la fortaleza, A causa de tus enemigos, Para hacer callar al enemigo y al vengativo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 8, 3, NULL, 'Cuando veo tus cielos, obra de tus dedos, La luna y las estrellas que tú formaste,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 8, 4, NULL, 'Digo: ¿Qué es el hombre, para que tengas de él memoria, Y el hijo del hombre, para que lo visites?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 8, 5, NULL, 'Le has hecho poco menor que los ángeles, Y lo coronaste de gloria y de honra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 8, 6, NULL, 'Le hiciste señorear sobre las obras de tus manos; Todo lo pusiste debajo de sus pies:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 8, 7, NULL, 'Ovejas y bueyes, todo ello, Y asimismo las bestias del campo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 8, 8, NULL, 'Las aves de los cielos y los peces del mar; Todo cuanto pasa por los senderos del mar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 8, 9, NULL, '¡Oh Jehová, Señor nuestro, Cuán grande es tu nombre en toda la tierra!', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 9, 1, 'Acción de gracias por la justicia de Dios', 'Te alabaré, oh Jehová, con todo mi corazón; Contaré todas tus maravillas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 9, 2, NULL, 'Me alegraré y me regocijaré en ti; Cantaré a tu nombre, oh Altísimo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 9, 3, NULL, 'Mis enemigos volvieron atrás; Cayeron y perecieron delante de ti.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 9, 4, NULL, 'Porque has mantenido mi derecho y mi causa; Te has sentado en el trono juzgando con justicia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 9, 5, NULL, 'Reprendiste a las naciones, destruiste al malo, Borraste el nombre de ellos eternamente y para siempre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 9, 6, NULL, 'Los enemigos han perecido; han quedado desolados para siempre; Y las ciudades que derribaste, Su memoria pereció con ellas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 9, 7, NULL, 'Pero Jehová permanecerá para siempre; Ha dispuesto su trono para juicio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 9, 8, NULL, 'Él juzgará al mundo con justicia, Y a los pueblos con rectitud.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 9, 9, NULL, 'Jehová será refugio del pobre, Refugio para el tiempo de angustia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 9, 10, NULL, 'En ti confiarán los que conocen tu nombre, Por cuanto tú, oh Jehová, no desamparaste a los que te buscaron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 9, 11, NULL, 'Cantad a Jehová, que habita en Sion; Publicad entre los pueblos sus obras.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 9, 12, NULL, 'Porque el que demanda la sangre se acordó de ellos; No se olvidó del clamor de los afligidos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 9, 13, NULL, 'Ten misericordia de mí, Jehová; Mira mi aflicción que padezco a causa de los que me aborrecen, Tú que me levantas de las puertas de la muerte,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 9, 14, NULL, 'Para que cuente yo todas tus alabanzas En las puertas de la hija de Sion, Y me goce en tu salvación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 9, 15, NULL, 'Se hundieron las naciones en el hoyo que hicieron; En la red que escondieron fue tomado su pie.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 9, 16, NULL, 'Jehová se ha hecho conocer en el juicio que ejecutó; En la obra de sus manos fue enlazado el malo. Higaion. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 9, 17, NULL, 'Los malos serán trasladados al Seol, Todas las gentes que se olvidan de Dios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 9, 18, NULL, 'Porque no para siempre será olvidado el menesteroso, Ni la esperanza de los pobres perecerá perpetuamente.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 9, 19, NULL, 'Levántate, oh Jehová; no se fortalezca el hombre; Sean juzgadas las naciones delante de ti.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 9, 20, NULL, 'Pon, oh Jehová, temor en ellos; Conozcan las naciones que no son sino hombres. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 10, 1, 'Plegaria pidiendo la destrucción de los malvados', '¿Por qué estás lejos, oh Jehová, Y te escondes en el tiempo de la tribulación?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 10, 2, NULL, 'Con arrogancia el malo persigue al pobre; Será atrapado en los artificios que ha ideado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 10, 3, NULL, 'Porque el malo se jacta del deseo de su alma, Bendice al codicioso, y desprecia a Jehová.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 10, 4, NULL, 'El malo, por la altivez de su rostro, no busca a Dios; No hay Dios en ninguno de sus pensamientos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 10, 5, NULL, 'Sus caminos son torcidos en todo tiempo; Tus juicios los tiene muy lejos de su vista; A todos sus adversarios desprecia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 10, 6, NULL, 'Dice en su corazón: No seré movido jamás; Nunca me alcanzará el infortunio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 10, 7, NULL, 'Llena está su boca de maldición, y de engaños y fraude; Debajo de su lengua hay vejación y maldad.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 10, 8, NULL, 'Se sienta en acecho cerca de las aldeas; En escondrijos mata al inocente. Sus ojos están acechando al desvalido;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 10, 9, NULL, 'Acecha en oculto, como el león desde su cueva; Acecha para arrebatar al pobre; Arrebata al pobre trayéndolo a su red.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 10, 10, NULL, 'Se encoge, se agacha, Y caen en sus fuertes garras muchos desdichados.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 10, 11, NULL, 'Dice en su corazón: Dios ha olvidado; Ha encubierto su rostro; nunca lo verá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 10, 12, NULL, 'Levántate, oh Jehová Dios, alza tu mano; No te olvides de los pobres.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 10, 13, NULL, '¿Por qué desprecia el malo a Dios? En su corazón ha dicho: Tú no lo inquirirás.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 10, 14, NULL, 'Tú lo has visto; porque miras el trabajo y la vejación, para dar la recompensa con tu mano; A ti se acoge el desvalido; Tú eres el amparo del huérfano.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 10, 15, NULL, 'Quebranta tú el brazo del inicuo, Y persigue la maldad del malo hasta que no halles ninguna.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 10, 16, NULL, 'Jehová es Rey eternamente y para siempre; De su tierra han perecido las naciones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 10, 17, NULL, 'El deseo de los humildes oíste, oh Jehová; Tú dispones su corazón, y haces atento tu oído,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 10, 18, NULL, 'Para juzgar al huérfano y al oprimido, A fin de que no vuelva más a hacer violencia el hombre de la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 11, 1, 'El refugio del justo', 'En Jehová he confiado; ¿Cómo decís a mi alma, Que escape al monte cual ave?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 11, 2, NULL, 'Porque he aquí, los malos tienden el arco, Disponen sus saetas sobre la cuerda, Para asaetear en oculto a los rectos de corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 11, 3, NULL, 'Si fueren destruidos los fundamentos, ¿Qué ha de hacer el justo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 11, 4, NULL, 'Jehová está en su santo templo; Jehová tiene en el cielo su trono; Sus ojos ven, sus párpados examinan a los hijos de los hombres.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 11, 5, NULL, 'Jehová prueba al justo; Pero al malo y al que ama la violencia, su alma los aborrece.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 11, 6, NULL, 'Sobre los malos hará llover calamidades; Fuego, azufre y viento abrasador será la porción del cáliz de ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 11, 7, NULL, 'Porque Jehová es justo, y ama la justicia; El hombre recto mirará su rostro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 12, 1, 'Oración pidiendo ayuda contra los malos', 'Salva, oh Jehová, porque se acabaron los piadosos; Porque han desaparecido los fieles de entre los hijos de los hombres.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 12, 2, NULL, 'Habla mentira cada uno con su prójimo; Hablan con labios lisonjeros, y con doblez de corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 12, 3, NULL, 'Jehová destruirá todos los labios lisonjeros, Y la lengua que habla jactanciosamente;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 12, 4, NULL, 'A los que han dicho: Por nuestra lengua prevaleceremos; Nuestros labios son nuestros; ¿quién es señor de nosotros?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 12, 5, NULL, 'Por la opresión de los pobres, por el gemido de los menesterosos, Ahora me levantaré, dice Jehová; Pondré en salvo al que por ello suspira.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 12, 6, NULL, 'Las palabras de Jehová son palabras limpias, Como plata refinada en horno de tierra, Purificada siete veces.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 12, 7, NULL, 'Tú, Jehová, los guardarás; De esta generación los preservarás para siempre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 12, 8, NULL, 'Cercando andan los malos, Cuando la vileza es exaltada entre los hijos de los hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 13, 1, 'Plegaria pidiendo ayuda en la aflicción', '¿Hasta cuándo, Jehová? ¿Me olvidarás para siempre? ¿Hasta cuándo esconderás tu rostro de mí?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 13, 2, NULL, '¿Hasta cuándo pondré consejos en mi alma, Con tristezas en mi corazón cada día? ¿Hasta cuándo será enaltecido mi enemigo sobre mí?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 13, 3, NULL, 'Mira, respóndeme, oh Jehová Dios mío; Alumbra mis ojos, para que no duerma de muerte;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 13, 4, NULL, 'Para que no diga mi enemigo: Lo vencí. Mis enemigos se alegrarían, si yo resbalara.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 13, 5, NULL, 'Mas yo en tu misericordia he confiado; Mi corazón se alegrará en tu salvación.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 13, 6, NULL, 'Cantaré a Jehová, Porque me ha hecho bien.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 14, 1, 'Necedad y corrupción del hombre', 'Dice el necio en su corazón: No hay Dios. Se han corrompido, hacen obras abominables; No hay quien haga el bien.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 14, 2, NULL, 'Jehová miró desde los cielos sobre los hijos de los hombres, Para ver si había algún entendido, Que buscara a Dios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 14, 3, NULL, 'Todos se desviaron, a una se han corrompido; No hay quien haga lo bueno, no hay ni siquiera uno.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 14, 4, NULL, '¿No tienen discernimiento todos los que hacen iniquidad, Que devoran a mi pueblo como si comiesen pan, Y a Jehová no invocan?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 14, 5, NULL, 'Ellos temblaron de espanto; Porque Dios está con la generación de los justos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 14, 6, NULL, 'Del consejo del pobre se han burlado, Pero Jehová es su esperanza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 14, 7, NULL, '¡Oh, que de Sion saliera la salvación de Israel! Cuando Jehová hiciere volver a los cautivos de su pueblo, Se gozará Jacob, y se alegrará Israel.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 15, 1, 'Los que habitarán en el monte santo de Dios', 'Jehová, ¿quién habitará en tu tabernáculo? ¿Quién morará en tu monte santo?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 15, 2, NULL, 'El que anda en integridad y hace justicia, Y habla verdad en su corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 15, 3, NULL, 'El que no calumnia con su lengua, Ni hace mal a su prójimo, Ni admite reproche alguno contra su vecino.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 15, 4, NULL, 'Aquel a cuyos ojos el vil es menospreciado, Pero honra a los que temen a Jehová. El que aun jurando en daño suyo, no por eso cambia;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 15, 5, NULL, 'Quien su dinero no dio a usura, Ni contra el inocente admitió cohecho. El que hace estas cosas, no resbalará jamás.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 16, 1, 'Una herencia escogida', 'Guárdame, oh Dios, porque en ti he confiado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 16, 2, NULL, 'Oh alma mía, dijiste a Jehová: Tú eres mi Señor; No hay para mí bien fuera de ti.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 16, 3, NULL, 'Para los santos que están en la tierra, Y para los íntegros, es toda mi complacencia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 16, 4, NULL, 'Se multiplicarán los dolores de aquellos que sirven diligentes a otro dios. No ofreceré yo sus libaciones de sangre, Ni en mis labios tomaré sus nombres.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 16, 5, NULL, 'Jehová es la porción de mi herencia y de mi copa; Tú sustentas mi suerte.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 16, 6, NULL, 'Las cuerdas me cayeron en lugares deleitosos, Y es hermosa la heredad que me ha tocado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 16, 7, NULL, 'Bendeciré a Jehová que me aconseja; Aun en las noches me enseña mi conciencia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 16, 8, NULL, 'A Jehová he puesto siempre delante de mí; Porque está a mi diestra, no seré conmovido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 16, 9, NULL, 'Se alegró por tanto mi corazón, y se gozó mi alma; Mi carne también reposará confiadamente;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 16, 10, NULL, 'Porque no dejarás mi alma en el Seol, Ni permitirás que tu santo vea corrupción.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 16, 11, NULL, 'Me mostrarás la senda de la vida; En tu presencia hay plenitud de gozo; Delicias a tu diestra para siempre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 17, 1, 'Plegaria pidiendo protección contra los opresores', 'Oye, oh Jehová, una causa justa; está atento a mi clamor. Escucha mi oración hecha de labios sin engaño.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 17, 2, NULL, 'De tu presencia proceda mi vindicación; Vean tus ojos la rectitud.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 17, 3, NULL, 'Tú has probado mi corazón, me has visitado de noche; Me has puesto a prueba, y nada inicuo hallaste; He resuelto que mi boca no haga transgresión.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 17, 4, NULL, 'En cuanto a las obras humanas, por la palabra de tus labios Yo me he guardado de las sendas de los violentos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 17, 5, NULL, 'Sustenta mis pasos en tus caminos, Para que mis pies no resbalen.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 17, 6, NULL, 'Yo te he invocado, por cuanto tú me oirás, oh Dios; Inclina a mí tu oído, escucha mi palabra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 17, 7, NULL, 'Muestra tus maravillosas misericordias, tú que salvas a los que se refugian a tu diestra, De los que se levantan contra ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 17, 8, NULL, 'Guárdame como a la niña de tus ojos; Escóndeme bajo la sombra de tus alas,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 17, 9, NULL, 'De la vista de los malos que me oprimen, De mis enemigos que buscan mi vida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 17, 10, NULL, 'Envueltos están con su grosura; Con su boca hablan arrogantemente.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 17, 11, NULL, 'Han cercado ahora nuestros pasos; Tienen puestos sus ojos para echarnos por tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 17, 12, NULL, 'Son como león que desea hacer presa, Y como leoncillo que está en su escondite.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 17, 13, NULL, 'Levántate, oh Jehová; Sal a su encuentro, póstrales; Libra mi alma de los malos con tu espada,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 17, 14, NULL, 'De los hombres con tu mano, oh Jehová, De los hombres mundanos, cuya porción la tienen en esta vida, Y cuyo vientre está lleno de tu tesoro. Sacian a sus hijos, Y aun sobra para sus pequeñuelos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 17, 15, NULL, 'En cuanto a mí, veré tu rostro en justicia; Estaré satisfecho cuando despierte a tu semejanza.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 1, 'Acción de gracias por la victoria', 'Te amo, oh Jehová, fortaleza mía.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 2, NULL, 'Jehová, roca mía y castillo mío, y mi libertador; Dios mío, fortaleza mía, en él confiaré; Mi escudo, y la fuerza de mi salvación, mi alto refugio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 3, NULL, 'Invocaré a Jehová, quien es digno de ser alabado, Y seré salvo de mis enemigos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 4, NULL, 'Me rodearon ligaduras de muerte, Y torrentes de perversidad me atemorizaron.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 5, NULL, 'Ligaduras del Seol me rodearon, Me tendieron lazos de muerte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 6, NULL, 'En mi angustia invoqué a Jehová, Y clamé a mi Dios. Él oyó mi voz desde su templo, Y mi clamor llegó delante de él, a sus oídos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 7, NULL, 'La tierra fue conmovida y tembló; Se conmovieron los cimientos de los montes, Y se estremecieron, porque se indignó él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 8, NULL, 'Humo subió de su nariz, Y de su boca fuego consumidor; Carbones fueron por él encendidos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 9, NULL, 'Inclinó los cielos, y descendió; Y había densas tinieblas debajo de sus pies.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 10, NULL, 'Cabalgó sobre un querubín, y voló; Voló sobre las alas del viento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 11, NULL, 'Puso tinieblas por su escondedero, por cortina suya alrededor de sí; Oscuridad de aguas, nubes de los cielos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 12, NULL, 'Por el resplandor de su presencia, sus nubes pasaron; Granizo y carbones ardientes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 13, NULL, 'Tronó en los cielos Jehová, Y el Altísimo dio su voz; Granizo y carbones de fuego.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 14, NULL, 'Envió sus saetas, y los dispersó; Lanzó relámpagos, y los destruyó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 15, NULL, 'Entonces aparecieron los abismos de las aguas, Y quedaron al descubierto los cimientos del mundo, A tu reprensión, oh Jehová, Por el soplo del aliento de tu nariz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 16, NULL, 'Envió desde lo alto; me tomó, Me sacó de las muchas aguas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 17, NULL, 'Me libró de mi poderoso enemigo, Y de los que me aborrecían; pues eran más fuertes que yo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 18, NULL, 'Me asaltaron en el día de mi quebranto, Mas Jehová fue mi apoyo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 19, NULL, 'Me sacó a lugar espacioso; Me libró, porque se agradó de mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 20, NULL, 'Jehová me ha premiado conforme a mi justicia; Conforme a la limpieza de mis manos me ha recompensado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 21, NULL, 'Porque yo he guardado los caminos de Jehová, Y no me aparté impíamente de mi Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 22, NULL, 'Pues todos sus juicios estuvieron delante de mí, Y no me he apartado de sus estatutos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 23, NULL, 'Fui recto para con él, y me he guardado de mi maldad,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 24, NULL, 'Por lo cual me ha recompensado Jehová conforme a mi justicia; Conforme a la limpieza de mis manos delante de su vista.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 25, NULL, 'Con el misericordioso te mostrarás misericordioso, Y recto para con el hombre íntegro.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 26, NULL, 'Limpio te mostrarás para con el limpio, Y severo serás para con el perverso.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 27, NULL, 'Porque tú salvarás al pueblo afligido, Y humillarás los ojos altivos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 28, NULL, 'Tú encenderás mi lámpara; Jehová mi Dios alumbrará mis tinieblas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 29, NULL, 'Contigo desbarataré ejércitos, Y con mi Dios asaltaré muros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 30, NULL, 'En cuanto a Dios, perfecto es su camino, Y acrisolada la palabra de Jehová; Escudo es a todos los que en él esperan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 31, NULL, 'Porque ¿quién es Dios sino solo Jehová? ¿Y qué roca hay fuera de nuestro Dios?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 32, NULL, 'Dios es el que me ciñe de poder, Y quien hace perfecto mi camino;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 33, NULL, 'Quien hace mis pies como de ciervas, Y me hace estar firme sobre mis alturas;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 34, NULL, 'Quien adiestra mis manos para la batalla, Para entesar con mis brazos el arco de bronce.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 35, NULL, 'Me diste asimismo el escudo de tu salvación; Tu diestra me sustentó, Y tu benignidad me ha engrandecido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 36, NULL, 'Ensanchaste mis pasos debajo de mí, Y mis pies no han resbalado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 37, NULL, 'Perseguí a mis enemigos, y los alcancé, Y no volví hasta acabarlos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 38, NULL, 'Los herí de modo que no se levantasen; Cayeron debajo de mis pies.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 39, NULL, 'Pues me ceñiste de fuerzas para la pelea; Has humillado a mis enemigos debajo de mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 40, NULL, 'Has hecho que mis enemigos me vuelvan las espaldas, Para que yo destruya a los que me aborrecen.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 41, NULL, 'Clamaron, y no hubo quien salvase; Aun a Jehová, pero no los oyó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 42, NULL, 'Y los molí como polvo delante del viento; Los eché fuera como lodo de las calles.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 43, NULL, 'Me has librado de las contiendas del pueblo; Me has hecho cabeza de las naciones; Pueblo que yo no conocía me sirvió.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 44, NULL, 'Al oír de mí me obedecieron; Los hijos de extraños se sometieron a mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 45, NULL, 'Los extraños se debilitaron Y salieron temblando de sus encierros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 46, NULL, 'Viva Jehová, y bendita sea mi roca, Y enaltecido sea el Dios de mi salvación;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 47, NULL, 'El Dios que venga mis agravios, Y somete pueblos debajo de mí;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 48, NULL, 'El que me libra de mis enemigos, Y aun me eleva sobre los que se levantan contra mí; Me libraste de varón violento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 49, NULL, 'Por tanto yo te confesaré entre las naciones, oh Jehová, Y cantaré a tu nombre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 18, 50, NULL, 'Grandes triunfos da a su rey, Y hace misericordia a su ungido, A David y a su descendencia, para siempre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 19, 1, 'Las obras y la palabra de Dios', 'Los cielos cuentan la gloria de Dios, Y el firmamento anuncia la obra de sus manos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 19, 2, NULL, 'Un día emite palabra a otro día, Y una noche a otra noche declara sabiduría.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 19, 3, NULL, 'No hay lenguaje, ni palabras, Ni es oída su voz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 19, 4, NULL, 'Por toda la tierra salió su voz, Y hasta el extremo del mundo sus palabras. En ellos puso tabernáculo para el sol;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 19, 5, NULL, 'Y este, como esposo que sale de su tálamo, Se alegra cual gigante para correr el camino.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 19, 6, NULL, 'De un extremo de los cielos es su salida, Y su curso hasta el término de ellos; Y nada hay que se esconda de su calor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 19, 7, NULL, 'La ley de Jehová es perfecta, que convierte el alma; El testimonio de Jehová es fiel, que hace sabio al sencillo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 19, 8, NULL, 'Los mandamientos de Jehová son rectos, que alegran el corazón; El precepto de Jehová es puro, que alumbra los ojos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 19, 9, NULL, 'El temor de Jehová es limpio, que permanece para siempre; Los juicios de Jehová son verdad, todos justos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 19, 10, NULL, 'Deseables son más que el oro, y más que mucho oro afinado; Y dulces más que miel, y que la que destila del panal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 19, 11, NULL, 'Tu siervo es además amonestado con ellos; En guardarlos hay grande galardón.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 19, 12, NULL, '¿Quién podrá entender sus propios errores? Líbrame de los que me son ocultos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 19, 13, NULL, 'Preserva también a tu siervo de las soberbias; Que no se enseñoreen de mí; Entonces seré íntegro, y estaré limpio de gran rebelión.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 19, 14, NULL, 'Sean gratos los dichos de mi boca y la meditación de mi corazón delante de ti, Oh Jehová, roca mía, y redentor mío.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 20, 1, 'Oración pidiendo la victoria', 'Jehová te oiga en el día de conflicto; El nombre del Dios de Jacob te defienda.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 20, 2, NULL, 'Te envíe ayuda desde el santuario, Y desde Sion te sostenga.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 20, 3, NULL, 'Haga memoria de todas tus ofrendas, Y acepte tu holocausto. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 20, 4, NULL, 'Te dé conforme al deseo de tu corazón, Y cumpla todo tu consejo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 20, 5, NULL, 'Nosotros nos alegraremos en tu salvación, Y alzaremos pendón en el nombre de nuestro Dios; Conceda Jehová todas tus peticiones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 20, 6, NULL, 'Ahora conozco que Jehová salva a su ungido; Lo oirá desde sus santos cielos Con la potencia salvadora de su diestra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 20, 7, NULL, 'Estos confían en carros, y aquellos en caballos; Mas nosotros del nombre de Jehová nuestro Dios tendremos memoria.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 20, 8, NULL, 'Ellos flaquean y caen, Mas nosotros nos levantamos, y estamos en pie.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 20, 9, NULL, 'Salva, Jehová; Que el Rey nos oiga en el día que lo invoquemos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 21, 1, 'Alabanza por haber sido librado del enemigo', 'El rey se alegra en tu poder, oh Jehová; Y en tu salvación, ¡cómo se goza!', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 21, 2, NULL, 'Le has concedido el deseo de su corazón, Y no le negaste la petición de sus labios. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 21, 3, NULL, 'Porque le has salido al encuentro con bendiciones de bien; Corona de oro fino has puesto sobre su cabeza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 21, 4, NULL, 'Vida te demandó, y se la diste; Largura de días eternamente y para siempre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 21, 5, NULL, 'Grande es su gloria en tu salvación; Honra y majestad has puesto sobre él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 21, 6, NULL, 'Porque lo has bendecido para siempre; Lo llenaste de alegría con tu presencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 21, 7, NULL, 'Por cuanto el rey confía en Jehová, Y en la misericordia del Altísimo, no será conmovido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 21, 8, NULL, 'Alcanzará tu mano a todos tus enemigos; Tu diestra alcanzará a los que te aborrecen.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 21, 9, NULL, 'Los pondrás como horno de fuego en el tiempo de tu ira; Jehová los deshará en su ira, Y fuego los consumirá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 21, 10, NULL, 'Su fruto destruirás de la tierra, Y su descendencia de entre los hijos de los hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 21, 11, NULL, 'Porque intentaron el mal contra ti; Fraguaron maquinaciones, mas no prevalecerán,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 21, 12, NULL, 'Pues tú los pondrás en fuga; En tus cuerdas dispondrás saetas contra sus rostros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 21, 13, NULL, 'Engrandécete, oh Jehová, en tu poder; Cantaremos y alabaremos tu poderío.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 22, 1, 'Un grito de angustia y un canto de alabanza', 'Dios mío, Dios mío, ¿por qué me has desamparado? ¿Por qué estás tan lejos de mi salvación, y de las palabras de mi clamor?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 22, 2, NULL, 'Dios mío, clamo de día, y no respondes; Y de noche, y no hay para mí reposo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 22, 3, NULL, 'Pero tú eres santo, Tú que habitas entre las alabanzas de Israel.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 22, 4, NULL, 'En ti esperaron nuestros padres; Esperaron, y tú los libraste.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 22, 5, NULL, 'Clamaron a ti, y fueron librados; Confiaron en ti, y no fueron avergonzados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 22, 6, NULL, 'Mas yo soy gusano, y no hombre; Oprobio de los hombres, y despreciado del pueblo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 22, 7, NULL, 'Todos los que me ven me escarnecen; Estiran la boca, menean la cabeza, diciendo:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 22, 8, NULL, 'Se encomendó a Jehová; líbrele él; Sálvele, puesto que en él se complacía.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 22, 9, NULL, 'Pero tú eres el que me sacó del vientre; El que me hizo estar confiado desde que estaba a los pechos de mi madre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 22, 10, NULL, 'Sobre ti fui echado desde antes de nacer; Desde el vientre de mi madre, tú eres mi Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 22, 11, NULL, 'No te alejes de mí, porque la angustia está cerca; Porque no hay quien ayude.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 22, 12, NULL, 'Me han rodeado muchos toros; Fuertes toros de Basán me han cercado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 22, 13, NULL, 'Abrieron sobre mí su boca Como león rapaz y rugiente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 22, 14, NULL, 'He sido derramado como aguas, Y todos mis huesos se descoyuntaron; Mi corazón fue como cera, Derritiéndose en medio de mis entrañas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 22, 15, NULL, 'Como un tiesto se secó mi vigor, Y mi lengua se pegó a mi paladar, Y me has puesto en el polvo de la muerte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 22, 16, NULL, 'Porque perros me han rodeado; Me ha cercado cuadrilla de malignos; Horadaron mis manos y mis pies.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 22, 17, NULL, 'Contar puedo todos mis huesos; Entre tanto, ellos me miran y me observan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 22, 18, NULL, 'Repartieron entre sí mis vestidos, Y sobre mi ropa echaron suertes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 22, 19, NULL, 'Mas tú, Jehová, no te alejes; Fortaleza mía, apresúrate a socorrerme.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 22, 20, NULL, 'Libra de la espada mi alma, Del poder del perro mi vida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 22, 21, NULL, 'Sálvame de la boca del león, Y líbrame de los cuernos de los búfalos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 22, 22, NULL, 'Anunciaré tu nombre a mis hermanos; En medio de la congregación te alabaré.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 22, 23, NULL, 'Los que teméis a Jehová, alabadle; Glorificadle, descendencia toda de Jacob, Y temedle vosotros, descendencia toda de Israel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 22, 24, NULL, 'Porque no menospreció ni abominó la aflicción del afligido, Ni de él escondió su rostro; Sino que cuando clamó a él, le oyó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 22, 25, NULL, 'De ti será mi alabanza en la gran congregación; Mis votos pagaré delante de los que le temen.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 22, 26, NULL, 'Comerán los humildes, y serán saciados; Alabarán a Jehová los que le buscan; Vivirá vuestro corazón para siempre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 22, 27, NULL, 'Se acordarán, y se volverán a Jehová todos los confines de la tierra, Y todas las familias de las naciones adorarán delante de ti.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 22, 28, NULL, 'Porque de Jehová es el reino, Y él regirá las naciones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 22, 29, NULL, 'Comerán y adorarán todos los poderosos de la tierra; Se postrarán delante de él todos los que descienden al polvo, Aun el que no puede conservar la vida a su propia alma.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 22, 30, NULL, 'La posteridad le servirá; Esto será contado de Jehová hasta la postrera generación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 22, 31, NULL, 'Vendrán, y anunciarán su justicia; A pueblo no nacido aún, anunciarán que él hizo esto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 23, 1, 'Jehová es mi pastor', 'Jehová es mi pastor; nada me faltará.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 23, 2, NULL, 'En lugares de delicados pastos me hará descansar; Junto a aguas de reposo me pastoreará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 23, 3, NULL, 'Confortará mi alma; Me guiará por sendas de justicia por amor de su nombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 23, 4, NULL, 'Aunque ande en valle de sombra de muerte, No temeré mal alguno, porque tú estarás conmigo; Tu vara y tu cayado me infundirán aliento.', 1, 'spa', 'RVR1960', NULL);\n"
;

  public static final String SQL_PARTE_2 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Sal', 23, 5, NULL, 'Aderezas mesa delante de mí en presencia de mis angustiadores; Unges mi cabeza con aceite; mi copa está rebosando.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 23, 6, NULL, 'Ciertamente el bien y la misericordia me seguirán todos los días de mi vida, Y en la casa de Jehová moraré por largos días.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 24, 1, 'El rey de gloria', 'De Jehová es la tierra y su plenitud; El mundo, y los que en él habitan.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 24, 2, NULL, 'Porque él la fundó sobre los mares, Y la afirmó sobre los ríos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 24, 3, NULL, '¿Quién subirá al monte de Jehová? ¿Y quién estará en su lugar santo?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 24, 4, NULL, 'El limpio de manos y puro de corazón; El que no ha elevado su alma a cosas vanas, Ni jurado con engaño.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 24, 5, NULL, 'Él recibirá bendición de Jehová, Y justicia del Dios de salvación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 24, 6, NULL, 'Tal es la generación de los que le buscan, De los que buscan tu rostro, oh Dios de Jacob. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 24, 7, NULL, 'Alzad, oh puertas, vuestras cabezas, Y alzaos vosotras, puertas eternas, Y entrará el Rey de gloria.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 24, 8, NULL, '¿Quién es este Rey de gloria? Jehová el fuerte y valiente, Jehová el poderoso en batalla.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 24, 9, NULL, 'Alzad, oh puertas, vuestras cabezas, Y alzaos vosotras, puertas eternas, Y entrará el Rey de gloria.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 24, 10, NULL, '¿Quién es este Rey de gloria? Jehová de los ejércitos, Él es el Rey de la gloria. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 25, 1, 'David implora dirección, perdón y protección', 'A ti, oh Jehová, levantaré mi alma.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 25, 2, NULL, 'Dios mío, en ti confío; No sea yo avergonzado, No se alegren de mí mis enemigos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 25, 3, NULL, 'Ciertamente ninguno de cuantos esperan en ti será confundido; Serán avergonzados los que se rebelan sin causa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 25, 4, NULL, 'Muéstrame, oh Jehová, tus caminos; Enséñame tus sendas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 25, 5, NULL, 'Encamíname en tu verdad, y enséñame, Porque tú eres el Dios de mi salvación; En ti he esperado todo el día.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 25, 6, NULL, 'Acuérdate, oh Jehová, de tus piedades y de tus misericordias, Que son perpetuas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 25, 7, NULL, 'De los pecados de mi juventud, y de mis rebeliones, no te acuerdes; Conforme a tu misericordia acuérdate de mí, Por tu bondad, oh Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 25, 8, NULL, 'Bueno y recto es Jehová; Por tanto, él enseñará a los pecadores el camino.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 25, 9, NULL, 'Encaminará a los humildes por el juicio, Y enseñará a los mansos su carrera.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 25, 10, NULL, 'Todas las sendas de Jehová son misericordia y verdad, Para los que guardan su pacto y sus testimonios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 25, 11, NULL, 'Por amor de tu nombre, oh Jehová, Perdonarás también mi pecado, que es grande.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 25, 12, NULL, '¿Quién es el hombre que teme a Jehová? Él le enseñará el camino que ha de escoger.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 25, 13, NULL, 'Gozará él de bienestar, Y su descendencia heredará la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 25, 14, NULL, 'La comunión íntima de Jehová es con los que le temen, Y a ellos hará conocer su pacto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 25, 15, NULL, 'Mis ojos están siempre hacia Jehová, Porque él sacará mis pies de la red.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 25, 16, NULL, 'Mírame, y ten misericordia de mí, Porque estoy solo y afligido.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 25, 17, NULL, 'Las angustias de mi corazón se han aumentado; Sácame de mis congojas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 25, 18, NULL, 'Mira mi aflicción y mi trabajo, Y perdona todos mis pecados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 25, 19, NULL, 'Mira mis enemigos, cómo se han multiplicado, Y con odio violento me aborrecen.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 25, 20, NULL, 'Guarda mi alma, y líbrame; No sea yo avergonzado, porque en ti confié.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 25, 21, NULL, 'Integridad y rectitud me guarden, Porque en ti he esperado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 25, 22, NULL, 'Redime, oh Dios, a Israel De todas sus angustias.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 26, 1, 'Declaración de integridad', 'Júzgame, oh Jehová, porque yo en mi integridad he andado; He confiado asimismo en Jehová sin titubear.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 26, 2, NULL, 'Escudríñame, oh Jehová, y pruébame; Examina mis íntimos pensamientos y mi corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 26, 3, NULL, 'Porque tu misericordia está delante de mis ojos, Y ando en tu verdad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 26, 4, NULL, 'No me he sentado con hombres hipócritas, Ni entré con los que andan simuladamente.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 26, 5, NULL, 'Aborrecí la reunión de los malignos, Y con los impíos nunca me senté.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 26, 6, NULL, 'Lavaré en inocencia mis manos, Y así andaré alrededor de tu altar, oh Jehová,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 26, 7, NULL, 'Para exclamar con voz de acción de gracias, Y para contar todas tus maravillas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 26, 8, NULL, 'Jehová, la habitación de tu casa he amado, Y el lugar de la morada de tu gloria.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 26, 9, NULL, 'No arrebates con los pecadores mi alma, Ni mi vida con hombres sanguinarios,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 26, 10, NULL, 'En cuyas manos está el mal, Y su diestra está llena de sobornos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 26, 11, NULL, 'Mas yo andaré en mi integridad; Redímeme, y ten misericordia de mí.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 26, 12, NULL, 'Mi pie ha estado en rectitud; En las congregaciones bendeciré a Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 27, 1, 'Jehová es mi luz y mi salvación', 'Jehová es mi luz y mi salvación; ¿de quién temeré? Jehová es la fortaleza de mi vida; ¿de quién he de atemorizarme?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 27, 2, NULL, 'Cuando se juntaron contra mí los malignos, mis angustiadores y mis enemigos, Para comer mis carnes, ellos tropezaron y cayeron.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 27, 3, NULL, 'Aunque un ejército acampe contra mí, No temerá mi corazón; Aunque contra mí se levante guerra, Yo estaré confiado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 27, 4, NULL, 'Una cosa he demandado a Jehová, esta buscaré; Que esté yo en la casa de Jehová todos los días de mi vida, Para contemplar la hermosura de Jehová, y para inquirir en su templo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 27, 5, NULL, 'Porque él me esconderá en su tabernáculo en el día del mal; Me ocultará en lo reservado de su morada; Sobre una roca me pondrá en alto.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 27, 6, NULL, 'Luego levantará mi cabeza sobre mis enemigos que me rodean, Y yo sacrificaré en su tabernáculo sacrificios de júbilo; Cantaré y entonaré alabanzas a Jehová.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 27, 7, NULL, 'Oye, oh Jehová, mi voz con que a ti clamo; Ten misericordia de mí, y respóndeme.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 27, 8, NULL, 'Mi corazón ha dicho de ti: Buscad mi rostro. Tu rostro buscaré, oh Jehová;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 27, 9, NULL, 'No escondas tu rostro de mí. No apartes con ira a tu siervo; Mi ayuda has sido. No me dejes ni me desampares, Dios de mi salvación.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 27, 10, NULL, 'Aunque mi padre y mi madre me dejaran, Con todo, Jehová me recogerá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 27, 11, NULL, 'Enséñame, oh Jehová, tu camino, Y guíame por senda de rectitud A causa de mis enemigos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 27, 12, NULL, 'No me entregues a la voluntad de mis enemigos; Porque se han levantado contra mí testigos falsos, y los que respiran crueldad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 27, 13, NULL, 'Hubiera yo desmayado, si no creyese que veré la bondad de Jehová En la tierra de los vivientes.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 27, 14, NULL, 'Aguarda a Jehová; Esfuérzate, y aliéntese tu corazón; Sí, espera a Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 28, 1, 'Plegaria pidiendo ayuda, y alabanza por la respuesta', 'A ti clamaré, oh Jehová. Roca mía, no te desentiendas de mí, Para que no sea yo, dejándome tú, Semejante a los que descienden al sepulcro.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 28, 2, NULL, 'Oye la voz de mis ruegos cuando clamo a ti, Cuando alzo mis manos hacia tu santo templo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 28, 3, NULL, 'No me arrebates juntamente con los malos, Y con los que hacen iniquidad, Los cuales hablan paz con sus prójimos, Pero la maldad está en su corazón.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 28, 4, NULL, 'Dales conforme a su obra, y conforme a la perversidad de sus hechos; Dales su merecido conforme a la obra de sus manos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 28, 5, NULL, 'Por cuanto no atendieron a los hechos de Jehová, Ni a la obra de sus manos, Él los derribará, y no los edificará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 28, 6, NULL, 'Bendito sea Jehová, Que oyó la voz de mis ruegos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 28, 7, NULL, 'Jehová es mi fortaleza y mi escudo; En él confió mi corazón, y fui ayudado, Por lo que se gozó mi corazón, Y con mi cántico le alabaré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 28, 8, NULL, 'Jehová es la fortaleza de su pueblo, Y el refugio salvador de su ungido.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 28, 9, NULL, 'Salva a tu pueblo, y bendice a tu heredad; Y pastoréales y susténtales para siempre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 29, 1, 'Poder y gloria de Jehová', 'Tributad a Jehová, oh hijos de los poderosos, Dad a Jehová la gloria y el poder.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 29, 2, NULL, 'Dad a Jehová la gloria debida a su nombre; Adorad a Jehová en la hermosura de la santidad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 29, 3, NULL, 'Voz de Jehová sobre las aguas; Truena el Dios de gloria, Jehová sobre las muchas aguas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 29, 4, NULL, 'Voz de Jehová con potencia; Voz de Jehová con gloria.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 29, 5, NULL, 'Voz de Jehová que quebranta los cedros; Quebrantó Jehová los cedros del Líbano.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 29, 6, NULL, 'Los hizo saltar como becerros; Al Líbano y al Sirión como hijos de búfalos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 29, 7, NULL, 'Voz de Jehová que derrama llamas de fuego;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 29, 8, NULL, 'Voz de Jehová que hace temblar el desierto; Hace temblar Jehová el desierto de Cades.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 29, 9, NULL, 'Voz de Jehová que desgaja las encinas, Y desnuda los bosques; En su templo todo proclama su gloria.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 29, 10, NULL, 'Jehová preside en el diluvio, Y se sienta Jehová como rey para siempre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 29, 11, NULL, 'Jehová dará poder a su pueblo; Jehová bendecirá a su pueblo con paz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 30, 1, 'Acción de gracias por haber sido librado de la muerte', 'Te glorificaré, oh Jehová, porque me has exaltado, Y no permitiste que mis enemigos se alegraran de mí.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 30, 2, NULL, 'Jehová Dios mío, A ti clamé, y me sanaste.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 30, 3, NULL, 'Oh Jehová, hiciste subir mi alma del Seol; Me diste vida, para que no descendiese a la sepultura.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 30, 4, NULL, 'Cantad a Jehová, vosotros sus santos, Y celebrad la memoria de su santidad.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 30, 5, NULL, 'Porque un momento será su ira, Pero su favor dura toda la vida. Por la noche durará el lloro, Y a la mañana vendrá la alegría.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 30, 6, NULL, 'En mi prosperidad dije yo: No seré jamás conmovido,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 30, 7, NULL, 'Porque tú, Jehová, con tu favor me afirmaste como monte fuerte. Escondiste tu rostro, fui turbado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 30, 8, NULL, 'A ti, oh Jehová, clamaré, Y al Señor suplicaré.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 30, 9, NULL, '¿Qué provecho hay en mi muerte cuando descienda a la sepultura? ¿Te alabará el polvo? ¿Anunciará tu verdad?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 30, 10, NULL, 'Oye, oh Jehová, y ten misericordia de mí; Jehová, sé tú mi ayudador.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 30, 11, NULL, 'Has cambiado mi lamento en baile; Desataste mi cilicio, y me ceñiste de alegría.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 30, 12, NULL, 'Por tanto, a ti cantaré, gloria mía, y no estaré callado. Jehová Dios mío, te alabaré para siempre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 31, 1, 'Declaración de confianza', 'En ti, oh Jehová, he confiado; no sea yo confundido jamás; Líbrame en tu justicia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 31, 2, NULL, 'Inclina a mí tu oído, líbrame pronto; Sé tú mi roca fuerte, y fortaleza para salvarme.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 31, 3, NULL, 'Porque tú eres mi roca y mi castillo; Por tu nombre me guiarás y me encaminarás.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 31, 4, NULL, 'Sácame de la red que han escondido para mí, Pues tú eres mi refugio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 31, 5, NULL, 'En tu mano encomiendo mi espíritu; Tú me has redimido, oh Jehová, Dios de verdad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 31, 6, NULL, 'Aborrezco a los que esperan en vanidades ilusorias; Mas yo en Jehová he esperado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 31, 7, NULL, 'Me gozaré y alegraré en tu misericordia, Porque has visto mi aflicción; Has conocido mi alma en las angustias.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 31, 8, NULL, 'No me entregaste en mano del enemigo; Pusiste mis pies en lugar espacioso.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 31, 9, NULL, 'Ten misericordia de mí, oh Jehová, porque estoy en angustia; Se han consumido de tristeza mis ojos, mi alma también y mi cuerpo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 31, 10, NULL, 'Porque mi vida se va gastando de dolor, y mis años de suspirar; Se agotan mis fuerzas a causa de mi iniquidad, y mis huesos se han consumido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 31, 11, NULL, 'De todos mis enemigos soy objeto de oprobio, Y de mis vecinos mucho más, y el horror de mis conocidos; Los que me ven fuera huyen de mí.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 31, 12, NULL, 'He sido olvidado de su corazón como un muerto; He venido a ser como un vaso quebrado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 31, 13, NULL, 'Porque oigo la calumnia de muchos; El miedo me asalta por todas partes, Mientras consultan juntos contra mí E idean quitarme la vida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 31, 14, NULL, 'Mas yo en ti confío, oh Jehová; Digo: Tú eres mi Dios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 31, 15, NULL, 'En tu mano están mis tiempos; Líbrame de la mano de mis enemigos y de mis perseguidores.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 31, 16, NULL, 'Haz resplandecer tu rostro sobre tu siervo; Sálvame por tu misericordia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 31, 17, NULL, 'No sea yo avergonzado, oh Jehová, ya que te he invocado; Sean avergonzados los impíos, estén mudos en el Seol.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 31, 18, NULL, 'Enmudezcan los labios mentirosos, Que hablan contra el justo cosas duras Con soberbia y menosprecio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 31, 19, NULL, '¡Cuán grande es tu bondad, que has guardado para los que te temen, Que has mostrado a los que esperan en ti, delante de los hijos de los hombres!', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 31, 20, NULL, 'En lo secreto de tu presencia los esconderás de la conspiración del hombre; Los pondrás en un tabernáculo a cubierto de contención de lenguas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 31, 21, NULL, 'Bendito sea Jehová, Porque ha hecho maravillosa su misericordia para conmigo en ciudad fortificada.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 31, 22, NULL, 'Decía yo en mi premura: Cortado soy de delante de tus ojos; Pero tú oíste la voz de mis ruegos cuando a ti clamaba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 31, 23, NULL, 'Amad a Jehová, todos vosotros sus santos; A los fieles guarda Jehová, Y paga abundantemente al que procede con soberbia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 31, 24, NULL, 'Esforzaos todos vosotros los que esperáis en Jehová, Y tome aliento vuestro corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 32, 1, 'La dicha del perdón', 'Bienaventurado aquel cuya transgresión ha sido perdonada, y cubierto su pecado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 32, 2, NULL, 'Bienaventurado el hombre a quien Jehová no culpa de iniquidad, Y en cuyo espíritu no hay engaño.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 32, 3, NULL, 'Mientras callé, se envejecieron mis huesos En mi gemir todo el día.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 32, 4, NULL, 'Porque de día y de noche se agravó sobre mí tu mano; Se volvió mi verdor en sequedades de verano. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 32, 5, NULL, 'Mi pecado te declaré, y no encubrí mi iniquidad. Dije: Confesaré mis transgresiones a Jehová; Y tú perdonaste la maldad de mi pecado. Selah', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 32, 6, NULL, 'Por esto orará a ti todo santo en el tiempo en que puedas ser hallado; Ciertamente en la inundación de muchas aguas no llegarán estas a él.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 32, 7, NULL, 'Tú eres mi refugio; me guardarás de la angustia; Con cánticos de liberación me rodearás. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 32, 8, NULL, 'Te haré entender, y te enseñaré el camino en que debes andar; Sobre ti fijaré mis ojos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 32, 9, NULL, 'No seáis como el caballo, o como el mulo, sin entendimiento, Que han de ser sujetados con cabestro y con freno, Porque si no, no se acercan a ti.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 32, 10, NULL, 'Muchos dolores habrá para el impío; Mas al que espera en Jehová, le rodea la misericordia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 32, 11, NULL, 'Alegraos en Jehová y gozaos, justos; Y cantad con júbilo todos vosotros los rectos de corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 33, 1, 'Alabanzas al Creador y Preservador', 'Alegraos, oh justos, en Jehová; En los íntegros es hermosa la alabanza.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 33, 2, NULL, 'Aclamad a Jehová con arpa; Cantadle con salterio y decacordio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 33, 3, NULL, 'Cantadle cántico nuevo; Hacedlo bien, tañendo con júbilo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 33, 4, NULL, 'Porque recta es la palabra de Jehová, Y toda su obra es hecha con fidelidad.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 33, 5, NULL, 'Él ama justicia y juicio; De la misericordia de Jehová está llena la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 33, 6, NULL, 'Por la palabra de Jehová fueron hechos los cielos, Y todo el ejército de ellos por el aliento de su boca.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 33, 7, NULL, 'Él junta como montón las aguas del mar; Él pone en depósitos los abismos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 33, 8, NULL, 'Tema a Jehová toda la tierra; Teman delante de él todos los habitantes del mundo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 33, 9, NULL, 'Porque él dijo, y fue hecho; Él mandó, y existió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 33, 10, NULL, 'Jehová hace nulo el consejo de las naciones, Y frustra las maquinaciones de los pueblos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 33, 11, NULL, 'El consejo de Jehová permanecerá para siempre; Los pensamientos de su corazón por todas las generaciones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 33, 12, NULL, 'Bienaventurada la nación cuyo Dios es Jehová, El pueblo que él escogió como heredad para sí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 33, 13, NULL, 'Desde los cielos miró Jehová; Vio a todos los hijos de los hombres;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 33, 14, NULL, 'Desde el lugar de su morada miró Sobre todos los moradores de la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 33, 15, NULL, 'Él formó el corazón de todos ellos; Atento está a todas sus obras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 33, 16, NULL, 'El rey no se salva por la multitud del ejército, Ni escapa el valiente por la mucha fuerza.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 33, 17, NULL, 'Vano para salvarse es el caballo; La grandeza de su fuerza a nadie podrá librar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 33, 18, NULL, 'He aquí el ojo de Jehová sobre los que le temen, Sobre los que esperan en su misericordia,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 33, 19, NULL, 'Para librar sus almas de la muerte, Y para darles vida en tiempo de hambre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 33, 20, NULL, 'Nuestra alma espera a Jehová; Nuestra ayuda y nuestro escudo es él.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 33, 21, NULL, 'Por tanto, en él se alegrará nuestro corazón, Porque en su santo nombre hemos confiado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 33, 22, NULL, 'Sea tu misericordia, oh Jehová, sobre nosotros, Según esperamos en ti.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 34, 1, 'La protección divina', 'Bendeciré a Jehová en todo tiempo; Su alabanza estará de continuo en mi boca.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 34, 2, NULL, 'En Jehová se gloriará mi alma; Lo oirán los mansos, y se alegrarán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 34, 3, NULL, 'Engrandeced a Jehová conmigo, Y exaltemos a una su nombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 34, 4, NULL, 'Busqué a Jehová, y él me oyó, Y me libró de todos mis temores.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 34, 5, NULL, 'Los que miraron a él fueron alumbrados, Y sus rostros no fueron avergonzados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 34, 6, NULL, 'Este pobre clamó, y le oyó Jehová, Y lo libró de todas sus angustias.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 34, 7, NULL, 'El ángel de Jehová acampa alrededor de los que le temen, Y los defiende.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 34, 8, NULL, 'Gustad, y ved que es bueno Jehová; Dichoso el hombre que confía en él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 34, 9, NULL, 'Temed a Jehová, vosotros sus santos, Pues nada falta a los que le temen.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 34, 10, NULL, 'Los leoncillos necesitan, y tienen hambre; Pero los que buscan a Jehová no tendrán falta de ningún bien.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 34, 11, NULL, 'Venid, hijos, oídme; El temor de Jehová os enseñaré.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 34, 12, NULL, '¿Quién es el hombre que desea vida, Que desea muchos días para ver el bien?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 34, 13, NULL, 'Guarda tu lengua del mal, Y tus labios de hablar engaño.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 34, 14, NULL, 'Apártate del mal, y haz el bien; Busca la paz, y síguela.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 34, 15, NULL, 'Los ojos de Jehová están sobre los justos, Y atentos sus oídos al clamor de ellos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 34, 16, NULL, 'La ira de Jehová contra los que hacen mal, Para cortar de la tierra la memoria de ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 34, 17, NULL, 'Claman los justos, y Jehová oye, Y los libra de todas sus angustias.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 34, 18, NULL, 'Cercano está Jehová a los quebrantados de corazón; Y salva a los contritos de espíritu.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 34, 19, NULL, 'Muchas son las aflicciones del justo, Pero de todas ellas le librará Jehová.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 34, 20, NULL, 'Él guarda todos sus huesos; Ni uno de ellos será quebrantado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 34, 21, NULL, 'Matará al malo la maldad, Y los que aborrecen al justo serán condenados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 34, 22, NULL, 'Jehová redime el alma de sus siervos, Y no serán condenados cuantos en él confían.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 35, 1, 'Plegaria pidiendo ser librado de los enemigos', 'Disputa, oh Jehová, con los que contra mí contienden; Pelea contra los que me combaten.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 35, 2, NULL, 'Echa mano al escudo y al pavés, Y levántate en mi ayuda.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 35, 3, NULL, 'Saca la lanza, cierra contra mis perseguidores; Di a mi alma: Yo soy tu salvación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 35, 4, NULL, 'Sean avergonzados y confundidos los que buscan mi vida; Sean vueltos atrás y avergonzados los que mi mal intentan.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 35, 5, NULL, 'Sean como el tamo delante del viento, Y el ángel de Jehová los acose.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 35, 6, NULL, 'Sea su camino tenebroso y resbaladizo, Y el ángel de Jehová los persiga.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 35, 7, NULL, 'Porque sin causa escondieron para mí su red en un hoyo; Sin causa cavaron hoyo para mi alma.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 35, 8, NULL, 'Véngale el quebrantamiento sin que lo sepa, Y la red que él escondió lo prenda; Con quebrantamiento caiga en ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 35, 9, NULL, 'Entonces mi alma se alegrará en Jehová; Se regocijará en su salvación.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 35, 10, NULL, 'Todos mis huesos dirán: Jehová, ¿quién como tú, Que libras al afligido del más fuerte que él, Y al pobre y menesteroso del que le despoja?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 35, 11, NULL, 'Se levantan testigos malvados; De lo que no sé me preguntan;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 35, 12, NULL, 'Me devuelven mal por bien, Para afligir a mi alma.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 35, 13, NULL, 'Pero yo, cuando ellos enfermaron, me vestí de cilicio; Afligí con ayuno mi alma, Y mi oración se volvía a mi seno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 35, 14, NULL, 'Como por mi compañero, como por mi hermano andaba; Como el que trae luto por madre, enlutado me humillaba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 35, 15, NULL, 'Pero ellos se alegraron en mi adversidad, y se juntaron; Se juntaron contra mí gentes despreciables, y yo no lo entendía; Me despedazaban sin descanso;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 35, 16, NULL, 'Como lisonjeros, escarnecedores y truhanes, Crujieron contra mí sus dientes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 35, 17, NULL, 'Señor, ¿hasta cuándo verás esto? Rescata mi alma de sus destrucciones, mi vida de los leones.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 35, 18, NULL, 'Te confesaré en grande congregación; Te alabaré entre numeroso pueblo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 35, 19, NULL, 'No se alegren de mí los que sin causa son mis enemigos, Ni los que me aborrecen sin causa guiñen el ojo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 35, 20, NULL, 'Porque no hablan paz; Y contra los mansos de la tierra piensan palabras engañosas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 35, 21, NULL, 'Ensancharon contra mí su boca; Dijeron: ¡Ea, ea, nuestros ojos lo han visto!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 35, 22, NULL, 'Tú lo has visto, oh Jehová; no calles; Señor, no te alejes de mí.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 35, 23, NULL, 'Muévete y despierta para hacerme justicia, Dios mío y Señor mío, para defender mi causa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 35, 24, NULL, 'Júzgame conforme a tu justicia, Jehová Dios mío, Y no se alegren de mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 35, 25, NULL, 'No digan en su corazón: ¡Ea, alma nuestra! No digan: ¡Le hemos devorado!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 35, 26, NULL, 'Sean avergonzados y confundidos a una los que de mi mal se alegran; Vístanse de vergüenza y de confusión los que se engrandecen contra mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 35, 27, NULL, 'Canten y alégrense los que están a favor de mi justa causa, Y digan siempre: Sea exaltado Jehová, Que ama la paz de su siervo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 35, 28, NULL, 'Y mi lengua hablará de tu justicia Y de tu alabanza todo el día.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 36, 1, 'La misericordia de Dios', 'La iniquidad del impío me dice al corazón: No hay temor de Dios delante de sus ojos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 36, 2, NULL, 'Se lisonjea, por tanto, en sus propios ojos, De que su iniquidad no será hallada y aborrecida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 36, 3, NULL, 'Las palabras de su boca son iniquidad y fraude; Ha dejado de ser cuerdo y de hacer el bien.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 36, 4, NULL, 'Medita maldad sobre su cama; Está en camino no bueno, El mal no aborrece.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 36, 5, NULL, 'Jehová, hasta los cielos llega tu misericordia, Y tu fidelidad alcanza hasta las nubes.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 36, 6, NULL, 'Tu justicia es como los montes de Dios, Tus juicios, abismo grande. Oh Jehová, al hombre y al animal conservas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 36, 7, NULL, '¡Cuán preciosa, oh Dios, es tu misericordia! Por eso los hijos de los hombres se amparan bajo la sombra de tus alas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 36, 8, NULL, 'Serán completamente saciados de la grosura de tu casa, Y tú los abrevarás del torrente de tus delicias.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 36, 9, NULL, 'Porque contigo está el manantial de la vida; En tu luz veremos la luz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 36, 10, NULL, 'Extiende tu misericordia a los que te conocen, Y tu justicia a los rectos de corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 36, 11, NULL, 'No venga pie de soberbia contra mí, Y mano de impíos no me mueva.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 36, 12, NULL, 'Allí cayeron los hacedores de iniquidad; Fueron derribados, y no podrán levantarse.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 1, 'El camino de los malos', 'No te impacientes a causa de los malignos, Ni tengas envidia de los que hacen iniquidad.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 2, NULL, 'Porque como hierba serán pronto cortados, Y como la hierba verde se secarán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 3, NULL, 'Confía en Jehová, y haz el bien; Y habitarás en la tierra, y te apacentarás de la verdad.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 4, NULL, 'Deléitate asimismo en Jehová, Y él te concederá las peticiones de tu corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 5, NULL, 'Encomienda a Jehová tu camino, Y confía en él; y él hará.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 6, NULL, 'Exhibirá tu justicia como la luz, Y tu derecho como el mediodía.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 7, NULL, 'Guarda silencio ante Jehová, y espera en él. No te alteres con motivo del que prospera en su camino, Por el hombre que hace maldades.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 8, NULL, 'Deja la ira, y desecha el enojo; No te excites en manera alguna a hacer lo malo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 9, NULL, 'Porque los malignos serán destruidos, Pero los que esperan en Jehová, ellos heredarán la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 10, NULL, 'Pues de aquí a poco no existirá el malo; Observarás su lugar, y no estará allí.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 11, NULL, 'Pero los mansos heredarán la tierra, Y se recrearán con abundancia de paz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 12, NULL, 'Maquina el impío contra el justo, Y cruje contra él sus dientes;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 13, NULL, 'El Señor se reirá de él; Porque ve que viene su día.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 14, NULL, 'Los impíos desenvainan espada y entesan su arco, Para derribar al pobre y al menesteroso, Para matar a los de recto proceder.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 15, NULL, 'Su espada entrará en su mismo corazón, Y su arco será quebrado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 16, NULL, 'Mejor es lo poco del justo, Que las riquezas de muchos pecadores.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 17, NULL, 'Porque los brazos de los impíos serán quebrados; Mas el que sostiene a los justos es Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 18, NULL, 'Conoce Jehová los días de los perfectos, Y la heredad de ellos será para siempre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 19, NULL, 'No serán avergonzados en el mal tiempo, Y en los días de hambre serán saciados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 20, NULL, 'Mas los impíos perecerán, Y los enemigos de Jehová como la grasa de los carneros Serán consumidos; se disiparán como el humo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 21, NULL, 'El impío toma prestado, y no paga; Mas el justo tiene misericordia, y da.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 22, NULL, 'Porque los benditos de él heredarán la tierra; Y los malditos de él serán destruidos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 23, NULL, 'Por Jehová son ordenados los pasos del hombre, Y él aprueba su camino.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 24, NULL, 'Cuando el hombre cayere, no quedará postrado, Porque Jehová sostiene su mano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 25, NULL, 'Joven fui, y he envejecido, Y no he visto justo desamparado, Ni su descendencia que mendigue pan.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 26, NULL, 'En todo tiempo tiene misericordia, y presta; Y su descendencia es para bendición.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 27, NULL, 'Apártate del mal, y haz el bien, Y vivirás para siempre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 28, NULL, 'Porque Jehová ama la rectitud, Y no desampara a sus santos. Para siempre serán guardados; Mas la descendencia de los impíos será destruida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 29, NULL, 'Los justos heredarán la tierra, Y vivirán para siempre sobre ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 30, NULL, 'La boca del justo habla sabiduría, Y su lengua habla justicia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 31, NULL, 'La ley de su Dios está en su corazón; Por tanto, sus pies no resbalarán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 32, NULL, 'Acecha el impío al justo, Y procura matarlo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 33, NULL, 'Jehová no lo dejará en sus manos, Ni lo condenará cuando le juzgaren.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 34, NULL, 'Espera en Jehová, y guarda su camino, Y él te exaltará para heredar la tierra; Cuando sean destruidos los pecadores, lo verás.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 35, NULL, 'Vi yo al impío sumamente enaltecido, Y que se extendía como laurel verde.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 36, NULL, 'Pero él pasó, y he aquí ya no estaba; Lo busqué, y no fue hallado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 37, NULL, 'Considera al íntegro, y mira al justo; Porque hay un final dichoso para el hombre de paz.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 38, NULL, 'Mas los transgresores serán todos a una destruidos; La posteridad de los impíos será extinguida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 39, NULL, 'Pero la salvación de los justos es de Jehová, Y él es su fortaleza en el tiempo de la angustia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 37, 40, NULL, 'Jehová los ayudará y los librará; Los libertará de los impíos, y los salvará, Por cuanto en él esperaron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 38, 1, 'Oración de un penitente', 'Jehová, no me reprendas en tu furor, Ni me castigues en tu ira.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 38, 2, NULL, 'Porque tus saetas cayeron sobre mí, Y sobre mí ha descendido tu mano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 38, 3, NULL, 'Nada hay sano en mi carne, a causa de tu ira; Ni hay paz en mis huesos, a causa de mi pecado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 38, 4, NULL, 'Porque mis iniquidades se han agravado sobre mi cabeza; Como carga pesada se han agravado sobre mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 38, 5, NULL, 'Hieden y supuran mis llagas, A causa de mi locura.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 38, 6, NULL, 'Estoy encorvado, estoy humillado en gran manera, Ando enlutado todo el día.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 38, 7, NULL, 'Porque mis lomos están llenos de ardor, Y nada hay sano en mi carne.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 38, 8, NULL, 'Estoy debilitado y molido en gran manera; Gimo a causa de la conmoción de mi corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 38, 9, NULL, 'Señor, delante de ti están todos mis deseos, Y mi suspiro no te es oculto.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 38, 10, NULL, 'Mi corazón está acongojado, me ha dejado mi vigor, Y aun la luz de mis ojos me falta ya.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 38, 11, NULL, 'Mis amigos y mis compañeros se mantienen lejos de mi plaga, Y mis cercanos se han alejado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 38, 12, NULL, 'Los que buscan mi vida arman lazos, Y los que procuran mi mal hablan iniquidades, Y meditan fraudes todo el día.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 38, 13, NULL, 'Mas yo, como si fuera sordo, no oigo; Y soy como mudo que no abre la boca.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 38, 14, NULL, 'Soy, pues, como un hombre que no oye, Y en cuya boca no hay reprensiones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 38, 15, NULL, 'Porque en ti, oh Jehová, he esperado; Tú responderás, Jehová Dios mío.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 38, 16, NULL, 'Dije: No se alegren de mí; Cuando mi pie resbale, no se engrandezcan sobre mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 38, 17, NULL, 'Pero yo estoy a punto de caer, Y mi dolor está delante de mí continuamente.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 38, 18, NULL, 'Por tanto, confesaré mi maldad, Y me contristaré por mi pecado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 38, 19, NULL, 'Porque mis enemigos están vivos y fuertes, Y se han aumentado los que me aborrecen sin causa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 38, 20, NULL, 'Los que pagan mal por bien Me son contrarios, por seguir yo lo bueno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 38, 21, NULL, 'No me desampares, oh Jehová; Dios mío, no te alejes de mí.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 38, 22, NULL, 'Apresúrate a ayudarme, Oh Señor, mi salvación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 39, 1, 'El carácter transitorio de la vida', 'Yo dije: Atenderé a mis caminos, Para no pecar con mi lengua; Guardaré mi boca con freno, En tanto que el impío esté delante de mí.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 39, 2, NULL, 'Enmudecí con silencio, me callé aun respecto de lo bueno; Y se agravó mi dolor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 39, 3, NULL, 'Se enardeció mi corazón dentro de mí; En mi meditación se encendió fuego, Y así proferí con mi lengua:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 39, 4, NULL, 'Hazme saber, Jehová, mi fin, Y cuánta sea la medida de mis días; Sepa yo cuán frágil soy.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 39, 5, NULL, 'He aquí, diste a mis días término corto, Y mi edad es como nada delante de ti; Ciertamente es completa vanidad todo hombre que vive. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 39, 6, NULL, 'Ciertamente como una sombra es el hombre; Ciertamente en vano se afana; Amontona riquezas, y no sabe quién las recogerá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 39, 7, NULL, 'Y ahora, Señor, ¿qué esperaré? Mi esperanza está en ti.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 39, 8, NULL, 'Líbrame de todas mis transgresiones; No me pongas por escarnio del insensato.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 39, 9, NULL, 'Enmudecí, no abrí mi boca, Porque tú lo hiciste.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 39, 10, NULL, 'Quita de sobre mí tu plaga; Estoy consumido bajo los golpes de tu mano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 39, 11, NULL, 'Con castigos por el pecado corriges al hombre, Y deshaces como polilla lo más estimado de él; Ciertamente vanidad es todo hombre. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 39, 12, NULL, 'Oye mi oración, oh Jehová, y escucha mi clamor. No calles ante mis lágrimas; Porque forastero soy para ti, Y advenedizo, como todos mis padres.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 39, 13, NULL, 'Déjame, y tomaré fuerzas, Antes que vaya y perezca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 40, 1, 'Alabanza por la liberación divina', 'Pacientemente esperé a Jehová, Y se inclinó a mí, y oyó mi clamor.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 40, 2, NULL, 'Y me hizo sacar del pozo de la desesperación, del lodo cenagoso; Puso mis pies sobre peña, y enderezó mis pasos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 40, 3, NULL, 'Puso luego en mi boca cántico nuevo, alabanza a nuestro Dios. Verán esto muchos, y temerán, Y confiarán en Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 40, 4, NULL, 'Bienaventurado el hombre que puso en Jehová su confianza, Y no mira a los soberbios, ni a los que se desvían tras la mentira.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 40, 5, NULL, 'Has aumentado, oh Jehová Dios mío, tus maravillas; Y tus pensamientos para con nosotros, No es posible contarlos ante ti. Si yo anunciare y hablare de ellos, No pueden ser enumerados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 40, 6, NULL, 'Sacrificio y ofrenda no te agrada; Has abierto mis oídos; Holocausto y expiación no has demandado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 40, 7, NULL, 'Entonces dije: He aquí, vengo; En el rollo del libro está escrito de mí;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 40, 8, NULL, 'El hacer tu voluntad, Dios mío, me ha agradado, Y tu ley está en medio de mi corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 40, 9, NULL, 'He anunciado justicia en grande congregación; He aquí, no refrené mis labios, Jehová, tú lo sabes.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 40, 10, NULL, 'No encubrí tu justicia dentro de mi corazón; He publicado tu fidelidad y tu salvación; No oculté tu misericordia y tu verdad en grande asamblea.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 40, 11, NULL, 'Jehová, no retengas de mí tus misericordias; Tu misericordia y tu verdad me guarden siempre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 40, 12, NULL, 'Porque me han rodeado males sin número; Me han alcanzado mis maldades, y no puedo levantar la vista. Se han aumentado más que los cabellos de mi cabeza, y mi corazón me falla.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 40, 13, NULL, 'Quieras, oh Jehová, librarme; Jehová, apresúrate a socorrerme.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 40, 14, NULL, 'Sean avergonzados y confundidos a una Los que buscan mi vida para destruirla. Vuelvan atrás y avergüéncense Los que mi mal desean;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 40, 15, NULL, 'Sean asolados en pago de su afrenta Los que me dicen: ¡Ea, ea!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 40, 16, NULL, 'Gócense y alégrense en ti todos los que te buscan, Y digan siempre los que aman tu salvación: Jehová sea enaltecido.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 40, 17, NULL, 'Aunque afligido yo y necesitado, Jehová pensará en mí. Mi ayuda y mi libertador eres tú; Dios mío, no te tardes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 41, 1, 'Oración pidiendo salud', 'Bienaventurado el que piensa en el pobre; En el día malo lo librará Jehová.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 41, 2, NULL, 'Jehová lo guardará, y le dará vida; Será bienaventurado en la tierra, Y no lo entregarás a la voluntad de sus enemigos.', 0, 'spa', 'RVR1960', NULL);\n"
;

  public static final String SQL_PARTE_3 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Sal', 41, 3, NULL, 'Jehová lo sustentará sobre el lecho del dolor; Mullirás toda su cama en su enfermedad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 41, 4, NULL, 'Yo dije: Jehová, ten misericordia de mí; Sana mi alma, porque contra ti he pecado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 41, 5, NULL, 'Mis enemigos dicen mal de mí, preguntando: ¿Cuándo morirá, y perecerá su nombre?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 41, 6, NULL, 'Y si vienen a verme, hablan mentira; Su corazón recoge para sí iniquidad, Y al salir fuera la divulgan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 41, 7, NULL, 'Reunidos murmuran contra mí todos los que me aborrecen; Contra mí piensan mal, diciendo de mí:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 41, 8, NULL, 'Cosa pestilencial se ha apoderado de él; Y el que cayó en cama no volverá a levantarse.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 41, 9, NULL, 'Aun el hombre de mi paz, en quien yo confiaba, el que de mi pan comía, Alzó contra mí el calcañar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 41, 10, NULL, 'Mas tú, Jehová, ten misericordia de mí, y hazme levantar, Y les daré el pago.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 41, 11, NULL, 'En esto conoceré que te he agradado, Que mi enemigo no se huelgue de mí.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 41, 12, NULL, 'En cuanto a mí, en mi integridad me has sustentado, Y me has hecho estar delante de ti para siempre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 41, 13, NULL, 'Bendito sea Jehová, el Dios de Israel, Por los siglos de los siglos. Amén y Amén.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 42, 1, 'Mi alma tiene sed de Dios', 'Como el ciervo brama por las corrientes de las aguas, Así clama por ti, oh Dios, el alma mía.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 42, 2, NULL, 'Mi alma tiene sed de Dios, del Dios vivo; ¿Cuándo vendré, y me presentaré delante de Dios?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 42, 3, NULL, 'Fueron mis lágrimas mi pan de día y de noche, Mientras me dicen todos los días: ¿Dónde está tu Dios?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 42, 4, NULL, 'Me acuerdo de estas cosas, y derramo mi alma dentro de mí; De cómo yo fui con la multitud, y la conduje hasta la casa de Dios, Entre voces de alegría y de alabanza del pueblo en fiesta.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 42, 5, NULL, '¿Por qué te abates, oh alma mía, Y te turbas dentro de mí? Espera en Dios; porque aún he de alabarle, Salvación mía y Dios mío.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 42, 6, NULL, 'Dios mío, mi alma está abatida en mí; Me acordaré, por tanto, de ti desde la tierra del Jordán, Y de los hermonitas, desde el monte de Mizar.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 42, 7, NULL, 'Un abismo llama a otro a la voz de tus cascadas; Todas tus ondas y tus olas han pasado sobre mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 42, 8, NULL, 'Pero de día mandará Jehová su misericordia, Y de noche su cántico estará conmigo, Y mi oración al Dios de mi vida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 42, 9, NULL, 'Diré a Dios: Roca mía, ¿por qué te has olvidado de mí? ¿Por qué andaré yo enlutado por la opresión del enemigo?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 42, 10, NULL, 'Como quien hiere mis huesos, mis enemigos me afrentan, Diciéndome cada día: ¿Dónde está tu Dios?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 42, 11, NULL, '¿Por qué te abates, oh alma mía, Y por qué te turbas dentro de mí? Espera en Dios; porque aún he de alabarle, Salvación mía y Dios mío.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 43, 1, 'Plegaria pidiendo vindicación y liberación', 'Júzgame, oh Dios, y defiende mi causa; Líbrame de gente impía, y del hombre engañoso e inicuo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 43, 2, NULL, 'Pues que tú eres el Dios de mi fortaleza, ¿por qué me has desechado? ¿Por qué andaré enlutado por la opresión del enemigo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 43, 3, NULL, 'Envía tu luz y tu verdad; estas me guiarán; Me conducirán a tu santo monte, Y a tus moradas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 43, 4, NULL, 'Entraré al altar de Dios, Al Dios de mi alegría y de mi gozo; Y te alabaré con arpa, oh Dios, Dios mío.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 43, 5, NULL, '¿Por qué te abates, oh alma mía, Y por qué te turbas dentro de mí? Espera en Dios; porque aún he de alabarle, Salvación mía y Dios mío.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 44, 1, 'Liberaciones pasadas y pruebas presentes', 'Oh Dios, con nuestros oídos hemos oído, nuestros padres nos han contado, La obra que hiciste en sus días, en los tiempos antiguos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 44, 2, NULL, 'Tú con tu mano echaste las naciones, y los plantaste a ellos; Afligiste a los pueblos, y los arrojaste.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 44, 3, NULL, 'Porque no se apoderaron de la tierra por su espada, Ni su brazo los libró; Sino tu diestra, y tu brazo, y la luz de tu rostro, Porque te complaciste en ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 44, 4, NULL, 'Tú, oh Dios, eres mi rey; Manda salvación a Jacob.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 44, 5, NULL, 'Por medio de ti sacudiremos a nuestros enemigos; En tu nombre hollaremos a nuestros adversarios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 44, 6, NULL, 'Porque no confiaré en mi arco, Ni mi espada me salvará;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 44, 7, NULL, 'Pues tú nos has guardado de nuestros enemigos, Y has avergonzado a los que nos aborrecían.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 44, 8, NULL, 'En Dios nos gloriaremos todo el tiempo, Y para siempre alabaremos tu nombre. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 44, 9, NULL, 'Pero nos has desechado, y nos has hecho avergonzar; Y no sales con nuestros ejércitos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 44, 10, NULL, 'Nos hiciste retroceder delante del enemigo, Y nos saquean para sí los que nos aborrecen.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 44, 11, NULL, 'Nos entregas como ovejas al matadero, Y nos has esparcido entre las naciones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 44, 12, NULL, 'Has vendido a tu pueblo de balde; No exigiste ningún precio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 44, 13, NULL, 'Nos pones por afrenta de nuestros vecinos, Por escarnio y por burla de los que nos rodean.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 44, 14, NULL, 'Nos pusiste por proverbio entre las naciones; Todos al vernos menean la cabeza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 44, 15, NULL, 'Cada día mi vergüenza está delante de mí, Y la confusión de mi rostro me cubre,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 44, 16, NULL, 'Por la voz del que me vitupera y deshonra, Por razón del enemigo y del vengativo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 44, 17, NULL, 'Todo esto nos ha venido, y no nos hemos olvidado de ti, Y no hemos faltado a tu pacto.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 44, 18, NULL, 'No se ha vuelto atrás nuestro corazón, Ni se han apartado de tus caminos nuestros pasos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 44, 19, NULL, 'Para que nos quebrantases en el lugar de chacales, Y nos cubrieses con sombra de muerte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 44, 20, NULL, 'Si nos hubiésemos olvidado del nombre de nuestro Dios, O alzado nuestras manos a dios ajeno,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 44, 21, NULL, '¿No demandaría Dios esto? Porque él conoce los secretos del corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 44, 22, NULL, 'Pero por causa de ti nos matan cada día; Somos contados como ovejas para el matadero.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 44, 23, NULL, 'Despierta; ¿por qué duermes, Señor? Despierta, no te alejes para siempre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 44, 24, NULL, '¿Por qué escondes tu rostro, Y te olvidas de nuestra aflicción, y de la opresión nuestra?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 44, 25, NULL, 'Porque nuestra alma está agobiada hasta el polvo, Y nuestro cuerpo está postrado hasta la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 44, 26, NULL, 'Levántate para ayudarnos, Y redímenos por causa de tu misericordia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 45, 1, 'Cántico de las bodas del rey', 'Rebosa mi corazón palabra buena; Dirijo al rey mi canto; Mi lengua es pluma de escribiente muy ligero.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 45, 2, NULL, 'Eres el más hermoso de los hijos de los hombres; La gracia se derramó en tus labios; Por tanto, Dios te ha bendecido para siempre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 45, 3, NULL, 'Ciñe tu espada sobre el muslo, oh valiente, Con tu gloria y con tu majestad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 45, 4, NULL, 'En tu gloria sé prosperado; Cabalga sobre palabra de verdad, de humildad y de justicia, Y tu diestra te enseñará cosas terribles.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 45, 5, NULL, 'Tus saetas agudas, Con que caerán pueblos debajo de ti, Penetrarán en el corazón de los enemigos del rey.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 45, 6, NULL, 'Tu trono, oh Dios, es eterno y para siempre; Cetro de justicia es el cetro de tu reino.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 45, 7, NULL, 'Has amado la justicia y aborrecido la maldad; Por tanto, te ungió Dios, el Dios tuyo, Con óleo de alegría más que a tus compañeros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 45, 8, NULL, 'Mirra, áloe y casia exhalan todos tus vestidos; Desde palacios de marfil te recrean.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 45, 9, NULL, 'Hijas de reyes están entre tus ilustres; Está la reina a tu diestra con oro de Ofir.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 45, 10, NULL, 'Oye, hija, y mira, e inclina tu oído; Olvida tu pueblo, y la casa de tu padre;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 45, 11, NULL, 'Y deseará el rey tu hermosura; E inclínate a él, porque él es tu señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 45, 12, NULL, 'Y las hijas de Tiro vendrán con presentes; Implorarán tu favor los ricos del pueblo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 45, 13, NULL, 'Toda gloriosa es la hija del rey en su morada; De brocado de oro es su vestido.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 45, 14, NULL, 'Con vestidos bordados será llevada al rey; Vírgenes irán en pos de ella, Compañeras suyas serán traídas a ti.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 45, 15, NULL, 'Serán traídas con alegría y gozo; Entrarán en el palacio del rey.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 45, 16, NULL, 'En lugar de tus padres serán tus hijos, A quienes harás príncipes en toda la tierra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 45, 17, NULL, 'Haré perpetua la memoria de tu nombre en todas las generaciones, Por lo cual te alabarán los pueblos eternamente y para siempre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 46, 1, 'Dios es nuestro amparo y fortaleza', 'Dios es nuestro amparo y fortaleza, Nuestro pronto auxilio en las tribulaciones.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 46, 2, NULL, 'Por tanto, no temeremos, aunque la tierra sea removida, Y se traspasen los montes al corazón del mar;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 46, 3, NULL, 'Aunque bramen y se turben sus aguas, Y tiemblen los montes a causa de su braveza. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 46, 4, NULL, 'Del río sus corrientes alegran la ciudad de Dios, El santuario de las moradas del Altísimo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 46, 5, NULL, 'Dios está en medio de ella; no será conmovida. Dios la ayudará al clarear la mañana.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 46, 6, NULL, 'Bramaron las naciones, titubearon los reinos; Dio él su voz, se derritió la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 46, 7, NULL, 'Jehová de los ejércitos está con nosotros; Nuestro refugio es el Dios de Jacob. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 46, 8, NULL, 'Venid, ved las obras de Jehová, Que ha puesto asolamientos en la tierra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 46, 9, NULL, 'Que hace cesar las guerras hasta los fines de la tierra. Que quiebra el arco, corta la lanza, Y quema los carros en el fuego.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 46, 10, NULL, 'Estad quietos, y conoced que yo soy Dios; Seré exaltado entre las naciones; enaltecido seré en la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 46, 11, NULL, 'Jehová de los ejércitos está con nosotros; Nuestro refugio es el Dios de Jacob. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 47, 1, 'Dios, el Rey de toda la tierra', 'Pueblos todos, batid las manos; Aclamad a Dios con voz de júbilo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 47, 2, NULL, 'Porque Jehová el Altísimo es temible; Rey grande sobre toda la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 47, 3, NULL, 'Él someterá a los pueblos debajo de nosotros, Y a las naciones debajo de nuestros pies.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 47, 4, NULL, 'Él nos elegirá nuestras heredades; La hermosura de Jacob, al cual amó. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 47, 5, NULL, 'Subió Dios con júbilo, Jehová con sonido de trompeta.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 47, 6, NULL, 'Cantad a Dios, cantad; Cantad a nuestro Rey, cantad;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 47, 7, NULL, 'Porque Dios es el Rey de toda la tierra; Cantad con inteligencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 47, 8, NULL, 'Reinó Dios sobre las naciones; Se sentó Dios sobre su santo trono.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 47, 9, NULL, 'Los príncipes de los pueblos se reunieron Como pueblo del Dios de Abraham;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 47, 10, NULL, 'Porque de Dios son los escudos de la tierra; Él es muy exaltado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 48, 1, 'Hermosura y gloria de Sion', 'Grande es Jehová, y digno de ser en gran manera alabado En la ciudad de nuestro Dios, en su monte santo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 48, 2, NULL, 'Hermosa provincia, el gozo de toda la tierra, Es el monte de Sion, a los lados del norte, La ciudad del gran Rey.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 48, 3, NULL, 'En sus palacios Dios es conocido por refugio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 48, 4, NULL, 'Porque he aquí los reyes de la tierra se reunieron; Pasaron todos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 48, 5, NULL, 'Y viéndola ellos así, se maravillaron, Se turbaron, se apresuraron a huir.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 48, 6, NULL, 'Les tomó allí temblor; Dolor como de mujer que da a luz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 48, 7, NULL, 'Con viento solano Quiebras tú las naves de Tarsis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 48, 8, NULL, 'Como lo oímos, así lo hemos visto En la ciudad de Jehová de los ejércitos, en la ciudad de nuestro Dios; La afirmará Dios para siempre. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 48, 9, NULL, 'Nos acordamos de tu misericordia, oh Dios, En medio de tu templo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 48, 10, NULL, 'Conforme a tu nombre, oh Dios, Así es tu loor hasta los fines de la tierra; De justicia está llena tu diestra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 48, 11, NULL, 'Se alegrará el monte de Sion; Se gozarán las hijas de Judá Por tus juicios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 48, 12, NULL, 'Andad alrededor de Sion, y rodeadla; Contad sus torres.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 48, 13, NULL, 'Considerad atentamente su antemuro, Mirad sus palacios; Para que lo contéis a la generación venidera.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 48, 14, NULL, 'Porque este Dios es Dios nuestro eternamente y para siempre; Él nos guiará aun más allá de la muerte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 49, 1, 'La insensatez de confiar en las riquezas', 'Oíd esto, pueblos todos; Escuchad, habitantes todos del mundo,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 49, 2, NULL, 'Así los plebeyos como los nobles, El rico y el pobre juntamente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 49, 3, NULL, 'Mi boca hablará sabiduría, Y el pensamiento de mi corazón inteligencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 49, 4, NULL, 'Inclinaré al proverbio mi oído; Declararé con el arpa mi enigma.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 49, 5, NULL, '¿Por qué he de temer en los días de adversidad, Cuando la iniquidad de mis opresores me rodeare?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 49, 6, NULL, 'Los que confían en sus bienes, Y de la muchedumbre de sus riquezas se jactan,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 49, 7, NULL, 'Ninguno de ellos podrá en manera alguna redimir al hermano, Ni dar a Dios su rescate', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 49, 8, NULL, '(Porque la redención de su vida es de gran precio, Y no se logrará jamás),', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 49, 9, NULL, 'Para que viva en adelante para siempre, Y nunca vea corrupción.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 49, 10, NULL, 'Pues verá que aun los sabios mueren; Que perecen del mismo modo que el insensato y el necio, Y dejan a otros sus riquezas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 49, 11, NULL, 'Su íntimo pensamiento es que sus casas serán eternas, Y sus habitaciones para generación y generación; Dan sus nombres a sus tierras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 49, 12, NULL, 'Mas el hombre no permanecerá en honra; Es semejante a las bestias que perecen.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 49, 13, NULL, 'Este su camino es locura; Con todo, sus descendientes se complacen en el dicho de ellos. Selah', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 49, 14, NULL, 'Como a rebaños que son conducidos al Seol, La muerte los pastoreará, Y los rectos se enseñorearán de ellos por la mañana; Se consumirá su buen parecer, y el Seol será su morada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 49, 15, NULL, 'Pero Dios redimirá mi vida del poder del Seol, Porque él me tomará consigo. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 49, 16, NULL, 'No temas cuando se enriquece alguno, Cuando aumenta la gloria de su casa;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 49, 17, NULL, 'Porque cuando muera no llevará nada, Ni descenderá tras él su gloria.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 49, 18, NULL, 'Aunque mientras viva, llame dichosa a su alma, Y sea loado cuando prospere,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 49, 19, NULL, 'Entrará en la generación de sus padres, Y nunca más verá la luz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 49, 20, NULL, 'El hombre que está en honra y no entiende, Semejante es a las bestias que perecen.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 50, 1, 'Dios juzgará al mundo', 'El Dios de dioses, Jehová, ha hablado, y convocado la tierra, Desde el nacimiento del sol hasta donde se pone.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 50, 2, NULL, 'De Sion, perfección de hermosura, Dios ha resplandecido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 50, 3, NULL, 'Vendrá nuestro Dios, y no callará; Fuego consumirá delante de él, Y tempestad poderosa le rodeará.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 50, 4, NULL, 'Convocará a los cielos de arriba, Y a la tierra, para juzgar a su pueblo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 50, 5, NULL, 'Juntadme mis santos, Los que hicieron conmigo pacto con sacrificio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 50, 6, NULL, 'Y los cielos declararán su justicia, Porque Dios es el juez. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 50, 7, NULL, 'Oye, pueblo mío, y hablaré; Escucha, Israel, y testificaré contra ti: Yo soy Dios, el Dios tuyo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 50, 8, NULL, 'No te reprenderé por tus sacrificios, Ni por tus holocaustos, que están continuamente delante de mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 50, 9, NULL, 'No tomaré de tu casa becerros, Ni machos cabríos de tus apriscos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 50, 10, NULL, 'Porque mía es toda bestia del bosque, Y los millares de animales en los collados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 50, 11, NULL, 'Conozco a todas las aves de los montes, Y todo lo que se mueve en los campos me pertenece.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 50, 12, NULL, 'Si yo tuviese hambre, no te lo diría a ti; Porque mío es el mundo y su plenitud.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 50, 13, NULL, '¿He de comer yo carne de toros, O de beber sangre de machos cabríos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 50, 14, NULL, 'Sacrifica a Dios alabanza, Y paga tus votos al Altísimo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 50, 15, NULL, 'E invócame en el día de la angustia; Te libraré, y tú me honrarás.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 50, 16, NULL, 'Pero al malo dijo Dios: ¿Qué tienes tú que hablar de mis leyes, Y que tomar mi pacto en tu boca?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 50, 17, NULL, 'Pues tú aborreces la corrección, Y echas a tu espalda mis palabras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 50, 18, NULL, 'Si veías al ladrón, tú corrías con él, Y con los adúlteros era tu parte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 50, 19, NULL, 'Tu boca metías en mal, Y tu lengua componía engaño.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 50, 20, NULL, 'Tomabas asiento, y hablabas contra tu hermano; Contra el hijo de tu madre ponías infamia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 50, 21, NULL, 'Estas cosas hiciste, y yo he callado; Pensabas que de cierto sería yo como tú; Pero te reprenderé, y las pondré delante de tus ojos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 50, 22, NULL, 'Entended ahora esto, los que os olvidáis de Dios, No sea que os despedace, y no haya quien os libre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 50, 23, NULL, 'El que sacrifica alabanza me honrará; Y al que ordenare su camino, Le mostraré la salvación de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 51, 1, 'Arrepentimiento, y plegaria pidiendo purificación', 'Ten piedad de mí, oh Dios, conforme a tu misericordia; Conforme a la multitud de tus piedades borra mis rebeliones.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 51, 2, NULL, 'Lávame más y más de mi maldad, Y límpiame de mi pecado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 51, 3, NULL, 'Porque yo reconozco mis rebeliones, Y mi pecado está siempre delante de mí.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 51, 4, NULL, 'Contra ti, contra ti solo he pecado, Y he hecho lo malo delante de tus ojos; Para que seas reconocido justo en tu palabra, Y tenido por puro en tu juicio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 51, 5, NULL, 'He aquí, en maldad he sido formado, Y en pecado me concibió mi madre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 51, 6, NULL, 'He aquí, tú amas la verdad en lo íntimo, Y en lo secreto me has hecho comprender sabiduría.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 51, 7, NULL, 'Purifícame con hisopo, y seré limpio; Lávame, y seré más blanco que la nieve.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 51, 8, NULL, 'Hazme oír gozo y alegría, Y se recrearán los huesos que has abatido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 51, 9, NULL, 'Esconde tu rostro de mis pecados, Y borra todas mis maldades.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 51, 10, NULL, 'Crea en mí, oh Dios, un corazón limpio, Y renueva un espíritu recto dentro de mí.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 51, 11, NULL, 'No me eches de delante de ti, Y no quites de mí tu santo Espíritu.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 51, 12, NULL, 'Vuélveme el gozo de tu salvación, Y espíritu noble me sustente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 51, 13, NULL, 'Entonces enseñaré a los transgresores tus caminos, Y los pecadores se convertirán a ti.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 51, 14, NULL, 'Líbrame de homicidios, oh Dios, Dios de mi salvación; Cantará mi lengua tu justicia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 51, 15, NULL, 'Señor, abre mis labios, Y publicará mi boca tu alabanza.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 51, 16, NULL, 'Porque no quieres sacrificio, que yo lo daría; No quieres holocausto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 51, 17, NULL, 'Los sacrificios de Dios son el espíritu quebrantado; Al corazón contrito y humillado no despreciarás tú, oh Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 51, 18, NULL, 'Haz bien con tu benevolencia a Sion; Edifica los muros de Jerusalén.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 51, 19, NULL, 'Entonces te agradarán los sacrificios de justicia, El holocausto u ofrenda del todo quemada; Entonces ofrecerán becerros sobre tu altar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 52, 1, 'Futilidad de la jactancia del malo', '¿Por qué te jactas de maldad, oh poderoso? La misericordia de Dios es continua.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 52, 2, NULL, 'Agravios maquina tu lengua; Como navaja afilada hace engaño.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 52, 3, NULL, 'Amaste el mal más que el bien, La mentira más que la verdad. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 52, 4, NULL, 'Has amado toda suerte de palabras perniciosas, Engañosa lengua.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 52, 5, NULL, 'Por tanto, Dios te destruirá para siempre; Te asolará y te arrancará de tu morada, Y te desarraigará de la tierra de los vivientes. Selah', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 52, 6, NULL, 'Verán los justos, y temerán; Se reirán de él, diciendo:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 52, 7, NULL, 'He aquí el hombre que no puso a Dios por su fortaleza, Sino que confió en la multitud de sus riquezas, Y se mantuvo en su maldad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 52, 8, NULL, 'Pero yo estoy como olivo verde en la casa de Dios; En la misericordia de Dios confío eternamente y para siempre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 52, 9, NULL, 'Te alabaré para siempre, porque lo has hecho así; Y esperaré en tu nombre, porque es bueno, delante de tus santos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 53, 1, 'Insensatez y maldad de los hombres', 'Dice el necio en su corazón: No hay Dios. Se han corrompido, e hicieron abominable maldad; No hay quien haga bien.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 53, 2, NULL, 'Dios desde los cielos miró sobre los hijos de los hombres, Para ver si había algún entendido Que buscara a Dios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 53, 3, NULL, 'Cada uno se había vuelto atrás; todos se habían corrompido; No hay quien haga lo bueno, no hay ni aun uno.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 53, 4, NULL, '¿No tienen conocimiento todos los que hacen iniquidad, Que devoran a mi pueblo como si comiesen pan, Y a Dios no invocan?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 53, 5, NULL, 'Allí se sobresaltaron de pavor donde no había miedo, Porque Dios ha esparcido los huesos del que puso asedio contra ti; Los avergonzaste, porque Dios los desechó.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 53, 6, NULL, '¡Oh, si saliera de Sion la salvación de Israel! Cuando Dios hiciere volver de la cautividad a su pueblo, Se gozará Jacob, y se alegrará Israel.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 54, 1, 'Plegaria pidiendo protección contra los enemigos', 'Oh Dios, sálvame por tu nombre, Y con tu poder defiéndeme.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 54, 2, NULL, 'Oh Dios, oye mi oración; Escucha las razones de mi boca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 54, 3, NULL, 'Porque extraños se han levantado contra mí, Y hombres violentos buscan mi vida; No han puesto a Dios delante de sí. Selah', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 54, 4, NULL, 'He aquí, Dios es el que me ayuda; El Señor está con los que sostienen mi vida.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 54, 5, NULL, 'Él devolverá el mal a mis enemigos; Córtalos por tu verdad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 54, 6, NULL, 'Voluntariamente sacrificaré a ti; Alabaré tu nombre, oh Jehová, porque es bueno.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 54, 7, NULL, 'Porque él me ha librado de toda angustia, Y mis ojos han visto la ruina de mis enemigos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 55, 1, 'Plegaria pidiendo la destrucción de enemigos traicioneros', 'Escucha, oh Dios, mi oración, Y no te escondas de mi súplica.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 55, 2, NULL, 'Está atento, y respóndeme; Clamo en mi oración, y me conmuevo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 55, 3, NULL, 'A causa de la voz del enemigo, Por la opresión del impío; Porque sobre mí echaron iniquidad, Y con furor me persiguen.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 55, 4, NULL, 'Mi corazón está dolorido dentro de mí, Y terrores de muerte sobre mí han caído.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 55, 5, NULL, 'Temor y temblor vinieron sobre mí, Y terror me ha cubierto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 55, 6, NULL, 'Y dije: ¡Quién me diese alas como de paloma! Volaría yo, y descansaría.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 55, 7, NULL, 'Ciertamente huiría lejos; Moraría en el desierto. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 55, 8, NULL, 'Me apresuraría a escapar Del viento borrascoso, de la tempestad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 55, 9, NULL, 'Destrúyelos, oh Señor; confunde la lengua de ellos; Porque he visto violencia y rencilla en la ciudad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 55, 10, NULL, 'Día y noche la rodean sobre sus muros, E iniquidad y trabajo hay en medio de ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 55, 11, NULL, 'Maldad hay en medio de ella, Y el fraude y el engaño no se apartan de sus plazas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 55, 12, NULL, 'Porque no me afrentó un enemigo, Lo cual habría soportado; Ni se alzó contra mí el que me aborrecía, Porque me hubiera ocultado de él;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 55, 13, NULL, 'Sino tú, hombre, al parecer íntimo mío, Mi guía, y mi familiar;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 55, 14, NULL, 'Que juntos comunicábamos dulcemente los secretos, Y andábamos en amistad en la casa de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 55, 15, NULL, 'Que la muerte les sorprenda; Desciendan vivos al Seol, Porque hay maldades en sus moradas, en medio de ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 55, 16, NULL, 'En cuanto a mí, a Dios clamaré; Y Jehová me salvará.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 55, 17, NULL, 'Tarde y mañana y a mediodía oraré y clamaré, Y él oirá mi voz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 55, 18, NULL, 'Él redimirá en paz mi alma de la guerra contra mí, Aunque contra mí haya muchos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 55, 19, NULL, 'Dios oirá, y los quebrantará luego, El que permanece desde la antigüedad; Por cuanto no cambian, Ni temen a Dios. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 55, 20, NULL, 'Extendió el inicuo sus manos contra los que estaban en paz con él; Violó su pacto.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 55, 21, NULL, 'Los dichos de su boca son más blandos que mantequilla, Pero guerra hay en su corazón; Suaviza sus palabras más que el aceite, Mas ellas son espadas desnudas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 55, 22, NULL, 'Echa sobre Jehová tu carga, y él te sustentará; No dejará para siempre caído al justo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 55, 23, NULL, 'Mas tú, oh Dios, harás descender aquellos al pozo de perdición. Los hombres sanguinarios y engañadores no llegarán a la mitad de sus días; Pero yo en ti confiaré.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 56, 1, 'Oración de confianza', 'Ten misericordia de mí, oh Dios, porque me devoraría el hombre; Me oprime combatiéndome cada día.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 56, 2, NULL, 'Todo el día mis enemigos me pisotean; Porque muchos son los que pelean contra mí con soberbia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 56, 3, NULL, 'En el día que temo, Yo en ti confío.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 56, 4, NULL, 'En Dios alabaré su palabra; En Dios he confiado; no temeré; ¿Qué puede hacerme el hombre?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 56, 5, NULL, 'Todos los días ellos pervierten mi causa; Contra mí son todos sus pensamientos para mal.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 56, 6, NULL, 'Se reúnen, se esconden, Miran atentamente mis pasos, Como quienes acechan a mi alma.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 56, 7, NULL, 'Pésalos según su iniquidad, oh Dios, Y derriba en tu furor a los pueblos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 56, 8, NULL, 'Mis huidas tú has contado; Pon mis lágrimas en tu redoma; ¿No están ellas en tu libro?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 56, 9, NULL, 'Serán luego vueltos atrás mis enemigos, el día en que yo clamare; Esto sé, que Dios está por mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 56, 10, NULL, 'En Dios alabaré su palabra; En Jehová su palabra alabaré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 56, 11, NULL, 'En Dios he confiado; no temeré; ¿Qué puede hacerme el hombre?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 56, 12, NULL, 'Sobre mí, oh Dios, están tus votos; Te tributaré alabanzas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 56, 13, NULL, 'Porque has librado mi alma de la muerte, Y mis pies de caída, Para que ande delante de Dios En la luz de los que viven.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 57, 1, 'Plegaria pidiendo ser librado de los perseguidores', 'Ten misericordia de mí, oh Dios, ten misericordia de mí; Porque en ti ha confiado mi alma, Y en la sombra de tus alas me ampararé Hasta que pasen los quebrantos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 57, 2, NULL, 'Clamaré al Dios Altísimo, Al Dios que me favorece.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 57, 3, NULL, 'Él enviará desde los cielos, y me salvará De la infamia del que me acosa; Selah Dios enviará su misericordia y su verdad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 57, 4, NULL, 'Mi vida está entre leones; Estoy echado entre hijos de hombres que vomitan llamas; Sus dientes son lanzas y saetas, Y su lengua espada aguda.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 57, 5, NULL, 'Exaltado seas sobre los cielos, oh Dios; Sobre toda la tierra sea tu gloria.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 57, 6, NULL, 'Red han armado a mis pasos; Se ha abatido mi alma; Hoyo han cavado delante de mí; En medio de él han caído ellos mismos. Selah', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 57, 7, NULL, 'Pronto está mi corazón, oh Dios, mi corazón está dispuesto; Cantaré, y trovaré salmos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 57, 8, NULL, 'Despierta, alma mía; despierta, salterio y arpa; Me levantaré de mañana.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 57, 9, NULL, 'Te alabaré entre los pueblos, oh Señor; Cantaré de ti entre las naciones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 57, 10, NULL, 'Porque grande es hasta los cielos tu misericordia, Y hasta las nubes tu verdad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 57, 11, NULL, 'Exaltado seas sobre los cielos, oh Dios; Sobre toda la tierra sea tu gloria.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 58, 1, 'Plegaria pidiendo el castigo de los malos', 'Oh congregación, ¿pronunciáis en verdad justicia? ¿Juzgáis rectamente, hijos de los hombres?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 58, 2, NULL, 'Antes en el corazón maquináis iniquidades; Hacéis pesar la violencia de vuestras manos en la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 58, 3, NULL, 'Se apartaron los impíos desde la matriz; Se descarriaron hablando mentira desde que nacieron.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 58, 4, NULL, 'Veneno tienen como veneno de serpiente; Son como el áspid sordo que cierra su oído,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 58, 5, NULL, 'Que no oye la voz de los que encantan, Por más hábil que el encantador sea.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 58, 6, NULL, 'Oh Dios, quiebra sus dientes en sus bocas; Quiebra, oh Jehová, las muelas de los leoncillos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 58, 7, NULL, 'Sean disipados como aguas que corren; Cuando disparen sus saetas, sean hechas pedazos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 58, 8, NULL, 'Pasen ellos como el caracol que se deslíe; Como el que nace muerto, no vean el sol.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 58, 9, NULL, 'Antes que vuestras ollas sientan la llama de los espinos, Así vivos, así airados, los arrebatará él con tempestad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 58, 10, NULL, 'Se alegrará el justo cuando viere la venganza; Sus pies lavará en la sangre del impío.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 58, 11, NULL, 'Entonces dirá el hombre: Ciertamente hay galardón para el justo; Ciertamente hay Dios que juzga en la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 59, 1, 'Oración pidiendo ser librado de los enemigos', 'Líbrame de mis enemigos, oh Dios mío; Ponme a salvo de los que se levantan contra mí.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 59, 2, NULL, 'Líbrame de los que cometen iniquidad, Y sálvame de hombres sanguinarios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 59, 3, NULL, 'Porque he aquí están acechando mi vida; Se han juntado contra mí poderosos. No por falta mía, ni pecado mío, oh Jehová;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 59, 4, NULL, 'Sin delito mío corren y se aperciben. Despierta para venir a mi encuentro, y mira.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 59, 5, NULL, 'Y tú, Jehová Dios de los ejércitos, Dios de Israel, Despierta para castigar a todas las naciones; No tengas misericordia de todos los que se rebelan con iniquidad. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 59, 6, NULL, 'Volverán a la tarde, ladrarán como perros, Y rodearán la ciudad.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 59, 7, NULL, 'He aquí proferirán con su boca; Espadas hay en sus labios, Porque dicen: ¿Quién oye?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 59, 8, NULL, 'Mas tú, Jehová, te reirás de ellos; Te burlarás de todas las naciones.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 59, 9, NULL, 'A causa del poder del enemigo esperaré en ti, Porque Dios es mi defensa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 59, 10, NULL, 'El Dios de mi misericordia irá delante de mí; Dios hará que vea en mis enemigos mi deseo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 59, 11, NULL, 'No los mates, para que mi pueblo no olvide; Dispérsalos con tu poder, y abátelos, Oh Jehová, escudo nuestro.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 59, 12, NULL, 'Por el pecado de su boca, por la palabra de sus labios, Sean ellos presos en su soberbia, Y por la maldición y mentira que profieren.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 59, 13, NULL, 'Acábalos con furor, acábalos, para que no sean; Y sépase que Dios gobierna en Jacob Hasta los fines de la tierra. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 59, 14, NULL, 'Vuelvan, pues, a la tarde, y ladren como perros, Y rodeen la ciudad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 59, 15, NULL, 'Anden ellos errantes para hallar qué comer; Y si no se sacian, pasen la noche quejándose.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 59, 16, NULL, 'Pero yo cantaré de tu poder, Y alabaré de mañana tu misericordia; Porque has sido mi amparo Y refugio en el día de mi angustia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 59, 17, NULL, 'Fortaleza mía, a ti cantaré; Porque eres, oh Dios, mi refugio, el Dios de mi misericordia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 60, 1, 'Plegaria pidiendo ayuda contra el enemigo', 'Oh Dios, tú nos has desechado, nos quebrantaste; Te has airado; ¡vuélvete a nosotros!', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 60, 2, NULL, 'Hiciste temblar la tierra, la has hendido; Sana sus roturas, porque titubea.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 60, 3, NULL, 'Has hecho ver a tu pueblo cosas duras; Nos hiciste beber vino de aturdimiento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 60, 4, NULL, 'Has dado a los que te temen bandera Que alcen por causa de la verdad. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 60, 5, NULL, 'Para que se libren tus amados, Salva con tu diestra, y óyeme.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 60, 6, NULL, 'Dios ha dicho en su santuario: Yo me alegraré; Repartiré a Siquem, y mediré el valle de Sucot.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 60, 7, NULL, 'Mío es Galaad, y mío es Manasés; Y Efraín es la fortaleza de mi cabeza; Judá es mi legislador.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 60, 8, NULL, 'Moab, vasija para lavarme; Sobre Edom echaré mi calzado; Me regocijaré sobre Filistea.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 60, 9, NULL, '¿Quién me llevará a la ciudad fortificada? ¿Quién me llevará hasta Edom?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 60, 10, NULL, '¿No serás tú, oh Dios, que nos habías desechado, Y no salías, oh Dios, con nuestros ejércitos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 60, 11, NULL, 'Danos socorro contra el enemigo, Porque vana es la ayuda de los hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 60, 12, NULL, 'En Dios haremos proezas, Y él hollará a nuestros enemigos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 61, 1, 'Confianza en la protección de Dios', 'Oye, oh Dios, mi clamor; A mi oración atiende.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 61, 2, NULL, 'Desde el cabo de la tierra clamaré a ti, cuando mi corazón desmayare. Llévame a la roca que es más alta que yo,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 61, 3, NULL, 'Porque tú has sido mi refugio, Y torre fuerte delante del enemigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 61, 4, NULL, 'Yo habitaré en tu tabernáculo para siempre; Estaré seguro bajo la cubierta de tus alas. Selah', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 61, 5, NULL, 'Porque tú, oh Dios, has oído mis votos; Me has dado la heredad de los que temen tu nombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 61, 6, NULL, 'Días sobre días añadirás al rey; Sus años serán como generación y generación.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 61, 7, NULL, 'Estará para siempre delante de Dios; Prepara misericordia y verdad para que lo conserven.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 61, 8, NULL, 'Así cantaré tu nombre para siempre, Pagando mis votos cada día.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 62, 1, 'Dios, el único refugio', 'En Dios solamente está acallada mi alma; De él viene mi salvación.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 62, 2, NULL, 'Él solamente es mi roca y mi salvación; Es mi refugio, no resbalaré mucho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 62, 3, NULL, '¿Hasta cuándo maquinaréis contra un hombre, Tratando todos vosotros de aplastarle Como pared desplomada y como cerca derribada?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 62, 4, NULL, 'Solamente consultan para arrojarle de su grandeza. Aman la mentira; Con su boca bendicen, pero maldicen en su corazón. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 62, 5, NULL, 'Alma mía, en Dios solamente reposa, Porque de él es mi esperanza.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 62, 6, NULL, 'Él solamente es mi roca y mi salvación. Es mi refugio, no resbalaré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 62, 7, NULL, 'En Dios está mi salvación y mi gloria; En Dios está mi roca fuerte, y mi refugio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 62, 8, NULL, 'Esperad en él en todo tiempo, oh pueblos; Derramad delante de él vuestro corazón; Dios es nuestro refugio. Selah', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 62, 9, NULL, 'Por cierto, vanidad son los hijos de los hombres, mentira los hijos de varón; Pesándolos a todos igualmente en la balanza, Serán menos que nada.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 62, 10, NULL, 'No confiéis en la violencia, Ni en la rapiña; no os envanezcáis; Si se aumentan las riquezas, no pongáis el corazón en ellas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 62, 11, NULL, 'Una vez habló Dios; Dos veces he oído esto: Que de Dios es el poder,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 62, 12, NULL, 'Y tuya, oh Señor, es la misericordia; Porque tú pagas a cada uno conforme a su obra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 63, 1, 'Dios, satisfacción del alma', 'Dios, Dios mío eres tú; De madrugada te buscaré; Mi alma tiene sed de ti, mi carne te anhela, En tierra seca y árida donde no hay aguas,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 63, 2, NULL, 'Para ver tu poder y tu gloria, Así como te he mirado en el santuario.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 63, 3, NULL, 'Porque mejor es tu misericordia que la vida; Mis labios te alabarán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 63, 4, NULL, 'Así te bendeciré en mi vida; En tu nombre alzaré mis manos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 63, 5, NULL, 'Como de meollo y de grosura será saciada mi alma, Y con labios de júbilo te alabará mi boca,', 1, 'spa', 'RVR1960', NULL);\n"
;

  public static final String SQL_PARTE_4 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Sal', 63, 6, NULL, 'Cuando me acuerde de ti en mi lecho, Cuando medite en ti en las vigilias de la noche.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 63, 7, NULL, 'Porque has sido mi socorro, Y así en la sombra de tus alas me regocijaré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 63, 8, NULL, 'Está mi alma apegada a ti; Tu diestra me ha sostenido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 63, 9, NULL, 'Pero los que para destrucción buscaron mi alma Caerán en los sitios bajos de la tierra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 63, 10, NULL, 'Los destruirán a filo de espada; Serán porción de los chacales.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 63, 11, NULL, 'Pero el rey se alegrará en Dios; Será alabado cualquiera que jura por él; Porque la boca de los que hablan mentira será cerrada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 64, 1, 'Plegaria pidiendo protección contra enemigos ocultos', 'Escucha, oh Dios, la voz de mi queja; Guarda mi vida del temor del enemigo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 64, 2, NULL, 'Escóndeme del consejo secreto de los malignos, De la conspiración de los que hacen iniquidad,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 64, 3, NULL, 'Que afilan como espada su lengua; Lanzan cual saeta suya, palabra amarga,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 64, 4, NULL, 'Para asaetear a escondidas al íntegro; De repente lo asaetean, y no temen.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 64, 5, NULL, 'Obstinados en su inicuo designio, Tratan de esconder los lazos, Y dicen: ¿Quién los ha de ver?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 64, 6, NULL, 'Inquieren iniquidades, hacen una investigación exacta; Y el íntimo pensamiento de cada uno de ellos, así como su corazón, es profundo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 64, 7, NULL, 'Mas Dios los herirá con saeta; De repente serán sus plagas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 64, 8, NULL, 'Sus propias lenguas los harán caer; Se espantarán todos los que los vean.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 64, 9, NULL, 'Entonces temerán todos los hombres, Y anunciarán la obra de Dios, Y entenderán sus hechos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 64, 10, NULL, 'Se alegrará el justo en Jehová, y confiará en él; Y se gloriarán todos los rectos de corazón.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 65, 1, 'La generosidad de Dios en la naturaleza', 'Tuya es la alabanza en Sion, oh Dios, Y a ti se pagarán los votos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 65, 2, NULL, 'Tú oyes la oración; A ti vendrá toda carne.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 65, 3, NULL, 'Las iniquidades prevalecen contra mí; Mas nuestras rebeliones tú las perdonarás.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 65, 4, NULL, 'Bienaventurado el que tú escogieres y atrajeres a ti, Para que habite en tus atrios; Seremos saciados del bien de tu casa, De tu santo templo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 65, 5, NULL, 'Con tremendas cosas nos responderás tú en justicia, Oh Dios de nuestra salvación, Esperanza de todos los términos de la tierra, Y de los más remotos confines del mar.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 65, 6, NULL, 'Tú, el que afirma los montes con su poder, Ceñido de valentía;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 65, 7, NULL, 'El que sosiega el estruendo de los mares, el estruendo de sus ondas, Y el alboroto de las naciones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 65, 8, NULL, 'Por tanto, los habitantes de los fines de la tierra temen de tus maravillas. Tú haces alegrar las salidas de la mañana y de la tarde.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 65, 9, NULL, 'Visitas la tierra, y la riegas; En gran manera la enriqueces; Con el río de Dios, lleno de aguas, Preparas el grano de ellos, cuando así la dispones.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 65, 10, NULL, 'Haces que se empapen sus surcos, Haces descender sus canales; La ablandas con lluvias, Bendices sus renuevos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 65, 11, NULL, 'Tú coronas el año con tus bienes, Y tus nubes destilan grosura.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 65, 12, NULL, 'Destilan sobre los pastizales del desierto, Y los collados se ciñen de alegría.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 65, 13, NULL, 'Se visten de manadas los llanos, Y los valles se cubren de grano; Dan voces de júbilo, y aun cantan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 66, 1, 'Alabanza por los hechos poderosos de Dios', 'Aclamad a Dios con alegría, toda la tierra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 66, 2, NULL, 'Cantad la gloria de su nombre; Poned gloria en su alabanza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 66, 3, NULL, 'Decid a Dios: ¡Cuán asombrosas son tus obras! Por la grandeza de tu poder se someterán a ti tus enemigos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 66, 4, NULL, 'Toda la tierra te adorará, Y cantará a ti; Cantarán a tu nombre. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 66, 5, NULL, 'Venid, y ved las obras de Dios, Temible en hechos sobre los hijos de los hombres.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 66, 6, NULL, 'Volvió el mar en seco; Por el río pasaron a pie; Allí en él nos alegramos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 66, 7, NULL, 'Él señorea con su poder para siempre; Sus ojos atalayan sobre las naciones; Los rebeldes no serán enaltecidos. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 66, 8, NULL, 'Bendecid, pueblos, a nuestro Dios, Y haced oír la voz de su alabanza.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 66, 9, NULL, 'Él es quien preservó la vida a nuestra alma, Y no permitió que nuestros pies resbalasen.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 66, 10, NULL, 'Porque tú nos probaste, oh Dios; Nos ensayaste como se afina la plata.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 66, 11, NULL, 'Nos metiste en la red; Pusiste sobre nuestros lomos pesada carga.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 66, 12, NULL, 'Hiciste cabalgar hombres sobre nuestra cabeza; Pasamos por el fuego y por el agua, Y nos sacaste a abundancia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 66, 13, NULL, 'Entraré en tu casa con holocaustos; Te pagaré mis votos,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 66, 14, NULL, 'Que pronunciaron mis labios Y habló mi boca, cuando estaba angustiado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 66, 15, NULL, 'Holocaustos de animales engordados te ofreceré, Con sahumerio de carneros; Te ofreceré en sacrificio bueyes y machos cabríos. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 66, 16, NULL, 'Venid, oíd todos los que teméis a Dios, Y contaré lo que ha hecho a mi alma.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 66, 17, NULL, 'A él clamé con mi boca, Y fue exaltado con mi lengua.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 66, 18, NULL, 'Si en mi corazón hubiese yo mirado a la iniquidad, El Señor no me habría escuchado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 66, 19, NULL, 'Mas ciertamente me escuchó Dios; Atendió a la voz de mi súplica.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 66, 20, NULL, 'Bendito sea Dios, Que no echó de sí mi oración, ni de mí su misericordia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 67, 1, 'Exhortación a las naciones, para que alaben a Dios', 'Dios tenga misericordia de nosotros, y nos bendiga; Haga resplandecer su rostro sobre nosotros; Selah', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 67, 2, NULL, 'Para que sea conocido en la tierra tu camino, En todas las naciones tu salvación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 67, 3, NULL, 'Te alaben los pueblos, oh Dios; Todos los pueblos te alaben.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 67, 4, NULL, 'Alégrense y gócense las naciones, Porque juzgarás los pueblos con equidad, Y pastorearás las naciones en la tierra. Selah', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 67, 5, NULL, 'Te alaben los pueblos, oh Dios; Todos los pueblos te alaben.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 67, 6, NULL, 'La tierra dará su fruto; Nos bendecirá Dios, el Dios nuestro.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 67, 7, NULL, 'Bendíganos Dios, Y témanlo todos los términos de la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 68, 1, 'El Dios del Sinaí y del santuario', 'Levántese Dios, sean esparcidos sus enemigos, Y huyan de su presencia los que le aborrecen.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 68, 2, NULL, 'Como es lanzado el humo, los lanzarás; Como se derrite la cera delante del fuego, Así perecerán los impíos delante de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 68, 3, NULL, 'Mas los justos se alegrarán; se gozarán delante de Dios, Y saltarán de alegría.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 68, 4, NULL, 'Cantad a Dios, cantad salmos a su nombre; Exaltad al que cabalga sobre los cielos. JAH es su nombre; alegraos delante de él.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 68, 5, NULL, 'Padre de huérfanos y defensor de viudas Es Dios en su santa morada.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 68, 6, NULL, 'Dios hace habitar en familia a los desamparados; Saca a los cautivos a prosperidad; Mas los rebeldes habitan en tierra seca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 68, 7, NULL, 'Oh Dios, cuando tú saliste delante de tu pueblo, Cuando anduviste por el desierto, Selah', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 68, 8, NULL, 'La tierra tembló; También destilaron los cielos ante la presencia de Dios; Aquel Sinaí tembló delante de Dios, del Dios de Israel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 68, 9, NULL, 'Abundante lluvia esparciste, oh Dios; A tu heredad exhausta tú la reanimaste.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 68, 10, NULL, 'Los que son de tu grey han morado en ella; Por tu bondad, oh Dios, has provisto al pobre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 68, 11, NULL, 'El Señor daba palabra; Había grande multitud de las que llevaban buenas nuevas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 68, 12, NULL, 'Huyeron, huyeron reyes de ejércitos, Y las que se quedaban en casa repartían los despojos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 68, 13, NULL, 'Bien que fuisteis echados entre los tiestos, Seréis como alas de paloma cubiertas de plata, Y sus plumas con amarillez de oro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 68, 14, NULL, 'Cuando esparció el Omnipotente los reyes allí, Fue como si hubiese nevado en el monte Salmón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 68, 15, NULL, 'Monte de Dios es el monte de Basán; Monte alto el de Basán.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 68, 16, NULL, '¿Por qué observáis, oh montes altos, Al monte que deseó Dios para su morada? Ciertamente Jehová habitará en él para siempre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 68, 17, NULL, 'Los carros de Dios se cuentan por veintenas de millares de millares; El Señor viene del Sinaí a su santuario.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 68, 18, NULL, 'Subiste a lo alto, cautivaste la cautividad, Tomaste dones para los hombres, Y también para los rebeldes, para que habite entre ellos JAH Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 68, 19, NULL, 'Bendito el Señor; cada día nos colma de beneficios El Dios de nuestra salvación. Selah', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 68, 20, NULL, 'Dios, nuestro Dios ha de salvarnos, Y de Jehová el Señor es el librar de la muerte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 68, 21, NULL, 'Ciertamente Dios herirá la cabeza de sus enemigos, La testa cabelluda del que camina en sus pecados.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 68, 22, NULL, 'El Señor dijo: De Basán te haré volver; Te haré volver de las profundidades del mar;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 68, 23, NULL, 'Porque tu pie se enrojecerá de sangre de tus enemigos, Y de ella la lengua de tus perros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 68, 24, NULL, 'Vieron tus caminos, oh Dios; Los caminos de mi Dios, de mi Rey, en el santuario.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 68, 25, NULL, 'Los cantores iban delante, los músicos detrás; En medio las doncellas con panderos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 68, 26, NULL, 'Bendecid a Dios en las congregaciones; Al Señor, vosotros de la estirpe de Israel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 68, 27, NULL, 'Allí estaba el joven Benjamín, señoreador de ellos, Los príncipes de Judá en su congregación, Los príncipes de Zabulón, los príncipes de Neftalí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 68, 28, NULL, 'Tu Dios ha ordenado tu fuerza; Confirma, oh Dios, lo que has hecho para nosotros.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 68, 29, NULL, 'Por razón de tu templo en Jerusalén Los reyes te ofrecerán dones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 68, 30, NULL, 'Reprime la reunión de gentes armadas, La multitud de toros con los becerros de los pueblos, Hasta que todos se sometan con sus piezas de plata; Esparce a los pueblos que se complacen en la guerra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 68, 31, NULL, 'Vendrán príncipes de Egipto; Etiopía se apresurará a extender sus manos hacia Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 68, 32, NULL, 'Reinos de la tierra, cantad a Dios, Cantad al Señor; Selah', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 68, 33, NULL, 'Al que cabalga sobre los cielos de los cielos, que son desde la antigüedad; He aquí dará su voz, poderosa voz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 68, 34, NULL, 'Atribuid poder a Dios; Sobre Israel es su magnificencia, Y su poder está en los cielos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 68, 35, NULL, 'Temible eres, oh Dios, desde tus santuarios; El Dios de Israel, él da fuerza y vigor a su pueblo. Bendito sea Dios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 69, 1, 'Un grito de angustia', 'Sálvame, oh Dios, Porque las aguas han entrado hasta el alma.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 69, 2, NULL, 'Estoy hundido en cieno profundo, donde no puedo hacer pie; He venido a abismos de aguas, y la corriente me ha anegado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 69, 3, NULL, 'Cansado estoy de llamar; mi garganta se ha enronquecido; Han desfallecido mis ojos esperando a mi Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 69, 4, NULL, 'Se han aumentado más que los cabellos de mi cabeza los que me aborrecen sin causa; Se han hecho poderosos mis enemigos, los que me destruyen sin tener por qué. ¿Y he de pagar lo que no robé?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 69, 5, NULL, 'Dios, tú conoces mi insensatez, Y mis pecados no te son ocultos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 69, 6, NULL, 'No sean avergonzados por causa mía los que en ti confían, oh Señor Jehová de los ejércitos; No sean confundidos por mí los que te buscan, oh Dios de Israel.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 69, 7, NULL, 'Porque por amor de ti he sufrido afrenta; Confusión ha cubierto mi rostro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 69, 8, NULL, 'Extraño he sido para mis hermanos, Y desconocido para los hijos de mi madre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 69, 9, NULL, 'Porque me consumió el celo de tu casa; Y los denuestos de los que te vituperaban cayeron sobre mí.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 69, 10, NULL, 'Lloré afligiendo con ayuno mi alma, Y esto me ha sido por afrenta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 69, 11, NULL, 'Puse además cilicio por mi vestido, Y vine a serles por proverbio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 69, 12, NULL, 'Hablaban contra mí los que se sentaban a la puerta, Y me zaherían en sus canciones los bebedores.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 69, 13, NULL, 'Pero yo a ti oraba, oh Jehová, al tiempo de tu buena voluntad; Oh Dios, por la abundancia de tu misericordia, Por la verdad de tu salvación, escúchame.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 69, 14, NULL, 'Sácame del lodo, y no sea yo sumergido; Sea yo libertado de los que me aborrecen, y de lo profundo de las aguas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 69, 15, NULL, 'No me anegue la corriente de las aguas, Ni me trague el abismo, Ni el pozo cierre sobre mí su boca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 69, 16, NULL, 'Respóndeme, Jehová, porque benigna es tu misericordia; Mírame conforme a la multitud de tus piedades.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 69, 17, NULL, 'No escondas de tu siervo tu rostro, Porque estoy angustiado; apresúrate, óyeme.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 69, 18, NULL, 'Acércate a mi alma, redímela; Líbrame a causa de mis enemigos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 69, 19, NULL, 'Tú sabes mi afrenta, mi confusión y mi oprobio; Delante de ti están todos mis adversarios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 69, 20, NULL, 'El escarnio ha quebrantado mi corazón, y estoy acongojado. Esperé quien se compadeciese de mí, y no lo hubo; Y consoladores, y ninguno hallé.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 69, 21, NULL, 'Me pusieron además hiel por comida, Y en mi sed me dieron a beber vinagre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 69, 22, NULL, 'Sea su convite delante de ellos por lazo, Y lo que es para bien, por tropiezo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 69, 23, NULL, 'Sean oscurecidos sus ojos para que no vean, Y haz temblar continuamente sus lomos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 69, 24, NULL, 'Derrama sobre ellos tu ira, Y el furor de tu enojo los alcance.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 69, 25, NULL, 'Sea su palacio asolado; En sus tiendas no haya morador.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 69, 26, NULL, 'Porque persiguieron al que tú heriste, Y cuentan del dolor de los que tú llagaste.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 69, 27, NULL, 'Pon maldad sobre su maldad, Y no entren en tu justicia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 69, 28, NULL, 'Sean raídos del libro de los vivientes, Y no sean escritos entre los justos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 69, 29, NULL, 'Mas a mí, afligido y miserable, Tu salvación, oh Dios, me ponga en alto.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 69, 30, NULL, 'Alabaré yo el nombre de Dios con cántico, Lo exaltaré con alabanza.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 69, 31, NULL, 'Y agradará a Jehová más que sacrificio de buey, O becerro que tiene cuernos y pezuñas;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 69, 32, NULL, 'Lo verán los oprimidos, y se gozarán. Buscad a Dios, y vivirá vuestro corazón,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 69, 33, NULL, 'Porque Jehová oye a los menesterosos, Y no menosprecia a sus prisioneros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 69, 34, NULL, 'Alábenle los cielos y la tierra, Los mares, y todo lo que se mueve en ellos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 69, 35, NULL, 'Porque Dios salvará a Sion, y reedificará las ciudades de Judá; Y habitarán allí, y la poseerán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 69, 36, NULL, 'La descendencia de sus siervos la heredará, Y los que aman su nombre habitarán en ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 70, 1, 'Súplica por la liberación', 'Oh Dios, acude a librarme; Apresúrate, oh Dios, a socorrerme.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 70, 2, NULL, 'Sean avergonzados y confundidos Los que buscan mi vida; Sean vueltos atrás y avergonzados Los que mi mal desean.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 70, 3, NULL, 'Sean vueltos atrás, en pago de su afrenta hecha, Los que dicen: ¡Ah! ¡Ah!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 70, 4, NULL, 'Gócense y alégrense en ti todos los que te buscan, Y digan siempre los que aman tu salvación: Engrandecido sea Dios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 70, 5, NULL, 'Yo estoy afligido y menesteroso; Apresúrate a mí, oh Dios. Ayuda mía y mi libertador eres tú; Oh Jehová, no te detengas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 71, 1, 'Oración de un anciano', 'En ti, oh Jehová, me he refugiado; No sea yo avergonzado jamás.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 71, 2, NULL, 'Socórreme y líbrame en tu justicia; Inclina tu oído y sálvame.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 71, 3, NULL, 'Sé para mí una roca de refugio, adonde recurra yo continuamente. Tú has dado mandamiento para salvarme, Porque tú eres mi roca y mi fortaleza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 71, 4, NULL, 'Dios mío, líbrame de la mano del impío, De la mano del perverso y violento.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 71, 5, NULL, 'Porque tú, oh Señor Jehová, eres mi esperanza, Seguridad mía desde mi juventud.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 71, 6, NULL, 'En ti he sido sustentado desde el vientre; De las entrañas de mi madre tú fuiste el que me sacó; De ti será siempre mi alabanza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 71, 7, NULL, 'Como prodigio he sido a muchos, Y tú mi refugio fuerte.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 71, 8, NULL, 'Sea llena mi boca de tu alabanza, De tu gloria todo el día.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 71, 9, NULL, 'No me deseches en el tiempo de la vejez; Cuando mi fuerza se acabare, no me desampares.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 71, 10, NULL, 'Porque mis enemigos hablan de mí, Y los que acechan mi alma consultaron juntamente,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 71, 11, NULL, 'Diciendo: Dios lo ha desamparado; Perseguidle y tomadle, porque no hay quien le libre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 71, 12, NULL, 'Oh Dios, no te alejes de mí; Dios mío, acude pronto en mi socorro.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 71, 13, NULL, 'Sean avergonzados, perezcan los adversarios de mi alma; Sean cubiertos de vergüenza y de confusión los que mi mal buscan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 71, 14, NULL, 'Mas yo esperaré siempre, Y te alabaré más y más.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 71, 15, NULL, 'Mi boca publicará tu justicia Y tus hechos de salvación todo el día, Aunque no sé su número.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 71, 16, NULL, 'Vendré a los hechos poderosos de Jehová el Señor; Haré memoria de tu justicia, de la tuya sola.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 71, 17, NULL, 'Oh Dios, me enseñaste desde mi juventud, Y hasta ahora he manifestado tus maravillas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 71, 18, NULL, 'Aun en la vejez y las canas, oh Dios, no me desampares, Hasta que anuncie tu poder a la posteridad, Y tu potencia a todos los que han de venir,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 71, 19, NULL, 'Y tu justicia, oh Dios, hasta lo excelso. Tú has hecho grandes cosas; Oh Dios, ¿quién como tú?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 71, 20, NULL, 'Tú, que me has hecho ver muchas angustias y males, Volverás a darme vida, Y de nuevo me levantarás de los abismos de la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 71, 21, NULL, 'Aumentarás mi grandeza, Y volverás a consolarme.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 71, 22, NULL, 'Asimismo yo te alabaré con instrumento de salterio, Oh Dios mío; tu verdad cantaré a ti en el arpa, Oh Santo de Israel.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 71, 23, NULL, 'Mis labios se alegrarán cuando cante a ti, Y mi alma, la cual redimiste.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 71, 24, NULL, 'Mi lengua hablará también de tu justicia todo el día; Por cuanto han sido avergonzados, porque han sido confundidos los que mi mal procuraban.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 72, 1, 'El reino de un rey justo', 'Oh Dios, da tus juicios al rey, Y tu justicia al hijo del rey.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 72, 2, NULL, 'Él juzgará a tu pueblo con justicia, Y a tus afligidos con juicio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 72, 3, NULL, 'Los montes llevarán paz al pueblo, Y los collados justicia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 72, 4, NULL, 'Juzgará a los afligidos del pueblo, Salvará a los hijos del menesteroso, Y aplastará al opresor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 72, 5, NULL, 'Te temerán mientras duren el sol Y la luna, de generación en generación.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 72, 6, NULL, 'Descenderá como la lluvia sobre la hierba cortada; Como el rocío que destila sobre la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 72, 7, NULL, 'Florecerá en sus días justicia, Y muchedumbre de paz, hasta que no haya luna.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 72, 8, NULL, 'Dominará de mar a mar, Y desde el río hasta los confines de la tierra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 72, 9, NULL, 'Ante él se postrarán los moradores del desierto, Y sus enemigos lamerán el polvo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 72, 10, NULL, 'Los reyes de Tarsis y de las costas traerán presentes; Los reyes de Sabá y de Seba ofrecerán dones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 72, 11, NULL, 'Todos los reyes se postrarán delante de él; Todas las naciones le servirán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 72, 12, NULL, 'Porque él librará al menesteroso que clamare, Y al afligido que no tuviere quien le socorra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 72, 13, NULL, 'Tendrá misericordia del pobre y del menesteroso, Y salvará la vida de los pobres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 72, 14, NULL, 'De engaño y de violencia redimirá sus almas, Y la sangre de ellos será preciosa ante sus ojos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 72, 15, NULL, 'Vivirá, y se le dará del oro de Sabá, Y se orará por él continuamente; Todo el día se le bendecirá.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 72, 16, NULL, 'Será echado un puñado de grano en la tierra, en las cumbres de los montes; Su fruto hará ruido como el Líbano, Y los de la ciudad florecerán como la hierba de la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 72, 17, NULL, 'Será su nombre para siempre, Se perpetuará su nombre mientras dure el sol. Benditas serán en él todas las naciones; Lo llamarán bienaventurado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 72, 18, NULL, 'Bendito Jehová Dios, el Dios de Israel, El único que hace maravillas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 72, 19, NULL, 'Bendito su nombre glorioso para siempre, Y toda la tierra sea llena de su gloria. Amén y Amén.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 72, 20, NULL, 'Aquí terminan las oraciones de David, hijo de Isaí.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 73, 1, 'El destino de los malos', 'Ciertamente es bueno Dios para con Israel, Para con los limpios de corazón.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 73, 2, NULL, 'En cuanto a mí, casi se deslizaron mis pies; Por poco resbalaron mis pasos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 73, 3, NULL, 'Porque tuve envidia de los arrogantes, Viendo la prosperidad de los impíos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 73, 4, NULL, 'Porque no tienen congojas por su muerte, Pues su vigor está entero.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 73, 5, NULL, 'No pasan trabajos como los otros mortales, Ni son azotados como los demás hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 73, 6, NULL, 'Por tanto, la soberbia los corona; Se cubren de vestido de violencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 73, 7, NULL, 'Los ojos se les saltan de gordura; Logran con creces los antojos del corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 73, 8, NULL, 'Se mofan y hablan con maldad de hacer violencia; Hablan con altanería.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 73, 9, NULL, 'Ponen su boca contra el cielo, Y su lengua pasea la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 73, 10, NULL, 'Por eso Dios hará volver a su pueblo aquí, Y aguas en abundancia serán extraídas para ellos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 73, 11, NULL, 'Y dicen: ¿Cómo sabe Dios? ¿Y hay conocimiento en el Altísimo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 73, 12, NULL, 'He aquí estos impíos, Sin ser turbados del mundo, alcanzaron riquezas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 73, 13, NULL, 'Verdaderamente en vano he limpiado mi corazón, Y lavado mis manos en inocencia;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 73, 14, NULL, 'Pues he sido azotado todo el día, Y castigado todas las mañanas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 73, 15, NULL, 'Si dijera yo: Hablaré como ellos, He aquí, a la generación de tus hijos engañaría.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 73, 16, NULL, 'Cuando pensé para saber esto, Fue duro trabajo para mí,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 73, 17, NULL, 'Hasta que entrando en el santuario de Dios, Comprendí el fin de ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 73, 18, NULL, 'Ciertamente los has puesto en deslizaderos; En asolamientos los harás caer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 73, 19, NULL, '¡Cómo han sido asolados de repente! Perecieron, se consumieron de terrores.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 73, 20, NULL, 'Como sueño del que despierta, Así, Señor, cuando despertares, menospreciarás su apariencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 73, 21, NULL, 'Se llenó de amargura mi alma, Y en mi corazón sentía punzadas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 73, 22, NULL, 'Tan torpe era yo, que no entendía; Era como una bestia delante de ti.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 73, 23, NULL, 'Con todo, yo siempre estuve contigo; Me tomaste de la mano derecha.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 73, 24, NULL, 'Me has guiado según tu consejo, Y después me recibirás en gloria.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 73, 25, NULL, '¿A quién tengo yo en los cielos sino a ti? Y fuera de ti nada deseo en la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 73, 26, NULL, 'Mi carne y mi corazón desfallecen; Mas la roca de mi corazón y mi porción es Dios para siempre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 73, 27, NULL, 'Porque he aquí, los que se alejan de ti perecerán; Tú destruirás a todo aquel que de ti se aparta.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 73, 28, NULL, 'Pero en cuanto a mí, el acercarme a Dios es el bien; He puesto en Jehová el Señor mi esperanza, Para contar todas tus obras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 74, 1, 'Apelación a Dios en contra del enemigo', '¿Por qué, oh Dios, nos has desechado para siempre? ¿Por qué se ha encendido tu furor contra las ovejas de tu prado?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 74, 2, NULL, 'Acuérdate de tu congregación, la que adquiriste desde tiempos antiguos, La que redimiste para hacerla la tribu de tu herencia; Este monte de Sion, donde has habitado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 74, 3, NULL, 'Dirige tus pasos a los asolamientos eternos, A todo el mal que el enemigo ha hecho en el santuario.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 74, 4, NULL, 'Tus enemigos vociferan en medio de tus asambleas; Han puesto sus divisas por señales.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 74, 5, NULL, 'Se parecen a los que levantan El hacha en medio de tupido bosque.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 74, 6, NULL, 'Y ahora con hachas y martillos Han quebrado todas sus entalladuras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 74, 7, NULL, 'Han puesto a fuego tu santuario, Han profanado el tabernáculo de tu nombre, echándolo a tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 74, 8, NULL, 'Dijeron en su corazón: Destruyámoslos de una vez; Han quemado todas las sinagogas de Dios en la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 74, 9, NULL, 'No vemos ya nuestras señales; No hay más profeta, Ni entre nosotros hay quien sepa hasta cuándo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 74, 10, NULL, '¿Hasta cuándo, oh Dios, nos afrentará el angustiador? ¿Ha de blasfemar el enemigo perpetuamente tu nombre?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 74, 11, NULL, '¿Por qué retraes tu mano? ¿Por qué escondes tu diestra en tu seno?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 74, 12, NULL, 'Pero Dios es mi rey desde tiempo antiguo; El que obra salvación en medio de la tierra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 74, 13, NULL, 'Dividiste el mar con tu poder; Quebrantaste cabezas de monstruos en las aguas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 74, 14, NULL, 'Magullaste las cabezas del leviatán, Y lo diste por comida a los moradores del desierto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 74, 15, NULL, 'Abriste la fuente y el río; Secaste ríos impetuosos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 74, 16, NULL, 'Tuyo es el día, tuya también es la noche; Tú estableciste la luna y el sol.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 74, 17, NULL, 'Tú fijaste todos los términos de la tierra; El verano y el invierno tú los formaste.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 74, 18, NULL, 'Acuérdate de esto: que el enemigo ha afrentado a Jehová, Y pueblo insensato ha blasfemado tu nombre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 74, 19, NULL, 'No entregues a las fieras el alma de tu tórtola, Y no olvides para siempre la congregación de tus afligidos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 74, 20, NULL, 'Mira al pacto, Porque los lugares tenebrosos de la tierra están llenos de habitaciones de violencia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 74, 21, NULL, 'No vuelva avergonzado el abatido; El afligido y el menesteroso alabarán tu nombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 74, 22, NULL, 'Levántate, oh Dios, aboga tu causa; Acuérdate de cómo el insensato te injuria cada día.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 74, 23, NULL, 'No olvides las voces de tus enemigos; El alboroto de los que se levantan contra ti sube continuamente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 75, 1, 'Dios abate al malo y exalta al justo', 'Gracias te damos, oh Dios, gracias te damos, Pues cercano está tu nombre; Los hombres cuentan tus maravillas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 75, 2, NULL, 'Al tiempo que señalaré Yo juzgaré rectamente.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 75, 3, NULL, 'Se arruinaban la tierra y sus moradores; Yo sostengo sus columnas. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 75, 4, NULL, 'Dije a los insensatos: No os infatuéis; Y a los impíos: No os enorgullezcáis;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 75, 5, NULL, 'No hagáis alarde de vuestro poder; No habléis con cerviz erguida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 75, 6, NULL, 'Porque ni de oriente ni de occidente, Ni del desierto viene el enaltecimiento.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 75, 7, NULL, 'Mas Dios es el juez; A este humilla, y a aquel enaltece.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 75, 8, NULL, 'Porque el cáliz está en la mano de Jehová, y el vino está fermentado, Lleno de mistura; y él derrama del mismo; Hasta el fondo lo apurarán, y lo beberán todos los impíos de la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 75, 9, NULL, 'Pero yo siempre anunciaré Y cantaré alabanzas al Dios de Jacob.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 75, 10, NULL, 'Quebrantaré todo el poderío de los pecadores, Pero el poder del justo será exaltado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 76, 1, 'El Dios de la victoria y del juicio', 'Dios es conocido en Judá; En Israel es grande su nombre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 76, 2, NULL, 'En Salem está su tabernáculo, Y su habitación en Sion.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 76, 3, NULL, 'Allí quebró las saetas del arco, El escudo, la espada y las armas de guerra. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 76, 4, NULL, 'Glorioso eres tú, poderoso más que los montes de caza.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 76, 5, NULL, 'Los fuertes de corazón fueron despojados, durmieron su sueño; No hizo uso de sus manos ninguno de los varones fuertes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 76, 6, NULL, 'A tu reprensión, oh Dios de Jacob, El carro y el caballo fueron entorpecidos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 76, 7, NULL, 'Tú, temible eres tú; ¿Y quién podrá estar en pie delante de ti cuando se encienda tu ira?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 76, 8, NULL, 'Desde los cielos hiciste oír juicio; La tierra tuvo temor y quedó suspensa', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 76, 9, NULL, 'Cuando te levantaste, oh Dios, para juzgar, Para salvar a todos los mansos de la tierra. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 76, 10, NULL, 'Ciertamente la ira del hombre te alabará; Tú reprimirás el resto de las iras.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 76, 11, NULL, 'Prometed, y pagad a Jehová vuestro Dios; Todos los que están alrededor de él, traigan ofrendas al Temible.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 76, 12, NULL, 'Cortará él el espíritu de los príncipes; Temible es a los reyes de la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 77, 1, 'Meditación sobre los hechos poderosos de Dios', 'Con mi voz clamé a Dios, A Dios clamé, y él me escuchará.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 77, 2, NULL, 'Al Señor busqué en el día de mi angustia; Alzaba a él mis manos de noche, sin descanso; Mi alma rehusaba consuelo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 77, 3, NULL, 'Me acordaba de Dios, y me conmovía; Me quejaba, y desmayaba mi espíritu. Selah', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 77, 4, NULL, 'No me dejabas pegar los ojos; Estaba yo quebrantado, y no hablaba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 77, 5, NULL, 'Consideraba los días desde el principio, Los años de los siglos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 77, 6, NULL, 'Me acordaba de mis cánticos de noche; Meditaba en mi corazón, Y mi espíritu inquiría:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 77, 7, NULL, '¿Desechará el Señor para siempre, Y no volverá más a sernos propicio?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 77, 8, NULL, '¿Ha cesado para siempre su misericordia? ¿Se ha acabado perpetuamente su promesa?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 77, 9, NULL, '¿Ha olvidado Dios el tener misericordia? ¿Ha encerrado con ira sus piedades? Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 77, 10, NULL, 'Dije: Enfermedad mía es esta; Traeré, pues, a la memoria los años de la diestra del Altísimo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 77, 11, NULL, 'Me acordaré de las obras de JAH; Sí, haré yo memoria de tus maravillas antiguas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 77, 12, NULL, 'Meditaré en todas tus obras, Y hablaré de tus hechos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 77, 13, NULL, 'Oh Dios, santo es tu camino; ¿Qué dios es grande como nuestro Dios?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 77, 14, NULL, 'Tú eres el Dios que hace maravillas; Hiciste notorio en los pueblos tu poder.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 77, 15, NULL, 'Con tu brazo redimiste a tu pueblo, A los hijos de Jacob y de José. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 77, 16, NULL, 'Te vieron las aguas, oh Dios; Las aguas te vieron, y temieron; Los abismos también se estremecieron.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 77, 17, NULL, 'Las nubes echaron inundaciones de aguas; Tronaron los cielos, Y discurrieron tus rayos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 77, 18, NULL, 'La voz de tu trueno estaba en el torbellino; Tus relámpagos alumbraron el mundo; Se estremeció y tembló la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 77, 19, NULL, 'En el mar fue tu camino, Y tus sendas en las muchas aguas; Y tus pisadas no fueron conocidas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 77, 20, NULL, 'Condujiste a tu pueblo como ovejas Por mano de Moisés y de Aarón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 1, 'Fidelidad de Dios hacia su pueblo infiel', 'Escucha, pueblo mío, mi ley; Inclinad vuestro oído a las palabras de mi boca.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 2, NULL, 'Abriré mi boca en proverbios; Hablaré cosas escondidas desde tiempos antiguos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 3, NULL, 'Las cuales hemos oído y entendido; Que nuestros padres nos las contaron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 4, NULL, 'No las encubriremos a sus hijos, Contando a la generación venidera las alabanzas de Jehová, Y su potencia, y las maravillas que hizo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 5, NULL, 'Él estableció testimonio en Jacob, Y puso ley en Israel, La cual mandó a nuestros padres Que la notificasen a sus hijos;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 6, NULL, 'Para que lo sepa la generación venidera, y los hijos que nacerán; Y los que se levantarán lo cuenten a sus hijos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 7, NULL, 'A fin de que pongan en Dios su confianza, Y no se olviden de las obras de Dios; Que guarden sus mandamientos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 8, NULL, 'Y no sean como sus padres, Generación contumaz y rebelde; Generación que no dispuso su corazón, Ni fue fiel para con Dios su espíritu.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 9, NULL, 'Los hijos de Efraín, arqueros armados, Volvieron las espaldas en el día de la batalla.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 10, NULL, 'No guardaron el pacto de Dios, Ni quisieron andar en su ley;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 11, NULL, 'Sino que se olvidaron de sus obras, Y de sus maravillas que les había mostrado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 12, NULL, 'Delante de sus padres hizo maravillas En la tierra de Egipto, en el campo de Zoán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 13, NULL, 'Dividió el mar y los hizo pasar; Detuvo las aguas como en un montón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 14, NULL, 'Les guio de día con nube, Y toda la noche con resplandor de fuego.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 15, NULL, 'Hendió las peñas en el desierto, Y les dio a beber como de grandes abismos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 16, NULL, 'Pues sacó de la peña corrientes, E hizo descender aguas como ríos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 17, NULL, 'Pero aún volvieron a pecar contra él, Rebelándose contra el Altísimo en el desierto;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 18, NULL, 'Pues tentaron a Dios en su corazón, Pidiendo comida a su gusto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 19, NULL, 'Y hablaron contra Dios, Diciendo: ¿Podrá poner mesa en el desierto?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 20, NULL, 'He aquí ha herido la peña, y brotaron aguas, Y torrentes inundaron la tierra; ¿Podrá dar también pan? ¿Dispondrá carne para su pueblo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 21, NULL, 'Por tanto, oyó Jehová, y se indignó; Se encendió el fuego contra Jacob, Y el furor subió también contra Israel,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 22, NULL, 'Por cuanto no habían creído a Dios, Ni habían confiado en su salvación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 23, NULL, 'Sin embargo, mandó a las nubes de arriba, Y abrió las puertas de los cielos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 24, NULL, 'E hizo llover sobre ellos maná para que comiesen, Y les dio trigo de los cielos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 25, NULL, 'Pan de nobles comió el hombre; Les envió comida hasta saciarles.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 26, NULL, 'Movió el solano en el cielo, Y trajo con su poder el viento sur,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 27, NULL, 'E hizo llover sobre ellos carne como polvo, Como arena del mar, aves que vuelan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 28, NULL, 'Las hizo caer en medio del campamento, Alrededor de sus tiendas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 29, NULL, 'Comieron, y se saciaron; Les cumplió, pues, su deseo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 30, NULL, 'No habían quitado de sí su anhelo, Aún estaba la comida en su boca,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 31, NULL, 'Cuando vino sobre ellos el furor de Dios, E hizo morir a los más robustos de ellos, Y derribó a los escogidos de Israel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 32, NULL, 'Con todo esto, pecaron aún, Y no dieron crédito a sus maravillas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 33, NULL, 'Por tanto, consumió sus días en vanidad, Y sus años en tribulación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 34, NULL, 'Si los hacía morir, entonces buscaban a Dios; Entonces se volvían solícitos en busca suya,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 35, NULL, 'Y se acordaban de que Dios era su refugio, Y el Dios Altísimo su redentor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 36, NULL, 'Pero le lisonjeaban con su boca, Y con su lengua le mentían;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 37, NULL, 'Pues sus corazones no eran rectos con él, Ni estuvieron firmes en su pacto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 38, NULL, 'Pero él, misericordioso, perdonaba la maldad, y no los destruía; Y apartó muchas veces su ira, Y no despertó todo su enojo.', 0, 'spa', 'RVR1960', NULL);\n"
;

  public static final String SQL_PARTE_5 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Sal', 78, 39, NULL, 'Se acordó de que eran carne, Soplo que va y no vuelve.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 40, NULL, '¡Cuántas veces se rebelaron contra él en el desierto, Lo enojaron en el yermo!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 41, NULL, 'Y volvían, y tentaban a Dios, Y provocaban al Santo de Israel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 42, NULL, 'No se acordaron de su mano, Del día que los redimió de la angustia;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 43, NULL, 'Cuando puso en Egipto sus señales, Y sus maravillas en el campo de Zoán;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 44, NULL, 'Y volvió sus ríos en sangre, Y sus corrientes, para que no bebiesen.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 45, NULL, 'Envió entre ellos enjambres de moscas que los devoraban, Y ranas que los destruían.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 46, NULL, 'Dio también a la oruga sus frutos, Y sus labores a la langosta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 47, NULL, 'Sus viñas destruyó con granizo, Y sus higuerales con escarcha;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 48, NULL, 'Entregó al pedrisco sus bestias, Y sus ganados a los rayos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 49, NULL, 'Envió sobre ellos el ardor de su ira; Enojo, indignación y angustia, Un ejército de ángeles destructores.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 50, NULL, 'Dispuso camino a su furor; No eximió la vida de ellos de la muerte, Sino que entregó su vida a la mortandad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 51, NULL, 'Hizo morir a todo primogénito en Egipto, Las primicias de su fuerza en las tiendas de Cam.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 52, NULL, 'Hizo salir a su pueblo como ovejas, Y los llevó por el desierto como un rebaño.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 53, NULL, 'Los guio con seguridad, de modo que no tuvieran temor; Y el mar cubrió a sus enemigos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 54, NULL, 'Los trajo después a las fronteras de su tierra santa, A este monte que ganó su mano derecha.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 55, NULL, 'Echó las naciones de delante de ellos; Con cuerdas repartió sus tierras en heredad, E hizo habitar en sus moradas a las tribus de Israel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 56, NULL, 'Pero ellos tentaron y enojaron al Dios Altísimo, Y no guardaron sus testimonios;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 57, NULL, 'Sino que se volvieron y se rebelaron como sus padres; Se volvieron como arco engañoso.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 58, NULL, 'Le enojaron con sus lugares altos, Y le provocaron a celo con sus imágenes de talla.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 59, NULL, 'Lo oyó Dios y se enojó, Y en gran manera aborreció a Israel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 60, NULL, 'Dejó, por tanto, el tabernáculo de Silo, La tienda en que habitó entre los hombres,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 61, NULL, 'Y entregó a cautiverio su poderío, Y su gloria en mano del enemigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 62, NULL, 'Entregó también su pueblo a la espada, Y se irritó contra su heredad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 63, NULL, 'El fuego devoró a sus jóvenes, Y sus vírgenes no fueron loadas en cantos nupciales.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 64, NULL, 'Sus sacerdotes cayeron a espada, Y sus viudas no hicieron lamentación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 65, NULL, 'Entonces despertó el Señor como quien duerme, Como un valiente que grita excitado del vino,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 66, NULL, 'E hirió a sus enemigos por detrás; Les dio perpetua afrenta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 67, NULL, 'Desechó la tienda de José, Y no escogió la tribu de Efraín,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 68, NULL, 'Sino que escogió la tribu de Judá, El monte de Sion, al cual amó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 69, NULL, 'Edificó su santuario a manera de eminencia, Como la tierra que cimentó para siempre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 70, NULL, 'Eligió a David su siervo, Y lo tomó de las majadas de las ovejas;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 71, NULL, 'De tras las paridas lo trajo, Para que apacentase a Jacob su pueblo, Y a Israel su heredad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 78, 72, NULL, 'Y los apacentó conforme a la integridad de su corazón, Los pastoreó con la pericia de sus manos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 79, 1, 'Lamento por la destrucción de Jerusalén', 'Oh Dios, vinieron las naciones a tu heredad; Han profanado tu santo templo; Redujeron a Jerusalén a escombros.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 79, 2, NULL, 'Dieron los cuerpos de tus siervos por comida a las aves de los cielos, La carne de tus santos a las bestias de la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 79, 3, NULL, 'Derramaron su sangre como agua en los alrededores de Jerusalén, Y no hubo quien los enterrase.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 79, 4, NULL, 'Somos afrentados de nuestros vecinos, Escarnecidos y burlados de los que están en nuestros alrededores.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 79, 5, NULL, '¿Hasta cuándo, oh Jehová? ¿Estarás airado para siempre? ¿Arderá como fuego tu celo?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 79, 6, NULL, 'Derrama tu ira sobre las naciones que no te conocen, Y sobre los reinos que no invocan tu nombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 79, 7, NULL, 'Porque han consumido a Jacob, Y su morada han asolado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 79, 8, NULL, 'No recuerdes contra nosotros las iniquidades de nuestros antepasados; Vengan pronto tus misericordias a encontrarnos, Porque estamos muy abatidos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 79, 9, NULL, 'Ayúdanos, oh Dios de nuestra salvación, por la gloria de tu nombre; Y líbranos, y perdona nuestros pecados por amor de tu nombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 79, 10, NULL, 'Porque dirán las gentes: ¿Dónde está su Dios? Sea notoria en las gentes, delante de nuestros ojos, La venganza de la sangre de tus siervos que fue derramada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 79, 11, NULL, 'Llegue delante de ti el gemido de los presos; Conforme a la grandeza de tu brazo preserva a los sentenciados a muerte,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 79, 12, NULL, 'Y devuelve a nuestros vecinos en su seno siete tantos De su infamia, con que te han deshonrado, oh Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 79, 13, NULL, 'Y nosotros, pueblo tuyo, y ovejas de tu prado, Te alabaremos para siempre; De generación en generación cantaremos tus alabanzas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 80, 1, 'Súplica por la restauración', 'Oh Pastor de Israel, escucha; Tú que pastoreas como a ovejas a José, Que estás entre querubines, resplandece.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 80, 2, NULL, 'Despierta tu poder delante de Efraín, de Benjamín y de Manasés, Y ven a salvarnos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 80, 3, NULL, 'Oh Dios, restáuranos; Haz resplandecer tu rostro, y seremos salvos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 80, 4, NULL, 'Jehová, Dios de los ejércitos, ¿Hasta cuándo mostrarás tu indignación contra la oración de tu pueblo?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 80, 5, NULL, 'Les diste a comer pan de lágrimas, Y a beber lágrimas en gran abundancia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 80, 6, NULL, 'Nos pusiste por escarnio a nuestros vecinos, Y nuestros enemigos se burlan entre sí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 80, 7, NULL, 'Oh Dios de los ejércitos, restáuranos; Haz resplandecer tu rostro, y seremos salvos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 80, 8, NULL, 'Hiciste venir una vid de Egipto; Echaste las naciones, y la plantaste.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 80, 9, NULL, 'Limpiaste sitio delante de ella, E hiciste arraigar sus raíces, y llenó la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 80, 10, NULL, 'Los montes fueron cubiertos de su sombra, Y con sus sarmientos los cedros de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 80, 11, NULL, 'Extendió sus vástagos hasta el mar, Y hasta el río sus renuevos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 80, 12, NULL, '¿Por qué aportillaste sus vallados, Y la vendimian todos los que pasan por el camino?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 80, 13, NULL, 'La destroza el puerco montés, Y la bestia del campo la devora.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 80, 14, NULL, 'Oh Dios de los ejércitos, vuelve ahora; Mira desde el cielo, y considera, y visita esta viña,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 80, 15, NULL, 'La planta que plantó tu diestra, Y el renuevo que para ti afirmaste.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 80, 16, NULL, 'Quemada a fuego está, asolada; Perezcan por la reprensión de tu rostro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 80, 17, NULL, 'Sea tu mano sobre el varón de tu diestra, Sobre el hijo de hombre que para ti afirmaste.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 80, 18, NULL, 'Así no nos apartaremos de ti; Vida nos darás, e invocaremos tu nombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 80, 19, NULL, '¡Oh Jehová, Dios de los ejércitos, restáuranos! Haz resplandecer tu rostro, y seremos salvos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 81, 1, 'Bondad de Dios y perversidad de Israel', 'Cantad con gozo a Dios, fortaleza nuestra; Al Dios de Jacob aclamad con júbilo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 81, 2, NULL, 'Entonad canción, y tañed el pandero, El arpa deliciosa y el salterio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 81, 3, NULL, 'Tocad la trompeta en la nueva luna, En el día señalado, en el día de nuestra fiesta solemne.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 81, 4, NULL, 'Porque estatuto es de Israel, Ordenanza del Dios de Jacob.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 81, 5, NULL, 'Lo constituyó como testimonio en José Cuando salió por la tierra de Egipto. Oí lenguaje que no entendía;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 81, 6, NULL, 'Aparté su hombro de debajo de la carga; Sus manos fueron descargadas de los cestos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 81, 7, NULL, 'En la calamidad clamaste, y yo te libré; Te respondí en lo secreto del trueno; Te probé junto a las aguas de Meriba. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 81, 8, NULL, 'Oye, pueblo mío, y te amonestaré. Israel, si me oyeres,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 81, 9, NULL, 'No habrá en ti dios ajeno, Ni te inclinarás a dios extraño.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 81, 10, NULL, 'Yo soy Jehová tu Dios, Que te hice subir de la tierra de Egipto; Abre tu boca, y yo la llenaré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 81, 11, NULL, 'Pero mi pueblo no oyó mi voz, E Israel no me quiso a mí.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 81, 12, NULL, 'Los dejé, por tanto, a la dureza de su corazón; Caminaron en sus propios consejos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 81, 13, NULL, '¡Oh, si me hubiera oído mi pueblo, Si en mis caminos hubiera andado Israel!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 81, 14, NULL, 'En un momento habría yo derribado a sus enemigos, Y vuelto mi mano contra sus adversarios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 81, 15, NULL, 'Los que aborrecen a Jehová se le habrían sometido, Y el tiempo de ellos sería para siempre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 81, 16, NULL, 'Les sustentaría Dios con lo mejor del trigo, Y con miel de la peña les saciaría.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 82, 1, 'Amonestación contra los juicios injustos', 'Dios está en la reunión de los dioses; En medio de los dioses juzga.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 82, 2, NULL, '¿Hasta cuándo juzgaréis injustamente, Y aceptaréis las personas de los impíos? Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 82, 3, NULL, 'Defended al débil y al huérfano; Haced justicia al afligido y al menesteroso.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 82, 4, NULL, 'Librad al afligido y al necesitado; Libradlo de mano de los impíos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 82, 5, NULL, 'No saben, no entienden, Andan en tinieblas; Tiemblan todos los cimientos de la tierra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 82, 6, NULL, 'Yo dije: Vosotros sois dioses, Y todos vosotros hijos del Altísimo;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 82, 7, NULL, 'Pero como hombres moriréis, Y como cualquiera de los príncipes caeréis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 82, 8, NULL, 'Levántate, oh Dios, juzga la tierra; Porque tú heredarás todas las naciones.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 83, 1, 'Plegaria pidiendo la destrucción de los enemigos de Israel', 'Oh Dios, no guardes silencio; No calles, oh Dios, ni te estés quieto.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 83, 2, NULL, 'Porque he aquí que rugen tus enemigos, Y los que te aborrecen alzan cabeza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 83, 3, NULL, 'Contra tu pueblo han consultado astuta y secretamente, Y han entrado en consejo contra tus protegidos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 83, 4, NULL, 'Han dicho: Venid, y destruyámoslos para que no sean nación, Y no haya más memoria del nombre de Israel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 83, 5, NULL, 'Porque se confabulan de corazón a una, Contra ti han hecho alianza', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 83, 6, NULL, 'Las tiendas de los edomitas y de los ismaelitas, Moab y los agarenos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 83, 7, NULL, 'Gebal, Amón y Amalec, Los filisteos y los habitantes de Tiro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 83, 8, NULL, 'También el asirio se ha juntado con ellos; Sirven de brazo a los hijos de Lot. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 83, 9, NULL, 'Hazles como a Madián, Como a Sísara, como a Jabín en el arroyo de Cisón;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 83, 10, NULL, 'Que perecieron en Endor, Fueron hechos como estiércol para la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 83, 11, NULL, 'Pon a sus capitanes como a Oreb y a Zeeb; Como a Zeba y a Zalmuna a todos sus príncipes,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 83, 12, NULL, 'Que han dicho: Heredemos para nosotros Las moradas de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 83, 13, NULL, 'Dios mío, ponlos como torbellinos, Como hojarascas delante del viento,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 83, 14, NULL, 'Como fuego que quema el monte, Como llama que abrasa el bosque.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 83, 15, NULL, 'Persíguelos así con tu tempestad, Y atérralos con tu torbellino.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 83, 16, NULL, 'Llena sus rostros de vergüenza, Y busquen tu nombre, oh Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 83, 17, NULL, 'Sean afrentados y turbados para siempre; Sean deshonrados, y perezcan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 83, 18, NULL, 'Y conozcan que tu nombre es Jehová; Tú solo Altísimo sobre toda la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 84, 1, 'Anhelo por la casa de Dios', '¡Cuán amables son tus moradas, oh Jehová de los ejércitos!', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 84, 2, NULL, 'Anhela mi alma y aun ardientemente desea los atrios de Jehová; Mi corazón y mi carne cantan al Dios vivo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 84, 3, NULL, 'Aun el gorrión halla casa, Y la golondrina nido para sí, donde ponga sus polluelos, Cerca de tus altares, oh Jehová de los ejércitos, Rey mío, y Dios mío.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 84, 4, NULL, 'Bienaventurados los que habitan en tu casa; Perpetuamente te alabarán. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 84, 5, NULL, 'Bienaventurado el hombre que tiene en ti sus fuerzas, En cuyo corazón están tus caminos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 84, 6, NULL, 'Atravesando el valle de lágrimas lo cambian en fuente, Cuando la lluvia llena los estanques.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 84, 7, NULL, 'Irán de poder en poder; Verán a Dios en Sion.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 84, 8, NULL, 'Jehová Dios de los ejércitos, oye mi oración; Escucha, oh Dios de Jacob. Selah', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 84, 9, NULL, 'Mira, oh Dios, escudo nuestro, Y pon los ojos en el rostro de tu ungido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 84, 10, NULL, 'Porque mejor es un día en tus atrios que mil fuera de ellos. Escogería antes estar a la puerta de la casa de mi Dios, Que habitar en las moradas de maldad.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 84, 11, NULL, 'Porque sol y escudo es Jehová Dios; Gracia y gloria dará Jehová. No quitará el bien a los que andan en integridad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 84, 12, NULL, 'Jehová de los ejércitos, Dichoso el hombre que en ti confía.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 85, 1, 'Súplica por la misericordia de Dios sobre Israel', 'Fuiste propicio a tu tierra, oh Jehová; Volviste la cautividad de Jacob.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 85, 2, NULL, 'Perdonaste la iniquidad de tu pueblo; Todos los pecados de ellos cubriste. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 85, 3, NULL, 'Reprimiste todo tu enojo; Te apartaste del ardor de tu ira.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 85, 4, NULL, 'Restáuranos, oh Dios de nuestra salvación, Y haz cesar tu ira de sobre nosotros.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 85, 5, NULL, '¿Estarás enojado contra nosotros para siempre? ¿Extenderás tu ira de generación en generación?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 85, 6, NULL, '¿No volverás a darnos vida, Para que tu pueblo se regocije en ti?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 85, 7, NULL, 'Muéstranos, oh Jehová, tu misericordia, Y danos tu salvación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 85, 8, NULL, 'Escucharé lo que hablará Jehová Dios; Porque hablará paz a su pueblo y a sus santos, Para que no se vuelvan a la locura.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 85, 9, NULL, 'Ciertamente cercana está su salvación a los que le temen, Para que habite la gloria en nuestra tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 85, 10, NULL, 'La misericordia y la verdad se encontraron; La justicia y la paz se besaron.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 85, 11, NULL, 'La verdad brotará de la tierra, Y la justicia mirará desde los cielos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 85, 12, NULL, 'Jehová dará también el bien, Y nuestra tierra dará su fruto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 85, 13, NULL, 'La justicia irá delante de él, Y sus pasos nos pondrá por camino.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 86, 1, 'Oración pidiendo la continuada misericordia de Dios', 'Inclina, oh Jehová, tu oído, y escúchame, Porque estoy afligido y menesteroso.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 86, 2, NULL, 'Guarda mi alma, porque soy piadoso; Salva tú, oh Dios mío, a tu siervo que en ti confía.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 86, 3, NULL, 'Ten misericordia de mí, oh Jehová; Porque a ti clamo todo el día.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 86, 4, NULL, 'Alegra el alma de tu siervo, Porque a ti, oh Señor, levanto mi alma.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 86, 5, NULL, 'Porque tú, Señor, eres bueno y perdonador, Y grande en misericordia para con todos los que te invocan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 86, 6, NULL, 'Escucha, oh Jehová, mi oración, Y está atento a la voz de mis ruegos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 86, 7, NULL, 'En el día de mi angustia te llamaré, Porque tú me respondes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 86, 8, NULL, 'Oh Señor, ninguno hay como tú entre los dioses, Ni obras que igualen tus obras.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 86, 9, NULL, 'Todas las naciones que hiciste vendrán y adorarán delante de ti, Señor, Y glorificarán tu nombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 86, 10, NULL, 'Porque tú eres grande, y hacedor de maravillas; Solo tú eres Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 86, 11, NULL, 'Enséñame, oh Jehová, tu camino; caminaré yo en tu verdad; Afirma mi corazón para que tema tu nombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 86, 12, NULL, 'Te alabaré, oh Jehová Dios mío, con todo mi corazón, Y glorificaré tu nombre para siempre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 86, 13, NULL, 'Porque tu misericordia es grande para conmigo, Y has librado mi alma de las profundidades del Seol.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 86, 14, NULL, 'Oh Dios, los soberbios se levantaron contra mí, Y conspiración de violentos ha buscado mi vida, Y no te pusieron delante de sí.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 86, 15, NULL, 'Mas tú, Señor, Dios misericordioso y clemente, Lento para la ira, y grande en misericordia y verdad,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 86, 16, NULL, 'Mírame, y ten misericordia de mí; Da tu poder a tu siervo, Y guarda al hijo de tu sierva.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 86, 17, NULL, 'Haz conmigo señal para bien, Y véanla los que me aborrecen, y sean avergonzados; Porque tú, Jehová, me ayudaste y me consolaste.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 87, 1, 'El privilegio de morar en Sion', 'Su cimiento está en el monte santo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 87, 2, NULL, 'Ama Jehová las puertas de Sion Más que todas las moradas de Jacob.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 87, 3, NULL, 'Cosas gloriosas se han dicho de ti, Ciudad de Dios. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 87, 4, NULL, 'Yo me acordaré de Rahab y de Babilonia entre los que me conocen; He aquí Filistea y Tiro, con Etiopía; Este nació allá.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 87, 5, NULL, 'Y de Sion se dirá: Este y aquel han nacido en ella, Y el Altísimo mismo la establecerá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 87, 6, NULL, 'Jehová contará al inscribir a los pueblos: Este nació allí. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 87, 7, NULL, 'Y cantores y tañedores en ella dirán: Todas mis fuentes están en ti.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 88, 1, 'Súplica por la liberación de la muerte', 'Oh Jehová, Dios de mi salvación, Día y noche clamo delante de ti.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 88, 2, NULL, 'Llegue mi oración a tu presencia; Inclina tu oído a mi clamor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 88, 3, NULL, 'Porque mi alma está hastiada de males, Y mi vida cercana al Seol.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 88, 4, NULL, 'Soy contado entre los que descienden al sepulcro; Soy como hombre sin fuerza,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 88, 5, NULL, 'Abandonado entre los muertos, Como los pasados a espada que yacen en el sepulcro, De quienes no te acuerdas ya, Y que fueron arrebatados de tu mano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 88, 6, NULL, 'Me has puesto en el hoyo profundo, En tinieblas, en lugares profundos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 88, 7, NULL, 'Sobre mí reposa tu ira, Y me has afligido con todas tus ondas. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 88, 8, NULL, 'Has alejado de mí mis conocidos; Me has puesto por abominación a ellos; Encerrado estoy, y no puedo salir.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 88, 9, NULL, 'Mis ojos enfermaron a causa de mi aflicción; Te he llamado, oh Jehová, cada día; He extendido a ti mis manos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 88, 10, NULL, '¿Manifestarás tus maravillas a los muertos? ¿Se levantarán los muertos para alabarte? Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 88, 11, NULL, '¿Será contada en el sepulcro tu misericordia, O tu verdad en el Abadón?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 88, 12, NULL, '¿Serán reconocidas en las tinieblas tus maravillas, Y tu justicia en la tierra del olvido?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 88, 13, NULL, 'Mas yo a ti he clamado, oh Jehová, Y de mañana mi oración se presentará delante de ti.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 88, 14, NULL, '¿Por qué, oh Jehová, desechas mi alma? ¿Por qué escondes de mí tu rostro?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 88, 15, NULL, 'Yo estoy afligido y menesteroso; Desde la juventud he llevado tus terrores, he estado medroso.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 88, 16, NULL, 'Sobre mí han pasado tus iras, Y me oprimen tus terrores.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 88, 17, NULL, 'Me han rodeado como aguas continuamente; A una me han cercado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 88, 18, NULL, 'Has alejado de mí al amigo y al compañero, Y a mis conocidos has puesto en tinieblas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 1, 'Pacto de Dios con David', 'Las misericordias de Jehová cantaré perpetuamente; De generación en generación haré notoria tu fidelidad con mi boca.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 2, NULL, 'Porque dije: Para siempre será edificada misericordia; En los cielos mismos afirmarás tu verdad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 3, NULL, 'Hice pacto con mi escogido; Juré a David mi siervo, diciendo:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 4, NULL, 'Para siempre confirmaré tu descendencia, Y edificaré tu trono por todas las generaciones. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 5, NULL, 'Celebrarán los cielos tus maravillas, oh Jehová, Tu verdad también en la congregación de los santos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 6, NULL, 'Porque ¿quién en los cielos se igualará a Jehová? ¿Quién será semejante a Jehová entre los hijos de los potentados?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 7, NULL, 'Dios temible en la gran congregación de los santos, Y formidable sobre todos cuantos están alrededor de él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 8, NULL, 'Oh Jehová, Dios de los ejércitos, ¿Quién como tú? Poderoso eres, Jehová, Y tu fidelidad te rodea.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 9, NULL, 'Tú tienes dominio sobre la braveza del mar; Cuando se levantan sus ondas, tú las sosiegas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 10, NULL, 'Tú quebrantaste a Rahab como a herido de muerte; Con tu brazo poderoso esparciste a tus enemigos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 11, NULL, 'Tuyos son los cielos, tuya también la tierra; El mundo y su plenitud, tú lo fundaste.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 12, NULL, 'El norte y el sur, tú los creaste; El Tabor y el Hermón cantarán en tu nombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 13, NULL, 'Tuyo es el brazo potente; Fuerte es tu mano, exaltada tu diestra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 14, NULL, 'Justicia y juicio son el cimiento de tu trono; Misericordia y verdad van delante de tu rostro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 15, NULL, 'Bienaventurado el pueblo que sabe aclamarte; Andará, oh Jehová, a la luz de tu rostro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 16, NULL, 'En tu nombre se alegrará todo el día, Y en tu justicia será enaltecido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 17, NULL, 'Porque tú eres la gloria de su potencia, Y por tu buena voluntad acrecentarás nuestro poder.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 18, NULL, 'Porque Jehová es nuestro escudo, Y nuestro rey es el Santo de Israel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 19, NULL, 'Entonces hablaste en visión a tu santo, Y dijiste: He puesto el socorro sobre uno que es poderoso; He exaltado a un escogido de mi pueblo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 20, NULL, 'Hallé a David mi siervo; Lo ungí con mi santa unción.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 21, NULL, 'Mi mano estará siempre con él, Mi brazo también lo fortalecerá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 22, NULL, 'No lo sorprenderá el enemigo, Ni hijo de iniquidad lo quebrantará;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 23, NULL, 'Sino que quebrantaré delante de él a sus enemigos, Y heriré a los que le aborrecen.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 24, NULL, 'Mi verdad y mi misericordia estarán con él, Y en mi nombre será exaltado su poder.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 25, NULL, 'Asimismo pondré su mano sobre el mar, Y sobre los ríos su diestra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 26, NULL, 'Él me clamará: Mi padre eres tú, Mi Dios, y la roca de mi salvación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 27, NULL, 'Yo también le pondré por primogénito, El más excelso de los reyes de la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 28, NULL, 'Para siempre le conservaré mi misericordia, Y mi pacto será firme con él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 29, NULL, 'Pondré su descendencia para siempre, Y su trono como los días de los cielos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 30, NULL, 'Si dejaren sus hijos mi ley, Y no anduvieren en mis juicios,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 31, NULL, 'Si profanaren mis estatutos, Y no guardaren mis mandamientos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 32, NULL, 'Entonces castigaré con vara su rebelión, Y con azotes sus iniquidades.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 33, NULL, 'Mas no quitaré de él mi misericordia, Ni falsearé mi verdad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 34, NULL, 'No olvidaré mi pacto, Ni mudaré lo que ha salido de mis labios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 35, NULL, 'Una vez he jurado por mi santidad, Y no mentiré a David.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 36, NULL, 'Su descendencia será para siempre, Y su trono como el sol delante de mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 37, NULL, 'Como la luna será firme para siempre, Y como un testigo fiel en el cielo. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 38, NULL, 'Mas tú desechaste y menospreciaste a tu ungido, Y te has airado con él.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 39, NULL, 'Rompiste el pacto de tu siervo; Has profanado su corona hasta la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 40, NULL, 'Aportillaste todos sus vallados; Has destruido sus fortalezas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 41, NULL, 'Lo saquean todos los que pasan por el camino; Es oprobio a sus vecinos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 42, NULL, 'Has exaltado la diestra de sus enemigos; Has alegrado a todos sus adversarios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 43, NULL, 'Embotaste asimismo el filo de su espada, Y no lo levantaste en la batalla.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 44, NULL, 'Hiciste cesar su gloria, Y echaste su trono por tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 45, NULL, 'Has acortado los días de su juventud; Le has cubierto de afrenta. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 46, NULL, '¿Hasta cuándo, oh Jehová? ¿Te esconderás para siempre? ¿Arderá tu ira como el fuego?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 47, NULL, 'Recuerda cuán breve es mi tiempo; ¿Por qué habrás creado en vano a todo hijo de hombre?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 48, NULL, '¿Qué hombre vivirá y no verá muerte? ¿Librará su vida del poder del Seol? Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 49, NULL, 'Señor, ¿dónde están tus antiguas misericordias, Que juraste a David por tu verdad?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 50, NULL, 'Señor, acuérdate del oprobio de tus siervos; Oprobio de muchos pueblos, que llevo en mi seno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 51, NULL, 'Porque tus enemigos, oh Jehová, han deshonrado, Porque tus enemigos han deshonrado los pasos de tu ungido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 89, 52, NULL, 'Bendito sea Jehová para siempre. Amén, y Amén.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 90, 1, 'La eternidad de Dios y la transitoriedad del hombre', 'Señor, tú nos has sido refugio De generación en generación.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 90, 2, NULL, 'Antes que naciesen los montes Y formases la tierra y el mundo, Desde el siglo y hasta el siglo, tú eres Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 90, 3, NULL, 'Vuelves al hombre hasta ser quebrantado, Y dices: Convertíos, hijos de los hombres.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 90, 4, NULL, 'Porque mil años delante de tus ojos Son como el día de ayer, que pasó, Y como una de las vigilias de la noche.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 90, 5, NULL, 'Los arrebatas como con torrente de aguas; son como sueño, Como la hierba que crece en la mañana.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 90, 6, NULL, 'En la mañana florece y crece; A la tarde es cortada, y se seca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 90, 7, NULL, 'Porque con tu furor somos consumidos, Y con tu ira somos turbados.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 90, 8, NULL, 'Pusiste nuestras maldades delante de ti, Nuestros yerros a la luz de tu rostro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 90, 9, NULL, 'Porque todos nuestros días declinan a causa de tu ira; Acabamos nuestros años como un pensamiento.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 90, 10, NULL, 'Los días de nuestra edad son setenta años; Y si en los más robustos son ochenta años, Con todo, su fortaleza es molestia y trabajo, Porque pronto pasan, y volamos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 90, 11, NULL, '¿Quién conoce el poder de tu ira, Y tu indignación según que debes ser temido?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 90, 12, NULL, 'Enséñanos de tal modo a contar nuestros días, Que traigamos al corazón sabiduría.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 90, 13, NULL, 'Vuélvete, oh Jehová; ¿hasta cuándo? Y aplácate para con tus siervos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 90, 14, NULL, 'De mañana sácianos de tu misericordia, Y cantaremos y nos alegraremos todos nuestros días.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 90, 15, NULL, 'Alégranos conforme a los días que nos afligiste, Y los años en que vimos el mal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 90, 16, NULL, 'Aparezca en tus siervos tu obra, Y tu gloria sobre sus hijos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 90, 17, NULL, 'Sea la luz de Jehová nuestro Dios sobre nosotros, Y la obra de nuestras manos confirma sobre nosotros; Sí, la obra de nuestras manos confirma.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 91, 1, 'Morando bajo la sombra del Omnipotente', 'El que habita al abrigo del Altísimo Morará bajo la sombra del Omnipotente.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 91, 2, NULL, 'Diré yo a Jehová: Esperanza mía, y castillo mío; Mi Dios, en quien confiaré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 91, 3, NULL, 'Él te librará del lazo del cazador, De la peste destructora.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 91, 4, NULL, 'Con sus plumas te cubrirá, Y debajo de sus alas estarás seguro; Escudo y adarga es su verdad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 91, 5, NULL, 'No temerás el terror nocturno, Ni saeta que vuele de día,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 91, 6, NULL, 'Ni pestilencia que ande en oscuridad, Ni mortandad que en medio del día destruya.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 91, 7, NULL, 'Caerán a tu lado mil, Y diez mil a tu diestra; Mas a ti no llegará.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 91, 8, NULL, 'Ciertamente con tus ojos mirarás Y verás la recompensa de los impíos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 91, 9, NULL, 'Porque has puesto a Jehová, que es mi esperanza, Al Altísimo por tu habitación,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 91, 10, NULL, 'No te sobrevendrá mal, Ni plaga tocará tu morada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 91, 11, NULL, 'Pues a sus ángeles mandará acerca de ti, Que te guarden en todos tus caminos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 91, 12, NULL, 'En las manos te llevarán, Para que tu pie no tropiece en piedra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 91, 13, NULL, 'Sobre el león y el áspid pisarás; Hollarás al cachorro del león y al dragón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 91, 14, NULL, 'Por cuanto en mí ha puesto su amor, yo también lo libraré; Le pondré en alto, por cuanto ha conocido mi nombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 91, 15, NULL, 'Me invocará, y yo le responderé; Con él estaré yo en la angustia; Lo libraré y le glorificaré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 91, 16, NULL, 'Lo saciaré de larga vida, Y le mostraré mi salvación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 92, 1, 'Alabanza por la bondad de Dios', 'Bueno es alabarte, oh Jehová, Y cantar salmos a tu nombre, oh Altísimo;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 92, 2, NULL, 'Anunciar por la mañana tu misericordia, Y tu fidelidad cada noche,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 92, 3, NULL, 'En el decacordio y en el salterio, En tono suave con el arpa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 92, 4, NULL, 'Por cuanto me has alegrado, oh Jehová, con tus obras; En las obras de tus manos me gozo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 92, 5, NULL, '¡Cuán grandes son tus obras, oh Jehová! Muy profundos son tus pensamientos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 92, 6, NULL, 'El hombre necio no sabe, Y el insensato no entiende esto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 92, 7, NULL, 'Cuando brotan los impíos como la hierba, Y florecen todos los que hacen iniquidad, Es para ser destruidos eternamente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 92, 8, NULL, 'Mas tú, Jehová, para siempre eres Altísimo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 92, 9, NULL, 'Porque he aquí tus enemigos, oh Jehová, Porque he aquí, perecerán tus enemigos; Serán esparcidos todos los que hacen maldad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 92, 10, NULL, 'Pero tú aumentarás mis fuerzas como las del búfalo; Seré ungido con aceite fresco.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 92, 11, NULL, 'Y mirarán mis ojos sobre mis enemigos; Oirán mis oídos de los que se levantaron contra mí, de los malignos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 92, 12, NULL, 'El justo florecerá como la palmera; Crecerá como cedro en el Líbano.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 92, 13, NULL, 'Plantados en la casa de Jehová, En los atrios de nuestro Dios florecerán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 92, 14, NULL, 'Aun en la vejez fructificarán; Estarán vigorosos y verdes,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 92, 15, NULL, 'Para anunciar que Jehová mi fortaleza es recto, Y que en él no hay injusticia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 93, 1, 'La majestad de Jehová', 'Jehová reina; se vistió de magnificencia; Jehová se vistió, se ciñó de poder. Afirmó también el mundo, y no se moverá.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 93, 2, NULL, 'Firme es tu trono desde entonces; Tú eres eternamente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 93, 3, NULL, 'Alzaron los ríos, oh Jehová, Los ríos alzaron su sonido; Alzaron los ríos sus ondas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 93, 4, NULL, 'Jehová en las alturas es más poderoso Que el estruendo de las muchas aguas, Más que las recias ondas del mar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 93, 5, NULL, 'Tus testimonios son muy firmes; La santidad conviene a tu casa, Oh Jehová, por los siglos y para siempre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 94, 1, 'Oración clamando por venganza', 'Jehová, Dios de las venganzas, Dios de las venganzas, muéstrate.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 94, 2, NULL, 'Engrandécete, oh Juez de la tierra; Da el pago a los soberbios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 94, 3, NULL, '¿Hasta cuándo los impíos, Hasta cuándo, oh Jehová, se gozarán los impíos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 94, 4, NULL, '¿Hasta cuándo pronunciarán, hablarán cosas duras, Y se vanagloriarán todos los que hacen iniquidad?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 94, 5, NULL, 'A tu pueblo, oh Jehová, quebrantan, Y a tu heredad afligen.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 94, 6, NULL, 'A la viuda y al extranjero matan, Y a los huérfanos quitan la vida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 94, 7, NULL, 'Y dijeron: No verá JAH, Ni entenderá el Dios de Jacob.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 94, 8, NULL, 'Entended, necios del pueblo; Y vosotros, fatuos, ¿cuándo seréis sabios?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 94, 9, NULL, 'El que hizo el oído, ¿no oirá? El que formó el ojo, ¿no verá?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 94, 10, NULL, 'El que castiga a las naciones, ¿no reprenderá? ¿No sabrá el que enseña al hombre la ciencia?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 94, 11, NULL, 'Jehová conoce los pensamientos de los hombres, Que son vanidad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 94, 12, NULL, 'Bienaventurado el hombre a quien tú, JAH, corriges, Y en tu ley lo instruyes,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 94, 13, NULL, 'Para hacerle descansar en los días de aflicción, En tanto que para el impío se cava el hoyo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 94, 14, NULL, 'Porque no abandonará Jehová a su pueblo, Ni desamparará su heredad,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 94, 15, NULL, 'Sino que el juicio será vuelto a la justicia, Y en pos de ella irán todos los rectos de corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 94, 16, NULL, '¿Quién se levantará por mí contra los malignos? ¿Quién estará por mí contra los que hacen iniquidad?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 94, 17, NULL, 'Si no me ayudara Jehová, Pronto moraría mi alma en el silencio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 94, 18, NULL, 'Cuando yo decía: Mi pie resbala, Tu misericordia, oh Jehová, me sustentaba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 94, 19, NULL, 'En la multitud de mis pensamientos dentro de mí, Tus consolaciones alegraban mi alma.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 94, 20, NULL, '¿Se juntará contigo el trono de iniquidades Que hace agravio bajo forma de ley?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 94, 21, NULL, 'Se juntan contra la vida del justo, Y condenan la sangre inocente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 94, 22, NULL, 'Mas Jehová me ha sido por refugio, Y mi Dios por roca de mi confianza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 94, 23, NULL, 'Y él hará volver sobre ellos su iniquidad, Y los destruirá en su propia maldad; Los destruirá Jehová nuestro Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 95, 1, 'Cántico de alabanza y de adoración', 'Venid, aclamemos alegremente a Jehová; Cantemos con júbilo a la roca de nuestra salvación.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 95, 2, NULL, 'Lleguemos ante su presencia con alabanza; Aclamémosle con cánticos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 95, 3, NULL, 'Porque Jehová es Dios grande, Y Rey grande sobre todos los dioses.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 95, 4, NULL, 'Porque en su mano están las profundidades de la tierra, Y las alturas de los montes son suyas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 95, 5, NULL, 'Suyo también el mar, pues él lo hizo; Y sus manos formaron la tierra seca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 95, 6, NULL, 'Venid, adoremos y postrémonos; Arrodillémonos delante de Jehová nuestro Hacedor.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 95, 7, NULL, 'Porque él es nuestro Dios; Nosotros el pueblo de su prado, y ovejas de su mano. Si oyereis hoy su voz,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 95, 8, NULL, 'No endurezcáis vuestro corazón, como en Meriba, Como en el día de Masah en el desierto,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 95, 9, NULL, 'Donde me tentaron vuestros padres, Me probaron, y vieron mis obras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 95, 10, NULL, 'Cuarenta años estuve disgustado con la nación, Y dije: Pueblo es que divaga de corazón, Y no han conocido mis caminos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 95, 11, NULL, 'Por tanto, juré en mi furor Que no entrarían en mi reposo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 96, 1, 'Cántico de alabanza', 'Cantad a Jehová cántico nuevo; Cantad a Jehová, toda la tierra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 96, 2, NULL, 'Cantad a Jehová, bendecid su nombre; Anunciad de día en día su salvación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 96, 3, NULL, 'Proclamad entre las naciones su gloria, En todos los pueblos sus maravillas.', 0, 'spa', 'RVR1960', NULL);\n"
;

  public static final String SQL_PARTE_6 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Sal', 96, 4, NULL, 'Porque grande es Jehová, y digno de suprema alabanza; Temible sobre todos los dioses.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 96, 5, NULL, 'Porque todos los dioses de los pueblos son ídolos; Pero Jehová hizo los cielos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 96, 6, NULL, 'Alabanza y magnificencia delante de él; Poder y gloria en su santuario.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 96, 7, NULL, 'Tributad a Jehová, oh familias de los pueblos, Dad a Jehová la gloria y el poder.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 96, 8, NULL, 'Dad a Jehová la honra debida a su nombre; Traed ofrendas, y venid a sus atrios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 96, 9, NULL, 'Adorad a Jehová en la hermosura de la santidad; Temed delante de él, toda la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 96, 10, NULL, 'Decid entre las naciones: Jehová reina. También afirmó el mundo, no será conmovido; Juzgará a los pueblos en justicia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 96, 11, NULL, 'Alégrense los cielos, y gócese la tierra; Brame el mar y su plenitud.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 96, 12, NULL, 'Regocíjese el campo, y todo lo que en él está; Entonces todos los árboles del bosque rebosarán de contento,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 96, 13, NULL, 'Delante de Jehová que vino; Porque vino a juzgar la tierra. Juzgará al mundo con justicia, Y a los pueblos con su verdad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 97, 1, 'El dominio y el poder de Jehová', 'Jehová reina; regocíjese la tierra, Alégrense las muchas costas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 97, 2, NULL, 'Nubes y oscuridad alrededor de él; Justicia y juicio son el cimiento de su trono.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 97, 3, NULL, 'Fuego irá delante de él, Y abrasará a sus enemigos alrededor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 97, 4, NULL, 'Sus relámpagos alumbraron el mundo; La tierra vio y se estremeció.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 97, 5, NULL, 'Los montes se derritieron como cera delante de Jehová, Delante del Señor de toda la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 97, 6, NULL, 'Los cielos anunciaron su justicia, Y todos los pueblos vieron su gloria.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 97, 7, NULL, 'Avergüéncense todos los que sirven a las imágenes de talla, Los que se glorían en los ídolos. Póstrense a él todos los dioses.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 97, 8, NULL, 'Oyó Sion, y se alegró; Y las hijas de Judá, Oh Jehová, se gozaron por tus juicios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 97, 9, NULL, 'Porque tú, Jehová, eres excelso sobre toda la tierra; Eres muy exaltado sobre todos los dioses.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 97, 10, NULL, 'Los que amáis a Jehová, aborreced el mal; Él guarda las almas de sus santos; De mano de los impíos los libra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 97, 11, NULL, 'Luz está sembrada para el justo, Y alegría para los rectos de corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 97, 12, NULL, 'Alegraos, justos, en Jehová, Y alabad la memoria de su santidad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 98, 1, 'Alabanza por la justicia de Dios', 'Cantad a Jehová cántico nuevo, Porque ha hecho maravillas; Su diestra lo ha salvado, y su santo brazo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 98, 2, NULL, 'Jehová ha hecho notoria su salvación; A vista de las naciones ha descubierto su justicia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 98, 3, NULL, 'Se ha acordado de su misericordia y de su verdad para con la casa de Israel; Todos los términos de la tierra han visto la salvación de nuestro Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 98, 4, NULL, 'Cantad alegres a Jehová, toda la tierra; Levantad la voz, y aplaudid, y cantad salmos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 98, 5, NULL, 'Cantad salmos a Jehová con arpa; Con arpa y voz de cántico.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 98, 6, NULL, 'Aclamad con trompetas y sonidos de bocina, Delante del rey Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 98, 7, NULL, 'Brame el mar y su plenitud, El mundo y los que en él habitan;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 98, 8, NULL, 'Los ríos batan las manos, Los montes todos hagan regocijo', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 98, 9, NULL, 'Delante de Jehová, porque vino a juzgar la tierra. Juzgará al mundo con justicia, Y a los pueblos con rectitud.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 99, 1, 'Fidelidad de Jehová para con Israel', 'Jehová reina; temblarán los pueblos. Él está sentado sobre los querubines, se conmoverá la tierra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 99, 2, NULL, 'Jehová en Sion es grande, Y exaltado sobre todos los pueblos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 99, 3, NULL, 'Alaben tu nombre grande y temible; Él es santo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 99, 4, NULL, 'Y la gloria del rey ama el juicio; Tú confirmas la rectitud; Tú has hecho en Jacob juicio y justicia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 99, 5, NULL, 'Exaltad a Jehová nuestro Dios, Y postraos ante el estrado de sus pies; Él es santo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 99, 6, NULL, 'Moisés y Aarón entre sus sacerdotes, Y Samuel entre los que invocaron su nombre; Invocaban a Jehová, y él les respondía.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 99, 7, NULL, 'En columna de nube hablaba con ellos; Guardaban sus testimonios, y el estatuto que les había dado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 99, 8, NULL, 'Jehová Dios nuestro, tú les respondías; Les fuiste un Dios perdonador, Y retribuidor de sus obras.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 99, 9, NULL, 'Exaltad a Jehová nuestro Dios, Y postraos ante su santo monte, Porque Jehová nuestro Dios es santo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 100, 1, 'Exhortación a la gratitud', 'Cantad alegres a Dios, habitantes de toda la tierra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 100, 2, NULL, 'Servid a Jehová con alegría; Venid ante su presencia con regocijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 100, 3, NULL, 'Reconoced que Jehová es Dios; Él nos hizo, y no nosotros a nosotros mismos; Pueblo suyo somos, y ovejas de su prado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 100, 4, NULL, 'Entrad por sus puertas con acción de gracias, Por sus atrios con alabanza; Alabadle, bendecid su nombre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 100, 5, NULL, 'Porque Jehová es bueno; para siempre es su misericordia, Y su verdad por todas las generaciones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 101, 1, 'Promesa de vivir rectamente', 'Misericordia y juicio cantaré; A ti cantaré yo, oh Jehová.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 101, 2, NULL, 'Entenderé el camino de la perfección Cuando vengas a mí. En la integridad de mi corazón andaré en medio de mi casa.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 101, 3, NULL, 'No pondré delante de mis ojos cosa injusta. Aborrezco la obra de los que se desvían; Ninguno de ellos se acercará a mí.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 101, 4, NULL, 'Corazón perverso se apartará de mí; No conoceré al malvado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 101, 5, NULL, 'Al que solapadamente infama a su prójimo, yo lo destruiré; No sufriré al de ojos altaneros y de corazón vanidoso.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 101, 6, NULL, 'Mis ojos pondré en los fieles de la tierra, para que estén conmigo; El que ande en el camino de la perfección, este me servirá.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 101, 7, NULL, 'No habitará dentro de mi casa el que hace fraude; El que habla mentiras no se afirmará delante de mis ojos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 101, 8, NULL, 'De mañana destruiré a todos los impíos de la tierra, Para exterminar de la ciudad de Jehová a todos los que hagan iniquidad.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 102, 1, 'Oración de un afligido', 'Jehová, escucha mi oración, Y llegue a ti mi clamor.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 102, 2, NULL, 'No escondas de mí tu rostro en el día de mi angustia; Inclina a mí tu oído; Apresúrate a responderme el día que te invocare.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 102, 3, NULL, 'Porque mis días se han consumido como humo, Y mis huesos cual tizón están quemados.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 102, 4, NULL, 'Mi corazón está herido, y seco como la hierba, Por lo cual me olvido de comer mi pan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 102, 5, NULL, 'Por la voz de mi gemido Mis huesos se han pegado a mi carne.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 102, 6, NULL, 'Soy semejante al pelícano del desierto; Soy como el búho de las soledades;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 102, 7, NULL, 'Velo, y soy Como el pájaro solitario sobre el tejado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 102, 8, NULL, 'Cada día me afrentan mis enemigos; Los que contra mí se enfurecen, se han conjurado contra mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 102, 9, NULL, 'Por lo cual yo como ceniza a manera de pan, Y mi bebida mezclo con lágrimas,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 102, 10, NULL, 'A causa de tu enojo y de tu ira; Pues me alzaste, y me has arrojado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 102, 11, NULL, 'Mis días son como sombra que se va, Y me he secado como la hierba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 102, 12, NULL, 'Mas tú, Jehová, permanecerás para siempre, Y tu memoria de generación en generación.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 102, 13, NULL, 'Te levantarás y tendrás misericordia de Sion, Porque es tiempo de tener misericordia de ella, porque el plazo ha llegado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 102, 14, NULL, 'Porque tus siervos aman sus piedras, Y del polvo de ella tienen compasión.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 102, 15, NULL, 'Entonces las naciones temerán el nombre de Jehová, Y todos los reyes de la tierra tu gloria;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 102, 16, NULL, 'Por cuanto Jehová habrá edificado a Sion, Y en su gloria será visto;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 102, 17, NULL, 'Habrá considerado la oración de los desvalidos, Y no habrá desechado el ruego de ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 102, 18, NULL, 'Se escribirá esto para la generación venidera; Y el pueblo que está por nacer alabará a JAH,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 102, 19, NULL, 'Porque miró desde lo alto de su santuario; Jehová miró desde los cielos a la tierra,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 102, 20, NULL, 'Para oír el gemido de los presos, Para soltar a los sentenciados a muerte;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 102, 21, NULL, 'Para que publique en Sion el nombre de Jehová, Y su alabanza en Jerusalén,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 102, 22, NULL, 'Cuando los pueblos y los reinos se congreguen En uno para servir a Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 102, 23, NULL, 'Él debilitó mi fuerza en el camino; Acortó mis días.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 102, 24, NULL, 'Dije: Dios mío, no me cortes en la mitad de mis días; Por generación de generaciones son tus años.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 102, 25, NULL, 'Desde el principio tú fundaste la tierra, Y los cielos son obra de tus manos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 102, 26, NULL, 'Ellos perecerán, mas tú permanecerás; Y todos ellos como una vestidura se envejecerán; Como un vestido los mudarás, y serán mudados;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 102, 27, NULL, 'Pero tú eres el mismo, Y tus años no se acabarán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 102, 28, NULL, 'Los hijos de tus siervos habitarán seguros, Y su descendencia será establecida delante de ti.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 103, 1, 'Alabanza por las bendiciones de Dios', 'Bendice, alma mía, a Jehová, Y bendiga todo mi ser su santo nombre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 103, 2, NULL, 'Bendice, alma mía, a Jehová, Y no olvides ninguno de sus beneficios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 103, 3, NULL, 'Él es quien perdona todas tus iniquidades, El que sana todas tus dolencias;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 103, 4, NULL, 'El que rescata del hoyo tu vida, El que te corona de favores y misericordias;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 103, 5, NULL, 'El que sacia de bien tu boca De modo que te rejuvenezcas como el águila.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 103, 6, NULL, 'Jehová es el que hace justicia Y derecho a todos los que padecen violencia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 103, 7, NULL, 'Sus caminos notificó a Moisés, Y a los hijos de Israel sus obras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 103, 8, NULL, 'Misericordioso y clemente es Jehová; Lento para la ira, y grande en misericordia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 103, 9, NULL, 'No contenderá para siempre, Ni para siempre guardará el enojo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 103, 10, NULL, 'No ha hecho con nosotros conforme a nuestras iniquidades, Ni nos ha pagado conforme a nuestros pecados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 103, 11, NULL, 'Porque como la altura de los cielos sobre la tierra, Engrandeció su misericordia sobre los que le temen.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 103, 12, NULL, 'Cuanto está lejos el oriente del occidente, Hizo alejar de nosotros nuestras rebeliones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 103, 13, NULL, 'Como el padre se compadece de los hijos, Se compadece Jehová de los que le temen.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 103, 14, NULL, 'Porque él conoce nuestra condición; Se acuerda de que somos polvo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 103, 15, NULL, 'El hombre, como la hierba son sus días; Florece como la flor del campo,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 103, 16, NULL, 'Que pasó el viento por ella, y pereció, Y su lugar no la conocerá más.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 103, 17, NULL, 'Mas la misericordia de Jehová es desde la eternidad y hasta la eternidad sobre los que le temen, Y su justicia sobre los hijos de los hijos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 103, 18, NULL, 'Sobre los que guardan su pacto, Y los que se acuerdan de sus mandamientos para ponerlos por obra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 103, 19, NULL, 'Jehová estableció en los cielos su trono, Y su reino domina sobre todos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 103, 20, NULL, 'Bendecid a Jehová, vosotros sus ángeles, Poderosos en fortaleza, que ejecutáis su palabra, Obedeciendo a la voz de su precepto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 103, 21, NULL, 'Bendecid a Jehová, vosotros todos sus ejércitos, Ministros suyos, que hacéis su voluntad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 103, 22, NULL, 'Bendecid a Jehová, vosotras todas sus obras, En todos los lugares de su señorío. Bendice, alma mía, a Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 104, 1, 'Dios cuida de su creación', 'Bendice, alma mía, a Jehová. Jehová Dios mío, mucho te has engrandecido; Te has vestido de gloria y de magnificencia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 104, 2, NULL, 'El que se cubre de luz como de vestidura, Que extiende los cielos como una cortina,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 104, 3, NULL, 'Que establece sus aposentos entre las aguas, El que pone las nubes por su carroza, El que anda sobre las alas del viento;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 104, 4, NULL, 'El que hace a los vientos sus mensajeros, Y a las flamas de fuego sus ministros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 104, 5, NULL, 'Él fundó la tierra sobre sus cimientos; No será jamás removida.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 104, 6, NULL, 'Con el abismo, como con vestido, la cubriste; Sobre los montes estaban las aguas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 104, 7, NULL, 'A tu reprensión huyeron; Al sonido de tu trueno se apresuraron;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 104, 8, NULL, 'Subieron los montes, descendieron los valles, Al lugar que tú les fundaste.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 104, 9, NULL, 'Les pusiste término, el cual no traspasarán, Ni volverán a cubrir la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 104, 10, NULL, 'Tú eres el que envía las fuentes por los arroyos; Van entre los montes;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 104, 11, NULL, 'Dan de beber a todas las bestias del campo; Mitigan su sed los asnos monteses.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 104, 12, NULL, 'A sus orillas habitan las aves de los cielos; Cantan entre las ramas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 104, 13, NULL, 'Él riega los montes desde sus aposentos; Del fruto de sus obras se sacia la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 104, 14, NULL, 'Él hace producir el heno para las bestias, Y la hierba para el servicio del hombre, Sacando el pan de la tierra,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 104, 15, NULL, 'Y el vino que alegra el corazón del hombre, El aceite que hace brillar el rostro, Y el pan que sustenta la vida del hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 104, 16, NULL, 'Se llenan de savia los árboles de Jehová, Los cedros del Líbano que él plantó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 104, 17, NULL, 'Allí anidan las aves; En las hayas hace su casa la cigüeña.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 104, 18, NULL, 'Los montes altos para las cabras monteses; Las peñas, madrigueras para los conejos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 104, 19, NULL, 'Hizo la luna para los tiempos; El sol conoce su ocaso.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 104, 20, NULL, 'Pones las tinieblas, y es la noche; En ella corretean todas las bestias de la selva.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 104, 21, NULL, 'Los leoncillos rugen tras la presa, Y para buscar de Dios su comida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 104, 22, NULL, 'Sale el sol, se recogen, Y se echan en sus cuevas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 104, 23, NULL, 'Sale el hombre a su labor, Y a su labranza hasta la tarde.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 104, 24, NULL, '¡Cuán innumerables son tus obras, oh Jehová! Hiciste todas ellas con sabiduría; La tierra está llena de tus beneficios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 104, 25, NULL, 'He allí el grande y anchuroso mar, En donde se mueven seres innumerables, Seres pequeños y grandes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 104, 26, NULL, 'Allí andan las naves; Allí este leviatán que hiciste para que jugase en él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 104, 27, NULL, 'Todos ellos esperan en ti, Para que les des su comida a su tiempo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 104, 28, NULL, 'Les das, recogen; Abres tu mano, se sacian de bien.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 104, 29, NULL, 'Escondes tu rostro, se turban; Les quitas el hálito, dejan de ser, Y vuelven al polvo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 104, 30, NULL, 'Envías tu Espíritu, son creados, Y renuevas la faz de la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 104, 31, NULL, 'Sea la gloria de Jehová para siempre; Alégrese Jehová en sus obras.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 104, 32, NULL, 'Él mira a la tierra, y ella tiembla; Toca los montes, y humean.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 104, 33, NULL, 'A Jehová cantaré en mi vida; A mi Dios cantaré salmos mientras viva.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 104, 34, NULL, 'Dulce será mi meditación en él; Yo me regocijaré en Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 104, 35, NULL, 'Sean consumidos de la tierra los pecadores, Y los impíos dejen de ser. Bendice, alma mía, a Jehová. Aleluya.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 1, 'Maravillas de Jehová a favor de Israel', 'Alabad a Jehová, invocad su nombre; Dad a conocer sus obras en los pueblos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 2, NULL, 'Cantadle, cantadle salmos; Hablad de todas sus maravillas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 3, NULL, 'Gloriaos en su santo nombre; Alégrese el corazón de los que buscan a Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 4, NULL, 'Buscad a Jehová y su poder; Buscad siempre su rostro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 5, NULL, 'Acordaos de las maravillas que él ha hecho, De sus prodigios y de los juicios de su boca,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 6, NULL, 'Oh vosotros, descendencia de Abraham su siervo, Hijos de Jacob, sus escogidos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 7, NULL, 'Él es Jehová nuestro Dios; En toda la tierra están sus juicios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 8, NULL, 'Se acordó para siempre de su pacto; De la palabra que mandó para mil generaciones,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 9, NULL, 'La cual concertó con Abraham, Y de su juramento a Isaac.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 10, NULL, 'La estableció a Jacob por decreto, A Israel por pacto sempiterno,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 11, NULL, 'Diciendo: A ti te daré la tierra de Canaán Como porción de vuestra heredad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 12, NULL, 'Cuando ellos eran pocos en número, Y forasteros en ella,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 13, NULL, 'Y andaban de nación en nación, De un reino a otro pueblo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 14, NULL, 'No consintió que nadie los agraviase, Y por causa de ellos castigó a los reyes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 15, NULL, 'No toquéis, dijo, a mis ungidos, Ni hagáis mal a mis profetas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 16, NULL, 'Trajo hambre sobre la tierra, Y quebrantó todo sustento de pan.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 17, NULL, 'Envió un varón delante de ellos; A José, que fue vendido por siervo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 18, NULL, 'Afligieron sus pies con grillos; En cárcel fue puesta su persona.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 19, NULL, 'Hasta la hora que se cumplió su palabra, El dicho de Jehová le probó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 20, NULL, 'Envió el rey, y le soltó; El señor de los pueblos, y le dejó ir libre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 21, NULL, 'Lo puso por señor de su casa, Y por gobernador de todas sus posesiones,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 22, NULL, 'Para que reprimiera a sus grandes como él quisiese, Y a sus ancianos enseñara sabiduría.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 23, NULL, 'Después entró Israel en Egipto, Y Jacob moró en la tierra de Cam.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 24, NULL, 'Y multiplicó su pueblo en gran manera, Y lo hizo más fuerte que sus enemigos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 25, NULL, 'Cambió el corazón de ellos para que aborreciesen a su pueblo, Para que contra sus siervos pensasen mal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 26, NULL, 'Envió a su siervo Moisés, Y a Aarón, al cual escogió.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 27, NULL, 'Puso en ellos las palabras de sus señales, Y sus prodigios en la tierra de Cam.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 28, NULL, 'Envió tinieblas que lo oscurecieron todo; No fueron rebeldes a su palabra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 29, NULL, 'Volvió sus aguas en sangre, Y mató sus peces.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 30, NULL, 'Su tierra produjo ranas Hasta en las cámaras de sus reyes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 31, NULL, 'Habló, y vinieron enjambres de moscas, Y piojos en todos sus términos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 32, NULL, 'Les dio granizo por lluvia, Y llamas de fuego en su tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 33, NULL, 'Destrozó sus viñas y sus higueras, Y quebró los árboles de su territorio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 34, NULL, 'Habló, y vinieron langostas, Y pulgón sin número;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 35, NULL, 'Y comieron toda la hierba de su país, Y devoraron el fruto de su tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 36, NULL, 'Hirió de muerte a todos los primogénitos en su tierra, Las primicias de toda su fuerza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 37, NULL, 'Los sacó con plata y oro; Y no hubo en sus tribus enfermo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 38, NULL, 'Egipto se alegró de que salieran, Porque su terror había caído sobre ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 39, NULL, 'Extendió una nube por cubierta, Y fuego para alumbrar la noche.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 40, NULL, 'Pidieron, e hizo venir codornices; Y los sació de pan del cielo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 41, NULL, 'Abrió la peña, y fluyeron aguas; Corrieron por los sequedales como un río.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 42, NULL, 'Porque se acordó de su santa palabra Dada a Abraham su siervo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 43, NULL, 'Sacó a su pueblo con gozo; Con júbilo a sus escogidos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 44, NULL, 'Les dio las tierras de las naciones, Y las labores de los pueblos heredaron;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 105, 45, NULL, 'Para que guardasen sus estatutos, Y cumpliesen sus leyes. Aleluya.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 1, 'La rebeldía de Israel', 'Aleluya. Alabad a Jehová, porque él es bueno; Porque para siempre es su misericordia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 2, NULL, '¿Quién expresará las poderosas obras de Jehová? ¿Quién contará sus alabanzas?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 3, NULL, 'Dichosos los que guardan juicio, Los que hacen justicia en todo tiempo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 4, NULL, 'Acuérdate de mí, oh Jehová, según tu benevolencia para con tu pueblo; Visítame con tu salvación,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 5, NULL, 'Para que yo vea el bien de tus escogidos, Para que me goce en la alegría de tu nación, Y me gloríe con tu heredad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 6, NULL, 'Pecamos nosotros, como nuestros padres; Hicimos iniquidad, hicimos impiedad.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 7, NULL, 'Nuestros padres en Egipto no entendieron tus maravillas; No se acordaron de la muchedumbre de tus misericordias, Sino que se rebelaron junto al mar, el Mar Rojo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 8, NULL, 'Pero él los salvó por amor de su nombre, Para hacer notorio su poder.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 9, NULL, 'Reprendió al Mar Rojo y lo secó, Y les hizo ir por el abismo como por un desierto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 10, NULL, 'Los salvó de mano del enemigo, Y los rescató de mano del adversario.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 11, NULL, 'Cubrieron las aguas a sus enemigos; No quedó ni uno de ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 12, NULL, 'Entonces creyeron a sus palabras Y cantaron su alabanza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 13, NULL, 'Bien pronto olvidaron sus obras; No esperaron su consejo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 14, NULL, 'Se entregaron a un deseo desordenado en el desierto; Y tentaron a Dios en la soledad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 15, NULL, 'Y él les dio lo que pidieron; Mas envió mortandad sobre ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 16, NULL, 'Tuvieron envidia de Moisés en el campamento, Y contra Aarón, el santo de Jehová.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 17, NULL, 'Entonces se abrió la tierra y tragó a Datán, Y cubrió la compañía de Abiram.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 18, NULL, 'Y se encendió fuego en su junta; La llama quemó a los impíos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 19, NULL, 'Hicieron becerro en Horeb, Se postraron ante una imagen de fundición.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 20, NULL, 'Así cambiaron su gloria Por la imagen de un buey que come hierba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 21, NULL, 'Olvidaron al Dios de su salvación, Que había hecho grandezas en Egipto,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 22, NULL, 'Maravillas en la tierra de Cam, Cosas formidables sobre el Mar Rojo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 23, NULL, 'Y trató de destruirlos, De no haberse interpuesto Moisés su escogido delante de él, A fin de apartar su indignación para que no los destruyese.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 24, NULL, 'Pero aborrecieron la tierra deseable; No creyeron a su palabra,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 25, NULL, 'Antes murmuraron en sus tiendas, Y no oyeron la voz de Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 26, NULL, 'Por tanto, alzó su mano contra ellos Para abatirlos en el desierto,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 27, NULL, 'Y humillar su pueblo entre las naciones, Y esparcirlos por las tierras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 28, NULL, 'Se unieron asimismo a Baal-peor, Y comieron los sacrificios de los muertos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 29, NULL, 'Provocaron la ira de Dios con sus obras, Y se desarrolló la mortandad entre ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 30, NULL, 'Entonces se levantó Finees e hizo juicio, Y se detuvo la plaga;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 31, NULL, 'Y le fue contado por justicia De generación en generación para siempre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 32, NULL, 'También le irritaron en las aguas de Meriba; Y le fue mal a Moisés por causa de ellos,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 33, NULL, 'Porque hicieron rebelar a su espíritu, Y habló precipitadamente con sus labios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 34, NULL, 'No destruyeron a los pueblos Que Jehová les dijo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 35, NULL, 'Antes se mezclaron con las naciones, Y aprendieron sus obras,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 36, NULL, 'Y sirvieron a sus ídolos, Los cuales fueron causa de su ruina.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 37, NULL, 'Sacrificaron sus hijos y sus hijas a los demonios,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 38, NULL, 'Y derramaron la sangre inocente, la sangre de sus hijos y de sus hijas, Que ofrecieron en sacrificio a los ídolos de Canaán, Y la tierra fue contaminada con sangre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 39, NULL, 'Se contaminaron así con sus obras, Y se prostituyeron con sus hechos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 40, NULL, 'Se encendió, por tanto, el furor de Jehová sobre su pueblo, Y abominó su heredad;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 41, NULL, 'Los entregó en poder de las naciones, Y se enseñorearon de ellos los que les aborrecían.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 42, NULL, 'Sus enemigos los oprimieron, Y fueron quebrantados debajo de su mano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 43, NULL, 'Muchas veces los libró; Mas ellos se rebelaron contra su consejo, Y fueron humillados por su maldad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 44, NULL, 'Con todo, él miraba cuando estaban en angustia, Y oía su clamor;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 45, NULL, 'Y se acordaba de su pacto con ellos, Y se arrepentía conforme a la muchedumbre de sus misericordias.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 46, NULL, 'Hizo asimismo que tuviesen de ellos misericordia todos los que los tenían cautivos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 47, NULL, 'Sálvanos, Jehová Dios nuestro, Y recógenos de entre las naciones, Para que alabemos tu santo nombre, Para que nos gloriemos en tus alabanzas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 106, 48, NULL, 'Bendito Jehová Dios de Israel, Desde la eternidad y hasta la eternidad; Y diga todo el pueblo, Amén. Aleluya.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 1, 'Dios libra de la aflicción', 'Alabad a Jehová, porque él es bueno; Porque para siempre es su misericordia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 2, NULL, 'Díganlo los redimidos de Jehová, Los que ha redimido del poder del enemigo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 3, NULL, 'Y los ha congregado de las tierras, Del oriente y del occidente, Del norte y del sur.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 4, NULL, 'Anduvieron perdidos por el desierto, por la soledad sin camino, Sin hallar ciudad en donde vivir.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 5, NULL, 'Hambrientos y sedientos, Su alma desfallecía en ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 6, NULL, 'Entonces clamaron a Jehová en su angustia, Y los libró de sus aflicciones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 7, NULL, 'Los dirigió por camino derecho, Para que viniesen a ciudad habitable.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 8, NULL, 'Alaben la misericordia de Jehová, Y sus maravillas para con los hijos de los hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 9, NULL, 'Porque sacia al alma menesterosa, Y llena de bien al alma hambrienta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 10, NULL, 'Algunos moraban en tinieblas y sombra de muerte, Aprisionados en aflicción y en hierros,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 11, NULL, 'Por cuanto fueron rebeldes a las palabras de Jehová, Y aborrecieron el consejo del Altísimo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 12, NULL, 'Por eso quebrantó con el trabajo sus corazones; Cayeron, y no hubo quien los ayudase.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 13, NULL, 'Luego que clamaron a Jehová en su angustia, Los libró de sus aflicciones;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 14, NULL, 'Los sacó de las tinieblas y de la sombra de muerte, Y rompió sus prisiones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 15, NULL, 'Alaben la misericordia de Jehová, Y sus maravillas para con los hijos de los hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 16, NULL, 'Porque quebrantó las puertas de bronce, Y desmenuzó los cerrojos de hierro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 17, NULL, 'Fueron afligidos los insensatos, a causa del camino de su rebelión Y a causa de sus maldades;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 18, NULL, 'Su alma abominó todo alimento, Y llegaron hasta las puertas de la muerte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 19, NULL, 'Pero clamaron a Jehová en su angustia, Y los libró de sus aflicciones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 20, NULL, 'Envió su palabra, y los sanó, Y los libró de su ruina.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 21, NULL, 'Alaben la misericordia de Jehová, Y sus maravillas para con los hijos de los hombres;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 22, NULL, 'Ofrezcan sacrificios de alabanza, Y publiquen sus obras con júbilo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 23, NULL, 'Los que descienden al mar en naves, Y hacen negocio en las muchas aguas,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 24, NULL, 'Ellos han visto las obras de Jehová, Y sus maravillas en las profundidades.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 25, NULL, 'Porque habló, e hizo levantar un viento tempestuoso, Que encrespa sus ondas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 26, NULL, 'Suben a los cielos, descienden a los abismos; Sus almas se derriten con el mal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 27, NULL, 'Tiemblan y titubean como ebrios, Y toda su ciencia es inútil.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 28, NULL, 'Entonces claman a Jehová en su angustia, Y los libra de sus aflicciones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 29, NULL, 'Cambia la tempestad en sosiego, Y se apaciguan sus ondas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 30, NULL, 'Luego se alegran, porque se apaciguaron; Y así los guía al puerto que deseaban.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 31, NULL, 'Alaben la misericordia de Jehová, Y sus maravillas para con los hijos de los hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 32, NULL, 'Exáltenlo en la congregación del pueblo, Y en la reunión de ancianos lo alaben.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 33, NULL, 'Él convierte los ríos en desierto, Y los manantiales de las aguas en sequedales;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 34, NULL, 'La tierra fructífera en estéril, Por la maldad de los que la habitan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 35, NULL, 'Vuelve el desierto en estanques de aguas, Y la tierra seca en manantiales.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 36, NULL, 'Allí establece a los hambrientos, Y fundan ciudad en donde vivir.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 37, NULL, 'Siembran campos, y plantan viñas, Y rinden abundante fruto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 38, NULL, 'Los bendice, y se multiplican en gran manera; Y no disminuye su ganado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 39, NULL, 'Luego son menoscabados y abatidos A causa de tiranía, de males y congojas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 40, NULL, 'Él esparce menosprecio sobre los príncipes, Y les hace andar perdidos, vagabundos y sin camino.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 41, NULL, 'Levanta de la miseria al pobre, Y hace multiplicar las familias como rebaños de ovejas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 42, NULL, 'Véanlo los rectos, y alégrense, Y todos los malos cierren su boca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 107, 43, NULL, '¿Quién es sabio y guardará estas cosas, Y entenderá las misericordias de Jehová?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 108, 1, 'Petición de ayuda contra el enemigo', 'Mi corazón está dispuesto, oh Dios; Cantaré y entonaré salmos; esta es mi gloria.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 108, 2, NULL, 'Despiértate, salterio y arpa; Despertaré al alba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 108, 3, NULL, 'Te alabaré, oh Jehová, entre los pueblos; A ti cantaré salmos entre las naciones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 108, 4, NULL, 'Porque más grande que los cielos es tu misericordia, Y hasta los cielos tu verdad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 108, 5, NULL, 'Exaltado seas sobre los cielos, oh Dios, Y sobre toda la tierra sea enaltecida tu gloria.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 108, 6, NULL, 'Para que sean librados tus amados, Salva con tu diestra y respóndeme.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 108, 7, NULL, 'Dios ha dicho en su santuario: Yo me alegraré; Repartiré a Siquem, y mediré el valle de Sucot.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 108, 8, NULL, 'Mío es Galaad, mío es Manasés, Y Efraín es la fortaleza de mi cabeza; Judá es mi legislador.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 108, 9, NULL, 'Moab, la vasija para lavarme; Sobre Edom echaré mi calzado; Me regocijaré sobre Filistea.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 108, 10, NULL, '¿Quién me guiará a la ciudad fortificada? ¿Quién me guiará hasta Edom?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 108, 11, NULL, '¿No serás tú, oh Dios, que nos habías desechado, Y no salías, oh Dios, con nuestros ejércitos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 108, 12, NULL, 'Danos socorro contra el adversario, Porque vana es la ayuda del hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 108, 13, NULL, 'En Dios haremos proezas, Y él hollará a nuestros enemigos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 109, 1, 'Clamor de venganza', 'Oh Dios de mi alabanza, no calles;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 109, 2, NULL, 'Porque boca de impío y boca de engañador se han abierto contra mí; Han hablado de mí con lengua mentirosa;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 109, 3, NULL, 'Con palabras de odio me han rodeado, Y pelearon contra mí sin causa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 109, 4, NULL, 'En pago de mi amor me han sido adversarios; Mas yo oraba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 109, 5, NULL, 'Me devuelven mal por bien, Y odio por amor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 109, 6, NULL, 'Pon sobre él al impío, Y Satanás esté a su diestra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 109, 7, NULL, 'Cuando fuere juzgado, salga culpable; Y su oración sea para pecado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 109, 8, NULL, 'Sean sus días pocos; Tome otro su oficio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 109, 9, NULL, 'Sean sus hijos huérfanos, Y su mujer viuda.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 109, 10, NULL, 'Anden sus hijos vagabundos, y mendiguen; Y procuren su pan lejos de sus desolados hogares.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 109, 11, NULL, 'Que el acreedor se apodere de todo lo que tiene, Y extraños saqueen su trabajo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 109, 12, NULL, 'No tenga quien le haga misericordia, Ni haya quien tenga compasión de sus huérfanos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 109, 13, NULL, 'Su posteridad sea destruida; En la segunda generación sea borrado su nombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 109, 14, NULL, 'Venga en memoria ante Jehová la maldad de sus padres, Y el pecado de su madre no sea borrado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 109, 15, NULL, 'Estén siempre delante de Jehová, Y él corte de la tierra su memoria,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 109, 16, NULL, 'Por cuanto no se acordó de hacer misericordia, Y persiguió al hombre afligido y menesteroso, Al quebrantado de corazón, para darle muerte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 109, 17, NULL, 'Amó la maldición, y esta le sobrevino; Y no quiso la bendición, y ella se alejó de él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 109, 18, NULL, 'Se vistió de maldición como de su vestido, Y entró como agua en sus entrañas, Y como aceite en sus huesos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 109, 19, NULL, 'Séale como vestido con que se cubra, Y en lugar de cinto con que se ciña siempre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 109, 20, NULL, 'Sea este el pago de parte de Jehová a los que me calumnian, Y a los que hablan mal contra mi alma.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 109, 21, NULL, 'Y tú, Jehová, Señor mío, favoréceme por amor de tu nombre; Líbrame, porque tu misericordia es buena.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 109, 22, NULL, 'Porque yo estoy afligido y necesitado, Y mi corazón está herido dentro de mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 109, 23, NULL, 'Me voy como la sombra cuando declina; Soy sacudido como langosta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 109, 24, NULL, 'Mis rodillas están debilitadas a causa del ayuno, Y mi carne desfallece por falta de gordura.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 109, 25, NULL, 'Yo he sido para ellos objeto de oprobio; Me miraban, y burlándose meneaban su cabeza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 109, 26, NULL, 'Ayúdame, Jehová Dios mío; Sálvame conforme a tu misericordia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 109, 27, NULL, 'Y entiendan que esta es tu mano; Que tú, Jehová, has hecho esto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 109, 28, NULL, 'Maldigan ellos, pero bendice tú; Levántense, mas sean avergonzados, y regocíjese tu siervo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 109, 29, NULL, 'Sean vestidos de ignominia los que me calumnian; Sean cubiertos de confusión como con manto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 109, 30, NULL, 'Yo alabaré a Jehová en gran manera con mi boca, Y en medio de muchos le alabaré.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 109, 31, NULL, 'Porque él se pondrá a la diestra del pobre, Para librar su alma de los que le juzgan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 110, 1, 'Jehová da dominio al rey', 'Jehová dijo a mi Señor: Siéntate a mi diestra, Hasta que ponga a tus enemigos por estrado de tus pies.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 110, 2, NULL, 'Jehová enviará desde Sion la vara de tu poder; Domina en medio de tus enemigos.', 1, 'spa', 'RVR1960', NULL);\n"
;

  public static final String SQL_PARTE_7 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Sal', 110, 3, NULL, 'Tu pueblo se te ofrecerá voluntariamente en el día de tu poder, En la hermosura de la santidad. Desde el seno de la aurora Tienes tú el rocío de tu juventud.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 110, 4, NULL, 'Juró Jehová, y no se arrepentirá: Tú eres sacerdote para siempre Según el orden de Melquisedec.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 110, 5, NULL, 'El Señor está a tu diestra; Quebrantará a los reyes en el día de su ira.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 110, 6, NULL, 'Juzgará entre las naciones, Las llenará de cadáveres; Quebrantará las cabezas en muchas tierras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 110, 7, NULL, 'Del arroyo beberá en el camino, Por lo cual levantará la cabeza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 111, 1, 'Dios cuida de su pueblo', 'Alabaré a Jehová con todo el corazón En la compañía y congregación de los rectos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 111, 2, NULL, 'Grandes son las obras de Jehová, Buscadas de todos los que las quieren.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 111, 3, NULL, 'Gloria y hermosura es su obra, Y su justicia permanece para siempre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 111, 4, NULL, 'Ha hecho memorables sus maravillas; Clemente y misericordioso es Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 111, 5, NULL, 'Ha dado alimento a los que le temen; Para siempre se acordará de su pacto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 111, 6, NULL, 'El poder de sus obras manifestó a su pueblo, Dándole la heredad de las naciones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 111, 7, NULL, 'Las obras de sus manos son verdad y juicio; Fieles son todos sus mandamientos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 111, 8, NULL, 'Afirmados eternamente y para siempre, Hechos en verdad y en rectitud.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 111, 9, NULL, 'Redención ha enviado a su pueblo; Para siempre ha ordenado su pacto; Santo y temible es su nombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 111, 10, NULL, 'El principio de la sabiduría es el temor de Jehová; Buen entendimiento tienen todos los que practican sus mandamientos; Su loor permanece para siempre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 112, 1, 'Prosperidad del que teme a Jehová', 'Bienaventurado el hombre que teme a Jehová, Y en sus mandamientos se deleita en gran manera.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 112, 2, NULL, 'Su descendencia será poderosa en la tierra; La generación de los rectos será bendita.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 112, 3, NULL, 'Bienes y riquezas hay en su casa, Y su justicia permanece para siempre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 112, 4, NULL, 'Resplandeció en las tinieblas luz a los rectos; Es clemente, misericordioso y justo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 112, 5, NULL, 'El hombre de bien tiene misericordia, y presta; Gobierna sus asuntos con juicio,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 112, 6, NULL, 'Por lo cual no resbalará jamás; En memoria eterna será el justo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 112, 7, NULL, 'No tendrá temor de malas noticias; Su corazón está firme, confiado en Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 112, 8, NULL, 'Asegurado está su corazón; no temerá, Hasta que vea en sus enemigos su deseo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 112, 9, NULL, 'Reparte, da a los pobres; Su justicia permanece para siempre; Su poder será exaltado en gloria.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 112, 10, NULL, 'Lo verá el impío y se irritará; Crujirá los dientes, y se consumirá. El deseo de los impíos perecerá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 113, 1, 'Dios levanta al pobre', 'Alabad, siervos de Jehová, Alabad el nombre de Jehová.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 113, 2, NULL, 'Sea el nombre de Jehová bendito Desde ahora y para siempre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 113, 3, NULL, 'Desde el nacimiento del sol hasta donde se pone, Sea alabado el nombre de Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 113, 4, NULL, 'Excelso sobre todas las naciones es Jehová, Sobre los cielos su gloria.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 113, 5, NULL, '¿Quién como Jehová nuestro Dios, Que se sienta en las alturas,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 113, 6, NULL, 'Que se humilla a mirar En el cielo y en la tierra?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 113, 7, NULL, 'Él levanta del polvo al pobre, Y al menesteroso alza del muladar,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 113, 8, NULL, 'Para hacerlos sentar con los príncipes, Con los príncipes de su pueblo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 113, 9, NULL, 'Él hace habitar en familia a la estéril, Que se goza en ser madre de hijos. Aleluya.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 114, 1, 'Las maravillas del éxodo', 'Cuando salió Israel de Egipto, La casa de Jacob del pueblo extranjero,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 114, 2, NULL, 'Judá vino a ser su santuario, E Israel su señorío.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 114, 3, NULL, 'El mar lo vio, y huyó; El Jordán se volvió atrás.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 114, 4, NULL, 'Los montes saltaron como carneros, Los collados como corderitos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 114, 5, NULL, '¿Qué tuviste, oh mar, que huiste? ¿Y tú, oh Jordán, que te volviste atrás?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 114, 6, NULL, 'Oh montes, ¿por qué saltasteis como carneros, Y vosotros, collados, como corderitos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 114, 7, NULL, 'A la presencia de Jehová tiembla la tierra, A la presencia del Dios de Jacob,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 114, 8, NULL, 'El cual cambió la peña en estanque de aguas, Y en fuente de aguas la roca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 115, 1, 'Dios y los ídolos', 'No a nosotros, oh Jehová, no a nosotros, Sino a tu nombre da gloria, Por tu misericordia, por tu verdad.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 115, 2, NULL, '¿Por qué han de decir las gentes: Dónde está ahora su Dios?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 115, 3, NULL, 'Nuestro Dios está en los cielos; Todo lo que quiso ha hecho.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 115, 4, NULL, 'Los ídolos de ellos son plata y oro, Obra de manos de hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 115, 5, NULL, 'Tienen boca, mas no hablan; Tienen ojos, mas no ven;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 115, 6, NULL, 'Orejas tienen, mas no oyen; Tienen narices, mas no huelen;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 115, 7, NULL, 'Manos tienen, mas no palpan; Tienen pies, mas no andan; No hablan con su garganta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 115, 8, NULL, 'Semejantes a ellos son los que los hacen, Y cualquiera que confía en ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 115, 9, NULL, 'Oh Israel, confía en Jehová; Él es tu ayuda y tu escudo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 115, 10, NULL, 'Casa de Aarón, confiad en Jehová; Él es vuestra ayuda y vuestro escudo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 115, 11, NULL, 'Los que teméis a Jehová, confiad en Jehová; Él es vuestra ayuda y vuestro escudo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 115, 12, NULL, 'Jehová se acordó de nosotros; nos bendecirá; Bendecirá a la casa de Israel; Bendecirá a la casa de Aarón.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 115, 13, NULL, 'Bendecirá a los que temen a Jehová, A pequeños y a grandes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 115, 14, NULL, 'Aumentará Jehová bendición sobre vosotros; Sobre vosotros y sobre vuestros hijos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 115, 15, NULL, 'Benditos vosotros de Jehová, Que hizo los cielos y la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 115, 16, NULL, 'Los cielos son los cielos de Jehová; Y ha dado la tierra a los hijos de los hombres.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 115, 17, NULL, 'No alabarán los muertos a JAH, Ni cuantos descienden al silencio;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 115, 18, NULL, 'Pero nosotros bendeciremos a JAH Desde ahora y para siempre. Aleluya.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 116, 1, 'Acción de gracias por haber sido librado de la muerte', 'Amo a Jehová, pues ha oído Mi voz y mis súplicas;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 116, 2, NULL, 'Porque ha inclinado a mí su oído; Por tanto, le invocaré en todos mis días.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 116, 3, NULL, 'Me rodearon ligaduras de muerte, Me encontraron las angustias del Seol; Angustia y dolor había yo hallado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 116, 4, NULL, 'Entonces invoqué el nombre de Jehová, diciendo: Oh Jehová, libra ahora mi alma.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 116, 5, NULL, 'Clemente es Jehová, y justo; Sí, misericordioso es nuestro Dios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 116, 6, NULL, 'Jehová guarda a los sencillos; Estaba yo postrado, y me salvó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 116, 7, NULL, 'Vuelve, oh alma mía, a tu reposo, Porque Jehová te ha hecho bien.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 116, 8, NULL, 'Pues tú has librado mi alma de la muerte, Mis ojos de lágrimas, Y mis pies de resbalar.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 116, 9, NULL, 'Andaré delante de Jehová En la tierra de los vivientes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 116, 10, NULL, 'Creí; por tanto hablé, Estando afligido en gran manera.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 116, 11, NULL, 'Y dije en mi apresuramiento: Todo hombre es mentiroso.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 116, 12, NULL, '¿Qué pagaré a Jehová Por todos sus beneficios para conmigo?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 116, 13, NULL, 'Tomaré la copa de la salvación, E invocaré el nombre de Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 116, 14, NULL, 'Ahora pagaré mis votos a Jehová Delante de todo su pueblo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 116, 15, NULL, 'Estimada es a los ojos de Jehová La muerte de sus santos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 116, 16, NULL, 'Oh Jehová, ciertamente yo soy tu siervo, Siervo tuyo soy, hijo de tu sierva; Tú has roto mis prisiones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 116, 17, NULL, 'Te ofreceré sacrificio de alabanza, E invocaré el nombre de Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 116, 18, NULL, 'A Jehová pagaré ahora mis votos Delante de todo su pueblo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 116, 19, NULL, 'En los atrios de la casa de Jehová, En medio de ti, oh Jerusalén. Aleluya.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 117, 1, 'Alabanza por la misericordia de Jehová', 'Alabad a Jehová, naciones todas; Pueblos todos, alabadle.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 117, 2, NULL, 'Porque ha engrandecido sobre nosotros su misericordia, Y la fidelidad de Jehová es para siempre. Aleluya.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 118, 1, 'Acción de gracias por la salvación recibida de Jehová', 'Alabad a Jehová, porque él es bueno; Porque para siempre es su misericordia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 118, 2, NULL, 'Diga ahora Israel, Que para siempre es su misericordia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 118, 3, NULL, 'Diga ahora la casa de Aarón, Que para siempre es su misericordia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 118, 4, NULL, 'Digan ahora los que temen a Jehová, Que para siempre es su misericordia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 118, 5, NULL, 'Desde la angustia invoqué a JAH, Y me respondió JAH, poniéndome en lugar espacioso.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 118, 6, NULL, 'Jehová está conmigo; no temeré Lo que me pueda hacer el hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 118, 7, NULL, 'Jehová está conmigo entre los que me ayudan; Por tanto, yo veré mi deseo en los que me aborrecen.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 118, 8, NULL, 'Mejor es confiar en Jehová Que confiar en el hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 118, 9, NULL, 'Mejor es confiar en Jehová Que confiar en príncipes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 118, 10, NULL, 'Todas las naciones me rodearon; Mas en el nombre de Jehová yo las destruiré.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 118, 11, NULL, 'Me rodearon y me asediaron; Mas en el nombre de Jehová yo las destruiré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 118, 12, NULL, 'Me rodearon como abejas; se enardecieron como fuego de espinos; Mas en el nombre de Jehová yo las destruiré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 118, 13, NULL, 'Me empujaste con violencia para que cayese, Pero me ayudó Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 118, 14, NULL, 'Mi fortaleza y mi cántico es JAH, Y él me ha sido por salvación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 118, 15, NULL, 'Voz de júbilo y de salvación hay en las tiendas de los justos; La diestra de Jehová hace proezas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 118, 16, NULL, 'La diestra de Jehová es sublime; La diestra de Jehová hace valentías.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 118, 17, NULL, 'No moriré, sino que viviré, Y contaré las obras de JAH.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 118, 18, NULL, 'Me castigó gravemente JAH, Mas no me entregó a la muerte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 118, 19, NULL, 'Abridme las puertas de la justicia; Entraré por ellas, alabaré a JAH.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 118, 20, NULL, 'Esta es puerta de Jehová; Por ella entrarán los justos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 118, 21, NULL, 'Te alabaré porque me has oído, Y me fuiste por salvación.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 118, 22, NULL, 'La piedra que desecharon los edificadores Ha venido a ser cabeza del ángulo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 118, 23, NULL, 'De parte de Jehová es esto, Y es cosa maravillosa a nuestros ojos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 118, 24, NULL, 'Este es el día que hizo Jehová; Nos gozaremos y alegraremos en él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 118, 25, NULL, 'Oh Jehová, sálvanos ahora, te ruego; Te ruego, oh Jehová, que nos hagas prosperar ahora.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 118, 26, NULL, 'Bendito el que viene en el nombre de Jehová; Desde la casa de Jehová os bendecimos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 118, 27, NULL, 'Jehová es Dios, y nos ha dado luz; Atad víctimas con cuerdas a los cuernos del altar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 118, 28, NULL, 'Mi Dios eres tú, y te alabaré; Dios mío, te exaltaré.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 118, 29, NULL, 'Alabad a Jehová, porque él es bueno; Porque para siempre es su misericordia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 1, 'Excelencias de la ley de Dios', 'Bienaventurados los perfectos de camino, Los que andan en la ley de Jehová.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 2, NULL, 'Bienaventurados los que guardan sus testimonios, Y con todo el corazón le buscan;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 3, NULL, 'Pues no hacen iniquidad Los que andan en sus caminos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 4, NULL, 'Tú encargaste Que sean muy guardados tus mandamientos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 5, NULL, '¡Ojalá fuesen ordenados mis caminos Para guardar tus estatutos!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 6, NULL, 'Entonces no sería yo avergonzado, Cuando atendiese a todos tus mandamientos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 7, NULL, 'Te alabaré con rectitud de corazón Cuando aprendiere tus justos juicios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 8, NULL, 'Tus estatutos guardaré; No me dejes enteramente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 9, NULL, '¿Con qué limpiará el joven su camino? Con guardar tu palabra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 10, NULL, 'Con todo mi corazón te he buscado; No me dejes desviarme de tus mandamientos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 11, NULL, 'En mi corazón he guardado tus dichos, Para no pecar contra ti.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 12, NULL, 'Bendito tú, oh Jehová; Enséñame tus estatutos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 13, NULL, 'Con mis labios he contado Todos los juicios de tu boca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 14, NULL, 'Me he gozado en el camino de tus testimonios Más que de toda riqueza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 15, NULL, 'En tus mandamientos meditaré; Consideraré tus caminos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 16, NULL, 'Me regocijaré en tus estatutos; No me olvidaré de tus palabras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 17, NULL, 'Haz bien a tu siervo; que viva, Y guarde tu palabra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 18, NULL, 'Abre mis ojos, y miraré Las maravillas de tu ley.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 19, NULL, 'Forastero soy yo en la tierra; No encubras de mí tus mandamientos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 20, NULL, 'Quebrantada está mi alma de desear Tus juicios en todo tiempo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 21, NULL, 'Reprendiste a los soberbios, los malditos, Que se desvían de tus mandamientos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 22, NULL, 'Aparta de mí el oprobio y el menosprecio, Porque tus testimonios he guardado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 23, NULL, 'Príncipes también se sentaron y hablaron contra mí; Mas tu siervo meditaba en tus estatutos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 24, NULL, 'Pues tus testimonios son mis delicias Y mis consejeros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 25, NULL, 'Abatida hasta el polvo está mi alma; Vivifícame según tu palabra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 26, NULL, 'Te he manifestado mis caminos, y me has respondido; Enséñame tus estatutos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 27, NULL, 'Hazme entender el camino de tus mandamientos, Para que medite en tus maravillas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 28, NULL, 'Se deshace mi alma de ansiedad; Susténtame según tu palabra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 29, NULL, 'Aparta de mí el camino de la mentira, Y en tu misericordia concédeme tu ley.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 30, NULL, 'Escogí el camino de la verdad; He puesto tus juicios delante de mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 31, NULL, 'Me he apegado a tus testimonios; Oh Jehová, no me avergüences.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 32, NULL, 'Por el camino de tus mandamientos correré, Cuando ensanches mi corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 33, NULL, 'Enséñame, oh Jehová, el camino de tus estatutos, Y lo guardaré hasta el fin.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 34, NULL, 'Dame entendimiento, y guardaré tu ley, Y la cumpliré de todo corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 35, NULL, 'Guíame por la senda de tus mandamientos, Porque en ella tengo mi voluntad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 36, NULL, 'Inclina mi corazón a tus testimonios, Y no a la avaricia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 37, NULL, 'Aparta mis ojos, que no vean la vanidad; Avívame en tu camino.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 38, NULL, 'Confirma tu palabra a tu siervo, Que te teme.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 39, NULL, 'Quita de mí el oprobio que he temido, Porque buenos son tus juicios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 40, NULL, 'He aquí yo he anhelado tus mandamientos; Vivifícame en tu justicia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 41, NULL, 'Venga a mí tu misericordia, oh Jehová; Tu salvación, conforme a tu dicho.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 42, NULL, 'Y daré por respuesta a mi avergonzador, Que en tu palabra he confiado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 43, NULL, 'No quites de mi boca en ningún tiempo la palabra de verdad, Porque en tus juicios espero.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 44, NULL, 'Guardaré tu ley siempre, Para siempre y eternamente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 45, NULL, 'Y andaré en libertad, Porque busqué tus mandamientos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 46, NULL, 'Hablaré de tus testimonios delante de los reyes, Y no me avergonzaré;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 47, NULL, 'Y me regocijaré en tus mandamientos, Los cuales he amado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 48, NULL, 'Alzaré asimismo mis manos a tus mandamientos que amé, Y meditaré en tus estatutos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 49, NULL, 'Acuérdate de la palabra dada a tu siervo, En la cual me has hecho esperar.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 50, NULL, 'Ella es mi consuelo en mi aflicción, Porque tu dicho me ha vivificado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 51, NULL, 'Los soberbios se burlaron mucho de mí, Mas no me he apartado de tu ley.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 52, NULL, 'Me acordé, oh Jehová, de tus juicios antiguos, Y me consolé.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 53, NULL, 'Horror se apoderó de mí a causa de los inicuos Que dejan tu ley.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 54, NULL, 'Cánticos fueron para mí tus estatutos En la casa en donde fui extranjero.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 55, NULL, 'Me acordé en la noche de tu nombre, oh Jehová, Y guardé tu ley.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 56, NULL, 'Estas bendiciones tuve Porque guardé tus mandamientos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 57, NULL, 'Mi porción es Jehová; He dicho que guardaré tus palabras.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 58, NULL, 'Tu presencia supliqué de todo corazón; Ten misericordia de mí según tu palabra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 59, NULL, 'Consideré mis caminos, Y volví mis pies a tus testimonios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 60, NULL, 'Me apresuré y no me retardé En guardar tus mandamientos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 61, NULL, 'Compañías de impíos me han rodeado, Mas no me he olvidado de tu ley.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 62, NULL, 'A medianoche me levanto para alabarte Por tus justos juicios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 63, NULL, 'Compañero soy yo de todos los que te temen Y guardan tus mandamientos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 64, NULL, 'De tu misericordia, oh Jehová, está llena la tierra; Enséñame tus estatutos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 65, NULL, 'Bien has hecho con tu siervo, Oh Jehová, conforme a tu palabra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 66, NULL, 'Enséñame buen sentido y sabiduría, Porque tus mandamientos he creído.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 67, NULL, 'Antes que fuera yo humillado, descarriado andaba; Mas ahora guardo tu palabra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 68, NULL, 'Bueno eres tú, y bienhechor; Enséñame tus estatutos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 69, NULL, 'Contra mí forjaron mentira los soberbios, Mas yo guardaré de todo corazón tus mandamientos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 70, NULL, 'Se engrosó el corazón de ellos como sebo, Mas yo en tu ley me he regocijado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 71, NULL, 'Bueno me es haber sido humillado, Para que aprenda tus estatutos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 72, NULL, 'Mejor me es la ley de tu boca Que millares de oro y plata.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 73, NULL, 'Tus manos me hicieron y me formaron; Hazme entender, y aprenderé tus mandamientos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 74, NULL, 'Los que te temen me verán, y se alegrarán, Porque en tu palabra he esperado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 75, NULL, 'Conozco, oh Jehová, que tus juicios son justos, Y que conforme a tu fidelidad me afligiste.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 76, NULL, 'Sea ahora tu misericordia para consolarme, Conforme a lo que has dicho a tu siervo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 77, NULL, 'Vengan a mí tus misericordias, para que viva, Porque tu ley es mi delicia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 78, NULL, 'Sean avergonzados los soberbios, porque sin causa me han calumniado; Pero yo meditaré en tus mandamientos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 79, NULL, 'Vuélvanse a mí los que te temen Y conocen tus testimonios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 80, NULL, 'Sea mi corazón íntegro en tus estatutos, Para que no sea yo avergonzado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 81, NULL, 'Desfallece mi alma por tu salvación, Mas espero en tu palabra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 82, NULL, 'Desfallecieron mis ojos por tu palabra, Diciendo: ¿Cuándo me consolarás?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 83, NULL, 'Porque estoy como el odre al humo; Pero no he olvidado tus estatutos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 84, NULL, '¿Cuántos son los días de tu siervo? ¿Cuándo harás juicio contra los que me persiguen?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 85, NULL, 'Los soberbios me han cavado hoyos; Mas no proceden según tu ley.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 86, NULL, 'Todos tus mandamientos son verdad; Sin causa me persiguen; ayúdame.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 87, NULL, 'Casi me han echado por tierra, Pero no he dejado tus mandamientos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 88, NULL, 'Vivifícame conforme a tu misericordia, Y guardaré los testimonios de tu boca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 89, NULL, 'Para siempre, oh Jehová, Permanece tu palabra en los cielos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 90, NULL, 'De generación en generación es tu fidelidad; Tú afirmaste la tierra, y subsiste.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 91, NULL, 'Por tu ordenación subsisten todas las cosas hasta hoy, Pues todas ellas te sirven.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 92, NULL, 'Si tu ley no hubiese sido mi delicia, Ya en mi aflicción hubiera perecido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 93, NULL, 'Nunca jamás me olvidaré de tus mandamientos, Porque con ellos me has vivificado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 94, NULL, 'Tuyo soy yo, sálvame, Porque he buscado tus mandamientos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 95, NULL, 'Los impíos me han aguardado para destruirme; Mas yo consideraré tus testimonios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 96, NULL, 'A toda perfección he visto fin; Amplio sobremanera es tu mandamiento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 97, NULL, '¡Oh, cuánto amo yo tu ley! Todo el día es ella mi meditación.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 98, NULL, 'Me has hecho más sabio que mis enemigos con tus mandamientos, Porque siempre están conmigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 99, NULL, 'Más que todos mis enseñadores he entendido, Porque tus testimonios son mi meditación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 100, NULL, 'Más que los viejos he entendido, Porque he guardado tus mandamientos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 101, NULL, 'De todo mal camino contuve mis pies, Para guardar tu palabra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 102, NULL, 'No me aparté de tus juicios, Porque tú me enseñaste.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 103, NULL, '¡Cuán dulces son a mi paladar tus palabras! Más que la miel a mi boca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 104, NULL, 'De tus mandamientos he adquirido inteligencia; Por tanto, he aborrecido todo camino de mentira.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 105, NULL, 'Lámpara es a mis pies tu palabra, Y lumbrera a mi camino.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 106, NULL, 'Juré y ratifiqué Que guardaré tus justos juicios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 107, NULL, 'Afligido estoy en gran manera; Vivifícame, oh Jehová, conforme a tu palabra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 108, NULL, 'Te ruego, oh Jehová, que te sean agradables los sacrificios voluntarios de mi boca, Y me enseñes tus juicios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 109, NULL, 'Mi vida está de continuo en peligro, Mas no me he olvidado de tu ley.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 110, NULL, 'Me pusieron lazo los impíos, Pero yo no me desvié de tus mandamientos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 111, NULL, 'Por heredad he tomado tus testimonios para siempre, Porque son el gozo de mi corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 112, NULL, 'Mi corazón incliné a cumplir tus estatutos De continuo, hasta el fin.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 113, NULL, 'Aborrezco a los hombres hipócritas; Mas amo tu ley.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 114, NULL, 'Mi escondedero y mi escudo eres tú; En tu palabra he esperado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 115, NULL, 'Apartaos de mí, malignos, Pues yo guardaré los mandamientos de mi Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 116, NULL, 'Susténtame conforme a tu palabra, y viviré; Y no quede yo avergonzado de mi esperanza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 117, NULL, 'Sosténme, y seré salvo, Y me regocijaré siempre en tus estatutos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 118, NULL, 'Hollaste a todos los que se desvían de tus estatutos, Porque su astucia es falsedad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 119, NULL, 'Como escorias hiciste consumir a todos los impíos de la tierra; Por tanto, yo he amado tus testimonios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 120, NULL, 'Mi carne se ha estremecido por temor de ti, Y de tus juicios tengo miedo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 121, NULL, 'Juicio y justicia he hecho; No me abandones a mis opresores.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 122, NULL, 'Afianza a tu siervo para bien; No permitas que los soberbios me opriman.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 123, NULL, 'Mis ojos desfallecieron por tu salvación, Y por la palabra de tu justicia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 124, NULL, 'Haz con tu siervo según tu misericordia, Y enséñame tus estatutos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 125, NULL, 'Tu siervo soy yo, dame entendimiento Para conocer tus testimonios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 126, NULL, 'Tiempo es de actuar, oh Jehová, Porque han invalidado tu ley.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 127, NULL, 'Por eso he amado tus mandamientos Más que el oro, y más que oro muy puro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 128, NULL, 'Por eso estimé rectos todos tus mandamientos sobre todas las cosas, Y aborrecí todo camino de mentira.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 129, NULL, 'Maravillosos son tus testimonios; Por tanto, los ha guardado mi alma.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 130, NULL, 'La exposición de tus palabras alumbra; Hace entender a los simples.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 131, NULL, 'Mi boca abrí y suspiré, Porque deseaba tus mandamientos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 132, NULL, 'Mírame, y ten misericordia de mí, Como acostumbras con los que aman tu nombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 133, NULL, 'Ordena mis pasos con tu palabra, Y ninguna iniquidad se enseñoree de mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 134, NULL, 'Líbrame de la violencia de los hombres, Y guardaré tus mandamientos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 135, NULL, 'Haz que tu rostro resplandezca sobre tu siervo, Y enséñame tus estatutos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 136, NULL, 'Ríos de agua descendieron de mis ojos, Porque no guardaban tu ley.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 137, NULL, 'Justo eres tú, oh Jehová, Y rectos tus juicios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 138, NULL, 'Tus testimonios, que has recomendado, Son rectos y muy fieles.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 139, NULL, 'Mi celo me ha consumido, Porque mis enemigos se olvidaron de tus palabras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 140, NULL, 'Sumamente pura es tu palabra, Y la ama tu siervo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 141, NULL, 'Pequeño soy yo, y desechado, Mas no me he olvidado de tus mandamientos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 142, NULL, 'Tu justicia es justicia eterna, Y tu ley la verdad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 143, NULL, 'Aflicción y angustia se han apoderado de mí, Mas tus mandamientos fueron mi delicia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 144, NULL, 'Justicia eterna son tus testimonios; Dame entendimiento, y viviré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 145, NULL, 'Clamé con todo mi corazón; respóndeme, Jehová, Y guardaré tus estatutos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 146, NULL, 'A ti clamé; sálvame, Y guardaré tus testimonios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 147, NULL, 'Me anticipé al alba, y clamé; Esperé en tu palabra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 148, NULL, 'Se anticiparon mis ojos a las vigilias de la noche, Para meditar en tus mandatos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 149, NULL, 'Oye mi voz conforme a tu misericordia; Oh Jehová, vivifícame conforme a tu juicio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 150, NULL, 'Se acercaron a la maldad los que me persiguen; Se alejaron de tu ley.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 151, NULL, 'Cercano estás tú, oh Jehová, Y todos tus mandamientos son verdad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 152, NULL, 'Hace ya mucho que he entendido tus testimonios, Que para siempre los has establecido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 153, NULL, 'Mira mi aflicción, y líbrame, Porque de tu ley no me he olvidado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 154, NULL, 'Defiende mi causa, y redímeme; Vivifícame con tu palabra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 155, NULL, 'Lejos está de los impíos la salvación, Porque no buscan tus estatutos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 156, NULL, 'Muchas son tus misericordias, oh Jehová; Vivifícame conforme a tus juicios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 157, NULL, 'Muchos son mis perseguidores y mis enemigos, Mas de tus testimonios no me he apartado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 158, NULL, 'Veía a los prevaricadores, y me disgustaba, Porque no guardaban tus palabras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 159, NULL, 'Mira, oh Jehová, que amo tus mandamientos; Vivifícame conforme a tu misericordia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 160, NULL, 'La suma de tu palabra es verdad, Y eterno es todo juicio de tu justicia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 161, NULL, 'Príncipes me han perseguido sin causa, Pero mi corazón tuvo temor de tus palabras.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 162, NULL, 'Me regocijo en tu palabra Como el que halla muchos despojos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 163, NULL, 'La mentira aborrezco y abomino; Tu ley amo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 164, NULL, 'Siete veces al día te alabo A causa de tus justos juicios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 165, NULL, 'Mucha paz tienen los que aman tu ley, Y no hay para ellos tropiezo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 166, NULL, 'Tu salvación he esperado, oh Jehová, Y tus mandamientos he puesto por obra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 167, NULL, 'Mi alma ha guardado tus testimonios, Y los he amado en gran manera.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 168, NULL, 'He guardado tus mandamientos y tus testimonios, Porque todos mis caminos están delante de ti.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 169, NULL, 'Llegue mi clamor delante de ti, oh Jehová; Dame entendimiento conforme a tu palabra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 170, NULL, 'Llegue mi oración delante de ti; Líbrame conforme a tu dicho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 171, NULL, 'Mis labios rebosarán alabanza Cuando me enseñes tus estatutos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 172, NULL, 'Hablará mi lengua tus dichos, Porque todos tus mandamientos son justicia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 173, NULL, 'Esté tu mano pronta para socorrerme, Porque tus mandamientos he escogido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 174, NULL, 'He deseado tu salvación, oh Jehová, Y tu ley es mi delicia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 175, NULL, 'Viva mi alma y te alabe, Y tus juicios me ayuden.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 119, 176, NULL, 'Yo anduve errante como oveja extraviada; busca a tu siervo, Porque no me he olvidado de tus mandamientos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 120, 1, 'Plegaria ante el peligro de la lengua engañosa', 'A Jehová clamé estando en angustia, Y él me respondió.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 120, 2, NULL, 'Libra mi alma, oh Jehová, del labio mentiroso, Y de la lengua fraudulenta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 120, 3, NULL, '¿Qué te dará, o qué te aprovechará, Oh lengua engañosa?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 120, 4, NULL, 'Agudas saetas de valiente, Con brasas de enebro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 120, 5, NULL, '¡Ay de mí, que moro en Mesec, Y habito entre las tiendas de Cedar!', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 120, 6, NULL, 'Mucho tiempo ha morado mi alma Con los que aborrecen la paz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 120, 7, NULL, 'Yo soy pacífico; Mas ellos, así que hablo, me hacen guerra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 121, 1, 'Jehová es tu guardador', 'Alzaré mis ojos a los montes; ¿De dónde vendrá mi socorro?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 121, 2, NULL, 'Mi socorro viene de Jehová, Que hizo los cielos y la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 121, 3, NULL, 'No dará tu pie al resbaladero, Ni se dormirá el que te guarda.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 121, 4, NULL, 'He aquí, no se adormecerá ni dormirá El que guarda a Israel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 121, 5, NULL, 'Jehová es tu guardador; Jehová es tu sombra a tu mano derecha.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 121, 6, NULL, 'El sol no te fatigará de día, Ni la luna de noche.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 121, 7, NULL, 'Jehová te guardará de todo mal; Él guardará tu alma.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 121, 8, NULL, 'Jehová guardará tu salida y tu entrada Desde ahora y para siempre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 122, 1, 'Oración por la paz de Jerusalén', 'Yo me alegré con los que me decían: A la casa de Jehová iremos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 122, 2, NULL, 'Nuestros pies estuvieron Dentro de tus puertas, oh Jerusalén.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 122, 3, NULL, 'Jerusalén, que se ha edificado Como una ciudad que está bien unida entre sí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 122, 4, NULL, 'Y allá subieron las tribus, las tribus de JAH, Conforme al testimonio dado a Israel, Para alabar el nombre de Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 122, 5, NULL, 'Porque allá están las sillas del juicio, Los tronos de la casa de David.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 122, 6, NULL, 'Pedid por la paz de Jerusalén; Sean prosperados los que te aman.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 122, 7, NULL, 'Sea la paz dentro de tus muros, Y el descanso dentro de tus palacios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 122, 8, NULL, 'Por amor de mis hermanos y mis compañeros Diré yo: La paz sea contigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 122, 9, NULL, 'Por amor a la casa de Jehová nuestro Dios Buscaré tu bien.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 123, 1, 'Plegaria pidiendo misericordia', 'A ti alcé mis ojos, A ti que habitas en los cielos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 123, 2, NULL, 'He aquí, como los ojos de los siervos miran a la mano de sus señores, Y como los ojos de la sierva a la mano de su señora, Así nuestros ojos miran a Jehová nuestro Dios, Hasta que tenga misericordia de nosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 123, 3, NULL, 'Ten misericordia de nosotros, oh Jehová, ten misericordia de nosotros, Porque estamos muy hastiados de menosprecio.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 123, 4, NULL, 'Hastiada está nuestra alma Del escarnio de los que están en holgura, Y del menosprecio de los soberbios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 124, 1, 'Alabanza por haber sido librado de los enemigos', 'A no haber estado Jehová por nosotros, Diga ahora Israel;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 124, 2, NULL, 'A no haber estado Jehová por nosotros, Cuando se levantaron contra nosotros los hombres,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 124, 3, NULL, 'Vivos nos habrían tragado entonces, Cuando se encendió su furor contra nosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 124, 4, NULL, 'Entonces nos habrían inundado las aguas; Sobre nuestra alma hubiera pasado el torrente;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 124, 5, NULL, 'Hubieran entonces pasado sobre nuestra alma las aguas impetuosas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 124, 6, NULL, 'Bendito sea Jehová, Que no nos dio por presa a los dientes de ellos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 124, 7, NULL, 'Nuestra alma escapó cual ave del lazo de los cazadores; Se rompió el lazo, y escapamos nosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 124, 8, NULL, 'Nuestro socorro está en el nombre de Jehová, Que hizo el cielo y la tierra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 125, 1, 'Dios protege a su pueblo', 'Los que confían en Jehová son como el monte de Sion, Que no se mueve, sino que permanece para siempre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 125, 2, NULL, 'Como Jerusalén tiene montes alrededor de ella, Así Jehová está alrededor de su pueblo Desde ahora y para siempre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 125, 3, NULL, 'Porque no reposará la vara de la impiedad sobre la heredad de los justos; No sea que extiendan los justos sus manos a la iniquidad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 125, 4, NULL, 'Haz bien, oh Jehová, a los buenos, Y a los que son rectos en su corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 125, 5, NULL, 'Mas a los que se apartan tras sus perversidades, Jehová los llevará con los que hacen iniquidad; Paz sea sobre Israel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 126, 1, 'Oración por la restauración', 'Cuando Jehová hiciere volver la cautividad de Sion, Seremos como los que sueñan.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 126, 2, NULL, 'Entonces nuestra boca se llenará de risa, Y nuestra lengua de alabanza; Entonces dirán entre las naciones: Grandes cosas ha hecho Jehová con estos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 126, 3, NULL, 'Grandes cosas ha hecho Jehová con nosotros; Estaremos alegres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 126, 4, NULL, 'Haz volver nuestra cautividad, oh Jehová, Como los arroyos del Neguev.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 126, 5, NULL, 'Los que sembraron con lágrimas, con regocijo segarán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 126, 6, NULL, 'Irá andando y llorando el que lleva la preciosa semilla; Mas volverá a venir con regocijo, trayendo sus gavillas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 127, 1, 'La prosperidad viene de Jehová', 'Si Jehová no edificare la casa, En vano trabajan los que la edifican; Si Jehová no guardare la ciudad, En vano vela la guardia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 127, 2, NULL, 'Por demás es que os levantéis de madrugada, y vayáis tarde a reposar, Y que comáis pan de dolores; Pues que a su amado dará Dios el sueño.', 0, 'spa', 'RVR1960', NULL);\n"
;

  public static final String SQL_PARTE_8 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Sal', 127, 3, NULL, 'He aquí, herencia de Jehová son los hijos; Cosa de estima el fruto del vientre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 127, 4, NULL, 'Como saetas en mano del valiente, Así son los hijos habidos en la juventud.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 127, 5, NULL, 'Bienaventurado el hombre que llenó su aljaba de ellos; No será avergonzado Cuando hablare con los enemigos en la puerta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 128, 1, 'La bienaventuranza del que teme a Jehová', 'Bienaventurado todo aquel que teme a Jehová, Que anda en sus caminos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 128, 2, NULL, 'Cuando comieres el trabajo de tus manos, Bienaventurado serás, y te irá bien.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 128, 3, NULL, 'Tu mujer será como vid que lleva fruto a los lados de tu casa; Tus hijos como plantas de olivo alrededor de tu mesa.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 128, 4, NULL, 'He aquí que así será bendecido el hombre Que teme a Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 128, 5, NULL, 'Bendígate Jehová desde Sion, Y veas el bien de Jerusalén todos los días de tu vida,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 128, 6, NULL, 'Y veas a los hijos de tus hijos. Paz sea sobre Israel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 129, 1, 'Plegaria pidiendo la destrucción de los enemigos de Sion', 'Mucho me han angustiado desde mi juventud, Puede decir ahora Israel;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 129, 2, NULL, 'Mucho me han angustiado desde mi juventud; Mas no prevalecieron contra mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 129, 3, NULL, 'Sobre mis espaldas araron los aradores; Hicieron largos surcos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 129, 4, NULL, 'Jehová es justo; Cortó las coyundas de los impíos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 129, 5, NULL, 'Serán avergonzados y vueltos atrás Todos los que aborrecen a Sion.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 129, 6, NULL, 'Serán como la hierba de los tejados, Que se seca antes que crezca;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 129, 7, NULL, 'De la cual no llenó el segador su mano, Ni sus brazos el que hace gavillas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 129, 8, NULL, 'Ni dijeron los que pasaban: Bendición de Jehová sea sobre vosotros; Os bendecimos en el nombre de Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 130, 1, 'Esperanza en que Jehová dará redención', 'De lo profundo, oh Jehová, a ti clamo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 130, 2, NULL, 'Señor, oye mi voz; Estén atentos tus oídos A la voz de mi súplica.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 130, 3, NULL, 'JAH, si mirares a los pecados, ¿Quién, oh Señor, podrá mantenerse?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 130, 4, NULL, 'Pero en ti hay perdón, Para que seas reverenciado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 130, 5, NULL, 'Esperé yo a Jehová, esperó mi alma; En su palabra he esperado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 130, 6, NULL, 'Mi alma espera a Jehová Más que los centinelas a la mañana, Más que los vigilantes a la mañana.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 130, 7, NULL, 'Espere Israel a Jehová, Porque en Jehová hay misericordia, Y abundante redención con él;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 130, 8, NULL, 'Y él redimirá a Israel De todos sus pecados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 131, 1, 'Confiando en Dios como un niño', 'Jehová, no se ha envanecido mi corazón, ni mis ojos se enaltecieron; Ni anduve en grandezas, Ni en cosas demasiado sublimes para mí.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 131, 2, NULL, 'En verdad que me he comportado y he acallado mi alma Como un niño destetado de su madre; Como un niño destetado está mi alma.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 131, 3, NULL, 'Espera, oh Israel, en Jehová, Desde ahora y para siempre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 132, 1, 'Plegaria por bendición sobre el santuario', 'Acuérdate, oh Jehová, de David, Y de toda su aflicción;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 132, 2, NULL, 'De cómo juró a Jehová, Y prometió al Fuerte de Jacob:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 132, 3, NULL, 'No entraré en la morada de mi casa, Ni subiré sobre el lecho de mi estrado;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 132, 4, NULL, 'No daré sueño a mis ojos, Ni a mis párpados adormecimiento,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 132, 5, NULL, 'Hasta que halle lugar para Jehová, Morada para el Fuerte de Jacob.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 132, 6, NULL, 'He aquí en Efrata lo oímos; Lo hallamos en los campos del bosque.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 132, 7, NULL, 'Entraremos en su tabernáculo; Nos postraremos ante el estrado de sus pies.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 132, 8, NULL, 'Levántate, oh Jehová, al lugar de tu reposo, Tú y el arca de tu poder.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 132, 9, NULL, 'Tus sacerdotes se vistan de justicia, Y se regocijen tus santos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 132, 10, NULL, 'Por amor de David tu siervo No vuelvas de tu ungido el rostro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 132, 11, NULL, 'En verdad juró Jehová a David, Y no se retractará de ello: De tu descendencia pondré sobre tu trono.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 132, 12, NULL, 'Si tus hijos guardaren mi pacto, Y mi testimonio que yo les enseñaré, Sus hijos también se sentarán sobre tu trono para siempre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 132, 13, NULL, 'Porque Jehová ha elegido a Sion; La quiso por habitación para sí.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 132, 14, NULL, 'Este es para siempre el lugar de mi reposo; Aquí habitaré, porque la he querido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 132, 15, NULL, 'Bendeciré abundantemente su provisión; A sus pobres saciaré de pan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 132, 16, NULL, 'Asimismo vestiré de salvación a sus sacerdotes, Y sus santos darán voces de júbilo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 132, 17, NULL, 'Allí haré retoñar el poder de David; He dispuesto lámpara a mi ungido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 132, 18, NULL, 'A sus enemigos vestiré de confusión, Mas sobre él florecerá su corona.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 133, 1, 'La bienaventuranza del amor fraternal', '¡Mirad cuán bueno y cuán delicioso es Habitar los hermanos juntos en armonía!', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 133, 2, NULL, 'Es como el buen óleo sobre la cabeza, El cual desciende sobre la barba, La barba de Aarón, Y baja hasta el borde de sus vestiduras;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 133, 3, NULL, 'Como el rocío de Hermón, Que desciende sobre los montes de Sion; Porque allí envía Jehová bendición, Y vida eterna.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 134, 1, 'Exhortación a los guardas del templo', 'Mirad, bendecid a Jehová, Vosotros todos los siervos de Jehová, Los que en la casa de Jehová estáis por las noches.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 134, 2, NULL, 'Alzad vuestras manos al santuario, Y bendecid a Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 134, 3, NULL, 'Desde Sion te bendiga Jehová, El cual ha hecho los cielos y la tierra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 135, 1, 'La grandeza del Señor y la vanidad de los ídolos', 'Alabad el nombre de Jehová; Alabadle, siervos de Jehová;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 135, 2, NULL, 'Los que estáis en la casa de Jehová, En los atrios de la casa de nuestro Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 135, 3, NULL, 'Alabad a JAH, porque él es bueno; Cantad salmos a su nombre, porque él es benigno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 135, 4, NULL, 'Porque JAH ha escogido a Jacob para sí, A Israel por posesión suya.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 135, 5, NULL, 'Porque yo sé que Jehová es grande, Y el Señor nuestro, mayor que todos los dioses.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 135, 6, NULL, 'Todo lo que Jehová quiere, lo hace, En los cielos y en la tierra, en los mares y en todos los abismos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 135, 7, NULL, 'Hace subir las nubes de los extremos de la tierra; Hace los relámpagos para la lluvia; Saca de sus depósitos los vientos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 135, 8, NULL, 'Él es quien hizo morir a los primogénitos de Egipto, Desde el hombre hasta la bestia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 135, 9, NULL, 'Envió señales y prodigios en medio de ti, oh Egipto, Contra Faraón, y contra todos sus siervos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 135, 10, NULL, 'Destruyó a muchas naciones, Y mató a reyes poderosos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 135, 11, NULL, 'A Sehón rey amorreo, A Og rey de Basán, Y a todos los reyes de Canaán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 135, 12, NULL, 'Y dio la tierra de ellos en heredad, En heredad a Israel su pueblo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 135, 13, NULL, 'Oh Jehová, eterno es tu nombre; Tu memoria, oh Jehová, de generación en generación.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 135, 14, NULL, 'Porque Jehová juzgará a su pueblo, Y se compadecerá de sus siervos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 135, 15, NULL, 'Los ídolos de las naciones son plata y oro, Obra de manos de hombres.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 135, 16, NULL, 'Tienen boca, y no hablan; Tienen ojos, y no ven;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 135, 17, NULL, 'Tienen orejas, y no oyen; Tampoco hay aliento en sus bocas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 135, 18, NULL, 'Semejantes a ellos son los que los hacen, Y todos los que en ellos confían.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 135, 19, NULL, 'Casa de Israel, bendecid a Jehová; Casa de Aarón, bendecid a Jehová;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 135, 20, NULL, 'Casa de Leví, bendecid a Jehová; Los que teméis a Jehová, bendecid a Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 135, 21, NULL, 'Desde Sion sea bendecido Jehová, Quien mora en Jerusalén. Aleluya.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 136, 1, 'Alabanza por la misericordia eterna de Jehová', 'Alabad a Jehová, porque él es bueno, Porque para siempre es su misericordia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 136, 2, NULL, 'Alabad al Dios de los dioses, Porque para siempre es su misericordia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 136, 3, NULL, 'Alabad al Señor de los señores, Porque para siempre es su misericordia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 136, 4, NULL, 'Al único que hace grandes maravillas, Porque para siempre es su misericordia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 136, 5, NULL, 'Al que hizo los cielos con entendimiento, Porque para siempre es su misericordia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 136, 6, NULL, 'Al que extendió la tierra sobre las aguas, Porque para siempre es su misericordia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 136, 7, NULL, 'Al que hizo las grandes lumbreras, Porque para siempre es su misericordia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 136, 8, NULL, 'El sol para que señorease en el día, Porque para siempre es su misericordia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 136, 9, NULL, 'La luna y las estrellas para que señoreasen en la noche, Porque para siempre es su misericordia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 136, 10, NULL, 'Al que hirió a Egipto en sus primogénitos, Porque para siempre es su misericordia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 136, 11, NULL, 'Al que sacó a Israel de en medio de ellos, Porque para siempre es su misericordia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 136, 12, NULL, 'Con mano fuerte, y brazo extendido, Porque para siempre es su misericordia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 136, 13, NULL, 'Al que dividió el Mar Rojo en partes, Porque para siempre es su misericordia;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 136, 14, NULL, 'E hizo pasar a Israel por en medio de él, Porque para siempre es su misericordia;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 136, 15, NULL, 'Y arrojó a Faraón y a su ejército en el Mar Rojo, Porque para siempre es su misericordia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 136, 16, NULL, 'Al que pastoreó a su pueblo por el desierto, Porque para siempre es su misericordia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 136, 17, NULL, 'Al que hirió a grandes reyes, Porque para siempre es su misericordia;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 136, 18, NULL, 'Y mató a reyes poderosos, Porque para siempre es su misericordia;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 136, 19, NULL, 'A Sehón rey amorreo, Porque para siempre es su misericordia;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 136, 20, NULL, 'Y a Og rey de Basán, Porque para siempre es su misericordia;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 136, 21, NULL, 'Y dio la tierra de ellos en heredad, Porque para siempre es su misericordia;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 136, 22, NULL, 'En heredad a Israel su siervo, Porque para siempre es su misericordia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 136, 23, NULL, 'Él es el que en nuestro abatimiento se acordó de nosotros, Porque para siempre es su misericordia;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 136, 24, NULL, 'Y nos rescató de nuestros enemigos, Porque para siempre es su misericordia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 136, 25, NULL, 'El que da alimento a todo ser viviente, Porque para siempre es su misericordia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 136, 26, NULL, 'Alabad al Dios de los cielos, Porque para siempre es su misericordia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 137, 1, 'Lamento de los cautivos en Babilonia', 'Junto a los ríos de Babilonia, Allí nos sentábamos, y aun llorábamos, Acordándonos de Sion.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 137, 2, NULL, 'Sobre los sauces en medio de ella Colgamos nuestras arpas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 137, 3, NULL, 'Y los que nos habían llevado cautivos nos pedían que cantásemos, Y los que nos habían desolado nos pedían alegría, diciendo: Cantadnos algunos de los cánticos de Sion.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 137, 4, NULL, '¿Cómo cantaremos cántico de Jehová En tierra de extraños?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 137, 5, NULL, 'Si me olvidare de ti, oh Jerusalén, Pierda mi diestra su destreza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 137, 6, NULL, 'Mi lengua se pegue a mi paladar, Si de ti no me acordare; Si no enalteciere a Jerusalén Como preferente asunto de mi alegría.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 137, 7, NULL, 'Oh Jehová, recuerda contra los hijos de Edom el día de Jerusalén, Cuando decían: Arrasadla, arrasadla Hasta los cimientos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 137, 8, NULL, 'Hija de Babilonia la desolada, Bienaventurado el que te diere el pago De lo que tú nos hiciste.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 137, 9, NULL, 'Dichoso el que tomare y estrellare tus niños Contra la peña.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 138, 1, 'Acción de gracias por el favor de Jehová', 'Te alabaré con todo mi corazón; Delante de los dioses te cantaré salmos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 138, 2, NULL, 'Me postraré hacia tu santo templo, Y alabaré tu nombre por tu misericordia y tu fidelidad; Porque has engrandecido tu nombre, y tu palabra sobre todas las cosas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 138, 3, NULL, 'El día que clamé, me respondiste; Me fortaleciste con vigor en mi alma.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 138, 4, NULL, 'Te alabarán, oh Jehová, todos los reyes de la tierra, Porque han oído los dichos de tu boca.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 138, 5, NULL, 'Y cantarán de los caminos de Jehová, Porque la gloria de Jehová es grande.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 138, 6, NULL, 'Porque Jehová es excelso, y atiende al humilde, Mas al altivo mira de lejos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 138, 7, NULL, 'Si anduviere yo en medio de la angustia, tú me vivificarás; Contra la ira de mis enemigos extenderás tu mano, Y me salvará tu diestra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 138, 8, NULL, 'Jehová cumplirá su propósito en mí; Tu misericordia, oh Jehová, es para siempre; No desampares la obra de tus manos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 139, 1, 'Omnipresencia y omnisciencia de Dios', 'Oh Jehová, tú me has examinado y conocido.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 139, 2, NULL, 'Tú has conocido mi sentarme y mi levantarme; Has entendido desde lejos mis pensamientos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 139, 3, NULL, 'Has escudriñado mi andar y mi reposo, Y todos mis caminos te son conocidos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 139, 4, NULL, 'Pues aún no está la palabra en mi lengua, Y he aquí, oh Jehová, tú la sabes toda.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 139, 5, NULL, 'Detrás y delante me rodeaste, Y sobre mí pusiste tu mano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 139, 6, NULL, 'Tal conocimiento es demasiado maravilloso para mí; Alto es, no lo puedo comprender.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 139, 7, NULL, '¿A dónde me iré de tu Espíritu? ¿Y a dónde huiré de tu presencia?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 139, 8, NULL, 'Si subiere a los cielos, allí estás tú; Y si en el Seol hiciere mi estrado, he aquí, allí tú estás.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 139, 9, NULL, 'Si tomare las alas del alba Y habitare en el extremo del mar,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 139, 10, NULL, 'Aun allí me guiará tu mano, Y me asirá tu diestra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 139, 11, NULL, 'Si dijere: Ciertamente las tinieblas me encubrirán; Aun la noche resplandecerá alrededor de mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 139, 12, NULL, 'Aun las tinieblas no encubren de ti, Y la noche resplandece como el día; Lo mismo te son las tinieblas que la luz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 139, 13, NULL, 'Porque tú formaste mis entrañas; Tú me hiciste en el vientre de mi madre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 139, 14, NULL, 'Te alabaré; porque formidables, maravillosas son tus obras; Estoy maravillado, Y mi alma lo sabe muy bien.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 139, 15, NULL, 'No fue encubierto de ti mi cuerpo, Bien que en oculto fui formado, Y entretejido en lo más profundo de la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 139, 16, NULL, 'Mi embrión vieron tus ojos, Y en tu libro estaban escritas todas aquellas cosas Que fueron luego formadas, Sin faltar una de ellas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 139, 17, NULL, '¡Cuán preciosos me son, oh Dios, tus pensamientos! ¡Cuán grande es la suma de ellos!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 139, 18, NULL, 'Si los enumero, se multiplican más que la arena; Despierto, y aún estoy contigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 139, 19, NULL, 'De cierto, oh Dios, harás morir al impío; Apartaos, pues, de mí, hombres sanguinarios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 139, 20, NULL, 'Porque blasfemias dicen ellos contra ti; Tus enemigos toman en vano tu nombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 139, 21, NULL, '¿No odio, oh Jehová, a los que te aborrecen, Y me enardezco contra tus enemigos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 139, 22, NULL, 'Los aborrezco por completo; Los tengo por enemigos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 139, 23, NULL, 'Examíname, oh Dios, y conoce mi corazón; Pruébame y conoce mis pensamientos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 139, 24, NULL, 'Y ve si hay en mí camino de perversidad, Y guíame en el camino eterno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 140, 1, 'Súplica de protección contra los perseguidores', 'Líbrame, oh Jehová, del hombre malo; Guárdame de hombres violentos,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 140, 2, NULL, 'Los cuales maquinan males en el corazón, Cada día urden contiendas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 140, 3, NULL, 'Aguzaron su lengua como la serpiente; Veneno de áspid hay debajo de sus labios. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 140, 4, NULL, 'Guárdame, oh Jehová, de manos del impío; Líbrame de hombres injuriosos, Que han pensado trastornar mis pasos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 140, 5, NULL, 'Me han escondido lazo y cuerdas los soberbios; Han tendido red junto a la senda; Me han puesto lazos. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 140, 6, NULL, 'He dicho a Jehová: Dios mío eres tú; Escucha, oh Jehová, la voz de mis ruegos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 140, 7, NULL, 'Jehová Señor, potente salvador mío, Tú pusiste a cubierto mi cabeza en el día de batalla.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 140, 8, NULL, 'No concedas, oh Jehová, al impío sus deseos; No saques adelante su pensamiento, para que no se ensoberbezca. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 140, 9, NULL, 'En cuanto a los que por todas partes me rodean, La maldad de sus propios labios cubrirá su cabeza.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 140, 10, NULL, 'Caerán sobre ellos brasas; Serán echados en el fuego, En abismos profundos de donde no salgan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 140, 11, NULL, 'El hombre deslenguado no será firme en la tierra; El mal cazará al hombre injusto para derribarle.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 140, 12, NULL, 'Yo sé que Jehová tomará a su cargo la causa del afligido, Y el derecho de los necesitados.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 140, 13, NULL, 'Ciertamente los justos alabarán tu nombre; Los rectos morarán en tu presencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 141, 1, 'Oración a fin de ser guardado del mal', 'Jehová, a ti he clamado; apresúrate a mí; Escucha mi voz cuando te invocare.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 141, 2, NULL, 'Suba mi oración delante de ti como el incienso, El don de mis manos como la ofrenda de la tarde.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 141, 3, NULL, 'Pon guarda a mi boca, oh Jehová; Guarda la puerta de mis labios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 141, 4, NULL, 'No dejes que se incline mi corazón a cosa mala, A hacer obras impías Con los que hacen iniquidad; Y no coma yo de sus deleites.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 141, 5, NULL, 'Que el justo me castigue, será un favor, Y que me reprenda será un excelente bálsamo Que no me herirá la cabeza; Pero mi oración será continuamente contra las maldades de aquellos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 141, 6, NULL, 'Serán despeñados sus jueces, Y oirán mis palabras, que son verdaderas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 141, 7, NULL, 'Como quien hiende y rompe la tierra, Son esparcidos nuestros huesos a la boca del Seol.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 141, 8, NULL, 'Por tanto, a ti, oh Jehová, Señor, miran mis ojos; En ti he confiado; no desampares mi alma.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 141, 9, NULL, 'Guárdame de los lazos que me han tendido, Y de las trampas de los que hacen iniquidad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 141, 10, NULL, 'Caigan los impíos a una en sus redes, Mientras yo pasaré adelante.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 142, 1, 'Petición de ayuda en medio de la prueba', 'Con mi voz clamaré a Jehová; Con mi voz pediré a Jehová misericordia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 142, 2, NULL, 'Delante de él expondré mi queja; Delante de él manifestaré mi angustia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 142, 3, NULL, 'Cuando mi espíritu se angustiaba dentro de mí, tú conociste mi senda. En el camino en que andaba, me escondieron lazo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 142, 4, NULL, 'Mira a mi diestra y observa, pues no hay quien me quiera conocer; No tengo refugio, ni hay quien cuide de mi vida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 142, 5, NULL, 'Clamé a ti, oh Jehová; Dije: Tú eres mi esperanza, Y mi porción en la tierra de los vivientes.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 142, 6, NULL, 'Escucha mi clamor, porque estoy muy afligido. Líbrame de los que me persiguen, porque son más fuertes que yo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 142, 7, NULL, 'Saca mi alma de la cárcel, para que alabe tu nombre; Me rodearán los justos, Porque tú me serás propicio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 143, 1, 'Súplica de liberación y dirección', 'Oh Jehová, oye mi oración, escucha mis ruegos; Respóndeme por tu verdad, por tu justicia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 143, 2, NULL, 'Y no entres en juicio con tu siervo; Porque no se justificará delante de ti ningún ser humano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 143, 3, NULL, 'Porque ha perseguido el enemigo mi alma; Ha postrado en tierra mi vida; Me ha hecho habitar en tinieblas como los ya muertos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 143, 4, NULL, 'Y mi espíritu se angustió dentro de mí; Está desolado mi corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 143, 5, NULL, 'Me acordé de los días antiguos; Meditaba en todas tus obras; Reflexionaba en las obras de tus manos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 143, 6, NULL, 'Extendí mis manos a ti, Mi alma a ti como la tierra sedienta. Selah', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 143, 7, NULL, 'Respóndeme pronto, oh Jehová, porque desmaya mi espíritu; No escondas de mí tu rostro, No venga yo a ser semejante a los que descienden a la sepultura.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 143, 8, NULL, 'Hazme oír por la mañana tu misericordia, Porque en ti he confiado; Hazme saber el camino por donde ande, Porque a ti he elevado mi alma.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 143, 9, NULL, 'Líbrame de mis enemigos, oh Jehová; En ti me refugio.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 143, 10, NULL, 'Enséñame a hacer tu voluntad, porque tú eres mi Dios; Tu buen espíritu me guíe a tierra de rectitud.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 143, 11, NULL, 'Por tu nombre, oh Jehová, me vivificarás; Por tu justicia sacarás mi alma de angustia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 143, 12, NULL, 'Y por tu misericordia disiparás a mis enemigos, Y destruirás a todos los adversarios de mi alma, Porque yo soy tu siervo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 144, 1, 'Oración pidiendo socorro y prosperidad', 'Bendito sea Jehová, mi roca, Quien adiestra mis manos para la batalla, Y mis dedos para la guerra;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 144, 2, NULL, 'Misericordia mía y mi castillo, Fortaleza mía y mi libertador, Escudo mío, en quien he confiado; El que sujeta a mi pueblo debajo de mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 144, 3, NULL, 'Oh Jehová, ¿qué es el hombre, para que en él pienses, O el hijo de hombre, para que lo estimes?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 144, 4, NULL, 'El hombre es semejante a la vanidad; Sus días son como la sombra que pasa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 144, 5, NULL, 'Oh Jehová, inclina tus cielos y desciende; Toca los montes, y humeen.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 144, 6, NULL, 'Despide relámpagos y disípalos, Envía tus saetas y túrbalos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 144, 7, NULL, 'Envía tu mano desde lo alto; Redímeme, y sácame de las muchas aguas, De la mano de los hombres extraños,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 144, 8, NULL, 'Cuya boca habla vanidad, Y cuya diestra es diestra de mentira.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 144, 9, NULL, 'Oh Dios, a ti cantaré cántico nuevo; Con salterio, con decacordio cantaré a ti.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 144, 10, NULL, 'Tú, el que da victoria a los reyes, El que rescata de maligna espada a David su siervo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 144, 11, NULL, 'Rescátame, y líbrame de la mano de los hombres extraños, Cuya boca habla vanidad, Y cuya diestra es diestra de mentira.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 144, 12, NULL, 'Sean nuestros hijos como plantas crecidas en su juventud, Nuestras hijas como esquinas labradas como las de un palacio;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 144, 13, NULL, 'Nuestros graneros llenos, provistos de toda suerte de grano; Nuestros ganados, que se multipliquen a millares y decenas de millares en nuestros campos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 144, 14, NULL, 'Nuestros bueyes estén fuertes para el trabajo; No tengamos asalto, ni que hacer salida, Ni grito de alarma en nuestras plazas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 144, 15, NULL, 'Bienaventurado el pueblo que tiene esto; Bienaventurado el pueblo cuyo Dios es Jehová.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 145, 1, 'Alabanza por la bondad y el poder de Dios', 'Te exaltaré, mi Dios, mi Rey, Y bendeciré tu nombre eternamente y para siempre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 145, 2, NULL, 'Cada día te bendeciré, Y alabaré tu nombre eternamente y para siempre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 145, 3, NULL, 'Grande es Jehová, y digno de suprema alabanza; Y su grandeza es inescrutable.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 145, 4, NULL, 'Generación a generación celebrará tus obras, Y anunciará tus poderosos hechos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 145, 5, NULL, 'En la hermosura de la gloria de tu magnificencia, Y en tus hechos maravillosos meditaré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 145, 6, NULL, 'Del poder de tus hechos estupendos hablarán los hombres, Y yo publicaré tu grandeza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 145, 7, NULL, 'Proclamarán la memoria de tu inmensa bondad, Y cantarán tu justicia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 145, 8, NULL, 'Clemente y misericordioso es Jehová, Lento para la ira, y grande en misericordia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 145, 9, NULL, 'Bueno es Jehová para con todos, Y sus misericordias sobre todas sus obras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 145, 10, NULL, 'Te alaben, oh Jehová, todas tus obras, Y tus santos te bendigan.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 145, 11, NULL, 'La gloria de tu reino digan, Y hablen de tu poder,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 145, 12, NULL, 'Para hacer saber a los hijos de los hombres sus poderosos hechos, Y la gloria de la magnificencia de su reino.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 145, 13, NULL, 'Tu reino es reino de todos los siglos, Y tu señorío en todas las generaciones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 145, 14, NULL, 'Sostiene Jehová a todos los que caen, Y levanta a todos los oprimidos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 145, 15, NULL, 'Los ojos de todos esperan en ti, Y tú les das su comida a su tiempo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 145, 16, NULL, 'Abres tu mano, Y colmas de bendición a todo ser viviente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 145, 17, NULL, 'Justo es Jehová en todos sus caminos, Y misericordioso en todas sus obras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 145, 18, NULL, 'Cercano está Jehová a todos los que le invocan, A todos los que le invocan de veras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 145, 19, NULL, 'Cumplirá el deseo de los que le temen; Oirá asimismo el clamor de ellos, y los salvará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 145, 20, NULL, 'Jehová guarda a todos los que le aman, Mas destruirá a todos los impíos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 145, 21, NULL, 'La alabanza de Jehová proclamará mi boca; Y todos bendigan su santo nombre eternamente y para siempre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 146, 1, 'Alabanza por la justicia de Dios', 'Alaba, oh alma mía, a Jehová.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 146, 2, NULL, 'Alabaré a Jehová en mi vida; Cantaré salmos a mi Dios mientras viva.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 146, 3, NULL, 'No confiéis en los príncipes, Ni en hijo de hombre, porque no hay en él salvación.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 146, 4, NULL, 'Pues sale su aliento, y vuelve a la tierra; En ese mismo día perecen sus pensamientos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 146, 5, NULL, 'Bienaventurado aquel cuyo ayudador es el Dios de Jacob, Cuya esperanza está en Jehová su Dios,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 146, 6, NULL, 'El cual hizo los cielos y la tierra, El mar, y todo lo que en ellos hay; Que guarda verdad para siempre,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 146, 7, NULL, 'Que hace justicia a los agraviados, Que da pan a los hambrientos. Jehová liberta a los cautivos;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 146, 8, NULL, 'Jehová abre los ojos a los ciegos; Jehová levanta a los caídos; Jehová ama a los justos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 146, 9, NULL, 'Jehová guarda a los extranjeros; Al huérfano y a la viuda sostiene, Y el camino de los impíos trastorna.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 146, 10, NULL, 'Reinará Jehová para siempre; Tu Dios, oh Sion, de generación en generación. Aleluya.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 147, 1, 'Alabanza por el favor de Dios hacia Jerusalén', 'Alabad a JAH, Porque es bueno cantar salmos a nuestro Dios; Porque suave y hermosa es la alabanza.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 147, 2, NULL, 'Jehová edifica a Jerusalén; A los desterrados de Israel recogerá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 147, 3, NULL, 'Él sana a los quebrantados de corazón, Y venda sus heridas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 147, 4, NULL, 'Él cuenta el número de las estrellas; A todas ellas llama por sus nombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 147, 5, NULL, 'Grande es el Señor nuestro, y de mucho poder; Y su entendimiento es infinito.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 147, 6, NULL, 'Jehová exalta a los humildes, Y humilla a los impíos hasta la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 147, 7, NULL, 'Cantad a Jehová con alabanza, Cantad con arpa a nuestro Dios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 147, 8, NULL, 'Él es quien cubre de nubes los cielos, El que prepara la lluvia para la tierra, El que hace a los montes producir hierba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 147, 9, NULL, 'Él da a la bestia su mantenimiento, Y a los hijos de los cuervos que claman.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 147, 10, NULL, 'No se deleita en la fuerza del caballo, Ni se complace en la agilidad del hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 147, 11, NULL, 'Se complace Jehová en los que le temen, Y en los que esperan en su misericordia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 147, 12, NULL, 'Alaba a Jehová, Jerusalén; Alaba a tu Dios, oh Sion.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 147, 13, NULL, 'Porque fortificó los cerrojos de tus puertas; Bendijo a tus hijos dentro de ti.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 147, 14, NULL, 'Él da en tu territorio la paz; Te hará saciar con lo mejor del trigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 147, 15, NULL, 'Él envía su palabra a la tierra; Velozmente corre su palabra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 147, 16, NULL, 'Da la nieve como lana, Y derrama la escarcha como ceniza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 147, 17, NULL, 'Echa su hielo como pedazos; Ante su frío, ¿quién resistirá?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 147, 18, NULL, 'Enviará su palabra, y los derretirá; Soplará su viento, y fluirán las aguas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 147, 19, NULL, 'Ha manifestado sus palabras a Jacob, Sus estatutos y sus juicios a Israel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 147, 20, NULL, 'No ha hecho así con ninguna otra de las naciones; Y en cuanto a sus juicios, no los conocieron. Aleluya.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 148, 1, 'Exhortación a la creación, para que alabe a Jehová', 'Alabad a Jehová desde los cielos; Alabadle en las alturas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 148, 2, NULL, 'Alabadle, vosotros todos sus ángeles; Alabadle, vosotros todos sus ejércitos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 148, 3, NULL, 'Alabadle, sol y luna; Alabadle, vosotras todas, lucientes estrellas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 148, 4, NULL, 'Alabadle, cielos de los cielos, Y las aguas que están sobre los cielos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 148, 5, NULL, 'Alaben el nombre de Jehová; Porque él mandó, y fueron creados.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 148, 6, NULL, 'Los hizo ser eternamente y para siempre; Les puso ley que no será quebrantada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 148, 7, NULL, 'Alabad a Jehová desde la tierra, Los monstruos marinos y todos los abismos;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 148, 8, NULL, 'El fuego y el granizo, la nieve y el vapor, El viento de tempestad que ejecuta su palabra;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 148, 9, NULL, 'Los montes y todos los collados, El árbol de fruto y todos los cedros;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 148, 10, NULL, 'La bestia y todo animal, Reptiles y volátiles;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 148, 11, NULL, 'Los reyes de la tierra y todos los pueblos, Los príncipes y todos los jueces de la tierra;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 148, 12, NULL, 'Los jóvenes y también las doncellas, Los ancianos y los niños.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 148, 13, NULL, 'Alaben el nombre de Jehová, Porque solo su nombre es enaltecido. Su gloria es sobre tierra y cielos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 148, 14, NULL, 'Él ha exaltado el poderío de su pueblo; Alábenle todos sus santos, los hijos de Israel, El pueblo a él cercano. Aleluya.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 149, 1, 'Exhortación a Israel, para que alabe a Jehová', 'Cantad a Jehová cántico nuevo; Su alabanza sea en la congregación de los santos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 149, 2, NULL, 'Alégrese Israel en su Hacedor; Los hijos de Sion se gocen en su Rey.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 149, 3, NULL, 'Alaben su nombre con danza; Con pandero y arpa a él canten.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 149, 4, NULL, 'Porque Jehová tiene contentamiento en su pueblo; Hermoseará a los humildes con la salvación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 149, 5, NULL, 'Regocíjense los santos por su gloria, Y canten aun sobre sus camas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 149, 6, NULL, 'Exalten a Dios con sus gargantas, Y espadas de dos filos en sus manos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 149, 7, NULL, 'Para ejecutar venganza entre las naciones, Y castigo entre los pueblos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 149, 8, NULL, 'Para aprisionar a sus reyes con grillos, Y a sus nobles con cadenas de hierro;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 149, 9, NULL, 'Para ejecutar en ellos el juicio decretado; Gloria será esto para todos sus santos. Aleluya.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 150, 1, 'Exhortación a alabar a Dios con instrumentos de música', 'Alabad a Dios en su santuario; Alabadle en la magnificencia de su firmamento.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 150, 2, NULL, 'Alabadle por sus proezas; Alabadle conforme a la muchedumbre de su grandeza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 150, 3, NULL, 'Alabadle a son de bocina; Alabadle con salterio y arpa.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 150, 4, NULL, 'Alabadle con pandero y danza; Alabadle con cuerdas y flautas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 150, 5, NULL, 'Alabadle con címbalos resonantes; Alabadle con címbalos de júbilo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Sal', 150, 6, NULL, 'Todo lo que respira alabe a JAH. Aleluya.', 0, 'spa', 'RVR1960', NULL);\n"
;

}