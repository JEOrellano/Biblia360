package com.orellano.biblia360.daoSQLite.sql.spa;

public final class LoadMateo {
  public LoadMateo() {}
  public static final String SQL_PARTE_1 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Mt', 1, 1, 'Genealogía de Jesucristo', 'Libro de la genealogía de Jesucristo, hijo de David, hijo de Abraham.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 1, 2, NULL, 'Abraham engendró a Isaac, Isaac a Jacob, y Jacob a Judá y a sus hermanos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 1, 3, NULL, 'Judá engendró de Tamar a Fares y a Zara, Fares a Esrom, y Esrom a Aram.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 1, 4, NULL, 'Aram engendró a Aminadab, Aminadab a Naasón, y Naasón a Salmón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 1, 5, NULL, 'Salmón engendró de Rahab a Booz, Booz engendró de Rut a Obed, y Obed a Isaí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 1, 6, NULL, 'Isaí engendró al rey David, y el rey David engendró a Salomón de la que fue mujer de Urías.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 1, 7, NULL, 'Salomón engendró a Roboam, Roboam a Abías, y Abías a Asa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 1, 8, NULL, 'Asa engendró a Josafat, Josafat a Joram, y Joram a Uzías.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 1, 9, NULL, 'Uzías engendró a Jotam, Jotam a Acaz, y Acaz a Ezequías.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 1, 10, NULL, 'Ezequías engendró a Manasés, Manasés a Amón, y Amón a Josías.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 1, 11, NULL, 'Josías engendró a Jeconías y a sus hermanos, en el tiempo de la deportación a Babilonia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 1, 12, NULL, 'Después de la deportación a Babilonia, Jeconías engendró a Salatiel, y Salatiel a Zorobabel.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 1, 13, NULL, 'Zorobabel engendró a Abiud, Abiud a Eliaquim, y Eliaquim a Azor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 1, 14, NULL, 'Azor engendró a Sadoc, Sadoc a Aquim, y Aquim a Eliud.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 1, 15, NULL, 'Eliud engendró a Eleazar, Eleazar a Matán, Matán a Jacob;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 1, 16, NULL, 'y Jacob engendró a José, marido de María, de la cual nació Jesús, llamado el Cristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 1, 17, NULL, 'De manera que todas las generaciones desde Abraham hasta David son catorce; desde David hasta la deportación a Babilonia, catorce; y desde la deportación a Babilonia hasta Cristo, catorce.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 1, 18, 'Nacimiento de Jesucristo', 'El nacimiento de Jesucristo fue así: Estando desposada María su madre con José, antes que se juntasen, se halló que había concebido del Espíritu Santo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 1, 19, NULL, 'José su marido, como era justo, y no quería infamarla, quiso dejarla secretamente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 1, 20, NULL, 'Y pensando él en esto, he aquí un ángel del Señor le apareció en sueños y le dijo: José, hijo de David, no temas recibir a María tu mujer, porque lo que en ella es engendrado, del Espíritu Santo es.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 1, 21, NULL, 'Y dará a luz un hijo, y llamarás su nombre JESÚS, porque él salvará a su pueblo de sus pecados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 1, 22, NULL, 'Todo esto aconteció para que se cumpliese lo dicho por el Señor por medio del profeta, cuando dijo:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 1, 23, NULL, 'He aquí, una virgen concebirá y dará a luz un hijo, Y llamarás su nombre Emanuel, que traducido es: Dios con nosotros.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 1, 24, NULL, 'Y despertando José del sueño, hizo como el ángel del Señor le había mandado, y recibió a su mujer.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 1, 25, NULL, 'Pero no la conoció hasta que dio a luz a su hijo primogénito; y le puso por nombre JESÚS.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 2, 1, 'La visita de los magos', 'Cuando Jesús nació en Belén de Judea en días del rey Herodes, vinieron del oriente a Jerusalén unos magos,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 2, 2, NULL, 'diciendo: ¿Dónde está el rey de los judíos, que ha nacido? Porque su estrella hemos visto en el oriente, y venimos a adorarle.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 2, 3, NULL, 'Oyendo esto, el rey Herodes se turbó, y toda Jerusalén con él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 2, 4, NULL, 'Y convocados todos los principales sacerdotes, y los escribas del pueblo, les preguntó dónde había de nacer el Cristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 2, 5, NULL, 'Ellos le dijeron: En Belén de Judea; porque así está escrito por el profeta:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 2, 6, NULL, 'Y tú, Belén, de la tierra de Judá, No eres la más pequeña entre los príncipes de Judá; Porque de ti saldrá un guiador, Que apacentará a mi pueblo Israel.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 2, 7, NULL, 'Entonces Herodes, llamando en secreto a los magos, indagó de ellos diligentemente el tiempo de la aparición de la estrella;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 2, 8, NULL, 'y enviándolos a Belén, dijo: Id allá y averiguad con diligencia acerca del niño; y cuando le halléis, hacédmelo saber, para que yo también vaya y le adore.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 2, 9, NULL, 'Ellos, habiendo oído al rey, se fueron; y he aquí la estrella que habían visto en el oriente iba delante de ellos, hasta que llegando, se detuvo sobre donde estaba el niño.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 2, 10, NULL, 'Y al ver la estrella, se regocijaron con muy grande gozo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 2, 11, NULL, 'Y al entrar en la casa, vieron al niño con su madre María, y postrándose, lo adoraron; y abriendo sus tesoros, le ofrecieron presentes: oro, incienso y mirra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 2, 12, NULL, 'Pero siendo avisados por revelación en sueños que no volviesen a Herodes, regresaron a su tierra por otro camino.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 2, 13, 'Matanza de los niños', 'Después que partieron ellos, he aquí un ángel del Señor apareció en sueños a José y dijo: Levántate y toma al niño y a su madre, y huye a Egipto, y permanece allá hasta que yo te diga; porque acontecerá que Herodes buscará al niño para matarlo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 2, 14, NULL, 'Y él, despertando, tomó de noche al niño y a su madre, y se fue a Egipto,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 2, 15, NULL, 'y estuvo allá hasta la muerte de Herodes; para que se cumpliese lo que dijo el Señor por medio del profeta, cuando dijo: De Egipto llamé a mi Hijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 2, 16, NULL, 'Herodes entonces, cuando se vio burlado por los magos, se enojó mucho, y mandó matar a todos los niños menores de dos años que había en Belén y en todos sus alrededores, conforme al tiempo que había inquirido de los magos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 2, 17, NULL, 'Entonces se cumplió lo que fue dicho por el profeta Jeremías, cuando dijo:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 2, 18, NULL, 'Voz fue oída en Ramá, Grande lamentación, lloro y gemido; Raquel que llora a sus hijos, Y no quiso ser consolada, porque perecieron.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 2, 19, NULL, 'Pero después de muerto Herodes, he aquí un ángel del Señor apareció en sueños a José en Egipto,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 2, 20, NULL, 'diciendo: Levántate, toma al niño y a su madre, y vete a tierra de Israel, porque han muerto los que procuraban la muerte del niño.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 2, 21, NULL, 'Entonces él se levantó, y tomó al niño y a su madre, y vino a tierra de Israel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 2, 22, NULL, 'Pero oyendo que Arquelao reinaba en Judea en lugar de Herodes su padre, tuvo temor de ir allá; pero avisado por revelación en sueños, se fue a la región de Galilea,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 2, 23, NULL, 'y vino y habitó en la ciudad que se llama Nazaret, para que se cumpliese lo que fue dicho por los profetas, que habría de ser llamado nazareno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 3, 1, 'Predicación de Juan el Bautista', 'En aquellos días vino Juan el Bautista predicando en el desierto de Judea,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 3, 2, NULL, 'y diciendo: Arrepentíos, porque el reino de los cielos se ha acercado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 3, 3, NULL, 'Pues este es aquel de quien habló el profeta Isaías, cuando dijo: Voz del que clama en el desierto: Preparad el camino del Señor, Enderezad sus sendas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 3, 4, NULL, 'Y Juan estaba vestido de pelo de camello, y tenía un cinto de cuero alrededor de sus lomos; y su comida era langostas y miel silvestre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 3, 5, NULL, 'Y salía a él Jerusalén, y toda Judea, y toda la provincia de alrededor del Jordán,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 3, 6, NULL, 'y eran bautizados por él en el Jordán, confesando sus pecados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 3, 7, NULL, 'Al ver él que muchos de los fariseos y de los saduceos venían a su bautismo, les decía: ¡Generación de víboras! ¿Quién os enseñó a huir de la ira venidera?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 3, 8, NULL, 'Haced, pues, frutos dignos de arrepentimiento,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 3, 9, NULL, 'y no penséis decir dentro de vosotros mismos: A Abraham tenemos por padre; porque yo os digo que Dios puede levantar hijos a Abraham aun de estas piedras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 3, 10, NULL, 'Y ya también el hacha está puesta a la raíz de los árboles; por tanto, todo árbol que no da buen fruto es cortado y echado en el fuego.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 3, 11, NULL, 'Yo a la verdad os bautizo en agua para arrepentimiento; pero el que viene tras mí, cuyo calzado yo no soy digno de llevar, es más poderoso que yo; él os bautizará en Espíritu Santo y fuego.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 3, 12, NULL, 'Su aventador está en su mano, y limpiará su era; y recogerá su trigo en el granero, y quemará la paja en fuego que nunca se apagará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 3, 13, 'El bautismo de Jesús', 'Entonces Jesús vino de Galilea a Juan al Jordán, para ser bautizado por él.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 3, 14, NULL, 'Mas Juan se le oponía, diciendo: Yo necesito ser bautizado por ti, ¿y tú vienes a mí?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 3, 15, NULL, 'Pero Jesús le respondió: Deja ahora, porque así conviene que cumplamos toda justicia. Entonces le dejó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 3, 16, NULL, 'Y Jesús, después que fue bautizado, subió luego del agua; y he aquí los cielos le fueron abiertos, y vio al Espíritu de Dios que descendía como paloma, y venía sobre él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 3, 17, NULL, 'Y hubo una voz de los cielos, que decía: Este es mi Hijo amado, en quien tengo complacencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 4, 1, 'Tentación de Jesús', 'Entonces Jesús fue llevado por el Espíritu al desierto, para ser tentado por el diablo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 4, 2, NULL, 'Y después de haber ayunado cuarenta días y cuarenta noches, tuvo hambre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 4, 3, NULL, 'Y vino a él el tentador, y le dijo: Si eres Hijo de Dios, di que estas piedras se conviertan en pan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 4, 4, NULL, 'Él respondió y dijo: Escrito está: No solo de pan vivirá el hombre, sino de toda palabra que sale de la boca de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 4, 5, NULL, 'Entonces el diablo le llevó a la santa ciudad, y le puso sobre el pináculo del templo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 4, 6, NULL, 'y le dijo: Si eres Hijo de Dios, échate abajo; porque escrito está: A sus ángeles mandará acerca de ti, y, En sus manos te sostendrán, Para que no tropieces con tu pie en piedra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 4, 7, NULL, 'Jesús le dijo: Escrito está también: No tentarás al Señor tu Dios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 4, 8, NULL, 'Otra vez le llevó el diablo a un monte muy alto, y le mostró todos los reinos del mundo y la gloria de ellos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 4, 9, NULL, 'y le dijo: Todo esto te daré, si postrado me adorares.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 4, 10, NULL, 'Entonces Jesús le dijo: Vete, Satanás, porque escrito está: Al Señor tu Dios adorarás, y a él sólo servirás.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 4, 11, NULL, 'El diablo entonces le dejó; y he aquí vinieron ángeles y le servían.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 4, 12, 'Jesús principia su ministerio', 'Cuando Jesús oyó que Juan estaba preso, volvió a Galilea;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 4, 13, NULL, 'y dejando a Nazaret, vino y habitó en Capernaum, ciudad marítima, en la región de Zabulón y de Neftalí,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 4, 14, NULL, 'para que se cumpliese lo dicho por el profeta Isaías, cuando dijo:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 4, 15, NULL, 'Tierra de Zabulón y tierra de Neftalí, Camino del mar, al otro lado del Jordán, Galilea de los gentiles;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 4, 16, NULL, 'El pueblo asentado en tinieblas vio gran luz; Y a los asentados en región de sombra de muerte, Luz les resplandeció.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 4, 17, NULL, 'Desde entonces comenzó Jesús a predicar, y a decir: Arrepentíos, porque el reino de los cielos se ha acercado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 4, 18, NULL, 'Andando Jesús junto al mar de Galilea, vio a dos hermanos, Simón, llamado Pedro, y Andrés su hermano, que echaban la red en el mar; porque eran pescadores.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 4, 19, NULL, 'Y les dijo: Venid en pos de mí, y os haré pescadores de hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 4, 20, NULL, 'Ellos entonces, dejando al instante las redes, le siguieron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 4, 21, NULL, 'Pasando de allí, vio a otros dos hermanos, Jacobo hijo de Zebedeo, y Juan su hermano, en la barca con Zebedeo su padre, que remendaban sus redes; y los llamó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 4, 22, NULL, 'Y ellos, dejando al instante la barca y a su padre, le siguieron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 4, 23, NULL, 'Y recorrió Jesús toda Galilea, enseñando en las sinagogas de ellos, y predicando el evangelio del reino, y sanando toda enfermedad y toda dolencia en el pueblo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 4, 24, NULL, 'Y se difundió su fama por toda Siria; y le trajeron todos los que tenían dolencias, los afligidos por diversas enfermedades y tormentos, los endemoniados, lunáticos y paralíticos; y los sanó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 4, 25, NULL, 'Y le siguió mucha gente de Galilea, de Decápolis, de Jerusalén, de Judea y del otro lado del Jordán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 1, 'El Sermón del monte: Las bienaventuranzas', 'Viendo la multitud, subió al monte; y sentándose, vinieron a él sus discípulos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 2, NULL, 'Y abriendo su boca les enseñaba, diciendo:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 3, NULL, 'Bienaventurados los pobres en espíritu, porque de ellos es el reino de los cielos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 4, NULL, 'Bienaventurados los que lloran, porque ellos recibirán consolación.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 5, NULL, 'Bienaventurados los mansos, porque ellos recibirán la tierra por heredad.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 6, NULL, 'Bienaventurados los que tienen hambre y sed de justicia, porque ellos serán saciados.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 7, NULL, 'Bienaventurados los misericordiosos, porque ellos alcanzarán misericordia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 8, NULL, 'Bienaventurados los de limpio corazón, porque ellos verán a Dios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 9, NULL, 'Bienaventurados los pacificadores, porque ellos serán llamados hijos de Dios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 10, NULL, 'Bienaventurados los que padecen persecución por causa de la justicia, porque de ellos es el reino de los cielos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 11, NULL, 'Bienaventurados sois cuando por mi causa os vituperen y os persigan, y digan toda clase de mal contra vosotros, mintiendo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 12, NULL, 'Gozaos y alegraos, porque vuestro galardón es grande en los cielos; porque así persiguieron a los profetas que fueron antes de vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 13, 'La sal de la tierra', 'Vosotros sois la sal de la tierra; pero si la sal se desvaneciere, ¿con qué será salada? No sirve más para nada, sino para ser echada fuera y hollada por los hombres.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 14, 'La luz del mundo', 'Vosotros sois la luz del mundo; una ciudad asentada sobre un monte no se puede esconder.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 15, NULL, 'Ni se enciende una luz y se pone debajo de un almud, sino sobre el candelero, y alumbra a todos los que están en casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 16, NULL, 'Así alumbre vuestra luz delante de los hombres, para que vean vuestras buenas obras, y glorifiquen a vuestro Padre que está en los cielos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 17, 'Jesús y la ley', 'No penséis que he venido para abrogar la ley o los profetas; no he venido para abrogar, sino para cumplir.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 18, NULL, 'Porque de cierto os digo que hasta que pasen el cielo y la tierra, ni una jota ni una tilde pasará de la ley, hasta que todo se haya cumplido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 19, NULL, 'De manera que cualquiera que quebrante uno de estos mandamientos muy pequeños, y así enseñe a los hombres, muy pequeño será llamado en el reino de los cielos; mas cualquiera que los haga y los enseñe, este será llamado grande en el reino de los cielos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 20, NULL, 'Porque os digo que si vuestra justicia no fuere mayor que la de los escribas y fariseos, no entraréis en el reino de los cielos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 21, 'Jesús y la ira', 'Oísteis que fue dicho a los antiguos: No matarás; y cualquiera que matare será culpable de juicio.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 22, NULL, 'Pero yo os digo que cualquiera que se enoje contra su hermano, será culpable de juicio; y cualquiera que diga: Necio, a su hermano, será culpable ante el concilio; y cualquiera que le diga: Fatuo, quedará expuesto al infierno de fuego.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 23, NULL, 'Por tanto, si traes tu ofrenda al altar, y allí te acuerdas de que tu hermano tiene algo contra ti,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 24, NULL, 'deja allí tu ofrenda delante del altar, y anda, reconcíliate primero con tu hermano, y entonces ven y presenta tu ofrenda.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 25, NULL, 'Ponte de acuerdo con tu adversario pronto, entre tanto que estás con él en el camino, no sea que el adversario te entregue al juez, y el juez al alguacil, y seas echado en la cárcel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 26, NULL, 'De cierto te digo que no saldrás de allí, hasta que pagues el último cuadrante.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 27, 'Jesús y el adulterio', 'Oísteis que fue dicho: No cometerás adulterio.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 28, NULL, 'Pero yo os digo que cualquiera que mira a una mujer para codiciarla, ya adulteró con ella en su corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 29, NULL, 'Por tanto, si tu ojo derecho te es ocasión de caer, sácalo, y échalo de ti; pues mejor te es que se pierda uno de tus miembros, y no que todo tu cuerpo sea echado al infierno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 30, NULL, 'Y si tu mano derecha te es ocasión de caer, córtala, y échala de ti; pues mejor te es que se pierda uno de tus miembros, y no que todo tu cuerpo sea echado al infierno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 31, 'Jesús y el divorcio', 'También fue dicho: Cualquiera que repudie a su mujer, dele carta de divorcio.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 32, NULL, 'Pero yo os digo que el que repudia a su mujer, a no ser por causa de fornicación, hace que ella adultere; y el que se casa con la repudiada, comete adulterio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 33, 'Jesús y los juramentos', 'Además habéis oído que fue dicho a los antiguos: No perjurarás, sino cumplirás al Señor tus juramentos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 34, NULL, 'Pero yo os digo: No juréis en ninguna manera; ni por el cielo, porque es el trono de Dios;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 35, NULL, 'ni por la tierra, porque es el estrado de sus pies; ni por Jerusalén, porque es la ciudad del gran Rey.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 36, NULL, 'Ni por tu cabeza jurarás, porque no puedes hacer blanco o negro un solo cabello.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 37, NULL, 'Pero sea vuestro hablar: Sí, sí; no, no; porque lo que es más de esto, de mal procede.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 38, 'El amor hacia los enemigos', 'Oísteis que fue dicho: Ojo por ojo, y diente por diente.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 39, NULL, 'Pero yo os digo: No resistáis al que es malo; antes, a cualquiera que te hiera en la mejilla derecha, vuélvele también la otra;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 40, NULL, 'y al que quiera ponerte a pleito y quitarte la túnica, déjale también la capa;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 41, NULL, 'y a cualquiera que te obligue a llevar carga por una milla, ve con él dos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 42, NULL, 'Al que te pida, dale; y al que quiera tomar de ti prestado, no se lo rehúses.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 43, NULL, 'Oísteis que fue dicho: Amarás a tu prójimo, y aborrecerás a tu enemigo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 44, NULL, 'Pero yo os digo: Amad a vuestros enemigos, bendecid a los que os maldicen, haced bien a los que os aborrecen, y orad por los que os ultrajan y os persiguen;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 45, NULL, 'para que seáis hijos de vuestro Padre que está en los cielos, que hace salir su sol sobre malos y buenos, y que hace llover sobre justos e injustos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 46, NULL, 'Porque si amáis a los que os aman, ¿qué recompensa tendréis? ¿No hacen también lo mismo los publicanos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 47, NULL, 'Y si saludáis a vuestros hermanos solamente, ¿qué hacéis de más? ¿No hacen también así los gentiles?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 5, 48, NULL, 'Sed, pues, vosotros perfectos, como vuestro Padre que está en los cielos es perfecto.(AA)', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 6, 1, 'Jesús y la limosna', 'Guardaos de hacer vuestra justicia delante de los hombres, para ser vistos de ellos; de otra manera no tendréis recompensa de vuestro Padre que está en los cielos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 6, 2, NULL, 'Cuando, pues, des limosna, no hagas tocar trompeta delante de ti, como hacen los hipócritas en las sinagogas y en las calles, para ser alabados por los hombres; de cierto os digo que ya tienen su recompensa.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 6, 3, NULL, 'Mas cuando tú des limosna, no sepa tu izquierda lo que hace tu derecha,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 6, 4, NULL, 'para que sea tu limosna en secreto; y tu Padre que ve en lo secreto te recompensará en público.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 6, 5, 'Jesús y la oración', 'Y cuando ores, no seas como los hipócritas; porque ellos aman el orar en pie en las sinagogas y en las esquinas de las calles, para ser vistos de los hombres; de cierto os digo que ya tienen su recompensa.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 6, 6, NULL, 'Mas tú, cuando ores, entra en tu aposento, y cerrada la puerta, ora a tu Padre que está en secreto; y tu Padre que ve en lo secreto te recompensará en público.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 6, 7, NULL, 'Y orando, no uséis vanas repeticiones, como los gentiles, que piensan que por su palabrería serán oídos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 6, 8, NULL, 'No os hagáis, pues, semejantes a ellos; porque vuestro Padre sabe de qué cosas tenéis necesidad, antes que vosotros le pidáis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 6, 9, NULL, 'Vosotros, pues, oraréis así: Padre nuestro que estás en los cielos, santificado sea tu nombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 6, 10, NULL, 'Venga tu reino. Hágase tu voluntad, como en el cielo, así también en la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 6, 11, NULL, 'El pan nuestro de cada día, dánoslo hoy.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 6, 12, NULL, 'Y perdónanos nuestras deudas, como también nosotros perdonamos a nuestros deudores.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 6, 13, NULL, 'Y no nos metas en tentación, mas líbranos del mal; porque tuyo es el reino, y el poder, y la gloria, por todos los siglos. Amén.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 6, 14, NULL, 'Porque si perdonáis a los hombres sus ofensas, os perdonará también a vosotros vuestro Padre celestial;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 6, 15, NULL, 'mas si no perdonáis a los hombres sus ofensas, tampoco vuestro Padre os perdonará vuestras ofensas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 6, 16, 'Jesús y el ayuno', 'Cuando ayunéis, no seáis austeros, como los hipócritas; porque ellos demudan sus rostros para mostrar a los hombres que ayunan; de cierto os digo que ya tienen su recompensa.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 6, 17, NULL, 'Pero tú, cuando ayunes, unge tu cabeza y lava tu rostro,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 6, 18, NULL, 'para no mostrar a los hombres que ayunas, sino a tu Padre que está en secreto; y tu Padre que ve en lo secreto te recompensará en público.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 6, 19, 'Tesoros en el cielo', 'No os hagáis tesoros en la tierra, donde la polilla y el orín corrompen, y donde ladrones minan y hurtan;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 6, 20, NULL, 'sino haceos tesoros en el cielo, donde ni la polilla ni el orín corrompen, y donde ladrones no minan ni hurtan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 6, 21, NULL, 'Porque donde esté vuestro tesoro, allí estará también vuestro corazón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 6, 22, 'La lámpara del cuerpo', 'La lámpara del cuerpo es el ojo; así que, si tu ojo es bueno, todo tu cuerpo estará lleno de luz;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 6, 23, NULL, 'pero si tu ojo es maligno, todo tu cuerpo estará en tinieblas. Así que, si la luz que en ti hay es tinieblas, ¿cuántas no serán las mismas tinieblas?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 6, 24, 'Dios y las riquezas', 'Ninguno puede servir a dos señores; porque o aborrecerá al uno y amará al otro, o estimará al uno y menospreciará al otro. No podéis servir a Dios y a las riquezas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 6, 25, 'El afán y la ansiedad', 'Por tanto os digo: No os afanéis por vuestra vida, qué habéis de comer o qué habéis de beber; ni por vuestro cuerpo, qué habéis de vestir. ¿No es la vida más que el alimento, y el cuerpo más que el vestido?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 6, 26, NULL, 'Mirad las aves del cielo, que no siembran, ni siegan, ni recogen en graneros; y vuestro Padre celestial las alimenta. ¿No valéis vosotros mucho más que ellas?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 6, 27, NULL, '¿Y quién de vosotros podrá, por mucho que se afane, añadir a su estatura un codo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 6, 28, NULL, 'Y por el vestido, ¿por qué os afanáis? Considerad los lirios del campo, cómo crecen: no trabajan ni hilan;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 6, 29, NULL, 'pero os digo, que ni aun Salomón con toda su gloria se vistió así como uno de ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 6, 30, NULL, 'Y si la hierba del campo que hoy es, y mañana se echa en el horno, Dios la viste así, ¿no hará mucho más a vosotros, hombres de poca fe?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 6, 31, NULL, 'No os afanéis, pues, diciendo: ¿Qué comeremos, o qué beberemos, o qué vestiremos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 6, 32, NULL, 'Porque los gentiles buscan todas estas cosas; pero vuestro Padre celestial sabe que tenéis necesidad de todas estas cosas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 6, 33, NULL, 'Mas buscad primeramente el reino de Dios y su justicia, y todas estas cosas os serán añadidas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 6, 34, NULL, 'Así que, no os afanéis por el día de mañana, porque el día de mañana traerá su afán. Basta a cada día su propio mal.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 7, 1, 'El juzgar a los demás', 'No juzguéis, para que no seáis juzgados.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 7, 2, NULL, 'Porque con el juicio con que juzgáis, seréis juzgados, y con la medida con que medís, os será medido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 7, 3, NULL, '¿Y por qué miras la paja que está en el ojo de tu hermano, y no echas de ver la viga que está en tu propio ojo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 7, 4, NULL, '¿O cómo dirás a tu hermano: Déjame sacar la paja de tu ojo, y he aquí la viga en el ojo tuyo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 7, 5, NULL, '¡Hipócrita! saca primero la viga de tu propio ojo, y entonces verás bien para sacar la paja del ojo de tu hermano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 7, 6, NULL, 'No deis lo santo a los perros, ni echéis vuestras perlas delante de los cerdos, no sea que las pisoteen, y se vuelvan y os despedacen.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 7, 7, 'La oración, y la regla de oro', 'Pedid, y se os dará; buscad, y hallaréis; llamad, y se os abrirá.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 7, 8, NULL, 'Porque todo aquel que pide, recibe; y el que busca, halla; y al que llama, se le abrirá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 7, 9, NULL, '¿Qué hombre hay de vosotros, que si su hijo le pide pan, le dará una piedra?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 7, 10, NULL, '¿O si le pide un pescado, le dará una serpiente?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 7, 11, NULL, 'Pues si vosotros, siendo malos, sabéis dar buenas dádivas a vuestros hijos, ¿cuánto más vuestro Padre que está en los cielos dará buenas cosas a los que le pidan?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 7, 12, NULL, 'Así que, todas las cosas que queráis que los hombres hagan con vosotros, así también haced vosotros con ellos; porque esto es la ley y los profetas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 7, 13, 'La puerta estrecha', 'Entrad por la puerta estrecha; porque ancha es la puerta, y espacioso el camino que lleva a la perdición, y muchos son los que entran por ella;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 7, 14, NULL, 'porque estrecha es la puerta, y angosto el camino que lleva a la vida, y pocos son los que la hallan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 7, 15, 'Por sus frutos los conoceréis', 'Guardaos de los falsos profetas, que vienen a vosotros con vestidos de ovejas, pero por dentro son lobos rapaces.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 7, 16, NULL, 'Por sus frutos los conoceréis. ¿Acaso se recogen uvas de los espinos, o higos de los abrojos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 7, 17, NULL, 'Así, todo buen árbol da buenos frutos, pero el árbol malo da frutos malos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 7, 18, NULL, 'No puede el buen árbol dar malos frutos, ni el árbol malo dar frutos buenos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 7, 19, NULL, 'Todo árbol que no da buen fruto, es cortado y echado en el fuego.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 7, 20, NULL, 'Así que, por sus frutos los conoceréis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 7, 21, 'Nunca os conocí', 'No todo el que me dice: Señor, Señor, entrará en el reino de los cielos, sino el que hace la voluntad de mi Padre que está en los cielos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 7, 22, NULL, 'Muchos me dirán en aquel día: Señor, Señor, ¿no profetizamos en tu nombre, y en tu nombre echamos fuera demonios, y en tu nombre hicimos muchos milagros?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 7, 23, NULL, 'Y entonces les declararé: Nunca os conocí; apartaos de mí, hacedores de maldad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 7, 24, 'Los dos cimientos', 'Cualquiera, pues, que me oye estas palabras, y las hace, le compararé a un hombre prudente, que edificó su casa sobre la roca.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 7, 25, NULL, 'Descendió lluvia, y vinieron ríos, y soplaron vientos, y golpearon contra aquella casa; y no cayó, porque estaba fundada sobre la roca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 7, 26, NULL, 'Pero cualquiera que me oye estas palabras y no las hace, le compararé a un hombre insensato, que edificó su casa sobre la arena;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 7, 27, NULL, 'y descendió lluvia, y vinieron ríos, y soplaron vientos, y dieron con ímpetu contra aquella casa; y cayó, y fue grande su ruina.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 7, 28, NULL, 'Y cuando terminó Jesús estas palabras, la gente se admiraba de su doctrina;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 7, 29, NULL, 'porque les enseñaba como quien tiene autoridad, y no como los escribas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 8, 1, 'Jesús sana a un leproso', 'Cuando descendió Jesús del monte, le seguía mucha gente.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 8, 2, NULL, 'Y he aquí vino un leproso y se postró ante él, diciendo: Señor, si quieres, puedes limpiarme.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 8, 3, NULL, 'Jesús extendió la mano y le tocó, diciendo: Quiero; sé limpio. Y al instante su lepra desapareció.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 8, 4, NULL, 'Entonces Jesús le dijo: Mira, no lo digas a nadie; sino ve, muéstrate al sacerdote, y presenta la ofrenda que ordenó Moisés, para testimonio a ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 8, 5, 'Jesús sana al siervo de un centurión', 'Entrando Jesús en Capernaum, vino a él un centurión, rogándole,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 8, 6, NULL, 'y diciendo: Señor, mi criado está postrado en casa, paralítico, gravemente atormentado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 8, 7, NULL, 'Y Jesús le dijo: Yo iré y le sanaré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 8, 8, NULL, 'Respondió el centurión y dijo: Señor, no soy digno de que entres bajo mi techo; solamente di la palabra, y mi criado sanará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 8, 9, NULL, 'Porque también yo soy hombre bajo autoridad, y tengo bajo mis órdenes soldados; y digo a este: Ve, y va; y al otro: Ven, y viene; y a mi siervo: Haz esto, y lo hace.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 8, 10, NULL, 'Al oírlo Jesús, se maravilló, y dijo a los que le seguían: De cierto os digo, que ni aun en Israel he hallado tanta fe.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 8, 11, NULL, 'Y os digo que vendrán muchos del oriente y del occidente, y se sentarán con Abraham e Isaac y Jacob en el reino de los cielos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 8, 12, NULL, 'mas los hijos del reino serán echados a las tinieblas de afuera; allí será el lloro y el crujir de dientes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 8, 13, NULL, 'Entonces Jesús dijo al centurión: Ve, y como creíste, te sea hecho. Y su criado fue sanado en aquella misma hora.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 8, 14, 'Jesús sana a la suegra de Pedro', 'Vino Jesús a casa de Pedro, y vio a la suegra de este postrada en cama, con fiebre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 8, 15, NULL, 'Y tocó su mano, y la fiebre la dejó; y ella se levantó, y les servía.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 8, 16, NULL, 'Y cuando llegó la noche, trajeron a él muchos endemoniados; y con la palabra echó fuera a los demonios, y sanó a todos los enfermos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 8, 17, NULL, 'para que se cumpliese lo dicho por el profeta Isaías, cuando dijo: Él mismo tomó nuestras enfermedades, y llevó nuestras dolencias.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 8, 18, 'Los que querían seguir a Jesús', 'Viéndose Jesús rodeado de mucha gente, mandó pasar al otro lado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 8, 19, NULL, 'Y vino un escriba y le dijo: Maestro, te seguiré adondequiera que vayas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 8, 20, NULL, 'Jesús le dijo: Las zorras tienen guaridas, y las aves del cielo nidos; mas el Hijo del Hombre no tiene dónde recostar su cabeza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 8, 21, NULL, 'Otro de sus discípulos le dijo: Señor, permíteme que vaya primero y entierre a mi padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 8, 22, NULL, 'Jesús le dijo: Sígueme; deja que los muertos entierren a sus muertos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 8, 23, 'Jesús calma la tempestad', 'Y entrando él en la barca, sus discípulos le siguieron.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 8, 24, NULL, 'Y he aquí que se levantó en el mar una tempestad tan grande que las olas cubrían la barca; pero él dormía.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 8, 25, NULL, 'Y vinieron sus discípulos y le despertaron, diciendo: ¡Señor, sálvanos, que perecemos!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 8, 26, NULL, 'Él les dijo: ¿Por qué teméis, hombres de poca fe? Entonces, levantándose, reprendió a los vientos y al mar; y se hizo grande bonanza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 8, 27, NULL, 'Y los hombres se maravillaron, diciendo: ¿Qué hombre es este, que aun los vientos y el mar le obedecen?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 8, 28, 'Los endemoniados gadarenos', 'Cuando llegó a la otra orilla, a la tierra de los gadarenos, vinieron a su encuentro dos endemoniados que salían de los sepulcros, feroces en gran manera, tanto que nadie podía pasar por aquel camino.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 8, 29, NULL, 'Y clamaron diciendo: ¿Qué tienes con nosotros, Jesús, Hijo de Dios? ¿Has venido acá para atormentarnos antes de tiempo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 8, 30, NULL, 'Estaba paciendo lejos de ellos un hato de muchos cerdos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 8, 31, NULL, 'Y los demonios le rogaron diciendo: Si nos echas fuera, permítenos ir a aquel hato de cerdos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 8, 32, NULL, 'Él les dijo: Id. Y ellos salieron, y se fueron a aquel hato de cerdos; y he aquí, todo el hato de cerdos se precipitó en el mar por un despeñadero, y perecieron en las aguas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 8, 33, NULL, 'Y los que los apacentaban huyeron, y viniendo a la ciudad, contaron todas las cosas, y lo que había pasado con los endemoniados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 8, 34, NULL, 'Y toda la ciudad salió al encuentro de Jesús; y cuando le vieron, le rogaron que se fuera de sus contornos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 9, 1, 'Jesús sana a un paralítico', 'Entonces, entrando Jesús en la barca, pasó al otro lado y vino a su ciudad.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 9, 2, NULL, 'Y sucedió que le trajeron un paralítico, tendido sobre una cama; y al ver Jesús la fe de ellos, dijo al paralítico: Ten ánimo, hijo; tus pecados te son perdonados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 9, 3, NULL, 'Entonces algunos de los escribas decían dentro de sí: Este blasfema.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 9, 4, NULL, 'Y conociendo Jesús los pensamientos de ellos, dijo: ¿Por qué pensáis mal en vuestros corazones?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 9, 5, NULL, 'Porque, ¿qué es más fácil, decir: Los pecados te son perdonados, o decir: Levántate y anda?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 9, 6, NULL, 'Pues para que sepáis que el Hijo del Hombre tiene potestad en la tierra para perdonar pecados (dice entonces al paralítico): Levántate, toma tu cama, y vete a tu casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 9, 7, NULL, 'Entonces él se levantó y se fue a su casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 9, 8, NULL, 'Y la gente, al verlo, se maravilló y glorificó a Dios, que había dado tal potestad a los hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 9, 9, 'Llamamiento de Mateo', 'Pasando Jesús de allí, vio a un hombre llamado Mateo, que estaba sentado al banco de los tributos públicos, y le dijo: Sígueme. Y se levantó y le siguió.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 9, 10, NULL, 'Y aconteció que estando él sentado a la mesa en la casa, he aquí que muchos publicanos y pecadores, que habían venido, se sentaron juntamente a la mesa con Jesús y sus discípulos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 9, 11, NULL, 'Cuando vieron esto los fariseos, dijeron a los discípulos: ¿Por qué come vuestro Maestro con los publicanos y pecadores?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 9, 12, NULL, 'Al oír esto Jesús, les dijo: Los sanos no tienen necesidad de médico, sino los enfermos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 9, 13, NULL, 'Id, pues, y aprended lo que significa: Misericordia quiero, y no sacrificio. Porque no he venido a llamar a justos, sino a pecadores, al arrepentimiento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 9, 14, 'La pregunta sobre el ayuno', 'Entonces vinieron a él los discípulos de Juan, diciendo: ¿Por qué nosotros y los fariseos ayunamos muchas veces, y tus discípulos no ayunan?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 9, 15, NULL, 'Jesús les dijo: ¿Acaso pueden los que están de bodas tener luto entre tanto que el esposo está con ellos? Pero vendrán días cuando el esposo les será quitado, y entonces ayunarán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 9, 16, NULL, 'Nadie pone remiendo de paño nuevo en vestido viejo; porque tal remiendo tira del vestido, y se hace peor la rotura.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 9, 17, NULL, 'Ni echan vino nuevo en odres viejos; de otra manera los odres se rompen, y el vino se derrama, y los odres se pierden; pero echan el vino nuevo en odres nuevos, y lo uno y lo otro se conservan juntamente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 9, 18, 'La hija de Jairo, y la mujer que tocó el manto de Jesús', 'Mientras él les decía estas cosas, vino un hombre principal y se postró ante él, diciendo: Mi hija acaba de morir; mas ven y pon tu mano sobre ella, y vivirá.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 9, 19, NULL, 'Y se levantó Jesús, y le siguió con sus discípulos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 9, 20, NULL, 'Y he aquí una mujer enferma de flujo de sangre desde hacía doce años, se le acercó por detrás y tocó el borde de su manto;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 9, 21, NULL, 'porque decía dentro de sí: Si tocare solamente su manto, seré salva.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 9, 22, NULL, 'Pero Jesús, volviéndose y mirándola, dijo: Ten ánimo, hija; tu fe te ha salvado. Y la mujer fue salva desde aquella hora.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 9, 23, NULL, 'Al entrar Jesús en la casa del principal, viendo a los que tocaban flautas, y la gente que hacía alboroto,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 9, 24, NULL, 'les dijo: Apartaos, porque la niña no está muerta, sino duerme. Y se burlaban de él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 9, 25, NULL, 'Pero cuando la gente había sido echada fuera, entró, y tomó de la mano a la niña, y ella se levantó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 9, 26, NULL, 'Y se difundió la fama de esto por toda aquella tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 9, 27, 'Dos ciegos reciben la vista', 'Pasando Jesús de allí, le siguieron dos ciegos, dando voces y diciendo: ¡Ten misericordia de nosotros, Hijo de David!', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 9, 28, NULL, 'Y llegado a la casa, vinieron a él los ciegos; y Jesús les dijo: ¿Creéis que puedo hacer esto? Ellos dijeron: Sí, Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 9, 29, NULL, 'Entonces les tocó los ojos, diciendo: Conforme a vuestra fe os sea hecho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 9, 30, NULL, 'Y los ojos de ellos fueron abiertos. Y Jesús les encargó rigurosamente, diciendo: Mirad que nadie lo sepa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 9, 31, NULL, 'Pero salidos ellos, divulgaron la fama de él por toda aquella tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 9, 32, 'Un mudo habla', 'Mientras salían ellos, he aquí, le trajeron un mudo, endemoniado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 9, 33, NULL, 'Y echado fuera el demonio, el mudo habló; y la gente se maravillaba, y decía: Nunca se ha visto cosa semejante en Israel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 9, 34, NULL, 'Pero los fariseos decían: Por el príncipe de los demonios echa fuera los demonios.', 0, 'spa', 'RVR1960', NULL);\n"
;

