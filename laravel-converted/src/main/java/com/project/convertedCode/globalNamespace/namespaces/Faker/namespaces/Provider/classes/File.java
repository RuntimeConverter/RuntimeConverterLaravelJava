package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_file;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_dir;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes.Base;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes.Uuid;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/File.php

*/

public class File extends Base {

    public File(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == File.class) {
            this.__construct(env, args);
        }
    }

    public File(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Faker\\Provider\\File";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Base.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object mimeType(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, File.class)
                            .method("randomElement")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    function_array_keys
                                            .f
                                            .env(env)
                                            .call(
                                                    env.getRequestStaticProperties(
                                                                    com.project
                                                                            .convertedCode
                                                                            .globalNamespace
                                                                            .namespaces
                                                                            .Faker
                                                                            .namespaces
                                                                            .Provider
                                                                            .classes
                                                                            .File
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .mimeTypes)
                                            .value())
                            .value());
        }

        @ConvertedMethod
        public Object fileExtension(RuntimeEnv env, Object... args) {
            Object random_extension = null;
            random_extension =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, File.class)
                            .method("randomElement")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    function_array_values
                                            .f
                                            .env(env)
                                            .call(
                                                    env.getRequestStaticProperties(
                                                                    com.project
                                                                            .convertedCode
                                                                            .globalNamespace
                                                                            .namespaces
                                                                            .Faker
                                                                            .namespaces
                                                                            .Provider
                                                                            .classes
                                                                            .File
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .mimeTypes)
                                            .value())
                            .value();
            return ZVal.assign(
                    function_is_array.f.env(env).call(random_extension).getBool()
                            ? StaticMethodUtils.accessUnknownLateStaticMethod(env, this, File.class)
                                    .method("randomElement")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(random_extension)
                                    .value()
                            : random_extension);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "sourceDirectory")
        @ConvertedParameter(index = 1, name = "targetDirectory")
        @ConvertedParameter(
            index = 2,
            name = "fullPath",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        public Object file(RuntimeEnv env, Object... args) {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/fzaninotto/faker/src/Faker/Provider")
                            .setFile("/vendor/fzaninotto/faker/src/Faker/Provider/File.php");
            Object sourceDirectory = assignParameter(args, 0, true);
            if (null == sourceDirectory) {
                sourceDirectory = "/tmp";
            }
            Object targetDirectory = assignParameter(args, 1, true);
            if (null == targetDirectory) {
                targetDirectory = "/tmp";
            }
            Object fullPath = assignParameter(args, 2, true);
            if (null == fullPath) {
                fullPath = true;
            }
            Object destinationFile = null;
            Object sourceFullPath = null;
            Object files = null;
            Object destinationFullPath = null;
            if (!function_is_dir.f.env(env).call(sourceDirectory).getBool()) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Source directory %s does not exist or is not a directory.",
                                                sourceDirectory)
                                        .value()));
            }

            if (!function_is_dir.f.env(env).call(targetDirectory).getBool()) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Target directory %s does not exist or is not a directory.",
                                                targetDirectory)
                                        .value()));
            }

            if (ZVal.equalityCheck(sourceDirectory, targetDirectory)) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env, "Source and target directories must differ."));
            }

            files =
                    function_array_filter
                            .f
                            .env(env)
                            .call(
                                    function_array_values
                                            .f
                                            .env(env)
                                            .call(
                                                    function_array_diff
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    NamespaceGlobal.scandir
                                                                            .env(env)
                                                                            .call(sourceDirectory)
                                                                            .value(),
                                                                    ZVal.arrayFromList(".", ".."))
                                                            .value())
                                            .value(),
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Faker\\Provider",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        @ConvertedParameter(index = 0, name = "file")
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            Object file = assignParameter(args, 0, false);
                                            Object sourceDirectory = null;
                                            sourceDirectory =
                                                    this.contextReferences.getCapturedValue(
                                                            "sourceDirectory");
                                            return ZVal.assign(
                                                    ZVal.toBool(
                                                                    function_is_file
                                                                            .f
                                                                            .env(env)
                                                                            .call(
                                                                                    toStringR(
                                                                                                    sourceDirectory,
                                                                                                    env)
                                                                                            + toStringR(
                                                                                                    "/",
                                                                                                    env)
                                                                                            + toStringR(
                                                                                                    file,
                                                                                                    env))
                                                                            .value())
                                                            && ZVal.toBool(
                                                                    NamespaceGlobal.is_readable
                                                                            .env(env)
                                                                            .call(
                                                                                    toStringR(
                                                                                                    sourceDirectory,
                                                                                                    env)
                                                                                            + toStringR(
                                                                                                    "/",
                                                                                                    env)
                                                                                            + toStringR(
                                                                                                    file,
                                                                                                    env))
                                                                            .value()));
                                        }
                                    }.use("sourceDirectory", sourceDirectory))
                            .value();
            if (ZVal.isEmpty(files)) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call("Source directory %s is empty.", sourceDirectory)
                                        .value()));
            }

            sourceFullPath =
                    toStringR(sourceDirectory, env)
                            + toStringR("/", env)
                            + toStringR(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, File.class)
                                            .method("randomElement")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(files)
                                            .value(),
                                    env);
            destinationFile =
                    toStringR(Uuid.runtimeStaticObject.uuid(env), env)
                            + "."
                            + toStringR(
                                    NamespaceGlobal.pathinfo
                                            .env(env)
                                            .call(sourceFullPath, 4)
                                            .value(),
                                    env);
            destinationFullPath =
                    toStringR(targetDirectory, env)
                            + toStringR("/", env)
                            + toStringR(destinationFile, env);
            if (ZVal.strictEqualityCheck(
                    false,
                    "===",
                    NamespaceGlobal.copy
                            .env(env)
                            .call(sourceFullPath, destinationFullPath)
                            .value())) {
                return ZVal.assign(false);
            }

            return ZVal.assign(ZVal.isTrue(fullPath) ? destinationFullPath : destinationFile);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object mimeTypes =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.newArray(
                                    new ZPair("application/atom+xml", "atom"),
                                    new ZPair("application/ecmascript", "ecma"),
                                    new ZPair("application/emma+xml", "emma"),
                                    new ZPair("application/epub+zip", "epub"),
                                    new ZPair("application/java-archive", "jar"),
                                    new ZPair("application/java-vm", "class"),
                                    new ZPair("application/javascript", "js"),
                                    new ZPair("application/json", "json"),
                                    new ZPair("application/jsonml+json", "jsonml"),
                                    new ZPair("application/lost+xml", "lostxml"),
                                    new ZPair("application/mathml+xml", "mathml"),
                                    new ZPair("application/mets+xml", "mets"),
                                    new ZPair("application/mods+xml", "mods"),
                                    new ZPair("application/mp4", "mp4s"),
                                    new ZPair(
                                            "application/msword", ZVal.arrayFromList("doc", "dot")),
                                    new ZPair(
                                            "application/octet-stream",
                                            ZVal.arrayFromList(
                                                    "bin", "dms", "lrf", "mar", "so", "dist",
                                                    "distz", "pkg", "bpk", "dump", "elc",
                                                    "deploy")),
                                    new ZPair("application/ogg", "ogx"),
                                    new ZPair("application/omdoc+xml", "omdoc"),
                                    new ZPair("application/pdf", "pdf"),
                                    new ZPair("application/pgp-encrypted", "pgp"),
                                    new ZPair(
                                            "application/pgp-signature",
                                            ZVal.arrayFromList("asc", "sig")),
                                    new ZPair("application/pkix-pkipath", "pkipath"),
                                    new ZPair("application/pkixcmp", "pki"),
                                    new ZPair("application/pls+xml", "pls"),
                                    new ZPair(
                                            "application/postscript",
                                            ZVal.arrayFromList("ai", "eps", "ps")),
                                    new ZPair("application/pskc+xml", "pskcxml"),
                                    new ZPair("application/rdf+xml", "rdf"),
                                    new ZPair("application/reginfo+xml", "rif"),
                                    new ZPair("application/rss+xml", "rss"),
                                    new ZPair("application/rtf", "rtf"),
                                    new ZPair("application/sbml+xml", "sbml"),
                                    new ZPair(
                                            "application/vnd.adobe.air-application-installer-package+zip",
                                            "air"),
                                    new ZPair("application/vnd.adobe.xdp+xml", "xdp"),
                                    new ZPair("application/vnd.adobe.xfdf", "xfdf"),
                                    new ZPair("application/vnd.ahead.space", "ahead"),
                                    new ZPair("application/vnd.dart", "dart"),
                                    new ZPair("application/vnd.data-vision.rdz", "rdz"),
                                    new ZPair(
                                            "application/vnd.dece.data",
                                            ZVal.arrayFromList("uvf", "uvvf", "uvd", "uvvd")),
                                    new ZPair(
                                            "application/vnd.dece.ttml+xml",
                                            ZVal.arrayFromList("uvt", "uvvt")),
                                    new ZPair(
                                            "application/vnd.dece.unspecified",
                                            ZVal.arrayFromList("uvx", "uvvx")),
                                    new ZPair(
                                            "application/vnd.dece.zip",
                                            ZVal.arrayFromList("uvz", "uvvz")),
                                    new ZPair(
                                            "application/vnd.denovo.fcselayout-link", "fe_launch"),
                                    new ZPair("application/vnd.dna", "dna"),
                                    new ZPair("application/vnd.dolby.mlp", "mlp"),
                                    new ZPair("application/vnd.dpgraph", "dpg"),
                                    new ZPair("application/vnd.dreamfactory", "dfac"),
                                    new ZPair("application/vnd.ds-keypoint", "kpxx"),
                                    new ZPair("application/vnd.dvb.ait", "ait"),
                                    new ZPair("application/vnd.dvb.service", "svc"),
                                    new ZPair("application/vnd.dynageo", "geo"),
                                    new ZPair("application/vnd.ecowin.chart", "mag"),
                                    new ZPair("application/vnd.enliven", "nml"),
                                    new ZPair("application/vnd.epson.esf", "esf"),
                                    new ZPair("application/vnd.epson.msf", "msf"),
                                    new ZPair("application/vnd.epson.quickanime", "qam"),
                                    new ZPair("application/vnd.epson.salt", "slt"),
                                    new ZPair("application/vnd.epson.ssf", "ssf"),
                                    new ZPair("application/vnd.ezpix-album", "ez2"),
                                    new ZPair("application/vnd.ezpix-package", "ez3"),
                                    new ZPair("application/vnd.fdf", "fdf"),
                                    new ZPair("application/vnd.fdsn.mseed", "mseed"),
                                    new ZPair(
                                            "application/vnd.fdsn.seed",
                                            ZVal.arrayFromList("seed", "dataless")),
                                    new ZPair("application/vnd.flographit", "gph"),
                                    new ZPair("application/vnd.fluxtime.clip", "ftc"),
                                    new ZPair("application/vnd.hal+xml", "hal"),
                                    new ZPair("application/vnd.hydrostatix.sof-data", "sfd-hdstx"),
                                    new ZPair("application/vnd.ibm.minipay", "mpy"),
                                    new ZPair("application/vnd.ibm.secure-container", "sc"),
                                    new ZPair(
                                            "application/vnd.iccprofile",
                                            ZVal.arrayFromList("icc", "icm")),
                                    new ZPair("application/vnd.igloader", "igl"),
                                    new ZPair("application/vnd.immervision-ivp", "ivp"),
                                    new ZPair("application/vnd.kde.karbon", "karbon"),
                                    new ZPair("application/vnd.kde.kchart", "chrt"),
                                    new ZPair("application/vnd.kde.kformula", "kfo"),
                                    new ZPair("application/vnd.kde.kivio", "flw"),
                                    new ZPair("application/vnd.kde.kontour", "kon"),
                                    new ZPair(
                                            "application/vnd.kde.kpresenter",
                                            ZVal.arrayFromList("kpr", "kpt")),
                                    new ZPair("application/vnd.kde.kspread", "ksp"),
                                    new ZPair(
                                            "application/vnd.kde.kword",
                                            ZVal.arrayFromList("kwd", "kwt")),
                                    new ZPair("application/vnd.kenameaapp", "htke"),
                                    new ZPair("application/vnd.kidspiration", "kia"),
                                    new ZPair(
                                            "application/vnd.kinar",
                                            ZVal.arrayFromList("kne", "knp")),
                                    new ZPair(
                                            "application/vnd.koan",
                                            ZVal.arrayFromList("skp", "skd", "skt", "skm")),
                                    new ZPair("application/vnd.kodak-descriptor", "sse"),
                                    new ZPair("application/vnd.las.las+xml", "lasxml"),
                                    new ZPair(
                                            "application/vnd.llamagraphics.life-balance.desktop",
                                            "lbd"),
                                    new ZPair(
                                            "application/vnd.llamagraphics.life-balance.exchange+xml",
                                            "lbe"),
                                    new ZPair("application/vnd.lotus-1-2-3", "123"),
                                    new ZPair("application/vnd.lotus-approach", "apr"),
                                    new ZPair("application/vnd.lotus-freelance", "pre"),
                                    new ZPair("application/vnd.lotus-notes", "nsf"),
                                    new ZPair("application/vnd.lotus-organizer", "org"),
                                    new ZPair("application/vnd.lotus-screencam", "scm"),
                                    new ZPair("application/vnd.mozilla.xul+xml", "xul"),
                                    new ZPair("application/vnd.ms-artgalry", "cil"),
                                    new ZPair("application/vnd.ms-cab-compressed", "cab"),
                                    new ZPair(
                                            "application/vnd.ms-excel",
                                            ZVal.arrayFromList(
                                                    "xls", "xlm", "xla", "xlc", "xlt", "xlw")),
                                    new ZPair(
                                            "application/vnd.ms-excel.addin.macroenabled.12",
                                            "xlam"),
                                    new ZPair(
                                            "application/vnd.ms-excel.sheet.binary.macroenabled.12",
                                            "xlsb"),
                                    new ZPair(
                                            "application/vnd.ms-excel.sheet.macroenabled.12",
                                            "xlsm"),
                                    new ZPair(
                                            "application/vnd.ms-excel.template.macroenabled.12",
                                            "xltm"),
                                    new ZPair("application/vnd.ms-fontobject", "eot"),
                                    new ZPair("application/vnd.ms-htmlhelp", "chm"),
                                    new ZPair("application/vnd.ms-ims", "ims"),
                                    new ZPair("application/vnd.ms-lrm", "lrm"),
                                    new ZPair("application/vnd.ms-officetheme", "thmx"),
                                    new ZPair("application/vnd.ms-pki.seccat", "cat"),
                                    new ZPair("application/vnd.ms-pki.stl", "stl"),
                                    new ZPair(
                                            "application/vnd.ms-powerpoint",
                                            ZVal.arrayFromList("ppt", "pps", "pot")),
                                    new ZPair(
                                            "application/vnd.ms-powerpoint.addin.macroenabled.12",
                                            "ppam"),
                                    new ZPair(
                                            "application/vnd.ms-powerpoint.presentation.macroenabled.12",
                                            "pptm"),
                                    new ZPair(
                                            "application/vnd.ms-powerpoint.slide.macroenabled.12",
                                            "sldm"),
                                    new ZPair(
                                            "application/vnd.ms-powerpoint.slideshow.macroenabled.12",
                                            "ppsm"),
                                    new ZPair(
                                            "application/vnd.ms-powerpoint.template.macroenabled.12",
                                            "potm"),
                                    new ZPair(
                                            "application/vnd.ms-project",
                                            ZVal.arrayFromList("mpp", "mpt")),
                                    new ZPair(
                                            "application/vnd.ms-word.document.macroenabled.12",
                                            "docm"),
                                    new ZPair(
                                            "application/vnd.ms-word.template.macroenabled.12",
                                            "dotm"),
                                    new ZPair(
                                            "application/vnd.ms-works",
                                            ZVal.arrayFromList("wps", "wks", "wcm", "wdb")),
                                    new ZPair("application/vnd.ms-wpl", "wpl"),
                                    new ZPair("application/vnd.ms-xpsdocument", "xps"),
                                    new ZPair("application/vnd.mseq", "mseq"),
                                    new ZPair("application/vnd.musician", "mus"),
                                    new ZPair("application/vnd.oasis.opendocument.chart", "odc"),
                                    new ZPair(
                                            "application/vnd.oasis.opendocument.chart-template",
                                            "otc"),
                                    new ZPair("application/vnd.oasis.opendocument.database", "odb"),
                                    new ZPair("application/vnd.oasis.opendocument.formula", "odf"),
                                    new ZPair(
                                            "application/vnd.oasis.opendocument.formula-template",
                                            "odft"),
                                    new ZPair("application/vnd.oasis.opendocument.graphics", "odg"),
                                    new ZPair(
                                            "application/vnd.oasis.opendocument.graphics-template",
                                            "otg"),
                                    new ZPair("application/vnd.oasis.opendocument.image", "odi"),
                                    new ZPair(
                                            "application/vnd.oasis.opendocument.image-template",
                                            "oti"),
                                    new ZPair(
                                            "application/vnd.oasis.opendocument.presentation",
                                            "odp"),
                                    new ZPair(
                                            "application/vnd.oasis.opendocument.presentation-template",
                                            "otp"),
                                    new ZPair(
                                            "application/vnd.oasis.opendocument.spreadsheet",
                                            "ods"),
                                    new ZPair(
                                            "application/vnd.oasis.opendocument.spreadsheet-template",
                                            "ots"),
                                    new ZPair("application/vnd.oasis.opendocument.text", "odt"),
                                    new ZPair(
                                            "application/vnd.oasis.opendocument.text-master",
                                            "odm"),
                                    new ZPair(
                                            "application/vnd.oasis.opendocument.text-template",
                                            "ott"),
                                    new ZPair("application/vnd.oasis.opendocument.text-web", "oth"),
                                    new ZPair("application/vnd.olpc-sugar", "xo"),
                                    new ZPair("application/vnd.oma.dd2+xml", "dd2"),
                                    new ZPair("application/vnd.openofficeorg.extension", "oxt"),
                                    new ZPair(
                                            "application/vnd.openxmlformats-officedocument.presentationml.presentation",
                                            "pptx"),
                                    new ZPair(
                                            "application/vnd.openxmlformats-officedocument.presentationml.slide",
                                            "sldx"),
                                    new ZPair(
                                            "application/vnd.openxmlformats-officedocument.presentationml.slideshow",
                                            "ppsx"),
                                    new ZPair(
                                            "application/vnd.openxmlformats-officedocument.presentationml.template",
                                            "potx"),
                                    new ZPair(
                                            "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet",
                                            "xlsx"),
                                    new ZPair(
                                            "application/vnd.openxmlformats-officedocument.spreadsheetml.template",
                                            "xltx"),
                                    new ZPair(
                                            "application/vnd.openxmlformats-officedocument.wordprocessingml.document",
                                            "docx"),
                                    new ZPair(
                                            "application/vnd.openxmlformats-officedocument.wordprocessingml.template",
                                            "dotx"),
                                    new ZPair("application/vnd.pvi.ptid1", "ptid"),
                                    new ZPair(
                                            "application/vnd.quark.quarkxpress",
                                            ZVal.arrayFromList(
                                                    "qxd", "qxt", "qwd", "qwt", "qxl", "qxb")),
                                    new ZPair("application/vnd.realvnc.bed", "bed"),
                                    new ZPair("application/vnd.recordare.musicxml", "mxl"),
                                    new ZPair("application/vnd.recordare.musicxml+xml", "musicxml"),
                                    new ZPair("application/vnd.rig.cryptonote", "cryptonote"),
                                    new ZPair("application/vnd.rim.cod", "cod"),
                                    new ZPair("application/vnd.rn-realmedia", "rm"),
                                    new ZPair("application/vnd.rn-realmedia-vbr", "rmvb"),
                                    new ZPair("application/vnd.route66.link66+xml", "link66"),
                                    new ZPair("application/vnd.sailingtracker.track", "st"),
                                    new ZPair("application/vnd.seemail", "see"),
                                    new ZPair("application/vnd.sema", "sema"),
                                    new ZPair("application/vnd.semd", "semd"),
                                    new ZPair("application/vnd.semf", "semf"),
                                    new ZPair("application/vnd.shana.informed.formdata", "ifm"),
                                    new ZPair("application/vnd.shana.informed.formtemplate", "itp"),
                                    new ZPair("application/vnd.shana.informed.interchange", "iif"),
                                    new ZPair("application/vnd.shana.informed.package", "ipk"),
                                    new ZPair(
                                            "application/vnd.simtech-mindmapper",
                                            ZVal.arrayFromList("twd", "twds")),
                                    new ZPair("application/vnd.smaf", "mmf"),
                                    new ZPair("application/vnd.stepmania.stepchart", "sm"),
                                    new ZPair("application/vnd.sun.xml.calc", "sxc"),
                                    new ZPair("application/vnd.sun.xml.calc.template", "stc"),
                                    new ZPair("application/vnd.sun.xml.draw", "sxd"),
                                    new ZPair("application/vnd.sun.xml.draw.template", "std"),
                                    new ZPair("application/vnd.sun.xml.impress", "sxi"),
                                    new ZPair("application/vnd.sun.xml.impress.template", "sti"),
                                    new ZPair("application/vnd.sun.xml.math", "sxm"),
                                    new ZPair("application/vnd.sun.xml.writer", "sxw"),
                                    new ZPair("application/vnd.sun.xml.writer.global", "sxg"),
                                    new ZPair("application/vnd.sun.xml.writer.template", "stw"),
                                    new ZPair(
                                            "application/vnd.sus-calendar",
                                            ZVal.arrayFromList("sus", "susp")),
                                    new ZPair("application/vnd.svd", "svd"),
                                    new ZPair(
                                            "application/vnd.symbian.install",
                                            ZVal.arrayFromList("sis", "sisx")),
                                    new ZPair("application/vnd.syncml+xml", "xsm"),
                                    new ZPair("application/vnd.syncml.dm+wbxml", "bdm"),
                                    new ZPair("application/vnd.syncml.dm+xml", "xdm"),
                                    new ZPair("application/vnd.tao.intent-module-archive", "tao"),
                                    new ZPair(
                                            "application/vnd.tcpdump.pcap",
                                            ZVal.arrayFromList("pcap", "cap", "dmp")),
                                    new ZPair("application/vnd.tmobile-livetv", "tmo"),
                                    new ZPair("application/vnd.trid.tpt", "tpt"),
                                    new ZPair("application/vnd.triscape.mxs", "mxs"),
                                    new ZPair("application/vnd.trueapp", "tra"),
                                    new ZPair(
                                            "application/vnd.ufdl",
                                            ZVal.arrayFromList("ufd", "ufdl")),
                                    new ZPair("application/vnd.uiq.theme", "utz"),
                                    new ZPair("application/vnd.umajin", "umj"),
                                    new ZPair("application/vnd.unity", "unityweb"),
                                    new ZPair("application/vnd.uoml+xml", "uoml"),
                                    new ZPair("application/vnd.vcx", "vcx"),
                                    new ZPair(
                                            "application/vnd.visio",
                                            ZVal.arrayFromList("vsd", "vst", "vss", "vsw")),
                                    new ZPair("application/vnd.visionary", "vis"),
                                    new ZPair("application/vnd.vsf", "vsf"),
                                    new ZPair("application/vnd.wap.wbxml", "wbxml"),
                                    new ZPair("application/vnd.wap.wmlc", "wmlc"),
                                    new ZPair("application/vnd.wap.wmlscriptc", "wmlsc"),
                                    new ZPair("application/vnd.webturbo", "wtb"),
                                    new ZPair("application/vnd.wolfram.player", "nbp"),
                                    new ZPair("application/vnd.wordperfect", "wpd"),
                                    new ZPair("application/vnd.wqd", "wqd"),
                                    new ZPair("application/vnd.wt.stf", "stf"),
                                    new ZPair("application/vnd.xara", "xar"),
                                    new ZPair("application/vnd.xfdl", "xfdl"),
                                    new ZPair("application/voicexml+xml", "vxml"),
                                    new ZPair("application/widget", "wgt"),
                                    new ZPair("application/winhlp", "hlp"),
                                    new ZPair("application/wsdl+xml", "wsdl"),
                                    new ZPair("application/wspolicy+xml", "wspolicy"),
                                    new ZPair("application/x-7z-compressed", "7z"),
                                    new ZPair("application/x-bittorrent", "torrent"),
                                    new ZPair(
                                            "application/x-blorb",
                                            ZVal.arrayFromList("blb", "blorb")),
                                    new ZPair("application/x-bzip", "bz"),
                                    new ZPair("application/x-cdlink", "vcd"),
                                    new ZPair("application/x-cfs-compressed", "cfs"),
                                    new ZPair("application/x-chat", "chat"),
                                    new ZPair("application/x-chess-pgn", "pgn"),
                                    new ZPair("application/x-conference", "nsc"),
                                    new ZPair("application/x-cpio", "cpio"),
                                    new ZPair("application/x-csh", "csh"),
                                    new ZPair(
                                            "application/x-debian-package",
                                            ZVal.arrayFromList("deb", "udeb")),
                                    new ZPair("application/x-dgc-compressed", "dgc"),
                                    new ZPair(
                                            "application/x-director",
                                            ZVal.arrayFromList(
                                                    "dir", "dcr", "dxr", "cst", "cct", "cxt", "w3d",
                                                    "fgd", "swa")),
                                    new ZPair(
                                            "application/x-font-ttf",
                                            ZVal.arrayFromList("ttf", "ttc")),
                                    new ZPair(
                                            "application/x-font-type1",
                                            ZVal.arrayFromList("pfa", "pfb", "pfm", "afm")),
                                    new ZPair("application/x-font-woff", "woff"),
                                    new ZPair("application/x-freearc", "arc"),
                                    new ZPair("application/x-futuresplash", "spl"),
                                    new ZPair("application/x-gca-compressed", "gca"),
                                    new ZPair("application/x-glulx", "ulx"),
                                    new ZPair("application/x-gnumeric", "gnumeric"),
                                    new ZPair("application/x-gramps-xml", "gramps"),
                                    new ZPair("application/x-gtar", "gtar"),
                                    new ZPair("application/x-hdf", "hdf"),
                                    new ZPair("application/x-install-instructions", "install"),
                                    new ZPair("application/x-iso9660-image", "iso"),
                                    new ZPair("application/x-java-jnlp-file", "jnlp"),
                                    new ZPair("application/x-latex", "latex"),
                                    new ZPair(
                                            "application/x-lzh-compressed",
                                            ZVal.arrayFromList("lzh", "lha")),
                                    new ZPair("application/x-mie", "mie"),
                                    new ZPair(
                                            "application/x-mobipocket-ebook",
                                            ZVal.arrayFromList("prc", "mobi")),
                                    new ZPair("application/x-ms-application", "application"),
                                    new ZPair("application/x-ms-shortcut", "lnk"),
                                    new ZPair("application/x-ms-wmd", "wmd"),
                                    new ZPair("application/x-ms-wmz", "wmz"),
                                    new ZPair("application/x-ms-xbap", "xbap"),
                                    new ZPair("application/x-msaccess", "mdb"),
                                    new ZPair("application/x-msbinder", "obd"),
                                    new ZPair("application/x-mscardfile", "crd"),
                                    new ZPair("application/x-msclip", "clp"),
                                    new ZPair(
                                            "application/x-msdownload",
                                            ZVal.arrayFromList("exe", "dll", "com", "bat", "msi")),
                                    new ZPair(
                                            "application/x-msmediaview",
                                            ZVal.arrayFromList("mvb", "m13", "m14")),
                                    new ZPair(
                                            "application/x-msmetafile",
                                            ZVal.arrayFromList("wmf", "wmz", "emf", "emz")),
                                    new ZPair("application/x-rar-compressed", "rar"),
                                    new ZPair("application/x-research-info-systems", "ris"),
                                    new ZPair("application/x-sh", "sh"),
                                    new ZPair("application/x-shar", "shar"),
                                    new ZPair("application/x-shockwave-flash", "swf"),
                                    new ZPair("application/x-silverlight-app", "xap"),
                                    new ZPair("application/x-sql", "sql"),
                                    new ZPair("application/x-stuffit", "sit"),
                                    new ZPair("application/x-stuffitx", "sitx"),
                                    new ZPair("application/x-subrip", "srt"),
                                    new ZPair("application/x-sv4cpio", "sv4cpio"),
                                    new ZPair("application/x-sv4crc", "sv4crc"),
                                    new ZPair("application/x-t3vm-image", "t3"),
                                    new ZPair("application/x-tads", "gam"),
                                    new ZPair("application/x-tar", "tar"),
                                    new ZPair("application/x-tcl", "tcl"),
                                    new ZPair("application/x-tex", "tex"),
                                    new ZPair("application/x-tex-tfm", "tfm"),
                                    new ZPair(
                                            "application/x-texinfo",
                                            ZVal.arrayFromList("texinfo", "texi")),
                                    new ZPair("application/x-tgif", "obj"),
                                    new ZPair("application/x-ustar", "ustar"),
                                    new ZPair("application/x-wais-source", "src"),
                                    new ZPair(
                                            "application/x-x509-ca-cert",
                                            ZVal.arrayFromList("der", "crt")),
                                    new ZPair("application/x-xfig", "fig"),
                                    new ZPair("application/x-xliff+xml", "xlf"),
                                    new ZPair("application/x-xpinstall", "xpi"),
                                    new ZPair("application/x-xz", "xz"),
                                    new ZPair("application/x-zmachine", "z1"),
                                    new ZPair("application/xaml+xml", "xaml"),
                                    new ZPair("application/xcap-diff+xml", "xdf"),
                                    new ZPair("application/xenc+xml", "xenc"),
                                    new ZPair(
                                            "application/xhtml+xml",
                                            ZVal.arrayFromList("xhtml", "xht")),
                                    new ZPair("application/xml", ZVal.arrayFromList("xml", "xsl")),
                                    new ZPair("application/xml-dtd", "dtd"),
                                    new ZPair("application/xop+xml", "xop"),
                                    new ZPair("application/xproc+xml", "xpl"),
                                    new ZPair("application/xslt+xml", "xslt"),
                                    new ZPair("application/xspf+xml", "xspf"),
                                    new ZPair(
                                            "application/xv+xml",
                                            ZVal.arrayFromList("mxml", "xhvml", "xvml", "xvm")),
                                    new ZPair("application/yang", "yang"),
                                    new ZPair("application/yin+xml", "yin"),
                                    new ZPair("application/zip", "zip"),
                                    new ZPair("audio/adpcm", "adp"),
                                    new ZPair("audio/basic", ZVal.arrayFromList("au", "snd")),
                                    new ZPair(
                                            "audio/midi",
                                            ZVal.arrayFromList("mid", "midi", "kar", "rmi")),
                                    new ZPair("audio/mp4", "mp4a"),
                                    new ZPair(
                                            "audio/mpeg",
                                            ZVal.arrayFromList(
                                                    "mpga", "mp2", "mp2a", "mp3", "m2a", "m3a")),
                                    new ZPair("audio/ogg", ZVal.arrayFromList("oga", "ogg", "spx")),
                                    new ZPair(
                                            "audio/vnd.dece.audio",
                                            ZVal.arrayFromList("uva", "uvva")),
                                    new ZPair("audio/vnd.rip", "rip"),
                                    new ZPair("audio/webm", "weba"),
                                    new ZPair("audio/x-aac", "aac"),
                                    new ZPair(
                                            "audio/x-aiff",
                                            ZVal.arrayFromList("aif", "aiff", "aifc")),
                                    new ZPair("audio/x-caf", "caf"),
                                    new ZPair("audio/x-flac", "flac"),
                                    new ZPair("audio/x-matroska", "mka"),
                                    new ZPair("audio/x-mpegurl", "m3u"),
                                    new ZPair("audio/x-ms-wax", "wax"),
                                    new ZPair("audio/x-ms-wma", "wma"),
                                    new ZPair(
                                            "audio/x-pn-realaudio",
                                            ZVal.arrayFromList("ram", "ra")),
                                    new ZPair("audio/x-pn-realaudio-plugin", "rmp"),
                                    new ZPair("audio/x-wav", "wav"),
                                    new ZPair("audio/xm", "xm"),
                                    new ZPair("image/bmp", "bmp"),
                                    new ZPair("image/cgm", "cgm"),
                                    new ZPair("image/g3fax", "g3"),
                                    new ZPair("image/gif", "gif"),
                                    new ZPair("image/ief", "ief"),
                                    new ZPair(
                                            "image/jpeg", ZVal.arrayFromList("jpeg", "jpg", "jpe")),
                                    new ZPair("image/ktx", "ktx"),
                                    new ZPair("image/png", "png"),
                                    new ZPair("image/prs.btif", "btif"),
                                    new ZPair("image/sgi", "sgi"),
                                    new ZPair("image/svg+xml", ZVal.arrayFromList("svg", "svgz")),
                                    new ZPair("image/tiff", ZVal.arrayFromList("tiff", "tif")),
                                    new ZPair("image/vnd.adobe.photoshop", "psd"),
                                    new ZPair(
                                            "image/vnd.dece.graphic",
                                            ZVal.arrayFromList("uvi", "uvvi", "uvg", "uvvg")),
                                    new ZPair("image/vnd.dvb.subtitle", "sub"),
                                    new ZPair("image/vnd.djvu", ZVal.arrayFromList("djvu", "djv")),
                                    new ZPair("image/vnd.dwg", "dwg"),
                                    new ZPair("image/vnd.dxf", "dxf"),
                                    new ZPair("image/vnd.fastbidsheet", "fbs"),
                                    new ZPair("image/vnd.fpx", "fpx"),
                                    new ZPair("image/vnd.fst", "fst"),
                                    new ZPair("image/vnd.fujixerox.edmics-mmr", "mmr"),
                                    new ZPair("image/vnd.fujixerox.edmics-rlc", "rlc"),
                                    new ZPair("image/vnd.ms-modi", "mdi"),
                                    new ZPair("image/vnd.ms-photo", "wdp"),
                                    new ZPair("image/vnd.net-fpx", "npx"),
                                    new ZPair("image/vnd.wap.wbmp", "wbmp"),
                                    new ZPair("image/vnd.xiff", "xif"),
                                    new ZPair("image/webp", "webp"),
                                    new ZPair("image/x-3ds", "3ds"),
                                    new ZPair("image/x-cmu-raster", "ras"),
                                    new ZPair("image/x-cmx", "cmx"),
                                    new ZPair(
                                            "image/x-freehand",
                                            ZVal.arrayFromList("fh", "fhc", "fh4", "fh5", "fh7")),
                                    new ZPair("image/x-icon", "ico"),
                                    new ZPair("image/x-mrsid-image", "sid"),
                                    new ZPair("image/x-pcx", "pcx"),
                                    new ZPair("image/x-pict", ZVal.arrayFromList("pic", "pct")),
                                    new ZPair("image/x-portable-anymap", "pnm"),
                                    new ZPair("image/x-portable-bitmap", "pbm"),
                                    new ZPair("image/x-portable-graymap", "pgm"),
                                    new ZPair("image/x-portable-pixmap", "ppm"),
                                    new ZPair("image/x-rgb", "rgb"),
                                    new ZPair("image/x-tga", "tga"),
                                    new ZPair("image/x-xbitmap", "xbm"),
                                    new ZPair("image/x-xpixmap", "xpm"),
                                    new ZPair("image/x-xwindowdump", "xwd"),
                                    new ZPair("message/rfc822", ZVal.arrayFromList("eml", "mime")),
                                    new ZPair("model/iges", ZVal.arrayFromList("igs", "iges")),
                                    new ZPair(
                                            "model/mesh",
                                            ZVal.arrayFromList("msh", "mesh", "silo")),
                                    new ZPair("model/vnd.collada+xml", "dae"),
                                    new ZPair("model/vnd.dwf", "dwf"),
                                    new ZPair("model/vnd.gdl", "gdl"),
                                    new ZPair("model/vnd.gtw", "gtw"),
                                    new ZPair("model/vnd.mts", "mts"),
                                    new ZPair("model/vnd.vtu", "vtu"),
                                    new ZPair("model/vrml", ZVal.arrayFromList("wrl", "vrml")),
                                    new ZPair("model/x3d+binary", "x3db"),
                                    new ZPair("model/x3d+vrml", "x3dv"),
                                    new ZPair("model/x3d+xml", "x3d"),
                                    new ZPair("text/cache-manifest", "appcache"),
                                    new ZPair("text/calendar", ZVal.arrayFromList("ics", "ifb")),
                                    new ZPair("text/css", "css"),
                                    new ZPair("text/csv", "csv"),
                                    new ZPair("text/html", ZVal.arrayFromList("html", "htm")),
                                    new ZPair("text/n3", "n3"),
                                    new ZPair(
                                            "text/plain",
                                            ZVal.arrayFromList(
                                                    "txt", "text", "conf", "def", "list", "log",
                                                    "in")),
                                    new ZPair("text/prs.lines.tag", "dsc"),
                                    new ZPair("text/richtext", "rtx"),
                                    new ZPair("text/sgml", ZVal.arrayFromList("sgml", "sgm")),
                                    new ZPair("text/tab-separated-values", "tsv"),
                                    new ZPair(
                                            "text/troff",
                                            ZVal.arrayFromList(
                                                    "t", "tr", "roff", "man", "me", "ms")),
                                    new ZPair("text/turtle", "ttl"),
                                    new ZPair(
                                            "text/uri-list",
                                            ZVal.arrayFromList("uri", "uris", "urls")),
                                    new ZPair("text/vcard", "vcard"),
                                    new ZPair("text/vnd.curl", "curl"),
                                    new ZPair("text/vnd.curl.dcurl", "dcurl"),
                                    new ZPair("text/vnd.curl.scurl", "scurl"),
                                    new ZPair("text/vnd.curl.mcurl", "mcurl"),
                                    new ZPair("text/vnd.dvb.subtitle", "sub"),
                                    new ZPair("text/vnd.fly", "fly"),
                                    new ZPair("text/vnd.fmi.flexstor", "flx"),
                                    new ZPair("text/vnd.graphviz", "gv"),
                                    new ZPair("text/vnd.in3d.3dml", "3dml"),
                                    new ZPair("text/vnd.in3d.spot", "spot"),
                                    new ZPair("text/vnd.sun.j2me.app-descriptor", "jad"),
                                    new ZPair("text/vnd.wap.wml", "wml"),
                                    new ZPair("text/vnd.wap.wmlscript", "wmls"),
                                    new ZPair("text/x-asm", ZVal.arrayFromList("s", "asm")),
                                    new ZPair(
                                            "text/x-fortran",
                                            ZVal.arrayFromList("f", "for", "f77", "f90")),
                                    new ZPair("text/x-java-source", "java"),
                                    new ZPair("text/x-opml", "opml"),
                                    new ZPair("text/x-pascal", ZVal.arrayFromList("p", "pas")),
                                    new ZPair("text/x-nfo", "nfo"),
                                    new ZPair("text/x-setext", "etx"),
                                    new ZPair("text/x-sfv", "sfv"),
                                    new ZPair("text/x-uuencode", "uu"),
                                    new ZPair("text/x-vcalendar", "vcs"),
                                    new ZPair("text/x-vcard", "vcf"),
                                    new ZPair("video/3gpp", "3gp"),
                                    new ZPair("video/3gpp2", "3g2"),
                                    new ZPair("video/h261", "h261"),
                                    new ZPair("video/h263", "h263"),
                                    new ZPair("video/h264", "h264"),
                                    new ZPair("video/jpeg", "jpgv"),
                                    new ZPair("video/jpm", ZVal.arrayFromList("jpm", "jpgm")),
                                    new ZPair("video/mj2", "mj2"),
                                    new ZPair("video/mp4", "mp4"),
                                    new ZPair(
                                            "video/mpeg",
                                            ZVal.arrayFromList("mpeg", "mpg", "mpe", "m1v", "m2v")),
                                    new ZPair("video/ogg", "ogv"),
                                    new ZPair("video/quicktime", ZVal.arrayFromList("qt", "mov")),
                                    new ZPair(
                                            "video/vnd.dece.hd", ZVal.arrayFromList("uvh", "uvvh")),
                                    new ZPair(
                                            "video/vnd.dece.mobile",
                                            ZVal.arrayFromList("uvm", "uvvm")),
                                    new ZPair(
                                            "video/vnd.dece.pd", ZVal.arrayFromList("uvp", "uvvp")),
                                    new ZPair(
                                            "video/vnd.dece.sd", ZVal.arrayFromList("uvs", "uvvs")),
                                    new ZPair(
                                            "video/vnd.dece.video",
                                            ZVal.arrayFromList("uvv", "uvvv")),
                                    new ZPair("video/vnd.dvb.file", "dvb"),
                                    new ZPair("video/vnd.fvt", "fvt"),
                                    new ZPair(
                                            "video/vnd.mpegurl", ZVal.arrayFromList("mxu", "m4u")),
                                    new ZPair("video/vnd.ms-playready.media.pyv", "pyv"),
                                    new ZPair(
                                            "video/vnd.uvvu.mp4",
                                            ZVal.arrayFromList("uvu", "uvvu")),
                                    new ZPair("video/vnd.vivo", "viv"),
                                    new ZPair("video/webm", "webm"),
                                    new ZPair("video/x-f4v", "f4v"),
                                    new ZPair("video/x-fli", "fli"),
                                    new ZPair("video/x-flv", "flv"),
                                    new ZPair("video/x-m4v", "m4v"),
                                    new ZPair(
                                            "video/x-matroska",
                                            ZVal.arrayFromList("mkv", "mk3d", "mks")),
                                    new ZPair("video/x-mng", "mng"),
                                    new ZPair("video/x-ms-asf", ZVal.arrayFromList("asf", "asx")),
                                    new ZPair("video/x-ms-vob", "vob"),
                                    new ZPair("video/x-ms-wm", "wm"),
                                    new ZPair("video/x-ms-wmv", "wmv"),
                                    new ZPair("video/x-ms-wmx", "wmx"),
                                    new ZPair("video/x-ms-wvx", "wvx"),
                                    new ZPair("video/x-msvideo", "avi"),
                                    new ZPair("video/x-sgi-movie", "movie"));
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\File")
                    .setLookup(
                            File.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("mimeTypes")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/File.php")
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
