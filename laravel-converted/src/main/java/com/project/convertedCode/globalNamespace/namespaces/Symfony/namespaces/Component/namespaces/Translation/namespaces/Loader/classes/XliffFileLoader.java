package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Loader.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.string.function_stripos;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Exception.classes.InvalidResourceException;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Exception.classes.NotFoundResourceException;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Loader.classes.LoaderInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.classes.MessageCatalogue;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/Loader/XliffFileLoader.php

*/

public class XliffFileLoader extends RuntimeClassBase implements LoaderInterface {

    public XliffFileLoader(RuntimeEnv env, Object... args) {
        super(env);
    }

    public XliffFileLoader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resource")
    @ConvertedParameter(index = 1, name = "locale")
    @ConvertedParameter(index = 2, name = "domain")
    public Object load(RuntimeEnv env, Object... args) {
        Object resource = assignParameter(args, 0, false);
        Object locale = assignParameter(args, 1, false);
        Object domain = assignParameter(args, 2, true);
        if (null == domain) {
            domain = "messages";
        }
        Object catalogue = null;
        if (!NamespaceGlobal.stream_is_local.env(env).call(resource).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidResourceException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("This is not a local file \"%s\".", resource)
                                    .value()));
        }

        if (!function_file_exists.f.env(env).call(resource).getBool()) {
            throw ZVal.getException(
                    env,
                    new NotFoundResourceException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("File \"%s\" not found.", resource)
                                    .value()));
        }

        catalogue = new MessageCatalogue(env, locale);
        this.extract(env, resource, catalogue, domain);
        if (function_class_exists
                .f
                .env(env)
                .call("Symfony\\Component\\Config\\Resource\\FileResource")
                .getBool()) {
            env.callMethod(
                    catalogue,
                    "addResource",
                    XliffFileLoader.class,
                    env.createNew(ZVal.resolveClassAlias(env, "FileResource"), resource));
        }

        return ZVal.assign(catalogue);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resource")
    @ConvertedParameter(
        index = 1,
        name = "catalogue",
        typeHint = "Symfony\\Component\\Translation\\MessageCatalogue"
    )
    @ConvertedParameter(index = 2, name = "domain")
    private Object extract(RuntimeEnv env, Object... args) {
        Object resource = assignParameter(args, 0, false);
        Object catalogue = assignParameter(args, 1, false);
        Object domain = assignParameter(args, 2, false);
        Object dom = null;
        Object e = null;
        Object xliffVersion = null;
        try {
            dom =
                    StaticMethodUtils.getStaticBaseClass(
                                    ZVal.resolveClassAlias(env, "XmlUtils"), env)
                            .callUnknownStaticMethod(
                                    env, "loadFile", new RuntimeArgsWithReferences(), resource);
        } catch (ConvertedException convertedException312) {
            if (convertedException312.instanceOf(
                    com.runtimeconverter
                            .runtime
                            .nativeClasses
                            .spl
                            .exceptions
                            .InvalidArgumentException
                            .class,
                    "InvalidArgumentException")) {
                e = convertedException312.getObject();
                throw ZVal.getException(
                        env,
                        new InvalidResourceException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Unable to load \"%s\": %s",
                                                resource,
                                                env.callMethod(
                                                        e, "getMessage", XliffFileLoader.class))
                                        .value(),
                                env.callMethod(e, "getCode", XliffFileLoader.class),
                                e));
            } else {
                throw convertedException312;
            }
        }

        xliffVersion = this.getVersionNumber(env, dom);
        this.validateSchema(env, xliffVersion, dom, this.getSchema(env, xliffVersion));
        if (ZVal.strictEqualityCheck("1.2", "===", xliffVersion)) {
            this.extractXliff1(env, dom, catalogue, domain);
        }

        if (ZVal.strictEqualityCheck("2.0", "===", xliffVersion)) {
            this.extractXliff2(env, dom, catalogue, domain);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dom", typeHint = "DOMDocument")
    @ConvertedParameter(
        index = 1,
        name = "catalogue",
        typeHint = "Symfony\\Component\\Translation\\MessageCatalogue"
    )
    @ConvertedParameter(index = 2, name = "domain", typeHint = "string")
    private Object extractXliff1(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object dom = assignParameter(args, 0, false);
        Object catalogue = assignParameter(args, 1, false);
        Object domain = assignParameter(args, 2, false);
        ReferenceContainer metadata = new BasicReferenceContainer(null);
        Object notes = null;
        Object source = null;
        Object encoding = null;
        Object target = null;
        Object xml = null;
        Object translation = null;
        ReferenceContainer attributes = new BasicReferenceContainer(null);
        Object value = null;
        Object key = null;
        xml = NamespaceGlobal.simplexml_import_dom.env(env).call(dom).value();
        encoding =
                NamespaceGlobal.strtoupper
                        .env(env)
                        .call(toObjectR(dom).accessProp(this, env).name("encoding").value())
                        .value();
        env.callMethod(
                xml,
                "registerXPathNamespace",
                XliffFileLoader.class,
                "xliff",
                "urn:oasis:names:tc:xliff:document:1.2");
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult2145 :
                ZVal.getIterable(
                        env.callMethod(xml, "xpath", XliffFileLoader.class, "//xliff:trans-unit"),
                        env,
                        true)) {
            translation = ZVal.assign(zpairResult2145.getValue());
            attributes.setObject(env.callMethod(translation, "attributes", XliffFileLoader.class));
            if (!ZVal.toBool(arrayActionR(ArrayAction.ISSET, attributes, env, "resname"))
                    || ZVal.toBool(
                            ZVal.isset(
                                    toObjectR(translation)
                                            .accessProp(this, env)
                                            .name("source")
                                            .value()))) {
                continue;
            }

            source =
                    ZVal.assign(
                            ZVal.toBool(arrayActionR(ArrayAction.ISSET, attributes, env, "resname"))
                                            && ZVal.toBool(attributes.arrayGet(env, "resname"))
                                    ? attributes.arrayGet(env, "resname")
                                    : toObjectR(translation)
                                            .accessProp(this, env)
                                            .name("source")
                                            .value());
            target =
                    this.utf8ToCharset(
                            env,
                            toStringR(
                                    ZVal.isset(
                                                    toObjectR(translation)
                                                            .accessProp(this, env)
                                                            .name("target")
                                                            .value())
                                            ? toObjectR(translation)
                                                    .accessProp(this, env)
                                                    .name("target")
                                                    .value()
                                            : source,
                                    env),
                            encoding);
            env.callMethod(
                    catalogue,
                    "set",
                    XliffFileLoader.class,
                    toStringR(source, env),
                    target,
                    domain);
            metadata.setObject(ZVal.newArray());
            if (ZVal.isTrue(
                    notes =
                            this.parseNotesMetadata(
                                    env,
                                    toObjectR(translation)
                                            .accessProp(this, env)
                                            .name("note")
                                            .value(),
                                    encoding))) {
                metadata.arrayAccess(env, "notes").set(notes);
            }

            if (ZVal.toBool(
                            ZVal.isset(
                                    toObjectR(translation)
                                            .accessProp(this, env)
                                            .name("target")
                                            .value()))
                    && ZVal.toBool(
                            env.callMethod(
                                    toObjectR(translation)
                                            .accessProp(this, env)
                                            .name("target")
                                            .value(),
                                    "attributes",
                                    XliffFileLoader.class))) {
                metadata.arrayAccess(env, "target-attributes").set(ZVal.newArray());
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult2146 :
                        ZVal.getIterable(
                                env.callMethod(
                                        toObjectR(translation)
                                                .accessProp(this, env)
                                                .name("target")
                                                .value(),
                                        "attributes",
                                        XliffFileLoader.class),
                                env,
                                false)) {
                    key = ZVal.assign(zpairResult2146.getKey());
                    value = ZVal.assign(zpairResult2146.getValue());
                    metadata.arrayAccess(env, "target-attributes", key).set(toStringR(value, env));
                }
            }

            if (arrayActionR(ArrayAction.ISSET, attributes, env, "id")) {
                metadata.arrayAccess(env, "id").set(toStringR(attributes.arrayGet(env, "id"), env));
            }

            env.callMethod(
                    catalogue,
                    "setMetadata",
                    XliffFileLoader.class,
                    toStringR(source, env),
                    metadata.getObject(),
                    domain);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dom", typeHint = "DOMDocument")
    @ConvertedParameter(
        index = 1,
        name = "catalogue",
        typeHint = "Symfony\\Component\\Translation\\MessageCatalogue"
    )
    @ConvertedParameter(index = 2, name = "domain", typeHint = "string")
    private Object extractXliff2(RuntimeEnv env, Object... args) {
        Object dom = assignParameter(args, 0, false);
        Object catalogue = assignParameter(args, 1, false);
        Object domain = assignParameter(args, 2, false);
        ReferenceContainer note = new BasicReferenceContainer(null);
        ReferenceContainer metadata = new BasicReferenceContainer(null);
        Object source = null;
        Object encoding = null;
        Object target = null;
        Object noteNode = null;
        Object unit = null;
        Object xml = null;
        Object segment = null;
        Object value = null;
        Object key = null;
        xml = NamespaceGlobal.simplexml_import_dom.env(env).call(dom).value();
        encoding =
                NamespaceGlobal.strtoupper
                        .env(env)
                        .call(toObjectR(dom).accessProp(this, env).name("encoding").value())
                        .value();
        env.callMethod(
                xml,
                "registerXPathNamespace",
                XliffFileLoader.class,
                "xliff",
                "urn:oasis:names:tc:xliff:document:2.0");
        for (ZPair zpairResult2147 :
                ZVal.getIterable(
                        env.callMethod(xml, "xpath", XliffFileLoader.class, "//xliff:unit"),
                        env,
                        true)) {
            unit = ZVal.assign(zpairResult2147.getValue());
            for (ZPair zpairResult2148 :
                    ZVal.getIterable(
                            toObjectR(unit).accessProp(this, env).name("segment").value(),
                            env,
                            true)) {
                segment = ZVal.assign(zpairResult2148.getValue());
                source =
                        ZVal.assign(
                                toObjectR(segment).accessProp(this, env).name("source").value());
                target =
                        this.utf8ToCharset(
                                env,
                                toStringR(
                                        ZVal.isset(
                                                        toObjectR(segment)
                                                                .accessProp(this, env)
                                                                .name("target")
                                                                .value())
                                                ? toObjectR(segment)
                                                        .accessProp(this, env)
                                                        .name("target")
                                                        .value()
                                                : source,
                                        env),
                                encoding);
                env.callMethod(
                        catalogue,
                        "set",
                        XliffFileLoader.class,
                        toStringR(source, env),
                        target,
                        domain);
                metadata.setObject(ZVal.newArray());
                if (ZVal.toBool(
                                ZVal.isset(
                                        toObjectR(segment)
                                                .accessProp(this, env)
                                                .name("target")
                                                .value()))
                        && ZVal.toBool(
                                env.callMethod(
                                        toObjectR(segment)
                                                .accessProp(this, env)
                                                .name("target")
                                                .value(),
                                        "attributes",
                                        XliffFileLoader.class))) {
                    metadata.arrayAccess(env, "target-attributes").set(ZVal.newArray());
                    for (ZPair zpairResult2149 :
                            ZVal.getIterable(
                                    env.callMethod(
                                            toObjectR(segment)
                                                    .accessProp(this, env)
                                                    .name("target")
                                                    .value(),
                                            "attributes",
                                            XliffFileLoader.class),
                                    env,
                                    false)) {
                        key = ZVal.assign(zpairResult2149.getKey());
                        value = ZVal.assign(zpairResult2149.getValue());
                        metadata.arrayAccess(env, "target-attributes", key)
                                .set(toStringR(value, env));
                    }
                }

                if (ZVal.isset(toObjectR(unit).accessProp(this, env).name("notes").value())) {
                    metadata.arrayAccess(env, "notes").set(ZVal.newArray());
                    for (ZPair zpairResult2150 :
                            ZVal.getIterable(
                                    toObjectR(unit)
                                            .accessProp(this, env)
                                            .name("notes")
                                            .getObject()
                                            .accessProp(this, env)
                                            .name("note")
                                            .value(),
                                    env,
                                    true)) {
                        noteNode = ZVal.assign(zpairResult2150.getValue());
                        note.setObject(ZVal.newArray());
                        for (ZPair zpairResult2151 :
                                ZVal.getIterable(
                                        env.callMethod(
                                                noteNode, "attributes", XliffFileLoader.class),
                                        env,
                                        false)) {
                            key = ZVal.assign(zpairResult2151.getKey());
                            value = ZVal.assign(zpairResult2151.getValue());
                            note.arrayAccess(env, key).set(toStringR(value, env));
                        }

                        note.arrayAccess(env, "content").set(toStringR(noteNode, env));
                        metadata.arrayAppend(env, "notes").set(note.getObject());
                    }
                }

                env.callMethod(
                        catalogue,
                        "setMetadata",
                        XliffFileLoader.class,
                        toStringR(source, env),
                        metadata.getObject(),
                        domain);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "content", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "encoding",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    private Object utf8ToCharset(RuntimeEnv env, Object... args) {
        Object content = assignParameter(args, 0, false);
        Object encoding = assignParameter(args, 1, true);
        if (null == encoding) {
            encoding = ZVal.getNull();
        }
        if (ZVal.toBool(ZVal.strictNotEqualityCheck("UTF-8", "!==", encoding))
                && ZVal.toBool(!ZVal.isEmpty(encoding))) {
            return ZVal.assign(
                    NamespaceGlobal.mb_convert_encoding
                            .env(env)
                            .call(content, encoding, "UTF-8")
                            .value());
        }

        return ZVal.assign(content);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file", typeHint = "string")
    @ConvertedParameter(index = 1, name = "dom", typeHint = "DOMDocument")
    @ConvertedParameter(index = 2, name = "schema", typeHint = "string")
    private Object validateSchema(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        Object dom = assignParameter(args, 1, false);
        Object schema = assignParameter(args, 2, false);
        Object disableEntities = null;
        Object internalErrors = null;
        internalErrors = NamespaceGlobal.libxml_use_internal_errors.env(env).call(true).value();
        disableEntities = NamespaceGlobal.libxml_disable_entity_loader.env(env).call(false).value();
        if (!ZVal.isTrue(
                env.callMethod(dom, "schemaValidateSource", XliffFileLoader.class, schema))) {
            NamespaceGlobal.libxml_disable_entity_loader.env(env).call(disableEntities);
            throw ZVal.getException(
                    env,
                    new InvalidResourceException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Invalid resource provided: \"%s\"; Errors: %s",
                                            file,
                                            NamespaceGlobal.implode
                                                    .env(env)
                                                    .call(
                                                            "\n",
                                                            this.getXmlErrors(env, internalErrors))
                                                    .value())
                                    .value()));
        }

        NamespaceGlobal.libxml_disable_entity_loader.env(env).call(disableEntities);
        env.callMethod(dom, "normalizeDocument", XliffFileLoader.class);
        NamespaceGlobal.libxml_clear_errors.env(env).call();
        NamespaceGlobal.libxml_use_internal_errors.env(env).call(internalErrors);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "xliffVersion")
    private Object getSchema(RuntimeEnv env, Object... args) {
        Object xliffVersion = assignParameter(args, 0, false);
        Object xmlUri = null;
        Object schemaSource = null;
        if (ZVal.strictEqualityCheck("1.2", "===", xliffVersion)) {
            schemaSource =
                    function_file_get_contents
                            .f
                            .env(env)
                            .call(
                                    toStringR(
                                                    env.addRootFilesystemPrefix(
                                                            "/vendor/symfony/translation/Loader"),
                                                    env)
                                            + "/schema/dic/xliff-core/xliff-core-1.2-strict.xsd")
                            .value();
            xmlUri = "http://www.w3.org/2001/xml.xsd";

        } else if (ZVal.strictEqualityCheck("2.0", "===", xliffVersion)) {
            schemaSource =
                    function_file_get_contents
                            .f
                            .env(env)
                            .call(
                                    toStringR(
                                                    env.addRootFilesystemPrefix(
                                                            "/vendor/symfony/translation/Loader"),
                                                    env)
                                            + "/schema/dic/xliff-core/xliff-core-2.0.xsd")
                            .value();
            xmlUri = "informativeCopiesOf3rdPartySchemas/w3c/xml.xsd";

        } else {
            throw ZVal.getException(
                    env,
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Symfony
                            .namespaces
                            .Component
                            .namespaces
                            .Translation
                            .namespaces
                            .Exception
                            .classes
                            .InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "No support implemented for loading XLIFF version \"%s\".",
                                            xliffVersion)
                                    .value()));
        }

        return ZVal.assign(this.fixXmlLocation(env, schemaSource, xmlUri));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "schemaSource", typeHint = "string")
    @ConvertedParameter(index = 1, name = "xmlUri", typeHint = "string")
    private Object fixXmlLocation(RuntimeEnv env, Object... args) {
        Object schemaSource = assignParameter(args, 0, false);
        Object xmlUri = assignParameter(args, 1, false);
        Object parts = null;
        Object newPath = null;
        Object drive = null;
        Object locationstart = null;
        Object tmpfile = null;
        newPath =
                toStringR(
                                function_str_replace
                                        .f
                                        .env(env)
                                        .call(
                                                "\\",
                                                "/",
                                                env.addRootFilesystemPrefix(
                                                        "/vendor/symfony/translation/Loader"))
                                        .value(),
                                env)
                        + "/schema/dic/xliff-core/xml.xsd";
        parts = function_explode.f.env(env).call("/", newPath).value();
        locationstart = "file:///";
        if (ZVal.strictEqualityCheck(
                0, "===", function_stripos.f.env(env).call(newPath, "phar://").value())) {
            tmpfile =
                    NamespaceGlobal.tempnam
                            .env(env)
                            .call(
                                    NamespaceGlobal.sys_get_temp_dir.env(env).call().value(),
                                    "symfony")
                            .value();
            if (ZVal.isTrue(tmpfile)) {
                NamespaceGlobal.copy.env(env).call(newPath, tmpfile);
                parts =
                        function_explode
                                .f
                                .env(env)
                                .call(
                                        "/",
                                        function_str_replace
                                                .f
                                                .env(env)
                                                .call("\\", "/", tmpfile)
                                                .value())
                                .value();

            } else {
                function_array_shift.f.env(env).call(parts);
                locationstart = "phar:///";
            }
        }

        drive =
                ZVal.assign(
                        ZVal.strictEqualityCheck("\\", "===", "/")
                                ? toStringR(
                                                function_array_shift.f.env(env).call(parts).value(),
                                                env)
                                        + "/"
                                : "");
        newPath =
                toStringR(locationstart, env)
                        + toStringR(drive, env)
                        + toStringR(
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(
                                                "/",
                                                function_array_map
                                                        .f
                                                        .env(env)
                                                        .call("rawurlencode", parts)
                                                        .value())
                                        .value(),
                                env);
        return ZVal.assign(
                function_str_replace.f.env(env).call(xmlUri, newPath, schemaSource).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "internalErrors", typeHint = "bool")
    private Object getXmlErrors(RuntimeEnv env, Object... args) {
        Object internalErrors = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        Object error = null;
        ReferenceContainer errors = new BasicReferenceContainer(null);
        errors.setObject(ZVal.newArray());
        for (ZPair zpairResult2152 :
                ZVal.getIterable(
                        NamespaceGlobal.libxml_get_errors.env(env).call().value(), env, true)) {
            error = ZVal.assign(zpairResult2152.getValue());
            errors.arrayAppend(env)
                    .set(
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "[%s %s] %s (in %s - line %d, column %d)",
                                            ZVal.equalityCheck(
                                                            1,
                                                            toObjectR(error)
                                                                    .accessProp(this, env)
                                                                    .name("level")
                                                                    .value())
                                                    ? "WARNING"
                                                    : "ERROR",
                                            toObjectR(error)
                                                    .accessProp(this, env)
                                                    .name("code")
                                                    .value(),
                                            function_trim
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            toObjectR(error)
                                                                    .accessProp(this, env)
                                                                    .name("message")
                                                                    .value())
                                                    .value(),
                                            ZVal.isTrue(
                                                            ternaryExpressionTemp =
                                                                    toObjectR(error)
                                                                            .accessProp(this, env)
                                                                            .name("file")
                                                                            .value())
                                                    ? ternaryExpressionTemp
                                                    : "n/a",
                                            toObjectR(error)
                                                    .accessProp(this, env)
                                                    .name("line")
                                                    .value(),
                                            toObjectR(error)
                                                    .accessProp(this, env)
                                                    .name("column")
                                                    .value())
                                    .value());
        }

        NamespaceGlobal.libxml_clear_errors.env(env).call();
        NamespaceGlobal.libxml_use_internal_errors.env(env).call(internalErrors);
        return ZVal.assign(errors.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dom", typeHint = "DOMDocument")
    private Object getVersionNumber(RuntimeEnv env, Object... args) {
        Object dom = assignParameter(args, 0, false);
        Object xliff = null;
        Object namespace = null;
        Object version = null;
        for (ZPair zpairResult2153 :
                ZVal.getIterable(
                        env.callMethod(dom, "getElementsByTagName", XliffFileLoader.class, "xliff"),
                        env,
                        true)) {
            xliff = ZVal.assign(zpairResult2153.getValue());
            version =
                    env.callMethod(
                            toObjectR(xliff).accessProp(this, env).name("attributes").value(),
                            "getNamedItem",
                            XliffFileLoader.class,
                            "version");
            if (ZVal.isTrue(version)) {
                return ZVal.assign(
                        toObjectR(version).accessProp(this, env).name("nodeValue").value());
            }

            namespace =
                    env.callMethod(
                            toObjectR(xliff).accessProp(this, env).name("attributes").value(),
                            "getNamedItem",
                            XliffFileLoader.class,
                            "xmlns");
            if (ZVal.isTrue(namespace)) {
                if (ZVal.strictNotEqualityCheck(
                        0,
                        "!==",
                        NamespaceGlobal.substr_compare
                                .env(env)
                                .call(
                                        "urn:oasis:names:tc:xliff:document:",
                                        toObjectR(namespace)
                                                .accessProp(this, env)
                                                .name("nodeValue")
                                                .value(),
                                        0,
                                        34)
                                .value())) {
                    throw ZVal.getException(
                            env,
                            new com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Symfony
                                    .namespaces
                                    .Component
                                    .namespaces
                                    .Translation
                                    .namespaces
                                    .Exception
                                    .classes
                                    .InvalidArgumentException(
                                    env,
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call("Not a valid XLIFF namespace \"%s\"", namespace)
                                            .value()));
                }

                return ZVal.assign(function_substr.f.env(env).call(namespace, 34).value());
            }
        }

        return "1.2";
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "noteElement",
        typeHint = "SimpleXMLElement",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "encoding",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    private Object parseNotesMetadata(RuntimeEnv env, Object... args) {
        Object noteElement = assignParameter(args, 0, true);
        if (null == noteElement) {
            noteElement = ZVal.getNull();
        }
        Object encoding = assignParameter(args, 1, true);
        if (null == encoding) {
            encoding = ZVal.getNull();
        }
        ReferenceContainer note = new BasicReferenceContainer(null);
        ReferenceContainer notes = new BasicReferenceContainer(null);
        Object xmlNote = null;
        ReferenceContainer noteAttributes = new BasicReferenceContainer(null);
        notes.setObject(ZVal.newArray());
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", noteElement)) {
            return ZVal.assign(notes.getObject());
        }

        for (ZPair zpairResult2154 : ZVal.getIterable(noteElement, env, true)) {
            xmlNote = ZVal.assign(zpairResult2154.getValue());
            noteAttributes.setObject(env.callMethod(xmlNote, "attributes", XliffFileLoader.class));
            note.setObject(
                    ZVal.newArray(
                            new ZPair(
                                    "content",
                                    this.utf8ToCharset(env, toStringR(xmlNote, env), encoding))));
            if (arrayActionR(ArrayAction.ISSET, noteAttributes, env, "priority")) {
                note.arrayAccess(env, "priority")
                        .set(ZVal.toLong(noteAttributes.arrayGet(env, "priority")));
            }

            if (arrayActionR(ArrayAction.ISSET, noteAttributes, env, "from")) {
                note.arrayAccess(env, "from")
                        .set(toStringR(noteAttributes.arrayGet(env, "from"), env));
            }

            notes.arrayAppend(env).set(note.getObject());
        }

        return ZVal.assign(notes.getObject());
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Translation\\Loader\\XliffFileLoader";

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
                    .setName("Symfony\\Component\\Translation\\Loader\\XliffFileLoader")
                    .setLookup(
                            XliffFileLoader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/symfony/translation/Loader/XliffFileLoader.php")
                    .addInterface("Symfony\\Component\\Translation\\Loader\\LoaderInterface")
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