  public static final String SQL_PARTE_2 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Mt', 9, 35, 'La mies es mucha', 'Recorría Jesús todas las ciudades y aldeas, enseñando en las sinagogas de ellos, y predicando el evangelio del reino, y sanando toda enfermedad y toda dolencia en el pueblo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 9, 36, NULL, 'Y al ver las multitudes, tuvo compasión de ellas; porque estaban desamparadas y dispersas como ovejas que no tienen pastor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 9, 37, NULL, 'Entonces dijo a sus discípulos: A la verdad la mies es mucha, mas los obreros pocos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 9, 38, NULL, 'Rogad, pues, al Señor de la mies, que envíe obreros a su mies.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 1, 'Elección de los doce apóstoles', 'Entonces llamando a sus doce discípulos, les dio autoridad sobre los espíritus inmundos, para que los echasen fuera, y para sanar toda enfermedad y toda dolencia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 2, NULL, 'Los nombres de los doce apóstoles son estos: primero Simón, llamado Pedro, y Andrés su hermano; Jacobo hijo de Zebedeo, y Juan su hermano;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 3, NULL, 'Felipe, Bartolomé, Tomás, Mateo el publicano, Jacobo hijo de Alfeo, Lebeo, por sobrenombre Tadeo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 4, NULL, 'Simón el cananista, y Judas Iscariote, el que también le entregó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 5, 'Misión de los doce', 'A estos doce envió Jesús, y les dio instrucciones, diciendo: Por camino de gentiles no vayáis, y en ciudad de samaritanos no entréis,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 6, NULL, 'sino id antes a las ovejas perdidas de la casa de Israel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 7, NULL, 'Y yendo, predicad, diciendo: El reino de los cielos se ha acercado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 8, NULL, 'Sanad enfermos, limpiad leprosos, resucitad muertos, echad fuera demonios; de gracia recibisteis, dad de gracia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 9, NULL, 'No os proveáis de oro, ni plata, ni cobre en vuestros cintos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 10, NULL, 'ni de alforja para el camino, ni de dos túnicas, ni de calzado, ni de bordón; porque el obrero es digno de su alimento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 11, NULL, 'Mas en cualquier ciudad o aldea donde entréis, informaos quién en ella sea digno, y posad allí hasta que salgáis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 12, NULL, 'Y al entrar en la casa, saludadla.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 13, NULL, 'Y si la casa fuere digna, vuestra paz vendrá sobre ella; mas si no fuere digna, vuestra paz se volverá a vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 14, NULL, 'Y si alguno no os recibiere, ni oyere vuestras palabras, salid de aquella casa o ciudad, y sacudid el polvo de vuestros pies.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 15, NULL, 'De cierto os digo que en el día del juicio, será más tolerable el castigo para la tierra de Sodoma y de Gomorra, que para aquella ciudad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 16, 'Persecuciones venideras', 'He aquí, yo os envío como a ovejas en medio de lobos; sed, pues, prudentes como serpientes, y sencillos como palomas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 17, NULL, 'Y guardaos de los hombres, porque os entregarán a los concilios, y en sus sinagogas os azotarán;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 18, NULL, 'y aun ante gobernadores y reyes seréis llevados por causa de mí, para testimonio a ellos y a los gentiles.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 19, NULL, 'Mas cuando os entreguen, no os preocupéis por cómo o qué hablaréis; porque en aquella hora os será dado lo que habéis de hablar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 20, NULL, 'Porque no sois vosotros los que habláis, sino el Espíritu de vuestro Padre que habla en vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 21, NULL, 'El hermano entregará a la muerte al hermano, y el padre al hijo; y los hijos se levantarán contra los padres, y los harán morir.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 22, NULL, 'Y seréis aborrecidos de todos por causa de mi nombre; mas el que persevere hasta el fin, este será salvo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 23, NULL, 'Cuando os persigan en esta ciudad, huid a la otra; porque de cierto os digo, que no acabaréis de recorrer todas las ciudades de Israel, antes que venga el Hijo del Hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 24, NULL, 'El discípulo no es más que su maestro, ni el siervo más que su señor.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 25, NULL, 'Bástale al discípulo ser como su maestro, y al siervo como su señor. Si al padre de familia llamaron Beelzebú, ¿cuánto más a los de su casa?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 26, 'A quién se debe temer', 'Así que, no los temáis; porque nada hay encubierto, que no haya de ser manifestado; ni oculto, que no haya de saberse.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 27, NULL, 'Lo que os digo en tinieblas, decidlo en la luz; y lo que oís al oído, proclamadlo desde las azoteas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 28, NULL, 'Y no temáis a los que matan el cuerpo, mas el alma no pueden matar; temed más bien a aquel que puede destruir el alma y el cuerpo en el infierno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 29, NULL, '¿No se venden dos pajarillos por un cuarto? Con todo, ni uno de ellos cae a tierra sin vuestro Padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 30, NULL, 'Pues aun vuestros cabellos están todos contados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 31, NULL, 'Así que, no temáis; más valéis vosotros que muchos pajarillos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 32, NULL, 'A cualquiera, pues, que me confiese delante de los hombres, yo también le confesaré delante de mi Padre que está en los cielos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 33, NULL, 'Y a cualquiera que me niegue delante de los hombres, yo también le negaré delante de mi Padre que está en los cielos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 34, 'Jesús, causa de división', 'No penséis que he venido para traer paz a la tierra; no he venido para traer paz, sino espada.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 35, NULL, 'Porque he venido para poner en disensión al hombre contra su padre, a la hija contra su madre, y a la nuera contra su suegra;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 36, NULL, 'y los enemigos del hombre serán los de su casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 37, NULL, 'El que ama a padre o madre más que a mí, no es digno de mí; el que ama a hijo o hija más que a mí, no es digno de mí;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 38, NULL, 'y el que no toma su cruz y sigue en pos de mí, no es digno de mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 39, NULL, 'El que halla su vida, la perderá; y el que pierde su vida por causa de mí, la hallará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 40, 'Recompensas', 'El que a vosotros recibe, a mí me recibe; y el que me recibe a mí, recibe al que me envió.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 41, NULL, 'El que recibe a un profeta por cuanto es profeta, recompensa de profeta recibirá; y el que recibe a un justo por cuanto es justo, recompensa de justo recibirá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 10, 42, NULL, 'Y cualquiera que dé a uno de estos pequeñitos un vaso de agua fría solamente, por cuanto es discípulo, de cierto os digo que no perderá su recompensa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 11, 1, 'Los mensajeros de Juan el Bautista', 'Cuando Jesús terminó de dar instrucciones a sus doce discípulos, se fue de allí a enseñar y a predicar en las ciudades de ellos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 11, 2, NULL, 'Y al oír Juan, en la cárcel, los hechos de Cristo, le envió dos de sus discípulos,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 11, 3, NULL, 'para preguntarle: ¿Eres tú aquel que había de venir, o esperaremos a otro?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 11, 4, NULL, 'Respondiendo Jesús, les dijo: Id, y haced saber a Juan las cosas que oís y veis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 11, 5, NULL, 'Los ciegos ven, los cojos andan, los leprosos son limpiados, los sordos oyen, los muertos son resucitados, y a los pobres es anunciado el evangelio;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 11, 6, NULL, 'y bienaventurado es el que no halle tropiezo en mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 11, 7, NULL, 'Mientras ellos se iban, comenzó Jesús a decir de Juan a la gente: ¿Qué salisteis a ver al desierto? ¿Una caña sacudida por el viento?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 11, 8, NULL, '¿O qué salisteis a ver? ¿A un hombre cubierto de vestiduras delicadas? He aquí, los que llevan vestiduras delicadas, en las casas de los reyes están.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 11, 9, NULL, 'Pero ¿qué salisteis a ver? ¿A un profeta? Sí, os digo, y más que profeta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 11, 10, NULL, 'Porque este es de quien está escrito: He aquí, yo envío mi mensajero delante de tu faz, El cual preparará tu camino delante de ti.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 11, 11, NULL, 'De cierto os digo: Entre los que nacen de mujer no se ha levantado otro mayor que Juan el Bautista; pero el más pequeño en el reino de los cielos, mayor es que él.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 11, 12, NULL, 'Desde los días de Juan el Bautista hasta ahora, el reino de los cielos sufre violencia, y los violentos lo arrebatan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 11, 13, NULL, 'Porque todos los profetas y la ley profetizaron hasta Juan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 11, 14, NULL, 'Y si queréis recibirlo, él es aquel Elías que había de venir.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 11, 15, NULL, 'El que tiene oídos para oír, oiga.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 11, 16, NULL, 'Mas ¿a qué compararé esta generación? Es semejante a los muchachos que se sientan en las plazas, y dan voces a sus compañeros,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 11, 17, NULL, 'diciendo: Os tocamos flauta, y no bailasteis; os endechamos, y no lamentasteis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 11, 18, NULL, 'Porque vino Juan, que ni comía ni bebía, y dicen: Demonio tiene.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 11, 19, NULL, 'Vino el Hijo del Hombre, que come y bebe, y dicen: He aquí un hombre comilón, y bebedor de vino, amigo de publicanos y de pecadores. Pero la sabiduría es justificada por sus hijos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 11, 20, 'Ayes sobre las ciudades impenitentes', 'Entonces comenzó a reconvenir a las ciudades en las cuales había hecho muchos de sus milagros, porque no se habían arrepentido, diciendo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 11, 21, NULL, '¡Ay de ti, Corazín! ¡Ay de ti, Betsaida! Porque si en Tiro y en Sidón se hubieran hecho los milagros que han sido hechos en vosotras, tiempo ha que se hubieran arrepentido en cilicio y en ceniza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 11, 22, NULL, 'Por tanto os digo que en el día del juicio, será más tolerable el castigo para Tiro y para Sidón, que para vosotras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 11, 23, NULL, 'Y tú, Capernaum, que eres levantada hasta el cielo, hasta el Hades serás abatida; porque si en Sodoma se hubieran hecho los milagros que han sido hechos en ti, habría permanecido hasta el día de hoy.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 11, 24, NULL, 'Por tanto os digo que en el día del juicio, será más tolerable el castigo para la tierra de Sodoma, que para ti.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 11, 25, 'Venid a mí y descansad', 'En aquel tiempo, respondiendo Jesús, dijo: Te alabo, Padre, Señor del cielo y de la tierra, porque escondiste estas cosas de los sabios y de los entendidos, y las revelaste a los niños.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 11, 26, NULL, 'Sí, Padre, porque así te agradó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 11, 27, NULL, 'Todas las cosas me fueron entregadas por mi Padre; y nadie conoce al Hijo, sino el Padre, ni al Padre conoce alguno, sino el Hijo, y aquel a quien el Hijo lo quiera revelar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 11, 28, NULL, 'Venid a mí todos los que estáis trabajados y cargados, y yo os haré descansar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 11, 29, NULL, 'Llevad mi yugo sobre vosotros, y aprended de mí, que soy manso y humilde de corazón; y hallaréis descanso para vuestras almas;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 11, 30, NULL, 'porque mi yugo es fácil, y ligera mi carga.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 1, 'Los discípulos recogen espigas en el día de reposo', 'En aquel tiempo iba Jesús por los sembrados en un día de reposo; y sus discípulos tuvieron hambre, y comenzaron a arrancar espigas y a comer.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 2, NULL, 'Viéndolo los fariseos, le dijeron: He aquí tus discípulos hacen lo que no es lícito hacer en el día de reposo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 3, NULL, 'Pero él les dijo: ¿No habéis leído lo que hizo David, cuando él y los que con él estaban tuvieron hambre;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 4, NULL, 'cómo entró en la casa de Dios, y comió los panes de la proposición, que no les era lícito comer ni a él ni a los que con él estaban, sino solamente a los sacerdotes?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 5, NULL, '¿O no habéis leído en la ley, cómo en el día de reposo los sacerdotes en el templo profanan el día de reposo, y son sin culpa?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 6, NULL, 'Pues os digo que uno mayor que el templo está aquí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 7, NULL, 'Y si supieseis qué significa: Misericordia quiero, y no sacrificio, no condenaríais a los inocentes;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 8, NULL, 'porque el Hijo del Hombre es Señor del día de reposo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 9, 'El hombre de la mano seca', 'Pasando de allí, vino a la sinagoga de ellos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 10, NULL, 'Y he aquí había allí uno que tenía seca una mano; y preguntaron a Jesús, para poder acusarle: ¿Es lícito sanar en el día de reposo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 11, NULL, 'Él les dijo: ¿Qué hombre habrá de vosotros, que tenga una oveja, y si esta cayere en un hoyo en día de reposo, no le eche mano, y la levante?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 12, NULL, 'Pues ¿cuánto más vale un hombre que una oveja? Por consiguiente, es lícito hacer el bien en los días de reposo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 13, NULL, 'Entonces dijo a aquel hombre: Extiende tu mano. Y él la extendió, y le fue restaurada sana como la otra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 14, NULL, 'Y salidos los fariseos, tuvieron consejo contra Jesús para destruirle.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 15, 'El siervo escogido', 'Sabiendo esto Jesús, se apartó de allí; y le siguió mucha gente, y sanaba a todos,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 16, NULL, 'y les encargaba rigurosamente que no le descubriesen;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 17, NULL, 'para que se cumpliese lo dicho por el profeta Isaías, cuando dijo:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 18, NULL, 'He aquí mi siervo, a quien he escogido; Mi Amado, en quien se agrada mi alma; Pondré mi Espíritu sobre él, Y a los gentiles anunciará juicio.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 19, NULL, 'No contenderá, ni voceará, Ni nadie oirá en las calles su voz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 20, NULL, 'La caña cascada no quebrará, Y el pábilo que humea no apagará, Hasta que saque a victoria el juicio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 21, NULL, 'Y en su nombre esperarán los gentiles.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 22, 'La blasfemia contra el Espíritu Santo', 'Entonces fue traído a él un endemoniado, ciego y mudo; y le sanó, de tal manera que el ciego y mudo veía y hablaba.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 23, NULL, 'Y toda la gente estaba atónita, y decía: ¿Será este aquel Hijo de David?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 24, NULL, 'Mas los fariseos, al oírlo, decían: Este no echa fuera los demonios sino por Beelzebú, príncipe de los demonios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 25, NULL, 'Sabiendo Jesús los pensamientos de ellos, les dijo: Todo reino dividido contra sí mismo, es asolado, y toda ciudad o casa dividida contra sí misma, no permanecerá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 26, NULL, 'Y si Satanás echa fuera a Satanás, contra sí mismo está dividido; ¿cómo, pues, permanecerá su reino?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 27, NULL, 'Y si yo echo fuera los demonios por Beelzebú, ¿por quién los echan vuestros hijos? Por tanto, ellos serán vuestros jueces.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 28, NULL, 'Pero si yo por el Espíritu de Dios echo fuera los demonios, ciertamente ha llegado a vosotros el reino de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 29, NULL, 'Porque ¿cómo puede alguno entrar en la casa del hombre fuerte, y saquear sus bienes, si primero no le ata? Y entonces podrá saquear su casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 30, NULL, 'El que no es conmigo, contra mí es; y el que conmigo no recoge, desparrama.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 31, NULL, 'Por tanto os digo: Todo pecado y blasfemia será perdonado a los hombres; mas la blasfemia contra el Espíritu no les será perdonada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 32, NULL, 'A cualquiera que dijere alguna palabra contra el Hijo del Hombre, le será perdonado; pero al que hable contra el Espíritu Santo, no le será perdonado, ni en este siglo ni en el venidero.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 33, NULL, 'O haced el árbol bueno, y su fruto bueno, o haced el árbol malo, y su fruto malo; porque por el fruto se conoce el árbol.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 34, NULL, '¡Generación de víboras! ¿Cómo podéis hablar lo bueno, siendo malos? Porque de la abundancia del corazón habla la boca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 35, NULL, 'El hombre bueno, del buen tesoro del corazón saca buenas cosas; y el hombre malo, del mal tesoro saca malas cosas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 36, NULL, 'Mas yo os digo que de toda palabra ociosa que hablen los hombres, de ella darán cuenta en el día del juicio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 37, NULL, 'Porque por tus palabras serás justificado, y por tus palabras serás condenado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 38, 'La generación perversa demanda señal', 'Entonces respondieron algunos de los escribas y de los fariseos, diciendo: Maestro, deseamos ver de ti señal.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 39, NULL, 'Él respondió y les dijo: La generación mala y adúltera demanda señal; pero señal no le será dada, sino la señal del profeta Jonás.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 40, NULL, 'Porque como estuvo Jonás en el vientre del gran pez tres días y tres noches, así estará el Hijo del Hombre en el corazón de la tierra tres días y tres noches.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 41, NULL, 'Los hombres de Nínive se levantarán en el juicio con esta generación, y la condenarán; porque ellos se arrepintieron a la predicación de Jonás, y he aquí más que Jonás en este lugar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 42, NULL, 'La reina del Sur se levantará en el juicio con esta generación, y la condenará; porque ella vino de los fines de la tierra para oír la sabiduría de Salomón, y he aquí más que Salomón en este lugar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 43, 'El espíritu inmundo que vuelve', 'Cuando el espíritu inmundo sale del hombre, anda por lugares secos, buscando reposo, y no lo halla.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 44, NULL, 'Entonces dice: Volveré a mi casa de donde salí; y cuando llega, la halla desocupada, barrida y adornada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 45, NULL, 'Entonces va, y toma consigo otros siete espíritus peores que él, y entrados, moran allí; y el postrer estado de aquel hombre viene a ser peor que el primero. Así también acontecerá a esta mala generación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 46, 'La madre y los hermanos de Jesús', 'Mientras él aún hablaba a la gente, he aquí su madre y sus hermanos estaban afuera, y le querían hablar.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 47, NULL, 'Y le dijo uno: He aquí tu madre y tus hermanos están afuera, y te quieren hablar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 48, NULL, 'Respondiendo él al que le decía esto, dijo: ¿Quién es mi madre, y quiénes son mis hermanos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 49, NULL, 'Y extendiendo su mano hacia sus discípulos, dijo: He aquí mi madre y mis hermanos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 12, 50, NULL, 'Porque todo aquel que hace la voluntad de mi Padre que está en los cielos, ese es mi hermano, y hermana, y madre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 1, 'Parábola del sembrador', 'Aquel día salió Jesús de la casa y se sentó junto al mar.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 2, NULL, 'Y se le juntó mucha gente; y entrando él en la barca, se sentó, y toda la gente estaba en la playa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 3, NULL, 'Y les habló muchas cosas por parábolas, diciendo: He aquí, el sembrador salió a sembrar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 4, NULL, 'Y mientras sembraba, parte de la semilla cayó junto al camino; y vinieron las aves y la comieron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 5, NULL, 'Parte cayó en pedregales, donde no había mucha tierra; y brotó pronto, porque no tenía profundidad de tierra;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 6, NULL, 'pero salido el sol, se quemó; y porque no tenía raíz, se secó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 7, NULL, 'Y parte cayó entre espinos; y los espinos crecieron, y la ahogaron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 8, NULL, 'Pero parte cayó en buena tierra, y dio fruto, cuál a ciento, cuál a sesenta, y cuál a treinta por uno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 9, NULL, 'El que tiene oídos para oír, oiga.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 10, 'Propósito de las parábolas', 'Entonces, acercándose los discípulos, le dijeron: ¿Por qué les hablas por parábolas?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 11, NULL, 'Él respondiendo, les dijo: Porque a vosotros os es dado saber los misterios del reino de los cielos; mas a ellos no les es dado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 12, NULL, 'Porque a cualquiera que tiene, se le dará, y tendrá más; pero al que no tiene, aun lo que tiene le será quitado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 13, NULL, 'Por eso les hablo por parábolas: porque viendo no ven, y oyendo no oyen, ni entienden.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 14, NULL, 'De manera que se cumple en ellos la profecía de Isaías, que dijo: De oído oiréis, y no entenderéis; Y viendo veréis, y no percibiréis.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 15, NULL, 'Porque el corazón de este pueblo se ha engrosado, Y con los oídos oyen pesadamente, Y han cerrado sus ojos; Para que no vean con los ojos, Y oigan con los oídos, Y con el corazón entiendan, Y se conviertan, Y yo los sane.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 16, NULL, 'Pero bienaventurados vuestros ojos, porque ven; y vuestros oídos, porque oyen.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 17, NULL, 'Porque de cierto os digo, que muchos profetas y justos desearon ver lo que veis, y no lo vieron; y oír lo que oís, y no lo oyeron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 18, 'Jesús explica la parábola del sembrador', 'Oíd, pues, vosotros la parábola del sembrador:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 19, NULL, 'Cuando alguno oye la palabra del reino y no la entiende, viene el malo, y arrebata lo que fue sembrado en su corazón. Este es el que fue sembrado junto al camino.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 20, NULL, 'Y el que fue sembrado en pedregales, este es el que oye la palabra, y al momento la recibe con gozo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 21, NULL, 'pero no tiene raíz en sí, sino que es de corta duración, pues al venir la aflicción o la persecución por causa de la palabra, luego tropieza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 22, NULL, 'El que fue sembrado entre espinos, este es el que oye la palabra, pero el afán de este siglo y el engaño de las riquezas ahogan la palabra, y se hace infructuosa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 23, NULL, 'Mas el que fue sembrado en buena tierra, este es el que oye y entiende la palabra, y da fruto; y produce a ciento, a sesenta, y a treinta por uno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 24, 'Parábola del trigo y la cizaña', 'Les refirió otra parábola, diciendo: El reino de los cielos es semejante a un hombre que sembró buena semilla en su campo;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 25, NULL, 'pero mientras dormían los hombres, vino su enemigo y sembró cizaña entre el trigo, y se fue.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 26, NULL, 'Y cuando salió la hierba y dio fruto, entonces apareció también la cizaña.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 27, NULL, 'Vinieron entonces los siervos del padre de familia y le dijeron: Señor, ¿no sembraste buena semilla en tu campo? ¿De dónde, pues, tiene cizaña?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 28, NULL, 'Él les dijo: Un enemigo ha hecho esto. Y los siervos le dijeron: ¿Quieres, pues, que vayamos y la arranquemos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 29, NULL, 'Él les dijo: No, no sea que al arrancar la cizaña, arranquéis también con ella el trigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 30, NULL, 'Dejad crecer juntamente lo uno y lo otro hasta la siega; y al tiempo de la siega yo diré a los segadores: Recoged primero la cizaña, y atadla en manojos para quemarla; pero recoged el trigo en mi granero.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 31, 'Parábola de la semilla de mostaza', 'Otra parábola les refirió, diciendo: El reino de los cielos es semejante al grano de mostaza, que un hombre tomó y sembró en su campo;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 32, NULL, 'el cual a la verdad es la más pequeña de todas las semillas; pero cuando ha crecido, es la mayor de las hortalizas, y se hace árbol, de tal manera que vienen las aves del cielo y hacen nidos en sus ramas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 33, 'Parábola de la levadura', 'Otra parábola les dijo: El reino de los cielos es semejante a la levadura que tomó una mujer, y escondió en tres medidas de harina, hasta que todo fue leudado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 34, 'El uso que Jesús hace de las parábolas', 'Todo esto habló Jesús por parábolas a la gente, y sin parábolas no les hablaba;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 35, NULL, 'para que se cumpliese lo dicho por el profeta, cuando dijo: Abriré en parábolas mi boca; Declararé cosas escondidas desde la fundación del mundo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 36, 'Jesús explica la parábola de la cizaña', 'Entonces, despedida la gente, entró Jesús en la casa; y acercándose a él sus discípulos, le dijeron: Explícanos la parábola de la cizaña del campo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 37, NULL, 'Respondiendo él, les dijo: El que siembra la buena semilla es el Hijo del Hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 38, NULL, 'El campo es el mundo; la buena semilla son los hijos del reino, y la cizaña son los hijos del malo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 39, NULL, 'El enemigo que la sembró es el diablo; la siega es el fin del siglo; y los segadores son los ángeles.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 40, NULL, 'De manera que como se arranca la cizaña, y se quema en el fuego, así será en el fin de este siglo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 41, NULL, 'Enviará el Hijo del Hombre a sus ángeles, y recogerán de su reino a todos los que sirven de tropiezo, y a los que hacen iniquidad,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 42, NULL, 'y los echarán en el horno de fuego; allí será el lloro y el crujir de dientes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 43, NULL, 'Entonces los justos resplandecerán como el sol en el reino de su Padre. El que tiene oídos para oír, oiga.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 44, 'El tesoro escondido', 'Además, el reino de los cielos es semejante a un tesoro escondido en un campo, el cual un hombre halla, y lo esconde de nuevo; y gozoso por ello va y vende todo lo que tiene, y compra aquel campo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 45, 'La perla de gran precio', 'También el reino de los cielos es semejante a un mercader que busca buenas perlas,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 46, NULL, 'que habiendo hallado una perla preciosa, fue y vendió todo lo que tenía, y la compró.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 47, 'La red', 'Asimismo el reino de los cielos es semejante a una red, que echada en el mar, recoge de toda clase de peces;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 48, NULL, 'y una vez llena, la sacan a la orilla; y sentados, recogen lo bueno en cestas, y lo malo echan fuera.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 49, NULL, 'Así será al fin del siglo: saldrán los ángeles, y apartarán a los malos de entre los justos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 50, NULL, 'y los echarán en el horno de fuego; allí será el lloro y el crujir de dientes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 51, 'Tesoros nuevos y viejos', 'Jesús les dijo: ¿Habéis entendido todas estas cosas? Ellos respondieron: Sí, Señor.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 52, NULL, 'Él les dijo: Por eso todo escriba docto en el reino de los cielos es semejante a un padre de familia, que saca de su tesoro cosas nuevas y cosas viejas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 53, 'Jesús en Nazaret', 'Aconteció que cuando terminó Jesús estas parábolas, se fue de allí.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 54, NULL, 'Y venido a su tierra, les enseñaba en la sinagoga de ellos, de tal manera que se maravillaban, y decían: ¿De dónde tiene este esta sabiduría y estos milagros?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 55, NULL, '¿No es este el hijo del carpintero? ¿No se llama su madre María, y sus hermanos, Jacobo, José, Simón y Judas?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 56, NULL, '¿No están todas sus hermanas con nosotros? ¿De dónde, pues, tiene este todas estas cosas?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 57, NULL, 'Y se escandalizaban de él. Pero Jesús les dijo: No hay profeta sin honra, sino en su propia tierra y en su casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 13, 58, NULL, 'Y no hizo allí muchos milagros, a causa de la incredulidad de ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 14, 1, 'Muerte de Juan el Bautista', 'En aquel tiempo Herodes el tetrarca oyó la fama de Jesús,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 14, 2, NULL, 'y dijo a sus criados: Este es Juan el Bautista; ha resucitado de los muertos, y por eso actúan en él estos poderes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 14, 3, NULL, 'Porque Herodes había prendido a Juan, y le había encadenado y metido en la cárcel, por causa de Herodías, mujer de Felipe su hermano;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 14, 4, NULL, 'porque Juan le decía: No te es lícito tenerla.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 14, 5, NULL, 'Y Herodes quería matarle, pero temía al pueblo; porque tenían a Juan por profeta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 14, 6, NULL, 'Pero cuando se celebraba el cumpleaños de Herodes, la hija de Herodías danzó en medio, y agradó a Herodes,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 14, 7, NULL, 'por lo cual este le prometió con juramento darle todo lo que pidiese.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 14, 8, NULL, 'Ella, instruida primero por su madre, dijo: Dame aquí en un plato la cabeza de Juan el Bautista.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 14, 9, NULL, 'Entonces el rey se entristeció; pero a causa del juramento, y de los que estaban con él a la mesa, mandó que se la diesen,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 14, 10, NULL, 'y ordenó decapitar a Juan en la cárcel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 14, 11, NULL, 'Y fue traída su cabeza en un plato, y dada a la muchacha; y ella la presentó a su madre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 14, 12, NULL, 'Entonces llegaron sus discípulos, y tomaron el cuerpo y lo enterraron; y fueron y dieron las nuevas a Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 14, 13, 'Alimentación de los cinco mil', 'Oyéndolo Jesús, se apartó de allí en una barca a un lugar desierto y apartado; y cuando la gente lo oyó, le siguió a pie desde las ciudades.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 14, 14, NULL, 'Y saliendo Jesús, vio una gran multitud, y tuvo compasión de ellos, y sanó a los que de ellos estaban enfermos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 14, 15, NULL, 'Cuando anochecía, se acercaron a él sus discípulos, diciendo: El lugar es desierto, y la hora ya pasada; despide a la multitud, para que vayan por las aldeas y compren de comer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 14, 16, NULL, 'Jesús les dijo: No tienen necesidad de irse; dadles vosotros de comer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 14, 17, NULL, 'Y ellos dijeron: No tenemos aquí sino cinco panes y dos peces.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 14, 18, NULL, 'Él les dijo: Traédmelos acá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 14, 19, NULL, 'Entonces mandó a la gente recostarse sobre la hierba; y tomando los cinco panes y los dos peces, y levantando los ojos al cielo, bendijo, y partió y dio los panes a los discípulos, y los discípulos a la multitud.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 14, 20, NULL, 'Y comieron todos, y se saciaron; y recogieron lo que sobró de los pedazos, doce cestas llenas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 14, 21, NULL, 'Y los que comieron fueron como cinco mil hombres, sin contar las mujeres y los niños.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 14, 22, 'Jesús anda sobre el mar', 'En seguida Jesús hizo a sus discípulos entrar en la barca e ir delante de él a la otra ribera, entre tanto que él despedía a la multitud.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 14, 23, NULL, 'Despedida la multitud, subió al monte a orar aparte; y cuando llegó la noche, estaba allí solo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 14, 24, NULL, 'Y ya la barca estaba en medio del mar, azotada por las olas; porque el viento era contrario.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 14, 25, NULL, 'Mas a la cuarta vigilia de la noche, Jesús vino a ellos andando sobre el mar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 14, 26, NULL, 'Y los discípulos, viéndole andar sobre el mar, se turbaron, diciendo: ¡Un fantasma! Y dieron voces de miedo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 14, 27, NULL, 'Pero en seguida Jesús les habló, diciendo: ¡Tened ánimo; yo soy, no temáis!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 14, 28, NULL, 'Entonces le respondió Pedro, y dijo: Señor, si eres tú, manda que yo vaya a ti sobre las aguas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 14, 29, NULL, 'Y él dijo: Ven. Y descendiendo Pedro de la barca, andaba sobre las aguas para ir a Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 14, 30, NULL, 'Pero al ver el fuerte viento, tuvo miedo; y comenzando a hundirse, dio voces, diciendo: ¡Señor, sálvame!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 14, 31, NULL, 'Al momento Jesús, extendiendo la mano, asió de él, y le dijo: ¡Hombre de poca fe! ¿Por qué dudaste?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 14, 32, NULL, 'Y cuando ellos subieron en la barca, se calmó el viento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 14, 33, NULL, 'Entonces los que estaban en la barca vinieron y le adoraron, diciendo: Verdaderamente eres Hijo de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 14, 34, 'Jesús sana a los enfermos en Genesaret', 'Y terminada la travesía, vinieron a tierra de Genesaret.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 14, 35, NULL, 'Cuando le conocieron los hombres de aquel lugar, enviaron noticia por toda aquella tierra alrededor, y trajeron a él todos los enfermos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 14, 36, NULL, 'y le rogaban que les dejase tocar solamente el borde de su manto; y todos los que lo tocaron, quedaron sanos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 15, 1, 'Lo que contamina al hombre', 'Entonces se acercaron a Jesús ciertos escribas y fariseos de Jerusalén, diciendo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 15, 2, NULL, '¿Por qué tus discípulos quebrantan la tradición de los ancianos? Porque no se lavan las manos cuando comen pan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 15, 3, NULL, 'Respondiendo él, les dijo: ¿Por qué también vosotros quebrantáis el mandamiento de Dios por vuestra tradición?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 15, 4, NULL, 'Porque Dios mandó diciendo: Honra a tu padre y a tu madre; y: El que maldiga al padre o a la madre, muera irremisiblemente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 15, 5, NULL, 'Pero vosotros decís: Cualquiera que diga a su padre o a su madre: Es mi ofrenda a Dios todo aquello con que pudiera ayudarte,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 15, 6, NULL, 'ya no ha de honrar a su padre o a su madre. Así habéis invalidado el mandamiento de Dios por vuestra tradición.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 15, 7, NULL, 'Hipócritas, bien profetizó de vosotros Isaías, cuando dijo:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 15, 8, NULL, 'Este pueblo de labios me honra; Mas su corazón está lejos de mí.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 15, 9, NULL, 'Pues en vano me honran, Enseñando como doctrinas, mandamientos de hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 15, 10, NULL, 'Y llamando a sí a la multitud, les dijo: Oíd, y entended:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 15, 11, NULL, 'No lo que entra en la boca contamina al hombre; mas lo que sale de la boca, esto contamina al hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 15, 12, NULL, 'Entonces acercándose sus discípulos, le dijeron: ¿Sabes que los fariseos se ofendieron cuando oyeron esta palabra?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 15, 13, NULL, 'Pero respondiendo él, dijo: Toda planta que no plantó mi Padre celestial, será desarraigada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 15, 14, NULL, 'Dejadlos; son ciegos guías de ciegos; y si el ciego guiare al ciego, ambos caerán en el hoyo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 15, 15, NULL, 'Respondiendo Pedro, le dijo: Explícanos esta parábola.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 15, 16, NULL, 'Jesús dijo: ¿También vosotros sois aún sin entendimiento?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 15, 17, NULL, '¿No entendéis que todo lo que entra en la boca va al vientre, y es echado en la letrina?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 15, 18, NULL, 'Pero lo que sale de la boca, del corazón sale; y esto contamina al hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 15, 19, NULL, 'Porque del corazón salen los malos pensamientos, los homicidios, los adulterios, las fornicaciones, los hurtos, los falsos testimonios, las blasfemias.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 15, 20, NULL, 'Estas cosas son las que contaminan al hombre; pero el comer con las manos sin lavar no contamina al hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 15, 21, 'La fe de la mujer cananea', 'Saliendo Jesús de allí, se fue a la región de Tiro y de Sidón.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 15, 22, NULL, 'Y he aquí una mujer cananea que había salido de aquella región clamaba, diciéndole: ¡Señor, Hijo de David, ten misericordia de mí! Mi hija es gravemente atormentada por un demonio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 15, 23, NULL, 'Pero Jesús no le respondió palabra. Entonces acercándose sus discípulos, le rogaron, diciendo: Despídela, pues da voces tras nosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 15, 24, NULL, 'Él respondiendo, dijo: No soy enviado sino a las ovejas perdidas de la casa de Israel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 15, 25, NULL, 'Entonces ella vino y se postró ante él, diciendo: ¡Señor, socórreme!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 15, 26, NULL, 'Respondiendo él, dijo: No está bien tomar el pan de los hijos, y echarlo a los perrillos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 15, 27, NULL, 'Y ella dijo: Sí, Señor; pero aun los perrillos comen de las migajas que caen de la mesa de sus amos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 15, 28, NULL, 'Entonces respondiendo Jesús, dijo: Oh mujer, grande es tu fe; hágase contigo como quieres. Y su hija fue sanada desde aquella hora.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 15, 29, 'Jesús sana a muchos', 'Pasó Jesús de allí y vino junto al mar de Galilea; y subiendo al monte, se sentó allí.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 15, 30, NULL, 'Y se le acercó mucha gente que traía consigo a cojos, ciegos, mudos, mancos, y otros muchos enfermos; y los pusieron a los pies de Jesús, y los sanó;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 15, 31, NULL, 'de manera que la multitud se maravillaba, viendo a los mudos hablar, a los mancos sanados, a los cojos andar, y a los ciegos ver; y glorificaban al Dios de Israel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 15, 32, 'Alimentación de los cuatro mil', 'Y Jesús, llamando a sus discípulos, dijo: Tengo compasión de la gente, porque ya hace tres días que están conmigo, y no tienen qué comer; y enviarlos en ayunas no quiero, no sea que desmayen en el camino.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 15, 33, NULL, 'Entonces sus discípulos le dijeron: ¿De dónde tenemos nosotros tantos panes en el desierto, para saciar a una multitud tan grande?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 15, 34, NULL, 'Jesús les dijo: ¿Cuántos panes tenéis? Y ellos dijeron: Siete, y unos pocos pececillos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 15, 35, NULL, 'Y mandó a la multitud que se recostase en tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 15, 36, NULL, 'Y tomando los siete panes y los peces, dio gracias, los partió y dio a sus discípulos, y los discípulos a la multitud.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 15, 37, NULL, 'Y comieron todos, y se saciaron; y recogieron lo que sobró de los pedazos, siete canastas llenas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 15, 38, NULL, 'Y eran los que habían comido, cuatro mil hombres, sin contar las mujeres y los niños.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 15, 39, NULL, 'Entonces, despedida la gente, entró en la barca, y vino a la región de Magdala.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 16, 1, 'La demanda de una señal', 'Vinieron los fariseos y los saduceos para tentarle, y le pidieron que les mostrase señal del cielo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 16, 2, NULL, 'Mas él respondiendo, les dijo: Cuando anochece, decís: Buen tiempo; porque el cielo tiene arreboles.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 16, 3, NULL, 'Y por la mañana: Hoy habrá tempestad; porque tiene arreboles el cielo nublado. ¡Hipócritas! Sabéis distinguir el aspecto del cielo, ¡mas las señales de los tiempos no podéis!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 16, 4, NULL, 'La generación mala y adúltera demanda señal; pero señal no le será dada, sino la señal del profeta Jonás. Y dejándolos, se fue.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 16, 5, 'La levadura de los fariseos', 'Llegando sus discípulos al otro lado, se habían olvidado de traer pan.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 16, 6, NULL, 'Y Jesús les dijo: Mirad, guardaos de la levadura de los fariseos y de los saduceos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 16, 7, NULL, 'Ellos pensaban dentro de sí, diciendo: Esto dice porque no trajimos pan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 16, 8, NULL, 'Y entendiéndolo Jesús, les dijo: ¿Por qué pensáis dentro de vosotros, hombres de poca fe, que no tenéis pan?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 16, 9, NULL, '¿No entendéis aún, ni os acordáis de los cinco panes entre cinco mil hombres, y cuántas cestas recogisteis?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 16, 10, NULL, '¿Ni de los siete panes entre cuatro mil, y cuántas canastas recogisteis?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 16, 11, NULL, '¿Cómo es que no entendéis que no fue por el pan que os dije que os guardaseis de la levadura de los fariseos y de los saduceos?', 0, 'spa', 'RVR1960', NULL);\n"
