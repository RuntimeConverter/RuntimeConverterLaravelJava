package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.id_ID.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/id_ID/Address.php

*/

public class Address
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
                .classes
                .Address {

    public Address(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Address.class) {
            this.__construct(env, args);
        }
    }

    public Address(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object city(RuntimeEnv env, Object... args) {
        Object format = null;
        format =
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
                        .method("randomElement")
                        .addReferenceArgs(
                                new RuntimeArgsWithReferences()
                                        .add(
                                                0,
                                                env.getRequestStaticPropertiesReference(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Faker
                                                                .namespaces
                                                                .Provider
                                                                .namespaces
                                                                .id_ID
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "cityFormats")))
                        .call(
                                env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Faker
                                                        .namespaces
                                                        .Provider
                                                        .namespaces
                                                        .id_ID
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .cityFormats)
                        .value();
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "parse",
                        Address.class,
                        format));
    }

    public static final Object CONST_class = "Faker\\Provider\\id_ID\\Address";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.project
                    .convertedCode
                    .globalNamespace
                    .namespaces
                    .Faker
                    .namespaces
                    .Provider
                    .classes
                    .Address
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object state(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
                            .method("randomElement")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Faker
                                                            .namespaces
                                                            .Provider
                                                            .namespaces
                                                            .id_ID
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .state)
                            .value());
        }

        @ConvertedMethod
        public Object stateAbbr(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
                            .method("randomElement")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Faker
                                                            .namespaces
                                                            .Provider
                                                            .namespaces
                                                            .id_ID
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .stateAbbr)
                            .value());
        }

        @ConvertedMethod
        public Object streetPrefix(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
                            .method("randomElement")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Faker
                                                            .namespaces
                                                            .Provider
                                                            .namespaces
                                                            .id_ID
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .streetPrefix)
                            .value());
        }

        @ConvertedMethod
        public Object cityName(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
                            .method("randomElement")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Faker
                                                            .namespaces
                                                            .Provider
                                                            .namespaces
                                                            .id_ID
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .cityNames)
                            .value());
        }

        @ConvertedMethod
        public Object street(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
                            .method("randomElement")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Faker
                                                            .namespaces
                                                            .Provider
                                                            .namespaces
                                                            .id_ID
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .street)
                            .value());
        }

        @ConvertedMethod
        public Object buildingNumber(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
                            .method("numberBetween")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(1, 999)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object street =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Abang",
                                    "Abdul",
                                    "Abdul Muis",
                                    "Abdul Rahmat",
                                    "Abdul. Muis",
                                    "Abdullah",
                                    "Aceh",
                                    "Achmad",
                                    "Achmad Yani",
                                    "Acordion",
                                    "Adisucipto",
                                    "Adisumarmo",
                                    "Agus Salim",
                                    "Ahmad Dahlan",
                                    "Antapani Lama",
                                    "Arifin",
                                    "Asia Afrika",
                                    "Astana Anyar",
                                    "B.Agam 1",
                                    "B.Agam Dlm",
                                    "BKR",
                                    "Baabur Royan",
                                    "Baan",
                                    "Babadak",
                                    "Babadan",
                                    "Babah",
                                    "Babakan",
                                    "Bacang",
                                    "Badak",
                                    "Bagas Pati",
                                    "Bagis Utama",
                                    "Bagonwoto ",
                                    "Bah Jaya",
                                    "Baha",
                                    "Bahagia",
                                    "Bahagia ",
                                    "Baiduri",
                                    "Baik",
                                    "Baing",
                                    "Baja",
                                    "Baja Raya",
                                    "Bak Air",
                                    "Bak Mandi",
                                    "Bakaru",
                                    "Bakau",
                                    "Bakau Griya Utama",
                                    "Bakhita",
                                    "Bakin",
                                    "Bakit ",
                                    "Bakti",
                                    "Baladewa",
                                    "Bambon",
                                    "Bambu",
                                    "Banal",
                                    "Banceng Pondok",
                                    "Banda",
                                    "Bank Dagang Negara",
                                    "Bappenas",
                                    "Bara",
                                    "Bara Tambar",
                                    "Baranang",
                                    "Baranang Siang",
                                    "Baranang Siang Indah",
                                    "Baranangsiang",
                                    "Barasak",
                                    "Barat",
                                    "Basket",
                                    "Basmol Raya",
                                    "Basoka",
                                    "Basoka Raya",
                                    "Bass",
                                    "Basudewo",
                                    "Basuki",
                                    "Basuki Rahmat ",
                                    "Bata Putih",
                                    "Batako",
                                    "Baung",
                                    "Bawal",
                                    "Baya Kali Bungur",
                                    "Bayam",
                                    "Bayan",
                                    "Bazuka Raya",
                                    "Bhayangkara",
                                    "Camar",
                                    "Casablanca",
                                    "Cemara",
                                    "Cihampelas",
                                    "Cikapayang",
                                    "Cikutra Barat",
                                    "Cikutra Timur",
                                    "Ciumbuleuit",
                                    "Ciwastra",
                                    "Cokroaminoto",
                                    "Cut Nyak Dien",
                                    "Daan",
                                    "Dago",
                                    "Dahlia",
                                    "Dewi Sartika",
                                    "Dipatiukur",
                                    "Dipenogoro",
                                    "Diponegoro",
                                    "Dr. Junjunan",
                                    "Eka",
                                    "Ekonomi",
                                    "Elang",
                                    "Fajar",
                                    "Flora",
                                    "Flores",
                                    "Gading",
                                    "Gajah",
                                    "Gajah Mada",
                                    "Gambang",
                                    "Gardujati",
                                    "Gatot Subroto",
                                    "Gedebage Selatan",
                                    "Gegerkalong Hilir",
                                    "Gotong Royong",
                                    "Gremet",
                                    "HOS. Cjokroaminoto (Pasirkaliki)",
                                    "Haji",
                                    "Halim",
                                    "Hang",
                                    "Hasanuddin",
                                    "Honggowongso",
                                    "Ikan",
                                    "Imam",
                                    "Imam Bonjol",
                                    "Industri",
                                    "Ir. H. Juanda",
                                    "Jagakarsa",
                                    "Jakarta",
                                    "Jaksa",
                                    "Jambu",
                                    "Jamika",
                                    "Jayawijaya",
                                    "Jend. A. Yani",
                                    "Jend. Sudirman",
                                    "Juanda",
                                    "K.H. Maskur",
                                    "K.H. Wahid Hasyim (Kopo)",
                                    "Kali",
                                    "Kalimalang",
                                    "Kalimantan",
                                    "Karel S. Tubun",
                                    "Kartini",
                                    "Katamso",
                                    "Kebangkitan Nasional",
                                    "Kebonjati",
                                    "Ketandan",
                                    "Ki Hajar Dewantara",
                                    "Kiaracondong",
                                    "Krakatau",
                                    "Kusmanto",
                                    "Kyai Gede",
                                    "Kyai Mojo",
                                    "Labu",
                                    "Lada",
                                    "Laksamana",
                                    "Laswi",
                                    "Lembong",
                                    "Lumban Tobing",
                                    "M.T. Haryono",
                                    "Madiun",
                                    "Madrasah",
                                    "Mahakam",
                                    "Merdeka",
                                    "Moch. Ramdan",
                                    "Moch. Toha",
                                    "Moch. Yamin",
                                    "Monginsidi",
                                    "Mulyadi",
                                    "Muwardi",
                                    "Nakula",
                                    "Nanas",
                                    "Nangka",
                                    "Orang",
                                    "Otista",
                                    "Otto",
                                    "PHH. Mustofa",
                                    "Pacuan Kuda",
                                    "Padang",
                                    "Padma",
                                    "Pahlawan",
                                    "Panjaitan",
                                    "Pasir Koja",
                                    "Pasirkoja",
                                    "Pasteur",
                                    "Pattimura",
                                    "Pelajar Pejuang 45",
                                    "Perintis Kemerdekaan",
                                    "Peta",
                                    "Qrisdoren",
                                    "R.E. Martadinata",
                                    "R.M. Said",
                                    "Raden",
                                    "Raden Saleh",
                                    "Radio",
                                    "Rajawali",
                                    "Rajawali Barat",
                                    "Rajawali Timur",
                                    "Rajiman",
                                    "Raya Setiabudhi",
                                    "Raya Ujungberung",
                                    "Reksoninten",
                                    "Ronggowarsito",
                                    "Rumah Sakit",
                                    "S. Parman",
                                    "Sadang Serang",
                                    "Salak",
                                    "Salam",
                                    "Salatiga",
                                    "Sam Ratulangi",
                                    "Samanhudi",
                                    "Sampangan",
                                    "Sentot Alibasa",
                                    "Setia Budi",
                                    "Setiabudhi",
                                    "Siliwangi",
                                    "Soekarno Hatta",
                                    "Sudiarto",
                                    "Sudirman",
                                    "Sugiono",
                                    "Sugiyopranoto",
                                    "Suharso",
                                    "Sukabumi",
                                    "Sukajadi",
                                    "Sumpah Pemuda",
                                    "Sunaryo",
                                    "Suniaraja",
                                    "Supomo",
                                    "Supono",
                                    "Suprapto",
                                    "Surapati",
                                    "Suryo",
                                    "Suryo Pranoto",
                                    "Sutami",
                                    "Sutan Syahrir",
                                    "Sutarjo",
                                    "Sutarto",
                                    "Sutoyo",
                                    "Taman",
                                    "Tambak",
                                    "Tambun",
                                    "Tangkuban Perahu",
                                    "Tentara Pelajar",
                                    "Ters. Buah Batu",
                                    "Ters. Jakarta",
                                    "Ters. Kiaracondong",
                                    "Ters. Pasir Koja",
                                    "Teuku Umar",
                                    "Thamrin",
                                    "Tubagus Ismail",
                                    "Ujung",
                                    "Uluwatu",
                                    "Umalas",
                                    "Untung Suropati",
                                    "Urip Sumoharjo",
                                    "Veteran",
                                    "Villa",
                                    "W.R. Supratman",
                                    "Wahid",
                                    "Wahid Hasyim",
                                    "Wahidin",
                                    "Wahidin Sudirohusodo",
                                    "Warga",
                                    "Wora Wari",
                                    "Yap Tjwan Bing",
                                    "Yoga",
                                    "Yogyakarta",
                                    "Yohanes",
                                    "Yos",
                                    "Yos Sudarso",
                                    "Yosodipuro",
                                    "Zamrud");
                        });

        public Object streetPrefix =
                ZVal.arrayFromList("Ds.", "Dk.", "Gg.", "Jln.", "Jr.", "Kpg.", "Ki.", "Psr.");

        public Object state =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Aceh",
                                    "Sumatera Utara",
                                    "Sumatera Barat",
                                    "Jambi",
                                    "Bangka Belitung",
                                    "Riau",
                                    "Kepulauan Riau",
                                    "Bengkulu",
                                    "Sumatera Selatan",
                                    "Lampung",
                                    "Banten",
                                    "DKI Jakarta",
                                    "Jawa Barat",
                                    "Jawa Tengah",
                                    "Jawa Timur",
                                    "Nusa Tenggara Timur",
                                    "DI Yogyakarta",
                                    "Bali",
                                    "Nusa Tenggara Barat",
                                    "Kalimantan Barat",
                                    "Kalimantan Tengah",
                                    "Kalimantan Selatan",
                                    "Kalimantan Timur",
                                    "Kalimantan Utara",
                                    "Sulawesi Selatan",
                                    "Sulawesi Utara",
                                    "Gorontalo",
                                    "Sulawesi Tengah",
                                    "Sulawesi Barat",
                                    "Sulawesi Tenggara",
                                    "Maluku",
                                    "Maluku Utara",
                                    "Papua Barat",
                                    "Papua");
                        });

        public Object stateAbbr =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Aceh",
                                    "SumUt",
                                    "SumBar",
                                    "Jambi",
                                    "BaBel",
                                    "Riau",
                                    "KepR",
                                    "Bengkulu",
                                    "SumSel",
                                    "Lampung",
                                    "Banten",
                                    "DKI",
                                    "JaBar",
                                    "JaTeng",
                                    "JaTim",
                                    "NTT",
                                    "DIY",
                                    "Bali",
                                    "NTB",
                                    "KalBar",
                                    "KalTeng",
                                    "KalSel",
                                    "KalTim",
                                    "KalUt",
                                    "SulSel",
                                    "SulUt",
                                    "Gorontalo",
                                    "SulTeng",
                                    "SulBar",
                                    "SulTra",
                                    "Maluku",
                                    "MalUt",
                                    "PapBar",
                                    "Papua");
                        });

        public Object country =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Afganistan",
                                    "Afrika Selatan",
                                    "Albania",
                                    "Aljazair",
                                    "Amerika Serikat",
                                    "Andorra",
                                    "Angola",
                                    "Anguilla",
                                    "Antarktika",
                                    "Antigua and Barbuda",
                                    "Antillen Belanda",
                                    "Arab Saudi",
                                    "Argentina",
                                    "Armenia",
                                    "Aruba",
                                    "Australia",
                                    "Austria",
                                    "Azerbaijan",
                                    "Bahama",
                                    "Bahrain",
                                    "Bangladesh",
                                    "Barbados",
                                    "Belanda",
                                    "Belarus",
                                    "Belgia",
                                    "Belize",
                                    "Benin",
                                    "Bermuda",
                                    "Bhutan",
                                    "Bolivia",
                                    "Bosnia dan Herzegovina",
                                    "Botswana",
                                    "Brasil",
                                    "Brunei Darussalam",
                                    "Bulgaria",
                                    "Burkina Faso",
                                    "Burundi",
                                    "Chili",
                                    "Cina",
                                    "Cocos (Keeling)",
                                    "Denmark",
                                    "Djibouti",
                                    "Dominika",
                                    "Ekuador",
                                    "El Salvador",
                                    "Eritrea",
                                    "Estonia",
                                    "Ethiopia",
                                    "Federasi Rusia",
                                    "Fiji",
                                    "Filipina",
                                    "Finlandia",
                                    "Gabon",
                                    "Gambia",
                                    "Georgia",
                                    "Georgia Selatan dan Kepulauan Sandwich Selatan",
                                    "Ghana",
                                    "Gibraltar",
                                    "Greenland",
                                    "Grenada",
                                    "Guadeloupe",
                                    "Guam",
                                    "Guatemala",
                                    "Guernsey",
                                    "Guinea",
                                    "Guinea Ekuatorial",
                                    "Guinea-Bissau",
                                    "Guyana",
                                    "Guyana Prancis",
                                    "Haiti",
                                    "Honduras",
                                    "Hong Kong",
                                    "Hongaria",
                                    "India",
                                    "Indonesia",
                                    "Inggris Raya",
                                    "Irak",
                                    "Iran",
                                    "Irlandia",
                                    "Islandia",
                                    "Israel",
                                    "Italia",
                                    "Jamaika",
                                    "Jepang",
                                    "Jerman",
                                    "Jersey",
                                    "Jordan",
                                    "Kaledonia baru",
                                    "Kamboja",
                                    "Kamerun",
                                    "Kanada",
                                    "Kazakhstan",
                                    "Kenya",
                                    "Kepulauan Cayman",
                                    "Kepulauan Cook",
                                    "Kepulauan Falkland (Malvinas)",
                                    "Kepulauan Faroe",
                                    "Kepulauan Mariana Utara",
                                    "Kepulauan Marshall",
                                    "Kepulauan Pitcairn",
                                    "Kepulauan Solomon",
                                    "Kepulauan Terluar Kecil Amerika Serikat",
                                    "Kepulauan Turks dan Caicos",
                                    "Kepulauan Virgin Amerika Serikat",
                                    "Kepulauan Virgin Inggris",
                                    "Kiribati",
                                    "Kolombia",
                                    "Komoro",
                                    "Kongo",
                                    "Korea",
                                    "Korea",
                                    "Kosta Rika",
                                    "Kroasia",
                                    "Kuba",
                                    "Kuwait",
                                    "Latvia",
                                    "Lebanon",
                                    "Lesotho",
                                    "Liberia",
                                    "Libyan Arab Jamahiriya",
                                    "Liechtenstein",
                                    "Lithuania",
                                    "Luxembourg",
                                    "Madagaskar",
                                    "Makau",
                                    "Makedonia",
                                    "Maladewa",
                                    "Malawi",
                                    "Malaysia",
                                    "Mali",
                                    "Malta",
                                    "Maroko",
                                    "Martinik",
                                    "Mauritania",
                                    "Mauritius",
                                    "Mayotte",
                                    "Meksiko",
                                    "Mesir",
                                    "Mikronesia",
                                    "Moldova",
                                    "Monako",
                                    "Mongolia",
                                    "Montenegro",
                                    "Montserrat",
                                    "Mozambik",
                                    "Myanmar",
                                    "Namibia",
                                    "Nauru",
                                    "Nepal",
                                    "Niger",
                                    "Nigeria",
                                    "Nikaragua",
                                    "Niue",
                                    "Norwegia",
                                    "Oman",
                                    "Pakistan",
                                    "Palau",
                                    "Panama",
                                    "Pantai Gading",
                                    "Papua Nugini",
                                    "Paraguay",
                                    "Peru",
                                    "Polandia",
                                    "Polinesia Prancis",
                                    "Portugal",
                                    "Prancis",
                                    "Puerto Rico",
                                    "Pulau Bouvet",
                                    "Pulau Heard dan Kepulauan McDonald",
                                    "Pulau Man",
                                    "Pulau Natal",
                                    "Pulau Norfolk",
                                    "Qatar",
                                    "Republik Afrika Tengah",
                                    "Republik Ceko",
                                    "Republik Chad",
                                    "Republik Demokratik Rakyat Laos",
                                    "Republik Dominika",
                                    "Republik Kirgizstan",
                                    "R\u00E9union",
                                    "Rumania",
                                    "Rwanda",
                                    "Sahara Barat",
                                    "Saint Barthelemy",
                                    "Saint Helena",
                                    "Saint Kitts dan Nevis",
                                    "Saint Lucia",
                                    "Saint Martin",
                                    "Saint Pierre dan Miquelon",
                                    "Saint Vincent dan Grenadines",
                                    "Samoa",
                                    "Samoa Amerika",
                                    "San Marino",
                                    "Sao Tome dan Principe",
                                    "Selandia baru",
                                    "Senegal",
                                    "Serbia",
                                    "Seychelles",
                                    "Sierra Leone",
                                    "Singapura",
                                    "Siprus",
                                    "Slovakia (Republik Slovak)",
                                    "Slovenia",
                                    "Somalia",
                                    "Spanyol",
                                    "Sri Lanka",
                                    "Sudan",
                                    "Suriah",
                                    "Suriname",
                                    "Svalbard & Jan Mayen Islands",
                                    "Swaziland",
                                    "Swedia",
                                    "Swiss",
                                    "Taiwan",
                                    "Tajikistan",
                                    "Tanjung Verde",
                                    "Tanzania",
                                    "Thailand",
                                    "Timor-Leste",
                                    "Togo",
                                    "Tokelau",
                                    "Tonga",
                                    "Trinidad dan Tobago",
                                    "Tunisia",
                                    "Turki",
                                    "Turkmenistan",
                                    "Tuvalu",
                                    "Uganda",
                                    "Ukraina",
                                    "Uni Emirat Arab",
                                    "Uruguay",
                                    "Uzbekistan",
                                    "Vanuatu",
                                    "Vatikan",
                                    "Venezuela",
                                    "Vietnam",
                                    "Wallis dan Futuna",
                                    "Wilayah Palestina",
                                    "Wilayah Samudra Hindia Britania",
                                    "Wilayah Selatan Perancis",
                                    "Yaman",
                                    "Yunani",
                                    "Zambia",
                                    "Zimbabwe");
                        });

        public Object cityNames =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Administrasi Jakarta Barat",
                                    "Administrasi Jakarta Pusat",
                                    "Administrasi Jakarta Selatan",
                                    "Administrasi Jakarta Timur",
                                    "Administrasi Jakarta Utara",
                                    "Ambon",
                                    "Balikpapan",
                                    "Banda Aceh",
                                    "Bandar Lampung",
                                    "Bandung",
                                    "Banjar",
                                    "Banjarbaru",
                                    "Banjarmasin",
                                    "Batam",
                                    "Batu",
                                    "Bau-Bau",
                                    "Bekasi",
                                    "Bengkulu",
                                    "Bima",
                                    "Binjai",
                                    "Bitung",
                                    "Blitar",
                                    "Bogor",
                                    "Bontang",
                                    "Bukittinggi",
                                    "Cilegon",
                                    "Cimahi",
                                    "Cirebon",
                                    "Denpasar",
                                    "Depok",
                                    "Dumai",
                                    "Gorontalo",
                                    "Gunungsitoli",
                                    "Jambi",
                                    "Jayapura",
                                    "Kediri",
                                    "Kendari",
                                    "Kotamobagu",
                                    "Kupang",
                                    "Langsa",
                                    "Lhokseumawe",
                                    "Lubuklinggau",
                                    "Madiun",
                                    "Magelang",
                                    "Makassar",
                                    "Malang",
                                    "Manado",
                                    "Mataram",
                                    "Medan",
                                    "Metro",
                                    "Mojokerto",
                                    "Padang",
                                    "Padangpanjang",
                                    "Padangsidempuan",
                                    "Pagar Alam",
                                    "Palangka Raya",
                                    "Palembang",
                                    "Palopo",
                                    "Palu",
                                    "Pangkal Pinang",
                                    "Parepare",
                                    "Pariaman",
                                    "Pasuruan",
                                    "Payakumbuh",
                                    "Pekalongan",
                                    "Pekanbaru",
                                    "Pematangsiantar",
                                    "Pontianak",
                                    "Prabumulih",
                                    "Probolinggo",
                                    "Sabang",
                                    "Salatiga",
                                    "Samarinda",
                                    "Sawahlunto",
                                    "Semarang",
                                    "Serang",
                                    "Sibolga",
                                    "Singkawang",
                                    "Solok",
                                    "Sorong",
                                    "Subulussalam",
                                    "Sukabumi",
                                    "Sungai Penuh",
                                    "Surabaya",
                                    "Surakarta",
                                    "Tangerang",
                                    "Tangerang Selatan",
                                    "Tanjung Pinang",
                                    "Tanjungbalai",
                                    "Tarakan",
                                    "Tasikmalaya",
                                    "Tebing Tinggi",
                                    "Tegal",
                                    "Ternate",
                                    "Tidore Kepulauan",
                                    "Tomohon",
                                    "Tual",
                                    "Yogyakarta");
                        });

        public Object cityFormats = ZVal.arrayFromList("{{cityName}}");

        public Object streetNameFormats = ZVal.arrayFromList("{{street}}");

        public Object streetAddressFormats =
                ZVal.arrayFromList("{{streetPrefix}} {{street}} No. {{buildingNumber}}");

        public Object addressFormats =
                ZVal.arrayFromList("{{streetAddress}}, {{city}} {{postcode}}, {{stateAbbr}}");

        public Object postcode = ZVal.arrayFromList("%####");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\id_ID\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "addressFormats",
                            "cityFormats",
                            "cityNames",
                            "country",
                            "postcode",
                            "state",
                            "stateAbbr",
                            "street",
                            "streetAddressFormats",
                            "streetNameFormats",
                            "streetPrefix")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/id_ID/Address.php")
                    .addExtendsClass("Faker\\Provider\\Address")
                    .addExtendsClass("Faker\\Provider\\Base")
                    .get();

    @Override
    public ReflectionClassData getRuntimeConverterReflectionData() {
        return runtimeConverterReflectionData;
    }

    @Override
    public Object converterRuntimeCallExtended(
            RuntimeEnv env,
            String method,
            Class<?> caller,
            PassByReferenceArgs passByReferenceArgs,
            Object... args) {
        return RuntimeClassBase.converterRuntimeCallExtendedWithDataStatic(
                this,
                runtimeConverterReflectionData,
                env,
                method,
                caller,
                passByReferenceArgs,
                args);
    }
}
