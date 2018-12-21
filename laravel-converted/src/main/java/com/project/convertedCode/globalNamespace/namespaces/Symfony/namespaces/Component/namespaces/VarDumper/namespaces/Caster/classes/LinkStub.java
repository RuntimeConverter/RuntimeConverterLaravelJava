package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeFunctions.file.function_realpath;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.ConstStub;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_declared_classes;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Caster/LinkStub.php

*/

public class LinkStub extends ConstStub {

    public Object inVendor = false;

    public LinkStub(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == LinkStub.class) {
            this.__construct(env, args);
        }
    }

    public LinkStub(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "label")
    @ConvertedParameter(
        index = 1,
        name = "line",
        typeHint = "int",
        defaultValue = "0",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 2,
        name = "href",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object label = assignParameter(args, 0, false);
        Object line = assignParameter(args, 1, true);
        if (null == line) {
            line = 0;
        }
        Object href = assignParameter(args, 2, true);
        if (null == href) {
            href = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        Object composerRoot = null;
        Object ellipsis = null;
        toObjectR(this).accessProp(this, env).name("value").set(label);
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", href)) {
            href = ZVal.assign(label);
        }

        if (!function_is_string.f.env(env).call(href).getBool()) {
            return null;
        }

        if (ZVal.strictEqualityCheck(
                0, "===", function_strpos.f.env(env).call(href, "file://").value())) {
            if (ZVal.strictEqualityCheck(href, "===", label)) {
                label = function_substr.f.env(env).call(label, 7).value();
            }

            href = function_substr.f.env(env).call(href, 7).value();

        } else if (ZVal.strictNotEqualityCheck(
                false, "!==", function_strpos.f.env(env).call(href, "://").value())) {
            new ReferenceClassProperty(this, "attr", env).arrayAccess(env, "href").set(href);
            return null;
        }

        if (!function_file_exists.f.env(env).call(href).getBool()) {
            return null;
        }

        if (ZVal.isTrue(line)) {
            new ReferenceClassProperty(this, "attr", env).arrayAccess(env, "line").set(line);
        }

        if (ZVal.strictNotEqualityCheck(
                label,
                "!==",
                new ReferenceClassProperty(this, "attr", env)
                        .arrayAccess(env, "file")
                        .set(
                                ZVal.isTrue(
                                                ternaryExpressionTemp =
                                                        function_realpath
                                                                .f
                                                                .env(env)
                                                                .call(href)
                                                                .value())
                                        ? ternaryExpressionTemp
                                        : href))) {
            return null;
        }

        if (ZVal.isTrue(
                composerRoot =
                        env.callMethod(
                                this,
                                new RuntimeArgsWithReferences()
                                        .add(1, new ReferenceClassProperty(this, "inVendor", env)),
                                "getComposerRoot",
                                LinkStub.class,
                                href,
                                this.inVendor))) {
            new ReferenceClassProperty(this, "attr", env)
                    .arrayAccess(env, "ellipsis")
                    .set(
                            ZVal.add(
                                    ZVal.subtract(
                                            function_strlen.f.env(env).call(href).value(),
                                            function_strlen.f.env(env).call(composerRoot).value()),
                                    1));
            new ReferenceClassProperty(this, "attr", env)
                    .arrayAccess(env, "ellipsis-type")
                    .set("path");
            new ReferenceClassProperty(this, "attr", env)
                    .arrayAccess(env, "ellipsis-tail")
                    .set(
                            ZVal.add(
                                    1,
                                    ZVal.isTrue(this.inVendor)
                                            ? ZVal.add(
                                                    2,
                                                    function_strlen
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    NamespaceGlobal.implode
                                                                            .env(env)
                                                                            .call(
                                                                                    function_array_slice
                                                                                            .f
                                                                                            .env(
                                                                                                    env)
                                                                                            .call(
                                                                                                    function_explode
                                                                                                            .f
                                                                                                            .env(
                                                                                                                    env)
                                                                                                            .call(
                                                                                                                    "/",
                                                                                                                    function_substr
                                                                                                                            .f
                                                                                                                            .env(
                                                                                                                                    env)
                                                                                                                            .call(
                                                                                                                                    href,
                                                                                                                                    ZVal
                                                                                                                                            .subtract(
                                                                                                                                                    1,
                                                                                                                                                    new ReferenceClassProperty(
                                                                                                                                                                    this,
                                                                                                                                                                    "attr",
                                                                                                                                                                    env)
                                                                                                                                                            .arrayGet(
                                                                                                                                                                    env,
                                                                                                                                                                    "ellipsis")))
                                                                                                                            .value())
                                                                                                            .value(),
                                                                                                    0,
                                                                                                    2)
                                                                                            .value())
                                                                            .value())
                                                            .value())
                                            : 0));

        } else if (ZVal.isLessThan(
                3,
                '<',
                function_count
                        .f
                        .env(env)
                        .call(ellipsis = function_explode.f.env(env).call("/", href).value())
                        .value())) {
            new ReferenceClassProperty(this, "attr", env)
                    .arrayAccess(env, "ellipsis")
                    .set(
                            ZVal.add(
                                    2,
                                    function_strlen
                                            .f
                                            .env(env)
                                            .call(
                                                    NamespaceGlobal.implode
                                                            .env(env)
                                                            .call(
                                                                    function_array_slice
                                                                            .f
                                                                            .env(env)
                                                                            .call(ellipsis, -2)
                                                                            .value())
                                                            .value())
                                            .value()));
            new ReferenceClassProperty(this, "attr", env)
                    .arrayAccess(env, "ellipsis-type")
                    .set("path");
            new ReferenceClassProperty(this, "attr", env).arrayAccess(env, "ellipsis-tail").set(1);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    @ConvertedParameter(index = 1, name = "inVendor")
    private Object getComposerRoot(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        int runtimeConverterBreakCount;
        Object file = assignParameter(args, 0, false);
        ReferenceContainer inVendor =
                assignParameterRef(runtimePassByReferenceArgs, args, 1, false);
        Object parent = null;
        Object r = null;
        Object v = null;
        Object root = null;
        Object dir = null;
        ReferenceContainer _pClass = new BasicReferenceContainer(null);
        if (ZVal.strictEqualityCheck(
                ZVal.getNull(),
                "===",
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
                                        .LinkStub
                                        .RequestStaticProperties
                                        .class)
                        .vendorRoots)) {
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
                                            .LinkStub
                                            .RequestStaticProperties
                                            .class)
                            .vendorRoots =
                    ZVal.newArray();
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult2188 :
                    ZVal.getIterable(
                            function_get_declared_classes.f.env(env).call().value(), env, true)) {
                _pClass.setObject(ZVal.assign(zpairResult2188.getValue()));
                if (ZVal.toBool(ZVal.strictEqualityCheck("C", "===", _pClass.arrayGet(env, 0)))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        0,
                                        "===",
                                        function_strpos
                                                .f
                                                .env(env)
                                                .call(_pClass.getObject(), "ComposerAutoloaderInit")
                                                .value()))) {
                    r = new ReflectionClass(env, _pClass.getObject());
                    v =
                            function_dirname
                                    .f
                                    .env(env)
                                    .call(
                                            function_dirname
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            env.callMethod(
                                                                    r,
                                                                    "getFileName",
                                                                    LinkStub.class))
                                                    .value())
                                    .value();
                    if (function_file_exists
                            .f
                            .env(env)
                            .call(toStringR(v, env) + "/composer/installed.json")
                            .getBool()) {
                        env.getRequestStaticPropertiesReference(
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
                                                .LinkStub
                                                .RequestStaticProperties
                                                .class,
                                        "vendorRoots")
                                .arrayAppend(env)
                                .set(toStringR(v, env) + toStringR("/", env));
                    }
                }
            }
        }

        inVendor.setObject(false);
        if (arrayActionR(
                ArrayAction.ISSET,
                env.getRequestStaticPropertiesReference(
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
                                .LinkStub
                                .RequestStaticProperties
                                .class,
                        "composerRoots"),
                env,
                dir = function_dirname.f.env(env).call(file).value())) {
            return ZVal.assign(
                    env.getRequestStaticPropertiesReference(
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
                                            .LinkStub
                                            .RequestStaticProperties
                                            .class,
                                    "composerRoots")
                            .arrayGet(env, dir));
        }

        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult2189 :
                ZVal.getIterable(
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
                                                .LinkStub
                                                .RequestStaticProperties
                                                .class)
                                .vendorRoots,
                        env,
                        true)) {
            root = ZVal.assign(zpairResult2189.getValue());
            if (ZVal.isTrue(
                    inVendor.setObject(
                            ZVal.strictEqualityCheck(
                                    0,
                                    "===",
                                    function_strpos.f.env(env).call(file, root).value())))) {
                return ZVal.assign(root);
            }
        }

        parent = ZVal.assign(dir);
        runtimeConverterBreakCount = 0;
        while (!ZVal.isTrue(
                function_file_exists
                        .f
                        .env(env)
                        .call(toStringR(parent, env) + "/composer.json")
                        .value())) {
            if (!ZVal.isTrue(function_file_exists.f.env(env).call(parent).value())) {
                break;
            }

            if (ZVal.strictEqualityCheck(
                    parent, "===", function_dirname.f.env(env).call(parent).value())) {
                return ZVal.assign(
                        env.getRequestStaticPropertiesReference(
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
                                                .LinkStub
                                                .RequestStaticProperties
                                                .class,
                                        "composerRoots")
                                .arrayAccess(env, dir)
                                .set(false));
            }

            parent = function_dirname.f.env(env).call(parent).value();
        }

        return ZVal.assign(
                env.getRequestStaticPropertiesReference(
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
                                        .LinkStub
                                        .RequestStaticProperties
                                        .class,
                                "composerRoots")
                        .arrayAccess(env, dir)
                        .set(toStringR(parent, env) + toStringR("/", env)));
    }

    public Object getComposerRoot(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    public static final Object CONST_class = "Symfony\\Component\\VarDumper\\Caster\\LinkStub";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ConstStub.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object vendorRoots = null;

        public Object composerRoots = null;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\VarDumper\\Caster\\LinkStub")
                    .setLookup(
                            LinkStub.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "attr",
                            "class",
                            "cut",
                            "handle",
                            "inVendor",
                            "position",
                            "refCount",
                            "type",
                            "value")
                    .setStaticPropertyNames("composerRoots", "vendorRoots")
                    .setFilename("vendor/symfony/var-dumper/Caster/LinkStub.php")
                    .addInterface("Serializable")
                    .addExtendsClass("Symfony\\Component\\VarDumper\\Caster\\ConstStub")
                    .addExtendsClass("Symfony\\Component\\VarDumper\\Cloner\\Stub")
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
