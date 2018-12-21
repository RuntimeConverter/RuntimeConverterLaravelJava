package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Util.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeFunctions.array.function_sort;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_ltrim;
import com.runtimeconverter.runtime.nativeFunctions.array.function_end;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_combine;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.nativeFunctions.array.function_reset;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pad;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Util/Docblock.php

*/

public class Docblock extends RuntimeClassBase {

    public Object reflector = null;

    public Object desc = null;

    public Object tags = null;

    public Object comment = null;

    public Docblock(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Docblock.class) {
            this.__construct(env, args);
        }
    }

    public Docblock(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "reflector", typeHint = "Reflector")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object reflector = assignParameter(args, 0, false);
        this.reflector = reflector;
        this.setComment(env, env.callMethod(reflector, "getDocComment", Docblock.class));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "comment")
    protected Object setComment(RuntimeEnv env, Object... args) {
        Object comment = assignParameter(args, 0, false);
        this.desc = "";
        this.tags = ZVal.newArray();
        this.comment = comment;
        this.parseComment(env, comment);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "comment")
    protected Object parseComment(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/psy/psysh/src/Util")
                        .setFile("/vendor/psy/psysh/src/Util/Docblock.php");
        Object comment = assignParameter(args, 0, false);
        Object prefixLength = null;
        ReferenceContainer b = new BasicReferenceContainer(null);
        ReferenceContainer blocks = new BasicReferenceContainer(null);
        Object line = null;
        Object count = null;
        Object parts = null;
        Object block = null;
        Object tag = null;
        Object body = null;
        comment = function_substr.f.env(env).call(comment, 3, -2).value();
        comment =
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                NamespaceGlobal.preg_split
                                        .env(env)
                                        .call("/\\r?\\n\\r?/", comment)
                                        .value())
                        .value();
        prefixLength = runtimeStaticObject.prefixLength(env, comment);
        comment =
                function_array_map
                        .f
                        .env(env)
                        .call(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Psy\\Util",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "line")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object line = assignParameter(args, 0, false);
                                        Object prefixLength = null;
                                        prefixLength =
                                                this.contextReferences.getCapturedValue(
                                                        "prefixLength");
                                        return ZVal.assign(
                                                function_rtrim
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                function_substr
                                                                        .f
                                                                        .env(env)
                                                                        .call(line, prefixLength)
                                                                        .value())
                                                        .value());
                                    }
                                }.use("prefixLength", prefixLength),
                                comment)
                        .value();
        blocks.setObject(ZVal.newArray());
        b.setObject(-1);
        for (ZPair zpairResult1424 : ZVal.getIterable(comment, env, true)) {
            line = ZVal.assign(zpairResult1424.getValue());
            if (ZVal.isTrue(runtimeStaticObject.isTagged(env, line))) {
                b.setObject(ZVal.increment(b.getObject()));
                blocks.arrayAppend(env).set(ZVal.newArray());

            } else if (ZVal.strictEqualityCheck(b.getObject(), "===", -1)) {
                b.setObject(0);
                blocks.arrayAppend(env).set(ZVal.newArray());
            }

            blocks.arrayAppend(env, b.getObject()).set(line);
        }

        for (ZPair zpairResult1425 : ZVal.getIterable(blocks.getObject(), env, false)) {
            block = ZVal.assign(zpairResult1425.getKey());
            body = ZVal.assign(zpairResult1425.getValue());
            body =
                    function_trim
                            .f
                            .env(env)
                            .call(NamespaceGlobal.implode.env(env).call("\n", body).value())
                            .value();
            if (ZVal.toBool(ZVal.strictEqualityCheck(block, "===", 0))
                    && ZVal.toBool(!ZVal.isTrue(runtimeStaticObject.isTagged(env, body)))) {
                this.desc = body;

            } else {
                tag =
                        function_substr
                                .f
                                .env(env)
                                .call(runtimeStaticObject.strTag(env, body), 1)
                                .value();
                body =
                        function_ltrim
                                .f
                                .env(env)
                                .call(
                                        function_substr
                                                .f
                                                .env(env)
                                                .call(
                                                        body,
                                                        ZVal.add(
                                                                function_strlen
                                                                        .f
                                                                        .env(env)
                                                                        .call(tag)
                                                                        .value(),
                                                                2))
                                                .value())
                                .value();
                if (arrayActionR(
                        ArrayAction.ISSET,
                        env.getRequestStaticPropertiesReference(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Psy
                                        .namespaces
                                        .Util
                                        .classes
                                        .Docblock
                                        .RequestStaticProperties
                                        .class,
                                "vectors"),
                        env,
                        tag)) {
                    count =
                            function_count
                                    .f
                                    .env(env)
                                    .call(
                                            env.getRequestStaticPropertiesReference(
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .Psy
                                                                    .namespaces
                                                                    .Util
                                                                    .classes
                                                                    .Docblock
                                                                    .RequestStaticProperties
                                                                    .class,
                                                            "vectors")
                                                    .arrayGet(env, tag))
                                    .value();
                    if (ZVal.isTrue(body)) {
                        parts =
                                NamespaceGlobal.preg_split
                                        .env(env)
                                        .call("/\\s+/", body, count)
                                        .value();

                    } else {
                        parts = ZVal.newArray();
                    }

                    parts =
                            function_array_pad
                                    .f
                                    .env(env)
                                    .call(parts, count, ZVal.getNull())
                                    .value();
                    new ReferenceClassProperty(this, "tags", env)
                            .arrayAppend(env, tag)
                            .set(
                                    function_array_combine
                                            .f
                                            .env(env)
                                            .call(
                                                    env.getRequestStaticPropertiesReference(
                                                                    com.project
                                                                            .convertedCode
                                                                            .globalNamespace
                                                                            .namespaces
                                                                            .Psy
                                                                            .namespaces
                                                                            .Util
                                                                            .classes
                                                                            .Docblock
                                                                            .RequestStaticProperties
                                                                            .class,
                                                                    "vectors")
                                                            .arrayGet(env, tag),
                                                    parts)
                                            .value());

                } else {
                    new ReferenceClassProperty(this, "tags", env).arrayAppend(env, tag).set(body);
                }
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tag")
    public Object hasTag(RuntimeEnv env, Object... args) {
        Object tag = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(function_is_array.f.env(env).call(this.tags).value())
                        && ZVal.toBool(
                                function_array_key_exists.f.env(env).call(tag, this.tags).value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tag")
    public Object tag(RuntimeEnv env, Object... args) {
        Object tag = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.isTrue(this.hasTag(env, tag))
                        ? new ReferenceClassProperty(this, "tags", env).arrayGet(env, tag)
                        : ZVal.getNull());
    }

    public static final Object CONST_class = "Psy\\Util\\Docblock";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "lines", typeHint = "array")
        protected Object prefixLength(RuntimeEnv env, Object... args) {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/psy/psysh/src/Util")
                            .setFile("/vendor/psy/psysh/src/Util/Docblock.php");
            Object lines = assignParameter(args, 0, false);
            ReferenceContainer last = new BasicReferenceContainer(null);
            Object count = null;
            ReferenceContainer i = new BasicReferenceContainer(null);
            ReferenceContainer first = new BasicReferenceContainer(null);
            lines =
                    function_array_filter
                            .f
                            .env(env)
                            .call(
                                    lines,
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Psy\\Util",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        @ConvertedParameter(index = 0, name = "line")
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            Object line = assignParameter(args, 0, false);
                                            return ZVal.assign(
                                                    function_substr
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    line,
                                                                    NamespaceGlobal.strspn
                                                                            .env(env)
                                                                            .call(
                                                                                    line,
                                                                                    "* \t\n\r\u0000\u000B")
                                                                            .value())
                                                            .value());
                                        }
                                    })
                            .value();
            function_sort.f.env(env).call(lines);
            first.setObject(function_reset.f.env(env).call(lines).value());
            last.setObject(function_end.f.env(env).call(lines).value());
            count =
                    NamespaceGlobal.min
                            .env(env)
                            .call(
                                    function_strlen.f.env(env).call(first.getObject()).value(),
                                    function_strlen.f.env(env).call(last.getObject()).value())
                            .value();
            for (i.setObject(0);
                    ZVal.isLessThan(i.getObject(), '<', count);
                    i.setObject(ZVal.increment(i.getObject()))) {
                if (ZVal.strictNotEqualityCheck(
                        first.arrayGet(env, i.getObject()),
                        "!==",
                        last.arrayGet(env, i.getObject()))) {
                    return ZVal.assign(i.getObject());
                }
            }

            return ZVal.assign(count);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "str")
        public Object isTagged(RuntimeEnv env, Object... args) {
            ReferenceContainer str = new BasicReferenceContainer(assignParameter(args, 0, false));
            return ZVal.assign(
                    ZVal.toBool(
                                    ZVal.toBool(arrayActionR(ArrayAction.ISSET, str, env, 1))
                                            && ZVal.toBool(
                                                    ZVal.strictEqualityCheck(
                                                            str.arrayGet(env, 0), "===", "@")))
                            && ZVal.toBool(
                                    NamespaceGlobal.ctype_alpha
                                            .env(env)
                                            .call(str.arrayGet(env, 1))
                                            .value()));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "str")
        public Object strTag(RuntimeEnv env, Object... args) {
            Object str = assignParameter(args, 0, false);
            ReferenceContainer matches = new BasicReferenceContainer(null);
            if (function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call("/^@[a-z0-9_]+/", str, matches.getObject())
                    .getBool()) {
                return ZVal.assign(matches.arrayGet(env, 0));
            }

            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object vectors =
                ZVal.newArray(
                        new ZPair("throws", ZVal.arrayFromList("type", "desc")),
                        new ZPair("param", ZVal.arrayFromList("type", "var", "desc")),
                        new ZPair("return", ZVal.arrayFromList("type", "desc")));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Util\\Docblock")
                    .setLookup(
                            Docblock.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("comment", "desc", "reflector", "tags")
                    .setStaticPropertyNames("vectors")
                    .setFilename("vendor/psy/psysh/src/Util/Docblock.php")
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
