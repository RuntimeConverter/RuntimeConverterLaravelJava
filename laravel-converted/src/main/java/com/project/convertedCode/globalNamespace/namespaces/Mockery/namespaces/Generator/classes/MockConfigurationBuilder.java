package com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.classes;

import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.classes.MockConfiguration;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/Generator/MockConfigurationBuilder.php

*/

public class MockConfigurationBuilder extends RuntimeClassBase {

    public Object name = null;

    public Object blackListedMethods =
            ZVal.arrayFromLambdaExpression(
                    /* Lambda can be removed if method size limit (64kb) is not an issue. */
                    () -> {
                        return ZVal.arrayFromList(
                                "__call",
                                "__callStatic",
                                "__clone",
                                "__wakeup",
                                "__set",
                                "__get",
                                "__toString",
                                "__isset",
                                "__destruct",
                                "__debugInfo",
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
                                "xor");
                    });

    public Object php7SemiReservedKeywords =
            ZVal.arrayFromLambdaExpression(
                    /* Lambda can be removed if method size limit (64kb) is not an issue. */
                    () -> {
                        return ZVal.arrayFromList(
                                "callable",
                                "class",
                                "trait",
                                "extends",
                                "implements",
                                "static",
                                "abstract",
                                "final",
                                "public",
                                "protected",
                                "private",
                                "const",
                                "enddeclare",
                                "endfor",
                                "endforeach",
                                "endif",
                                "endwhile",
                                "and",
                                "global",
                                "goto",
                                "instanceof",
                                "insteadof",
                                "interface",
                                "namespace",
                                "new",
                                "or",
                                "xor",
                                "try",
                                "use",
                                "var",
                                "exit",
                                "list",
                                "clone",
                                "include",
                                "include_once",
                                "throw",
                                "array",
                                "print",
                                "echo",
                                "require",
                                "require_once",
                                "return",
                                "else",
                                "elseif",
                                "default",
                                "break",
                                "continue",
                                "switch",
                                "yield",
                                "function",
                                "if",
                                "endswitch",
                                "finally",
                                "for",
                                "foreach",
                                "declare",
                                "case",
                                "do",
                                "while",
                                "as",
                                "catch",
                                "die",
                                "self",
                                "parent");
                    });

    public Object whiteListedMethods = ZVal.newArray();

    public Object instanceMock = false;

    public Object parameterOverrides = ZVal.newArray();

    public Object mockOriginalDestructor = false;

    public Object targets = ZVal.newArray();

    public Object constantsMap = ZVal.newArray();

    public MockConfigurationBuilder(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MockConfigurationBuilder.class) {
            this.__construct(env, args);
        }
    }

    public MockConfigurationBuilder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        if (ZVal.isGreaterThanOrEqualTo(
                NamespaceGlobal.version_compare.env(env).call("7.2.11-dev", "7.0.0").value(),
                ">=",
                0)) {
            this.blackListedMethods =
                    function_array_diff
                            .f
                            .env(env)
                            .call(this.blackListedMethods, this.php7SemiReservedKeywords)
                            .value();
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "target")
    public Object addTarget(RuntimeEnv env, Object... args) {
        Object target = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "targets", env).arrayAppend(env).set(target);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "targets")
    public Object addTargets(RuntimeEnv env, Object... args) {
        Object targets = assignParameter(args, 0, false);
        Object target = null;
        for (ZPair zpairResult709 : ZVal.getIterable(targets, env, true)) {
            target = ZVal.assign(zpairResult709.getValue());
            this.addTarget(env, target);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object setName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        this.name = name;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "blackListedMethod")
    public Object addBlackListedMethod(RuntimeEnv env, Object... args) {
        Object blackListedMethod = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "blackListedMethods", env)
                .arrayAppend(env)
                .set(blackListedMethod);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "blackListedMethods", typeHint = "array")
    public Object addBlackListedMethods(RuntimeEnv env, Object... args) {
        Object blackListedMethods = assignParameter(args, 0, false);
        Object method = null;
        for (ZPair zpairResult710 : ZVal.getIterable(blackListedMethods, env, true)) {
            method = ZVal.assign(zpairResult710.getValue());
            this.addBlackListedMethod(env, method);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "blackListedMethods", typeHint = "array")
    public Object setBlackListedMethods(RuntimeEnv env, Object... args) {
        Object blackListedMethods = assignParameter(args, 0, false);
        this.blackListedMethods = blackListedMethods;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "whiteListedMethod")
    public Object addWhiteListedMethod(RuntimeEnv env, Object... args) {
        Object whiteListedMethod = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "whiteListedMethods", env)
                .arrayAppend(env)
                .set(whiteListedMethod);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "whiteListedMethods", typeHint = "array")
    public Object addWhiteListedMethods(RuntimeEnv env, Object... args) {
        Object whiteListedMethods = assignParameter(args, 0, false);
        Object method = null;
        for (ZPair zpairResult711 : ZVal.getIterable(whiteListedMethods, env, true)) {
            method = ZVal.assign(zpairResult711.getValue());
            this.addWhiteListedMethod(env, method);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "whiteListedMethods", typeHint = "array")
    public Object setWhiteListedMethods(RuntimeEnv env, Object... args) {
        Object whiteListedMethods = assignParameter(args, 0, false);
        this.whiteListedMethods = whiteListedMethods;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "instanceMock")
    public Object setInstanceMock(RuntimeEnv env, Object... args) {
        Object instanceMock = assignParameter(args, 0, false);
        this.instanceMock = ZVal.toBool(instanceMock);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "overrides", typeHint = "array")
    public Object setParameterOverrides(RuntimeEnv env, Object... args) {
        Object overrides = assignParameter(args, 0, false);
        this.parameterOverrides = overrides;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mockDestructor")
    public Object setMockOriginalDestructor(RuntimeEnv env, Object... args) {
        Object mockDestructor = assignParameter(args, 0, false);
        this.mockOriginalDestructor = mockDestructor;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "map", typeHint = "array")
    public Object setConstantsMap(RuntimeEnv env, Object... args) {
        Object map = assignParameter(args, 0, false);
        this.constantsMap = map;
        return null;
    }

    @ConvertedMethod
    public Object getMockConfiguration(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new MockConfiguration(
                        env,
                        this.targets,
                        this.blackListedMethods,
                        this.whiteListedMethods,
                        this.name,
                        this.instanceMock,
                        this.parameterOverrides,
                        this.mockOriginalDestructor,
                        this.constantsMap));
    }

    public static final Object CONST_class = "Mockery\\Generator\\MockConfigurationBuilder";

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
                    .setName("Mockery\\Generator\\MockConfigurationBuilder")
                    .setLookup(
                            MockConfigurationBuilder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "blackListedMethods",
                            "constantsMap",
                            "instanceMock",
                            "mockOriginalDestructor",
                            "name",
                            "parameterOverrides",
                            "php7SemiReservedKeywords",
                            "targets",
                            "whiteListedMethods")
                    .setFilename(
                            "vendor/mockery/mockery/library/Mockery/Generator/MockConfigurationBuilder.php")
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
