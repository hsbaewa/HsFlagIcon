package kr.co.hs.flagicon;


/**
 * Created by hsbaewa on 2017. 11. 17..
 */

public class Country implements CountryConst, CurrencyConst{
    private static String[] availableCountries = {
            ISOCODE3_AFGHANISTAN,
            ISOCODE3_ALBANIA,
            ISOCODE3_ALGERIA,
            ISOCODE3_AMERICAN_SAMOA,
            ISOCODE3_ANDORRA,
            ISOCODE3_ANGOLA,
            ISOCODE3_ANGUILLA,
            ISOCODE3_ANTARCTICA,
            ISOCODE3_ANTIGUA,
            ISOCODE3_ARGENTINA,
            ISOCODE3_ARMENIA,
            ISOCODE3_ARUBA,
            ISOCODE3_AUSTRALIA,
            ISOCODE3_AUSTRIA,
            ISOCODE3_AZERBAIJAN,
            ISOCODE3_BAHAMAS,
            ISOCODE3_BAHRAIN,
            ISOCODE3_BANGLADESH,
            ISOCODE3_BARBADOS,
            ISOCODE3_BELARUS,
            ISOCODE3_BELGIUM,
            ISOCODE3_BELIZE,
            ISOCODE3_BENIN,
            ISOCODE3_BERMUDA,
            ISOCODE3_BHUTAN,
            ISOCODE3_BOLIVIA,
            ISOCODE3_BOSNIA_AND_HERZEGOVINA,
            ISOCODE3_BOTSWANA,
            ISOCODE3_BRAZIL,
            ISOCODE3_BRITISH_INDIAN_OCEAN_TERRITORY,
            ISOCODE3_BRITISH_VIRGIN_ISLANDS,
            ISOCODE3_BRUNEI,
            ISOCODE3_BULGARIA,
            ISOCODE3_BURKINA_FASO,
            ISOCODE3_BURUNDI,
            ISOCODE3_CAMBODIA,
            ISOCODE3_CAMEROON,
            ISOCODE3_CANADA,
            ISOCODE3_CAPE_VERDE,
            ISOCODE3_CAYMAN_ISLANDS,
            ISOCODE3_CENTRAL_AFREICAN_REPUBLIC,
            ISOCODE3_CHAD,
            ISOCODE3_CHILE,
            ISOCODE3_CHINA,
            ISOCODE3_CHRISTMAS_ISLAND,
            ISOCODE3_COCOS_ISLANDS,
            ISOCODE3_COLOMBIA,
            ISOCODE3_COMOROS,
            ISOCODE3_COOK_ISLANDS,
            ISOCODE3_COSTA_RICA,
            ISOCODE3_CROATIA,
            ISOCODE3_CUBA,
            ISOCODE3_CURACAO,
            ISOCODE3_CYPRUS,
            ISOCODE3_CZECH_REPUBLIC,
            ISOCODE3_DEMOCRATIC_REPUBLIC_OF_CONGO,
            ISOCODE3_DENMARK,
            ISOCODE3_DJIBOUTI,
            ISOCODE3_DOMINICA,
            ISOCODE3_DOMINICAN_REPUBLIC,
            ISOCODE3_EAST_TIMOR,
            ISOCODE3_ECUADOR,
            ISOCODE3_EGYPT,
            ISOCODE3_EL_SALVADOR,
            ISOCODE3_EQUATORIAL_GUINEA,
            ISOCODE3_ERITREA,
            ISOCODE3_ESTONIA,
            ISOCODE3_ETHIOPIA,
            ISOCODE3_FALKLAND_ISLANDS,
            ISOCODE3_FAROE_ISLANDS,
            ISOCODE3_FIJI,
            ISOCODE3_FINLAND,
            ISOCODE3_FRANCE,
            ISOCODE3_FRENCH_POLYNESIA,
            ISOCODE3_GABON,
            ISOCODE3_GAMBIA,
            ISOCODE3_GEORGIA,
            ISOCODE3_GERMANY,
            ISOCODE3_GHANA,
            ISOCODE3_GIBRALTAR,
            ISOCODE3_GREECE,
            ISOCODE3_GREENLAND,
            ISOCODE3_GRENADA,
            ISOCODE3_GUAM,
            ISOCODE3_GUATEMALA,
            ISOCODE3_GUERNSEY,
            ISOCODE3_GUINEA,
            ISOCODE3_GUINEA_BISSAU,
            ISOCODE3_GUYANA,
            ISOCODE3_HAITI,
            ISOCODE3_HONDURAS,
            ISOCODE3_HONGKONG,
            ISOCODE3_HUNGARY,
            ISOCODE3_ICELAND,
            ISOCODE3_INDIA,
            ISOCODE3_INDONESIA,
            ISOCODE3_IRAN,
            ISOCODE3_IRAQ,
            ISOCODE3_IRELAND,
            ISOCODE3_ISLE_OF_MAN,
            ISOCODE3_ISRAEL,
            ISOCODE3_ITALY,
            ISOCODE3_IVORY_COAST ,
            ISOCODE3_JAMAICA,
            ISOCODE3_JAPAN,
            ISOCODE3_JERSEY,
            ISOCODE3_JORDAN,
            ISOCODE3_KAZAKHSTAN,
            ISOCODE3_KENYA,
            ISOCODE3_KIRIBATI,
            ISOCODE3_KOSOVO,
            ISOCODE3_KUWAIT,
            ISOCODE3_KYRGYZSTAN,
            ISOCODE3_LAOS,
            ISOCODE3_LATVIA,
            ISOCODE3_LEBANON,
            ISOCODE3_LESOTHO,
            ISOCODE3_LIBERIA,
            ISOCODE3_LIBYA,
            ISOCODE3_LIECHTENSTEIN,
            ISOCODE3_LITHUANIA,
            ISOCODE3_LUXEMBOURG,
            ISOCODE3_MACAU,
            ISOCODE3_MACEDONIA,
            ISOCODE3_MADAGASCAR,
            ISOCODE3_MALAWI,
            ISOCODE3_MALAYSIA,
            ISOCODE3_MALDIVES,
            ISOCODE3_MALI,
            ISOCODE3_MALTA,
            ISOCODE3_MARSHALL_ISLANDS,
            ISOCODE3_MAURITANIA,
            ISOCODE3_MAURITIUS,
            ISOCODE3_MAYOTTE,
            ISOCODE3_MEXICO,
            ISOCODE3_MICRONESIA,
            ISOCODE3_MOLDOVA,
            ISOCODE3_MONACO,
            ISOCODE3_MONGOLIA,
            ISOCODE3_MONTENEGRO,
            ISOCODE3_MONTSERRAT,
            ISOCODE3_MOROCCO,
            ISOCODE3_MOZAMBIQUE,
            ISOCODE3_MYANMAR,
            ISOCODE3_NAMIBIA,
            ISOCODE3_NAURU,
            ISOCODE3_NEPAL,
            ISOCODE3_NETHERLANDS,
            ISOCODE3_NETHERLANDS_ANTILLES,
            ISOCODE3_NEW_CALEDONIA,
            ISOCODE3_NEW_ZEALAND,
            ISOCODE3_NICARAGUA,
            ISOCODE3_NIGER,
            ISOCODE3_NIGERIA,
            ISOCODE3_NIUE,
            ISOCODE3_NORTH_KOREA,
            ISOCODE3_NORTHERN_MARIANA_ISLANDS,
            ISOCODE3_NORWAY,
            ISOCODE3_OMAN,
            ISOCODE3_PAKISTAN,
            ISOCODE3_PALAU,
            ISOCODE3_PALESTINE,
            ISOCODE3_PANAMA,
            ISOCODE3_PAPUA_NEW_GUINEA,
            ISOCODE3_PARAGUAY,
            ISOCODE3_PERU,
            ISOCODE3_PHILIPPINES,
            ISOCODE3_PITCAIRN,
            ISOCODE3_POLAND,
            ISOCODE3_PORTUGAL,
            ISOCODE3_PUERTO_RICO,
            ISOCODE3_QATAR,
            ISOCODE3_REPUBLIC_OF_THE_CONGO,
            ISOCODE3_REUNION,
            ISOCODE3_ROMANIA,
            ISOCODE3_RUSSIA,
            ISOCODE3_RWANDA,
            ISOCODE3_SAINT_BARTHELEMY,
            ISOCODE3_SAINT_HELENA,
            ISOCODE3_SAINT_KITTS_AND_NEVIS,
            ISOCODE3_SAINT_LUCIA,
            ISOCODE3_SAINT_MARTIN,
            ISOCODE3_SAINT_PIERRE_AND_MIQUELON,
            ISOCODE3_SAINT_VINCENT_AND_GRENADINES,
            ISOCODE3_SAMOA,
            ISOCODE3_SAN_MARINO,
            ISOCODE3_SAO_TOME_AND_PRINCIPE,
            ISOCODE3_SAUDI_ARABIA,
            ISOCODE3_SENEGAL,
            ISOCODE3_SERBIA,
            ISOCODE3_SEYCHELLES,
            ISOCODE3_SIERRA_LEONE,
            ISOCODE3_SINGAPORE,
            ISOCODE3_SINT_MAARTEN,
            ISOCODE3_SLOVAKIA,
            ISOCODE3_SLOVENIA,
            ISOCODE3_SOLOMON_ISLANDS,
            ISOCODE3_SOMALIA,
            ISOCODE3_SOUTH_AFRICA,
            ISOCODE3_SOUTH_KOREA,
            ISOCODE3_SOUTH_SUDAN,
            ISOCODE3_SPAIN,
            ISOCODE3_SRI_LANKA,
            ISOCODE3_SUDAN,
            ISOCODE3_SURINAME,
            ISOCODE3_SVALBARD_AND_JAN_MAYEN,
            ISOCODE3_SWAZILAND,
            ISOCODE3_SWEDEN,
            ISOCODE3_SWITZERLAND,
            ISOCODE3_SYRIA,
            ISOCODE3_TAIWAN,
            ISOCODE3_TAJIKISTAN,
            ISOCODE3_TANZANIA,
            ISOCODE3_THAILAND,
            ISOCODE3_TOGO,
            ISOCODE3_TOKELAU,
            ISOCODE3_TONGA,
            ISOCODE3_TRINIDAD_AND_TOBAGO,
            ISOCODE3_TUNISIA,
            ISOCODE3_TURKEY,
            ISOCODE3_TURKMENISTAN,
            ISOCODE3_TURK_AND_CAICOS_ISLANDS,
            ISOCODE3_TUVALU,
            ISOCODE3_US_VIRGIN_ISLANDS,
            ISOCODE3_UGANDA,
            ISOCODE3_UKRAINE,
            ISOCODE3_UNITED_ARAB_EMIRATES,
            ISOCODE3_UNITED_KINGDOM,
            ISOCODE3_UNITED_STATES,
            ISOCODE3_URUGUAY,
            ISOCODE3_UZBEKISTAN,
            ISOCODE3_VANUATU,
            ISOCODE3_VATICAN,
            ISOCODE3_VENEZUELA,
            ISOCODE3_VIETNAM,
            ISOCODE3_WALLIS_AND_FUTUNA,
            ISOCODE3_WESTERN_SAHARA,
            ISOCODE3_YEMEN,
            ISOCODE3_ZAMBIA,
            ISOCODE3_ZIMBABWE
    };

