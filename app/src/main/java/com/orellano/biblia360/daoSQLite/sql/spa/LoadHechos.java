package com.orellano.biblia360.daoSQLite.sql.spa;

public final class LoadHechos {
  public LoadHechos() {}
  public static final String SQL_PARTE_1 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Hch', 1, 1, 'La promesa del Espíritu Santo', 'En el primer tratado, oh Teófilo, hablé acerca de todas las cosas que Jesús comenzó a hacer y a enseñar,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 1, 2, NULL, 'hasta el día en que fue recibido arriba, después de haber dado mandamientos por el Espíritu Santo a los apóstoles que había escogido;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 1, 3, NULL, 'a quienes también, después de haber padecido, se presentó vivo con muchas pruebas indubitables, apareciéndoseles durante cuarenta días y hablándoles acerca del reino de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 1, 4, NULL, 'Y estando juntos, les mandó que no se fueran de Jerusalén, sino que esperasen la promesa del Padre, la cual, les dijo, oísteis de mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 1, 5, NULL, 'Porque Juan ciertamente bautizó con agua, mas vosotros seréis bautizados con el Espíritu Santo dentro de no muchos días.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 1, 6, 'La ascensión', 'Entonces los que se habían reunido le preguntaron, diciendo: Señor, ¿restaurarás el reino a Israel en este tiempo?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 1, 7, NULL, 'Y les dijo: No os toca a vosotros saber los tiempos o las sazones, que el Padre puso en su sola potestad;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 1, 8, NULL, 'pero recibiréis poder, cuando haya venido sobre vosotros el Espíritu Santo, y me seréis testigos en Jerusalén, en toda Judea, en Samaria, y hasta lo último de la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 1, 9, NULL, 'Y habiendo dicho estas cosas, viéndolo ellos, fue alzado, y le recibió una nube que le ocultó de sus ojos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 1, 10, NULL, 'Y estando ellos con los ojos puestos en el cielo, entre tanto que él se iba, he aquí se pusieron junto a ellos dos varones con vestiduras blancas,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 1, 11, NULL, 'los cuales también les dijeron: Varones galileos, ¿por qué estáis mirando al cielo? Este mismo Jesús, que ha sido tomado de vosotros al cielo, así vendrá como le habéis visto ir al cielo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 1, 12, 'Elección del sucesor de Judas', 'Entonces volvieron a Jerusalén desde el monte que se llama del Olivar, el cual está cerca de Jerusalén, camino de un día de reposo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 1, 13, NULL, 'Y entrados, subieron al aposento alto, donde moraban Pedro y Jacobo, Juan, Andrés, Felipe, Tomás, Bartolomé, Mateo, Jacobo hijo de Alfeo, Simón el Zelote y Judas hermano de Jacobo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 1, 14, NULL, 'Todos estos perseveraban unánimes en oración y ruego, con las mujeres, y con María la madre de Jesús, y con sus hermanos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 1, 15, NULL, 'En aquellos días Pedro se levantó en medio de los hermanos (y los reunidos eran como ciento veinte en número), y dijo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 1, 16, NULL, 'Varones hermanos, era necesario que se cumpliese la Escritura en que el Espíritu Santo habló antes por boca de David acerca de Judas, que fue guía de los que prendieron a Jesús,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 1, 17, NULL, 'y era contado con nosotros, y tenía parte en este ministerio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 1, 18, NULL, 'Este, pues, con el salario de su iniquidad adquirió un campo, y cayendo de cabeza, se reventó por la mitad, y todas sus entrañas se derramaron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 1, 19, NULL, 'Y fue notorio a todos los habitantes de Jerusalén, de tal manera que aquel campo se llama en su propia lengua, Acéldama, que quiere decir, Campo de sangre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 1, 20, NULL, 'Porque está escrito en el libro de los Salmos: Sea hecha desierta su habitación, Y no haya quien more en ella; y: Tome otro su oficio.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 1, 21, NULL, 'Es necesario, pues, que de estos hombres que han estado juntos con nosotros todo el tiempo que el Señor Jesús entraba y salía entre nosotros,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 1, 22, NULL, 'comenzando desde el bautismo de Juan hasta el día en que de entre nosotros fue recibido arriba, uno sea hecho testigo con nosotros, de su resurrección.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 1, 23, NULL, 'Y señalaron a dos: a José, llamado Barsabás, que tenía por sobrenombre Justo, y a Matías.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 1, 24, NULL, 'Y orando, dijeron: Tú, Señor, que conoces los corazones de todos, muestra cuál de estos dos has escogido,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 1, 25, NULL, 'para que tome la parte de este ministerio y apostolado, de que cayó Judas por transgresión, para irse a su propio lugar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 1, 26, NULL, 'Y les echaron suertes, y la suerte cayó sobre Matías; y fue contado con los once apóstoles.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 1, 'La venida del Espíritu Santo', 'Cuando llegó el día de Pentecostés, estaban todos unánimes juntos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 2, NULL, 'Y de repente vino del cielo un estruendo como de un viento recio que soplaba, el cual llenó toda la casa donde estaban sentados;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 3, NULL, 'y se les aparecieron lenguas repartidas, como de fuego, asentándose sobre cada uno de ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 4, NULL, 'Y fueron todos llenos del Espíritu Santo, y comenzaron a hablar en otras lenguas, según el Espíritu les daba que hablasen.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 5, NULL, 'Moraban entonces en Jerusalén judíos, varones piadosos, de todas las naciones bajo el cielo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 6, NULL, 'Y hecho este estruendo, se juntó la multitud; y estaban confusos, porque cada uno les oía hablar en su propia lengua.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 7, NULL, 'Y estaban atónitos y maravillados, diciendo: Mirad, ¿no son galileos todos estos que hablan?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 8, NULL, '¿Cómo, pues, les oímos nosotros hablar cada uno en nuestra lengua en la que hemos nacido?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 9, NULL, 'Partos, medos, elamitas, y los que habitamos en Mesopotamia, en Judea, en Capadocia, en el Ponto y en Asia,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 10, NULL, 'en Frigia y Panfilia, en Egipto y en las regiones de África más allá de Cirene, y romanos aquí residentes, tanto judíos como prosélitos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 11, NULL, 'cretenses y árabes, les oímos hablar en nuestras lenguas las maravillas de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 12, NULL, 'Y estaban todos atónitos y perplejos, diciéndose unos a otros: ¿Qué quiere decir esto?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 13, NULL, 'Mas otros, burlándose, decían: Están llenos de mosto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 14, 'Primer discurso de Pedro', 'Entonces Pedro, poniéndose en pie con los once, alzó la voz y les habló diciendo: Varones judíos, y todos los que habitáis en Jerusalén, esto os sea notorio, y oíd mis palabras.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 15, NULL, 'Porque estos no están ebrios, como vosotros suponéis, puesto que es la hora tercera del día.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 16, NULL, 'Mas esto es lo dicho por el profeta Joel:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 17, NULL, 'Y en los postreros días, dice Dios, Derramaré de mi Espíritu sobre toda carne, Y vuestros hijos y vuestras hijas profetizarán; Vuestros jóvenes verán visiones, Y vuestros ancianos soñarán sueños;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 18, NULL, 'Y de cierto sobre mis siervos y sobre mis siervas en aquellos días Derramaré de mi Espíritu, y profetizarán.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 19, NULL, 'Y daré prodigios arriba en el cielo, Y señales abajo en la tierra, Sangre y fuego y vapor de humo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 20, NULL, 'El sol se convertirá en tinieblas, Y la luna en sangre, Antes que venga el día del Señor, Grande y manifiesto;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 21, NULL, 'Y todo aquel que invocare el nombre del Señor, será salvo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 22, NULL, 'Varones israelitas, oíd estas palabras: Jesús nazareno, varón aprobado por Dios entre vosotros con las maravillas, prodigios y señales que Dios hizo entre vosotros por medio de él, como vosotros mismos sabéis;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 23, NULL, 'a este, entregado por el determinado consejo y anticipado conocimiento de Dios, prendisteis y matasteis por manos de inicuos, crucificándole;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 24, NULL, 'al cual Dios levantó, sueltos los dolores de la muerte, por cuanto era imposible que fuese retenido por ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 25, NULL, 'Porque David dice de él: Veía al Señor siempre delante de mí; Porque está a mi diestra, no seré conmovido.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 26, NULL, 'Por lo cual mi corazón se alegró, y se gozó mi lengua, Y aun mi carne descansará en esperanza;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 27, NULL, 'Porque no dejarás mi alma en el Hades, Ni permitirás que tu Santo vea corrupción.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 28, NULL, 'Me hiciste conocer los caminos de la vida; Me llenarás de gozo con tu presencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 29, NULL, 'Varones hermanos, se os puede decir libremente del patriarca David, que murió y fue sepultado, y su sepulcro está con nosotros hasta el día de hoy.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 30, NULL, 'Pero siendo profeta, y sabiendo que con juramento Dios le había jurado que de su descendencia, en cuanto a la carne, levantaría al Cristo para que se sentase en su trono,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 31, NULL, 'viéndolo antes, habló de la resurrección de Cristo, que su alma no fue dejada en el Hades, ni su carne vio corrupción.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 32, NULL, 'A este Jesús resucitó Dios, de lo cual todos nosotros somos testigos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 33, NULL, 'Así que, exaltado por la diestra de Dios, y habiendo recibido del Padre la promesa del Espíritu Santo, ha derramado esto que vosotros veis y oís.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 34, NULL, 'Porque David no subió a los cielos; pero él mismo dice: Dijo el Señor a mi Señor: Siéntate a mi diestra,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 35, NULL, 'Hasta que ponga a tus enemigos por estrado de tus pies.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 36, NULL, 'Sepa, pues, ciertísimamente toda la casa de Israel, que a este Jesús a quien vosotros crucificasteis, Dios le ha hecho Señor y Cristo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 37, NULL, 'Al oír esto, se compungieron de corazón, y dijeron a Pedro y a los otros apóstoles: Varones hermanos, ¿qué haremos?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 38, NULL, 'Pedro les dijo: Arrepentíos, y bautícese cada uno de vosotros en el nombre de Jesucristo para perdón de los pecados; y recibiréis el don del Espíritu Santo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 39, NULL, 'Porque para vosotros es la promesa, y para vuestros hijos, y para todos los que están lejos; para cuantos el Señor nuestro Dios llamare.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 40, NULL, 'Y con otras muchas palabras testificaba y les exhortaba, diciendo: Sed salvos de esta perversa generación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 41, NULL, 'Así que, los que recibieron su palabra fueron bautizados; y se añadieron aquel día como tres mil personas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 42, NULL, 'Y perseveraban en la doctrina de los apóstoles, en la comunión unos con otros, en el partimiento del pan y en las oraciones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 43, 'La vida de los primeros cristianos', 'Y sobrevino temor a toda persona; y muchas maravillas y señales eran hechas por los apóstoles.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 44, NULL, 'Todos los que habían creído estaban juntos, y tenían en común todas las cosas;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 45, NULL, 'y vendían sus propiedades y sus bienes, y lo repartían a todos según la necesidad de cada uno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 46, NULL, 'Y perseverando unánimes cada día en el templo, y partiendo el pan en las casas, comían juntos con alegría y sencillez de corazón,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 2, 47, NULL, 'alabando a Dios, y teniendo favor con todo el pueblo. Y el Señor añadía cada día a la iglesia los que habían de ser salvos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 3, 1, 'Curación de un cojo', 'Pedro y Juan subían juntos al templo a la hora novena, la de la oración.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 3, 2, NULL, 'Y era traído un hombre cojo de nacimiento, a quien ponían cada día a la puerta del templo que se llama la Hermosa, para que pidiese limosna de los que entraban en el templo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 3, 3, NULL, 'Este, cuando vio a Pedro y a Juan que iban a entrar en el templo, les rogaba que le diesen limosna.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 3, 4, NULL, 'Pedro, con Juan, fijando en él los ojos, le dijo: Míranos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 3, 5, NULL, 'Entonces él les estuvo atento, esperando recibir de ellos algo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 3, 6, NULL, 'Mas Pedro dijo: No tengo plata ni oro, pero lo que tengo te doy; en el nombre de Jesucristo de Nazaret, levántate y anda.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 3, 7, NULL, 'Y tomándole por la mano derecha le levantó; y al momento se le afirmaron los pies y tobillos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 3, 8, NULL, 'y saltando, se puso en pie y anduvo; y entró con ellos en el templo, andando, y saltando, y alabando a Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 3, 9, NULL, 'Y todo el pueblo le vio andar y alabar a Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 3, 10, NULL, 'Y le reconocían que era el que se sentaba a pedir limosna a la puerta del templo, la Hermosa; y se llenaron de asombro y espanto por lo que le había sucedido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 3, 11, 'Discurso de Pedro en el pórtico de Salomón', 'Y teniendo asidos a Pedro y a Juan el cojo que había sido sanado, todo el pueblo, atónito, concurrió a ellos al pórtico que se llama de Salomón.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 3, 12, NULL, 'Viendo esto Pedro, respondió al pueblo: Varones israelitas, ¿por qué os maravilláis de esto?, ¿o por qué ponéis los ojos en nosotros, como si por nuestro poder o piedad hubiésemos hecho andar a este?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 3, 13, NULL, 'El Dios de Abraham, de Isaac y de Jacob, el Dios de nuestros padres, ha glorificado a su Hijo Jesús, a quien vosotros entregasteis y negasteis delante de Pilato, cuando este había resuelto ponerle en libertad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 3, 14, NULL, 'Mas vosotros negasteis al Santo y al Justo, y pedisteis que se os diese un homicida,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 3, 15, NULL, 'y matasteis al Autor de la vida, a quien Dios ha resucitado de los muertos, de lo cual nosotros somos testigos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 3, 16, NULL, 'Y por la fe en su nombre, a este, que vosotros veis y conocéis, le ha confirmado su nombre; y la fe que es por él ha dado a este esta completa sanidad en presencia de todos vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 3, 17, NULL, 'Mas ahora, hermanos, sé que por ignorancia lo habéis hecho, como también vuestros gobernantes.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 3, 18, NULL, 'Pero Dios ha cumplido así lo que había antes anunciado por boca de todos sus profetas, que su Cristo había de padecer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 3, 19, NULL, 'Así que, arrepentíos y convertíos, para que sean borrados vuestros pecados; para que vengan de la presencia del Señor tiempos de refrigerio,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 3, 20, NULL, 'y él envíe a Jesucristo, que os fue antes anunciado;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 3, 21, NULL, 'a quien de cierto es necesario que el cielo reciba hasta los tiempos de la restauración de todas las cosas, de que habló Dios por boca de sus santos profetas que han sido desde tiempo antiguo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 3, 22, NULL, 'Porque Moisés dijo a los padres: El Señor vuestro Dios os levantará profeta de entre vuestros hermanos, como a mí; a él oiréis en todas las cosas que os hable;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 3, 23, NULL, 'y toda alma que no oiga a aquel profeta, será desarraigada del pueblo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 3, 24, NULL, 'Y todos los profetas desde Samuel en adelante, cuantos han hablado, también han anunciado estos días.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 3, 25, NULL, 'Vosotros sois los hijos de los profetas, y del pacto que Dios hizo con nuestros padres, diciendo a Abraham: En tu simiente serán benditas todas las familias de la tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 3, 26, NULL, 'A vosotros primeramente, Dios, habiendo levantado a su Hijo, lo envió para que os bendijese, a fin de que cada uno se convierta de su maldad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 4, 1, 'Pedro y Juan ante el concilio', 'Hablando ellos al pueblo, vinieron sobre ellos los sacerdotes con el jefe de la guardia del templo, y los saduceos,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 4, 2, NULL, 'resentidos de que enseñasen al pueblo, y anunciasen en Jesús la resurrección de entre los muertos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 4, 3, NULL, 'Y les echaron mano, y los pusieron en la cárcel hasta el día siguiente, porque era ya tarde.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 4, 4, NULL, 'Pero muchos de los que habían oído la palabra, creyeron; y el número de los varones era como cinco mil.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 4, 5, NULL, 'Aconteció al día siguiente, que se reunieron en Jerusalén los gobernantes, los ancianos y los escribas,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 4, 6, NULL, 'y el sumo sacerdote Anás, y Caifás y Juan y Alejandro, y todos los que eran de la familia de los sumos sacerdotes;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 4, 7, NULL, 'y poniéndoles en medio, les preguntaron: ¿Con qué potestad, o en qué nombre, habéis hecho vosotros esto?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 4, 8, NULL, 'Entonces Pedro, lleno del Espíritu Santo, les dijo: Gobernantes del pueblo, y ancianos de Israel:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 4, 9, NULL, 'Puesto que hoy se nos interroga acerca del beneficio hecho a un hombre enfermo, de qué manera este haya sido sanado,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 4, 10, NULL, 'sea notorio a todos vosotros, y a todo el pueblo de Israel, que en el nombre de Jesucristo de Nazaret, a quien vosotros crucificasteis y a quien Dios resucitó de los muertos, por él este hombre está en vuestra presencia sano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 4, 11, NULL, 'Este Jesús es la piedra reprobada por vosotros los edificadores, la cual ha venido a ser cabeza del ángulo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 4, 12, NULL, 'Y en ningún otro hay salvación; porque no hay otro nombre bajo el cielo, dado a los hombres, en que podamos ser salvos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 4, 13, NULL, 'Entonces viendo el denuedo de Pedro y de Juan, y sabiendo que eran hombres sin letras y del vulgo, se maravillaban; y les reconocían que habían estado con Jesús.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 4, 14, NULL, 'Y viendo al hombre que había sido sanado, que estaba en pie con ellos, no podían decir nada en contra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 4, 15, NULL, 'Entonces les ordenaron que saliesen del concilio; y conferenciaban entre sí,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 4, 16, NULL, 'diciendo: ¿Qué haremos con estos hombres? Porque de cierto, señal manifiesta ha sido hecha por ellos, notoria a todos los que moran en Jerusalén, y no lo podemos negar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 4, 17, NULL, 'Sin embargo, para que no se divulgue más entre el pueblo, amenacémosles para que no hablen de aquí en adelante a hombre alguno en este nombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 4, 18, NULL, 'Y llamándolos, les intimaron que en ninguna manera hablasen ni enseñasen en el nombre de Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 4, 19, NULL, 'Mas Pedro y Juan respondieron diciéndoles: Juzgad si es justo delante de Dios obedecer a vosotros antes que a Dios;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 4, 20, NULL, 'porque no podemos dejar de decir lo que hemos visto y oído.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 4, 21, NULL, 'Ellos entonces les amenazaron y les soltaron, no hallando ningún modo de castigarles, por causa del pueblo; porque todos glorificaban a Dios por lo que se había hecho,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 4, 22, NULL, 'ya que el hombre en quien se había hecho este milagro de sanidad, tenía más de cuarenta años.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 4, 23, 'Los creyentes piden confianza y valor', 'Y puestos en libertad, vinieron a los suyos y contaron todo lo que los principales sacerdotes y los ancianos les habían dicho.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 4, 24, NULL, 'Y ellos, habiéndolo oído, alzaron unánimes la voz a Dios, y dijeron: Soberano Señor, tú eres el Dios que hiciste el cielo y la tierra, el mar y todo lo que en ellos hay;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 4, 25, NULL, 'que por boca de David tu siervo dijiste: ¿Por qué se amotinan las gentes, Y los pueblos piensan cosas vanas?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 4, 26, NULL, 'Se reunieron los reyes de la tierra, Y los príncipes se juntaron en uno Contra el Señor, y contra su Cristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 4, 27, NULL, 'Porque verdaderamente se unieron en esta ciudad contra tu santo Hijo Jesús, a quien ungiste, Herodes y Poncio Pilato, con los gentiles y el pueblo de Israel,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 4, 28, NULL, 'para hacer cuanto tu mano y tu consejo habían antes determinado que sucediera.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 4, 29, NULL, 'Y ahora, Señor, mira sus amenazas, y concede a tus siervos que con todo denuedo hablen tu palabra,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 4, 30, NULL, 'mientras extiendes tu mano para que se hagan sanidades y señales y prodigios mediante el nombre de tu santo Hijo Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 4, 31, NULL, 'Cuando hubieron orado, el lugar en que estaban congregados tembló; y todos fueron llenos del Espíritu Santo, y hablaban con denuedo la palabra de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 4, 32, 'Todas las cosas en común', 'Y la multitud de los que habían creído era de un corazón y un alma; y ninguno decía ser suyo propio nada de lo que poseía, sino que tenían todas las cosas en común.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 4, 33, NULL, 'Y con gran poder los apóstoles daban testimonio de la resurrección del Señor Jesús, y abundante gracia era sobre todos ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 4, 34, NULL, 'Así que no había entre ellos ningún necesitado; porque todos los que poseían heredades o casas, las vendían, y traían el precio de lo vendido,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 4, 35, NULL, 'y lo ponían a los pies de los apóstoles; y se repartía a cada uno según su necesidad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 4, 36, NULL, 'Entonces José, a quien los apóstoles pusieron por sobrenombre Bernabé (que traducido es, Hijo de consolación), levita, natural de Chipre,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 4, 37, NULL, 'como tenía una heredad, la vendió y trajo el precio y lo puso a los pies de los apóstoles.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 1, 'Ananías y Safira', 'Pero cierto hombre llamado Ananías, con Safira su mujer, vendió una heredad,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 2, NULL, 'y sustrajo del precio, sabiéndolo también su mujer; y trayendo sólo una parte, la puso a los pies de los apóstoles.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 3, NULL, 'Y dijo Pedro: Ananías, ¿por qué llenó Satanás tu corazón para que mintieses al Espíritu Santo, y sustrajeses del precio de la heredad?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 4, NULL, 'Reteniéndola, ¿no se te quedaba a ti? y vendida, ¿no estaba en tu poder? ¿Por qué pusiste esto en tu corazón? No has mentido a los hombres, sino a Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 5, NULL, 'Al oír Ananías estas palabras, cayó y expiró. Y vino un gran temor sobre todos los que lo oyeron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 6, NULL, 'Y levantándose los jóvenes, lo envolvieron, y sacándolo, lo sepultaron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 7, NULL, 'Pasado un lapso como de tres horas, sucedió que entró su mujer, no sabiendo lo que había acontecido.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 8, NULL, 'Entonces Pedro le dijo: Dime, ¿vendisteis en tanto la heredad? Y ella dijo: Sí, en tanto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 9, NULL, 'Y Pedro le dijo: ¿Por qué convinisteis en tentar al Espíritu del Señor? He aquí a la puerta los pies de los que han sepultado a tu marido, y te sacarán a ti.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 10, NULL, 'Al instante ella cayó a los pies de él, y expiró; y cuando entraron los jóvenes, la hallaron muerta; y la sacaron, y la sepultaron junto a su marido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 11, NULL, 'Y vino gran temor sobre toda la iglesia, y sobre todos los que oyeron estas cosas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 12, 'Muchas señales y maravillas', 'Y por la mano de los apóstoles se hacían muchas señales y prodigios en el pueblo; y estaban todos unánimes en el pórtico de Salomón.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 13, NULL, 'De los demás, ninguno se atrevía a juntarse con ellos; mas el pueblo los alababa grandemente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 14, NULL, 'Y los que creían en el Señor aumentaban más, gran número así de hombres como de mujeres;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 15, NULL, 'tanto que sacaban los enfermos a las calles, y los ponían en camas y lechos, para que al pasar Pedro, a lo menos su sombra cayese sobre alguno de ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 16, NULL, 'Y aun de las ciudades vecinas muchos venían a Jerusalén, trayendo enfermos y atormentados de espíritus inmundos; y todos eran sanados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 17, 'Pedro y Juan son perseguidos', 'Entonces levantándose el sumo sacerdote y todos los que estaban con él, esto es, la secta de los saduceos, se llenaron de celos;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 18, NULL, 'y echaron mano a los apóstoles y los pusieron en la cárcel pública.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 19, NULL, 'Mas un ángel del Señor, abriendo de noche las puertas de la cárcel y sacándolos, dijo:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 20, NULL, 'Id, y puestos en pie en el templo, anunciad al pueblo todas las palabras de esta vida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 21, NULL, 'Habiendo oído esto, entraron de mañana en el templo, y enseñaban. Entre tanto, vinieron el sumo sacerdote y los que estaban con él, y convocaron al concilio y a todos los ancianos de los hijos de Israel, y enviaron a la cárcel para que fuesen traídos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 22, NULL, 'Pero cuando llegaron los alguaciles, no los hallaron en la cárcel; entonces volvieron y dieron aviso,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 23, NULL, 'diciendo: Por cierto, la cárcel hemos hallado cerrada con toda seguridad, y los guardas afuera de pie ante las puertas; mas cuando abrimos, a nadie hallamos dentro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 24, NULL, 'Cuando oyeron estas palabras el sumo sacerdote y el jefe de la guardia del templo y los principales sacerdotes, dudaban en qué vendría a parar aquello.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 25, NULL, 'Pero viniendo uno, les dio esta noticia: He aquí, los varones que pusisteis en la cárcel están en el templo, y enseñan al pueblo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 26, NULL, 'Entonces fue el jefe de la guardia con los alguaciles, y los trajo sin violencia, porque temían ser apedreados por el pueblo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 27, NULL, 'Cuando los trajeron, los presentaron en el concilio, y el sumo sacerdote les preguntó,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 28, NULL, 'diciendo: ¿No os mandamos estrictamente que no enseñaseis en ese nombre? Y ahora habéis llenado a Jerusalén de vuestra doctrina, y queréis echar sobre nosotros la sangre de ese hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 29, NULL, 'Respondiendo Pedro y los apóstoles, dijeron: Es necesario obedecer a Dios antes que a los hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 30, NULL, 'El Dios de nuestros padres levantó a Jesús, a quien vosotros matasteis colgándole en un madero.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 31, NULL, 'A este, Dios ha exaltado con su diestra por Príncipe y Salvador, para dar a Israel arrepentimiento y perdón de pecados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 32, NULL, 'Y nosotros somos testigos suyos de estas cosas, y también el Espíritu Santo, el cual ha dado Dios a los que le obedecen.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 33, NULL, 'Ellos, oyendo esto, se enfurecían y querían matarlos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 34, NULL, 'Entonces levantándose en el concilio un fariseo llamado Gamaliel, doctor de la ley, venerado de todo el pueblo, mandó que sacasen fuera por un momento a los apóstoles,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 35, NULL, 'y luego dijo: Varones israelitas, mirad por vosotros lo que vais a hacer respecto a estos hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 36, NULL, 'Porque antes de estos días se levantó Teudas, diciendo que era alguien. A este se unió un número como de cuatrocientos hombres; pero él fue muerto, y todos los que le obedecían fueron dispersados y reducidos a nada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 37, NULL, 'Después de este, se levantó Judas el galileo, en los días del censo, y llevó en pos de sí a mucho pueblo. Pereció también él, y todos los que le obedecían fueron dispersados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 38, NULL, 'Y ahora os digo: Apartaos de estos hombres, y dejadlos; porque si este consejo o esta obra es de los hombres, se desvanecerá;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 39, NULL, 'mas si es de Dios, no la podréis destruir; no seáis tal vez hallados luchando contra Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 40, NULL, 'Y convinieron con él; y llamando a los apóstoles, después de azotarlos, les intimaron que no hablasen en el nombre de Jesús, y los pusieron en libertad.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 41, NULL, 'Y ellos salieron de la presencia del concilio, gozosos de haber sido tenidos por dignos de padecer afrenta por causa del Nombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 5, 42, NULL, 'Y todos los días, en el templo y por las casas, no cesaban de enseñar y predicar a Jesucristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 6, 1, 'Elección de siete diáconos', 'En aquellos días, como creciera el número de los discípulos, hubo murmuración de los griegos contra los hebreos, de que las viudas de aquellos eran desatendidas en la distribución diaria.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 6, 2, NULL, 'Entonces los doce convocaron a la multitud de los discípulos, y dijeron: No es justo que nosotros dejemos la palabra de Dios, para servir a las mesas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 6, 3, NULL, 'Buscad, pues, hermanos, de entre vosotros a siete varones de buen testimonio, llenos del Espíritu Santo y de sabiduría, a quienes encarguemos de este trabajo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 6, 4, NULL, 'Y nosotros persistiremos en la oración y en el ministerio de la palabra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 6, 5, NULL, 'Agradó la propuesta a toda la multitud; y eligieron a Esteban, varón lleno de fe y del Espíritu Santo, a Felipe, a Prócoro, a Nicanor, a Timón, a Parmenas, y a Nicolás prosélito de Antioquía;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 6, 6, NULL, 'a los cuales presentaron ante los apóstoles, quienes, orando, les impusieron las manos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 6, 7, NULL, 'Y crecía la palabra del Señor, y el número de los discípulos se multiplicaba grandemente en Jerusalén; también muchos de los sacerdotes obedecían a la fe.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 6, 8, 'Arresto de Esteban', 'Y Esteban, lleno de gracia y de poder, hacía grandes prodigios y señales entre el pueblo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 6, 9, NULL, 'Entonces se levantaron unos de la sinagoga llamada de los libertos, y de los de Cirene, de Alejandría, de Cilicia y de Asia, disputando con Esteban.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 6, 10, NULL, 'Pero no podían resistir a la sabiduría y al Espíritu con que hablaba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 6, 11, NULL, 'Entonces sobornaron a unos para que dijesen que le habían oído hablar palabras blasfemas contra Moisés y contra Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 6, 12, NULL, 'Y soliviantaron al pueblo, a los ancianos y a los escribas; y arremetiendo, le arrebataron, y le trajeron al concilio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 6, 13, NULL, 'Y pusieron testigos falsos que decían: Este hombre no cesa de hablar palabras blasfemas contra este lugar santo y contra la ley;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 6, 14, NULL, 'pues le hemos oído decir que ese Jesús de Nazaret destruirá este lugar, y cambiará las costumbres que nos dio Moisés.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 6, 15, NULL, 'Entonces todos los que estaban sentados en el concilio, al fijar los ojos en él, vieron su rostro como el rostro de un ángel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 1, 'Defensa y muerte de Esteban', 'El sumo sacerdote dijo entonces: ¿Es esto así?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 2, NULL, 'Y él dijo: Varones hermanos y padres, oíd: El Dios de la gloria apareció a nuestro padre Abraham, estando en Mesopotamia, antes que morase en Harán,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 3, NULL, 'y le dijo: Sal de tu tierra y de tu parentela, y ven a la tierra que yo te mostraré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 4, NULL, 'Entonces salió de la tierra de los caldeos y habitó en Harán; y de allí, muerto su padre, Dios le trasladó a esta tierra, en la cual vosotros habitáis ahora.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 5, NULL, 'Y no le dio herencia en ella, ni aun para asentar un pie; pero le prometió que se la daría en posesión, y a su descendencia después de él, cuando él aún no tenía hijo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 6, NULL, 'Y le dijo Dios así: Que su descendencia sería extranjera en tierra ajena, y que los reducirían a servidumbre y los maltratarían, por cuatrocientos años.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 7, NULL, 'Mas yo juzgaré, dijo Dios, a la nación de la cual serán siervos; y después de esto saldrán y me servirán en este lugar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 8, NULL, 'Y le dio el pacto de la circuncisión; y así Abraham engendró a Isaac, y le circuncidó al octavo día; e Isaac a Jacob, y Jacob a los doce patriarcas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 9, NULL, 'Los patriarcas, movidos por envidia, vendieron a José para Egipto; pero Dios estaba con él,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 10, NULL, 'y le libró de todas sus tribulaciones, y le dio gracia y sabiduría delante de Faraón rey de Egipto, el cual lo puso por gobernador sobre Egipto y sobre toda su casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 11, NULL, 'Vino entonces hambre en toda la tierra de Egipto y de Canaán, y grande tribulación; y nuestros padres no hallaban alimentos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 12, NULL, 'Cuando oyó Jacob que había trigo en Egipto, envió a nuestros padres la primera vez.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 13, NULL, 'Y en la segunda, José se dio a conocer a sus hermanos, y fue manifestado a Faraón el linaje de José.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 14, NULL, 'Y enviando José, hizo venir a su padre Jacob, y a toda su parentela, en número de setenta y cinco personas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 15, NULL, 'Así descendió Jacob a Egipto, donde murió él, y también nuestros padres;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 16, NULL, 'los cuales fueron trasladados a Siquem, y puestos en el sepulcro que a precio de dinero compró Abraham de los hijos de Hamor en Siquem.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 17, NULL, 'Pero cuando se acercaba el tiempo de la promesa, que Dios había jurado a Abraham, el pueblo creció y se multiplicó en Egipto,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 18, NULL, 'hasta que se levantó en Egipto otro rey que no conocía a José.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 19, NULL, 'Este rey, usando de astucia con nuestro pueblo, maltrató a nuestros padres, a fin de que expusiesen a la muerte a sus niños, para que no se propagasen.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 20, NULL, 'En aquel mismo tiempo nació Moisés, y fue agradable a Dios; y fue criado tres meses en casa de su padre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 21, NULL, 'Pero siendo expuesto a la muerte, la hija de Faraón le recogió y le crio como a hijo suyo.(AA)', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 22, NULL, 'Y fue enseñado Moisés en toda la sabiduría de los egipcios; y era poderoso en sus palabras y obras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 23, NULL, 'Cuando hubo cumplido la edad de cuarenta años, le vino al corazón el visitar a sus hermanos, los hijos de Israel.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 24, NULL, 'Y al ver a uno que era maltratado, lo defendió, e hiriendo al egipcio, vengó al oprimido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 25, NULL, 'Pero él pensaba que sus hermanos comprendían que Dios les daría libertad por mano suya; mas ellos no lo habían entendido así.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 26, NULL, 'Y al día siguiente, se presentó a unos de ellos que reñían, y los ponía en paz, diciendo: Varones, hermanos sois, ¿por qué os maltratáis el uno al otro?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 27, NULL, 'Entonces el que maltrataba a su prójimo le rechazó, diciendo: ¿Quién te ha puesto por gobernante y juez sobre nosotros?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 28, NULL, '¿Quieres tú matarme, como mataste ayer al egipcio?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 29, NULL, 'Al oír esta palabra, Moisés huyó, y vivió como extranjero en tierra de Madián,(AB) donde engendró dos hijos.(AC)', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 30, NULL, 'Pasados cuarenta años, un ángel se le apareció en el desierto del monte Sinaí, en la llama de fuego de una zarza.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 31, NULL, 'Entonces Moisés, mirando, se maravilló de la visión; y acercándose para observar, vino a él la voz del Señor:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 32, NULL, 'Yo soy el Dios de tus padres, el Dios de Abraham, el Dios de Isaac, y el Dios de Jacob. Y Moisés, temblando, no se atrevía a mirar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 33, NULL, 'Y le dijo el Señor: Quita el calzado de tus pies, porque el lugar en que estás es tierra santa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 34, NULL, 'Ciertamente he visto la aflicción de mi pueblo que está en Egipto, y he oído su gemido, y he descendido para librarlos. Ahora, pues, ven, te enviaré a Egipto.(AD)', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 35, NULL, 'A este Moisés, a quien habían rechazado, diciendo: ¿Quién te ha puesto por gobernante y juez?, a este lo envió Dios como gobernante y libertador por mano del ángel que se le apareció en la zarza.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 36, NULL, 'Este los sacó, habiendo hecho prodigios y señales en tierra de Egipto,(AE) y en el Mar Rojo,(AF) y en el desierto por cuarenta años.(AG)', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 37, NULL, 'Este Moisés es el que dijo a los hijos de Israel: Profeta os levantará el Señor vuestro Dios de entre vuestros hermanos, como a mí;(AH) a él oiréis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 38, NULL, 'Este es aquel Moisés que estuvo en la congregación en el desierto con el ángel que le hablaba en el monte Sinaí,(AI) y con nuestros padres, y que recibió palabras de vida que darnos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 39, NULL, 'al cual nuestros padres no quisieron obedecer, sino que le desecharon, y en sus corazones se volvieron a Egipto,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 40, NULL, 'cuando dijeron a Aarón: Haznos dioses que vayan delante de nosotros; porque a este Moisés, que nos sacó de la tierra de Egipto, no sabemos qué le haya acontecido.(AJ)', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 41, NULL, 'Entonces hicieron un becerro, y ofrecieron sacrificio al ídolo, y en las obras de sus manos se regocijaron.(AK)', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 42, NULL, 'Y Dios se apartó, y los entregó a que rindiesen culto al ejército del cielo; como está escrito en el libro de los profetas: ¿Acaso me ofrecisteis víctimas y sacrificios En el desierto por cuarenta años, casa de Israel?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 43, NULL, 'Antes bien llevasteis el tabernáculo de Moloc, Y la estrella de vuestro dios Renfán, Figuras que os hicisteis para adorarlas. Os transportaré, pues, más allá de Babilonia.(AL)', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 44, NULL, 'Tuvieron nuestros padres el tabernáculo del testimonio en el desierto, como había ordenado Dios cuando dijo a Moisés que lo hiciese conforme al modelo que había visto.(AM)', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 45, NULL, 'El cual, recibido a su vez por nuestros padres, lo introdujeron con Josué(AN) al tomar posesión de la tierra de los gentiles, a los cuales Dios arrojó de la presencia de nuestros padres, hasta los días de David.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 46, NULL, 'Este halló gracia delante de Dios, y pidió proveer tabernáculo para el Dios de Jacob.(AO)', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 47, NULL, 'Mas Salomón le edificó casa;(AP)', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 48, NULL, 'si bien el Altísimo no habita en templos hechos de mano, como dice el profeta:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 49, NULL, 'El cielo es mi trono, Y la tierra el estrado de mis pies. ¿Qué casa me edificaréis? dice el Señor; ¿O cuál es el lugar de mi reposo?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 50, NULL, '¿No hizo mi mano todas estas cosas?(AQ)', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 51, NULL, '¡Duros de cerviz, e incircuncisos de corazón y de oídos! Vosotros resistís siempre al Espíritu Santo; como vuestros padres, así también vosotros.(AR)', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 52, NULL, '¿A cuál de los profetas no persiguieron vuestros padres? Y mataron a los que anunciaron de antemano la venida del Justo, de quien vosotros ahora habéis sido entregadores y matadores;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 53, NULL, 'vosotros que recibisteis la ley por disposición de ángeles, y no la guardasteis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 54, NULL, 'Oyendo estas cosas, se enfurecían en sus corazones, y crujían los dientes contra él.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 55, NULL, 'Pero Esteban, lleno del Espíritu Santo, puestos los ojos en el cielo, vio la gloria de Dios, y a Jesús que estaba a la diestra de Dios,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 56, NULL, 'y dijo: He aquí, veo los cielos abiertos, y al Hijo del Hombre que está a la diestra de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 57, NULL, 'Entonces ellos, dando grandes voces, se taparon los oídos, y arremetieron a una contra él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 58, NULL, 'Y echándole fuera de la ciudad, le apedrearon; y los testigos pusieron sus ropas a los pies de un joven que se llamaba Saulo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 59, NULL, 'Y apedreaban a Esteban, mientras él invocaba y decía: Señor Jesús, recibe mi espíritu.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 7, 60, NULL, 'Y puesto de rodillas, clamó a gran voz: Señor, no les tomes en cuenta este pecado. Y habiendo dicho esto, durmió.', 0, 'spa', 'RVR1960', NULL);\n"
;

