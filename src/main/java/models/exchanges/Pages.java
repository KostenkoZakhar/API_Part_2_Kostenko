package models.exchanges;

public enum Pages {

        CC1("1"),
        CC2("2"),
        CC3("3"),
        CC4("4"),
        CC5("5"),
        CC6("6"),
        CC7("7"),
        CC8("8"),
        CC9("9"),
        CC10("10"),
        CC11("11"),
        CC12("12"),
        CC13("13"),
        CC14("14"),
        CC15("15"),
        CC16("16"),
        CC17("17"),
        CC18("18"),
        CC19("19"),
        CC20("20"),
        CC21("21"),
        CC22("22"),
        CC23("23"),
        CC24("24"),
        CC25("25"),
        CC26("26"),
        CC27("27"),
        CC28("28"),
        CC29("29"),
        CC30("30"),
        CC31("31"),
        CC32("32"),
        CC33("33"),
        CC34("34"),
        CC35("35"),
        CC36("36"),
        CC37("37"),
        CC38("38"),
        CC39("39"),
        CC40("40"),
        CC41("41"),
        CC42("42");

        private final String pageNumber;

    Pages(String number) {
            this.pageNumber = number;
        }

        public String getPageNumber() {
            return pageNumber;
        }

}
