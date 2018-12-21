package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Matcher.classes.Ducktype;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Matcher.classes.Subset;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Matcher.classes.AnyOf;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.classes.Configuration;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.classes.MockConfigurationBuilder;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_resource;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionProperty;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.classes.Container;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.classes.CompositeExpectation;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_reset;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Loader.classes.EvalLoader;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionObject;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Matcher.classes.HasValue;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.RuntimeStack;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Matcher.classes.Not;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.nativeFunctions.array.function_current;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Matcher.classes.Contains;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Matcher.classes.MustBe;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Matcher.classes.Any;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Matcher.classes.MatcherAbstract;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Matcher.classes.NotAnyOf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Matcher.classes.Pattern;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Matcher.classes.HasKey;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Matcher.classes.AndAnyOtherArgs;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.classes.Exception;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Matcher.classes.Type;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_bool;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.classes.StringManipulationGenerator;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_float;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.classes.CachingGenerator;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;
import static com.runtimeconverter.runtime.ZVal.assignParameterVarArgs;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery.php

*/

public class Mockery extends RuntimeClassBase {

    public Mockery(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Mockery(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_BLOCKS = "Mockery_Forward_Blocks";

    public static final Object CONST_class = "Mockery";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object globalHelpers(RuntimeEnv env, Object... args) {
            RuntimeStack stack = new RuntimeStack();
            stack.setupGlobals(env);
            Scope33 scope = new Scope33();
            stack.pushScope(scope);
            scope._thisVarAlias = this;
            try {
                ContextConstants runtimeConverterFunctionClassConstants =
                        new ContextConstants()
                                .setDir("/vendor/mockery/mockery/library")
                                .setFile("/vendor/mockery/mockery/library/Mockery.php");
                env.include(
                        toStringR(
                                        env.addRootFilesystemPrefix(
                                                "/vendor/mockery/mockery/library"),
                                        env)
                                + "/helpers.php",
                        stack,
                        runtimeConverterFunctionClassConstants,
                        true,
                        true);
                throw new IncludeEventException(null);
            } catch (IncludeEventException runtimeConverterIncludeException) {
                return runtimeConverterIncludeException.returnValue;
            }
        }

        @ConvertedMethod
        public Object builtInTypes(RuntimeEnv env, Object... args) {
            ReferenceContainer builtInTypes = new BasicReferenceContainer(null);
            builtInTypes.setObject(
                    ZVal.arrayFromList(
                            "self",
                            "array",
                            "callable",
                            "bool",
                            "float",
                            "int",
                            "string",
                            "iterable",
                            "void"));
            if (ZVal.isGreaterThanOrEqualTo(
                    NamespaceGlobal.version_compare
                            .env(env)
                            .call("7.2.11-dev", "7.2.0-dev")
                            .value(),
                    ">=",
                    0)) {
                builtInTypes.arrayAppend(env).set("object");
            }

            return ZVal.assign(builtInTypes.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "type")
        public Object isBuiltInType(RuntimeEnv env, Object... args) {
            Object type = assignParameter(args, 0, false);
            return ZVal.assign(
                    function_in_array
                            .f
                            .env(env)
                            .call(
                                    type,
                                    com.project.convertedCode.globalNamespace.classes.Mockery
                                            .runtimeStaticObject.builtInTypes(env))
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "args")
        public Object mock(RuntimeEnv env, Object... args) {
            Object ___args = assignParameterVarArgs(args, 0);
            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    ZVal.newArray(
                                            new ZPair(0, runtimeStaticObject.getContainer(env)),
                                            new ZPair(1, "mock")),
                                    ___args)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "args")
        public Object spy(RuntimeEnv env, Object... args) {
            Object ___args = assignParameterVarArgs(args, 0);
            return ZVal.assign(
                    env.callMethod(
                            function_call_user_func_array
                                    .f
                                    .env(env)
                                    .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                    .call(
                                            ZVal.newArray(
                                                    new ZPair(
                                                            0,
                                                            runtimeStaticObject.getContainer(env)),
                                                    new ZPair(1, "mock")),
                                            ___args)
                                    .value(),
                            "shouldIgnoreMissing",
                            Mockery.class));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "args")
        public Object instanceMock(RuntimeEnv env, Object... args) {
            Object ___args = assignParameterVarArgs(args, 0);
            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    ZVal.newArray(
                                            new ZPair(0, runtimeStaticObject.getContainer(env)),
                                            new ZPair(1, "mock")),
                                    ___args)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "args")
        public Object namedMock(RuntimeEnv env, Object... args) {
            Object ___args = assignParameterVarArgs(args, 0);
            Object name = null;
            Object builder = null;
            name = function_array_shift.f.env(env).call(___args).value();
            builder = new MockConfigurationBuilder(env);
            env.callMethod(builder, "setName", Mockery.class, name);
            function_array_unshift.f.env(env).call(___args, builder);
            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    ZVal.newArray(
                                            new ZPair(0, runtimeStaticObject.getContainer(env)),
                                            new ZPair(1, "mock")),
                                    ___args)
                            .value());
        }