  public static final String SQL_PARTE_2 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Hch', 8, 1, 'Saulo persigue a la iglesia', 'Y Saulo consentía en su muerte. En aquel día hubo una gran persecución contra la iglesia que estaba en Jerusalén; y todos fueron esparcidos por las tierras de Judea y de Samaria, salvo los apóstoles.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 8, 2, NULL, 'Y hombres piadosos llevaron a enterrar a Esteban, e hicieron gran llanto sobre él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 8, 3, NULL, 'Y Saulo asolaba la iglesia, y entrando casa por casa, arrastraba a hombres y a mujeres, y los entregaba en la cárcel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 8, 4, 'Predicación del evangelio en Samaria', 'Pero los que fueron esparcidos iban por todas partes anunciando el evangelio.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 8, 5, NULL, 'Entonces Felipe, descendiendo a la ciudad de Samaria, les predicaba a Cristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 8, 6, NULL, 'Y la gente, unánime, escuchaba atentamente las cosas que decía Felipe, oyendo y viendo las señales que hacía.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 8, 7, NULL, 'Porque de muchos que tenían espíritus inmundos, salían estos dando grandes voces; y muchos paralíticos y cojos eran sanados;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 8, 8, NULL, 'así que había gran gozo en aquella ciudad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 8, 9, NULL, 'Pero había un hombre llamado Simón, que antes ejercía la magia en aquella ciudad, y había engañado a la gente de Samaria, haciéndose pasar por algún grande.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 8, 10, NULL, 'A este oían atentamente todos, desde el más pequeño hasta el más grande, diciendo: Este es el gran poder de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 8, 11, NULL, 'Y le estaban atentos, porque con sus artes mágicas les había engañado mucho tiempo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 8, 12, NULL, 'Pero cuando creyeron a Felipe, que anunciaba el evangelio del reino de Dios y el nombre de Jesucristo, se bautizaban hombres y mujeres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 8, 13, NULL, 'También creyó Simón mismo, y habiéndose bautizado, estaba siempre con Felipe; y viendo las señales y grandes milagros que se hacían, estaba atónito.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 8, 14, NULL, 'Cuando los apóstoles que estaban en Jerusalén oyeron que Samaria había recibido la palabra de Dios, enviaron allá a Pedro y a Juan;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 8, 15, NULL, 'los cuales, habiendo venido, oraron por ellos para que recibiesen el Espíritu Santo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 8, 16, NULL, 'porque aún no había descendido sobre ninguno de ellos, sino que solamente habían sido bautizados en el nombre de Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 8, 17, NULL, 'Entonces les imponían las manos, y recibían el Espíritu Santo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 8, 18, NULL, 'Cuando vio Simón que por la imposición de las manos de los apóstoles se daba el Espíritu Santo, les ofreció dinero,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 8, 19, NULL, 'diciendo: Dadme también a mí este poder, para que cualquiera a quien yo impusiere las manos reciba el Espíritu Santo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 8, 20, NULL, 'Entonces Pedro le dijo: Tu dinero perezca contigo, porque has pensado que el don de Dios se obtiene con dinero.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 8, 21, NULL, 'No tienes tú parte ni suerte en este asunto, porque tu corazón no es recto delante de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 8, 22, NULL, 'Arrepiéntete, pues, de esta tu maldad, y ruega a Dios, si quizá te sea perdonado el pensamiento de tu corazón;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 8, 23, NULL, 'porque en hiel de amargura y en prisión de maldad veo que estás.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 8, 24, NULL, 'Respondiendo entonces Simón, dijo: Rogad vosotros por mí al Señor, para que nada de esto que habéis dicho venga sobre mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 8, 25, NULL, 'Y ellos, habiendo testificado y hablado la palabra de Dios, se volvieron a Jerusalén, y en muchas poblaciones de los samaritanos anunciaron el evangelio.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 8, 26, 'Felipe y el etíope', 'Un ángel del Señor habló a Felipe, diciendo: Levántate y ve hacia el sur, por el camino que desciende de Jerusalén a Gaza, el cual es desierto.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 8, 27, NULL, 'Entonces él se levantó y fue. Y sucedió que un etíope, eunuco, funcionario de Candace reina de los etíopes, el cual estaba sobre todos sus tesoros, y había venido a Jerusalén para adorar,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 8, 28, NULL, 'volvía sentado en su carro, y leyendo al profeta Isaías.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 8, 29, NULL, 'Y el Espíritu dijo a Felipe: Acércate y júntate a ese carro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 8, 30, NULL, 'Acudiendo Felipe, le oyó que leía al profeta Isaías, y dijo: Pero ¿entiendes lo que lees?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 8, 31, NULL, 'Él dijo: ¿Y cómo podré, si alguno no me enseñare? Y rogó a Felipe que subiese y se sentara con él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 8, 32, NULL, 'El pasaje de la Escritura que leía era este: Como oveja a la muerte fue llevado; Y como cordero mudo delante del que lo trasquila, Así no abrió su boca.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 8, 33, NULL, 'En su humillación no se le hizo justicia; Mas su generación, ¿quién la contará? Porque fue quitada de la tierra su vida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 8, 34, NULL, 'Respondiendo el eunuco, dijo a Felipe: Te ruego que me digas: ¿de quién dice el profeta esto; de sí mismo, o de algún otro?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 8, 35, NULL, 'Entonces Felipe, abriendo su boca, y comenzando desde esta escritura, le anunció el evangelio de Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 8, 36, NULL, 'Y yendo por el camino, llegaron a cierta agua, y dijo el eunuco: Aquí hay agua; ¿qué impide que yo sea bautizado?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 8, 37, NULL, 'Felipe dijo: Si crees de todo corazón, bien puedes. Y respondiendo, dijo: Creo que Jesucristo es el Hijo de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 8, 38, NULL, 'Y mandó parar el carro; y descendieron ambos al agua, Felipe y el eunuco, y le bautizó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 8, 39, NULL, 'Cuando subieron del agua, el Espíritu del Señor arrebató a Felipe; y el eunuco no le vio más, y siguió gozoso su camino.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 8, 40, NULL, 'Pero Felipe se encontró en Azoto; y pasando, anunciaba el evangelio en todas las ciudades, hasta que llegó a Cesarea.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 1, 'Conversión de Saulo', 'Saulo, respirando aún amenazas y muerte contra los discípulos del Señor, vino al sumo sacerdote,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 2, NULL, 'y le pidió cartas para las sinagogas de Damasco, a fin de que si hallase algunos hombres o mujeres de este Camino, los trajese presos a Jerusalén.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 3, NULL, 'Mas yendo por el camino, aconteció que al llegar cerca de Damasco, repentinamente le rodeó un resplandor de luz del cielo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 4, NULL, 'y cayendo en tierra, oyó una voz que le decía: Saulo, Saulo, ¿por qué me persigues?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 5, NULL, 'Él dijo: ¿Quién eres, Señor? Y le dijo: Yo soy Jesús, a quien tú persigues; dura cosa te es dar coces contra el aguijón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 6, NULL, 'Él, temblando y temeroso, dijo: Señor, ¿qué quieres que yo haga? Y el Señor le dijo: Levántate y entra en la ciudad, y se te dirá lo que debes hacer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 7, NULL, 'Y los hombres que iban con Saulo se pararon atónitos, oyendo a la verdad la voz, mas sin ver a nadie.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 8, NULL, 'Entonces Saulo se levantó de tierra, y abriendo los ojos, no veía a nadie; así que, llevándole por la mano, le metieron en Damasco,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 9, NULL, 'donde estuvo tres días sin ver, y no comió ni bebió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 10, NULL, 'Había entonces en Damasco un discípulo llamado Ananías, a quien el Señor dijo en visión: Ananías. Y él respondió: Heme aquí, Señor.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 11, NULL, 'Y el Señor le dijo: Levántate, y ve a la calle que se llama Derecha, y busca en casa de Judas a uno llamado Saulo, de Tarso; porque he aquí, él ora,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 12, NULL, 'y ha visto en visión a un varón llamado Ananías, que entra y le pone las manos encima para que recobre la vista.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 13, NULL, 'Entonces Ananías respondió: Señor, he oído de muchos acerca de este hombre, cuántos males ha hecho a tus santos en Jerusalén;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 14, NULL, 'y aun aquí tiene autoridad de los principales sacerdotes para prender a todos los que invocan tu nombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 15, NULL, 'El Señor le dijo: Ve, porque instrumento escogido me es este, para llevar mi nombre en presencia de los gentiles, y de reyes, y de los hijos de Israel;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 16, NULL, 'porque yo le mostraré cuánto le es necesario padecer por mi nombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 17, NULL, 'Fue entonces Ananías y entró en la casa, y poniendo sobre él las manos, dijo: Hermano Saulo, el Señor Jesús, que se te apareció en el camino por donde venías, me ha enviado para que recibas la vista y seas lleno del Espíritu Santo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 18, NULL, 'Y al momento le cayeron de los ojos como escamas, y recibió al instante la vista; y levantándose, fue bautizado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 19, NULL, 'Y habiendo tomado alimento, recobró fuerzas. Y estuvo Saulo por algunos días con los discípulos que estaban en Damasco.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 20, 'Saulo predica en Damasco', 'En seguida predicaba a Cristo en las sinagogas, diciendo que este era el Hijo de Dios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 21, NULL, 'Y todos los que le oían estaban atónitos, y decían: ¿No es este el que asolaba en Jerusalén a los que invocaban este nombre, y a eso vino acá, para llevarlos presos ante los principales sacerdotes?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 22, NULL, 'Pero Saulo mucho más se esforzaba, y confundía a los judíos que moraban en Damasco, demostrando que Jesús era el Cristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 23, 'Saulo escapa de los judíos', 'Pasados muchos días, los judíos resolvieron en consejo matarle;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 24, NULL, 'pero sus asechanzas llegaron a conocimiento de Saulo. Y ellos guardaban las puertas de día y de noche para matarle.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 25, NULL, 'Entonces los discípulos, tomándole de noche, le bajaron por el muro, descolgándole en una canasta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 26, 'Saulo en Jerusalén', 'Cuando llegó a Jerusalén, trataba de juntarse con los discípulos; pero todos le tenían miedo, no creyendo que fuese discípulo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 27, NULL, 'Entonces Bernabé, tomándole, lo trajo a los apóstoles, y les contó cómo Saulo había visto en el camino al Señor, el cual le había hablado, y cómo en Damasco había hablado valerosamente en el nombre de Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 28, NULL, 'Y estaba con ellos en Jerusalén; y entraba y salía,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 29, NULL, 'y hablaba denodadamente en el nombre del Señor, y disputaba con los griegos; pero estos procuraban matarle.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 30, NULL, 'Cuando supieron esto los hermanos, le llevaron hasta Cesarea, y le enviaron a Tarso.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 31, NULL, 'Entonces las iglesias tenían paz por toda Judea, Galilea y Samaria; y eran edificadas, andando en el temor del Señor, y se acrecentaban fortalecidas por el Espíritu Santo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 32, 'Curación de Eneas', 'Aconteció que Pedro, visitando a todos, vino también a los santos que habitaban en Lida.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 33, NULL, 'Y halló allí a uno que se llamaba Eneas, que hacía ocho años que estaba en cama, pues era paralítico.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 34, NULL, 'Y le dijo Pedro: Eneas, Jesucristo te sana; levántate, y haz tu cama. Y en seguida se levantó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 35, NULL, 'Y le vieron todos los que habitaban en Lida y en Sarón, los cuales se convirtieron al Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 36, 'Dorcas es resucitada', 'Había entonces en Jope una discípula llamada Tabita, que traducido quiere decir, Dorcas. Esta abundaba en buenas obras y en limosnas que hacía.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 37, NULL, 'Y aconteció que en aquellos días enfermó y murió. Después de lavada, la pusieron en una sala.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 38, NULL, 'Y como Lida estaba cerca de Jope, los discípulos, oyendo que Pedro estaba allí, le enviaron dos hombres, a rogarle: No tardes en venir a nosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 39, NULL, 'Levantándose entonces Pedro, fue con ellos; y cuando llegó, le llevaron a la sala, donde le rodearon todas las viudas, llorando y mostrando las túnicas y los vestidos que Dorcas hacía cuando estaba con ellas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 40, NULL, 'Entonces, sacando a todos, Pedro se puso de rodillas y oró; y volviéndose al cuerpo, dijo: Tabita, levántate. Y ella abrió los ojos, y al ver a Pedro, se incorporó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 41, NULL, 'Y él, dándole la mano, la levantó; entonces, llamando a los santos y a las viudas, la presentó viva.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 42, NULL, 'Esto fue notorio en toda Jope, y muchos creyeron en el Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 9, 43, NULL, 'Y aconteció que se quedó muchos días en Jope en casa de un cierto Simón, curtidor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 1, 'Pedro y Cornelio', 'Había en Cesarea un hombre llamado Cornelio, centurión de la compañía llamada la Italiana,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 2, NULL, 'piadoso y temeroso de Dios con toda su casa, y que hacía muchas limosnas al pueblo, y oraba a Dios siempre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 3, NULL, 'Este vio claramente en una visión, como a la hora novena del día, que un ángel de Dios entraba donde él estaba, y le decía: Cornelio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 4, NULL, 'Él, mirándole fijamente, y atemorizado, dijo: ¿Qué es, Señor? Y le dijo: Tus oraciones y tus limosnas han subido para memoria delante de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 5, NULL, 'Envía, pues, ahora hombres a Jope, y haz venir a Simón, el que tiene por sobrenombre Pedro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 6, NULL, 'Este posa en casa de cierto Simón curtidor, que tiene su casa junto al mar; él te dirá lo que es necesario que hagas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 7, NULL, 'Ido el ángel que hablaba con Cornelio, este llamó a dos de sus criados, y a un devoto soldado de los que le asistían;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 8, NULL, 'a los cuales envió a Jope, después de haberles contado todo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 9, NULL, 'Al día siguiente, mientras ellos iban por el camino y se acercaban a la ciudad, Pedro subió a la azotea para orar, cerca de la hora sexta.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 10, NULL, 'Y tuvo gran hambre, y quiso comer; pero mientras le preparaban algo, le sobrevino un éxtasis;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 11, NULL, 'y vio el cielo abierto, y que descendía algo semejante a un gran lienzo, que atado de las cuatro puntas era bajado a la tierra;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 12, NULL, 'en el cual había de todos los cuadrúpedos terrestres y reptiles y aves del cielo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 13, NULL, 'Y le vino una voz: Levántate, Pedro, mata y come.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 14, NULL, 'Entonces Pedro dijo: Señor, no; porque ninguna cosa común o inmunda he comido jamás.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 15, NULL, 'Volvió la voz a él la segunda vez: Lo que Dios limpió, no lo llames tú común.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 16, NULL, 'Esto se hizo tres veces; y aquel lienzo volvió a ser recogido en el cielo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 17, NULL, 'Y mientras Pedro estaba perplejo dentro de sí sobre lo que significaría la visión que había visto, he aquí los hombres que habían sido enviados por Cornelio, los cuales, preguntando por la casa de Simón, llegaron a la puerta.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 18, NULL, 'Y llamando, preguntaron si moraba allí un Simón que tenía por sobrenombre Pedro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 19, NULL, 'Y mientras Pedro pensaba en la visión, le dijo el Espíritu: He aquí, tres hombres te buscan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 20, NULL, 'Levántate, pues, y desciende y no dudes de ir con ellos, porque yo los he enviado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 21, NULL, 'Entonces Pedro, descendiendo a donde estaban los hombres que fueron enviados por Cornelio, les dijo: He aquí, yo soy el que buscáis; ¿cuál es la causa por la que habéis venido?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 22, NULL, 'Ellos dijeron: Cornelio el centurión, varón justo y temeroso de Dios, y que tiene buen testimonio en toda la nación de los judíos, ha recibido instrucciones de un santo ángel, de hacerte venir a su casa para oír tus palabras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 23, NULL, 'Entonces, haciéndoles entrar, los hospedó. Y al día siguiente, levantándose, se fue con ellos; y le acompañaron algunos de los hermanos de Jope.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 24, NULL, 'Al otro día entraron en Cesarea. Y Cornelio los estaba esperando, habiendo convocado a sus parientes y amigos más íntimos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 25, NULL, 'Cuando Pedro entró, salió Cornelio a recibirle, y postrándose a sus pies, adoró.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 26, NULL, 'Mas Pedro le levantó, diciendo: Levántate, pues yo mismo también soy hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 27, NULL, 'Y hablando con él, entró, y halló a muchos que se habían reunido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 28, NULL, 'Y les dijo: Vosotros sabéis cuán abominable es para un varón judío juntarse o acercarse a un extranjero; pero a mí me ha mostrado Dios que a ningún hombre llame común o inmundo;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 29, NULL, 'por lo cual, al ser llamado, vine sin replicar. Así que pregunto: ¿Por qué causa me habéis hecho venir?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 30, NULL, 'Entonces Cornelio dijo: Hace cuatro días que a esta hora yo estaba en ayunas; y a la hora novena, mientras oraba en mi casa, vi que se puso delante de mí un varón con vestido resplandeciente,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 31, NULL, 'y dijo: Cornelio, tu oración ha sido oída, y tus limosnas han sido recordadas delante de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 32, NULL, 'Envía, pues, a Jope, y haz venir a Simón el que tiene por sobrenombre Pedro, el cual mora en casa de Simón, un curtidor, junto al mar; y cuando llegue, él te hablará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 33, NULL, 'Así que luego envié por ti; y tú has hecho bien en venir. Ahora, pues, todos nosotros estamos aquí en la presencia de Dios, para oír todo lo que Dios te ha mandado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 34, NULL, 'Entonces Pedro, abriendo la boca, dijo: En verdad comprendo que Dios no hace acepción de personas,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 35, NULL, 'sino que en toda nación se agrada del que le teme y hace justicia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 36, NULL, 'Dios envió mensaje a los hijos de Israel, anunciando el evangelio de la paz por medio de Jesucristo; este es Señor de todos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 37, NULL, 'Vosotros sabéis lo que se divulgó por toda Judea, comenzando desde Galilea, después del bautismo que predicó Juan:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 38, NULL, 'cómo Dios ungió con el Espíritu Santo y con poder a Jesús de Nazaret, y cómo este anduvo haciendo bienes y sanando a todos los oprimidos por el diablo, porque Dios estaba con él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 39, NULL, 'Y nosotros somos testigos de todas las cosas que Jesús hizo en la tierra de Judea y en Jerusalén; a quien mataron colgándole en un madero.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 40, NULL, 'A este levantó Dios al tercer día, e hizo que se manifestase;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 41, NULL, 'no a todo el pueblo, sino a los testigos que Dios había ordenado de antemano, a nosotros que comimos y bebimos con él después que resucitó de los muertos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 42, NULL, 'Y nos mandó que predicásemos al pueblo, y testificásemos que él es el que Dios ha puesto por Juez de vivos y muertos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 43, NULL, 'De este dan testimonio todos los profetas, que todos los que en él creyeren, recibirán perdón de pecados por su nombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 44, NULL, 'Mientras aún hablaba Pedro estas palabras, el Espíritu Santo cayó sobre todos los que oían el discurso.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 45, NULL, 'Y los fieles de la circuncisión que habían venido con Pedro se quedaron atónitos de que también sobre los gentiles se derramase el don del Espíritu Santo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 46, NULL, 'Porque los oían que hablaban en lenguas, y que magnificaban a Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 47, NULL, 'Entonces respondió Pedro: ¿Puede acaso alguno impedir el agua, para que no sean bautizados estos que han recibido el Espíritu Santo también como nosotros?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 10, 48, NULL, 'Y mandó bautizarles en el nombre del Señor Jesús. Entonces le rogaron que se quedase por algunos días.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 11, 1, 'Informe de Pedro a la iglesia de Jerusalén', 'Oyeron los apóstoles y los hermanos que estaban en Judea, que también los gentiles habían recibido la palabra de Dios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 11, 2, NULL, 'Y cuando Pedro subió a Jerusalén, disputaban con él los que eran de la circuncisión,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 11, 3, NULL, 'diciendo: ¿Por qué has entrado en casa de hombres incircuncisos, y has comido con ellos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 11, 4, NULL, 'Entonces comenzó Pedro a contarles por orden lo sucedido, diciendo:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 11, 5, NULL, 'Estaba yo en la ciudad de Jope orando, y vi en éxtasis una visión; algo semejante a un gran lienzo que descendía, que por las cuatro puntas era bajado del cielo y venía hasta mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 11, 6, NULL, 'Cuando fijé en él los ojos, consideré y vi cuadrúpedos terrestres, y fieras, y reptiles, y aves del cielo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 11, 7, NULL, 'Y oí una voz que me decía: Levántate, Pedro, mata y come.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 11, 8, NULL, 'Y dije: Señor, no; porque ninguna cosa común o inmunda entró jamás en mi boca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 11, 9, NULL, 'Entonces la voz me respondió del cielo por segunda vez: Lo que Dios limpió, no lo llames tú común.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 11, 10, NULL, 'Y esto se hizo tres veces, y volvió todo a ser llevado arriba al cielo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 11, 11, NULL, 'Y he aquí, luego llegaron tres hombres a la casa donde yo estaba, enviados a mí desde Cesarea.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 11, 12, NULL, 'Y el Espíritu me dijo que fuese con ellos sin dudar. Fueron también conmigo estos seis hermanos, y entramos en casa de un varón,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 11, 13, NULL, 'quien nos contó cómo había visto en su casa un ángel, que se puso en pie y le dijo: Envía hombres a Jope, y haz venir a Simón, el que tiene por sobrenombre Pedro;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 11, 14, NULL, 'él te hablará palabras por las cuales serás salvo tú, y toda tu casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 11, 15, NULL, 'Y cuando comencé a hablar, cayó el Espíritu Santo sobre ellos también, como sobre nosotros al principio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 11, 16, NULL, 'Entonces me acordé de lo dicho por el Señor, cuando dijo: Juan ciertamente bautizó en agua, mas vosotros seréis bautizados con el Espíritu Santo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 11, 17, NULL, 'Si Dios, pues, les concedió también el mismo don que a nosotros que hemos creído en el Señor Jesucristo, ¿quién era yo que pudiese estorbar a Dios?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 11, 18, NULL, 'Entonces, oídas estas cosas, callaron, y glorificaron a Dios, diciendo: ¡De manera que también a los gentiles ha dado Dios arrepentimiento para vida!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 11, 19, 'La iglesia en Antioquía', 'Ahora bien, los que habían sido esparcidos a causa de la persecución que hubo con motivo de Esteban, pasaron hasta Fenicia, Chipre y Antioquía, no hablando a nadie la palabra, sino solo a los judíos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 11, 20, NULL, 'Pero había entre ellos unos varones de Chipre y de Cirene, los cuales, cuando entraron en Antioquía, hablaron también a los griegos, anunciando el evangelio del Señor Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 11, 21, NULL, 'Y la mano del Señor estaba con ellos, y gran número creyó y se convirtió al Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 11, 22, NULL, 'Llegó la noticia de estas cosas a oídos de la iglesia que estaba en Jerusalén; y enviaron a Bernabé que fuese hasta Antioquía.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 11, 23, NULL, 'Este, cuando llegó, y vio la gracia de Dios, se regocijó, y exhortó a todos a que con propósito de corazón permaneciesen fieles al Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 11, 24, NULL, 'Porque era varón bueno, y lleno del Espíritu Santo y de fe. Y una gran multitud fue agregada al Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 11, 25, NULL, 'Después fue Bernabé a Tarso para buscar a Saulo; y hallándole, le trajo a Antioquía.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 11, 26, NULL, 'Y se congregaron allí todo un año con la iglesia, y enseñaron a mucha gente; y a los discípulos se les llamó cristianos por primera vez en Antioquía.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 11, 27, NULL, 'En aquellos días unos profetas descendieron de Jerusalén a Antioquía.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 11, 28, NULL, 'Y levantándose uno de ellos, llamado Agabo, daba a entender por el Espíritu, que vendría una gran hambre en toda la tierra habitada; la cual sucedió en tiempo de Claudio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 11, 29, NULL, 'Entonces los discípulos, cada uno conforme a lo que tenía, determinaron enviar socorro a los hermanos que habitaban en Judea;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 11, 30, NULL, 'lo cual en efecto hicieron, enviándolo a los ancianos por mano de Bernabé y de Saulo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 12, 1, 'Jacobo, muerto; Pedro, encarcelado', 'En aquel mismo tiempo el rey Herodes echó mano a algunos de la iglesia para maltratarles.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 12, 2, NULL, 'Y mató a espada a Jacobo, hermano de Juan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 12, 3, NULL, 'Y viendo que esto había agradado a los judíos, procedió a prender también a Pedro. Eran entonces los días de los panes sin levadura.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 12, 4, NULL, 'Y habiéndole tomado preso, le puso en la cárcel, entregándole a cuatro grupos de cuatro soldados cada uno, para que le custodiasen; y se proponía sacarle al pueblo después de la pascua.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 12, 5, NULL, 'Así que Pedro estaba custodiado en la cárcel; pero la iglesia hacía sin cesar oración a Dios por él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 12, 6, 'Pedro es librado de la cárcel', 'Y cuando Herodes le iba a sacar, aquella misma noche estaba Pedro durmiendo entre dos soldados, sujeto con dos cadenas, y los guardas delante de la puerta custodiaban la cárcel.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 12, 7, NULL, 'Y he aquí que se presentó un ángel del Señor, y una luz resplandeció en la cárcel; y tocando a Pedro en el costado, le despertó, diciendo: Levántate pronto. Y las cadenas se le cayeron de las manos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 12, 8, NULL, 'Le dijo el ángel: Cíñete, y átate las sandalias. Y lo hizo así. Y le dijo: Envuélvete en tu manto, y sígueme.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 12, 9, NULL, 'Y saliendo, le seguía; pero no sabía que era verdad lo que hacía el ángel, sino que pensaba que veía una visión.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 12, 10, NULL, 'Habiendo pasado la primera y la segunda guardia, llegaron a la puerta de hierro que daba a la ciudad, la cual se les abrió por sí misma; y salidos, pasaron una calle, y luego el ángel se apartó de él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 12, 11, NULL, 'Entonces Pedro, volviendo en sí, dijo: Ahora entiendo verdaderamente que el Señor ha enviado su ángel, y me ha librado de la mano de Herodes, y de todo lo que el pueblo de los judíos esperaba.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 12, 12, NULL, 'Y habiendo considerado esto, llegó a casa de María la madre de Juan, el que tenía por sobrenombre Marcos, donde muchos estaban reunidos orando.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 12, 13, NULL, 'Cuando llamó Pedro a la puerta del patio, salió a escuchar una muchacha llamada Rode,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 12, 14, NULL, 'la cual, cuando reconoció la voz de Pedro, de gozo no abrió la puerta, sino que corriendo adentro, dio la nueva de que Pedro estaba a la puerta.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 12, 15, NULL, 'Y ellos le dijeron: Estás loca. Pero ella aseguraba que así era. Entonces ellos decían: ¡Es su ángel!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 12, 16, NULL, 'Mas Pedro persistía en llamar; y cuando abrieron y le vieron, se quedaron atónitos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 12, 17, NULL, 'Pero él, haciéndoles con la mano señal de que callasen, les contó cómo el Señor le había sacado de la cárcel. Y dijo: Haced saber esto a Jacobo y a los hermanos. Y salió, y se fue a otro lugar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 12, 18, NULL, 'Luego que fue de día, hubo no poco alboroto entre los soldados sobre qué había sido de Pedro.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 12, 19, NULL, 'Mas Herodes, habiéndole buscado sin hallarle, después de interrogar a los guardas, ordenó llevarlos a la muerte. Después descendió de Judea a Cesarea y se quedó allí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 12, 20, 'Muerte de Herodes', 'Y Herodes estaba enojado contra los de Tiro y de Sidón; pero ellos vinieron de acuerdo ante él, y sobornado Blasto, que era camarero mayor del rey, pedían paz, porque su territorio era abastecido por el del rey.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 12, 21, NULL, 'Y un día señalado, Herodes, vestido de ropas reales, se sentó en el tribunal y les arengó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 12, 22, NULL, 'Y el pueblo aclamaba gritando: ¡Voz de Dios, y no de hombre!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 12, 23, NULL, 'Al momento un ángel del Señor le hirió, por cuanto no dio la gloria a Dios; y expiró comido de gusanos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 12, 24, NULL, 'Pero la palabra del Señor crecía y se multiplicaba.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 12, 25, NULL, 'Y Bernabé y Saulo, cumplido su servicio, volvieron de Jerusalén, llevando también consigo a Juan, el que tenía por sobrenombre Marcos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 1, 'Bernabé y Saulo comienzan su primer viaje misionero', 'Había entonces en la iglesia que estaba en Antioquía, profetas y maestros: Bernabé, Simón el que se llamaba Niger, Lucio de Cirene, Manaén el que se había criado junto con Herodes el tetrarca, y Saulo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 2, NULL, 'Ministrando estos al Señor, y ayunando, dijo el Espíritu Santo: Apartadme a Bernabé y a Saulo para la obra a que los he llamado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 3, NULL, 'Entonces, habiendo ayunado y orado, les impusieron las manos y los despidieron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 4, 'Los apóstoles predican en Chipre', 'Ellos, entonces, enviados por el Espíritu Santo, descendieron a Seleucia, y de allí navegaron a Chipre.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 5, NULL, 'Y llegados a Salamina, anunciaban la palabra de Dios en las sinagogas de los judíos. Tenían también a Juan de ayudante.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 6, NULL, 'Y habiendo atravesado toda la isla hasta Pafos, hallaron a cierto mago, falso profeta, judío, llamado Barjesús,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 7, NULL, 'que estaba con el procónsul Sergio Paulo, varón prudente. Este, llamando a Bernabé y a Saulo, deseaba oír la palabra de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 8, NULL, 'Pero les resistía Elimas, el mago (pues así se traduce su nombre), procurando apartar de la fe al procónsul.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 9, NULL, 'Entonces Saulo, que también es Pablo, lleno del Espíritu Santo, fijando en él los ojos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 10, NULL, 'dijo: ¡Oh, lleno de todo engaño y de toda maldad, hijo del diablo, enemigo de toda justicia! ¿No cesarás de trastornar los caminos rectos del Señor?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 11, NULL, 'Ahora, pues, he aquí la mano del Señor está contra ti, y serás ciego, y no verás el sol por algún tiempo. E inmediatamente cayeron sobre él oscuridad y tinieblas; y andando alrededor, buscaba quien le condujese de la mano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 12, NULL, 'Entonces el procónsul, viendo lo que había sucedido, creyó, maravillado de la doctrina del Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 13, 'Pablo y Bernabé en Antioquía de Pisidia', 'Habiendo zarpado de Pafos, Pablo y sus compañeros arribaron a Perge de Panfilia; pero Juan, apartándose de ellos, volvió a Jerusalén.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 14, NULL, 'Ellos, pasando de Perge, llegaron a Antioquía de Pisidia; y entraron en la sinagoga un día de reposo y se sentaron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 15, NULL, 'Y después de la lectura de la ley y de los profetas, los principales de la sinagoga mandaron a decirles: Varones hermanos, si tenéis alguna palabra de exhortación para el pueblo, hablad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 16, NULL, 'Entonces Pablo, levantándose, hecha señal de silencio con la mano, dijo: Varones israelitas, y los que teméis a Dios, oíd:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 17, NULL, 'El Dios de este pueblo de Israel escogió a nuestros padres, y enalteció al pueblo, siendo ellos extranjeros en tierra de Egipto, y con brazo levantado los sacó de ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 18, NULL, 'Y por un tiempo como de cuarenta años los soportó en el desierto;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 19, NULL, 'y habiendo destruido siete naciones en la tierra de Canaán, les dio en herencia su territorio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 20, NULL, 'Después, como por cuatrocientos cincuenta años, les dio jueces hasta el profeta Samuel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 21, NULL, 'Luego pidieron rey, y Dios les dio a Saúl hijo de Cis, varón de la tribu de Benjamín, por cuarenta años.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 22, NULL, 'Quitado este, les levantó por rey a David, de quien dio también testimonio diciendo: He hallado a David hijo de Isaí, varón conforme a mi corazón, quien hará todo lo que yo quiero.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 23, NULL, 'De la descendencia de este, y conforme a la promesa, Dios levantó a Jesús por Salvador a Israel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 24, NULL, 'Antes de su venida, predicó Juan el bautismo de arrepentimiento a todo el pueblo de Israel.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 25, NULL, 'Mas cuando Juan terminaba su carrera, dijo: ¿Quién pensáis que soy? No soy yo él; mas he aquí viene tras mí uno de quien no soy digno de desatar el calzado de los pies.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 26, NULL, 'Varones hermanos, hijos del linaje de Abraham, y los que entre vosotros teméis a Dios, a vosotros es enviada la palabra de esta salvación.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 27, NULL, 'Porque los habitantes de Jerusalén y sus gobernantes, no conociendo a Jesús, ni las palabras de los profetas que se leen todos los días de reposo, las cumplieron al condenarle.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 28, NULL, 'Y sin hallar en él causa digna de muerte, pidieron a Pilato que se le matase.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 29, NULL, 'Y habiendo cumplido todas las cosas que de él estaban escritas, quitándolo del madero, lo pusieron en el sepulcro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 30, NULL, 'Mas Dios le levantó de los muertos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 31, NULL, 'Y él se apareció durante muchos días a los que habían subido juntamente con él de Galilea a Jerusalén, los cuales ahora son sus testigos ante el pueblo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 32, NULL, 'Y nosotros también os anunciamos el evangelio de aquella promesa hecha a nuestros padres,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 33, NULL, 'la cual Dios ha cumplido a los hijos de ellos, a nosotros, resucitando a Jesús; como está escrito también en el salmo segundo: Mi hijo eres tú, yo te he engendrado hoy.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 34, NULL, 'Y en cuanto a que le levantó de los muertos para nunca más volver a corrupción, lo dijo así: Os daré las misericordias fieles de David.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 35, NULL, 'Por eso dice también en otro salmo: No permitirás que tu Santo vea corrupción.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 36, NULL, 'Porque a la verdad David, habiendo servido a su propia generación según la voluntad de Dios, durmió, y fue reunido con sus padres, y vio corrupción.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 37, NULL, 'Mas aquel a quien Dios levantó, no vio corrupción.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 38, NULL, 'Sabed, pues, esto, varones hermanos: que por medio de él se os anuncia perdón de pecados,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 39, NULL, 'y que de todo aquello de que por la ley de Moisés no pudisteis ser justificados, en él es justificado todo aquel que cree.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 40, NULL, 'Mirad, pues, que no venga sobre vosotros lo que está dicho en los profetas:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 41, NULL, 'Mirad, oh menospreciadores, y asombraos, y desapareced; Porque yo hago una obra en vuestros días, Obra que no creeréis, si alguien os la contare.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 42, NULL, 'Cuando salieron ellos de la sinagoga de los judíos, los gentiles les rogaron que el siguiente día de reposo les hablasen de estas cosas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 43, NULL, 'Y despedida la congregación, muchos de los judíos y de los prosélitos piadosos siguieron a Pablo y a Bernabé, quienes hablándoles, les persuadían a que perseverasen en la gracia de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 44, NULL, 'El siguiente día de reposo se juntó casi toda la ciudad para oír la palabra de Dios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 45, NULL, 'Pero viendo los judíos la muchedumbre, se llenaron de celos, y rebatían lo que Pablo decía, contradiciendo y blasfemando.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 46, NULL, 'Entonces Pablo y Bernabé, hablando con denuedo, dijeron: A vosotros a la verdad era necesario que se os hablase primero la palabra de Dios; mas puesto que la desecháis, y no os juzgáis dignos de la vida eterna, he aquí, nos volvemos a los gentiles.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 47, NULL, 'Porque así nos ha mandado el Señor, diciendo: Te he puesto para luz de los gentiles, A fin de que seas para salvación hasta lo último de la tierra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 48, NULL, 'Los gentiles, oyendo esto, se regocijaban y glorificaban la palabra del Señor, y creyeron todos los que estaban ordenados para vida eterna.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 49, NULL, 'Y la palabra del Señor se difundía por toda aquella provincia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 50, NULL, 'Pero los judíos instigaron a mujeres piadosas y distinguidas, y a los principales de la ciudad, y levantaron persecución contra Pablo y Bernabé, y los expulsaron de sus límites.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 51, NULL, 'Ellos entonces, sacudiendo contra ellos el polvo de sus pies, llegaron a Iconio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 13, 52, NULL, 'Y los discípulos estaban llenos de gozo y del Espíritu Santo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 14, 1, 'Pablo y Bernabé en Iconio', 'Aconteció en Iconio que entraron juntos en la sinagoga de los judíos, y hablaron de tal manera que creyó una gran multitud de judíos, y asimismo de griegos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 14, 2, NULL, 'Mas los judíos que no creían excitaron y corrompieron los ánimos de los gentiles contra los hermanos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 14, 3, NULL, 'Por tanto, se detuvieron allí mucho tiempo, hablando con denuedo, confiados en el Señor, el cual daba testimonio a la palabra de su gracia, concediendo que se hiciesen por las manos de ellos señales y prodigios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 14, 4, NULL, 'Y la gente de la ciudad estaba dividida: unos estaban con los judíos, y otros con los apóstoles.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 14, 5, NULL, 'Pero cuando los judíos y los gentiles, juntamente con sus gobernantes, se lanzaron a afrentarlos y apedrearlos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 14, 6, NULL, 'habiéndolo sabido, huyeron a Listra y Derbe, ciudades de Licaonia, y a toda la región circunvecina,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 14, 7, NULL, 'y allí predicaban el evangelio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 14, 8, 'Pablo es apedreado en Listra', 'Y cierto hombre de Listra estaba sentado, imposibilitado de los pies, cojo de nacimiento, que jamás había andado.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 14, 9, NULL, 'Este oyó hablar a Pablo, el cual, fijando en él sus ojos, y viendo que tenía fe para ser sanado,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 14, 10, NULL, 'dijo a gran voz: Levántate derecho sobre tus pies. Y él saltó, y anduvo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 14, 11, NULL, 'Entonces la gente, visto lo que Pablo había hecho, alzó la voz, diciendo en lengua licaónica: Dioses bajo la semejanza de hombres han descendido a nosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 14, 12, NULL, 'Y a Bernabé llamaban Júpiter, y a Pablo, Mercurio, porque este era el que llevaba la palabra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 14, 13, NULL, 'Y el sacerdote de Júpiter, cuyo templo estaba frente a la ciudad, trajo toros y guirnaldas delante de las puertas, y juntamente con la muchedumbre quería ofrecer sacrificios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 14, 14, NULL, 'Cuando lo oyeron los apóstoles Bernabé y Pablo, rasgaron sus ropas, y se lanzaron entre la multitud, dando voces', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 14, 15, NULL, 'y diciendo: Varones, ¿por qué hacéis esto? Nosotros también somos hombres semejantes a vosotros, que os anunciamos que de estas vanidades os convirtáis al Dios vivo, que hizo el cielo y la tierra, el mar, y todo lo que en ellos hay.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 14, 16, NULL, 'En las edades pasadas él ha dejado a todas las gentes andar en sus propios caminos;', 0, 'spa', 'RVR1960', NULL);\n"
;

