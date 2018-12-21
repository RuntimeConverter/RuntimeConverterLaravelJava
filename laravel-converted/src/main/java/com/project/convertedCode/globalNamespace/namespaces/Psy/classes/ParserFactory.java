package com.project.convertedCode.globalNamespace.namespaces.Psy.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/ParserFactory.php

*/

public class ParserFactory extends RuntimeClassBase {

    public ParserFactory(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ParserFactory(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object hasKindsSupport(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_class_exists.f.env(env).call("PhpParser\\ParserFactory").value());
    }

    @ConvertedMethod
    public Object getDefaultKind(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.hasKindsSupport(env))) {
            return ZVal.assign(
                    NamespaceGlobal.version_compare
                                    .env(env)
                                    .call("7.2.11-dev", "7.0", ">=")
                                    .getBool()
                            ? ClassConstantUtils.getConstantValueLateStatic(env, this, "ONLY_PHP7")
                            : ClassConstantUtils.getConstantValueLateStatic(
                                    env, this, "ONLY_PHP5"));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "kind",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object createParser(RuntimeEnv env, Object... args) {
        Object kind = assignParameter(args, 0, true);
        if (null == kind) {
            kind = ZVal.getNull();
        }
        Object originalFactory = null;
        Object parser = null;
        Object ternaryExpressionTemp = null;
        if (ZVal.isTrue(this.hasKindsSupport(env))) {
            originalFactory =
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .PhpParser
                            .classes
                            .ParserFactory(env);
            kind =
                    ZVal.assign(
                            ZVal.isTrue(ternaryExpressionTemp = kind)
                                    ? ternaryExpressionTemp
                                    : this.getDefaultKind(env));
            if (!function_in_array
                    .f
                    .env(env)
                    .call(
                            kind,
                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                            env, this, ParserFactory.class)
                                    .method("getPossibleKinds")
                                    .call()
                                    .value())
                    .getBool()) {
                throw ZVal.getException(
                        env, new InvalidArgumentException(env, "Unknown parser kind"));
            }

            parser =
                    env.callMethod(
                            originalFactory,
                            "create",
                            ParserFactory.class,
                            function_constant
                                    .f
                                    .env(env)
                                    .call("PhpParser\\ParserFactory::" + toStringR(kind, env))
                                    .value());

        } else {
            if (ZVal.strictNotEqualityCheck(kind, "!==", ZVal.getNull())) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env, "Install PHP Parser v2.x to specify parser kind"));
            }

            parser = ZVal.throwRuntimeException("Cannot instantiate abstract class \"Parser\"");
        }

        return ZVal.assign(parser);
    }

    public static final Object CONST_ONLY_PHP5 = "ONLY_PHP5";

    public static final Object CONST_ONLY_PHP7 = "ONLY_PHP7";

    public static final Object CONST_PREFER_PHP5 = "PREFER_PHP5";

    public static final Object CONST_PREFER_PHP7 = "PREFER_PHP7";

    public static final Object CONST_class = "Psy\\ParserFactory";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object getPossibleKinds(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    ZVal.arrayFromList("ONLY_PHP5", "ONLY_PHP7", "PREFER_PHP5", "PREFER_PHP7"));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\ParserFactory")
                    .setLookup(
                            ParserFactory.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/psy/psysh/src/ParserFactory.php")
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
