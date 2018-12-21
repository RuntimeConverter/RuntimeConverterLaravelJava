package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Dumper.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.otherProxyClasses.Locale;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Exception.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeInterfaces.Traversable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeClasses.dom.DOMDocument;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Dumper.classes.FileDumper;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/Dumper/XliffFileDumper.php

*/

public class XliffFileDumper extends FileDumper {

    public XliffFileDumper(RuntimeEnv env, Object... args) {
        super(env);
    }

    public XliffFileDumper(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "messages",
        typeHint = "Symfony\\Component\\Translation\\MessageCatalogue"
    )
    @ConvertedParameter(index = 1, name = "domain")
    @ConvertedParameter(
        index = 2,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object formatCatalogue(RuntimeEnv env, Object... args) {
        Object messages = assignParameter(args, 0, false);
        Object domain = assignParameter(args, 1, false);
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 2, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        Object defaultLocale = null;
        Object xliffVersion = null;
        xliffVersion = "1.2";
        if (function_array_key_exists
                .f
                .env(env)
                .call("xliff_version", options.getObject())
                .getBool()) {
            xliffVersion = ZVal.assign(options.arrayGet(env, "xliff_version"));
        }

        if (function_array_key_exists
                .f
                .env(env)
                .call("default_locale", options.getObject())
                .getBool()) {
            defaultLocale = ZVal.assign(options.arrayGet(env, "default_locale"));

        } else {
            defaultLocale = Locale.runtimeStaticObject.getDefault(env);
        }

        if (ZVal.strictEqualityCheck("1.2", "===", xliffVersion)) {
            return ZVal.assign(
                    this.dumpXliff1(env, defaultLocale, messages, domain, options.getObject()));
        }

        if (ZVal.strictEqualityCheck("2.0", "===", xliffVersion)) {
            return ZVal.assign(
                    this.dumpXliff2(env, defaultLocale, messages, domain, options.getObject()));
        }

        throw ZVal.getException(
                env,
                new InvalidArgumentException(
                        env,
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "No support implemented for dumping XLIFF version \"%s\".",
                                        xliffVersion)
                                .value()));
    }