  public static final String SQL_PARTE_3 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Hch', 14, 17, NULL, 'si bien no se dejó a sí mismo sin testimonio, haciendo bien, dándonos lluvias del cielo y tiempos fructíferos, llenando de sustento y de alegría nuestros corazones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 14, 18, NULL, 'Y diciendo estas cosas, difícilmente lograron impedir que la multitud les ofreciese sacrificio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 14, 19, NULL, 'Entonces vinieron unos judíos de Antioquía y de Iconio, que persuadieron a la multitud, y habiendo apedreado a Pablo, le arrastraron fuera de la ciudad, pensando que estaba muerto.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 14, 20, NULL, 'Pero rodeándole los discípulos, se levantó y entró en la ciudad; y al día siguiente salió con Bernabé para Derbe.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 14, 21, NULL, 'Y después de anunciar el evangelio a aquella ciudad y de hacer muchos discípulos, volvieron a Listra, a Iconio y a Antioquía,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 14, 22, NULL, 'confirmando los ánimos de los discípulos, exhortándoles a que permaneciesen en la fe, y diciéndoles: Es necesario que a través de muchas tribulaciones entremos en el reino de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 14, 23, NULL, 'Y constituyeron ancianos en cada iglesia, y habiendo orado con ayunos, los encomendaron al Señor en quien habían creído.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 14, 24, 'El regreso a Antioquía de Siria', 'Pasando luego por Pisidia, vinieron a Panfilia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 14, 25, NULL, 'Y habiendo predicado la palabra en Perge, descendieron a Atalia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 14, 26, NULL, 'De allí navegaron a Antioquía, desde donde habían sido encomendados a la gracia de Dios para la obra que habían cumplido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 14, 27, NULL, 'Y habiendo llegado, y reunido a la iglesia, refirieron cuán grandes cosas había hecho Dios con ellos, y cómo había abierto la puerta de la fe a los gentiles.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 14, 28, NULL, 'Y se quedaron allí mucho tiempo con los discípulos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 1, 'El concilio en Jerusalén', 'Entonces algunos que venían de Judea enseñaban a los hermanos: Si no os circuncidáis conforme al rito de Moisés, no podéis ser salvos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 2, NULL, 'Como Pablo y Bernabé tuviesen una discusión y contienda no pequeña con ellos, se dispuso que subiesen Pablo y Bernabé a Jerusalén, y algunos otros de ellos, a los apóstoles y a los ancianos, para tratar esta cuestión.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 3, NULL, 'Ellos, pues, habiendo sido encaminados por la iglesia, pasaron por Fenicia y Samaria, contando la conversión de los gentiles; y causaban gran gozo a todos los hermanos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 4, NULL, 'Y llegados a Jerusalén, fueron recibidos por la iglesia y los apóstoles y los ancianos, y refirieron todas las cosas que Dios había hecho con ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 5, NULL, 'Pero algunos de la secta de los fariseos, que habían creído, se levantaron diciendo: Es necesario circuncidarlos, y mandarles que guarden la ley de Moisés.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 6, NULL, 'Y se reunieron los apóstoles y los ancianos para conocer de este asunto.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 7, NULL, 'Y después de mucha discusión, Pedro se levantó y les dijo: Varones hermanos, vosotros sabéis cómo ya hace algún tiempo que Dios escogió que los gentiles oyesen por mi boca la palabra del evangelio y creyesen.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 8, NULL, 'Y Dios, que conoce los corazones, les dio testimonio, dándoles el Espíritu Santo lo mismo que a nosotros;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 9, NULL, 'y ninguna diferencia hizo entre nosotros y ellos, purificando por la fe sus corazones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 10, NULL, 'Ahora, pues, ¿por qué tentáis a Dios, poniendo sobre la cerviz de los discípulos un yugo que ni nuestros padres ni nosotros hemos podido llevar?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 11, NULL, 'Antes creemos que por la gracia del Señor Jesús seremos salvos, de igual modo que ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 12, NULL, 'Entonces toda la multitud calló, y oyeron a Bernabé y a Pablo, que contaban cuán grandes señales y maravillas había hecho Dios por medio de ellos entre los gentiles.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 13, NULL, 'Y cuando ellos callaron, Jacobo respondió diciendo: Varones hermanos, oídme.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 14, NULL, 'Simón ha contado cómo Dios visitó por primera vez a los gentiles, para tomar de ellos pueblo para su nombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 15, NULL, 'Y con esto concuerdan las palabras de los profetas, como está escrito:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 16, NULL, 'Después de esto volveré Y reedificaré el tabernáculo de David, que está caído; Y repararé sus ruinas, Y lo volveré a levantar,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 17, NULL, 'Para que el resto de los hombres busque al Señor, Y todos los gentiles, sobre los cuales es invocado mi nombre,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 18, NULL, 'Dice el Señor, que hace conocer todo esto desde tiempos antiguos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 19, NULL, 'Por lo cual yo juzgo que no se inquiete a los gentiles que se convierten a Dios,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 20, NULL, 'sino que se les escriba que se aparten de las contaminaciones de los ídolos, de fornicación, de ahogado y de sangre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 21, NULL, 'Porque Moisés desde tiempos antiguos tiene en cada ciudad quien lo predique en las sinagogas, donde es leído cada día de reposo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 22, NULL, 'Entonces pareció bien a los apóstoles y a los ancianos, con toda la iglesia, elegir de entre ellos varones y enviarlos a Antioquía con Pablo y Bernabé: a Judas que tenía por sobrenombre Barsabás, y a Silas, varones principales entre los hermanos;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 23, NULL, 'y escribir por conducto de ellos: Los apóstoles y los ancianos y los hermanos, a los hermanos de entre los gentiles que están en Antioquía, en Siria y en Cilicia, salud.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 24, NULL, 'Por cuanto hemos oído que algunos que han salido de nosotros, a los cuales no dimos orden, os han inquietado con palabras, perturbando vuestras almas, mandando circuncidaros y guardar la ley,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 25, NULL, 'nos ha parecido bien, habiendo llegado a un acuerdo, elegir varones y enviarlos a vosotros con nuestros amados Bernabé y Pablo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 26, NULL, 'hombres que han expuesto su vida por el nombre de nuestro Señor Jesucristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 27, NULL, 'Así que enviamos a Judas y a Silas, los cuales también de palabra os harán saber lo mismo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 28, NULL, 'Porque ha parecido bien al Espíritu Santo, y a nosotros, no imponeros ninguna carga más que estas cosas necesarias:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 29, NULL, 'que os abstengáis de lo sacrificado a ídolos, de sangre, de ahogado y de fornicación; de las cuales cosas si os guardareis, bien haréis. Pasadlo bien.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 30, NULL, 'Así, pues, los que fueron enviados descendieron a Antioquía, y reuniendo a la congregación, entregaron la carta;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 31, NULL, 'habiendo leído la cual, se regocijaron por la consolación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 32, NULL, 'Y Judas y Silas, como ellos también eran profetas, consolaron y confirmaron a los hermanos con abundancia de palabras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 33, NULL, 'Y pasando algún tiempo allí, fueron despedidos en paz por los hermanos, para volver a aquellos que los habían enviado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 34, NULL, 'Mas a Silas le pareció bien el quedarse allí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 35, NULL, 'Y Pablo y Bernabé continuaron en Antioquía, enseñando la palabra del Señor y anunciando el evangelio con otros muchos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 36, 'Pablo se separa de Bernabé, y comienza su segundo viaje misionero', 'Después de algunos días, Pablo dijo a Bernabé: Volvamos a visitar a los hermanos en todas las ciudades en que hemos anunciado la palabra del Señor, para ver cómo están.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 37, NULL, 'Y Bernabé quería que llevasen consigo a Juan, el que tenía por sobrenombre Marcos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 38, NULL, 'pero a Pablo no le parecía bien llevar consigo al que se había apartado de ellos desde Panfilia, y no había ido con ellos a la obra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 39, NULL, 'Y hubo tal desacuerdo entre ellos, que se separaron el uno del otro; Bernabé, tomando a Marcos, navegó a Chipre,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 40, NULL, 'y Pablo, escogiendo a Silas, salió encomendado por los hermanos a la gracia del Señor,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 15, 41, NULL, 'y pasó por Siria y Cilicia, confirmando a las iglesias.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 1, 'Timoteo acompaña a Pablo y a Silas', 'Después llegó a Derbe y a Listra; y he aquí, había allí cierto discípulo llamado Timoteo, hijo de una mujer judía creyente, pero de padre griego;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 2, NULL, 'y daban buen testimonio de él los hermanos que estaban en Listra y en Iconio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 3, NULL, 'Quiso Pablo que este fuese con él; y tomándole, le circuncidó por causa de los judíos que había en aquellos lugares; porque todos sabían que su padre era griego.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 4, NULL, 'Y al pasar por las ciudades, les entregaban las ordenanzas que habían acordado los apóstoles y los ancianos que estaban en Jerusalén, para que las guardasen.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 5, NULL, 'Así que las iglesias eran confirmadas en la fe, y aumentaban en número cada día.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 6, 'La visión del varón macedonio', 'Y atravesando Frigia y la provincia de Galacia, les fue prohibido por el Espíritu Santo hablar la palabra en Asia;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 7, NULL, 'y cuando llegaron a Misia, intentaron ir a Bitinia, pero el Espíritu no se lo permitió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 8, NULL, 'Y pasando junto a Misia, descendieron a Troas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 9, NULL, 'Y se le mostró a Pablo una visión de noche: un varón macedonio estaba en pie, rogándole y diciendo: Pasa a Macedonia y ayúdanos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 10, NULL, 'Cuando vio la visión, en seguida procuramos partir para Macedonia, dando por cierto que Dios nos llamaba para que les anunciásemos el evangelio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 11, 'Encarcelados en Filipos', 'Zarpando, pues, de Troas, vinimos con rumbo directo a Samotracia, y el día siguiente a Neápolis;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 12, NULL, 'y de allí a Filipos, que es la primera ciudad de la provincia de Macedonia, y una colonia; y estuvimos en aquella ciudad algunos días.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 13, NULL, 'Y un día de reposo salimos fuera de la puerta, junto al río, donde solía hacerse la oración; y sentándonos, hablamos a las mujeres que se habían reunido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 14, NULL, 'Entonces una mujer llamada Lidia, vendedora de púrpura, de la ciudad de Tiatira, que adoraba a Dios, estaba oyendo; y el Señor abrió el corazón de ella para que estuviese atenta a lo que Pablo decía.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 15, NULL, 'Y cuando fue bautizada, y su familia, nos rogó diciendo: Si habéis juzgado que yo sea fiel al Señor, entrad en mi casa, y posad. Y nos obligó a quedarnos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 16, NULL, 'Aconteció que mientras íbamos a la oración, nos salió al encuentro una muchacha que tenía espíritu de adivinación, la cual daba gran ganancia a sus amos, adivinando.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 17, NULL, 'Esta, siguiendo a Pablo y a nosotros, daba voces, diciendo: Estos hombres son siervos del Dios Altísimo, quienes os anuncian el camino de salvación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 18, NULL, 'Y esto lo hacía por muchos días; mas desagradando a Pablo, este se volvió y dijo al espíritu: Te mando en el nombre de Jesucristo, que salgas de ella. Y salió en aquella misma hora.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 19, NULL, 'Pero viendo sus amos que había salido la esperanza de su ganancia, prendieron a Pablo y a Silas, y los trajeron al foro, ante las autoridades;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 20, NULL, 'y presentándolos a los magistrados, dijeron: Estos hombres, siendo judíos, alborotan nuestra ciudad,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 21, NULL, 'y enseñan costumbres que no nos es lícito recibir ni hacer, pues somos romanos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 22, NULL, 'Y se agolpó el pueblo contra ellos; y los magistrados, rasgándoles las ropas, ordenaron azotarles con varas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 23, NULL, 'Después de haberles azotado mucho, los echaron en la cárcel, mandando al carcelero que los guardase con seguridad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 24, NULL, 'El cual, recibido este mandato, los metió en el calabozo de más adentro, y les aseguró los pies en el cepo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 25, NULL, 'Pero a medianoche, orando Pablo y Silas, cantaban himnos a Dios; y los presos los oían.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 26, NULL, 'Entonces sobrevino de repente un gran terremoto, de tal manera que los cimientos de la cárcel se sacudían; y al instante se abrieron todas las puertas, y las cadenas de todos se soltaron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 27, NULL, 'Despertando el carcelero, y viendo abiertas las puertas de la cárcel, sacó la espada y se iba a matar, pensando que los presos habían huido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 28, NULL, 'Mas Pablo clamó a gran voz, diciendo: No te hagas ningún mal, pues todos estamos aquí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 29, NULL, 'Él entonces, pidiendo luz, se precipitó adentro, y temblando, se postró a los pies de Pablo y de Silas;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 30, NULL, 'y sacándolos, les dijo: Señores, ¿qué debo hacer para ser salvo?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 31, NULL, 'Ellos dijeron: Cree en el Señor Jesucristo, y serás salvo, tú y tu casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 32, NULL, 'Y le hablaron la palabra del Señor a él y a todos los que estaban en su casa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 33, NULL, 'Y él, tomándolos en aquella misma hora de la noche, les lavó las heridas; y en seguida se bautizó él con todos los suyos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 34, NULL, 'Y llevándolos a su casa, les puso la mesa; y se regocijó con toda su casa de haber creído a Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 35, NULL, 'Cuando fue de día, los magistrados enviaron alguaciles a decir: Suelta a aquellos hombres.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 36, NULL, 'Y el carcelero hizo saber estas palabras a Pablo: Los magistrados han mandado a decir que se os suelte; así que ahora salid, y marchaos en paz.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 37, NULL, 'Pero Pablo les dijo: Después de azotarnos públicamente sin sentencia judicial, siendo ciudadanos romanos, nos echaron en la cárcel, ¿y ahora nos echan encubiertamente? No, por cierto, sino vengan ellos mismos a sacarnos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 38, NULL, 'Y los alguaciles hicieron saber estas palabras a los magistrados, los cuales tuvieron miedo al oír que eran romanos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 39, NULL, 'Y viniendo, les rogaron; y sacándolos, les pidieron que salieran de la ciudad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 16, 40, NULL, 'Entonces, saliendo de la cárcel, entraron en casa de Lidia, y habiendo visto a los hermanos, los consolaron, y se fueron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 17, 1, 'El alboroto en Tesalónica', 'Pasando por Anfípolis y Apolonia, llegaron a Tesalónica, donde había una sinagoga de los judíos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 17, 2, NULL, 'Y Pablo, como acostumbraba, fue a ellos, y por tres días de reposo discutió con ellos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 17, 3, NULL, 'declarando y exponiendo por medio de las Escrituras, que era necesario que el Cristo padeciese, y resucitase de los muertos; y que Jesús, a quien yo os anuncio, decía él, es el Cristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 17, 4, NULL, 'Y algunos de ellos creyeron, y se juntaron con Pablo y con Silas; y de los griegos piadosos gran número, y mujeres nobles no pocas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 17, 5, NULL, 'Entonces los judíos que no creían, teniendo celos, tomaron consigo a algunos ociosos, hombres malos, y juntando una turba, alborotaron la ciudad; y asaltando la casa de Jasón, procuraban sacarlos al pueblo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 17, 6, NULL, 'Pero no hallándolos, trajeron a Jasón y a algunos hermanos ante las autoridades de la ciudad, gritando: Estos que trastornan el mundo entero también han venido acá;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 17, 7, NULL, 'a los cuales Jasón ha recibido; y todos estos contravienen los decretos de César, diciendo que hay otro rey, Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 17, 8, NULL, 'Y alborotaron al pueblo y a las autoridades de la ciudad, oyendo estas cosas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 17, 9, NULL, 'Pero obtenida fianza de Jasón y de los demás, los soltaron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 17, 10, 'Pablo y Silas en Berea', 'Inmediatamente, los hermanos enviaron de noche a Pablo y a Silas hasta Berea. Y ellos, habiendo llegado, entraron en la sinagoga de los judíos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 17, 11, NULL, 'Y estos eran más nobles que los que estaban en Tesalónica, pues recibieron la palabra con toda solicitud, escudriñando cada día las Escrituras para ver si estas cosas eran así.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 17, 12, NULL, 'Así que creyeron muchos de ellos, y mujeres griegas de distinción, y no pocos hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 17, 13, NULL, 'Cuando los judíos de Tesalónica supieron que también en Berea era anunciada la palabra de Dios por Pablo, fueron allá, y también alborotaron a las multitudes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 17, 14, NULL, 'Pero inmediatamente los hermanos enviaron a Pablo que fuese hacia el mar; y Silas y Timoteo se quedaron allí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 17, 15, NULL, 'Y los que se habían encargado de conducir a Pablo le llevaron a Atenas; y habiendo recibido orden para Silas y Timoteo, de que viniesen a él lo más pronto que pudiesen, salieron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 17, 16, 'Pablo en Atenas', 'Mientras Pablo los esperaba en Atenas, su espíritu se enardecía viendo la ciudad entregada a la idolatría.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 17, 17, NULL, 'Así que discutía en la sinagoga con los judíos y piadosos, y en la plaza cada día con los que concurrían.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 17, 18, NULL, 'Y algunos filósofos de los epicúreos y de los estoicos disputaban con él; y unos decían: ¿Qué querrá decir este palabrero? Y otros: Parece que es predicador de nuevos dioses; porque les predicaba el evangelio de Jesús, y de la resurrección.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 17, 19, NULL, 'Y tomándole, le trajeron al Areópago, diciendo: ¿Podremos saber qué es esta nueva enseñanza de que hablas?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 17, 20, NULL, 'Pues traes a nuestros oídos cosas extrañas. Queremos, pues, saber qué quiere decir esto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 17, 21, NULL, '(Porque todos los atenienses y los extranjeros residentes allí, en ninguna otra cosa se interesaban sino en decir o en oír algo nuevo.)', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 17, 22, NULL, 'Entonces Pablo, puesto en pie en medio del Areópago, dijo: Varones atenienses, en todo observo que sois muy religiosos;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 17, 23, NULL, 'porque pasando y mirando vuestros santuarios, hallé también un altar en el cual estaba esta inscripción: AL DIOS NO CONOCIDO. Al que vosotros adoráis, pues, sin conocerle, es a quien yo os anuncio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 17, 24, NULL, 'El Dios que hizo el mundo y todas las cosas que en él hay, siendo Señor del cielo y de la tierra, no habita en templos hechos por manos humanas,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 17, 25, NULL, 'ni es honrado por manos de hombres, como si necesitase de algo; pues él es quien da a todos vida y aliento y todas las cosas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 17, 26, NULL, 'Y de una sangre ha hecho todo el linaje de los hombres, para que habiten sobre toda la faz de la tierra; y les ha prefijado el orden de los tiempos, y los límites de su habitación;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 17, 27, NULL, 'para que busquen a Dios, si en alguna manera, palpando, puedan hallarle, aunque ciertamente no está lejos de cada uno de nosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 17, 28, NULL, 'Porque en él vivimos, y nos movemos, y somos; como algunos de vuestros propios poetas también han dicho: Porque linaje suyo somos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 17, 29, NULL, 'Siendo, pues, linaje de Dios, no debemos pensar que la Divinidad sea semejante a oro, o plata, o piedra, escultura de arte y de imaginación de hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 17, 30, NULL, 'Pero Dios, habiendo pasado por alto los tiempos de esta ignorancia, ahora manda a todos los hombres en todo lugar, que se arrepientan;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 17, 31, NULL, 'por cuanto ha establecido un día en el cual juzgará al mundo con justicia, por aquel varón a quien designó, dando fe a todos con haberle levantado de los muertos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 17, 32, NULL, 'Pero cuando oyeron lo de la resurrección de los muertos, unos se burlaban, y otros decían: Ya te oiremos acerca de esto otra vez.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 17, 33, NULL, 'Y así Pablo salió de en medio de ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 17, 34, NULL, 'Mas algunos creyeron, juntándose con él; entre los cuales estaba Dionisio el areopagita, una mujer llamada Dámaris, y otros con ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 18, 1, 'Pablo en Corinto', 'Después de estas cosas, Pablo salió de Atenas y fue a Corinto.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 18, 2, NULL, 'Y halló a un judío llamado Aquila, natural del Ponto, recién venido de Italia con Priscila su mujer, por cuanto Claudio había mandado que todos los judíos saliesen de Roma. Fue a ellos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 18, 3, NULL, 'y como era del mismo oficio, se quedó con ellos, y trabajaban juntos, pues el oficio de ellos era hacer tiendas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 18, 4, NULL, 'Y discutía en la sinagoga todos los días de reposo, y persuadía a judíos y a griegos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 18, 5, NULL, 'Y cuando Silas y Timoteo vinieron de Macedonia, Pablo estaba entregado por entero a la predicación de la palabra, testificando a los judíos que Jesús era el Cristo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 18, 6, NULL, 'Pero oponiéndose y blasfemando estos, les dijo, sacudiéndose los vestidos: Vuestra sangre sea sobre vuestra propia cabeza; yo, limpio; desde ahora me iré a los gentiles.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 18, 7, NULL, 'Y saliendo de allí, se fue a la casa de uno llamado Justo, temeroso de Dios, la cual estaba junto a la sinagoga.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 18, 8, NULL, 'Y Crispo, el principal de la sinagoga, creyó en el Señor con toda su casa; y muchos de los corintios, oyendo, creían y eran bautizados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 18, 9, NULL, 'Entonces el Señor dijo a Pablo en visión de noche: No temas, sino habla, y no calles;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 18, 10, NULL, 'porque yo estoy contigo, y ninguno pondrá sobre ti la mano para hacerte mal, porque yo tengo mucho pueblo en esta ciudad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 18, 11, NULL, 'Y se detuvo allí un año y seis meses, enseñándoles la palabra de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 18, 12, NULL, 'Pero siendo Galión procónsul de Acaya, los judíos se levantaron de común acuerdo contra Pablo, y le llevaron al tribunal,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 18, 13, NULL, 'diciendo: Este persuade a los hombres a honrar a Dios contra la ley.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 18, 14, NULL, 'Y al comenzar Pablo a hablar, Galión dijo a los judíos: Si fuera algún agravio o algún crimen enorme, oh judíos, conforme a derecho yo os toleraría.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 18, 15, NULL, 'Pero si son cuestiones de palabras, y de nombres, y de vuestra ley, vedlo vosotros; porque yo no quiero ser juez de estas cosas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 18, 16, NULL, 'Y los echó del tribunal.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 18, 17, NULL, 'Entonces todos los griegos, apoderándose de Sóstenes, principal de la sinagoga, le golpeaban delante del tribunal; pero a Galión nada se le daba de ello.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 18, 18, NULL, 'Mas Pablo, habiéndose detenido aún muchos días allí, después se despidió de los hermanos y navegó a Siria, y con él Priscila y Aquila, habiéndose rapado la cabeza en Cencrea, porque tenía hecho voto.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 18, 19, NULL, 'Y llegó a Éfeso, y los dejó allí; y entrando en la sinagoga, discutía con los judíos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 18, 20, NULL, 'los cuales le rogaban que se quedase con ellos por más tiempo; mas no accedió,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 18, 21, NULL, 'sino que se despidió de ellos, diciendo: Es necesario que en todo caso yo guarde en Jerusalén la fiesta que viene; pero otra vez volveré a vosotros, si Dios quiere. Y zarpó de Éfeso.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 18, 22, 'Pablo regresa a Antioquía y comienza su tercer viaje misionero', 'Habiendo arribado a Cesarea, subió para saludar a la iglesia, y luego descendió a Antioquía.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 18, 23, NULL, 'Y después de estar allí algún tiempo, salió, recorriendo por orden la región de Galacia y de Frigia, confirmando a todos los discípulos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 18, 24, 'Apolos predica en Éfeso', 'Llegó entonces a Éfeso un judío llamado Apolos, natural de Alejandría, varón elocuente, poderoso en las Escrituras.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 18, 25, NULL, 'Este había sido instruido en el camino del Señor; y siendo de espíritu fervoroso, hablaba y enseñaba diligentemente lo concerniente al Señor, aunque solamente conocía el bautismo de Juan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 18, 26, NULL, 'Y comenzó a hablar con denuedo en la sinagoga; pero cuando le oyeron Priscila y Aquila, le tomaron aparte y le expusieron más exactamente el camino de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 18, 27, NULL, 'Y queriendo él pasar a Acaya, los hermanos le animaron, y escribieron a los discípulos que le recibiesen; y llegado él allá, fue de gran provecho a los que por la gracia habían creído;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 18, 28, NULL, 'porque con gran vehemencia refutaba públicamente a los judíos, demostrando por las Escrituras que Jesús era el Cristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 1, 'Pablo en Éfeso', 'Aconteció que entre tanto que Apolos estaba en Corinto, Pablo, después de recorrer las regiones superiores, vino a Éfeso, y hallando a ciertos discípulos,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 2, NULL, 'les dijo: ¿Recibisteis el Espíritu Santo cuando creísteis? Y ellos le dijeron: Ni siquiera hemos oído si hay Espíritu Santo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 3, NULL, 'Entonces dijo: ¿En qué, pues, fuisteis bautizados? Ellos dijeron: En el bautismo de Juan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 4, NULL, 'Dijo Pablo: Juan bautizó con bautismo de arrepentimiento, diciendo al pueblo que creyesen en aquel que vendría después de él, esto es, en Jesús el Cristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 5, NULL, 'Cuando oyeron esto, fueron bautizados en el nombre del Señor Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 6, NULL, 'Y habiéndoles impuesto Pablo las manos, vino sobre ellos el Espíritu Santo; y hablaban en lenguas, y profetizaban.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 7, NULL, 'Eran por todos unos doce hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 8, NULL, 'Y entrando Pablo en la sinagoga, habló con denuedo por espacio de tres meses, discutiendo y persuadiendo acerca del reino de Dios.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 9, NULL, 'Pero endureciéndose algunos y no creyendo, maldiciendo el Camino delante de la multitud, se apartó Pablo de ellos y separó a los discípulos, discutiendo cada día en la escuela de uno llamado Tiranno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 10, NULL, 'Así continuó por espacio de dos años, de manera que todos los que habitaban en Asia, judíos y griegos, oyeron la palabra del Señor Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 11, NULL, 'Y hacía Dios milagros extraordinarios por mano de Pablo,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 12, NULL, 'de tal manera que aun se llevaban a los enfermos los paños o delantales de su cuerpo, y las enfermedades se iban de ellos, y los espíritus malos salían.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 13, NULL, 'Pero algunos de los judíos, exorcistas ambulantes, intentaron invocar el nombre del Señor Jesús sobre los que tenían espíritus malos, diciendo: Os conjuro por Jesús, el que predica Pablo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 14, NULL, 'Había siete hijos de un tal Esceva, judío, jefe de los sacerdotes, que hacían esto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 15, NULL, 'Pero respondiendo el espíritu malo, dijo: A Jesús conozco, y sé quién es Pablo; pero vosotros, ¿quiénes sois?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 16, NULL, 'Y el hombre en quien estaba el espíritu malo, saltando sobre ellos y dominándolos, pudo más que ellos, de tal manera que huyeron de aquella casa desnudos y heridos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 17, NULL, 'Y esto fue notorio a todos los que habitaban en Éfeso, así judíos como griegos; y tuvieron temor todos ellos, y era magnificado el nombre del Señor Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 18, NULL, 'Y muchos de los que habían creído venían, confesando y dando cuenta de sus hechos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 19, NULL, 'Asimismo muchos de los que habían practicado la magia trajeron los libros y los quemaron delante de todos; y hecha la cuenta de su precio, hallaron que era cincuenta mil piezas de plata.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 20, NULL, 'Así crecía y prevalecía poderosamente la palabra del Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 21, NULL, 'Pasadas estas cosas, Pablo se propuso en espíritu ir a Jerusalén, después de recorrer Macedonia y Acaya, diciendo: Después que haya estado allí, me será necesario ver también a Roma.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 22, NULL, 'Y enviando a Macedonia a dos de los que le ayudaban, Timoteo y Erasto, él se quedó por algún tiempo en Asia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 23, 'El alboroto en Éfeso', 'Hubo por aquel tiempo un disturbio no pequeño acerca del Camino.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 24, NULL, 'Porque un platero llamado Demetrio, que hacía de plata templecillos de Diana, daba no poca ganancia a los artífices;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 25, NULL, 'a los cuales, reunidos con los obreros del mismo oficio, dijo: Varones, sabéis que de este oficio obtenemos nuestra riqueza;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 26, NULL, 'pero veis y oís que este Pablo, no solamente en Éfeso, sino en casi toda Asia, ha apartado a muchas gentes con persuasión, diciendo que no son dioses los que se hacen con las manos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 27, NULL, 'Y no solamente hay peligro de que este nuestro negocio venga a desacreditarse, sino también que el templo de la gran diosa Diana sea estimado en nada, y comience a ser destruida la majestad de aquella a quien venera toda Asia, y el mundo entero.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 28, NULL, 'Cuando oyeron estas cosas, se llenaron de ira, y gritaron, diciendo: ¡Grande es Diana de los efesios!', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 29, NULL, 'Y la ciudad se llenó de confusión, y a una se lanzaron al teatro, arrebatando a Gayo y a Aristarco, macedonios, compañeros de Pablo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 30, NULL, 'Y queriendo Pablo salir al pueblo, los discípulos no le dejaron.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 31, NULL, 'También algunas de las autoridades de Asia, que eran sus amigos, le enviaron recado, rogándole que no se presentase en el teatro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 32, NULL, 'Unos, pues, gritaban una cosa, y otros otra; porque la concurrencia estaba confusa, y los más no sabían por qué se habían reunido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 33, NULL, 'Y sacaron de entre la multitud a Alejandro, empujándole los judíos. Entonces Alejandro, pedido silencio con la mano, quería hablar en su defensa ante el pueblo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 34, NULL, 'Pero cuando le conocieron que era judío, todos a una voz gritaron casi por dos horas: ¡Grande es Diana de los efesios!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 35, NULL, 'Entonces el escribano, cuando había apaciguado a la multitud, dijo: Varones efesios, ¿y quién es el hombre que no sabe que la ciudad de los efesios es guardiana del templo de la gran diosa Diana, y de la imagen venida de Júpiter?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 36, NULL, 'Puesto que esto no puede contradecirse, es necesario que os apacigüéis, y que nada hagáis precipitadamente.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 37, NULL, 'Porque habéis traído a estos hombres, sin ser sacrílegos ni blasfemadores de vuestra diosa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 38, NULL, 'Que si Demetrio y los artífices que están con él tienen pleito contra alguno, audiencias se conceden, y procónsules hay; acúsense los unos a los otros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 39, NULL, 'Y si demandáis alguna otra cosa, en legítima asamblea se puede decidir.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 40, NULL, 'Porque peligro hay de que seamos acusados de sedición por esto de hoy, no habiendo ninguna causa por la cual podamos dar razón de este concurso.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 19, 41, NULL, 'Y habiendo dicho esto, despidió la asamblea.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 20, 1, 'Viaje de Pablo a Macedonia y Grecia', 'Después que cesó el alboroto, llamó Pablo a los discípulos, y habiéndolos exhortado y abrazado, se despidió y salió para ir a Macedonia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 20, 2, NULL, 'Y después de recorrer aquellas regiones, y de exhortarles con abundancia de palabras, llegó a Grecia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 20, 3, NULL, 'Después de haber estado allí tres meses, y siéndole puestas asechanzas por los judíos para cuando se embarcase para Siria, tomó la decisión de volver por Macedonia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 20, 4, NULL, 'Y le acompañaron hasta Asia, Sópater de Berea, Aristarco y Segundo de Tesalónica, Gayo de Derbe, y Timoteo; y de Asia, Tíquico y Trófimo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 20, 5, NULL, 'Estos, habiéndose adelantado, nos esperaron en Troas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 20, 6, NULL, 'Y nosotros, pasados los días de los panes sin levadura, navegamos de Filipos, y en cinco días nos reunimos con ellos en Troas, donde nos quedamos siete días.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 20, 7, 'Visita de despedida de Pablo en Troas', 'El primer día de la semana, reunidos los discípulos para partir el pan, Pablo les enseñaba, habiendo de salir al día siguiente; y alargó el discurso hasta la medianoche.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 20, 8, NULL, 'Y había muchas lámparas en el aposento alto donde estaban reunidos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 20, 9, NULL, 'y un joven llamado Eutico, que estaba sentado en la ventana, rendido de un sueño profundo, por cuanto Pablo disertaba largamente, vencido del sueño cayó del tercer piso abajo, y fue levantado muerto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 20, 10, NULL, 'Entonces descendió Pablo y se echó sobre él, y abrazándole, dijo: No os alarméis, pues está vivo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 20, 11, NULL, 'Después de haber subido, y partido el pan y comido, habló largamente hasta el alba; y así salió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 20, 12, NULL, 'Y llevaron al joven vivo, y fueron grandemente consolados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 20, 13, 'Viaje de Troas a Mileto', 'Nosotros, adelantándonos a embarcarnos, navegamos a Asón para recoger allí a Pablo, ya que así lo había determinado, queriendo él ir por tierra.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 20, 14, NULL, 'Cuando se reunió con nosotros en Asón, tomándole a bordo, vinimos a Mitilene.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 20, 15, NULL, 'Navegando de allí, al día siguiente llegamos delante de Quío, y al otro día tomamos puerto en Samos; y habiendo hecho escala en Trogilio, al día siguiente llegamos a Mileto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 20, 16, NULL, 'Porque Pablo se había propuesto pasar de largo a Éfeso, para no detenerse en Asia, pues se apresuraba por estar el día de Pentecostés, si le fuese posible, en Jerusalén.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 20, 17, 'Discurso de despedida de Pablo en Mileto', 'Enviando, pues, desde Mileto a Éfeso, hizo llamar a los ancianos de la iglesia.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 20, 18, NULL, 'Cuando vinieron a él, les dijo: Vosotros sabéis cómo me he comportado entre vosotros todo el tiempo, desde el primer día que entré en Asia,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 20, 19, NULL, 'sirviendo al Señor con toda humildad, y con muchas lágrimas, y pruebas que me han venido por las asechanzas de los judíos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 20, 20, NULL, 'y cómo nada que fuese útil he rehuido de anunciaros y enseñaros, públicamente y por las casas,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 20, 21, NULL, 'testificando a judíos y a gentiles acerca del arrepentimiento para con Dios, y de la fe en nuestro Señor Jesucristo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 20, 22, NULL, 'Ahora, he aquí, ligado yo en espíritu, voy a Jerusalén, sin saber lo que allá me ha de acontecer;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 20, 23, NULL, 'salvo que el Espíritu Santo por todas las ciudades me da testimonio, diciendo que me esperan prisiones y tribulaciones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 20, 24, NULL, 'Pero de ninguna cosa hago caso, ni estimo preciosa mi vida para mí mismo, con tal que acabe mi carrera con gozo, y el ministerio que recibí del Señor Jesús, para dar testimonio del evangelio de la gracia de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 20, 25, NULL, 'Y ahora, he aquí, yo sé que ninguno de todos vosotros, entre quienes he pasado predicando el reino de Dios, verá más mi rostro.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 20, 26, NULL, 'Por tanto, yo os protesto en el día de hoy, que estoy limpio de la sangre de todos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 20, 27, NULL, 'porque no he rehuido anunciaros todo el consejo de Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 20, 28, NULL, 'Por tanto, mirad por vosotros, y por todo el rebaño en que el Espíritu Santo os ha puesto por obispos, para apacentar la iglesia del Señor, la cual él ganó por su propia sangre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 20, 29, NULL, 'Porque yo sé que después de mi partida entrarán en medio de vosotros lobos rapaces, que no perdonarán al rebaño.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 20, 30, NULL, 'Y de vosotros mismos se levantarán hombres que hablen cosas perversas para arrastrar tras sí a los discípulos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 20, 31, NULL, 'Por tanto, velad, acordándoos que por tres años, de noche y de día, no he cesado de amonestar con lágrimas a cada uno.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 20, 32, NULL, 'Y ahora, hermanos, os encomiendo a Dios, y a la palabra de su gracia, que tiene poder para sobreedificaros y daros herencia con todos los santificados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 20, 33, NULL, 'Ni plata ni oro ni vestido de nadie he codiciado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 20, 34, NULL, 'Antes vosotros sabéis que para lo que me ha sido necesario a mí y a los que están conmigo, estas manos me han servido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 20, 35, NULL, 'En todo os he enseñado que, trabajando así, se debe ayudar a los necesitados, y recordar las palabras del Señor Jesús, que dijo: Más bienaventurado es dar que recibir.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 20, 36, NULL, 'Cuando hubo dicho estas cosas, se puso de rodillas, y oró con todos ellos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 20, 37, NULL, 'Entonces hubo gran llanto de todos; y echándose al cuello de Pablo, le besaban,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 20, 38, NULL, 'doliéndose en gran manera por la palabra que dijo, de que no verían más su rostro. Y le acompañaron al barco.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 21, 1, 'Viaje de Pablo a Jerusalén', 'Después de separarnos de ellos, zarpamos y fuimos con rumbo directo a Cos, y al día siguiente a Rodas, y de allí a Pátara.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 21, 2, NULL, 'Y hallando un barco que pasaba a Fenicia, nos embarcamos, y zarpamos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 21, 3, NULL, 'Al avistar Chipre, dejándola a mano izquierda, navegamos a Siria, y arribamos a Tiro, porque el barco había de descargar allí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 21, 4, NULL, 'Y hallados los discípulos, nos quedamos allí siete días; y ellos decían a Pablo por el Espíritu, que no subiese a Jerusalén.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 21, 5, NULL, 'Cumplidos aquellos días, salimos, acompañándonos todos, con sus mujeres e hijos, hasta fuera de la ciudad; y puestos de rodillas en la playa, oramos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 21, 6, NULL, 'Y abrazándonos los unos a los otros, subimos al barco y ellos se volvieron a sus casas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 21, 7, NULL, 'Y nosotros completamos la navegación, saliendo de Tiro y arribando a Tolemaida; y habiendo saludado a los hermanos, nos quedamos con ellos un día.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 21, 8, NULL, 'Al otro día, saliendo Pablo y los que con él estábamos, fuimos a Cesarea; y entrando en casa de Felipe el evangelista, que era uno de los siete, posamos con él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 21, 9, NULL, 'Este tenía cuatro hijas doncellas que profetizaban.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 21, 10, NULL, 'Y permaneciendo nosotros allí algunos días, descendió de Judea un profeta llamado Agabo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 21, 11, NULL, 'quien viniendo a vernos, tomó el cinto de Pablo, y atándose los pies y las manos, dijo: Esto dice el Espíritu Santo: Así atarán los judíos en Jerusalén al varón de quien es este cinto, y le entregarán en manos de los gentiles.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 21, 12, NULL, 'Al oír esto, le rogamos nosotros y los de aquel lugar, que no subiese a Jerusalén.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 21, 13, NULL, 'Entonces Pablo respondió: ¿Qué hacéis llorando y quebrantándome el corazón? Porque yo estoy dispuesto no solo a ser atado, mas aun a morir en Jerusalén por el nombre del Señor Jesús.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 21, 14, NULL, 'Y como no le pudimos persuadir, desistimos, diciendo: Hágase la voluntad del Señor.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 21, 15, NULL, 'Después de esos días, hechos ya los preparativos, subimos a Jerusalén.', 1, 'spa', 'RVR1960', NULL);\n"
;