        @ConvertedMethod
        public Object self(RuntimeEnv env, Object... args) {
            if (function_is_null
                    .f
                    .env(env)
                    .call(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .classes
                                                    .Mockery
                                                    .RequestStaticProperties
                                                    .class)
                                    ._container)
                    .getBool()) {
                throw ZVal.getException(
                        env, new LogicException(env, "You have not declared any mocks yet"));
            }

            return ZVal.assign(
                    env.callMethod(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .classes
                                                    .Mockery
                                                    .RequestStaticProperties
                                                    .class)
                                    ._container,
                            "self",
                            Mockery.class));
        }

        @ConvertedMethod
        public Object close(RuntimeEnv env, Object... args) {
            Object container = null;
            Object fileName = null;
            for (ZPair zpairResult673 :
                    ZVal.getIterable(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .classes
                                                    .Mockery
                                                    .RequestStaticProperties
                                                    .class)
                                    ._filesToCleanUp,
                            env,
                            true)) {
                fileName = ZVal.assign(zpairResult673.getValue());
                NamespaceGlobal.unlink.env(env).call(fileName).value();
            }

            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .classes
                                            .Mockery
                                            .RequestStaticProperties
                                            .class)
                            ._filesToCleanUp =
                    ZVal.newArray();
            if (function_is_null
                    .f
                    .env(env)
                    .call(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .classes
                                                    .Mockery
                                                    .RequestStaticProperties
                                                    .class)
                                    ._container)
                    .getBool()) {
                return null;
            }

            container =
                    ZVal.assign(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .classes
                                                    .Mockery
                                                    .RequestStaticProperties
                                                    .class)
                                    ._container);
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .classes
                                            .Mockery
                                            .RequestStaticProperties
                                            .class)
                            ._container =
                    ZVal.getNull();
            env.callMethod(container, "mockery_teardown", Mockery.class);
            env.callMethod(container, "mockery_close", Mockery.class);
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        public Object fetchMock(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            return ZVal.assign(
                    env.callMethod(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .classes
                                                    .Mockery
                                                    .RequestStaticProperties
                                                    .class)
                                    ._container,
                            "fetchMock",
                            Mockery.class,
                            name));
        }

        @ConvertedMethod
        public Object getContainer(RuntimeEnv env, Object... args) {
            if (function_is_null
                    .f
                    .env(env)
                    .call(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .classes
                                                    .Mockery
                                                    .RequestStaticProperties
                                                    .class)
                                    ._container)
                    .getBool()) {
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .classes
                                                .Mockery
                                                .RequestStaticProperties
                                                .class)
                                ._container =
                        new Container(
                                env,
                                runtimeStaticObject.getGenerator(env),
                                runtimeStaticObject.getLoader(env));
            }

            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .classes
                                            .Mockery
                                            .RequestStaticProperties
                                            .class)
                            ._container);
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "generator",
            typeHint = "Mockery\\Generator\\Generator"
        )
        public Object setGenerator(RuntimeEnv env, Object... args) {
            Object generator = assignParameter(args, 0, false);
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .classes
                                            .Mockery
                                            .RequestStaticProperties
                                            .class)
                            ._generator =
                    generator;
            return null;
        }

        @ConvertedMethod
        public Object getGenerator(RuntimeEnv env, Object... args) {
            if (function_is_null
                    .f
                    .env(env)
                    .call(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .classes
                                                    .Mockery
                                                    .RequestStaticProperties
                                                    .class)
                                    ._generator)
                    .getBool()) {
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .classes
                                                .Mockery
                                                .RequestStaticProperties
                                                .class)
                                ._generator =
                        runtimeStaticObject.getDefaultGenerator(env);
            }

            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .classes
                                            .Mockery
                                            .RequestStaticProperties
                                            .class)
                            ._generator);
        }

        @ConvertedMethod
        public Object getDefaultGenerator(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    new CachingGenerator(
                            env,
                            StringManipulationGenerator.runtimeStaticObject.withDefaultPasses(
                                    env)));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "loader", typeHint = "Mockery\\Loader\\Loader")
        public Object setLoader(RuntimeEnv env, Object... args) {
            Object loader = assignParameter(args, 0, false);
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .classes
                                            .Mockery
                                            .RequestStaticProperties
                                            .class)
                            ._loader =
                    loader;
            return null;
        }

        @ConvertedMethod
        public Object getLoader(RuntimeEnv env, Object... args) {
            if (function_is_null
                    .f
                    .env(env)
                    .call(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .classes
                                                    .Mockery
                                                    .RequestStaticProperties
                                                    .class)
                                    ._loader)
                    .getBool()) {
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .classes
                                                .Mockery
                                                .RequestStaticProperties
                                                .class)
                                ._loader =
                        runtimeStaticObject.getDefaultLoader(env);
            }

            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .classes
                                            .Mockery
                                            .RequestStaticProperties
                                            .class)
                            ._loader);
        }

        @ConvertedMethod
        public Object getDefaultLoader(RuntimeEnv env, Object... args) {
            return ZVal.assign(new EvalLoader(env));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "container", typeHint = "Mockery\\Container")
        public Object setContainer(RuntimeEnv env, Object... args) {
            Object container = assignParameter(args, 0, false);
            return ZVal.assign(
                    env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .classes
                                                    .Mockery
                                                    .RequestStaticProperties
                                                    .class)
                                    ._container =
                            container);
        }

        @ConvertedMethod
        public Object resetContainer(RuntimeEnv env, Object... args) {
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .classes
                                            .Mockery
                                            .RequestStaticProperties
                                            .class)
                            ._container =
                    ZVal.getNull();
            return null;
        }

        @ConvertedMethod
        public Object any(RuntimeEnv env, Object... args) {
            return ZVal.assign(new Any(env));
        }

        @ConvertedMethod
        public Object andAnyOthers(RuntimeEnv env, Object... args) {
            return ZVal.assign(new AndAnyOtherArgs(env));
        }

        @ConvertedMethod
        public Object andAnyOtherArgs(RuntimeEnv env, Object... args) {
            return ZVal.assign(new AndAnyOtherArgs(env));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expected")
        public Object type(RuntimeEnv env, Object... args) {
            Object expected = assignParameter(args, 0, false);
            return ZVal.assign(new Type(env, expected));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "args")
        public Object ducktype(RuntimeEnv env, Object... args) {
            Object ___args = assignParameterVarArgs(args, 0);
            return ZVal.assign(new Ducktype(env, ___args));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "part", typeHint = "array")
        @ConvertedParameter(
            index = 1,
            name = "strict",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        public Object subset(RuntimeEnv env, Object... args) {
            Object part = assignParameter(args, 0, false);
            Object strict = assignParameter(args, 1, true);
            if (null == strict) {
                strict = true;
            }
            return ZVal.assign(new Subset(env, part, strict));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "args")
        public Object contains(RuntimeEnv env, Object... args) {
            Object ___args = assignParameterVarArgs(args, 0);
            return ZVal.assign(new Contains(env, ___args));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "key")
        public Object hasKey(RuntimeEnv env, Object... args) {
            Object key = assignParameter(args, 0, false);
            return ZVal.assign(new HasKey(env, key));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "val")
        public Object hasValue(RuntimeEnv env, Object... args) {
            Object val = assignParameter(args, 0, false);
            return ZVal.assign(new HasValue(env, val));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "closure")
        public Object on(RuntimeEnv env, Object... args) {
            Object closure = assignParameter(args, 0, false);
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Mockery
                            .namespaces
                            .Matcher
                            .classes
                            .Closure(env, closure));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expected")
        public Object mustBe(RuntimeEnv env, Object... args) {
            Object expected = assignParameter(args, 0, false);
            return ZVal.assign(new MustBe(env, expected));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expected")
        public Object not(RuntimeEnv env, Object... args) {
            Object expected = assignParameter(args, 0, false);
            return ZVal.assign(new Not(env, expected));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "args")
        public Object anyOf(RuntimeEnv env, Object... args) {
            Object ___args = assignParameterVarArgs(args, 0);
            return ZVal.assign(new AnyOf(env, ___args));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "args")
        public Object notAnyOf(RuntimeEnv env, Object... args) {
            Object ___args = assignParameterVarArgs(args, 0);
            return ZVal.assign(new NotAnyOf(env, ___args));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expected")
        public Object pattern(RuntimeEnv env, Object... args) {
            Object expected = assignParameter(args, 0, false);
            return ZVal.assign(new Pattern(env, expected));
        }

        @ConvertedMethod
        public Object getConfiguration(RuntimeEnv env, Object... args) {
            if (function_is_null
                    .f
                    .env(env)
                    .call(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .classes
                                                    .Mockery
                                                    .RequestStaticProperties
                                                    .class)
                                    ._config)
                    .getBool()) {
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .classes
                                                .Mockery
                                                .RequestStaticProperties
                                                .class)
                                ._config =
                        new Configuration(env);
            }

            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .classes
                                            .Mockery
                                            .RequestStaticProperties
                                            .class)
                            ._config);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "method")
        @ConvertedParameter(
            index = 1,
            name = "arguments",
            typeHint = "array",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object formatArgs(RuntimeEnv env, Object... args) {
            Object method = assignParameter(args, 0, false);
            Object arguments = assignParameter(args, 1, true);
            if (null == arguments) {
                arguments = ZVal.getNull();
            }
            ReferenceContainer formattedArguments = new BasicReferenceContainer(null);
            Object argument = null;
            if (function_is_null.f.env(env).call(arguments).getBool()) {
                return ZVal.assign(toStringR(method, env) + "()");
            }

            formattedArguments.setObject(ZVal.newArray());
            for (ZPair zpairResult674 : ZVal.getIterable(arguments, env, true)) {
                argument = ZVal.assign(zpairResult674.getValue());
                formattedArguments
                        .arrayAppend(env)
                        .set(runtimeStaticObject.formatArgument(env, argument));
            }

            return ZVal.assign(
                    toStringR(method, env)
                            + "("
                            + toStringR(
                                    NamespaceGlobal.implode
                                            .env(env)
                                            .call(", ", formattedArguments.getObject())
                                            .value(),
                                    env)
                            + ")");
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "argument")
        @ConvertedParameter(
            index = 1,
            name = "depth",
            defaultValue = "0",
            defaultValueType = "number"
        )
        private Object formatArgument(RuntimeEnv env, Object... args) {
            Object argument = assignParameter(args, 0, false);
            Object depth = assignParameter(args, 1, true);
            if (null == depth) {
                depth = 0;
            }
            ReferenceContainer sample = new BasicReferenceContainer(null);
            Object value = null;
            Object key = null;
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            argument,
                            MatcherAbstract.class,
                            "Mockery\\Matcher\\MatcherAbstract"))) {
                return ZVal.assign(toStringR(argument, env));
            }

            if (function_is_object.f.env(env).call(argument).getBool()) {
                return ZVal.assign(
                        "object("
                                + toStringR(
                                        function_get_class.f.env(env).call(argument).value(), env)
                                + ")");
            }

            if (ZVal.toBool(function_is_int.f.env(env).call(argument).value())
                    || ZVal.toBool(function_is_float.f.env(env).call(argument).value())) {
                return ZVal.assign(argument);
            }

            if (function_is_array.f.env(env).call(argument).getBool()) {
                if (ZVal.strictEqualityCheck(depth, "===", 1)) {
                    argument = "[...]";

                } else {
                    sample.setObject(ZVal.newArray());
                    for (ZPair zpairResult675 : ZVal.getIterable(argument, env, false)) {
                        key = ZVal.assign(zpairResult675.getKey());
                        value = ZVal.assign(zpairResult675.getValue());
                        key =
                                ZVal.assign(
                                        function_is_int.f.env(env).call(key).getBool()
                                                ? key
                                                : "'" + toStringR(key, env) + "'");
                        value = runtimeStaticObject.formatArgument(env, value, ZVal.add(depth, 1));
                        sample.arrayAppend(env)
                                .set(toStringR(key, env) + " => " + toStringR(value, env));
                    }

                    argument =
                            "["
                                    + toStringR(
                                            NamespaceGlobal.implode
                                                    .env(env)
                                                    .call(", ", sample.getObject())
                                                    .value(),
                                            env)
                                    + "]";
                }

                return ZVal.assign(
                        ZVal.isGreaterThan(
                                        function_strlen.f.env(env).call(argument).value(),
                                        '>',
                                        1000)
                                ? toStringR(
                                                function_substr
                                                        .f
                                                        .env(env)
                                                        .call(argument, 0, 1000)
                                                        .value(),
                                                env)
                                        + "...]"
                                : argument);
            }

            if (function_is_bool.f.env(env).call(argument).getBool()) {
                return ZVal.assign(ZVal.isTrue(argument) ? "true" : "false");
            }

            if (function_is_resource.f.env(env).call(argument).getBool()) {
                return "resource(...)";
            }

            if (function_is_null.f.env(env).call(argument).getBool()) {
                return "NULL";
            }

            return ZVal.assign("'" + toStringR(toStringR(argument, env), env) + "'");
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "objects",
            typeHint = "array",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object formatObjects(RuntimeEnv env, Object... args) {
            Object objects = assignParameter(args, 0, true);
            if (null == objects) {
                objects = ZVal.getNull();
            }
            ReferenceContainer parts = new BasicReferenceContainer(null);
            ReferenceContainer formatting = new BasicReferenceContainer(null);
            Object _object = null;
            formatting = env.getInlineStatic(12, null);
            if (ZVal.isTrue(formatting.getObject())) {
                return "[Recursion]";
            }

            if (function_is_null.f.env(env).call(objects).getBool()) {
                return "";
            }

            objects = function_array_filter.f.env(env).call(objects, "is_object").value();
            if (ZVal.isEmpty(objects)) {
                return "";
            }

            formatting.setObject(true);
            parts.setObject(ZVal.newArray());
            for (ZPair zpairResult676 : ZVal.getIterable(objects, env, true)) {
                _object = ZVal.assign(zpairResult676.getValue());
                parts.arrayAccess(env, function_get_class.f.env(env).call(_object).value())
                        .set(runtimeStaticObject.objectToArray(env, _object));
            }

            formatting.setObject(false);
            return ZVal.assign(
                    "Objects: ( "
                            + toStringR(
                                    NamespaceGlobal.var_export
                                            .env(env)
                                            .call(parts.getObject(), true)
                                            .value(),
                                    env)
                            + ")");
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "object")
        @ConvertedParameter(
            index = 1,
            name = "nesting",
            defaultValue = "3",
            defaultValueType = "number"
        )
        private Object objectToArray(RuntimeEnv env, Object... args) {
            Object _object = assignParameter(args, 0, false);
            Object nesting = assignParameter(args, 1, true);
            if (null == nesting) {
                nesting = 3;
            }
            if (ZVal.equalityCheck(nesting, 0)) {
                return ZVal.assign(ZVal.arrayFromList("..."));
            }

            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair("class", function_get_class.f.env(env).call(_object).value()),
                            new ZPair(
                                    "properties",
                                    runtimeStaticObject.extractInstancePublicProperties(
                                            env, _object, nesting))));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "object")
        @ConvertedParameter(index = 1, name = "nesting")
        private Object extractInstancePublicProperties(RuntimeEnv env, Object... args) {
            Object _object = assignParameter(args, 0, false);
            Object nesting = assignParameter(args, 1, false);
            Object reflection = null;
            ReferenceContainer cleanedProperties = new BasicReferenceContainer(null);
            Object name = null;
            Object publicProperty = null;
            Object properties = null;
            reflection =
                    new ReflectionClass(env, function_get_class.f.env(env).call(_object).value());
            properties = env.callMethod(reflection, "getProperties", Mockery.class, 256);
            cleanedProperties.setObject(ZVal.newArray());
            for (ZPair zpairResult677 : ZVal.getIterable(properties, env, true)) {
                publicProperty = ZVal.assign(zpairResult677.getValue());
                if (!ZVal.isTrue(env.callMethod(publicProperty, "isStatic", Mockery.class))) {
                    name = env.callMethod(publicProperty, "getName", Mockery.class);
                    cleanedProperties
                            .arrayAccess(env, name)
                            .set(
                                    runtimeStaticObject.cleanupNesting(
                                            env,
                                            toObjectR(_object)
                                                    .accessProp(this, env)
                                                    .name(name)
                                                    .value(),
                                            nesting));
                }
            }

            return ZVal.assign(cleanedProperties.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "argument")
        @ConvertedParameter(index = 1, name = "nesting")
        private Object cleanupNesting(RuntimeEnv env, Object... args) {
            Object argument = assignParameter(args, 0, false);
            Object nesting = assignParameter(args, 1, false);
            ReferenceContainer _object = new BasicReferenceContainer(null);
            if (function_is_object.f.env(env).call(argument).getBool()) {
                _object.setObject(
                        runtimeStaticObject.objectToArray(
                                env, argument, ZVal.subtract(nesting, 1)));
                _object.arrayAccess(env, "class")
                        .set(function_get_class.f.env(env).call(argument).value());
                return ZVal.assign(_object.getObject());
            }

            if (function_is_array.f.env(env).call(argument).getBool()) {
                return ZVal.assign(
                        runtimeStaticObject.cleanupArray(env, argument, ZVal.subtract(nesting, 1)));
            }

            return ZVal.assign(argument);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "argument")
        @ConvertedParameter(
            index = 1,
            name = "nesting",
            defaultValue = "3",
            defaultValueType = "number"
        )
        private Object cleanupArray(RuntimeEnv env, Object... args) {
            ReferenceContainer argument =
                    new BasicReferenceContainer(assignParameter(args, 0, false));
            Object nesting = assignParameter(args, 1, true);
            if (null == nesting) {
                nesting = 3;
            }
            Object value = null;
            Object key = null;
            if (ZVal.equalityCheck(nesting, 0)) {
                return "...";
            }

            for (ZPair zpairResult678 : ZVal.getIterable(argument.getObject(), env, false)) {
                key = ZVal.assign(zpairResult678.getKey());
                value = ZVal.assign(zpairResult678.getValue());
                if (function_is_array.f.env(env).call(value).getBool()) {
                    argument.arrayAccess(env, key)
                            .set(
                                    runtimeStaticObject.cleanupArray(
                                            env, value, ZVal.subtract(nesting, 1)));

                } else if (function_is_object.f.env(env).call(value).getBool()) {
                    argument.arrayAccess(env, key)
                            .set(
                                    runtimeStaticObject.objectToArray(
                                            env, value, ZVal.subtract(nesting, 1)));
                }
            }

            return ZVal.assign(argument.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "mock", typeHint = "Mockery\\MockInterface")
        @ConvertedParameter(index = 1, name = "args")
        @ConvertedParameter(index = 2, name = "add")
        public Object parseShouldReturnArgs(RuntimeEnv env, Object... args) {
            Object mock = assignParameter(args, 0, false);
            Object ___args = assignParameter(args, 1, false);
            Object add = assignParameter(args, 2, false);
            Object composite = null;
            Object v = null;
            Object arg = null;
            ReferenceContainer expectation = new BasicReferenceContainer(null);
            Object k = null;
            composite = new CompositeExpectation(env);
            for (ZPair zpairResult679 : ZVal.getIterable(___args, env, true)) {
                arg = ZVal.assign(zpairResult679.getValue());
                if (function_is_array.f.env(env).call(arg).getBool()) {
                    for (ZPair zpairResult680 : ZVal.getIterable(arg, env, false)) {
                        k = ZVal.assign(zpairResult680.getKey());
                        v = ZVal.assign(zpairResult680.getValue());
                        expectation.setObject(
                                env.callMethod(
                                        runtimeStaticObject.buildDemeterChain(env, mock, k, add),
                                        "andReturn",
                                        Mockery.class,
                                        v));
                        env.callMethod(
                                composite,
                                new RuntimeArgsWithReferences().add(0, expectation),
                                "add",
                                Mockery.class,
                                expectation.getObject());
                    }

                } else if (function_is_string.f.env(env).call(arg).getBool()) {
                    expectation.setObject(
                            runtimeStaticObject.buildDemeterChain(env, mock, arg, add));
                    env.callMethod(
                            composite,
                            new RuntimeArgsWithReferences().add(0, expectation),
                            "add",
                            Mockery.class,
                            expectation.getObject());
                }
            }

            return ZVal.assign(composite);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "mock", typeHint = "Mockery\\MockInterface")
        @ConvertedParameter(index = 1, name = "arg")
        @ConvertedParameter(index = 2, name = "add")
        protected Object buildDemeterChain(RuntimeEnv env, Object... args) {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/mockery/mockery/library")
                            .setFile("/vendor/mockery/mockery/library/Mockery.php");
            int runtimeConverterBreakCount;
            Object mock = assignParameter(args, 0, false);
            Object arg = assignParameter(args, 1, false);
            Object add = assignParameter(args, 2, false);
            Object container = null;
            Object methodNames = null;
            Object demeterMockKey = null;
            Object parent = null;
            ReferenceContainer method = new BasicReferenceContainer(null);
            Object expectations = null;
            Object nextExp = null;
            container = env.callMethod(mock, "mockery_getContainer", Mockery.class);
            methodNames = function_explode.f.env(env).call("->", arg).value();
            function_reset.f.env(env).call(methodNames);
            if (ZVal.toBool(
                            ZVal.toBool(
                                            !ZVal.isTrue(
                                                    env.callMethod(
                                                            com.project.convertedCode
                                                                    .globalNamespace.classes.Mockery
                                                                    .runtimeStaticObject
                                                                    .getConfiguration(env),
                                                            "mockingNonExistentMethodsAllowed",
                                                            Mockery.class)))
                                    && ZVal.toBool(
                                            !ZVal.isTrue(
                                                    env.callMethod(
                                                            mock,
                                                            "mockery_isAnonymous",
                                                            Mockery.class))))
                    && ZVal.toBool(
                            !function_in_array
                                    .f
                                    .env(env)
                                    .call(
                                            function_current.f.env(env).call(methodNames).value(),
                                            env.callMethod(
                                                    mock,
                                                    "mockery_getMockableMethods",
                                                    Mockery.class))
                                    .getBool())) {
                throw ZVal.getException(
                        env,
                        new Exception(
                                env,
                                "Mockery's configuration currently forbids mocking the method "
                                        + toStringR(
                                                function_current
                                                        .f
                                                        .env(env)
                                                        .call(methodNames)
                                                        .value(),
                                                env)
                                        + " as it does not exist on the class or object "
                                        + "being mocked"));
            }

            expectations = ZVal.getNull();
            nextExp =
                    new com.runtimeconverter.runtime.nativeClasses.Closure(
                            env, runtimeConverterFunctionClassConstants, "", this) {
                        @Override
                        @ConvertedMethod
                        @ConvertedParameter(index = 0, name = "method")
                        public Object run(
                                RuntimeEnv env,
                                Object thisvar,
                                PassByReferenceArgs runtimePassByReferenceArgs,
                                Object... args) {
                            ReferenceContainer method =
                                    new BasicReferenceContainer(assignParameter(args, 0, false));
                            Object add = null;
                            add = this.contextReferences.getCapturedValue("add");
                            return ZVal.assign(
                                    env.callFunctionDynamic(
                                                    add,
                                                    new RuntimeArgsWithReferences().add(0, method),
                                                    method.getObject())
                                            .value());
                        }
                    }.use("add", add);
            parent = function_get_class.f.env(env).call(mock).value();
            runtimeConverterBreakCount = 0;
            while (ZVal.isTrue(true)) {
                method.setObject(function_array_shift.f.env(env).call(methodNames).value());
                expectations =
                        env.callMethod(
                                mock,
                                "mockery_getExpectationsFor",
                                Mockery.class,
                                method.getObject());
                if (ZVal.toBool(function_is_null.f.env(env).call(expectations).value())
                        || ZVal.toBool(
                                runtimeStaticObject.noMoreElementsInChain(env, methodNames))) {
                    expectations =
                            env.callFunctionDynamic(
                                            nextExp,
                                            new RuntimeArgsWithReferences().add(0, method),
                                            method.getObject())
                                    .value();
                    if (ZVal.isTrue(runtimeStaticObject.noMoreElementsInChain(env, methodNames))) {
                        break;
                    }

                    mock =
                            runtimeStaticObject.getNewDemeterMock(
                                    env, container, parent, method.getObject(), expectations);

                } else {
                    demeterMockKey =
                            env.callMethod(
                                    container,
                                    "getKeyOfDemeterMockFor",
                                    Mockery.class,
                                    method.getObject(),
                                    parent);
                    if (ZVal.isTrue(demeterMockKey)) {
                        mock =
                                runtimeStaticObject.getExistingDemeterMock(
                                        env, container, demeterMockKey);
                    }
                }

                parent = toStringR(parent, env) + "->" + toStringR(method.getObject(), env);
                nextExp =
                        new com.runtimeconverter.runtime.nativeClasses.Closure(
                                env, runtimeConverterFunctionClassConstants, "", this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "n")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object n = assignParameter(args, 0, false);
                                Object mock = null;
                                mock = this.contextReferences.getCapturedValue("mock");
                                return ZVal.assign(
                                        env.callMethod(mock, "shouldReceive", Mockery.class, n));
                            }
                        }.use("mock", mock);
            }

            return ZVal.assign(expectations);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "container", typeHint = "Mockery\\Container")
        @ConvertedParameter(index = 1, name = "parent")
        @ConvertedParameter(index = 2, name = "method")
        @ConvertedParameter(index = 3, name = "exp", typeHint = "Mockery\\ExpectationInterface")
        private Object getNewDemeterMock(RuntimeEnv env, Object... args) {
            Object container = assignParameter(args, 0, false);
            Object parent = assignParameter(args, 1, false);
            Object method = assignParameter(args, 2, false);
            Object exp = assignParameter(args, 3, false);
            Object newMockName = null;
            Object parRefMethodRetType = null;
            Object parentMock = null;
            Object parRef = null;
            Object mock = null;
            Object parRefMethod = null;
            newMockName =
                    "demeter_"
                            + toStringR(NamespaceGlobal.md5.env(env).call(parent).value(), env)
                            + "_"
                            + toStringR(method, env);
            if (ZVal.isGreaterThanOrEqualTo(
                    NamespaceGlobal.version_compare.env(env).call("7.2.11-dev", "7.0.0").value(),
                    ">=",
                    0)) {
                parRef = ZVal.getNull();
                parRefMethod = ZVal.getNull();
                parRefMethodRetType = ZVal.getNull();
                parentMock = env.callMethod(exp, "getMock", Mockery.class);
                if (ZVal.strictNotEqualityCheck(parentMock, "!==", ZVal.getNull())) {
                    parRef = new ReflectionObject(env, parentMock);
                }

                if (ZVal.toBool(ZVal.strictNotEqualityCheck(parRef, "!==", ZVal.getNull()))
                        && ZVal.toBool(
                                env.callMethod(parRef, "hasMethod", Mockery.class, method))) {
                    parRefMethod = env.callMethod(parRef, "getMethod", Mockery.class, method);
                    parRefMethodRetType =
                            env.callMethod(parRefMethod, "getReturnType", Mockery.class);
                    if (ZVal.strictNotEqualityCheck(parRefMethodRetType, "!==", ZVal.getNull())) {
                        mock =
                                runtimeStaticObject.namedMock(
                                        env, newMockName, toStringR(parRefMethodRetType, env));
                        env.callMethod(exp, "andReturn", Mockery.class, mock);
                        return ZVal.assign(mock);
                    }
                }
            }

            mock = env.callMethod(container, "mock", Mockery.class, newMockName);
            env.callMethod(exp, "andReturn", Mockery.class, mock);
            return ZVal.assign(mock);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "container", typeHint = "Mockery\\Container")
        @ConvertedParameter(index = 1, name = "demeterMockKey")
        private Object getExistingDemeterMock(RuntimeEnv env, Object... args) {
            Object container = assignParameter(args, 0, false);
            Object demeterMockKey = assignParameter(args, 1, false);
            Object mock = null;
            ReferenceContainer mocks = new BasicReferenceContainer(null);
            mocks.setObject(env.callMethod(container, "getMocks", Mockery.class));
            mock = ZVal.assign(mocks.arrayGet(env, demeterMockKey));
            return ZVal.assign(mock);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "methodNames", typeHint = "array")
        private Object noMoreElementsInChain(RuntimeEnv env, Object... args) {
            Object methodNames = assignParameter(args, 0, false);
            return ZVal.isEmpty(methodNames);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "fqn")
        public Object declareClass(RuntimeEnv env, Object... args) {
            Object fqn = assignParameter(args, 0, false);
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Mockery.class)
                            .method("declareType")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(fqn, "class")
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "fqn")
        public Object declareInterface(RuntimeEnv env, Object... args) {
            Object fqn = assignParameter(args, 0, false);
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Mockery.class)
                            .method("declareType")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(fqn, "interface")
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "fqn")
        @ConvertedParameter(index = 1, name = "type")
        private Object declareType(RuntimeEnv env, Object... args) {
            RuntimeStack stack = new RuntimeStack();
            stack.setupGlobals(env);
            Scope34 scope = new Scope34();
            stack.pushScope(scope);
            scope._thisVarAlias = this;
            try {
                ContextConstants runtimeConverterFunctionClassConstants =
                        new ContextConstants()
                                .setDir("/vendor/mockery/mockery/library")
                                .setFile("/vendor/mockery/mockery/library/Mockery.php");
                scope.fqn = assignParameter(args, 0, false);
                scope.type = assignParameter(args, 1, false);
                scope.tmpfname = null;
                scope.targetCode = null;
                scope.parts = null;
                scope.namespace = null;
                scope.shortName = null;
                scope.targetCode = "<?php ";
                scope.shortName = ZVal.assign(scope.fqn);
                if (function_strpos.f.env(env).call(scope.fqn, "\\").getBool()) {
                    scope.parts = function_explode.f.env(env).call("\\", scope.fqn).value();
                    scope.shortName =
                            function_trim
                                    .f
                                    .env(env)
                                    .call(function_array_pop.f.env(env).call(scope.parts).value())
                                    .value();
                    scope.namespace =
                            NamespaceGlobal.implode.env(env).call("\\", scope.parts).value();
                    scope.targetCode =
                            toStringR(scope.targetCode, env)
                                    + toStringR(
                                            "namespace " + toStringR(scope.namespace, env) + ";\n",
                                            env);
                }

                scope.targetCode =
                        toStringR(scope.targetCode, env)
                                + toStringR(
                                        toStringR(scope.type, env)
                                                + " "
                                                + toStringR(scope.shortName, env)
                                                + " {} ",
                                        env);
                scope.tmpfname =
                        NamespaceGlobal.tempnam
                                .env(env)
                                .call(
                                        NamespaceGlobal.sys_get_temp_dir.env(env).call().value(),
                                        "Mockery")
                                .value();
                NamespaceGlobal.file_put_contents.env(env).call(scope.tmpfname, scope.targetCode);
                env.include(
                        toStringR(scope.tmpfname, env),
                        stack,
                        runtimeConverterFunctionClassConstants,
                        true,
                        false);
                com.project.convertedCode.globalNamespace.classes.Mockery.runtimeStaticObject
                        .registerFileForCleanUp(env, scope.tmpfname);
                throw new IncludeEventException(null);
            } catch (IncludeEventException runtimeConverterIncludeException) {
                return runtimeConverterIncludeException.returnValue;
            }
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "fileName")
        public Object registerFileForCleanUp(RuntimeEnv env, Object... args) {
            Object fileName = assignParameter(args, 0, false);
            env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .classes
                                    .Mockery
                                    .RequestStaticProperties
                                    .class,
                            "_filesToCleanUp")
                    .arrayAppend(env)
                    .set(fileName);
            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object _container = ZVal.getNull();

        public Object _config = ZVal.getNull();

        public Object _generator = null;

        public Object _loader = null;

        public Object _filesToCleanUp = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Mockery")
                    .setLookup(
                            Mockery.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames(
                            "_config", "_container", "_filesToCleanUp", "_generator", "_loader")
                    .setFilename("vendor/mockery/mockery/library/Mockery.php")
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

    private static class Scope33 implements UpdateRuntimeScopeInterface {

        Object _thisVarAlias;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("this", this._thisVarAlias);
        }

        public void updateScope(RuntimeStack stack) {

            this._thisVarAlias = stack.getVariable("this");
        }
    }

    private static class Scope34 implements UpdateRuntimeScopeInterface {

        Object fqn;
        Object tmpfname;
        Object targetCode;
        Object parts;
        Object namespace;
        Object _thisVarAlias;
        Object shortName;
        Object type;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("fqn", this.fqn);
            stack.setVariable("tmpfname", this.tmpfname);
            stack.setVariable("targetCode", this.targetCode);
            stack.setVariable("parts", this.parts);
            stack.setVariable("namespace", this.namespace);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("shortName", this.shortName);
            stack.setVariable("type", this.type);
        }

        public void updateScope(RuntimeStack stack) {

            this.fqn = stack.getVariable("fqn");
            this.tmpfname = stack.getVariable("tmpfname");
            this.targetCode = stack.getVariable("targetCode");
            this.parts = stack.getVariable("parts");
            this.namespace = stack.getVariable("namespace");
            this._thisVarAlias = stack.getVariable("this");
            this.shortName = stack.getVariable("shortName");
            this.type = stack.getVariable("type");
        }
    }
}
