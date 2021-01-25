package com.example.thechaneofbones;

import java.util.ArrayList;

public class Book {
    static ArrayList createBook () {
        ArrayList<Page> pagesOfTheBook = new ArrayList<>();
        pagesOfTheBook.add(new Page("Вступление", R.string.page_0_main_text, 0, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_1_main_text, 65, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_2_main_text, 294, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_3_main_text, 67, 24, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_4_main_text, 56, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_5_main_text, 36, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_6_main_text, 280, 275, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_7_main_text, 280, 275, -1, -1, -1));
//    pagesOfTheBook.add(new Page("Бой с трехголовым драконом", "Две энергетические стрелы вылетают из вашего жезла и вонзаются в дракона. Чёрный ядовитый пар вырывается из его ран, но дракон продолжает приближаться (жезл сейчас бесполезен, вы лишаетесь его).\n" +
//                " \n" +
//                " ТРЁХГОЛОВЫЙ ДРАКОН: Сила 12\n" +
//                " Бросьте игральную кость дважды.\n" +
//                " Очки от 0 до 2: Языки дракона мгновенно обвиваются вокруг вашего тела; жгучий яд убивает вас, и ваше приключение на этом заканчивается.\n" +
//                " Очки от 3 до 7: Дракон кусает вас. Вы теряете 4 пункта Силы.\n" +
//                " Очки от 8 до 12: Дракон получает удар мечом и теряет 3 пункта Силы.\n" +
//                " \n" +
//                " Если вы побеждаете, переход на 93.\n", 93, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_9_main_text, 283, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_10_main_text, 190, -1, -1, -1, -1));
//    pagesOfTheBook.add(new Page("Бой со вторым драконом", "Сейчас вам пригодится вся ваша Сила.\n" +
//                " \n" +
//                " ВТОРОЙ ДРАКОН: Сила 12\n" +
//                " Бросьте игральную кость два раза.\n" +
//                " Очки от 0 до 1: Пасти дракона извергают языки пламени, и вы сгораете во всеуничтожающем огне.\n" +
//                " Очки от 2 до 6: Дракон ранил вас; вы теряете 3 пункта Силы.\n" +
//                " Очки от 7 до 12: Дракон теряет 3 пункта Силы.\n" +
//                " \n" +
//                " Если вы побеждаете по итогам повторных поединков, то переходите на 68.\n", 68, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_12_main_text, 180, 50, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_13_main_text, -1, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_14_main_text, 12, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_15_main_text, 283, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_16_main_text, 120, 26, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_17_main_text, 186, -1, -1, -1, -1));
//    pagesOfTheBook.add(new Page("Бой с воином-лучником", "Ваше плечо касается одной из скульптурных фигурок - лучника - в тот момент, когда вы приземляетесь перед дверью. Фигурка, о которую вы ударяетесь, начинает расти. Воин вырастает до человеческих размеров и стреляет в вас из лука.\n" +
//                " \n" +
//                " ВОИН-ЛУЧНИК: Сила 9\n" +
//                " Бросьте свою кость дважды.\n" +
//                " Очки от 0 до 6: Стрела лучника попадает в вас, вы теряете 3 пункта Силы.\n" +
//                " Очки от 7 до 12: Вы уклоняетесь от стрелы, а лучник получает удар мечом и теряет 3 пункта Силы.\n" +
//                " Если вам выпадает ВОЛШЕБНОЕ КОЛЬЦО, ваши Силы восстанавливаются.\n" +
//                " \n" +
//                " Если вы побеждаете в поединке, то переходите на 269.\n", 269, -1, -1, -1, -1));
//    pagesOfTheBook.add(new Page("Бой с базарным войном", "Ваш противник ловок и силен. Он осторожно кружит вокруг вас, крутит мечом так, что лезвие сверкает в свете факела.\n" +
//                " \n" +
//                " БАЗАРНЫЙ ВОИН С МЕЧОМ: Сила 9\n" +
//                " Бросьте кость дважды.\n" +
//                " Очки от 0 до 7: Ваш противник ранит вас; вы теряете 3 пункта Силы.\n" +
//                " Очки от 8 до 12: Вы успешно обороняетесь и наносите воину удар мечом; он теряет 3 пункта Силы.\n" +
//                " Если вам выпадает ВОЛШЕБНОЕ КОЛЬЦО, ваши Силы полностью восстанавливаются.\n" +
//                " \n" +
//                " Если вы по итогам схваток побеждаете, переходите на 259.\n", 259, -1, -1, -1, -1));
//    pagesOfTheBook.add(new Page("", "От путника веет чем-то мрачным и зловещим. Вы ныряете в лес и в страхе убегаете. Отбежав достаточно, вы слышите шорох и замечаете, что незнакомец преследует вас, жалобно зовя по имени.\n" +
//                " Вы не слишком-то слушаете его, понимая, что этот человек представляет для вас опасность.\n" +
//                " Бросьте игральную кость один раз.\n" +
//                " Очки от 0 до 2 - переход на 182.\n" +
//                " Очки от 3 до 4 - переход на 232.\n" +
//                " Очки от 5 до 6 - переход на 39.\n" +
//                " ВОЛШЕБНОЕ КОЛЬЦО позволяет вам выбрать любой из номеров, предложенных выше.\n", 182, 232, 39, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_21_main_text, 153, 188, 177, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_22_main_text, 147, -1, -1, -1, -1));
//    pagesOfTheBook.add(new Page("Бой со вторым волком", "Судьба сейчас благоприятствует вам. Вы избавились от одного из волков.\n" +
//                " \n" +
//                " ВТОРОЙ ВОЛК: Сила 12\n" +
//                " Игральная кость бросается дважды.\n" +
//                " Очки от 0 до 6: Волк рвёт вас, и вы теряете 3 пункта Силы.\n" +
//                " Очки от 7 до 12: Вы успешно обороняетесь, и волк теряет 3 пункта Силы.\n" +
//                " Если вам выпало ВОЛШЕБНОЕ КОЛЬЦО, вы восстанавливаете свои Силы.\n" +
//                " \n" +
//                " Итоговая победа переводит вас на 230.\n", 230, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_24_main_text, 128, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_25_main_text, 256, 106, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_26_main_text, 102, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_27_main_text, -1, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_28_main_text, 42, 24, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_29_main_text, 186, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_30_main_text, 62, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_31_main_text, 12, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_32_main_text, 82, 98, -1, -1, -1));
//    pagesOfTheBook.add(new Page("Бой с разбойником", "Мальчик ведет вас по тёмным улицам. Вы хотите спросить, правильно ли он ведёт вас. Вдруг две одетые в чёрные плащи с капюшонами фигуры появляются из темноты. Вы видите, как они раскручивают над головой кистен. Разбойники бросаются к вам.\n" +
//                " Вы выхватываете меч, приготовившись защищаться. К вашему изумлению мальчишка подставляет ногу одному из разбойников, тот спотыкается и летит в канаву.\n" +
//                " У вас остаётся только один противник.\n" +
//                " \n" +
//                " РАЗБОЙНИК: Сила 9\n" +
//                " Дважды бросьте игральную кость.\n" +
//                " Очки от 0 до 6: Вас бьют кистенем, и вы теряете 3 пункта Силы.\n" +
//                " Очки от 7 до 12: Разбойник получает удар мечом и теряет 3 пункта Силы.\n" +
//                " Если вам выпало ВОЛШЕБНОЕ КОЛЬЦО, ваша Сила восстановилась.\n" +
//                " \n" +
//                " Если вы побеждаете, переходите на 195.\n", 195, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_34_main_text, 130, 14, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_35_main_text, 180, 176, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_36_main_text, 77, 126, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_37_main_text, 88, 20, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_38_main_text, 19, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_39_main_text, 46, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_40_main_text, -1, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_41_main_text, -1, -1, -1, -1, -1));
//    pagesOfTheBook.add(new Page("", R.string.page_42_main_text, 63, 3, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_43_main_text, 229, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_44_main_text, -1, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_45_main_text, 213, 135, 264, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_46_main_text, 190, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_47_main_text, 261, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_48_main_text, 190, 210, 123, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_49_main_text, 110, 165, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_50_main_text, 283, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_51_main_text, 146, -1, -1, -1, -1));
//    pagesOfTheBook.add(new Page("", R.string.page_52_main_text, 146, -1, -1, -1, -1));
//    pagesOfTheBook.add(new Page("Бой с гигантским жуком", R.string.page_53_main_text, 64, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_55_main_text, 285, 190, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_56_main_text, 76, 130, 31, -1, -1));
//    pagesOfTheBook.add(new Page("Бой с пещерным медведем", R.string.page_57_main_text, 274, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_58_main_text, 288, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_59_main_text, 297, -1, -1, -1, -1));
//    pagesOfTheBook.add(new Page("", R.string.page_60_main_text, 216, 212, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_61_main_text, 14, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_62_main_text, 22, 147, -1, -1, -1));
//    pagesOfTheBook.add(new Page("Бой с таинственным противником", R.string.page_63_main_text, 300, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_64_main_text, 242, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_65_main_text, 218, 190, 210, 123, -1));
        pagesOfTheBook.add(new Page("", R.string.page_66_main_text, 265, 203, -1, -1, -1));
//    pagesOfTheBook.add(new Page("", R.string.page_67_main_text, 63, 3, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_68_main_text, 236, -1, -1, -1, -1));
//    pagesOfTheBook.add(new Page("", R.string.page_69_main_text, 157, 86, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_70_main_text, 154, 40, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_71_main_text, 291, 201, 185, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_72_main_text, 162, 194, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_73_main_text, 141, 286, -1, -1, -1));
//    pagesOfTheBook.add(new Page("", R.string.page_74_main_text, 228, 117, 251, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_75_main_text, 163, 243, -1, -1, -1));
//    pagesOfTheBook.add(new Page("", R.string.page_76_main_text, 250, 264, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_77_main_text, 293, 196, -1, -1, -1));
//    pagesOfTheBook.add(new Page("Бой с гигантским червем", R.string.page_78_main_text, 299, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_79_main_text, 103, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_80_main_text, 174, 249, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_81_main_text, 133, 55, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_82_main_text, 275, -1, -1, -1, -1));
//    pagesOfTheBook.add(new Page("Бой с чудовищем из озера", R.string.page_83_main_text, 5, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_84_main_text, 161, 193, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_85_main_text, 75, 197, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_86_main_text, -1, -1, -1, -1, -1));
//    pagesOfTheBook.add(new Page("Бой с Федором", R.string.page_87_main_text, 144, 253, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_88_main_text, 298, -1, -1, -1, -1));
//    pagesOfTheBook.add(new Page("", R.string.page_89_main_text, 208, 44, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_90_main_text, 17, 70, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_91_main_text, 280, 275, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_92_main_text, 280, 275, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_93_main_text, 258, 240, 85, 197, -1));
        pagesOfTheBook.add(new Page("", R.string.page_94_main_text, 171, 287, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_95_main_text, -1, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_96_main_text, 123, 190, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_97_main_text, 107, 115, 83, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_98_main_text, 275, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_99_main_text, 140, 49, -1, -1, -1));
//    pagesOfTheBook.add(new Page("Бой с трехглавым драконом", R.string.page_100_main_text, 93, -1, -1, -1, -1));
//    pagesOfTheBook.add(new Page("", R.string.page_101_main_text, 204, 244, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_102_main_text, 282, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_103_main_text, 242, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_104_main_text, 180, 15, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_105_main_text, 297, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_106_main_text, 262, 266, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_107_main_text, 237, 272, -1, -1, -1));
//    pagesOfTheBook.add(new Page("", R.string.page_108_main_text, 47, 278, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_109_main_text, 284, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_110_main_text, -1, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_111_main_text, -1, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_112_main_text, 37, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_113_main_text, 130, 31, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_114_main_text, 190, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_115_main_text, 56, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_116_main_text, 298, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_117_main_text, 162, 51, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_118_main_text, 14, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_119_main_text, 190, 210, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_120_main_text, -1, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_121_main_text, 87, 28, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_122_main_text, 62, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_123_main_text, 134, 10, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_124_main_text, 138, 69, 189, -1, -1));
//    pagesOfTheBook.add(new Page("Бой с волком", R.string.page_125_main_text, 23, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_126_main_text, 114, -1, -1, -1, -1));
//    pagesOfTheBook.add(new Page("", R.string.page_127_main_text, 187, 48, 119, 119, -1));
//    pagesOfTheBook.add(new Page("Бой с таинственным злодеем", R.string.page_128_main_text, 191, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_129_main_text, 124, 137, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_130_main_text, 205, 61, 118, 34, -1));
        pagesOfTheBook.add(new Page("", R.string.page_131_main_text, 57, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_132_main_text, 147, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_133_main_text, 143, 217, -1, -1, -1));
//    pagesOfTheBook.add(new Page("Бой с варягом", R.string.page_134_main_text, 112, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_135_main_text, 66, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_136_main_text, 256, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_137_main_text, 41, 290, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_138_main_text, -1, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_139_main_text, 158, 36, 4, -1, -1));
//    pagesOfTheBook.add(new Page("Бой с предводителем разбойников", R.string.page_140_main_text, 9, 9, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_141_main_text, 271, 238, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_142_main_text, -1, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_143_main_text, 96, 217, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_144_main_text, 286, 190, -1, -1, -1));
//    pagesOfTheBook.add(new Page("Бой с первым половцем", R.string.page_145_main_text, 234, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_146_main_text, 84, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_147_main_text, 177, 21, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_148_main_text, 271, 238, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_149_main_text, 53, 111, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_150_main_text, 186, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_151_main_text, 283, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_152_main_text, 146, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_153_main_text, 200, -1, -1, -1, -1));
//    pagesOfTheBook.add(new Page("Бой с гигантским червем", R.string.page_154_main_text, 299, -1, -1, -1, -1));
//    pagesOfTheBook.add(new Page("Бой с разбойником", R.string.page_155_main_text, 9, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_156_main_text, 220, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_157_main_text, 283, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_158_main_text, 164, 97, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_159_main_text, 216, 122, 244, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_160_main_text, 179, -1, -1, -1, -1)); //добавить кнопку взять веревку, есил игрок захочет взять ее с собой
        pagesOfTheBook.add(new Page("", R.string.page_161_main_text, 296, 193, -1, -1, -1));
//    pagesOfTheBook.add(new Page("", R.string.page_162_main_text, 261, 278, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_163_main_text, 90, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_164_main_text, 113, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_165_main_text, 221, 245, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_166_main_text, 193, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_167_main_text, -1, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_168_main_text, 276, 104, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_169_main_text, 84, -1, -1, -1, -1));
//    pagesOfTheBook.add(new Page("Бой с женщиной-росомахой", R.string.page_170_main_text, 39, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_171_main_text, 271, 287, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_172_main_text, -1, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_173_main_text, 225, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_174_main_text, 249, -1, -1, -1, -1));
//    pagesOfTheBook.add(new Page("Бой с трехглавым драконом", R.string.page_175_main_text, 93, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_176_main_text, 283, -1, -1, -1, -1));
//    pagesOfTheBook.add(new Page("", R.string.page_177_main_text, 200, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_178_main_text, 19, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_179_main_text, 172, 169, 84, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_180_main_text, -1, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_181_main_text, 62, -1, -1, -1, -1));
//    pagesOfTheBook.add(new Page("Бой со стаей волков", R.string.page_182_main_text, 219, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_183_main_text, 178, 38, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_184_main_text, 186, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_185_main_text, 166, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_186_main_text, 222, 270, 79, -1, -1));
//    pagesOfTheBook.add(new Page("Бой с мошенником", R.string.page_187_main_text, 119, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_188_main_text, 200, -1, -1, -1, -1));
//    pagesOfTheBook.add(new Page("", R.string.page_189_main_text, 157, 86, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_190_main_text, 33, 214, 218, 123, -1));
        pagesOfTheBook.add(new Page("", R.string.page_191_main_text, 105, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_192_main_text, 149, 29, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_193_main_text, 58, 132, 209, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_194_main_text, 260, 108, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_195_main_text, 199, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_196_main_text, -1, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_197_main_text, 72, 85, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_198_main_text, 62, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_199_main_text, 105, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_200_main_text, 277, 175, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_201_main_text, 166, -1, -1, -1, -1)); //отметить в инвентаре, что волшебный глаз поместили на плащ
        pagesOfTheBook.add(new Page("", R.string.page_202_main_text, 294, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_203_main_text, 62, -1, -1, -1, -1));
//    pagesOfTheBook.add(new Page("", R.string.page_204_main_text, 263, 18, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_205_main_text, 130, 14, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_206_main_text, 30, 101, 226, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_207_main_text, 174, 249, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_208_main_text, 85, 197, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_209_main_text, 60, 207, 214, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_210_main_text, 81, 190, 123, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_211_main_text, 238, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_212_main_text, -1, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_213_main_text, 66, -1, -1, -1, -1));
//    pagesOfTheBook.add(new Page("Бой с когтистой рукой", R.string.page_214_main_text, 80, -1, -1, -1, -1)); //если выпадет волшебное кольцо, то автоматическая победа
        pagesOfTheBook.add(new Page("", R.string.page_215_main_text, 174, 249, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_216_main_text, 62, -1, -1, -1, -1));
//    pagesOfTheBook.add(new Page("", R.string.page_217_main_text, 121, 16, 190, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_218_main_text, 48, 127, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_219_main_text, 190, -1, -1, -1, -1)); //тут нужна проверка на наличие порции воды в инвентаре и если ее нет, то вычесть 3 пункта силы
        pagesOfTheBook.add(new Page("", R.string.page_220_main_text, 160, 95, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_221_main_text, 301, 245, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_222_main_text, 70, 149, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_223_main_text, 148, 238, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_224_main_text, 25, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_225_main_text, 254, 45, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_226_main_text, 198, 181, -1, -1, -1));
//    pagesOfTheBook.add(new Page("Бой с половцем", R.string.page_227_main_text, 160, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_228_main_text, 146, -1, -1, -1, -1)); //нужно так же вычесть 1 ловкость из характеристик персотажа
        pagesOfTheBook.add(new Page("", R.string.page_229_main_text, 186, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_230_main_text, 56, -1, -1, -1, -1));
//    pagesOfTheBook.add(new Page("Бой с трехглавым драконом", R.string.page_231_main_text, 93, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_232_main_text, 170, 39, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_233_main_text, 280, 276, -1, -1, -1));
//    pagesOfTheBook.add(new Page("Бой со вторым половцем", R.string.page_234_main_text, 160, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_235_main_text, 227, 268, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_236_main_text, 32, 280, 275, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_237_main_text, 116, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_238_main_text, 273, 131, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_239_main_text, 62, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_240_main_text, 43, 89, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_241_main_text, 248, 289, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_242_main_text, 245, 165, -1, -1, -1));
//    pagesOfTheBook.add(new Page("", R.string.page_243_main_text, 54, 167, -1, -1, -1));
//    pagesOfTheBook.add(new Page("Бой с деревянным воином", R.string.page_244_main_text, 246, -1, -1, -1, -1)); //если выпадает волшебное кольцо, то это автоматическая победа
        pagesOfTheBook.add(new Page("", R.string.page_245_main_text, -1, -1, -1, -1, -1));
//    pagesOfTheBook.add(new Page("", R.string.page_246_main_text, 263, 18, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_247_main_text, 73, 94, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_248_main_text, 225, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_249_main_text, 238, 257, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_250_main_text, 31, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_251_main_text, 146, -1, -1, -1, -1));
//    pagesOfTheBook.add(new Page("Бой с зеркальным двойником", R.string.page_252_main_text, 136, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_253_main_text, 190, -1, -1, -1, -1));
//    pagesOfTheBook.add(new Page("", R.string.page_254_main_text, 263, 18, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_255_main_text, -1, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_256_main_text, 27, 241, 292, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_257_main_text, 73, 238, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_258_main_text, 184, 166, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_259_main_text, 59, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_260_main_text, 261, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_261_main_text, 192, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_262_main_text, 239, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_263_main_text, 62, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_264_main_text, 31, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_265_main_text, 62, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_266_main_text, 233, 211, 238, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_267_main_text, 52, 159, -1, -1, -1));
//    pagesOfTheBook.add(new Page("Бой со скелетом", R.string.page_268_main_text, 179, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_269_main_text, 66, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_270_main_text, 149, 70, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_271_main_text, 262, 267, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_272_main_text, 116, -1, -1, -1, -1));
//    pagesOfTheBook.add(new Page("Бой с пещерным медведем", R.string.page_273_main_text, 274, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_274_main_text, 281, 247, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_275_main_text, 129, 168, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_276_main_text, -1, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_277_main_text, 100, 8, 231, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_278_main_text, -1, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_279_main_text, 235, 146, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_280_main_text, 7, 233, 91, 6, 92));
        pagesOfTheBook.add(new Page("", R.string.page_281_main_text, 224, 25, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_282_main_text, 99, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_283_main_text, 279, -1, -1, -1, -1));
//    pagesOfTheBook.add(new Page("Бой с первым драконом", R.string.page_284_main_text, 11, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_285_main_text, 126, 190, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_286_main_text, 266, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_287_main_text, 281, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_288_main_text, 27, 241, 292, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_289_main_text, -1, -1, -1, -1, -1));
//    pagesOfTheBook.add(new Page("", R.string.page_290_main_text, 151, 13, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_291_main_text, 185, 166, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_292_main_text, 173, 255, -1, -1, -1)); //про алтарь и волшебные вещи
        pagesOfTheBook.add(new Page("", R.string.page_293_main_text, 35, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_294_main_text, 109, 142, 284, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_295_main_text, -1, -1, -1, -1, -1));
//    pagesOfTheBook.add(new Page("Бой с механическим раком", R.string.page_296_main_text, 71, -1, -1, -1, -1)); // возможно раков поменять на крабов
//    pagesOfTheBook.add(new Page("Бой со злодеем", R.string.page_297_main_text, 139, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_298_main_text, 2, 202, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_299_main_text, 242, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_300_main_text, 59, 183, -1, -1, -1));
        pagesOfTheBook.add(new Page("", R.string.page_301_main_text, -1, -1, -1, -1, -1));
        pagesOfTheBook.add(new Page("Приветствую тебя, герой!", R.string.page_302_main_text, 0, -1, -1, -1, -1));






        return pagesOfTheBook;
    }
}