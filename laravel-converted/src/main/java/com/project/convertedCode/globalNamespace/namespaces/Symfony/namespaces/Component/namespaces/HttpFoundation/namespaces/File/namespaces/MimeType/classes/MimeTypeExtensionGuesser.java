package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.namespaces.MimeType.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.namespaces.MimeType.classes.ExtensionGuesserInterface;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/File/MimeType/MimeTypeExtensionGuesser.php

*/

public class MimeTypeExtensionGuesser extends RuntimeClassBase
        implements ExtensionGuesserInterface {

    public Object defaultExtensions =
            ZVal.mergeArrayFromLambdaExpression(
                    771, /* Due to excessive array size and Java limitations, array initialization has been split into multiple lambdas. */
                    (array) -> {
                        array.addWithZPairNoCopy(new ZPair("application/andrew-inset", "ez"));
                        array.addWithZPairNoCopy(new ZPair("application/applixware", "aw"));
                        array.addWithZPairNoCopy(new ZPair("application/atom+xml", "atom"));
                        array.addWithZPairNoCopy(new ZPair("application/atomcat+xml", "atomcat"));
                        array.addWithZPairNoCopy(new ZPair("application/atomsvc+xml", "atomsvc"));
                        array.addWithZPairNoCopy(new ZPair("application/ccxml+xml", "ccxml"));
                        array.addWithZPairNoCopy(new ZPair("application/cdmi-capability", "cdmia"));
                        array.addWithZPairNoCopy(new ZPair("application/cdmi-container", "cdmic"));
                        array.addWithZPairNoCopy(new ZPair("application/cdmi-domain", "cdmid"));
                        array.addWithZPairNoCopy(new ZPair("application/cdmi-object", "cdmio"));
                        array.addWithZPairNoCopy(new ZPair("application/cdmi-queue", "cdmiq"));
                        array.addWithZPairNoCopy(new ZPair("application/cu-seeme", "cu"));
                        array.addWithZPairNoCopy(new ZPair("application/davmount+xml", "davmount"));
                        array.addWithZPairNoCopy(new ZPair("application/docbook+xml", "dbk"));
                        array.addWithZPairNoCopy(new ZPair("application/dssc+der", "dssc"));
                        array.addWithZPairNoCopy(new ZPair("application/dssc+xml", "xdssc"));
                        array.addWithZPairNoCopy(new ZPair("application/ecmascript", "ecma"));
                        array.addWithZPairNoCopy(new ZPair("application/emma+xml", "emma"));
                        array.addWithZPairNoCopy(new ZPair("application/epub+zip", "epub"));
                        array.addWithZPairNoCopy(new ZPair("application/exi", "exi"));
                        array.addWithZPairNoCopy(new ZPair("application/font-tdpfr", "pfr"));
                        array.addWithZPairNoCopy(new ZPair("application/gml+xml", "gml"));
                        array.addWithZPairNoCopy(new ZPair("application/gpx+xml", "gpx"));
                        array.addWithZPairNoCopy(new ZPair("application/gxf", "gxf"));
                        array.addWithZPairNoCopy(new ZPair("application/hyperstudio", "stk"));
                        array.addWithZPairNoCopy(new ZPair("application/inkml+xml", "ink"));
                        array.addWithZPairNoCopy(new ZPair("application/ipfix", "ipfix"));
                        array.addWithZPairNoCopy(new ZPair("application/java-archive", "jar"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/java-serialized-object", "ser"));
                        array.addWithZPairNoCopy(new ZPair("application/java-vm", "class"));
                        array.addWithZPairNoCopy(new ZPair("application/javascript", "js"));
                        array.addWithZPairNoCopy(new ZPair("application/json", "json"));
                        array.addWithZPairNoCopy(new ZPair("application/jsonml+json", "jsonml"));
                        array.addWithZPairNoCopy(new ZPair("application/lost+xml", "lostxml"));
                        array.addWithZPairNoCopy(new ZPair("application/mac-binhex40", "hqx"));
                        array.addWithZPairNoCopy(new ZPair("application/mac-compactpro", "cpt"));
                        array.addWithZPairNoCopy(new ZPair("application/mads+xml", "mads"));
                        array.addWithZPairNoCopy(new ZPair("application/marc", "mrc"));
                        array.addWithZPairNoCopy(new ZPair("application/marcxml+xml", "mrcx"));
                        array.addWithZPairNoCopy(new ZPair("application/mathematica", "ma"));
                        array.addWithZPairNoCopy(new ZPair("application/mathml+xml", "mathml"));
                        array.addWithZPairNoCopy(new ZPair("application/mbox", "mbox"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/mediaservercontrol+xml", "mscml"));
                        array.addWithZPairNoCopy(new ZPair("application/metalink+xml", "metalink"));
                        array.addWithZPairNoCopy(new ZPair("application/metalink4+xml", "meta4"));
                        array.addWithZPairNoCopy(new ZPair("application/mets+xml", "mets"));
                        array.addWithZPairNoCopy(new ZPair("application/mods+xml", "mods"));
                        array.addWithZPairNoCopy(new ZPair("application/mp21", "m21"));
                        array.addWithZPairNoCopy(new ZPair("application/mp4", "mp4s"));
                        array.addWithZPairNoCopy(new ZPair("application/msword", "doc"));
                        array.addWithZPairNoCopy(new ZPair("application/mxf", "mxf"));
                        array.addWithZPairNoCopy(new ZPair("application/octet-stream", "bin"));
                        array.addWithZPairNoCopy(new ZPair("application/oda", "oda"));
                        array.addWithZPairNoCopy(new ZPair("application/oebps-package+xml", "opf"));
                        array.addWithZPairNoCopy(new ZPair("application/ogg", "ogx"));
                        array.addWithZPairNoCopy(new ZPair("application/omdoc+xml", "omdoc"));
                        array.addWithZPairNoCopy(new ZPair("application/onenote", "onetoc"));
                        array.addWithZPairNoCopy(new ZPair("application/oxps", "oxps"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/patch-ops-error+xml", "xer"));
                        array.addWithZPairNoCopy(new ZPair("application/pdf", "pdf"));
                        array.addWithZPairNoCopy(new ZPair("application/pgp-encrypted", "pgp"));
                        array.addWithZPairNoCopy(new ZPair("application/pgp-signature", "asc"));
                        array.addWithZPairNoCopy(new ZPair("application/pics-rules", "prf"));
                        array.addWithZPairNoCopy(new ZPair("application/pkcs10", "p10"));
                        array.addWithZPairNoCopy(new ZPair("application/pkcs7-mime", "p7m"));
                        array.addWithZPairNoCopy(new ZPair("application/pkcs7-signature", "p7s"));
                        array.addWithZPairNoCopy(new ZPair("application/pkcs8", "p8"));
                        array.addWithZPairNoCopy(new ZPair("application/pkix-attr-cert", "ac"));
                        array.addWithZPairNoCopy(new ZPair("application/pkix-cert", "cer"));
                        array.addWithZPairNoCopy(new ZPair("application/pkix-crl", "crl"));
                        array.addWithZPairNoCopy(new ZPair("application/pkix-pkipath", "pkipath"));
                        array.addWithZPairNoCopy(new ZPair("application/pkixcmp", "pki"));
                        array.addWithZPairNoCopy(new ZPair("application/pls+xml", "pls"));
                        array.addWithZPairNoCopy(new ZPair("application/postscript", "ai"));
                        array.addWithZPairNoCopy(new ZPair("application/prs.cww", "cww"));
                        array.addWithZPairNoCopy(new ZPair("application/pskc+xml", "pskcxml"));
                        array.addWithZPairNoCopy(new ZPair("application/rdf+xml", "rdf"));
                        array.addWithZPairNoCopy(new ZPair("application/reginfo+xml", "rif"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/relax-ng-compact-syntax", "rnc"));
                        array.addWithZPairNoCopy(new ZPair("application/resource-lists+xml", "rl"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/resource-lists-diff+xml", "rld"));
                        array.addWithZPairNoCopy(new ZPair("application/rls-services+xml", "rs"));
                        array.addWithZPairNoCopy(new ZPair("application/rpki-ghostbusters", "gbr"));
                        array.addWithZPairNoCopy(new ZPair("application/rpki-manifest", "mft"));
                        array.addWithZPairNoCopy(new ZPair("application/rpki-roa", "roa"));
                        array.addWithZPairNoCopy(new ZPair("application/rsd+xml", "rsd"));
                        array.addWithZPairNoCopy(new ZPair("application/rss+xml", "rss"));
                        array.addWithZPairNoCopy(new ZPair("application/rtf", "rtf"));
                        array.addWithZPairNoCopy(new ZPair("application/sbml+xml", "sbml"));
                        array.addWithZPairNoCopy(new ZPair("application/scvp-cv-request", "scq"));
                        array.addWithZPairNoCopy(new ZPair("application/scvp-cv-response", "scs"));
                        array.addWithZPairNoCopy(new ZPair("application/scvp-vp-request", "spq"));
                        array.addWithZPairNoCopy(new ZPair("application/scvp-vp-response", "spp"));
                        array.addWithZPairNoCopy(new ZPair("application/sdp", "sdp"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/set-payment-initiation", "setpay"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/set-registration-initiation", "setreg"));
                        array.addWithZPairNoCopy(new ZPair("application/shf+xml", "shf"));
                        array.addWithZPairNoCopy(new ZPair("application/smil+xml", "smi"));
                        array.addWithZPairNoCopy(new ZPair("application/sparql-query", "rq"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/sparql-results+xml", "srx"));
                        array.addWithZPairNoCopy(new ZPair("application/srgs", "gram"));
                        array.addWithZPairNoCopy(new ZPair("application/srgs+xml", "grxml"));
                        array.addWithZPairNoCopy(new ZPair("application/sru+xml", "sru"));
                        array.addWithZPairNoCopy(new ZPair("application/ssdl+xml", "ssdl"));
                        array.addWithZPairNoCopy(new ZPair("application/ssml+xml", "ssml"));
                        array.addWithZPairNoCopy(new ZPair("application/tei+xml", "tei"));
                        array.addWithZPairNoCopy(new ZPair("application/thraud+xml", "tfi"));
                        array.addWithZPairNoCopy(new ZPair("application/timestamped-data", "tsd"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.3gpp.pic-bw-large", "plb"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.3gpp.pic-bw-small", "psb"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.3gpp.pic-bw-var", "pvb"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.3gpp2.tcap", "tcap"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.3m.post-it-notes", "pwn"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.accpac.simply.aso", "aso"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.accpac.simply.imp", "imp"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.acucobol", "acu"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.acucorp", "atc"));
                        array.addWithZPairNoCopy(
                                new ZPair(
                                        "application/vnd.adobe.air-application-installer-package+zip",
                                        "air"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.adobe.formscentral.fcdt", "fcdt"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.adobe.fxp", "fxp"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.adobe.xdp+xml", "xdp"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.adobe.xfdf", "xfdf"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.ahead.space", "ahead"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.airzip.filesecure.azf", "azf"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.airzip.filesecure.azs", "azs"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.amazon.ebook", "azw"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.americandynamics.acc", "acc"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.amiga.ami", "ami"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.android.package-archive", "apk"));
                        array.addWithZPairNoCopy(
                                new ZPair(
                                        "application/vnd.anser-web-certificate-issue-initiation",
                                        "cii"));
                        array.addWithZPairNoCopy(
                                new ZPair(
                                        "application/vnd.anser-web-funds-transfer-initiation",
                                        "fti"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.antix.game-component", "atx"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.apple.installer+xml", "mpkg"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.apple.mpegurl", "m3u8"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.aristanetworks.swi", "swi"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.astraea-software.iota", "iota"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.audiograph", "aep"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.blueice.multipass", "mpm"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.bmi", "bmi"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.businessobjects", "rep"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.chemdraw+xml", "cdxml"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.chipnuts.karaoke-mmd", "mmd"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.cinderella", "cdy"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.claymore", "cla"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.cloanto.rp9", "rp9"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.clonk.c4group", "c4g"));
                        array.addWithZPairNoCopy(
                                new ZPair(
                                        "application/vnd.cluetrust.cartomobile-config", "c11amc"));
                        array.addWithZPairNoCopy(
                                new ZPair(
                                        "application/vnd.cluetrust.cartomobile-config-pkg",
                                        "c11amz"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.commonspace", "csp"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.contact.cmsg", "cdbcmsg"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.cosmocaller", "cmc"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.crick.clicker", "clkx"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.crick.clicker.keyboard", "clkk"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.crick.clicker.palette", "clkp"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.crick.clicker.template", "clkt"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.crick.clicker.wordbank", "clkw"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.criticaltools.wbs+xml", "wbs"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.ctc-posml", "pml"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.cups-ppd", "ppd"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.curl.car", "car"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.curl.pcurl", "pcurl"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.dart", "dart"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.data-vision.rdz", "rdz"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.dece.data", "uvf"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.dece.ttml+xml", "uvt"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.dece.unspecified", "uvx"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.dece.zip", "uvz"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.denovo.fcselayout-link", "fe_launch"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.dna", "dna"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.dolby.mlp", "mlp"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.dpgraph", "dpg"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.dreamfactory", "dfac"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.ds-keypoint", "kpxx"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.dvb.ait", "ait"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.dvb.service", "svc"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.dynageo", "geo"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.ecowin.chart", "mag"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.enliven", "nml"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.epson.esf", "esf"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.epson.msf", "msf"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.epson.quickanime", "qam"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.epson.salt", "slt"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.epson.ssf", "ssf"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.eszigno3+xml", "es3"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.ezpix-album", "ez2"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.ezpix-package", "ez3"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.fdf", "fdf"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.fdsn.mseed", "mseed"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.fdsn.seed", "seed"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.flographit", "gph"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.fluxtime.clip", "ftc"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.framemaker", "fm"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.frogans.fnc", "fnc"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.frogans.ltf", "ltf"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.fsc.weblaunch", "fsc"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.fujitsu.oasys", "oas"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.fujitsu.oasys2", "oa2"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.fujitsu.oasys3", "oa3"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.fujitsu.oasysgp", "fg5"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.fujitsu.oasysprs", "bh2"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.fujixerox.ddd", "ddd"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.fujixerox.docuworks", "xdw"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.fujixerox.docuworks.binder", "xbd"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.fuzzysheet", "fzs"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.genomatix.tuxedo", "txd"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.geogebra.file", "ggb"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.geogebra.tool", "ggt"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.geometry-explorer", "gex"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.geonext", "gxt"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.geoplan", "g2w"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.geospace", "g3w"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.gmx", "gmx"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.google-earth.kml+xml", "kml"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.google-earth.kmz", "kmz"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.grafeq", "gqf"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.groove-account", "gac"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.groove-help", "ghf"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.groove-identity-message", "gim"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.groove-injector", "grv"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.groove-tool-message", "gtm"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.groove-tool-template", "tpl"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.groove-vcard", "vcg"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.hal+xml", "hal"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.handheld-entertainment+xml", "zmm"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.hbci", "hbci"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.hhe.lesson-player", "les"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.hp-hpgl", "hpgl"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.hp-hpid", "hpid"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.hp-hps", "hps"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.hp-jlyt", "jlt"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.hp-pcl", "pcl"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.hp-pclxl", "pclxl"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.hydrostatix.sof-data", "sfd-hdstx"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.ibm.minipay", "mpy"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.ibm.modcap", "afp"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.ibm.rights-management", "irm"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.ibm.secure-container", "sc"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.iccprofile", "icc"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.igloader", "igl"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.immervision-ivp", "ivp"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.immervision-ivu", "ivu"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.insors.igm", "igm"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.intercon.formnet", "xpw"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.intergeo", "i2g"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.intu.qbo", "qbo"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.intu.qfx", "qfx"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.ipunplugged.rcprofile", "rcprofile"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.irepository.package+xml", "irp"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.is-xpr", "xpr"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.isac.fcs", "fcs"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.jam", "jam"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.jcp.javame.midlet-rms", "rms"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.jisp", "jisp"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.joost.joda-archive", "joda"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.kahootz", "ktz"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.kde.karbon", "karbon"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.kde.kchart", "chrt"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.kde.kformula", "kfo"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.kde.kivio", "flw"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.kde.kontour", "kon"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.kde.kpresenter", "kpr"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.kde.kspread", "ksp"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.kde.kword", "kwd"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.kenameaapp", "htke"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.kidspiration", "kia"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.kinar", "kne"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.koan", "skp"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.kodak-descriptor", "sse"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.las.las+xml", "lasxml"));
                        array.addWithZPairNoCopy(
                                new ZPair(
                                        "application/vnd.llamagraphics.life-balance.desktop",
                                        "lbd"));
                        array.addWithZPairNoCopy(
                                new ZPair(
                                        "application/vnd.llamagraphics.life-balance.exchange+xml",
                                        "lbe"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.lotus-1-2-3", "123"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.lotus-approach", "apr"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.lotus-freelance", "pre"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.lotus-notes", "nsf"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.lotus-organizer", "org"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.lotus-screencam", "scm"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.lotus-wordpro", "lwp"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.macports.portpkg", "portpkg"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.mcd", "mcd"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.medcalcdata", "mc1"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.mediastation.cdkey", "cdkey"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.mfer", "mwf"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.mfmp", "mfm"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.micrografx.flo", "flo"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.micrografx.igx", "igx"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.mif", "mif"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.mobius.daf", "daf"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.mobius.dis", "dis"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.mobius.mbk", "mbk"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.mobius.mqy", "mqy"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.mobius.msl", "msl"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.mobius.plc", "plc"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.mobius.txf", "txf"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.mophun.application", "mpn"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.mophun.certificate", "mpc"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.mozilla.xul+xml", "xul"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.ms-artgalry", "cil"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.ms-cab-compressed", "cab"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.ms-excel", "xls"));
                        array.addWithZPairNoCopy(
                                new ZPair(
                                        "application/vnd.ms-excel.addin.macroenabled.12", "xlam"));
                        array.addWithZPairNoCopy(
                                new ZPair(
                                        "application/vnd.ms-excel.sheet.binary.macroenabled.12",
                                        "xlsb"));
                        array.addWithZPairNoCopy(
                                new ZPair(
                                        "application/vnd.ms-excel.sheet.macroenabled.12", "xlsm"));
                        array.addWithZPairNoCopy(
                                new ZPair(
                                        "application/vnd.ms-excel.template.macroenabled.12",
                                        "xltm"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.ms-fontobject", "eot"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.ms-htmlhelp", "chm"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.ms-ims", "ims"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.ms-lrm", "lrm"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.ms-officetheme", "thmx"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.ms-pki.seccat", "cat"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.ms-pki.stl", "stl"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.ms-powerpoint", "ppt"));
                        array.addWithZPairNoCopy(
                                new ZPair(
                                        "application/vnd.ms-powerpoint.addin.macroenabled.12",
                                        "ppam"));
                        array.addWithZPairNoCopy(
                                new ZPair(
                                        "application/vnd.ms-powerpoint.presentation.macroenabled.12",
                                        "pptm"));
                        array.addWithZPairNoCopy(
                                new ZPair(
                                        "application/vnd.ms-powerpoint.slide.macroenabled.12",
                                        "sldm"));
                        array.addWithZPairNoCopy(
                                new ZPair(
                                        "application/vnd.ms-powerpoint.slideshow.macroenabled.12",
                                        "ppsm"));
                        array.addWithZPairNoCopy(
                                new ZPair(
                                        "application/vnd.ms-powerpoint.template.macroenabled.12",
                                        "potm"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.ms-project", "mpp"));
                        array.addWithZPairNoCopy(
                                new ZPair(
                                        "application/vnd.ms-word.document.macroenabled.12",
                                        "docm"));
                        array.addWithZPairNoCopy(
                                new ZPair(
                                        "application/vnd.ms-word.template.macroenabled.12",
                                        "dotm"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.ms-works", "wps"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.ms-wpl", "wpl"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.ms-xpsdocument", "xps"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.mseq", "mseq"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.musician", "mus"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.muvee.style", "msty"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.mynfc", "taglet"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.neurolanguage.nlu", "nlu"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.nitf", "ntf"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.noblenet-directory", "nnd"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.noblenet-sealer", "nns"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.noblenet-web", "nnw"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.nokia.n-gage.data", "ngdat"));
                        array.addWithZPairNoCopy(
                                new ZPair(
                                        "application/vnd.nokia.n-gage.symbian.install", "n-gage"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.nokia.radio-preset", "rpst"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.nokia.radio-presets", "rpss"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.novadigm.edm", "edm"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.novadigm.edx", "edx"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.novadigm.ext", "ext"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.oasis.opendocument.chart", "odc"));
                        array.addWithZPairNoCopy(
                                new ZPair(
                                        "application/vnd.oasis.opendocument.chart-template",
                                        "otc"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.oasis.opendocument.database", "odb"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.oasis.opendocument.formula", "odf"));
                        array.addWithZPairNoCopy(
                                new ZPair(
                                        "application/vnd.oasis.opendocument.formula-template",
                                        "odft"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.oasis.opendocument.graphics", "odg"));
                        array.addWithZPairNoCopy(
                                new ZPair(
                                        "application/vnd.oasis.opendocument.graphics-template",
                                        "otg"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.oasis.opendocument.image", "odi"));
                        array.addWithZPairNoCopy(
                                new ZPair(
                                        "application/vnd.oasis.opendocument.image-template",
                                        "oti"));
                        array.addWithZPairNoCopy(
                                new ZPair(
                                        "application/vnd.oasis.opendocument.presentation", "odp"));
                        array.addWithZPairNoCopy(
                                new ZPair(
                                        "application/vnd.oasis.opendocument.presentation-template",
                                        "otp"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.oasis.opendocument.spreadsheet", "ods"));
                        array.addWithZPairNoCopy(
                                new ZPair(
                                        "application/vnd.oasis.opendocument.spreadsheet-template",
                                        "ots"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.oasis.opendocument.text", "odt"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.oasis.opendocument.text-master", "odm"));
                        array.addWithZPairNoCopy(
                                new ZPair(
                                        "application/vnd.oasis.opendocument.text-template", "ott"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.oasis.opendocument.text-web", "oth"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.olpc-sugar", "xo"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.oma.dd2+xml", "dd2"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.openofficeorg.extension", "oxt"));
                        array.addWithZPairNoCopy(
                                new ZPair(
                                        "application/vnd.openxmlformats-officedocument.presentationml.presentation",
                                        "pptx"));
                        array.addWithZPairNoCopy(
                                new ZPair(
                                        "application/vnd.openxmlformats-officedocument.presentationml.slide",
                                        "sldx"));
                        array.addWithZPairNoCopy(
                                new ZPair(
                                        "application/vnd.openxmlformats-officedocument.presentationml.slideshow",
                                        "ppsx"));
                        array.addWithZPairNoCopy(
                                new ZPair(
                                        "application/vnd.openxmlformats-officedocument.presentationml.template",
                                        "potx"));
                        array.addWithZPairNoCopy(
                                new ZPair(
                                        "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet",
                                        "xlsx"));
                        array.addWithZPairNoCopy(
                                new ZPair(
                                        "application/vnd.openxmlformats-officedocument.spreadsheetml.template",
                                        "xltx"));
                        array.addWithZPairNoCopy(
                                new ZPair(
                                        "application/vnd.openxmlformats-officedocument.wordprocessingml.document",
                                        "docx"));
                        array.addWithZPairNoCopy(
                                new ZPair(
                                        "application/vnd.openxmlformats-officedocument.wordprocessingml.template",
                                        "dotx"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.osgeo.mapguide.package", "mgp"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.osgi.dp", "dp"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.osgi.subsystem", "esa"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.palm", "pdb"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.pawaafile", "paw"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.pg.format", "str"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.pg.osasli", "ei6"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.picsel", "efif"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.pmi.widget", "wg"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.pocketlearn", "plf"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.powerbuilder6", "pbd"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.previewsystems.box", "box"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.proteus.magazine", "mgz"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.publishare-delta-tree", "qps"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.pvi.ptid1", "ptid"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.quark.quarkxpress", "qxd"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.realvnc.bed", "bed"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.recordare.musicxml", "mxl"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.recordare.musicxml+xml", "musicxml"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.rig.cryptonote", "cryptonote"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.rim.cod", "cod"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.rn-realmedia", "rm"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.rn-realmedia-vbr", "rmvb"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.route66.link66+xml", "link66"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.sailingtracker.track", "st"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.seemail", "see"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.sema", "sema"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.semd", "semd"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.semf", "semf"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.shana.informed.formdata", "ifm"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.shana.informed.formtemplate", "itp"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.shana.informed.interchange", "iif"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.shana.informed.package", "ipk"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.simtech-mindmapper", "twd"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.smaf", "mmf"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.smart.teacher", "teacher"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.solent.sdkm+xml", "sdkm"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.spotfire.dxp", "dxp"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.spotfire.sfs", "sfs"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.stardivision.calc", "sdc"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.stardivision.draw", "sda"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.stardivision.impress", "sdd"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.stardivision.math", "smf"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.stardivision.writer", "sdw"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.stardivision.writer-global", "sgl"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.stepmania.package", "smzip"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.stepmania.stepchart", "sm"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.sun.xml.calc", "sxc"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.sun.xml.calc.template", "stc"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.sun.xml.draw", "sxd"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.sun.xml.draw.template", "std"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.sun.xml.impress", "sxi"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.sun.xml.impress.template", "sti"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.sun.xml.math", "sxm"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.sun.xml.writer", "sxw"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.sun.xml.writer.global", "sxg"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.sun.xml.writer.template", "stw"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.sus-calendar", "sus"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.svd", "svd"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.symbian.install", "sis"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.syncml+xml", "xsm"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.syncml.dm+wbxml", "bdm"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.syncml.dm+xml", "xdm"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.tao.intent-module-archive", "tao"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.tcpdump.pcap", "pcap"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.tmobile-livetv", "tmo"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.trid.tpt", "tpt"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.triscape.mxs", "mxs"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.trueapp", "tra"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.ufdl", "ufd"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.uiq.theme", "utz"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.umajin", "umj"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.unity", "unityweb"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.uoml+xml", "uoml"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.vcx", "vcx"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.visio", "vsd"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.visionary", "vis"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.vsf", "vsf"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.wap.wbxml", "wbxml"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.wap.wmlc", "wmlc"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.wap.wmlscriptc", "wmlsc"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.webturbo", "wtb"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.wolfram.player", "nbp"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.wordperfect", "wpd"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.wqd", "wqd"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.wt.stf", "stf"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.xara", "xar"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.xfdl", "xfdl"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.yamaha.hv-dic", "hvd"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.yamaha.hv-script", "hvs"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.yamaha.hv-voice", "hvp"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.yamaha.openscoreformat", "osf"));
                        array.addWithZPairNoCopy(
                                new ZPair(
                                        "application/vnd.yamaha.openscoreformat.osfpvg+xml",
                                        "osfpvg"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.yamaha.smaf-audio", "saf"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.yamaha.smaf-phrase", "spf"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.yellowriver-custom-menu", "cmp"));
                        array.addWithZPairNoCopy(new ZPair("application/vnd.zul", "zir"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/vnd.zzazz.deck+xml", "zaz"));
                        array.addWithZPairNoCopy(new ZPair("application/voicexml+xml", "vxml"));
                        array.addWithZPairNoCopy(new ZPair("application/widget", "wgt"));
                        array.addWithZPairNoCopy(new ZPair("application/winhlp", "hlp"));
                        array.addWithZPairNoCopy(new ZPair("application/wsdl+xml", "wsdl"));
                        array.addWithZPairNoCopy(new ZPair("application/wspolicy+xml", "wspolicy"));
                        array.addWithZPairNoCopy(new ZPair("application/x-7z-compressed", "7z"));
                        array.addWithZPairNoCopy(new ZPair("application/x-abiword", "abw"));
                        array.addWithZPairNoCopy(new ZPair("application/x-ace-compressed", "ace"));
                        array.addWithZPairNoCopy(new ZPair("application/x-apple-diskimage", "dmg"));
                        array.addWithZPairNoCopy(new ZPair("application/x-authorware-bin", "aab"));
                        array.addWithZPairNoCopy(new ZPair("application/x-authorware-map", "aam"));
                        array.addWithZPairNoCopy(new ZPair("application/x-authorware-seg", "aas"));
                        array.addWithZPairNoCopy(new ZPair("application/x-bcpio", "bcpio"));
                        array.addWithZPairNoCopy(new ZPair("application/x-bittorrent", "torrent"));
                        array.addWithZPairNoCopy(new ZPair("application/x-blorb", "blb"));
                        array.addWithZPairNoCopy(new ZPair("application/x-bzip", "bz"));
                        array.addWithZPairNoCopy(new ZPair("application/x-bzip2", "bz2"));
                        array.addWithZPairNoCopy(new ZPair("application/x-cbr", "cbr"));
                        array.addWithZPairNoCopy(new ZPair("application/x-cdlink", "vcd"));
                        array.addWithZPairNoCopy(new ZPair("application/x-cfs-compressed", "cfs"));
                        array.addWithZPairNoCopy(new ZPair("application/x-chat", "chat"));
                        array.addWithZPairNoCopy(new ZPair("application/x-chess-pgn", "pgn"));
                        array.addWithZPairNoCopy(new ZPair("application/x-conference", "nsc"));
                        array.addWithZPairNoCopy(new ZPair("application/x-cpio", "cpio"));
                        array.addWithZPairNoCopy(new ZPair("application/x-csh", "csh"));
                        array.addWithZPairNoCopy(new ZPair("application/x-debian-package", "deb"));
                        array.addWithZPairNoCopy(new ZPair("application/x-dgc-compressed", "dgc"));
                        array.addWithZPairNoCopy(new ZPair("application/x-director", "dir"));
                        array.addWithZPairNoCopy(new ZPair("application/x-doom", "wad"));
                        array.addWithZPairNoCopy(new ZPair("application/x-dtbncx+xml", "ncx"));
                        array.addWithZPairNoCopy(new ZPair("application/x-dtbook+xml", "dtb"));
                        array.addWithZPairNoCopy(new ZPair("application/x-dtbresource+xml", "res"));
                        array.addWithZPairNoCopy(new ZPair("application/x-dvi", "dvi"));
                        array.addWithZPairNoCopy(new ZPair("application/x-envoy", "evy"));
                        array.addWithZPairNoCopy(new ZPair("application/x-eva", "eva"));
                    },
                    (array) -> {
                        array.addWithZPairNoCopy(new ZPair("application/x-font-bdf", "bdf"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/x-font-ghostscript", "gsf"));
                        array.addWithZPairNoCopy(new ZPair("application/x-font-linux-psf", "psf"));
                        array.addWithZPairNoCopy(new ZPair("application/x-font-otf", "otf"));
                        array.addWithZPairNoCopy(new ZPair("application/x-font-pcf", "pcf"));
                        array.addWithZPairNoCopy(new ZPair("application/x-font-snf", "snf"));
                        array.addWithZPairNoCopy(new ZPair("application/x-font-ttf", "ttf"));
                        array.addWithZPairNoCopy(new ZPair("application/x-font-type1", "pfa"));
                        array.addWithZPairNoCopy(new ZPair("application/x-font-woff", "woff"));
                        array.addWithZPairNoCopy(new ZPair("application/x-freearc", "arc"));
                        array.addWithZPairNoCopy(new ZPair("application/x-futuresplash", "spl"));
                        array.addWithZPairNoCopy(new ZPair("application/x-gca-compressed", "gca"));
                        array.addWithZPairNoCopy(new ZPair("application/x-glulx", "ulx"));
                        array.addWithZPairNoCopy(new ZPair("application/x-gnumeric", "gnumeric"));
                        array.addWithZPairNoCopy(new ZPair("application/x-gramps-xml", "gramps"));
                        array.addWithZPairNoCopy(new ZPair("application/x-gtar", "gtar"));
                        array.addWithZPairNoCopy(new ZPair("application/x-hdf", "hdf"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/x-install-instructions", "install"));
                        array.addWithZPairNoCopy(new ZPair("application/x-iso9660-image", "iso"));
                        array.addWithZPairNoCopy(new ZPair("application/x-java-jnlp-file", "jnlp"));
                        array.addWithZPairNoCopy(new ZPair("application/x-latex", "latex"));
                        array.addWithZPairNoCopy(new ZPair("application/x-lzh-compressed", "lzh"));
                        array.addWithZPairNoCopy(new ZPair("application/x-mie", "mie"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/x-mobipocket-ebook", "prc"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/x-ms-application", "application"));
                        array.addWithZPairNoCopy(new ZPair("application/x-ms-shortcut", "lnk"));
                        array.addWithZPairNoCopy(new ZPair("application/x-ms-wmd", "wmd"));
                        array.addWithZPairNoCopy(new ZPair("application/x-ms-wmz", "wmz"));
                        array.addWithZPairNoCopy(new ZPair("application/x-ms-xbap", "xbap"));
                        array.addWithZPairNoCopy(new ZPair("application/x-msaccess", "mdb"));
                        array.addWithZPairNoCopy(new ZPair("application/x-msbinder", "obd"));
                        array.addWithZPairNoCopy(new ZPair("application/x-mscardfile", "crd"));
                        array.addWithZPairNoCopy(new ZPair("application/x-msclip", "clp"));
                        array.addWithZPairNoCopy(new ZPair("application/x-msdownload", "exe"));
                        array.addWithZPairNoCopy(new ZPair("application/x-msmediaview", "mvb"));
                        array.addWithZPairNoCopy(new ZPair("application/x-msmetafile", "wmf"));
                        array.addWithZPairNoCopy(new ZPair("application/x-msmoney", "mny"));
                        array.addWithZPairNoCopy(new ZPair("application/x-mspublisher", "pub"));
                        array.addWithZPairNoCopy(new ZPair("application/x-msschedule", "scd"));
                        array.addWithZPairNoCopy(new ZPair("application/x-msterminal", "trm"));
                        array.addWithZPairNoCopy(new ZPair("application/x-mswrite", "wri"));
                        array.addWithZPairNoCopy(new ZPair("application/x-netcdf", "nc"));
                        array.addWithZPairNoCopy(new ZPair("application/x-nzb", "nzb"));
                        array.addWithZPairNoCopy(new ZPair("application/x-pkcs12", "p12"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/x-pkcs7-certificates", "p7b"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/x-pkcs7-certreqresp", "p7r"));
                        array.addWithZPairNoCopy(new ZPair("application/x-rar-compressed", "rar"));
                        array.addWithZPairNoCopy(new ZPair("application/x-rar", "rar"));
                        array.addWithZPairNoCopy(
                                new ZPair("application/x-research-info-systems", "ris"));
                        array.addWithZPairNoCopy(new ZPair("application/x-sh", "sh"));
                        array.addWithZPairNoCopy(new ZPair("application/x-shar", "shar"));
                        array.addWithZPairNoCopy(new ZPair("application/x-shockwave-flash", "swf"));
                        array.addWithZPairNoCopy(new ZPair("application/x-silverlight-app", "xap"));
                        array.addWithZPairNoCopy(new ZPair("application/x-sql", "sql"));
                        array.addWithZPairNoCopy(new ZPair("application/x-stuffit", "sit"));
                        array.addWithZPairNoCopy(new ZPair("application/x-stuffitx", "sitx"));
                        array.addWithZPairNoCopy(new ZPair("application/x-subrip", "srt"));
                        array.addWithZPairNoCopy(new ZPair("application/x-sv4cpio", "sv4cpio"));
                        array.addWithZPairNoCopy(new ZPair("application/x-sv4crc", "sv4crc"));
                        array.addWithZPairNoCopy(new ZPair("application/x-t3vm-image", "t3"));
                        array.addWithZPairNoCopy(new ZPair("application/x-tads", "gam"));
                        array.addWithZPairNoCopy(new ZPair("application/x-tar", "tar"));
                        array.addWithZPairNoCopy(new ZPair("application/x-tcl", "tcl"));
                        array.addWithZPairNoCopy(new ZPair("application/x-tex", "tex"));
                        array.addWithZPairNoCopy(new ZPair("application/x-tex-tfm", "tfm"));
                        array.addWithZPairNoCopy(new ZPair("application/x-texinfo", "texinfo"));
                        array.addWithZPairNoCopy(new ZPair("application/x-tgif", "obj"));
                        array.addWithZPairNoCopy(new ZPair("application/x-ustar", "ustar"));
                        array.addWithZPairNoCopy(new ZPair("application/x-wais-source", "src"));
                        array.addWithZPairNoCopy(new ZPair("application/x-x509-ca-cert", "der"));
                        array.addWithZPairNoCopy(new ZPair("application/x-xfig", "fig"));
                        array.addWithZPairNoCopy(new ZPair("application/x-xliff+xml", "xlf"));
                        array.addWithZPairNoCopy(new ZPair("application/x-xpinstall", "xpi"));
                        array.addWithZPairNoCopy(new ZPair("application/x-xz", "xz"));
                        array.addWithZPairNoCopy(new ZPair("application/x-zip-compressed", "zip"));
                        array.addWithZPairNoCopy(new ZPair("application/x-zmachine", "z1"));
                        array.addWithZPairNoCopy(new ZPair("application/xaml+xml", "xaml"));
                        array.addWithZPairNoCopy(new ZPair("application/xcap-diff+xml", "xdf"));
                        array.addWithZPairNoCopy(new ZPair("application/xenc+xml", "xenc"));
                        array.addWithZPairNoCopy(new ZPair("application/xhtml+xml", "xhtml"));
                        array.addWithZPairNoCopy(new ZPair("application/xml", "xml"));
                        array.addWithZPairNoCopy(new ZPair("application/xml-dtd", "dtd"));
                        array.addWithZPairNoCopy(new ZPair("application/xop+xml", "xop"));
                        array.addWithZPairNoCopy(new ZPair("application/xproc+xml", "xpl"));
                        array.addWithZPairNoCopy(new ZPair("application/xslt+xml", "xslt"));
                        array.addWithZPairNoCopy(new ZPair("application/xspf+xml", "xspf"));
                        array.addWithZPairNoCopy(new ZPair("application/xv+xml", "mxml"));
                        array.addWithZPairNoCopy(new ZPair("application/yang", "yang"));
                        array.addWithZPairNoCopy(new ZPair("application/yin+xml", "yin"));
                        array.addWithZPairNoCopy(new ZPair("application/zip", "zip"));
                        array.addWithZPairNoCopy(new ZPair("audio/adpcm", "adp"));
                        array.addWithZPairNoCopy(new ZPair("audio/basic", "au"));
                        array.addWithZPairNoCopy(new ZPair("audio/midi", "mid"));
                        array.addWithZPairNoCopy(new ZPair("audio/mp4", "mp4a"));
                        array.addWithZPairNoCopy(new ZPair("audio/mpeg", "mpga"));
                        array.addWithZPairNoCopy(new ZPair("audio/ogg", "oga"));
                        array.addWithZPairNoCopy(new ZPair("audio/s3m", "s3m"));
                        array.addWithZPairNoCopy(new ZPair("audio/silk", "sil"));
                        array.addWithZPairNoCopy(new ZPair("audio/vnd.dece.audio", "uva"));
                        array.addWithZPairNoCopy(new ZPair("audio/vnd.digital-winds", "eol"));
                        array.addWithZPairNoCopy(new ZPair("audio/vnd.dra", "dra"));
                        array.addWithZPairNoCopy(new ZPair("audio/vnd.dts", "dts"));
                        array.addWithZPairNoCopy(new ZPair("audio/vnd.dts.hd", "dtshd"));
                        array.addWithZPairNoCopy(new ZPair("audio/vnd.lucent.voice", "lvp"));
                        array.addWithZPairNoCopy(
                                new ZPair("audio/vnd.ms-playready.media.pya", "pya"));
                        array.addWithZPairNoCopy(
                                new ZPair("audio/vnd.nuera.ecelp4800", "ecelp4800"));
                        array.addWithZPairNoCopy(
                                new ZPair("audio/vnd.nuera.ecelp7470", "ecelp7470"));
                        array.addWithZPairNoCopy(
                                new ZPair("audio/vnd.nuera.ecelp9600", "ecelp9600"));
                        array.addWithZPairNoCopy(new ZPair("audio/vnd.rip", "rip"));
                        array.addWithZPairNoCopy(new ZPair("audio/webm", "weba"));
                        array.addWithZPairNoCopy(new ZPair("audio/x-aac", "aac"));
                        array.addWithZPairNoCopy(new ZPair("audio/x-aiff", "aif"));
                        array.addWithZPairNoCopy(new ZPair("audio/x-caf", "caf"));
                        array.addWithZPairNoCopy(new ZPair("audio/x-flac", "flac"));
                        array.addWithZPairNoCopy(new ZPair("audio/x-matroska", "mka"));
                        array.addWithZPairNoCopy(new ZPair("audio/x-mpegurl", "m3u"));
                        array.addWithZPairNoCopy(new ZPair("audio/x-ms-wax", "wax"));
                        array.addWithZPairNoCopy(new ZPair("audio/x-ms-wma", "wma"));
                        array.addWithZPairNoCopy(new ZPair("audio/x-pn-realaudio", "ram"));
                        array.addWithZPairNoCopy(new ZPair("audio/x-pn-realaudio-plugin", "rmp"));
                        array.addWithZPairNoCopy(new ZPair("audio/x-wav", "wav"));
                        array.addWithZPairNoCopy(new ZPair("audio/xm", "xm"));
                        array.addWithZPairNoCopy(new ZPair("chemical/x-cdx", "cdx"));
                        array.addWithZPairNoCopy(new ZPair("chemical/x-cif", "cif"));
                        array.addWithZPairNoCopy(new ZPair("chemical/x-cmdf", "cmdf"));
                        array.addWithZPairNoCopy(new ZPair("chemical/x-cml", "cml"));
                        array.addWithZPairNoCopy(new ZPair("chemical/x-csml", "csml"));
                        array.addWithZPairNoCopy(new ZPair("chemical/x-xyz", "xyz"));
                        array.addWithZPairNoCopy(new ZPair("image/bmp", "bmp"));
                        array.addWithZPairNoCopy(new ZPair("image/x-ms-bmp", "bmp"));
                        array.addWithZPairNoCopy(new ZPair("image/cgm", "cgm"));
                        array.addWithZPairNoCopy(new ZPair("image/g3fax", "g3"));
                        array.addWithZPairNoCopy(new ZPair("image/gif", "gif"));
                        array.addWithZPairNoCopy(new ZPair("image/ief", "ief"));
                        array.addWithZPairNoCopy(new ZPair("image/jpeg", "jpeg"));
                        array.addWithZPairNoCopy(new ZPair("image/pjpeg", "jpeg"));
                        array.addWithZPairNoCopy(new ZPair("image/ktx", "ktx"));
                        array.addWithZPairNoCopy(new ZPair("image/png", "png"));
                        array.addWithZPairNoCopy(new ZPair("image/prs.btif", "btif"));
                        array.addWithZPairNoCopy(new ZPair("image/sgi", "sgi"));
                        array.addWithZPairNoCopy(new ZPair("image/svg+xml", "svg"));
                        array.addWithZPairNoCopy(new ZPair("image/tiff", "tiff"));
                        array.addWithZPairNoCopy(new ZPair("image/vnd.adobe.photoshop", "psd"));
                        array.addWithZPairNoCopy(new ZPair("image/vnd.dece.graphic", "uvi"));
                        array.addWithZPairNoCopy(new ZPair("image/vnd.dvb.subtitle", "sub"));
                        array.addWithZPairNoCopy(new ZPair("image/vnd.djvu", "djvu"));
                        array.addWithZPairNoCopy(new ZPair("image/vnd.dwg", "dwg"));
                        array.addWithZPairNoCopy(new ZPair("image/vnd.dxf", "dxf"));
                        array.addWithZPairNoCopy(new ZPair("image/vnd.fastbidsheet", "fbs"));
                        array.addWithZPairNoCopy(new ZPair("image/vnd.fpx", "fpx"));
                        array.addWithZPairNoCopy(new ZPair("image/vnd.fst", "fst"));
                        array.addWithZPairNoCopy(
                                new ZPair("image/vnd.fujixerox.edmics-mmr", "mmr"));
                        array.addWithZPairNoCopy(
                                new ZPair("image/vnd.fujixerox.edmics-rlc", "rlc"));
                        array.addWithZPairNoCopy(new ZPair("image/vnd.ms-modi", "mdi"));
                        array.addWithZPairNoCopy(new ZPair("image/vnd.ms-photo", "wdp"));
                        array.addWithZPairNoCopy(new ZPair("image/vnd.net-fpx", "npx"));
                        array.addWithZPairNoCopy(new ZPair("image/vnd.wap.wbmp", "wbmp"));
                        array.addWithZPairNoCopy(new ZPair("image/vnd.xiff", "xif"));
                        array.addWithZPairNoCopy(new ZPair("image/webp", "webp"));
                        array.addWithZPairNoCopy(new ZPair("image/x-3ds", "3ds"));
                        array.addWithZPairNoCopy(new ZPair("image/x-cmu-raster", "ras"));
                        array.addWithZPairNoCopy(new ZPair("image/x-cmx", "cmx"));
                        array.addWithZPairNoCopy(new ZPair("image/x-freehand", "fh"));
                        array.addWithZPairNoCopy(new ZPair("image/x-icon", "ico"));
                        array.addWithZPairNoCopy(new ZPair("image/x-mrsid-image", "sid"));
                        array.addWithZPairNoCopy(new ZPair("image/x-pcx", "pcx"));
                        array.addWithZPairNoCopy(new ZPair("image/x-pict", "pic"));
                        array.addWithZPairNoCopy(new ZPair("image/x-portable-anymap", "pnm"));
                        array.addWithZPairNoCopy(new ZPair("image/x-portable-bitmap", "pbm"));
                        array.addWithZPairNoCopy(new ZPair("image/x-portable-graymap", "pgm"));
                        array.addWithZPairNoCopy(new ZPair("image/x-portable-pixmap", "ppm"));
                        array.addWithZPairNoCopy(new ZPair("image/x-rgb", "rgb"));
                        array.addWithZPairNoCopy(new ZPair("image/x-tga", "tga"));
                        array.addWithZPairNoCopy(new ZPair("image/x-xbitmap", "xbm"));
                        array.addWithZPairNoCopy(new ZPair("image/x-xpixmap", "xpm"));
                        array.addWithZPairNoCopy(new ZPair("image/x-xwindowdump", "xwd"));
                        array.addWithZPairNoCopy(new ZPair("message/rfc822", "eml"));
                        array.addWithZPairNoCopy(new ZPair("model/iges", "igs"));
                        array.addWithZPairNoCopy(new ZPair("model/mesh", "msh"));
                        array.addWithZPairNoCopy(new ZPair("model/vnd.collada+xml", "dae"));
                        array.addWithZPairNoCopy(new ZPair("model/vnd.dwf", "dwf"));
                        array.addWithZPairNoCopy(new ZPair("model/vnd.gdl", "gdl"));
                        array.addWithZPairNoCopy(new ZPair("model/vnd.gtw", "gtw"));
                        array.addWithZPairNoCopy(new ZPair("model/vnd.mts", "mts"));
                        array.addWithZPairNoCopy(new ZPair("model/vnd.vtu", "vtu"));
                        array.addWithZPairNoCopy(new ZPair("model/vrml", "wrl"));
                        array.addWithZPairNoCopy(new ZPair("model/x3d+binary", "x3db"));
                        array.addWithZPairNoCopy(new ZPair("model/x3d+vrml", "x3dv"));
                        array.addWithZPairNoCopy(new ZPair("model/x3d+xml", "x3d"));
                        array.addWithZPairNoCopy(new ZPair("text/cache-manifest", "appcache"));
                        array.addWithZPairNoCopy(new ZPair("text/calendar", "ics"));
                        array.addWithZPairNoCopy(new ZPair("text/css", "css"));
                        array.addWithZPairNoCopy(new ZPair("text/csv", "csv"));
                        array.addWithZPairNoCopy(new ZPair("text/html", "html"));
                        array.addWithZPairNoCopy(new ZPair("text/n3", "n3"));
                        array.addWithZPairNoCopy(new ZPair("text/plain", "txt"));
                        array.addWithZPairNoCopy(new ZPair("text/prs.lines.tag", "dsc"));
                        array.addWithZPairNoCopy(new ZPair("text/richtext", "rtx"));
                        array.addWithZPairNoCopy(new ZPair("text/rtf", "rtf"));
                        array.addWithZPairNoCopy(new ZPair("text/sgml", "sgml"));
                        array.addWithZPairNoCopy(new ZPair("text/tab-separated-values", "tsv"));
                        array.addWithZPairNoCopy(new ZPair("text/troff", "t"));
                        array.addWithZPairNoCopy(new ZPair("text/turtle", "ttl"));
                        array.addWithZPairNoCopy(new ZPair("text/uri-list", "uri"));
                        array.addWithZPairNoCopy(new ZPair("text/vcard", "vcard"));
                        array.addWithZPairNoCopy(new ZPair("text/vnd.curl", "curl"));
                        array.addWithZPairNoCopy(new ZPair("text/vnd.curl.dcurl", "dcurl"));
                        array.addWithZPairNoCopy(new ZPair("text/vnd.curl.scurl", "scurl"));
                        array.addWithZPairNoCopy(new ZPair("text/vnd.curl.mcurl", "mcurl"));
                        array.addWithZPairNoCopy(new ZPair("text/vnd.dvb.subtitle", "sub"));
                        array.addWithZPairNoCopy(new ZPair("text/vnd.fly", "fly"));
                        array.addWithZPairNoCopy(new ZPair("text/vnd.fmi.flexstor", "flx"));
                        array.addWithZPairNoCopy(new ZPair("text/vnd.graphviz", "gv"));
                        array.addWithZPairNoCopy(new ZPair("text/vnd.in3d.3dml", "3dml"));
                        array.addWithZPairNoCopy(new ZPair("text/vnd.in3d.spot", "spot"));
                        array.addWithZPairNoCopy(
                                new ZPair("text/vnd.sun.j2me.app-descriptor", "jad"));
                        array.addWithZPairNoCopy(new ZPair("text/vnd.wap.wml", "wml"));
                        array.addWithZPairNoCopy(new ZPair("text/vnd.wap.wmlscript", "wmls"));
                        array.addWithZPairNoCopy(new ZPair("text/vtt", "vtt"));
                        array.addWithZPairNoCopy(new ZPair("text/x-asm", "s"));
                        array.addWithZPairNoCopy(new ZPair("text/x-c", "c"));
                        array.addWithZPairNoCopy(new ZPair("text/x-fortran", "f"));
                        array.addWithZPairNoCopy(new ZPair("text/x-pascal", "p"));
                        array.addWithZPairNoCopy(new ZPair("text/x-java-source", "java"));
                        array.addWithZPairNoCopy(new ZPair("text/x-opml", "opml"));
                        array.addWithZPairNoCopy(new ZPair("text/x-nfo", "nfo"));
                        array.addWithZPairNoCopy(new ZPair("text/x-setext", "etx"));
                        array.addWithZPairNoCopy(new ZPair("text/x-sfv", "sfv"));
                        array.addWithZPairNoCopy(new ZPair("text/x-uuencode", "uu"));
                        array.addWithZPairNoCopy(new ZPair("text/x-vcalendar", "vcs"));
                        array.addWithZPairNoCopy(new ZPair("text/x-vcard", "vcf"));
                        array.addWithZPairNoCopy(new ZPair("video/3gpp", "3gp"));
                        array.addWithZPairNoCopy(new ZPair("video/3gpp2", "3g2"));
                        array.addWithZPairNoCopy(new ZPair("video/h261", "h261"));
                        array.addWithZPairNoCopy(new ZPair("video/h263", "h263"));
                        array.addWithZPairNoCopy(new ZPair("video/h264", "h264"));
                        array.addWithZPairNoCopy(new ZPair("video/jpeg", "jpgv"));
                        array.addWithZPairNoCopy(new ZPair("video/jpm", "jpm"));
                        array.addWithZPairNoCopy(new ZPair("video/mj2", "mj2"));
                        array.addWithZPairNoCopy(new ZPair("video/mp4", "mp4"));
                        array.addWithZPairNoCopy(new ZPair("video/mpeg", "mpeg"));
                        array.addWithZPairNoCopy(new ZPair("video/ogg", "ogv"));
                        array.addWithZPairNoCopy(new ZPair("video/quicktime", "qt"));
                        array.addWithZPairNoCopy(new ZPair("video/vnd.dece.hd", "uvh"));
                        array.addWithZPairNoCopy(new ZPair("video/vnd.dece.mobile", "uvm"));
                        array.addWithZPairNoCopy(new ZPair("video/vnd.dece.pd", "uvp"));
                        array.addWithZPairNoCopy(new ZPair("video/vnd.dece.sd", "uvs"));
                        array.addWithZPairNoCopy(new ZPair("video/vnd.dece.video", "uvv"));
                        array.addWithZPairNoCopy(new ZPair("video/vnd.dvb.file", "dvb"));
                        array.addWithZPairNoCopy(new ZPair("video/vnd.fvt", "fvt"));
                        array.addWithZPairNoCopy(new ZPair("video/vnd.mpegurl", "mxu"));
                        array.addWithZPairNoCopy(
                                new ZPair("video/vnd.ms-playready.media.pyv", "pyv"));
                        array.addWithZPairNoCopy(new ZPair("video/vnd.uvvu.mp4", "uvu"));
                        array.addWithZPairNoCopy(new ZPair("video/vnd.vivo", "viv"));
                        array.addWithZPairNoCopy(new ZPair("video/webm", "webm"));
                        array.addWithZPairNoCopy(new ZPair("video/x-f4v", "f4v"));
                        array.addWithZPairNoCopy(new ZPair("video/x-fli", "fli"));
                        array.addWithZPairNoCopy(new ZPair("video/x-flv", "flv"));
                        array.addWithZPairNoCopy(new ZPair("video/x-m4v", "m4v"));
                        array.addWithZPairNoCopy(new ZPair("video/x-matroska", "mkv"));
                        array.addWithZPairNoCopy(new ZPair("video/x-mng", "mng"));
                        array.addWithZPairNoCopy(new ZPair("video/x-ms-asf", "asf"));
                        array.addWithZPairNoCopy(new ZPair("video/x-ms-vob", "vob"));
                        array.addWithZPairNoCopy(new ZPair("video/x-ms-wm", "wm"));
                        array.addWithZPairNoCopy(new ZPair("video/x-ms-wmv", "wmv"));
                        array.addWithZPairNoCopy(new ZPair("video/x-ms-wmx", "wmx"));
                        array.addWithZPairNoCopy(new ZPair("video/x-ms-wvx", "wvx"));
                        array.addWithZPairNoCopy(new ZPair("video/x-msvideo", "avi"));
                        array.addWithZPairNoCopy(new ZPair("video/x-sgi-movie", "movie"));
                        array.addWithZPairNoCopy(new ZPair("video/x-smv", "smv"));
                        array.addWithZPairNoCopy(new ZPair("x-conference/x-cooltalk", "ice"));
                    });

    public MimeTypeExtensionGuesser(RuntimeEnv env, Object... args) {
        super(env);
    }

    public MimeTypeExtensionGuesser(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mimeType")
    public Object guess(RuntimeEnv env, Object... args) {
        Object mimeType = assignParameter(args, 0, false);
        return ZVal.assign(
                arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "defaultExtensions", env),
                                env,
                                mimeType)
                        ? new ReferenceClassProperty(this, "defaultExtensions", env)
                                .arrayGet(env, mimeType)
                        : ZVal.getNull());
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpFoundation\\File\\MimeType\\MimeTypeExtensionGuesser";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "Symfony\\Component\\HttpFoundation\\File\\MimeType\\MimeTypeExtensionGuesser")
                    .setLookup(
                            MimeTypeExtensionGuesser.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("defaultExtensions")
                    .setFilename(
                            "vendor/symfony/http-foundation/File/MimeType/MimeTypeExtensionGuesser.php")
                    .addInterface(
                            "Symfony\\Component\\HttpFoundation\\File\\MimeType\\ExtensionGuesserInterface")
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
