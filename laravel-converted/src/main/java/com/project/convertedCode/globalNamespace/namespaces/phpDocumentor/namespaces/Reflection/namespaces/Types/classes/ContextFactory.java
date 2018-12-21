package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_reverse;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Context;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.ArrayIterator;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/type-resolver/src/Types/ContextFactory.php

*/

public final class ContextFactory extends RuntimeClassBase {

    public ContextFactory(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ContextFactory(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "reflector", typeHint = "Reflector")
    public Object createFromReflector(RuntimeEnv env, Object... args) {
        Object reflector = assignParameter(args, 0, false);
        Object fileName = null;
        Object namespace = null;
        if (function_method_exists.f.env(env).call(reflector, "getDeclaringClass").getBool()) {
            reflector = env.callMethod(reflector, "getDeclaringClass", ContextFactory.class);
        }

        fileName = env.callMethod(reflector, "getFileName", ContextFactory.class);
        namespace = env.callMethod(reflector, "getNamespaceName", ContextFactory.class);
        if (function_file_exists.f.env(env).call(fileName).getBool()) {
            return ZVal.assign(
                    this.createForNamespace(
                            env,
                            namespace,
                            function_file_get_contents.f.env(env).call(fileName).value()));
        }

        return ZVal.assign(new Context(env, namespace, ZVal.newArray()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "namespace")
    @ConvertedParameter(index = 1, name = "fileContents")
    public Object createForNamespace(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object namespace = assignParameter(args, 0, false);
        Object fileContents = assignParameter(args, 1, false);
        Object useStatements = null;
        Object currentNamespace = null;
        ReferenceContainer braceLevel = new BasicReferenceContainer(null);
        Object firstBraceFound = null;
        Object tokens = null;
        namespace = function_trim.f.env(env).call(namespace, "\\").value();
        useStatements = ZVal.newArray();
        currentNamespace = "";
        tokens =
                new ArrayIterator(
                        env, NamespaceGlobal.token_get_all.env(env).call(fileContents).value());
        runtimeConverterBreakCount = 0;
        while (ZVal.isTrue(env.callMethod(tokens, "valid", ContextFactory.class))) {
            SwitchEnumType52 switchVariable52 =
                    ZVal.getEnum(
                            handleReturnReference(
                                            env.callMethod(tokens, "current", ContextFactory.class))
                                    .arrayGet(env, 0),
                            SwitchEnumType52.DEFAULT_CASE,
                            SwitchEnumType52.DYNAMIC_TYPE_162,
                            388,
                            SwitchEnumType52.DYNAMIC_TYPE_163,
                            361,
                            SwitchEnumType52.DYNAMIC_TYPE_164,
                            353);
            switch (switchVariable52) {
                case DYNAMIC_TYPE_162:
                    currentNamespace = this.parseNamespace(env, tokens);
                    break;
                case DYNAMIC_TYPE_163:
                    braceLevel.setObject(0);
                    firstBraceFound = false;
                    runtimeConverterBreakCount = 0;
                    while (ZVal.toBool(env.callMethod(tokens, "valid", ContextFactory.class))
                            && ZVal.toBool(
                                    ZVal.toBool(ZVal.isGreaterThan(braceLevel.getObject(), '>', 0))
                                            || ZVal.toBool(!ZVal.isTrue(firstBraceFound)))) {
                        if (ZVal.toBool(
                                        ZVal.toBool(
                                                        ZVal.strictEqualityCheck(
                                                                env.callMethod(
                                                                        tokens,
                                                                        "current",
                                                                        ContextFactory.class),
                                                                "===",
                                                                "{"))
                                                || ZVal.toBool(
                                                        ZVal.strictEqualityCheck(
                                                                handleReturnReference(
                                                                                env.callMethod(
                                                                                        tokens,
                                                                                        "current",
                                                                                        ContextFactory
                                                                                                .class))
                                                                        .arrayGet(env, 0),
                                                                "===",
                                                                386)))
                                || ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                handleReturnReference(
                                                                env.callMethod(
                                                                        tokens,
                                                                        "current",
                                                                        ContextFactory.class))
                                                        .arrayGet(env, 0),
                                                "===",
                                                385))) {
                            if (!ZVal.isTrue(firstBraceFound)) {
                                firstBraceFound = true;
                            }

                            braceLevel.setObject(ZVal.increment(braceLevel.getObject()));
                        }

                        if (ZVal.strictEqualityCheck(
                                env.callMethod(tokens, "current", ContextFactory.class),
                                "===",
                                "}")) {
                            braceLevel.setObject(ZVal.decrement(braceLevel.getObject()));
                        }

                        env.callMethod(tokens, "next", ContextFactory.class);
                    }

                    break;
                case DYNAMIC_TYPE_164:
                    if (ZVal.strictEqualityCheck(currentNamespace, "===", namespace)) {
                        useStatements =
                                function_array_merge
                                        .f
                                        .env(env)
                                        .call(useStatements, this.parseUseStatement(env, tokens))
                                        .value();
                    }

                    break;
            }
            ;
            env.callMethod(tokens, "next", ContextFactory.class);
        }

        return ZVal.assign(new Context(env, namespace, useStatements));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tokens", typeHint = "ArrayIterator")
    private Object parseNamespace(RuntimeEnv env, Object... args) {
        Object tokens = assignParameter(args, 0, false);
        Object name = null;
        this.skipToNextStringOrNamespaceSeparator(env, tokens);
        name = "";
        while (ZVal.toBool(env.callMethod(tokens, "valid", ContextFactory.class))
                && ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                handleReturnReference(
                                                                env.callMethod(
                                                                        tokens,
                                                                        "current",
                                                                        ContextFactory.class))
                                                        .arrayGet(env, 0),
                                                "===",
                                                319))
                                || ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                handleReturnReference(
                                                                env.callMethod(
                                                                        tokens,
                                                                        "current",
                                                                        ContextFactory.class))
                                                        .arrayGet(env, 0),
                                                "===",
                                                390)))) {
            name =
                    toStringR(name, env)
                            + toStringR(
                                    handleReturnReference(
                                                    env.callMethod(
                                                            tokens,
                                                            "current",
                                                            ContextFactory.class))
                                            .arrayGet(env, 1),
                                    env);
            env.callMethod(tokens, "next", ContextFactory.class);
        }

        return ZVal.assign(name);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tokens", typeHint = "ArrayIterator")
    private Object parseUseStatement(RuntimeEnv env, Object... args) {
        Object tokens = assignParameter(args, 0, false);
        Object _pContinue = null;
        Object alias = null;
        ReferenceContainer uses = new BasicReferenceContainer(null);
        Object fqnn = null;
        Object runtimeTempArrayResult133 = null;
        uses.setObject(ZVal.newArray());
        _pContinue = true;
        while (ZVal.isTrue(_pContinue)) {
            this.skipToNextStringOrNamespaceSeparator(env, tokens);
            ZVal.list(
                    runtimeTempArrayResult133 = this.extractUseStatement(env, tokens),
                    (alias = listGet(runtimeTempArrayResult133, 0, env)),
                    (fqnn = listGet(runtimeTempArrayResult133, 1, env)));
            uses.arrayAccess(env, alias).set(fqnn);
            if (ZVal.strictEqualityCheck(
                    handleReturnReference(env.callMethod(tokens, "current", ContextFactory.class))
                            .arrayGet(env, 0),
                    "===",
                    CONST_T_LITERAL_END_OF_USE)) {
                _pContinue = false;
            }
        }

        return ZVal.assign(uses.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tokens", typeHint = "ArrayIterator")
    private Object skipToNextStringOrNamespaceSeparator(RuntimeEnv env, Object... args) {
        Object tokens = assignParameter(args, 0, false);
        while (ZVal.toBool(
                        ZVal.toBool(env.callMethod(tokens, "valid", ContextFactory.class))
                                && ZVal.toBool(
                                        ZVal.strictNotEqualityCheck(
                                                handleReturnReference(
                                                                env.callMethod(
                                                                        tokens,
                                                                        "current",
                                                                        ContextFactory.class))
                                                        .arrayGet(env, 0),
                                                "!==",
                                                319)))
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                handleReturnReference(
                                                env.callMethod(
                                                        tokens, "current", ContextFactory.class))
                                        .arrayGet(env, 0),
                                "!==",
                                390))) {
            env.callMethod(tokens, "next", ContextFactory.class);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tokens", typeHint = "ArrayIterator")
    private Object extractUseStatement(RuntimeEnv env, Object... args) {
        Object tokens = assignParameter(args, 0, false);
        ReferenceContainer result = new BasicReferenceContainer(null);
        Object backslashPos = null;
        result.setObject(ZVal.arrayFromList(""));
        while (ZVal.toBool(
                        ZVal.toBool(env.callMethod(tokens, "valid", ContextFactory.class))
                                && ZVal.toBool(
                                        ZVal.strictNotEqualityCheck(
                                                handleReturnReference(
                                                                env.callMethod(
                                                                        tokens,
                                                                        "current",
                                                                        ContextFactory.class))
                                                        .arrayGet(env, 0),
                                                "!==",
                                                CONST_T_LITERAL_USE_SEPARATOR)))
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                handleReturnReference(
                                                env.callMethod(
                                                        tokens, "current", ContextFactory.class))
                                        .arrayGet(env, 0),
                                "!==",
                                CONST_T_LITERAL_END_OF_USE))) {
            if (ZVal.strictEqualityCheck(
                    handleReturnReference(env.callMethod(tokens, "current", ContextFactory.class))
                            .arrayGet(env, 0),
                    "===",
                    338)) {
                result.arrayAppend(env).set("");
            }

            if (ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    handleReturnReference(
                                                    env.callMethod(
                                                            tokens,
                                                            "current",
                                                            ContextFactory.class))
                                            .arrayGet(env, 0),
                                    "===",
                                    319))
                    || ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    handleReturnReference(
                                                    env.callMethod(
                                                            tokens,
                                                            "current",
                                                            ContextFactory.class))
                                            .arrayGet(env, 0),
                                    "===",
                                    390))) {
                result.arrayAccess(
                                env,
                                ZVal.subtract(
                                        function_count.f.env(env).call(result.getObject()).value(),
                                        1))
                        .set(
                                toStringR(
                                                result.arrayGet(
                                                        env,
                                                        ZVal.subtract(
                                                                function_count
                                                                        .f
                                                                        .env(env)
                                                                        .call(result.getObject())
                                                                        .value(),
                                                                1)),
                                                env)
                                        + toStringR(
                                                handleReturnReference(
                                                                env.callMethod(
                                                                        tokens,
                                                                        "current",
                                                                        ContextFactory.class))
                                                        .arrayGet(env, 1),
                                                env));
            }

            env.callMethod(tokens, "next", ContextFactory.class);
        }

        if (ZVal.equalityCheck(function_count.f.env(env).call(result.getObject()).value(), 1)) {
            backslashPos =
                    NamespaceGlobal.strrpos.env(env).call(result.arrayGet(env, 0), "\\").value();
            if (ZVal.strictNotEqualityCheck(false, "!==", backslashPos)) {
                result.arrayAppend(env)
                        .set(
                                function_substr
                                        .f
                                        .env(env)
                                        .call(result.arrayGet(env, 0), ZVal.add(backslashPos, 1))
                                        .value());

            } else {
                result.arrayAppend(env).set(result.arrayGet(env, 0));
            }
        }

        return ZVal.assign(function_array_reverse.f.env(env).call(result.getObject()).value());
    }

    public static final Object CONST_T_LITERAL_END_OF_USE = ";";

    public static final Object CONST_T_LITERAL_USE_SEPARATOR = ",";

    public static final Object CONST_class = "phpDocumentor\\Reflection\\Types\\ContextFactory";

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
                    .setName("phpDocumentor\\Reflection\\Types\\ContextFactory")
                    .setLookup(
                            ContextFactory.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/phpdocumentor/type-resolver/src/Types/ContextFactory.php")
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

    private enum SwitchEnumType52 {
        DYNAMIC_TYPE_162,
        DYNAMIC_TYPE_163,
        DYNAMIC_TYPE_164,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