  public static final String SQL_PARTE_4 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Hch', 21, 16, NULL, 'Y vinieron también con nosotros de Cesarea algunos de los discípulos, trayendo consigo a uno llamado Mnasón, de Chipre, discípulo antiguo, con quien nos hospedaríamos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 21, 17, 'Arresto de Pablo en el templo', 'Cuando llegamos a Jerusalén, los hermanos nos recibieron con gozo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 21, 18, NULL, 'Y al día siguiente Pablo entró con nosotros a ver a Jacobo, y se hallaban reunidos todos los ancianos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 21, 19, NULL, 'a los cuales, después de haberles saludado, les contó una por una las cosas que Dios había hecho entre los gentiles por su ministerio.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 21, 20, NULL, 'Cuando ellos lo oyeron, glorificaron a Dios, y le dijeron: Ya ves, hermano, cuántos millares de judíos hay que han creído; y todos son celosos por la ley.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 21, 21, NULL, 'Pero se les ha informado en cuanto a ti, que enseñas a todos los judíos que están entre los gentiles a apostatar de Moisés, diciéndoles que no circunciden a sus hijos, ni observen las costumbres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 21, 22, NULL, '¿Qué hay, pues? La multitud se reunirá de cierto, porque oirán que has venido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 21, 23, NULL, 'Haz, pues, esto que te decimos: Hay entre nosotros cuatro hombres que tienen obligación de cumplir voto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 21, 24, NULL, 'Tómalos contigo, purifícate con ellos, y paga sus gastos para que se rasuren la cabeza; y todos comprenderán que no hay nada de lo que se les informó acerca de ti, sino que tú también andas ordenadamente, guardando la ley.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 21, 25, NULL, 'Pero en cuanto a los gentiles que han creído, nosotros les hemos escrito determinando que no guarden nada de esto; solamente que se abstengan de lo sacrificado a los ídolos, de sangre, de ahogado y de fornicación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 21, 26, NULL, 'Entonces Pablo tomó consigo a aquellos hombres, y al día siguiente, habiéndose purificado con ellos, entró en el templo, para anunciar el cumplimiento de los días de la purificación, cuando había de presentarse la ofrenda por cada uno de ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 21, 27, NULL, 'Pero cuando estaban para cumplirse los siete días, unos judíos de Asia, al verle en el templo, alborotaron a toda la multitud y le echaron mano,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 21, 28, NULL, 'dando voces: ¡Varones israelitas, ayudad! Este es el hombre que por todas partes enseña a todos contra el pueblo, la ley y este lugar; y además de esto, ha metido a griegos en el templo, y ha profanado este santo lugar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 21, 29, NULL, 'Porque antes habían visto con él en la ciudad a Trófimo, de Éfeso, a quien pensaban que Pablo había metido en el templo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 21, 30, NULL, 'Así que toda la ciudad se conmovió, y se agolpó el pueblo; y apoderándose de Pablo, le arrastraron fuera del templo, e inmediatamente cerraron las puertas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 21, 31, NULL, 'Y procurando ellos matarle, se le avisó al tribuno de la compañía, que toda la ciudad de Jerusalén estaba alborotada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 21, 32, NULL, 'Este, tomando luego soldados y centuriones, corrió a ellos. Y cuando ellos vieron al tribuno y a los soldados, dejaron de golpear a Pablo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 21, 33, NULL, 'Entonces, llegando el tribuno, le prendió y le mandó atar con dos cadenas, y preguntó quién era y qué había hecho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 21, 34, NULL, 'Pero entre la multitud, unos gritaban una cosa, y otros otra; y como no podía entender nada de cierto a causa del alboroto, le mandó llevar a la fortaleza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 21, 35, NULL, 'Al llegar a las gradas, aconteció que era llevado en peso por los soldados a causa de la violencia de la multitud;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 21, 36, NULL, 'porque la muchedumbre del pueblo venía detrás, gritando: ¡Muera!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 21, 37, 'Defensa de Pablo ante el pueblo', 'Cuando comenzaron a meter a Pablo en la fortaleza, dijo al tribuno: ¿Se me permite decirte algo? Y él dijo: ¿Sabes griego?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 21, 38, NULL, '¿No eres tú aquel egipcio que levantó una sedición antes de estos días, y sacó al desierto los cuatro mil sicarios?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 21, 39, NULL, 'Entonces dijo Pablo: Yo de cierto soy hombre judío de Tarso, ciudadano de una ciudad no insignificante de Cilicia; pero te ruego que me permitas hablar al pueblo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 21, 40, NULL, 'Y cuando él se lo permitió, Pablo, estando en pie en las gradas, hizo señal con la mano al pueblo. Y hecho gran silencio, habló en lengua hebrea, diciendo:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 22, 1, NULL, 'Varones hermanos y padres, oíd ahora mi defensa ante vosotros.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 22, 2, NULL, 'Y al oír que les hablaba en lengua hebrea, guardaron más silencio. Y él les dijo:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 22, 3, NULL, 'Yo de cierto soy judío, nacido en Tarso de Cilicia, pero criado en esta ciudad, instruido a los pies de Gamaliel, estrictamente conforme a la ley de nuestros padres, celoso de Dios, como hoy lo sois todos vosotros.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 22, 4, NULL, 'Perseguía yo este Camino hasta la muerte, prendiendo y entregando en cárceles a hombres y mujeres;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 22, 5, NULL, 'como el sumo sacerdote también me es testigo, y todos los ancianos, de quienes también recibí cartas para los hermanos, y fui a Damasco para traer presos a Jerusalén también a los que estuviesen allí, para que fuesen castigados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 22, 6, 'Pablo relata su conversión', 'Pero aconteció que yendo yo, al llegar cerca de Damasco, como a mediodía, de repente me rodeó mucha luz del cielo;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 22, 7, NULL, 'y caí al suelo, y oí una voz que me decía: Saulo, Saulo, ¿por qué me persigues?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 22, 8, NULL, 'Yo entonces respondí: ¿Quién eres, Señor? Y me dijo: Yo soy Jesús de Nazaret, a quien tú persigues.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 22, 9, NULL, 'Y los que estaban conmigo vieron a la verdad la luz, y se espantaron; pero no entendieron la voz del que hablaba conmigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 22, 10, NULL, 'Y dije: ¿Qué haré, Señor? Y el Señor me dijo: Levántate, y ve a Damasco, y allí se te dirá todo lo que está ordenado que hagas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 22, 11, NULL, 'Y como yo no veía a causa de la gloria de la luz, llevado de la mano por los que estaban conmigo, llegué a Damasco.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 22, 12, NULL, 'Entonces uno llamado Ananías, varón piadoso según la ley, que tenía buen testimonio de todos los judíos que allí moraban,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 22, 13, NULL, 'vino a mí, y acercándose, me dijo: Hermano Saulo, recibe la vista. Y yo en aquella misma hora recobré la vista y lo miré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 22, 14, NULL, 'Y él dijo: El Dios de nuestros padres te ha escogido para que conozcas su voluntad, y veas al Justo, y oigas la voz de su boca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 22, 15, NULL, 'Porque serás testigo suyo a todos los hombres, de lo que has visto y oído.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 22, 16, NULL, 'Ahora, pues, ¿por qué te detienes? Levántate y bautízate, y lava tus pecados, invocando su nombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 22, 17, 'Pablo es enviado a los gentiles', 'Y me aconteció, vuelto a Jerusalén, que orando en el templo me sobrevino un éxtasis.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 22, 18, NULL, 'Y le vi que me decía: Date prisa, y sal prontamente de Jerusalén; porque no recibirán tu testimonio acerca de mí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 22, 19, NULL, 'Yo dije: Señor, ellos saben que yo encarcelaba y azotaba en todas las sinagogas a los que creían en ti;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 22, 20, NULL, 'y cuando se derramaba la sangre de Esteban tu testigo, yo mismo también estaba presente, y consentía en su muerte, y guardaba las ropas de los que le mataban.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 22, 21, NULL, 'Pero me dijo: Ve, porque yo te enviaré lejos a los gentiles.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 22, 22, 'Pablo en manos del tribuno', 'Y le oyeron hasta esta palabra; entonces alzaron la voz, diciendo: Quita de la tierra a tal hombre, porque no conviene que viva.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 22, 23, NULL, 'Y como ellos gritaban y arrojaban sus ropas y lanzaban polvo al aire,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 22, 24, NULL, 'mandó el tribuno que le metiesen en la fortaleza, y ordenó que fuese examinado con azotes, para saber por qué causa clamaban así contra él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 22, 25, NULL, 'Pero cuando le ataron con correas, Pablo dijo al centurión que estaba presente: ¿Os es lícito azotar a un ciudadano romano sin haber sido condenado?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 22, 26, NULL, 'Cuando el centurión oyó esto, fue y dio aviso al tribuno, diciendo: ¿Qué vas a hacer? Porque este hombre es ciudadano romano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 22, 27, NULL, 'Vino el tribuno y le dijo: Dime, ¿eres tú ciudadano romano? Él dijo: Sí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 22, 28, NULL, 'Respondió el tribuno: Yo con una gran suma adquirí esta ciudadanía. Entonces Pablo dijo: Pero yo lo soy de nacimiento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 22, 29, NULL, 'Así que, luego se apartaron de él los que le iban a dar tormento; y aun el tribuno, al saber que era ciudadano romano, también tuvo temor por haberle atado.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 22, 30, 'Pablo ante el concilio', 'Al día siguiente, queriendo saber de cierto la causa por la cual le acusaban los judíos, le soltó de las cadenas, y mandó venir a los principales sacerdotes y a todo el concilio, y sacando a Pablo, le presentó ante ellos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 23, 1, NULL, 'Entonces Pablo, mirando fijamente al concilio, dijo: Varones hermanos, yo con toda buena conciencia he vivido delante de Dios hasta el día de hoy.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 23, 2, NULL, 'El sumo sacerdote Ananías ordenó entonces a los que estaban junto a él, que le golpeasen en la boca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 23, 3, NULL, 'Entonces Pablo le dijo: ¡Dios te golpeará a ti, pared blanqueada! ¿Estás tú sentado para juzgarme conforme a la ley, y quebrantando la ley me mandas golpear?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 23, 4, NULL, 'Los que estaban presentes dijeron: ¿Al sumo sacerdote de Dios injurias?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 23, 5, NULL, 'Pablo dijo: No sabía, hermanos, que era el sumo sacerdote; pues escrito está: No maldecirás a un príncipe de tu pueblo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 23, 6, NULL, 'Entonces Pablo, notando que una parte era de saduceos y otra de fariseos, alzó la voz en el concilio: Varones hermanos, yo soy fariseo, hijo de fariseo; acerca de la esperanza y de la resurrección de los muertos se me juzga.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 23, 7, NULL, 'Cuando dijo esto, se produjo disensión entre los fariseos y los saduceos, y la asamblea se dividió.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 23, 8, NULL, 'Porque los saduceos dicen que no hay resurrección, ni ángel, ni espíritu; pero los fariseos afirman estas cosas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 23, 9, NULL, 'Y hubo un gran vocerío; y levantándose los escribas de la parte de los fariseos, contendían, diciendo: Ningún mal hallamos en este hombre; que si un espíritu le ha hablado, o un ángel, no resistamos a Dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 23, 10, NULL, 'Y habiendo grande disensión, el tribuno, teniendo temor de que Pablo fuese despedazado por ellos, mandó que bajasen soldados y le arrebatasen de en medio de ellos, y le llevasen a la fortaleza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 23, 11, NULL, 'A la noche siguiente se le presentó el Señor y le dijo: Ten ánimo, Pablo, pues como has testificado de mí en Jerusalén, así es necesario que testifiques también en Roma.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 23, 12, 'Complot contra Pablo', 'Venido el día, algunos de los judíos tramaron un complot y se juramentaron bajo maldición, diciendo que no comerían ni beberían hasta que hubiesen dado muerte a Pablo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 23, 13, NULL, 'Eran más de cuarenta los que habían hecho esta conjuración,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 23, 14, NULL, 'los cuales fueron a los principales sacerdotes y a los ancianos y dijeron: Nosotros nos hemos juramentado bajo maldición, a no gustar nada hasta que hayamos dado muerte a Pablo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 23, 15, NULL, 'Ahora pues, vosotros, con el concilio, requerid al tribuno que le traiga mañana ante vosotros, como que queréis indagar alguna cosa más cierta acerca de él; y nosotros estaremos listos para matarle antes que llegue.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 23, 16, NULL, 'Mas el hijo de la hermana de Pablo, oyendo hablar de la celada, fue y entró en la fortaleza, y dio aviso a Pablo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 23, 17, NULL, 'Pablo, llamando a uno de los centuriones, dijo: Lleva a este joven ante el tribuno, porque tiene cierto aviso que darle.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 23, 18, NULL, 'Él entonces tomándole, le llevó al tribuno, y dijo: El preso Pablo me llamó y me rogó que trajese ante ti a este joven, que tiene algo que hablarte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 23, 19, NULL, 'El tribuno, tomándole de la mano y retirándose aparte, le preguntó: ¿Qué es lo que tienes que decirme?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 23, 20, NULL, 'Él le dijo: Los judíos han convenido en rogarte que mañana lleves a Pablo ante el concilio, como que van a inquirir alguna cosa más cierta acerca de él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 23, 21, NULL, 'Pero tú no les creas; porque más de cuarenta hombres de ellos le acechan, los cuales se han juramentado bajo maldición, a no comer ni beber hasta que le hayan dado muerte; y ahora están listos esperando tu promesa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 23, 22, NULL, 'Entonces el tribuno despidió al joven, mandándole que a nadie dijese que le había dado aviso de esto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 23, 23, 'Pablo es enviado a Félix el gobernador', 'Y llamando a dos centuriones, mandó que preparasen para la hora tercera de la noche doscientos soldados, setenta jinetes y doscientos lanceros, para que fuesen hasta Cesarea;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 23, 24, NULL, 'y que preparasen cabalgaduras en que poniendo a Pablo, le llevasen en salvo a Félix el gobernador.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 23, 25, NULL, 'Y escribió una carta en estos términos:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 23, 26, NULL, 'Claudio Lisias al excelentísimo gobernador Félix: Salud.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 23, 27, NULL, 'A este hombre, aprehendido por los judíos, y que iban ellos a matar, lo libré yo acudiendo con la tropa, habiendo sabido que era ciudadano romano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 23, 28, NULL, 'Y queriendo saber la causa por qué le acusaban, le llevé al concilio de ellos;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 23, 29, NULL, 'y hallé que le acusaban por cuestiones de la ley de ellos, pero que ningún delito tenía digno de muerte o de prisión.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 23, 30, NULL, 'Pero al ser avisado de asechanzas que los judíos habían tendido contra este hombre, al punto le he enviado a ti, intimando también a los acusadores que traten delante de ti lo que tengan contra él. Pásalo bien.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 23, 31, NULL, 'Y los soldados, tomando a Pablo como se les ordenó, le llevaron de noche a Antípatris.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 23, 32, NULL, 'Y al día siguiente, dejando a los jinetes que fuesen con él, volvieron a la fortaleza.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 23, 33, NULL, 'Cuando aquellos llegaron a Cesarea, y dieron la carta al gobernador, presentaron también a Pablo delante de él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 23, 34, NULL, 'Y el gobernador, leída la carta, preguntó de qué provincia era; y habiendo entendido que era de Cilicia,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 23, 35, NULL, 'le dijo: Te oiré cuando vengan tus acusadores. Y mandó que le custodiasen en el pretorio de Herodes.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 24, 1, 'Defensa de Pablo ante Félix', 'Cinco días después, descendió el sumo sacerdote Ananías con algunos de los ancianos y un cierto orador llamado Tértulo, y comparecieron ante el gobernador contra Pablo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 24, 2, NULL, 'Y cuando este fue llamado, Tértulo comenzó a acusarle, diciendo: Como debido a ti gozamos de gran paz, y muchas cosas son bien gobernadas en el pueblo por tu prudencia,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 24, 3, NULL, 'oh excelentísimo Félix, lo recibimos en todo tiempo y en todo lugar con toda gratitud.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 24, 4, NULL, 'Pero por no molestarte más largamente, te ruego que nos oigas brevemente conforme a tu equidad.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 24, 5, NULL, 'Porque hemos hallado que este hombre es una plaga, y promotor de sediciones entre todos los judíos por todo el mundo, y cabecilla de la secta de los nazarenos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 24, 6, NULL, 'Intentó también profanar el templo; y prendiéndole, quisimos juzgarle conforme a nuestra ley.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 24, 7, NULL, 'Pero interviniendo el tribuno Lisias, con gran violencia le quitó de nuestras manos,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 24, 8, NULL, 'mandando a sus acusadores que viniesen a ti. Tú mismo, pues, al juzgarle, podrás informarte de todas estas cosas de que le acusamos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 24, 9, NULL, 'Los judíos también confirmaban, diciendo ser así todo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 24, 10, NULL, 'Habiéndole hecho señal el gobernador a Pablo para que hablase, este respondió: Porque sé que desde hace muchos años eres juez de esta nación, con buen ánimo haré mi defensa.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 24, 11, NULL, 'Como tú puedes cerciorarte, no hace más de doce días que subí a adorar a Jerusalén;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 24, 12, NULL, 'y no me hallaron disputando con ninguno, ni amotinando a la multitud; ni en el templo, ni en las sinagogas ni en la ciudad;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 24, 13, NULL, 'ni te pueden probar las cosas de que ahora me acusan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 24, 14, NULL, 'Pero esto te confieso, que según el Camino que ellos llaman herejía, así sirvo al Dios de mis padres, creyendo todas las cosas que en la ley y en los profetas están escritas;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 24, 15, NULL, 'teniendo esperanza en Dios, la cual ellos también abrigan, de que ha de haber resurrección de los muertos, así de justos como de injustos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 24, 16, NULL, 'Y por esto procuro tener siempre una conciencia sin ofensa ante Dios y ante los hombres.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 24, 17, NULL, 'Pero pasados algunos años, vine a hacer limosnas a mi nación y presentar ofrendas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 24, 18, NULL, 'Estaba en ello, cuando unos judíos de Asia me hallaron purificado en el templo, no con multitud ni con alboroto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 24, 19, NULL, 'Ellos debieran comparecer ante ti y acusarme, si contra mí tienen algo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 24, 20, NULL, 'O digan estos mismos si hallaron en mí alguna cosa mal hecha, cuando comparecí ante el concilio,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 24, 21, NULL, 'a no ser que estando entre ellos prorrumpí en alta voz: Acerca de la resurrección de los muertos soy juzgado hoy por vosotros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 24, 22, NULL, 'Entonces Félix, oídas estas cosas, estando bien informado de este Camino, les aplazó, diciendo: Cuando descendiere el tribuno Lisias, acabaré de conocer de vuestro asunto.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 24, 23, NULL, 'Y mandó al centurión que se custodiase a Pablo, pero que se le concediese alguna libertad, y que no impidiese a ninguno de los suyos servirle o venir a él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 24, 24, NULL, 'Algunos días después, viniendo Félix con Drusila su mujer, que era judía, llamó a Pablo, y le oyó acerca de la fe en Jesucristo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 24, 25, NULL, 'Pero al disertar Pablo acerca de la justicia, del dominio propio y del juicio venidero, Félix se espantó, y dijo: Ahora vete; pero cuando tenga oportunidad te llamaré.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 24, 26, NULL, 'Esperaba también con esto, que Pablo le diera dinero para que le soltase; por lo cual muchas veces lo hacía venir y hablaba con él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 24, 27, NULL, 'Pero al cabo de dos años recibió Félix por sucesor a Porcio Festo; y queriendo Félix congraciarse con los judíos, dejó preso a Pablo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 25, 1, 'Pablo apela a César', 'Llegado, pues, Festo a la provincia, subió de Cesarea a Jerusalén tres días después.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 25, 2, NULL, 'Y los principales sacerdotes y los más influyentes de los judíos se presentaron ante él contra Pablo, y le rogaron,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 25, 3, NULL, 'pidiendo contra él, como gracia, que le hiciese traer a Jerusalén; preparando ellos una celada para matarle en el camino.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 25, 4, NULL, 'Pero Festo respondió que Pablo estaba custodiado en Cesarea, adonde él mismo partiría en breve.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 25, 5, NULL, 'Los que de vosotros puedan, dijo, desciendan conmigo, y si hay algún crimen en este hombre, acúsenle.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 25, 6, NULL, 'Y deteniéndose entre ellos no más de ocho o diez días, venido a Cesarea, al siguiente día se sentó en el tribunal, y mandó que fuese traído Pablo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 25, 7, NULL, 'Cuando este llegó, lo rodearon los judíos que habían venido de Jerusalén, presentando contra él muchas y graves acusaciones, las cuales no podían probar;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 25, 8, NULL, 'alegando Pablo en su defensa: Ni contra la ley de los judíos, ni contra el templo, ni contra César he pecado en nada.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 25, 9, NULL, 'Pero Festo, queriendo congraciarse con los judíos, respondiendo a Pablo dijo: ¿Quieres subir a Jerusalén, y allá ser juzgado de estas cosas delante de mí?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 25, 10, NULL, 'Pablo dijo: Ante el tribunal de César estoy, donde debo ser juzgado. A los judíos no les he hecho ningún agravio, como tú sabes muy bien.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 25, 11, NULL, 'Porque si algún agravio, o cosa alguna digna de muerte he hecho, no rehúso morir; pero si nada hay de las cosas de que estos me acusan, nadie puede entregarme a ellos. A César apelo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 25, 12, NULL, 'Entonces Festo, habiendo hablado con el consejo, respondió: A César has apelado; a César irás.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 25, 13, 'Pablo ante Agripa y Berenice', 'Pasados algunos días, el rey Agripa y Berenice vinieron a Cesarea para saludar a Festo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 25, 14, NULL, 'Y como estuvieron allí muchos días, Festo expuso al rey la causa de Pablo, diciendo: Un hombre ha sido dejado preso por Félix,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 25, 15, NULL, 'respecto al cual, cuando fui a Jerusalén, se me presentaron los principales sacerdotes y los ancianos de los judíos, pidiendo condenación contra él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 25, 16, NULL, 'A estos respondí que no es costumbre de los romanos entregar alguno a la muerte antes que el acusado tenga delante a sus acusadores, y pueda defenderse de la acusación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 25, 17, NULL, 'Así que, habiendo venido ellos juntos acá, sin ninguna dilación, al día siguiente, sentado en el tribunal, mandé traer al hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 25, 18, NULL, 'Y estando presentes los acusadores, ningún cargo presentaron de los que yo sospechaba,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 25, 19, NULL, 'sino que tenían contra él ciertas cuestiones acerca de su religión, y de un cierto Jesús, ya muerto, el que Pablo afirmaba estar vivo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 25, 20, NULL, 'Yo, dudando en cuestión semejante, le pregunté si quería ir a Jerusalén y allá ser juzgado de estas cosas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 25, 21, NULL, 'Mas como Pablo apeló para que se le reservase para el conocimiento de Augusto, mandé que le custodiasen hasta que le enviara yo a César.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 25, 22, NULL, 'Entonces Agripa dijo a Festo: Yo también quisiera oír a ese hombre. Y él le dijo: Mañana le oirás.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 25, 23, NULL, 'Al otro día, viniendo Agripa y Berenice con mucha pompa, y entrando en la audiencia con los tribunos y principales hombres de la ciudad, por mandato de Festo fue traído Pablo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 25, 24, NULL, 'Entonces Festo dijo: Rey Agripa, y todos los varones que estáis aquí juntos con nosotros, aquí tenéis a este hombre, respecto del cual toda la multitud de los judíos me ha demandado en Jerusalén y aquí, dando voces que no debe vivir más.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 25, 25, NULL, 'Pero yo, hallando que ninguna cosa digna de muerte ha hecho, y como él mismo apeló a Augusto, he determinado enviarle a él.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 25, 26, NULL, 'Como no tengo cosa cierta que escribir a mi señor, le he traído ante vosotros, y mayormente ante ti, oh rey Agripa, para que después de examinarle, tenga yo qué escribir.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 25, 27, NULL, 'Porque me parece fuera de razón enviar un preso, y no informar de los cargos que haya en su contra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 26, 1, 'Defensa de Pablo ante Agripa', 'Entonces Agripa dijo a Pablo: Se te permite hablar por ti mismo. Pablo entonces, extendiendo la mano, comenzó así su defensa:', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 26, 2, NULL, 'Me tengo por dichoso, oh rey Agripa, de que haya de defenderme hoy delante de ti de todas las cosas de que soy acusado por los judíos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 26, 3, NULL, 'Mayormente porque tú conoces todas las costumbres y cuestiones que hay entre los judíos; por lo cual te ruego que me oigas con paciencia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 26, 4, 'Vida anterior de Pablo', 'Mi vida, pues, desde mi juventud, la cual desde el principio pasé en mi nación, en Jerusalén, la conocen todos los judíos;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 26, 5, NULL, 'los cuales también saben que yo desde el principio, si quieren testificarlo, conforme a la más rigurosa secta de nuestra religión, viví fariseo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 26, 6, NULL, 'Y ahora, por la esperanza de la promesa que hizo Dios a nuestros padres soy llamado a juicio;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 26, 7, NULL, 'promesa cuyo cumplimiento esperan que han de alcanzar nuestras doce tribus, sirviendo constantemente a Dios de día y de noche. Por esta esperanza, oh rey Agripa, soy acusado por los judíos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 26, 8, NULL, '¡Qué! ¿Se juzga entre vosotros cosa increíble que Dios resucite a los muertos?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 26, 9, 'Pablo el perseguidor', 'Yo ciertamente había creído mi deber hacer muchas cosas contra el nombre de Jesús de Nazaret;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 26, 10, NULL, 'lo cual también hice en Jerusalén. Yo encerré en cárceles a muchos de los santos, habiendo recibido poderes de los principales sacerdotes; y cuando los mataron, yo di mi voto.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 26, 11, NULL, 'Y muchas veces, castigándolos en todas las sinagogas, los forcé a blasfemar; y enfurecido sobremanera contra ellos, los perseguí hasta en las ciudades extranjeras.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 26, 12, 'Pablo relata su conversión', 'Ocupado en esto, iba yo a Damasco con poderes y en comisión de los principales sacerdotes,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 26, 13, NULL, 'cuando a mediodía, oh rey, yendo por el camino, vi una luz del cielo que sobrepasaba el resplandor del sol, la cual me rodeó a mí y a los que iban conmigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 26, 14, NULL, 'Y habiendo caído todos nosotros en tierra, oí una voz que me hablaba, y decía en lengua hebrea: Saulo, Saulo, ¿por qué me persigues? Dura cosa te es dar coces contra el aguijón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 26, 15, NULL, 'Yo entonces dije: ¿Quién eres, Señor? Y el Señor dijo: Yo soy Jesús, a quien tú persigues.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 26, 16, NULL, 'Pero levántate, y ponte sobre tus pies; porque para esto he aparecido a ti, para ponerte por ministro y testigo de las cosas que has visto, y de aquellas en que me apareceré a ti,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 26, 17, NULL, 'librándote de tu pueblo, y de los gentiles, a quienes ahora te envío,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 26, 18, NULL, 'para que abras sus ojos, para que se conviertan de las tinieblas a la luz, y de la potestad de Satanás a Dios; para que reciban, por la fe que es en mí, perdón de pecados y herencia entre los santificados.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 26, 19, 'Pablo obedece a la visión', 'Por lo cual, oh rey Agripa, no fui rebelde a la visión celestial,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 26, 20, NULL, 'sino que anuncié primeramente a los que están en Damasco, y Jerusalén, y por toda la tierra de Judea, y a los gentiles, que se arrepintiesen y se convirtiesen a Dios, haciendo obras dignas de arrepentimiento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 26, 21, NULL, 'Por causa de esto los judíos, prendiéndome en el templo, intentaron matarme.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 26, 22, NULL, 'Pero habiendo obtenido auxilio de Dios, persevero hasta el día de hoy, dando testimonio a pequeños y a grandes, no diciendo nada fuera de las cosas que los profetas y Moisés dijeron que habían de suceder:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 26, 23, NULL, 'Que el Cristo había de padecer, y ser el primero de la resurrección de los muertos, para anunciar luz al pueblo y a los gentiles.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 26, 24, 'Pablo insta a Agripa a que crea', 'Diciendo él estas cosas en su defensa, Festo a gran voz dijo: Estás loco, Pablo; las muchas letras te vuelven loco.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 26, 25, NULL, 'Mas él dijo: No estoy loco, excelentísimo Festo, sino que hablo palabras de verdad y de cordura.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 26, 26, NULL, 'Pues el rey sabe estas cosas, delante de quien también hablo con toda confianza. Porque no pienso que ignora nada de esto; pues no se ha hecho esto en algún rincón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 26, 27, NULL, '¿Crees, oh rey Agripa, a los profetas? Yo sé que crees.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 26, 28, NULL, 'Entonces Agripa dijo a Pablo: Por poco me persuades a ser cristiano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 26, 29, NULL, 'Y Pablo dijo: ¡Quisiera Dios que por poco o por mucho, no solamente tú, sino también todos los que hoy me oyen, fueseis hechos tales cual yo soy, excepto estas cadenas!', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 26, 30, NULL, 'Cuando había dicho estas cosas, se levantó el rey, y el gobernador, y Berenice, y los que se habían sentado con ellos;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 26, 31, NULL, 'y cuando se retiraron aparte, hablaban entre sí, diciendo: Ninguna cosa digna ni de muerte ni de prisión ha hecho este hombre.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 26, 32, NULL, 'Y Agripa dijo a Festo: Podía este hombre ser puesto en libertad, si no hubiera apelado a César.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 1, 'Pablo es enviado a Roma', 'Cuando se decidió que habíamos de navegar para Italia, entregaron a Pablo y a algunos otros presos a un centurión llamado Julio, de la compañía Augusta.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 2, NULL, 'Y embarcándonos en una nave adramitena que iba a tocar los puertos de Asia, zarpamos, estando con nosotros Aristarco, macedonio de Tesalónica.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 3, NULL, 'Al otro día llegamos a Sidón; y Julio, tratando humanamente a Pablo, le permitió que fuese a los amigos, para ser atendido por ellos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 4, NULL, 'Y haciéndonos a la vela desde allí, navegamos a sotavento de Chipre, porque los vientos eran contrarios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 5, NULL, 'Habiendo atravesado el mar frente a Cilicia y Panfilia, arribamos a Mira, ciudad de Licia.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 6, NULL, 'Y hallando allí el centurión una nave alejandrina que zarpaba para Italia, nos embarcó en ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 7, NULL, 'Navegando muchos días despacio, y llegando a duras penas frente a Gnido, porque nos impedía el viento, navegamos a sotavento de Creta, frente a Salmón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 8, NULL, 'Y costeándola con dificultad, llegamos a un lugar que llaman Buenos Puertos, cerca del cual estaba la ciudad de Lasea.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 9, NULL, 'Y habiendo pasado mucho tiempo, y siendo ya peligrosa la navegación, por haber pasado ya el ayuno, Pablo les amonestaba,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 10, NULL, 'diciéndoles: Varones, veo que la navegación va a ser con perjuicio y mucha pérdida, no solo del cargamento y de la nave, sino también de nuestras personas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 11, NULL, 'Pero el centurión daba más crédito al piloto y al patrón de la nave, que a lo que Pablo decía.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 12, NULL, 'Y siendo incómodo el puerto para invernar, la mayoría acordó zarpar también de allí, por si pudiesen arribar a Fenice, puerto de Creta que mira al nordeste y sudeste, e invernar allí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 13, 'La tempestad en el mar', 'Y soplando una brisa del sur, pareciéndoles que ya tenían lo que deseaban, levaron anclas e iban costeando Creta.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 14, NULL, 'Pero no mucho después dio contra la nave un viento huracanado llamado Euroclidón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 15, NULL, 'Y siendo arrebatada la nave, y no pudiendo poner proa al viento, nos abandonamos a él y nos dejamos llevar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 16, NULL, 'Y habiendo corrido a sotavento de una pequeña isla llamada Clauda, con dificultad pudimos recoger el esquife.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 17, NULL, 'Y una vez subido a bordo, usaron de refuerzos para ceñir la nave; y teniendo temor de dar en la Sirte, arriaron las velas y quedaron a la deriva.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 18, NULL, 'Pero siendo combatidos por una furiosa tempestad, al siguiente día empezaron a alijar,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 19, NULL, 'y al tercer día con nuestras propias manos arrojamos los aparejos de la nave.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 20, NULL, 'Y no apareciendo ni sol ni estrellas por muchos días, y acosados por una tempestad no pequeña, ya habíamos perdido toda esperanza de salvarnos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 21, NULL, 'Entonces Pablo, como hacía ya mucho que no comíamos, puesto en pie en medio de ellos, dijo: Habría sido por cierto conveniente, oh varones, haberme oído, y no zarpar de Creta tan solo para recibir este perjuicio y pérdida.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 22, NULL, 'Pero ahora os exhorto a tener buen ánimo, pues no habrá ninguna pérdida de vida entre vosotros, sino solamente de la nave.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 23, NULL, 'Porque esta noche ha estado conmigo el ángel del Dios de quien soy y a quien sirvo,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 24, NULL, 'diciendo: Pablo, no temas; es necesario que comparezcas ante César; y he aquí, Dios te ha concedido todos los que navegan contigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 25, NULL, 'Por tanto, oh varones, tened buen ánimo; porque yo confío en Dios que será así como se me ha dicho.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 26, NULL, 'Con todo, es necesario que demos en alguna isla.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 27, NULL, 'Venida la decimacuarta noche, y siendo llevados a través del mar Adriático, a la medianoche los marineros sospecharon que estaban cerca de tierra;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 28, NULL, 'y echando la sonda, hallaron veinte brazas; y pasando un poco más adelante, volviendo a echar la sonda, hallaron quince brazas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 29, NULL, 'Y temiendo dar en escollos, echaron cuatro anclas por la popa, y ansiaban que se hiciese de día.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 30, NULL, 'Entonces los marineros procuraron huir de la nave, y echando el esquife al mar, aparentaban como que querían largar las anclas de proa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 31, NULL, 'Pero Pablo dijo al centurión y a los soldados: Si estos no permanecen en la nave, vosotros no podéis salvaros.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 32, NULL, 'Entonces los soldados cortaron las amarras del esquife y lo dejaron perderse.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 33, NULL, 'Cuando comenzó a amanecer, Pablo exhortaba a todos que comiesen, diciendo: Este es el decimocuarto día que veláis y permanecéis en ayunas, sin comer nada.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 34, NULL, 'Por tanto, os ruego que comáis por vuestra salud; pues ni aun un cabello de la cabeza de ninguno de vosotros perecerá.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 35, NULL, 'Y habiendo dicho esto, tomó el pan y dio gracias a Dios en presencia de todos, y partiéndolo, comenzó a comer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 36, NULL, 'Entonces todos, teniendo ya mejor ánimo, comieron también.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 37, NULL, 'Y éramos todas las personas en la nave doscientas setenta y seis.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 38, NULL, 'Y ya satisfechos, aligeraron la nave, echando el trigo al mar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 39, 'El naufragio', 'Cuando se hizo de día, no reconocían la tierra, pero veían una ensenada que tenía playa, en la cual acordaron varar, si pudiesen, la nave.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 40, NULL, 'Cortando, pues, las anclas, las dejaron en el mar, largando también las amarras del timón; e izada al viento la vela de proa, enfilaron hacia la playa.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 41, NULL, 'Pero dando en un lugar de dos aguas, hicieron encallar la nave; y la proa, hincada, quedó inmóvil, y la popa se abría con la violencia del mar.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 42, NULL, 'Entonces los soldados acordaron matar a los presos, para que ninguno se fugase nadando.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 43, NULL, 'Pero el centurión, queriendo salvar a Pablo, les impidió este intento, y mandó que los que pudiesen nadar se echasen los primeros, y saliesen a tierra;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 27, 44, NULL, 'y los demás, parte en tablas, parte en cosas de la nave. Y así aconteció que todos se salvaron saliendo a tierra.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 28, 1, 'Pablo en la isla de Malta', 'Estando ya a salvo, supimos que la isla se llamaba Malta.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 28, 2, NULL, 'Y los naturales nos trataron con no poca humanidad; porque encendiendo un fuego, nos recibieron a todos, a causa de la lluvia que caía, y del frío.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 28, 3, NULL, 'Entonces, habiendo recogido Pablo algunas ramas secas, las echó al fuego; y una víbora, huyendo del calor, se le prendió en la mano.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 28, 4, NULL, 'Cuando los naturales vieron la víbora colgando de su mano, se decían unos a otros: Ciertamente este hombre es homicida, a quien, escapado del mar, la justicia no deja vivir.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 28, 5, NULL, 'Pero él, sacudiendo la víbora en el fuego, ningún daño padeció.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 28, 6, NULL, 'Ellos estaban esperando que él se hinchase, o cayese muerto de repente; mas habiendo esperado mucho, y viendo que ningún mal le venía, cambiaron de parecer y dijeron que era un dios.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 28, 7, NULL, 'En aquellos lugares había propiedades del hombre principal de la isla, llamado Publio, quien nos recibió y hospedó solícitamente tres días.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 28, 8, NULL, 'Y aconteció que el padre de Publio estaba en cama, enfermo de fiebre y de disentería; y entró Pablo a verle, y después de haber orado, le impuso las manos, y le sanó.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 28, 9, NULL, 'Hecho esto, también los otros que en la isla tenían enfermedades, venían, y eran sanados;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 28, 10, NULL, 'los cuales también nos honraron con muchas atenciones; y cuando zarpamos, nos cargaron de las cosas necesarias.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 28, 11, 'Pablo llega a Roma', 'Pasados tres meses, nos hicimos a la vela en una nave alejandrina que había invernado en la isla, la cual tenía por enseña a Cástor y Pólux.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 28, 12, NULL, 'Y llegados a Siracusa, estuvimos allí tres días.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 28, 13, NULL, 'De allí, costeando alrededor, llegamos a Regio; y otro día después, soplando el viento sur, llegamos al segundo día a Puteoli,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 28, 14, NULL, 'donde habiendo hallado hermanos, nos rogaron que nos quedásemos con ellos siete días; y luego fuimos a Roma,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 28, 15, NULL, 'de donde, oyendo de nosotros los hermanos, salieron a recibirnos hasta el Foro de Apio y las Tres Tabernas; y al verlos, Pablo dio gracias a Dios y cobró aliento.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 28, 16, NULL, 'Cuando llegamos a Roma, el centurión entregó los presos al prefecto militar, pero a Pablo se le permitió vivir aparte, con un soldado que le custodiase.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 28, 17, 'Pablo predica en Roma', 'Aconteció que tres días después, Pablo convocó a los principales de los judíos, a los cuales, luego que estuvieron reunidos, les dijo: Yo, varones hermanos, no habiendo hecho nada contra el pueblo, ni contra las costumbres de nuestros padres, he sido entregado preso desde Jerusalén en manos de los romanos;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 28, 18, NULL, 'los cuales, habiéndome examinado, me querían soltar, por no haber en mí ninguna causa de muerte.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 28, 19, NULL, 'Pero oponiéndose los judíos, me vi obligado a apelar a César; no porque tenga de qué acusar a mi nación.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 28, 20, NULL, 'Así que por esta causa os he llamado para veros y hablaros; porque por la esperanza de Israel estoy sujeto con esta cadena.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 28, 21, NULL, 'Entonces ellos le dijeron: Nosotros ni hemos recibido de Judea cartas acerca de ti, ni ha venido alguno de los hermanos que haya denunciado o hablado algún mal de ti.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 28, 22, NULL, 'Pero querríamos oír de ti lo que piensas; porque de esta secta nos es notorio que en todas partes se habla contra ella.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 28, 23, NULL, 'Y habiéndole señalado un día, vinieron a él muchos a la posada, a los cuales les declaraba y les testificaba el reino de Dios desde la mañana hasta la tarde, persuadiéndoles acerca de Jesús, tanto por la ley de Moisés como por los profetas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 28, 24, NULL, 'Y algunos asentían a lo que se decía, pero otros no creían.', 0, 'spa', 'RVR1960', NULL);\n"
