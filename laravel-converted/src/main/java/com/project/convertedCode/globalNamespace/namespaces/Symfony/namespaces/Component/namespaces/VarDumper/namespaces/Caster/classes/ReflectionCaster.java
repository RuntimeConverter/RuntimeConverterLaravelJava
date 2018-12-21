package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.EnumStub;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.CutStub;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeInterfaces.Reflector;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.ExceptionCaster;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.ConstStub;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionFunction;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.LinkStub;
import com.runtimeconverter.runtime.nativeClasses.exceptions.ReflectionException;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.reflection.phpClasses.Reflection;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.Caster;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.TraceStub;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.FrameStub;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionGenerator;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.ClassStub;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Caster/ReflectionCaster.php

*/

public class ReflectionCaster extends RuntimeClassBase {

    public ReflectionCaster(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ReflectionCaster(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\VarDumper\\Caster\\ReflectionCaster";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "c", typeHint = "Closure")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        @ConvertedParameter(
            index = 4,
            name = "filter",
            defaultValue = "0",
            defaultValueType = "number"
        )
        public Object castClosure(RuntimeEnv env, Object... args) {
            Object c = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            Object filter = assignParameter(args, 4, true);
            if (null == filter) {
                filter = 0;
            }
            Object param = null;
            Object prefix = null;
            ReferenceContainer v = new BasicReferenceContainer(null);
            Object f = null;
            ReferenceContainer k = new BasicReferenceContainer(null);
            prefix = ZVal.assign(Caster.CONST_PREFIX_VIRTUAL);
            c = new ReflectionFunction(env, c);
            a.setObject(
                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                    env, this, ReflectionCaster.class)
                            .method("castFunctionAbstract")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(c, a.getObject(), stub, isNested, filter)
                            .value());
            if (arrayActionR(ArrayAction.ISSET, a, env, toStringR(prefix, env) + "parameters")) {
                for (ZPair zpairResult2193 :
                        ZVal.getIterable(
                                toObjectR(a.arrayGet(env, toStringR(prefix, env) + "parameters"))
                                        .accessProp(this, env)
                                        .name("value")
                                        .value(),
                                env,
                                true)) {
                    v = zpairResult2193;
                    param = ZVal.assign(v.getObject());
                    v.setObject(new EnumStub(env, ZVal.newArray()));
                    for (ZPair zpairResult2194 :
                            ZVal.getIterable(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, ReflectionCaster.class)
                                            .method("castParameter")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(param, ZVal.newArray(), stub, true)
                                            .value(),
                                    env,
                                    false)) {
                        k.setObject(ZVal.assign(zpairResult2194.getKey()));
                        param = ZVal.assign(zpairResult2194.getValue());
                        if (ZVal.strictEqualityCheck("\u0000", "===", k.arrayGet(env, 0))) {
                            new ReferenceClassProperty(v.getObject(), "value", env)
                                    .arrayAccess(
                                            env,
                                            function_substr
                                                    .f
                                                    .env(env)
                                                    .call(k.getObject(), 3)
                                                    .value())
                                    .set(param);
                        }
                    }

                    arrayActionR(
                            ArrayAction.UNSET,
                            new ReferenceClassProperty(v.getObject(), "value", env),
                            env,
                            "position");
                    arrayActionR(
                            ArrayAction.UNSET,
                            new ReferenceClassProperty(v.getObject(), "value", env),
                            env,
                            "isVariadic");
                    arrayActionR(
                            ArrayAction.UNSET,
                            new ReferenceClassProperty(v.getObject(), "value", env),
                            env,
                            "byReference");
                    v.setObject(null);
                }
            }

            if (ZVal.toBool(
                            !ZVal.isTrue(
                                    ZVal.toLong(filter)
                                            & ZVal.toLong(Caster.CONST_EXCLUDE_VERBOSE)))
                    && ZVal.toBool(f = env.callMethod(c, "getFileName", ReflectionCaster.class))) {
                a.arrayAccess(env, toStringR(prefix, env) + "file")
                        .set(
                                new LinkStub(
                                        env,
                                        f,
                                        env.callMethod(c, "getStartLine", ReflectionCaster.class)));
                a.arrayAccess(env, toStringR(prefix, env) + "line")
                        .set(
                                toStringR(
                                                env.callMethod(
                                                        c, "getStartLine", ReflectionCaster.class),
                                                env)
                                        + " to "
                                        + toStringR(
                                                env.callMethod(
                                                        c, "getEndLine", ReflectionCaster.class),
                                                env));
            }

