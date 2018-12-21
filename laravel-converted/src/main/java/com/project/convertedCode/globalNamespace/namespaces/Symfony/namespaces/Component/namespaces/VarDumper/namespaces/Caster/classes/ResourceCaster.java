package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.LinkStub;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Caster/ResourceCaster.php

*/

public class ResourceCaster extends RuntimeClassBase {

    public ResourceCaster(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ResourceCaster(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\VarDumper\\Caster\\ResourceCaster";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "h")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castCurl(RuntimeEnv env, Object... args) {
            Object h = assignParameter(args, 0, false);
            Object a = assignParameter(args, 1, false);
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            return ZVal.assign(NamespaceGlobal.curl_getinfo.env(env).call(h).value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "dba")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castDba(RuntimeEnv env, Object... args) {
            Object dba = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            ReferenceContainer list = new BasicReferenceContainer(null);
            list.setObject(NamespaceGlobal.dba_list.env(env).call().value());
            a.arrayAccess(env, "file").set(list.arrayGet(env, ZVal.toLong(dba)));
            return ZVal.assign(a.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "process")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castProcess(RuntimeEnv env, Object... args) {
            Object process = assignParameter(args, 0, false);
            Object a = assignParameter(args, 1, false);
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            return ZVal.assign(NamespaceGlobal.proc_get_status.env(env).call(process).value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "stream")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castStream(RuntimeEnv env, Object... args) {
            Object stream = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            a.setObject(
                    ZVal.add(
                            NamespaceGlobal.stream_get_meta_data.env(env).call(stream).value(),
                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                            env, this, ResourceCaster.class)
                                    .method("castStreamContext")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(stream, a.getObject(), stub, isNested)
                                    .value()));
            if (arrayActionR(ArrayAction.ISSET, a, env, "uri")) {
                a.arrayAccess(env, "uri").set(new LinkStub(env, a.arrayGet(env, "uri")));
            }

            return ZVal.assign(a.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "stream")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castStreamContext(RuntimeEnv env, Object... args) {
            Object stream = assignParameter(args, 0, false);
            Object a = assignParameter(args, 1, false);
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            Object ternaryExpressionTemp = null;
            return ZVal.assign(
                    ZVal.isTrue(
                                    ternaryExpressionTemp =
                                            NamespaceGlobal.stream_context_get_params
                                                    .env(env)
                                                    .call(stream)
                                                    .value())
                            ? ternaryExpressionTemp
                            : a);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "gd")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castGd(RuntimeEnv env, Object... args) {
            Object gd = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            a.arrayAccess(env, "size")
                    .set(
                            toStringR(NamespaceGlobal.imagesx.env(env).call(gd).value(), env)
                                    + "x"
                                    + toStringR(
                                            NamespaceGlobal.imagesy.env(env).call(gd).value(),
                                            env));
            a.arrayAccess(env, "trueColor")
                    .set(NamespaceGlobal.imageistruecolor.env(env).call(gd).value());
            return ZVal.assign(a.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "h")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castMysqlLink(RuntimeEnv env, Object... args) {
            Object h = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            a.arrayAccess(env, "host")
                    .set(
                            com.runtimeconverter.runtime.ZVal.functionNotFound(
                                            "mysql_get_host_info")
                                    .env(env)
                                    .call(h)
                                    .value());
            a.arrayAccess(env, "protocol")
                    .set(
                            com.runtimeconverter.runtime.ZVal.functionNotFound(
                                            "mysql_get_proto_info")
                                    .env(env)
                                    .call(h)
                                    .value());
            a.arrayAccess(env, "server")
                    .set(
                            com.runtimeconverter.runtime.ZVal.functionNotFound(
                                            "mysql_get_server_info")
                                    .env(env)
                                    .call(h)
                                    .value());
            return ZVal.assign(a.getObject());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\VarDumper\\Caster\\ResourceCaster")
                    .setLookup(
                            ResourceCaster.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/symfony/var-dumper/Caster/ResourceCaster.php")
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