;

  public static final String SQL_PARTE_5 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Hch', 28, 25, NULL, 'Y como no estuviesen de acuerdo entre sí, al retirarse, les dijo Pablo esta palabra: Bien habló el Espíritu Santo por medio del profeta Isaías a nuestros padres, diciendo:', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 28, 26, NULL, 'Ve a este pueblo, y diles: De oído oiréis, y no entenderéis; Y viendo veréis, y no percibiréis;', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 28, 27, NULL, 'Porque el corazón de este pueblo se ha engrosado, Y con los oídos oyeron pesadamente, Y sus ojos han cerrado, Para que no vean con los ojos, Y oigan con los oídos, Y entiendan de corazón, Y se conviertan, Y yo los sane.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 28, 28, NULL, 'Sabed, pues, que a los gentiles es enviada esta salvación de Dios; y ellos oirán.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 28, 29, NULL, 'Y cuando hubo dicho esto, los judíos se fueron, teniendo gran discusión entre sí.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 28, 30, NULL, 'Y Pablo permaneció dos años enteros en una casa alquilada, y recibía a todos los que a él venían,', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Hch', 28, 31, NULL, 'predicando el reino de Dios y enseñando acerca del Señor Jesucristo, abiertamente y sin impedimento.', 0, 'spa', 'RVR1960', NULL);\n"
;

}