            prefix = ZVal.assign(Caster.CONST_PREFIX_DYNAMIC);
            arrayActionR(ArrayAction.UNSET, a, env, "name");
            arrayActionR(ArrayAction.UNSET, a, env, toStringR(prefix, env) + "this");
            arrayActionR(ArrayAction.UNSET, a, env, toStringR(prefix, env) + "parameter");
            arrayActionR(
                    ArrayAction.UNSET,
                    a,
                    env,
                    toStringR(Caster.CONST_PREFIX_VIRTUAL, env) + "extra");
            return ZVal.assign(a.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "c", typeHint = "Generator")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castGenerator(RuntimeEnv env, Object... args) {
            Object c = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            Object reflectionGenerator = null;
            Object e = null;
            if (!function_class_exists.f.env(env).call("ReflectionGenerator", false).getBool()) {
                return ZVal.assign(a.getObject());
            }

            try {
                reflectionGenerator = new ReflectionGenerator(env, c);
            } catch (ConvertedException convertedException319) {
                if (convertedException319.instanceOf(PHPException.class, "Exception")) {
                    e = convertedException319.getObject();
                    a.arrayAccess(env, toStringR(Caster.CONST_PREFIX_VIRTUAL, env) + "closed")
                            .set(true);
                    return ZVal.assign(a.getObject());
                } else {
                    throw convertedException319;
                }
            }

            return ZVal.assign(
                    runtimeStaticObject.castReflectionGenerator(
                            env, reflectionGenerator, a.getObject(), stub, isNested));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "c", typeHint = "ReflectionType")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castType(RuntimeEnv env, Object... args) {
            Object c = assignParameter(args, 0, false);
            Object a = assignParameter(args, 1, false);
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            Object prefix = null;
            prefix = ZVal.assign(Caster.CONST_PREFIX_VIRTUAL);
            a =
                    ZAssignment.add(
                            "+=",
                            a,
                            ZVal.newArray(
                                    new ZPair(
                                            toStringR(prefix, env) + "name",
                                            env.callMethod(c, "getName", ReflectionCaster.class)),
                                    new ZPair(
                                            toStringR(prefix, env) + "allowsNull",
                                            env.callMethod(
                                                    c, "allowsNull", ReflectionCaster.class)),
                                    new ZPair(
                                            toStringR(prefix, env) + "isBuiltin",
                                            env.callMethod(
                                                    c, "isBuiltin", ReflectionCaster.class))));
            return ZVal.assign(a);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "c", typeHint = "ReflectionGenerator")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castReflectionGenerator(RuntimeEnv env, Object... args) {
            Object c = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            ReferenceContainer trace = new BasicReferenceContainer(null);
            Object prefix = null;
            ReferenceContainer function = new BasicReferenceContainer(null);
            ReferenceContainer frame = new BasicReferenceContainer(null);
            prefix = ZVal.assign(Caster.CONST_PREFIX_VIRTUAL);
            if (ZVal.isTrue(env.callMethod(c, "getThis", ReflectionCaster.class))) {
                a.arrayAccess(env, toStringR(prefix, env) + "this")
                        .set(
                                new CutStub(
                                        env, env.callMethod(c, "getThis", ReflectionCaster.class)));
            }

            function.setObject(env.callMethod(c, "getFunction", ReflectionCaster.class));
            frame.setObject(
                    ZVal.newArray(
                            new ZPair(
                                    "class",
                                    ZVal.isset(
                                                    toObjectR(function.getObject())
                                                            .accessProp(this, env)
                                                            .name("class")
                                                            .value())
                                            ? toObjectR(function.getObject())
                                                    .accessProp(this, env)
                                                    .name("class")
                                                    .value()
                                            : ZVal.getNull()),
                            new ZPair(
                                    "type",
                                    ZVal.isset(
                                                    toObjectR(function.getObject())
                                                            .accessProp(this, env)
                                                            .name("class")
                                                            .value())
                                            ? ZVal.isTrue(
                                                            env.callMethod(
                                                                    function.getObject(),
                                                                    "isStatic",
                                                                    ReflectionCaster.class))
                                                    ? "::"
                                                    : "->"
                                            : ZVal.getNull()),
                            new ZPair(
                                    "function",
                                    toObjectR(function.getObject())
                                            .accessProp(this, env)
                                            .name("name")
                                            .value()),
                            new ZPair(
                                    "file",
                                    env.callMethod(c, "getExecutingFile", ReflectionCaster.class)),
                            new ZPair(
                                    "line",
                                    env.callMethod(
                                            c, "getExecutingLine", ReflectionCaster.class))));
            if (ZVal.isTrue(
                    trace.setObject(env.callMethod(c, "getTrace", ReflectionCaster.class, 2)))) {
                function.setObject(
                        new ReflectionGenerator(
                                env,
                                env.callMethod(
                                        c, "getExecutingGenerator", ReflectionCaster.class)));
                function_array_unshift
                        .f
                        .env(env)
                        .call(
                                trace.getObject(),
                                ZVal.newArray(
                                        new ZPair("function", "yield"),
                                        new ZPair(
                                                "file",
                                                env.callMethod(
                                                        function.getObject(),
                                                        "getExecutingFile",
                                                        ReflectionCaster.class)),
                                        new ZPair(
                                                "line",
                                                ZVal.subtract(
                                                        env.callMethod(
                                                                function.getObject(),
                                                                "getExecutingLine",
                                                                ReflectionCaster.class),
                                                        1))));
                trace.arrayAppend(env).set(frame.getObject());
                a.arrayAccess(env, toStringR(prefix, env) + "trace")
                        .set(new TraceStub(env, trace.getObject(), false, 0, -1, -1));

            } else {
                function.setObject(new FrameStub(env, frame.getObject(), false, true));
                function.setObject(
                        ExceptionCaster.runtimeStaticObject.castFrameStub(
                                env,
                                function.getObject(),
                                ZVal.newArray(),
                                function.getObject(),
                                true));
                a.arrayAccess(env, toStringR(prefix, env) + "executing")
                        .set(
                                new EnumStub(
                                        env,
                                        ZVal.newArray(
                                                new ZPair(
                                                        "\u0000~separator= \u0000"
                                                                + toStringR(
                                                                        frame.arrayGet(
                                                                                env, "class"),
                                                                        env)
                                                                + toStringR(
                                                                        frame.arrayGet(env, "type"),
                                                                        env)
                                                                + toStringR(
                                                                        frame.arrayGet(
                                                                                env, "function"),
                                                                        env)
                                                                + "()",
                                                        function.arrayGet(
                                                                env,
                                                                toStringR(prefix, env) + "src")))));
            }

            a.arrayAccess(env, toStringR(Caster.CONST_PREFIX_VIRTUAL, env) + "closed").set(false);
            return ZVal.assign(a.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "c", typeHint = "ReflectionClass")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        @ConvertedParameter(
            index = 4,
            name = "filter",
            defaultValue = "0",
            defaultValueType = "number"
        )
        public Object castClass(RuntimeEnv env, Object... args) {
            Object c = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            Object filter = assignParameter(args, 4, true);
            if (null == filter) {
                filter = 0;
            }
            Object prefix = null;
            Object n = null;
            prefix = ZVal.assign(Caster.CONST_PREFIX_VIRTUAL);
            if (ZVal.isTrue(
                    n =
                            Reflection.runtimeStaticObject.getModifierNames(
                                    env,
                                    env.callMethod(c, "getModifiers", ReflectionCaster.class)))) {
                a.arrayAccess(env, toStringR(prefix, env) + "modifiers")
                        .set(NamespaceGlobal.implode.env(env).call(" ", n).value());
            }

            runtimeStaticObject.addMap(
                    env,
                    new RuntimeArgsWithReferences().add(0, a),
                    a.getObject(),
                    c,
                    ZVal.newArray(
                            new ZPair("extends", "getParentClass"),
                            new ZPair("implements", "getInterfaceNames"),
                            new ZPair("constants", "getConstants")));
            for (ZPair zpairResult2195 :
                    ZVal.getIterable(
                            env.callMethod(c, "getProperties", ReflectionCaster.class),
                            env,
                            true)) {
                n = ZVal.assign(zpairResult2195.getValue());
                a.arrayAccess(
                                env,
                                toStringR(prefix, env) + "properties",
                                toObjectR(n).accessProp(this, env).name("name").value())
                        .set(n);
            }

            for (ZPair zpairResult2196 :
                    ZVal.getIterable(
                            env.callMethod(c, "getMethods", ReflectionCaster.class), env, true)) {
                n = ZVal.assign(zpairResult2196.getValue());
                a.arrayAccess(
                                env,
                                toStringR(prefix, env) + "methods",
                                toObjectR(n).accessProp(this, env).name("name").value())
                        .set(n);
            }

            if (ZVal.toBool(
                            !ZVal.isTrue(
                                    ZVal.toLong(filter)
                                            & ZVal.toLong(Caster.CONST_EXCLUDE_VERBOSE)))
                    && ZVal.toBool(!ZVal.isTrue(isNested))) {
                runtimeStaticObject.addExtra(
                        env, new RuntimeArgsWithReferences().add(0, a), a.getObject(), c);
            }

            return ZVal.assign(a.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "c", typeHint = "ReflectionFunctionAbstract")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        @ConvertedParameter(
            index = 4,
            name = "filter",
            defaultValue = "0",
            defaultValueType = "number"
        )
        public Object castFunctionAbstract(RuntimeEnv env, Object... args) {
            Object c = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            Object filter = assignParameter(args, 4, true);
            if (null == filter) {
                filter = 0;
            }
            Object prefix = null;
            ReferenceContainer v = new BasicReferenceContainer(null);
            Object k = null;
            prefix = ZVal.assign(Caster.CONST_PREFIX_VIRTUAL);
            runtimeStaticObject.addMap(
                    env,
                    new RuntimeArgsWithReferences().add(0, a),
                    a.getObject(),
                    c,
                    ZVal.newArray(
                            new ZPair("returnsReference", "returnsReference"),
                            new ZPair("returnType", "getReturnType"),
                            new ZPair("class", "getClosureScopeClass"),
                            new ZPair("this", "getClosureThis")));
            if (arrayActionR(ArrayAction.ISSET, a, env, toStringR(prefix, env) + "returnType")) {
                v.setObject(ZVal.assign(a.arrayGet(env, toStringR(prefix, env) + "returnType")));
                v.setObject(env.callMethod(v.getObject(), "getName", ReflectionCaster.class));
                a.arrayAccess(env, toStringR(prefix, env) + "returnType")
                        .set(
                                new ClassStub(
                                        env,
                                        ZVal.isTrue(
                                                        env.callMethod(
                                                                a.arrayGet(
                                                                        env,
                                                                        toStringR(prefix, env)
                                                                                + "returnType"),
                                                                "allowsNull",
                                                                ReflectionCaster.class))
                                                ? "?" + toStringR(v.getObject(), env)
                                                : v.getObject(),
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        ZVal.toBool(
                                                                                ZVal.toBool(
                                                                                                function_class_exists
                                                                                                        .f
                                                                                                        .env(
                                                                                                                env)
                                                                                                        .call(
                                                                                                                v
                                                                                                                        .getObject(),
                                                                                                                false)
                                                                                                        .value())
                                                                                        || ZVal
                                                                                                .toBool(
                                                                                                        NamespaceGlobal
                                                                                                                .interface_exists
                                                                                                                .env(
                                                                                                                        env)
                                                                                                                .call(
                                                                                                                        v
                                                                                                                                .getObject(),
                                                                                                                        false)
                                                                                                                .value()))
                                                                        || ZVal.toBool(
                                                                                NamespaceGlobal
                                                                                        .trait_exists
                                                                                        .env(env)
                                                                                        .call(
                                                                                                v
                                                                                                        .getObject(),
                                                                                                false)
                                                                                        .value())
                                                                ? v.getObject()
                                                                : ""),
                                                new ZPair(1, ""))));
            }

            if (arrayActionR(ArrayAction.ISSET, a, env, toStringR(prefix, env) + "class")) {
                a.arrayAccess(env, toStringR(prefix, env) + "class")
                        .set(new ClassStub(env, a.arrayGet(env, toStringR(prefix, env) + "class")));
            }

            if (arrayActionR(ArrayAction.ISSET, a, env, toStringR(prefix, env) + "this")) {
                a.arrayAccess(env, toStringR(prefix, env) + "this")
                        .set(new CutStub(env, a.arrayGet(env, toStringR(prefix, env) + "this")));
            }

            for (ZPair zpairResult2197 :
                    ZVal.getIterable(
                            env.callMethod(c, "getParameters", ReflectionCaster.class),
                            env,
                            true)) {
                v.setObject(ZVal.assign(zpairResult2197.getValue()));
                k =
                        "$"
                                + toStringR(
                                        toObjectR(v.getObject())
                                                .accessProp(this, env)
                                                .name("name")
                                                .value(),
                                        env);
                if (ZVal.isTrue(
                        env.callMethod(v.getObject(), "isVariadic", ReflectionCaster.class))) {
                    k = "..." + toStringR(k, env);
                }

                if (ZVal.isTrue(
                        env.callMethod(
                                v.getObject(), "isPassedByReference", ReflectionCaster.class))) {
                    k = "&" + toStringR(k, env);
                }

                a.arrayAccess(env, toStringR(prefix, env) + "parameters", k).set(v.getObject());
            }

            if (arrayActionR(ArrayAction.ISSET, a, env, toStringR(prefix, env) + "parameters")) {
                a.arrayAccess(env, toStringR(prefix, env) + "parameters")
                        .set(
                                new EnumStub(
                                        env,
                                        a.arrayGet(env, toStringR(prefix, env) + "parameters")));
            }

            if (ZVal.isTrue(
                    v.setObject(env.callMethod(c, "getStaticVariables", ReflectionCaster.class)))) {
                for (ZPair zpairResult2198 : ZVal.getIterable(v.getObject(), env, false)) {
                    k = ZVal.assign(zpairResult2198.getKey());
                    v = zpairResult2198;
                    if (function_is_object.f.env(env).call(v.getObject()).getBool()) {
                        a.arrayAccess(env, toStringR(prefix, env) + "use", "$" + toStringR(k, env))
                                .set(new CutStub(env, v.getObject()));

                    } else {
                        a.arrayAccess(env, toStringR(prefix, env) + "use", "$" + toStringR(k, env))
                                .set(v.getObject());
                    }
                }

                v.setObject(null);
                a.arrayAccess(env, toStringR(prefix, env) + "use")
                        .set(new EnumStub(env, a.arrayGet(env, toStringR(prefix, env) + "use")));
            }

            if (ZVal.toBool(
                            !ZVal.isTrue(
                                    ZVal.toLong(filter)
                                            & ZVal.toLong(Caster.CONST_EXCLUDE_VERBOSE)))
                    && ZVal.toBool(!ZVal.isTrue(isNested))) {
                runtimeStaticObject.addExtra(
                        env, new RuntimeArgsWithReferences().add(0, a), a.getObject(), c);
            }

            return ZVal.assign(a.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "c", typeHint = "ReflectionMethod")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castMethod(RuntimeEnv env, Object... args) {
            Object c = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            a.arrayAccess(env, toStringR(Caster.CONST_PREFIX_VIRTUAL, env) + "modifiers")
                    .set(
                            NamespaceGlobal.implode
                                    .env(env)
                                    .call(
                                            " ",
                                            Reflection.runtimeStaticObject.getModifierNames(
                                                    env,
                                                    env.callMethod(
                                                            c,
                                                            "getModifiers",
                                                            ReflectionCaster.class)))
                                    .value());
            return ZVal.assign(a.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "c", typeHint = "ReflectionParameter")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castParameter(RuntimeEnv env, Object... args) {
            Object c = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            Object e = null;
            Object prefix = null;
            Object v = null;
            prefix = ZVal.assign(Caster.CONST_PREFIX_VIRTUAL);
            runtimeStaticObject.addMap(
                    env,
                    new RuntimeArgsWithReferences().add(0, a),
                    a.getObject(),
                    c,
                    ZVal.newArray(
                            new ZPair("position", "getPosition"),
                            new ZPair("isVariadic", "isVariadic"),
                            new ZPair("byReference", "isPassedByReference"),
                            new ZPair("allowsNull", "allowsNull")));
            if (ZVal.isTrue(v = env.callMethod(c, "getType", ReflectionCaster.class))) {
                a.arrayAccess(env, toStringR(prefix, env) + "typeHint")
                        .set(env.callMethod(v, "getName", ReflectionCaster.class));
            }

            if (arrayActionR(ArrayAction.ISSET, a, env, toStringR(prefix, env) + "typeHint")) {
                v = ZVal.assign(a.arrayGet(env, toStringR(prefix, env) + "typeHint"));
                a.arrayAccess(env, toStringR(prefix, env) + "typeHint")
                        .set(
                                new ClassStub(
                                        env,
                                        v,
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        ZVal.toBool(
                                                                                ZVal.toBool(
                                                                                                function_class_exists
                                                                                                        .f
                                                                                                        .env(
                                                                                                                env)
                                                                                                        .call(
                                                                                                                v,
                                                                                                                false)
                                                                                                        .value())
                                                                                        || ZVal
                                                                                                .toBool(
                                                                                                        NamespaceGlobal
                                                                                                                .interface_exists
                                                                                                                .env(
                                                                                                                        env)
                                                                                                                .call(
                                                                                                                        v,
                                                                                                                        false)
                                                                                                                .value()))
                                                                        || ZVal.toBool(
                                                                                NamespaceGlobal
                                                                                        .trait_exists
                                                                                        .env(env)
                                                                                        .call(
                                                                                                v,
                                                                                                false)
                                                                                        .value())
                                                                ? v
                                                                : ""),
                                                new ZPair(1, ""))));

            } else {
                arrayActionR(ArrayAction.UNSET, a, env, toStringR(prefix, env) + "allowsNull");
            }

            try {
                a.arrayAccess(env, toStringR(prefix, env) + "default")
                        .set(v = env.callMethod(c, "getDefaultValue", ReflectionCaster.class));
                if (ZVal.isTrue(
                        env.callMethod(c, "isDefaultValueConstant", ReflectionCaster.class))) {
                    a.arrayAccess(env, toStringR(prefix, env) + "default")
                            .set(
                                    new ConstStub(
                                            env,
                                            env.callMethod(
                                                    c,
                                                    "getDefaultValueConstantName",
                                                    ReflectionCaster.class),
                                            v));
                }

                if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", v)) {
                    arrayActionR(ArrayAction.UNSET, a, env, toStringR(prefix, env) + "allowsNull");
                }

            } catch (ConvertedException convertedException320) {
                if (convertedException320.instanceOf(
                        ReflectionException.class, "ReflectionException")) {
                    e = convertedException320.getObject();
                } else {
                    throw convertedException320;
                }
            }

