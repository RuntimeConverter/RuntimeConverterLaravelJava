package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.classes.HttpKernelInterface;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_get_clean;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_start;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_serialize;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.Request;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_error_reporting;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.classes.TerminableInterface;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_declared_classes;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.classes.UploadedFile;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/Client.php

*/

public class Client extends RuntimeClassBase {

    public Object kernel = null;

    public Object catchExceptions = true;

    public Client(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Client.class) {
            this.__construct(env, args);
        }
    }

    public Client(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "kernel",
        typeHint = "Symfony\\Component\\HttpKernel\\HttpKernelInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "server",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "history",
        typeHint = "Symfony\\Component\\BrowserKit\\History",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "cookieJar",
        typeHint = "Symfony\\Component\\BrowserKit\\CookieJar",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object kernel = assignParameter(args, 0, false);
        Object server = assignParameter(args, 1, true);
        if (null == server) {
            server = ZVal.newArray();
        }
        Object history = assignParameter(args, 2, true);
        if (null == history) {
            history = ZVal.getNull();
        }
        Object cookieJar = assignParameter(args, 3, true);
        if (null == cookieJar) {
            cookieJar = ZVal.getNull();
        }
        this.kernel = kernel;
        toObjectR(this).accessProp(this, env).name("followRedirects").set(false);
        StaticMethodUtils.getStaticBaseClass(ZVal.resolveClassAlias(env, "parent"), env)
                .callUnknownStaticMethod(
                        env,
                        "__construct",
                        new RuntimeArgsWithReferences(),
                        server,
                        history,
                        cookieJar);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "catchExceptions")
    public Object catchExceptions(RuntimeEnv env, Object... args) {
        Object catchExceptions = assignParameter(args, 0, false);
        this.catchExceptions = catchExceptions;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    protected Object doRequest(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object response = null;
        response =
                env.callMethod(
                        this.kernel,
                        "handle",
                        Client.class,
                        request,
                        HttpKernelInterface.CONST_MASTER_REQUEST,
                        this.catchExceptions);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        this.kernel,
                        TerminableInterface.class,
                        "Symfony\\Component\\HttpKernel\\TerminableInterface"))) {
            env.callMethod(this.kernel, "terminate", Client.class, request, response);
        }

        return ZVal.assign(response);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    protected Object getScript(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object r = null;
        Object errorReporting = null;
        Object file = null;
        Object code = null;
        Object kernel = null;
        Object _pClass = null;
        Object requires = null;
        kernel =
                function_str_replace
                        .f
                        .env(env)
                        .call("'", "\\'", function_serialize.f.env(env).call(this.kernel).value())
                        .value();
        request =
                function_str_replace
                        .f
                        .env(env)
                        .call("'", "\\'", function_serialize.f.env(env).call(request).value())
                        .value();
        errorReporting = function_error_reporting.f.env(env).call().value();
        requires = "";
        for (ZPair zpairResult1901 :
                ZVal.getIterable(
                        function_get_declared_classes.f.env(env).call().value(), env, true)) {
            _pClass = ZVal.assign(zpairResult1901.getValue());
            if (ZVal.strictEqualityCheck(
                    0,
                    "===",
                    function_strpos.f.env(env).call(_pClass, "ComposerAutoloaderInit").value())) {
                r = new ReflectionClass(env, _pClass);
                file =
                        toStringR(
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
                                                                                Client.class))
                                                                .value())
                                                .value(),
                                        env)
                                + "/autoload.php";
                if (function_file_exists.f.env(env).call(file).getBool()) {
                    requires =
                            toStringR(requires, env)
                                    + "require_once '"
                                    + toStringR(
                                            function_str_replace
                                                    .f
                                                    .env(env)
                                                    .call("'", "\\'", file)
                                                    .value(),
                                            env)
                                    + "';\n";
                }
            }
        }

        if (!ZVal.isTrue(requires)) {
            throw ZVal.getException(
                    env, new RuntimeException(env, "Composer autoloader not found."));
        }

        code =
                ZVal.assign(
                        "<?php\n\nerror_reporting("
                                + toStringR(errorReporting, env)
                                + ");\n\n"
                                + toStringR(requires, env)
                                + "\n\n$kernel = unserialize('"
                                + toStringR(kernel, env)
                                + "');\n$request = unserialize('"
                                + toStringR(request, env)
                                + "');");
        return ZVal.assign(toStringR(code, env) + toStringR(this.getHandleScript(env), env));
    }

    @ConvertedMethod
    protected Object getHandleScript(RuntimeEnv env, Object... args) {
        return "$response = $kernel->handle($request);\n\nif ($kernel instanceof Symfony\\Component\\HttpKernel\\TerminableInterface) {\n    $kernel->terminate($request, $response);\n}\n\necho serialize($response);";
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\BrowserKit\\Request"
    )
    protected Object filterRequest(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object httpRequest = null;
        Object value = null;
        Object key = null;
        httpRequest =
                Request.runtimeStaticObject.create(
                        env,
                        env.callMethod(request, "getUri", Client.class),
                        env.callMethod(request, "getMethod", Client.class),
                        env.callMethod(request, "getParameters", Client.class),
                        env.callMethod(request, "getCookies", Client.class),
                        env.callMethod(request, "getFiles", Client.class),
                        env.callMethod(request, "getServer", Client.class),
                        env.callMethod(request, "getContent", Client.class));
        for (ZPair zpairResult1902 :
                ZVal.getIterable(
                        this.filterFiles(
                                env,
                                env.callMethod(
                                        toObjectR(httpRequest)
                                                .accessProp(this, env)
                                                .name("files")
                                                .value(),
                                        "all",
                                        Client.class)),
                        env,
                        false)) {
            key = ZVal.assign(zpairResult1902.getKey());
            value = ZVal.assign(zpairResult1902.getValue());
            env.callMethod(
                    toObjectR(httpRequest).accessProp(this, env).name("files").value(),
                    "set",
                    Client.class,
                    key,
                    value);
        }

        return ZVal.assign(httpRequest);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "files", typeHint = "array")
    protected Object filterFiles(RuntimeEnv env, Object... args) {
        Object files = assignParameter(args, 0, false);
        ReferenceContainer filtered = new BasicReferenceContainer(null);
        Object value = null;
        Object key = null;
        filtered.setObject(ZVal.newArray());
        for (ZPair zpairResult1903 : ZVal.getIterable(files, env, false)) {
            key = ZVal.assign(zpairResult1903.getKey());
            value = ZVal.assign(zpairResult1903.getValue());
            if (function_is_array.f.env(env).call(value).getBool()) {
                filtered.arrayAccess(env, key).set(this.filterFiles(env, value));

            } else if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            value,
                            UploadedFile.class,
                            "Symfony\\Component\\HttpFoundation\\File\\UploadedFile"))) {
                if (ZVal.toBool(env.callMethod(value, "isValid", Client.class))
                        && ZVal.toBool(
                                ZVal.isGreaterThan(
                                        env.callMethod(value, "getSize", Client.class),
                                        '>',
                                        UploadedFile.runtimeStaticObject.getMaxFilesize(env)))) {
                    filtered.arrayAccess(env, key)
                            .set(
                                    new UploadedFile(
                                            env,
                                            "",
                                            env.callMethod(
                                                    value, "getClientOriginalName", Client.class),
                                            env.callMethod(
                                                    value, "getClientMimeType", Client.class),
                                            1,
                                            true));

                } else {
                    filtered.arrayAccess(env, key)
                            .set(
                                    new UploadedFile(
                                            env,
                                            env.callMethod(value, "getPathname", Client.class),
                                            env.callMethod(
                                                    value, "getClientOriginalName", Client.class),
                                            env.callMethod(
                                                    value, "getClientMimeType", Client.class),
                                            env.callMethod(value, "getError", Client.class),
                                            true));
                }
            }
        }

        return ZVal.assign(filtered.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "response")
    protected Object filterResponse(RuntimeEnv env, Object... args) {
        Object response = assignParameter(args, 0, false);
        Object content = null;
        function_ob_start.f.env(env).call();
        env.callMethod(response, "sendContent", Client.class);
        content = function_ob_get_clean.f.env(env).call().value();
        return ZVal.assign(
                env.createNew(
                        ZVal.resolveClassAlias(env, "DomResponse"),
                        content,
                        env.callMethod(response, "getStatusCode", Client.class),
                        env.callMethod(
                                toObjectR(response).accessProp(this, env).name("headers").value(),
                                "all",
                                Client.class)));
    }

    public static final Object CONST_class = "Symfony\\Component\\HttpKernel\\Client";

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
                    .setName("Symfony\\Component\\HttpKernel\\Client")
                    .setLookup(
                            Client.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("catchExceptions", "kernel")
                    .setFilename("vendor/symfony/http-kernel/Client.php")
                    .addExtendsClass("Symfony\\Component\\BrowserKit\\Client")
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
