package com.orellano.biblia360.daoSQLite.sql.spa;

public final class LoadNahum {
  public LoadNahum() {}
  public static final String SQL_PARTE_1 = 
    "INSERT INTO Versiculo (\n" +
    "    codLengua_vscl, codVersion_vscl, codLibro_vscl, codCapitulo_vscl, codVersiculo_vscl, encabezado_vscl,\n" +
    "    contenido_vscl,\n" +
    "    parrafo_vscl, codLengua_vscl_ltr, codVersion_vscl_ltr, codLectura_vscl_ltr)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Nah', 1, 1, 'La ira vengadora de Dios', 'Profecía sobre Nínive. Libro de la visión de Nahum de Elcos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 1, 2, NULL, 'Jehová es Dios celoso y vengador; Jehová es vengador y lleno de indignación; se venga de sus adversarios, y guarda enojo para sus enemigos.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 1, 3, NULL, 'Jehová es tardo para la ira y grande en poder, y no tendrá por inocente al culpable. Jehová marcha en la tempestad y el torbellino, y las nubes son el polvo de sus pies.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 1, 4, NULL, 'Él amenaza al mar, y lo hace secar, y agosta todos los ríos; Basán fue destruido, y el Carmelo, y la flor del Líbano fue destruida.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 1, 5, NULL, 'Los montes tiemblan delante de él, y los collados se derriten; la tierra se conmueve a su presencia, y el mundo, y todos los que en él habitan.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 1, 6, NULL, '¿Quién permanecerá delante de su ira?, ¿y quién quedará en pie en el ardor de su enojo? Su ira se derrama como fuego, y por él se hienden las peñas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 1, 7, NULL, 'Jehová es bueno, fortaleza en el día de la angustia; y conoce a los que en él confían.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 1, 8, NULL, 'Mas con inundación impetuosa consumirá a sus adversarios, y tinieblas perseguirán a sus enemigos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 1, 9, NULL, '¿Qué pensáis contra Jehová? Él hará consumación; no tomará venganza dos veces de sus enemigos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 1, 10, NULL, 'Aunque sean como espinos entretejidos, y estén empapados en su embriaguez, serán consumidos como hojarasca completamente seca.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 1, 11, NULL, 'De ti salió el que imaginó mal contra Jehová, un consejero perverso.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 1, 12, NULL, 'Así ha dicho Jehová: Aunque reposo tengan, y sean tantos, aun así serán talados, y él pasará. Bastante te he afligido; no te afligiré ya más.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 1, 13, NULL, 'Porque ahora quebraré su yugo de sobre ti, y romperé tus coyundas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 1, 14, NULL, 'Mas acerca de ti mandará Jehová, que no quede ni memoria de tu nombre; de la casa de tu dios destruiré escultura y estatua de fundición; allí pondré tu sepulcro, porque fuiste vil.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 1, 15, 'Anuncio de la caída de Nínive', 'He aquí sobre los montes los pies del que trae buenas nuevas, del que anuncia la paz. Celebra, oh Judá, tus fiestas, cumple tus votos; porque nunca más volverá a pasar por ti el malvado; pereció del todo.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 2, 1, NULL, 'Subió destruidor contra ti; guarda la fortaleza, vigila el camino, cíñete los lomos, refuerza mucho tu poder.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 2, 2, NULL, 'Porque Jehová restaurará la gloria de Jacob como la gloria de Israel; porque saqueadores los saquearon, y estropearon sus mugrones.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 2, 3, NULL, 'El escudo de sus valientes estará enrojecido, los varones de su ejército vestidos de grana; el carro como fuego de antorchas; el día que se prepare, temblarán las hayas.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 2, 4, NULL, 'Los carros se precipitarán a las plazas, con estruendo rodarán por las calles; su aspecto será como antorchas encendidas, correrán como relámpagos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 2, 5, NULL, 'Se acordará él de sus valientes; se atropellarán en su marcha; se apresurarán a su muro, y la defensa se preparará.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 2, 6, NULL, 'Las puertas de los ríos se abrirán, y el palacio será destruido.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 2, 7, NULL, 'Y la reina será cautiva; mandarán que suba, y sus criadas la llevarán gimiendo como palomas, golpeándose sus pechos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 2, 8, NULL, 'Fue Nínive de tiempo antiguo como estanque de aguas; pero ellos huyen. Dicen: ¡Deteneos, deteneos!; pero ninguno mira.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 2, 9, NULL, 'Saquead plata, saquead oro; no hay fin de las riquezas y suntuosidad de toda clase de efectos codiciables.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 2, 10, NULL, 'Vacía, agotada y desolada está, y el corazón desfallecido; temblor de rodillas, dolor en las entrañas, rostros demudados.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 2, 11, NULL, '¿Qué es de la guarida de los leones, y de la majada de los cachorros de los leones, donde se recogía el león y la leona, y los cachorros del león, y no había quien los espantase?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 2, 12, NULL, 'El león arrebataba en abundancia para sus cachorros, y ahogaba para sus leonas, y llenaba de presa sus cavernas, y de robo sus guaridas.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 2, 13, 'Destrucción total de Nínive', 'Heme aquí contra ti, dice Jehová de los ejércitos. Encenderé y reduciré a humo tus carros, y espada devorará tus leoncillos; y cortaré de la tierra tu robo, y nunca más se oirá la voz de tus mensajeros.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 3, 1, NULL, '¡Ay de ti, ciudad sanguinaria, toda llena de mentira y de rapiña, sin apartarte del pillaje!', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 3, 2, NULL, 'Chasquido de látigo, y fragor de ruedas, caballo atropellador, y carro que salta;', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 3, 3, NULL, 'jinete enhiesto, y resplandor de espada, y resplandor de lanza; y multitud de muertos, y multitud de cadáveres; cadáveres sin fin, y en sus cadáveres tropezarán,', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 3, 4, NULL, 'a causa de la multitud de las fornicaciones de la ramera de hermosa gracia, maestra en hechizos, que seduce a las naciones con sus fornicaciones, y a los pueblos con sus hechizos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 3, 5, NULL, 'Heme aquí contra ti, dice Jehová de los ejércitos, y descubriré tus faldas en tu rostro, y mostraré a las naciones tu desnudez, y a los reinos tu vergüenza.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 3, 6, NULL, 'Y echaré sobre ti inmundicias, y te afrentaré, y te pondré como estiércol.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 3, 7, NULL, 'Todos los que te vieren se apartarán de ti, y dirán: Nínive es asolada; ¿quién se compadecerá de ella? ¿Dónde te buscaré consoladores?', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 3, 8, NULL, '¿Eres tú mejor que Tebas, que estaba asentada junto al Nilo, rodeada de aguas, cuyo baluarte era el mar, y aguas por muro?', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 3, 9, NULL, 'Etiopía era su fortaleza, también Egipto, y eso sin límite; Fut y Libia fueron sus ayudadores.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 3, 10, NULL, 'Sin embargo ella fue llevada en cautiverio; también sus pequeños fueron estrellados en las encrucijadas de todas las calles, y sobre sus varones echaron suertes, y todos sus grandes fueron aprisionados con grillos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 3, 11, NULL, 'Tú también serás embriagada, y serás encerrada; tú también buscarás refugio a causa del enemigo.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 3, 12, NULL, 'Todas tus fortalezas serán cual higueras con brevas, que si las sacuden, caen en la boca del que las ha de comer.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 3, 13, NULL, 'He aquí, tu pueblo será como mujeres en medio de ti; las puertas de tu tierra se abrirán de par en par a tus enemigos; fuego consumirá tus cerrojos.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 3, 14, NULL, 'Provéete de agua para el asedio, refuerza tus fortalezas; entra en el lodo, pisa el barro, refuerza el horno.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 3, 15, NULL, 'Allí te consumirá el fuego, te talará la espada, te devorará como pulgón; multiplícate como langosta, multiplícate como el langostón.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 3, 16, NULL, 'Multiplicaste tus mercaderes más que las estrellas del cielo; la langosta hizo presa, y voló.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 3, 17, NULL, 'Tus príncipes serán como langostas, y tus grandes como nubes de langostas que se sientan en vallados en día de frío; salido el sol se van, y no se conoce el lugar donde están.', 0, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 3, 18, NULL, 'Durmieron tus pastores, oh rey de Asiria, reposaron tus valientes; tu pueblo se derramó por los montes, y no hay quien lo junte.', 1, 'spa', 'RVR1960', NULL),\n" +
    "('spa', 'RVR1960', 'Nah', 3, 19, NULL, 'No hay medicina para tu quebradura; tu herida es incurable; todos los que oigan tu fama batirán las manos sobre ti, porque ¿sobre quién no pasó continuamente tu maldad?', 0, 'spa', 'RVR1960', NULL);\n"
;

}