            return ZVal.assign(a.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "c", typeHint = "ReflectionProperty")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castProperty(RuntimeEnv env, Object... args) {
            Object c = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            a.arrayAccess(env, toStringR(Caster.CONST_PREFIX_VIRTUAL, env) + "modifiers")
                    .set(
                            NamespaceGlobal.implode
                                    .env(env)
                                    .call(
                                            " ",
                                            Reflection.runtimeStaticObject.getModifierNames(
                                                    env,
                                                    env.callMethod(
                                                            c,
                                                            "getModifiers",
                                                            ReflectionCaster.class)))
                                    .value());
            runtimeStaticObject.addExtra(
                    env, new RuntimeArgsWithReferences().add(0, a), a.getObject(), c);
            return ZVal.assign(a.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "c", typeHint = "ReflectionExtension")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castExtension(RuntimeEnv env, Object... args) {
            Object c = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            runtimeStaticObject.addMap(
                    env,
                    new RuntimeArgsWithReferences().add(0, a),
                    a.getObject(),
                    c,
                    ZVal.newArray(
                            new ZPair("version", "getVersion"),
                            new ZPair("dependencies", "getDependencies"),
                            new ZPair("iniEntries", "getIniEntries"),
                            new ZPair("isPersistent", "isPersistent"),
                            new ZPair("isTemporary", "isTemporary"),
                            new ZPair("constants", "getConstants"),
                            new ZPair("functions", "getFunctions"),
                            new ZPair("classes", "getClasses")));
            return ZVal.assign(a.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "c", typeHint = "ReflectionZendExtension")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castZendExtension(RuntimeEnv env, Object... args) {
            Object c = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            runtimeStaticObject.addMap(
                    env,
                    new RuntimeArgsWithReferences().add(0, a),
                    a.getObject(),
                    c,
                    ZVal.newArray(
                            new ZPair("version", "getVersion"),
                            new ZPair("author", "getAuthor"),
                            new ZPair("copyright", "getCopyright"),
                            new ZPair("url", "getURL")));
            return ZVal.assign(a.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "a")
        @ConvertedParameter(index = 1, name = "c", typeHint = "Reflector")
        private Object addExtra(
                RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
            ReferenceContainer a = assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
            Object c = assignParameter(args, 1, false);
            ReferenceContainer x = new BasicReferenceContainer(null);
            Object m = null;
            x.setObject(
                    ZVal.assign(
                            arrayActionR(
                                            ArrayAction.ISSET,
                                            a,
                                            env,
                                            toStringR(Caster.CONST_PREFIX_VIRTUAL, env) + "extra")
                                    ? toObjectR(
                                                    a.arrayGet(
                                                            env,
                                                            toStringR(
                                                                            Caster
                                                                                    .CONST_PREFIX_VIRTUAL,
                                                                            env)
                                                                    + "extra"))
                                            .accessProp(this, env)
                                            .name("value")
                                            .value()
                                    : ZVal.newArray()));
            if (ZVal.toBool(function_method_exists.f.env(env).call(c, "getFileName").value())
                    && ZVal.toBool(m = env.callMethod(c, "getFileName", ReflectionCaster.class))) {
                x.arrayAccess(env, "file")
                        .set(
                                new LinkStub(
                                        env,
                                        m,
                                        env.callMethod(c, "getStartLine", ReflectionCaster.class)));
                x.arrayAccess(env, "line")
                        .set(
                                toStringR(
                                                env.callMethod(
                                                        c, "getStartLine", ReflectionCaster.class),
                                                env)
                                        + " to "
                                        + toStringR(
                                                env.callMethod(
                                                        c, "getEndLine", ReflectionCaster.class),
                                                env));
            }

            runtimeStaticObject.addMap(
                    env,
                    new RuntimeArgsWithReferences().add(0, x),
                    x.getObject(),
                    c,
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Symfony
                                            .namespaces
                                            .Component
                                            .namespaces
                                            .VarDumper
                                            .namespaces
                                            .Caster
                                            .classes
                                            .ReflectionCaster
                                            .RequestStaticProperties
                                            .class)
                            .extraMap,
                    "");
            if (ZVal.isTrue(x.getObject())) {
                a.arrayAccess(env, toStringR(Caster.CONST_PREFIX_VIRTUAL, env) + "extra")
                        .set(new EnumStub(env, x.getObject()));
            }

            return null;
        }

        public Object addExtra(RuntimeEnv env, Object... args) {
            throw new TemporaryStubFunctionException();
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "a")
        @ConvertedParameter(index = 1, name = "c", typeHint = "Reflector")
        @ConvertedParameter(index = 2, name = "map")
        @ConvertedParameter(index = 3, name = "prefix")
        private Object addMap(
                RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
            ReferenceContainer a = assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
            Object c = assignParameter(args, 1, false);
            Object map = assignParameter(args, 2, false);
            Object prefix = assignParameter(args, 3, true);
            if (null == prefix) {
                prefix = Caster.CONST_PREFIX_VIRTUAL;
            }
            Object k = null;
            Object m = null;
            for (ZPair zpairResult2199 : ZVal.getIterable(map, env, false)) {
                k = ZVal.assign(zpairResult2199.getKey());
                m = ZVal.assign(zpairResult2199.getValue());
                if (ZVal.toBool(
                                ZVal.toBool(function_method_exists.f.env(env).call(c, m).value())
                                        && ZVal.toBool(
                                                ZVal.strictNotEqualityCheck(
                                                        false,
                                                        "!==",
                                                        m =
                                                                env.callMethod(
                                                                        c,
                                                                        toStringR(m, env),
                                                                        ReflectionCaster.class))))
                        && ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", m))) {
                    a.arrayAccess(env, toStringR(prefix, env) + toStringR(k, env))
                            .set(
                                    ZVal.isTrue(
                                                    ZVal.checkInstanceType(
                                                            m, Reflector.class, "Reflector"))
                                            ? toObjectR(m)
                                                    .accessProp(this, env)
                                                    .name("name")
                                                    .value()
                                            : m);
                }
            }

            return null;
        }

        public Object addMap(RuntimeEnv env, Object... args) {
            throw new TemporaryStubFunctionException();
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object extraMap =
                ZVal.newArray(
                        new ZPair("docComment", "getDocComment"),
                        new ZPair("extension", "getExtensionName"),
                        new ZPair("isDisabled", "isDisabled"),
                        new ZPair("isDeprecated", "isDeprecated"),
                        new ZPair("isInternal", "isInternal"),
                        new ZPair("isUserDefined", "isUserDefined"),
                        new ZPair("isGenerator", "isGenerator"),
                        new ZPair("isVariadic", "isVariadic"));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\VarDumper\\Caster\\ReflectionCaster")
                    .setLookup(
                            ReflectionCaster.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("extraMap")
                    .setFilename("vendor/symfony/var-dumper/Caster/ReflectionCaster.php")
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
