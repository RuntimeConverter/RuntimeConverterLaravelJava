package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Sudo.classes;

import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Scalar.classes.String_;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.MethodCall;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Name;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Identifier;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.NodeVisitorAbstract;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Name.classes.FullyQualified;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.PropertyFetch;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.StaticPropertyFetch;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.ClassConstFetch;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Arg;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.Assign;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.StaticCall;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Sudo/SudoVisitor.php

*/

public class SudoVisitor extends NodeVisitorAbstract {

    public SudoVisitor(RuntimeEnv env, Object... args) {
        super(env);
    }

    public SudoVisitor(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "PhpParser\\Node")
    public Object enterNode(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object ___args = null;
        Object name = null;
        Object _pClass = null;
        Object target = null;
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        node, PropertyFetch.class, "PhpParser\\Node\\Expr\\PropertyFetch"))) {
            name =
                    ZVal.assign(
                            ZVal.isTrue(
                                            ZVal.checkInstanceType(
                                                    toObjectR(node)
                                                            .accessProp(this, env)
                                                            .name("name")
                                                            .value(),
                                                    Identifier.class,
                                                    "PhpParser\\Node\\Identifier"))
                                    ? env.callMethod(
                                            toObjectR(node)
                                                    .accessProp(this, env)
                                                    .name("name")
                                                    .value(),
                                            "toString",
                                            SudoVisitor.class)
                                    : toObjectR(node).accessProp(this, env).name("name").value());
            ___args =
                    ZVal.newArray(
                            new ZPair(0, toObjectR(node).accessProp(this, env).name("var").value()),
                            new ZPair(
                                    1,
                                    function_is_string.f.env(env).call(name).getBool()
                                            ? new String_(env, name)
                                            : name));
            return ZVal.assign(this.prepareCall(env, CONST_PROPERTY_FETCH, ___args));

        } else if (ZVal.toBool(
                        ZVal.checkInstanceType(node, Assign.class, "PhpParser\\Node\\Expr\\Assign"))
                && ZVal.toBool(
                        ZVal.checkInstanceType(
                                toObjectR(node).accessProp(this, env).name("var").value(),
                                PropertyFetch.class,
                                "PhpParser\\Node\\Expr\\PropertyFetch"))) {
            target = ZVal.assign(toObjectR(node).accessProp(this, env).name("var").value());
            name =
                    ZVal.assign(
                            ZVal.isTrue(
                                            ZVal.checkInstanceType(
                                                    toObjectR(target)
                                                            .accessProp(this, env)
                                                            .name("name")
                                                            .value(),
                                                    Identifier.class,
                                                    "PhpParser\\Node\\Identifier"))
                                    ? env.callMethod(
                                            toObjectR(target)
                                                    .accessProp(this, env)
                                                    .name("name")
                                                    .value(),
                                            "toString",
                                            SudoVisitor.class)
                                    : toObjectR(target).accessProp(this, env).name("name").value());
            ___args =
                    ZVal.newArray(
                            new ZPair(
                                    0, toObjectR(target).accessProp(this, env).name("var").value()),
                            new ZPair(
                                    1,
                                    function_is_string.f.env(env).call(name).getBool()
                                            ? new String_(env, name)
                                            : name),
                            new ZPair(
                                    2, toObjectR(node).accessProp(this, env).name("expr").value()));
            return ZVal.assign(this.prepareCall(env, CONST_PROPERTY_ASSIGN, ___args));

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        node, MethodCall.class, "PhpParser\\Node\\Expr\\MethodCall"))) {
            name =
                    ZVal.assign(
                            ZVal.isTrue(
                                            ZVal.checkInstanceType(
                                                    toObjectR(node)
                                                            .accessProp(this, env)
                                                            .name("name")
                                                            .value(),
                                                    Identifier.class,
                                                    "PhpParser\\Node\\Identifier"))
                                    ? env.callMethod(
                                            toObjectR(node)
                                                    .accessProp(this, env)
                                                    .name("name")
                                                    .value(),
                                            "toString",
                                            SudoVisitor.class)
                                    : toObjectR(node).accessProp(this, env).name("name").value());
            ___args = ZVal.assign(toObjectR(node).accessProp(this, env).name("args").value());
            function_array_unshift
                    .f
                    .env(env)
                    .call(
                            ___args,
                            new Arg(
                                    env,
                                    function_is_string.f.env(env).call(name).getBool()
                                            ? new String_(env, name)
                                            : name));
            function_array_unshift
                    .f
                    .env(env)
                    .call(
                            ___args,
                            new Arg(
                                    env,
                                    toObjectR(node).accessProp(this, env).name("var").value()));
            return ZVal.assign(
                    new StaticCall(
                            env,
                            new FullyQualified(env, CONST_SUDO_CLASS),
                            CONST_METHOD_CALL,
                            ___args));

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        node,
                        StaticPropertyFetch.class,
                        "PhpParser\\Node\\Expr\\StaticPropertyFetch"))) {
            _pClass =
                    ZVal.assign(
                            ZVal.isTrue(
                                            ZVal.checkInstanceType(
                                                    toObjectR(node)
                                                            .accessProp(this, env)
                                                            .name("class")
                                                            .value(),
                                                    Name.class,
                                                    "PhpParser\\Node\\Name"))
                                    ? env.callMethod(
                                            toObjectR(node)
                                                    .accessProp(this, env)
                                                    .name("class")
                                                    .value(),
                                            "toString",
                                            SudoVisitor.class)
                                    : toObjectR(node).accessProp(this, env).name("class").value());
            name =
                    ZVal.assign(
                            ZVal.isTrue(
                                            ZVal.checkInstanceType(
                                                    toObjectR(node)
                                                            .accessProp(this, env)
                                                            .name("name")
                                                            .value(),
                                                    Identifier.class,
                                                    "PhpParser\\Node\\Identifier"))
                                    ? env.callMethod(
                                            toObjectR(node)
                                                    .accessProp(this, env)
                                                    .name("name")
                                                    .value(),
                                            "toString",
                                            SudoVisitor.class)
                                    : toObjectR(node).accessProp(this, env).name("name").value());
            ___args =
                    ZVal.newArray(
                            new ZPair(
                                    0,
                                    function_is_string.f.env(env).call(_pClass).getBool()
                                            ? new String_(env, _pClass)
                                            : _pClass),
                            new ZPair(
                                    1,
                                    function_is_string.f.env(env).call(name).getBool()
                                            ? new String_(env, name)
                                            : name));
            return ZVal.assign(this.prepareCall(env, CONST_STATIC_PROPERTY_FETCH, ___args));

        } else if (ZVal.toBool(
                        ZVal.checkInstanceType(node, Assign.class, "PhpParser\\Node\\Expr\\Assign"))
                && ZVal.toBool(
                        ZVal.checkInstanceType(
                                toObjectR(node).accessProp(this, env).name("var").value(),
                                StaticPropertyFetch.class,
                                "PhpParser\\Node\\Expr\\StaticPropertyFetch"))) {
            target = ZVal.assign(toObjectR(node).accessProp(this, env).name("var").value());
            _pClass =
                    ZVal.assign(
                            ZVal.isTrue(
                                            ZVal.checkInstanceType(
                                                    toObjectR(target)
                                                            .accessProp(this, env)
                                                            .name("class")
                                                            .value(),
                                                    Name.class,
                                                    "PhpParser\\Node\\Name"))
                                    ? env.callMethod(
                                            toObjectR(target)
                                                    .accessProp(this, env)
                                                    .name("class")
                                                    .value(),
                                            "toString",
                                            SudoVisitor.class)
                                    : toObjectR(target)
                                            .accessProp(this, env)
                                            .name("class")
                                            .value());
            name =
                    ZVal.assign(
                            ZVal.isTrue(
                                            ZVal.checkInstanceType(
                                                    toObjectR(target)
                                                            .accessProp(this, env)
                                                            .name("name")
                                                            .value(),
                                                    Identifier.class,
                                                    "PhpParser\\Node\\Identifier"))
                                    ? env.callMethod(
                                            toObjectR(target)
                                                    .accessProp(this, env)
                                                    .name("name")
                                                    .value(),
                                            "toString",
                                            SudoVisitor.class)
                                    : toObjectR(target).accessProp(this, env).name("name").value());
            ___args =
                    ZVal.newArray(
                            new ZPair(
                                    0,
                                    function_is_string.f.env(env).call(_pClass).getBool()
                                            ? new String_(env, _pClass)
                                            : _pClass),
                            new ZPair(
                                    1,
                                    function_is_string.f.env(env).call(name).getBool()
                                            ? new String_(env, name)
                                            : name),
                            new ZPair(
                                    2, toObjectR(node).accessProp(this, env).name("expr").value()));
            return ZVal.assign(this.prepareCall(env, CONST_STATIC_PROPERTY_ASSIGN, ___args));

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        node, StaticCall.class, "PhpParser\\Node\\Expr\\StaticCall"))) {
            ___args = ZVal.assign(toObjectR(node).accessProp(this, env).name("args").value());
            _pClass =
                    ZVal.assign(
                            ZVal.isTrue(
                                            ZVal.checkInstanceType(
                                                    toObjectR(node)
                                                            .accessProp(this, env)
                                                            .name("class")
                                                            .value(),
                                                    Name.class,
                                                    "PhpParser\\Node\\Name"))
                                    ? env.callMethod(
                                            toObjectR(node)
                                                    .accessProp(this, env)
                                                    .name("class")
                                                    .value(),
                                            "toString",
                                            SudoVisitor.class)
                                    : toObjectR(node).accessProp(this, env).name("class").value());
            name =
                    ZVal.assign(
                            ZVal.isTrue(
                                            ZVal.checkInstanceType(
                                                    toObjectR(node)
                                                            .accessProp(this, env)
                                                            .name("name")
                                                            .value(),
                                                    Identifier.class,
                                                    "PhpParser\\Node\\Identifier"))
                                    ? env.callMethod(
                                            toObjectR(node)
                                                    .accessProp(this, env)
                                                    .name("name")
                                                    .value(),
                                            "toString",
                                            SudoVisitor.class)
                                    : toObjectR(node).accessProp(this, env).name("name").value());
            function_array_unshift
                    .f
                    .env(env)
                    .call(
                            ___args,
                            new Arg(
                                    env,
                                    function_is_string.f.env(env).call(name).getBool()
                                            ? new String_(env, name)
                                            : name));
            function_array_unshift
                    .f
                    .env(env)
                    .call(
                            ___args,
                            new Arg(
                                    env,
                                    function_is_string.f.env(env).call(_pClass).getBool()
                                            ? new String_(env, _pClass)
                                            : _pClass));
            return ZVal.assign(
                    new StaticCall(
                            env,
                            new FullyQualified(env, CONST_SUDO_CLASS),
                            CONST_STATIC_CALL,
                            ___args));

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        node, ClassConstFetch.class, "PhpParser\\Node\\Expr\\ClassConstFetch"))) {
            _pClass =
                    ZVal.assign(
                            ZVal.isTrue(
                                            ZVal.checkInstanceType(
                                                    toObjectR(node)
                                                            .accessProp(this, env)
                                                            .name("class")
                                                            .value(),
                                                    Name.class,
                                                    "PhpParser\\Node\\Name"))
                                    ? env.callMethod(
                                            toObjectR(node)
                                                    .accessProp(this, env)
                                                    .name("class")
                                                    .value(),
                                            "toString",
                                            SudoVisitor.class)
                                    : toObjectR(node).accessProp(this, env).name("class").value());
            name =
                    ZVal.assign(
                            ZVal.isTrue(
                                            ZVal.checkInstanceType(
                                                    toObjectR(node)
                                                            .accessProp(this, env)
                                                            .name("name")
                                                            .value(),
                                                    Identifier.class,
                                                    "PhpParser\\Node\\Identifier"))
                                    ? env.callMethod(
                                            toObjectR(node)
                                                    .accessProp(this, env)
                                                    .name("name")
                                                    .value(),
                                            "toString",
                                            SudoVisitor.class)
                                    : toObjectR(node).accessProp(this, env).name("name").value());
            ___args =
                    ZVal.newArray(
                            new ZPair(
                                    0,
                                    function_is_string.f.env(env).call(_pClass).getBool()
                                            ? new String_(env, _pClass)
                                            : _pClass),
                            new ZPair(
                                    1,
                                    function_is_string.f.env(env).call(name).getBool()
                                            ? new String_(env, name)
                                            : name));
            return ZVal.assign(this.prepareCall(env, CONST_CLASS_CONST_FETCH, ___args));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "args")
    private Object prepareCall(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/psy/psysh/src/Sudo")
                        .setFile("/vendor/psy/psysh/src/Sudo/SudoVisitor.php");
        Object method = assignParameter(args, 0, false);
        Object ___args = assignParameter(args, 1, false);
        return ZVal.assign(
                new StaticCall(
                        env,
                        new FullyQualified(env, CONST_SUDO_CLASS),
                        method,
                        function_array_map
                                .f
                                .env(env)
                                .call(
                                        new Closure(
                                                env,
                                                runtimeConverterFunctionClassConstants,
                                                "Psy\\Sudo",
                                                this) {
                                            @Override
                                            @ConvertedMethod
                                            @ConvertedParameter(index = 0, name = "arg")
                                            public Object run(
                                                    RuntimeEnv env,
                                                    Object thisvar,
                                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                                    Object... args) {
                                                Object arg = assignParameter(args, 0, false);
                                                return ZVal.assign(new Arg(env, arg));
                                            }
                                        },
                                        ___args)
                                .value()));
    }

    public static final Object CONST_SUDO_CLASS = "Psy\\Sudo";

    public static final Object CONST_PROPERTY_FETCH = "fetchProperty";

    public static final Object CONST_PROPERTY_ASSIGN = "assignProperty";

    public static final Object CONST_METHOD_CALL = "callMethod";

    public static final Object CONST_STATIC_PROPERTY_FETCH = "fetchStaticProperty";

    public static final Object CONST_STATIC_PROPERTY_ASSIGN = "assignStaticProperty";

    public static final Object CONST_STATIC_CALL = "callStatic";

    public static final Object CONST_CLASS_CONST_FETCH = "fetchClassConst";

    public static final Object CONST_class = "Psy\\Sudo\\SudoVisitor";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends NodeVisitorAbstract.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Sudo\\SudoVisitor")
                    .setLookup(
                            SudoVisitor.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/psy/psysh/src/Sudo/SudoVisitor.php")
                    .addInterface("PhpParser\\NodeVisitor")
                    .addExtendsClass("PhpParser\\NodeVisitorAbstract")
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
