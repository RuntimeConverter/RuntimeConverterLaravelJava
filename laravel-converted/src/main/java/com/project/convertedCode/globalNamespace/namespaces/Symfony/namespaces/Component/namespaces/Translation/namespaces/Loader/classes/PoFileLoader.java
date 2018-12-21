package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Loader.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.array.function_ksort;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fopen;
import com.runtimeconverter.runtime.nativeFunctions.array.function_key;
import com.runtimeconverter.runtime.nativeFunctions.array.function_end;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Loader.classes.FileLoader;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/Loader/PoFileLoader.php

*/

public class PoFileLoader extends FileLoader {

    public PoFileLoader(RuntimeEnv env, Object... args) {
        super(env);
    }

    public PoFileLoader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resource")
    protected Object loadResource(RuntimeEnv env, Object... args) {
        Object resource = assignParameter(args, 0, false);
        ReferenceContainer item = new BasicReferenceContainer(null);
        Object defaults = null;
        Object size = null;
        Object stream = null;
        ReferenceContainer line = new BasicReferenceContainer(null);
        Object flags = null;
        Object continues = null;
        ReferenceContainer messages = new BasicReferenceContainer(null);
        stream = function_fopen.f.env(env).call(resource, "r").value();
        defaults =
                ZVal.newArray(
                        new ZPair("ids", ZVal.newArray()), new ZPair("translated", ZVal.getNull()));
        messages.setObject(ZVal.newArray());
        item.setObject(ZVal.assign(defaults));
        flags = ZVal.newArray();
        while (ZVal.isTrue(line.setObject(NamespaceGlobal.fgets.env(env).call(stream).value()))) {
            line.setObject(function_trim.f.env(env).call(line.getObject()).value());
            if (ZVal.strictEqualityCheck("", "===", line.getObject())) {
                if (!function_in_array.f.env(env).call("fuzzy", flags).getBool()) {
                    env.callMethod(
                            this,
                            new RuntimeArgsWithReferences().add(0, messages),
                            "addMessage",
                            PoFileLoader.class,
                            messages.getObject(),
                            item.getObject());
                }

                item.setObject(ZVal.assign(defaults));
                flags = ZVal.newArray();

            } else if (ZVal.strictEqualityCheck(
                    "#,", "===", function_substr.f.env(env).call(line.getObject(), 0, 2).value())) {
                flags =
                        function_array_map
                                .f
                                .env(env)
                                .call(
                                        "trim",
                                        function_explode
                                                .f
                                                .env(env)
                                                .call(
                                                        ",",
                                                        function_substr
                                                                .f
                                                                .env(env)
                                                                .call(line.getObject(), 2)
                                                                .value())
                                                .value())
                                .value();

            } else if (ZVal.strictEqualityCheck(
                    "msgid \"",
                    "===",
                    function_substr.f.env(env).call(line.getObject(), 0, 7).value())) {
                env.callMethod(
                        this,
                        new RuntimeArgsWithReferences().add(0, messages),
                        "addMessage",
                        PoFileLoader.class,
                        messages.getObject(),
                        item.getObject());
                item.setObject(ZVal.assign(defaults));
                item.arrayAccess(env, "ids", "singular")
                        .set(function_substr.f.env(env).call(line.getObject(), 7, -1).value());

            } else if (ZVal.strictEqualityCheck(
                    "msgstr \"",
                    "===",
                    function_substr.f.env(env).call(line.getObject(), 0, 8).value())) {
                item.arrayAccess(env, "translated")
                        .set(function_substr.f.env(env).call(line.getObject(), 8, -1).value());

            } else if (ZVal.strictEqualityCheck("\"", "===", line.arrayGet(env, 0))) {
                continues =
                        ZVal.assign(
                                arrayActionR(ArrayAction.ISSET, item, env, "translated")
                                        ? "translated"
                                        : "ids");
                if (function_is_array.f.env(env).call(item.arrayGet(env, continues)).getBool()) {
                    function_end.f.env(env).call(item.arrayGet(env, continues));
                    item.arrayAccess(
                                    env,
                                    continues,
                                    function_key
                                            .f
                                            .env(env)
                                            .call(item.arrayGet(env, continues))
                                            .value())
                            .set(
                                    toStringR(
                                                    item.arrayGet(
                                                            env,
                                                            continues,
                                                            function_key
                                                                    .f
                                                                    .env(env)
                                                                    .call(
                                                                            item.arrayGet(
                                                                                    env, continues))
                                                                    .value()),
                                                    env)
                                            + toStringR(
                                                    function_substr
                                                            .f
                                                            .env(env)
                                                            .call(line.getObject(), 1, -1)
                                                            .value(),
                                                    env));

                } else {
                    item.arrayAccess(env, continues)
                            .set(
                                    toStringR(item.arrayGet(env, continues), env)
                                            + toStringR(
                                                    function_substr
                                                            .f
                                                            .env(env)
                                                            .call(line.getObject(), 1, -1)
                                                            .value(),
                                                    env));
                }

            } else if (ZVal.strictEqualityCheck(
                    "msgid_plural \"",
                    "===",
                    function_substr.f.env(env).call(line.getObject(), 0, 14).value())) {
                item.arrayAccess(env, "ids", "plural")
                        .set(function_substr.f.env(env).call(line.getObject(), 14, -1).value());

            } else if (ZVal.strictEqualityCheck(
                    "msgstr[",
                    "===",
                    function_substr.f.env(env).call(line.getObject(), 0, 7).value())) {
                size = function_strpos.f.env(env).call(line.getObject(), "]").value();
                item.arrayAccess(
                                env,
                                "translated",
                                ZVal.toLong(
                                        function_substr
                                                .f
                                                .env(env)
                                                .call(line.getObject(), 7, 1)
                                                .value()))
                        .set(
                                function_substr
                                        .f
                                        .env(env)
                                        .call(line.getObject(), ZVal.add(size, 3), -1)
                                        .value());
            }
        }

        if (!function_in_array.f.env(env).call("fuzzy", flags).getBool()) {
            env.callMethod(
                    this,
                    new RuntimeArgsWithReferences().add(0, messages),
                    "addMessage",
                    PoFileLoader.class,
                    messages.getObject(),
                    item.getObject());
        }

        function_fclose.f.env(env).call(stream);
        return ZVal.assign(messages.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "messages", typeHint = "array")
    @ConvertedParameter(index = 1, name = "item", typeHint = "array")
    private Object addMessage(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer messages =
                assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        ReferenceContainer item = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object plurals = null;
        Object count = null;
        Object empties = null;
        if (function_is_array.f.env(env).call(item.arrayGet(env, "translated")).getBool()) {
            messages.arrayAccess(
                            env,
                            NamespaceGlobal.stripcslashes
                                    .env(env)
                                    .call(item.arrayGet(env, "ids", "singular"))
                                    .value())
                    .set(
                            NamespaceGlobal.stripcslashes
                                    .env(env)
                                    .call(item.arrayGet(env, "translated", 0))
                                    .value());
            if (arrayActionR(ArrayAction.ISSET, item, env, "ids", "plural")) {
                plurals = ZVal.assign(item.arrayGet(env, "translated"));
                function_ksort.f.env(env).call(plurals);
                function_end.f.env(env).call(plurals);
                count = function_key.f.env(env).call(plurals).value();
                empties =
                        NamespaceGlobal.array_fill
                                .env(env)
                                .call(0, ZVal.add(count, 1), "-")
                                .value();
                plurals = ZAssignment.add("+=", plurals, empties);
                function_ksort.f.env(env).call(plurals);
                messages.arrayAccess(
                                env,
                                NamespaceGlobal.stripcslashes
                                        .env(env)
                                        .call(item.arrayGet(env, "ids", "plural"))
                                        .value())
                        .set(
                                NamespaceGlobal.stripcslashes
                                        .env(env)
                                        .call(
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call("|", plurals)
                                                        .value())
                                        .value());
            }

        } else if (!arrayActionR(ArrayAction.EMPTY, item, env, "ids", "singular")) {
            messages.arrayAccess(
                            env,
                            NamespaceGlobal.stripcslashes
                                    .env(env)
                                    .call(item.arrayGet(env, "ids", "singular"))
                                    .value())
                    .set(
                            NamespaceGlobal.stripcslashes
                                    .env(env)
                                    .call(item.arrayGet(env, "translated"))
                                    .value());
        }

        return null;
    }

    public Object addMessage(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Translation\\Loader\\PoFileLoader";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends FileLoader.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Translation\\Loader\\PoFileLoader")
                    .setLookup(
                            PoFileLoader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/symfony/translation/Loader/PoFileLoader.php")
                    .addInterface("Symfony\\Component\\Translation\\Loader\\LoaderInterface")
                    .addExtendsClass("Symfony\\Component\\Translation\\Loader\\FileLoader")
                    .addExtendsClass("Symfony\\Component\\Translation\\Loader\\ArrayLoader")
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
