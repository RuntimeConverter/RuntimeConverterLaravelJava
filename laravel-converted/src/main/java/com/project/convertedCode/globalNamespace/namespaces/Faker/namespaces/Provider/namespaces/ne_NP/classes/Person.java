package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.ne_NP.classes;

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

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/ne_NP/Person.php

*/

public class Person
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
                .classes
                .Person {

    public Person(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Person.class) {
            this.__construct(env, args);
        }
    }

    public Person(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Faker\\Provider\\ne_NP\\Person";

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
                    .Person
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object middleNameMale(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
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
                                                            .ne_NP
                                                            .classes
                                                            .Person
                                                            .RequestStaticProperties
                                                            .class)
                                            .middleNameMale)
                            .value());
        }

        @ConvertedMethod
        public Object middleNameFemale(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
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
                                                            .ne_NP
                                                            .classes
                                                            .Person
                                                            .RequestStaticProperties
                                                            .class)
                                            .middleNameFemale)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object maleNameFormats =
                ZVal.arrayFromList(
                        "{{firstNameMale}} {{lastName}}",
                        "{{firstNameMale}} {{lastName}}",
                        "{{firstNameMale}} {{lastName}}",
                        "{{firstNameMale}} {{lastName}}",
                        "{{firstNameMale}} {{lastName}}",
                        "{{titleMale}} {{firstNameMale}} {{lastName}}",
                        "{{firstNameMale}} {{middleNameMale}} {{lastName}}",
                        "{{firstNameMale}} {{lastName}}",
                        "{{titleMale}} {{firstNameMale}} {{middleNameMale}} {{lastName}}",
                        "{{firstNameMale}} {{lastName}}",
                        "{{firstNameMale}} {{lastName}}");

        public Object femaleNameFormats =
                ZVal.arrayFromList(
                        "{{firstNameFemale}} {{lastName}}",
                        "{{firstNameFemale}} {{lastName}}",
                        "{{firstNameFemale}} {{lastName}}",
                        "{{firstNameFemale}} {{lastName}}",
                        "{{firstNameFemale}} {{lastName}}",
                        "{{titleFemale}} {{firstNameFemale}} {{lastName}}",
                        "{{firstNameFemale}} {{middleNameFemale}} {{lastName}}",
                        "{{firstNameFemale}} {{lastName}}",
                        "{{titleFemale}} {{firstNameFemale}} {{middleNameFemale}} {{lastName}}",
                        "{{firstNameFemale}} {{lastName}}",
                        "{{firstNameFemale}} {{lastName}}");

        public Object firstNameMale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Aadarsh",
                                    "Aadesh",
                                    "Aaditya",
                                    "Aakash",
                                    "Aanand",
                                    "Abud",
                                    "Achyut",
                                    "Ajay",
                                    "Ajit",
                                    "Akhil",
                                    "Akshar",
                                    "Akshay",
                                    "Amar",
                                    "Amir",
                                    "Amit",
                                    "Amod",
                                    "Amrit",
                                    "Amulya",
                                    "Ananta",
                                    "Angel",
                                    "Angikar",
                                    "Anil",
                                    "Ankit",
                                    "Ankur",
                                    "Anmol",
                                    "Anshu",
                                    "Anuj",
                                    "Arjun",
                                    "Arun",
                                    "Ashish",
                                    "Ashok",
                                    "Ashutosh",
                                    "Atal",
                                    "Avinash",
                                    "Ayush",
                                    "Babish",
                                    "Badal",
                                    "Badri",
                                    "Baibhav",
                                    "Bhagwam",
                                    "Bhakti",
                                    "Bhanu",
                                    "Bibek",
                                    "Bicky",
                                    "Bidur",
                                    "Bidwan",
                                    "Bikal",
                                    "Bikash",
                                    "Bikesh",
                                    "Bikram",
                                    "Bimal",
                                    "Binamra",
                                    "Binay",
                                    "Bipin",
                                    "Biplav",
                                    "Bipul",
                                    "Biraj",
                                    "Birendra",
                                    "Bishal",
                                    "Bisu",
                                    "Biswas",
                                    "Brijesh",
                                    "Buddha",
                                    "Chaitanya",
                                    "Chandan",
                                    "Chandra",
                                    "Chirag",
                                    "Darpan",
                                    "Deep",
                                    "Deepak",
                                    "Dev",
                                    "Dhairya",
                                    "Dharma",
                                    "Dharmendra",
                                    "Dhiren",
                                    "Diwakar",
                                    "Diwash",
                                    "Eklavya",
                                    "Gajendra",
                                    "Gaurav",
                                    "Girish",
                                    "Gokul",
                                    "Gopal",
                                    "Govinda",
                                    "Grija",
                                    "Gyanraj",
                                    "Hans",
                                    "Hardik",
                                    "Hari",
                                    "Harsa",
                                    "Hemant",
                                    "Himal",
                                    "Hitesh",
                                    "Hridaya",
                                    "Ishwar",
                                    "Jitendra",
                                    "Jivan",
                                    "Kabindra",
                                    "Kailash",
                                    "Kalyan",
                                    "Kamal",
                                    "Kamod",
                                    "Kapil",
                                    "Karan",
                                    "Karna",
                                    "Khagendra",
                                    "Kishor",
                                    "Kris",
                                    "Krishna",
                                    "Krisus",
                                    "Kuber",
                                    "Lakshman",
                                    "Lalit",
                                    "Lava",
                                    "Lochan",
                                    "Lokesh",
                                    "Madhav",
                                    "Madhukar",
                                    "Madhur",
                                    "Mandeep",
                                    "Manish",
                                    "Manjul",
                                    "Manoj",
                                    "Milan",
                                    "Mohit",
                                    "Mridul",
                                    "Nabin",
                                    "Nakul",
                                    "Narayan",
                                    "Narendra",
                                    "Naresh",
                                    "Neil",
                                    "Nerain",
                                    "Nirajan",
                                    "Nirajan",
                                    "Nirmal",
                                    "Nirupam",
                                    "Nischal",
                                    "Nishad",
                                    "Nishant",
                                    "Nutan",
                                    "Om",
                                    "Paras",
                                    "Parikshit",
                                    "Parimal",
                                    "Pawan",
                                    "Piyush",
                                    "Prabal",
                                    "Prabesh",
                                    "Prabhat",
                                    "Prabin",
                                    "Prajwal",
                                    "Prakash",
                                    "Pramesh",
                                    "Pramod",
                                    "Pranaya",
                                    "Pranil",
                                    "Prasanna",
                                    "Prashant",
                                    "Prasun",
                                    "Pratap",
                                    "Pratik",
                                    "Prayag",
                                    "Prianshu",
                                    "Prithivi",
                                    "Purna",
                                    "Pushkar",
                                    "Raghab",
                                    "Rahul",
                                    "Rajan",
                                    "Rajesh",
                                    "Rakesh",
                                    "Ramesh",
                                    "Ranjan",
                                    "Ranjit",
                                    "Ricky",
                                    "Rijan",
                                    "Rishab",
                                    "Rishikesh",
                                    "Rohan",
                                    "Rohit",
                                    "Roshan",
                                    "Sabin",
                                    "Sachit",
                                    "Safal",
                                    "Sahaj",
                                    "Sahan",
                                    "Sajal",
                                    "Sakar",
                                    "Samir",
                                    "Sanchit",
                                    "Sandesh",
                                    "Sanjay",
                                    "Sanjeev",
                                    "Sankalpa",
                                    "Santosh",
                                    "Sarad",
                                    "Saroj",
                                    "Sashi",
                                    "Saumya",
                                    "Sevak",
                                    "Shailesh",
                                    "Shakti",
                                    "Shamundra",
                                    "Shantanu",
                                    "Shashank",
                                    "Shashwat",
                                    "Shekar",
                                    "Shyam",
                                    "Siddhartha",
                                    "Sitaram",
                                    "Sohan",
                                    "Sohil",
                                    "Soviet",
                                    "Spandan",
                                    "Subal",
                                    "Subham",
                                    "Subodh",
                                    "Sudan",
                                    "Sudhir",
                                    "Sudin",
                                    "Sudip",
                                    "Sujan",
                                    "Sujit",
                                    "Sukanta",
                                    "Sumel",
                                    "Sunil",
                                    "Suraj",
                                    "Suraj",
                                    "Surendra",
                                    "Surya",
                                    "Sushant",
                                    "Sushil",
                                    "Suyash",
                                    "Suyog",
                                    "Swagat",
                                    "Swapnil",
                                    "Swarup",
                                    "Tej",
                                    "Tilak",
                                    "Tirtha",
                                    "Trailokya",
                                    "Trilochan",
                                    "Udit",
                                    "Ujjwal",
                                    "Umesh",
                                    "Uttam",
                                    "Yogendra",
                                    "Yogesh",
                                    "Yuvaraj");
                        });

        public Object firstNameFemale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Aakansha",
                                    "Aanchal",
                                    "Aarati",
                                    "Aashika",
                                    "Aayusha",
                                    "Alisha",
                                    "Ambika",
                                    "Amrita",
                                    "Anamika",
                                    "Anita",
                                    "Anjali",
                                    "Anjana",
                                    "Anjela",
                                    "Anju",
                                    "Ankita",
                                    "Ansu",
                                    "Anu",
                                    "Anupa",
                                    "Anushree",
                                    "Anuska",
                                    "Apeksha",
                                    "Archana",
                                    "Arpita",
                                    "Aruna",
                                    "Asha",
                                    "Bandita",
                                    "Barsa",
                                    "Bhawana",
                                    "Bimala",
                                    "Bina",
                                    "Bindu",
                                    "Binita",
                                    "Bipana",
                                    "Chadani",
                                    "Chameli",
                                    "Champa",
                                    "Chandana",
                                    "Damini",
                                    "Deepa",
                                    "Deepti",
                                    "Depika",
                                    "Dibya",
                                    "Diksha",
                                    "Dilmaya",
                                    "Dipshika",
                                    "Durga",
                                    "Ganga",
                                    "Garima",
                                    "Gauri",
                                    "Gita",
                                    "Goma",
                                    "Grishma",
                                    "Harsika",
                                    "Hema",
                                    "Himani",
                                    "Isha",
                                    "Ishika",
                                    "Ishwari",
                                    "Jamuna",
                                    "Janaki",
                                    "Januka",
                                    "Jiya",
                                    "Junu",
                                    "Kabita",
                                    "Karuna",
                                    "Kaushika",
                                    "Khusbhu",
                                    "Komal",
                                    "Kopila",
                                    "Kripa",
                                    "Kriti",
                                    "Kritika",
                                    "Kshitz",
                                    "Kumud",
                                    "Kusum",
                                    "Lalita",
                                    "Lata",
                                    "Laxmi",
                                    "Lina",
                                    "Luna",
                                    "Madhavi",
                                    "Madhuri",
                                    "Mamata",
                                    "Manila",
                                    "Manita",
                                    "Manjita",
                                    "Manju",
                                    "Maya",
                                    "Mayabati",
                                    "Mayushi",
                                    "Menka",
                                    "Menuka",
                                    "Mina",
                                    "Mira",
                                    "Motiva",
                                    "Mukti",
                                    "Muna",
                                    "Nabina",
                                    "Namrata",
                                    "Nandani",
                                    "Nilam",
                                    "Nira",
                                    "Nirmali",
                                    "Nisha",
                                    "Nishita",
                                    "Pallavi",
                                    "Parijat",
                                    "Pavitra",
                                    "Pinky",
                                    "Prabha",
                                    "Prabina",
                                    "Prabriti",
                                    "Prakriti",
                                    "Pramila",
                                    "Prapti",
                                    "Pratiksha",
                                    "Pratima",
                                    "Preeti",
                                    "Prekshya",
                                    "Prenana",
                                    "Priya",
                                    "Priyanka",
                                    "Puja",
                                    "Punam",
                                    "Purnima",
                                    "Puspa",
                                    "Rabina",
                                    "Radha",
                                    "Radhika",
                                    "Raksha",
                                    "Rama",
                                    "Ramita",
                                    "Rampyari",
                                    "Rani",
                                    "Ranjana",
                                    "Ranju",
                                    "Rashmi",
                                    "Rejina",
                                    "Rekha",
                                    "Renu",
                                    "Renuka",
                                    "Reshami",
                                    "Riddhi",
                                    "Rina",
                                    "Ritu",
                                    "Roshni",
                                    "Rupa",
                                    "Sabina",
                                    "Sabita",
                                    "Sacheta",
                                    "Sachita",
                                    "Sadhana",
                                    "Safala",
                                    "Sagina",
                                    "Sahana",
                                    "Saileja",
                                    "Sajala",
                                    "Sakshi",
                                    "Sakuntala",
                                    "Samjhana",
                                    "Sampada",
                                    "Samridhi",
                                    "Sangita",
                                    "Sanjana",
                                    "Sanskriti",
                                    "Santoshi",
                                    "Sarala",
                                    "Saraswati",
                                    "Sarina",
                                    "Sarita",
                                    "Sarmila",
                                    "Sarupa",
                                    "Saubhagya",
                                    "Shanti",
                                    "Shasikala",
                                    "Shova",
                                    "Shraddha",
                                    "Shreya",
                                    "Shrija",
                                    "Shristi",
                                    "Shriya",
                                    "Shusila",
                                    "Simran",
                                    "Sita",
                                    "Smriti",
                                    "Sneha",
                                    "Soni",
                                    "Srijana",
                                    "Subheksha",
                                    "Sujata",
                                    "Sukriti",
                                    "Sulochana",
                                    "Sumi",
                                    "Sumnima",
                                    "Sunila",
                                    "Surakshya",
                                    "Susma",
                                    "Susmita",
                                    "Suyesha",
                                    "Swechchha",
                                    "Tara",
                                    "Tulsi",
                                    "Uma",
                                    "Urbasi",
                                    "Urmila",
                                    "Usha",
                                    "Vandana",
                                    "Yami",
                                    "Yasodha",
                                    "Yushma");
                        });

        public Object lastName =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Acharya",
                                    "Adhikari",
                                    "Agarwal",
                                    "Amatya",
                                    "Aryal",
                                    "Baidya",
                                    "Bajracharya",
                                    "Balami",
                                    "Banepali",
                                    "Baniya",
                                    "Banjade",
                                    "Baral",
                                    "Basnet",
                                    "Bastakoti",
                                    "Bastola",
                                    "Basyal",
                                    "Belbase",
                                    "Bhandari",
                                    "Bhatta",
                                    "Bhattarai",
                                    "Bhusal",
                                    "Bijukchhe",
                                    "Bisht",
                                    "Bohara",
                                    "Budathoki",
                                    "Byanjankar",
                                    "Chalise",
                                    "Chamling",
                                    "Chapagain",
                                    "Chaudhary",
                                    "Chhetri",
                                    "Chhetri",
                                    "Dahal",
                                    "Dangol",
                                    "Dawadi",
                                    "Devkota",
                                    "Dhakal",
                                    "Dhamla",
                                    "Dhaubhadel",
                                    "Dhungel",
                                    "Gauchan",
                                    "Gautam",
                                    "Ghale",
                                    "Ghimire",
                                    "Giri",
                                    "Golchha",
                                    "Gurung",
                                    "Gyalzen",
                                    "Gyawali",
                                    "Hamal",
                                    "Himanshu",
                                    "Humagain",
                                    "Jha",
                                    "Joshi",
                                    "Kafle",
                                    "Kandel",
                                    "Kansakar",
                                    "Karki",
                                    "Karmacharya",
                                    "Karna",
                                    "Katwal",
                                    "Kayastha",
                                    "KC",
                                    "Khadka",
                                    "Khadgee",
                                    "Khan",
                                    "Khanal",
                                    "Kharel",
                                    "Khatiwada",
                                    "Khatri",
                                    "Khawas",
                                    "Koirala",
                                    "Lama",
                                    "Lamichhane",
                                    "Lamsal",
                                    "Lawoti",
                                    "Ligal",
                                    "Limbu",
                                    "Lohani",
                                    "Magar",
                                    "Maharjan",
                                    "Mainali",
                                    "Malakar",
                                    "Maleku",
                                    "Manandhar",
                                    "Marhatta",
                                    "Mishra",
                                    "Nakarmi",
                                    "Napit",
                                    "Nemkul",
                                    "Nepal",
                                    "Neupane",
                                    "Niroula",
                                    "Ojha",
                                    "Pachhai",
                                    "Pahari",
                                    "Pandey",
                                    "Pangeni",
                                    "Panta",
                                    "Parajuli",
                                    "Pathak",
                                    "Paudel",
                                    "Pokhrel",
                                    "Pradhan",
                                    "Prajapati",
                                    "Puri",
                                    "Rai",
                                    "Raimajhi",
                                    "Rana",
                                    "Ranabhat",
                                    "Rasali",
                                    "Rauniyar",
                                    "Rawat",
                                    "Regmi",
                                    "Rijal",
                                    "Rimal",
                                    "Rinpoche",
                                    "Sarraf",
                                    "Shah",
                                    "Shahi",
                                    "Shakya",
                                    "Sharma",
                                    "Sherpa",
                                    "Shrestha",
                                    "Silwal",
                                    "Simkhada",
                                    "Singh",
                                    "Sitoula",
                                    "Subedi",
                                    "Tamang",
                                    "Tamrakar",
                                    "Thakur",
                                    "Thapa",
                                    "Thapa Magar",
                                    "Thuladhar",
                                    "Thule",
                                    "Tuladhar",
                                    "Upadhyaya",
                                    "Veswakar",
                                    "Wagle",
                                    "Yadav");
                        });

        public Object middleNameMale =
                ZVal.arrayFromList(
                        "Bahadur", "Dev", "Kumar", "Man", "Mani", "Nath", "Prasad", "Raj", "Ratna");

        public Object middleNameFemale = ZVal.arrayFromList("Devi", "Kumari");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\ne_NP\\Person")
                    .setLookup(
                            Person.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "femaleNameFormats",
                            "firstNameFemale",
                            "firstNameMale",
                            "lastName",
                            "maleNameFormats",
                            "middleNameFemale",
                            "middleNameMale")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/ne_NP/Person.php")
                    .addExtendsClass("Faker\\Provider\\Person")
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
