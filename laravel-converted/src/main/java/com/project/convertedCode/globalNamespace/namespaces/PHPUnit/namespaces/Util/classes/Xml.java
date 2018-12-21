package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeClasses.dom.DOMElement;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.functions.mb_convert_encoding;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.nativeFunctions.file.function_getcwd;
import com.runtimeconverter.runtime.nativeFunctions.file.function_chdir;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.dom.DOMCharacterData;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.dom.DOMDocument;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_error_reporting;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Exception;
import com.runtimeconverter.runtime.nativeClasses.dom.DOMText;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/Xml.php

*/

public final class Xml extends RuntimeClassBase {

    public Xml(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Xml(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "PHPUnit\\Util\\Xml";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "actual")
        @ConvertedParameter(
            index = 1,
            name = "isHtml",
            typeHint = "bool",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        @ConvertedParameter(index = 2, name = "filename", typeHint = "string")
        @ConvertedParameter(
            index = 3,
            name = "xinclude",
            typeHint = "bool",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 4,
            name = "strict",
            typeHint = "bool",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        public Object load(RuntimeEnv env, Object... args) {
            Object actual = assignParameter(args, 0, false);
            Object isHtml = assignParameter(args, 1, true);
            if (null == isHtml) {
                isHtml = false;
            }
            Object filename = assignParameter(args, 2, true);
            if (null == filename) {
                filename = "";
            }
            Object xinclude = assignParameter(args, 3, true);
            if (null == xinclude) {
                xinclude = false;
            }
            Object strict = assignParameter(args, 4, true);
            if (null == strict) {
                strict = false;
            }
            Object loaded = null;
            Object cwd = null;
            Object internal = null;
            Object document = null;
            Object message = null;
            Object error = null;
            Object reporting = null;
            if (ZVal.isTrue(ZVal.checkInstanceType(actual, DOMDocument.class, "DOMDocument"))) {
                return ZVal.assign(actual);
            }

            if (!function_is_string.f.env(env).call(actual).getBool()) {
                throw ZVal.getException(
                        env,
                        new Exception(
                                env,
                                "Could not load XML from "
                                        + toStringR(
                                                NamespaceGlobal.gettype
                                                        .env(env)
                                                        .call(actual)
                                                        .value(),
                                                env)));
            }

            if (ZVal.strictEqualityCheck(actual, "===", "")) {
                throw ZVal.getException(
                        env, new Exception(env, "Could not load XML from empty string"));
            }

            if (ZVal.isTrue(xinclude)) {
                cwd = function_getcwd.f.env(env).call().value();
                function_chdir
                        .f
                        .env(env)
                        .call(function_dirname.f.env(env).call(filename).value())
                        .value();
            }

            document = new DOMDocument(env);
            toObjectR(document).accessProp(this, env).name("preserveWhiteSpace").set(false);
            internal = NamespaceGlobal.libxml_use_internal_errors.env(env).call(true).value();
            message = "";
            reporting = function_error_reporting.f.env(env).call(0).value();
            if (ZVal.strictNotEqualityCheck(filename, "!==", "")) {
                toObjectR(document).accessProp(this, env).name("documentURI").set(filename);
            }

            if (ZVal.isTrue(isHtml)) {
                loaded = env.callMethod(document, "loadHTML", Xml.class, actual);

            } else {
                loaded = env.callMethod(document, "loadXML", Xml.class, actual);
            }

            if (ZVal.toBool(!ZVal.isTrue(isHtml)) && ZVal.toBool(xinclude)) {
                env.callMethod(document, "xinclude", Xml.class);
            }

            for (ZPair zpairResult1331 :
                    ZVal.getIterable(
                            NamespaceGlobal.libxml_get_errors.env(env).call().value(), env, true)) {
                error = ZVal.assign(zpairResult1331.getValue());
                message =
                        toStringR(message, env)
                                + "\n"
                                + toStringR(
                                        toObjectR(error)
                                                .accessProp(this, env)
                                                .name("message")
                                                .value(),
                                        env);
            }

            NamespaceGlobal.libxml_use_internal_errors.env(env).call(internal);
            function_error_reporting.f.env(env).call(reporting);
            if (ZVal.isset(cwd)) {
                function_chdir.f.env(env).call(cwd).value();
            }

            if (ZVal.toBool(ZVal.strictEqualityCheck(loaded, "===", false))
                    || ZVal.toBool(
                            ZVal.toBool(strict)
                                    && ZVal.toBool(
                                            ZVal.strictNotEqualityCheck(message, "!==", "")))) {
                if (ZVal.strictNotEqualityCheck(filename, "!==", "")) {
                    throw ZVal.getException(
                            env,
                            new Exception(
                                    env,
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "Could not load \"%s\".%s",
                                                    filename,
                                                    ZVal.strictNotEqualityCheck(message, "!==", "")
                                                            ? "\n" + toStringR(message, env)
                                                            : "")
                                            .value()));
                }

                if (ZVal.strictEqualityCheck(message, "===", "")) {
                    message = "Could not load XML for unknown reason";
                }

                throw ZVal.getException(env, new Exception(env, message));
            }

            return ZVal.assign(document);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "filename", typeHint = "string")
        @ConvertedParameter(
            index = 1,
            name = "isHtml",
            typeHint = "bool",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 2,
            name = "xinclude",
            typeHint = "bool",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 3,
            name = "strict",
            typeHint = "bool",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        public Object loadFile(RuntimeEnv env, Object... args) {
            Object filename = assignParameter(args, 0, false);
            Object isHtml = assignParameter(args, 1, true);
            if (null == isHtml) {
                isHtml = false;
            }
            Object xinclude = assignParameter(args, 2, true);
            if (null == xinclude) {
                xinclude = false;
            }
            Object strict = assignParameter(args, 3, true);
            if (null == strict) {
                strict = false;
            }
            Object contents = null;
            Object reporting = null;
            reporting = function_error_reporting.f.env(env).call(0).value();
            contents = function_file_get_contents.f.env(env).call(filename).value();
            function_error_reporting.f.env(env).call(reporting);
            if (ZVal.strictEqualityCheck(contents, "===", false)) {
                throw ZVal.getException(
                        env,
                        new Exception(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call("Could not read \"%s\".", filename)
                                        .value()));
            }

            return ZVal.assign(
                    runtimeStaticObject.load(env, contents, isHtml, filename, xinclude, strict));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "node", typeHint = "DOMNode")
        public Object removeCharacterDataNodes(RuntimeEnv env, Object... args) {
            Object node = assignParameter(args, 0, false);
            ReferenceContainer i = new BasicReferenceContainer(null);
            Object child = null;
            if (ZVal.isTrue(env.callMethod(node, "hasChildNodes", Xml.class))) {
                for (i.setObject(
                                ZVal.subtract(
                                        toObjectR(node)
                                                .accessProp(this, env)
                                                .name("childNodes")
                                                .getObject()
                                                .accessProp(this, env)
                                                .name("length")
                                                .value(),
                                        1));
                        ZVal.isGreaterThanOrEqualTo(i.getObject(), ">=", 0);
                        i.setObject(ZVal.decrement(i.getObject()))) {
                    if (ZVal.isTrue(
                            ZVal.checkInstanceType(
                                    child =
                                            env.callMethod(
                                                    toObjectR(node)
                                                            .accessProp(this, env)
                                                            .name("childNodes")
                                                            .value(),
                                                    "item",
                                                    Xml.class,
                                                    i.getObject()),
                                    DOMCharacterData.class,
                                    "DOMCharacterData"))) {
                        env.callMethod(node, "removeChild", Xml.class, child);
                    }
                }
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "string", typeHint = "string")
        public Object prepareString(RuntimeEnv env, Object... args) {
            Object string = assignParameter(args, 0, false);
            return ZVal.assign(
                    function_preg_replace
                            .f
                            .env(env)
                            .call(
                                    "/[\\x00-\\x08\\x0b\\x0c\\x0e-\\x1f\\x7f]/",
                                    "",
                                    NamespaceGlobal.htmlspecialchars
                                            .env(env)
                                            .call(runtimeStaticObject.convertToUtf8(env, string), 3)
                                            .value())
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "element", typeHint = "DOMElement")
        public Object xmlToVariable(RuntimeEnv env, Object... args) {
            int runtimeConverterBreakCount;
            int runtimeConverterContinueCount;
            Object element = assignParameter(args, 0, false);
            Object entry = null;
            Object item = null;
            Object argument = null;
            ReferenceContainer constructorArgs = new BasicReferenceContainer(null);
            ReferenceContainer variable = new BasicReferenceContainer(null);
            Object className = null;
            Object arguments = null;
            Object value = null;
            Object _pClass = null;
            variable.setObject(ZVal.getNull());
            switch (toStringR(toObjectR(element).accessProp(this, env).name("tagName").value())) {
                case "array":
                    variable.setObject(ZVal.newArray());
                    runtimeConverterBreakCount = 0;
                    runtimeConverterContinueCount = 0;
                    for (ZPair zpairResult1332 :
                            ZVal.getIterable(
                                    toObjectR(element)
                                            .accessProp(this, env)
                                            .name("childNodes")
                                            .value(),
                                    env,
                                    true)) {
                        entry = ZVal.assign(zpairResult1332.getValue());
                        if (ZVal.toBool(
                                        !ZVal.isTrue(
                                                ZVal.checkInstanceType(
                                                        entry, DOMElement.class, "DOMElement")))
                                || ZVal.toBool(
                                        ZVal.strictNotEqualityCheck(
                                                toObjectR(entry)
                                                        .accessProp(this, env)
                                                        .name("tagName")
                                                        .value(),
                                                "!==",
                                                "element"))) {
                            continue;
                        }

                        item =
                                env.callMethod(
                                        toObjectR(entry)
                                                .accessProp(this, env)
                                                .name("childNodes")
                                                .value(),
                                        "item",
                                        Xml.class,
                                        0);
                        if (ZVal.isTrue(ZVal.checkInstanceType(item, DOMText.class, "DOMText"))) {
                            item =
                                    env.callMethod(
                                            toObjectR(entry)
                                                    .accessProp(this, env)
                                                    .name("childNodes")
                                                    .value(),
                                            "item",
                                            Xml.class,
                                            1);
                        }

                        value = runtimeStaticObject.xmlToVariable(env, item);
                        if (ZVal.isTrue(env.callMethod(entry, "hasAttribute", Xml.class, "key"))) {
                            variable.arrayAccess(
                                            env,
                                            toStringR(
                                                    env.callMethod(
                                                            entry,
                                                            "getAttribute",
                                                            Xml.class,
                                                            "key"),
                                                    env))
                                    .set(value);

                        } else {
                            variable.arrayAppend(env).set(value);
                        }
                    }

                    break;
                case "object":
                    className = env.callMethod(element, "getAttribute", Xml.class, "class");
                    if (ZVal.isTrue(env.callMethod(element, "hasChildNodes", Xml.class))) {
                        arguments =
                                ZVal.assign(
                                        toObjectR(
                                                        env.callMethod(
                                                                toObjectR(element)
                                                                        .accessProp(this, env)
                                                                        .name("childNodes")
                                                                        .value(),
                                                                "item",
                                                                Xml.class,
                                                                0))
                                                .accessProp(this, env)
                                                .name("childNodes")
                                                .value());
                        constructorArgs.setObject(ZVal.newArray());
                        runtimeConverterBreakCount = 0;
                        runtimeConverterContinueCount = 0;
                        for (ZPair zpairResult1333 : ZVal.getIterable(arguments, env, true)) {
                            argument = ZVal.assign(zpairResult1333.getValue());
                            if (ZVal.isTrue(
                                    ZVal.checkInstanceType(
                                            argument, DOMElement.class, "DOMElement"))) {
                                constructorArgs
                                        .arrayAppend(env)
                                        .set(runtimeStaticObject.xmlToVariable(env, argument));
                            }
                        }

                        _pClass = new ReflectionClass(env, className);
                        variable.setObject(
                                env.callMethod(
                                        _pClass,
                                        "newInstanceArgs",
                                        Xml.class,
                                        constructorArgs.getObject()));

                    } else {
                        variable.setObject(env.createNew(className));
                    }

                    break;
                case "boolean":
                    variable.setObject(
                            ZVal.strictEqualityCheck(
                                    toObjectR(element)
                                            .accessProp(this, env)
                                            .name("textContent")
                                            .value(),
                                    "===",
                                    "true"));
                    break;
                case "integer":
                case "double":
                case "string":
                    variable.setObject(
                            ZVal.assign(
                                    toObjectR(element)
                                            .accessProp(this, env)
                                            .name("textContent")
                                            .value()));
                    NamespaceGlobal.settype
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithReferences().add(0, variable))
                            .call(
                                    variable.getObject(),
                                    toObjectR(element)
                                            .accessProp(this, env)
                                            .name("tagName")
                                            .value());
                    break;
            }
            ;
            return ZVal.assign(variable.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "string", typeHint = "string")
        private Object convertToUtf8(RuntimeEnv env, Object... args) {
            Object string = assignParameter(args, 0, false);
            if (!ZVal.isTrue(runtimeStaticObject.isUtf8(env, string))) {
                string = mb_convert_encoding.f.env(env).call(string, "UTF-8").value();
            }

            return ZVal.assign(string);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "string", typeHint = "string")
        private Object isUtf8(RuntimeEnv env, Object... args) {
            ReferenceContainer string =
                    new BasicReferenceContainer(assignParameter(args, 0, false));
            Object length = null;
            ReferenceContainer i = new BasicReferenceContainer(null);
            ReferenceContainer j = new BasicReferenceContainer(null);
            Object n = null;
            length = function_strlen.f.env(env).call(string.getObject()).value();
            for (i.setObject(0);
                    ZVal.isLessThan(i.getObject(), '<', length);
                    i.setObject(ZVal.increment(i.getObject()))) {
                if (ZVal.isLessThan(
                        NamespaceGlobal.ord
                                .env(env)
                                .call(string.arrayGet(env, i.getObject()))
                                .value(),
                        '<',
                        128)) {
                    n = 0;

                } else if (ZVal.strictEqualityCheck(
                        ZVal.toLong(
                                        NamespaceGlobal.ord
                                                .env(env)
                                                .call(string.arrayGet(env, i.getObject()))
                                                .value())
                                & ZVal.toLong(224),
                        "===",
                        192)) {
                    n = 1;

                } else if (ZVal.strictEqualityCheck(
                        ZVal.toLong(
                                        NamespaceGlobal.ord
                                                .env(env)
                                                .call(string.arrayGet(env, i.getObject()))
                                                .value())
                                & ZVal.toLong(240),
                        "===",
                        224)) {
                    n = 2;

                } else if (ZVal.strictEqualityCheck(
                        ZVal.toLong(
                                        NamespaceGlobal.ord
                                                .env(env)
                                                .call(string.arrayGet(env, i.getObject()))
                                                .value())
                                & ZVal.toLong(240),
                        "===",
                        240)) {
                    n = 3;

                } else {
                    return ZVal.assign(false);
                }

                for (j.setObject(0);
                        ZVal.isLessThan(j.getObject(), '<', n);
                        j.setObject(ZVal.increment(j.getObject()))) {
                    if (ZVal.toBool(ZVal.strictEqualityCheck(ZVal.preIncrement(i), "===", length))
                            || ZVal.toBool(
                                    ZVal.strictNotEqualityCheck(
                                            ZVal.toLong(
                                                            NamespaceGlobal.ord
                                                                    .env(env)
                                                                    .call(
                                                                            string.arrayGet(
                                                                                    env,
                                                                                    i.getObject()))
                                                                    .value())
                                                    & ZVal.toLong(192),
                                            "!==",
                                            128))) {
                        return ZVal.assign(false);
                    }
                }
            }

            return ZVal.assign(true);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\Xml")
                    .setLookup(
                            Xml.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/phpunit/src/Util/Xml.php")
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
