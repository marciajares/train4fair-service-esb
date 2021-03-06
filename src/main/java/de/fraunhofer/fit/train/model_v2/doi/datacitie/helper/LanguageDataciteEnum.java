package de.fraunhofer.fit.train.model_v2.doi.datacitie.helper;

/**
 * "Occurrence: 0-1 Definition: The primary language of the resource. Allowed
 * values, examples, other constraints: Allowed values are taken from IETF BCP
 * 47, ISO 639-1 language codes. Examples: en, de, fr…"
 * 
 * @author Joao Bosco Jares MSc. (Software Engineer)
 * @see www.jbjares.com
 * @see jbjares@gmail.com, joao.bosco.jares.alves.chaves@fit.fraunhofer.de
 *
 *
 */
//@XStreamAlias("Language")
//@Repository
//@Document(collection = "language")
public enum LanguageDataciteEnum {
	AA_AFAR("AA_AFAR"), AB_ABKHAZIAN("AB_ABKHAZIAN"), AF_AFRIKAANS("AF_AFRIKAANS"), AM_AMHARIC("AM_AMHARIC"),
	AR_ARABIC("AR_ARABIC"), AS_ASSAMESE("AS_ASSAMESE"), AY_AYMARA("AY_AYMARA"), AZ_AZERBAIJANI("AZ_AZERBAIJANI"),
	BA_BASHKIR("BA_BASHKIR"), BE_BYELORUSSIAN("BE_BYELORUSSIAN"), BG_BULGARIAN("BG_BULGARIAN"), BH_BIHARI("BH_BIHARI"),
	BI_BISLAMA("BI_BISLAMA"), BN_BENGALI("BN_BENGALI"), BO_TIBETAN("BO_TIBETAN"), BR_BRETON("BR_BRETON"),
	CA_CATALAN("CA_CATALAN"), CO_CORSICAN("CO_CORSICAN"), CS_CZECH("CS_CZECH"), CY_WELCH("CY_WELCH"),
	DA_DANISH("DA_DANISH"), DE_GERMAN("DE_GERMAN"), DZ_BHUTANI("DZ_BHUTANI"), EL_GREEK("EL_GREEK"),
	EN_ENGLISH("EN_ENGLISH"), EO_ESPERANTO("EO_ESPERANTO"), ES_SPANISH("ES_SPANISH"), ET_ESTONIAN("ET_ESTONIAN"),
	EU_BASQUE("EU_BASQUE"), FA_PERSIAN("FA_PERSIAN"), FI_FINNISH("FI_FINNISH"), FJ_FIJI("FJ_FIJI"),
	FO_FAEROESE("FO_FAEROESE"), FR_FRENCH("FR_FRENCH"), FY_FRISIAN("FY_FRISIAN"), GA_IRISH("GA_IRISH"),
	GD_SCOTSGAELIC("GD_SCOTSGAELIC"), GL_GALICIAN("GL_GALICIAN"), GN_GUARANI("GN_GUARANI"), GU_GUJARATI("GU_GUJARATI"),
	HA_HAUSA("HA_HAUSA"), HI_HINDI("HI_HINDI"), HE_HEBREW("HE_HEBREW"), HR_CROATIAN("HR_CROATIAN"),
	HU_HUNGARIAN("HU_HUNGARIAN"), HY_ARMENIAN("HY_ARMENIAN"), ISO_LANGUAGE("ISO_LANGUAGE"),
	IA_INTERLINGUA("IA_INTERLINGUA"), ID_INDONESIAN("ID_INDONESIAN"), IE_INTERLINGUE("IE_INTERLINGUE"),
	IK_INUPIAK("IK_INUPIAK"), IN_FORMERINDONESIAN("IN_FORMERINDONESIAN"), IS_ICELANDIC("IS_ICELANDIC"),
	IT_ITALIAN("IT_ITALIAN"), IU_INUKTITUT("IU_INUKTITUT"), IW_FORMERHEBREW("IW_FORMERHEBREW"),
	JA_JAPANESE("JA_JAPANESE"), JI_FORMERYIDDISH("JI_FORMERYIDDISH"), JW_JAVANESE("JW_JAVANESE"),
	KA_GEORGIAN("KA_GEORGIAN"), KK_KAZAKH("KK_KAZAKH"), KL_GREENLANDIC("KL_GREENLANDIC"), KM_CAMBODIAN("KM_CAMBODIAN"),
	KN_KANNADA("KN_KANNADA"), KO_KOREAN("KO_KOREAN"), KS_KASHMIRI("KS_KASHMIRI"), KU_KURDISH("KU_KURDISH"),
	KY_KIRGHIZ("KY_KIRGHIZ"), LA_LATIN("LA_LATIN"), LN_LINGALA("LN_LINGALA"), LO_LAOTHIAN("LO_LAOTHIAN"),
	LT_LITHUANIAN("LT_LITHUANIAN"), LV_LATVIAN("LV_LATVIAN"), MG_MALAGASY("MG_MALAGASY"), MI_MAORI("MI_MAORI"),
	MK_MACEDONIAN("MK_MACEDONIAN"), ML_MALAYALAM("ML_MALAYALAM"), MN_MONGOLIAN("MN_MONGOLIAN"),
	MO_MOLDAVIAN("MO_MOLDAVIAN"), MR_MARATHI("MR_MARATHI"), MS_MALAY("MS_MALAY"), MT_MALTESE("MT_MALTESE"),
	MY_BURMESE("MY_BURMESE"), NA_NAURU("NA_NAURU"), NE_NEPALI("NE_NEPALI"), NL_DUTCH("NL_DUTCH"),
	NO_NORWEGIAN("NO_NORWEGIAN"), OC_OCCITAN("OC_OCCITAN"), OR_ORIYA("OR_ORIYA"), PA_PUNJABI("PA_PUNJABI"),
	PL_POLISH("PL_POLISH"), PS_PASHTO("PS_PASHTO"), PT_PORTUGUESE("PT_PORTUGUESE"), QU_QUECHUA("QU_QUECHUA"),
	RM_RHAETOROMANCE("RM_RHAETOROMANCE"), RN_KIRUNDI("RN_KIRUNDI"), RO_ROMANIAN("RO_ROMANIAN"),
	RU_RUSSIAN("RU_RUSSIAN"), RW_KINYARWANDA("RW_KINYARWANDA"), SA_SANSKRIT("SA_SANSKRIT"), SD_SINDHI("SD_SINDHI"),
	SG_SANGRO("SG_SANGRO"), SH_SERBOCROATIAN("SH_SERBOCROATIAN"), SI_SINGHALESE("SI_SINGHALESE"),
	SK_SLOVAK("SK_SLOVAK"), SL_SLOVENIAN("SL_SLOVENIAN"), SM_SAMOAN("SM_SAMOAN"), SN_SHONA("SN_SHONA"),
	SO_SOMALI("SO_SOMALI"), SQ_ALBANIAN("SQ_ALBANIAN"), SR_SERBIAN("SR_SERBIAN"), SS_SISWATI("SS_SISWATI"),
	ST_SESOTHO("ST_SESOTHO"), SU_SUDANESE("SU_SUDANESE"), SV_SWEDISH("SV_SWEDISH"), SW_SWAHILI("SW_SWAHILI"),
	TA_TAMIL("TA_TAMIL"), TE_TEGULU("TE_TEGULU"), TG_TAJIK("TG_TAJIK"), TH_THAI("TH_THAI"), TI_TIGRINYA("TI_TIGRINYA"),
	TK_TURKMEN("TK_TURKMEN"), TL_TAGALOG("TL_TAGALOG"), TN_SETSWANA("TN_SETSWANA"), TO_TONGA("TO_TONGA"),
	TR_TURKISH("TR_TURKISH"), TS_TSONGA("TS_TSONGA"), TT_TATAR("TT_TATAR"), TW_TWI("TW_TWI"), UG_UIGUR("UG_UIGUR"),
	UK_UKRAINIAN("UK_UKRAINIAN"), UR_URDU("UR_URDU"), UZ_UZBEK("UZ_UZBEK"), VI_VIETNAMESE("VI_VIETNAMESE"),
	VO_VOLAPUK("VO_VOLAPUK"), WO_WOLOF("WO_WOLOF"), XH_XHOSA("XH_XHOSA"), YI_YIDDISH("YI_YIDDISH"),
	YO_YORUBA("YO_YORUBA"), ZA_ZHUANG("ZA_ZHUANG"), ZH_CHINESE("ZH_CHINESE"), ZU_ZULU("ZU_ZULU");

	private String text;

	LanguageDataciteEnum(String text) {
		this.text = text;
	}

	/**
	 * "Occurrence: 0-1 Definition: The primary language of the resource. Allowed
	 * values, examples, other constraints: Allowed values are taken from IETF BCP
	 * 47, ISO 639-1 language codes. Examples: en, de, fr…"
	 * 
	 * @author Joao Bosco Jares MSc. (Software Engineer)
	 * @see www.jbjares.com
	 * @see jbjares@gmail.com, joao.bosco.jares.alves.chaves@fit.fraunhofer.de
	 *
	 */
	public String getText() {
		return this.text;
	}

	public static LanguageDataciteEnum fromString(String text) {
		for (LanguageDataciteEnum b : LanguageDataciteEnum.values()) {
			if (b.text.equalsIgnoreCase(text)) {
				return b;
			}
		}
		return null;
	}

}
