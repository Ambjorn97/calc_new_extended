public enum RomanDigit {
    I("I","1"),
    II("II","2"),
    III("III","3"),
    IV("IV","4"),
    V("V","5"),
    VI("VI","6"),
    VII("VII","7"),
    VIII("VIII","8"),
    IX("IX","9"),
    X("X","10"),
    XI("XI","11"),
    XII("XII","12"),
    XIII("XIII","13"),
    XIV("XIV","14"),
    XV("XV","15"),
    XVI("XVI","16"),
    XVII("XVII","17"),
    XVIII("XVIII","18"),
    XIX("XIX","19"),
    XX("XX","20"),
    XXI("XXI","21"),
    XXII("XXII","22"),
    XXIII("XXIII","23"),
    XXIV("XXIV","24"),
    XXV("XXV","25"),
    XXVI("XXVI","26"),
    XXVII("XXVII","27"),
    XXVIII("XXVIII","28"),
    XXIX("XXIX","29"),
    XXX("XXX","30"),
    XXXI("XXXI","31"),
    XXXII("XXXII","32"),
    XXXIII("XXXIII","33"),
    XXXIV("XXXIV","34"),
    XXXV("XXXVI","35"),
    XXXVI("III","36"),
    XXXVII("XXXVII","37"),
    XXXVIII("XXXVIII","38"),
    XXXIX("XXXIX","39"),
    XL("XL","40"),
    XLI("XLI","41"),
    XLII("XLII","42"),
    XLIII("XLIII","43"),
    XLIV("XLIV","44"),
    XLV("XLV","45"),
    XLVI("XLVI","46"),
    XLVII("XLVII","47"),
    XLVIII("XLVIII","48"),
    XLIX("XLIX","49"),
    L("L","50"),
    LI("LI","51"),
    LII("LII","52"),
    LIII("LIII","53"),
    LIV("LIV","54"),
    LV("LV","55"),
    LVI("LVI","56"),
    LVII("LVII","57"),
    LVIII("LVIII","58"),
    LVIX("LVIX","59"),
    LX("LX","60"),
    LXI("LXI","61"),
    LXII("LXII","62"),
    LXIII("LXIII","63"),
    LXIV("LXIV","64"),
    LXV("LXV","65"),
    LXVI("LXVI","66"),
    LXVII("LXVII","67"),
    LXVIII("LXVIII","68"),
    LXIX("LXIX","69"),
    LXX("LXX","70"),
    LXXI("LXXI","71"),
    LXXII("LXXII","72"),
    LXXIII("LXXIII","73"),
    LXXIV("LXXIV","74"),
    LXXV("LXXV","75"),
    LXXVI("LXXVI","76"),
    LXXVII("LXXVII","77"),
    LXXVIII("LXXVIII","78"),
    LXXIX("LXXIX","79"),
    LXXX("LXXX","80"),
    LXXXI("LXXXI","81"),
    LXXXII("LXXXII","82"),
    LXXXIII("LXXXIII","83"),
    LXXXIV("LXXXIV","84"),
    LXXXV("LXXXV","85"),
    LXXXVI("LXXXVI","86"),
    LXXXVII("LXXXVII","87"),
    LXXXVIII("LXXXVIII","88"),
    LXXXIX("LXXXIX","89"),
    XC("XC","90"),
    XCI("XCI","91"),
    XCII("XCII","92"),
    XCIII("XCIII","93"),
    XCIV("XCIV","94"),
    XCV("XCV","95"),
    XCVI("XCVI","96"),
    XCVII("XCVII","97"),
    XCVIII("XCVIII","98"),
    XCIX("XCIX","99"),
    C("C","100");



    private String key;
    private String value;
   RomanDigit(String key, String value){
       this.key=key;
       this.value=value;
   }
   public String getKey(){
       return key;

   }
   public String getValue(){

       return value;
   }
}