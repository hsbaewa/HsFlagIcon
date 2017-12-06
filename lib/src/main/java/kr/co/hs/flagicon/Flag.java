package kr.co.hs.flagicon;

/**
 * Created by hsbaewa on 2017. 11. 17..
 */

public class Flag implements CountryConst, CurrencyConst{
    Country mCountry;

    public Flag(Country country) {
        mCountry = country;
    }

    public Country getCountry() {
        return mCountry;
    }

    public int getFlagResource(){
        switch (getCountry().getCountryISOCode()){
            case ISOCODE3_AFGHANISTAN:{
                return R.drawable.afghanistan_48;
            }
            case ISOCODE3_ALBANIA:{
                return R.drawable.albania_48;
            }
            case ISOCODE3_ALGERIA:{
                return R.drawable.algeria_48;
            }
            case ISOCODE3_AMERICAN_SAMOA:{
                return R.drawable.americansamoa_48;
            }
            case ISOCODE3_ANDORRA:{
                return R.drawable.andorra_48;
            }
            case ISOCODE3_ANGOLA:{
                return R.drawable.angola_48;
            }
            case ISOCODE3_ANGUILLA:{
                return R.drawable.anguilla_48;
            }
            case ISOCODE3_ANTARCTICA:{
                return R.drawable.antarctica_48;
            }
            case ISOCODE3_ANTIGUA:{
                return R.drawable.antiguabarbuda_48;
            }
            case ISOCODE3_ARGENTINA:{
                return R.drawable.argentina_48;
            }
            case ISOCODE3_ARMENIA:{
                return R.drawable.armenia_48;
            }
            case ISOCODE3_ARUBA:{
                return R.drawable.aruba_48;
            }
            case ISOCODE3_AUSTRALIA:{
                return R.drawable.australia_48;
            }
            case ISOCODE3_AUSTRIA:{
                return R.drawable.austria_48;
            }
            case ISOCODE3_AZERBAIJAN:{
                return R.drawable.azerbaijan_48;
            }
            case ISOCODE3_BAHAMAS:{
                return R.drawable.bahamas_48;
            }
            case ISOCODE3_BAHRAIN:{
                return R.drawable.bahrain_48;
            }
            case ISOCODE3_BANGLADESH:{
                return R.drawable.bangladesh_48;
            }
            case ISOCODE3_BARBADOS:{
                return R.drawable.barbados_48;
            }
            case ISOCODE3_BELARUS:{
                return R.drawable.belarus_48;
            }
            case ISOCODE3_BELGIUM:{
                return R.drawable.belgium_48;
            }
            case ISOCODE3_BELIZE:{
                return R.drawable.belize_48;
            }
            case ISOCODE3_BENIN:{
                return R.drawable.benin_48;
            }
            case ISOCODE3_BERMUDA:{
                return R.drawable.bermuda_48;
            }
            case ISOCODE3_BHUTAN:{
                return R.drawable.bhutan_48;
            }
            case ISOCODE3_BOLIVIA:{
                return R.drawable.bolivia_48;
            }
            case ISOCODE3_BOSNIA_AND_HERZEGOVINA:{
                return R.drawable.bosnia_and_herzegovina_48;
            }
            case ISOCODE3_BOTSWANA:{
                return R.drawable.botswana_48;
            }
            case ISOCODE3_BRAZIL:{
                return R.drawable.brazil_48;
            }
            case ISOCODE3_BRITISH_INDIAN_OCEAN_TERRITORY:{
                return R.drawable.british_indian_ocean_territory_48;
            }
            case ISOCODE3_BRITISH_VIRGIN_ISLANDS:{
                return R.drawable.british_virgin_islands_48;
            }
            case ISOCODE3_BRUNEI:{
                return R.drawable.brunei_48;
            }
            case ISOCODE3_BULGARIA:{
                return R.drawable.bulgaria_48;
            }
            case ISOCODE3_BURKINA_FASO:{
                return R.drawable.burkina_faso_48;
            }
            case ISOCODE3_BURUNDI:{
                return R.drawable.burundi_48;
            }
            case ISOCODE3_CAMBODIA:{
                return R.drawable.cambodia_48;
            }
            case ISOCODE3_CAMEROON:{
                return R.drawable.cameroon_48;
            }
            case ISOCODE3_CANADA:{
                return R.drawable.canada_48;
            }
            case ISOCODE3_CAPE_VERDE:{
                return R.drawable.cape_verde_48;
            }
            case ISOCODE3_CAYMAN_ISLANDS:{
                return R.drawable.cayman_islands_48;
            }
            case ISOCODE3_CENTRAL_AFREICAN_REPUBLIC:{
                return R.drawable.central_african_republic_48;
            }
            case ISOCODE3_CHAD:{
                return R.drawable.chad_48;
            }
            case ISOCODE3_CHILE:{
                return R.drawable.chile_48;
            }
            case ISOCODE3_CHINA:{
                return R.drawable.china_48;
            }
            case ISOCODE3_CHRISTMAS_ISLAND:{
                return R.drawable.christmas_island_48;
            }
            case ISOCODE3_COCOS_ISLANDS:{
                return R.drawable.cocos_island_48;
            }
            case ISOCODE3_COLOMBIA:{
                return R.drawable.colombia_48;
            }
            case ISOCODE3_COMOROS:{
                return R.drawable.comoros_48;
            }
            case ISOCODE3_COOK_ISLANDS:{
                return R.drawable.cook_islands_48;
            }
            case ISOCODE3_COSTA_RICA:{
                return R.drawable.costa_rica_48;
            }
            case ISOCODE3_CROATIA:{
                return R.drawable.croatia_48;
            }
            case ISOCODE3_CUBA:{
                return R.drawable.cuba_48;
            }
            case ISOCODE3_CURACAO:{
                return R.drawable.curacao_48;
            }
            case ISOCODE3_CYPRUS:{
                return R.drawable.cyprus_48;
            }
            case ISOCODE3_CZECH_REPUBLIC:{
                return R.drawable.czech_republic_48;
            }
            case ISOCODE3_DEMOCRATIC_REPUBLIC_OF_CONGO:{
                return R.drawable.congo_kinshasa_zaire_48;
            }
            case ISOCODE3_DENMARK:{
                return R.drawable.denmark_48;
            }
            case ISOCODE3_DJIBOUTI:{
                return R.drawable.djibouti_48;
            }
            case ISOCODE3_DOMINICA:{
                return R.drawable.dominica_48;
            }
            case ISOCODE3_DOMINICAN_REPUBLIC:{
                return R.drawable.dominican_republic_48;
            }
            case ISOCODE3_EAST_TIMOR:{
                return R.drawable.east_timor_48;
            }
            case ISOCODE3_ECUADOR:{
                return R.drawable.ecuador_48;
            }
            case ISOCODE3_EGYPT:{
                return R.drawable.egypt_48;
            }
            case ISOCODE3_EL_SALVADOR:{
                return R.drawable.el_salvador_48;
            }
            case ISOCODE3_EQUATORIAL_GUINEA:{
                return R.drawable.equatorial_guinea_48;
            }
            case ISOCODE3_ERITREA:{
                return R.drawable.eritrea_48;
            }
            case ISOCODE3_ESTONIA:{
                return R.drawable.estonia_48;
            }
            case ISOCODE3_ETHIOPIA:{
                return R.drawable.ethiopia_48;
            }
            case ISOCODE3_FALKLAND_ISLANDS:{
                return R.drawable.falkland_islands_48;
            }
            case ISOCODE3_FAROE_ISLANDS:{
                return R.drawable.faroes_48;
            }
            case ISOCODE3_FIJI:{
                return R.drawable.fiji_48;
            }
            case ISOCODE3_FINLAND:{
                return R.drawable.finland_48;
            }
            case ISOCODE3_FRANCE:{
                return R.drawable.france_48;
            }
            case ISOCODE3_FRENCH_POLYNESIA:{
                return R.drawable.tahiti_french_polinesia_48;
            }
            case ISOCODE3_GABON:{
                return R.drawable.gabon_48;
            }
            case ISOCODE3_GAMBIA:{
                return R.drawable.gambia_48;
            }
            case ISOCODE3_GEORGIA:{
                return R.drawable.georgia_48;
            }
            case ISOCODE3_GERMANY:{
                return R.drawable.germany_48;
            }
            case ISOCODE3_GHANA:{
                return R.drawable.ghana_48;
            }
            case ISOCODE3_GIBRALTAR:{
                return R.drawable.gibraltar_48;
            }
            case ISOCODE3_GREECE:{
                return R.drawable.greece_48;
            }
            case ISOCODE3_GREENLAND:{
                return R.drawable.greenland_48;
            }
            case ISOCODE3_GRENADA:{
                return R.drawable.grenada_48;
            }
            case ISOCODE3_GUAM:{
                return R.drawable.guam_48;
            }
            case ISOCODE3_GUATEMALA:{
                return R.drawable.guatemala_48;
            }
            case ISOCODE3_GUERNSEY:{
                return R.drawable.guernsey_48;
            }
            case ISOCODE3_GUINEA:{
                return R.drawable.guinea_48;
            }
            case ISOCODE3_GUINEA_BISSAU:{
                return R.drawable.guinea_bissau_48;
            }
            case ISOCODE3_GUYANA:{
                return R.drawable.guyana_48;
            }
            case ISOCODE3_HAITI:{
                return R.drawable.haiti_48;
            }
            case ISOCODE3_HONDURAS:{
                return R.drawable.honduras_48;
            }
            case ISOCODE3_HONGKONG:{
                return R.drawable.hong_kong_48;
            }
            case ISOCODE3_HUNGARY:{
                return R.drawable.hungary_48;
            }
            case ISOCODE3_ICELAND:{
                return R.drawable.iceland_48;
            }
            case ISOCODE3_INDIA:{
                return R.drawable.india_48;
            }
            case ISOCODE3_INDONESIA:{
                return R.drawable.indonezia_48;
            }
            case ISOCODE3_IRAN:{
                return R.drawable.iran_48;
            }
            case ISOCODE3_IRAQ:{
                return R.drawable.iraq_48;
            }
            case ISOCODE3_IRELAND:{
                return R.drawable.ireland_48;
            }
            case ISOCODE3_ISLE_OF_MAN:{
                return R.drawable.isle_of_man_48;
            }
            case ISOCODE3_ISRAEL:{
                return R.drawable.israel_48;
            }
            case ISOCODE3_ITALY:{
                return R.drawable.italy_48;
            }
            case ISOCODE3_IVORY_COAST :{
                return R.drawable.cote_divoire_48;
            }
            case ISOCODE3_JAMAICA:{
                return R.drawable.jamaica_48;
            }
            case ISOCODE3_JAPAN:{
                return R.drawable.japan_48;
            }
            case ISOCODE3_JERSEY:{
                return R.drawable.jersey_48;
            }
            case ISOCODE3_JORDAN:{
                return R.drawable.jordan_48;
            }
            case ISOCODE3_KAZAKHSTAN:{
                return R.drawable.kazakhstan_48;
            }
            case ISOCODE3_KENYA:{
                return R.drawable.kenya_48;
            }
            case ISOCODE3_KIRIBATI:{
                return R.drawable.kiribati_48;
            }
            case ISOCODE3_KOSOVO:{
                return R.drawable.kosovo_48;
            }
            case ISOCODE3_KUWAIT:{
                return R.drawable.kuwait_48;
            }
            case ISOCODE3_KYRGYZSTAN:{
                return R.drawable.kyrgyzstan_48;
            }
            case ISOCODE3_LAOS:{
                return R.drawable.laos_48;
            }
            case ISOCODE3_LATVIA:{
                return R.drawable.latvia_48;
            }
            case ISOCODE3_LEBANON:{
                return R.drawable.lebanon_48;
            }
            case ISOCODE3_LESOTHO:{
                return R.drawable.lesotho_48;
            }
            case ISOCODE3_LIBERIA:{
                return R.drawable.liberia_48;
            }
            case ISOCODE3_LIBYA:{
                return R.drawable.libya_48;
            }
            case ISOCODE3_LIECHTENSTEIN:{
                return R.drawable.liechtenshein_48;
            }
            case ISOCODE3_LITHUANIA:{
                return R.drawable.lithuania_48;
            }
            case ISOCODE3_LUXEMBOURG:{
                return R.drawable.luxembourg_48;
            }
            case ISOCODE3_MACAU:{
                return R.drawable.macao_48;
            }
            case ISOCODE3_MACEDONIA:{
                return R.drawable.macedonia_48;
            }
            case ISOCODE3_MADAGASCAR:{
                return R.drawable.madagascar_48;
            }
            case ISOCODE3_MALAWI:{
                return R.drawable.malawi_48;
            }
            case ISOCODE3_MALAYSIA:{
                return R.drawable.malaysia_48;
            }
            case ISOCODE3_MALDIVES:{
                return R.drawable.maldives_48;
            }
            case ISOCODE3_MALI:{
                return R.drawable.mali_48;
            }
            case ISOCODE3_MALTA:{
                return R.drawable.malta_48;
            }
            case ISOCODE3_MARSHALL_ISLANDS:{
                return R.drawable.marshall_islands_48;
            }
            case ISOCODE3_MAURITANIA:{
                return R.drawable.mauritania_48;
            }
            case ISOCODE3_MAURITIUS:{
                return R.drawable.mauritius_48;
            }
            case ISOCODE3_MAYOTTE:{
                return R.drawable.mayotte_48;
            }
            case ISOCODE3_MEXICO:{
                return R.drawable.mexico_48;
            }
            case ISOCODE3_MICRONESIA:{
                return R.drawable.micronesia_48;
            }
            case ISOCODE3_MOLDOVA:{
                return R.drawable.moldova_48;
            }
            case ISOCODE3_MONACO:{
                return R.drawable.monaco_48;
            }
            case ISOCODE3_MONGOLIA:{
                return R.drawable.mongolia_48;
            }
            case ISOCODE3_MONTENEGRO:{
                return R.drawable.montenegro_48;
            }
            case ISOCODE3_MONTSERRAT:{
                return R.drawable.montserrat_48;
            }
            case ISOCODE3_MOROCCO:{
                return R.drawable.morocco_48;
            }
            case ISOCODE3_MOZAMBIQUE:{
                return R.drawable.mozambique_48;
            }
            case ISOCODE3_MYANMAR:{
                return R.drawable.myanmar_burma_48;
            }
            case ISOCODE3_NAMIBIA:{
                return R.drawable.namibia_48;
            }
            case ISOCODE3_NAURU:{
                return R.drawable.nauru_48;
            }
            case ISOCODE3_NEPAL:{
                return R.drawable.nepal_48;
            }
            case ISOCODE3_NETHERLANDS:{
                return R.drawable.netherlands_48;
            }
            case ISOCODE3_NETHERLANDS_ANTILLES:{
                return R.drawable.netherlands_antilles_48;
            }
            case ISOCODE3_NEW_CALEDONIA:{
                return R.drawable.new_caledonia_48;
            }
            case ISOCODE3_NEW_ZEALAND:{
                return R.drawable.new_zealand_48;
            }
            case ISOCODE3_NICARAGUA:{
                return R.drawable.nicaragua_48;
            }
            case ISOCODE3_NIGER:{
                return R.drawable.niger_48;
            }
            case ISOCODE3_NIGERIA:{
                return R.drawable.nigeria_48;
            }
            case ISOCODE3_NIUE:{
                return R.drawable.niue_48;
            }
            case ISOCODE3_NORTH_KOREA:{
                return R.drawable.north_korea_48;
            }
            case ISOCODE3_NORTHERN_MARIANA_ISLANDS:{
                return R.drawable.northern_mariana_48;
            }
            case ISOCODE3_NORWAY:{
                return R.drawable.norway_48;
            }
            case ISOCODE3_OMAN:{
                return R.drawable.oman_48;
            }
            case ISOCODE3_PAKISTAN:{
                return R.drawable.pakistan_48;
            }
            case ISOCODE3_PALAU:{
                return R.drawable.palau_48;
            }
            case ISOCODE3_PALESTINE:{
                return R.drawable.palestine_48;
            }
            case ISOCODE3_PANAMA:{
                return R.drawable.panama_48;
            }
            case ISOCODE3_PAPUA_NEW_GUINEA:{
                return R.drawable.papua_new_guinea_48;
            }
            case ISOCODE3_PARAGUAY:{
                return R.drawable.paraguay_48;
            }
            case ISOCODE3_PERU:{
                return R.drawable.peru_48;
            }
            case ISOCODE3_PHILIPPINES:{
                return R.drawable.philippines_48;
            }
            case ISOCODE3_PITCAIRN:{
                return R.drawable.pitcairn_48;
            }
            case ISOCODE3_POLAND:{
                return R.drawable.poland_48;
            }
            case ISOCODE3_PORTUGAL:{
                return R.drawable.portugal_48;
            }
            case ISOCODE3_PUERTO_RICO:{
                return R.drawable.puerto_rico_48;
            }
            case ISOCODE3_QATAR:{
                return R.drawable.qatar_48;
            }
            case ISOCODE3_REPUBLIC_OF_THE_CONGO:{
                return R.drawable.congo_brazzaville_48;
            }
            case ISOCODE3_REUNION:{
                return R.drawable.reunion_48;
            }
            case ISOCODE3_ROMANIA:{
                return R.drawable.romania_48;
            }
            case ISOCODE3_RUSSIA:{
                return R.drawable.russian_federation_48;
            }
            case ISOCODE3_RWANDA:{
                return R.drawable.rwanda_48;
            }
            case ISOCODE3_SAINT_BARTHELEMY:{
                return R.drawable.saint_barthelemy_48;
            }
            case ISOCODE3_SAINT_HELENA:{
                return R.drawable.saint_helena_48;
            }
            case ISOCODE3_SAINT_KITTS_AND_NEVIS:{
                return R.drawable.st_kitts_nevis_48;
            }
            case ISOCODE3_SAINT_LUCIA:{
                return R.drawable.saint_lucia_48;
            }
            case ISOCODE3_SAINT_MARTIN:{
                return R.drawable.saint_martin_48;
            }
            case ISOCODE3_SAINT_PIERRE_AND_MIQUELON:{
                return R.drawable.saint_pierre_and_miquelon_48;
            }
            case ISOCODE3_SAINT_VINCENT_AND_GRENADINES:{
                return R.drawable.st_vincent_the_grenadines_48;
            }
            case ISOCODE3_SAMOA:{
                return R.drawable.samoa_48;
            }
            case ISOCODE3_SAN_MARINO:{
                return R.drawable.san_marino_48;
            }
            case ISOCODE3_SAO_TOME_AND_PRINCIPE:{
                return R.drawable.sao_tome_principe_48;
            }
            case ISOCODE3_SAUDI_ARABIA:{
                return R.drawable.saudi_arabia_48;
            }
            case ISOCODE3_SENEGAL:{
                return R.drawable.senegal_48;
            }
            case ISOCODE3_SERBIA:{
                return R.drawable.serbia_48;
            }
            case ISOCODE3_SEYCHELLES:{
                return R.drawable.seychelles_48;
            }
            case ISOCODE3_SIERRA_LEONE:{
                return R.drawable.sierra_leone_48;
            }
            case ISOCODE3_SINGAPORE:{
                return R.drawable.singapore_48;
            }
            case ISOCODE3_SINT_MAARTEN:{
                return R.drawable.sint_maarten_48;
            }
            case ISOCODE3_SLOVAKIA:{
                return R.drawable.slovakia_48;
            }
            case ISOCODE3_SLOVENIA:{
                return R.drawable.slovenia_48;
            }
            case ISOCODE3_SOLOMON_ISLANDS:{
                return R.drawable.solomon_islands_48;
            }
            case ISOCODE3_SOMALIA:{
                return R.drawable.somaliland_48;
            }
            case ISOCODE3_SOUTH_AFRICA:{
                return R.drawable.south_africa_48;
            }
            case ISOCODE3_SOUTH_KOREA:{
                return R.drawable.south_korea_48;
            }
            case ISOCODE3_SOUTH_SUDAN:{
                return R.drawable.southern_sudan_48;
            }
            case ISOCODE3_SPAIN:{
                return R.drawable.spain_48;
            }
            case ISOCODE3_SRI_LANKA:{
                return R.drawable.sri_lanka_48;
            }
            case ISOCODE3_SUDAN:{
                return R.drawable.sudan_48;
            }
            case ISOCODE3_SURINAME:{
                return R.drawable.suriname_48;
            }
            case ISOCODE3_SVALBARD_AND_JAN_MAYEN:{
                return R.drawable.svalbard_and_jan_mayen_48;
            }
            case ISOCODE3_SWAZILAND:{
                return R.drawable.swaziland_48;
            }
            case ISOCODE3_SWEDEN:{
                return R.drawable.sweden_48;
            }
            case ISOCODE3_SWITZERLAND:{
                return R.drawable.switzerland_48;
            }
            case ISOCODE3_SYRIA:{
                return R.drawable.syria_48;
            }
            case ISOCODE3_TAIWAN:{
                return R.drawable.taiwan_48;
            }
            case ISOCODE3_TAJIKISTAN:{
                return R.drawable.tajikistan_48;
            }
            case ISOCODE3_TANZANIA:{
                return R.drawable.tanzania_48;
            }
            case ISOCODE3_THAILAND:{
                return R.drawable.thailand_48;
            }
            case ISOCODE3_TOGO:{
                return R.drawable.togo_48;
            }
            case ISOCODE3_TOKELAU:{
                return R.drawable.tokelau_48;
            }
            case ISOCODE3_TONGA:{
                return R.drawable.tonga_48;
            }
            case ISOCODE3_TRINIDAD_AND_TOBAGO:{
                return R.drawable.trinidad_tobago_48;
            }
            case ISOCODE3_TUNISIA:{
                return R.drawable.tunisia_48;
            }
            case ISOCODE3_TURKEY:{
                return R.drawable.turkey_48;
            }
            case ISOCODE3_TURKMENISTAN:{
                return R.drawable.turkmenistan_48;
            }
            case ISOCODE3_TURK_AND_CAICOS_ISLANDS:{
                return R.drawable.turks_and_caicos_islands_48;
            }
            case ISOCODE3_TUVALU:{
                return R.drawable.tuvalu_48;
            }
            case ISOCODE3_US_VIRGIN_ISLANDS:{
                return R.drawable.virgin_islands_us_48;
            }
            case ISOCODE3_UGANDA:{
                return R.drawable.uganda_48;
            }
            case ISOCODE3_UKRAINE:{
                return R.drawable.ukraine_48;
            }
            case ISOCODE3_UNITED_ARAB_EMIRATES:{
                return R.drawable.united_arab_emirates_48;
            }
            case ISOCODE3_UNITED_KINGDOM:{
                return R.drawable.united_kingdom_great_britain_48;
            }
            case ISOCODE3_UNITED_STATES:{
                return R.drawable.united_states_of_america_48;
            }
            case ISOCODE3_URUGUAY:{
                return R.drawable.uruguay_48;
            }
            case ISOCODE3_UZBEKISTAN:{
                return R.drawable.uzbekistan_48;
            }
            case ISOCODE3_VANUATU:{
                return R.drawable.vanutau_48;
            }
            case ISOCODE3_VATICAN:{
                return R.drawable.vatican_city_48;
            }
            case ISOCODE3_VENEZUELA:{
                return R.drawable.venezuela_48;
            }
            case ISOCODE3_VIETNAM:{
                return R.drawable.viet_nam_48;
            }
            case ISOCODE3_WALLIS_AND_FUTUNA:{
                return R.drawable.wallis_and_futuna_48;
            }
            case ISOCODE3_WESTERN_SAHARA:{
                return R.drawable.western_sahara_48;
            }
            case ISOCODE3_YEMEN:{
                return R.drawable.yemen_48;
            }
            case ISOCODE3_ZAMBIA:{
                return R.drawable.zambia_48;
            }
            case ISOCODE3_ZIMBABWE:{
                return R.drawable.zimbabwe_48;
            }
            default:return -1;
        }
    }





