package com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.OutOfBoundsException;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.NodeAbstract;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/Node/Name.php

*/

public class Name extends NodeAbstract {

    public Object parts = null;

    public Name(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Name.class) {
            this.__construct(env, args);
        }
    }

    public Name(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "attributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object attributes = assignParameter(args, 1, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        super.__construct(env, attributes);
        this.parts = runtimeStaticObject.prepareName(env, name);
        return null;
    }

    @ConvertedMethod
    public Object getSubNodeNames(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.arrayFromList("parts"));
    }

    @ConvertedMethod
    public Object getFirst(RuntimeEnv env, Object... args) {
        return ZVal.assign(new ReferenceClassProperty(this, "parts", env).arrayGet(env, 0));
    }

    @ConvertedMethod
    public Object getLast(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "parts", env)
                        .arrayGet(
                                env,
                                ZVal.subtract(
                                        function_count.f.env(env).call(this.parts).value(), 1)));
    }

    @ConvertedMethod
    public Object isUnqualified(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        1, "===", function_count.f.env(env).call(this.parts).value()));
    }

    @ConvertedMethod
    public Object isQualified(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isLessThan(1, '<', function_count.f.env(env).call(this.parts).value()));
    }

    @ConvertedMethod
    public Object isFullyQualified(RuntimeEnv env, Object... args) {
        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object isRelative(RuntimeEnv env, Object... args) {
        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(NamespaceGlobal.implode.env(env).call("\\", this.parts).value());
    }

    @ConvertedMethod
    public Object toCodeString(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.toString(env));
    }

    @ConvertedMethod
    public Object toLowerString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                NamespaceGlobal.strtolower
                        .env(env)
                        .call(NamespaceGlobal.implode.env(env).call("\\", this.parts).value())
                        .value());
    }

    @ConvertedMethod
    public Object isSpecialClassName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        function_count.f.env(env).call(this.parts).value(),
                                        "===",
                                        1))
                        && ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        env.getRequestStaticPropertiesReference(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .PhpParser
                                                        .namespaces
                                                        .Node
                                                        .classes
                                                        .Name
                                                        .RequestStaticProperties
                                                        .class,
                                                "specialClassNames"),
                                        env,
                                        NamespaceGlobal.strtolower
                                                .env(env)
                                                .call(
                                                        new ReferenceClassProperty(
                                                                        this, "parts", env)
                                                                .arrayGet(env, 0))
                                                .value())));
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(NamespaceGlobal.implode.env(env).call("\\", this.parts).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset", typeHint = "int")
    @ConvertedParameter(
        index = 1,
        name = "length",
        typeHint = "int",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object slice(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, false);
        Object length = assignParameter(args, 1, true);
        if (null == length) {
            length = ZVal.getNull();
        }
        Object realOffset = null;
        Object numParts = null;
        Object realLength = null;
        numParts = function_count.f.env(env).call(this.parts).value();
        realOffset =
                ZVal.assign(ZVal.isLessThan(offset, '<', 0) ? ZVal.add(offset, numParts) : offset);
        if (ZVal.toBool(ZVal.isLessThan(realOffset, '<', 0))
                || ZVal.toBool(ZVal.isGreaterThan(realOffset, '>', numParts))) {
            throw ZVal.getException(
                    env,
                    new OutOfBoundsException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Offset %d is out of bounds", offset)
                                    .value()));
        }

        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", length)) {
            realLength = ZVal.subtract(numParts, realOffset);

        } else {
            realLength =
                    ZVal.assign(
                            ZVal.isLessThan(length, '<', 0)
                                    ? ZVal.subtract(ZVal.add(length, numParts), realOffset)
                                    : length);
            if (ZVal.toBool(ZVal.isLessThan(realLength, '<', 0))
                    || ZVal.toBool(ZVal.isGreaterThan(realLength, '>', numParts))) {
                throw ZVal.getException(
                        env,
                        new OutOfBoundsException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call("Length %d is out of bounds", length)
                                        .value()));
            }
        }

        if (ZVal.strictEqualityCheck(realLength, "===", 0)) {
            return ZVal.assign(ZVal.getNull());
        }

        return ZVal.assign(
                env.createNewWithLateStaticBindings(
                        this,
                        function_array_slice
                                .f
                                .env(env)
                                .call(this.parts, realOffset, realLength)
                                .value(),
                        toObjectR(this).accessProp(this, env).name("attributes").value()));
    }

    @ConvertedMethod
    public Object getType(RuntimeEnv env, Object... args) {
        return "Name";
    }

    public static final Object CONST_class = "PhpParser\\Node\\Name";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends NodeAbstract.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name1")
        @ConvertedParameter(index = 1, name = "name2")
        @ConvertedParameter(
            index = 2,
            name = "attributes",
            typeHint = "array",
            defaultValue = "",
            defaultValueType = "array"
        )
        public Object concat(RuntimeEnv env, Object... args) {
            Object name1 = assignParameter(args, 0, false);
            Object name2 = assignParameter(args, 1, false);
            Object attributes = assignParameter(args, 2, true);
            if (null == attributes) {
                attributes = ZVal.newArray();
            }
            if (ZVal.toBool(ZVal.strictEqualityCheck(ZVal.getNull(), "===", name1))
                    && ZVal.toBool(ZVal.strictEqualityCheck(ZVal.getNull(), "===", name2))) {
                return ZVal.assign(ZVal.getNull());

            } else if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", name1)) {
                return ZVal.assign(
                        env.createNewWithLateStaticBindings(
                                this, runtimeStaticObject.prepareName(env, name2), attributes));

            } else if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", name2)) {
                return ZVal.assign(
                        env.createNewWithLateStaticBindings(
                                this, runtimeStaticObject.prepareName(env, name1), attributes));

            } else {
                return ZVal.assign(
                        env.createNewWithLateStaticBindings(
                                this,
                                function_array_merge
                                        .f
                                        .env(env)
                                        .call(
                                                runtimeStaticObject.prepareName(env, name1),
                                                runtimeStaticObject.prepareName(env, name2))
                                        .value(),
                                attributes));
            }
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        private Object prepareName(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            if (function_is_string.f.env(env).call(name).getBool()) {
                if (ZVal.strictEqualityCheck("", "===", name)) {
                    throw ZVal.getException(
                            env, new InvalidArgumentException(env, "Name cannot be empty"));
                }

                return ZVal.assign(function_explode.f.env(env).call("\\", name).value());

            } else if (function_is_array.f.env(env).call(name).getBool()) {
                if (ZVal.isEmpty(name)) {
                    throw ZVal.getException(
                            env, new InvalidArgumentException(env, "Name cannot be empty"));
                }

                return ZVal.assign(name);

            } else if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            name,
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .PhpParser
                                    .namespaces
                                    .Node
                                    .classes
                                    .Name
                                    .class,
                            "PhpParser\\Node\\Name"))) {
                return ZVal.assign(toObjectR(name).accessProp(this, env).name("parts").value());
            }

            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "Expected string, array of parts or Name instance"));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object specialClassNames =
                ZVal.newArray(
                        new ZPair("self", true),
                        new ZPair("parent", true),
                        new ZPair("static", true));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PhpParser\\Node\\Name")
                    .setLookup(
                            Name.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("attributes", "parts")
                    .setStaticPropertyNames("specialClassNames")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Node/Name.php")
                    .addInterface("PhpParser\\Node")
                    .addInterface("JsonSerializable")
                    .addExtendsClass("PhpParser\\NodeAbstract")
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
