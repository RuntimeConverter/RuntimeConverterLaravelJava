package com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.namespaces.Util.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeClasses.otherProxyClasses.finfo;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.errors.ErrorException;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/league/flysystem/src/Util/MimeType.php

*/

public class MimeType extends RuntimeClassBase {

    public MimeType(RuntimeEnv env, Object... args) {
        super(env);
    }

    public MimeType(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "League\\Flysystem\\Util\\MimeType";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "content")
        public Object detectByContent(RuntimeEnv env, Object... args) {
            Object content = assignParameter(args, 0, false);
            Object e = null;
            Object finfo = null;
            Object ternaryExpressionTemp = null;
            if (ZVal.toBool(!function_class_exists.f.env(env).call("finfo").getBool())
                    || ZVal.toBool(!function_is_string.f.env(env).call(content).getBool())) {
                return ZVal.assign(ZVal.getNull());
            }

            try {
                finfo = new finfo(env, 16);
                return ZVal.assign(
                        ZVal.isTrue(
                                        ternaryExpressionTemp =
                                                env.callMethod(
                                                        finfo, "buffer", MimeType.class, content))
                                ? ternaryExpressionTemp
                                : ZVal.getNull());
            } catch (ConvertedException convertedException79) {
                if (convertedException79.instanceOf(ErrorException.class, "ErrorException")) {
                    e = convertedException79.getObject();
                } else {
                    throw convertedException79;
                }
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "extension")
        public Object detectByFileExtension(RuntimeEnv env, Object... args) {
            Object extension = assignParameter(args, 0, false);
            ReferenceContainer extensionToMimeTypeMap = new BasicReferenceContainer(null);
            extensionToMimeTypeMap = env.getInlineStatic(11, null);
            if (!ZVal.isTrue(extensionToMimeTypeMap.getObject())) {
                extensionToMimeTypeMap.setObject(
                        StaticMethodUtils.accessUnknownLateStaticMethod(env, this, MimeType.class)
                                .method("getExtensionToMimeTypeMap")
                                .call()
                                .value());
            }

            if (arrayActionR(ArrayAction.ISSET, extensionToMimeTypeMap, env, extension)) {
                return ZVal.assign(extensionToMimeTypeMap.arrayGet(env, extension));
            }

            return "text/plain";
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "filename")
        public Object detectByFilename(RuntimeEnv env, Object... args) {
            Object filename = assignParameter(args, 0, false);
            Object extension = null;
            extension =
                    NamespaceGlobal.strtolower
                            .env(env)
                            .call(NamespaceGlobal.pathinfo.env(env).call(filename, 4).value())
                            .value();
            return ZVal.assign(
                    ZVal.isEmpty(extension)
                            ? "text/plain"
                            : StaticMethodUtils.accessUnknownLateStaticMethod(
                                            env, this, MimeType.class)
                                    .method("detectByFileExtension")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(extension)
                                    .value());
        }

        @ConvertedMethod
        public Object getExtensionToMimeTypeMap(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    ZVal.arrayFromLambdaExpression(
                            /* Lambda can be removed if method size limit (64kb) is not an issue. */
                            () -> {
                                return ZVal.newArray(
                                        new ZPair("hqx", "application/mac-binhex40"),
                                        new ZPair("cpt", "application/mac-compactpro"),
                                        new ZPair("csv", "text/x-comma-separated-values"),
                                        new ZPair("bin", "application/octet-stream"),
                                        new ZPair("dms", "application/octet-stream"),
                                        new ZPair("lha", "application/octet-stream"),
                                        new ZPair("lzh", "application/octet-stream"),
                                        new ZPair("exe", "application/octet-stream"),
                                        new ZPair("class", "application/octet-stream"),
                                        new ZPair("psd", "application/x-photoshop"),
                                        new ZPair("so", "application/octet-stream"),
                                        new ZPair("sea", "application/octet-stream"),
                                        new ZPair("dll", "application/octet-stream"),
                                        new ZPair("oda", "application/oda"),
                                        new ZPair("pdf", "application/pdf"),
                                        new ZPair("ai", "application/pdf"),
                                        new ZPair("eps", "application/postscript"),
                                        new ZPair("ps", "application/postscript"),
                                        new ZPair("smi", "application/smil"),
                                        new ZPair("smil", "application/smil"),
                                        new ZPair("mif", "application/vnd.mif"),
                                        new ZPair("xls", "application/vnd.ms-excel"),
                                        new ZPair("ppt", "application/powerpoint"),
                                        new ZPair(
                                                "pptx",
                                                "application/vnd.openxmlformats-officedocument.presentationml.presentation"),
                                        new ZPair("wbxml", "application/wbxml"),
                                        new ZPair("wmlc", "application/wmlc"),
                                        new ZPair("dcr", "application/x-director"),
                                        new ZPair("dir", "application/x-director"),
                                        new ZPair("dxr", "application/x-director"),
                                        new ZPair("dvi", "application/x-dvi"),
                                        new ZPair("gtar", "application/x-gtar"),
                                        new ZPair("gz", "application/x-gzip"),
                                        new ZPair("gzip", "application/x-gzip"),
                                        new ZPair("php", "application/x-httpd-php"),
                                        new ZPair("php4", "application/x-httpd-php"),
                                        new ZPair("php3", "application/x-httpd-php"),
                                        new ZPair("phtml", "application/x-httpd-php"),
                                        new ZPair("phps", "application/x-httpd-php-source"),
                                        new ZPair("js", "application/javascript"),
                                        new ZPair("swf", "application/x-shockwave-flash"),
                                        new ZPair("sit", "application/x-stuffit"),
                                        new ZPair("tar", "application/x-tar"),
                                        new ZPair("tgz", "application/x-tar"),
                                        new ZPair("z", "application/x-compress"),
                                        new ZPair("xhtml", "application/xhtml+xml"),
                                        new ZPair("xht", "application/xhtml+xml"),
                                        new ZPair("zip", "application/x-zip"),
                                        new ZPair("rar", "application/x-rar"),
                                        new ZPair("mid", "audio/midi"),
                                        new ZPair("midi", "audio/midi"),
                                        new ZPair("mpga", "audio/mpeg"),
                                        new ZPair("mp2", "audio/mpeg"),
                                        new ZPair("mp3", "audio/mpeg"),
                                        new ZPair("aif", "audio/x-aiff"),
                                        new ZPair("aiff", "audio/x-aiff"),
                                        new ZPair("aifc", "audio/x-aiff"),
                                        new ZPair("ram", "audio/x-pn-realaudio"),
                                        new ZPair("rm", "audio/x-pn-realaudio"),
                                        new ZPair("rpm", "audio/x-pn-realaudio-plugin"),
                                        new ZPair("ra", "audio/x-realaudio"),
                                        new ZPair("rv", "video/vnd.rn-realvideo"),
                                        new ZPair("wav", "audio/x-wav"),
                                        new ZPair("jpg", "image/jpeg"),
                                        new ZPair("jpeg", "image/jpeg"),
                                        new ZPair("jpe", "image/jpeg"),
                                        new ZPair("png", "image/png"),
                                        new ZPair("gif", "image/gif"),
                                        new ZPair("bmp", "image/bmp"),
                                        new ZPair("tiff", "image/tiff"),
                                        new ZPair("tif", "image/tiff"),
                                        new ZPair("svg", "image/svg+xml"),
                                        new ZPair("css", "text/css"),
                                        new ZPair("html", "text/html"),
                                        new ZPair("htm", "text/html"),
                                        new ZPair("shtml", "text/html"),
                                        new ZPair("txt", "text/plain"),
                                        new ZPair("text", "text/plain"),
                                        new ZPair("log", "text/plain"),
                                        new ZPair("rtx", "text/richtext"),
                                        new ZPair("rtf", "text/rtf"),
                                        new ZPair("xml", "application/xml"),
                                        new ZPair("xsl", "application/xml"),
                                        new ZPair("dmn", "application/octet-stream"),
                                        new ZPair("bpmn", "application/octet-stream"),
                                        new ZPair("mpeg", "video/mpeg"),
                                        new ZPair("mpg", "video/mpeg"),
                                        new ZPair("mpe", "video/mpeg"),
                                        new ZPair("qt", "video/quicktime"),
                                        new ZPair("mov", "video/quicktime"),
                                        new ZPair("avi", "video/x-msvideo"),
                                        new ZPair("movie", "video/x-sgi-movie"),
                                        new ZPair("doc", "application/msword"),
                                        new ZPair(
                                                "docx",
                                                "application/vnd.openxmlformats-officedocument.wordprocessingml.document"),
                                        new ZPair(
                                                "docm",
                                                "application/vnd.ms-word.template.macroEnabled.12"),
                                        new ZPair("dot", "application/msword"),
                                        new ZPair(
                                                "dotx",
                                                "application/vnd.openxmlformats-officedocument.wordprocessingml.document"),
                                        new ZPair(
                                                "xlsx",
                                                "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"),
                                        new ZPair("word", "application/msword"),
                                        new ZPair("xl", "application/excel"),
                                        new ZPair("eml", "message/rfc822"),
                                        new ZPair("json", "application/json"),
                                        new ZPair("pem", "application/x-x509-user-cert"),
                                        new ZPair("p10", "application/x-pkcs10"),
                                        new ZPair("p12", "application/x-pkcs12"),
                                        new ZPair("p7a", "application/x-pkcs7-signature"),
                                        new ZPair("p7c", "application/pkcs7-mime"),
                                        new ZPair("p7m", "application/pkcs7-mime"),
                                        new ZPair("p7r", "application/x-pkcs7-certreqresp"),
                                        new ZPair("p7s", "application/pkcs7-signature"),
                                        new ZPair("crt", "application/x-x509-ca-cert"),
                                        new ZPair("crl", "application/pkix-crl"),
                                        new ZPair("der", "application/x-x509-ca-cert"),
                                        new ZPair("kdb", "application/octet-stream"),
                                        new ZPair("pgp", "application/pgp"),
                                        new ZPair("gpg", "application/gpg-keys"),
                                        new ZPair("sst", "application/octet-stream"),
                                        new ZPair("csr", "application/octet-stream"),
                                        new ZPair("rsa", "application/x-pkcs7"),
                                        new ZPair("cer", "application/pkix-cert"),
                                        new ZPair("3g2", "video/3gpp2"),
                                        new ZPair("3gp", "video/3gp"),
                                        new ZPair("mp4", "video/mp4"),
                                        new ZPair("m4a", "audio/x-m4a"),
                                        new ZPair("f4v", "video/mp4"),
                                        new ZPair("webm", "video/webm"),
                                        new ZPair("aac", "audio/x-acc"),
                                        new ZPair("m4u", "application/vnd.mpegurl"),
                                        new ZPair("m3u", "text/plain"),
                                        new ZPair("xspf", "application/xspf+xml"),
                                        new ZPair("vlc", "application/videolan"),
                                        new ZPair("wmv", "video/x-ms-wmv"),
                                        new ZPair("au", "audio/x-au"),
                                        new ZPair("ac3", "audio/ac3"),
                                        new ZPair("flac", "audio/x-flac"),
                                        new ZPair("ogg", "audio/ogg"),
                                        new ZPair("kmz", "application/vnd.google-earth.kmz"),
                                        new ZPair("kml", "application/vnd.google-earth.kml+xml"),
                                        new ZPair("ics", "text/calendar"),
                                        new ZPair("zsh", "text/x-scriptzsh"),
                                        new ZPair("7zip", "application/x-7z-compressed"),
                                        new ZPair("cdr", "application/cdr"),
                                        new ZPair("wma", "audio/x-ms-wma"),
                                        new ZPair("jar", "application/java-archive"),
                                        new ZPair("tex", "application/x-tex"),
                                        new ZPair("latex", "application/x-latex"),
                                        new ZPair("odt", "application/vnd.oasis.opendocument.text"),
                                        new ZPair(
                                                "ods",
                                                "application/vnd.oasis.opendocument.spreadsheet"),
                                        new ZPair(
                                                "odp",
                                                "application/vnd.oasis.opendocument.presentation"),
                                        new ZPair(
                                                "odg",
                                                "application/vnd.oasis.opendocument.graphics"),
                                        new ZPair(
                                                "odc", "application/vnd.oasis.opendocument.chart"),
                                        new ZPair(
                                                "odf",
                                                "application/vnd.oasis.opendocument.formula"),
                                        new ZPair(
                                                "odi", "application/vnd.oasis.opendocument.image"),
                                        new ZPair(
                                                "odm",
                                                "application/vnd.oasis.opendocument.text-master"),
                                        new ZPair(
                                                "odb",
                                                "application/vnd.oasis.opendocument.database"),
                                        new ZPair(
                                                "ott",
                                                "application/vnd.oasis.opendocument.text-template"));
                            }));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("League\\Flysystem\\Util\\MimeType")
                    .setLookup(
                            MimeType.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/league/flysystem/src/Util/MimeType.php")
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