    public int getFlagResourceFlat(){
        switch (getCountry().getCountryISOCode()){
            case ISOCODE3_AFGHANISTAN:{
                return R.drawable.flat_afghanistan_64;
            }
            case ISOCODE3_ALBANIA:{
                return R.drawable.flat_albania_64;
            }
            case ISOCODE3_ALGERIA:{
                return R.drawable.flat_algeria_64;
            }
            case ISOCODE3_AMERICAN_SAMOA:{
                return R.drawable.flat_american_samoa_64;
            }
            case ISOCODE3_ANDORRA:{
                return R.drawable.flat_andorra_64;
            }
            case ISOCODE3_ANGOLA:{
                return R.drawable.flat_angola_64;
            }
            case ISOCODE3_ANGUILLA:{
                return R.drawable.flat_anguilla_64;
            }
            case ISOCODE3_ANTARCTICA:{
                return R.drawable.flat_antarctica_64;
            }
            case ISOCODE3_ANTIGUA:{
                return R.drawable.flat_antigua_and_barbuda_64;
            }
            case ISOCODE3_ARGENTINA:{
                return R.drawable.flat_argentina_64;
            }
            case ISOCODE3_ARMENIA:{
                return R.drawable.flat_armenia_64;
            }
            case ISOCODE3_ARUBA:{
                return R.drawable.flat_aruba_64;
            }
            case ISOCODE3_AUSTRALIA:{
                return R.drawable.flat_australia_64;
            }
            case ISOCODE3_AUSTRIA:{
                return R.drawable.flat_austria_64;
            }
            case ISOCODE3_AZERBAIJAN:{
                return R.drawable.flat_azerbaijan_64;
            }
            case ISOCODE3_BAHAMAS:{
                return R.drawable.flat_bahamas_64;
            }
            case ISOCODE3_BAHRAIN:{
                return R.drawable.flat_bahrain_64;
            }
            case ISOCODE3_BANGLADESH:{
                return R.drawable.flat_bangladesh_64;
            }
            case ISOCODE3_BARBADOS:{
                return R.drawable.flat_barbados_64;
            }
            case ISOCODE3_BELARUS:{
                return R.drawable.flat_belarus_64;
            }
            case ISOCODE3_BELGIUM:{
                return R.drawable.flat_belgium_64;
            }
            case ISOCODE3_BELIZE:{
                return R.drawable.flat_belize_64;
            }
            case ISOCODE3_BENIN:{
                return R.drawable.flat_benin_64;
            }
            case ISOCODE3_BERMUDA:{
                return R.drawable.flat_bermuda_64;
            }
            case ISOCODE3_BHUTAN:{
                return R.drawable.flat_bhutan_64;
            }
            case ISOCODE3_BOLIVIA:{
                return R.drawable.flat_bolivia_64;
            }
            case ISOCODE3_BOSNIA_AND_HERZEGOVINA:{
                return R.drawable.flat_bosnia_and_herzegovina_64;
            }
            case ISOCODE3_BOTSWANA:{
                return R.drawable.flat_botswana_64;
            }
            case ISOCODE3_BRAZIL:{
                return R.drawable.flat_brazil_64;
            }
            case ISOCODE3_BRITISH_INDIAN_OCEAN_TERRITORY:{
                return R.drawable.flat_british_virgin_islands_64;
            }
            case ISOCODE3_BRITISH_VIRGIN_ISLANDS:{
                return R.drawable.flat_british_virgin_islands_64;
            }
            case ISOCODE3_BRUNEI:{
                return R.drawable.flat_brunei_64;
            }
            case ISOCODE3_BULGARIA:{
                return R.drawable.flat_bulgaria_64;
            }
            case ISOCODE3_BURKINA_FASO:{
                return R.drawable.flat_burkina_faso_64;
            }
            case ISOCODE3_BURUNDI:{
                return R.drawable.flat_burundi_64;
            }
            case ISOCODE3_CAMBODIA:{
                return R.drawable.flat_cambodia_64;
            }
            case ISOCODE3_CAMEROON:{
                return R.drawable.flat_cameroon_64;
            }
            case ISOCODE3_CANADA:{
                return R.drawable.flat_canada_64;
            }
            case ISOCODE3_CAPE_VERDE:{
                return R.drawable.flat_cape_verde_64;
            }
            case ISOCODE3_CAYMAN_ISLANDS:{
                return R.drawable.flat_cayman_islands_64;
            }
            case ISOCODE3_CENTRAL_AFREICAN_REPUBLIC:{
                return R.drawable.flat_central_african_republic_64;
            }
            case ISOCODE3_CHAD:{
                return R.drawable.flat_chad_64;
            }
            case ISOCODE3_CHILE:{
                return R.drawable.flat_chile_64;
            }
            case ISOCODE3_CHINA:{
                return R.drawable.flat_china_64;
            }
            case ISOCODE3_CHRISTMAS_ISLAND:{
                return R.drawable.christmas_island_64;
            }
            case ISOCODE3_COCOS_ISLANDS:{
                return R.drawable.cocos_island_48;
            }
            case ISOCODE3_COLOMBIA:{
                return R.drawable.flat_colombia_64;
            }
            case ISOCODE3_COMOROS:{
                return R.drawable.flat_comoros_64;
            }
            case ISOCODE3_COOK_ISLANDS:{
                return R.drawable.cocos_island_64;
            }
            case ISOCODE3_COSTA_RICA:{
                return R.drawable.flat_costa_rica_64;
            }
            case ISOCODE3_CROATIA:{
                return R.drawable.flat_croatia_64;
            }
            case ISOCODE3_CUBA:{
                return R.drawable.flat_cuba_64;
            }
            case ISOCODE3_CURACAO:{
                return R.drawable.curacao_64;
            }
            case ISOCODE3_CYPRUS:{
                return R.drawable.flat_cyprus_64;
            }
            case ISOCODE3_CZECH_REPUBLIC:{
                return R.drawable.flat_czech_republic_64;
            }
            case ISOCODE3_DEMOCRATIC_REPUBLIC_OF_CONGO:{
                return R.drawable.flat_democratic_republic_of_the_congo_64;
            }
            case ISOCODE3_DENMARK:{
                return R.drawable.flat_denmark_64;
            }
            case ISOCODE3_DJIBOUTI:{
                return R.drawable.flat_djibouti_64;
            }
            case ISOCODE3_DOMINICA:{
                return R.drawable.flat_dominica_64;
            }
            case ISOCODE3_DOMINICAN_REPUBLIC:{
                return R.drawable.flat_dominican_republic_64;
            }
            case ISOCODE3_EAST_TIMOR:{
                return R.drawable.flat_east_timor_64;
            }
            case ISOCODE3_ECUADOR:{
                return R.drawable.flat_ecuador_64;
            }
            case ISOCODE3_EGYPT:{
                return R.drawable.flat_egypt_64;
            }
            case ISOCODE3_EL_SALVADOR:{
                return R.drawable.flat_el_salvador_64;
            }
            case ISOCODE3_EQUATORIAL_GUINEA:{
                return R.drawable.flat_equatorial_guinea_64;
            }
            case ISOCODE3_ERITREA:{
                return R.drawable.flat_eritrea_64;
            }
            case ISOCODE3_ESTONIA:{
                return R.drawable.flat_estonia_64;
            }
            case ISOCODE3_ETHIOPIA:{
                return R.drawable.flat_ethiopia_64;
            }
            case ISOCODE3_FALKLAND_ISLANDS:{
                return R.drawable.flat_falkland_islands_64;
            }
            case ISOCODE3_FAROE_ISLANDS:{
                return R.drawable.flat_faroes_64;
            }
            case ISOCODE3_FIJI:{
                return R.drawable.flat_fiji_64;
            }
            case ISOCODE3_FINLAND:{
                return R.drawable.flat_finland_64;
            }
            case ISOCODE3_FRANCE:{
                return R.drawable.flat_france_64;
            }
            case ISOCODE3_FRENCH_POLYNESIA:{
                return R.drawable.tahiti_french_polinesia_64;
            }
            case ISOCODE3_GABON:{
                return R.drawable.flat_gabon_64;
            }
            case ISOCODE3_GAMBIA:{
                return R.drawable.flat_gambia_64;
            }
            case ISOCODE3_GEORGIA:{
                return R.drawable.flat_georgia_64;
            }
            case ISOCODE3_GERMANY:{
                return R.drawable.flat_germany_64;
            }
            case ISOCODE3_GHANA:{
                return R.drawable.flat_ghana_64;
            }
            case ISOCODE3_GIBRALTAR:{
                return R.drawable.gibraltar_64;
            }
            case ISOCODE3_GREECE:{
                return R.drawable.flat_greece_64;
            }
            case ISOCODE3_GREENLAND:{
                return R.drawable.flat_greenland_64;
            }
            case ISOCODE3_GRENADA:{
                return R.drawable.flat_grenada_64;
            }
            case ISOCODE3_GUAM:{
                return R.drawable.flat_guam_64;
            }
            case ISOCODE3_GUATEMALA:{
                return R.drawable.flat_guatemala_64;
            }
            case ISOCODE3_GUERNSEY:{
                return R.drawable.flat_guernsey_64;
            }
            case ISOCODE3_GUINEA:{
                return R.drawable.flat_guinea_64;
            }
            case ISOCODE3_GUINEA_BISSAU:{
                return R.drawable.flat_guinea_bissau_64;
            }
            case ISOCODE3_GUYANA:{
                return R.drawable.flat_guyana_64;
            }
            case ISOCODE3_HAITI:{
                return R.drawable.flat_haiti_64;
            }
            case ISOCODE3_HONDURAS:{
                return R.drawable.flat_honduras_64;
            }
            case ISOCODE3_HONGKONG:{
                return R.drawable.flat_hong_kong_64;
            }
            case ISOCODE3_HUNGARY:{
                return R.drawable.flat_hungary_64;
            }
            case ISOCODE3_ICELAND:{
                return R.drawable.flat_iceland_64;
            }
            case ISOCODE3_INDIA:{
                return R.drawable.flat_india_64;
            }
            case ISOCODE3_INDONESIA:{
                return R.drawable.flat_indonesia_64;
            }
            case ISOCODE3_IRAN:{
                return R.drawable.flat_iran_64;
            }
            case ISOCODE3_IRAQ:{
                return R.drawable.flat_iraq_64;
            }
            case ISOCODE3_IRELAND:{
                return R.drawable.flat_ireland_64;
            }
            case ISOCODE3_ISLE_OF_MAN:{
                return R.drawable.flat_isle_of_man_64;
            }
            case ISOCODE3_ISRAEL:{
                return R.drawable.flat_israel_64;
            }
            case ISOCODE3_ITALY:{
                return R.drawable.flat_italy_64;
            }
            case ISOCODE3_IVORY_COAST :{
                return R.drawable.flat_ivory_coast_64;
            }
            case ISOCODE3_JAMAICA:{
                return R.drawable.flat_jamaica_64;
            }
            case ISOCODE3_JAPAN:{
                return R.drawable.flat_japan_64;
            }
            case ISOCODE3_JERSEY:{
                return R.drawable.flat_jersey_64;
            }
            case ISOCODE3_JORDAN:{
                return R.drawable.flat_jordan_64;
            }
            case ISOCODE3_KAZAKHSTAN:{
                return R.drawable.flat_kazakhstan_64;
            }
            case ISOCODE3_KENYA:{
                return R.drawable.flat_kenya_64;
            }
            case ISOCODE3_KIRIBATI:{
                return R.drawable.flat_kiribati_64;
            }
            case ISOCODE3_KOSOVO:{
                return R.drawable.flat_kosovo_64;
            }
            case ISOCODE3_KUWAIT:{
                return R.drawable.flat_kuwait_64;
            }
            case ISOCODE3_KYRGYZSTAN:{
                return R.drawable.flat_kyrgyzstan_64;
            }
            case ISOCODE3_LAOS:{
                return R.drawable.flat_laos_64;
            }
            case ISOCODE3_LATVIA:{
                return R.drawable.flat_latvia_64;
            }
            case ISOCODE3_LEBANON:{
                return R.drawable.flat_lebanon_64;
            }
            case ISOCODE3_LESOTHO:{
                return R.drawable.flat_lesotho_64;
            }
            case ISOCODE3_LIBERIA:{
                return R.drawable.flat_liberia_64;
            }
            case ISOCODE3_LIBYA:{
                return R.drawable.flat_libya_64;
            }
            case ISOCODE3_LIECHTENSTEIN:{
                return R.drawable.flat_liechtenstein_64;
            }
            case ISOCODE3_LITHUANIA:{
                return R.drawable.flat_lithuania_64;
            }
            case ISOCODE3_LUXEMBOURG:{
                return R.drawable.flat_luxembourg_64;
            }
            case ISOCODE3_MACAU:{
                return R.drawable.flat_macau_64;
            }
            case ISOCODE3_MACEDONIA:{
                return R.drawable.flat_macedonia_64;
            }
            case ISOCODE3_MADAGASCAR:{
                return R.drawable.flat_madagascar_64;
            }
            case ISOCODE3_MALAWI:{
                return R.drawable.flat_malawi_64;
            }
            case ISOCODE3_MALAYSIA:{
                return R.drawable.flat_malaysia_64;
            }
            case ISOCODE3_MALDIVES:{
                return R.drawable.flat_maldives_64;
            }
            case ISOCODE3_MALI:{
                return R.drawable.flat_mali_64;
            }
            case ISOCODE3_MALTA:{
                return R.drawable.flat_malta_64;
            }
            case ISOCODE3_MARSHALL_ISLANDS:{
                return R.drawable.flat_marshall_islands_64;
            }
            case ISOCODE3_MAURITANIA:{
                return R.drawable.flat_mauritania_64;
            }
            case ISOCODE3_MAURITIUS:{
                return R.drawable.flat_mauritius_64;
            }
            case ISOCODE3_MAYOTTE:{
                return R.drawable.mayotte_64;
            }
            case ISOCODE3_MEXICO:{
                return R.drawable.flat_mexico_64;
            }
            case ISOCODE3_MICRONESIA:{
                return R.drawable.flat_micronesia_64;
            }
            case ISOCODE3_MOLDOVA:{
                return R.drawable.flat_moldova_64;
            }
            case ISOCODE3_MONACO:{
                return R.drawable.flat_monaco_64;
            }
            case ISOCODE3_MONGOLIA:{
                return R.drawable.flat_mongolia_64;
            }
            case ISOCODE3_MONTENEGRO:{
                return R.drawable.flat_montenegro_64;
            }
            case ISOCODE3_MONTSERRAT:{
                return R.drawable.flat_montserrat_64;
            }
            case ISOCODE3_MOROCCO:{
                return R.drawable.flat_morocco_64;
            }
            case ISOCODE3_MOZAMBIQUE:{
                return R.drawable.flat_mozambique_64;
            }
            case ISOCODE3_MYANMAR:{
                return R.drawable.flat_myanmar_64;
            }
            case ISOCODE3_NAMIBIA:{
                return R.drawable.flat_namibia_64;
            }
            case ISOCODE3_NAURU:{
                return R.drawable.flat_nauru_64;
            }
            case ISOCODE3_NEPAL:{
                return R.drawable.flat_nepal_64;
            }
            case ISOCODE3_NETHERLANDS:{
                return R.drawable.flat_netherlands_64;
            }
            case ISOCODE3_NETHERLANDS_ANTILLES:{
                return R.drawable.flat_netherlands_antilles_64;
            }
            case ISOCODE3_NEW_CALEDONIA:{
                return R.drawable.new_caledonia_64;
            }
            case ISOCODE3_NEW_ZEALAND:{
                return R.drawable.flat_new_zealand_64;
            }
            case ISOCODE3_NICARAGUA:{
                return R.drawable.flat_nicaragua_64;
            }
            case ISOCODE3_NIGER:{
                return R.drawable.flat_niger_64;
            }
            case ISOCODE3_NIGERIA:{
                return R.drawable.flat_nigeria_64;
            }
            case ISOCODE3_NIUE:{
                return R.drawable.niue_64;
            }
            case ISOCODE3_NORTH_KOREA:{
                return R.drawable.flat_north_korea_64;
            }
            case ISOCODE3_NORTHERN_MARIANA_ISLANDS:{
                return R.drawable.flat_northern_mariana_islands_64;
            }
            case ISOCODE3_NORWAY:{
                return R.drawable.flat_norway_64;
            }
            case ISOCODE3_OMAN:{
                return R.drawable.flat_oman_64;
            }
            case ISOCODE3_PAKISTAN:{
                return R.drawable.flat_pakistan_64;
            }
            case ISOCODE3_PALAU:{
                return R.drawable.flat_palau_64;
            }
            case ISOCODE3_PALESTINE:{
                return R.drawable.flat_palestine_64;
            }
            case ISOCODE3_PANAMA:{
                return R.drawable.flat_panama_64;
            }
            case ISOCODE3_PAPUA_NEW_GUINEA:{
                return R.drawable.flat_papua_new_guinea_64;
            }
            case ISOCODE3_PARAGUAY:{
                return R.drawable.flat_paraguay_64;
            }
            case ISOCODE3_PERU:{
                return R.drawable.flat_peru_64;
            }
            case ISOCODE3_PHILIPPINES:{
                return R.drawable.flat_philippines_64;
            }
            case ISOCODE3_PITCAIRN:{
                return R.drawable.flat_pitcairn_islands_64;
            }
            case ISOCODE3_POLAND:{
                return R.drawable.flat_poland_64;
            }
            case ISOCODE3_PORTUGAL:{
                return R.drawable.flat_portugal_64;
            }
            case ISOCODE3_PUERTO_RICO:{
                return R.drawable.flat_puerto_rico_64;
            }
            case ISOCODE3_QATAR:{
                return R.drawable.flat_qatar_64;
            }
            case ISOCODE3_REPUBLIC_OF_THE_CONGO:{
                return R.drawable.flat_republic_of_the_congo_64;
            }
            case ISOCODE3_REUNION:{
                return R.drawable.reunion_64;
            }
            case ISOCODE3_ROMANIA:{
                return R.drawable.flat_romania_64;
            }
            case ISOCODE3_RUSSIA:{
                return R.drawable.flat_russia_64;
            }
            case ISOCODE3_RWANDA:{
                return R.drawable.flat_rwanda_64;
            }
            case ISOCODE3_SAINT_BARTHELEMY:{
                return R.drawable.flat_saint_barthelemy_64;
            }
            case ISOCODE3_SAINT_HELENA:{
                return R.drawable.flat_saint_helena_64;
            }
            case ISOCODE3_SAINT_KITTS_AND_NEVIS:{
                return R.drawable.flat_saint_kitts_and_nevis_64;
            }
            case ISOCODE3_SAINT_LUCIA:{
                return R.drawable.flat_saint_lucia_64;
            }
            case ISOCODE3_SAINT_MARTIN:{
                return R.drawable.saint_martin_64;
            }
            case ISOCODE3_SAINT_PIERRE_AND_MIQUELON:{
                return R.drawable.saint_pierre_and_miquelon_64;
            }
            case ISOCODE3_SAINT_VINCENT_AND_GRENADINES:{
                return R.drawable.flat_saint_vincent_and_the_grenadines_64;
            }
            case ISOCODE3_SAMOA:{
                return R.drawable.flat_samoa_64;
            }
            case ISOCODE3_SAN_MARINO:{
                return R.drawable.flat_san_marino_64;
            }
            case ISOCODE3_SAO_TOME_AND_PRINCIPE:{
                return R.drawable.flat_sao_tome_and_principe_64;
            }
            case ISOCODE3_SAUDI_ARABIA:{
                return R.drawable.flat_saudi_arabia_64;
            }
            case ISOCODE3_SENEGAL:{
                return R.drawable.flat_senegal_64;
            }
            case ISOCODE3_SERBIA:{
                return R.drawable.flat_serbia_64;
            }
            case ISOCODE3_SEYCHELLES:{
                return R.drawable.flat_seychelles_64;
            }
            case ISOCODE3_SIERRA_LEONE:{
                return R.drawable.flat_sierra_leone_64;
            }
            case ISOCODE3_SINGAPORE:{
                return R.drawable.flat_singapore_64;
            }
            case ISOCODE3_SINT_MAARTEN:{
                return R.drawable.sint_maarten_64;
            }
            case ISOCODE3_SLOVAKIA:{
                return R.drawable.flat_slovakia_64;
            }
            case ISOCODE3_SLOVENIA:{
                return R.drawable.flat_slovenia_64;
            }
            case ISOCODE3_SOLOMON_ISLANDS:{
                return R.drawable.flat_solomon_islands_64;
            }
            case ISOCODE3_SOMALIA:{
                return R.drawable.flat_somalia_64;
            }
            case ISOCODE3_SOUTH_AFRICA:{
                return R.drawable.flat_south_africa_64;
            }
            case ISOCODE3_SOUTH_KOREA:{
                return R.drawable.flat_south_korea_64;
            }
            case ISOCODE3_SOUTH_SUDAN:{
                return R.drawable.flat_south_sudan_64;
            }
            case ISOCODE3_SPAIN:{
                return R.drawable.flat_spain_64;
            }
            case ISOCODE3_SRI_LANKA:{
                return R.drawable.flat_sri_lanka_64;
            }
            case ISOCODE3_SUDAN:{
                return R.drawable.flat_sudan_64;
            }
            case ISOCODE3_SURINAME:{
                return R.drawable.flat_suriname_64;
            }
            case ISOCODE3_SVALBARD_AND_JAN_MAYEN:{
                return R.drawable.svalbard_and_jan_mayen_64;
            }
            case ISOCODE3_SWAZILAND:{
                return R.drawable.flat_swaziland_64;
            }
            case ISOCODE3_SWEDEN:{
                return R.drawable.flat_sweden_64;
            }
            case ISOCODE3_SWITZERLAND:{
                return R.drawable.flat_switzerland_64;
            }
            case ISOCODE3_SYRIA:{
                return R.drawable.flat_syria_64;
            }
            case ISOCODE3_TAIWAN:{
                return R.drawable.flat_taiwan_64;
            }
            case ISOCODE3_TAJIKISTAN:{
                return R.drawable.flat_tajikistan_64;
            }
            case ISOCODE3_TANZANIA:{
                return R.drawable.flat_tanzania_64;
            }
            case ISOCODE3_THAILAND:{
                return R.drawable.flat_thailand_64;
            }
            case ISOCODE3_TOGO:{
                return R.drawable.flat_togo_64;
            }
            case ISOCODE3_TOKELAU:{
                return R.drawable.tokelau_64;
            }
            case ISOCODE3_TONGA:{
                return R.drawable.flat_tonga_64;
            }
            case ISOCODE3_TRINIDAD_AND_TOBAGO:{
                return R.drawable.flat_trinidad_and_tobago_64;
            }
            case ISOCODE3_TUNISIA:{
                return R.drawable.flat_tunisia_64;
            }
            case ISOCODE3_TURKEY:{
                return R.drawable.flat_turkey_64;
            }
            case ISOCODE3_TURKMENISTAN:{
                return R.drawable.flat_turkmenistan_64;
            }
            case ISOCODE3_TURK_AND_CAICOS_ISLANDS:{
                return R.drawable.flat_turks_and_caicos_islands_64;
            }
            case ISOCODE3_TUVALU:{
                return R.drawable.flat_tuvalu_64;
            }
            case ISOCODE3_US_VIRGIN_ISLANDS:{
                return R.drawable.flat_us_virgin_islands_64;
            }
            case ISOCODE3_UGANDA:{
                return R.drawable.flat_uganda_64;
            }
            case ISOCODE3_UKRAINE:{
                return R.drawable.flat_ukraine_64;
            }
            case ISOCODE3_UNITED_ARAB_EMIRATES:{
                return R.drawable.flat_united_arab_emirates_64;
            }
            case ISOCODE3_UNITED_KINGDOM:{
                return R.drawable.flat_united_kingdom_64;
            }
            case ISOCODE3_UNITED_STATES:{
                return R.drawable.flat_united_states_64;
            }
            case ISOCODE3_URUGUAY:{
                return R.drawable.flat_uruguay_64;
            }
            case ISOCODE3_UZBEKISTAN:{
                return R.drawable.flat_uzbekistan_64;
            }
            case ISOCODE3_VANUATU:{
                return R.drawable.flat_vanuatu_64;
            }
            case ISOCODE3_VATICAN:{
                return R.drawable.flat_vatican_city_64;
            }
            case ISOCODE3_VENEZUELA:{
                return R.drawable.flat_venezuela_64;
            }
            case ISOCODE3_VIETNAM:{
                return R.drawable.flat_vietnam_64;
            }
            case ISOCODE3_WALLIS_AND_FUTUNA:{
                return R.drawable.wallis_and_futuna_64;
            }
            case ISOCODE3_WESTERN_SAHARA:{
                return R.drawable.flat_western_sahara_64;
            }
            case ISOCODE3_YEMEN:{
                return R.drawable.flat_yemen_64;
            }
            case ISOCODE3_ZAMBIA:{
                return R.drawable.flat_zambia_64;
            }
            case ISOCODE3_ZIMBABWE:{
                return R.drawable.flat_zimbabwe_64;
            }
            default:return -1;
        }
    }
}