    public static final String[] getAvailableCountries(){
        return availableCountries;
    }

    String countryISOCode;
    String countryCurrency;

    public Country(String countryISOCode) {
        initWithCountryISOCode(countryISOCode);
    }

    public String getCountryCurrency() {
        return countryCurrency;
    }

    public String getCountryISOCode() {
        return countryISOCode;
    }

    private Country initWithCountryISOCode(String code){
        switch (code){
            case ISOCODE_AFGHANISTAN:
            case ISOCODE3_AFGHANISTAN:{
                this.countryISOCode = ISOCODE3_AFGHANISTAN;
                this.countryCurrency = CURRENCY_AFGHAN_AFGHANI;
                break;
            }
            case ISOCODE_ALBANIA:
            case ISOCODE3_ALBANIA:{
                this.countryISOCode = ISOCODE3_ALBANIA;
                this.countryCurrency = CURRENCY_ALBANIAN_LEK;
                break;
            }
            case ISOCODE_ALGERIA:
            case ISOCODE3_ALGERIA:{
                this.countryISOCode = ISOCODE3_ALGERIA;
                this.countryCurrency = CURRENCY_ALGERIAN_DINAR;
                break;
            }
            case ISOCODE_AMERICAN_SAMOA:
            case ISOCODE3_AMERICAN_SAMOA:{
                this.countryISOCode = ISOCODE3_AMERICAN_SAMOA;
                this.countryCurrency = CURRENCY_SAMOAN_TALA;
                break;
            }
            case ISOCODE_ANDORRA:
            case ISOCODE3_ANDORRA:{
                this.countryISOCode = ISOCODE3_ANDORRA;
                this.countryCurrency = CURRENCY_EURO;
                break;
            }
            case ISOCODE_ANGOLA:
            case ISOCODE3_ANGOLA:{
                this.countryISOCode = ISOCODE3_ANGOLA;
                this.countryCurrency = CURRENCY_ANGOLAN_KWANZA;
                break;
            }
            case ISOCODE_ANGUILLA:
            case ISOCODE3_ANGUILLA:{
                this.countryISOCode = ISOCODE3_ANGUILLA;
                this.countryCurrency = CURRENCY_EAST_CARIBBEAN_DOLLAR;
                break;
            }
            case ISOCODE_ANTARCTICA:
            case ISOCODE3_ANTARCTICA:{
                this.countryISOCode = ISOCODE3_ANTARCTICA;
                this.countryCurrency = CURRENCY_EAST_CARIBBEAN_DOLLAR;
                break;
            }
            case ISOCODE_ANTIGUA:
            case ISOCODE3_ANTIGUA:{
                this.countryISOCode = ISOCODE3_ANTIGUA;
                this.countryCurrency = CURRENCY_EAST_CARIBBEAN_DOLLAR;
                break;
            }
            case ISOCODE_ARGENTINA:
            case ISOCODE3_ARGENTINA:{
                this.countryISOCode = ISOCODE3_ARGENTINA;
                this.countryCurrency = CURRENCY_ARGENTINE_PESO;
                break;
            }
            case ISOCODE_ARMENIA:
            case ISOCODE3_ARMENIA:{
                this.countryISOCode = ISOCODE3_ARMENIA;
                this.countryCurrency = CURRENCY_ARMENIAN_DRAM;
                break;
            }
            case ISOCODE_ARUBA:
            case ISOCODE3_ARUBA:{
                this.countryISOCode = ISOCODE3_ARUBA;
                this.countryCurrency = CURRENCY_ARUBAN_FLORIN;
                break;
            }
            case ISOCODE_AUSTRALIA:
            case ISOCODE3_AUSTRALIA:{
                this.countryISOCode = ISOCODE3_AUSTRALIA;
                this.countryCurrency = CURRENCY_AUSTRALIAN_DOLLAR;
                break;
            }
            case ISOCODE_AUSTRIA:
            case ISOCODE3_AUSTRIA:{
                this.countryISOCode = ISOCODE3_AUSTRIA;
                this.countryCurrency = CURRENCY_EURO;
                break;
            }
            case ISOCODE_AZERBAIJAN:
            case ISOCODE3_AZERBAIJAN:{
                this.countryISOCode = ISOCODE3_AZERBAIJAN;
                this.countryCurrency = CURRENCY_AZERBAIJANI_MANAT;
                break;
            }
            case ISOCODE_BAHAMAS:
            case ISOCODE3_BAHAMAS:{
                this.countryISOCode = ISOCODE3_BAHAMAS;
                this.countryCurrency = CURRENCY_BAHAMIAN_DOLLAR;
                break;
            }
            case ISOCODE_BAHRAIN:
            case ISOCODE3_BAHRAIN:{
                this.countryISOCode = ISOCODE3_BAHRAIN;
                this.countryCurrency = CURRENCY_BAHRAINI_DINAR;
                break;
            }
            case ISOCODE_BANGLADESH:
            case ISOCODE3_BANGLADESH:{
                this.countryISOCode = ISOCODE3_BANGLADESH;
                this.countryCurrency = CURRENCY_BANGLADESHI_TAKA;
                break;
            }
            case ISOCODE_BARBADOS:
            case ISOCODE3_BARBADOS:{
                this.countryISOCode = ISOCODE3_BARBADOS;
                this.countryCurrency = CURRENCY_BARBADOS_DOLLAR;
                break;
            }
            case ISOCODE_BELARUS:
            case ISOCODE3_BELARUS:{
                this.countryISOCode = ISOCODE3_BELARUS;
                this.countryCurrency = CURRENCY_NEW_BELARUSIAN_RUBLE;
                break;
            }
            case ISOCODE_BELGIUM:
            case ISOCODE3_BELGIUM:{
                this.countryISOCode = ISOCODE3_BELGIUM;
                this.countryCurrency = CURRENCY_EURO;
                break;
            }
            case ISOCODE_BELIZE:
            case ISOCODE3_BELIZE:{
                this.countryISOCode = ISOCODE3_BELIZE;
                this.countryCurrency = CURRENCY_BELIZE_DOLLAR;
                break;
            }
            case ISOCODE_BENIN:
            case ISOCODE3_BENIN:{
                this.countryISOCode = ISOCODE3_BENIN;
                this.countryCurrency = CURRENCY_CFA_FRANC_BCEAO;
                break;
            }
            case ISOCODE_BERMUDA:
            case ISOCODE3_BERMUDA:{
                this.countryISOCode = ISOCODE3_BERMUDA;
                this.countryCurrency = CURRENCY_BERMUDIAN_DOLLAR;
                break;
            }
            case ISOCODE_BHUTAN:
            case ISOCODE3_BHUTAN:{
                this.countryISOCode = ISOCODE3_BHUTAN;
                this.countryCurrency = CURRENCY_BHUTANESE_NGULTRUM;
                break;
            }
            case ISOCODE_BOLIVIA:
            case ISOCODE3_BOLIVIA:{
                this.countryISOCode = ISOCODE3_BOLIVIA;
                this.countryCurrency = CURRENCY_BOLIVIANO;
                break;
            }
            case ISOCODE_BOSNIA_AND_HERZEGOVINA:
            case ISOCODE3_BOSNIA_AND_HERZEGOVINA:{
                this.countryISOCode = ISOCODE3_BOSNIA_AND_HERZEGOVINA;
                this.countryCurrency = CURRENCY_BOSNIA_AND_HERZEGOVINA_CONVERTIBLE_MARK;
                break;
            }
            case ISOCODE_BOTSWANA:
            case ISOCODE3_BOTSWANA:{
                this.countryISOCode = ISOCODE3_BOTSWANA;
                this.countryCurrency = CURRENCY_BOTSWANA_PULA;
                break;
            }
            case ISOCODE_BRAZIL:
            case ISOCODE3_BRAZIL:{
                this.countryISOCode = ISOCODE3_BRAZIL;
                this.countryCurrency = CURRENCY_BRAZILIAN_REAL;
                break;
            }
            case ISOCODE_BRITISH_INDIAN_OCEAN_TERRITORY:
            case ISOCODE3_BRITISH_INDIAN_OCEAN_TERRITORY:{
                this.countryISOCode = ISOCODE3_BRITISH_INDIAN_OCEAN_TERRITORY;
                this.countryCurrency = CURRENCY_UNITED_STATES_DOLLAR;
                break;
            }
            case ISOCODE_BRITISH_VIRGIN_ISLANDS:
            case ISOCODE3_BRITISH_VIRGIN_ISLANDS:{
                this.countryISOCode = ISOCODE3_BRITISH_VIRGIN_ISLANDS;
                this.countryCurrency = CURRENCY_UNITED_STATES_DOLLAR;
                break;
            }
            case ISOCODE_BRUNEI:
            case ISOCODE3_BRUNEI:{
                this.countryISOCode = ISOCODE3_BRUNEI;
                this.countryCurrency = CURRENCY_BRUNEI_DOLLAR;
                break;
            }
            case ISOCODE_BULGARIA:
            case ISOCODE3_BULGARIA:{
                this.countryISOCode = ISOCODE3_BULGARIA;
                this.countryCurrency = CURRENCY_BULGARIAN_LEV;
                break;
            }
            case ISOCODE_BURKINA_FASO:
            case ISOCODE3_BURKINA_FASO:{
                this.countryISOCode = ISOCODE3_BURKINA_FASO;
                this.countryCurrency = CURRENCY_CFA_FRANC_BCEAO;
                break;
            }
            case ISOCODE_BURUNDI:
            case ISOCODE3_BURUNDI:{
                this.countryISOCode = ISOCODE3_BURUNDI;
                this.countryCurrency = CURRENCY_BURUNDIAN_FRANC;
                break;
            }
            case ISOCODE_CAMBODIA:
            case ISOCODE3_CAMBODIA:{
                this.countryISOCode = ISOCODE3_CAMBODIA;
                this.countryCurrency = CURRENCY_CAMBODIAN_RIEL;
                break;
            }
            case ISOCODE_CAMEROON:
            case ISOCODE3_CAMEROON:{
                this.countryISOCode = ISOCODE3_CAMEROON;
                this.countryCurrency = CURRENCY_CFA_FRANC_BEAC;
                break;
            }
            case ISOCODE_CANADA:
            case ISOCODE3_CANADA:{
                this.countryISOCode = ISOCODE3_CANADA;
                this.countryCurrency = CURRENCY_CANADIAN_DOLLAR;
                break;
            }
            case ISOCODE_CAPE_VERDE:
            case ISOCODE3_CAPE_VERDE:{
                this.countryISOCode = ISOCODE3_CAPE_VERDE;
                this.countryCurrency = CURRENCY_CAPE_VERDE_ESCUDO;
                break;
            }
            case ISOCODE_CAYMAN_ISLANDS:
            case ISOCODE3_CAYMAN_ISLANDS:{
                this.countryISOCode = ISOCODE3_CAYMAN_ISLANDS;
                this.countryCurrency = CURRENCY_CAYMAN_ISLANDS_DOLLAR;
                break;
            }
            case ISOCODE_CENTRAL_AFREICAN_REPUBLIC:
            case ISOCODE3_CENTRAL_AFREICAN_REPUBLIC:{
                this.countryISOCode = ISOCODE3_CENTRAL_AFREICAN_REPUBLIC;
                this.countryCurrency = CURRENCY_CFA_FRANC_BEAC;
                break;
            }
            case ISOCODE_CHAD:
            case ISOCODE3_CHAD:{
                this.countryISOCode = ISOCODE3_CHAD;
                this.countryCurrency = CURRENCY_CFA_FRANC_BEAC;
                break;
            }
            case ISOCODE_CHILE:
            case ISOCODE3_CHILE:{
                this.countryISOCode = ISOCODE3_CHILE;
                this.countryCurrency = CURRENCY_CHILEAN_PESO;
                break;
            }
            case ISOCODE_CHINA:
            case ISOCODE3_CHINA:{
                this.countryISOCode = ISOCODE3_CHINA;
                this.countryCurrency = CURRENCY_CHINESE_YUAN;
                break;
            }
            case ISOCODE_CHRISTMAS_ISLAND:
            case ISOCODE3_CHRISTMAS_ISLAND:{
                this.countryISOCode = ISOCODE3_CHRISTMAS_ISLAND;
                this.countryCurrency = CURRENCY_AUSTRALIAN_DOLLAR;
                break;
            }
            case ISOCODE_COCOS_ISLANDS:
            case ISOCODE3_COCOS_ISLANDS:{
                this.countryISOCode = ISOCODE3_COCOS_ISLANDS;
                this.countryCurrency = CURRENCY_AUSTRALIAN_DOLLAR;
                break;
            }
            case ISOCODE_COLOMBIA:
            case ISOCODE3_COLOMBIA:{
                this.countryISOCode = ISOCODE3_COLOMBIA;
                this.countryCurrency = CURRENCY_COLOMBIAN_PESO;
                break;
            }
            case ISOCODE_COMOROS:
            case ISOCODE3_COMOROS:{
                this.countryISOCode = ISOCODE3_COMOROS;
                this.countryCurrency = CURRENCY_COMORO_FRANC;
                break;
            }
            case ISOCODE_COOK_ISLANDS:
            case ISOCODE3_COOK_ISLANDS:{
                this.countryISOCode = ISOCODE3_COOK_ISLANDS;
                this.countryCurrency = CURRENCY_NEW_ZEALAND_DOLLAR;
                break;
            }
            case ISOCODE_COSTA_RICA:
            case ISOCODE3_COSTA_RICA:{
                this.countryISOCode = ISOCODE3_COSTA_RICA;
                this.countryCurrency = CURRENCY_COSTA_RICAN_COLON;
                break;
            }
            case ISOCODE_CROATIA:
            case ISOCODE3_CROATIA:{
                this.countryISOCode = ISOCODE3_CROATIA;
                this.countryCurrency = CURRENCY_CROATIAN_KUNA;
                break;
            }
            case ISOCODE_CUBA:
            case ISOCODE3_CUBA:{
                this.countryISOCode = ISOCODE3_CUBA;
                this.countryCurrency = CURRENCY_CUBAN_PESO;
                break;
            }
            case ISOCODE_CURACAO:
            case ISOCODE3_CURACAO:{
                this.countryISOCode = ISOCODE3_CURACAO;
                this.countryCurrency = "";
                break;
            }
            case ISOCODE_CYPRUS:
            case ISOCODE3_CYPRUS:{
                this.countryISOCode = ISOCODE3_CYPRUS;
                this.countryCurrency = CURRENCY_EURO;
                break;
            }
            case ISOCODE_CZECH_REPUBLIC:
            case ISOCODE3_CZECH_REPUBLIC:{
                this.countryISOCode = ISOCODE3_CZECH_REPUBLIC;
                this.countryCurrency = CURRENCY_CZECH_KORUNA;
                break;
            }
            case ISOCODE_DEMOCRATIC_REPUBLIC_OF_CONGO:
            case ISOCODE3_DEMOCRATIC_REPUBLIC_OF_CONGO:{
                this.countryISOCode = ISOCODE3_DEMOCRATIC_REPUBLIC_OF_CONGO;
                this.countryCurrency = CURRENCY_CONGOLESE_FRANC;
                break;
            }
            case ISOCODE_DENMARK:
            case ISOCODE3_DENMARK:{
                this.countryISOCode = ISOCODE3_DENMARK;
                this.countryCurrency = CURRENCY_DANISH_KRONE;
                break;
            }
            case ISOCODE_DJIBOUTI:
            case ISOCODE3_DJIBOUTI:{
                this.countryISOCode = ISOCODE3_DJIBOUTI;
                this.countryCurrency = CURRENCY_DJIBOUTIAN_FRANC;
                break;
            }
            case ISOCODE_DOMINICA:
            case ISOCODE3_DOMINICA:{
                this.countryISOCode = ISOCODE3_DOMINICA;
                this.countryCurrency = CURRENCY_EAST_CARIBBEAN_DOLLAR;
                break;
            }
            case ISOCODE_DOMINICAN_REPUBLIC:
            case ISOCODE3_DOMINICAN_REPUBLIC:{
                this.countryISOCode = ISOCODE3_DOMINICAN_REPUBLIC;
                this.countryCurrency = CURRENCY_DOMINICAN_PESO;
                break;
            }
            case ISOCODE_EAST_TIMOR:
            case ISOCODE3_EAST_TIMOR:{
                this.countryISOCode = ISOCODE3_EAST_TIMOR;
                this.countryCurrency = CURRENCY_UNITED_STATES_DOLLAR;
                break;
            }
            case ISOCODE_ECUADOR:
            case ISOCODE3_ECUADOR:{
                this.countryISOCode = ISOCODE3_ECUADOR;
                this.countryCurrency = CURRENCY_ECUADOR_SUCRE;
                break;
            }
            case ISOCODE_EGYPT:
            case ISOCODE3_EGYPT:{
                this.countryISOCode = ISOCODE3_EGYPT;
                this.countryCurrency = CURRENCY_EGYPTIAN_POUND;
                break;
            }
            case ISOCODE_EL_SALVADOR:
            case ISOCODE3_EL_SALVADOR:{
                this.countryISOCode = ISOCODE3_EL_SALVADOR;
                this.countryCurrency = CURRENCY_SALVADORAN_COLON;
                break;
            }
            case ISOCODE_EQUATORIAL_GUINEA:
            case ISOCODE3_EQUATORIAL_GUINEA:{
                this.countryISOCode = ISOCODE3_EQUATORIAL_GUINEA;
                this.countryCurrency = CURRENCY_CFA_FRANC_BEAC;
                break;
            }
            case ISOCODE_ERITREA:
            case ISOCODE3_ERITREA:{
                this.countryISOCode = ISOCODE3_ERITREA;
                this.countryCurrency = CURRENCY_ERITREAN_NAKFA;
                break;
            }
            case ISOCODE_ESTONIA:
            case ISOCODE3_ESTONIA:{
                this.countryISOCode = ISOCODE3_ESTONIA;
                this.countryCurrency = CURRENCY_EURO;
                break;
            }
            case ISOCODE_ETHIOPIA:
            case ISOCODE3_ETHIOPIA:{
                this.countryISOCode = ISOCODE3_ETHIOPIA;
                this.countryCurrency = CURRENCY_ETHIOPIAN_BIRR;
                break;
            }
            case ISOCODE_FALKLAND_ISLANDS:
            case ISOCODE3_FALKLAND_ISLANDS:{
                this.countryISOCode = ISOCODE3_FALKLAND_ISLANDS;
                this.countryCurrency = CURRENCY_FALKLAND_ISLANDS_POUND;
                break;
            }
            case ISOCODE_FAROE_ISLANDS:
            case ISOCODE3_FAROE_ISLANDS:{
                this.countryISOCode = ISOCODE3_FAROE_ISLANDS;
                this.countryCurrency = CURRENCY_DANISH_KRONE;
                break;
            }
            case ISOCODE_FIJI:
            case ISOCODE3_FIJI:{
                this.countryISOCode = ISOCODE3_FIJI;
                this.countryCurrency = CURRENCY_FIJI_DOLLAR;
                break;
            }
            case ISOCODE_FINLAND:
            case ISOCODE3_FINLAND:{
                this.countryISOCode = ISOCODE3_FINLAND;
                this.countryCurrency = CURRENCY_EURO;
                break;
            }
            case ISOCODE_FRANCE:
            case ISOCODE3_FRANCE:{
                this.countryISOCode = ISOCODE3_FRANCE;
                this.countryCurrency = CURRENCY_EURO;
                break;
            }
            case ISOCODE_FRENCH_POLYNESIA:
            case ISOCODE3_FRENCH_POLYNESIA:{
                this.countryISOCode = ISOCODE3_FRENCH_POLYNESIA;
                this.countryCurrency = CURRENCY_CFP_FRANC;
                break;
            }
            case ISOCODE_GABON:
            case ISOCODE3_GABON:{
                this.countryISOCode = ISOCODE3_GABON;
                this.countryCurrency = CURRENCY_CFA_FRANC_BEAC;
                break;
            }
            case ISOCODE_GAMBIA:
            case ISOCODE3_GAMBIA:{
                this.countryISOCode = ISOCODE3_GAMBIA;
                this.countryCurrency = CURRENCY_GAMBIAN_DALASI;
                break;
            }
            case ISOCODE_GEORGIA:
            case ISOCODE3_GEORGIA:{
                this.countryISOCode = ISOCODE3_GEORGIA;
                this.countryCurrency = CURRENCY_GEORGIAN_LARI;
                break;
            }
            case ISOCODE_GERMANY:
            case ISOCODE3_GERMANY:{
                this.countryISOCode = ISOCODE3_GERMANY;
                this.countryCurrency = CURRENCY_EURO;
                break;
            }
            case ISOCODE_GHANA:
            case ISOCODE3_GHANA:{
                this.countryISOCode = ISOCODE3_GHANA;
                this.countryCurrency = CURRENCY_GHANAIAN_CEDI;
                break;
            }
            case ISOCODE_GIBRALTAR:
            case ISOCODE3_GIBRALTAR:{
                this.countryISOCode = ISOCODE3_GIBRALTAR;
                this.countryCurrency = CURRENCY_GIBRALTAR_POUND;
                break;
            }
            case ISOCODE_GREECE:
            case ISOCODE3_GREECE:{
                this.countryISOCode = ISOCODE3_GREECE;
                this.countryCurrency = CURRENCY_EURO;
                break;
            }
            case ISOCODE_GREENLAND:
            case ISOCODE3_GREENLAND:{
                this.countryISOCode = ISOCODE3_GREENLAND;
                this.countryCurrency = CURRENCY_DANISH_KRONE;
                break;
            }
            case ISOCODE_GRENADA:
            case ISOCODE3_GRENADA:{
                this.countryISOCode = ISOCODE3_GRENADA;
                this.countryCurrency = CURRENCY_EAST_CARIBBEAN_DOLLAR;
                break;
            }
            case ISOCODE_GUAM:
            case ISOCODE3_GUAM:{
                this.countryISOCode = ISOCODE3_GUAM;
                this.countryCurrency = CURRENCY_UNITED_STATES_DOLLAR;
                break;
            }
            case ISOCODE_GUATEMALA:
            case ISOCODE3_GUATEMALA:{
                this.countryISOCode = ISOCODE3_GUATEMALA;
                this.countryCurrency = CURRENCY_GUATEMALAN_QUETZAL;
                break;
            }
            case ISOCODE_GUERNSEY:
            case ISOCODE3_GUERNSEY:{
                this.countryISOCode = ISOCODE3_GUERNSEY;
                this.countryCurrency = CURRENCY_POUND_STERLING;
                break;
            }
            case ISOCODE_GUINEA:
            case ISOCODE3_GUINEA:{
                this.countryISOCode = ISOCODE3_GUINEA;
                this.countryCurrency = CURRENCY_GUINEAN_FRANC;
                break;
            }
            case ISOCODE_GUINEA_BISSAU:
            case ISOCODE3_GUINEA_BISSAU:{
                this.countryISOCode = ISOCODE3_GUINEA_BISSAU;
                this.countryCurrency = CURRENCY_GUINEA_BISSAU_PESO;
                break;
            }
            case ISOCODE_GUYANA:
            case ISOCODE3_GUYANA:{
                this.countryISOCode = ISOCODE3_GUYANA;
                this.countryCurrency = CURRENCY_GUYANESE_DOLLAR;
                break;
            }
            case ISOCODE_HAITI:
            case ISOCODE3_HAITI:{
                this.countryISOCode = ISOCODE3_HAITI;
                this.countryCurrency = CURRENCY_HAITIAN_GOURDE;
                break;
            }
            case ISOCODE_HONDURAS:
            case ISOCODE3_HONDURAS:{
                this.countryISOCode = ISOCODE3_HONDURAS;
                this.countryCurrency = CURRENCY_HONDURAN_LEMPIRA;
                break;
            }
            case ISOCODE_HONGKONG:
            case ISOCODE3_HONGKONG:{
                this.countryISOCode = ISOCODE3_HONGKONG;
                this.countryCurrency = CURRENCY_HONGKONG_DOLLAR;
                break;
            }
            case ISOCODE_HUNGARY:
            case ISOCODE3_HUNGARY:{
                this.countryISOCode = ISOCODE3_HUNGARY;
                this.countryCurrency = CURRENCY_HUNGARIAN_FORINT;
                break;
            }
            case ISOCODE_ICELAND:
            case ISOCODE3_ICELAND:{
                this.countryISOCode = ISOCODE3_ICELAND;
                this.countryCurrency = CURRENCY_ICELANDIC_KRÓNA;
                break;
            }
            case ISOCODE_INDIA:
            case ISOCODE3_INDIA:{
                this.countryISOCode = ISOCODE3_INDIA;
                this.countryCurrency = CURRENCY_INDIAN_RUPEE;
                break;
            }
            case ISOCODE_INDONESIA:
            case ISOCODE3_INDONESIA:{
                this.countryISOCode = ISOCODE3_INDONESIA;
                this.countryCurrency = CURRENCY_INDONESIAN_RUPIAH;
                break;
            }
            case ISOCODE_IRAN:
            case ISOCODE3_IRAN:{
                this.countryISOCode = ISOCODE3_IRAN;
                this.countryCurrency = CURRENCY_IRANIAN_RIAL;
                break;
            }
            case ISOCODE_IRAQ:
            case ISOCODE3_IRAQ:{
                this.countryISOCode = ISOCODE3_IRAQ;
                this.countryCurrency = CURRENCY_IRAQI_DINAR;
                break;
            }
            case ISOCODE_IRELAND:
            case ISOCODE3_IRELAND:{
                this.countryISOCode = ISOCODE3_IRELAND;
                this.countryCurrency = CURRENCY_EURO;
                break;
            }
            case ISOCODE_ISLE_OF_MAN:
            case ISOCODE3_ISLE_OF_MAN:{
                this.countryISOCode = ISOCODE3_ISLE_OF_MAN;
                this.countryCurrency = CURRENCY_POUND_STERLING;
                break;
            }
            case ISOCODE_ISRAEL:
            case ISOCODE3_ISRAEL:{
                this.countryISOCode = ISOCODE3_ISRAEL;
                this.countryCurrency = CURRENCY_ISRAELI_NEW_SHEKEL;
                break;
            }
            case ISOCODE_ITALY:
            case ISOCODE3_ITALY:{
                this.countryISOCode = ISOCODE3_ITALY;
                this.countryCurrency = CURRENCY_EURO;
                break;
            }
            case ISOCODE_IVORY_COAST:
            case ISOCODE3_IVORY_COAST :{
                this.countryISOCode = ISOCODE3_IVORY_COAST;
                this.countryCurrency = CURRENCY_CFA_FRANC_BCEAO;
                break;
            }
            case ISOCODE_JAMAICA:
            case ISOCODE3_JAMAICA:{
                this.countryISOCode = ISOCODE3_JAMAICA;
                this.countryCurrency = CURRENCY_JAMAICAN_DOLLAR;
                break;
            }
            case ISOCODE_JAPAN:
            case ISOCODE3_JAPAN:{
                this.countryISOCode = ISOCODE3_JAPAN;
                this.countryCurrency = CURRENCY_JAPANESE_YEN;
                break;
            }
            case ISOCODE_JERSEY:
            case ISOCODE3_JERSEY:{
                this.countryISOCode = ISOCODE3_JERSEY;
                this.countryCurrency = CURRENCY_POUND_STERLING;
                break;
            }
            case ISOCODE_JORDAN:
            case ISOCODE3_JORDAN:{
                this.countryISOCode = ISOCODE3_JORDAN;
                this.countryCurrency = CURRENCY_JORDANIAN_DINAR;
                break;
            }
            case ISOCODE_KAZAKHSTAN:
            case ISOCODE3_KAZAKHSTAN:{
                this.countryISOCode = ISOCODE3_KAZAKHSTAN;
                this.countryCurrency = CURRENCY_KAZAKHSTANI_TENGE;
                break;
            }
            case ISOCODE_KENYA:
            case ISOCODE3_KENYA:{
                this.countryISOCode = ISOCODE3_KENYA;
                this.countryCurrency = CURRENCY_KENYAN_SHILLING;
                break;
            }
            case ISOCODE_KIRIBATI:
            case ISOCODE3_KIRIBATI:{
                this.countryISOCode = ISOCODE3_KIRIBATI;
                this.countryCurrency = CURRENCY_AUSTRALIAN_DOLLAR;
                break;
            }
            case ISOCODE_KOSOVO:
            case ISOCODE3_KOSOVO:{
                this.countryISOCode = ISOCODE3_KOSOVO;
                this.countryCurrency = CURRENCY_EURO;
                break;
            }
            case ISOCODE_KUWAIT:
            case ISOCODE3_KUWAIT:{
                this.countryISOCode = ISOCODE3_KUWAIT;
                this.countryCurrency = CURRENCY_KUWAITI_DINAR;
                break;
            }
            case ISOCODE_KYRGYZSTAN:
            case ISOCODE3_KYRGYZSTAN:{
                this.countryISOCode = ISOCODE3_KYRGYZSTAN;
                this.countryCurrency = CURRENCY_KYRGYZSTANI_SOM;
                break;
            }
            case ISOCODE_LAOS:
            case ISOCODE3_LAOS:{
                this.countryISOCode = ISOCODE3_LAOS;
                this.countryCurrency = CURRENCY_LAO_KIP;
                break;
            }
            case ISOCODE_LATVIA:
            case ISOCODE3_LATVIA:{
                this.countryISOCode = ISOCODE3_LATVIA;
                this.countryCurrency = CURRENCY_LATVIAN_LATS;
                break;
            }
            case ISOCODE_LEBANON:
            case ISOCODE3_LEBANON:{
                this.countryISOCode = ISOCODE3_LEBANON;
                this.countryCurrency = CURRENCY_LEBANESE_POUND;
                break;
            }
            case ISOCODE_LESOTHO:
            case ISOCODE3_LESOTHO:{
                this.countryISOCode = ISOCODE3_LESOTHO;
                this.countryCurrency = CURRENCY_LESOTHO_LOTI;
                break;
            }
            case ISOCODE_LIBERIA:
            case ISOCODE3_LIBERIA:{
                this.countryISOCode = ISOCODE3_LIBERIA;
                this.countryCurrency = CURRENCY_LIBERIAN_DOLLAR;
                break;
            }
            case ISOCODE_LIBYA:
            case ISOCODE3_LIBYA:{
                this.countryISOCode = ISOCODE3_LIBYA;
                this.countryCurrency = CURRENCY_LIBYAN_DINAR;
                break;
            }
            case ISOCODE_LIECHTENSTEIN:
            case ISOCODE3_LIECHTENSTEIN:{
                this.countryISOCode = ISOCODE3_LIECHTENSTEIN;
                this.countryCurrency = CURRENCY_SWISS_FRANC;
                break;
            }
            case ISOCODE_LITHUANIA:
            case ISOCODE3_LITHUANIA:{
                this.countryISOCode = ISOCODE3_LITHUANIA;
                this.countryCurrency = CURRENCY_LITHUANIAN_LITAS;
                break;
            }
            case ISOCODE_LUXEMBOURG:
            case ISOCODE3_LUXEMBOURG:{
                this.countryISOCode = ISOCODE3_LUXEMBOURG;
                this.countryCurrency = CURRENCY_EURO;
                break;
            }
            case ISOCODE_MACAU:
            case ISOCODE3_MACAU:{
                this.countryISOCode = ISOCODE3_MACAU;
                this.countryCurrency = CURRENCY_MACANESE_PATACA;
                break;
            }
            case ISOCODE_MACEDONIA:
            case ISOCODE3_MACEDONIA:{
                this.countryISOCode = ISOCODE3_MACEDONIA;
                this.countryCurrency = CURRENCY_MACEDONIAN_DENAR;
                break;
            }
            case ISOCODE_MADAGASCAR:
            case ISOCODE3_MADAGASCAR:{
                this.countryISOCode = ISOCODE3_MADAGASCAR;
                this.countryCurrency = CURRENCY_MADAGASCAR_ARIARY;
                break;
            }
            case ISOCODE_MALAWI:
            case ISOCODE3_MALAWI:{
                this.countryISOCode = ISOCODE3_MALAWI;
                this.countryCurrency = CURRENCY_MALAWIAN_KWACHA;
                break;
            }
            case ISOCODE_MALAYSIA:
            case ISOCODE3_MALAYSIA:{
                this.countryISOCode = ISOCODE3_MALAYSIA;
                this.countryCurrency = CURRENCY_MALAYSIAN_RINGGIT;
                break;
            }
            case ISOCODE_MALDIVES:
            case ISOCODE3_MALDIVES:{
                this.countryISOCode = ISOCODE3_MALDIVES;
                this.countryCurrency = CURRENCY_MALDIVIAN_RUFIYAA;
                break;
            }
            case ISOCODE_MALI:
            case ISOCODE3_MALI:{
                this.countryISOCode = ISOCODE3_MALI;
                this.countryCurrency = CURRENCY_CFA_FRANC_BCEAO;
                break;
            }
            case ISOCODE_MALTA:
            case ISOCODE3_MALTA:{
                this.countryISOCode = ISOCODE3_MALTA;
                this.countryCurrency = CURRENCY_EURO;
                break;
            }
            case ISOCODE_MARSHALL_ISLANDS:
            case ISOCODE3_MARSHALL_ISLANDS:{
                this.countryISOCode = ISOCODE3_MARSHALL_ISLANDS;
                this.countryCurrency = CURRENCY_UNITED_STATES_DOLLAR;
                break;
            }
            case ISOCODE_MAURITANIA:
            case ISOCODE3_MAURITANIA:{
                this.countryISOCode = ISOCODE3_MAURITANIA;
                this.countryCurrency = CURRENCY_MAURITANIA_OUGUIYA;
                break;
            }
            case ISOCODE_MAURITIUS:
            case ISOCODE3_MAURITIUS:{
                this.countryISOCode = ISOCODE3_MAURITIUS;
                this.countryCurrency = CURRENCY_MAURITIAN_RUPEE;
                break;
            }
            case ISOCODE_MAYOTTE:
            case ISOCODE3_MAYOTTE:{
                this.countryISOCode = ISOCODE3_MAYOTTE;
                this.countryCurrency = CURRENCY_EURO;
                break;
            }
            case ISOCODE_MEXICO:
            case ISOCODE3_MEXICO:{
                this.countryISOCode = ISOCODE3_MEXICO;
                this.countryCurrency = CURRENCY_MEXICAN_PESO;
                break;
            }
            case ISOCODE_MICRONESIA:
            case ISOCODE3_MICRONESIA:{
                this.countryISOCode = ISOCODE3_MICRONESIA;
                this.countryCurrency = CURRENCY_UNITED_STATES_DOLLAR;
                break;
            }
            case ISOCODE_MOLDOVA:
            case ISOCODE3_MOLDOVA:{
                this.countryISOCode = ISOCODE3_MOLDOVA;
                this.countryCurrency = CURRENCY_MOLDOVAN_LEU;
                break;
            }
            case ISOCODE_MONACO:
            case ISOCODE3_MONACO:{
                this.countryISOCode = ISOCODE3_MONACO;
                this.countryCurrency = CURRENCY_EURO;
                break;
            }
            case ISOCODE_MONGOLIA:
            case ISOCODE3_MONGOLIA:{
                this.countryISOCode = ISOCODE3_MONGOLIA;
                this.countryCurrency = CURRENCY_MONGOLIAN_TOGROG;
                break;
            }
            case ISOCODE_MONTENEGRO:
            case ISOCODE3_MONTENEGRO:{
                this.countryISOCode = ISOCODE3_MONTENEGRO;
                this.countryCurrency = CURRENCY_EURO;
                break;
            }
            case ISOCODE_MONTSERRAT:
            case ISOCODE3_MONTSERRAT:{
                this.countryISOCode = ISOCODE3_MONTSERRAT;
                this.countryCurrency = CURRENCY_EAST_CARIBBEAN_DOLLAR;
                break;
            }
            case ISOCODE_MOROCCO:
            case ISOCODE3_MOROCCO:{
                this.countryISOCode = ISOCODE3_MOROCCO;
                this.countryCurrency = CURRENCY_MOROCCAN_DIRHAM;
                break;
            }
            case ISOCODE_MOZAMBIQUE:
            case ISOCODE3_MOZAMBIQUE:{
                this.countryISOCode = ISOCODE3_MOZAMBIQUE;
                this.countryCurrency = CURRENCY_MOZAMBICAN_METICAL;
                break;
            }
            case ISOCODE_MYANMAR:
            case ISOCODE3_MYANMAR:{
                this.countryISOCode = ISOCODE3_MYANMAR;
                this.countryCurrency = CURRENCY_MYANMAR_KYAT;
                break;
            }
            case ISOCODE_NAMIBIA:
            case ISOCODE3_NAMIBIA:{
                this.countryISOCode = ISOCODE3_NAMIBIA;
                this.countryCurrency = CURRENCY_NAMIBIAN_DOLLAR;
                break;
            }
            case ISOCODE_NAURU:
            case ISOCODE3_NAURU:{
                this.countryISOCode = ISOCODE3_NAURU;
                this.countryCurrency = CURRENCY_AUSTRALIAN_DOLLAR;
                break;
            }
            case ISOCODE_NEPAL:
            case ISOCODE3_NEPAL:{
                this.countryISOCode = ISOCODE3_NEPAL;
                this.countryCurrency = CURRENCY_NEPALESE_RUPEE;
                break;
            }
            case ISOCODE_NETHERLANDS:
            case ISOCODE3_NETHERLANDS:{
                this.countryISOCode = ISOCODE3_NETHERLANDS;
                this.countryCurrency = CURRENCY_EURO;
                break;
            }
            case ISOCODE_NETHERLANDS_ANTILLES:
            case ISOCODE3_NETHERLANDS_ANTILLES:{
                this.countryISOCode = ISOCODE3_NETHERLANDS_ANTILLES;
                this.countryCurrency = CURRENCY_NETHERLANDS_ANTILLEAN_GUILDER;
                break;
            }
            case ISOCODE_NEW_CALEDONIA:
            case ISOCODE3_NEW_CALEDONIA:{
                this.countryISOCode = ISOCODE3_NEW_CALEDONIA;
                this.countryCurrency = CURRENCY_CFP_FRANC;
                break;
            }
            case ISOCODE_NEW_ZEALAND:
            case ISOCODE3_NEW_ZEALAND:{
                this.countryISOCode = ISOCODE3_NEW_ZEALAND;
                this.countryCurrency = CURRENCY_NEW_ZEALAND_DOLLAR;
                break;
            }
            case ISOCODE_NICARAGUA:
            case ISOCODE3_NICARAGUA:{
                this.countryISOCode = ISOCODE3_NICARAGUA;
                this.countryCurrency = CURRENCY_NICARAGUAN_CORDOBA;
                break;
            }
            case ISOCODE_NIGER:
            case ISOCODE3_NIGER:{
                this.countryISOCode = ISOCODE3_NIGER;
                this.countryCurrency = CURRENCY_CFA_FRANC_BCEAO;
                break;
            }
            case ISOCODE_NIGERIA:
            case ISOCODE3_NIGERIA:{
                this.countryISOCode = ISOCODE3_NIGERIA;
                this.countryCurrency = CURRENCY_NIGERIAN_NAIRA;
                break;
            }
            case ISOCODE_NIUE:
            case ISOCODE3_NIUE:{
                this.countryISOCode = ISOCODE3_NIUE;
                this.countryCurrency = CURRENCY_NEW_ZEALAND_DOLLAR;
                break;
            }
            case ISOCODE_NORTH_KOREA:
            case ISOCODE3_NORTH_KOREA:{
                this.countryISOCode = ISOCODE3_NORTH_KOREA;
                this.countryCurrency = CURRENCY_NORTH_KOREAN_WON;
                break;
            }
            case ISOCODE_NORTHERN_MARIANA_ISLANDS:
            case ISOCODE3_NORTHERN_MARIANA_ISLANDS:{
                this.countryISOCode = ISOCODE3_NORTHERN_MARIANA_ISLANDS;
                this.countryCurrency = CURRENCY_UNITED_STATES_DOLLAR;
                break;
            }
            case ISOCODE_NORWAY:
            case ISOCODE3_NORWAY:{
                this.countryISOCode = ISOCODE3_NORWAY;
                this.countryCurrency = CURRENCY_NORWEGIAN_KRONE;
                break;
            }
            case ISOCODE_OMAN:
            case ISOCODE3_OMAN:{
                this.countryISOCode = ISOCODE3_OMAN;
                this.countryCurrency = CURRENCY_OMANI_RIAL;
                break;
            }
            case ISOCODE_PAKISTAN:
            case ISOCODE3_PAKISTAN:{
                this.countryISOCode = ISOCODE3_PAKISTAN;
                this.countryCurrency = CURRENCY_PAKISTANI_RUPEE;
                break;
            }
            case ISOCODE_PALAU:
            case ISOCODE3_PALAU:{
                this.countryISOCode = ISOCODE3_PALAU;
                this.countryCurrency = CURRENCY_UNITED_STATES_DOLLAR;
                break;
            }
            case ISOCODE_PALESTINE:
            case ISOCODE3_PALESTINE:{
                this.countryISOCode = ISOCODE3_PALESTINE;
                break;
            }
            case ISOCODE_PANAMA:
            case ISOCODE3_PANAMA:{
                this.countryISOCode = ISOCODE3_PANAMA;
                this.countryCurrency = CURRENCY_PANAMANIAN_BALBOA;
                break;
            }
            case ISOCODE_PAPUA_NEW_GUINEA:
            case ISOCODE3_PAPUA_NEW_GUINEA:{
                this.countryISOCode = ISOCODE3_PAPUA_NEW_GUINEA;
                this.countryCurrency = CURRENCY_PAPUA_NEW_GUINEAN_KINA;
                break;
            }
            case ISOCODE_PARAGUAY:
            case ISOCODE3_PARAGUAY:{
                this.countryISOCode = ISOCODE3_PARAGUAY;
                this.countryCurrency = CURRENCY_PARAGUAYAN_GUARANI;
                break;
            }
            case ISOCODE_PERU:
            case ISOCODE3_PERU:{
                this.countryISOCode = ISOCODE3_PERU;
                this.countryCurrency = CURRENCY_PERUVIAN_SOL;
                break;
            }
            case ISOCODE_PHILIPPINES:
            case ISOCODE3_PHILIPPINES:{
                this.countryISOCode = ISOCODE3_PHILIPPINES;
                this.countryCurrency = CURRENCY_PHILIPPINE_PESO;
                break;
            }
            case ISOCODE_PITCAIRN:
            case ISOCODE3_PITCAIRN:{
                this.countryISOCode = ISOCODE3_PITCAIRN;
                this.countryCurrency = CURRENCY_NEW_ZEALAND_DOLLAR;
                break;
            }
            case ISOCODE_POLAND:
            case ISOCODE3_POLAND:{
                this.countryISOCode = ISOCODE3_POLAND;
                this.countryCurrency = CURRENCY_POLISH_ZWOTY;
                break;
            }
            case ISOCODE_PORTUGAL:
            case ISOCODE3_PORTUGAL:{
                this.countryISOCode = ISOCODE3_PORTUGAL;
                this.countryCurrency = CURRENCY_EURO;
                break;
            }
            case ISOCODE_PUERTO_RICO:
            case ISOCODE3_PUERTO_RICO:{
                this.countryISOCode = ISOCODE3_PUERTO_RICO;
                this.countryCurrency = CURRENCY_UNITED_STATES_DOLLAR;
                break;
            }
            case ISOCODE_QATAR:
            case ISOCODE3_QATAR:{
                this.countryISOCode = ISOCODE3_QATAR;
                this.countryCurrency = CURRENCY_QATARI_RIYAL;
                break;
            }
            case ISOCODE_REPUBLIC_OF_THE_CONGO:
            case ISOCODE3_REPUBLIC_OF_THE_CONGO:{
                this.countryISOCode = ISOCODE3_REPUBLIC_OF_THE_CONGO;
                this.countryCurrency = CURRENCY_CFA_FRANC_BEAC;
                break;
            }
            case ISOCODE_REUNION:
            case ISOCODE3_REUNION:{
                this.countryISOCode = ISOCODE3_REUNION;
                this.countryCurrency = CURRENCY_EURO;
                break;
            }
            case ISOCODE_ROMANIA:
            case ISOCODE3_ROMANIA:{
                this.countryISOCode = ISOCODE3_ROMANIA;
                this.countryCurrency = CURRENCY_ROMANIAN_LEU;
                break;
            }
            case ISOCODE_RUSSIA:
            case ISOCODE3_RUSSIA:{
                this.countryISOCode = ISOCODE3_RUSSIA;
                this.countryCurrency = CURRENCY_RUSSIAN_RUBLE;
                break;
            }
            case ISOCODE_RWANDA:
            case ISOCODE3_RWANDA:{
                this.countryISOCode = ISOCODE3_RWANDA;
                this.countryCurrency = CURRENCY_RWANDAN_FRANC;
                break;
            }
            case ISOCODE_SAINT_BARTHELEMY:
            case ISOCODE3_SAINT_BARTHELEMY:{
                this.countryISOCode = ISOCODE3_SAINT_BARTHELEMY;
                this.countryCurrency = CURRENCY_EURO;
                break;
            }
            case ISOCODE_SAINT_HELENA:
            case ISOCODE3_SAINT_HELENA:{
                this.countryISOCode = ISOCODE3_SAINT_HELENA;
                this.countryCurrency = CURRENCY_SAINT_HELENA_POUND;
                break;
            }
            case ISOCODE_SAINT_KITTS_AND_NEVIS:
            case ISOCODE3_SAINT_KITTS_AND_NEVIS:{
                this.countryISOCode = ISOCODE3_SAINT_KITTS_AND_NEVIS;
                this.countryCurrency = CURRENCY_EAST_CARIBBEAN_DOLLAR;
                break;
            }
            case ISOCODE_SAINT_LUCIA:
            case ISOCODE3_SAINT_LUCIA:{
                this.countryISOCode = ISOCODE3_SAINT_LUCIA;
                this.countryCurrency = CURRENCY_EAST_CARIBBEAN_DOLLAR;
                break;
            }
            case ISOCODE_SAINT_MARTIN:
            case ISOCODE3_SAINT_MARTIN:{
                this.countryISOCode = ISOCODE3_SAINT_MARTIN;
                this.countryCurrency = CURRENCY_EURO;
                break;
            }
            case ISOCODE_SAINT_PIERRE_AND_MIQUELON:
            case ISOCODE3_SAINT_PIERRE_AND_MIQUELON:{
                this.countryISOCode = ISOCODE3_SAINT_PIERRE_AND_MIQUELON;
                this.countryCurrency = CURRENCY_EURO;
                break;
            }
            case ISOCODE_SAINT_VINCENT_AND_GRENADINES:
            case ISOCODE3_SAINT_VINCENT_AND_GRENADINES:{
                this.countryISOCode = ISOCODE3_SAINT_VINCENT_AND_GRENADINES;
                this.countryCurrency = CURRENCY_EAST_CARIBBEAN_DOLLAR;
                break;
            }
            case ISOCODE_SAMOA:
            case ISOCODE3_SAMOA:{
                this.countryISOCode = ISOCODE3_SAMOA;
                this.countryCurrency = CURRENCY_SAMOAN_TALA;
                break;
            }
            case ISOCODE_SAN_MARINO:
            case ISOCODE3_SAN_MARINO:{
                this.countryISOCode = ISOCODE3_SAN_MARINO;
                this.countryCurrency = CURRENCY_EURO;
                break;
            }
            case ISOCODE_SAO_TOME_AND_PRINCIPE:
            case ISOCODE3_SAO_TOME_AND_PRINCIPE:{
                this.countryISOCode = ISOCODE3_SAO_TOME_AND_PRINCIPE;
                this.countryCurrency = CURRENCY_SAO_TOME_AND_PRICIPE_DOBRA;
                break;
            }
            case ISOCODE_SAUDI_ARABIA:
            case ISOCODE3_SAUDI_ARABIA:{
                this.countryISOCode = ISOCODE3_SAUDI_ARABIA;
                this.countryCurrency = CURRENCY_SAUDI_RIYAL;
                break;
            }
            case ISOCODE_SENEGAL:
            case ISOCODE3_SENEGAL:{
                this.countryISOCode = ISOCODE3_SENEGAL;
                this.countryCurrency = CURRENCY_CFA_FRANC_BCEAO;
                break;
            }
            case ISOCODE_SERBIA:
            case ISOCODE3_SERBIA:{
                this.countryISOCode = ISOCODE3_SERBIA;
                this.countryCurrency = CURRENCY_SERBIAN_DINAR;
                break;
            }
            case ISOCODE_SEYCHELLES:
            case ISOCODE3_SEYCHELLES:{
                this.countryISOCode = ISOCODE3_SEYCHELLES;
                this.countryCurrency = CURRENCY_SEYCHELLES_RUPEE;
                break;
            }
            case ISOCODE_SIERRA_LEONE:
            case ISOCODE3_SIERRA_LEONE:{
                this.countryISOCode = ISOCODE3_SIERRA_LEONE;
                this.countryCurrency = CURRENCY_SIERRA_LEONEAN_LEONE;
                break;
            }
            case ISOCODE_SINGAPORE:
            case ISOCODE3_SINGAPORE:{
                this.countryISOCode = ISOCODE3_SINGAPORE;
                this.countryCurrency = CURRENCY_SINGAPORE_DOLLAR;
                break;
            }
            case ISOCODE_SINT_MAARTEN:
            case ISOCODE3_SINT_MAARTEN:{
                this.countryISOCode = ISOCODE3_SINT_MAARTEN;
                this.countryCurrency = CURRENCY_NETHERLANDS_ANTILLEAN_GUILDER;
                break;
            }
            case ISOCODE_SLOVAKIA:
            case ISOCODE3_SLOVAKIA:{
                this.countryISOCode = ISOCODE3_SLOVAKIA;
                this.countryCurrency = CURRENCY_EURO;
                break;
            }
            case ISOCODE_SLOVENIA:
            case ISOCODE3_SLOVENIA:{
                this.countryISOCode = ISOCODE3_SLOVENIA;
                this.countryCurrency = CURRENCY_EURO;
                break;
            }
            case ISOCODE_SOLOMON_ISLANDS:
            case ISOCODE3_SOLOMON_ISLANDS:{
                this.countryISOCode = ISOCODE3_SOLOMON_ISLANDS;
                this.countryCurrency = CURRENCY_SOLOMON_ISLANDS_DOLLAR;
                break;
            }
            case ISOCODE_SOMALIA:
            case ISOCODE3_SOMALIA:{
                this.countryISOCode = ISOCODE3_SOMALIA;
                this.countryCurrency = CURRENCY_SOMALI_SHILLING;
                break;
            }
            case ISOCODE_SOUTH_AFRICA:
            case ISOCODE3_SOUTH_AFRICA:{
                this.countryISOCode = ISOCODE3_SOUTH_AFRICA;
                this.countryCurrency = CURRENCY_SOUTH_AFRICAN_RAND;
                break;
            }
            case ISOCODE_SOUTH_KOREA:
            case ISOCODE3_SOUTH_KOREA:{
                this.countryISOCode = ISOCODE3_SOUTH_KOREA;
                this.countryCurrency = CURRENCY_SOUTH_KOREAN_WON;
                break;
            }
            case ISOCODE_SOUTH_SUDAN:
            case ISOCODE3_SOUTH_SUDAN:{
                this.countryISOCode = ISOCODE3_SOUTH_SUDAN;
                this.countryCurrency = CURRENCY_SOUTH_SUDANESE_POUND;
                break;
            }
            case ISOCODE_SPAIN:
            case ISOCODE3_SPAIN:{
                this.countryISOCode = ISOCODE3_SPAIN;
                this.countryCurrency = CURRENCY_EURO;
                break;
            }
            case ISOCODE_SRI_LANKA:
            case ISOCODE3_SRI_LANKA:{
                this.countryISOCode = ISOCODE3_SRI_LANKA;
                this.countryCurrency = CURRENCY_SRI_LANKAN_RUPEE;
                break;
            }
            case ISOCODE_SUDAN:
            case ISOCODE3_SUDAN:{
                this.countryISOCode = ISOCODE3_SUDAN;
                this.countryCurrency = CURRENCY_SUDANESE_POUND;
                break;
            }
            case ISOCODE_SURINAME:
            case ISOCODE3_SURINAME:{
                this.countryISOCode = ISOCODE3_SURINAME;
                this.countryCurrency = CURRENCY_SURINAMESE_DOLLAR;
                break;
            }
            case ISOCODE_SVALBARD_AND_JAN_MAYEN:
            case ISOCODE3_SVALBARD_AND_JAN_MAYEN:{
                this.countryISOCode = ISOCODE3_SVALBARD_AND_JAN_MAYEN;
                this.countryCurrency = CURRENCY_NORWEGIAN_KRONE;
                break;
            }
            case ISOCODE_SWAZILAND:
            case ISOCODE3_SWAZILAND:{
                this.countryISOCode = ISOCODE3_SWAZILAND;
                this.countryCurrency = CURRENCY_SWAZI_LILANGENI;
                break;
            }
            case ISOCODE_SWEDEN:
            case ISOCODE3_SWEDEN:{
                this.countryISOCode = ISOCODE3_SWEDEN;
                this.countryCurrency = CURRENCY_SWEDISH_KRONA_KRONOR;
                break;
            }
            case ISOCODE_SWITZERLAND:
            case ISOCODE3_SWITZERLAND:{
                this.countryISOCode = ISOCODE3_SWITZERLAND;
                this.countryCurrency = CURRENCY_SWISS_FRANC;
                break;
            }
            case ISOCODE_SYRIA:
            case ISOCODE3_SYRIA:{
                this.countryISOCode = ISOCODE3_SYRIA;
                this.countryCurrency = CURRENCY_SYRIAN_POUND;
                break;
            }
            case ISOCODE_TAIWAN:
            case ISOCODE3_TAIWAN:{
                this.countryISOCode = ISOCODE3_TAIWAN;
                this.countryCurrency = CURRENCY_NEW_TAIWAN_DOLLAR;
                break;
            }
            case ISOCODE_TAJIKISTAN:
            case ISOCODE3_TAJIKISTAN:{
                this.countryISOCode = ISOCODE3_TAJIKISTAN;
                this.countryCurrency = CURRENCY_TAJIKISTANI_SOMONI;
                break;
            }
            case ISOCODE_TANZANIA:
            case ISOCODE3_TANZANIA:{
                this.countryISOCode = ISOCODE3_TANZANIA;
                this.countryCurrency = CURRENCY_TANZANIAN_SHILLING;
                break;
            }
            case ISOCODE_THAILAND:
            case ISOCODE3_THAILAND:{
                this.countryISOCode = ISOCODE3_THAILAND;
                this.countryCurrency = CURRENCY_THAI_BAHT;
                break;
            }
            case ISOCODE_TOGO:
            case ISOCODE3_TOGO:{
                this.countryISOCode = ISOCODE3_TOGO;
                this.countryCurrency = CURRENCY_CFA_FRANC_BCEAO;
                break;
            }
            case ISOCODE_TOKELAU:
            case ISOCODE3_TOKELAU:{
                this.countryISOCode = ISOCODE3_TOKELAU;
                this.countryCurrency = CURRENCY_NEW_ZEALAND_DOLLAR;
                break;
            }
            case ISOCODE_TONGA:
            case ISOCODE3_TONGA:{
                this.countryISOCode = ISOCODE3_TONGA;
                this.countryCurrency = CURRENCY_TONGAN_PANGA;
                break;
            }
            case ISOCODE_TRINIDAD_AND_TOBAGO:
            case ISOCODE3_TRINIDAD_AND_TOBAGO:{
                this.countryISOCode = ISOCODE3_TRINIDAD_AND_TOBAGO;
                this.countryCurrency = CURRENCY_TRINIDAD_AND_TOBAGO_DOLLAR;
                break;
            }
            case ISOCODE_TUNISIA:
            case ISOCODE3_TUNISIA:{
                this.countryISOCode = ISOCODE3_TUNISIA;
                this.countryCurrency = CURRENCY_TUNISIAN_DINAR;
                break;
            }
            case ISOCODE_TURKEY:
            case ISOCODE3_TURKEY:{
                this.countryISOCode = ISOCODE3_TURKEY;
                this.countryCurrency = CURRENCY_TURKISH_LIRA;
                break;
            }
            case ISOCODE_TURKMENISTAN:
            case ISOCODE3_TURKMENISTAN:{
                this.countryISOCode = ISOCODE3_TURKMENISTAN;
                this.countryCurrency = CURRENCY_TURKMENISTANI_MANAT;
                break;
            }
            case ISOCODE_TURK_AND_CAICOS_ISLANDS:
            case ISOCODE3_TURK_AND_CAICOS_ISLANDS:{
                this.countryISOCode = ISOCODE3_TURK_AND_CAICOS_ISLANDS;
                this.countryCurrency = CURRENCY_UNITED_STATES_DOLLAR;
                break;
            }
            case ISOCODE_TUVALU:
            case ISOCODE3_TUVALU:{
                this.countryISOCode = ISOCODE3_TUVALU;
                this.countryCurrency = CURRENCY_AUSTRALIAN_DOLLAR;
                break;
            }
            case ISOCODE_US_VIRGIN_ISLANDS:
            case ISOCODE3_US_VIRGIN_ISLANDS:{
                this.countryISOCode = ISOCODE3_US_VIRGIN_ISLANDS;
                this.countryCurrency = CURRENCY_UNITED_STATES_DOLLAR;
                break;
            }
            case ISOCODE_UGANDA:
            case ISOCODE3_UGANDA:{
                this.countryISOCode = ISOCODE3_UGANDA;
                this.countryCurrency = CURRENCY_UGANDAN_SHILLING;
                break;
            }
            case ISOCODE_UKRAINE:
            case ISOCODE3_UKRAINE:{
                this.countryISOCode = ISOCODE3_UKRAINE;
                this.countryCurrency = CURRENCY_UKRAINIAN_HRYVNIA;
                break;
            }
            case ISOCODE_UNITED_ARAB_EMIRATES:
            case ISOCODE3_UNITED_ARAB_EMIRATES:{
                this.countryISOCode = ISOCODE3_UNITED_ARAB_EMIRATES;
                this.countryCurrency = CURRENCY_UNITED_ARAB_EMIRATES_DIRHAM;
                break;
            }
            case ISOCODE_UNITED_KINGDOM:
            case ISOCODE3_UNITED_KINGDOM:{
                this.countryISOCode = ISOCODE3_UNITED_KINGDOM;
                this.countryCurrency = CURRENCY_POUND_STERLING;
                break;
            }
            case ISOCODE_UNITED_STATES:
            case ISOCODE3_UNITED_STATES:{
                this.countryISOCode = ISOCODE3_UNITED_STATES;
                this.countryCurrency = CURRENCY_UNITED_STATES_DOLLAR;
                break;
            }
            case ISOCODE_URUGUAY:
            case ISOCODE3_URUGUAY:{
                this.countryISOCode = ISOCODE3_URUGUAY;
                this.countryCurrency = CURRENCY_URUGUAYAN_PESO;
                break;
            }
            case ISOCODE_UZBEKISTAN:
            case ISOCODE3_UZBEKISTAN:{
                this.countryISOCode = ISOCODE3_UZBEKISTAN;
                this.countryCurrency = CURRENCY_UZBEKISTAN_SOM;
                break;
            }
            case ISOCODE_VANUATU:
            case ISOCODE3_VANUATU:{
                this.countryISOCode = ISOCODE3_VANUATU;
                this.countryCurrency = CURRENCY_VANUATU_VATU;
                break;
            }
            case ISOCODE_VATICAN:
            case ISOCODE3_VATICAN:{
                this.countryISOCode = ISOCODE3_VATICAN;
                this.countryCurrency = CURRENCY_EURO;
                break;
            }
            case ISOCODE_VENEZUELA:
            case ISOCODE3_VENEZUELA:{
                this.countryISOCode = ISOCODE3_VENEZUELA;
                this.countryCurrency = CURRENCY_VENEZUELAN_BOLIVAR;
                break;
            }
            case ISOCODE_VIETNAM:
            case ISOCODE3_VIETNAM:{
                this.countryISOCode = ISOCODE3_VIETNAM;
                this.countryCurrency = CURRENCY_VIETNAMESE_DONG;
                break;
            }
            case ISOCODE_WALLIS_AND_FUTUNA:
            case ISOCODE3_WALLIS_AND_FUTUNA:{
                this.countryISOCode = ISOCODE3_WALLIS_AND_FUTUNA;
                this.countryCurrency = CURRENCY_CFP_FRANC;
                break;
            }
            case ISOCODE_WESTERN_SAHARA:
            case ISOCODE3_WESTERN_SAHARA:{
                this.countryISOCode = ISOCODE3_WESTERN_SAHARA;
                this.countryCurrency = CURRENCY_MOROCCAN_DIRHAM;
                break;
            }
            case ISOCODE_YEMEN:
            case ISOCODE3_YEMEN:{
                this.countryISOCode = ISOCODE3_YEMEN;
                this.countryCurrency = CURRENCY_YEMENI_RIAL;
                break;
            }
            case ISOCODE_ZAMBIA:
            case ISOCODE3_ZAMBIA:{
                this.countryISOCode = ISOCODE3_ZAMBIA;
                this.countryCurrency = CURRENCY_ZAMBIAN_KWACHA;
                break;
            }
            case ISOCODE_ZIMBABWE:
            case ISOCODE3_ZIMBABWE:{
                this.countryISOCode = ISOCODE3_ZIMBABWE;
                this.countryCurrency = CURRENCY_ZIMBABWE_DOLLOAR;
                break;
            }
        }
        return this;
    }
}
