package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.ClassPatch.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_intersect;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.ClassPatch.classes.ClassPatchInterface;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Doubler/ClassPatch/KeywordPatch.php

*/

public class KeywordPatch extends RuntimeClassBase implements ClassPatchInterface {

    public KeywordPatch(RuntimeEnv env, Object... args) {
        super(env);
    }

    public KeywordPatch(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "Prophecy\\Doubler\\Generator\\Node\\ClassNode"
    )
    public Object supports(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "Prophecy\\Doubler\\Generator\\Node\\ClassNode"
    )
    public Object apply(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object methodNames = null;
        Object methodsToRemove = null;
        Object methodName = null;
        methodNames =
                function_array_keys
                        .f
                        .env(env)
                        .call(env.callMethod(node, "getMethods", KeywordPatch.class))
                        .value();
        methodsToRemove =
                function_array_intersect
                        .f
                        .env(env)
                        .call(methodNames, this.getKeywords(env))
                        .value();
        for (ZPair zpairResult948 : ZVal.getIterable(methodsToRemove, env, true)) {
            methodName = ZVal.assign(zpairResult948.getValue());
            env.callMethod(node, "removeMethod", KeywordPatch.class, methodName);
        }

        return null;
    }

    @ConvertedMethod
    public Object getPriority(RuntimeEnv env, Object... args) {
        return 49;
    }

    @ConvertedMethod
    private Object getKeywords(RuntimeEnv env, Object... args) {
        if (ZVal.isGreaterThanOrEqualTo(70211, ">=", 70000)) {
            return ZVal.assign(ZVal.arrayFromList("__halt_compiler"));
        }

        return ZVal.assign(
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "__halt_compiler",
                                    "abstract",
                                    "and",
                                    "array",
                                    "as",
                                    "break",
                                    "callable",
                                    "case",
                                    "catch",
                                    "class",
                                    "clone",
                                    "const",
                                    "continue",
                                    "declare",
                                    "default",
                                    "die",
                                    "do",
                                    "echo",
                                    "else",
                                    "elseif",
                                    "empty",
                                    "enddeclare",
                                    "endfor",
                                    "endforeach",
                                    "endif",
                                    "endswitch",
                                    "endwhile",
                                    "eval",
                                    "exit",
                                    "extends",
                                    "final",
                                    "finally",
                                    "for",
                                    "foreach",
                                    "function",
                                    "global",
                                    "goto",
                                    "if",
                                    "implements",
                                    "include",
                                    "include_once",
                                    "instanceof",
                                    "insteadof",
                                    "interface",
                                    "isset",
                                    "list",
                                    "namespace",
                                    "new",
                                    "or",
                                    "print",
                                    "private",
                                    "protected",
                                    "public",
                                    "require",
                                    "require_once",
                                    "return",
                                    "static",
                                    "switch",
                                    "throw",
                                    "trait",
                                    "try",
                                    "unset",
                                    "use",
                                    "var",
                                    "while",
                                    "xor",
                                    "yield");
                        }));
    }

    public static final Object CONST_class = "Prophecy\\Doubler\\ClassPatch\\KeywordPatch";

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
                    .setName("Prophecy\\Doubler\\ClassPatch\\KeywordPatch")
                    .setLookup(
                            KeywordPatch.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Doubler/ClassPatch/KeywordPatch.php")
                    .addInterface("Prophecy\\Doubler\\ClassPatch\\ClassPatchInterface")
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
