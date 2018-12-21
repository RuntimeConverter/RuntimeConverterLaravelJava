package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.VarDumper.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.VarDumper.classes.Dumper;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.Caster;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Formatter.classes.OutputFormatter;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.VarDumper.classes.Cloner;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/VarDumper/Presenter.php

*/

public class Presenter extends RuntimeClassBase {

    public Object cloner = null;

    public Object dumper = null;

    public Object exceptionsImportants =
            ZVal.arrayFromList(
                    "\u0000*\u0000message",
                    "\u0000*\u0000code",
                    "\u0000*\u0000file",
                    "\u0000*\u0000line",
                    "\u0000Exception\u0000previous");

    public Object styles =
            ZVal.newArray(
                    new ZPair("num", "number"),
                    new ZPair("const", "const"),
                    new ZPair("str", "string"),
                    new ZPair("cchr", "default"),
                    new ZPair("note", "class"),
                    new ZPair("ref", "default"),
                    new ZPair("public", "public"),
                    new ZPair("protected", "protected"),
                    new ZPair("private", "private"),
                    new ZPair("meta", "comment"),
                    new ZPair("key", "comment"),
                    new ZPair("index", "number"));

    public Presenter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Presenter.class) {
            this.__construct(env, args);
        }
    }

    public Presenter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "formatter",
        typeHint = "Symfony\\Component\\Console\\Formatter\\OutputFormatter"
    )
    @ConvertedParameter(
        index = 1,
        name = "forceArrayIndexes",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/psy/psysh/src/VarDumper")
                        .setFile("/vendor/psy/psysh/src/VarDumper/Presenter.php");
        Object formatter = assignParameter(args, 0, false);
        Object forceArrayIndexes = assignParameter(args, 1, true);
        if (null == forceArrayIndexes) {
            forceArrayIndexes = false;
        }
        Object oldLocale = null;
        oldLocale = NamespaceGlobal.setlocale.env(env).call(1, 0).value();
        NamespaceGlobal.setlocale.env(env).call(1, "C");
        this.dumper = new Dumper(env, formatter, forceArrayIndexes);
        env.callMethod(this.dumper, "setStyles", Presenter.class, this.styles);
        NamespaceGlobal.setlocale.env(env).call(1, oldLocale);
        this.cloner = new Cloner(env);
        env.callMethod(
                this.cloner,
                "addCasters",
                Presenter.class,
                ZVal.newArray(
                        new ZPair(
                                "*",
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Psy\\VarDumper",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "obj")
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
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object obj = assignParameter(args, 0, false);
                                        Object a = assignParameter(args, 1, false);
                                        Object stub = assignParameter(args, 2, false);
                                        Object isNested = assignParameter(args, 3, false);
                                        Object filter = assignParameter(args, 4, true);
                                        if (null == filter) {
                                            filter = 0;
                                        }
                                        if (ZVal.toBool(filter) || ZVal.toBool(isNested)) {
                                            if (ZVal.isTrue(
                                                    ZVal.checkInstanceType(
                                                            obj,
                                                            PHPException.class,
                                                            "Exception"))) {
                                                a =
                                                        Caster.runtimeStaticObject.filter(
                                                                env,
                                                                a,
                                                                ZVal.toLong(
                                                                                Caster
                                                                                        .CONST_EXCLUDE_NOT_IMPORTANT)
                                                                        | ZVal.toLong(
                                                                                Caster
                                                                                        .CONST_EXCLUDE_EMPTY),
                                                                Presenter.this
                                                                        .exceptionsImportants);

                                            } else {
                                                a =
                                                        Caster.runtimeStaticObject.filter(
                                                                env,
                                                                a,
                                                                ZVal.toLong(
                                                                                Caster
                                                                                        .CONST_EXCLUDE_PROTECTED)
                                                                        | ZVal.toLong(
                                                                                Caster
                                                                                        .CONST_EXCLUDE_PRIVATE));
                                            }
                                        }

                                        return ZVal.assign(a);
                                    }
                                })));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "casters", typeHint = "array")
    public Object addCasters(RuntimeEnv env, Object... args) {
        Object casters = assignParameter(args, 0, false);
        env.callMethod(this.cloner, "addCasters", Presenter.class, casters);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object presentRef(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(this.present(env, value, 0));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(
        index = 1,
        name = "depth",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "options",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object present(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/psy/psysh/src/VarDumper")
                        .setFile("/vendor/psy/psysh/src/VarDumper/Presenter.php");
        Object value = assignParameter(args, 0, false);
        Object depth = assignParameter(args, 1, true);
        if (null == depth) {
            depth = ZVal.getNull();
        }
        Object options = assignParameter(args, 2, true);
        if (null == options) {
            options = 0;
        }
        ReferenceContainer output = new BasicReferenceContainer(null);
        Object data = null;
        Object oldLocale = null;
        data =
                env.callMethod(
                        this.cloner,
                        "cloneVar",
                        Presenter.class,
                        value,
                        !ZVal.isTrue(ZVal.toLong(options) & ZVal.toLong(CONST_VERBOSE))
                                ? Caster.CONST_EXCLUDE_VERBOSE
                                : 0);
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", depth)) {
            data = env.callMethod(data, "withMaxDepth", Presenter.class, depth);
        }

        oldLocale = NamespaceGlobal.setlocale.env(env).call(1, 0).value();
        NamespaceGlobal.setlocale.env(env).call(1, "C");
        output.setObject("");
        env.callMethod(
                this.dumper,
                "dump",
                Presenter.class,
                data,
                new Closure(env, runtimeConverterFunctionClassConstants, "Psy\\VarDumper", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "line")
                    @ConvertedParameter(index = 1, name = "depth")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object line = assignParameter(args, 0, false);
                        Object depth = assignParameter(args, 1, false);
                        ReferenceContainer output = new BasicReferenceContainer(null);
                        output = this.contextReferences.getReferenceContainer("output");
                        if (ZVal.isGreaterThanOrEqualTo(depth, ">=", 0)) {
                            if (ZVal.strictNotEqualityCheck("", "!==", output.getObject())) {
                                output.setObject(
                                        toStringR(output.getObject(), env) + toStringR("\n", env));
                            }

                            output.setObject(
                                    toStringR(output.getObject(), env)
                                            + toStringR(
                                                    function_str_repeat
                                                            .f
                                                            .env(env)
                                                            .call("  ", depth)
                                                            .value(),
                                                    env)
                                            + toStringR(line, env));
                        }

                        return null;
                    }
                }.useRef("output", output));
        NamespaceGlobal.setlocale.env(env).call(1, oldLocale);
        return ZVal.assign(OutputFormatter.runtimeStaticObject.escape(env, output.getObject()));
    }

    public static final Object CONST_VERBOSE = 1;

    public static final Object CONST_class = "Psy\\VarDumper\\Presenter";

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
                    .setName("Psy\\VarDumper\\Presenter")
                    .setLookup(
                            Presenter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("cloner", "dumper", "exceptionsImportants", "styles")
                    .setFilename("vendor/psy/psysh/src/VarDumper/Presenter.php")
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
