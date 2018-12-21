package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.namespaces.Testing.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_search;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Http/Testing/MimeType.php

*/

public class MimeType extends RuntimeClassBase {

    public MimeType(RuntimeEnv env, Object... args) {
        super(env);
    }

    public MimeType(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Illuminate\\Http\\Testing\\MimeType";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "filename")
        public Object from(RuntimeEnv env, Object... args) {
            Object filename = assignParameter(args, 0, false);
            Object extension = null;
            extension = NamespaceGlobal.pathinfo.env(env).call(filename, 4).value();
            return ZVal.assign(runtimeStaticObject.getMimeTypeFromExtension(env, extension));
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "extension",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object get(RuntimeEnv env, Object... args) {
            Object extension = assignParameter(args, 0, true);
            if (null == extension) {
                extension = ZVal.getNull();
            }
            return ZVal.assign(
                    ZVal.isTrue(extension)
                            ? runtimeStaticObject.getMimeTypeFromExtension(env, extension)
                            : env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Illuminate
                                                    .namespaces
                                                    .Http
                                                    .namespaces
                                                    .Testing
                                                    .classes
                                                    .MimeType
                                                    .RequestStaticProperties
                                                    .class)
                                    .mimes);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "mimeType")
        public Object search(RuntimeEnv env, Object... args) {
            Object mimeType = assignParameter(args, 0, false);
            Object ternaryExpressionTemp = null;
            return ZVal.assign(
                    ZVal.isTrue(
                                    ternaryExpressionTemp =
                                            function_array_search
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            mimeType,
                                                            env.getRequestStaticProperties(
                                                                            com.project
                                                                                    .convertedCode
                                                                                    .globalNamespace
                                                                                    .namespaces
                                                                                    .Illuminate
                                                                                    .namespaces
                                                                                    .Http
                                                                                    .namespaces
                                                                                    .Testing
                                                                                    .classes
                                                                                    .MimeType
                                                                                    .RequestStaticProperties
                                                                                    .class)
                                                                    .mimes)
                                                    .value())
                            ? ternaryExpressionTemp
                            : ZVal.getNull());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "extension")
        protected Object getMimeTypeFromExtension(RuntimeEnv env, Object... args) {
            Object extension = assignParameter(args, 0, false);
            Object ternaryExpressionTemp = null;
            return ZVal.assign(
                    ZVal.isDefined(
                                    ternaryExpressionTemp =
                                            env.getRequestStaticPropertiesReference(
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .Illuminate
                                                                    .namespaces
                                                                    .Http
                                                                    .namespaces
                                                                    .Testing
                                                                    .classes
                                                                    .MimeType
                                                                    .RequestStaticProperties
                                                                    .class,
                                                            "mimes")
                                                    .arrayGet(env, extension))
                            ? ternaryExpressionTemp
                            : "application/octet-stream");
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object mimes =
                ZVal.mergeArrayFromLambdaExpression(
                        767, /* Due to excessive array size and Java limitations, array initialization has been split into multiple lambdas. */
                        (array) -> {
                            array.addWithZPairNoCopy(new ZPair("ez", "application/andrew-inset"));
                            array.addWithZPairNoCopy(new ZPair("aw", "application/applixware"));
                            array.addWithZPairNoCopy(new ZPair("atom", "application/atom+xml"));
                            array.addWithZPairNoCopy(
                                    new ZPair("atomcat", "application/atomcat+xml"));
                            array.addWithZPairNoCopy(
                                    new ZPair("atomsvc", "application/atomsvc+xml"));
                            array.addWithZPairNoCopy(new ZPair("ccxml", "application/ccxml+xml"));
                            array.addWithZPairNoCopy(
                                    new ZPair("cdmia", "application/cdmi-capability"));
                            array.addWithZPairNoCopy(
                                    new ZPair("cdmic", "application/cdmi-container"));
                            array.addWithZPairNoCopy(new ZPair("cdmid", "application/cdmi-domain"));
                            array.addWithZPairNoCopy(new ZPair("cdmio", "application/cdmi-object"));
                            array.addWithZPairNoCopy(new ZPair("cdmiq", "application/cdmi-queue"));
                            array.addWithZPairNoCopy(new ZPair("cu", "application/cu-seeme"));
                            array.addWithZPairNoCopy(
                                    new ZPair("davmount", "application/davmount+xml"));
                            array.addWithZPairNoCopy(new ZPair("dbk", "application/docbook+xml"));
                            array.addWithZPairNoCopy(new ZPair("dssc", "application/dssc+der"));
                            array.addWithZPairNoCopy(new ZPair("xdssc", "application/dssc+xml"));
                            array.addWithZPairNoCopy(new ZPair("ecma", "application/ecmascript"));
                            array.addWithZPairNoCopy(new ZPair("emma", "application/emma+xml"));
                            array.addWithZPairNoCopy(new ZPair("epub", "application/epub+zip"));
                            array.addWithZPairNoCopy(new ZPair("exi", "application/exi"));
                            array.addWithZPairNoCopy(new ZPair("pfr", "application/font-tdpfr"));
                            array.addWithZPairNoCopy(new ZPair("gml", "application/gml+xml"));
                            array.addWithZPairNoCopy(new ZPair("gpx", "application/gpx+xml"));
                            array.addWithZPairNoCopy(new ZPair("gxf", "application/gxf"));
                            array.addWithZPairNoCopy(new ZPair("stk", "application/hyperstudio"));
                            array.addWithZPairNoCopy(new ZPair("ink", "application/inkml+xml"));
                            array.addWithZPairNoCopy(new ZPair("ipfix", "application/ipfix"));
                            array.addWithZPairNoCopy(new ZPair("jar", "application/java-archive"));
                            array.addWithZPairNoCopy(
                                    new ZPair("ser", "application/java-serialized-object"));
                            array.addWithZPairNoCopy(new ZPair("class", "application/java-vm"));
                            array.addWithZPairNoCopy(new ZPair("js", "application/javascript"));
                            array.addWithZPairNoCopy(new ZPair("json", "application/json"));
                            array.addWithZPairNoCopy(
                                    new ZPair("jsonml", "application/jsonml+json"));
                            array.addWithZPairNoCopy(new ZPair("lostxml", "application/lost+xml"));
                            array.addWithZPairNoCopy(new ZPair("hqx", "application/mac-binhex40"));
                            array.addWithZPairNoCopy(
                                    new ZPair("cpt", "application/mac-compactpro"));
                            array.addWithZPairNoCopy(new ZPair("mads", "application/mads+xml"));
                            array.addWithZPairNoCopy(new ZPair("mrc", "application/marc"));
                            array.addWithZPairNoCopy(new ZPair("mrcx", "application/marcxml+xml"));
                            array.addWithZPairNoCopy(new ZPair("ma", "application/mathematica"));
                            array.addWithZPairNoCopy(new ZPair("mathml", "application/mathml+xml"));
                            array.addWithZPairNoCopy(new ZPair("mbox", "application/mbox"));
                            array.addWithZPairNoCopy(
                                    new ZPair("mscml", "application/mediaservercontrol+xml"));
                            array.addWithZPairNoCopy(
                                    new ZPair("metalink", "application/metalink+xml"));
                            array.addWithZPairNoCopy(
                                    new ZPair("meta4", "application/metalink4+xml"));
                            array.addWithZPairNoCopy(new ZPair("mets", "application/mets+xml"));
                            array.addWithZPairNoCopy(new ZPair("mods", "application/mods+xml"));
                            array.addWithZPairNoCopy(new ZPair("m21", "application/mp21"));
                            array.addWithZPairNoCopy(new ZPair("mp4s", "application/mp4"));
                            array.addWithZPairNoCopy(new ZPair("doc", "application/msword"));
                            array.addWithZPairNoCopy(new ZPair("mxf", "application/mxf"));
                            array.addWithZPairNoCopy(new ZPair("bin", "application/octet-stream"));
                            array.addWithZPairNoCopy(new ZPair("oda", "application/oda"));
                            array.addWithZPairNoCopy(
                                    new ZPair("opf", "application/oebps-package+xml"));
                            array.addWithZPairNoCopy(new ZPair("ogx", "application/ogg"));
                            array.addWithZPairNoCopy(new ZPair("omdoc", "application/omdoc+xml"));
                            array.addWithZPairNoCopy(new ZPair("onetoc", "application/onenote"));
                            array.addWithZPairNoCopy(new ZPair("oxps", "application/oxps"));
                            array.addWithZPairNoCopy(
                                    new ZPair("xer", "application/patch-ops-error+xml"));
                            array.addWithZPairNoCopy(new ZPair("pdf", "application/pdf"));
                            array.addWithZPairNoCopy(new ZPair("pgp", "application/pgp-encrypted"));
                            array.addWithZPairNoCopy(new ZPair("asc", "application/pgp-signature"));
                            array.addWithZPairNoCopy(new ZPair("prf", "application/pics-rules"));
                            array.addWithZPairNoCopy(new ZPair("p10", "application/pkcs10"));
                            array.addWithZPairNoCopy(new ZPair("p7m", "application/pkcs7-mime"));
                            array.addWithZPairNoCopy(
                                    new ZPair("p7s", "application/pkcs7-signature"));
                            array.addWithZPairNoCopy(new ZPair("p8", "application/pkcs8"));
                            array.addWithZPairNoCopy(new ZPair("ac", "application/pkix-attr-cert"));
                            array.addWithZPairNoCopy(new ZPair("cer", "application/pkix-cert"));
                            array.addWithZPairNoCopy(new ZPair("crl", "application/pkix-crl"));
                            array.addWithZPairNoCopy(
                                    new ZPair("pkipath", "application/pkix-pkipath"));
                            array.addWithZPairNoCopy(new ZPair("pki", "application/pkixcmp"));
                            array.addWithZPairNoCopy(new ZPair("pls", "application/pls+xml"));
                            array.addWithZPairNoCopy(new ZPair("ai", "application/postscript"));
                            array.addWithZPairNoCopy(new ZPair("cww", "application/prs.cww"));
                            array.addWithZPairNoCopy(new ZPair("pskcxml", "application/pskc+xml"));
                            array.addWithZPairNoCopy(new ZPair("rdf", "application/rdf+xml"));
                            array.addWithZPairNoCopy(new ZPair("rif", "application/reginfo+xml"));
                            array.addWithZPairNoCopy(
                                    new ZPair("rnc", "application/relax-ng-compact-syntax"));
                            array.addWithZPairNoCopy(
                                    new ZPair("rl", "application/resource-lists+xml"));
                            array.addWithZPairNoCopy(
                                    new ZPair("rld", "application/resource-lists-diff+xml"));
                            array.addWithZPairNoCopy(
                                    new ZPair("rs", "application/rls-services+xml"));
                            array.addWithZPairNoCopy(
                                    new ZPair("gbr", "application/rpki-ghostbusters"));
                            array.addWithZPairNoCopy(new ZPair("mft", "application/rpki-manifest"));
                            array.addWithZPairNoCopy(new ZPair("roa", "application/rpki-roa"));
                            array.addWithZPairNoCopy(new ZPair("rsd", "application/rsd+xml"));
                            array.addWithZPairNoCopy(new ZPair("rss", "application/rss+xml"));
                            array.addWithZPairNoCopy(new ZPair("sbml", "application/sbml+xml"));
                            array.addWithZPairNoCopy(
                                    new ZPair("scq", "application/scvp-cv-request"));
                            array.addWithZPairNoCopy(
                                    new ZPair("scs", "application/scvp-cv-response"));
                            array.addWithZPairNoCopy(
                                    new ZPair("spq", "application/scvp-vp-request"));
                            array.addWithZPairNoCopy(
                                    new ZPair("spp", "application/scvp-vp-response"));
                            array.addWithZPairNoCopy(new ZPair("sdp", "application/sdp"));
                            array.addWithZPairNoCopy(
                                    new ZPair("setpay", "application/set-payment-initiation"));
                            array.addWithZPairNoCopy(
                                    new ZPair("setreg", "application/set-registration-initiation"));
                            array.addWithZPairNoCopy(new ZPair("shf", "application/shf+xml"));
                            array.addWithZPairNoCopy(new ZPair("smi", "application/smil+xml"));
                            array.addWithZPairNoCopy(new ZPair("rq", "application/sparql-query"));
                            array.addWithZPairNoCopy(
                                    new ZPair("srx", "application/sparql-results+xml"));
                            array.addWithZPairNoCopy(new ZPair("gram", "application/srgs"));
                            array.addWithZPairNoCopy(new ZPair("grxml", "application/srgs+xml"));
                            array.addWithZPairNoCopy(new ZPair("sru", "application/sru+xml"));
                            array.addWithZPairNoCopy(new ZPair("ssdl", "application/ssdl+xml"));
                            array.addWithZPairNoCopy(new ZPair("ssml", "application/ssml+xml"));
                            array.addWithZPairNoCopy(new ZPair("tei", "application/tei+xml"));
                            array.addWithZPairNoCopy(new ZPair("tfi", "application/thraud+xml"));
                            array.addWithZPairNoCopy(
                                    new ZPair("tsd", "application/timestamped-data"));
                            array.addWithZPairNoCopy(
                                    new ZPair("plb", "application/vnd.3gpp.pic-bw-large"));
                            array.addWithZPairNoCopy(
                                    new ZPair("psb", "application/vnd.3gpp.pic-bw-small"));
                            array.addWithZPairNoCopy(
                                    new ZPair("pvb", "application/vnd.3gpp.pic-bw-var"));
                            array.addWithZPairNoCopy(
                                    new ZPair("tcap", "application/vnd.3gpp2.tcap"));
                            array.addWithZPairNoCopy(
                                    new ZPair("pwn", "application/vnd.3m.post-it-notes"));
                            array.addWithZPairNoCopy(
                                    new ZPair("aso", "application/vnd.accpac.simply.aso"));
                            array.addWithZPairNoCopy(
                                    new ZPair("imp", "application/vnd.accpac.simply.imp"));
                            array.addWithZPairNoCopy(new ZPair("acu", "application/vnd.acucobol"));
                            array.addWithZPairNoCopy(new ZPair("atc", "application/vnd.acucorp"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "air",
                                            "application/vnd.adobe.air-application-installer-package+zip"));
                            array.addWithZPairNoCopy(
                                    new ZPair("fcdt", "application/vnd.adobe.formscentral.fcdt"));
                            array.addWithZPairNoCopy(new ZPair("fxp", "application/vnd.adobe.fxp"));
                            array.addWithZPairNoCopy(
                                    new ZPair("xdp", "application/vnd.adobe.xdp+xml"));
                            array.addWithZPairNoCopy(
                                    new ZPair("xfdf", "application/vnd.adobe.xfdf"));
                            array.addWithZPairNoCopy(
                                    new ZPair("ahead", "application/vnd.ahead.space"));
                            array.addWithZPairNoCopy(
                                    new ZPair("azf", "application/vnd.airzip.filesecure.azf"));
                            array.addWithZPairNoCopy(
                                    new ZPair("azs", "application/vnd.airzip.filesecure.azs"));
                            array.addWithZPairNoCopy(
                                    new ZPair("azw", "application/vnd.amazon.ebook"));
                            array.addWithZPairNoCopy(
                                    new ZPair("acc", "application/vnd.americandynamics.acc"));
                            array.addWithZPairNoCopy(new ZPair("ami", "application/vnd.amiga.ami"));
                            array.addWithZPairNoCopy(
                                    new ZPair("apk", "application/vnd.android.package-archive"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "cii",
                                            "application/vnd.anser-web-certificate-issue-initiation"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "fti",
                                            "application/vnd.anser-web-funds-transfer-initiation"));
                            array.addWithZPairNoCopy(
                                    new ZPair("atx", "application/vnd.antix.game-component"));
                            array.addWithZPairNoCopy(
                                    new ZPair("mpkg", "application/vnd.apple.installer+xml"));
                            array.addWithZPairNoCopy(
                                    new ZPair("m3u8", "application/vnd.apple.mpegurl"));
                            array.addWithZPairNoCopy(
                                    new ZPair("swi", "application/vnd.aristanetworks.swi"));
                            array.addWithZPairNoCopy(
                                    new ZPair("iota", "application/vnd.astraea-software.iota"));
                            array.addWithZPairNoCopy(
                                    new ZPair("aep", "application/vnd.audiograph"));
                            array.addWithZPairNoCopy(
                                    new ZPair("mpm", "application/vnd.blueice.multipass"));
                            array.addWithZPairNoCopy(new ZPair("bmi", "application/vnd.bmi"));
                            array.addWithZPairNoCopy(
                                    new ZPair("rep", "application/vnd.businessobjects"));
                            array.addWithZPairNoCopy(
                                    new ZPair("cdxml", "application/vnd.chemdraw+xml"));
                            array.addWithZPairNoCopy(
                                    new ZPair("mmd", "application/vnd.chipnuts.karaoke-mmd"));
                            array.addWithZPairNoCopy(
                                    new ZPair("cdy", "application/vnd.cinderella"));
                            array.addWithZPairNoCopy(new ZPair("cla", "application/vnd.claymore"));
                            array.addWithZPairNoCopy(
                                    new ZPair("rp9", "application/vnd.cloanto.rp9"));
                            array.addWithZPairNoCopy(
                                    new ZPair("c4g", "application/vnd.clonk.c4group"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "c11amc",
                                            "application/vnd.cluetrust.cartomobile-config"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "c11amz",
                                            "application/vnd.cluetrust.cartomobile-config-pkg"));
                            array.addWithZPairNoCopy(
                                    new ZPair("csp", "application/vnd.commonspace"));
                            array.addWithZPairNoCopy(
                                    new ZPair("cdbcmsg", "application/vnd.contact.cmsg"));
                            array.addWithZPairNoCopy(
                                    new ZPair("cmc", "application/vnd.cosmocaller"));
                            array.addWithZPairNoCopy(
                                    new ZPair("clkx", "application/vnd.crick.clicker"));
                            array.addWithZPairNoCopy(
                                    new ZPair("clkk", "application/vnd.crick.clicker.keyboard"));
                            array.addWithZPairNoCopy(
                                    new ZPair("clkp", "application/vnd.crick.clicker.palette"));
                            array.addWithZPairNoCopy(
                                    new ZPair("clkt", "application/vnd.crick.clicker.template"));
                            array.addWithZPairNoCopy(
                                    new ZPair("clkw", "application/vnd.crick.clicker.wordbank"));
                            array.addWithZPairNoCopy(
                                    new ZPair("wbs", "application/vnd.criticaltools.wbs+xml"));
                            array.addWithZPairNoCopy(new ZPair("pml", "application/vnd.ctc-posml"));
                            array.addWithZPairNoCopy(new ZPair("ppd", "application/vnd.cups-ppd"));
                            array.addWithZPairNoCopy(new ZPair("car", "application/vnd.curl.car"));
                            array.addWithZPairNoCopy(
                                    new ZPair("pcurl", "application/vnd.curl.pcurl"));
                            array.addWithZPairNoCopy(new ZPair("dart", "application/vnd.dart"));
                            array.addWithZPairNoCopy(
                                    new ZPair("rdz", "application/vnd.data-vision.rdz"));
                            array.addWithZPairNoCopy(new ZPair("uvf", "application/vnd.dece.data"));
                            array.addWithZPairNoCopy(
                                    new ZPair("uvt", "application/vnd.dece.ttml+xml"));
                            array.addWithZPairNoCopy(
                                    new ZPair("uvx", "application/vnd.dece.unspecified"));
                            array.addWithZPairNoCopy(new ZPair("uvz", "application/vnd.dece.zip"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "fe_launch", "application/vnd.denovo.fcselayout-link"));
                            array.addWithZPairNoCopy(new ZPair("dna", "application/vnd.dna"));
                            array.addWithZPairNoCopy(new ZPair("mlp", "application/vnd.dolby.mlp"));
                            array.addWithZPairNoCopy(new ZPair("dpg", "application/vnd.dpgraph"));
                            array.addWithZPairNoCopy(
                                    new ZPair("dfac", "application/vnd.dreamfactory"));
                            array.addWithZPairNoCopy(
                                    new ZPair("kpxx", "application/vnd.ds-keypoint"));
                            array.addWithZPairNoCopy(new ZPair("ait", "application/vnd.dvb.ait"));
                            array.addWithZPairNoCopy(
                                    new ZPair("svc", "application/vnd.dvb.service"));
                            array.addWithZPairNoCopy(new ZPair("geo", "application/vnd.dynageo"));
                            array.addWithZPairNoCopy(
                                    new ZPair("mag", "application/vnd.ecowin.chart"));
                            array.addWithZPairNoCopy(new ZPair("nml", "application/vnd.enliven"));
                            array.addWithZPairNoCopy(new ZPair("esf", "application/vnd.epson.esf"));
                            array.addWithZPairNoCopy(new ZPair("msf", "application/vnd.epson.msf"));
                            array.addWithZPairNoCopy(
                                    new ZPair("qam", "application/vnd.epson.quickanime"));
                            array.addWithZPairNoCopy(
                                    new ZPair("slt", "application/vnd.epson.salt"));
                            array.addWithZPairNoCopy(new ZPair("ssf", "application/vnd.epson.ssf"));
                            array.addWithZPairNoCopy(
                                    new ZPair("es3", "application/vnd.eszigno3+xml"));
                            array.addWithZPairNoCopy(
                                    new ZPair("ez2", "application/vnd.ezpix-album"));
                            array.addWithZPairNoCopy(
                                    new ZPair("ez3", "application/vnd.ezpix-package"));
                            array.addWithZPairNoCopy(new ZPair("fdf", "application/vnd.fdf"));
                            array.addWithZPairNoCopy(
                                    new ZPair("mseed", "application/vnd.fdsn.mseed"));
                            array.addWithZPairNoCopy(
                                    new ZPair("seed", "application/vnd.fdsn.seed"));
                            array.addWithZPairNoCopy(
                                    new ZPair("gph", "application/vnd.flographit"));
                            array.addWithZPairNoCopy(
                                    new ZPair("ftc", "application/vnd.fluxtime.clip"));
                            array.addWithZPairNoCopy(new ZPair("fm", "application/vnd.framemaker"));
                            array.addWithZPairNoCopy(
                                    new ZPair("fnc", "application/vnd.frogans.fnc"));
                            array.addWithZPairNoCopy(
                                    new ZPair("ltf", "application/vnd.frogans.ltf"));
                            array.addWithZPairNoCopy(
                                    new ZPair("fsc", "application/vnd.fsc.weblaunch"));
                            array.addWithZPairNoCopy(
                                    new ZPair("oas", "application/vnd.fujitsu.oasys"));
                            array.addWithZPairNoCopy(
                                    new ZPair("oa2", "application/vnd.fujitsu.oasys2"));
                            array.addWithZPairNoCopy(
                                    new ZPair("oa3", "application/vnd.fujitsu.oasys3"));
                            array.addWithZPairNoCopy(
                                    new ZPair("fg5", "application/vnd.fujitsu.oasysgp"));
                            array.addWithZPairNoCopy(
                                    new ZPair("bh2", "application/vnd.fujitsu.oasysprs"));
                            array.addWithZPairNoCopy(
                                    new ZPair("ddd", "application/vnd.fujixerox.ddd"));
                            array.addWithZPairNoCopy(
                                    new ZPair("xdw", "application/vnd.fujixerox.docuworks"));
                            array.addWithZPairNoCopy(
                                    new ZPair("xbd", "application/vnd.fujixerox.docuworks.binder"));
                            array.addWithZPairNoCopy(
                                    new ZPair("fzs", "application/vnd.fuzzysheet"));
                            array.addWithZPairNoCopy(
                                    new ZPair("txd", "application/vnd.genomatix.tuxedo"));
                            array.addWithZPairNoCopy(
                                    new ZPair("ggb", "application/vnd.geogebra.file"));
                            array.addWithZPairNoCopy(
                                    new ZPair("ggt", "application/vnd.geogebra.tool"));
                            array.addWithZPairNoCopy(
                                    new ZPair("gex", "application/vnd.geometry-explorer"));
                            array.addWithZPairNoCopy(new ZPair("gxt", "application/vnd.geonext"));
                            array.addWithZPairNoCopy(new ZPair("g2w", "application/vnd.geoplan"));
                            array.addWithZPairNoCopy(new ZPair("g3w", "application/vnd.geospace"));
                            array.addWithZPairNoCopy(new ZPair("gmx", "application/vnd.gmx"));
                            array.addWithZPairNoCopy(
                                    new ZPair("kml", "application/vnd.google-earth.kml+xml"));
                            array.addWithZPairNoCopy(
                                    new ZPair("kmz", "application/vnd.google-earth.kmz"));
                            array.addWithZPairNoCopy(new ZPair("gqf", "application/vnd.grafeq"));
                            array.addWithZPairNoCopy(
                                    new ZPair("gac", "application/vnd.groove-account"));
                            array.addWithZPairNoCopy(
                                    new ZPair("ghf", "application/vnd.groove-help"));
                            array.addWithZPairNoCopy(
                                    new ZPair("gim", "application/vnd.groove-identity-message"));
                            array.addWithZPairNoCopy(
                                    new ZPair("grv", "application/vnd.groove-injector"));
                            array.addWithZPairNoCopy(
                                    new ZPair("gtm", "application/vnd.groove-tool-message"));
                            array.addWithZPairNoCopy(
                                    new ZPair("tpl", "application/vnd.groove-tool-template"));
                            array.addWithZPairNoCopy(
                                    new ZPair("vcg", "application/vnd.groove-vcard"));
                            array.addWithZPairNoCopy(new ZPair("hal", "application/vnd.hal+xml"));
                            array.addWithZPairNoCopy(
                                    new ZPair("zmm", "application/vnd.handheld-entertainment+xml"));
                            array.addWithZPairNoCopy(new ZPair("hbci", "application/vnd.hbci"));
                            array.addWithZPairNoCopy(
                                    new ZPair("les", "application/vnd.hhe.lesson-player"));
                            array.addWithZPairNoCopy(new ZPair("hpgl", "application/vnd.hp-hpgl"));
                            array.addWithZPairNoCopy(new ZPair("hpid", "application/vnd.hp-hpid"));
                            array.addWithZPairNoCopy(new ZPair("hps", "application/vnd.hp-hps"));
                            array.addWithZPairNoCopy(new ZPair("jlt", "application/vnd.hp-jlyt"));
                            array.addWithZPairNoCopy(new ZPair("pcl", "application/vnd.hp-pcl"));
                            array.addWithZPairNoCopy(
                                    new ZPair("pclxl", "application/vnd.hp-pclxl"));
                            array.addWithZPairNoCopy(
                                    new ZPair("sfd-hdstx", "application/vnd.hydrostatix.sof-data"));
                            array.addWithZPairNoCopy(
                                    new ZPair("mpy", "application/vnd.ibm.minipay"));
                            array.addWithZPairNoCopy(
                                    new ZPair("afp", "application/vnd.ibm.modcap"));
                            array.addWithZPairNoCopy(
                                    new ZPair("irm", "application/vnd.ibm.rights-management"));
                            array.addWithZPairNoCopy(
                                    new ZPair("sc", "application/vnd.ibm.secure-container"));
                            array.addWithZPairNoCopy(
                                    new ZPair("icc", "application/vnd.iccprofile"));
                            array.addWithZPairNoCopy(new ZPair("igl", "application/vnd.igloader"));
                            array.addWithZPairNoCopy(
                                    new ZPair("ivp", "application/vnd.immervision-ivp"));
                            array.addWithZPairNoCopy(
                                    new ZPair("ivu", "application/vnd.immervision-ivu"));
                            array.addWithZPairNoCopy(
                                    new ZPair("igm", "application/vnd.insors.igm"));
                            array.addWithZPairNoCopy(
                                    new ZPair("xpw", "application/vnd.intercon.formnet"));
                            array.addWithZPairNoCopy(new ZPair("i2g", "application/vnd.intergeo"));
                            array.addWithZPairNoCopy(new ZPair("qbo", "application/vnd.intu.qbo"));
                            array.addWithZPairNoCopy(new ZPair("qfx", "application/vnd.intu.qfx"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "rcprofile", "application/vnd.ipunplugged.rcprofile"));
                            array.addWithZPairNoCopy(
                                    new ZPair("irp", "application/vnd.irepository.package+xml"));
                            array.addWithZPairNoCopy(new ZPair("xpr", "application/vnd.is-xpr"));
                            array.addWithZPairNoCopy(new ZPair("fcs", "application/vnd.isac.fcs"));
                            array.addWithZPairNoCopy(new ZPair("jam", "application/vnd.jam"));
                            array.addWithZPairNoCopy(
                                    new ZPair("rms", "application/vnd.jcp.javame.midlet-rms"));
                            array.addWithZPairNoCopy(new ZPair("jisp", "application/vnd.jisp"));
                            array.addWithZPairNoCopy(
                                    new ZPair("joda", "application/vnd.joost.joda-archive"));
                            array.addWithZPairNoCopy(new ZPair("ktz", "application/vnd.kahootz"));
                            array.addWithZPairNoCopy(
                                    new ZPair("karbon", "application/vnd.kde.karbon"));
                            array.addWithZPairNoCopy(
                                    new ZPair("chrt", "application/vnd.kde.kchart"));
                            array.addWithZPairNoCopy(
                                    new ZPair("kfo", "application/vnd.kde.kformula"));
                            array.addWithZPairNoCopy(new ZPair("flw", "application/vnd.kde.kivio"));
                            array.addWithZPairNoCopy(
                                    new ZPair("kon", "application/vnd.kde.kontour"));
                            array.addWithZPairNoCopy(
                                    new ZPair("kpr", "application/vnd.kde.kpresenter"));
                            array.addWithZPairNoCopy(
                                    new ZPair("ksp", "application/vnd.kde.kspread"));
                            array.addWithZPairNoCopy(new ZPair("kwd", "application/vnd.kde.kword"));
                            array.addWithZPairNoCopy(
                                    new ZPair("htke", "application/vnd.kenameaapp"));
                            array.addWithZPairNoCopy(
                                    new ZPair("kia", "application/vnd.kidspiration"));
                            array.addWithZPairNoCopy(new ZPair("kne", "application/vnd.kinar"));
                            array.addWithZPairNoCopy(new ZPair("skp", "application/vnd.koan"));
                            array.addWithZPairNoCopy(
                                    new ZPair("sse", "application/vnd.kodak-descriptor"));
                            array.addWithZPairNoCopy(
                                    new ZPair("lasxml", "application/vnd.las.las+xml"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "lbd",
                                            "application/vnd.llamagraphics.life-balance.desktop"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "lbe",
                                            "application/vnd.llamagraphics.life-balance.exchange+xml"));
                            array.addWithZPairNoCopy(
                                    new ZPair("123", "application/vnd.lotus-1-2-3"));
                            array.addWithZPairNoCopy(
                                    new ZPair("apr", "application/vnd.lotus-approach"));
                            array.addWithZPairNoCopy(
                                    new ZPair("pre", "application/vnd.lotus-freelance"));
                            array.addWithZPairNoCopy(
                                    new ZPair("nsf", "application/vnd.lotus-notes"));
                            array.addWithZPairNoCopy(
                                    new ZPair("org", "application/vnd.lotus-organizer"));
                            array.addWithZPairNoCopy(
                                    new ZPair("scm", "application/vnd.lotus-screencam"));
                            array.addWithZPairNoCopy(
                                    new ZPair("lwp", "application/vnd.lotus-wordpro"));
                            array.addWithZPairNoCopy(
                                    new ZPair("portpkg", "application/vnd.macports.portpkg"));
                            array.addWithZPairNoCopy(new ZPair("mcd", "application/vnd.mcd"));
                            array.addWithZPairNoCopy(
                                    new ZPair("mc1", "application/vnd.medcalcdata"));
                            array.addWithZPairNoCopy(
                                    new ZPair("cdkey", "application/vnd.mediastation.cdkey"));
                            array.addWithZPairNoCopy(new ZPair("mwf", "application/vnd.mfer"));
                            array.addWithZPairNoCopy(new ZPair("mfm", "application/vnd.mfmp"));
                            array.addWithZPairNoCopy(
                                    new ZPair("flo", "application/vnd.micrografx.flo"));
                            array.addWithZPairNoCopy(
                                    new ZPair("igx", "application/vnd.micrografx.igx"));
                            array.addWithZPairNoCopy(new ZPair("mif", "application/vnd.mif"));
                            array.addWithZPairNoCopy(
                                    new ZPair("daf", "application/vnd.mobius.daf"));
                            array.addWithZPairNoCopy(
                                    new ZPair("dis", "application/vnd.mobius.dis"));
                            array.addWithZPairNoCopy(
                                    new ZPair("mbk", "application/vnd.mobius.mbk"));
                            array.addWithZPairNoCopy(
                                    new ZPair("mqy", "application/vnd.mobius.mqy"));
                            array.addWithZPairNoCopy(
                                    new ZPair("msl", "application/vnd.mobius.msl"));
                            array.addWithZPairNoCopy(
                                    new ZPair("plc", "application/vnd.mobius.plc"));
                            array.addWithZPairNoCopy(
                                    new ZPair("txf", "application/vnd.mobius.txf"));
                            array.addWithZPairNoCopy(
                                    new ZPair("mpn", "application/vnd.mophun.application"));
                            array.addWithZPairNoCopy(
                                    new ZPair("mpc", "application/vnd.mophun.certificate"));
                            array.addWithZPairNoCopy(
                                    new ZPair("xul", "application/vnd.mozilla.xul+xml"));
                            array.addWithZPairNoCopy(
                                    new ZPair("cil", "application/vnd.ms-artgalry"));
                            array.addWithZPairNoCopy(
                                    new ZPair("cab", "application/vnd.ms-cab-compressed"));
                            array.addWithZPairNoCopy(new ZPair("xls", "application/vnd.ms-excel"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "xlam",
                                            "application/vnd.ms-excel.addin.macroenabled.12"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "xlsb",
                                            "application/vnd.ms-excel.sheet.binary.macroenabled.12"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "xlsm",
                                            "application/vnd.ms-excel.sheet.macroenabled.12"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "xltm",
                                            "application/vnd.ms-excel.template.macroenabled.12"));
                            array.addWithZPairNoCopy(
                                    new ZPair("eot", "application/vnd.ms-fontobject"));
                            array.addWithZPairNoCopy(
                                    new ZPair("chm", "application/vnd.ms-htmlhelp"));
                            array.addWithZPairNoCopy(new ZPair("ims", "application/vnd.ms-ims"));
                            array.addWithZPairNoCopy(new ZPair("lrm", "application/vnd.ms-lrm"));
                            array.addWithZPairNoCopy(
                                    new ZPair("thmx", "application/vnd.ms-officetheme"));
                            array.addWithZPairNoCopy(
                                    new ZPair("cat", "application/vnd.ms-pki.seccat"));
                            array.addWithZPairNoCopy(
                                    new ZPair("stl", "application/vnd.ms-pki.stl"));
                            array.addWithZPairNoCopy(
                                    new ZPair("ppt", "application/vnd.ms-powerpoint"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "ppam",
                                            "application/vnd.ms-powerpoint.addin.macroenabled.12"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "pptm",
                                            "application/vnd.ms-powerpoint.presentation.macroenabled.12"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "sldm",
                                            "application/vnd.ms-powerpoint.slide.macroenabled.12"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "ppsm",
                                            "application/vnd.ms-powerpoint.slideshow.macroenabled.12"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "potm",
                                            "application/vnd.ms-powerpoint.template.macroenabled.12"));
                            array.addWithZPairNoCopy(
                                    new ZPair("mpp", "application/vnd.ms-project"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "docm",
                                            "application/vnd.ms-word.document.macroenabled.12"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "dotm",
                                            "application/vnd.ms-word.template.macroenabled.12"));
                            array.addWithZPairNoCopy(new ZPair("wps", "application/vnd.ms-works"));
                            array.addWithZPairNoCopy(new ZPair("wpl", "application/vnd.ms-wpl"));
                            array.addWithZPairNoCopy(
                                    new ZPair("xps", "application/vnd.ms-xpsdocument"));
                            array.addWithZPairNoCopy(new ZPair("mseq", "application/vnd.mseq"));
                            array.addWithZPairNoCopy(new ZPair("mus", "application/vnd.musician"));
                            array.addWithZPairNoCopy(
                                    new ZPair("msty", "application/vnd.muvee.style"));
                            array.addWithZPairNoCopy(new ZPair("taglet", "application/vnd.mynfc"));
                            array.addWithZPairNoCopy(
                                    new ZPair("nlu", "application/vnd.neurolanguage.nlu"));
                            array.addWithZPairNoCopy(new ZPair("ntf", "application/vnd.nitf"));
                            array.addWithZPairNoCopy(
                                    new ZPair("nnd", "application/vnd.noblenet-directory"));
                            array.addWithZPairNoCopy(
                                    new ZPair("nns", "application/vnd.noblenet-sealer"));
                            array.addWithZPairNoCopy(
                                    new ZPair("nnw", "application/vnd.noblenet-web"));
                            array.addWithZPairNoCopy(
                                    new ZPair("ngdat", "application/vnd.nokia.n-gage.data"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "n-gage",
                                            "application/vnd.nokia.n-gage.symbian.install"));
                            array.addWithZPairNoCopy(
                                    new ZPair("rpst", "application/vnd.nokia.radio-preset"));
                            array.addWithZPairNoCopy(
                                    new ZPair("rpss", "application/vnd.nokia.radio-presets"));
                            array.addWithZPairNoCopy(
                                    new ZPair("edm", "application/vnd.novadigm.edm"));
                            array.addWithZPairNoCopy(
                                    new ZPair("edx", "application/vnd.novadigm.edx"));
                            array.addWithZPairNoCopy(
                                    new ZPair("ext", "application/vnd.novadigm.ext"));
                            array.addWithZPairNoCopy(
                                    new ZPair("odc", "application/vnd.oasis.opendocument.chart"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "otc",
                                            "application/vnd.oasis.opendocument.chart-template"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "odb", "application/vnd.oasis.opendocument.database"));
                            array.addWithZPairNoCopy(
                                    new ZPair("odf", "application/vnd.oasis.opendocument.formula"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "odft",
                                            "application/vnd.oasis.opendocument.formula-template"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "odg", "application/vnd.oasis.opendocument.graphics"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "otg",
                                            "application/vnd.oasis.opendocument.graphics-template"));
                            array.addWithZPairNoCopy(
                                    new ZPair("odi", "application/vnd.oasis.opendocument.image"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "oti",
                                            "application/vnd.oasis.opendocument.image-template"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "odp",
                                            "application/vnd.oasis.opendocument.presentation"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "otp",
                                            "application/vnd.oasis.opendocument.presentation-template"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "ods",
                                            "application/vnd.oasis.opendocument.spreadsheet"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "ots",
                                            "application/vnd.oasis.opendocument.spreadsheet-template"));
                            array.addWithZPairNoCopy(
                                    new ZPair("odt", "application/vnd.oasis.opendocument.text"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "odm",
                                            "application/vnd.oasis.opendocument.text-master"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "ott",
                                            "application/vnd.oasis.opendocument.text-template"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "oth", "application/vnd.oasis.opendocument.text-web"));
                            array.addWithZPairNoCopy(new ZPair("xo", "application/vnd.olpc-sugar"));
                            array.addWithZPairNoCopy(
                                    new ZPair("dd2", "application/vnd.oma.dd2+xml"));
                            array.addWithZPairNoCopy(
                                    new ZPair("oxt", "application/vnd.openofficeorg.extension"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "pptx",
                                            "application/vnd.openxmlformats-officedocument.presentationml.presentation"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "sldx",
                                            "application/vnd.openxmlformats-officedocument.presentationml.slide"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "ppsx",
                                            "application/vnd.openxmlformats-officedocument.presentationml.slideshow"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "potx",
                                            "application/vnd.openxmlformats-officedocument.presentationml.template"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "xlsx",
                                            "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "xltx",
                                            "application/vnd.openxmlformats-officedocument.spreadsheetml.template"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "docx",
                                            "application/vnd.openxmlformats-officedocument.wordprocessingml.document"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "dotx",
                                            "application/vnd.openxmlformats-officedocument.wordprocessingml.template"));
                            array.addWithZPairNoCopy(
                                    new ZPair("mgp", "application/vnd.osgeo.mapguide.package"));
                            array.addWithZPairNoCopy(new ZPair("dp", "application/vnd.osgi.dp"));
                            array.addWithZPairNoCopy(
                                    new ZPair("esa", "application/vnd.osgi.subsystem"));
                            array.addWithZPairNoCopy(new ZPair("pdb", "application/vnd.palm"));
                            array.addWithZPairNoCopy(new ZPair("paw", "application/vnd.pawaafile"));
                            array.addWithZPairNoCopy(new ZPair("str", "application/vnd.pg.format"));
                            array.addWithZPairNoCopy(new ZPair("ei6", "application/vnd.pg.osasli"));
                            array.addWithZPairNoCopy(new ZPair("efif", "application/vnd.picsel"));
                            array.addWithZPairNoCopy(new ZPair("wg", "application/vnd.pmi.widget"));
                            array.addWithZPairNoCopy(
                                    new ZPair("plf", "application/vnd.pocketlearn"));
                            array.addWithZPairNoCopy(
                                    new ZPair("pbd", "application/vnd.powerbuilder6"));
                            array.addWithZPairNoCopy(
                                    new ZPair("box", "application/vnd.previewsystems.box"));
                            array.addWithZPairNoCopy(
                                    new ZPair("mgz", "application/vnd.proteus.magazine"));
                            array.addWithZPairNoCopy(
                                    new ZPair("qps", "application/vnd.publishare-delta-tree"));
                            array.addWithZPairNoCopy(
                                    new ZPair("ptid", "application/vnd.pvi.ptid1"));
                            array.addWithZPairNoCopy(
                                    new ZPair("qxd", "application/vnd.quark.quarkxpress"));
                            array.addWithZPairNoCopy(
                                    new ZPair("bed", "application/vnd.realvnc.bed"));
                            array.addWithZPairNoCopy(
                                    new ZPair("mxl", "application/vnd.recordare.musicxml"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "musicxml", "application/vnd.recordare.musicxml+xml"));
                            array.addWithZPairNoCopy(
                                    new ZPair("cryptonote", "application/vnd.rig.cryptonote"));
                            array.addWithZPairNoCopy(new ZPair("cod", "application/vnd.rim.cod"));
                            array.addWithZPairNoCopy(
                                    new ZPair("rm", "application/vnd.rn-realmedia"));
                            array.addWithZPairNoCopy(
                                    new ZPair("rmvb", "application/vnd.rn-realmedia-vbr"));
                            array.addWithZPairNoCopy(
                                    new ZPair("link66", "application/vnd.route66.link66+xml"));
                            array.addWithZPairNoCopy(
                                    new ZPair("st", "application/vnd.sailingtracker.track"));
                            array.addWithZPairNoCopy(new ZPair("see", "application/vnd.seemail"));
                            array.addWithZPairNoCopy(new ZPair("sema", "application/vnd.sema"));
                            array.addWithZPairNoCopy(new ZPair("semd", "application/vnd.semd"));
                            array.addWithZPairNoCopy(new ZPair("semf", "application/vnd.semf"));
                            array.addWithZPairNoCopy(
                                    new ZPair("ifm", "application/vnd.shana.informed.formdata"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "itp", "application/vnd.shana.informed.formtemplate"));
                            array.addWithZPairNoCopy(
                                    new ZPair("iif", "application/vnd.shana.informed.interchange"));
                            array.addWithZPairNoCopy(
                                    new ZPair("ipk", "application/vnd.shana.informed.package"));
                            array.addWithZPairNoCopy(
                                    new ZPair("twd", "application/vnd.simtech-mindmapper"));
                            array.addWithZPairNoCopy(new ZPair("mmf", "application/vnd.smaf"));
                            array.addWithZPairNoCopy(
                                    new ZPair("teacher", "application/vnd.smart.teacher"));
                            array.addWithZPairNoCopy(
                                    new ZPair("sdkm", "application/vnd.solent.sdkm+xml"));
                            array.addWithZPairNoCopy(
                                    new ZPair("dxp", "application/vnd.spotfire.dxp"));
                            array.addWithZPairNoCopy(
                                    new ZPair("sfs", "application/vnd.spotfire.sfs"));
                            array.addWithZPairNoCopy(
                                    new ZPair("sdc", "application/vnd.stardivision.calc"));
                            array.addWithZPairNoCopy(
                                    new ZPair("sda", "application/vnd.stardivision.draw"));
                            array.addWithZPairNoCopy(
                                    new ZPair("sdd", "application/vnd.stardivision.impress"));
                            array.addWithZPairNoCopy(
                                    new ZPair("smf", "application/vnd.stardivision.math"));
                            array.addWithZPairNoCopy(
                                    new ZPair("sdw", "application/vnd.stardivision.writer"));
                            array.addWithZPairNoCopy(
                                    new ZPair("sgl", "application/vnd.stardivision.writer-global"));
                            array.addWithZPairNoCopy(
                                    new ZPair("smzip", "application/vnd.stepmania.package"));
                            array.addWithZPairNoCopy(
                                    new ZPair("sm", "application/vnd.stepmania.stepchart"));
                            array.addWithZPairNoCopy(
                                    new ZPair("sxc", "application/vnd.sun.xml.calc"));
                            array.addWithZPairNoCopy(
                                    new ZPair("stc", "application/vnd.sun.xml.calc.template"));
                            array.addWithZPairNoCopy(
                                    new ZPair("sxd", "application/vnd.sun.xml.draw"));
                            array.addWithZPairNoCopy(
                                    new ZPair("std", "application/vnd.sun.xml.draw.template"));
                            array.addWithZPairNoCopy(
                                    new ZPair("sxi", "application/vnd.sun.xml.impress"));
                            array.addWithZPairNoCopy(
                                    new ZPair("sti", "application/vnd.sun.xml.impress.template"));
                            array.addWithZPairNoCopy(
                                    new ZPair("sxm", "application/vnd.sun.xml.math"));
                            array.addWithZPairNoCopy(
                                    new ZPair("sxw", "application/vnd.sun.xml.writer"));
                            array.addWithZPairNoCopy(
                                    new ZPair("sxg", "application/vnd.sun.xml.writer.global"));
                            array.addWithZPairNoCopy(
                                    new ZPair("stw", "application/vnd.sun.xml.writer.template"));
                            array.addWithZPairNoCopy(
                                    new ZPair("sus", "application/vnd.sus-calendar"));
                            array.addWithZPairNoCopy(new ZPair("svd", "application/vnd.svd"));
                            array.addWithZPairNoCopy(
                                    new ZPair("sis", "application/vnd.symbian.install"));
                            array.addWithZPairNoCopy(
                                    new ZPair("xsm", "application/vnd.syncml+xml"));
                            array.addWithZPairNoCopy(
                                    new ZPair("bdm", "application/vnd.syncml.dm+wbxml"));
                            array.addWithZPairNoCopy(
                                    new ZPair("xdm", "application/vnd.syncml.dm+xml"));
                            array.addWithZPairNoCopy(
                                    new ZPair("tao", "application/vnd.tao.intent-module-archive"));
                            array.addWithZPairNoCopy(
                                    new ZPair("pcap", "application/vnd.tcpdump.pcap"));
                            array.addWithZPairNoCopy(
                                    new ZPair("tmo", "application/vnd.tmobile-livetv"));
                            array.addWithZPairNoCopy(new ZPair("tpt", "application/vnd.trid.tpt"));
                            array.addWithZPairNoCopy(
                                    new ZPair("mxs", "application/vnd.triscape.mxs"));
                            array.addWithZPairNoCopy(new ZPair("tra", "application/vnd.trueapp"));
                            array.addWithZPairNoCopy(new ZPair("ufd", "application/vnd.ufdl"));
                            array.addWithZPairNoCopy(new ZPair("utz", "application/vnd.uiq.theme"));
                            array.addWithZPairNoCopy(new ZPair("umj", "application/vnd.umajin"));
                            array.addWithZPairNoCopy(
                                    new ZPair("unityweb", "application/vnd.unity"));
                            array.addWithZPairNoCopy(new ZPair("uoml", "application/vnd.uoml+xml"));
                            array.addWithZPairNoCopy(new ZPair("vcx", "application/vnd.vcx"));
                            array.addWithZPairNoCopy(new ZPair("vsd", "application/vnd.visio"));
                            array.addWithZPairNoCopy(new ZPair("vis", "application/vnd.visionary"));
                            array.addWithZPairNoCopy(new ZPair("vsf", "application/vnd.vsf"));
                            array.addWithZPairNoCopy(
                                    new ZPair("wbxml", "application/vnd.wap.wbxml"));
                            array.addWithZPairNoCopy(new ZPair("wmlc", "application/vnd.wap.wmlc"));
                            array.addWithZPairNoCopy(
                                    new ZPair("wmlsc", "application/vnd.wap.wmlscriptc"));
                            array.addWithZPairNoCopy(new ZPair("wtb", "application/vnd.webturbo"));
                            array.addWithZPairNoCopy(
                                    new ZPair("nbp", "application/vnd.wolfram.player"));
                            array.addWithZPairNoCopy(
                                    new ZPair("wpd", "application/vnd.wordperfect"));
                            array.addWithZPairNoCopy(new ZPair("wqd", "application/vnd.wqd"));
                            array.addWithZPairNoCopy(new ZPair("stf", "application/vnd.wt.stf"));
                            array.addWithZPairNoCopy(new ZPair("xar", "application/vnd.xara"));
                            array.addWithZPairNoCopy(new ZPair("xfdl", "application/vnd.xfdl"));
                            array.addWithZPairNoCopy(
                                    new ZPair("hvd", "application/vnd.yamaha.hv-dic"));
                            array.addWithZPairNoCopy(
                                    new ZPair("hvs", "application/vnd.yamaha.hv-script"));
                            array.addWithZPairNoCopy(
                                    new ZPair("hvp", "application/vnd.yamaha.hv-voice"));
                            array.addWithZPairNoCopy(
                                    new ZPair("osf", "application/vnd.yamaha.openscoreformat"));
                            array.addWithZPairNoCopy(
                                    new ZPair(
                                            "osfpvg",
                                            "application/vnd.yamaha.openscoreformat.osfpvg+xml"));
                            array.addWithZPairNoCopy(
                                    new ZPair("saf", "application/vnd.yamaha.smaf-audio"));
                            array.addWithZPairNoCopy(
                                    new ZPair("spf", "application/vnd.yamaha.smaf-phrase"));
                            array.addWithZPairNoCopy(
                                    new ZPair("cmp", "application/vnd.yellowriver-custom-menu"));
                            array.addWithZPairNoCopy(new ZPair("zir", "application/vnd.zul"));
                            array.addWithZPairNoCopy(
                                    new ZPair("zaz", "application/vnd.zzazz.deck+xml"));
                            array.addWithZPairNoCopy(new ZPair("vxml", "application/voicexml+xml"));
                            array.addWithZPairNoCopy(new ZPair("wgt", "application/widget"));
                            array.addWithZPairNoCopy(new ZPair("hlp", "application/winhlp"));
                            array.addWithZPairNoCopy(new ZPair("wsdl", "application/wsdl+xml"));
                            array.addWithZPairNoCopy(
                                    new ZPair("wspolicy", "application/wspolicy+xml"));
                            array.addWithZPairNoCopy(
                                    new ZPair("7z", "application/x-7z-compressed"));
                            array.addWithZPairNoCopy(new ZPair("abw", "application/x-abiword"));
                            array.addWithZPairNoCopy(
                                    new ZPair("ace", "application/x-ace-compressed"));
                            array.addWithZPairNoCopy(
                                    new ZPair("dmg", "application/x-apple-diskimage"));
                            array.addWithZPairNoCopy(
                                    new ZPair("aab", "application/x-authorware-bin"));
                            array.addWithZPairNoCopy(
                                    new ZPair("aam", "application/x-authorware-map"));
                            array.addWithZPairNoCopy(
                                    new ZPair("aas", "application/x-authorware-seg"));
                            array.addWithZPairNoCopy(new ZPair("bcpio", "application/x-bcpio"));
                            array.addWithZPairNoCopy(
                                    new ZPair("torrent", "application/x-bittorrent"));
                            array.addWithZPairNoCopy(new ZPair("blb", "application/x-blorb"));
                            array.addWithZPairNoCopy(new ZPair("bz", "application/x-bzip"));
                            array.addWithZPairNoCopy(new ZPair("bz2", "application/x-bzip2"));
                            array.addWithZPairNoCopy(new ZPair("cbr", "application/x-cbr"));
                            array.addWithZPairNoCopy(new ZPair("vcd", "application/x-cdlink"));
                            array.addWithZPairNoCopy(
                                    new ZPair("cfs", "application/x-cfs-compressed"));
                            array.addWithZPairNoCopy(new ZPair("chat", "application/x-chat"));
                            array.addWithZPairNoCopy(new ZPair("pgn", "application/x-chess-pgn"));
                            array.addWithZPairNoCopy(new ZPair("nsc", "application/x-conference"));
                            array.addWithZPairNoCopy(new ZPair("cpio", "application/x-cpio"));
                            array.addWithZPairNoCopy(new ZPair("csh", "application/x-csh"));
                            array.addWithZPairNoCopy(
                                    new ZPair("deb", "application/x-debian-package"));
                            array.addWithZPairNoCopy(
                                    new ZPair("dgc", "application/x-dgc-compressed"));
                            array.addWithZPairNoCopy(new ZPair("dir", "application/x-director"));
                            array.addWithZPairNoCopy(new ZPair("wad", "application/x-doom"));
                            array.addWithZPairNoCopy(new ZPair("ncx", "application/x-dtbncx+xml"));
                            array.addWithZPairNoCopy(new ZPair("dtb", "application/x-dtbook+xml"));
                            array.addWithZPairNoCopy(
                                    new ZPair("res", "application/x-dtbresource+xml"));
                            array.addWithZPairNoCopy(new ZPair("dvi", "application/x-dvi"));
                            array.addWithZPairNoCopy(new ZPair("evy", "application/x-envoy"));
                            array.addWithZPairNoCopy(new ZPair("eva", "application/x-eva"));
                            array.addWithZPairNoCopy(new ZPair("bdf", "application/x-font-bdf"));
                        },
                        (array) -> {
                            array.addWithZPairNoCopy(
                                    new ZPair("gsf", "application/x-font-ghostscript"));
                            array.addWithZPairNoCopy(
                                    new ZPair("psf", "application/x-font-linux-psf"));
                            array.addWithZPairNoCopy(new ZPair("otf", "application/x-font-otf"));
                            array.addWithZPairNoCopy(new ZPair("pcf", "application/x-font-pcf"));
                            array.addWithZPairNoCopy(new ZPair("snf", "application/x-font-snf"));
                            array.addWithZPairNoCopy(new ZPair("ttf", "application/x-font-ttf"));
                            array.addWithZPairNoCopy(new ZPair("pfa", "application/x-font-type1"));
                            array.addWithZPairNoCopy(new ZPair("woff", "application/x-font-woff"));
                            array.addWithZPairNoCopy(new ZPair("arc", "application/x-freearc"));
                            array.addWithZPairNoCopy(
                                    new ZPair("spl", "application/x-futuresplash"));
                            array.addWithZPairNoCopy(
                                    new ZPair("gca", "application/x-gca-compressed"));
                            array.addWithZPairNoCopy(new ZPair("ulx", "application/x-glulx"));
                            array.addWithZPairNoCopy(
                                    new ZPair("gnumeric", "application/x-gnumeric"));
                            array.addWithZPairNoCopy(
                                    new ZPair("gramps", "application/x-gramps-xml"));
                            array.addWithZPairNoCopy(new ZPair("gtar", "application/x-gtar"));
                            array.addWithZPairNoCopy(new ZPair("hdf", "application/x-hdf"));
                            array.addWithZPairNoCopy(
                                    new ZPair("install", "application/x-install-instructions"));
                            array.addWithZPairNoCopy(
                                    new ZPair("iso", "application/x-iso9660-image"));
                            array.addWithZPairNoCopy(
                                    new ZPair("jnlp", "application/x-java-jnlp-file"));
                            array.addWithZPairNoCopy(new ZPair("latex", "application/x-latex"));
                            array.addWithZPairNoCopy(
                                    new ZPair("lzh", "application/x-lzh-compressed"));
                            array.addWithZPairNoCopy(new ZPair("mie", "application/x-mie"));
                            array.addWithZPairNoCopy(
                                    new ZPair("prc", "application/x-mobipocket-ebook"));
                            array.addWithZPairNoCopy(
                                    new ZPair("application", "application/x-ms-application"));
                            array.addWithZPairNoCopy(new ZPair("lnk", "application/x-ms-shortcut"));
                            array.addWithZPairNoCopy(new ZPair("wmd", "application/x-ms-wmd"));
                            array.addWithZPairNoCopy(new ZPair("wmz", "application/x-ms-wmz"));
                            array.addWithZPairNoCopy(new ZPair("xbap", "application/x-ms-xbap"));
                            array.addWithZPairNoCopy(new ZPair("mdb", "application/x-msaccess"));
                            array.addWithZPairNoCopy(new ZPair("obd", "application/x-msbinder"));
                            array.addWithZPairNoCopy(new ZPair("crd", "application/x-mscardfile"));
                            array.addWithZPairNoCopy(new ZPair("clp", "application/x-msclip"));
                            array.addWithZPairNoCopy(new ZPair("exe", "application/x-msdownload"));
                            array.addWithZPairNoCopy(new ZPair("mvb", "application/x-msmediaview"));
                            array.addWithZPairNoCopy(new ZPair("wmf", "application/x-msmetafile"));
                            array.addWithZPairNoCopy(new ZPair("mny", "application/x-msmoney"));
                            array.addWithZPairNoCopy(new ZPair("pub", "application/x-mspublisher"));
                            array.addWithZPairNoCopy(new ZPair("scd", "application/x-msschedule"));
                            array.addWithZPairNoCopy(new ZPair("trm", "application/x-msterminal"));
                            array.addWithZPairNoCopy(new ZPair("wri", "application/x-mswrite"));
                            array.addWithZPairNoCopy(new ZPair("nc", "application/x-netcdf"));
                            array.addWithZPairNoCopy(new ZPair("nzb", "application/x-nzb"));
                            array.addWithZPairNoCopy(new ZPair("p12", "application/x-pkcs12"));
                            array.addWithZPairNoCopy(
                                    new ZPair("p7b", "application/x-pkcs7-certificates"));
                            array.addWithZPairNoCopy(
                                    new ZPair("p7r", "application/x-pkcs7-certreqresp"));
                            array.addWithZPairNoCopy(new ZPair("rar", "application/x-rar"));
                            array.addWithZPairNoCopy(
                                    new ZPair("ris", "application/x-research-info-systems"));
                            array.addWithZPairNoCopy(new ZPair("sh", "application/x-sh"));
                            array.addWithZPairNoCopy(new ZPair("shar", "application/x-shar"));
                            array.addWithZPairNoCopy(
                                    new ZPair("swf", "application/x-shockwave-flash"));
                            array.addWithZPairNoCopy(
                                    new ZPair("xap", "application/x-silverlight-app"));
                            array.addWithZPairNoCopy(new ZPair("sql", "application/x-sql"));
                            array.addWithZPairNoCopy(new ZPair("sit", "application/x-stuffit"));
                            array.addWithZPairNoCopy(new ZPair("sitx", "application/x-stuffitx"));
                            array.addWithZPairNoCopy(new ZPair("srt", "application/x-subrip"));
                            array.addWithZPairNoCopy(new ZPair("sv4cpio", "application/x-sv4cpio"));
                            array.addWithZPairNoCopy(new ZPair("sv4crc", "application/x-sv4crc"));
                            array.addWithZPairNoCopy(new ZPair("t3", "application/x-t3vm-image"));
                            array.addWithZPairNoCopy(new ZPair("gam", "application/x-tads"));
                            array.addWithZPairNoCopy(new ZPair("tar", "application/x-tar"));
                            array.addWithZPairNoCopy(new ZPair("tcl", "application/x-tcl"));
                            array.addWithZPairNoCopy(new ZPair("tex", "application/x-tex"));
                            array.addWithZPairNoCopy(new ZPair("tfm", "application/x-tex-tfm"));
                            array.addWithZPairNoCopy(new ZPair("texinfo", "application/x-texinfo"));
                            array.addWithZPairNoCopy(new ZPair("obj", "application/x-tgif"));
                            array.addWithZPairNoCopy(new ZPair("ustar", "application/x-ustar"));
                            array.addWithZPairNoCopy(new ZPair("src", "application/x-wais-source"));
                            array.addWithZPairNoCopy(
                                    new ZPair("der", "application/x-x509-ca-cert"));
                            array.addWithZPairNoCopy(new ZPair("fig", "application/x-xfig"));
                            array.addWithZPairNoCopy(new ZPair("xlf", "application/x-xliff+xml"));
                            array.addWithZPairNoCopy(new ZPair("xpi", "application/x-xpinstall"));
                            array.addWithZPairNoCopy(new ZPair("xz", "application/x-xz"));
                            array.addWithZPairNoCopy(new ZPair("z1", "application/x-zmachine"));
                            array.addWithZPairNoCopy(new ZPair("xaml", "application/xaml+xml"));
                            array.addWithZPairNoCopy(new ZPair("xdf", "application/xcap-diff+xml"));
                            array.addWithZPairNoCopy(new ZPair("xenc", "application/xenc+xml"));
                            array.addWithZPairNoCopy(new ZPair("xhtml", "application/xhtml+xml"));
                            array.addWithZPairNoCopy(new ZPair("xml", "application/xml"));
                            array.addWithZPairNoCopy(new ZPair("dtd", "application/xml-dtd"));
                            array.addWithZPairNoCopy(new ZPair("xop", "application/xop+xml"));
                            array.addWithZPairNoCopy(new ZPair("xpl", "application/xproc+xml"));
                            array.addWithZPairNoCopy(new ZPair("xslt", "application/xslt+xml"));
                            array.addWithZPairNoCopy(new ZPair("xspf", "application/xspf+xml"));
                            array.addWithZPairNoCopy(new ZPair("mxml", "application/xv+xml"));
                            array.addWithZPairNoCopy(new ZPair("yang", "application/yang"));
                            array.addWithZPairNoCopy(new ZPair("yin", "application/yin+xml"));
                            array.addWithZPairNoCopy(new ZPair("zip", "application/zip"));
                            array.addWithZPairNoCopy(new ZPair("adp", "audio/adpcm"));
                            array.addWithZPairNoCopy(new ZPair("au", "audio/basic"));
                            array.addWithZPairNoCopy(new ZPair("mid", "audio/midi"));
                            array.addWithZPairNoCopy(new ZPair("mp3", "audio/mpeg"));
                            array.addWithZPairNoCopy(new ZPair("mp4a", "audio/mp4"));
                            array.addWithZPairNoCopy(new ZPair("mpga", "audio/mpeg"));
                            array.addWithZPairNoCopy(new ZPair("oga", "audio/ogg"));
                            array.addWithZPairNoCopy(new ZPair("s3m", "audio/s3m"));
                            array.addWithZPairNoCopy(new ZPair("sil", "audio/silk"));
                            array.addWithZPairNoCopy(new ZPair("uva", "audio/vnd.dece.audio"));
                            array.addWithZPairNoCopy(new ZPair("eol", "audio/vnd.digital-winds"));
                            array.addWithZPairNoCopy(new ZPair("dra", "audio/vnd.dra"));
                            array.addWithZPairNoCopy(new ZPair("dts", "audio/vnd.dts"));
                            array.addWithZPairNoCopy(new ZPair("dtshd", "audio/vnd.dts.hd"));
                            array.addWithZPairNoCopy(new ZPair("lvp", "audio/vnd.lucent.voice"));
                            array.addWithZPairNoCopy(
                                    new ZPair("pya", "audio/vnd.ms-playready.media.pya"));
                            array.addWithZPairNoCopy(
                                    new ZPair("ecelp4800", "audio/vnd.nuera.ecelp4800"));
                            array.addWithZPairNoCopy(
                                    new ZPair("ecelp7470", "audio/vnd.nuera.ecelp7470"));
                            array.addWithZPairNoCopy(
                                    new ZPair("ecelp9600", "audio/vnd.nuera.ecelp9600"));
                            array.addWithZPairNoCopy(new ZPair("rip", "audio/vnd.rip"));
                            array.addWithZPairNoCopy(new ZPair("weba", "audio/webm"));
                            array.addWithZPairNoCopy(new ZPair("aac", "audio/x-aac"));
                            array.addWithZPairNoCopy(new ZPair("aif", "audio/x-aiff"));
                            array.addWithZPairNoCopy(new ZPair("caf", "audio/x-caf"));
                            array.addWithZPairNoCopy(new ZPair("flac", "audio/x-flac"));
                            array.addWithZPairNoCopy(new ZPair("mka", "audio/x-matroska"));
                            array.addWithZPairNoCopy(new ZPair("m3u", "audio/x-mpegurl"));
                            array.addWithZPairNoCopy(new ZPair("wax", "audio/x-ms-wax"));
                            array.addWithZPairNoCopy(new ZPair("wma", "audio/x-ms-wma"));
                            array.addWithZPairNoCopy(new ZPair("ram", "audio/x-pn-realaudio"));
                            array.addWithZPairNoCopy(
                                    new ZPair("rmp", "audio/x-pn-realaudio-plugin"));
                            array.addWithZPairNoCopy(new ZPair("wav", "audio/x-wav"));
                            array.addWithZPairNoCopy(new ZPair("xm", "audio/xm"));
                            array.addWithZPairNoCopy(new ZPair("cdx", "chemical/x-cdx"));
                            array.addWithZPairNoCopy(new ZPair("cif", "chemical/x-cif"));
                            array.addWithZPairNoCopy(new ZPair("cmdf", "chemical/x-cmdf"));
                            array.addWithZPairNoCopy(new ZPair("cml", "chemical/x-cml"));
                            array.addWithZPairNoCopy(new ZPair("csml", "chemical/x-csml"));
                            array.addWithZPairNoCopy(new ZPair("xyz", "chemical/x-xyz"));
                            array.addWithZPairNoCopy(new ZPair("bmp", "image/bmp"));
                            array.addWithZPairNoCopy(new ZPair("cgm", "image/cgm"));
                            array.addWithZPairNoCopy(new ZPair("g3", "image/g3fax"));
                            array.addWithZPairNoCopy(new ZPair("gif", "image/gif"));
                            array.addWithZPairNoCopy(new ZPair("ief", "image/ief"));
                            array.addWithZPairNoCopy(new ZPair("jpg", "image/jpeg"));
                            array.addWithZPairNoCopy(new ZPair("jpeg", "image/jpeg"));
                            array.addWithZPairNoCopy(new ZPair("ktx", "image/ktx"));
                            array.addWithZPairNoCopy(new ZPair("png", "image/png"));
                            array.addWithZPairNoCopy(new ZPair("btif", "image/prs.btif"));
                            array.addWithZPairNoCopy(new ZPair("sgi", "image/sgi"));
                            array.addWithZPairNoCopy(new ZPair("svg", "image/svg+xml"));
                            array.addWithZPairNoCopy(new ZPair("tiff", "image/tiff"));
                            array.addWithZPairNoCopy(new ZPair("psd", "image/vnd.adobe.photoshop"));
                            array.addWithZPairNoCopy(new ZPair("uvi", "image/vnd.dece.graphic"));
                            array.addWithZPairNoCopy(new ZPair("djvu", "image/vnd.djvu"));
                            array.addWithZPairNoCopy(new ZPair("dwg", "image/vnd.dwg"));
                            array.addWithZPairNoCopy(new ZPair("dxf", "image/vnd.dxf"));
                            array.addWithZPairNoCopy(new ZPair("fbs", "image/vnd.fastbidsheet"));
                            array.addWithZPairNoCopy(new ZPair("fpx", "image/vnd.fpx"));
                            array.addWithZPairNoCopy(new ZPair("fst", "image/vnd.fst"));
                            array.addWithZPairNoCopy(
                                    new ZPair("mmr", "image/vnd.fujixerox.edmics-mmr"));
                            array.addWithZPairNoCopy(
                                    new ZPair("rlc", "image/vnd.fujixerox.edmics-rlc"));
                            array.addWithZPairNoCopy(new ZPair("mdi", "image/vnd.ms-modi"));
                            array.addWithZPairNoCopy(new ZPair("wdp", "image/vnd.ms-photo"));
                            array.addWithZPairNoCopy(new ZPair("npx", "image/vnd.net-fpx"));
                            array.addWithZPairNoCopy(new ZPair("wbmp", "image/vnd.wap.wbmp"));
                            array.addWithZPairNoCopy(new ZPair("xif", "image/vnd.xiff"));
                            array.addWithZPairNoCopy(new ZPair("webp", "image/webp"));
                            array.addWithZPairNoCopy(new ZPair("3ds", "image/x-3ds"));
                            array.addWithZPairNoCopy(new ZPair("ras", "image/x-cmu-raster"));
                            array.addWithZPairNoCopy(new ZPair("cmx", "image/x-cmx"));
                            array.addWithZPairNoCopy(new ZPair("fh", "image/x-freehand"));
                            array.addWithZPairNoCopy(new ZPair("ico", "image/x-icon"));
                            array.addWithZPairNoCopy(new ZPair("sid", "image/x-mrsid-image"));
                            array.addWithZPairNoCopy(new ZPair("pcx", "image/x-pcx"));
                            array.addWithZPairNoCopy(new ZPair("pic", "image/x-pict"));
                            array.addWithZPairNoCopy(new ZPair("pnm", "image/x-portable-anymap"));
                            array.addWithZPairNoCopy(new ZPair("pbm", "image/x-portable-bitmap"));
                            array.addWithZPairNoCopy(new ZPair("pgm", "image/x-portable-graymap"));
                            array.addWithZPairNoCopy(new ZPair("ppm", "image/x-portable-pixmap"));
                            array.addWithZPairNoCopy(new ZPair("rgb", "image/x-rgb"));
                            array.addWithZPairNoCopy(new ZPair("tga", "image/x-tga"));
                            array.addWithZPairNoCopy(new ZPair("xbm", "image/x-xbitmap"));
                            array.addWithZPairNoCopy(new ZPair("xpm", "image/x-xpixmap"));
                            array.addWithZPairNoCopy(new ZPair("xwd", "image/x-xwindowdump"));
                            array.addWithZPairNoCopy(new ZPair("eml", "message/rfc822"));
                            array.addWithZPairNoCopy(new ZPair("igs", "model/iges"));
                            array.addWithZPairNoCopy(new ZPair("msh", "model/mesh"));
                            array.addWithZPairNoCopy(new ZPair("dae", "model/vnd.collada+xml"));
                            array.addWithZPairNoCopy(new ZPair("dwf", "model/vnd.dwf"));
                            array.addWithZPairNoCopy(new ZPair("gdl", "model/vnd.gdl"));
                            array.addWithZPairNoCopy(new ZPair("gtw", "model/vnd.gtw"));
                            array.addWithZPairNoCopy(new ZPair("mts", "model/vnd.mts"));
                            array.addWithZPairNoCopy(new ZPair("vtu", "model/vnd.vtu"));
                            array.addWithZPairNoCopy(new ZPair("wrl", "model/vrml"));
                            array.addWithZPairNoCopy(new ZPair("x3db", "model/x3d+binary"));
                            array.addWithZPairNoCopy(new ZPair("x3dv", "model/x3d+vrml"));
                            array.addWithZPairNoCopy(new ZPair("x3d", "model/x3d+xml"));
                            array.addWithZPairNoCopy(new ZPair("appcache", "text/cache-manifest"));
                            array.addWithZPairNoCopy(new ZPair("ics", "text/calendar"));
                            array.addWithZPairNoCopy(new ZPair("css", "text/css"));
                            array.addWithZPairNoCopy(new ZPair("csv", "text/csv"));
                            array.addWithZPairNoCopy(new ZPair("html", "text/html"));
                            array.addWithZPairNoCopy(new ZPair("n3", "text/n3"));
                            array.addWithZPairNoCopy(new ZPair("txt", "text/plain"));
                            array.addWithZPairNoCopy(new ZPair("dsc", "text/prs.lines.tag"));
                            array.addWithZPairNoCopy(new ZPair("rtx", "text/richtext"));
                            array.addWithZPairNoCopy(new ZPair("rtf", "text/rtf"));
                            array.addWithZPairNoCopy(new ZPair("sgml", "text/sgml"));
                            array.addWithZPairNoCopy(new ZPair("tsv", "text/tab-separated-values"));
                            array.addWithZPairNoCopy(new ZPair("t", "text/troff"));
                            array.addWithZPairNoCopy(new ZPair("ttl", "text/turtle"));
                            array.addWithZPairNoCopy(new ZPair("uri", "text/uri-list"));
                            array.addWithZPairNoCopy(new ZPair("vcard", "text/vcard"));
                            array.addWithZPairNoCopy(new ZPair("curl", "text/vnd.curl"));
                            array.addWithZPairNoCopy(new ZPair("dcurl", "text/vnd.curl.dcurl"));
                            array.addWithZPairNoCopy(new ZPair("scurl", "text/vnd.curl.scurl"));
                            array.addWithZPairNoCopy(new ZPair("mcurl", "text/vnd.curl.mcurl"));
                            array.addWithZPairNoCopy(new ZPair("sub", "text/vnd.dvb.subtitle"));
                            array.addWithZPairNoCopy(new ZPair("fly", "text/vnd.fly"));
                            array.addWithZPairNoCopy(new ZPair("flx", "text/vnd.fmi.flexstor"));
                            array.addWithZPairNoCopy(new ZPair("gv", "text/vnd.graphviz"));
                            array.addWithZPairNoCopy(new ZPair("3dml", "text/vnd.in3d.3dml"));
                            array.addWithZPairNoCopy(new ZPair("spot", "text/vnd.in3d.spot"));
                            array.addWithZPairNoCopy(
                                    new ZPair("jad", "text/vnd.sun.j2me.app-descriptor"));
                            array.addWithZPairNoCopy(new ZPair("wml", "text/vnd.wap.wml"));
                            array.addWithZPairNoCopy(new ZPair("wmls", "text/vnd.wap.wmlscript"));
                            array.addWithZPairNoCopy(new ZPair("s", "text/x-asm"));
                            array.addWithZPairNoCopy(new ZPair("c", "text/x-c"));
                            array.addWithZPairNoCopy(new ZPair("f", "text/x-fortran"));
                            array.addWithZPairNoCopy(new ZPair("p", "text/x-pascal"));
                            array.addWithZPairNoCopy(new ZPair("java", "text/x-java-source"));
                            array.addWithZPairNoCopy(new ZPair("opml", "text/x-opml"));
                            array.addWithZPairNoCopy(new ZPair("nfo", "text/x-nfo"));
                            array.addWithZPairNoCopy(new ZPair("etx", "text/x-setext"));
                            array.addWithZPairNoCopy(new ZPair("sfv", "text/x-sfv"));
                            array.addWithZPairNoCopy(new ZPair("uu", "text/x-uuencode"));
                            array.addWithZPairNoCopy(new ZPair("vcs", "text/x-vcalendar"));
                            array.addWithZPairNoCopy(new ZPair("vcf", "text/x-vcard"));
                            array.addWithZPairNoCopy(new ZPair("3gp", "video/3gpp"));
                            array.addWithZPairNoCopy(new ZPair("3g2", "video/3gpp2"));
                            array.addWithZPairNoCopy(new ZPair("h261", "video/h261"));
                            array.addWithZPairNoCopy(new ZPair("h263", "video/h263"));
                            array.addWithZPairNoCopy(new ZPair("h264", "video/h264"));
                            array.addWithZPairNoCopy(new ZPair("jpgv", "video/jpeg"));
                            array.addWithZPairNoCopy(new ZPair("jpm", "video/jpm"));
                            array.addWithZPairNoCopy(new ZPair("mj2", "video/mj2"));
                            array.addWithZPairNoCopy(new ZPair("mp4", "video/mp4"));
                            array.addWithZPairNoCopy(new ZPair("mpeg", "video/mpeg"));
                            array.addWithZPairNoCopy(new ZPair("ogv", "video/ogg"));
                            array.addWithZPairNoCopy(new ZPair("mov", "video/quicktime"));
                            array.addWithZPairNoCopy(new ZPair("qt", "video/quicktime"));
                            array.addWithZPairNoCopy(new ZPair("uvh", "video/vnd.dece.hd"));
                            array.addWithZPairNoCopy(new ZPair("uvm", "video/vnd.dece.mobile"));
                            array.addWithZPairNoCopy(new ZPair("uvp", "video/vnd.dece.pd"));
                            array.addWithZPairNoCopy(new ZPair("uvs", "video/vnd.dece.sd"));
                            array.addWithZPairNoCopy(new ZPair("uvv", "video/vnd.dece.video"));
                            array.addWithZPairNoCopy(new ZPair("dvb", "video/vnd.dvb.file"));
                            array.addWithZPairNoCopy(new ZPair("fvt", "video/vnd.fvt"));
                            array.addWithZPairNoCopy(new ZPair("mxu", "video/vnd.mpegurl"));
                            array.addWithZPairNoCopy(
                                    new ZPair("pyv", "video/vnd.ms-playready.media.pyv"));
                            array.addWithZPairNoCopy(new ZPair("uvu", "video/vnd.uvvu.mp4"));
                            array.addWithZPairNoCopy(new ZPair("viv", "video/vnd.vivo"));
                            array.addWithZPairNoCopy(new ZPair("webm", "video/webm"));
                            array.addWithZPairNoCopy(new ZPair("f4v", "video/x-f4v"));
                            array.addWithZPairNoCopy(new ZPair("fli", "video/x-fli"));
                            array.addWithZPairNoCopy(new ZPair("flv", "video/x-flv"));
                            array.addWithZPairNoCopy(new ZPair("m4v", "video/x-m4v"));
                            array.addWithZPairNoCopy(new ZPair("mkv", "video/x-matroska"));
                            array.addWithZPairNoCopy(new ZPair("mng", "video/x-mng"));
                            array.addWithZPairNoCopy(new ZPair("asf", "video/x-ms-asf"));
                            array.addWithZPairNoCopy(new ZPair("vob", "video/x-ms-vob"));
                            array.addWithZPairNoCopy(new ZPair("wm", "video/x-ms-wm"));
                            array.addWithZPairNoCopy(new ZPair("wmv", "video/x-ms-wmv"));
                            array.addWithZPairNoCopy(new ZPair("wmx", "video/x-ms-wmx"));
                            array.addWithZPairNoCopy(new ZPair("wvx", "video/x-ms-wvx"));
                            array.addWithZPairNoCopy(new ZPair("avi", "video/x-msvideo"));
                            array.addWithZPairNoCopy(new ZPair("movie", "video/x-sgi-movie"));
                            array.addWithZPairNoCopy(new ZPair("smv", "video/x-smv"));
                            array.addWithZPairNoCopy(new ZPair("ice", "x-conference/x-cooltalk"));
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Http\\Testing\\MimeType")
                    .setLookup(
                            MimeType.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("mimes")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Http/Testing/MimeType.php")
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
