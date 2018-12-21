package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Debug.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeInterfaces.Serializable;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_get;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Exception.classes.ExceptionInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_unserialize;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_serialize;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.Request;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/Debug/FileLinkFormatter.php

*/

public class FileLinkFormatter extends RuntimeClassBase implements Serializable {

    public Object fileLinkFormat = null;

    public Object requestStack = null;

    public Object baseDir = null;

    public Object urlFormat = null;

    public FileLinkFormatter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FileLinkFormatter.class) {
            this.__construct(env, args);
        }
    }

    public FileLinkFormatter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "fileLinkFormat",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "requestStack",
        typeHint = "Symfony\\Component\\HttpFoundation\\RequestStack",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "baseDir",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "urlFormat",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object fileLinkFormat = assignParameter(args, 0, true);
        if (null == fileLinkFormat) {
            fileLinkFormat = ZVal.getNull();
        }
        Object requestStack = assignParameter(args, 1, true);
        if (null == requestStack) {
            requestStack = ZVal.getNull();
        }
        Object baseDir = assignParameter(args, 2, true);
        if (null == baseDir) {
            baseDir = ZVal.getNull();
        }
        Object urlFormat = assignParameter(args, 3, true);
        if (null == urlFormat) {
            urlFormat = ZVal.getNull();
        }
        Object f = null;
        Object i = null;
        Object ternaryExpressionTemp = null;
        fileLinkFormat =
                ZVal.assign(
                        ZVal.isTrue(
                                        ternaryExpressionTemp =
                                                ZVal.isTrue(ternaryExpressionTemp = fileLinkFormat)
                                                        ? ternaryExpressionTemp
                                                        : function_ini_get
                                                                .f
                                                                .env(env)
                                                                .call("xdebug.file_link_format")
                                                                .value())
                                ? ternaryExpressionTemp
                                : NamespaceGlobal.get_cfg_var
                                        .env(env)
                                        .call("xdebug.file_link_format")
                                        .value());
        if (ZVal.toBool(fileLinkFormat)
                && ZVal.toBool(!function_is_array.f.env(env).call(fileLinkFormat).getBool())) {
            i =
                    ZVal.assign(
                            ZVal.isTrue(
                                            ternaryExpressionTemp =
                                                    function_strpos
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    f = ZVal.assign(fileLinkFormat),
                                                                    "&",
                                                                    NamespaceGlobal.max
                                                                            .env(env)
                                                                            .call(
                                                                                    NamespaceGlobal
                                                                                            .strrpos
                                                                                            .env(
                                                                                                    env)
                                                                                            .call(
                                                                                                    f,
                                                                                                    "%f")
                                                                                            .value(),
                                                                                    NamespaceGlobal
                                                                                            .strrpos
                                                                                            .env(
                                                                                                    env)
                                                                                            .call(
                                                                                                    f,
                                                                                                    "%l")
                                                                                            .value())
                                                                            .value())
                                                            .value())
                                    ? ternaryExpressionTemp
                                    : function_strlen.f.env(env).call(f).value());
            fileLinkFormat =
                    ZVal.add(
                            ZVal.newArray(
                                    new ZPair(0, function_substr.f.env(env).call(f, 0, i).value())),
                            NamespaceGlobal.preg_split
                                    .env(env)
                                    .call(
                                            "/&([^>]++)>/",
                                            function_substr.f.env(env).call(f, i).value(),
                                            -1,
                                            2)
                                    .value());
        }

        this.fileLinkFormat = fileLinkFormat;
        this.requestStack = requestStack;
        this.baseDir = baseDir;
        this.urlFormat = urlFormat;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    @ConvertedParameter(index = 1, name = "line")
    public Object format(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object file = assignParameter(args, 0, false);
        Object line = assignParameter(args, 1, false);
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object k = null;
        ReferenceContainer fmt = new BasicReferenceContainer(null);
        if (ZVal.isTrue(fmt.setObject(this.getFileLinkFormat(env)))) {
            runtimeConverterBreakCount = 0;
            for (i.setObject(1);
                    arrayActionR(ArrayAction.ISSET, fmt, env, i.getObject());
                    i.setObject(ZVal.increment(i.getObject()))) {
                if (ZVal.strictEqualityCheck(
                        0,
                        "===",
                        function_strpos
                                .f
                                .env(env)
                                .call(
                                        file,
                                        k = ZVal.assign(fmt.arrayGet(env, ZVal.postIncrement(i))))
                                .value())) {
                    file =
                            NamespaceGlobal.substr_replace
                                    .env(env)
                                    .call(
                                            file,
                                            fmt.arrayGet(env, i.getObject()),
                                            0,
                                            function_strlen.f.env(env).call(k).value())
                                    .value();
                    break;
                }
            }

            return ZVal.assign(
                    NamespaceGlobal.strtr
                            .env(env)
                            .call(
                                    fmt.arrayGet(env, 0),
                                    ZVal.newArray(new ZPair("%f", file), new ZPair("%l", line)))
                            .value());
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object serialize(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_serialize.f.env(env).call(this.getFileLinkFormat(env)).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "serialized")
    public Object unserialize(RuntimeEnv env, Object... args) {
        Object serialized = assignParameter(args, 0, false);
        this.fileLinkFormat =
                function_unserialize
                        .f
                        .env(env)
                        .call(serialized, ZVal.newArray(new ZPair("allowed_classes", false)))
                        .value();
        return null;
    }

    @ConvertedMethod
    private Object getFileLinkFormat(RuntimeEnv env, Object... args) {
        Object request = null;
        if (ZVal.isTrue(this.fileLinkFormat)) {
            return ZVal.assign(this.fileLinkFormat);
        }

        if (ZVal.toBool(ZVal.toBool(this.requestStack) && ZVal.toBool(this.baseDir))
                && ZVal.toBool(this.urlFormat)) {
            request =
                    env.callMethod(this.requestStack, "getMasterRequest", FileLinkFormatter.class);
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            request,
                            Request.class,
                            "Symfony\\Component\\HttpFoundation\\Request"))) {
                if (ZVal.toBool(ZVal.checkInstanceType(this.urlFormat, Closure.class, "Closure"))
                        && ZVal.toBool(
                                !ZVal.isTrue(
                                        this.urlFormat =
                                                function_call_user_func
                                                        .f
                                                        .env(env)
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithInfo(args, this))
                                                        .call(this.urlFormat)
                                                        .value()))) {
                    return null;
                }

                return ZVal.assign(
                        ZVal.newArray(
                                new ZPair(
                                        0,
                                        toStringR(
                                                        env.callMethod(
                                                                request,
                                                                "getSchemeAndHttpHost",
                                                                FileLinkFormatter.class),
                                                        env)
                                                + toStringR(
                                                        env.callMethod(
                                                                request,
                                                                "getBaseUrl",
                                                                FileLinkFormatter.class),
                                                        env)
                                                + toStringR(this.urlFormat, env)),
                                new ZPair(1, toStringR(this.baseDir, env) + toStringR("/", env)),
                                new ZPair(2, "")));
            }
        }

        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\Debug\\FileLinkFormatter";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "router",
            typeHint = "Symfony\\Component\\Routing\\Generator\\UrlGeneratorInterface"
        )
        @ConvertedParameter(index = 1, name = "routeName")
        @ConvertedParameter(index = 2, name = "queryString")
        public Object generateUrlFormat(RuntimeEnv env, Object... args) {
            Object router = assignParameter(args, 0, false);
            Object routeName = assignParameter(args, 1, false);
            Object queryString = assignParameter(args, 2, false);
            Object e = null;
            try {
                return ZVal.assign(
                        toStringR(
                                        env.callMethod(
                                                router,
                                                "generate",
                                                FileLinkFormatter.class,
                                                routeName),
                                        env)
                                + toStringR(queryString, env));
            } catch (ConvertedException convertedException278) {
                if (convertedException278.instanceOf(
                        ExceptionInterface.class,
                        "Symfony\\Component\\Routing\\Exception\\ExceptionInterface")) {
                    e = convertedException278.getObject();
                    return ZVal.assign(ZVal.getNull());
                } else {
                    throw convertedException278;
                }
            }
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpKernel\\Debug\\FileLinkFormatter")
                    .setLookup(
                            FileLinkFormatter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("baseDir", "fileLinkFormat", "requestStack", "urlFormat")
                    .setFilename("vendor/symfony/http-kernel/Debug/FileLinkFormatter.php")
                    .addInterface("Serializable")
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
