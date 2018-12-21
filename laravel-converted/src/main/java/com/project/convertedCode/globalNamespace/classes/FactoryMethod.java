package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match_all;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unique;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_push;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.classes.FactoryCall;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.project.convertedCode.globalNamespace.classes.FactoryParameter;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/generator/FactoryMethod.php

*/

public class FactoryMethod extends RuntimeClassBase {

    public Object _pClass = null;

    public Object reflector = null;

    public Object comment = null;

    public Object isVarArgs = null;

    public Object calls = null;

    public Object parameters = null;

    public FactoryMethod(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FactoryMethod.class) {
            this.__construct(env, args);
        }
    }

    public FactoryMethod(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class", typeHint = "FactoryClass")
    @ConvertedParameter(index = 1, name = "reflector", typeHint = "ReflectionMethod")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object reflector = assignParameter(args, 1, false);
        this._pClass = _pClass;
        this.reflector = reflector;
        this.extractCommentWithoutLeadingShashesAndStars(env);
        this.extractFactoryNamesFromComment(env);
        this.extractParameters(env);
        return null;
    }

    @ConvertedMethod
    public Object extractCommentWithoutLeadingShashesAndStars(RuntimeEnv env, Object... args) {
        ReferenceContainer line = new BasicReferenceContainer(null);
        this.comment =
                function_explode
                        .f
                        .env(env)
                        .call(
                                "\n",
                                env.callMethod(
                                        this.reflector, "getDocComment", FactoryMethod.class))
                        .value();
        for (ZPair zpairResult147 : ZVal.getIterable(this.comment, env, true)) {
            line = zpairResult147;
            line.setObject(
                    function_preg_replace
                            .f
                            .env(env)
                            .call("#^\\s*(/\\*+|\\*+/|\\*)\\s?#", "", line.getObject())
                            .value());
        }

        this.trimLeadingBlankLinesFromComment(env);
        this.trimTrailingBlankLinesFromComment(env);
        return null;
    }

    @ConvertedMethod
    public Object trimLeadingBlankLinesFromComment(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object line = null;
        runtimeConverterBreakCount = 0;
        while (ZVal.isGreaterThan(function_count.f.env(env).call(this.comment).value(), '>', 0)) {
            line = function_array_shift.f.env(env).call(this.comment).value();
            if (ZVal.notEqualityCheck(function_trim.f.env(env).call(line).value(), "")) {
                function_array_unshift.f.env(env).call(this.comment, line);
                break;
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object trimTrailingBlankLinesFromComment(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object line = null;
        runtimeConverterBreakCount = 0;
        while (ZVal.isGreaterThan(function_count.f.env(env).call(this.comment).value(), '>', 0)) {
            line = function_array_pop.f.env(env).call(this.comment).value();
            if (ZVal.notEqualityCheck(function_trim.f.env(env).call(line).value(), "")) {
                function_array_push.f.env(env).call(this.comment, line);
                break;
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object extractFactoryNamesFromComment(RuntimeEnv env, Object... args) {
        ReferenceContainer i = new BasicReferenceContainer(null);
        this.calls = ZVal.newArray();
        for (i.setObject(0);
                ZVal.isLessThan(
                        i.getObject(), '<', function_count.f.env(env).call(this.comment).value());
                i.setObject(ZVal.increment(i.getObject()))) {
            if (ZVal.isTrue(
                    this.extractFactoryNamesFromLine(
                            env,
                            new ReferenceClassProperty(this, "comment", env)
                                    .arrayGet(env, i.getObject())))) {
                arrayActionR(
                        ArrayAction.UNSET,
                        new ReferenceClassProperty(this, "comment", env),
                        env,
                        i.getObject());
            }
        }

        this.trimTrailingBlankLinesFromComment(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "line")
    public Object extractFactoryNamesFromLine(RuntimeEnv env, Object... args) {
        Object line = assignParameter(args, 0, false);
        ReferenceContainer match = new BasicReferenceContainer(null);
        if (function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, match))
                .call("/^\\s*@factory(\\s+(.+))?$/", line, match.getObject())
                .getBool()) {
            this.createCalls(
                    env,
                    this.extractFactoryNamesFromAnnotation(
                            env,
                            arrayActionR(ArrayAction.ISSET, match, env, 2)
                                    ? function_trim.f.env(env).call(match.arrayGet(env, 2)).value()
                                    : ZVal.getNull()));
            return ZVal.assign(true);
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object extractFactoryNamesFromAnnotation(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object names = null;
        ReferenceContainer match = new BasicReferenceContainer(null);
        Object primaryName = null;
        primaryName = env.callMethod(this.reflector, "getName", FactoryMethod.class);
        if (ZVal.isEmpty(value)) {
            return ZVal.assign(ZVal.newArray(new ZPair(0, primaryName)));
        }

        function_preg_match_all
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, match))
                .call("/(\\.{3}|-|[a-zA-Z_][a-zA-Z_0-9]*)/", value, match.getObject());
        names = ZVal.assign(match.arrayGet(env, 0));
        if (function_in_array.f.env(env).call("...", names).getBool()) {
            this.isVarArgs = true;
        }

        if (ZVal.toBool(!function_in_array.f.env(env).call("-", names).getBool())
                && ZVal.toBool(!function_in_array.f.env(env).call(primaryName, names).getBool())) {
            function_array_unshift.f.env(env).call(names, primaryName);
        }

        return ZVal.assign(names);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "names", typeHint = "array")
    public Object createCalls(RuntimeEnv env, Object... args) {
        Object names = assignParameter(args, 0, false);
        Object name = null;
        names = function_array_unique.f.env(env).call(names).value();
        for (ZPair zpairResult148 : ZVal.getIterable(names, env, true)) {
            name = ZVal.assign(zpairResult148.getValue());
            if (ZVal.toBool(ZVal.notEqualityCheck(name, "-"))
                    && ZVal.toBool(ZVal.notEqualityCheck(name, "..."))) {
                new ReferenceClassProperty(this, "calls", env)
                        .arrayAppend(env)
                        .set(new FactoryCall(env, this, name));
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object extractParameters(RuntimeEnv env, Object... args) {
        Object parameter = null;
        this.parameters = ZVal.newArray();
        if (!ZVal.isTrue(this.isVarArgs)) {
            for (ZPair zpairResult149 :
                    ZVal.getIterable(
                            env.callMethod(this.reflector, "getParameters", FactoryMethod.class),
                            env,
                            true)) {
                parameter = ZVal.assign(zpairResult149.getValue());
                new ReferenceClassProperty(this, "parameters", env)
                        .arrayAppend(env)
                        .set(new FactoryParameter(env, this, parameter));
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object getParameterDeclarations(RuntimeEnv env, Object... args) {
        Object parameter = null;
        ReferenceContainer params = new BasicReferenceContainer(null);
        if (ZVal.toBool(this.isVarArgs) || ZVal.toBool(!ZVal.isTrue(this.hasParameters(env)))) {
            return "";
        }

        params.setObject(ZVal.newArray());
        for (ZPair zpairResult150 : ZVal.getIterable(this.parameters, env, true)) {
            parameter = ZVal.assign(zpairResult150.getValue());
            params.arrayAppend(env)
                    .set(env.callMethod(parameter, "getDeclaration", FactoryMethod.class));
        }

        return ZVal.assign(NamespaceGlobal.implode.env(env).call(", ", params.getObject()).value());
    }

    @ConvertedMethod
    public Object getParameterInvocations(RuntimeEnv env, Object... args) {
        Object parameter = null;
        ReferenceContainer params = new BasicReferenceContainer(null);
        if (ZVal.isTrue(this.isVarArgs)) {
            return "";
        }

        params.setObject(ZVal.newArray());
        for (ZPair zpairResult151 : ZVal.getIterable(this.parameters, env, true)) {
            parameter = ZVal.assign(zpairResult151.getValue());
            params.arrayAppend(env)
                    .set(env.callMethod(parameter, "getInvocation", FactoryMethod.class));
        }

        return ZVal.assign(NamespaceGlobal.implode.env(env).call(", ", params.getObject()).value());
    }

    @ConvertedMethod
    public Object getClass(RuntimeEnv env, Object... args) {
        return ZVal.assign(this._pClass);
    }

    @ConvertedMethod
    public Object getClassName(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this._pClass, "getName", FactoryMethod.class));
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(toObjectR(this.reflector).accessProp(this, env).name("name").value());
    }

    @ConvertedMethod
    public Object isFactory(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isGreaterThan(function_count.f.env(env).call(this.calls).value(), '>', 0));
    }

    @ConvertedMethod
    public Object getCalls(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.calls);
    }

    @ConvertedMethod
    public Object acceptsVariableArguments(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.isVarArgs);
    }

    @ConvertedMethod
    public Object hasParameters(RuntimeEnv env, Object... args) {
        return ZVal.assign(!ZVal.isEmpty(this.parameters));
    }

    @ConvertedMethod
    public Object getParameters(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.parameters);
    }

    @ConvertedMethod
    public Object getFullName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toStringR(this.getClassName(env), env) + "::" + toStringR(this.getName(env), env));
    }

    @ConvertedMethod
    public Object getCommentText(RuntimeEnv env, Object... args) {
        return ZVal.assign(NamespaceGlobal.implode.env(env).call("\n", this.comment).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "indent")
    public Object getComment(RuntimeEnv env, Object... args) {
        Object indent = assignParameter(args, 0, true);
        if (null == indent) {
            indent = "";
        }
        Object line = null;
        Object comment = null;
        comment = toStringR(indent, env) + "/**";
        for (ZPair zpairResult152 : ZVal.getIterable(this.comment, env, true)) {
            line = ZVal.assign(zpairResult152.getValue());
            comment =
                    toStringR(comment, env)
                            + toStringR("\n", env)
                            + toStringR(
                                    function_rtrim
                                            .f
                                            .env(env)
                                            .call(
                                                    toStringR(indent, env)
                                                            + " * "
                                                            + toStringR(line, env))
                                            .value(),
                                    env);
        }

        comment = toStringR(comment, env) + toStringR("\n", env) + toStringR(indent, env) + " */";
        return ZVal.assign(comment);
    }

    public static final Object CONST_class = "FactoryMethod";

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
                    .setName("FactoryMethod")
                    .setLookup(
                            FactoryMethod.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "calls", "class", "comment", "isVarArgs", "parameters", "reflector")
                    .setFilename("vendor/hamcrest/hamcrest-php/generator/FactoryMethod.php")
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