;

  public static final String SQL_PARTE_3 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Mt', 16, 12, NULL, 'Entonces entendieron que no les había dicho que se guardasen de la levadura del pan, sino de la doctrina de los fariseos y de los saduceos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 16, 13, 'La confesión de Pedro', 'Viniendo Jesús a la región de Cesarea de Filipo, preguntó a sus discípulos, diciendo: ¿Quién dicen los hombres que es el Hijo del Hombre?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 16, 14, NULL, 'Ellos dijeron: Unos, Juan el Bautista; otros, Elías; y otros, Jeremías, o alguno de los profetas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 16, 15, NULL, 'Él les dijo: Y vosotros, ¿quién decís que soy yo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 16, 16, NULL, 'Respondiendo Simón Pedro, dijo: Tú eres el Cristo, el Hijo del Dios viviente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 16, 17, NULL, 'Entonces le respondió Jesús: Bienaventurado eres, Simón, hijo de Jonás, porque no te lo reveló carne ni sangre, sino mi Padre que está en los cielos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 16, 18, NULL, 'Y yo también te digo, que tú eres Pedro, y sobre esta roca edificaré mi iglesia; y las puertas del Hades no prevalecerán contra ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 16, 19, NULL, 'Y a ti te daré las llaves del reino de los cielos; y todo lo que atares en la tierra será atado en los cielos; y todo lo que desatares en la tierra será desatado en los cielos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 16, 20, NULL, 'Entonces mandó a sus discípulos que a nadie dijesen que él era Jesús el Cristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 16, 21, 'Jesús anuncia su muerte', 'Desde entonces comenzó Jesús a declarar a sus discípulos que le era necesario ir a Jerusalén y padecer mucho de los ancianos, de los principales sacerdotes y de los escribas; y ser muerto, y resucitar al tercer día.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 16, 22, NULL, 'Entonces Pedro, tomándolo aparte, comenzó a reconvenirle, diciendo: Señor, ten compasión de ti; en ninguna manera esto te acontezca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 16, 23, NULL, 'Pero él, volviéndose, dijo a Pedro: ¡Quítate de delante de mí, Satanás!; me eres tropiezo, porque no pones la mira en las cosas de Dios, sino en las de los hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 16, 24, NULL, 'Entonces Jesús dijo a sus discípulos: Si alguno quiere venir en pos de mí, niéguese a sí mismo, y tome su cruz, y sígame.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 16, 25, NULL, 'Porque todo el que quiera salvar su vida, la perderá; y todo el que pierda su vida por causa de mí, la hallará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 16, 26, NULL, 'Porque ¿qué aprovechará al hombre, si ganare todo el mundo, y perdiere su alma? ¿O qué recompensa dará el hombre por su alma?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 16, 27, NULL, 'Porque el Hijo del Hombre vendrá en la gloria de su Padre con sus ángeles, y entonces pagará a cada uno conforme a sus obras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 16, 28, NULL, 'De cierto os digo que hay algunos de los que están aquí, que no gustarán la muerte, hasta que hayan visto al Hijo del Hombre viniendo en su reino.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 17, 1, 'La transfiguración', 'Seis días después, Jesús tomó a Pedro, a Jacobo y a Juan su hermano, y los llevó aparte a un monte alto;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 17, 2, NULL, 'y se transfiguró delante de ellos, y resplandeció su rostro como el sol, y sus vestidos se hicieron blancos como la luz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 17, 3, NULL, 'Y he aquí les aparecieron Moisés y Elías, hablando con él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 17, 4, NULL, 'Entonces Pedro dijo a Jesús: Señor, bueno es para nosotros que estemos aquí; si quieres, hagamos aquí tres enramadas: una para ti, otra para Moisés, y otra para Elías.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 17, 5, NULL, 'Mientras él aún hablaba, una nube de luz los cubrió; y he aquí una voz desde la nube, que decía: Este es mi Hijo amado, en quien tengo complacencia; a él oíd.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 17, 6, NULL, 'Al oír esto los discípulos, se postraron sobre sus rostros, y tuvieron gran temor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 17, 7, NULL, 'Entonces Jesús se acercó y los tocó, y dijo: Levantaos, y no temáis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 17, 8, NULL, 'Y alzando ellos los ojos, a nadie vieron sino a Jesús solo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 17, 9, NULL, 'Cuando descendieron del monte, Jesús les mandó, diciendo: No digáis a nadie la visión, hasta que el Hijo del Hombre resucite de los muertos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 17, 10, NULL, 'Entonces sus discípulos le preguntaron, diciendo: ¿Por qué, pues, dicen los escribas que es necesario que Elías venga primero?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 17, 11, NULL, 'Respondiendo Jesús, les dijo: A la verdad, Elías viene primero, y restaurará todas las cosas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 17, 12, NULL, 'Mas os digo que Elías ya vino, y no le conocieron, sino que hicieron con él todo lo que quisieron; así también el Hijo del Hombre padecerá de ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 17, 13, NULL, 'Entonces los discípulos comprendieron que les había hablado de Juan el Bautista.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 17, 14, 'Jesús sana a un muchacho lunático', 'Cuando llegaron al gentío, vino a él un hombre que se arrodilló delante de él, diciendo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 17, 15, NULL, 'Señor, ten misericordia de mi hijo, que es lunático, y padece muchísimo; porque muchas veces cae en el fuego, y muchas en el agua.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 17, 16, NULL, 'Y lo he traído a tus discípulos, pero no le han podido sanar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 17, 17, NULL, 'Respondiendo Jesús, dijo: ¡Oh generación incrédula y perversa! ¿Hasta cuándo he de estar con vosotros? ¿Hasta cuándo os he de soportar? Traédmelo acá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 17, 18, NULL, 'Y reprendió Jesús al demonio, el cual salió del muchacho, y este quedó sano desde aquella hora.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 17, 19, NULL, 'Viniendo entonces los discípulos a Jesús, aparte, dijeron: ¿Por qué nosotros no pudimos echarlo fuera?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 17, 20, NULL, 'Jesús les dijo: Por vuestra poca fe; porque de cierto os digo, que si tuviereis fe como un grano de mostaza, diréis a este monte: Pásate de aquí allá, y se pasará; y nada os será imposible.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 17, 21, NULL, 'Pero este género no sale sino con oración y ayuno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 17, 22, 'Jesús anuncia otra vez su muerte', 'Estando ellos en Galilea, Jesús les dijo: El Hijo del Hombre será entregado en manos de hombres,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 17, 23, NULL, 'y le matarán; mas al tercer día resucitará. Y ellos se entristecieron en gran manera.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 17, 24, 'Pago del impuesto del templo', 'Cuando llegaron a Capernaum, vinieron a Pedro los que cobraban las dos dracmas, y le dijeron: ¿Vuestro Maestro no paga las dos dracmas?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 17, 25, NULL, 'Él dijo: Sí. Y al entrar él en casa, Jesús le habló primero, diciendo: ¿Qué te parece, Simón? Los reyes de la tierra, ¿de quiénes cobran los tributos o los impuestos? ¿De sus hijos, o de los extraños?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 17, 26, NULL, 'Pedro le respondió: De los extraños. Jesús le dijo: Luego los hijos están exentos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 17, 27, NULL, 'Sin embargo, para no ofenderles, ve al mar, y echa el anzuelo, y el primer pez que saques, tómalo, y al abrirle la boca, hallarás un estatero; tómalo, y dáselo por mí y por ti.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 18, 1, '¿Quién es el mayor?', 'En aquel tiempo los discípulos vinieron a Jesús, diciendo: ¿Quién es el mayor en el reino de los cielos?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 18, 2, NULL, 'Y llamando Jesús a un niño, lo puso en medio de ellos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 18, 3, NULL, 'y dijo: De cierto os digo, que si no os volvéis y os hacéis como niños, no entraréis en el reino de los cielos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 18, 4, NULL, 'Así que, cualquiera que se humille como este niño, ese es el mayor en el reino de los cielos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 18, 5, NULL, 'Y cualquiera que reciba en mi nombre a un niño como este, a mí me recibe.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 18, 6, 'Ocasiones de caer', 'Y cualquiera que haga tropezar a alguno de estos pequeños que creen en mí, mejor le fuera que se le colgase al cuello una piedra de molino de asno, y que se le hundiese en lo profundo del mar.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 18, 7, NULL, '¡Ay del mundo por los tropiezos!, porque es necesario que vengan tropiezos, pero ¡ay de aquel hombre por quien viene el tropiezo!', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 18, 8, NULL, 'Por tanto, si tu mano o tu pie te es ocasión de caer, córtalo y échalo de ti; mejor te es entrar en la vida cojo o manco, que teniendo dos manos o dos pies ser echado en el fuego eterno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 18, 9, NULL, 'Y si tu ojo te es ocasión de caer, sácalo y échalo de ti; mejor te es entrar con un solo ojo en la vida, que teniendo dos ojos ser echado en el infierno de fuego.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 18, 10, 'Parábola de la oveja perdida', 'Mirad que no menospreciéis a uno de estos pequeños; porque os digo que sus ángeles en los cielos ven siempre el rostro de mi Padre que está en los cielos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 18, 11, NULL, 'Porque el Hijo del Hombre ha venido para salvar lo que se había perdido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 18, 12, NULL, '¿Qué os parece? Si un hombre tiene cien ovejas, y se descarría una de ellas, ¿no deja las noventa y nueve y va por los montes a buscar la que se había descarriado?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 18, 13, NULL, 'Y si acontece que la encuentra, de cierto os digo que se regocija más por aquella, que por las noventa y nueve que no se descarriaron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 18, 14, NULL, 'Así, no es la voluntad de vuestro Padre que está en los cielos, que se pierda uno de estos pequeños.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 18, 15, 'Cómo se debe perdonar al hermano', 'Por tanto, si tu hermano peca contra ti, ve y repréndele estando tú y él solos; si te oyere, has ganado a tu hermano.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 18, 16, NULL, 'Mas si no te oyere, toma aún contigo a uno o dos, para que en boca de dos o tres testigos conste toda palabra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 18, 17, NULL, 'Si no los oyere a ellos, dilo a la iglesia; y si no oyere a la iglesia, tenle por gentil y publicano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 18, 18, NULL, 'De cierto os digo que todo lo que atéis en la tierra, será atado en el cielo; y todo lo que desatéis en la tierra, será desatado en el cielo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 18, 19, NULL, 'Otra vez os digo, que si dos de vosotros se pusieren de acuerdo en la tierra acerca de cualquiera cosa que pidieren, les será hecho por mi Padre que está en los cielos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 18, 20, NULL, 'Porque donde están dos o tres congregados en mi nombre, allí estoy yo en medio de ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 18, 21, NULL, 'Entonces se le acercó Pedro y le dijo: Señor, ¿cuántas veces perdonaré a mi hermano que peque contra mí? ¿Hasta siete?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 18, 22, NULL, 'Jesús le dijo: No te digo hasta siete, sino aun hasta setenta veces siete.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 18, 23, 'Los dos deudores', 'Por lo cual el reino de los cielos es semejante a un rey que quiso hacer cuentas con sus siervos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 18, 24, NULL, 'Y comenzando a hacer cuentas, le fue presentado uno que le debía diez mil talentos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 18, 25, NULL, 'A este, como no pudo pagar, ordenó su señor venderle, y a su mujer e hijos, y todo lo que tenía, para que se le pagase la deuda.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 18, 26, NULL, 'Entonces aquel siervo, postrado, le suplicaba, diciendo: Señor, ten paciencia conmigo, y yo te lo pagaré todo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 18, 27, NULL, 'El señor de aquel siervo, movido a misericordia, le soltó y le perdonó la deuda.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 18, 28, NULL, 'Pero saliendo aquel siervo, halló a uno de sus consiervos, que le debía cien denarios; y asiendo de él, le ahogaba, diciendo: Págame lo que me debes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 18, 29, NULL, 'Entonces su consiervo, postrándose a sus pies, le rogaba diciendo: Ten paciencia conmigo, y yo te lo pagaré todo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 18, 30, NULL, 'Mas él no quiso, sino fue y le echó en la cárcel, hasta que pagase la deuda.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 18, 31, NULL, 'Viendo sus consiervos lo que pasaba, se entristecieron mucho, y fueron y refirieron a su señor todo lo que había pasado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 18, 32, NULL, 'Entonces, llamándole su señor, le dijo: Siervo malvado, toda aquella deuda te perdoné, porque me rogaste.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 18, 33, NULL, '¿No debías tú también tener misericordia de tu consiervo, como yo tuve misericordia de ti?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 18, 34, NULL, 'Entonces su señor, enojado, le entregó a los verdugos, hasta que pagase todo lo que le debía.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 18, 35, NULL, 'Así también mi Padre celestial hará con vosotros si no perdonáis de todo corazón cada uno a su hermano sus ofensas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 19, 1, 'Jesús enseña sobre el divorcio', 'Aconteció que cuando Jesús terminó estas palabras, se alejó de Galilea, y fue a las regiones de Judea al otro lado del Jordán.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 19, 2, NULL, 'Y le siguieron grandes multitudes, y los sanó allí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 19, 3, NULL, 'Entonces vinieron a él los fariseos, tentándole y diciéndole: ¿Es lícito al hombre repudiar a su mujer por cualquier causa?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 19, 4, NULL, 'Él, respondiendo, les dijo: ¿No habéis leído que el que los hizo al principio, varón y hembra los hizo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 19, 5, NULL, 'y dijo: Por esto el hombre dejará padre y madre, y se unirá a su mujer, y los dos serán una sola carne?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 19, 6, NULL, 'Así que no son ya más dos, sino una sola carne; por tanto, lo que Dios juntó, no lo separe el hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 19, 7, NULL, 'Le dijeron: ¿Por qué, pues, mandó Moisés dar carta de divorcio, y repudiarla?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 19, 8, NULL, 'Él les dijo: Por la dureza de vuestro corazón Moisés os permitió repudiar a vuestras mujeres; mas al principio no fue así.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 19, 9, NULL, 'Y yo os digo que cualquiera que repudia a su mujer, salvo por causa de fornicación, y se casa con otra, adultera; y el que se casa con la repudiada, adultera.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 19, 10, NULL, 'Le dijeron sus discípulos: Si así es la condición del hombre con su mujer, no conviene casarse.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 19, 11, NULL, 'Entonces él les dijo: No todos son capaces de recibir esto, sino aquellos a quienes es dado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 19, 12, NULL, 'Pues hay eunucos que nacieron así del vientre de su madre, y hay eunucos que son hechos eunucos por los hombres, y hay eunucos que a sí mismos se hicieron eunucos por causa del reino de los cielos. El que sea capaz de recibir esto, que lo reciba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 19, 13, 'Jesús bendice a los niños', 'Entonces le fueron presentados unos niños, para que pusiese las manos sobre ellos, y orase; y los discípulos les reprendieron.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 19, 14, NULL, 'Pero Jesús dijo: Dejad a los niños venir a mí, y no se lo impidáis; porque de los tales es el reino de los cielos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 19, 15, NULL, 'Y habiendo puesto sobre ellos las manos, se fue de allí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 19, 16, 'El joven rico', 'Entonces vino uno y le dijo: Maestro bueno, ¿qué bien haré para tener la vida eterna?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 19, 17, NULL, 'Él le dijo: ¿Por qué me llamas bueno? Ninguno hay bueno sino uno: Dios. Mas si quieres entrar en la vida, guarda los mandamientos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 19, 18, NULL, 'Le dijo: ¿Cuáles? Y Jesús dijo: No matarás. No adulterarás. No hurtarás. No dirás falso testimonio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 19, 19, NULL, 'Honra a tu padre y a tu madre; y, Amarás a tu prójimo como a ti mismo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 19, 20, NULL, 'El joven le dijo: Todo esto lo he guardado desde mi juventud. ¿Qué más me falta?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 19, 21, NULL, 'Jesús le dijo: Si quieres ser perfecto, anda, vende lo que tienes, y dalo a los pobres, y tendrás tesoro en el cielo; y ven y sígueme.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 19, 22, NULL, 'Oyendo el joven esta palabra, se fue triste, porque tenía muchas posesiones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 19, 23, NULL, 'Entonces Jesús dijo a sus discípulos: De cierto os digo, que difícilmente entrará un rico en el reino de los cielos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 19, 24, NULL, 'Otra vez os digo, que es más fácil pasar un camello por el ojo de una aguja, que entrar un rico en el reino de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 19, 25, NULL, 'Sus discípulos, oyendo esto, se asombraron en gran manera, diciendo: ¿Quién, pues, podrá ser salvo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 19, 26, NULL, 'Y mirándolos Jesús, les dijo: Para los hombres esto es imposible; mas para Dios todo es posible.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 19, 27, NULL, 'Entonces respondiendo Pedro, le dijo: He aquí, nosotros lo hemos dejado todo, y te hemos seguido; ¿qué, pues, tendremos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 19, 28, NULL, 'Y Jesús les dijo: De cierto os digo que en la regeneración, cuando el Hijo del Hombre se siente en el trono de su gloria, vosotros que me habéis seguido también os sentaréis sobre doce tronos, para juzgar a las doce tribus de Israel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 19, 29, NULL, 'Y cualquiera que haya dejado casas, o hermanos, o hermanas, o padre, o madre, o mujer, o hijos, o tierras, por mi nombre, recibirá cien veces más, y heredará la vida eterna.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 19, 30, NULL, 'Pero muchos primeros serán postreros, y postreros, primeros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 20, 1, 'Los obreros de la viña', 'Porque el reino de los cielos es semejante a un hombre, padre de familia, que salió por la mañana a contratar obreros para su viña.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 20, 2, NULL, 'Y habiendo convenido con los obreros en un denario al día, los envió a su viña.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 20, 3, NULL, 'Saliendo cerca de la hora tercera del día, vio a otros que estaban en la plaza desocupados;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 20, 4, NULL, 'y les dijo: Id también vosotros a mi viña, y os daré lo que sea justo. Y ellos fueron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 20, 5, NULL, 'Salió otra vez cerca de las horas sexta y novena, e hizo lo mismo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 20, 6, NULL, 'Y saliendo cerca de la hora undécima, halló a otros que estaban desocupados; y les dijo: ¿Por qué estáis aquí todo el día desocupados?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 20, 7, NULL, 'Le dijeron: Porque nadie nos ha contratado. Él les dijo: Id también vosotros a la viña, y recibiréis lo que sea justo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 20, 8, NULL, 'Cuando llegó la noche, el señor de la viña dijo a su mayordomo: Llama a los obreros y págales el jornal, comenzando desde los postreros hasta los primeros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 20, 9, NULL, 'Y al venir los que habían ido cerca de la hora undécima, recibieron cada uno un denario.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 20, 10, NULL, 'Al venir también los primeros, pensaron que habían de recibir más; pero también ellos recibieron cada uno un denario.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 20, 11, NULL, 'Y al recibirlo, murmuraban contra el padre de familia,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 20, 12, NULL, 'diciendo: Estos postreros han trabajado una sola hora, y los has hecho iguales a nosotros, que hemos soportado la carga y el calor del día.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 20, 13, NULL, 'Él, respondiendo, dijo a uno de ellos: Amigo, no te hago agravio; ¿no conviniste conmigo en un denario?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 20, 14, NULL, 'Toma lo que es tuyo, y vete; pero quiero dar a este postrero, como a ti.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 20, 15, NULL, '¿No me es lícito hacer lo que quiero con lo mío? ¿O tienes tú envidia, porque yo soy bueno?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 20, 16, NULL, 'Así, los primeros serán postreros, y los postreros, primeros; porque muchos son llamados, mas pocos escogidos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 20, 17, 'Nuevamente Jesús anuncia su muerte', 'Subiendo Jesús a Jerusalén, tomó a sus doce discípulos aparte en el camino, y les dijo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 20, 18, NULL, 'He aquí subimos a Jerusalén, y el Hijo del Hombre será entregado a los principales sacerdotes y a los escribas, y le condenarán a muerte;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 20, 19, NULL, 'y le entregarán a los gentiles para que le escarnezcan, le azoten, y le crucifiquen; mas al tercer día resucitará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 20, 20, 'Petición de Santiago y de Juan', 'Entonces se le acercó la madre de los hijos de Zebedeo con sus hijos, postrándose ante él y pidiéndole algo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 20, 21, NULL, 'Él le dijo: ¿Qué quieres? Ella le dijo: Ordena que en tu reino se sienten estos dos hijos míos, el uno a tu derecha, y el otro a tu izquierda.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 20, 22, NULL, 'Entonces Jesús respondiendo, dijo: No sabéis lo que pedís. ¿Podéis beber del vaso que yo he de beber, y ser bautizados con el bautismo con que yo soy bautizado? Y ellos le dijeron: Podemos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 20, 23, NULL, 'Él les dijo: A la verdad, de mi vaso beberéis, y con el bautismo con que yo soy bautizado, seréis bautizados; pero el sentaros a mi derecha y a mi izquierda, no es mío darlo, sino a aquellos para quienes está preparado por mi Padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 20, 24, NULL, 'Cuando los diez oyeron esto, se enojaron contra los dos hermanos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 20, 25, NULL, 'Entonces Jesús, llamándolos, dijo: Sabéis que los gobernantes de las naciones se enseñorean de ellas, y los que son grandes ejercen sobre ellas potestad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 20, 26, NULL, 'Mas entre vosotros no será así, sino que el que quiera hacerse grande entre vosotros será vuestro servidor,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 20, 27, NULL, 'y el que quiera ser el primero entre vosotros será vuestro siervo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 20, 28, NULL, 'como el Hijo del Hombre no vino para ser servido, sino para servir, y para dar su vida en rescate por muchos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 20, 29, 'Dos ciegos reciben la vista', 'Al salir ellos de Jericó, le seguía una gran multitud.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 20, 30, NULL, 'Y dos ciegos que estaban sentados junto al camino, cuando oyeron que Jesús pasaba, clamaron, diciendo: ¡Señor, Hijo de David, ten misericordia de nosotros!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 20, 31, NULL, 'Y la gente les reprendió para que callasen; pero ellos clamaban más, diciendo: ¡Señor, Hijo de David, ten misericordia de nosotros!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 20, 32, NULL, 'Y deteniéndose Jesús, los llamó, y les dijo: ¿Qué queréis que os haga?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 20, 33, NULL, 'Ellos le dijeron: Señor, que sean abiertos nuestros ojos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 20, 34, NULL, 'Entonces Jesús, compadecido, les tocó los ojos, y en seguida recibieron la vista; y le siguieron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 1, 'La entrada triunfal en Jerusalén', 'Cuando se acercaron a Jerusalén, y vinieron a Betfagé, al monte de los Olivos, Jesús envió dos discípulos,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 2, NULL, 'diciéndoles: Id a la aldea que está enfrente de vosotros, y luego hallaréis una asna atada, y un pollino con ella; desatadla, y traédmelos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 3, NULL, 'Y si alguien os dijere algo, decid: El Señor los necesita; y luego los enviará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 4, NULL, 'Todo esto aconteció para que se cumpliese lo dicho por el profeta, cuando dijo:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 5, NULL, 'Decid a la hija de Sion: He aquí, tu Rey viene a ti, Manso, y sentado sobre una asna, Sobre un pollino, hijo de animal de carga.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 6, NULL, 'Y los discípulos fueron, e hicieron como Jesús les mandó;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 7, NULL, 'y trajeron el asna y el pollino, y pusieron sobre ellos sus mantos; y él se sentó encima.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 8, NULL, 'Y la multitud, que era muy numerosa, tendía sus mantos en el camino; y otros cortaban ramas de los árboles, y las tendían en el camino.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 9, NULL, 'Y la gente que iba delante y la que iba detrás aclamaba, diciendo: ¡Hosanna al Hijo de David! ¡Bendito el que viene en el nombre del Señor! ¡Hosanna en las alturas!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 10, NULL, 'Cuando entró él en Jerusalén, toda la ciudad se conmovió, diciendo: ¿Quién es este?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 11, NULL, 'Y la gente decía: Este es Jesús el profeta, de Nazaret de Galilea.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 12, 'Purificación del templo', 'Y entró Jesús en el templo de Dios, y echó fuera a todos los que vendían y compraban en el templo, y volcó las mesas de los cambistas, y las sillas de los que vendían palomas;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 13, NULL, 'y les dijo: Escrito está: Mi casa, casa de oración será llamada; mas vosotros la habéis hecho cueva de ladrones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 14, NULL, 'Y vinieron a él en el templo ciegos y cojos, y los sanó.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 15, NULL, 'Pero los principales sacerdotes y los escribas, viendo las maravillas que hacía, y a los muchachos aclamando en el templo y diciendo: ¡Hosanna al Hijo de David! se indignaron,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 16, NULL, 'y le dijeron: ¿Oyes lo que estos dicen? Y Jesús les dijo: Sí; ¿nunca leísteis: De la boca de los niños y de los que maman Perfeccionaste la alabanza?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 17, NULL, 'Y dejándolos, salió fuera de la ciudad, a Betania, y posó allí.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 18, 'Maldición de la higuera estéril', 'Por la mañana, volviendo a la ciudad, tuvo hambre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 19, NULL, 'Y viendo una higuera cerca del camino, vino a ella, y no halló nada en ella, sino hojas solamente; y le dijo: Nunca jamás nazca de ti fruto. Y luego se secó la higuera.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 20, NULL, 'Viendo esto los discípulos, decían maravillados: ¿Cómo es que se secó en seguida la higuera?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 21, NULL, 'Respondiendo Jesús, les dijo: De cierto os digo, que si tuviereis fe, y no dudareis, no solo haréis esto de la higuera, sino que si a este monte dijereis: Quítate y échate en el mar, será hecho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 22, NULL, 'Y todo lo que pidiereis en oración, creyendo, lo recibiréis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 23, 'La autoridad de Jesús', 'Cuando vino al templo, los principales sacerdotes y los ancianos del pueblo se acercaron a él mientras enseñaba, y le dijeron: ¿Con qué autoridad haces estas cosas? ¿y quién te dio esta autoridad?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 24, NULL, 'Respondiendo Jesús, les dijo: Yo también os haré una pregunta, y si me la contestáis, también yo os diré con qué autoridad hago estas cosas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 25, NULL, 'El bautismo de Juan, ¿de dónde era? ¿Del cielo, o de los hombres? Ellos entonces discutían entre sí, diciendo: Si decimos, del cielo, nos dirá: ¿Por qué, pues, no le creísteis?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 26, NULL, 'Y si decimos, de los hombres, tememos al pueblo; porque todos tienen a Juan por profeta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 27, NULL, 'Y respondiendo a Jesús, dijeron: No sabemos. Y él también les dijo: Tampoco yo os digo con qué autoridad hago estas cosas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 28, 'Parábola de los dos hijos', 'Pero ¿qué os parece? Un hombre tenía dos hijos, y acercándose al primero, le dijo: Hijo, ve hoy a trabajar en mi viña.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 29, NULL, 'Respondiendo él, dijo: No quiero; pero después, arrepentido, fue.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 30, NULL, 'Y acercándose al otro, le dijo de la misma manera; y respondiendo él, dijo: Sí, señor, voy. Y no fue.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 31, NULL, '¿Cuál de los dos hizo la voluntad de su padre? Dijeron ellos: El primero. Jesús les dijo: De cierto os digo, que los publicanos y las rameras van delante de vosotros al reino de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 32, NULL, 'Porque vino a vosotros Juan en camino de justicia, y no le creísteis; pero los publicanos y las rameras le creyeron; y vosotros, viendo esto, no os arrepentisteis después para creerle.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 33, 'Los labradores malvados', 'Oíd otra parábola: Hubo un hombre, padre de familia, el cual plantó una viña, la cercó de vallado, cavó en ella un lagar, edificó una torre, y la arrendó a unos labradores, y se fue lejos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 34, NULL, 'Y cuando se acercó el tiempo de los frutos, envió sus siervos a los labradores, para que recibiesen sus frutos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 35, NULL, 'Mas los labradores, tomando a los siervos, a uno golpearon, a otro mataron, y a otro apedrearon.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 36, NULL, 'Envió de nuevo otros siervos, más que los primeros; e hicieron con ellos de la misma manera.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 37, NULL, 'Finalmente les envió su hijo, diciendo: Tendrán respeto a mi hijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 38, NULL, 'Mas los labradores, cuando vieron al hijo, dijeron entre sí: Este es el heredero; venid, matémosle, y apoderémonos de su heredad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 39, NULL, 'Y tomándole, le echaron fuera de la viña, y le mataron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 40, NULL, 'Cuando venga, pues, el señor de la viña, ¿qué hará a aquellos labradores?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 41, NULL, 'Le dijeron: A los malos destruirá sin misericordia, y arrendará su viña a otros labradores, que le paguen el fruto a su tiempo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 42, NULL, 'Jesús les dijo: ¿Nunca leísteis en las Escrituras: La piedra que desecharon los edificadores, Ha venido a ser cabeza del ángulo. El Señor ha hecho esto, Y es cosa maravillosa a nuestros ojos?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 43, NULL, 'Por tanto os digo, que el reino de Dios será quitado de vosotros, y será dado a gente que produzca los frutos de él.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 44, NULL, 'Y el que cayere sobre esta piedra será quebrantado; y sobre quien ella cayere, le desmenuzará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 45, NULL, 'Y oyendo sus parábolas los principales sacerdotes y los fariseos, entendieron que hablaba de ellos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 21, 46, NULL, 'Pero al buscar cómo echarle mano, temían al pueblo, porque este le tenía por profeta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 1, 'Parábola de la fiesta de bodas', 'Respondiendo Jesús, les volvió a hablar en parábolas, diciendo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 2, NULL, 'El reino de los cielos es semejante a un rey que hizo fiesta de bodas a su hijo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 3, NULL, 'y envió a sus siervos a llamar a los convidados a las bodas; mas estos no quisieron venir.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 4, NULL, 'Volvió a enviar otros siervos, diciendo: Decid a los convidados: He aquí, he preparado mi comida; mis toros y animales engordados han sido muertos, y todo está dispuesto; venid a las bodas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 5, NULL, 'Mas ellos, sin hacer caso, se fueron, uno a su labranza, y otro a sus negocios;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 6, NULL, 'y otros, tomando a los siervos, los afrentaron y los mataron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 7, NULL, 'Al oírlo el rey, se enojó; y enviando sus ejércitos, destruyó a aquellos homicidas, y quemó su ciudad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 8, NULL, 'Entonces dijo a sus siervos: Las bodas a la verdad están preparadas; mas los que fueron convidados no eran dignos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 9, NULL, 'Id, pues, a las salidas de los caminos, y llamad a las bodas a cuantos halléis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 10, NULL, 'Y saliendo los siervos por los caminos, juntaron a todos los que hallaron, juntamente malos y buenos; y las bodas fueron llenas de convidados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 11, NULL, 'Y entró el rey para ver a los convidados, y vio allí a un hombre que no estaba vestido de boda.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 12, NULL, 'Y le dijo: Amigo, ¿cómo entraste aquí, sin estar vestido de boda? Mas él enmudeció.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 13, NULL, 'Entonces el rey dijo a los que servían: Atadle de pies y manos, y echadle en las tinieblas de afuera; allí será el lloro y el crujir de dientes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 14, NULL, 'Porque muchos son llamados, y pocos escogidos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 15, 'La cuestión del tributo', 'Entonces se fueron los fariseos y consultaron cómo sorprenderle en alguna palabra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 16, NULL, 'Y le enviaron los discípulos de ellos con los herodianos, diciendo: Maestro, sabemos que eres amante de la verdad, y que enseñas con verdad el camino de Dios, y que no te cuidas de nadie, porque no miras la apariencia de los hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 17, NULL, 'Dinos, pues, qué te parece: ¿Es lícito dar tributo a César, o no?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 18, NULL, 'Pero Jesús, conociendo la malicia de ellos, les dijo: ¿Por qué me tentáis, hipócritas?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 19, NULL, 'Mostradme la moneda del tributo. Y ellos le presentaron un denario.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 20, NULL, 'Entonces les dijo: ¿De quién es esta imagen, y la inscripción?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 21, NULL, 'Le dijeron: De César. Y les dijo: Dad, pues, a César lo que es de César, y a Dios lo que es de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 22, NULL, 'Oyendo esto, se maravillaron, y dejándole, se fueron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 23, 'La pregunta sobre la resurrección', 'Aquel día vinieron a él los saduceos, que dicen que no hay resurrección, y le preguntaron,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 24, NULL, 'diciendo: Maestro, Moisés dijo: Si alguno muriere sin hijos, su hermano se casará con su mujer, y levantará descendencia a su hermano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 25, NULL, 'Hubo, pues, entre nosotros siete hermanos; el primero se casó, y murió; y no teniendo descendencia, dejó su mujer a su hermano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 26, NULL, 'De la misma manera también el segundo, y el tercero, hasta el séptimo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 27, NULL, 'Y después de todos murió también la mujer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 28, NULL, 'En la resurrección, pues, ¿de cuál de los siete será ella mujer, ya que todos la tuvieron?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 29, NULL, 'Entonces respondiendo Jesús, les dijo: Erráis, ignorando las Escrituras y el poder de Dios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 30, NULL, 'Porque en la resurrección ni se casarán ni se darán en casamiento, sino serán como los ángeles de Dios en el cielo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 31, NULL, 'Pero respecto a la resurrección de los muertos, ¿no habéis leído lo que os fue dicho por Dios, cuando dijo:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 32, NULL, 'Yo soy el Dios de Abraham, el Dios de Isaac y el Dios de Jacob? Dios no es Dios de muertos, sino de vivos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 33, NULL, 'Oyendo esto la gente, se admiraba de su doctrina.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 34, 'El gran mandamiento', 'Entonces los fariseos, oyendo que había hecho callar a los saduceos, se juntaron a una.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 35, NULL, 'Y uno de ellos, intérprete de la ley, preguntó por tentarle, diciendo:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 36, NULL, 'Maestro, ¿cuál es el gran mandamiento en la ley?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 37, NULL, 'Jesús le dijo: Amarás al Señor tu Dios con todo tu corazón, y con toda tu alma, y con toda tu mente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 38, NULL, 'Este es el primero y grande mandamiento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 39, NULL, 'Y el segundo es semejante: Amarás a tu prójimo como a ti mismo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 40, NULL, 'De estos dos mandamientos depende toda la ley y los profetas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 41, '¿De quién es hijo el Cristo?', 'Y estando juntos los fariseos, Jesús les preguntó,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 42, NULL, 'diciendo: ¿Qué pensáis del Cristo? ¿De quién es hijo? Le dijeron: De David.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 43, NULL, 'Él les dijo: ¿Pues cómo David en el Espíritu le llama Señor, diciendo:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 44, NULL, 'Dijo el Señor a mi Señor: Siéntate a mi derecha, Hasta que ponga a tus enemigos por estrado de tus pies?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 45, NULL, 'Pues si David le llama Señor, ¿cómo es su hijo?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 22, 46, NULL, 'Y nadie le podía responder palabra; ni osó alguno desde aquel día preguntarle más.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 23, 1, 'Jesús acusa a escribas y fariseos', 'Entonces habló Jesús a la gente y a sus discípulos, diciendo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 23, 2, NULL, 'En la cátedra de Moisés se sientan los escribas y los fariseos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 23, 3, NULL, 'Así que, todo lo que os digan que guardéis, guardadlo y hacedlo; mas no hagáis conforme a sus obras, porque dicen, y no hacen.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 23, 4, NULL, 'Porque atan cargas pesadas y difíciles de llevar, y las ponen sobre los hombros de los hombres; pero ellos ni con un dedo quieren moverlas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 23, 5, NULL, 'Antes, hacen todas sus obras para ser vistos por los hombres. Pues ensanchan sus filacterias, y extienden los flecos de sus mantos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 23, 6, NULL, 'y aman los primeros asientos en las cenas, y las primeras sillas en las sinagogas,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 23, 7, NULL, 'y las salutaciones en las plazas, y que los hombres los llamen: Rabí, Rabí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 23, 8, NULL, 'Pero vosotros no queráis que os llamen Rabí; porque uno es vuestro Maestro, el Cristo, y todos vosotros sois hermanos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 23, 9, NULL, 'Y no llaméis padre vuestro a nadie en la tierra; porque uno es vuestro Padre, el que está en los cielos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 23, 10, NULL, 'Ni seáis llamados maestros; porque uno es vuestro Maestro, el Cristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 23, 11, NULL, 'El que es el mayor de vosotros, sea vuestro siervo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 23, 12, NULL, 'Porque el que se enaltece será humillado, y el que se humilla será enaltecido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 23, 13, NULL, 'Mas ¡ay de vosotros, escribas y fariseos, hipócritas! porque cerráis el reino de los cielos delante de los hombres; pues ni entráis vosotros, ni dejáis entrar a los que están entrando.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 23, 14, NULL, '¡Ay de vosotros, escribas y fariseos, hipócritas! porque devoráis las casas de las viudas, y como pretexto hacéis largas oraciones; por esto recibiréis mayor condenación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 23, 15, NULL, '¡Ay de vosotros, escribas y fariseos, hipócritas! porque recorréis mar y tierra para hacer un prosélito, y una vez hecho, le hacéis dos veces más hijo del infierno que vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 23, 16, NULL, '¡Ay de vosotros, guías ciegos! que decís: Si alguno jura por el templo, no es nada; pero si alguno jura por el oro del templo, es deudor.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 23, 17, NULL, '¡Insensatos y ciegos! porque ¿cuál es mayor, el oro, o el templo que santifica al oro?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 23, 18, NULL, 'También decís: Si alguno jura por el altar, no es nada; pero si alguno jura por la ofrenda que está sobre él, es deudor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 23, 19, NULL, '¡Necios y ciegos! porque ¿cuál es mayor, la ofrenda, o el altar que santifica la ofrenda?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 23, 20, NULL, 'Pues el que jura por el altar, jura por él, y por todo lo que está sobre él;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 23, 21, NULL, 'y el que jura por el templo, jura por él, y por el que lo habita;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 23, 22, NULL, 'y el que jura por el cielo, jura por el trono de Dios, y por aquel que está sentado en él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 23, 23, NULL, '¡Ay de vosotros, escribas y fariseos, hipócritas! porque diezmáis la menta y el eneldo y el comino, y dejáis lo más importante de la ley: la justicia, la misericordia y la fe. Esto era necesario hacer, sin dejar de hacer aquello.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 23, 24, NULL, '¡Guías ciegos, que coláis el mosquito, y tragáis el camello!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 23, 25, NULL, '¡Ay de vosotros, escribas y fariseos, hipócritas! porque limpiáis lo de fuera del vaso y del plato, pero por dentro estáis llenos de robo y de injusticia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 23, 26, NULL, '¡Fariseo ciego! Limpia primero lo de dentro del vaso y del plato, para que también lo de fuera sea limpio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 23, 27, NULL, '¡Ay de vosotros, escribas y fariseos, hipócritas! porque sois semejantes a sepulcros blanqueados, que por fuera, a la verdad, se muestran hermosos, mas por dentro están llenos de huesos de muertos y de toda inmundicia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 23, 28, NULL, 'Así también vosotros por fuera, a la verdad, os mostráis justos a los hombres, pero por dentro estáis llenos de hipocresía e iniquidad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 23, 29, NULL, '¡Ay de vosotros, escribas y fariseos, hipócritas! porque edificáis los sepulcros de los profetas, y adornáis los monumentos de los justos,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 23, 30, NULL, 'y decís: Si hubiésemos vivido en los días de nuestros padres, no hubiéramos sido sus cómplices en la sangre de los profetas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 23, 31, NULL, 'Así que dais testimonio contra vosotros mismos, de que sois hijos de aquellos que mataron a los profetas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 23, 32, NULL, '¡Vosotros también llenad la medida de vuestros padres!', 0, 'spa', 'RVR1960', NULL);\n"