    @ConvertedMethod
    protected Object getExtension(RuntimeEnv env, Object... args) {
        return "xlf";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "defaultLocale")
    @ConvertedParameter(
        index = 1,
        name = "messages",
        typeHint = "Symfony\\Component\\Translation\\MessageCatalogue"
    )
    @ConvertedParameter(index = 2, name = "domain")
    @ConvertedParameter(
        index = 3,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    private Object dumpXliff1(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object defaultLocale = assignParameter(args, 0, false);
        Object messages = assignParameter(args, 1, false);
        Object domain = assignParameter(args, 2, false);
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 3, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        ReferenceContainer note = new BasicReferenceContainer(null);
        ReferenceContainer metadata = new BasicReferenceContainer(null);
        Object dom = null;
        Object source = null;
        Object id = null;
        Object text = null;
        Object value = null;
        Object targetElement = null;
        Object xliffFile = null;
        Object n = null;
        Object target = null;
        Object s = null;
        Object t = null;
        Object xliff = null;
        Object translation = null;
        Object name = null;
        Object xliffTool = null;
        Object xliffHead = null;
        Object xliffBody = null;
        Object toolInfo = null;
        toolInfo =
                ZVal.newArray(new ZPair("tool-id", "symfony"), new ZPair("tool-name", "Symfony"));
        if (function_array_key_exists.f.env(env).call("tool_info", options.getObject()).getBool()) {
            toolInfo =
                    function_array_merge
                            .f
                            .env(env)
                            .call(toolInfo, options.arrayGet(env, "tool_info"))
                            .value();
        }

        dom = new DOMDocument(env, "1.0", "utf-8");
        toObjectR(dom).accessProp(this, env).name("formatOutput").set(true);
        xliff =
                env.callMethod(
                        dom,
                        "appendChild",
                        XliffFileDumper.class,
                        env.callMethod(dom, "createElement", XliffFileDumper.class, "xliff"));
        env.callMethod(xliff, "setAttribute", XliffFileDumper.class, "version", "1.2");
        env.callMethod(
                xliff,
                "setAttribute",
                XliffFileDumper.class,
                "xmlns",
                "urn:oasis:names:tc:xliff:document:1.2");
        xliffFile =
                env.callMethod(
                        xliff,
                        "appendChild",
                        XliffFileDumper.class,
                        env.callMethod(dom, "createElement", XliffFileDumper.class, "file"));
        env.callMethod(
                xliffFile,
                "setAttribute",
                XliffFileDumper.class,
                "source-language",
                function_str_replace.f.env(env).call("_", "-", defaultLocale).value());
        env.callMethod(
                xliffFile,
                "setAttribute",
                XliffFileDumper.class,
                "target-language",
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                "_",
                                "-",
                                env.callMethod(messages, "getLocale", XliffFileDumper.class))
                        .value());
        env.callMethod(xliffFile, "setAttribute", XliffFileDumper.class, "datatype", "plaintext");
        env.callMethod(xliffFile, "setAttribute", XliffFileDumper.class, "original", "file.ext");
        xliffHead =
                env.callMethod(
                        xliffFile,
                        "appendChild",
                        XliffFileDumper.class,
                        env.callMethod(dom, "createElement", XliffFileDumper.class, "header"));
        xliffTool =
                env.callMethod(
                        xliffHead,
                        "appendChild",
                        XliffFileDumper.class,
                        env.callMethod(dom, "createElement", XliffFileDumper.class, "tool"));
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult2125 : ZVal.getIterable(toolInfo, env, false)) {
            id = ZVal.assign(zpairResult2125.getKey());
            value = ZVal.assign(zpairResult2125.getValue());
            env.callMethod(xliffTool, "setAttribute", XliffFileDumper.class, id, value);
        }

