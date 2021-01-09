package com.example.thechaneofbones;

import java.util.ArrayList;

public class Book {
    static ArrayList createBook () {
    ArrayList<Page> pagesOfTheBook = new ArrayList<>();
    pagesOfTheBook.add(new Page("Вступление", R.string.page_0_main_text, 1, -1, -1, -1, -1));
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
//    pagesOfTheBook.add(new Page("Бой с вторым драконом", "Сейчас вам пригодится вся ваша Сила.\n" +
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
//    pagesOfTheBook.add(new Page("Бой с Базарным войном", "Ваш противник ловок и силен. Он осторожно кружит вокруг вас, крутит мечом так, что лезвие сверкает в свете факела.\n" +
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
//    pagesOfTheBook.add(new Page("Бой с вторым волком", "Судьба сейчас благоприятствует вам. Вы избавились от одного из волков.\n" +
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
//    pagesOfTheBook.add(new Page("Бой с черным трехглавым драконом", R.string.page_100_main_text, 93, -1, -1, -1, -1));
//    pagesOfTheBook.add(new Page("", R.string.page_101_main_text, 204, 244, -1, -1, -1));
    pagesOfTheBook.add(new Page("", R.string.page_102_main_text, 282, -1, -1, -1, -1));


        return pagesOfTheBook;
    }
}