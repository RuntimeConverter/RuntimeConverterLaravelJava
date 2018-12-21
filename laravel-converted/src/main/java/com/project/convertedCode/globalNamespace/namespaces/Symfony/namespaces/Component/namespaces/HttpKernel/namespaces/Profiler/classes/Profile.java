package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Profiler.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/Profiler/Profile.php

*/

public class Profile extends RuntimeClassBase {

    public Object token = null;

    public Object collectors = ZVal.newArray();

    public Object ip = null;

    public Object method = null;

    public Object url = null;

    public Object time = null;

    public Object statusCode = null;

    public Object parent = null;

    public Object children = ZVal.newArray();

    public Profile(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Profile.class) {
            this.__construct(env, args);
        }
    }

    public Profile(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "token", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object token = assignParameter(args, 0, false);
        this.token = token;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "token")
    public Object setToken(RuntimeEnv env, Object... args) {
        Object token = assignParameter(args, 0, false);
        this.token = token;
        return null;
    }

    @ConvertedMethod
    public Object getToken(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.token);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parent", typeHint = "self")
    public Object setParent(RuntimeEnv env, Object... args) {
        Object parent = assignParameter(args, 0, false);
        this.parent = parent;
        return null;
    }

    @ConvertedMethod
    public Object getParent(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.parent);
    }

    @ConvertedMethod
    public Object getParentToken(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isTrue(this.parent)
                        ? env.callMethod(this.parent, "getToken", Profile.class)
                        : ZVal.getNull());
    }

    @ConvertedMethod
    public Object getIp(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.ip);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ip")
    public Object setIp(RuntimeEnv env, Object... args) {
        Object ip = assignParameter(args, 0, false);
        this.ip = ip;
        return null;
    }

    @ConvertedMethod
    public Object getMethod(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.method);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    public Object setMethod(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        this.method = method;
        return null;
    }

    @ConvertedMethod
    public Object getUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.url);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "url")
    public Object setUrl(RuntimeEnv env, Object... args) {
        Object url = assignParameter(args, 0, false);
        this.url = url;
        return null;
    }

    @ConvertedMethod
    public Object getTime(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.time)) {
            return 0;
        }

        return ZVal.assign(this.time);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "time")
    public Object setTime(RuntimeEnv env, Object... args) {
        Object time = assignParameter(args, 0, false);
        this.time = time;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "statusCode")
    public Object setStatusCode(RuntimeEnv env, Object... args) {
        Object statusCode = assignParameter(args, 0, false);
        this.statusCode = statusCode;
        return null;
    }

    @ConvertedMethod
    public Object getStatusCode(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.statusCode);
    }

    @ConvertedMethod
    public Object getChildren(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.children);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "children", typeHint = "array")
    public Object setChildren(RuntimeEnv env, Object... args) {
        Object children = assignParameter(args, 0, false);
        Object child = null;
        this.children = ZVal.newArray();
        for (ZPair zpairResult1981 : ZVal.getIterable(children, env, true)) {
            child = ZVal.assign(zpairResult1981.getValue());
            this.addChild(env, child);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "child", typeHint = "self")
    public Object addChild(RuntimeEnv env, Object... args) {
        Object child = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "children", env).arrayAppend(env).set(child);
        env.callMethod(child, "setParent", Profile.class, this);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "token", typeHint = "string")
    public Object getChildByToken(RuntimeEnv env, Object... args) {
        Object token = assignParameter(args, 0, false);
        Object child = null;
        for (ZPair zpairResult1982 : ZVal.getIterable(this.children, env, true)) {
            child = ZVal.assign(zpairResult1982.getValue());
            if (ZVal.strictEqualityCheck(
                    token, "===", env.callMethod(child, "getToken", Profile.class))) {
                return ZVal.assign(child);
            }
        }

        return ZVal.assign(ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object getCollector(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "collectors", env),
                env,
                name)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Collector \"%s\" does not exist.", name)
                                    .value()));
        }

        return ZVal.assign(new ReferenceClassProperty(this, "collectors", env).arrayGet(env, name));
    }

    @ConvertedMethod
    public Object getCollectors(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.collectors);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "collectors", typeHint = "array")
    public Object setCollectors(RuntimeEnv env, Object... args) {
        Object collectors = assignParameter(args, 0, false);
        Object collector = null;
        this.collectors = ZVal.newArray();
        for (ZPair zpairResult1983 : ZVal.getIterable(collectors, env, true)) {
            collector = ZVal.assign(zpairResult1983.getValue());
            this.addCollector(env, collector);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "collector",
        typeHint = "Symfony\\Component\\HttpKernel\\DataCollector\\DataCollectorInterface"
    )
    public Object addCollector(RuntimeEnv env, Object... args) {
        Object collector = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "collectors", env)
                .arrayAccess(env, env.callMethod(collector, "getName", Profile.class))
                .set(collector);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object hasCollector(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "collectors", env),
                        env,
                        name));
    }

    @ConvertedMethod
    public Object __sleep(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.arrayFromList(
                        "token",
                        "parent",
                        "children",
                        "collectors",
                        "ip",
                        "method",
                        "url",
                        "time",
                        "statusCode"));
    }

    public static final Object CONST_class = "Symfony\\Component\\HttpKernel\\Profiler\\Profile";

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
                    .setName("Symfony\\Component\\HttpKernel\\Profiler\\Profile")
                    .setLookup(
                            Profile.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "children",
                            "collectors",
                            "ip",
                            "method",
                            "parent",
                            "statusCode",
                            "time",
                            "token",
                            "url")
                    .setFilename("vendor/symfony/http-kernel/Profiler/Profile.php")
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