;

  public static final String SQL_PARTE_4 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Mt', 23, 33, NULL, '¡Serpientes, generación de víboras! ¿Cómo escaparéis de la condenación del infierno?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 23, 34, NULL, 'Por tanto, he aquí yo os envío profetas y sabios y escribas; y de ellos, a unos mataréis y crucificaréis, y a otros azotaréis en vuestras sinagogas, y perseguiréis de ciudad en ciudad;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 23, 35, NULL, 'para que venga sobre vosotros toda la sangre justa que se ha derramado sobre la tierra, desde la sangre de Abel el justo hasta la sangre de Zacarías hijo de Berequías, a quien matasteis entre el templo y el altar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 23, 36, NULL, 'De cierto os digo que todo esto vendrá sobre esta generación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 23, 37, 'Lamento de Jesús sobre Jerusalén', '¡Jerusalén, Jerusalén, que matas a los profetas, y apedreas a los que te son enviados! ¡Cuántas veces quise juntar a tus hijos, como la gallina junta sus polluelos debajo de las alas, y no quisiste!', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 23, 38, NULL, 'He aquí vuestra casa os es dejada desierta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 23, 39, NULL, 'Porque os digo que desde ahora no me veréis, hasta que digáis: Bendito el que viene en el nombre del Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 1, 'Jesús predice la destrucción del templo', 'Cuando Jesús salió del templo y se iba, se acercaron sus discípulos para mostrarle los edificios del templo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 2, NULL, 'Respondiendo él, les dijo: ¿Veis todo esto? De cierto os digo, que no quedará aquí piedra sobre piedra, que no sea derribada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 3, 'Señales antes del fin', 'Y estando él sentado en el monte de los Olivos, los discípulos se le acercaron aparte, diciendo: Dinos, ¿cuándo serán estas cosas, y qué señal habrá de tu venida, y del fin del siglo?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 4, NULL, 'Respondiendo Jesús, les dijo: Mirad que nadie os engañe.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 5, NULL, 'Porque vendrán muchos en mi nombre, diciendo: Yo soy el Cristo; y a muchos engañarán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 6, NULL, 'Y oiréis de guerras y rumores de guerras; mirad que no os turbéis, porque es necesario que todo esto acontezca; pero aún no es el fin.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 7, NULL, 'Porque se levantará nación contra nación, y reino contra reino; y habrá pestes, y hambres, y terremotos en diferentes lugares.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 8, NULL, 'Y todo esto será principio de dolores.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 9, NULL, 'Entonces os entregarán a tribulación, y os matarán, y seréis aborrecidos de todas las gentes por causa de mi nombre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 10, NULL, 'Muchos tropezarán entonces, y se entregarán unos a otros, y unos a otros se aborrecerán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 11, NULL, 'Y muchos falsos profetas se levantarán, y engañarán a muchos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 12, NULL, 'y por haberse multiplicado la maldad, el amor de muchos se enfriará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 13, NULL, 'Mas el que persevere hasta el fin, este será salvo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 14, NULL, 'Y será predicado este evangelio del reino en todo el mundo, para testimonio a todas las naciones; y entonces vendrá el fin.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 15, NULL, 'Por tanto, cuando veáis en el lugar santo la abominación desoladora de que habló el profeta Daniel (el que lee, entienda),', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 16, NULL, 'entonces los que estén en Judea, huyan a los montes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 17, NULL, 'El que esté en la azotea, no descienda para tomar algo de su casa;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 18, NULL, 'y el que esté en el campo, no vuelva atrás para tomar su capa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 19, NULL, 'Mas ¡ay de las que estén encintas, y de las que críen en aquellos días!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 20, NULL, 'Orad, pues, que vuestra huida no sea en invierno ni en día de reposo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 21, NULL, 'porque habrá entonces gran tribulación, cual no la ha habido desde el principio del mundo hasta ahora, ni la habrá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 22, NULL, 'Y si aquellos días no fuesen acortados, nadie sería salvo; mas por causa de los escogidos, aquellos días serán acortados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 23, NULL, 'Entonces, si alguno os dijere: Mirad, aquí está el Cristo, o mirad, allí está, no lo creáis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 24, NULL, 'Porque se levantarán falsos Cristos, y falsos profetas, y harán grandes señales y prodigios, de tal manera que engañarán, si fuere posible, aun a los escogidos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 25, NULL, 'Ya os lo he dicho antes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 26, NULL, 'Así que, si os dijeren: Mirad, está en el desierto, no salgáis; o mirad, está en los aposentos, no lo creáis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 27, NULL, 'Porque como el relámpago que sale del oriente y se muestra hasta el occidente, así será también la venida del Hijo del Hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 28, NULL, 'Porque dondequiera que estuviere el cuerpo muerto, allí se juntarán las águilas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 29, 'La venida del Hijo del Hombre', 'E inmediatamente después de la tribulación de aquellos días, el sol se oscurecerá, y la luna no dará su resplandor, y las estrellas caerán del cielo, y las potencias de los cielos serán conmovidas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 30, NULL, 'Entonces aparecerá la señal del Hijo del Hombre en el cielo; y entonces lamentarán todas las tribus de la tierra, y verán al Hijo del Hombre viniendo sobre las nubes del cielo, con poder y gran gloria.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 31, NULL, 'Y enviará sus ángeles con gran voz de trompeta, y juntarán a sus escogidos, de los cuatro vientos, desde un extremo del cielo hasta el otro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 32, NULL, 'De la higuera aprended la parábola: Cuando ya su rama está tierna, y brotan las hojas, sabéis que el verano está cerca.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 33, NULL, 'Así también vosotros, cuando veáis todas estas cosas, conoced que está cerca, a las puertas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 34, NULL, 'De cierto os digo, que no pasará esta generación hasta que todo esto acontezca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 35, NULL, 'El cielo y la tierra pasarán, pero mis palabras no pasarán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 36, NULL, 'Pero del día y la hora nadie sabe, ni aun los ángeles de los cielos, sino solo mi Padre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 37, NULL, 'Mas como en los días de Noé, así será la venida del Hijo del Hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 38, NULL, 'Porque como en los días antes del diluvio estaban comiendo y bebiendo, casándose y dando en casamiento, hasta el día en que Noé entró en el arca,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 39, NULL, 'y no entendieron hasta que vino el diluvio y se los llevó a todos, así será también la venida del Hijo del Hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 40, NULL, 'Entonces estarán dos en el campo; el uno será tomado, y el otro será dejado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 41, NULL, 'Dos mujeres estarán moliendo en un molino; la una será tomada, y la otra será dejada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 42, NULL, 'Velad, pues, porque no sabéis a qué hora ha de venir vuestro Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 43, NULL, 'Pero sabed esto, que si el padre de familia supiese a qué hora el ladrón habría de venir, velaría, y no dejaría minar su casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 44, NULL, 'Por tanto, también vosotros estad preparados; porque el Hijo del Hombre vendrá a la hora que no pensáis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 45, NULL, '¿Quién es, pues, el siervo fiel y prudente, al cual puso su señor sobre su casa para que les dé el alimento a tiempo?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 46, NULL, 'Bienaventurado aquel siervo al cual, cuando su señor venga, le halle haciendo así.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 47, NULL, 'De cierto os digo que sobre todos sus bienes le pondrá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 48, NULL, 'Pero si aquel siervo malo dijere en su corazón: Mi señor tarda en venir;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 49, NULL, 'y comenzare a golpear a sus consiervos, y aun a comer y a beber con los borrachos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 50, NULL, 'vendrá el señor de aquel siervo en día que este no espera, y a la hora que no sabe,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 24, 51, NULL, 'y lo castigará duramente, y pondrá su parte con los hipócritas; allí será el lloro y el crujir de dientes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 1, 'Parábola de las diez vírgenes', 'Entonces el reino de los cielos será semejante a diez vírgenes que tomando sus lámparas, salieron a recibir al esposo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 2, NULL, 'Cinco de ellas eran prudentes y cinco insensatas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 3, NULL, 'Las insensatas, tomando sus lámparas, no tomaron consigo aceite;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 4, NULL, 'mas las prudentes tomaron aceite en sus vasijas, juntamente con sus lámparas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 5, NULL, 'Y tardándose el esposo, cabecearon todas y se durmieron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 6, NULL, 'Y a la medianoche se oyó un clamor: ¡Aquí viene el esposo; salid a recibirle!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 7, NULL, 'Entonces todas aquellas vírgenes se levantaron, y arreglaron sus lámparas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 8, NULL, 'Y las insensatas dijeron a las prudentes: Dadnos de vuestro aceite; porque nuestras lámparas se apagan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 9, NULL, 'Mas las prudentes respondieron diciendo: Para que no nos falte a nosotras y a vosotras, id más bien a los que venden, y comprad para vosotras mismas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 10, NULL, 'Pero mientras ellas iban a comprar, vino el esposo; y las que estaban preparadas entraron con él a las bodas; y se cerró la puerta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 11, NULL, 'Después vinieron también las otras vírgenes, diciendo: ¡Señor, señor, ábrenos!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 12, NULL, 'Mas él, respondiendo, dijo: De cierto os digo, que no os conozco.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 13, NULL, 'Velad, pues, porque no sabéis el día ni la hora en que el Hijo del Hombre ha de venir.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 14, 'Parábola de los talentos', 'Porque el reino de los cielos es como un hombre que yéndose lejos, llamó a sus siervos y les entregó sus bienes.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 15, NULL, 'A uno dio cinco talentos, y a otro dos, y a otro uno, a cada uno conforme a su capacidad; y luego se fue lejos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 16, NULL, 'Y el que había recibido cinco talentos fue y negoció con ellos, y ganó otros cinco talentos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 17, NULL, 'Asimismo el que había recibido dos, ganó también otros dos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 18, NULL, 'Pero el que había recibido uno fue y cavó en la tierra, y escondió el dinero de su señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 19, NULL, 'Después de mucho tiempo vino el señor de aquellos siervos, y arregló cuentas con ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 20, NULL, 'Y llegando el que había recibido cinco talentos, trajo otros cinco talentos, diciendo: Señor, cinco talentos me entregaste; aquí tienes, he ganado otros cinco talentos sobre ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 21, NULL, 'Y su señor le dijo: Bien, buen siervo y fiel; sobre poco has sido fiel, sobre mucho te pondré; entra en el gozo de tu señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 22, NULL, 'Llegando también el que había recibido dos talentos, dijo: Señor, dos talentos me entregaste; aquí tienes, he ganado otros dos talentos sobre ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 23, NULL, 'Su señor le dijo: Bien, buen siervo y fiel; sobre poco has sido fiel, sobre mucho te pondré; entra en el gozo de tu señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 24, NULL, 'Pero llegando también el que había recibido un talento, dijo: Señor, te conocía que eres hombre duro, que siegas donde no sembraste y recoges donde no esparciste;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 25, NULL, 'por lo cual tuve miedo, y fui y escondí tu talento en la tierra; aquí tienes lo que es tuyo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 26, NULL, 'Respondiendo su señor, le dijo: Siervo malo y negligente, sabías que siego donde no sembré, y que recojo donde no esparcí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 27, NULL, 'Por tanto, debías haber dado mi dinero a los banqueros, y al venir yo, hubiera recibido lo que es mío con los intereses.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 28, NULL, 'Quitadle, pues, el talento, y dadlo al que tiene diez talentos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 29, NULL, 'Porque al que tiene, le será dado, y tendrá más; y al que no tiene, aun lo que tiene le será quitado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 30, NULL, 'Y al siervo inútil echadle en las tinieblas de afuera; allí será el lloro y el crujir de dientes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 31, 'El juicio de las naciones', 'Cuando el Hijo del Hombre venga en su gloria, y todos los santos ángeles con él, entonces se sentará en su trono de gloria,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 32, NULL, 'y serán reunidas delante de él todas las naciones; y apartará los unos de los otros, como aparta el pastor las ovejas de los cabritos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 33, NULL, 'Y pondrá las ovejas a su derecha, y los cabritos a su izquierda.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 34, NULL, 'Entonces el Rey dirá a los de su derecha: Venid, benditos de mi Padre, heredad el reino preparado para vosotros desde la fundación del mundo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 35, NULL, 'Porque tuve hambre, y me disteis de comer; tuve sed, y me disteis de beber; fui forastero, y me recogisteis;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 36, NULL, 'estuve desnudo, y me cubristeis; enfermo, y me visitasteis; en la cárcel, y vinisteis a mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 37, NULL, 'Entonces los justos le responderán diciendo: Señor, ¿cuándo te vimos hambriento, y te sustentamos, o sediento, y te dimos de beber?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 38, NULL, '¿Y cuándo te vimos forastero, y te recogimos, o desnudo, y te cubrimos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 39, NULL, '¿O cuándo te vimos enfermo, o en la cárcel, y vinimos a ti?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 40, NULL, 'Y respondiendo el Rey, les dirá: De cierto os digo que en cuanto lo hicisteis a uno de estos mis hermanos más pequeños, a mí lo hicisteis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 41, NULL, 'Entonces dirá también a los de la izquierda: Apartaos de mí, malditos, al fuego eterno preparado para el diablo y sus ángeles.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 42, NULL, 'Porque tuve hambre, y no me disteis de comer; tuve sed, y no me disteis de beber;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 43, NULL, 'fui forastero, y no me recogisteis; estuve desnudo, y no me cubristeis; enfermo, y en la cárcel, y no me visitasteis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 44, NULL, 'Entonces también ellos le responderán diciendo: Señor, ¿cuándo te vimos hambriento, sediento, forastero, desnudo, enfermo, o en la cárcel, y no te servimos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 45, NULL, 'Entonces les responderá diciendo: De cierto os digo que en cuanto no lo hicisteis a uno de estos más pequeños, tampoco a mí lo hicisteis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 25, 46, NULL, 'E irán estos al castigo eterno, y los justos a la vida eterna.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 1, 'El complot para prender a Jesús', 'Cuando hubo acabado Jesús todas estas palabras, dijo a sus discípulos:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 2, NULL, 'Sabéis que dentro de dos días se celebra la pascua, y el Hijo del Hombre será entregado para ser crucificado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 3, NULL, 'Entonces los principales sacerdotes, los escribas, y los ancianos del pueblo se reunieron en el patio del sumo sacerdote llamado Caifás,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 4, NULL, 'y tuvieron consejo para prender con engaño a Jesús, y matarle.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 5, NULL, 'Pero decían: No durante la fiesta, para que no se haga alboroto en el pueblo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 6, 'Jesús es ungido en Betania', 'Y estando Jesús en Betania, en casa de Simón el leproso,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 7, NULL, 'vino a él una mujer, con un vaso de alabastro de perfume de gran precio, y lo derramó sobre la cabeza de él, estando sentado a la mesa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 8, NULL, 'Al ver esto, los discípulos se enojaron, diciendo: ¿Para qué este desperdicio?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 9, NULL, 'Porque esto podía haberse vendido a gran precio, y haberse dado a los pobres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 10, NULL, 'Y entendiéndolo Jesús, les dijo: ¿Por qué molestáis a esta mujer? pues ha hecho conmigo una buena obra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 11, NULL, 'Porque siempre tendréis pobres con vosotros, pero a mí no siempre me tendréis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 12, NULL, 'Porque al derramar este perfume sobre mi cuerpo, lo ha hecho a fin de prepararme para la sepultura.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 13, NULL, 'De cierto os digo que dondequiera que se predique este evangelio, en todo el mundo, también se contará lo que esta ha hecho, para memoria de ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 14, 'Judas ofrece entregar a Jesús', 'Entonces uno de los doce, que se llamaba Judas Iscariote, fue a los principales sacerdotes,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 15, NULL, 'y les dijo: ¿Qué me queréis dar, y yo os lo entregaré? Y ellos le asignaron treinta piezas de plata.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 16, NULL, 'Y desde entonces buscaba oportunidad para entregarle.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 17, 'Institución de la Cena del Señor', 'El primer día de la fiesta de los panes sin levadura, vinieron los discípulos a Jesús, diciéndole: ¿Dónde quieres que preparemos para que comas la pascua?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 18, NULL, 'Y él dijo: Id a la ciudad a cierto hombre, y decidle: El Maestro dice: Mi tiempo está cerca; en tu casa celebraré la pascua con mis discípulos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 19, NULL, 'Y los discípulos hicieron como Jesús les mandó, y prepararon la pascua.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 20, NULL, 'Cuando llegó la noche, se sentó a la mesa con los doce.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 21, NULL, 'Y mientras comían, dijo: De cierto os digo, que uno de vosotros me va a entregar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 22, NULL, 'Y entristecidos en gran manera, comenzó cada uno de ellos a decirle: ¿Soy yo, Señor?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 23, NULL, 'Entonces él respondiendo, dijo: El que mete la mano conmigo en el plato, ese me va a entregar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 24, NULL, 'A la verdad el Hijo del Hombre va, según está escrito de él, mas ¡ay de aquel hombre por quien el Hijo del Hombre es entregado! Bueno le fuera a ese hombre no haber nacido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 25, NULL, 'Entonces respondiendo Judas, el que le entregaba, dijo: ¿Soy yo, Maestro? Le dijo: Tú lo has dicho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 26, NULL, 'Y mientras comían, tomó Jesús el pan, y bendijo, y lo partió, y dio a sus discípulos, y dijo: Tomad, comed; esto es mi cuerpo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 27, NULL, 'Y tomando la copa, y habiendo dado gracias, les dio, diciendo: Bebed de ella todos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 28, NULL, 'porque esto es mi sangre del nuevo pacto, que por muchos es derramada para remisión de los pecados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 29, NULL, 'Y os digo que desde ahora no beberé más de este fruto de la vid, hasta aquel día en que lo beba nuevo con vosotros en el reino de mi Padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 30, 'Jesús anuncia la negación de Pedro', 'Y cuando hubieron cantado el himno, salieron al monte de los Olivos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 31, NULL, 'Entonces Jesús les dijo: Todos vosotros os escandalizaréis de mí esta noche; porque escrito está: Heriré al pastor, y las ovejas del rebaño serán dispersadas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 32, NULL, 'Pero después que haya resucitado, iré delante de vosotros a Galilea.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 33, NULL, 'Respondiendo Pedro, le dijo: Aunque todos se escandalicen de ti, yo nunca me escandalizaré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 34, NULL, 'Jesús le dijo: De cierto te digo que esta noche, antes que el gallo cante, me negarás tres veces.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 35, NULL, 'Pedro le dijo: Aunque me sea necesario morir contigo, no te negaré. Y todos los discípulos dijeron lo mismo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 36, 'Jesús ora en Getsemaní', 'Entonces llegó Jesús con ellos a un lugar que se llama Getsemaní, y dijo a sus discípulos: Sentaos aquí, entre tanto que voy allí y oro.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 37, NULL, 'Y tomando a Pedro, y a los dos hijos de Zebedeo, comenzó a entristecerse y a angustiarse en gran manera.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 38, NULL, 'Entonces Jesús les dijo: Mi alma está muy triste, hasta la muerte; quedaos aquí, y velad conmigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 39, NULL, 'Yendo un poco adelante, se postró sobre su rostro, orando y diciendo: Padre mío, si es posible, pase de mí esta copa; pero no sea como yo quiero, sino como tú.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 40, NULL, 'Vino luego a sus discípulos, y los halló durmiendo, y dijo a Pedro: ¿Así que no habéis podido velar conmigo una hora?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 41, NULL, 'Velad y orad, para que no entréis en tentación; el espíritu a la verdad está dispuesto, pero la carne es débil.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 42, NULL, 'Otra vez fue, y oró por segunda vez, diciendo: Padre mío, si no puede pasar de mí esta copa sin que yo la beba, hágase tu voluntad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 43, NULL, 'Vino otra vez y los halló durmiendo, porque los ojos de ellos estaban cargados de sueño.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 44, NULL, 'Y dejándolos, se fue de nuevo, y oró por tercera vez, diciendo las mismas palabras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 45, NULL, 'Entonces vino a sus discípulos y les dijo: Dormid ya, y descansad. He aquí ha llegado la hora, y el Hijo del Hombre es entregado en manos de pecadores.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 46, NULL, 'Levantaos, vamos; ved, se acerca el que me entrega.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 47, 'Arresto de Jesús', 'Mientras todavía hablaba, vino Judas, uno de los doce, y con él mucha gente con espadas y palos, de parte de los principales sacerdotes y de los ancianos del pueblo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 48, NULL, 'Y el que le entregaba les había dado señal, diciendo: Al que yo besare, ese es; prendedle.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 49, NULL, 'Y en seguida se acercó a Jesús y dijo: ¡Salve, Maestro! Y le besó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 50, NULL, 'Y Jesús le dijo: Amigo, ¿a qué vienes? Entonces se acercaron y echaron mano a Jesús, y le prendieron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 51, NULL, 'Pero uno de los que estaban con Jesús, extendiendo la mano, sacó su espada, e hiriendo a un siervo del sumo sacerdote, le quitó la oreja.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 52, NULL, 'Entonces Jesús le dijo: Vuelve tu espada a su lugar; porque todos los que tomen espada, a espada perecerán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 53, NULL, '¿Acaso piensas que no puedo ahora orar a mi Padre, y que él no me daría más de doce legiones de ángeles?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 54, NULL, '¿Pero cómo entonces se cumplirían las Escrituras, de que es necesario que así se haga?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 55, NULL, 'En aquella hora dijo Jesús a la gente: ¿Como contra un ladrón habéis salido con espadas y con palos para prenderme? Cada día me sentaba con vosotros enseñando en el templo, y no me prendisteis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 56, NULL, 'Mas todo esto sucede, para que se cumplan las Escrituras de los profetas. Entonces todos los discípulos, dejándole, huyeron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 57, 'Jesús ante el concilio', 'Los que prendieron a Jesús le llevaron al sumo sacerdote Caifás, adonde estaban reunidos los escribas y los ancianos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 58, NULL, 'Mas Pedro le seguía de lejos hasta el patio del sumo sacerdote; y entrando, se sentó con los alguaciles, para ver el fin.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 59, NULL, 'Y los principales sacerdotes y los ancianos y todo el concilio, buscaban falso testimonio contra Jesús, para entregarle a la muerte,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 60, NULL, 'y no lo hallaron, aunque muchos testigos falsos se presentaban. Pero al fin vinieron dos testigos falsos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 61, NULL, 'que dijeron: Este dijo: Puedo derribar el templo de Dios, y en tres días reedificarlo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 62, NULL, 'Y levantándose el sumo sacerdote, le dijo: ¿No respondes nada? ¿Qué testifican estos contra ti?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 63, NULL, 'Mas Jesús callaba. Entonces el sumo sacerdote le dijo: Te conjuro por el Dios viviente, que nos digas si eres tú el Cristo, el Hijo de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 64, NULL, 'Jesús le dijo: Tú lo has dicho; y además os digo, que desde ahora veréis al Hijo del Hombre sentado a la diestra del poder de Dios, y viniendo en las nubes del cielo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 65, NULL, 'Entonces el sumo sacerdote rasgó sus vestiduras, diciendo: ¡Ha blasfemado! ¿Qué más necesidad tenemos de testigos? He aquí, ahora mismo habéis oído su blasfemia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 66, NULL, '¿Qué os parece? Y respondiendo ellos, dijeron: ¡Es reo de muerte!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 67, NULL, 'Entonces le escupieron en el rostro, y le dieron de puñetazos, y otros le abofeteaban,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 68, NULL, 'diciendo: Profetízanos, Cristo, quién es el que te golpeó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 69, 'Pedro niega a Jesús', 'Pedro estaba sentado fuera en el patio; y se le acercó una criada, diciendo: Tú también estabas con Jesús el galileo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 70, NULL, 'Mas él negó delante de todos, diciendo: No sé lo que dices.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 71, NULL, 'Saliendo él a la puerta, le vio otra, y dijo a los que estaban allí: También este estaba con Jesús el nazareno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 72, NULL, 'Pero él negó otra vez con juramento: No conozco al hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 73, NULL, 'Un poco después, acercándose los que por allí estaban, dijeron a Pedro: Verdaderamente también tú eres de ellos, porque aun tu manera de hablar te descubre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 74, NULL, 'Entonces él comenzó a maldecir, y a jurar: No conozco al hombre. Y en seguida cantó el gallo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 26, 75, NULL, 'Entonces Pedro se acordó de las palabras de Jesús, que le había dicho: Antes que cante el gallo, me negarás tres veces. Y saliendo fuera, lloró amargamente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 1, 'Jesús ante Pilato', 'Venida la mañana, todos los principales sacerdotes y los ancianos del pueblo entraron en consejo contra Jesús, para entregarle a muerte.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 2, NULL, 'Y le llevaron atado, y le entregaron a Poncio Pilato, el gobernador.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 3, 'Muerte de Judas', 'Entonces Judas, el que le había entregado, viendo que era condenado, devolvió arrepentido las treinta piezas de plata a los principales sacerdotes y a los ancianos,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 4, NULL, 'diciendo: Yo he pecado entregando sangre inocente. Mas ellos dijeron: ¿Qué nos importa a nosotros? ¡Allá tú!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 5, NULL, 'Y arrojando las piezas de plata en el templo, salió, y fue y se ahorcó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 6, NULL, 'Los principales sacerdotes, tomando las piezas de plata, dijeron: No es lícito echarlas en el tesoro de las ofrendas, porque es precio de sangre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 7, NULL, 'Y después de consultar, compraron con ellas el campo del alfarero, para sepultura de los extranjeros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 8, NULL, 'Por lo cual aquel campo se llama hasta el día de hoy: Campo de sangre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 9, NULL, 'Así se cumplió lo dicho por el profeta Jeremías, cuando dijo: Y tomaron las treinta piezas de plata, precio del apreciado, según precio puesto por los hijos de Israel;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 10, NULL, 'y las dieron para el campo del alfarero, como me ordenó el Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 11, 'Pilato interroga a Jesús', 'Jesús, pues, estaba en pie delante del gobernador; y este le preguntó, diciendo: ¿Eres tú el Rey de los judíos? Y Jesús le dijo: Tú lo dices.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 12, NULL, 'Y siendo acusado por los principales sacerdotes y por los ancianos, nada respondió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 13, NULL, 'Pilato entonces le dijo: ¿No oyes cuántas cosas testifican contra ti?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 14, NULL, 'Pero Jesús no le respondió ni una palabra; de tal manera que el gobernador se maravillaba mucho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 15, 'Jesús sentenciado a muerte', 'Ahora bien, en el día de la fiesta acostumbraba el gobernador soltar al pueblo un preso, el que quisiesen.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 16, NULL, 'Y tenían entonces un preso famoso llamado Barrabás.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 17, NULL, 'Reunidos, pues, ellos, les dijo Pilato: ¿A quién queréis que os suelte: a Barrabás, o a Jesús, llamado el Cristo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 18, NULL, 'Porque sabía que por envidia le habían entregado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 19, NULL, 'Y estando él sentado en el tribunal, su mujer le mandó decir: No tengas nada que ver con ese justo; porque hoy he padecido mucho en sueños por causa de él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 20, NULL, 'Pero los principales sacerdotes y los ancianos persuadieron a la multitud que pidiese a Barrabás, y que Jesús fuese muerto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 21, NULL, 'Y respondiendo el gobernador, les dijo: ¿A cuál de los dos queréis que os suelte? Y ellos dijeron: A Barrabás.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 22, NULL, 'Pilato les dijo: ¿Qué, pues, haré de Jesús, llamado el Cristo? Todos le dijeron: ¡Sea crucificado!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 23, NULL, 'Y el gobernador les dijo: Pues ¿qué mal ha hecho? Pero ellos gritaban aún más, diciendo: ¡Sea crucificado!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 24, NULL, 'Viendo Pilato que nada adelantaba, sino que se hacía más alboroto, tomó agua y se lavó las manos delante del pueblo, diciendo: Inocente soy yo de la sangre de este justo; allá vosotros.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 25, NULL, 'Y respondiendo todo el pueblo, dijo: Su sangre sea sobre nosotros, y sobre nuestros hijos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 26, NULL, 'Entonces les soltó a Barrabás; y habiendo azotado a Jesús, le entregó para ser crucificado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 27, NULL, 'Entonces los soldados del gobernador llevaron a Jesús al pretorio, y reunieron alrededor de él a toda la compañía;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 28, NULL, 'y desnudándole, le echaron encima un manto de escarlata,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 29, NULL, 'y pusieron sobre su cabeza una corona tejida de espinas, y una caña en su mano derecha; e hincando la rodilla delante de él, le escarnecían, diciendo: ¡Salve, Rey de los judíos!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 30, NULL, 'Y escupiéndole, tomaban la caña y le golpeaban en la cabeza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 31, NULL, 'Después de haberle escarnecido, le quitaron el manto, le pusieron sus vestidos, y le llevaron para crucificarle.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 32, 'Crucifixión y muerte de Jesús', 'Cuando salían, hallaron a un hombre de Cirene que se llamaba Simón; a este obligaron a que llevase la cruz.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 33, NULL, 'Y cuando llegaron a un lugar llamado Gólgota, que significa: Lugar de la Calavera,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 34, NULL, 'le dieron a beber vinagre mezclado con hiel; pero después de haberlo probado, no quiso beberlo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 35, NULL, 'Cuando le hubieron crucificado, repartieron entre sí sus vestidos, echando suertes, para que se cumpliese lo dicho por el profeta: Partieron entre sí mis vestidos, y sobre mi ropa echaron suertes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 36, NULL, 'Y sentados le guardaban allí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 37, NULL, 'Y pusieron sobre su cabeza su causa escrita: ESTE ES JESÚS, EL REY DE LOS JUDÍOS.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 38, NULL, 'Entonces crucificaron con él a dos ladrones, uno a la derecha, y otro a la izquierda.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 39, NULL, 'Y los que pasaban le injuriaban, meneando la cabeza,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 40, NULL, 'y diciendo: Tú que derribas el templo, y en tres días lo reedificas, sálvate a ti mismo; si eres Hijo de Dios, desciende de la cruz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 41, NULL, 'De esta manera también los principales sacerdotes, escarneciéndole con los escribas y los fariseos y los ancianos, decían:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 42, NULL, 'A otros salvó, a sí mismo no se puede salvar; si es el Rey de Israel, descienda ahora de la cruz, y creeremos en él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 43, NULL, 'Confió en Dios; líbrele ahora si le quiere; porque ha dicho: Soy Hijo de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 44, NULL, 'Lo mismo le injuriaban también los ladrones que estaban crucificados con él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 45, NULL, 'Y desde la hora sexta hubo tinieblas sobre toda la tierra hasta la hora novena.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 46, NULL, 'Cerca de la hora novena, Jesús clamó a gran voz, diciendo: Elí, Elí, ¿lama sabactani? Esto es: Dios mío, Dios mío, ¿por qué me has desamparado?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 47, NULL, 'Algunos de los que estaban allí decían, al oírlo: A Elías llama este.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 48, NULL, 'Y al instante, corriendo uno de ellos, tomó una esponja, y la empapó de vinagre, y poniéndola en una caña, le dio a beber.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 49, NULL, 'Pero los otros decían: Deja, veamos si viene Elías a librarle.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 50, NULL, 'Mas Jesús, habiendo otra vez clamado a gran voz, entregó el espíritu.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 51, NULL, 'Y he aquí, el velo del templo se rasgó en dos, de arriba abajo; y la tierra tembló, y las rocas se partieron;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 52, NULL, 'y se abrieron los sepulcros, y muchos cuerpos de santos que habían dormido, se levantaron;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 53, NULL, 'y saliendo de los sepulcros, después de la resurrección de él, vinieron a la santa ciudad, y aparecieron a muchos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 54, NULL, 'El centurión, y los que estaban con él guardando a Jesús, visto el terremoto, y las cosas que habían sido hechas, temieron en gran manera, y dijeron: Verdaderamente este era Hijo de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 55, NULL, 'Estaban allí muchas mujeres mirando de lejos, las cuales habían seguido a Jesús desde Galilea, sirviéndole,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 56, NULL, 'entre las cuales estaban María Magdalena, María la madre de Jacobo y de José, y la madre de los hijos de Zebedeo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 57, 'Jesús es sepultado', 'Cuando llegó la noche, vino un hombre rico de Arimatea, llamado José, que también había sido discípulo de Jesús.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 58, NULL, 'Este fue a Pilato y pidió el cuerpo de Jesús. Entonces Pilato mandó que se le diese el cuerpo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 59, NULL, 'Y tomando José el cuerpo, lo envolvió en una sábana limpia,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 60, NULL, 'y lo puso en su sepulcro nuevo, que había labrado en la peña; y después de hacer rodar una gran piedra a la entrada del sepulcro, se fue.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 61, NULL, 'Y estaban allí María Magdalena, y la otra María, sentadas delante del sepulcro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 62, 'La guardia ante la tumba', 'Al día siguiente, que es después de la preparación, se reunieron los principales sacerdotes y los fariseos ante Pilato,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 63, NULL, 'diciendo: Señor, nos acordamos que aquel engañador dijo, viviendo aún: Después de tres días resucitaré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 64, NULL, 'Manda, pues, que se asegure el sepulcro hasta el tercer día, no sea que vengan sus discípulos de noche, y lo hurten, y digan al pueblo: Resucitó de entre los muertos. Y será el postrer error peor que el primero.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 65, NULL, 'Y Pilato les dijo: Ahí tenéis una guardia; id, aseguradlo como sabéis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 27, 66, NULL, 'Entonces ellos fueron y aseguraron el sepulcro, sellando la piedra y poniendo la guardia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 28, 1, 'La resurrección', 'Pasado el día de reposo, al amanecer del primer día de la semana, vinieron María Magdalena y la otra María, a ver el sepulcro.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 28, 2, NULL, 'Y hubo un gran terremoto; porque un ángel del Señor, descendiendo del cielo y llegando, removió la piedra, y se sentó sobre ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 28, 3, NULL, 'Su aspecto era como un relámpago, y su vestido blanco como la nieve.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 28, 4, NULL, 'Y de miedo de él los guardas temblaron y se quedaron como muertos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 28, 5, NULL, 'Mas el ángel, respondiendo, dijo a las mujeres: No temáis vosotras; porque yo sé que buscáis a Jesús, el que fue crucificado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 28, 6, NULL, 'No está aquí, pues ha resucitado, como dijo. Venid, ved el lugar donde fue puesto el Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 28, 7, NULL, 'E id pronto y decid a sus discípulos que ha resucitado de los muertos, y he aquí va delante de vosotros a Galilea; allí le veréis. He aquí, os lo he dicho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 28, 8, NULL, 'Entonces ellas, saliendo del sepulcro con temor y gran gozo, fueron corriendo a dar las nuevas a sus discípulos. Y mientras iban a dar las nuevas a los discípulos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 28, 9, NULL, 'he aquí, Jesús les salió al encuentro, diciendo: ¡Salve! Y ellas, acercándose, abrazaron sus pies, y le adoraron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 28, 10, NULL, 'Entonces Jesús les dijo: No temáis; id, dad las nuevas a mis hermanos, para que vayan a Galilea, y allí me verán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 28, 11, 'El informe de la guardia', 'Mientras ellas iban, he aquí unos de la guardia fueron a la ciudad, y dieron aviso a los principales sacerdotes de todas las cosas que habían acontecido.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 28, 12, NULL, 'Y reunidos con los ancianos, y habido consejo, dieron mucho dinero a los soldados,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 28, 13, NULL, 'diciendo: Decid vosotros: Sus discípulos vinieron de noche, y lo hurtaron, estando nosotros dormidos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 28, 14, NULL, 'Y si esto lo oyere el gobernador, nosotros le persuadiremos, y os pondremos a salvo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 28, 15, NULL, 'Y ellos, tomando el dinero, hicieron como se les había instruido. Este dicho se ha divulgado entre los judíos hasta el día de hoy.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 28, 16, 'La gran comisión', 'Pero los once discípulos se fueron a Galilea, al monte donde Jesús les había ordenado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 28, 17, NULL, 'Y cuando le vieron, le adoraron; pero algunos dudaban.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 28, 18, NULL, 'Y Jesús se acercó y les habló diciendo: Toda potestad me es dada en el cielo y en la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 28, 19, NULL, 'Por tanto, id, y haced discípulos a todas las naciones, bautizándolos en el nombre del Padre, y del Hijo, y del Espíritu Santo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Mt', 28, 20, NULL, 'enseñándoles que guarden todas las cosas que os he mandado; y he aquí yo estoy con vosotros todos los días, hasta el fin del mundo. Amén.', 0, 'spa', 'RVR1960', NULL);\n"
;

}