        xliffBody =
                env.callMethod(
                        xliffFile,
                        "appendChild",
                        XliffFileDumper.class,
                        env.callMethod(dom, "createElement", XliffFileDumper.class, "body"));
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult2126 :
                ZVal.getIterable(
                        env.callMethod(messages, "all", XliffFileDumper.class, domain),
                        env,
                        false)) {
            source = ZVal.assign(zpairResult2126.getKey());
            target = ZVal.assign(zpairResult2126.getValue());
            translation = env.callMethod(dom, "createElement", XliffFileDumper.class, "trans-unit");
            env.callMethod(
                    translation,
                    "setAttribute",
                    XliffFileDumper.class,
                    "id",
                    NamespaceGlobal.strtr
                            .env(env)
                            .call(
                                    function_substr
                                            .f
                                            .env(env)
                                            .call(
                                                    NamespaceGlobal.base64_encode
                                                            .env(env)
                                                            .call(
                                                                    NamespaceGlobal.hash
                                                                            .env(env)
                                                                            .call(
                                                                                    "sha256",
                                                                                    source, true)
                                                                            .value())
                                                            .value(),
                                                    0,
                                                    7)
                                            .value(),
                                    "/+",
                                    "._")
                            .value());
            env.callMethod(translation, "setAttribute", XliffFileDumper.class, "resname", source);
            s =
                    env.callMethod(
                            translation,
                            "appendChild",
                            XliffFileDumper.class,
                            env.callMethod(dom, "createElement", XliffFileDumper.class, "source"));
            env.callMethod(
                    s,
                    "appendChild",
                    XliffFileDumper.class,
                    env.callMethod(dom, "createTextNode", XliffFileDumper.class, source));
            text =
                    ZVal.assign(
                            ZVal.strictEqualityCheck(
                                            1,
                                            "===",
                                            function_preg_match
                                                    .f
                                                    .env(env)
                                                    .call("/[&<>]/", target)
                                                    .value())
                                    ? env.callMethod(
                                            dom,
                                            "createCDATASection",
                                            XliffFileDumper.class,
                                            target)
                                    : env.callMethod(
                                            dom, "createTextNode", XliffFileDumper.class, target));
            targetElement = env.callMethod(dom, "createElement", XliffFileDumper.class, "target");
            metadata.setObject(
                    env.callMethod(messages, "getMetadata", XliffFileDumper.class, source, domain));
            if (ZVal.isTrue(
                    this.hasMetadataArrayInfo(env, "target-attributes", metadata.getObject()))) {
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult2127 :
                        ZVal.getIterable(metadata.arrayGet(env, "target-attributes"), env, false)) {
                    name = ZVal.assign(zpairResult2127.getKey());
                    value = ZVal.assign(zpairResult2127.getValue());
                    env.callMethod(
                            targetElement, "setAttribute", XliffFileDumper.class, name, value);
                }
            }

            t = env.callMethod(translation, "appendChild", XliffFileDumper.class, targetElement);
            env.callMethod(t, "appendChild", XliffFileDumper.class, text);
            if (ZVal.isTrue(this.hasMetadataArrayInfo(env, "notes", metadata.getObject()))) {
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult2128 :
                        ZVal.getIterable(metadata.arrayGet(env, "notes"), env, true)) {
                    note.setObject(ZVal.assign(zpairResult2128.getValue()));
                    if (!arrayActionR(ArrayAction.ISSET, note, env, "content")) {
                        continue;
                    }

                    n =
                            env.callMethod(
                                    translation,
                                    "appendChild",
                                    XliffFileDumper.class,
                                    env.callMethod(
                                            dom, "createElement", XliffFileDumper.class, "note"));
                    env.callMethod(
                            n,
                            "appendChild",
                            XliffFileDumper.class,
                            env.callMethod(
                                    dom,
                                    "createTextNode",
                                    XliffFileDumper.class,
                                    note.arrayGet(env, "content")));
                    if (arrayActionR(ArrayAction.ISSET, note, env, "priority")) {
                        env.callMethod(
                                n,
                                "setAttribute",
                                XliffFileDumper.class,
                                "priority",
                                note.arrayGet(env, "priority"));
                    }

                    if (arrayActionR(ArrayAction.ISSET, note, env, "from")) {
                        env.callMethod(
                                n,
                                "setAttribute",
                                XliffFileDumper.class,
                                "from",
                                note.arrayGet(env, "from"));
                    }
                }
            }

            env.callMethod(xliffBody, "appendChild", XliffFileDumper.class, translation);
        }

        return ZVal.assign(env.callMethod(dom, "saveXML", XliffFileDumper.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "defaultLocale")
    @ConvertedParameter(
        index = 1,
        name = "messages",
        typeHint = "Symfony\\Component\\Translation\\MessageCatalogue"
    )
    @ConvertedParameter(index = 2, name = "domain")
    @ConvertedParameter(
        index = 3,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    private Object dumpXliff2(RuntimeEnv env, Object... args) {
        Object defaultLocale = assignParameter(args, 0, false);
        Object messages = assignParameter(args, 1, false);
        Object domain = assignParameter(args, 2, false);
        Object options = assignParameter(args, 3, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        ReferenceContainer note = new BasicReferenceContainer(null);
        ReferenceContainer metadata = new BasicReferenceContainer(null);
        Object dom = null;
        Object source = null;
        Object n = null;
        Object target = null;
        Object notesElement = null;
        Object s = null;
        Object t = null;
        Object segment = null;
        Object xliff = null;
        Object translation = null;
        Object name = null;
        Object text = null;
        Object value = null;
        Object targetElement = null;
        Object xliffFile = null;
        dom = new DOMDocument(env, "1.0", "utf-8");
        toObjectR(dom).accessProp(this, env).name("formatOutput").set(true);
        xliff =
                env.callMethod(
                        dom,
                        "appendChild",
                        XliffFileDumper.class,
                        env.callMethod(dom, "createElement", XliffFileDumper.class, "xliff"));
        env.callMethod(
                xliff,
                "setAttribute",
                XliffFileDumper.class,
                "xmlns",
                "urn:oasis:names:tc:xliff:document:2.0");
        env.callMethod(xliff, "setAttribute", XliffFileDumper.class, "version", "2.0");
        env.callMethod(
                xliff,
                "setAttribute",
                XliffFileDumper.class,
                "srcLang",
                function_str_replace.f.env(env).call("_", "-", defaultLocale).value());
        env.callMethod(
                xliff,
                "setAttribute",
                XliffFileDumper.class,
                "trgLang",
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                "_",
                                "-",
                                env.callMethod(messages, "getLocale", XliffFileDumper.class))
                        .value());
        xliffFile =
                env.callMethod(
                        xliff,
                        "appendChild",
                        XliffFileDumper.class,
                        env.callMethod(dom, "createElement", XliffFileDumper.class, "file"));
        env.callMethod(
                xliffFile,
                "setAttribute",
                XliffFileDumper.class,
                "id",
                toStringR(domain, env)
                        + "."
                        + toStringR(
                                env.callMethod(messages, "getLocale", XliffFileDumper.class), env));
        for (ZPair zpairResult2129 :
                ZVal.getIterable(
                        env.callMethod(messages, "all", XliffFileDumper.class, domain),
                        env,
                        false)) {
            source = ZVal.assign(zpairResult2129.getKey());
            target = ZVal.assign(zpairResult2129.getValue());
            translation = env.callMethod(dom, "createElement", XliffFileDumper.class, "unit");
            env.callMethod(
                    translation,
                    "setAttribute",
                    XliffFileDumper.class,
                    "id",
                    NamespaceGlobal.strtr
                            .env(env)
                            .call(
                                    function_substr
                                            .f
                                            .env(env)
                                            .call(
                                                    NamespaceGlobal.base64_encode
                                                            .env(env)
                                                            .call(
                                                                    NamespaceGlobal.hash
                                                                            .env(env)
                                                                            .call(
                                                                                    "sha256",
                                                                                    source, true)
                                                                            .value())
                                                            .value(),
                                                    0,
                                                    7)
                                            .value(),
                                    "/+",
                                    "._")
                            .value());
            name = ZVal.assign(source);
            if (ZVal.isGreaterThan(function_strlen.f.env(env).call(source).value(), '>', 80)) {
                name =
                        function_substr
                                .f
                                .env(env)
                                .call(NamespaceGlobal.md5.env(env).call(source).value(), -7)
                                .value();
            }

            env.callMethod(translation, "setAttribute", XliffFileDumper.class, "name", name);
            metadata.setObject(
                    env.callMethod(messages, "getMetadata", XliffFileDumper.class, source, domain));
            if (ZVal.isTrue(this.hasMetadataArrayInfo(env, "notes", metadata.getObject()))) {
                notesElement = env.callMethod(dom, "createElement", XliffFileDumper.class, "notes");
                for (ZPair zpairResult2130 :
                        ZVal.getIterable(metadata.arrayGet(env, "notes"), env, true)) {
                    note.setObject(ZVal.assign(zpairResult2130.getValue()));
                    n = env.callMethod(dom, "createElement", XliffFileDumper.class, "note");
                    env.callMethod(
                            n,
                            "appendChild",
                            XliffFileDumper.class,
                            env.callMethod(
                                    dom,
                                    "createTextNode",
                                    XliffFileDumper.class,
                                    arrayActionR(ArrayAction.ISSET, note, env, "content")
                                            ? note.arrayGet(env, "content")
                                            : ""));
                    arrayActionR(ArrayAction.UNSET, note, env, "content");
                    for (ZPair zpairResult2131 : ZVal.getIterable(note.getObject(), env, false)) {
                        name = ZVal.assign(zpairResult2131.getKey());
                        value = ZVal.assign(zpairResult2131.getValue());
                        env.callMethod(n, "setAttribute", XliffFileDumper.class, name, value);
                    }

                    env.callMethod(notesElement, "appendChild", XliffFileDumper.class, n);
                }

                env.callMethod(translation, "appendChild", XliffFileDumper.class, notesElement);
            }

            segment =
                    env.callMethod(
                            translation,
                            "appendChild",
                            XliffFileDumper.class,
                            env.callMethod(dom, "createElement", XliffFileDumper.class, "segment"));
            s =
                    env.callMethod(
                            segment,
                            "appendChild",
                            XliffFileDumper.class,
                            env.callMethod(dom, "createElement", XliffFileDumper.class, "source"));
            env.callMethod(
                    s,
                    "appendChild",
                    XliffFileDumper.class,
                    env.callMethod(dom, "createTextNode", XliffFileDumper.class, source));
            text =
                    ZVal.assign(
                            ZVal.strictEqualityCheck(
                                            1,
                                            "===",
                                            function_preg_match
                                                    .f
                                                    .env(env)
                                                    .call("/[&<>]/", target)
                                                    .value())
                                    ? env.callMethod(
                                            dom,
                                            "createCDATASection",
                                            XliffFileDumper.class,
                                            target)
                                    : env.callMethod(
                                            dom, "createTextNode", XliffFileDumper.class, target));
            targetElement = env.callMethod(dom, "createElement", XliffFileDumper.class, "target");
            if (ZVal.isTrue(
                    this.hasMetadataArrayInfo(env, "target-attributes", metadata.getObject()))) {
                for (ZPair zpairResult2132 :
                        ZVal.getIterable(metadata.arrayGet(env, "target-attributes"), env, false)) {
                    name = ZVal.assign(zpairResult2132.getKey());
                    value = ZVal.assign(zpairResult2132.getValue());
                    env.callMethod(
                            targetElement, "setAttribute", XliffFileDumper.class, name, value);
                }
            }

            t = env.callMethod(segment, "appendChild", XliffFileDumper.class, targetElement);
            env.callMethod(t, "appendChild", XliffFileDumper.class, text);
            env.callMethod(xliffFile, "appendChild", XliffFileDumper.class, translation);
        }

        return ZVal.assign(env.callMethod(dom, "saveXML", XliffFileDumper.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "metadata",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    private Object hasMetadataArrayInfo(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        ReferenceContainer metadata = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == metadata.getObject()) {
            metadata.setObject(ZVal.getNull());
        }
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.strictNotEqualityCheck(
                                                        ZVal.getNull(),
                                                        "!==",
                                                        metadata.getObject()))
                                        && ZVal.toBool(
                                                function_array_key_exists
                                                        .f
                                                        .env(env)
                                                        .call(key, metadata.getObject())
                                                        .value()))
                        && ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.checkInstanceType(
                                                        metadata.arrayGet(env, key),
                                                        Traversable.class,
                                                        "Traversable"))
                                        || ZVal.toBool(
                                                function_is_array
                                                        .f
                                                        .env(env)
                                                        .call(metadata.arrayGet(env, key))
                                                        .value())));
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Translation\\Dumper\\XliffFileDumper";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends FileDumper.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Translation\\Dumper\\XliffFileDumper")
                    .setLookup(
                            XliffFileDumper.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("relativePathTemplate")
                    .setFilename("vendor/symfony/translation/Dumper/XliffFileDumper.php")
                    .addInterface("Symfony\\Component\\Translation\\Dumper\\DumperInterface")
                    .addExtendsClass("Symfony\\Component\\Translation\\Dumper\\FileDumper")
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
